package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class zzaf {
    /* renamed from: a */
    public static boolean f8537a = Log.isLoggable("Volley", 2);
    /* renamed from: b */
    private static String f8538b = "Volley";
    /* renamed from: c */
    private static final String f8539c = zzaf.class.getName();

    /* renamed from: com.google.android.gms.internal.ads.zzaf$a */
    static class C2453a {
        /* renamed from: a */
        public static final boolean f8534a = zzaf.f8537a;
        /* renamed from: b */
        private final List<bn> f8535b = new ArrayList();
        /* renamed from: c */
        private boolean f8536c = false;

        C2453a() {
        }

        /* renamed from: a */
        public final synchronized void m9507a(String str, long j) {
            if (this.f8536c) {
                throw new IllegalStateException("Marker added to finished log");
            }
            this.f8535b.add(new bn(str, j, SystemClock.elapsedRealtime()));
        }

        /* renamed from: a */
        public final synchronized void m9506a(String str) {
            long j;
            this.f8536c = true;
            if (this.f8535b.size() == 0) {
                j = 0;
            } else {
                j = ((bn) this.f8535b.get(this.f8535b.size() - 1)).f7925c - ((bn) this.f8535b.get(0)).f7925c;
            }
            if (j > 0) {
                long j2 = ((bn) this.f8535b.get(0)).f7925c;
                zzaf.m9510b("(%-4d ms) %s", Long.valueOf(j), str);
                for (bn bnVar : this.f8535b) {
                    zzaf.m9510b("(+%-4d) [%2d] %s", Long.valueOf(bnVar.f7925c - j2), Long.valueOf(bnVar.f7924b), bnVar.f7923a);
                    j2 = bnVar.f7925c;
                }
            }
        }

        protected final void finalize() {
            if (!this.f8536c) {
                m9506a("Request on the loose");
                zzaf.m9511c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m9508a(String str, Object... objArr) {
        if (f8537a) {
            Log.v(f8538b, m9512d(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m9510b(String str, Object... objArr) {
        Log.d(f8538b, m9512d(str, objArr));
    }

    /* renamed from: c */
    public static void m9511c(String str, Object... objArr) {
        Log.e(f8538b, m9512d(str, objArr));
    }

    /* renamed from: a */
    public static void m9509a(Throwable th, String str, Object... objArr) {
        Log.e(f8538b, m9512d(str, objArr), th);
    }

    /* renamed from: d */
    private static String m9512d(String str, Object... objArr) {
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        objArr = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        for (int i = 2; i < objArr.length; i++) {
            if (!objArr[i].getClassName().equals(f8539c)) {
                str2 = objArr[i].getClassName();
                str2 = str2.substring(str2.lastIndexOf(46) + 1);
                str2 = str2.substring(str2.lastIndexOf(36) + 1);
                objArr = objArr[i].getMethodName();
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(objArr).length());
                stringBuilder.append(str2);
                stringBuilder.append(".");
                stringBuilder.append(objArr);
                str2 = stringBuilder.toString();
                break;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
