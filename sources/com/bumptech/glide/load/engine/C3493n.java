package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.p055g.C1178i;

/* renamed from: com.bumptech.glide.load.engine.n */
class C3493n<Z> implements C1277s<Z> {
    /* renamed from: a */
    private final boolean f14502a;
    /* renamed from: b */
    private final boolean f14503b;
    /* renamed from: c */
    private C1273a f14504c;
    /* renamed from: d */
    private C1216c f14505d;
    /* renamed from: e */
    private int f14506e;
    /* renamed from: f */
    private boolean f14507f;
    /* renamed from: g */
    private final C1277s<Z> f14508g;

    /* renamed from: com.bumptech.glide.load.engine.n$a */
    interface C1273a {
        /* renamed from: a */
        void mo1038a(C1216c c1216c, C3493n<?> c3493n);
    }

    C3493n(C1277s<Z> c1277s, boolean z, boolean z2) {
        this.f14508g = (C1277s) C1178i.m4880a((Object) c1277s);
        this.f14502a = z;
        this.f14503b = z2;
    }

    /* renamed from: a */
    void m17724a(C1216c c1216c, C1273a c1273a) {
        this.f14505d = c1216c;
        this.f14504c = c1273a;
    }

    /* renamed from: a */
    C1277s<Z> m17723a() {
        return this.f14508g;
    }

    /* renamed from: b */
    boolean m17725b() {
        return this.f14502a;
    }

    /* renamed from: c */
    public Class<Z> mo1045c() {
        return this.f14508g.mo1045c();
    }

    /* renamed from: d */
    public Z mo1046d() {
        return this.f14508g.mo1046d();
    }

    /* renamed from: e */
    public int mo1047e() {
        return this.f14508g.mo1047e();
    }

    /* renamed from: f */
    public void mo1048f() {
        if (this.f14506e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f14507f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f14507f = true;
            if (this.f14503b) {
                this.f14508g.mo1048f();
            }
        }
    }

    /* renamed from: g */
    void m17730g() {
        if (this.f14507f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f14506e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* renamed from: h */
    void m17731h() {
        if (this.f14506e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f14506e - 1;
            this.f14506e = i;
            if (i == 0) {
                this.f14504c.mo1038a(this.f14505d, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EngineResource{isCacheable=");
        stringBuilder.append(this.f14502a);
        stringBuilder.append(", listener=");
        stringBuilder.append(this.f14504c);
        stringBuilder.append(", key=");
        stringBuilder.append(this.f14505d);
        stringBuilder.append(", acquired=");
        stringBuilder.append(this.f14506e);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(this.f14507f);
        stringBuilder.append(", resource=");
        stringBuilder.append(this.f14508g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
