package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1261e.C1260a;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.t */
class C3496t implements C1187a<Object>, C1261e {
    /* renamed from: a */
    private final C1260a f14514a;
    /* renamed from: b */
    private final C1262f<?> f14515b;
    /* renamed from: c */
    private int f14516c;
    /* renamed from: d */
    private int f14517d = -1;
    /* renamed from: e */
    private C1216c f14518e;
    /* renamed from: f */
    private List<C1206n<File, ?>> f14519f;
    /* renamed from: g */
    private int f14520g;
    /* renamed from: h */
    private volatile C1205a<?> f14521h;
    /* renamed from: i */
    private File f14522i;
    /* renamed from: j */
    private C3497u f14523j;

    C3496t(C1262f<?> c1262f, C1260a c1260a) {
        this.f14515b = c1262f;
        this.f14514a = c1260a;
    }

    /* renamed from: a */
    public boolean mo1029a() {
        List n = this.f14515b.m5127n();
        boolean z = false;
        if (n.isEmpty()) {
            return false;
        }
        List k = this.f14515b.m5124k();
        if (k.isEmpty() && File.class.equals(this.f14515b.m5123j())) {
            return false;
        }
        while (true) {
            if (this.f14519f != null) {
                if (m17742c()) {
                    break;
                }
            }
            this.f14517d++;
            if (this.f14517d >= k.size()) {
                this.f14516c++;
                if (this.f14516c >= n.size()) {
                    return false;
                }
                this.f14517d = 0;
            }
            C1216c c1216c = (C1216c) n.get(this.f14516c);
            Class cls = (Class) k.get(this.f14517d);
            C1216c c1216c2 = c1216c;
            this.f14523j = new C3497u(this.f14515b.m5122i(), c1216c2, this.f14515b.m5119f(), this.f14515b.m5120g(), this.f14515b.m5121h(), this.f14515b.m5116c(cls), cls, this.f14515b.m5118e());
            this.f14522i = this.f14515b.m5112b().mo1018a(this.f14523j);
            if (this.f14522i != null) {
                this.f14518e = c1216c;
                this.f14519f = this.f14515b.m5106a(this.f14522i);
                this.f14520g = 0;
            }
        }
        this.f14521h = null;
        while (!z && m17742c()) {
            n = this.f14519f;
            int i = this.f14520g;
            this.f14520g = i + 1;
            this.f14521h = ((C1206n) n.get(i)).mo971a(this.f14522i, this.f14515b.m5120g(), this.f14515b.m5121h(), this.f14515b.m5118e());
            if (this.f14521h != null && this.f14515b.m5111a(this.f14521h.f3884c.mo959a())) {
                this.f14521h.f3884c.mo960a(this.f14515b.m5117d(), this);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    private boolean m17742c() {
        return this.f14520g < this.f14519f.size();
    }

    /* renamed from: b */
    public void mo1030b() {
        C1205a c1205a = this.f14521h;
        if (c1205a != null) {
            c1205a.f3884c.mo962c();
        }
    }

    /* renamed from: a */
    public void mo986a(Object obj) {
        this.f14514a.mo991a(this.f14518e, obj, this.f14521h.f3884c, DataSource.RESOURCE_DISK_CACHE, this.f14523j);
    }

    /* renamed from: a */
    public void mo985a(Exception exception) {
        this.f14514a.mo990a(this.f14523j, exception, this.f14521h.f3884c, DataSource.RESOURCE_DISK_CACHE);
    }
}
