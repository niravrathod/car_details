package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;

public final class zzeh extends zzek {
    /* renamed from: d */
    private final View f17181d;

    public zzeh(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2, View view) {
        super(zzdb, str, str2, zzbb, i, 57);
        this.f17181d = view;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (this.f17181d != null) {
            DisplayMetrics displayMetrics = this.a.m10504a().getResources().getDisplayMetrics();
            zzdj zzdj = new zzdj((String) this.c.invoke(null, new Object[]{this.f17181d, displayMetrics}));
            zzbd zzbd = new zzbd();
            zzbd.f20046a = zzdj.f17156a;
            zzbd.f20047b = zzdj.f17157b;
            zzbd.f20048c = zzdj.f17158c;
            this.b.f19971M = zzbd;
        }
    }
}
