package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Iterator;
import java.util.Map.Entry;

final class cl<T> implements cu<T> {
    /* renamed from: a */
    private final zzwt f17469a;
    /* renamed from: b */
    private final dl<?, ?> f17470b;
    /* renamed from: c */
    private final boolean f17471c;
    /* renamed from: d */
    private final bi<?> f17472d;

    private cl(dl<?, ?> dlVar, bi<?> biVar, zzwt zzwt) {
        this.f17470b = dlVar;
        this.f17471c = biVar.mo3045a(zzwt);
        this.f17472d = biVar;
        this.f17469a = zzwt;
    }

    /* renamed from: a */
    static <T> cl<T> m22385a(dl<?, ?> dlVar, bi<?> biVar, zzwt zzwt) {
        return new cl(dlVar, biVar, zzwt);
    }

    /* renamed from: a */
    public final T mo3064a() {
        return this.f17469a.mo4838i().mo4829d();
    }

    /* renamed from: a */
    public final boolean mo3067a(T t, T t2) {
        if (this.f17470b.mo3089b(t).equals(this.f17470b.mo3089b(t2))) {
            return this.f17471c ? this.f17472d.mo3038a((Object) t).equals(this.f17472d.mo3038a((Object) t2)) : true;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final int mo3063a(T t) {
        int hashCode = this.f17470b.mo3089b(t).hashCode();
        return this.f17471c ? (hashCode * 53) + this.f17472d.mo3038a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: b */
    public final void mo3069b(T t, T t2) {
        cw.m11640a(this.f17470b, (Object) t, (Object) t2);
        if (this.f17471c) {
            cw.m11638a(this.f17472d, (Object) t, (Object) t2);
        }
    }

    /* renamed from: a */
    public final void mo3066a(T t, dx dxVar) {
        Iterator e = this.f17472d.mo3038a((Object) t).m11533e();
        while (e.hasNext()) {
            Entry entry = (Entry) e.next();
            zzvf zzvf = (zzvf) entry.getKey();
            if (zzvf.m12061c() != zzyv.MESSAGE || zzvf.m12062d() || zzvf.m12063e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof bt) {
                dxVar.mo3004a(zzvf.m12057a(), ((bt) entry).m11540a().m12094c());
            } else {
                dxVar.mo3004a(zzvf.m12057a(), entry.getValue());
            }
        }
        dl dlVar = this.f17470b;
        dlVar.mo3091b(dlVar.mo3089b(t), dxVar);
    }

    /* renamed from: a */
    public final void mo3065a(T t, ct ctVar, zzuz zzuz) {
        dl dlVar = this.f17470b;
        bi biVar = this.f17472d;
        Object c = dlVar.mo3093c(t);
        bl b = biVar.mo3046b(t);
        while (ctVar.mo2954a() != BaseClientBuilder.API_PRIORITY_OTHER) {
            try {
                boolean a;
                int b2 = ctVar.mo2959b();
                if (b2 != 11) {
                    if ((b2 & 7) == 2) {
                        Object a2 = biVar.mo3040a(zzuz, this.f17469a, b2 >>> 3);
                        if (a2 != null) {
                            biVar.mo3041a(ctVar, a2, zzuz, b);
                        } else {
                            a = dlVar.m11716a(c, ctVar);
                            continue;
                        }
                    } else {
                        a = ctVar.mo2964c();
                        continue;
                    }
                    if (!a) {
                        return;
                    }
                }
                Object obj = null;
                zzud zzud = null;
                int i = 0;
                while (ctVar.mo2954a() != BaseClientBuilder.API_PRIORITY_OTHER) {
                    int b3 = ctVar.mo2959b();
                    if (b3 == 16) {
                        i = ctVar.mo2987o();
                        obj = biVar.mo3040a(zzuz, this.f17469a, i);
                    } else if (b3 == 26) {
                        if (obj != null) {
                            biVar.mo3041a(ctVar, obj, zzuz, b);
                        } else {
                            zzud = ctVar.mo2985n();
                        }
                    } else if (!ctVar.mo2964c()) {
                        break;
                    }
                }
                if (ctVar.mo2959b() != 12) {
                    throw zzvt.m12084d();
                } else if (zzud != null) {
                    if (obj != null) {
                        biVar.mo3043a(zzud, obj, zzuz, b);
                    } else {
                        dlVar.mo3084a(c, i, zzud);
                    }
                }
                a = true;
                continue;
                if (a) {
                    return;
                }
            } finally {
                dlVar.mo3092b((Object) t, c);
            }
        }
        dlVar.mo3092b((Object) t, c);
    }

    /* renamed from: c */
    public final void mo3070c(T t) {
        this.f17470b.mo3095d(t);
        this.f17472d.mo3047c(t);
    }

    /* renamed from: d */
    public final boolean mo3071d(T t) {
        return this.f17472d.mo3038a((Object) t).m11535g();
    }

    /* renamed from: b */
    public final int mo3068b(T t) {
        dl dlVar = this.f17470b;
        int e = dlVar.mo3096e(dlVar.mo3089b(t)) + 0;
        return this.f17471c ? e + this.f17472d.mo3038a((Object) t).m11537i() : e;
    }
}
