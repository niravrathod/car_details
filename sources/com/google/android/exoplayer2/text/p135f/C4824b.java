package com.google.android.exoplayer2.text.p135f;

import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4693b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.p135f.C4049e.C2352a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.text.f.b */
public final class C4824b extends C4693b {
    /* renamed from: a */
    private static final int f21221a = C2186s.m8062e("payl");
    /* renamed from: b */
    private static final int f21222b = C2186s.m8062e("sttg");
    /* renamed from: c */
    private static final int f21223c = C2186s.m8062e("vttc");
    /* renamed from: d */
    private final C2175k f21224d = new C2175k();
    /* renamed from: e */
    private final C2352a f21225e = new C2352a();

    /* renamed from: a */
    protected /* synthetic */ C2348d mo4689a(byte[] bArr, int i, boolean z) {
        return m28055b(bArr, i, z);
    }

    public C4824b() {
        super("Mp4WebvttDecoder");
    }

    /* renamed from: b */
    protected C4048c m28055b(byte[] bArr, int i, boolean z) {
        this.f21224d.m7974a(bArr, i);
        bArr = new ArrayList();
        while (this.f21224d.m7976b() > 0) {
            if (this.f21224d.m7976b() >= true) {
                i = this.f21224d.m7993n();
                if (this.f21224d.m7993n() == f21223c) {
                    bArr.add(C4824b.m28053a(this.f21224d, this.f21225e, i - 8));
                } else {
                    this.f21224d.m7981d(i - 8);
                }
            } else {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new C4048c(bArr);
    }

    /* renamed from: a */
    private static C2333a m28053a(C2175k c2175k, C2352a c2352a, int i) {
        c2352a.m8636a();
        while (i > 0) {
            if (i >= 8) {
                int n = c2175k.m7993n();
                int n2 = c2175k.m7993n();
                i -= 8;
                n -= 8;
                String str = new String(c2175k.f6735a, c2175k.m7980d(), n);
                c2175k.m7981d(n);
                i -= n;
                if (n2 == f21222b) {
                    C2355f.m8650a(str, c2352a);
                } else if (n2 == f21221a) {
                    C2355f.m8652a(null, str.trim(), c2352a, Collections.emptyList());
                }
            } else {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
        }
        return c2352a.m8640b();
    }
}
