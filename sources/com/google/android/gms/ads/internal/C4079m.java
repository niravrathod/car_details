package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzzc;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.m */
final class C4079m implements zzu<zzasg> {
    /* renamed from: a */
    private final /* synthetic */ zzyz f16363a;
    /* renamed from: b */
    private final /* synthetic */ zzab f16364b;
    /* renamed from: c */
    private final /* synthetic */ zzzc f16365c;

    C4079m(zzyz zzyz, zzab zzab, zzzc zzzc) {
        this.f16363a = zzyz;
        this.f16364b = zzab;
        this.f16365c = zzzc;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        Object view = zzasg.getView();
        if (view != null) {
            try {
                if (this.f16363a == null) {
                    if (this.f16365c != null) {
                        if (this.f16365c.mo2835i()) {
                            zzas.m8812b(zzasg);
                        } else {
                            this.f16365c.mo2824a(ObjectWrapper.m26019a(view));
                            this.f16364b.f7741a.onAdClicked();
                        }
                    }
                } else if (this.f16363a.mo2816k()) {
                    zzas.m8812b(zzasg);
                } else {
                    this.f16363a.mo2803a(ObjectWrapper.m26019a(view));
                    this.f16364b.f7741a.onAdClicked();
                }
            } catch (Object obj2) {
                zzaok.m10004c("Unable to call handleClick on mapper", obj2);
            }
        }
    }
}
