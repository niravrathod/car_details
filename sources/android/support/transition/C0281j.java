package android.support.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.support.transition.C0280i.C0279a;
import android.support.transition.C3085g.C3084a;
import android.support.transition.C3087h.C3086a;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.transition.j */
class C0281j {
    /* renamed from: a */
    private static final C0279a f1024a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f1024a = new C3086a();
        } else {
            f1024a = new C3084a();
        }
    }

    /* renamed from: a */
    static C0280i m1030a(View view, ViewGroup viewGroup, Matrix matrix) {
        return f1024a.mo238a(view, viewGroup, matrix);
    }

    /* renamed from: a */
    static void m1031a(View view) {
        f1024a.mo239a(view);
    }
}
