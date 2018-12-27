package com.google.android.gms.internal.ads;

import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.internal.gmsg.zzf;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzxn<I, O> implements zzxc<I, O> {
    /* renamed from: a */
    private final zzxe<O> f20411a;
    /* renamed from: b */
    private final zzxf<I> f20412b;
    /* renamed from: c */
    private final zzwc f20413c;
    /* renamed from: d */
    private final String f20414d;

    zzxn(zzwc zzwc, String str, zzxf<I> zzxf, zzxe<O> zzxe) {
        this.f20413c = zzwc;
        this.f20414d = str;
        this.f20412b = zzxf;
        this.f20411a = zzxe;
    }

    /* renamed from: b */
    public final zzapi<O> mo4302b(I i) {
        zzapi zzaps = new zzaps();
        zzapy b = this.f20413c.m11175b(null);
        b.mo2373a(new wg(this, b, i, zzaps), new wh(this, zzaps, b));
        return zzaps;
    }

    /* renamed from: a */
    private final void m26866a(zzwp zzwp, zzwy zzwy, I i, zzaps<O> zzaps) {
        try {
            zzbv.zzek();
            String a = zzalo.m9781a();
            zzf.zzbpl.zza(a, new wi(this, zzwp, zzaps));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookAdapter.KEY_ID, a);
            jSONObject.put("args", this.f20412b.mo2182a(i));
            zzwy.mo4750b(this.f20414d, jSONObject);
        } catch (zzwy zzwy2) {
            zzaps.m21289a(zzwy2);
            zzaok.m10002b("Unable to invokeJavaScript", zzwy2);
        } finally {
            zzwp.m26858c();
        }
    }

    /* renamed from: a */
    public final zzapi<O> mo1714a(@Nullable I i) {
        return mo4302b(i);
    }
}
