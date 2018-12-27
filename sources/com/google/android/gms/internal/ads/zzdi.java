package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContextWrapper;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.UUID;

public final class zzdi {
    /* renamed from: a */
    private static final char[] f9376a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static String m10524a(String str) {
        if (str == null || !str.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            return str;
        }
        str = UUID.fromString(str);
        byte[] bArr = new byte[16];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(str.getMostSignificantBits());
        wrap.putLong(str.getLeastSignificantBits());
        return zzbk.m10467a(bArr, true);
    }

    /* renamed from: a */
    public static String m10525a(Throwable th) {
        Writer stringWriter = new StringWriter();
        zzbbe.m10255a(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static boolean m10528b(String str) {
        if (str != null) {
            if (str.isEmpty() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m10526a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static boolean m10527a(DisplayMetrics displayMetrics) {
        return (displayMetrics == null || displayMetrics.density == 0.0f) ? null : true;
    }

    /* renamed from: a */
    public static long m10522a(double d, DisplayMetrics displayMetrics) {
        double d2 = (double) displayMetrics.density;
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: a */
    public static Activity m10523a(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        view = view.getContext();
        int i = 0;
        while ((view instanceof ContextWrapper) && i < 10) {
            if (view instanceof Activity) {
                return (Activity) view;
            }
            view = ((ContextWrapper) view).getBaseContext();
            i++;
        }
        return null;
    }
}
