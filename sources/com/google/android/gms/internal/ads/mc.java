package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Iterator;
import java.util.Map.Entry;

final class mc<T> implements ml<T> {
    /* renamed from: a */
    private final zzbel f16560a;
    /* renamed from: b */
    private final nc<?, ?> f16561b;
    /* renamed from: c */
    private final boolean f16562c;
    /* renamed from: d */
    private final ky<?> f16563d;

    private mc(nc<?, ?> ncVar, ky<?> kyVar, zzbel zzbel) {
        this.f16561b = ncVar;
        this.f16562c = kyVar.mo2091a(zzbel);
        this.f16563d = kyVar;
        this.f16560a = zzbel;
    }

    /* renamed from: a */
    static <T> mc<T> m20817a(nc<?, ?> ncVar, ky<?> kyVar, zzbel zzbel) {
        return new mc(ncVar, kyVar, zzbel);
    }

    /* renamed from: a */
    public final T mo2109a() {
        return this.f16560a.mo4812p().mo4803e();
    }

    /* renamed from: a */
    public final boolean mo2113a(T t, T t2) {
        if (this.f16561b.mo2135b(t).equals(this.f16561b.mo2135b(t2))) {
            return this.f16562c ? this.f16563d.mo2084a((Object) t).equals(this.f16563d.mo2084a((Object) t2)) : true;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo2108a(T t) {
        int hashCode = this.f16561b.mo2135b(t).hashCode();
        return this.f16562c ? (hashCode * 53) + this.f16563d.mo2084a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo2115b(T t, T t2) {
        mn.m9119a(this.f16561b, (Object) t, (Object) t2);
        if (this.f16562c) {
            mn.m9117a(this.f16563d, (Object) t, (Object) t2);
        }
    }

    /* renamed from: a */
    public final void mo2111a(T t, no noVar) {
        Iterator e = this.f16563d.mo2084a((Object) t).m9011e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            zzbcw zzbcw = (zzbcw) entry.getKey();
            if (zzbcw.m10320c() != zzbgo.MESSAGE || zzbcw.m10321d() || zzbcw.m10322e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof lj) {
                noVar.mo2050a(zzbcw.m10316a(), ((lj) entry).m9018a().m10354c());
            } else {
                noVar.mo2050a(zzbcw.m10316a(), entry.getValue());
            }
        }
        nc ncVar = this.f16561b;
        ncVar.mo2137b(ncVar.mo2135b(t), noVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2112a(T r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.ki r11) {
        /*
        r6 = this;
        r7 = (com.google.android.gms.internal.ads.zzbdd) r7;
        r0 = r7.zzdxs;
        r1 = com.google.android.gms.internal.ads.zzbfv.m10372a();
        if (r0 != r1) goto L_0x0010;
    L_0x000a:
        r0 = com.google.android.gms.internal.ads.zzbfv.m10375b();
        r7.zzdxs = r0;
    L_0x0010:
        r7 = r0;
    L_0x0011:
        if (r9 >= r10) goto L_0x0069;
    L_0x0013:
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r8, r9, r11);
        r0 = r11.f8206a;
        r9 = 11;
        r1 = 2;
        if (r0 == r9) goto L_0x0030;
    L_0x001e:
        r9 = r0 & 7;
        if (r9 != r1) goto L_0x002b;
    L_0x0022:
        r1 = r8;
        r3 = r10;
        r4 = r7;
        r5 = r11;
        r9 = com.google.android.gms.internal.ads.kh.m8962a(r0, r1, r2, r3, r4, r5);
        goto L_0x0011;
    L_0x002b:
        r9 = com.google.android.gms.internal.ads.kh.m8960a(r0, r8, r2, r10, r11);
        goto L_0x0011;
    L_0x0030:
        r9 = 0;
        r0 = 0;
    L_0x0032:
        if (r2 >= r10) goto L_0x005f;
    L_0x0034:
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r8, r2, r11);
        r3 = r11.f8206a;
        r4 = r3 >>> 3;
        r5 = r3 & 7;
        switch(r4) {
            case 2: goto L_0x004d;
            case 3: goto L_0x0042;
            default: goto L_0x0041;
        };
    L_0x0041:
        goto L_0x0056;
    L_0x0042:
        if (r5 != r1) goto L_0x0056;
    L_0x0044:
        r2 = com.google.android.gms.internal.ads.kh.m8973e(r8, r2, r11);
        r0 = r11.f8208c;
        r0 = (com.google.android.gms.internal.ads.zzbbu) r0;
        goto L_0x0032;
    L_0x004d:
        if (r5 != 0) goto L_0x0056;
    L_0x004f:
        r2 = com.google.android.gms.internal.ads.kh.m8965a(r8, r2, r11);
        r9 = r11.f8206a;
        goto L_0x0032;
    L_0x0056:
        r4 = 12;
        if (r3 == r4) goto L_0x005f;
    L_0x005a:
        r2 = com.google.android.gms.internal.ads.kh.m8960a(r3, r8, r2, r10, r11);
        goto L_0x0032;
    L_0x005f:
        if (r0 == 0) goto L_0x0067;
    L_0x0061:
        r9 = r9 << 3;
        r9 = r9 | r1;
        r7.m10376a(r9, r0);
    L_0x0067:
        r9 = r2;
        goto L_0x0011;
    L_0x0069:
        if (r9 != r10) goto L_0x006c;
    L_0x006b:
        return;
    L_0x006c:
        r7 = com.google.android.gms.internal.ads.zzbdl.m10347h();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mc.a(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.ki):void");
    }

    /* renamed from: a */
    public final void mo2110a(T t, mk mkVar, zzbcq zzbcq) {
        nc ncVar = this.f16561b;
        ky kyVar = this.f16563d;
        Object c = ncVar.mo2139c(t);
        lb b = kyVar.mo2092b(t);
        while (mkVar.mo2000a() != BaseClientBuilder.API_PRIORITY_OTHER) {
            try {
                boolean a;
                int b2 = mkVar.mo2005b();
                if (b2 != 11) {
                    if ((b2 & 7) == 2) {
                        Object a2 = kyVar.mo2086a(zzbcq, this.f16560a, b2 >>> 3);
                        if (a2 != null) {
                            kyVar.mo2087a(mkVar, a2, zzbcq, b);
                        } else {
                            a = ncVar.m9195a(c, mkVar);
                            continue;
                        }
                    } else {
                        a = mkVar.mo2010c();
                        continue;
                    }
                    if (!a) {
                        return;
                    }
                }
                Object obj = null;
                zzbbu zzbbu = null;
                int i = 0;
                while (mkVar.mo2000a() != BaseClientBuilder.API_PRIORITY_OTHER) {
                    int b3 = mkVar.mo2005b();
                    if (b3 == 16) {
                        i = mkVar.mo2033o();
                        obj = kyVar.mo2086a(zzbcq, this.f16560a, i);
                    } else if (b3 == 26) {
                        if (obj != null) {
                            kyVar.mo2087a(mkVar, obj, zzbcq, b);
                        } else {
                            zzbbu = mkVar.mo2031n();
                        }
                    } else if (!mkVar.mo2010c()) {
                        break;
                    }
                }
                if (mkVar.mo2005b() != 12) {
                    throw zzbdl.m10344e();
                } else if (zzbbu != null) {
                    if (obj != null) {
                        kyVar.mo2089a(zzbbu, obj, zzbcq, b);
                    } else {
                        ncVar.mo2130a(c, i, zzbbu);
                    }
                }
                a = true;
                continue;
                if (a) {
                    return;
                }
            } finally {
                ncVar.mo2138b((Object) t, c);
            }
        }
        ncVar.mo2138b((Object) t, c);
    }

    /* renamed from: c */
    public final void mo2116c(T t) {
        this.f16561b.mo2141d(t);
        this.f16563d.mo2093c(t);
    }

    /* renamed from: d */
    public final boolean mo2117d(T t) {
        return this.f16563d.mo2084a((Object) t).m9013g();
    }

    /* renamed from: b */
    public final int mo2114b(T t) {
        nc ncVar = this.f16561b;
        int e = ncVar.mo2142e(ncVar.mo2135b(t)) + 0;
        return this.f16562c ? e + this.f16563d.mo2084a((Object) t).m9015i() : e;
    }
}
