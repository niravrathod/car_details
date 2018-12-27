package com.google.android.exoplayer2.text.p170e;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C2348d;
import com.google.android.exoplayer2.text.C4693b;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.e.a */
public final class C4823a extends C4693b {
    /* renamed from: a */
    private static final int f21212a = C2186s.m8062e("styl");
    /* renamed from: b */
    private static final int f21213b = C2186s.m8062e("tbox");
    /* renamed from: c */
    private final C2175k f21214c = new C2175k();
    /* renamed from: d */
    private boolean f21215d;
    /* renamed from: e */
    private int f21216e;
    /* renamed from: f */
    private int f21217f;
    /* renamed from: g */
    private String f21218g;
    /* renamed from: h */
    private float f21219h;
    /* renamed from: i */
    private int f21220i;

    public C4823a(List<byte[]> list) {
        super("Tx3gDecoder");
        m28049a((List) list);
    }

    /* renamed from: a */
    private void m28049a(List<byte[]> list) {
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f21216e = bArr[24];
            this.f21217f = ((((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16)) | ((bArr[28] & 255) << 8)) | (bArr[29] & 255);
            this.f21218g = "Serif".equals(new String(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            this.f21220i = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f21215d = z;
            if (this.f21215d) {
                this.f21219h = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.f21220i);
                this.f21219h = C2186s.m8039a(this.f21219h, 0.0f, 0.95f);
                return;
            }
            this.f21219h = 0.85f;
            return;
        }
        this.f21216e = 0;
        this.f21217f = -1;
        this.f21218g = "sans-serif";
        this.f21215d = false;
        this.f21219h = 0.85f;
    }

    /* renamed from: a */
    protected C2348d mo4689a(byte[] bArr, int i, boolean z) {
        this.f21214c.m7974a(bArr, i);
        bArr = C4823a.m28045a(this.f21214c);
        if (bArr.isEmpty() != 0) {
            return C4045b.f16274a;
        }
        i = new SpannableStringBuilder(bArr);
        SpannableStringBuilder spannableStringBuilder = i;
        C4823a.m28046a(spannableStringBuilder, this.f21216e, 0, 0, i.length(), 16711680);
        C4823a.m28051b(spannableStringBuilder, this.f21217f, -1, 0, i.length(), 16711680);
        C4823a.m28047a(spannableStringBuilder, this.f21218g, "sans-serif", 0, i.length(), 16711680);
        float f = this.f21219h;
        while (this.f21214c.m7976b() >= true) {
            bArr = this.f21214c.m7980d();
            z = this.f21214c.m7993n();
            int n = this.f21214c.m7993n();
            boolean z2 = false;
            boolean z3 = true;
            if (n == f21212a) {
                if (this.f21214c.m7976b() < 2) {
                    z3 = false;
                }
                C4823a.m28050a(z3);
                n = this.f21214c.m7987h();
                int i2;
                while (i2 < n) {
                    m28048a(this.f21214c, i);
                    i2++;
                }
            } else if (n == f21213b && this.f21215d) {
                if (this.f21214c.m7976b() >= 2) {
                    z2 = true;
                }
                C4823a.m28050a(z2);
                f = C2186s.m8039a(((float) this.f21214c.m7987h()) / ((float) this.f21220i), 0.0f, 0.95f);
            }
            this.f21214c.m7979c(bArr + z);
        }
        return new C4045b(new C2333a(i, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }

    /* renamed from: a */
    private static String m28045a(C2175k c2175k) {
        C4823a.m28050a(c2175k.m7976b() >= 2);
        int h = c2175k.m7987h();
        if (h == 0) {
            return "";
        }
        if (c2175k.m7976b() >= 2) {
            char f = c2175k.m7984f();
            if (f == '﻿' || f == '￾') {
                return c2175k.m7970a(h, Charset.forName("UTF-16"));
            }
        }
        return c2175k.m7970a(h, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    private void m28048a(C2175k c2175k, SpannableStringBuilder spannableStringBuilder) {
        C4823a.m28050a(c2175k.m7976b() >= 12);
        int h = c2175k.m7987h();
        int h2 = c2175k.m7987h();
        c2175k.m7981d(2);
        int g = c2175k.m7986g();
        c2175k.m7981d(1);
        c2175k = c2175k.m7993n();
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i = h;
        int i2 = h2;
        C4823a.m28046a(spannableStringBuilder2, g, this.f21216e, i, i2, 0);
        C4823a.m28051b(spannableStringBuilder2, c2175k, this.f21217f, i, i2, 0);
    }

    /* renamed from: a */
    private static void m28046a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            i2 = i5 | 33;
            int i6 = 1;
            i5 = (i & 1) != 0 ? 1 : 0;
            Object obj = (i & 2) != 0 ? 1 : null;
            if (i5 != 0) {
                if (obj != null) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i2);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i2);
                }
            } else if (obj != null) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i2);
            }
            if ((i & 4) == 0) {
                i6 = 0;
            }
            if (i6 != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i2);
            }
            if (i6 == 0 && i5 == 0 && obj == null) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i2);
            }
        }
    }

    /* renamed from: b */
    private static void m28051b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: a */
    private static void m28047a(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: a */
    private static void m28050a(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }
}
