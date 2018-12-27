package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.upstream.h */
public final class C4055h implements C2368d {
    /* renamed from: a */
    private final C2368d f16319a;
    /* renamed from: b */
    private final C2368d f16320b;
    /* renamed from: c */
    private final C2368d f16321c;
    /* renamed from: d */
    private final C2368d f16322d;
    /* renamed from: e */
    private C2368d f16323e;

    public C4055h(Context context, C2371l<? super C2368d> c2371l, C2368d c2368d) {
        this.f16319a = (C2368d) C2163a.m7914a((Object) c2368d);
        this.f16320b = new FileDataSource(c2371l);
        this.f16321c = new AssetDataSource(context, c2371l);
        this.f16322d = new ContentDataSource(context, c2371l);
    }

    /* renamed from: a */
    public long mo1685a(C2369e c2369e) {
        C2163a.m7918b(this.f16323e == null);
        String scheme = c2369e.f7513a.getScheme();
        if (C2186s.m8051a(c2369e.f7513a)) {
            if (c2369e.f7513a.getPath().startsWith("/android_asset/")) {
                this.f16323e = this.f16321c;
            } else {
                this.f16323e = this.f16320b;
            }
        } else if ("asset".equals(scheme)) {
            this.f16323e = this.f16321c;
        } else if ("content".equals(scheme)) {
            this.f16323e = this.f16322d;
        } else {
            this.f16323e = this.f16319a;
        }
        return this.f16323e.mo1685a(c2369e);
    }

    /* renamed from: a */
    public int mo1684a(byte[] bArr, int i, int i2) {
        return this.f16323e.mo1684a(bArr, i, i2);
    }

    /* renamed from: a */
    public Uri mo1686a() {
        return this.f16323e == null ? null : this.f16323e.mo1686a();
    }

    /* renamed from: b */
    public void mo1687b() {
        if (this.f16323e != null) {
            try {
                this.f16323e.mo1687b();
            } finally {
                this.f16323e = null;
            }
        }
    }
}
