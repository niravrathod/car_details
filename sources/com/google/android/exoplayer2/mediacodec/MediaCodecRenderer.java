package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C2274i;
import com.google.android.exoplayer2.C4682a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C2190a;
import com.google.android.exoplayer2.drm.C3960c;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.p124a.C2128d;
import com.google.android.exoplayer2.p124a.C3946e;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2173i;
import com.google.android.exoplayer2.p126c.C2184r;
import com.google.android.exoplayer2.p126c.C2186s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@TargetApi(16)
public abstract class MediaCodecRenderer extends C4682a {
    /* renamed from: b */
    private static final byte[] f21123b = C2186s.m8063f("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    /* renamed from: A */
    private long f21124A;
    /* renamed from: B */
    private int f21125B;
    /* renamed from: C */
    private int f21126C;
    /* renamed from: D */
    private boolean f21127D;
    /* renamed from: E */
    private boolean f21128E;
    /* renamed from: F */
    private int f21129F;
    /* renamed from: G */
    private int f21130G;
    /* renamed from: H */
    private boolean f21131H;
    /* renamed from: I */
    private boolean f21132I;
    /* renamed from: J */
    private boolean f21133J;
    /* renamed from: K */
    private boolean f21134K;
    /* renamed from: L */
    private boolean f21135L;
    /* renamed from: M */
    private boolean f21136M;
    /* renamed from: a */
    protected C2128d f21137a;
    /* renamed from: c */
    private final C2282b f21138c;
    /* renamed from: d */
    private final C2190a<C3960c> f21139d;
    /* renamed from: e */
    private final boolean f21140e;
    /* renamed from: f */
    private final C3946e f21141f;
    /* renamed from: g */
    private final C3946e f21142g;
    /* renamed from: h */
    private final C2274i f21143h;
    /* renamed from: i */
    private final List<Long> f21144i;
    /* renamed from: j */
    private final BufferInfo f21145j;
    /* renamed from: k */
    private Format f21146k;
    /* renamed from: l */
    private MediaCodec f21147l;
    /* renamed from: m */
    private DrmSession<C3960c> f21148m;
    /* renamed from: n */
    private DrmSession<C3960c> f21149n;
    /* renamed from: o */
    private boolean f21150o;
    /* renamed from: p */
    private boolean f21151p;
    /* renamed from: q */
    private boolean f21152q;
    /* renamed from: r */
    private boolean f21153r;
    /* renamed from: s */
    private boolean f21154s;
    /* renamed from: t */
    private boolean f21155t;
    /* renamed from: u */
    private boolean f21156u;
    /* renamed from: v */
    private boolean f21157v;
    /* renamed from: w */
    private boolean f21158w;
    /* renamed from: x */
    private boolean f21159x;
    /* renamed from: y */
    private ByteBuffer[] f21160y;
    /* renamed from: z */
    private ByteBuffer[] f21161z;

    public static class DecoderInitializationException extends Exception {
        public final String decoderName;
        public final String diagnosticInfo;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder init failed: [");
            stringBuilder.append(i);
            stringBuilder.append("], ");
            stringBuilder.append(format);
            super(stringBuilder.toString(), th);
            this.mimeType = format.f6489f;
            this.secureDecoderRequired = z;
            this.decoderName = null;
            this.diagnosticInfo = m8364a(i);
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Decoder init failed: ");
            stringBuilder.append(str);
            stringBuilder.append(", ");
            stringBuilder.append(format);
            super(stringBuilder.toString(), th);
            this.mimeType = format.f6489f;
            this.secureDecoderRequired = z;
            this.decoderName = str;
            this.diagnosticInfo = C2186s.f6761a >= true ? m8365a(th) : null;
        }

        @TargetApi(21)
        /* renamed from: a */
        private static String m8365a(Throwable th) {
            return th instanceof CodecException ? ((CodecException) th).getDiagnosticInfo() : null;
        }

        /* renamed from: a */
        private static String m8364a(int i) {
            String str = i < 0 ? "neg_" : "";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            stringBuilder.append(str);
            stringBuilder.append(Math.abs(i));
            return stringBuilder.toString();
        }
    }

    /* renamed from: E */
    protected long m27942E() {
        return 0;
    }

    /* renamed from: a */
    protected abstract int mo4919a(C2282b c2282b, Format format);

    /* renamed from: a */
    protected void mo4921a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* renamed from: a */
    protected void mo4930a(C3946e c3946e) {
    }

    /* renamed from: a */
    protected abstract void mo4922a(C2281a c2281a, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto);

    /* renamed from: a */
    protected void mo4923a(String str, long j, long j2) {
    }

    /* renamed from: a */
    protected abstract boolean mo4924a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* renamed from: a */
    protected boolean mo4931a(MediaCodec mediaCodec, boolean z, Format format, Format format2) {
        return false;
    }

    /* renamed from: c */
    protected void m27956c(long j) {
    }

    /* renamed from: m */
    public final int mo4045m() {
        return 4;
    }

    /* renamed from: n */
    protected void mo4676n() {
    }

    /* renamed from: o */
    protected void mo4677o() {
    }

    /* renamed from: y */
    protected void mo4928y() {
    }

    public MediaCodecRenderer(int i, C2282b c2282b, C2190a<C3960c> c2190a, boolean z) {
        super(i);
        C2163a.m7918b(C2186s.f6761a >= 16 ? 1 : 0);
        this.f21138c = (C2282b) C2163a.m7914a((Object) c2282b);
        this.f21139d = c2190a;
        this.f21140e = z;
        this.f21141f = new C3946e(0);
        this.f21142g = C3946e.m19604e();
        this.f21143h = new C2274i();
        this.f21144i = new ArrayList();
        this.f21145j = new BufferInfo();
        this.f21129F = 0;
        this.f21130G = 0;
    }

    /* renamed from: a */
    public final int mo4672a(Format format) {
        try {
            return mo4919a(this.f21138c, format);
        } catch (Format format2) {
            throw ExoPlaybackException.m7732a(format2, m25745r());
        }
    }

    /* renamed from: a */
    protected C2281a mo4920a(C2282b c2282b, Format format, boolean z) {
        return c2282b.mo1641a(format.f6489f, z);
    }

    /* renamed from: z */
    protected final void m27964z() {
        boolean a;
        Throwable e;
        if (mo4929A()) {
            MediaCrypto a2;
            this.f21148m = this.f21149n;
            String str = this.f21146k.f6489f;
            if (this.f21148m != null) {
                int a3 = this.f21148m.m8076a();
                if (a3 != 0) {
                    if (a3 != 3) {
                        if (a3 != 4) {
                            return;
                        }
                    }
                    a2 = ((C3960c) this.f21148m.m8078b()).m19712a();
                    a = this.f21148m.m8077a(str);
                } else {
                    throw ExoPlaybackException.m7732a(this.f21148m.m8079c(), m25745r());
                }
            }
            a2 = null;
            a = false;
            C2281a a4;
            long elapsedRealtime;
            StringBuilder stringBuilder;
            long elapsedRealtime2;
            C2128d c2128d;
            try {
                C2281a a5 = mo4920a(this.f21138c, this.f21146k, a);
                if (a5 == null && a) {
                    try {
                        a4 = mo4920a(this.f21138c, this.f21146k, false);
                        if (a4 != null) {
                            try {
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append("Drm session requires secure decoder for ");
                                stringBuilder2.append(str);
                                stringBuilder2.append(", but ");
                                stringBuilder2.append("no secure decoder available. Trying to proceed with ");
                                stringBuilder2.append(a4.f7237a);
                                stringBuilder2.append(".");
                                Log.w("MediaCodecRenderer", stringBuilder2.toString());
                            } catch (DecoderQueryException e2) {
                                e = e2;
                                m27924a(new DecoderInitializationException(this.f21146k, e, a, -49998));
                                if (a4 == null) {
                                    m27924a(new DecoderInitializationException(this.f21146k, null, a, -49999));
                                }
                                str = a4.f7237a;
                                this.f21150o = a4.f7238b;
                                this.f21151p = m27926a(str, this.f21146k);
                                this.f21152q = mo4925a(str);
                                this.f21153r = m27928b(str);
                                this.f21154s = m27931c(str);
                                this.f21155t = m27933d(str);
                                this.f21156u = m27934e(str);
                                this.f21157v = m27929b(str, this.f21146k);
                                elapsedRealtime = SystemClock.elapsedRealtime();
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("createCodec:");
                                stringBuilder.append(str);
                                C2184r.m8036a(stringBuilder.toString());
                                this.f21147l = MediaCodec.createByCodecName(str);
                                C2184r.m8035a();
                                C2184r.m8036a("configureCodec");
                                mo4922a(a4, this.f21147l, this.f21146k, a2);
                                C2184r.m8035a();
                                C2184r.m8036a("startCodec");
                                this.f21147l.start();
                                C2184r.m8035a();
                                elapsedRealtime2 = SystemClock.elapsedRealtime();
                                mo4923a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                                this.f21160y = this.f21147l.getInputBuffers();
                                this.f21161z = this.f21147l.getOutputBuffers();
                                if (mo4036d() == 2) {
                                }
                                this.f21124A = mo4036d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                                this.f21125B = -1;
                                this.f21126C = -1;
                                this.f21136M = true;
                                c2128d = this.f21137a;
                                c2128d.f6523a++;
                            }
                        }
                    } catch (DecoderQueryException e3) {
                        e = e3;
                        a4 = a5;
                        m27924a(new DecoderInitializationException(this.f21146k, e, a, -49998));
                        if (a4 == null) {
                            m27924a(new DecoderInitializationException(this.f21146k, null, a, -49999));
                        }
                        str = a4.f7237a;
                        this.f21150o = a4.f7238b;
                        this.f21151p = m27926a(str, this.f21146k);
                        this.f21152q = mo4925a(str);
                        this.f21153r = m27928b(str);
                        this.f21154s = m27931c(str);
                        this.f21155t = m27933d(str);
                        this.f21156u = m27934e(str);
                        this.f21157v = m27929b(str, this.f21146k);
                        elapsedRealtime = SystemClock.elapsedRealtime();
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("createCodec:");
                        stringBuilder.append(str);
                        C2184r.m8036a(stringBuilder.toString());
                        this.f21147l = MediaCodec.createByCodecName(str);
                        C2184r.m8035a();
                        C2184r.m8036a("configureCodec");
                        mo4922a(a4, this.f21147l, this.f21146k, a2);
                        C2184r.m8035a();
                        C2184r.m8036a("startCodec");
                        this.f21147l.start();
                        C2184r.m8035a();
                        elapsedRealtime2 = SystemClock.elapsedRealtime();
                        mo4923a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                        this.f21160y = this.f21147l.getInputBuffers();
                        this.f21161z = this.f21147l.getOutputBuffers();
                        if (mo4036d() == 2) {
                        }
                        this.f21124A = mo4036d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                        this.f21125B = -1;
                        this.f21126C = -1;
                        this.f21136M = true;
                        c2128d = this.f21137a;
                        c2128d.f6523a++;
                    }
                    if (a4 == null) {
                        m27924a(new DecoderInitializationException(this.f21146k, null, a, -49999));
                    }
                    str = a4.f7237a;
                    this.f21150o = a4.f7238b;
                    this.f21151p = m27926a(str, this.f21146k);
                    this.f21152q = mo4925a(str);
                    this.f21153r = m27928b(str);
                    this.f21154s = m27931c(str);
                    this.f21155t = m27933d(str);
                    this.f21156u = m27934e(str);
                    this.f21157v = m27929b(str, this.f21146k);
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("createCodec:");
                    stringBuilder.append(str);
                    C2184r.m8036a(stringBuilder.toString());
                    this.f21147l = MediaCodec.createByCodecName(str);
                    C2184r.m8035a();
                    C2184r.m8036a("configureCodec");
                    mo4922a(a4, this.f21147l, this.f21146k, a2);
                    C2184r.m8035a();
                    C2184r.m8036a("startCodec");
                    this.f21147l.start();
                    C2184r.m8035a();
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    mo4923a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.f21160y = this.f21147l.getInputBuffers();
                    this.f21161z = this.f21147l.getOutputBuffers();
                    if (mo4036d() == 2) {
                    }
                    this.f21124A = mo4036d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.f21125B = -1;
                    this.f21126C = -1;
                    this.f21136M = true;
                    c2128d = this.f21137a;
                    c2128d.f6523a++;
                }
                a4 = a5;
                if (a4 == null) {
                    m27924a(new DecoderInitializationException(this.f21146k, null, a, -49999));
                }
                str = a4.f7237a;
                this.f21150o = a4.f7238b;
                this.f21151p = m27926a(str, this.f21146k);
                this.f21152q = mo4925a(str);
                this.f21153r = m27928b(str);
                this.f21154s = m27931c(str);
                this.f21155t = m27933d(str);
                this.f21156u = m27934e(str);
                this.f21157v = m27929b(str, this.f21146k);
                try {
                    elapsedRealtime = SystemClock.elapsedRealtime();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("createCodec:");
                    stringBuilder.append(str);
                    C2184r.m8036a(stringBuilder.toString());
                    this.f21147l = MediaCodec.createByCodecName(str);
                    C2184r.m8035a();
                    C2184r.m8036a("configureCodec");
                    mo4922a(a4, this.f21147l, this.f21146k, a2);
                    C2184r.m8035a();
                    C2184r.m8036a("startCodec");
                    this.f21147l.start();
                    C2184r.m8035a();
                    elapsedRealtime2 = SystemClock.elapsedRealtime();
                    mo4923a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.f21160y = this.f21147l.getInputBuffers();
                    this.f21161z = this.f21147l.getOutputBuffers();
                } catch (Throwable e4) {
                    m27924a(new DecoderInitializationException(this.f21146k, e4, a, str));
                }
                this.f21124A = mo4036d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.f21125B = -1;
                this.f21126C = -1;
                this.f21136M = true;
                c2128d = this.f21137a;
                c2128d.f6523a++;
            } catch (DecoderQueryException e5) {
                e = e5;
                a4 = null;
                m27924a(new DecoderInitializationException(this.f21146k, e, a, -49998));
                if (a4 == null) {
                    m27924a(new DecoderInitializationException(this.f21146k, null, a, -49999));
                }
                str = a4.f7237a;
                this.f21150o = a4.f7238b;
                this.f21151p = m27926a(str, this.f21146k);
                this.f21152q = mo4925a(str);
                this.f21153r = m27928b(str);
                this.f21154s = m27931c(str);
                this.f21155t = m27933d(str);
                this.f21156u = m27934e(str);
                this.f21157v = m27929b(str, this.f21146k);
                elapsedRealtime = SystemClock.elapsedRealtime();
                stringBuilder = new StringBuilder();
                stringBuilder.append("createCodec:");
                stringBuilder.append(str);
                C2184r.m8036a(stringBuilder.toString());
                this.f21147l = MediaCodec.createByCodecName(str);
                C2184r.m8035a();
                C2184r.m8036a("configureCodec");
                mo4922a(a4, this.f21147l, this.f21146k, a2);
                C2184r.m8035a();
                C2184r.m8036a("startCodec");
                this.f21147l.start();
                C2184r.m8035a();
                elapsedRealtime2 = SystemClock.elapsedRealtime();
                mo4923a(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                this.f21160y = this.f21147l.getInputBuffers();
                this.f21161z = this.f21147l.getOutputBuffers();
                if (mo4036d() == 2) {
                }
                this.f21124A = mo4036d() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                this.f21125B = -1;
                this.f21126C = -1;
                this.f21136M = true;
                c2128d = this.f21137a;
                c2128d.f6523a++;
            }
        }
    }

    /* renamed from: a */
    private void m27924a(DecoderInitializationException decoderInitializationException) {
        throw ExoPlaybackException.m7732a(decoderInitializationException, m25745r());
    }

    /* renamed from: A */
    protected boolean mo4929A() {
        return this.f21147l == null && this.f21146k != null;
    }

    /* renamed from: B */
    protected final MediaCodec m27939B() {
        return this.f21147l;
    }

    /* renamed from: a */
    protected void mo4675a(boolean z) {
        this.f21137a = new C2128d();
    }

    /* renamed from: a */
    protected void mo4674a(long j, boolean z) {
        this.f21133J = false;
        this.f21134K = false;
        if (this.f21147l != null) {
            m27941D();
        }
    }

    /* renamed from: p */
    protected void mo4678p() {
        this.f21146k = null;
        try {
            m27940C();
            try {
                if (this.f21148m != null) {
                    this.f21139d.m8081a(this.f21148m);
                }
                try {
                    if (!(this.f21149n == null || this.f21149n == this.f21148m)) {
                        this.f21139d.m8081a(this.f21149n);
                    }
                    this.f21148m = null;
                    this.f21149n = null;
                } catch (Throwable th) {
                    this.f21148m = null;
                    this.f21149n = null;
                }
            } catch (Throwable th2) {
                this.f21148m = null;
                this.f21149n = null;
            }
        } catch (Throwable th3) {
            this.f21148m = null;
            this.f21149n = null;
        }
    }

    /* renamed from: C */
    protected void m27940C() {
        if (this.f21147l != null) {
            this.f21124A = -9223372036854775807L;
            this.f21125B = -1;
            this.f21126C = -1;
            this.f21135L = false;
            this.f21127D = false;
            this.f21144i.clear();
            this.f21160y = null;
            this.f21161z = null;
            this.f21128E = false;
            this.f21131H = false;
            this.f21150o = false;
            this.f21151p = false;
            this.f21152q = false;
            this.f21153r = false;
            this.f21154s = false;
            this.f21155t = false;
            this.f21157v = false;
            this.f21158w = false;
            this.f21159x = false;
            this.f21132I = false;
            this.f21129F = 0;
            this.f21130G = 0;
            C2128d c2128d = this.f21137a;
            c2128d.f6524b++;
            this.f21141f.f15688b = null;
            try {
                this.f21147l.stop();
                try {
                    this.f21147l.release();
                    this.f21147l = null;
                    if (this.f21148m != null && this.f21149n != this.f21148m) {
                        try {
                            this.f21139d.m8081a(this.f21148m);
                        } finally {
                            this.f21148m = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f21147l = null;
                    if (!(this.f21148m == null || this.f21149n == this.f21148m)) {
                        this.f21139d.m8081a(this.f21148m);
                    }
                } finally {
                    this.f21148m = null;
                }
            } catch (Throwable th2) {
                this.f21147l = null;
                if (!(this.f21148m == null || this.f21149n == this.f21148m)) {
                    try {
                        this.f21139d.m8081a(this.f21148m);
                    } finally {
                        this.f21148m = null;
                    }
                }
            } finally {
                this.f21148m = null;
            }
        }
    }

    /* renamed from: a */
    public void mo4673a(long j, long j2) {
        if (this.f21134K) {
            mo4928y();
            return;
        }
        if (this.f21146k == null) {
            this.f21142g.mo1520a();
            int a = m25719a(this.f21143h, this.f21142g, true);
            if (a == -5) {
                mo4926b(this.f21143h.f7223a);
            } else if (a == -4) {
                C2163a.m7918b(this.f21142g.m7762c());
                this.f21133J = true;
                m27922F();
                return;
            } else {
                return;
            }
        }
        m27964z();
        if (this.f21147l != null) {
            C2184r.m8036a("drainAndFeed");
            while (mo4932b(j, j2)) {
            }
            while (mo4927v() != null) {
            }
            C2184r.m8035a();
        } else {
            m25729b(j);
            this.f21142g.mo1520a();
            j = m25719a((C2274i) this.f21143h, this.f21142g, (boolean) 0);
            if (j == -5) {
                mo4926b(this.f21143h.f7223a);
            } else if (j == -4) {
                C2163a.m7918b(this.f21142g.m7762c());
                this.f21133J = true;
                m27922F();
            }
        }
        this.f21137a.m7776a();
    }

    /* renamed from: D */
    protected void m27941D() {
        this.f21124A = -9223372036854775807L;
        this.f21125B = -1;
        this.f21126C = -1;
        this.f21136M = true;
        this.f21135L = false;
        this.f21127D = false;
        this.f21144i.clear();
        this.f21158w = false;
        this.f21159x = false;
        if (!this.f21152q) {
            if (!this.f21155t || !this.f21132I) {
                if (this.f21130G != 0) {
                    m27940C();
                    m27964z();
                } else {
                    this.f21147l.flush();
                    this.f21131H = false;
                }
                if (this.f21128E && this.f21146k != null) {
                    this.f21129F = 1;
                    return;
                }
            }
        }
        m27940C();
        m27964z();
        if (this.f21128E) {
        }
    }

    /* renamed from: v */
    private boolean mo4927v() {
        if (!(this.f21147l == null || this.f21130G == 2)) {
            if (!this.f21133J) {
                if (this.f21125B < 0) {
                    this.f21125B = this.f21147l.dequeueInputBuffer(0);
                    if (this.f21125B < 0) {
                        return false;
                    }
                    this.f21141f.f15688b = this.f21160y[this.f21125B];
                    this.f21141f.mo1520a();
                }
                if (this.f21130G == 1) {
                    if (!this.f21154s) {
                        this.f21132I = true;
                        this.f21147l.queueInputBuffer(this.f21125B, 0, 0, 0, 4);
                        this.f21125B = -1;
                    }
                    this.f21130G = 2;
                    return false;
                } else if (this.f21158w) {
                    this.f21158w = false;
                    this.f21141f.f15688b.put(f21123b);
                    this.f21147l.queueInputBuffer(this.f21125B, 0, f21123b.length, 0, 0);
                    this.f21125B = -1;
                    this.f21131H = true;
                    return true;
                } else {
                    int i;
                    int i2;
                    if (this.f21135L) {
                        i = -4;
                        i2 = 0;
                    } else {
                        if (this.f21129F == 1) {
                            for (i = 0; i < this.f21146k.f6491h.size(); i++) {
                                this.f21141f.f15688b.put((byte[]) this.f21146k.f6491h.get(i));
                            }
                            this.f21129F = 2;
                        }
                        i = this.f21141f.f15688b.position();
                        i2 = i;
                        i = m25719a(this.f21143h, this.f21141f, false);
                    }
                    if (i == -3) {
                        return false;
                    }
                    if (i == -5) {
                        if (this.f21129F == 2) {
                            this.f21141f.mo1520a();
                            this.f21129F = 1;
                        }
                        mo4926b(this.f21143h.f7223a);
                        return true;
                    } else if (this.f21141f.m7762c()) {
                        if (this.f21129F == 2) {
                            this.f21141f.mo1520a();
                            this.f21129F = 1;
                        }
                        this.f21133J = true;
                        if (this.f21131H) {
                            try {
                                if (!this.f21154s) {
                                    this.f21132I = true;
                                    this.f21147l.queueInputBuffer(this.f21125B, 0, 0, 0, 4);
                                    this.f21125B = -1;
                                }
                                return false;
                            } catch (Exception e) {
                                throw ExoPlaybackException.m7732a(e, m25745r());
                            }
                        }
                        m27922F();
                        return false;
                    } else if (!this.f21136M || this.f21141f.m7763d()) {
                        this.f21136M = false;
                        boolean g = this.f21141f.m19609g();
                        this.f21135L = m27930b(g);
                        if (this.f21135L) {
                            return false;
                        }
                        if (this.f21151p && !g) {
                            C2173i.m7951a(this.f21141f.f15688b);
                            if (this.f21141f.f15688b.position() == 0) {
                                return true;
                            }
                            this.f21151p = false;
                        }
                        try {
                            long j = this.f21141f.f15689c;
                            if (this.f21141f.l_()) {
                                this.f21144i.add(Long.valueOf(j));
                            }
                            this.f21141f.m19610h();
                            mo4930a(this.f21141f);
                            if (g) {
                                this.f21147l.queueSecureInputBuffer(this.f21125B, 0, m27923a(this.f21141f, i2), j, 0);
                            } else {
                                this.f21147l.queueInputBuffer(this.f21125B, 0, this.f21141f.f15688b.limit(), j, 0);
                            }
                            this.f21125B = -1;
                            this.f21131H = true;
                            this.f21129F = 0;
                            C2128d c2128d = this.f21137a;
                            c2128d.f6525c++;
                            return true;
                        } catch (Exception e2) {
                            throw ExoPlaybackException.m7732a(e2, m25745r());
                        }
                    } else {
                        this.f21141f.mo1520a();
                        if (this.f21129F == 2) {
                            this.f21129F = 1;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static CryptoInfo m27923a(C3946e c3946e, int i) {
        c3946e = c3946e.f15687a.m7769a();
        if (i == 0) {
            return c3946e;
        }
        if (c3946e.numBytesOfClearData == null) {
            c3946e.numBytesOfClearData = new int[1];
        }
        int[] iArr = c3946e.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return c3946e;
    }

    /* renamed from: b */
    private boolean m27930b(boolean z) {
        boolean z2 = false;
        if (this.f21148m == null) {
            return false;
        }
        int a = this.f21148m.m8076a();
        if (a != 0) {
            if (a != 4 && (z || !this.f21140e)) {
                z2 = true;
            }
            return z2;
        }
        throw ExoPlaybackException.m7732a(this.f21148m.m8079c(), m25745r());
    }

    /* renamed from: b */
    protected void mo4926b(Format format) {
        Format format2 = this.f21146k;
        this.f21146k = format;
        boolean z = true;
        if ((C2186s.m8052a(this.f21146k.f6492i, format2 == null ? null : format2.f6492i) ^ 1) != null) {
            if (this.f21146k.f6492i == null) {
                this.f21149n = null;
            } else if (this.f21139d != null) {
                this.f21149n = this.f21139d.m8080a(Looper.myLooper(), this.f21146k.f6492i);
                if (this.f21149n == this.f21148m) {
                    this.f21139d.m8081a(this.f21149n);
                }
            } else {
                throw ExoPlaybackException.m7732a(new IllegalStateException("Media requires a DrmSessionManager"), m25745r());
            }
        }
        if (this.f21149n == this.f21148m && this.f21147l != null && mo4931a(this.f21147l, this.f21150o, format2, this.f21146k) != null) {
            this.f21128E = true;
            this.f21129F = 1;
            if (this.f21153r == null || this.f21146k.f6493j != format2.f6493j || this.f21146k.f6494k != format2.f6494k) {
                z = false;
            }
            this.f21158w = z;
        } else if (this.f21131H != null) {
            this.f21130G = 1;
        } else {
            m27940C();
            m27964z();
        }
    }

    /* renamed from: u */
    public boolean mo4680u() {
        return this.f21134K;
    }

    /* renamed from: t */
    public boolean mo4679t() {
        return (this.f21146k == null || this.f21135L || (!m25746s() && this.f21126C < 0 && (this.f21124A == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.f21124A))) ? false : true;
    }

    /* renamed from: b */
    private boolean mo4932b(long r17, long r19) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r16 = this;
        r12 = r16;
        r0 = r12.f21126C;
        r13 = -1;
        r14 = 1;
        r15 = 0;
        if (r0 >= 0) goto L_0x00a5;
    L_0x0009:
        r0 = r12.f21156u;
        if (r0 == 0) goto L_0x002c;
    L_0x000d:
        r0 = r12.f21132I;
        if (r0 == 0) goto L_0x002c;
    L_0x0011:
        r0 = r12.f21147l;	 Catch:{ IllegalStateException -> 0x0020 }
        r1 = r12.f21145j;	 Catch:{ IllegalStateException -> 0x0020 }
        r2 = r16.m27942E();	 Catch:{ IllegalStateException -> 0x0020 }
        r0 = r0.dequeueOutputBuffer(r1, r2);	 Catch:{ IllegalStateException -> 0x0020 }
        r12.f21126C = r0;	 Catch:{ IllegalStateException -> 0x0020 }
        goto L_0x003a;
        r16.m27922F();
        r0 = r12.f21134K;
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r16.m27940C();
    L_0x002b:
        return r15;
    L_0x002c:
        r0 = r12.f21147l;
        r1 = r12.f21145j;
        r2 = r16.m27942E();
        r0 = r0.dequeueOutputBuffer(r1, r2);
        r12.f21126C = r0;
    L_0x003a:
        r0 = r12.f21126C;
        if (r0 < 0) goto L_0x0082;
    L_0x003e:
        r0 = r12.f21159x;
        if (r0 == 0) goto L_0x004e;
    L_0x0042:
        r12.f21159x = r15;
        r0 = r12.f21147l;
        r1 = r12.f21126C;
        r0.releaseOutputBuffer(r1, r15);
        r12.f21126C = r13;
        return r14;
    L_0x004e:
        r0 = r12.f21145j;
        r0 = r0.flags;
        r0 = r0 & 4;
        if (r0 == 0) goto L_0x005c;
    L_0x0056:
        r16.m27922F();
        r12.f21126C = r13;
        return r15;
    L_0x005c:
        r0 = r12.f21161z;
        r1 = r12.f21126C;
        r0 = r0[r1];
        if (r0 == 0) goto L_0x0077;
    L_0x0064:
        r1 = r12.f21145j;
        r1 = r1.offset;
        r0.position(r1);
        r1 = r12.f21145j;
        r1 = r1.offset;
        r2 = r12.f21145j;
        r2 = r2.size;
        r1 = r1 + r2;
        r0.limit(r1);
    L_0x0077:
        r0 = r12.f21145j;
        r0 = r0.presentationTimeUs;
        r0 = r12.m27932d(r0);
        r12.f21127D = r0;
        goto L_0x00a5;
    L_0x0082:
        r0 = r12.f21126C;
        r1 = -2;
        if (r0 != r1) goto L_0x008b;
    L_0x0087:
        r16.mo1551w();
        return r14;
    L_0x008b:
        r0 = r12.f21126C;
        r1 = -3;
        if (r0 != r1) goto L_0x0094;
    L_0x0090:
        r16.mo1552x();
        return r14;
    L_0x0094:
        r0 = r12.f21154s;
        if (r0 == 0) goto L_0x00a4;
    L_0x0098:
        r0 = r12.f21133J;
        if (r0 != 0) goto L_0x00a1;
    L_0x009c:
        r0 = r12.f21130G;
        r1 = 2;
        if (r0 != r1) goto L_0x00a4;
    L_0x00a1:
        r16.m27922F();
    L_0x00a4:
        return r15;
    L_0x00a5:
        r0 = r12.f21156u;
        if (r0 == 0) goto L_0x00d8;
    L_0x00a9:
        r0 = r12.f21132I;
        if (r0 == 0) goto L_0x00d8;
    L_0x00ad:
        r5 = r12.f21147l;	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r12.f21161z;	 Catch:{ IllegalStateException -> 0x00cc }
        r1 = r12.f21126C;	 Catch:{ IllegalStateException -> 0x00cc }
        r6 = r0[r1];	 Catch:{ IllegalStateException -> 0x00cc }
        r7 = r12.f21126C;	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r12.f21145j;	 Catch:{ IllegalStateException -> 0x00cc }
        r8 = r0.flags;	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r12.f21145j;	 Catch:{ IllegalStateException -> 0x00cc }
        r9 = r0.presentationTimeUs;	 Catch:{ IllegalStateException -> 0x00cc }
        r11 = r12.f21127D;	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r16;	 Catch:{ IllegalStateException -> 0x00cc }
        r1 = r17;	 Catch:{ IllegalStateException -> 0x00cc }
        r3 = r19;	 Catch:{ IllegalStateException -> 0x00cc }
        r0 = r0.mo4924a(r1, r3, r5, r6, r7, r8, r9, r11);	 Catch:{ IllegalStateException -> 0x00cc }
        goto L_0x00f6;
        r16.m27922F();
        r0 = r12.f21134K;
        if (r0 == 0) goto L_0x00d7;
    L_0x00d4:
        r16.m27940C();
    L_0x00d7:
        return r15;
    L_0x00d8:
        r5 = r12.f21147l;
        r0 = r12.f21161z;
        r1 = r12.f21126C;
        r6 = r0[r1];
        r7 = r12.f21126C;
        r0 = r12.f21145j;
        r8 = r0.flags;
        r0 = r12.f21145j;
        r9 = r0.presentationTimeUs;
        r11 = r12.f21127D;
        r0 = r16;
        r1 = r17;
        r3 = r19;
        r0 = r0.mo4924a(r1, r3, r5, r6, r7, r8, r9, r11);
    L_0x00f6:
        if (r0 == 0) goto L_0x0102;
    L_0x00f8:
        r0 = r12.f21145j;
        r0 = r0.presentationTimeUs;
        r12.m27956c(r0);
        r12.f21126C = r13;
        return r14;
    L_0x0102:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.b(long, long):boolean");
    }

    /* renamed from: w */
    private void mo1551w() {
        MediaFormat outputFormat = this.f21147l.getOutputFormat();
        if (this.f21153r && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f21159x = true;
            return;
        }
        if (this.f21157v) {
            outputFormat.setInteger("channel-count", 1);
        }
        mo4921a(this.f21147l, outputFormat);
    }

    /* renamed from: x */
    private void mo1552x() {
        this.f21161z = this.f21147l.getOutputBuffers();
    }

    /* renamed from: F */
    private void m27922F() {
        if (this.f21130G == 2) {
            m27940C();
            m27964z();
            return;
        }
        this.f21134K = true;
        mo4928y();
    }

    /* renamed from: d */
    private boolean m27932d(long j) {
        int size = this.f21144i.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.f21144i.get(i)).longValue() == j) {
                this.f21144i.remove(i);
                return 1;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean mo4925a(String str) {
        if (C2186s.f6761a >= 18 && !(C2186s.f6761a == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str)))) {
            if (C2186s.f6761a == 19 && C2186s.f6764d.startsWith("SM-G800")) {
                if (!"OMX.Exynos.avc.dec".equals(str)) {
                    if ("OMX.Exynos.avc.dec.secure".equals(str) != null) {
                    }
                }
            }
            return null;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m27928b(String str) {
        return (C2186s.f6761a >= 24 || ((!"OMX.Nvidia.h264.decode".equals(str) && "OMX.Nvidia.h264.decode.secure".equals(str) == null) || ("flounder".equals(C2186s.f6762b) == null && "flounder_lte".equals(C2186s.f6762b) == null && "grouper".equals(C2186s.f6762b) == null && "tilapia".equals(C2186s.f6762b) == null))) ? null : true;
    }

    /* renamed from: a */
    private static boolean m27926a(String str, Format format) {
        return (C2186s.f6761a >= 21 || format.f6491h.isEmpty() == null || "OMX.MTK.VIDEO.DECODER.AVC".equals(str) == null) ? null : true;
    }

    /* renamed from: c */
    private static boolean m27931c(String str) {
        return (C2186s.f6761a > 17 || (!"OMX.rk.video_decoder.avc".equals(str) && "OMX.allwinner.video.decoder.avc".equals(str) == null)) ? null : true;
    }

    /* renamed from: d */
    private static boolean m27933d(String str) {
        return ((C2186s.f6761a > 23 || !"OMX.google.vorbis.decoder".equals(str)) && (C2186s.f6761a > 19 || !"hb2000".equals(C2186s.f6762b) || (!"OMX.amlogic.avc.decoder.awesome".equals(str) && "OMX.amlogic.avc.decoder.awesome.secure".equals(str) == null))) ? null : true;
    }

    /* renamed from: e */
    private static boolean m27934e(String str) {
        return (C2186s.f6761a != 21 || "OMX.google.aac.decoder".equals(str) == null) ? null : true;
    }

    /* renamed from: b */
    private static boolean m27929b(String str, Format format) {
        if (C2186s.f6761a > 18 || format.f6501r != 1 || "OMX.MTK.AUDIO.DECODER.MP3".equals(str) == null) {
            return false;
        }
        return true;
    }
}
