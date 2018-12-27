package com.cuvora.carinfo.videomodule.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.customtabs.C0123c;
import android.support.customtabs.C0123c.C0122a;
import android.support.v4.content.C0389b;
import com.cuvora.carinfo.R;
import java.util.Locale;

/* renamed from: com.cuvora.carinfo.videomodule.utils.e */
public class C1625e {
    /* renamed from: a */
    public static void m6202a(Context context, String str) {
        C0123c b = new C0122a().m457b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("http://play.google.com/store/apps/details?id=");
        stringBuilder.append(str);
        b.m458a(context, Uri.parse(stringBuilder.toString()));
    }

    /* renamed from: b */
    public static void m6203b(Context context, String str) {
        new C0122a().m454a(C0389b.m1438c(context, R.color.white)).m455a(true).m453a().m456b(C0389b.m1438c(context, R.color.white)).m457b().m458a(context, Uri.parse(str));
    }

    /* renamed from: a */
    public static void m6201a(Context context, float f, float f2) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.ENGLISH, "geo:%f,%f", new Object[]{Float.valueOf(f), Float.valueOf(f2)}))));
    }
}
