package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.engine.C1265h;
import com.bumptech.glide.load.resource.p065d.C3536c;
import com.bumptech.glide.p052c.C1134d;
import com.bumptech.glide.p052c.C1136h;
import com.bumptech.glide.p052c.C1137i;
import com.bumptech.glide.p052c.C1141m;
import com.bumptech.glide.p052c.C1142n;
import com.bumptech.glide.p052c.C3360c;
import com.bumptech.glide.p052c.C3360c.C1133a;
import com.bumptech.glide.p052c.C3366p;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.request.C1310b;
import com.bumptech.glide.request.C1313e;
import com.bumptech.glide.request.p067a.C3545h;

/* renamed from: com.bumptech.glide.g */
public class C3377g implements C1137i {
    /* renamed from: d */
    private static final C1313e f14246d = C1313e.m5293a(Bitmap.class).m5329h();
    /* renamed from: e */
    private static final C1313e f14247e = C1313e.m5293a(C3536c.class).m5329h();
    /* renamed from: f */
    private static final C1313e f14248f = C1313e.m5290a(C1265h.f4010c).m5310a(Priority.LOW).m5322b(true);
    /* renamed from: a */
    protected final C1143c f14249a;
    /* renamed from: b */
    protected final Context f14250b;
    /* renamed from: c */
    final C1136h f14251c;
    /* renamed from: g */
    private final C1142n f14252g;
    /* renamed from: h */
    private final C1141m f14253h;
    /* renamed from: i */
    private final C3366p f14254i;
    /* renamed from: j */
    private final Runnable f14255j;
    /* renamed from: k */
    private final Handler f14256k;
    /* renamed from: l */
    private final C3360c f14257l;
    /* renamed from: m */
    private C1313e f14258m;

    /* renamed from: com.bumptech.glide.g$1 */
    class C11601 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3377g f3811a;

        C11601(C3377g c3377g) {
            this.f3811a = c3377g;
        }

        public void run() {
            this.f3811a.f14251c.mo942a(this.f3811a);
        }
    }

    /* renamed from: com.bumptech.glide.g$a */
    private static class C3371a implements C1133a {
        /* renamed from: a */
        private final C1142n f14241a;

        C3371a(C1142n c1142n) {
            this.f14241a = c1142n;
        }

        /* renamed from: a */
        public void mo953a(boolean z) {
            if (z) {
                this.f14241a.m4767d();
            }
        }
    }

    public C3377g(C1143c c1143c, C1136h c1136h, C1141m c1141m, Context context) {
        this(c1143c, c1136h, c1141m, new C1142n(), c1143c.m4783d(), context);
    }

    C3377g(C1143c c1143c, C1136h c1136h, C1141m c1141m, C1142n c1142n, C1134d c1134d, Context context) {
        this.f14254i = new C3366p();
        this.f14255j = new C11601(this);
        this.f14256k = new Handler(Looper.getMainLooper());
        this.f14249a = c1143c;
        this.f14251c = c1136h;
        this.f14253h = c1141m;
        this.f14252g = c1142n;
        this.f14250b = context;
        this.f14257l = c1134d.mo944a(context.getApplicationContext(), new C3371a(c1142n));
        if (C1180j.m4903c() != null) {
            this.f14256k.post(this.f14255j);
        } else {
            c1136h.mo942a(this);
        }
        c1136h.mo942a(this.f14257l);
        m17290a(c1143c.m4784e().m4817a());
        c1143c.m4778a(this);
    }

    /* renamed from: a */
    protected void m17290a(C1313e c1313e) {
        this.f14258m = c1313e.m5305a().m5330i();
    }

    /* renamed from: a */
    public void m17287a() {
        C1180j.m4896a();
        this.f14252g.m4762a();
    }

    /* renamed from: b */
    public void m17292b() {
        C1180j.m4896a();
        this.f14252g.m4764b();
    }

    /* renamed from: c */
    public void mo946c() {
        m17292b();
        this.f14254i.mo946c();
    }

    /* renamed from: d */
    public void mo947d() {
        m17287a();
        this.f14254i.mo947d();
    }

    /* renamed from: e */
    public void mo948e() {
        this.f14254i.mo948e();
        for (C3545h a : this.f14254i.m17263a()) {
            m17288a(a);
        }
        this.f14254i.m17265b();
        this.f14252g.m4766c();
        this.f14251c.mo943b(this);
        this.f14251c.mo943b(this.f14257l);
        this.f14256k.removeCallbacks(this.f14255j);
        this.f14249a.m4781b(this);
    }

    /* renamed from: f */
    public C1159f<Bitmap> m17297f() {
        return m17285a(Bitmap.class).m4830a(f14246d);
    }

    /* renamed from: g */
    public C1159f<Drawable> m17298g() {
        return m17285a(Drawable.class);
    }

    /* renamed from: a */
    public C1159f<Drawable> m17286a(String str) {
        return m17298g().m4832a(str);
    }

    /* renamed from: a */
    public <ResourceType> C1159f<ResourceType> m17285a(Class<ResourceType> cls) {
        return new C1159f(this.f14249a, this, cls, this.f14250b);
    }

    /* renamed from: a */
    public void m17288a(final C3545h<?> c3545h) {
        if (c3545h != null) {
            if (C1180j.m4901b()) {
                m17284c(c3545h);
            } else {
                this.f14256k.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C3377g f3813b;

                    public void run() {
                        this.f3813b.m17288a(c3545h);
                    }
                });
            }
        }
    }

    /* renamed from: c */
    private void m17284c(C3545h<?> c3545h) {
        if (!m17293b((C3545h) c3545h) && !this.f14249a.m4779a((C3545h) c3545h) && c3545h.mo3907b() != null) {
            C1310b b = c3545h.mo3907b();
            c3545h.mo3906a(null);
            b.mo1078b();
        }
    }

    /* renamed from: b */
    boolean m17293b(C3545h<?> c3545h) {
        C1310b b = c3545h.mo3907b();
        if (b == null) {
            return true;
        }
        if (!this.f14252g.m4765b(b)) {
            return null;
        }
        this.f14254i.m17266b(c3545h);
        c3545h.mo3906a(null);
        return true;
    }

    /* renamed from: a */
    void m17289a(C3545h<?> c3545h, C1310b c1310b) {
        this.f14254i.m17264a(c3545h);
        this.f14252g.m4763a(c1310b);
    }

    /* renamed from: h */
    C1313e m17299h() {
        return this.f14258m;
    }

    /* renamed from: b */
    <T> C1181h<?, T> m17291b(Class<T> cls) {
        return this.f14249a.m4784e().m4815a(cls);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{tracker=");
        stringBuilder.append(this.f14252g);
        stringBuilder.append(", treeNode=");
        stringBuilder.append(this.f14253h);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
