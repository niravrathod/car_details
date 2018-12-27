package com.bumptech.glide.load.engine;

import android.support.v4.p017f.C0431k.C0430a;
import android.util.Log;
import com.bumptech.glide.C1157e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C3493n.C1273a;
import com.bumptech.glide.load.engine.DecodeJob.C1220a;
import com.bumptech.glide.load.engine.DecodeJob.C1222d;
import com.bumptech.glide.load.engine.p061b.C1242a;
import com.bumptech.glide.load.engine.p061b.C1242a.C1240a;
import com.bumptech.glide.load.engine.p061b.C1248h;
import com.bumptech.glide.load.engine.p061b.C1248h.C1247a;
import com.bumptech.glide.load.engine.p061b.C3468b;
import com.bumptech.glide.load.engine.p062c.C1256a;
import com.bumptech.glide.p055g.C1174e;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.p055g.p056a.C1167a;
import com.bumptech.glide.p055g.p056a.C1167a.C1164a;
import com.bumptech.glide.request.C1314f;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.i */
public class C3490i implements C1247a, C1271k, C1273a {
    /* renamed from: a */
    private static final boolean f14459a = Log.isLoggable("Engine", 2);
    /* renamed from: b */
    private final C1275p f14460b;
    /* renamed from: c */
    private final C1272m f14461c;
    /* renamed from: d */
    private final C1248h f14462d;
    /* renamed from: e */
    private final C1267b f14463e;
    /* renamed from: f */
    private final C1279v f14464f;
    /* renamed from: g */
    private final C3489c f14465g;
    /* renamed from: h */
    private final C1266a f14466h;
    /* renamed from: i */
    private final C1239a f14467i;

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    static class C1266a {
        /* renamed from: a */
        final C1222d f4013a;
        /* renamed from: b */
        final C0430a<DecodeJob<?>> f4014b = C1167a.m4842a(150, new C34871(this));
        /* renamed from: c */
        private int f4015c;

        /* renamed from: com.bumptech.glide.load.engine.i$a$1 */
        class C34871 implements C1164a<DecodeJob<?>> {
            /* renamed from: a */
            final /* synthetic */ C1266a f14455a;

            C34871(C1266a c1266a) {
                this.f14455a = c1266a;
            }

            /* renamed from: b */
            public /* synthetic */ Object mo955b() {
                return m17691a();
            }

            /* renamed from: a */
            public DecodeJob<?> m17691a() {
                return new DecodeJob(this.f14455a.f4013a, this.f14455a.f4014b);
            }
        }

        C1266a(C1222d c1222d) {
            this.f4013a = c1222d;
        }

        /* renamed from: a */
        <R> DecodeJob<R> m5136a(C1157e c1157e, Object obj, C3492l c3492l, C1216c c1216c, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1265h c1265h, Map<Class<?>, C3500h<?>> map, boolean z, boolean z2, boolean z3, C3452e c3452e, C1220a<R> c1220a) {
            C1157e c1157e2 = c1157e;
            Object obj2 = obj;
            C3492l c3492l2 = c3492l;
            C1216c c1216c2 = c1216c;
            int i3 = i;
            int i4 = i2;
            Class<?> cls3 = cls;
            Class<R> cls4 = cls2;
            Priority priority2 = priority;
            C1265h c1265h2 = c1265h;
            Map<Class<?>, C3500h<?>> map2 = map;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            C3452e c3452e2 = c3452e;
            C1220a<R> c1220a2 = c1220a;
            DecodeJob decodeJob = (DecodeJob) C1178i.m4880a((DecodeJob) this.f4014b.mo338a());
            int i5 = this.f4015c;
            int i6 = i5;
            this.f4015c = i5 + 1;
            return decodeJob.m17547a(c1157e2, obj2, c3492l2, c1216c2, i3, i4, cls3, cls4, priority2, c1265h2, map2, z4, z5, z6, c3452e2, c1220a2, i6);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$b */
    static class C1267b {
        /* renamed from: a */
        final C1256a f4016a;
        /* renamed from: b */
        final C1256a f4017b;
        /* renamed from: c */
        final C1256a f4018c;
        /* renamed from: d */
        final C1256a f4019d;
        /* renamed from: e */
        final C1271k f4020e;
        /* renamed from: f */
        final C0430a<C3491j<?>> f4021f = C1167a.m4842a(150, new C34881(this));

        /* renamed from: com.bumptech.glide.load.engine.i$b$1 */
        class C34881 implements C1164a<C3491j<?>> {
            /* renamed from: a */
            final /* synthetic */ C1267b f14456a;

            C34881(C1267b c1267b) {
                this.f14456a = c1267b;
            }

            /* renamed from: b */
            public /* synthetic */ Object mo955b() {
                return m17693a();
            }

            /* renamed from: a */
            public C3491j<?> m17693a() {
                return new C3491j(this.f14456a.f4016a, this.f14456a.f4017b, this.f14456a.f4018c, this.f14456a.f4019d, this.f14456a.f4020e, this.f14456a.f4021f);
            }
        }

        C1267b(C1256a c1256a, C1256a c1256a2, C1256a c1256a3, C1256a c1256a4, C1271k c1271k) {
            this.f4016a = c1256a;
            this.f4017b = c1256a2;
            this.f4018c = c1256a3;
            this.f4019d = c1256a4;
            this.f4020e = c1271k;
        }

        /* renamed from: a */
        <R> C3491j<R> m5137a(C1216c c1216c, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((C3491j) C1178i.m4880a((C3491j) this.f4021f.mo338a())).m17710a(c1216c, z, z2, z3, z4);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$d */
    public static class C1268d {
        /* renamed from: a */
        private final C3491j<?> f4022a;
        /* renamed from: b */
        private final C1314f f4023b;

        C1268d(C1314f c1314f, C3491j<?> c3491j) {
            this.f4023b = c1314f;
            this.f4022a = c3491j;
        }

        /* renamed from: a */
        public void m5138a() {
            this.f4022a.m17718b(this.f4023b);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$c */
    private static class C3489c implements C1222d {
        /* renamed from: a */
        private final C1240a f14457a;
        /* renamed from: b */
        private volatile C1242a f14458b;

        C3489c(C1240a c1240a) {
            this.f14457a = c1240a;
        }

        /* renamed from: a */
        public C1242a mo1037a() {
            if (this.f14458b == null) {
                synchronized (this) {
                    if (this.f14458b == null) {
                        this.f14458b = this.f14457a.mo1020a();
                    }
                    if (this.f14458b == null) {
                        this.f14458b = new C3468b();
                    }
                }
            }
            return this.f14458b;
        }
    }

    public C3490i(C1248h c1248h, C1240a c1240a, C1256a c1256a, C1256a c1256a2, C1256a c1256a3, C1256a c1256a4, boolean z) {
        this(c1248h, c1240a, c1256a, c1256a2, c1256a3, c1256a4, null, null, null, null, null, null, z);
    }

    C3490i(C1248h c1248h, C1240a c1240a, C1256a c1256a, C1256a c1256a2, C1256a c1256a3, C1256a c1256a4, C1275p c1275p, C1272m c1272m, C1239a c1239a, C1267b c1267b, C1266a c1266a, C1279v c1279v, boolean z) {
        C1267b c1267b2;
        this.f14462d = c1248h;
        C1240a c1240a2 = c1240a;
        this.f14465g = new C3489c(c1240a);
        C1239a c1239a2 = c1239a == null ? new C1239a(z) : c1239a;
        r6.f14467i = c1239a2;
        c1239a2.m5061a((C1273a) this);
        r6.f14461c = c1272m == null ? new C1272m() : c1272m;
        r6.f14460b = c1275p == null ? new C1275p() : c1275p;
        if (c1267b == null) {
            C1267b c1267b3 = new C1267b(c1256a, c1256a2, c1256a3, c1256a4, this);
        } else {
            c1267b2 = c1267b;
        }
        r6.f14463e = c1267b2;
        r6.f14466h = c1266a == null ? new C1266a(r6.f14465g) : c1266a;
        r6.f14464f = c1279v == null ? new C1279v() : c1279v;
        c1248h.mo1025a((C1247a) this);
    }

    /* renamed from: a */
    public <R> C1268d m17700a(C1157e c1157e, Object obj, C1216c c1216c, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1265h c1265h, Map<Class<?>, C3500h<?>> map, boolean z, boolean z2, C3452e c3452e, boolean z3, boolean z4, boolean z5, boolean z6, C1314f c1314f) {
        C3490i c3490i = this;
        boolean z7 = z3;
        C1314f c1314f2 = c1314f;
        C1180j.m4896a();
        long a = f14459a ? C1174e.m4866a() : 0;
        C1216c a2 = c3490i.f14461c.m5142a(obj, c1216c, i, i2, map, cls, cls2, c3452e);
        C1277s a3 = m17697a(a2, z7);
        if (a3 != null) {
            c1314f2.mo1076a(a3, DataSource.MEMORY_CACHE);
            if (f14459a) {
                C3490i.m17698a("Loaded resource from active resources", a, a2);
            }
            return null;
        }
        a3 = m17699b(a2, z7);
        if (a3 != null) {
            c1314f2.mo1076a(a3, DataSource.MEMORY_CACHE);
            if (f14459a) {
                C3490i.m17698a("Loaded resource from cache", a, a2);
            }
            return null;
        }
        C3491j a4 = c3490i.f14460b.m5146a(a2, z6);
        if (a4 != null) {
            a4.m17714a(c1314f2);
            if (f14459a) {
                C3490i.m17698a("Added to existing load", a, a2);
            }
            return new C1268d(c1314f2, a4);
        }
        a4 = c3490i.f14463e.m5137a(a2, z3, z4, z5, z6);
        DecodeJob a5 = c3490i.f14466h.m5136a(c1157e, obj, a2, c1216c, i, i2, cls, cls2, priority, c1265h, map, z, z2, z6, c3452e, a4);
        c3490i.f14460b.m5147a(a2, a4);
        a4.m17714a(c1314f2);
        a4.m17717b(a5);
        if (f14459a) {
            C3490i.m17698a("Started new load", a, a2);
        }
        return new C1268d(c1314f2, a4);
    }

    /* renamed from: a */
    private static void m17698a(String str, long j, C1216c c1216c) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(C1174e.m4865a(j));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(c1216c);
        Log.v("Engine", stringBuilder.toString());
    }

    /* renamed from: a */
    private C3493n<?> m17697a(C1216c c1216c, boolean z) {
        if (!z) {
            return null;
        }
        c1216c = this.f14467i.m5062b(c1216c);
        if (c1216c != null) {
            c1216c.m17730g();
        }
        return c1216c;
    }

    /* renamed from: b */
    private C3493n<?> m17699b(C1216c c1216c, boolean z) {
        if (!z) {
            return null;
        }
        z = m17696a(c1216c);
        if (z) {
            z.m17730g();
            this.f14467i.m5059a(c1216c, z);
        }
        return z;
    }

    /* renamed from: a */
    private C3493n<?> m17696a(C1216c c1216c) {
        c1216c = this.f14462d.mo1023a(c1216c);
        if (c1216c == null) {
            return null;
        }
        if (c1216c instanceof C3493n) {
            return (C3493n) c1216c;
        }
        return new C3493n(c1216c, true, true);
    }

    /* renamed from: a */
    public void m17704a(C1277s<?> c1277s) {
        C1180j.m4896a();
        if (c1277s instanceof C3493n) {
            ((C3493n) c1277s).m17731h();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public void mo1040a(C3491j<?> c3491j, C1216c c1216c, C3493n<?> c3493n) {
        C1180j.m4896a();
        if (c3493n != null) {
            c3493n.m17724a(c1216c, this);
            if (c3493n.m17725b()) {
                this.f14467i.m5059a(c1216c, c3493n);
            }
        }
        this.f14460b.m5148b(c1216c, c3491j);
    }

    /* renamed from: a */
    public void mo1039a(C3491j<?> c3491j, C1216c c1216c) {
        C1180j.m4896a();
        this.f14460b.m5148b(c1216c, c3491j);
    }

    /* renamed from: b */
    public void mo1041b(C1277s<?> c1277s) {
        C1180j.m4896a();
        this.f14464f.m5155a(c1277s);
    }

    /* renamed from: a */
    public void mo1038a(C1216c c1216c, C3493n<?> c3493n) {
        C1180j.m4896a();
        this.f14467i.m5058a(c1216c);
        if (c3493n.m17725b()) {
            this.f14462d.mo1026b(c1216c, c3493n);
        } else {
            this.f14464f.m5155a(c3493n);
        }
    }
}
