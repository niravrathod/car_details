package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzaer
public final class zzyk implements zzxw {
    /* renamed from: a */
    private final zzafp f17372a;
    /* renamed from: b */
    private final zzyn f17373b;
    /* renamed from: c */
    private final Context f17374c;
    /* renamed from: d */
    private final Object f17375d = new Object();
    /* renamed from: e */
    private final zzxy f17376e;
    /* renamed from: f */
    private final boolean f17377f;
    /* renamed from: g */
    private final long f17378g;
    /* renamed from: h */
    private final long f17379h;
    /* renamed from: i */
    private final zzoj f17380i;
    /* renamed from: j */
    private final boolean f17381j;
    /* renamed from: k */
    private final String f17382k;
    /* renamed from: l */
    private boolean f17383l = false;
    /* renamed from: m */
    private zzyb f17384m;
    /* renamed from: n */
    private List<zzye> f17385n = new ArrayList();
    /* renamed from: o */
    private final boolean f17386o;

    public zzyk(Context context, zzafp zzafp, zzyn zzyn, zzxy zzxy, boolean z, boolean z2, String str, long j, long j2, zzoj zzoj, boolean z3) {
        this.f17374c = context;
        this.f17372a = zzafp;
        this.f17373b = zzyn;
        this.f17376e = zzxy;
        this.f17377f = z;
        this.f17381j = z2;
        this.f17382k = str;
        this.f17378g = j;
        this.f17379h = j2;
        this.f17380i = zzoj;
        this.f17386o = z3;
    }

    /* renamed from: a */
    public final zzye mo2753a(List<zzxx> list) {
        int i;
        zzaok.m10001b("Starting mediation.");
        Iterable arrayList = new ArrayList();
        zzoh a = this.f17380i.m10925a();
        zzjo zzjo = this.f17372a.f19736d;
        int[] iArr = new int[2];
        if (zzjo.f20233g != null) {
            zzbv.zzfe();
            if (zzyg.m11197a(r1.f17382k, iArr)) {
                i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjo[] zzjoArr = zzjo.f20233g;
                int length = zzjoArr.length;
                while (i < length) {
                    zzjo zzjo2 = zzjoArr[i];
                    if (i2 == zzjo2.f20231e && i3 == zzjo2.f20228b) {
                        zzjo = zzjo2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = list.iterator();
        i = 1;
        while (it.hasNext()) {
            zzxx zzxx = (zzxx) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(zzxx.f9837b);
            zzaok.m10005d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = zzxx.f9838c.iterator();
            while (it2.hasNext()) {
                zzye zzye;
                String str2 = (String) it2.next();
                zzoh a2 = r1.f17380i.m10925a();
                Object obj = r1.f17375d;
                synchronized (obj) {
                    try {
                        if (r1.f17383l) {
                            zzye = new zzye(-1);
                        } else {
                            Iterator it3 = it;
                            Iterator it4 = it2;
                            zzoh zzoh = a;
                            zzyb zzyb = zzyb;
                            zzoh zzoh2 = a2;
                            zzyb zzyb2 = zzyb;
                            Object obj2 = obj;
                            try {
                                zzyb = new zzyb(r1.f17374c, str2, r1.f17373b, r1.f17376e, zzxx, r1.f17372a.f19735c, zzjo, r1.f17372a.f19743k, r1.f17377f, r1.f17381j, r1.f17372a.f19757y, r1.f17372a.f19746n, r1.f17372a.f19758z, r1.f17372a.f19730X, r1.f17386o);
                                r1.f17384m = zzyb2;
                                zzye a3 = r1.f17384m.m21998a(r1.f17378g, r1.f17379h);
                                r1.f17385n.add(a3);
                                if (a3.f9878a == 0) {
                                    zzaok.m10001b("Adapter succeeded.");
                                    r1.f17380i.m10929a("mediation_network_succeed", str2);
                                    if (!arrayList.isEmpty()) {
                                        r1.f17380i.m10929a("mediation_networks_fail", TextUtils.join(",", arrayList));
                                    }
                                    r1.f17380i.m10931a(zzoh2, "mls");
                                    r1.f17380i.m10931a(zzoh, "ttm");
                                    return a3;
                                }
                                zzoh zzoh3 = zzoh;
                                zzoh zzoh4 = zzoh2;
                                int i4 = a3.f9878a;
                                arrayList.add(str2);
                                r1.f17380i.m10931a(zzoh4, "mlf");
                                if (a3.f9880c != null) {
                                    zzalo.f8872a.post(new wp(r1, a3));
                                }
                                a = zzoh3;
                                i = i4;
                                it = it3;
                                it2 = it4;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        obj2 = obj;
                    }
                }
                return zzye;
            }
        }
        if (!arrayList.isEmpty()) {
            r1.f17380i.m10929a("mediation_networks_fail", TextUtils.join(",", arrayList));
        }
        if (((Boolean) zzkd.m10713e().m10897a(zznw.cB)).booleanValue()) {
            return new zzye(i);
        }
        return new zzye(1);
    }

    /* renamed from: a */
    public final void mo2754a() {
        synchronized (this.f17375d) {
            this.f17383l = true;
            if (this.f17384m != null) {
                this.f17384m.m21999a();
            }
        }
    }

    /* renamed from: b */
    public final List<zzye> mo2755b() {
        return this.f17385n;
    }
}
