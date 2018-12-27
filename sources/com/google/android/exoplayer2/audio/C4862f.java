package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.C2276k;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioTrack.C2133c;
import com.google.android.exoplayer2.audio.C2146c.C2145a;
import com.google.android.exoplayer2.drm.C2190a;
import com.google.android.exoplayer2.drm.C3960c;
import com.google.android.exoplayer2.mediacodec.C2281a;
import com.google.android.exoplayer2.mediacodec.C2282b;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.p126c.C2169g;
import com.google.android.exoplayer2.p126c.C2170h;
import com.google.android.exoplayer2.p126c.C2186s;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.audio.f */
public class C4862f extends MediaCodecRenderer implements C2169g {
    /* renamed from: b */
    private final C2145a f21558b;
    /* renamed from: c */
    private final AudioTrack f21559c;
    /* renamed from: d */
    private boolean f21560d;
    /* renamed from: e */
    private boolean f21561e;
    /* renamed from: f */
    private MediaFormat f21562f;
    /* renamed from: g */
    private int f21563g;
    /* renamed from: h */
    private int f21564h;
    /* renamed from: i */
    private long f21565i;
    /* renamed from: j */
    private boolean f21566j;

    /* renamed from: com.google.android.exoplayer2.audio.f$a */
    private final class C3951a implements C2133c {
        /* renamed from: a */
        final /* synthetic */ C4862f f15718a;

        private C3951a(C4862f c4862f) {
            this.f15718a = c4862f;
        }

        /* renamed from: a */
        public void mo1541a(int i) {
            this.f15718a.f21558b.m7857a(i);
            this.f15718a.m28861b(i);
        }

        /* renamed from: a */
        public void mo1540a() {
            this.f15718a.mo4927v();
            this.f15718a.f21566j = true;
        }

        /* renamed from: a */
        public void mo1542a(int i, long j, long j2) {
            this.f15718a.f21558b.m7858a(i, j, j2);
            this.f15718a.m28852a(i, j, j2);
        }
    }

    /* renamed from: a */
    protected void m28852a(int i, long j, long j2) {
    }

    /* renamed from: b */
    protected void m28861b(int i) {
    }

    /* renamed from: c */
    public C2169g mo4035c() {
        return this;
    }

    /* renamed from: v */
    protected void mo4927v() {
    }

    public C4862f(C2282b c2282b, C2190a<C3960c> c2190a, boolean z, Handler handler, C2146c c2146c, C2138b c2138b, AudioProcessor... audioProcessorArr) {
        super(1, c2282b, c2190a, z);
        this.f21559c = new AudioTrack(c2138b, audioProcessorArr, new C3951a());
        this.f21558b = new C2145a(handler, c2146c);
    }

    /* renamed from: a */
    protected int mo4919a(C2282b c2282b, Format format) {
        String str = format.f6489f;
        if (!C2170h.m7942a(str)) {
            return 0;
        }
        int i = C2186s.f6761a >= 21 ? 16 : 0;
        int i2 = 3;
        if (mo4925a(str) && c2282b.mo1640a() != null) {
            return (i | 4) | 3;
        }
        c2282b = c2282b.mo1641a(str, false);
        int i3 = 1;
        if (c2282b == null) {
            return 1;
        }
        if (C2186s.f6761a >= 21) {
            if (format.f6502s == -1 || c2282b.m8391a(format.f6502s)) {
                if (format.f6501r != -1) {
                    if (c2282b.m8394b(format.f6501r) != null) {
                    }
                }
            }
            i3 = 0;
        }
        if (i3 == 0) {
            i2 = 2;
        }
        return (i | 4) | i2;
    }

    /* renamed from: a */
    protected C2281a mo4920a(C2282b c2282b, Format format, boolean z) {
        if (mo4925a(format.f6489f)) {
            C2281a a = c2282b.mo1640a();
            if (a != null) {
                this.f21560d = true;
                return a;
            }
        }
        this.f21560d = false;
        return super.mo4920a(c2282b, format, z);
    }

    /* renamed from: a */
    protected boolean mo4925a(String str) {
        return this.f21559c.m7834a(str);
    }

    /* renamed from: a */
    protected void mo4922a(C2281a c2281a, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.f21561e = C4862f.m28848b(c2281a.f7237a);
        if (this.f21560d != null) {
            this.f21562f = format.m7758b();
            this.f21562f.setString("mime", "audio/raw");
            mediaCodec.configure(this.f21562f, null, mediaCrypto, 0);
            this.f21562f.setString("mime", format.f6489f);
            return;
        }
        mediaCodec.configure(format.m7758b(), null, mediaCrypto, 0);
        this.f21562f = null;
    }

