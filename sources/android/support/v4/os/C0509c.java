package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Trace;

/* renamed from: android.support.v4.os.c */
public final class C0509c {
    /* renamed from: a */
    public static void m1881a(String str) {
        if (VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: a */
    public static void m1880a() {
        if (VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
