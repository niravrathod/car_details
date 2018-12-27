package com.google.android.exoplayer2.text.p135f;

import android.text.TextUtils;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4693b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.p135f.C4049e.C2352a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.g */
public final class C4825g extends C4693b {
    /* renamed from: a */
    private final C2355f f21226a = new C2355f();
    /* renamed from: b */
    private final C2175k f21227b = new C2175k();
    /* renamed from: c */
    private final C2352a f21228c = new C2352a();
    /* renamed from: d */
    private final C2349a f21229d = new C2349a();
    /* renamed from: e */
    private final List<C2350d> f21230e = new ArrayList();

    /* renamed from: a */
    protected /* synthetic */ C2348d mo4689a(byte[] bArr, int i, boolean z) {
        return m28059b(bArr, i, z);
    }

    public C4825g() {
        super("WebvttDecoder");
    }

    /* renamed from: b */
    protected C4050i m28059b(byte[] bArr, int i, boolean z) {
        this.f21227b.m7974a(bArr, i);
        this.f21228c.m8636a();
        this.f21230e.clear();
        C2356h.m8662a(this.f21227b);
        while (TextUtils.isEmpty(this.f21227b.m8004y()) == null) {
        }
        bArr = new ArrayList();
        while (true) {
            boolean a = C4825g.m28056a(this.f21227b);
            if (!a) {
                return new C4050i(bArr);
            }
            if (a) {
                C4825g.m28057b(this.f21227b);
            } else if (a) {
                if (bArr.isEmpty() != 0) {
                    this.f21227b.m8004y();
                    i = this.f21229d.m8605a(this.f21227b);
                    if (i != 0) {
                        this.f21230e.add(i);
                    }
                } else {
                    throw new SubtitleDecoderException("A style block was found after the first cue.");
                }
            } else if (a && this.f21226a.m8660a(this.f21227b, this.f21228c, this.f21230e) != 0) {
                bArr.add(this.f21228c.m8640b());
                this.f21228c.m8636a();
            }
        }
    }

    /* renamed from: a */
    private static int m28056a(C2175k c2175k) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = c2175k.m7980d();
            String y = c2175k.m8004y();
            i = y == null ? 0 : "STYLE".equals(y) ? 2 : "NOTE".startsWith(y) ? 1 : 3;
        }
        c2175k.m7979c(i2);
        return i;
    }

    /* renamed from: b */
    private static void m28057b(C2175k c2175k) {
        while (!TextUtils.isEmpty(c2175k.m8004y())) {
        }
    }
}
