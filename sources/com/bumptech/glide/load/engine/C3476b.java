package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1261e.C1260a;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.b */
class C3476b implements C1187a<Object>, C1261e {
    /* renamed from: a */
    private final List<C1216c> f14441a;
    /* renamed from: b */
    private final C1262f<?> f14442b;
    /* renamed from: c */
    private final C1260a f14443c;
    /* renamed from: d */
    private int f14444d;
    /* renamed from: e */
    private C1216c f14445e;
    /* renamed from: f */
    private List<C1206n<File, ?>> f14446f;
    /* renamed from: g */
    private int f14447g;
    /* renamed from: h */
    private volatile C1205a<?> f14448h;
    /* renamed from: i */
    private File f14449i;

    C3476b(C1262f<?> c1262f, C1260a c1260a) {
        this(c1262f.m5127n(), c1262f, c1260a);
    }

    C3476b(List<C1216c> list, C1262f<?> c1262f, C1260a c1260a) {
        this.f14444d = -1;
        this.f14441a = list;
        this.f14442b = c1262f;
        this.f14443c = c1260a;
    }

    /* renamed from: a */
    public boolean mo1029a() {
        boolean z;
        while (true) {
            z = false;
            if (this.f14446f != null) {
                if (m17661c()) {
                    break;
                }
            }
            this.f14444d++;
            if (this.f14444d >= this.f14441a.size()) {
                return false;
            }
            C1216c c1216c = (C1216c) this.f14441a.get(this.f14444d);
            this.f14449i = this.f14442b.m5112b().mo1018a(new C3480c(c1216c, this.f14442b.m5119f()));
            if (this.f14449i != null) {
                this.f14445e = c1216c;
                this.f14446f = this.f14442b.m5106a(this.f14449i);
                this.f14447g = 0;
            }
        }
        this.f14448h = null;
        while (!z && m17661c()) {
            List list = this.f14446f;
            int i = this.f14447g;
            this.f14447g = i + 1;
            this.f14448h = ((C1206n) list.get(i)).mo971a(this.f14449i, this.f14442b.m5120g(), this.f14442b.m5121h(), this.f14442b.m5118e());
            if (this.f14448h != null && this.f14442b.m5111a(this.f14448h.f3884c.mo959a())) {
                this.f14448h.f3884c.mo960a(this.f14442b.m5117d(), this);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    private boolean m17661c() {
        return this.f14447g < this.f14446f.size();
    }

    /* renamed from: b */
    public void mo1030b() {
        C1205a c1205a = this.f14448h;
        if (c1205a != null) {
            c1205a.f3884c.mo962c();
        }
    }

    /* renamed from: a */
    public void mo986a(Object obj) {
        this.f14443c.mo991a(this.f14445e, obj, this.f14448h.f3884c, DataSource.DATA_DISK_CACHE, this.f14445e);
    }

    /* renamed from: a */
    public void mo985a(Exception exception) {
        this.f14443c.mo990a(this.f14445e, exception, this.f14448h.f3884c, DataSource.DATA_DISK_CACHE);
    }
}
