package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.HttpDataSource.C2359c;
import com.google.android.exoplayer2.upstream.HttpDataSource.C4696a;

/* renamed from: com.google.android.exoplayer2.upstream.k */
public final class C4827k extends C4696a {
    /* renamed from: a */
    private final String f21244a;
    /* renamed from: b */
    private final C2371l<? super C2368d> f21245b;
    /* renamed from: c */
    private final int f21246c;
    /* renamed from: d */
    private final int f21247d;
    /* renamed from: e */
    private final boolean f21248e;

    /* renamed from: b */
    protected /* synthetic */ HttpDataSource mo4690b(C2359c c2359c) {
        return m28074a(c2359c);
    }

    public C4827k(String str, C2371l<? super C2368d> c2371l) {
        this(str, c2371l, 8000, 8000, false);
    }

    public C4827k(String str, C2371l<? super C2368d> c2371l, int i, int i2, boolean z) {
        this.f21244a = str;
        this.f21245b = c2371l;
        this.f21246c = i;
        this.f21247d = i2;
        this.f21248e = z;
    }

    /* renamed from: a */
    protected C4697j m28074a(C2359c c2359c) {
        return new C4697j(this.f21244a, null, this.f21245b, this.f21246c, this.f21247d, this.f21248e, c2359c);
    }
}
