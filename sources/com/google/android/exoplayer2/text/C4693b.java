package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.p124a.C3946e;
import com.google.android.exoplayer2.p124a.C3947f;
import com.google.android.exoplayer2.p124a.C3948g;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.exoplayer2.text.b */
public abstract class C4693b extends C3948g<C4694g, C4695h, SubtitleDecoderException> implements C4046e {
    /* renamed from: a */
    private final String f19474a;

    /* renamed from: a */
    protected abstract C2348d mo4689a(byte[] bArr, int i, boolean z);

    /* renamed from: a */
    public void mo4068a(long j) {
    }

    /* renamed from: g */
    protected /* synthetic */ C3946e mo4071g() {
        return mo4073i();
    }

    /* renamed from: h */
    protected /* synthetic */ C3947f mo4072h() {
        return mo4074j();
    }

    protected C4693b(String str) {
        super(new C4694g[2], new C4695h[2]);
        this.f19474a = str;
        m19621a(1024);
    }

    /* renamed from: i */
    protected final C4694g mo4073i() {
        return new C4694g();
    }

    /* renamed from: j */
    protected final C4695h mo4074j() {
        return new C4821c(this);
    }

    /* renamed from: a */
    protected final void m25898a(C4695h c4695h) {
        super.mo4070a((C3947f) c4695h);
    }

    /* renamed from: a */
    protected final SubtitleDecoderException m25893a(C4694g c4694g, C4695h c4695h, boolean z) {
        try {
            ByteBuffer byteBuffer = c4694g.b;
            C4695h c4695h2 = c4695h;
            c4695h2.m25907a(c4694g.c, mo4689a(byteBuffer.array(), byteBuffer.limit(), z), c4694g.f19475d);
            c4695h.m7761c(Integer.MIN_VALUE);
            return null;
        } catch (C4694g c4694g2) {
            return c4694g2;
        }
    }
}
