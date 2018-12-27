package com.google.android.exoplayer2.p124a;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.exoplayer2.p126c.C2186s;

/* renamed from: com.google.android.exoplayer2.a.b */
public final class C2126b {
    /* renamed from: a */
    public byte[] f6513a;
    /* renamed from: b */
    public byte[] f6514b;
    /* renamed from: c */
    public int f6515c;
    /* renamed from: d */
    public int[] f6516d;
    /* renamed from: e */
    public int[] f6517e;
    /* renamed from: f */
    public int f6518f;
    /* renamed from: g */
    public int f6519g;
    /* renamed from: h */
    public int f6520h;
    /* renamed from: i */
    private final CryptoInfo f6521i;
    /* renamed from: j */
    private final C2125a f6522j;

    @TargetApi(24)
    /* renamed from: com.google.android.exoplayer2.a.b$a */
    private static final class C2125a {
        /* renamed from: a */
        private final CryptoInfo f6511a;
        /* renamed from: b */
        private final Pattern f6512b;

        private C2125a(CryptoInfo cryptoInfo) {
            this.f6511a = cryptoInfo;
            this.f6512b = new Pattern(0, 0);
        }

        /* renamed from: a */
        private void m7765a(int i, int i2) {
            this.f6512b.set(i, i2);
            this.f6511a.setPattern(this.f6512b);
        }
    }

    public C2126b() {
        this.f6521i = C2186s.f6761a >= 16 ? m7767b() : null;
        this.f6522j = C2186s.f6761a >= 24 ? new C2125a(this.f6521i) : null;
    }

    /* renamed from: a */
    public void m7770a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f6518f = i;
        this.f6516d = iArr;
        this.f6517e = iArr2;
        this.f6514b = bArr;
        this.f6513a = bArr2;
        this.f6515c = i2;
        this.f6519g = 0;
        this.f6520h = 0;
        if (C2186s.f6761a >= 16) {
            m7768c();
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public CryptoInfo m7769a() {
        return this.f6521i;
    }

    @TargetApi(16)
    /* renamed from: b */
    private CryptoInfo m7767b() {
        return new CryptoInfo();
    }

    @TargetApi(16)
    /* renamed from: c */
    private void m7768c() {
        this.f6521i.numSubSamples = this.f6518f;
        this.f6521i.numBytesOfClearData = this.f6516d;
        this.f6521i.numBytesOfEncryptedData = this.f6517e;
        this.f6521i.key = this.f6514b;
        this.f6521i.iv = this.f6513a;
        this.f6521i.mode = this.f6515c;
        if (C2186s.f6761a >= 24) {
            this.f6522j.m7765a(this.f6519g, this.f6520h);
        }
    }
}
