package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.C2195e;
import com.google.android.exoplayer2.C2313q;
import com.google.android.exoplayer2.C2313q.C2311a;
import com.google.android.exoplayer2.extractor.C2262i;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.source.C2321d.C2320a;
import com.google.android.exoplayer2.upstream.C2364b;
import com.google.android.exoplayer2.upstream.C2368d.C2367a;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.b */
public final class C4036b implements C2321d, C2320a {
    /* renamed from: a */
    private final Uri f16247a;
    /* renamed from: b */
    private final C2367a f16248b;
    /* renamed from: c */
    private final C2262i f16249c;
    /* renamed from: d */
    private final int f16250d;
    /* renamed from: e */
    private final Handler f16251e;
    /* renamed from: f */
    private final C2319a f16252f;
    /* renamed from: g */
    private final C2311a f16253g;
    /* renamed from: h */
    private final String f16254h;
    /* renamed from: i */
    private C2320a f16255i;
    /* renamed from: j */
    private C2313q f16256j;
    /* renamed from: k */
    private boolean f16257k;

    /* renamed from: com.google.android.exoplayer2.source.b$a */
    public interface C2319a {
        /* renamed from: a */
        void m8473a(IOException iOException);
    }

    /* renamed from: a */
    public void mo1673a() {
    }

    public C4036b(Uri uri, C2367a c2367a, C2262i c2262i, Handler handler, C2319a c2319a) {
        this(uri, c2367a, c2262i, -1, handler, c2319a, null);
    }

    public C4036b(Uri uri, C2367a c2367a, C2262i c2262i, int i, Handler handler, C2319a c2319a, String str) {
        this.f16247a = uri;
        this.f16248b = c2367a;
        this.f16249c = c2262i;
        this.f16250d = i;
        this.f16251e = handler;
        this.f16252f = c2319a;
        this.f16254h = str;
        this.f16253g = new C2311a();
    }

    /* renamed from: a */
    public void mo1674a(C2195e c2195e, boolean z, C2320a c2320a) {
        this.f16255i = c2320a;
        this.f16256j = new C4039g(-9223372036854775807L, false);
        c2320a.mo1675a(this.f16256j, false);
    }

    /* renamed from: a */
    public C4038c mo1672a(int i, C2364b c2364b, long j) {
        C2163a.m7916a(i == 0);
        return new C4691a(this.f16247a, this.f16248b.mo1698a(), this.f16249c.mo1564a(), this.f16250d, this.f16251e, this.f16252f, this, c2364b, this.f16254h);
    }

    /* renamed from: a */
    public void mo1676a(C4038c c4038c) {
        ((C4691a) c4038c).m25870b();
    }

    /* renamed from: b */
    public void mo1677b() {
        this.f16255i = null;
    }

    /* renamed from: a */
    public void mo1675a(C2313q c2313q, Object obj) {
        boolean z = false;
        if (c2313q.m8463a(0, this.f16253g).m8455a() != -9223372036854775807L) {
            z = true;
        }
        if (this.f16257k == null || z) {
            this.f16256j = c2313q;
            this.f16257k = z;
            this.f16255i.mo1675a(this.f16256j, null);
        }
    }
}
