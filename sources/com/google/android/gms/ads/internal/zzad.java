package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzaov;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapn;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzxh;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzad {
    /* renamed from: a */
    private final Object f7742a = new Object();
    /* renamed from: b */
    private Context f7743b;
    /* renamed from: c */
    private long f7744c = 0;

    public final void zza(Context context, zzaop zzaop, String str, Runnable runnable) {
        m8802a(context, zzaop, true, null, str, null, runnable);
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m8802a(Context context, zzaop zzaop, boolean z, zzakq zzakq, String str, String str2, Runnable runnable) {
        if (zzbv.zzer().elapsedRealtime() - this.f7744c < 5000) {
            zzaok.m10007e("Not retrying to fetch app settings");
            return;
        }
        this.f7744c = zzbv.zzer().elapsedRealtime();
        Object obj = 1;
        if (zzakq != null) {
            if ((zzbv.zzer().currentTimeMillis() - zzakq.m9701a() > ((Long) zzkd.m10713e().m10897a(zznw.bL)).longValue() ? 1 : null) == null) {
                if (zzakq.m9702b() != null) {
                    obj = null;
                }
            }
        }
        if (obj != null) {
            if (context == null) {
                zzaok.m10007e("Context not provided to fetch application settings");
            } else if (TextUtils.isEmpty(str) == null || TextUtils.isEmpty(str2) == null) {
                zzakq = context.getApplicationContext();
                if (zzakq == null) {
                    zzakq = context;
                }
                this.f7743b = zzakq;
                zzaop = zzbv.zzez().m11178a(this.f7743b, zzaop).m11182a("google.afma.config.fetchAppSettings", zzxh.f9830a, zzxh.f9830a);
                try {
                    zzakq = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        zzakq.put("app_id", str);
                    } else if (TextUtils.isEmpty(str2) == null) {
                        zzakq.put("ad_unit_id", str2);
                    }
                    zzakq.put("is_init", z);
                    zzakq.put("pn", context.getPackageName());
                    zzapi b = zzaop.mo4302b(zzakq);
                    zzaop = zzaox.m10021a(b, C4058b.f16332a, zzapn.f8962b);
                    if (runnable != null) {
                        b.mo1947a(runnable, zzapn.f8962b);
                    }
                    zzaov.m10017a(zzaop, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Context context2) {
                    zzaok.m10002b("Error requesting application settings", context2);
                }
            } else {
                zzaok.m10007e("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
