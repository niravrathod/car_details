package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCodec.OnFrameRenderedListener;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C2190a;
import com.google.android.exoplayer2.drm.C3960c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.mediacodec.C2281a;
import com.google.android.exoplayer2.mediacodec.C2282b;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.p124a.C3946e;
import com.google.android.exoplayer2.p126c.C2170h;
import com.google.android.exoplayer2.p126c.C2184r;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.video.C2390e.C2389a;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.video.c */
public class C4863c extends MediaCodecRenderer {
    /* renamed from: c */
    private static final int[] f21567c = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    /* renamed from: A */
    private float f21568A;
    /* renamed from: B */
    private boolean f21569B;
    /* renamed from: C */
    private int f21570C;
    /* renamed from: b */
    C2379b f21571b;
    /* renamed from: d */
    private final C2381d f21572d;
    /* renamed from: e */
    private final C2389a f21573e;
    /* renamed from: f */
    private final long f21574f;
    /* renamed from: g */
    private final int f21575g;
    /* renamed from: h */
    private final boolean f21576h = C4863c.m28878K();
    /* renamed from: i */
    private Format[] f21577i;
    /* renamed from: j */
    private C2378a f21578j;
    /* renamed from: k */
    private Surface f21579k;
    /* renamed from: l */
    private int f21580l = 1;
    /* renamed from: m */
    private boolean f21581m;
    /* renamed from: n */
    private long f21582n = 1;
    /* renamed from: o */
    private long f21583o;
    /* renamed from: p */
    private int f21584p;
    /* renamed from: q */
    private int f21585q;
    /* renamed from: r */
    private int f21586r;
    /* renamed from: s */
    private float f21587s = -1.0f;
    /* renamed from: t */
    private int f21588t = -1;
    /* renamed from: u */
    private int f21589u = -1;
    /* renamed from: v */
    private int f21590v;
    /* renamed from: w */
    private float f21591w = -1.0f;
    /* renamed from: x */
    private int f21592x;
    /* renamed from: y */
    private int f21593y;
    /* renamed from: z */
    private int f21594z;

    /* renamed from: com.google.android.exoplayer2.video.c$a */
    protected static final class C2378a {
        /* renamed from: a */
        public final int f7546a;
        /* renamed from: b */
        public final int f7547b;
        /* renamed from: c */
        public final int f7548c;

        public C2378a(int i, int i2, int i3) {
            this.f7546a = i;
            this.f7547b = i2;
            this.f7548c = i3;
        }
    }

    @TargetApi(23)
    /* renamed from: com.google.android.exoplayer2.video.c$b */
    private final class C2379b implements OnFrameRenderedListener {
        /* renamed from: a */
        final /* synthetic */ C4863c f7549a;

        private C2379b(C4863c c4863c, MediaCodec mediaCodec) {
            this.f7549a = c4863c;
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (this == this.f7549a.f21571b) {
                this.f7549a.mo4927v();
            }
        }
    }

    /* renamed from: b */
    protected boolean mo4932b(long j, long j2) {
        return j < -30000;
    }

    public C4863c(Context context, C2282b c2282b, long j, C2190a<C3960c> c2190a, boolean z, Handler handler, C2390e c2390e, int i) {
        super(2, c2282b, c2190a, z);
        this.f21574f = j;
        this.f21575g = i;
        this.f21572d = new C2381d(context);
        this.f21573e = new C2389a(handler, c2390e);
        m28874G();
    }

