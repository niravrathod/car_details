package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.ads.AdRequest;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
public class zzaok {
    /* renamed from: b */
    public static void m10001b(String str) {
        if (m10000a(3)) {
            Log.d(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: a */
    public static void m9999a(String str, Throwable th) {
        if (m10000a(3)) {
            Log.d(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: c */
    public static void m10003c(String str) {
        if (m10000a(6)) {
            Log.e(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: b */
    public static void m10002b(String str, Throwable th) {
        if (m10000a(6)) {
            Log.e(AdRequest.LOGTAG, str, th);
        }
    }

    /* renamed from: d */
    public static void m10005d(String str) {
        if (m10000a(4)) {
            Log.i(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: e */
    public static void m10007e(String str) {
        if (m10000a(5)) {
            Log.w(AdRequest.LOGTAG, str);
        }
    }

    /* renamed from: c */
    public static void m10004c(String str, Throwable th) {
        if (m10000a(5)) {
            Log.w(AdRequest.LOGTAG, str, th);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private static String m9998a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        int lineNumber = stackTrace[3].getLineNumber();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
        stringBuilder.append(str);
        stringBuilder.append(" @");
        stringBuilder.append(lineNumber);
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public static void m10006d(String str, Throwable th) {
        if (m10000a(5)) {
            if (th != null) {
                m10004c(m9998a(str), th);
                return;
            }
            m10007e(m9998a(str));
        }
    }

    /* renamed from: f */
    public static void m10008f(String str) {
        m10006d(str, null);
    }

    /* renamed from: a */
    public static boolean m10000a(int i) {
        if (i < 5) {
            if (Log.isLoggable(AdRequest.LOGTAG, i) == 0) {
                return false;
            }
        }
        return true;
    }
}
