package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzahv;
import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzamj;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzlm;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzxx;
import com.google.android.gms.internal.ads.zzxy;
import com.google.android.gms.internal.ads.zzyn;
import com.google.android.gms.internal.ads.zzyq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public final class zzay extends zzlm {
    /* renamed from: b */
    private static final Object f19581b = new Object();
    @GuardedBy("sLock")
    /* renamed from: c */
    private static zzay f19582c;
    /* renamed from: a */
    private final Context f19583a;
    /* renamed from: d */
    private final Object f19584d = new Object();
    /* renamed from: e */
    private boolean f19585e;
    /* renamed from: f */
    private zzaop f19586f;

    public static zzay zza(Context context, zzaop zzaop) {
        synchronized (f19581b) {
            if (f19582c == null) {
                f19582c = new zzay(context.getApplicationContext(), zzaop);
            }
            context = f19582c;
        }
        return context;
    }

    public final void zza(zzyn zzyn) {
    }

    public final void zzw(String str) {
    }

    @VisibleForTesting
    private zzay(Context context, zzaop zzaop) {
        this.f19583a = context;
        this.f19586f = zzaop;
        this.f19585e = null;
    }

    public final void zza() {
        synchronized (f19581b) {
            if (this.f19585e) {
                zzaok.m10007e("Mobile ads is initialized already.");
                return;
            }
            this.f19585e = true;
            zznw.m10901a(this.f19583a);
            zzbv.zzeo().m9712a(this.f19583a, this.f19586f);
            zzbv.zzeq().m10674a(this.f19583a);
        }
    }

    public final void zzv(String str) {
        zznw.m10901a(this.f19583a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.bK)).booleanValue()) {
                zzbv.zzes().zza(this.f19583a, this.f19586f, str, null);
            }
        }
    }

    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        if (!TextUtils.isEmpty(str)) {
            zznw.m10901a(this.f19583a);
            int booleanValue = ((Boolean) zzkd.m10713e().m10897a(zznw.bK)).booleanValue() | ((Boolean) zzkd.m10713e().m10897a(zznw.ap)).booleanValue();
            Runnable runnable = null;
            if (((Boolean) zzkd.m10713e().m10897a(zznw.ap)).booleanValue()) {
                booleanValue = 1;
                runnable = new C2407n(this, (Runnable) ObjectWrapper.m26020a(iObjectWrapper));
            }
            if (booleanValue != 0) {
                zzbv.zzes().zza(this.f19583a, this.f19586f, str, runnable);
            }
        }
    }

    public final void setAppVolume(float f) {
        zzbv.zzep().m9877a(f);
    }

    public final float zzdo() {
        return zzbv.zzep().m9876a();
    }

    public final void setAppMuted(boolean z) {
        zzbv.zzep().m9878a(z);
    }

    public final boolean zzdp() {
        return zzbv.zzep().m9879b();
    }

    public final String zzdq() {
        return this.f19586f.f19893a;
    }

    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzaok.m10003c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.m26020a(iObjectWrapper);
        if (context == null) {
            zzaok.m10003c("Context is null. Failed to open debug menu.");
            return;
        }
        zzamj zzamj = new zzamj(context);
        zzamj.m9888a(str);
        zzamj.m9891b(this.f19586f.f19893a);
        zzamj.m9885a();
    }

    /* renamed from: a */
    final /* synthetic */ void m25960a(Runnable runnable) {
        Object obj = this.f19583a;
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map e = zzbv.zzeo().m9726k().mo2356h().m9705e();
        if (e != null) {
            if (!e.isEmpty()) {
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (Runnable runnable2) {
                        zzaok.m10004c("Could not initialize rewarded ads.", runnable2);
                        return;
                    }
                }
                runnable2 = zzahv.m28951h();
                if (runnable2 != null) {
                    Collection<zzxy> values = e.values();
                    Map hashMap = new HashMap();
                    IObjectWrapper a = ObjectWrapper.m26019a(obj);
                    for (zzxy zzxy : values) {
                        for (zzxx zzxx : zzxy.f9857a) {
                            String str = zzxx.f9846k;
                            for (String str2 : zzxx.f9838c) {
                                if (!hashMap.containsKey(str2)) {
                                    hashMap.put(str2, new ArrayList());
                                }
                                if (str != null) {
                                    ((Collection) hashMap.get(str2)).add(str);
                                }
                            }
                        }
                    }
                    for (Entry entry : hashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        try {
                            zzajf a2 = runnable2.mo4955a(str3);
                            if (a2 != null) {
                                zzyq a3 = a2.m9626a();
                                if (!a3.mo2776g()) {
                                    if (a3.mo2782m()) {
                                        a3.mo2761a(a, a2.m9627b(), (List) entry.getValue());
                                        String str4 = "Initialized rewarded video mediation adapter ";
                                        String valueOf = String.valueOf(str3);
                                        zzaok.m10001b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str3).length() + 56);
                            stringBuilder.append("Failed to initialize rewarded video mediation adapter \"");
                            stringBuilder.append(str3);
                            stringBuilder.append("\"");
                            zzaok.m10004c(stringBuilder.toString(), th);
                        }
                    }
                }
            }
        }
    }
}
