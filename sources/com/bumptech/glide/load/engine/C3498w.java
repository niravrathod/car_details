package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C1194a;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C1261e.C1260a;
import com.bumptech.glide.load.engine.p061b.C1242a.C1241b;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.p057a.C1188d.C1187a;
import com.bumptech.glide.load.p059b.C1206n.C1205a;
import com.bumptech.glide.p055g.C1174e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.w */
class C3498w implements C1187a<Object>, C1261e, C1260a {
    /* renamed from: a */
    private final C1262f<?> f14533a;
    /* renamed from: b */
    private final C1260a f14534b;
    /* renamed from: c */
    private int f14535c;
    /* renamed from: d */
    private C3476b f14536d;
    /* renamed from: e */
    private Object f14537e;
    /* renamed from: f */
    private volatile C1205a<?> f14538f;
    /* renamed from: g */
    private C3480c f14539g;

    C3498w(C1262f<?> c1262f, C1260a c1260a) {
        this.f14533a = c1262f;
        this.f14534b = c1260a;
    }

    /* renamed from: a */
    public boolean mo1029a() {
        if (this.f14537e != null) {
            Object obj = this.f14537e;
            this.f14537e = null;
            m17749b(obj);
        }
        if (this.f14536d != null && this.f14536d.mo1029a()) {
            return true;
        }
        this.f14536d = null;
        this.f14538f = null;
        boolean z = false;
        while (!z && m17750d()) {
            List m = this.f14533a.m5126m();
            int i = this.f14535c;
            this.f14535c = i + 1;
            this.f14538f = (C1205a) m.get(i);
            if (this.f14538f != null && (this.f14533a.m5115c().mo1034a(this.f14538f.f3884c.mo963d()) || this.f14533a.m5111a(this.f14538f.f3884c.mo959a()))) {
                this.f14538f.f3884c.mo960a(this.f14533a.m5117d(), this);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: d */
    private boolean m17750d() {
        return this.f14535c < this.f14533a.m5126m().size();
    }

    /* renamed from: b */
    private void m17749b(Object obj) {
        long a = C1174e.m4866a();
        try {
            C1194a a2 = this.f14533a.m5105a(obj);
            C1241b c3481d = new C3481d(a2, obj, this.f14533a.m5118e());
            this.f14539g = new C3480c(this.f14538f.f3882a, this.f14533a.m5119f());
            this.f14533a.m5112b().mo1019a(this.f14539g, c3481d);
            if (Log.isLoggable("SourceGenerator", 2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Finished encoding source to cache, key: ");
                stringBuilder.append(this.f14539g);
                stringBuilder.append(", data: ");
                stringBuilder.append(obj);
                stringBuilder.append(", encoder: ");
                stringBuilder.append(a2);
                stringBuilder.append(", duration: ");
                stringBuilder.append(C1174e.m4865a(a));
                Log.v("SourceGenerator", stringBuilder.toString());
            }
            this.f14538f.f3884c.mo961b();
            this.f14536d = new C3476b(Collections.singletonList(this.f14538f.f3882a), this.f14533a, this);
        } catch (Throwable th) {
            this.f14538f.f3884c.mo961b();
        }
    }

    /* renamed from: b */
    public void mo1030b() {
        C1205a c1205a = this.f14538f;
        if (c1205a != null) {
            c1205a.f3884c.mo962c();
        }
    }

    /* renamed from: a */
    public void mo986a(Object obj) {
        C1265h c = this.f14533a.m5115c();
        if (obj == null || !c.mo1034a(this.f14538f.f3884c.mo963d())) {
            this.f14534b.mo991a(this.f14538f.f3882a, obj, this.f14538f.f3884c, this.f14538f.f3884c.mo963d(), this.f14539g);
            return;
        }
        this.f14537e = obj;
        this.f14534b.mo992c();
    }

    /* renamed from: a */
    public void mo985a(Exception exception) {
        this.f14534b.mo990a(this.f14539g, exception, this.f14538f.f3884c, this.f14538f.f3884c.mo963d());
    }

    /* renamed from: c */
    public void mo992c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public void mo991a(C1216c c1216c, Object obj, C1188d<?> c1188d, DataSource dataSource, C1216c c1216c2) {
        this.f14534b.mo991a(c1216c, obj, c1188d, this.f14538f.f3884c.mo963d(), c1216c);
    }

    /* renamed from: a */
    public void mo990a(C1216c c1216c, Exception exception, C1188d<?> c1188d, DataSource dataSource) {
        this.f14534b.mo990a(c1216c, exception, c1188d, this.f14538f.f3884c.mo963d());
    }
}
