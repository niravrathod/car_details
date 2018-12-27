package com.bumptech.glide.request;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C1218d;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.engine.C1265h;
import com.bumptech.glide.load.resource.bitmap.C4522m;
import com.bumptech.glide.load.resource.bitmap.C4780g;
import com.bumptech.glide.load.resource.bitmap.C4781h;
import com.bumptech.glide.load.resource.bitmap.C4782i;
import com.bumptech.glide.load.resource.bitmap.C4783o;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.p065d.C3536c;
import com.bumptech.glide.load.resource.p065d.C4526f;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import com.bumptech.glide.p055g.C4507b;
import com.bumptech.glide.p163f.C3369a;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;

/* renamed from: com.bumptech.glide.request.e */
public class C1313e implements Cloneable {
    /* renamed from: a */
    private int f4112a;
    /* renamed from: b */
    private float f4113b = 1.0f;
    /* renamed from: c */
    private C1265h f4114c = C1265h.f4012e;
    /* renamed from: d */
    private Priority f4115d = Priority.NORMAL;
    /* renamed from: e */
    private Drawable f4116e;
    /* renamed from: f */
    private int f4117f;
    /* renamed from: g */
    private Drawable f4118g;
    /* renamed from: h */
    private int f4119h;
    /* renamed from: i */
    private boolean f4120i = true;
    /* renamed from: j */
    private int f4121j = -1;
    /* renamed from: k */
    private int f4122k = -1;
    /* renamed from: l */
    private C1216c f4123l = C3369a.m17271a();
    /* renamed from: m */
    private boolean f4124m;
    /* renamed from: n */
    private boolean f4125n = true;
    /* renamed from: o */
    private Drawable f4126o;
    /* renamed from: p */
    private int f4127p;
    /* renamed from: q */
    private C3452e f4128q = new C3452e();
    /* renamed from: r */
    private Map<Class<?>, C3500h<?>> f4129r = new C4507b();
    /* renamed from: s */
    private Class<?> f4130s = Object.class;
    /* renamed from: t */
    private boolean f4131t;
    /* renamed from: u */
    private Theme f4132u;
    /* renamed from: v */
    private boolean f4133v;
    /* renamed from: w */
    private boolean f4134w;
    /* renamed from: x */
    private boolean f4135x;
    /* renamed from: y */
    private boolean f4136y = true;
    /* renamed from: z */
    private boolean f4137z;

    /* renamed from: b */
    private static boolean m5295b(int i, int i2) {
        return (i & i2) != 0;
    }

    public /* synthetic */ Object clone() {
        return m5305a();
    }

    /* renamed from: a */
    public static C1313e m5290a(C1265h c1265h) {
        return new C1313e().m5319b(c1265h);
    }

    /* renamed from: a */
    public static C1313e m5289a(C1216c c1216c) {
        return new C1313e().m5318b(c1216c);
    }

    /* renamed from: a */
    public static C1313e m5293a(Class<?> cls) {
        return new C1313e().m5321b((Class) cls);
    }

