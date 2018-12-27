package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.i */
public abstract class C0329i {
    /* renamed from: a */
    public abstract View mo259a(int i);

    /* renamed from: a */
    public abstract boolean mo260a();

    /* renamed from: a */
    public Fragment mo258a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
