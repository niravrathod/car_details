package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

final class dk implements Callable<Boolean> {
    /* renamed from: a */
    private final /* synthetic */ Context f7994a;
    /* renamed from: b */
    private final /* synthetic */ WebSettings f7995b;

    dk(zzalz zzalz, Context context, WebSettings webSettings) {
        this.f7994a = context;
        this.f7995b = webSettings;
    }

    public final /* synthetic */ Object call() {
        if (this.f7994a.getCacheDir() != null) {
            this.f7995b.setAppCachePath(this.f7994a.getCacheDir().getAbsolutePath());
            this.f7995b.setAppCacheMaxSize(0);
            this.f7995b.setAppCacheEnabled(true);
        }
        this.f7995b.setDatabasePath(this.f7994a.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
        this.f7995b.setDatabaseEnabled(true);
        this.f7995b.setDomStorageEnabled(true);
        this.f7995b.setDisplayZoomControls(false);
        this.f7995b.setBuiltInZoomControls(true);
        this.f7995b.setSupportZoom(true);
        this.f7995b.setAllowContentAccess(false);
        return Boolean.valueOf(true);
    }
}