    /* renamed from: a */
    protected void mo4923a(String str, long j, long j2) {
        this.f21558b.m7861a(str, j, j2);
    }

    /* renamed from: b */
    protected void mo4926b(Format format) {
        super.mo4926b(format);
        this.f21558b.m7859a(format);
        this.f21563g = "audio/raw".equals(format.f6489f) ? format.f6503t : 2;
        this.f21564h = format.f6501r;
    }

    /* renamed from: a */
    protected void mo4921a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        mediaCodec = this.f21562f != null ? true : null;
        String string = mediaCodec != null ? this.f21562f.getString("mime") : "audio/raw";
        if (mediaCodec != null) {
            mediaFormat = this.f21562f;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.f21561e == null || integer != 6 || this.f21564h >= 6) {
            mediaCodec = null;
        } else {
            mediaCodec = new int[this.f21564h];
            for (int i = 0; i < this.f21564h; i++) {
                mediaCodec[i] = i;
            }
        }
        try {
            this.f21559c.m7833a(string, integer, integer2, this.f21563g, 0, mediaCodec);
        } catch (MediaCodec mediaCodec2) {
            throw ExoPlaybackException.m7732a(mediaCodec2, m25745r());
        }
    }

    /* renamed from: a */
    protected void mo4675a(boolean z) {
        super.mo4675a(z);
        this.f21558b.m7860a(this.a);
        int i = m25744q().f7265b;
        if (i == true) {
            this.f21559c.m7837b(i);
        } else {
            this.f21559c.m7842g();
        }
    }

    /* renamed from: a */
    protected void mo4674a(long j, boolean z) {
        super.mo4674a(j, z);
        this.f21559c.m7844i();
        this.f21565i = j;
        this.f21566j = 1;
    }

    /* renamed from: n */
    protected void mo4676n() {
        super.mo4676n();
        this.f21559c.m7830a();
    }

    /* renamed from: o */
    protected void mo4677o() {
        this.f21559c.m7843h();
        super.mo4677o();
    }

    /* renamed from: p */
    protected void mo4678p() {
        try {
            this.f21559c.m7845j();
            try {
                super.mo4678p();
            } finally {
                this.a.m7776a();
                this.f21558b.m7862b(this.a);
            }
        } catch (Throwable th) {
            super.mo4678p();
        } finally {
            this.a.m7776a();
            this.f21558b.m7862b(this.a);
        }
    }

    /* renamed from: u */
    public boolean mo4680u() {
        return super.mo4680u() && this.f21559c.m7839d();
    }

    /* renamed from: t */
    public boolean mo4679t() {
        if (!this.f21559c.m7840e()) {
            if (!super.mo4679t()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public long mo1551w() {
        long a = this.f21559c.m7828a(mo4680u());
        if (a != Long.MIN_VALUE) {
            if (!this.f21566j) {
                a = Math.max(this.f21565i, a);
            }
            this.f21565i = a;
            this.f21566j = false;
        }
        return this.f21565i;
    }

    /* renamed from: a */
    public C2276k mo1550a(C2276k c2276k) {
        return this.f21559c.m7829a(c2276k);
    }

    /* renamed from: x */
    public C2276k mo1552x() {
        return this.f21559c.m7841f();
    }

    /* renamed from: a */
    protected boolean mo4924a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        if (this.f21560d != null && (i2 & 2) != null) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            j = this.a;
            j.f6527e++;
            this.f21559c.m7836b();
            return true;
        } else {
            try {
                if (this.f21559c.m7835a(byteBuffer, j3) == null) {
                    return false;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                j = this.a;
                j.f6526d++;
                return true;
            } catch (long j4) {
                throw ExoPlaybackException.m7732a(j4, m25745r());
            }
        }
    }

    /* renamed from: y */
    protected void mo4928y() {
        try {
            this.f21559c.m7838c();
        } catch (Exception e) {
            throw ExoPlaybackException.m7732a(e, m25745r());
        }
    }

    /* renamed from: a */
    public void mo4030a(int i, Object obj) {
        switch (i) {
            case 2:
                this.f21559c.m7831a(((Float) obj).floatValue());
                return;
            case 3:
                this.f21559c.m7832a(((Integer) obj).intValue());
                return;
            default:
                super.mo4030a(i, obj);
                return;
        }
    }

    /* renamed from: b */
    private static boolean m28848b(String str) {
        return (C2186s.f6761a >= 24 || "OMX.SEC.aac.dec".equals(str) == null || "samsung".equals(C2186s.f6763c) == null || (C2186s.f6762b.startsWith("zeroflte") == null && C2186s.f6762b.startsWith("herolte") == null && C2186s.f6762b.startsWith("heroqlte") == null)) ? null : true;
    }
}
