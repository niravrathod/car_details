package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzml {
    @GuardedBy("lock")
    /* renamed from: a */
    private static zzml f9653a;
    /* renamed from: b */
    private static final Object f9654b = new Object();
    /* renamed from: c */
    private zzll f9655c;
    /* renamed from: d */
    private RewardedVideoAd f9656d;

    /* renamed from: a */
    public static zzml m10857a() {
        zzml zzml;
        synchronized (f9654b) {
            if (f9653a == null) {
                f9653a = new zzml();
            }
            zzml = f9653a;
        }
        return zzml;
    }

    /* renamed from: a */
    public final void m10861a(Context context, String str, zzmo zzmo) {
        synchronized (f9654b) {
            if (this.f9655c != null) {
                return;
            } else if (context != null) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", false);
                    zzxt.m26871a(context, str, bundle);
                    this.f9655c = (zzll) new rr(zzkd.m10710b(), context).m9372a(context, false);
                    this.f9655c.zza();
                    this.f9655c.zza(new zzym());
                    if (str != null) {
                        this.f9655c.zza(str, ObjectWrapper.m26019a(new ry(this, context)));
                    }
                } catch (Context context2) {
                    zzaok.m10004c("MobileAdsSettingManager initialization failed", context2);
                }
            } else {
                throw new IllegalArgumentException("Context cannot be null.");
            }
        }
    }

    /* renamed from: a */
    public final RewardedVideoAd m10858a(Context context) {
        synchronized (f9654b) {
            if (this.f9656d != null) {
                context = this.f9656d;
                return context;
            }
            this.f9656d = new zzaiq(context, (zzaid) new rv(zzkd.m10710b(), context, new zzym()).m9372a(context, false));
            context = this.f9656d;
            return context;
        }
    }

    /* renamed from: a */
    public final void m10859a(float f) {
        boolean z = true;
        boolean z2 = 0.0f <= f && f <= 1.0f;
        Preconditions.checkArgument(z2, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.f9655c == null) {
            z = false;
        }
        Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f9655c.setAppVolume(f);
        } catch (float f2) {
            zzaok.m10002b("Unable to set app volume.", f2);
        }
    }

    /* renamed from: b */
    public final float m10864b() {
        if (this.f9655c == null) {
            return 1.0f;
        }
        float zzdo;
        try {
            zzdo = this.f9655c.zzdo();
        } catch (Throwable e) {
            zzaok.m10002b("Unable to get app volume.", e);
            zzdo = 1.0f;
        }
        return zzdo;
    }

    /* renamed from: a */
    public final void m10863a(boolean z) {
        Preconditions.checkState(this.f9655c != null, "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.f9655c.setAppMuted(z);
        } catch (boolean z2) {
            zzaok.m10002b("Unable to set app mute state.", z2);
        }
    }

    /* renamed from: c */
    public final boolean m10865c() {
        if (this.f9655c == null) {
            return false;
        }
        boolean zzdp;
        try {
            zzdp = this.f9655c.zzdp();
        } catch (Throwable e) {
            zzaok.m10002b("Unable to get app mute state.", e);
            zzdp = false;
        }
        return zzdp;
    }

    /* renamed from: a */
    public final void m10860a(Context context, String str) {
        Preconditions.checkState(this.f9655c != null, "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f9655c.zzb(ObjectWrapper.m26019a((Object) context), str);
        } catch (Context context2) {
            zzaok.m10002b("Unable to open debug menu.", context2);
        }
    }

    /* renamed from: d */
    public final String m10866d() {
        try {
            this.f9655c.zzdq();
        } catch (Throwable e) {
            zzaok.m10002b("Unable to get version string.", e);
        }
        return "";
    }

    /* renamed from: a */
    public final void m10862a(Class<? extends zzaut> cls) {
        try {
            this.f9655c.zzw(cls.getCanonicalName());
        } catch (Class<? extends zzaut> cls2) {
            zzaok.m10002b("Unable to register RtbAdapter", cls2);
        }
    }

    private zzml() {
    }
}