    /* renamed from: a */
    public C1313e m5306a(float f) {
        if (this.f4133v) {
            return m5305a().m5306a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f4113b = f;
        this.f4112a |= 2;
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5316a(boolean z) {
        if (this.f4133v) {
            return m5305a().m5316a(z);
        }
        this.f4137z = z;
        this.f4112a |= true;
        return m5288H();
    }

    /* renamed from: b */
    public C1313e m5319b(C1265h c1265h) {
        if (this.f4133v) {
            return m5305a().m5319b(c1265h);
        }
        this.f4114c = (C1265h) C1178i.m4880a((Object) c1265h);
        this.f4112a |= 4;
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5310a(Priority priority) {
        if (this.f4133v) {
            return m5305a().m5310a(priority);
        }
        this.f4115d = (Priority) C1178i.m4880a((Object) priority);
        this.f4112a |= 8;
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5309a(Drawable drawable) {
        if (this.f4133v) {
            return m5305a().m5309a(drawable);
        }
        this.f4118g = drawable;
        this.f4112a |= 64;
        this.f4119h = null;
        this.f4112a &= -129;
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5307a(int i) {
        if (this.f4133v) {
            return m5305a().m5307a(i);
        }
        this.f4119h = i;
        this.f4112a |= 128;
        this.f4118g = 0;
        this.f4112a &= -65;
        return m5288H();
    }

    /* renamed from: b */
    public C1313e m5317b(int i) {
        if (this.f4133v) {
            return m5305a().m5317b(i);
        }
        this.f4117f = i;
        this.f4112a |= 32;
        this.f4116e = 0;
        this.f4112a &= -17;
        return m5288H();
    }

    /* renamed from: b */
    public C1313e m5322b(boolean z) {
        if (this.f4133v) {
            return m5305a().m5322b(true);
        }
        this.f4120i = z ^ true;
        this.f4112a |= 256;
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5308a(int i, int i2) {
        if (this.f4133v) {
            return m5305a().m5308a(i, i2);
        }
        this.f4122k = i;
        this.f4121j = i2;
        this.f4112a |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return m5288H();
    }

    /* renamed from: b */
    public C1313e m5318b(C1216c c1216c) {
        if (this.f4133v) {
            return m5305a().m5318b(c1216c);
        }
        this.f4123l = (C1216c) C1178i.m4880a((Object) c1216c);
        this.f4112a |= 1024;
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5305a() {
        try {
            C1313e c1313e = (C1313e) super.clone();
            c1313e.f4128q = new C3452e();
            c1313e.f4128q.m17524a(this.f4128q);
            c1313e.f4129r = new C4507b();
            c1313e.f4129r.putAll(this.f4129r);
            c1313e.f4131t = false;
            c1313e.f4133v = false;
            return c1313e;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public <T> C1313e m5311a(C1218d<T> c1218d, T t) {
        if (this.f4133v) {
            return m5305a().m5311a((C1218d) c1218d, (Object) t);
        }
        C1178i.m4880a((Object) c1218d);
        C1178i.m4880a((Object) t);
        this.f4128q.m17522a(c1218d, t);
        return m5288H();
    }

    /* renamed from: b */
    public C1313e m5321b(Class<?> cls) {
        if (this.f4133v) {
            return m5305a().m5321b((Class) cls);
        }
        this.f4130s = (Class) C1178i.m4880a((Object) cls);
        this.f4112a |= 4096;
        return m5288H();
    }

    /* renamed from: b */
    public final boolean m5323b() {
        return this.f4125n;
    }

    /* renamed from: c */
    public final boolean m5324c() {
        return m5297c(2048);
    }

    /* renamed from: a */
    public C1313e m5313a(DownsampleStrategy downsampleStrategy) {
        return m5311a(DownsampleStrategy.f4043h, C1178i.m4880a((Object) downsampleStrategy));
    }

    /* renamed from: d */
    public C1313e m5325d() {
        return m5314a(DownsampleStrategy.f4037b, new C4780g());
    }

    /* renamed from: e */
    public C1313e m5326e() {
        return m5296c(DownsampleStrategy.f4036a, new C4783o());
    }

    /* renamed from: f */
    public C1313e m5327f() {
        return m5296c(DownsampleStrategy.f4040e, new C4781h());
    }

    /* renamed from: g */
    public C1313e m5328g() {
        return m5320b(DownsampleStrategy.f4040e, new C4782i());
    }

    /* renamed from: a */
    final C1313e m5314a(DownsampleStrategy downsampleStrategy, C3500h<Bitmap> c3500h) {
        if (this.f4133v) {
            return m5305a().m5314a(downsampleStrategy, (C3500h) c3500h);
        }
        m5313a(downsampleStrategy);
        return m5291a((C3500h) c3500h, (boolean) null);
    }

    /* renamed from: b */
    final C1313e m5320b(DownsampleStrategy downsampleStrategy, C3500h<Bitmap> c3500h) {
        if (this.f4133v) {
            return m5305a().m5320b(downsampleStrategy, (C3500h) c3500h);
        }
        m5313a(downsampleStrategy);
        return m5312a((C3500h) c3500h);
    }

    /* renamed from: c */
    private C1313e m5296c(DownsampleStrategy downsampleStrategy, C3500h<Bitmap> c3500h) {
        return m5292a(downsampleStrategy, (C3500h) c3500h, false);
    }

    /* renamed from: a */
    private C1313e m5292a(DownsampleStrategy downsampleStrategy, C3500h<Bitmap> c3500h, boolean z) {
        downsampleStrategy = z ? m5320b(downsampleStrategy, (C3500h) c3500h) : m5314a(downsampleStrategy, (C3500h) c3500h);
        downsampleStrategy.f4136y = true;
        return downsampleStrategy;
    }

    /* renamed from: a */
    public C1313e m5312a(C3500h<Bitmap> c3500h) {
        return m5291a((C3500h) c3500h, true);
    }

    /* renamed from: a */
    private C1313e m5291a(C3500h<Bitmap> c3500h, boolean z) {
        if (this.f4133v) {
            return m5305a().m5291a((C3500h) c3500h, z);
        }
        C3500h c4522m = new C4522m(c3500h, z);
        m5294a(Bitmap.class, (C3500h) c3500h, z);
        m5294a(Drawable.class, c4522m, z);
        m5294a(BitmapDrawable.class, c4522m.m24977a(), z);
        m5294a(C3536c.class, new C4526f(c3500h), z);
        return m5288H();
    }

    /* renamed from: a */
    private <T> C1313e m5294a(Class<T> cls, C3500h<T> c3500h, boolean z) {
        if (this.f4133v) {
            return m5305a().m5294a((Class) cls, (C3500h) c3500h, z);
        }
        C1178i.m4880a((Object) cls);
        C1178i.m4880a((Object) c3500h);
        this.f4129r.put(cls, c3500h);
        this.f4112a |= 2048;
        this.f4125n = true;
        this.f4112a |= 65536;
        this.f4136y = null;
        if (z) {
            this.f4112a |= true;
            this.f4124m = true;
        }
        return m5288H();
    }

    /* renamed from: a */
    public C1313e m5315a(C1313e c1313e) {
        if (this.f4133v) {
            return m5305a().m5315a(c1313e);
        }
        if (C1313e.m5295b(c1313e.f4112a, 2)) {
            this.f4113b = c1313e.f4113b;
        }
        if (C1313e.m5295b(c1313e.f4112a, 262144)) {
            this.f4134w = c1313e.f4134w;
        }
        if (C1313e.m5295b(c1313e.f4112a, 1048576)) {
            this.f4137z = c1313e.f4137z;
        }
        if (C1313e.m5295b(c1313e.f4112a, 4)) {
            this.f4114c = c1313e.f4114c;
        }
        if (C1313e.m5295b(c1313e.f4112a, 8)) {
            this.f4115d = c1313e.f4115d;
        }
        if (C1313e.m5295b(c1313e.f4112a, 16)) {
            this.f4116e = c1313e.f4116e;
            this.f4117f = 0;
            this.f4112a &= -33;
        }
        if (C1313e.m5295b(c1313e.f4112a, 32)) {
            this.f4117f = c1313e.f4117f;
            this.f4116e = null;
            this.f4112a &= -17;
        }
        if (C1313e.m5295b(c1313e.f4112a, 64)) {
            this.f4118g = c1313e.f4118g;
            this.f4119h = 0;
            this.f4112a &= -129;
        }
        if (C1313e.m5295b(c1313e.f4112a, 128)) {
            this.f4119h = c1313e.f4119h;
            this.f4118g = null;
            this.f4112a &= -65;
        }
        if (C1313e.m5295b(c1313e.f4112a, 256)) {
            this.f4120i = c1313e.f4120i;
        }
        if (C1313e.m5295b(c1313e.f4112a, (int) AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f4122k = c1313e.f4122k;
            this.f4121j = c1313e.f4121j;
        }
        if (C1313e.m5295b(c1313e.f4112a, 1024)) {
            this.f4123l = c1313e.f4123l;
        }
        if (C1313e.m5295b(c1313e.f4112a, 4096)) {
            this.f4130s = c1313e.f4130s;
        }
        if (C1313e.m5295b(c1313e.f4112a, 8192)) {
            this.f4126o = c1313e.f4126o;
            this.f4127p = 0;
            this.f4112a &= -16385;
        }
        if (C1313e.m5295b(c1313e.f4112a, 16384)) {
            this.f4127p = c1313e.f4127p;
            this.f4126o = null;
            this.f4112a &= -8193;
        }
        if (C1313e.m5295b(c1313e.f4112a, 32768)) {
            this.f4132u = c1313e.f4132u;
        }
        if (C1313e.m5295b(c1313e.f4112a, 65536)) {
            this.f4125n = c1313e.f4125n;
        }
        if (C1313e.m5295b(c1313e.f4112a, 131072)) {
            this.f4124m = c1313e.f4124m;
        }
        if (C1313e.m5295b(c1313e.f4112a, 2048)) {
            this.f4129r.putAll(c1313e.f4129r);
            this.f4136y = c1313e.f4136y;
        }
        if (C1313e.m5295b(c1313e.f4112a, 524288)) {
            this.f4135x = c1313e.f4135x;
        }
        if (!this.f4125n) {
            this.f4129r.clear();
            this.f4112a &= -2049;
            this.f4124m = false;
            this.f4112a &= -131073;
            this.f4136y = true;
        }
        this.f4112a |= c1313e.f4112a;
        this.f4128q.m17524a(c1313e.f4128q);
        return m5288H();
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C1313e)) {
            return false;
        }
        C1313e c1313e = (C1313e) obj;
        if (Float.compare(c1313e.f4113b, this.f4113b) == 0 && this.f4117f == c1313e.f4117f && C1180j.m4898a(this.f4116e, c1313e.f4116e) && this.f4119h == c1313e.f4119h && C1180j.m4898a(this.f4118g, c1313e.f4118g) && this.f4127p == c1313e.f4127p && C1180j.m4898a(this.f4126o, c1313e.f4126o) && this.f4120i == c1313e.f4120i && this.f4121j == c1313e.f4121j && this.f4122k == c1313e.f4122k && this.f4124m == c1313e.f4124m && this.f4125n == c1313e.f4125n && this.f4134w == c1313e.f4134w && this.f4135x == c1313e.f4135x && this.f4114c.equals(c1313e.f4114c) && this.f4115d == c1313e.f4115d && this.f4128q.equals(c1313e.f4128q) && this.f4129r.equals(c1313e.f4129r) && this.f4130s.equals(c1313e.f4130s) && C1180j.m4898a(this.f4123l, c1313e.f4123l) && C1180j.m4898a(this.f4132u, c1313e.f4132u) != null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return C1180j.m4890a(this.f4132u, C1180j.m4890a(this.f4123l, C1180j.m4890a(this.f4130s, C1180j.m4890a(this.f4129r, C1180j.m4890a(this.f4128q, C1180j.m4890a(this.f4115d, C1180j.m4890a(this.f4114c, C1180j.m4891a(this.f4135x, C1180j.m4891a(this.f4134w, C1180j.m4891a(this.f4125n, C1180j.m4891a(this.f4124m, C1180j.m4900b(this.f4122k, C1180j.m4900b(this.f4121j, C1180j.m4891a(this.f4120i, C1180j.m4890a(this.f4126o, C1180j.m4900b(this.f4127p, C1180j.m4890a(this.f4118g, C1180j.m4900b(this.f4119h, C1180j.m4890a(this.f4116e, C1180j.m4900b(this.f4117f, C1180j.m4885a(this.f4113b)))))))))))))))))))));
    }

    /* renamed from: h */
    public C1313e m5329h() {
        this.f4131t = true;
        return this;
    }

    /* renamed from: i */
    public C1313e m5330i() {
        if (this.f4131t) {
            if (!this.f4133v) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
        }
        this.f4133v = true;
        return m5329h();
    }

    /* renamed from: H */
    private C1313e m5288H() {
        if (!this.f4131t) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    /* renamed from: j */
    public final Map<Class<?>, C3500h<?>> m5331j() {
        return this.f4129r;
    }

    /* renamed from: k */
    public final boolean m5332k() {
        return this.f4124m;
    }

    /* renamed from: l */
    public final C3452e m5333l() {
        return this.f4128q;
    }

    /* renamed from: m */
    public final Class<?> m5334m() {
        return this.f4130s;
    }

    /* renamed from: n */
    public final C1265h m5335n() {
        return this.f4114c;
    }

    /* renamed from: o */
    public final Drawable m5336o() {
        return this.f4116e;
    }

    /* renamed from: p */
    public final int m5337p() {
        return this.f4117f;
    }

    /* renamed from: q */
    public final int m5338q() {
        return this.f4119h;
    }

    /* renamed from: r */
    public final Drawable m5339r() {
        return this.f4118g;
    }

    /* renamed from: s */
    public final int m5340s() {
        return this.f4127p;
    }

    /* renamed from: t */
    public final Drawable m5341t() {
        return this.f4126o;
    }

    /* renamed from: u */
    public final Theme m5342u() {
        return this.f4132u;
    }

    /* renamed from: v */
    public final boolean m5343v() {
        return this.f4120i;
    }

    /* renamed from: w */
    public final C1216c m5344w() {
        return this.f4123l;
    }

    /* renamed from: x */
    public final boolean m5345x() {
        return m5297c(8);
    }

    /* renamed from: y */
    public final Priority m5346y() {
        return this.f4115d;
    }

    /* renamed from: z */
    public final int m5347z() {
        return this.f4122k;
    }

    /* renamed from: A */
    public final boolean m5298A() {
        return C1180j.m4897a(this.f4122k, this.f4121j);
    }

    /* renamed from: B */
    public final int m5299B() {
        return this.f4121j;
    }

    /* renamed from: C */
    public final float m5300C() {
        return this.f4113b;
    }

    /* renamed from: D */
    boolean m5301D() {
        return this.f4136y;
    }

    /* renamed from: c */
    private boolean m5297c(int i) {
        return C1313e.m5295b(this.f4112a, i);
    }

    /* renamed from: E */
    public final boolean m5302E() {
        return this.f4134w;
    }

    /* renamed from: F */
    public final boolean m5303F() {
        return this.f4137z;
    }

    /* renamed from: G */
    public final boolean m5304G() {
        return this.f4135x;
    }
}
