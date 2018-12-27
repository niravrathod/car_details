package com.facebook.ads.internal.p083b;

import android.os.Bundle;
import com.facebook.ads.internal.p101q.p102a.C1926p;

/* renamed from: com.facebook.ads.internal.b.d */
public class C3793d implements C1926p<Bundle> {
    /* renamed from: a */
    private C1764c f15196a;
    /* renamed from: b */
    private final C1764c f15197b;
    /* renamed from: c */
    private final C1762b f15198c;
    /* renamed from: d */
    private boolean f15199d = false;
    /* renamed from: e */
    private boolean f15200e = false;
    /* renamed from: f */
    private boolean f15201f = false;

    public C3793d(C1762b c1762b) {
        this.f15198c = c1762b;
        this.f15197b = new C1764c(c1762b.f5314b);
        this.f15196a = new C1764c(c1762b.f5314b);
    }

    public C3793d(C1762b c1762b, Bundle bundle) {
        this.f15198c = c1762b;
        this.f15197b = (C1764c) bundle.getSerializable("testStats");
        this.f15196a = (C1764c) bundle.getSerializable("viewableStats");
        this.f15199d = bundle.getBoolean("ended");
        this.f15200e = bundle.getBoolean("passed");
        this.f15201f = bundle.getBoolean("complete");
    }

    /* renamed from: b */
    private void m18968b() {
        this.f15200e = true;
        m18969c();
    }

    /* renamed from: c */
    private void m18969c() {
        this.f15201f = true;
        m18970d();
    }

    /* renamed from: d */
    private void m18970d() {
        this.f15199d = true;
        this.f15198c.mo1342a(this.f15201f, this.f15200e, this.f15200e ? this.f15196a : this.f15197b);
    }

    /* renamed from: a */
    public void m18971a() {
        if (!this.f15199d) {
            this.f15196a.m6659b();
        }
    }

    /* renamed from: a */
    public void m18972a(double d, double d2) {
        if (!this.f15199d) {
            this.f15197b.m6658a(d, d2);
            this.f15196a.m6658a(d, d2);
            d = this.f15198c.f5317e ? this.f15196a.m6661c().m6656h() : this.f15196a.m6661c().m6655g();
            if (this.f15198c.f5315c < 0.0d || this.f15197b.m6661c().m6654f() <= this.f15198c.f5315c || d != 0.0d) {
                if (d >= this.f15198c.f5316d) {
                    m18968b();
                }
                return;
            }
            m18969c();
        }
    }

    /* renamed from: i */
    public Bundle mo1347i() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("viewableStats", this.f15196a);
        bundle.putSerializable("testStats", this.f15197b);
        bundle.putBoolean("ended", this.f15199d);
        bundle.putBoolean("passed", this.f15200e);
        bundle.putBoolean("complete", this.f15201f);
        return bundle;
    }
}
