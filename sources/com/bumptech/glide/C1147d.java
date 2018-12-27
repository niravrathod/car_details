package com.bumptech.glide;

import android.content.Context;
import android.support.v4.p017f.C3131a;
import com.bumptech.glide.load.engine.C3490i;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.engine.p060a.C3457f;
import com.bumptech.glide.load.engine.p060a.C3462j;
import com.bumptech.glide.load.engine.p060a.C3464k;
import com.bumptech.glide.load.engine.p061b.C1242a.C1240a;
import com.bumptech.glide.load.engine.p061b.C1248h;
import com.bumptech.glide.load.engine.p061b.C1251i;
import com.bumptech.glide.load.engine.p061b.C1251i.C1249a;
import com.bumptech.glide.load.engine.p061b.C3472g;
import com.bumptech.glide.load.engine.p061b.C4515f;
import com.bumptech.glide.load.engine.p062c.C1256a;
import com.bumptech.glide.p052c.C1134d;
import com.bumptech.glide.p052c.C1140l;
import com.bumptech.glide.p052c.C1140l.C1139a;
import com.bumptech.glide.p052c.C3361f;
import com.bumptech.glide.request.C1313e;
import java.util.Map;

/* renamed from: com.bumptech.glide.d */
public final class C1147d {
    /* renamed from: a */
    private final Map<Class<?>, C1181h<?, ?>> f3751a = new C3131a();
    /* renamed from: b */
    private C3490i f3752b;
    /* renamed from: c */
    private C1232e f3753c;
    /* renamed from: d */
    private C1230b f3754d;
    /* renamed from: e */
    private C1248h f3755e;
    /* renamed from: f */
    private C1256a f3756f;
    /* renamed from: g */
    private C1256a f3757g;
    /* renamed from: h */
    private C1240a f3758h;
    /* renamed from: i */
    private C1251i f3759i;
    /* renamed from: j */
    private C1134d f3760j;
    /* renamed from: k */
    private int f3761k = 4;
    /* renamed from: l */
    private C1313e f3762l = new C1313e();
    /* renamed from: m */
    private C1139a f3763m;
    /* renamed from: n */
    private C1256a f3764n;
    /* renamed from: o */
    private boolean f3765o;

    /* renamed from: a */
    void m4794a(C1139a c1139a) {
        this.f3763m = c1139a;
    }

    /* renamed from: a */
    C1143c m4793a(Context context) {
        if (this.f3756f == null) {
            this.f3756f = C1256a.m5093b();
        }
        if (this.f3757g == null) {
            this.f3757g = C1256a.m5090a();
        }
        if (this.f3764n == null) {
            this.f3764n = C1256a.m5096d();
        }
        if (this.f3759i == null) {
            this.f3759i = new C1249a(context).m5078a();
        }
        if (this.f3760j == null) {
            this.f3760j = new C3361f();
        }
        if (this.f3753c == null) {
            int b = this.f3759i.m5085b();
            if (b > 0) {
                this.f3753c = new C3464k((long) b);
            } else {
                this.f3753c = new C3457f();
            }
        }
        if (this.f3754d == null) {
            this.f3754d = new C3462j(this.f3759i.m5086c());
        }
        if (this.f3755e == null) {
            this.f3755e = new C3472g((long) this.f3759i.m5084a());
        }
        if (this.f3758h == null) {
            this.f3758h = new C4515f(context);
        }
        if (this.f3752b == null) {
            this.f3752b = new C3490i(this.f3755e, this.f3758h, this.f3757g, this.f3756f, C1256a.m5095c(), C1256a.m5096d(), this.f3765o);
        }
        return new C1143c(context, this.f3752b, this.f3755e, this.f3753c, this.f3754d, new C1140l(this.f3763m), this.f3760j, this.f3761k, this.f3762l.m5329h(), this.f3751a);
    }
}
