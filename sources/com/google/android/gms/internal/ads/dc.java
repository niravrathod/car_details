package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class dc implements Callable {
    /* renamed from: a */
    private final zzalo f7987a;
    /* renamed from: b */
    private final Context f7988b;

    dc(zzalo zzalo, Context context) {
        this.f7987a = zzalo;
        this.f7988b = context;
    }

    public final Object call() {
        Context context = this.f7988b;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.cK)).booleanValue()) {
            return context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        }
        return "";
    }
}
