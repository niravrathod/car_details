package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzaf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzok extends zzon {
    /* renamed from: a */
    private final zzaf f20251a;
    /* renamed from: b */
    private final String f20252b;
    /* renamed from: c */
    private final String f20253c;

    public zzok(zzaf zzaf, String str, String str2) {
        this.f20251a = zzaf;
        this.f20252b = str;
        this.f20253c = str2;
    }

    /* renamed from: a */
    public final String mo2575a() {
        return this.f20252b;
    }

    /* renamed from: b */
    public final String mo2577b() {
        return this.f20253c;
    }

    /* renamed from: a */
    public final void mo2576a(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.f20251a.zzh((View) ObjectWrapper.m26020a(iObjectWrapper));
        }
    }

    /* renamed from: c */
    public final void mo2578c() {
        this.f20251a.zzcm();
    }

    /* renamed from: d */
    public final void mo2579d() {
        this.f20251a.zzcn();
    }
}
