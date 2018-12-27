package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzanh extends zzr<zzp> {
    /* renamed from: a */
    private final zzaps<zzp> f16876a;
    /* renamed from: b */
    private final Map<String, String> f16877b;
    /* renamed from: c */
    private final zzaoe f16878c;

    public zzanh(String str, zzaps<zzp> zzaps) {
        this(str, null, zzaps);
    }

    private zzanh(String str, Map<String, String> map, zzaps<zzp> zzaps) {
        super(0, str, new eb(zzaps));
        this.f16877b = null;
        this.f16876a = zzaps;
        this.f16878c = new zzaoe();
        this.f16878c.m9993a(str, "GET", null, null);
    }

    /* renamed from: a */
    protected final zzx<zzp> mo2369a(zzp zzp) {
        return zzx.m11177a(zzp, zzap.m10032a(zzp));
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo2370a(Object obj) {
        zzp zzp = (zzp) obj;
        this.f16878c.m9996a(zzp.f9766c, zzp.f9764a);
        zzaoe zzaoe = this.f16878c;
        byte[] bArr = zzp.f9765b;
        if (zzaoe.m9991c() && bArr != null) {
            zzaoe.m9997a(bArr);
        }
        this.f16876a.m21290b(zzp);
    }
}
