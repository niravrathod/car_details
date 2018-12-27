package com.facebook.ads.internal.view.component.p112a;

import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1731h;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.component.C2013a;
import com.facebook.ads.internal.view.component.C2020h;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.component.a.b */
public abstract class C2007b extends RelativeLayout {
    /* renamed from: a */
    static final int f6185a = ((int) (C1936w.f5934b * 16.0f));
    /* renamed from: b */
    static final int f6186b = ((int) (C1936w.f5934b * 28.0f));
    /* renamed from: c */
    private final C2020h f6187c;
    /* renamed from: d */
    private final C2013a f6188d;
    /* renamed from: e */
    private final C1827c f6189e;

    protected C2007b(C2011d c2011d, C1727d c1727d, boolean z) {
        super(c2011d.m7559a());
        this.f6189e = c2011d.m7560b();
        this.f6188d = new C2013a(c2011d.m7559a(), mo3981b(), mo1434c(), "com.facebook.ads.interstitial.clicked", c1727d, c2011d.m7560b(), c2011d.m7561c(), c2011d.m7563e(), c2011d.m7564f());
        C1936w.m7327a(this.f6188d);
        this.f6187c = new C2020h(getContext(), c1727d, z, mo3982i(), mo1436j());
        C1936w.m7327a(this.f6187c);
    }

    /* renamed from: a */
    public void mo1435a(C1731h c1731h, String str, double d) {
        C2020h c2020h = this.f6187c;
        String b = c1731h.m6551a().m6521b();
        String c = c1731h.m6551a().m6522c();
        boolean z = !mo1433a() && d > 0.0d && d < 1.0d;
        c2020h.m7580a(b, c, false, z);
        this.f6188d.m7577a(c1731h.m6552b(), str, new HashMap());
    }

    /* renamed from: a */
    public abstract boolean mo1433a();

    /* renamed from: b */
    protected boolean mo3981b() {
        return true;
    }

    /* renamed from: c */
    protected boolean mo1434c() {
        return true;
    }

    public C1827c getAdEventManager() {
        return this.f6189e;
    }

    protected C2013a getCtaButton() {
        return this.f6188d;
    }

    protected C2020h getTitleDescContainer() {
        return this.f6187c;
    }

    /* renamed from: i */
    protected boolean mo3982i() {
        return true;
    }

    /* renamed from: j */
    protected boolean mo1436j() {
        return true;
    }
}
