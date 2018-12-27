package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.adapters.p082a.C1736k;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p107r.C1958a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.i */
public class C3769i extends C1749m {
    /* renamed from: c */
    private final C1827c f15133c;
    /* renamed from: d */
    private final C1933t f15134d;
    /* renamed from: e */
    private C1736k f15135e;

    public C3769i(Context context, C1827c c1827c, C1958a c1958a, C1933t c1933t, C1750n c1750n) {
        super(context, c1750n, c1958a);
        this.f15133c = c1827c;
        this.f15134d = c1933t;
    }

    /* renamed from: a */
    public void m18882a(C1736k c1736k) {
        this.f15135e = c1736k;
    }

    /* renamed from: a */
    protected void mo1332a(Map<String, String> map) {
        if (this.f15135e != null && !TextUtils.isEmpty(this.f15135e.m6583g())) {
            map.put("touch", C1921k.m7293a(this.f15134d.m7321e()));
            this.f15133c.mo1355a(this.f15135e.m6583g(), map);
        }
    }
}