    /* renamed from: a */
    protected int mo4919a(C2282b c2282b, Format format) {
        String str = format.f6489f;
        int i = 0;
        if (!C2170h.m7943b(str)) {
            return 0;
        }
        boolean z;
        DrmInitData drmInitData = format.f6492i;
        if (drmInitData != null) {
            z = false;
            for (int i2 = 0; i2 < drmInitData.f6775a; i2++) {
                z |= drmInitData.m8075a(i2).f6772c;
            }
        } else {
            z = false;
        }
        c2282b = c2282b.mo1641a(str, z);
        if (c2282b == null) {
            return 1;
        }
        boolean b = c2282b.m8395b(format.f6486c);
        if (b && format.f6493j > 0 && format.f6494k > 0) {
            if (C2186s.f6761a >= 21) {
                b = c2282b.m8392a(format.f6493j, format.f6494k, (double) format.f6495l);
            } else {
                b = format.f6493j * format.f6494k <= MediaCodecUtil.m8377b();
                if (!b) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("FalseCheck [legacyFrameSize, ");
                    stringBuilder.append(format.f6493j);
                    stringBuilder.append("x");
                    stringBuilder.append(format.f6494k);
                    stringBuilder.append("] [");
                    stringBuilder.append(C2186s.f6765e);
                    stringBuilder.append("]");
                    Log.d("MediaCodecVideoRenderer", stringBuilder.toString());
                }
            }
        }
        format = c2282b.f7238b != null ? 8 : 4;
        if (c2282b.f7239c != null) {
            i = 16;
        }
        return (b ? 3 : 2) | (format | i);
    }

    /* renamed from: a */
    protected void mo4675a(boolean z) {
        super.mo4675a(z);
        this.f21570C = m25744q().f7265b;
        this.f21569B = this.f21570C;
        this.f21573e.m8733a(this.a);
        this.f21572d.m8725a();
    }

    /* renamed from: a */
    protected void mo4681a(Format[] formatArr) {
        this.f21577i = formatArr;
        super.mo4681a(formatArr);
    }

    /* renamed from: a */
    protected void mo4674a(long j, boolean z) {
        super.mo4674a(j, z);
        m28895x();
        this.f21585q = 0;
        if (z) {
            m28894w();
        } else {
            this.f21582n = -9223372036854775807L;
        }
    }

    /* renamed from: t */
    public boolean mo4679t() {
        if ((this.f21581m || super.mo4929A()) && super.mo4679t()) {
            this.f21582n = -9223372036854775807L;
            return true;
        } else if (this.f21582n == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f21582n) {
                return true;
            }
            this.f21582n = -9223372036854775807L;
            return false;
        }
    }

    /* renamed from: n */
    protected void mo4676n() {
        super.mo4676n();
        this.f21584p = 0;
        this.f21583o = SystemClock.elapsedRealtime();
        this.f21582n = -9223372036854775807L;
    }

    /* renamed from: o */
    protected void mo4677o() {
        m28877J();
        super.mo4677o();
    }

    /* renamed from: p */
    protected void mo4678p() {
        this.f21588t = -1;
        this.f21589u = -1;
        this.f21591w = -1.0f;
        this.f21587s = -1.0f;
        m28874G();
        m28895x();
        this.f21572d.m8726b();
        this.f21571b = null;
        try {
            super.mo4678p();
        } finally {
            this.a.m7776a();
            this.f21573e.m8735b(this.a);
        }
    }

    /* renamed from: a */
    public void mo4030a(int i, Object obj) {
        if (i == 1) {
            m28886a((Surface) obj);
        } else if (i == 4) {
            this.f21580l = ((Integer) obj).intValue();
            i = m27939B();
            if (i != 0) {
                C4863c.m28892d(i, this.f21580l);
            }
        } else {
            super.mo4030a(i, obj);
        }
    }

    /* renamed from: a */
    private void m28886a(Surface surface) {
        if (this.f21579k != surface) {
            this.f21579k = surface;
            int d = mo4036d();
            if (d == 1 || d == 2) {
                MediaCodec B = m27939B();
                if (C2186s.f6761a < 23 || B == null || surface == null) {
                    m27940C();
                    m27964z();
                } else {
                    C4863c.m28884a(B, surface);
                }
            }
            if (surface != null) {
                m28876I();
                m28895x();
                if (d == 2) {
                    m28894w();
                    return;
                }
                return;
            }
            m28874G();
            m28895x();
        } else if (surface != null) {
            m28876I();
            m28873F();
        }
    }

    /* renamed from: A */
    protected boolean mo4929A() {
        return super.mo4929A() && this.f21579k != null && this.f21579k.isValid();
    }

    /* renamed from: a */
    protected void mo4922a(C2281a c2281a, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.f21578j = m28898a(c2281a, format, this.f21577i);
        mediaCodec.configure(C4863c.m28881a(format, this.f21578j, this.f21576h, this.f21570C), this.f21579k, mediaCrypto, 0);
        if (C2186s.f6761a >= 23 && this.f21569B != null) {
            this.f21571b = new C2379b(mediaCodec);
        }
    }

    /* renamed from: a */
    protected void mo4923a(String str, long j, long j2) {
        this.f21573e.m8734a(str, j, j2);
    }

    /* renamed from: b */
    protected void mo4926b(Format format) {
        super.mo4926b(format);
        this.f21573e.m8732a(format);
        this.f21587s = C4863c.m28891d(format);
        this.f21586r = C4863c.m28893e(format);
    }

    /* renamed from: a */
    protected void mo4930a(C3946e c3946e) {
        if (C2186s.f6761a < 23 && this.f21569B != null) {
            mo4927v();
        }
    }

    /* renamed from: a */
    protected void mo4921a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        Object obj = (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) ? 1 : null;
        if (obj != null) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f21588t = integer;
        if (obj != null) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.f21589u = integer2;
        this.f21591w = this.f21587s;
        if (C2186s.f6761a < 21) {
            this.f21590v = this.f21586r;
        } else if (this.f21586r == 90 || this.f21586r == 270) {
            mediaFormat = this.f21588t;
            this.f21588t = this.f21589u;
            this.f21589u = mediaFormat;
            this.f21591w = 1065353216 / this.f21591w;
        }
        C4863c.m28892d(mediaCodec, this.f21580l);
    }

    /* renamed from: a */
    protected boolean mo4931a(MediaCodec mediaCodec, boolean z, Format format, Format format2) {
        return (C4863c.m28887a(z, format, format2) == null || format2.f6493j > this.f21578j.f7546a || format2.f6494k > this.f21578j.f7547b || format2.f6490g > this.f21578j.f7548c) ? null : true;
    }

    /* renamed from: a */
    protected boolean mo4924a(long r19, long r21, android.media.MediaCodec r23, java.nio.ByteBuffer r24, int r25, int r26, long r27, boolean r29) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r18 = this;
        r0 = r18;
        r1 = r21;
        r3 = r23;
        r4 = r25;
        r5 = r27;
        r7 = 1;
        if (r29 == 0) goto L_0x0011;
    L_0x000d:
        r0.m28882a(r3, r4);
        return r7;
    L_0x0011:
        r8 = r0.f21581m;
        r9 = 21;
        if (r8 != 0) goto L_0x0027;
    L_0x0017:
        r1 = com.google.android.exoplayer2.p126c.C2186s.f6761a;
        if (r1 < r9) goto L_0x0023;
    L_0x001b:
        r1 = java.lang.System.nanoTime();
        r0.m28883a(r3, r4, r1);
        goto L_0x0026;
    L_0x0023:
        r0.m28890c(r3, r4);
    L_0x0026:
        return r7;
    L_0x0027:
        r8 = r18.mo4036d();
        r10 = 2;
        r11 = 0;
        if (r8 == r10) goto L_0x0030;
    L_0x002f:
        return r11;
    L_0x0030:
        r12 = android.os.SystemClock.elapsedRealtime();
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r12 = r12 * r14;
        r12 = r12 - r1;
        r16 = r5 - r19;
        r16 = r16 - r12;
        r12 = java.lang.System.nanoTime();
        r16 = r16 * r14;
        r9 = r12 + r16;
        r8 = r0.f21572d;
        r5 = r8.m8724a(r5, r9);
        r8 = r5 - r12;
        r8 = r8 / r14;
        r1 = r0.mo4932b(r8, r1);
        if (r1 == 0) goto L_0x0058;
    L_0x0054:
        r0.m28888b(r3, r4);
        return r7;
    L_0x0058:
        r1 = com.google.android.exoplayer2.p126c.C2186s.f6761a;
        r2 = 21;
        if (r1 < r2) goto L_0x0069;
    L_0x005e:
        r1 = 50000; // 0xc350 float:7.0065E-41 double:2.47033E-319;
        r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r10 >= 0) goto L_0x0088;
    L_0x0065:
        r0.m28883a(r3, r4, r5);
        return r7;
    L_0x0069:
        r1 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r5 >= 0) goto L_0x0088;
    L_0x006f:
        r1 = 11000; // 0x2af8 float:1.5414E-41 double:5.4347E-320;
        r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r5 <= 0) goto L_0x0084;
    L_0x0075:
        r1 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r8 = r8 - r1;
        r8 = r8 / r14;	 Catch:{ InterruptedException -> 0x007d }
        java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x007d }
        goto L_0x0084;
    L_0x007d:
        r1 = java.lang.Thread.currentThread();
        r1.interrupt();
    L_0x0084:
        r0.m28890c(r3, r4);
        return r7;
    L_0x0088:
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    /* renamed from: a */
    private void m28882a(MediaCodec mediaCodec, int i) {
        C2184r.m8036a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2184r.m8035a();
        mediaCodec = this.a;
        mediaCodec.f6527e++;
    }

    /* renamed from: b */
    private void m28888b(MediaCodec mediaCodec, int i) {
        C2184r.m8036a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C2184r.m8035a();
        mediaCodec = this.a;
        mediaCodec.f6528f++;
        this.f21584p++;
        this.f21585q++;
        this.a.f6529g = Math.max(this.f21585q, this.a.f6529g);
        if (this.f21584p == this.f21575g) {
            m28877J();
        }
    }

    /* renamed from: c */
    private void m28890c(MediaCodec mediaCodec, int i) {
        m28875H();
        C2184r.m8036a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C2184r.m8035a();
        mediaCodec = this.a;
        mediaCodec.f6526d++;
        this.f21585q = null;
        mo4927v();
    }

    @TargetApi(21)
    /* renamed from: a */
    private void m28883a(MediaCodec mediaCodec, int i, long j) {
        m28875H();
        C2184r.m8036a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        C2184r.m8035a();
        mediaCodec = this.a;
        mediaCodec.f6526d++;
        this.f21585q = null;
        mo4927v();
    }

    /* renamed from: w */
    private void m28894w() {
        this.f21582n = this.f21574f > 0 ? SystemClock.elapsedRealtime() + this.f21574f : -9223372036854775807L;
    }

    /* renamed from: x */
    private void m28895x() {
        this.f21581m = false;
        if (C2186s.f6761a >= 23 && this.f21569B) {
            MediaCodec B = m27939B();
            if (B != null) {
                this.f21571b = new C2379b(B);
            }
        }
    }

    /* renamed from: v */
    void mo4927v() {
        if (!this.f21581m) {
            this.f21581m = true;
            this.f21573e.m8731a(this.f21579k);
        }
    }

    /* renamed from: F */
    private void m28873F() {
        if (this.f21581m) {
            this.f21573e.m8731a(this.f21579k);
        }
    }

    /* renamed from: G */
    private void m28874G() {
        this.f21592x = -1;
        this.f21593y = -1;
        this.f21568A = -1.0f;
        this.f21594z = -1;
    }

    /* renamed from: H */
    private void m28875H() {
        if (this.f21592x != this.f21588t || this.f21593y != this.f21589u || this.f21594z != this.f21590v || this.f21568A != this.f21591w) {
            this.f21573e.m8729a(this.f21588t, this.f21589u, this.f21590v, this.f21591w);
            this.f21592x = this.f21588t;
            this.f21593y = this.f21589u;
            this.f21594z = this.f21590v;
            this.f21568A = this.f21591w;
        }
    }

    /* renamed from: I */
    private void m28876I() {
        if (this.f21592x != -1 || this.f21593y != -1) {
            this.f21573e.m8729a(this.f21588t, this.f21589u, this.f21590v, this.f21591w);
        }
    }

    /* renamed from: J */
    private void m28877J() {
        if (this.f21584p > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f21573e.m8730a(this.f21584p, elapsedRealtime - this.f21583o);
            this.f21584p = 0;
            this.f21583o = elapsedRealtime;
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    private static MediaFormat m28881a(Format format, C2378a c2378a, boolean z, int i) {
        MediaFormat b = format.m7758b();
        b.setInteger("max-width", c2378a.f7546a);
        b.setInteger("max-height", c2378a.f7547b);
        if (c2378a.f7548c != -1) {
            b.setInteger("max-input-size", c2378a.f7548c);
        }
        if (z) {
            b.setInteger("auto-frc", false);
        }
        if (i != 0) {
            C4863c.m28885a(b, i);
        }
        return b;
    }

    @TargetApi(23)
    /* renamed from: a */
    private static void m28884a(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m28885a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: a */
    protected C2378a m28898a(C2281a c2281a, Format format, Format[] formatArr) {
        int i = format.f6493j;
        int i2 = format.f6494k;
        int c = C4863c.m28889c(format);
        if (formatArr.length == 1) {
            return new C2378a(i, i2, c);
        }
        int i3 = i2;
        int i4 = c;
        i2 = 0;
        c = i;
        for (Format format2 : formatArr) {
            if (C4863c.m28887a(c2281a.f7238b, format, format2)) {
                int i5;
                if (format2.f6493j != -1) {
                    if (format2.f6494k != -1) {
                        i5 = 0;
                        i2 |= i5;
                        c = Math.max(c, format2.f6493j);
                        i3 = Math.max(i3, format2.f6494k);
                        i4 = Math.max(i4, C4863c.m28889c(format2));
                    }
                }
                i5 = 1;
                i2 |= i5;
                c = Math.max(c, format2.f6493j);
                i3 = Math.max(i3, format2.f6494k);
                i4 = Math.max(i4, C4863c.m28889c(format2));
            }
        }
        if (i2 != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Resolutions unknown. Codec max resolution: ");
            stringBuilder.append(c);
            stringBuilder.append("x");
            stringBuilder.append(i3);
            Log.w("MediaCodecVideoRenderer", stringBuilder.toString());
            c2281a = C4863c.m28880a(c2281a, format);
            if (c2281a != null) {
                c = Math.max(c, c2281a.x);
                i3 = Math.max(i3, c2281a.y);
                i4 = Math.max(i4, C4863c.m28879a(format.f6489f, c, i3));
                format = new StringBuilder();
                format.append("Codec max resolution adjusted to: ");
                format.append(c);
                format.append("x");
                format.append(i3);
                Log.w("MediaCodecVideoRenderer", format.toString());
            }
        }
        return new C2378a(c, i3, i4);
    }

    /* renamed from: a */
    private static Point m28880a(C2281a c2281a, Format format) {
        int i = 0;
        Object obj = format.f6494k > format.f6493j ? 1 : null;
        int i2 = obj != null ? format.f6494k : format.f6493j;
        int i3 = obj != null ? format.f6493j : format.f6494k;
        float f = ((float) i3) / ((float) i2);
        int[] iArr = f21567c;
        int length = iArr.length;
        while (i < length) {
            int i4 = iArr[i];
            int i5 = (int) (((float) i4) * f);
            if (i4 > i2) {
                if (i5 > i3) {
                    int i6;
                    if (C2186s.f6761a >= 21) {
                        i6 = obj != null ? i5 : i4;
                        if (obj == null) {
                            i4 = i5;
                        }
                        Point a = c2281a.m8390a(i6, i4);
                        if (c2281a.m8392a(a.x, a.y, (double) format.f6495l)) {
                            return a;
                        }
                    } else {
                        i4 = C2186s.m8040a(i4, 16) * 16;
                        i6 = C2186s.m8040a(i5, 16) * 16;
                        if (i4 * i6 <= MediaCodecUtil.m8377b()) {
                            format = obj != null ? i6 : i4;
                            if (obj != null) {
                                i6 = i4;
                            }
                            return new Point(format, i6);
                        }
                    }
                    i++;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    private static int m28889c(Format format) {
        if (format.f6490g != -1) {
            return format.f6490g;
        }
        return C4863c.m28879a(format.f6489f, format.f6493j, format.f6494k);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static int m28879a(java.lang.String r5, int r6, int r7) {
        /*
        r0 = -1;
        if (r6 == r0) goto L_0x007e;
    L_0x0003:
        if (r7 != r0) goto L_0x0007;
    L_0x0005:
        goto L_0x007e;
    L_0x0007:
        r1 = r5.hashCode();
        r2 = 3;
        r3 = 4;
        r4 = 2;
        switch(r1) {
            case -1664118616: goto L_0x0044;
            case -1662541442: goto L_0x003a;
            case 1187890754: goto L_0x0030;
            case 1331836730: goto L_0x0026;
            case 1599127256: goto L_0x001c;
            case 1599127257: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x004e;
    L_0x0012:
        r1 = "video/x-vnd.on2.vp9";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x001a:
        r5 = 5;
        goto L_0x004f;
    L_0x001c:
        r1 = "video/x-vnd.on2.vp8";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x0024:
        r5 = 3;
        goto L_0x004f;
    L_0x0026:
        r1 = "video/avc";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x002e:
        r5 = 2;
        goto L_0x004f;
    L_0x0030:
        r1 = "video/mp4v-es";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x0038:
        r5 = 1;
        goto L_0x004f;
    L_0x003a:
        r1 = "video/hevc";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x0042:
        r5 = 4;
        goto L_0x004f;
    L_0x0044:
        r1 = "video/3gpp";
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x004e;
    L_0x004c:
        r5 = 0;
        goto L_0x004f;
    L_0x004e:
        r5 = -1;
    L_0x004f:
        switch(r5) {
            case 0: goto L_0x0075;
            case 1: goto L_0x0075;
            case 2: goto L_0x0059;
            case 3: goto L_0x0056;
            case 4: goto L_0x0053;
            case 5: goto L_0x0053;
            default: goto L_0x0052;
        };
    L_0x0052:
        return r0;
    L_0x0053:
        r6 = r6 * r7;
        goto L_0x0078;
    L_0x0056:
        r6 = r6 * r7;
        goto L_0x0077;
    L_0x0059:
        r5 = "BRAVIA 4K 2015";
        r1 = com.google.android.exoplayer2.p126c.C2186s.f6764d;
        r5 = r5.equals(r1);
        if (r5 == 0) goto L_0x0064;
    L_0x0063:
        return r0;
    L_0x0064:
        r5 = 16;
        r6 = com.google.android.exoplayer2.p126c.C2186s.m8040a(r6, r5);
        r7 = com.google.android.exoplayer2.p126c.C2186s.m8040a(r7, r5);
        r6 = r6 * r7;
        r6 = r6 * 16;
        r6 = r6 * 16;
        goto L_0x0077;
    L_0x0075:
        r6 = r6 * r7;
    L_0x0077:
        r3 = 2;
    L_0x0078:
        r6 = r6 * 3;
        r3 = r3 * 2;
        r6 = r6 / r3;
        return r6;
    L_0x007e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.c.a(java.lang.String, int, int):int");
    }

    /* renamed from: d */
    private static void m28892d(MediaCodec mediaCodec, int i) {
        mediaCodec.setVideoScalingMode(i);
    }

    /* renamed from: K */
    private static boolean m28878K() {
        return C2186s.f6761a <= 22 && "foster".equals(C2186s.f6762b) && "NVIDIA".equals(C2186s.f6763c);
    }

    /* renamed from: a */
    private static boolean m28887a(boolean z, Format format, Format format2) {
        return format.f6489f.equals(format2.f6489f) && C4863c.m28893e(format) == C4863c.m28893e(format2) && (z || (format.f6493j == format2.f6493j && format.f6494k == format2.f6494k));
    }

    /* renamed from: d */
    private static float m28891d(Format format) {
        return format.f6497n == -1.0f ? 1.0f : format.f6497n;
    }

    /* renamed from: e */
    private static int m28893e(Format format) {
        return format.f6496m == -1 ? null : format.f6496m;
    }
}
