package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import org.json.JSONObject;

@zzaer
public final class zzfe implements zzfr {
    /* renamed from: a */
    private final zzew f17194a;
    /* renamed from: b */
    private final zzasg f17195b;
    /* renamed from: c */
    private final zzu<zzasg> f17196c = new pm(this);
    /* renamed from: d */
    private final zzu<zzasg> f17197d = new pn(this);
    /* renamed from: e */
    private final zzu<zzasg> f17198e = new po(this);

    public zzfe(zzew zzew, zzasg zzasg) {
        this.f17194a = zzew;
        this.f17195b = zzasg;
        zzew = this.f17195b;
        zzew.mo4740a("/updateActiveView", this.f17196c);
        zzew.mo4740a("/untrackActiveViewUnit", this.f17197d);
        zzew.mo4740a("/visibilityChanged", this.f17198e);
        zzew = "Custom JS tracking ad unit: ";
        zzasg = String.valueOf(this.f17194a.f9418a.m10566d());
        zzaok.m10001b(zzasg.length() != 0 ? zzew.concat(zzasg) : new String(zzew));
    }

    /* renamed from: a */
    public final boolean mo2450a() {
        return true;
    }

    /* renamed from: a */
    public final void mo2449a(JSONObject jSONObject, boolean z) {
        if (z) {
            this.f17194a.m10584b((zzfr) this);
        } else {
            this.f17195b.mo4750b("AFMA_updateActiveView", jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo2451b() {
        zzasg zzasg = this.f17195b;
        zzasg.mo4749b("/visibilityChanged", this.f17198e);
        zzasg.mo4749b("/untrackActiveViewUnit", this.f17197d);
        zzasg.mo4749b("/updateActiveView", this.f17196c);
    }
}
