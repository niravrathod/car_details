package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.i */
public final class C0612i {
    /* renamed from: a */
    private static final C0611b f1961a;

    /* renamed from: android.support.v4.widget.i$b */
    static class C0611b {
        C0611b() {
        }

        /* renamed from: a */
        public void mo476a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f);
        }
    }

    /* renamed from: android.support.v4.widget.i$a */
    static class C3183a extends C0611b {
        C3183a() {
        }

        /* renamed from: a */
        public void mo476a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1961a = new C3183a();
        } else {
            f1961a = new C0611b();
        }
    }

    /* renamed from: a */
    public static void m2450a(EdgeEffect edgeEffect, float f, float f2) {
        f1961a.mo476a(edgeEffect, f, f2);
    }
}
