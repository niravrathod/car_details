package com.google.android.gms.internal.ads;

import java.io.PrintWriter;

final class kd extends ka {
    /* renamed from: a */
    private final kb f16518a = new kb();

    kd() {
    }

    /* renamed from: a */
    public final void mo1967a(Throwable th) {
        th.printStackTrace();
        Throwable<Throwable> a = this.f16518a.m8956a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1968a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        Throwable<Throwable> a = this.f16518a.m8956a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
