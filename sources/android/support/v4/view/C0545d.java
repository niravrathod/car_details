package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.d */
public final class C0545d {
    /* renamed from: a */
    static final C0544b f1749a;
    /* renamed from: b */
    private static Field f1750b;
    /* renamed from: c */
    private static boolean f1751c;

    /* renamed from: android.support.v4.view.d$b */
    static class C0544b {
        C0544b() {
        }

        /* renamed from: a */
        public void mo444a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                C0545d.m2040a(layoutInflater, (Factory2) factory);
            } else {
                C0545d.m2040a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: android.support.v4.view.d$a */
    static class C3165a extends C0544b {
        C3165a() {
        }

        /* renamed from: a */
        public void mo444a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: a */
    static void m2040a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1751c) {
            try {
                f1750b = LayoutInflater.class.getDeclaredField("mFactory2");
                f1750b.setAccessible(true);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                stringBuilder.append(LayoutInflater.class.getName());
                stringBuilder.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder.toString(), e);
            }
            f1751c = true;
        }
        if (f1750b != null) {
            try {
                f1750b.set(layoutInflater, factory2);
            } catch (Factory2 factory22) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                stringBuilder2.append(layoutInflater);
                stringBuilder2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", stringBuilder2.toString(), factory22);
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1749a = new C3165a();
        } else {
            f1749a = new C0544b();
        }
    }

    /* renamed from: b */
    public static void m2041b(LayoutInflater layoutInflater, Factory2 factory2) {
        f1749a.mo444a(layoutInflater, factory2);
    }
}
