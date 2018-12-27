package com.crashlytics.android.core;

import com.crashlytics.android.core.C1356c.C1355a;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class ak implements C1355a {
    ak() {
    }

    /* renamed from: a */
    public String mo1139a(File file) {
        return m18119a(file.getPath());
    }

    /* renamed from: a */
    private static String m18119a(String str) {
        Closeable closeable = null;
        try {
            Closeable bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                str = CommonUtils.m13621b((InputStream) bufferedInputStream);
                CommonUtils.m13612a(bufferedInputStream);
                return str;
            } catch (Throwable th) {
                str = th;
                closeable = bufferedInputStream;
                CommonUtils.m13612a(closeable);
                throw str;
            }
        } catch (Throwable th2) {
            str = th2;
            CommonUtils.m13612a(closeable);
            throw str;
        }
    }
}
