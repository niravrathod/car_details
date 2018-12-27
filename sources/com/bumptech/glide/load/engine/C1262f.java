package com.bumptech.glide.load.engine;

import com.bumptech.glide.C1157e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1194a;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.DecodeJob.C1222d;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p061b.C1242a;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.load.resource.C4517b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.engine.f */
final class C1262f<Transcode> {
    /* renamed from: a */
    private final List<C1205a<?>> f3985a = new ArrayList();
    /* renamed from: b */
    private final List<C1216c> f3986b = new ArrayList();
    /* renamed from: c */
    private C1157e f3987c;
    /* renamed from: d */
    private Object f3988d;
    /* renamed from: e */
    private int f3989e;
    /* renamed from: f */
    private int f3990f;
    /* renamed from: g */
    private Class<?> f3991g;
    /* renamed from: h */
    private C1222d f3992h;
    /* renamed from: i */
    private C3452e f3993i;
    /* renamed from: j */
    private Map<Class<?>, C3500h<?>> f3994j;
    /* renamed from: k */
    private Class<Transcode> f3995k;
    /* renamed from: l */
    private boolean f3996l;
    /* renamed from: m */
    private boolean f3997m;
    /* renamed from: n */
    private C1216c f3998n;
    /* renamed from: o */
    private Priority f3999o;
    /* renamed from: p */
    private C1265h f4000p;
    /* renamed from: q */
    private boolean f4001q;
    /* renamed from: r */
    private boolean f4002r;

    C1262f() {
    }

    /* renamed from: a */
    <R> void m5108a(C1157e c1157e, Object obj, C1216c c1216c, int i, int i2, C1265h c1265h, Class<?> cls, Class<R> cls2, Priority priority, C3452e c3452e, Map<Class<?>, C3500h<?>> map, boolean z, boolean z2, C1222d c1222d) {
        this.f3987c = c1157e;
        this.f3988d = obj;
        this.f3998n = c1216c;
        this.f3989e = i;
        this.f3990f = i2;
        this.f4000p = c1265h;
        this.f3991g = cls;
        this.f3992h = c1222d;
        this.f3995k = cls2;
        this.f3999o = priority;
        this.f3993i = c3452e;
        this.f3994j = map;
        this.f4001q = z;
        this.f4002r = z2;
    }

    /* renamed from: a */
    void m5107a() {
        this.f3987c = null;
        this.f3988d = null;
        this.f3998n = null;
        this.f3991g = null;
        this.f3995k = null;
        this.f3993i = null;
        this.f3999o = null;
        this.f3994j = null;
        this.f4000p = null;
        this.f3985a.clear();
        this.f3996l = false;
        this.f3986b.clear();
        this.f3997m = false;
    }

    /* renamed from: b */
    C1242a m5112b() {
        return this.f3992h.mo1037a();
    }

    /* renamed from: c */
    C1265h m5115c() {
        return this.f4000p;
    }

    /* renamed from: d */
    Priority m5117d() {
        return this.f3999o;
    }

    /* renamed from: e */
    C3452e m5118e() {
        return this.f3993i;
    }

    /* renamed from: f */
    C1216c m5119f() {
        return this.f3998n;
    }

    /* renamed from: g */
    int m5120g() {
        return this.f3989e;
    }

    /* renamed from: h */
    int m5121h() {
        return this.f3990f;
    }

    /* renamed from: i */
    C1230b m5122i() {
        return this.f3987c.m4821e();
    }

    /* renamed from: j */
    Class<?> m5123j() {
        return this.f3995k;
    }

    /* renamed from: k */
    List<Class<?>> m5124k() {
        return this.f3987c.m4819c().m4639b(this.f3988d.getClass(), this.f3991g, this.f3995k);
    }

    /* renamed from: a */
    boolean m5111a(Class<?> cls) {
        return m5113b((Class) cls) != null ? true : null;
    }

    /* renamed from: b */
    <Data> C1276q<Data, ?, Transcode> m5113b(Class<Data> cls) {
        return this.f3987c.m4819c().m4634a((Class) cls, this.f3991g, this.f3995k);
    }

    /* renamed from: l */
    boolean m5125l() {
        return this.f4002r;
    }

    /* renamed from: c */
    <Z> C3500h<Z> m5116c(Class<Z> cls) {
        C3500h<Z> c3500h = (C3500h) this.f3994j.get(cls);
        if (c3500h == null) {
            for (Entry entry : this.f3994j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    c3500h = (C3500h) entry.getValue();
                    break;
                }
            }
        }
        if (c3500h != null) {
            return c3500h;
        }
        if (this.f3994j.isEmpty()) {
            if (this.f4001q) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Missing transformation for ");
                stringBuilder.append(cls);
                stringBuilder.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return C4517b.m24962a();
    }

    /* renamed from: a */
    boolean m5110a(C1277s<?> c1277s) {
        return this.f3987c.m4819c().m4636a((C1277s) c1277s);
    }

    /* renamed from: b */
    <Z> C3499g<Z> m5114b(C1277s<Z> c1277s) {
        return this.f3987c.m4819c().m4638b((C1277s) c1277s);
    }

    /* renamed from: a */
    List<C1206n<File, ?>> m5106a(File file) {
        return this.f3987c.m4819c().m4640c(file);
    }

    /* renamed from: a */
    boolean m5109a(C1216c c1216c) {
        List m = m5126m();
        int size = m.size();
        for (int i = 0; i < size; i++) {
            if (((C1205a) m.get(i)).f3882a.equals(c1216c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    List<C1205a<?>> m5126m() {
        if (!this.f3996l) {
            this.f3996l = true;
            this.f3985a.clear();
            List c = this.f3987c.m4819c().m4640c(this.f3988d);
            int size = c.size();
            for (int i = 0; i < size; i++) {
                C1205a a = ((C1206n) c.get(i)).mo971a(this.f3988d, this.f3989e, this.f3990f, this.f3993i);
                if (a != null) {
                    this.f3985a.add(a);
                }
            }
        }
        return this.f3985a;
    }

    /* renamed from: n */
    List<C1216c> m5127n() {
        if (!this.f3997m) {
            this.f3997m = true;
            this.f3986b.clear();
            List m = m5126m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                C1205a c1205a = (C1205a) m.get(i);
                if (!this.f3986b.contains(c1205a.f3882a)) {
                    this.f3986b.add(c1205a.f3882a);
                }
                for (int i2 = 0; i2 < c1205a.f3883b.size(); i2++) {
                    if (!this.f3986b.contains(c1205a.f3883b.get(i2))) {
                        this.f3986b.add(c1205a.f3883b.get(i2));
                    }
                }
            }
        }
        return this.f3986b;
    }

    /* renamed from: a */
    <X> C1194a<X> m5105a(X x) {
        return this.f3987c.m4819c().m4633a((Object) x);
    }
}
