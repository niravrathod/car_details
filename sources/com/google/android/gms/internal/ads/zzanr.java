package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.util.concurrent.Callable;

@zzaer
public final class zzanr {
    /* renamed from: a */
    public static <T> T m9933a(Context context, Callable<T> callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            callable = callable.call();
            return callable;
        } catch (Throwable th) {
            callable = th;
            zzaok.m10002b("Unexpected exception.", callable);
            zzael.m21106a(context).mo2229a(callable, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: a */
    public static <T> T m9934a(Callable<T> callable) {
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            callable = callable.call();
            return callable;
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
