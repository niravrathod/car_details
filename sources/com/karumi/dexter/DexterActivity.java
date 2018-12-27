package com.karumi.dexter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collection;
import java.util.LinkedList;

public final class DexterActivity extends Activity {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Dexter.onActivityReady(this);
        getWindow().addFlags(16);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Dexter.onActivityReady(this);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        i = new LinkedList();
        Collection linkedList = new LinkedList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            Object obj = strArr[i2];
            if (iArr[i2] == -1) {
                linkedList.add(obj);
            } else {
                i.add(obj);
            }
        }
        Dexter.onPermissionsRequested(i, linkedList);
    }
}
