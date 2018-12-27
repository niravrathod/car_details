package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzaa;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@zzaer
public final class zzfi implements zzfr {
    /* renamed from: a */
    private final zzew f17199a;
    /* renamed from: b */
    private final Context f17200b;
    /* renamed from: c */
    private final zzaa f17201c;
    /* renamed from: d */
    private zzwp f17202d;
    /* renamed from: e */
    private boolean f17203e;
    /* renamed from: f */
    private final zzu<zzwy> f17204f = new pt(this);
    /* renamed from: g */
    private final zzu<zzwy> f17205g = new pu(this);
    /* renamed from: h */
    private final zzu<zzwy> f17206h = new pv(this);
    /* renamed from: i */
    private final zzu<zzwy> f17207i = new pw(this);

    public zzfi(zzew zzew, zzwc zzwc, Context context) {
        this.f17199a = zzew;
        this.f17200b = context;
        this.f17201c = new zzaa(this.f17200b);
        this.f17202d = zzwc.m11175b((zzck) null);
        this.f17202d.mo2373a(new pp(this), new pq(this));
        zzew = "Core JS tracking ad unit: ";
        zzwc = String.valueOf(this.f17199a.f9418a.m10566d());
        zzaok.m10001b(zzwc.length() != null ? zzew.concat(zzwc) : new String(zzew));
    }

    /* renamed from: a */
    public final void mo2449a(JSONObject jSONObject, boolean z) {
        this.f17202d.mo2373a(new pr(this, jSONObject), new zzapw());
    }

    /* renamed from: a */
    public final boolean mo2450a() {
        return this.f17203e;
    }

    /* renamed from: b */
    public final void mo2451b() {
        this.f17202d.mo2373a(new ps(this), new zzapw());
        this.f17202d.m26858c();
    }

    /* renamed from: a */
    final void m21708a(zzwy zzwy) {
        zzwy.mo4821a("/updateActiveView", this.f17204f);
        zzwy.mo4821a("/untrackActiveViewUnit", this.f17205g);
        zzwy.mo4821a("/visibilityChanged", this.f17206h);
        if (zzbv.zzfj().m9668a(this.f17200b)) {
            zzwy.mo4821a("/logScionEvent", this.f17207i);
        }
    }

    /* renamed from: b */
    final void m21712b(zzwy zzwy) {
        zzwy.mo4822b("/visibilityChanged", this.f17206h);
        zzwy.mo4822b("/untrackActiveViewUnit", this.f17205g);
        zzwy.mo4822b("/updateActiveView", this.f17204f);
        if (zzbv.zzfj().m9668a(this.f17200b)) {
            zzwy.mo4822b("/logScionEvent", this.f17207i);
        }
    }
}
