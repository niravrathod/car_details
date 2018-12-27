package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

final class ah implements Callable<String> {
    /* renamed from: a */
    private final /* synthetic */ zzc f7648a;

    ah(zzc zzc) {
        this.f7648a = zzc;
    }

    public final /* synthetic */ Object call() {
        Object obj = "";
        CookieManager c = zzbv.zzem().mo5046c(this.f7648a.e.zzrx);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : obj;
    }
}
