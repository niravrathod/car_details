package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.facebook.ads.internal.p107r.C1958a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.m */
public abstract class C1749m {
    /* renamed from: a */
    protected final C1750n f5287a;
    /* renamed from: b */
    protected final C1958a f5288b;
    /* renamed from: c */
    private final Context f5289c;
    /* renamed from: d */
    private boolean f5290d;

    public C1749m(Context context, C1750n c1750n, C1958a c1958a) {
        this.f5289c = context;
        this.f5287a = c1750n;
        this.f5288b = c1958a;
    }

    /* renamed from: a */
    public final void m6633a() {
        if (!this.f5290d) {
            if (this.f5287a != null) {
                this.f5287a.mo1339a();
            }
            Map hashMap = new HashMap();
            if (this.f5288b != null) {
                this.f5288b.m7419a(hashMap);
            }
            mo1332a(hashMap);
            this.f5290d = true;
            C1909d.m7258a(this.f5289c, "Impression logged");
            if (this.f5287a != null) {
                this.f5287a.mo1375b();
            }
        }
    }

    /* renamed from: a */
    protected abstract void mo1332a(Map<String, String> map);
}
