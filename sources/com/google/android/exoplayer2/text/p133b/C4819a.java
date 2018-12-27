package com.google.android.exoplayer2.text.p133b;

import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4693b;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.a */
public final class C4819a extends C4693b {
    /* renamed from: a */
    private final C2342b f21202a;

    /* renamed from: a */
    protected /* synthetic */ C2348d mo4689a(byte[] bArr, int i, boolean z) {
        return m28028b(bArr, i, z);
    }

    public C4819a(List<byte[]> list) {
        super("DvbDecoder");
        C2175k c2175k = new C2175k((byte[]) list.get(0));
        this.f21202a = new C2342b(c2175k.m7987h(), c2175k.m7987h());
    }

    /* renamed from: b */
    protected C4042c m28028b(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f21202a.m8545a();
        }
        return new C4042c(this.f21202a.m8544a(bArr, i));
    }
}
