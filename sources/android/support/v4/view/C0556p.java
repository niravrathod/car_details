package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: android.support.v4.view.p */
public final class C0556p {
    /* renamed from: a */
    private Object f1762a;

    private C0556p(Object obj) {
        this.f1762a = obj;
    }

    /* renamed from: a */
    public Object m2107a() {
        return this.f1762a;
    }

    /* renamed from: a */
    public static C0556p m2106a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C0556p(PointerIcon.getSystemIcon(context, i));
        }
        return new C0556p(0);
    }
}
