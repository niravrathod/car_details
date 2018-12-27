package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzafp;
import com.google.android.gms.internal.ads.zzafq;
import com.google.android.gms.internal.ads.zzakn;
import com.google.android.gms.internal.ads.zzaox;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzoj;
import com.google.android.gms.internal.ads.zzpo;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.s */
final class C2415s implements Callable<zzpo> {
    /* renamed from: a */
    private final /* synthetic */ int f7719a;
    /* renamed from: b */
    private final /* synthetic */ JSONArray f7720b;
    /* renamed from: c */
    private final /* synthetic */ int f7721c;
    /* renamed from: d */
    private final /* synthetic */ zzakn f7722d;
    /* renamed from: e */
    private final /* synthetic */ zzbb f7723e;

    C2415s(zzbb zzbb, int i, JSONArray jSONArray, int i2, zzakn zzakn) {
        this.f7723e = zzbb;
        this.f7719a = i;
        this.f7720b = jSONArray;
        this.f7721c = i2;
        this.f7722d = zzakn;
    }

    public final /* synthetic */ Object call() {
        if (this.f7719a >= this.f7720b.length()) {
            return null;
        }
        Bundle bundle;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(r0.f7720b.get(r0.f7719a));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ads", jSONArray);
        zza zzbb = new zzbb(r0.f7723e.e.zzrx, r0.f7723e.i, r0.f7723e.e.zzadk, r0.f7723e.e.zzade, r0.f7723e.j, r0.f7723e.e.zzadg, true);
        zzbb.m28918a(r0.f7723e.e, zzbb.e);
        zzbb.m28933h();
        zzbb.zza(r0.f7723e.b);
        zzoj zzoj = zzbb.f19530a;
        int i = r0.f7719a;
        zzoj.m10929a("num_ads_requested", String.valueOf(r0.f7721c));
        zzoj.m10929a("ad_index", String.valueOf(i));
        zzafp zzafp = r0.f7722d.f8806a;
        String jSONObject2 = jSONObject.toString();
        if (zzafp.f19735c.f20208c != null) {
            bundle = new Bundle(zzafp.f19735c.f20208c);
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("_ad", jSONObject2);
        zzjk zzjk = r5;
        zzjk zzjk2 = new zzjk(zzafp.f19735c.f20206a, zzafp.f19735c.f20207b, bundle2, zzafp.f19735c.f20209d, zzafp.f19735c.f20210e, zzafp.f19735c.f20211f, zzafp.f19735c.f20212g, zzafp.f19735c.f20213h, zzafp.f19735c.f20214i, zzafp.f19735c.f20215j, zzafp.f19735c.f20216k, zzafp.f19735c.f20217l, zzafp.f19735c.f20218m, zzafp.f19735c.f20219n, zzafp.f19735c.f20220o, zzafp.f19735c.f20221p, zzafp.f19735c.f20222q, zzafp.f19735c.f20223r, null, zzafp.f19735c.f20225t, zzafp.f19735c.f20226u);
        zzbb.zza(new zzafq(zzafp.f19734b, zzjk, zzafp.f19736d, zzafp.f19737e, zzafp.f19738f, zzafp.f19739g, zzafp.f19741i, zzafp.f19742j, zzafp.f19743k, zzafp.f19744l, zzafp.f19746n, zzafp.f19758z, zzafp.f19747o, zzafp.f19748p, zzafp.f19749q, zzafp.f19750r, zzafp.f19751s, zzafp.f19752t, zzafp.f19753u, zzafp.f19754v, zzafp.f19755w, zzafp.f19756x, zzafp.f19757y, zzafp.f19708B, zzafp.f19709C, zzafp.f19715I, zzafp.f19710D, zzafp.f19711E, zzafp.f19712F, zzafp.f19713G, zzaox.m10019a(zzafp.f19714H), zzafp.f19716J, zzafp.f19717K, zzafp.f19718L, zzafp.f19719M, zzafp.f19720N, zzafp.f19721O, zzafp.f19722P, zzafp.f19723Q, zzafp.f19727U, zzaox.m10019a(zzafp.f19740h), zzafp.f19728V, zzafp.f19729W, zzafp.f19730X, 1, zzafp.f19732Z, zzafp.aa, zzafp.ab, zzafp.ac, zzafp.ad, zzafp.ae, zzafp.ag), zzbb.f19530a);
        return (zzpo) zzbb.m28934i().get();
    }
}
