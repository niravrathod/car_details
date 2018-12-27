package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzem.C2472b;

/* renamed from: com.google.android.gms.internal.measurement.p */
final class C4125p extends C2472b {
    /* renamed from: c */
    private final /* synthetic */ Long f17514c;
    /* renamed from: d */
    private final /* synthetic */ String f17515d;
    /* renamed from: e */
    private final /* synthetic */ String f17516e;
    /* renamed from: f */
    private final /* synthetic */ Bundle f17517f;
    /* renamed from: g */
    private final /* synthetic */ boolean f17518g = true;
    /* renamed from: h */
    private final /* synthetic */ boolean f17519h;
    /* renamed from: i */
    private final /* synthetic */ zzem f17520i;

    C4125p(zzem zzem, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        this.f17520i = zzem;
        this.f17514c = l;
        this.f17515d = str;
        this.f17516e = str2;
        this.f17517f = bundle;
        this.f17519h = z2;
        super(zzem);
    }

    /* renamed from: b */
    final void mo2919b() {
        this.f17520i.f10148j.mo3129a(this.f17515d, this.f17516e, this.f17517f, this.f17518g, this.f17519h, this.f17514c == null ? this.a : this.f17514c.longValue());
    }
}
