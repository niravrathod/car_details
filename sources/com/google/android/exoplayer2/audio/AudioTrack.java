package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.C2162b;
import com.google.android.exoplayer2.C2276k;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedList;

public final class AudioTrack {
    /* renamed from: a */
    public static boolean f6548a = false;
    /* renamed from: b */
    public static boolean f6549b = false;
    /* renamed from: A */
    private int f6550A;
    /* renamed from: B */
    private int f6551B;
    /* renamed from: C */
    private int f6552C;
    /* renamed from: D */
    private long f6553D;
    /* renamed from: E */
    private long f6554E;
    /* renamed from: F */
    private boolean f6555F;
    /* renamed from: G */
    private long f6556G;
    /* renamed from: H */
    private Method f6557H;
    /* renamed from: I */
    private int f6558I;
    /* renamed from: J */
    private long f6559J;
    /* renamed from: K */
    private long f6560K;
    /* renamed from: L */
    private int f6561L;
    /* renamed from: M */
    private long f6562M;
    /* renamed from: N */
    private long f6563N;
    /* renamed from: O */
    private int f6564O;
    /* renamed from: P */
    private int f6565P;
    /* renamed from: Q */
    private long f6566Q;
    /* renamed from: R */
    private long f6567R;
    /* renamed from: S */
    private long f6568S;
    /* renamed from: T */
    private float f6569T;
    /* renamed from: U */
    private AudioProcessor[] f6570U;
    /* renamed from: V */
    private ByteBuffer[] f6571V;
    /* renamed from: W */
    private ByteBuffer f6572W;
    /* renamed from: X */
    private ByteBuffer f6573X;
    /* renamed from: Y */
    private byte[] f6574Y;
    /* renamed from: Z */
    private int f6575Z;
    private int aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private boolean ae;
    private boolean af;
    private long ag;
    /* renamed from: c */
    private final C2138b f6576c;
    /* renamed from: d */
    private final C3950d f6577d;
    /* renamed from: e */
    private final C3953i f6578e;
    /* renamed from: f */
    private final AudioProcessor[] f6579f;
    /* renamed from: g */
    private final C2133c f6580g;
    /* renamed from: h */
    private final ConditionVariable f6581h = new ConditionVariable(true);
    /* renamed from: i */
    private final long[] f6582i;
    /* renamed from: j */
    private final C2132a f6583j;
    /* renamed from: k */
    private final LinkedList<C2134d> f6584k;
    /* renamed from: l */
    private android.media.AudioTrack f6585l;
    /* renamed from: m */
    private android.media.AudioTrack f6586m;
    /* renamed from: n */
    private int f6587n;
    /* renamed from: o */
    private int f6588o;
    /* renamed from: p */
    private int f6589p;
    /* renamed from: q */
    private int f6590q;
    /* renamed from: r */
    private int f6591r;
    /* renamed from: s */
    private boolean f6592s;
    /* renamed from: t */
    private int f6593t;
    /* renamed from: u */
    private long f6594u;
    /* renamed from: v */
    private C2276k f6595v;
    /* renamed from: w */
    private C2276k f6596w;
    /* renamed from: x */
    private long f6597x;
    /* renamed from: y */
    private long f6598y;
    /* renamed from: z */
    private ByteBuffer f6599z;

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i, int i2, int i3, int i4) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack init failed: ");
            stringBuilder.append(i);
            stringBuilder.append(", Config(");
            stringBuilder.append(i2);
            stringBuilder.append(", ");
            stringBuilder.append(i3);
            stringBuilder.append(", ");
            stringBuilder.append(i4);
            stringBuilder.append(")");
            super(stringBuilder.toString());
            this.audioTrackState = i;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioTrack write failed: ");
            stringBuilder.append(i);
            super(stringBuilder.toString());
            this.errorCode = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$a */
    private static class C2132a {
        /* renamed from: a */
        protected android.media.AudioTrack f6536a;
        /* renamed from: b */
        private boolean f6537b;
        /* renamed from: c */
        private int f6538c;
        /* renamed from: d */
        private long f6539d;
        /* renamed from: e */
        private long f6540e;
        /* renamed from: f */
        private long f6541f;
        /* renamed from: g */
        private long f6542g;
        /* renamed from: h */
        private long f6543h;
        /* renamed from: i */
        private long f6544i;

        /* renamed from: d */
        public boolean mo1527d() {
            return false;
        }

        private C2132a() {
        }

        /* renamed from: a */
        public void mo1526a(android.media.AudioTrack audioTrack, boolean z) {
            this.f6536a = audioTrack;
            this.f6537b = z;
            this.f6542g = -9223372036854775807L;
            this.f6539d = 0;
            this.f6540e = 0;
            this.f6541f = 0;
            if (audioTrack != null) {
                this.f6538c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: a */
        public void m7788a(long j) {
            this.f6543h = m7790b();
            this.f6542g = SystemClock.elapsedRealtime() * 1000;
            this.f6544i = j;
            this.f6536a.stop();
        }

        /* renamed from: a */
        public void m7787a() {
            if (this.f6542g == -9223372036854775807L) {
                this.f6536a.pause();
            }
        }

        /* renamed from: b */
        public long m7790b() {
            if (this.f6542g != -9223372036854775807L) {
                return Math.min(this.f6544i, this.f6543h + ((((SystemClock.elapsedRealtime() * 1000) - this.f6542g) * ((long) this.f6538c)) / 1000000));
            }
            int playState = this.f6536a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = 4294967295L & ((long) this.f6536a.getPlaybackHeadPosition());
            if (this.f6537b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f6541f = this.f6539d;
                }
                playbackHeadPosition += this.f6541f;
            }
            if (this.f6539d > playbackHeadPosition) {
                this.f6540e++;
            }
            this.f6539d = playbackHeadPosition;
            return playbackHeadPosition + (this.f6540e << 32);
        }

        /* renamed from: c */
        public long m7791c() {
            return (m7790b() * 1000000) / ((long) this.f6538c);
        }

        /* renamed from: e */
        public long mo1528e() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: f */
        public long mo1529f() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$c */
    public interface C2133c {
        /* renamed from: a */
        void mo1540a();

        /* renamed from: a */
        void mo1541a(int i);

        /* renamed from: a */
        void mo1542a(int i, long j, long j2);
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$d */
    private static final class C2134d {
        /* renamed from: a */
        private final C2276k f6545a;
        /* renamed from: b */
        private final long f6546b;
        /* renamed from: c */
        private final long f6547c;

        private C2134d(C2276k c2276k, long j, long j2) {
            this.f6545a = c2276k;
            this.f6546b = j;
            this.f6547c = j2;
        }
    }

    @TargetApi(19)
    /* renamed from: com.google.android.exoplayer2.audio.AudioTrack$b */
    private static class C3949b extends C2132a {
        /* renamed from: b */
        private final AudioTimestamp f15706b = new AudioTimestamp();
        /* renamed from: c */
        private long f15707c;
        /* renamed from: d */
        private long f15708d;
        /* renamed from: e */
        private long f15709e;

        public C3949b() {
            super();
        }

        /* renamed from: a */
        public void mo1526a(android.media.AudioTrack audioTrack, boolean z) {
            super.mo1526a(audioTrack, z);
            this.f15707c = 0;
            this.f15708d = 0;
            this.f15709e = 0;
        }

        /* renamed from: d */
        public boolean mo1527d() {
            boolean timestamp = this.a.getTimestamp(this.f15706b);
            if (timestamp) {
                long j = this.f15706b.framePosition;
                if (this.f15708d > j) {
                    this.f15707c++;
                }
                this.f15708d = j;
                this.f15709e = j + (this.f15707c << 32);
            }
            return timestamp;
        }

        /* renamed from: e */
        public long mo1528e() {
            return this.f15706b.nanoTime;
        }

        /* renamed from: f */
        public long mo1529f() {
            return this.f15709e;
        }
    }

    public AudioTrack(com.google.android.exoplayer2.audio.C2138b r4, com.google.android.exoplayer2.audio.AudioProcessor[] r5, com.google.android.exoplayer2.audio.AudioTrack.C2133c r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r3.<init>();
        r3.f6576c = r4;
        r3.f6580g = r6;
        r4 = new android.os.ConditionVariable;
        r6 = 1;
        r4.<init>(r6);
        r3.f6581h = r4;
        r4 = com.google.android.exoplayer2.p126c.C2186s.f6761a;
        r0 = 0;
        r1 = 18;
        if (r4 < r1) goto L_0x0025;
    L_0x0016:
        r4 = android.media.AudioTrack.class;	 Catch:{ NoSuchMethodException -> 0x0024 }
        r1 = "getLatency";	 Catch:{ NoSuchMethodException -> 0x0024 }
        r2 = r0;	 Catch:{ NoSuchMethodException -> 0x0024 }
        r2 = (java.lang.Class[]) r2;	 Catch:{ NoSuchMethodException -> 0x0024 }
        r4 = r4.getMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0024 }
        r3.f6557H = r4;	 Catch:{ NoSuchMethodException -> 0x0024 }
        goto L_0x0025;
    L_0x0025:
        r4 = com.google.android.exoplayer2.p126c.C2186s.f6761a;
        r1 = 19;
        if (r4 < r1) goto L_0x0033;
    L_0x002b:
        r4 = new com.google.android.exoplayer2.audio.AudioTrack$b;
        r4.<init>();
        r3.f6583j = r4;
        goto L_0x003a;
    L_0x0033:
        r4 = new com.google.android.exoplayer2.audio.AudioTrack$a;
        r4.<init>();
        r3.f6583j = r4;
    L_0x003a:
        r4 = new com.google.android.exoplayer2.audio.d;
        r4.<init>();
        r3.f6577d = r4;
        r4 = new com.google.android.exoplayer2.audio.i;
        r4.<init>();
        r3.f6578e = r4;
        r4 = r5.length;
        r0 = 3;
        r4 = r4 + r0;
        r4 = new com.google.android.exoplayer2.audio.AudioProcessor[r4];
        r3.f6579f = r4;
        r4 = r3.f6579f;
        r1 = new com.google.android.exoplayer2.audio.g;
        r1.<init>();
        r2 = 0;
        r4[r2] = r1;
        r4 = r3.f6579f;
        r1 = r3.f6577d;
        r4[r6] = r1;
        r4 = r3.f6579f;
        r6 = r5.length;
        r1 = 2;
        java.lang.System.arraycopy(r5, r2, r4, r1, r6);
        r4 = r3.f6579f;
        r5 = r5.length;
        r5 = r5 + r1;
        r6 = r3.f6578e;
        r4[r5] = r6;
        r4 = 10;
        r4 = new long[r4];
        r3.f6582i = r4;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.f6569T = r4;
        r3.f6565P = r2;
        r3.f6591r = r0;
        r3.ad = r2;
        r4 = com.google.android.exoplayer2.C2276k.f7224a;
        r3.f6596w = r4;
        r4 = -1;
        r3.aa = r4;
        r4 = new com.google.android.exoplayer2.audio.AudioProcessor[r2];
        r3.f6570U = r4;
        r4 = new java.nio.ByteBuffer[r2];
        r3.f6571V = r4;
        r4 = new java.util.LinkedList;
        r4.<init>();
        r3.f6584k = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.<init>(com.google.android.exoplayer2.audio.b, com.google.android.exoplayer2.audio.AudioProcessor[], com.google.android.exoplayer2.audio.AudioTrack$c):void");
    }

    /* renamed from: a */
    public boolean m7834a(String str) {
        return (this.f6576c == null || this.f6576c.m7855a(m7808b(str)) == null) ? null : true;
    }

    /* renamed from: a */
    public long m7828a(boolean z) {
        if (!m7819p()) {
            return Long.MIN_VALUE;
        }
        if (this.f6586m.getPlayState() == 3) {
            m7820q();
        }
        long nanoTime = System.nanoTime() / 1000;
        if (this.f6555F) {
            nanoTime = m7812c(this.f6583j.mo1529f() + m7813d(nanoTime - (this.f6583j.mo1528e() / 1000)));
        } else {
            if (this.f6552C == 0) {
                nanoTime = this.f6583j.m7791c();
            } else {
                nanoTime += this.f6553D;
            }
            if (!z) {
                nanoTime -= this.f6568S;
            }
        }
        return this.f6566Q + m7809b(nanoTime);
    }

    /* renamed from: a */
    public void m7833a(String str, int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        boolean z = true;
        boolean equals = "audio/raw".equals(str) ^ true;
        str = equals ? m7808b(str) : i3;
        if (equals) {
            i3 = 0;
        } else {
            this.f6558I = C2186s.m8055b(i3, i);
            this.f6577d.m19637a(iArr);
            i3 = this.f6579f;
            iArr = i3.length;
            i5 = str;
            int i6 = i;
            str = null;
            i = 0;
            while (str < iArr) {
                AudioProcessor audioProcessor = i3[str];
                try {
                    i |= audioProcessor.mo1532a(i2, i6, i5);
                    if (audioProcessor.mo1531a()) {
                        i6 = audioProcessor.mo1533b();
                        i5 = audioProcessor.mo1534c();
                    }
                    str++;
                } catch (Throwable e) {
                    throw new ConfigurationException(e);
                }
            }
            if (i != 0) {
                m7814k();
            }
            i3 = i;
            i = i6;
            str = i5;
        }
        iArr = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = 220;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = C2162b.f6691a;
                break;
            default:
                i2 = new StringBuilder();
                i2.append("Unsupported channel count: ");
                i2.append(i);
                throw new ConfigurationException(i2.toString());
        }
        if (C2186s.f6761a <= 23 && "foster".equals(C2186s.f6762b) && "NVIDIA".equals(C2186s.f6763c)) {
            if (!(i == 3 || i == 5)) {
                if (i == 7) {
                    iArr = C2162b.f6691a;
                }
            }
            if (C2186s.f6761a <= 25 && "fugu".equals(C2186s.f6762b) && equals && i == 1) {
                iArr = 12;
            }
            if (i3 == 0 || m7822s() == 0 || this.f6589p != str || this.f6587n != i2 || this.f6588o != iArr) {
                m7844i();
                this.f6589p = str;
                this.f6592s = equals;
                this.f6587n = i2;
                this.f6588o = iArr;
                if (equals) {
                    str = 2;
                }
                this.f6590q = str;
                this.f6561L = C2186s.m8055b(2, i);
                if (i4 != 0) {
                    this.f6593t = i4;
                } else if (equals) {
                    str = android.media.AudioTrack.getMinBufferSize(i2, iArr, this.f6590q);
                    if (str != -2) {
                        z = false;
                    }
                    C2163a.m7918b(z);
                    i = str * 4;
                    i2 = ((int) m7813d(250000)) * this.f6561L;
                    str = (int) Math.max((long) str, m7813d(750000) * ((long) this.f6561L));
                    if (i < i2) {
                        str = i2;
                    } else if (i > str) {
                        str = i;
                    }
                    this.f6593t = str;
                } else {
                    if (this.f6590q != 5) {
                        if (this.f6590q == 6) {
                            this.f6593t = 49152;
                        }
                    }
                    this.f6593t = 20480;
                }
                if (equals) {
                    str = m7812c((long) (this.f6593t / this.f6561L));
                } else {
                    str = 1;
                }
                this.f6594u = str;
                m7829a(this.f6596w);
            }
            return;
        }
        iArr = i5;
        iArr = 12;
        if (i3 == 0) {
        }
        m7844i();
        this.f6589p = str;
        this.f6592s = equals;
        this.f6587n = i2;
        this.f6588o = iArr;
        if (equals) {
            str = 2;
        }
        this.f6590q = str;
        this.f6561L = C2186s.m8055b(2, i);
        if (i4 != 0) {
            this.f6593t = i4;
        } else if (equals) {
            str = android.media.AudioTrack.getMinBufferSize(i2, iArr, this.f6590q);
            if (str != -2) {
                z = false;
            }
            C2163a.m7918b(z);
            i = str * 4;
            i2 = ((int) m7813d(250000)) * this.f6561L;
            str = (int) Math.max((long) str, m7813d(750000) * ((long) this.f6561L));
            if (i < i2) {
                str = i2;
            } else if (i > str) {
                str = i;
            }
            this.f6593t = str;
        } else {
            if (this.f6590q != 5) {
                if (this.f6590q == 6) {
                    this.f6593t = 49152;
                }
            }
            this.f6593t = 20480;
        }
        if (equals) {
            str = m7812c((long) (this.f6593t / this.f6561L));
        } else {
            str = 1;
        }
        this.f6594u = str;
        m7829a(this.f6596w);
    }

    /* renamed from: k */
    private void m7814k() {
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : this.f6579f) {
            if (audioProcessor.mo1531a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.mo1538g();
            }
        }
        int size = arrayList.size();
        this.f6570U = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f6571V = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            AudioProcessor audioProcessor2 = this.f6570U[i];
            audioProcessor2.mo1538g();
            this.f6571V[i] = audioProcessor2.mo1536e();
        }
    }

    /* renamed from: l */
    private void m7815l() {
        this.f6581h.block();
        if (this.ae) {
            r0.f6586m = m7804a(r0.f6587n, r0.f6588o, r0.f6590q, r0.f6593t, r0.ad);
        } else if (r0.ad == 0) {
            r0.f6586m = new android.media.AudioTrack(r0.f6591r, r0.f6587n, r0.f6588o, r0.f6590q, r0.f6593t, 1);
        } else {
            r0.f6586m = new android.media.AudioTrack(r0.f6591r, r0.f6587n, r0.f6588o, r0.f6590q, r0.f6593t, 1, r0.ad);
        }
        m7821r();
        int audioSessionId = r0.f6586m.getAudioSessionId();
        if (f6548a && C2186s.f6761a < 21) {
            if (!(r0.f6585l == null || audioSessionId == r0.f6585l.getAudioSessionId())) {
                m7818o();
            }
            if (r0.f6585l == null) {
                r0.f6585l = new android.media.AudioTrack(r0.f6591r, 4000, 4, 2, 2, 0, audioSessionId);
            }
        }
        if (r0.ad != audioSessionId) {
            r0.ad = audioSessionId;
            r0.f6580g.mo1541a(audioSessionId);
        }
        r0.f6583j.mo1526a(r0.f6586m, m7826w());
        m7817n();
        r0.af = false;
    }

    /* renamed from: a */
    public void m7830a() {
        this.ac = true;
        if (m7822s()) {
            this.f6567R = System.nanoTime() / 1000;
            this.f6586m.play();
        }
    }

    /* renamed from: b */
    public void m7836b() {
        if (this.f6565P == 1) {
            this.f6565P = 2;
        }
    }

    /* renamed from: a */
    public boolean m7835a(ByteBuffer byteBuffer, long j) {
        boolean z;
        long c;
        int i;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        if (this.f6572W != null) {
            if (byteBuffer2 != r0.f6572W) {
                z = false;
                C2163a.m7916a(z);
                if (!m7822s()) {
                    m7815l();
                    if (r0.ac) {
                        m7830a();
                    }
                }
                if (m7826w()) {
                    if (r0.f6586m.getPlayState() != 2) {
                        r0.af = false;
                        return false;
                    } else if (r0.f6586m.getPlayState() == 1 && r0.f6583j.m7790b() != 0) {
                        return false;
                    }
                }
                z = r0.af;
                r0.af = m7840e();
                if (!(!z || r0.af || r0.f6586m.getPlayState() == 1)) {
                    r0.f6580g.mo1542a(r0.f6593t, C2162b.m7911a(r0.f6594u), SystemClock.elapsedRealtime() - r0.ag);
                }
                if (r0.f6572W == null) {
                    if (!byteBuffer.hasRemaining()) {
                        return true;
                    }
                    if (r0.f6592s && r0.f6564O == 0) {
                        r0.f6564O = m7801a(r0.f6590q, byteBuffer2);
                    }
                    if (r0.f6595v != null) {
                        if (!m7816m()) {
                            return false;
                        }
                        LinkedList linkedList = r0.f6584k;
                        C2134d c2134d = r11;
                        C2134d c2134d2 = new C2134d(r0.f6595v, Math.max(0, j2), m7812c(m7824u()));
                        linkedList.add(c2134d);
                        r0.f6595v = null;
                        m7814k();
                    }
                    if (r0.f6565P != 0) {
                        r0.f6566Q = Math.max(0, j2);
                        r0.f6565P = 1;
                    } else {
                        c = r0.f6566Q + m7812c(m7823t());
                        if (r0.f6565P == 1 || Math.abs(c - j2) <= 200000) {
                            i = 2;
                        } else {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Discontinuity detected [expected ");
                            stringBuilder.append(c);
                            stringBuilder.append(", got ");
                            stringBuilder.append(j2);
                            stringBuilder.append("]");
                            Log.e("AudioTrack", stringBuilder.toString());
                            i = 2;
                            r0.f6565P = 2;
                        }
                        if (r0.f6565P == i) {
                            r0.f6566Q += j2 - c;
                            r0.f6565P = 1;
                            r0.f6580g.mo1540a();
                        }
                    }
                    if (r0.f6592s) {
                        r0.f6559J += (long) byteBuffer.remaining();
                    } else {
                        r0.f6560K += (long) r0.f6564O;
                    }
                    r0.f6572W = byteBuffer2;
                }
                if (r0.f6592s) {
                    m7806a(j2);
                } else {
                    m7811b(r0.f6572W, j2);
                }
                if (!r0.f6572W.hasRemaining()) {
                    return false;
                }
                r0.f6572W = null;
                return true;
            }
        }
        z = true;
        C2163a.m7916a(z);
        if (m7822s()) {
            m7815l();
            if (r0.ac) {
                m7830a();
            }
        }
        if (m7826w()) {
            if (r0.f6586m.getPlayState() != 2) {
                return false;
            }
            r0.af = false;
            return false;
        }
        z = r0.af;
        r0.af = m7840e();
        r0.f6580g.mo1542a(r0.f6593t, C2162b.m7911a(r0.f6594u), SystemClock.elapsedRealtime() - r0.ag);
        if (r0.f6572W == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            r0.f6564O = m7801a(r0.f6590q, byteBuffer2);
            if (r0.f6595v != null) {
                if (!m7816m()) {
                    return false;
                }
                LinkedList linkedList2 = r0.f6584k;
                C2134d c2134d3 = c2134d2;
                C2134d c2134d22 = new C2134d(r0.f6595v, Math.max(0, j2), m7812c(m7824u()));
                linkedList2.add(c2134d3);
                r0.f6595v = null;
                m7814k();
            }
            if (r0.f6565P != 0) {
                c = r0.f6566Q + m7812c(m7823t());
                if (r0.f6565P == 1) {
                }
                i = 2;
                if (r0.f6565P == i) {
                    r0.f6566Q += j2 - c;
                    r0.f6565P = 1;
                    r0.f6580g.mo1540a();
                }
            } else {
                r0.f6566Q = Math.max(0, j2);
                r0.f6565P = 1;
            }
            if (r0.f6592s) {
                r0.f6559J += (long) byteBuffer.remaining();
            } else {
                r0.f6560K += (long) r0.f6564O;
            }
            r0.f6572W = byteBuffer2;
        }
        if (r0.f6592s) {
            m7806a(j2);
        } else {
            m7811b(r0.f6572W, j2);
        }
        if (!r0.f6572W.hasRemaining()) {
            return false;
        }
        r0.f6572W = null;
        return true;
    }

    /* renamed from: a */
    private void m7806a(long j) {
        int length = this.f6570U.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer = i > 0 ? this.f6571V[i - 1] : this.f6572W != null ? this.f6572W : AudioProcessor.f6531a;
            if (i == length) {
                m7811b(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f6570U[i];
                audioProcessor.mo1530a(byteBuffer);
                ByteBuffer e = audioProcessor.mo1536e();
                this.f6571V[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private boolean m7811b(ByteBuffer byteBuffer, long j) {
        if (!byteBuffer.hasRemaining()) {
            return true;
        }
        int remaining;
        if (this.f6573X != null) {
            C2163a.m7916a(this.f6573X == byteBuffer);
        } else {
            this.f6573X = byteBuffer;
            if (C2186s.f6761a < 21) {
                remaining = byteBuffer.remaining();
                if (this.f6574Y == null || this.f6574Y.length < remaining) {
                    this.f6574Y = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.f6574Y, 0, remaining);
                byteBuffer.position(position);
                this.f6575Z = 0;
            }
        }
        remaining = byteBuffer.remaining();
        if (C2186s.f6761a < 21) {
            int b = this.f6593t - ((int) (this.f6562M - (this.f6583j.m7790b() * ((long) this.f6561L))));
            if (b > 0) {
                j = this.f6586m.write(this.f6574Y, this.f6575Z, Math.min(remaining, b));
                if (j > null) {
                    this.f6575Z += j;
                    byteBuffer.position(byteBuffer.position() + j);
                }
            } else {
                j = null;
            }
        } else if (this.ae) {
            C2163a.m7918b(j != -9223372036854775807L);
            j = m7803a(this.f6586m, byteBuffer, remaining, j);
        } else {
            j = m7802a(this.f6586m, byteBuffer, remaining);
        }
        this.ag = SystemClock.elapsedRealtime();
        if (j >= null) {
            if (this.f6592s == null) {
                this.f6562M += (long) j;
            }
            if (j != remaining) {
                return false;
            }
            if (this.f6592s != null) {
                this.f6563N += (long) this.f6564O;
            }
            this.f6573X = null;
            return true;
        }
        throw new WriteException(j);
    }

    /* renamed from: c */
    public void m7838c() {
        if (!this.ab) {
            if (m7822s()) {
                if (m7816m()) {
                    this.f6583j.m7788a(m7824u());
                    this.f6550A = 0;
                    this.ab = true;
                }
            }
        }
    }

    /* renamed from: m */
    private boolean m7816m() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:37)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:61)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r8 = this;
        r0 = r8.aa;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        if (r0 != r1) goto L_0x0014;
    L_0x0007:
        r0 = r8.f6592s;
        if (r0 == 0) goto L_0x000f;
    L_0x000b:
        r0 = r8.f6570U;
        r0 = r0.length;
        goto L_0x0010;
    L_0x000f:
        r0 = 0;
    L_0x0010:
        r8.aa = r0;
    L_0x0012:
        r0 = 1;
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        r4 = r8.aa;
        r5 = r8.f6570U;
        r5 = r5.length;
        r6 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r4 >= r5) goto L_0x003c;
    L_0x0021:
        r4 = r8.f6570U;
        r5 = r8.aa;
        r4 = r4[r5];
        if (r0 == 0) goto L_0x002c;
    L_0x0029:
        r4.mo1535d();
    L_0x002c:
        r8.m7806a(r6);
        r0 = r4.mo1537f();
        if (r0 != 0) goto L_0x0036;
    L_0x0035:
        return r3;
    L_0x0036:
        r0 = r8.aa;
        r0 = r0 + r2;
        r8.aa = r0;
        goto L_0x0012;
    L_0x003c:
        r0 = r8.f6573X;
        if (r0 == 0) goto L_0x004a;
    L_0x0040:
        r0 = r8.f6573X;
        r8.m7811b(r0, r6);
        r0 = r8.f6573X;
        if (r0 == 0) goto L_0x004a;
    L_0x0049:
        return r3;
    L_0x004a:
        r8.aa = r1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.m():boolean");
    }

    /* renamed from: d */
    public boolean m7839d() {
        if (m7822s()) {
            if (!this.ab || m7840e()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public boolean m7840e() {
        return m7822s() && (m7824u() > this.f6583j.m7790b() || m7827x());
    }

    /* renamed from: a */
    public C2276k m7829a(C2276k c2276k) {
        if (this.f6592s) {
            this.f6596w = C2276k.f7224a;
            return this.f6596w;
        }
        C2276k c2276k2 = new C2276k(this.f6578e.m19660a(c2276k.f7225b), this.f6578e.m19664b(c2276k.f7226c));
        c2276k = this.f6595v != null ? this.f6595v : this.f6584k.isEmpty() == null ? ((C2134d) this.f6584k.getLast()).f6545a : this.f6596w;
        if (c2276k2.equals(c2276k) == null) {
            if (m7822s() != null) {
                this.f6595v = c2276k2;
            } else {
                this.f6596w = c2276k2;
            }
        }
        return this.f6596w;
    }

    /* renamed from: f */
    public C2276k m7841f() {
        return this.f6596w;
    }

    /* renamed from: a */
    public void m7832a(int i) {
        if (this.f6591r != i) {
            this.f6591r = i;
            if (this.ae == 0) {
                m7844i();
                this.ad = 0;
            }
        }
    }

    /* renamed from: b */
    public void m7837b(int i) {
        C2163a.m7918b(C2186s.f6761a >= 21);
        if (!this.ae || this.ad != i) {
            this.ae = true;
            this.ad = i;
            m7844i();
        }
    }

    /* renamed from: g */
    public void m7842g() {
        if (this.ae) {
            this.ae = false;
            this.ad = 0;
            m7844i();
        }
    }

    /* renamed from: a */
    public void m7831a(float f) {
        if (this.f6569T != f) {
            this.f6569T = f;
            m7817n();
        }
    }

    /* renamed from: n */
    private void m7817n() {
        if (!m7822s()) {
            return;
        }
        if (C2186s.f6761a >= 21) {
            m7807a(this.f6586m, this.f6569T);
        } else {
            m7810b(this.f6586m, this.f6569T);
        }
    }

    /* renamed from: h */
    public void m7843h() {
        this.ac = false;
        if (m7822s()) {
            m7825v();
            this.f6583j.m7787a();
        }
    }

    /* renamed from: i */
    public void m7844i() {
        if (m7822s()) {
            this.f6559J = 0;
            this.f6560K = 0;
            this.f6562M = 0;
            this.f6563N = 0;
            this.f6564O = 0;
            if (this.f6595v != null) {
                this.f6596w = this.f6595v;
                this.f6595v = null;
            } else if (!this.f6584k.isEmpty()) {
                this.f6596w = ((C2134d) this.f6584k.getLast()).f6545a;
            }
            this.f6584k.clear();
            this.f6597x = 0;
            this.f6598y = 0;
            this.f6572W = null;
            this.f6573X = null;
            for (int i = 0; i < this.f6570U.length; i++) {
                AudioProcessor audioProcessor = this.f6570U[i];
                audioProcessor.mo1538g();
                this.f6571V[i] = audioProcessor.mo1536e();
            }
            this.ab = false;
            this.aa = -1;
            this.f6599z = null;
            this.f6550A = 0;
            this.f6565P = 0;
            this.f6568S = 0;
            m7825v();
            if (this.f6586m.getPlayState() == 3) {
                this.f6586m.pause();
            }
            final android.media.AudioTrack audioTrack = this.f6586m;
            this.f6586m = null;
            this.f6583j.mo1526a(null, false);
            this.f6581h.close();
            new Thread(this) {
                /* renamed from: b */
                final /* synthetic */ AudioTrack f6533b;

                public void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        this.f6533b.f6581h.open();
                    }
                }
            }.start();
        }
    }

    /* renamed from: j */
    public void m7845j() {
        m7844i();
        m7818o();
        for (AudioProcessor h : this.f6579f) {
            h.mo1539h();
        }
        this.ad = 0;
        this.ac = false;
    }

    /* renamed from: o */
    private void m7818o() {
        if (this.f6585l != null) {
            final android.media.AudioTrack audioTrack = this.f6585l;
            this.f6585l = null;
            new Thread(this) {
                /* renamed from: b */
                final /* synthetic */ AudioTrack f6535b;

                public void run() {
                    audioTrack.release();
                }
            }.start();
        }
    }

    /* renamed from: p */
    private boolean m7819p() {
        return m7822s() && this.f6565P != 0;
    }

    /* renamed from: b */
    private long m7809b(long j) {
        while (!this.f6584k.isEmpty() && j >= ((C2134d) this.f6584k.getFirst()).f6547c) {
            C2134d c2134d = (C2134d) this.f6584k.remove();
            this.f6596w = c2134d.f6545a;
            this.f6598y = c2134d.f6547c;
            this.f6597x = c2134d.f6546b - this.f6566Q;
        }
        if (this.f6596w.f7225b == 1.0f) {
            return (j + this.f6597x) - this.f6598y;
        }
        if (this.f6584k.isEmpty() && this.f6578e.m19673j() >= 1024) {
            return this.f6597x + C2186s.m8057b(j - this.f6598y, this.f6578e.m19672i(), this.f6578e.m19673j());
        }
        long j2 = this.f6597x;
        double d = (double) this.f6596w.f7225b;
        j = (double) (j - this.f6598y);
        Double.isNaN(d);
        Double.isNaN(j);
        return j2 + ((long) (d * j));
    }

    /* renamed from: q */
    private void m7820q() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r17 = this;
        r0 = r17;
        r1 = r0.f6583j;
        r1 = r1.m7791c();
        r3 = 0;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 != 0) goto L_0x000f;
    L_0x000e:
        return;
    L_0x000f:
        r5 = java.lang.System.nanoTime();
        r7 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 / r7;
        r9 = r0.f6554E;
        r9 = r5 - r9;
        r11 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r13 = 0;
        r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r14 < 0) goto L_0x0057;
    L_0x0021:
        r9 = r0.f6582i;
        r10 = r0.f6551B;
        r11 = r1 - r5;
        r9[r10] = r11;
        r9 = r0.f6551B;
        r9 = r9 + 1;
        r10 = 10;
        r9 = r9 % r10;
        r0.f6551B = r9;
        r9 = r0.f6552C;
        if (r9 >= r10) goto L_0x003c;
    L_0x0036:
        r9 = r0.f6552C;
        r9 = r9 + 1;
        r0.f6552C = r9;
    L_0x003c:
        r0.f6554E = r5;
        r0.f6553D = r3;
        r9 = 0;
    L_0x0041:
        r10 = r0.f6552C;
        if (r9 >= r10) goto L_0x0057;
    L_0x0045:
        r10 = r0.f6553D;
        r12 = r0.f6582i;
        r14 = r12[r9];
        r12 = r0.f6552C;
        r3 = (long) r12;
        r14 = r14 / r3;
        r10 = r10 + r14;
        r0.f6553D = r10;
        r9 = r9 + 1;
        r3 = 0;
        goto L_0x0041;
    L_0x0057:
        r3 = r17.m7826w();
        if (r3 == 0) goto L_0x005e;
    L_0x005d:
        return;
    L_0x005e:
        r3 = r0.f6556G;
        r3 = r5 - r3;
        r9 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r11 < 0) goto L_0x0171;
    L_0x0069:
        r3 = r0.f6583j;
        r3 = r3.mo1527d();
        r0.f6555F = r3;
        r3 = r0.f6555F;
        r9 = 5000000; // 0x4c4b40 float:7.006492E-39 double:2.470328E-317;
        if (r3 == 0) goto L_0x011d;
    L_0x0078:
        r3 = r0.f6583j;
        r3 = r3.mo1528e();
        r3 = r3 / r7;
        r11 = r0.f6583j;
        r11 = r11.mo1529f();
        r14 = r0.f6567R;
        r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1));
        if (r16 >= 0) goto L_0x008f;
    L_0x008b:
        r0.f6555F = r13;
        goto L_0x011d;
    L_0x008f:
        r14 = 0;
        r14 = r3 - r5;
        r14 = java.lang.Math.abs(r14);
        r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1));
        if (r16 <= 0) goto L_0x00d5;
    L_0x009a:
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r15 = "Spurious audio timestamp (system clock mismatch): ";
        r14.append(r15);
        r14.append(r11);
        r11 = ", ";
        r14.append(r11);
        r14.append(r3);
        r3 = ", ";
        r14.append(r3);
        r14.append(r5);
        r3 = ", ";
        r14.append(r3);
        r14.append(r1);
        r1 = r14.toString();
        r2 = f6549b;
        if (r2 != 0) goto L_0x00cf;
    L_0x00c7:
        r2 = "AudioTrack";
        android.util.Log.w(r2, r1);
        r0.f6555F = r13;
        goto L_0x011d;
    L_0x00cf:
        r2 = new com.google.android.exoplayer2.audio.AudioTrack$InvalidAudioTrackTimestampException;
        r2.<init>(r1);
        throw r2;
    L_0x00d5:
        r14 = r0.m7812c(r11);
        r14 = r14 - r1;
        r14 = java.lang.Math.abs(r14);
        r16 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1));
        if (r16 <= 0) goto L_0x011d;
    L_0x00e2:
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r15 = "Spurious audio timestamp (frame position mismatch): ";
        r14.append(r15);
        r14.append(r11);
        r11 = ", ";
        r14.append(r11);
        r14.append(r3);
        r3 = ", ";
        r14.append(r3);
        r14.append(r5);
        r3 = ", ";
        r14.append(r3);
        r14.append(r1);
        r1 = r14.toString();
        r2 = f6549b;
        if (r2 != 0) goto L_0x0117;
    L_0x010f:
        r2 = "AudioTrack";
        android.util.Log.w(r2, r1);
        r0.f6555F = r13;
        goto L_0x011d;
    L_0x0117:
        r2 = new com.google.android.exoplayer2.audio.AudioTrack$InvalidAudioTrackTimestampException;
        r2.<init>(r1);
        throw r2;
    L_0x011d:
        r1 = r0.f6557H;
        if (r1 == 0) goto L_0x016f;
    L_0x0121:
        r1 = r0.f6592s;
        if (r1 != 0) goto L_0x016f;
    L_0x0125:
        r1 = 0;
        r2 = r0.f6557H;	 Catch:{ Exception -> 0x016d }
        r3 = r0.f6586m;	 Catch:{ Exception -> 0x016d }
        r4 = r1;	 Catch:{ Exception -> 0x016d }
        r4 = (java.lang.Object[]) r4;	 Catch:{ Exception -> 0x016d }
        r2 = r2.invoke(r3, r4);	 Catch:{ Exception -> 0x016d }
        r2 = (java.lang.Integer) r2;	 Catch:{ Exception -> 0x016d }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x016d }
        r2 = (long) r2;	 Catch:{ Exception -> 0x016d }
        r2 = r2 * r7;	 Catch:{ Exception -> 0x016d }
        r7 = r0.f6594u;	 Catch:{ Exception -> 0x016d }
        r4 = 0;	 Catch:{ Exception -> 0x016d }
        r2 = r2 - r7;	 Catch:{ Exception -> 0x016d }
        r0.f6568S = r2;	 Catch:{ Exception -> 0x016d }
        r2 = r0.f6568S;	 Catch:{ Exception -> 0x016d }
        r7 = 0;	 Catch:{ Exception -> 0x016d }
        r2 = java.lang.Math.max(r2, r7);	 Catch:{ Exception -> 0x016d }
        r0.f6568S = r2;	 Catch:{ Exception -> 0x016d }
        r2 = r0.f6568S;	 Catch:{ Exception -> 0x016d }
        r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));	 Catch:{ Exception -> 0x016d }
        if (r4 <= 0) goto L_0x016f;	 Catch:{ Exception -> 0x016d }
    L_0x0150:
        r2 = "AudioTrack";	 Catch:{ Exception -> 0x016d }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x016d }
        r3.<init>();	 Catch:{ Exception -> 0x016d }
        r4 = "Ignoring impossibly large audio latency: ";	 Catch:{ Exception -> 0x016d }
        r3.append(r4);	 Catch:{ Exception -> 0x016d }
        r7 = r0.f6568S;	 Catch:{ Exception -> 0x016d }
        r3.append(r7);	 Catch:{ Exception -> 0x016d }
        r3 = r3.toString();	 Catch:{ Exception -> 0x016d }
        android.util.Log.w(r2, r3);	 Catch:{ Exception -> 0x016d }
        r2 = 0;	 Catch:{ Exception -> 0x016d }
        r0.f6568S = r2;	 Catch:{ Exception -> 0x016d }
        goto L_0x016f;
    L_0x016d:
        r0.f6557H = r1;
    L_0x016f:
        r0.f6556G = r5;
    L_0x0171:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.q():void");
    }

    /* renamed from: r */
    private void m7821r() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r5 = this;
        r0 = r5.f6586m;
        r0 = r0.getState();
        r1 = 1;
        if (r0 != r1) goto L_0x000a;
    L_0x0009:
        return;
    L_0x000a:
        r1 = 0;
        r2 = r5.f6586m;	 Catch:{ Exception -> 0x0015, all -> 0x0011 }
        r2.release();	 Catch:{ Exception -> 0x0015, all -> 0x0011 }
        goto L_0x0015;
    L_0x0011:
        r0 = move-exception;
        r5.f6586m = r1;
        throw r0;
    L_0x0015:
        r5.f6586m = r1;
        r1 = new com.google.android.exoplayer2.audio.AudioTrack$InitializationException;
        r2 = r5.f6587n;
        r3 = r5.f6588o;
        r4 = r5.f6593t;
        r1.<init>(r0, r2, r3, r4);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioTrack.r():void");
    }

    /* renamed from: s */
    private boolean m7822s() {
        return this.f6586m != null;
    }

    /* renamed from: c */
    private long m7812c(long j) {
        return (j * 1000000) / ((long) this.f6587n);
    }

    /* renamed from: d */
    private long m7813d(long j) {
        return (j * ((long) this.f6587n)) / 1000000;
    }

    /* renamed from: t */
    private long m7823t() {
        return this.f6592s ? this.f6560K : this.f6559J / ((long) this.f6558I);
    }

    /* renamed from: u */
    private long m7824u() {
        return this.f6592s ? this.f6563N : this.f6562M / ((long) this.f6561L);
    }

    /* renamed from: v */
    private void m7825v() {
        this.f6553D = 0;
        this.f6552C = 0;
        this.f6551B = 0;
        this.f6554E = 0;
        this.f6555F = false;
        this.f6556G = 0;
    }

    /* renamed from: w */
    private boolean m7826w() {
        return C2186s.f6761a < 23 && (this.f6590q == 5 || this.f6590q == 6);
    }

    /* renamed from: x */
    private boolean m7827x() {
        return m7826w() && this.f6586m.getPlayState() == 2 && this.f6586m.getPlaybackHeadPosition() == 0;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static android.media.AudioTrack m7804a(int i, int i2, int i3, int i4, int i5) {
        return new android.media.AudioTrack(new Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(i2).setEncoding(i3).setSampleRate(i).build(), i4, 1, i5);
    }

    /* renamed from: b */
    private static int m7808b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1095064472) {
            if (hashCode != 187078296) {
                if (hashCode != 1504578661) {
                    if (hashCode == 1505942594) {
                        if (str.equals("audio/vnd.dts.hd") != null) {
                            str = 3;
                            switch (str) {
                                case null:
                                    return 5;
                                case 1:
                                    return 6;
                                case 2:
                                    return 7;
                                case 3:
                                    return 8;
                                default:
                                    return 0;
                            }
                        }
                    }
                } else if (str.equals("audio/eac3") != null) {
                    str = true;
                    switch (str) {
                        case null:
                            return 5;
                        case 1:
                            return 6;
                        case 2:
                            return 7;
                        case 3:
                            return 8;
                        default:
                            return 0;
                    }
                }
            } else if (str.equals("audio/ac3") != null) {
                str = null;
                switch (str) {
                    case null:
                        return 5;
                    case 1:
                        return 6;
                    case 2:
                        return 7;
                    case 3:
                        return 8;
                    default:
                        return 0;
                }
            }
        } else if (str.equals("audio/vnd.dts") != null) {
            str = 2;
            switch (str) {
                case null:
                    return 5;
                case 1:
                    return 6;
                case 2:
                    return 7;
                case 3:
                    return 8;
                default:
                    return 0;
            }
        }
        str = -1;
        switch (str) {
            case null:
                return 5;
            case 1:
                return 6;
            case 2:
                return 7;
            case 3:
                return 8;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    private static int m7801a(int i, ByteBuffer byteBuffer) {
        if (i != 7) {
            if (i != 8) {
                if (i == 5) {
                    return C2137a.m7846a();
                }
                if (i == 6) {
                    return C2137a.m7848a(byteBuffer);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected audio encoding: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return C2147e.m7869a(byteBuffer);
    }

    @TargetApi(21)
    /* renamed from: a */
    private static int m7802a(android.media.AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    /* renamed from: a */
    private int m7803a(android.media.AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f6599z == null) {
            this.f6599z = ByteBuffer.allocate(16);
            this.f6599z.order(ByteOrder.BIG_ENDIAN);
            this.f6599z.putInt(1431633921);
        }
        if (this.f6550A == 0) {
            this.f6599z.putInt(4, i);
            this.f6599z.putLong(8, j * 1000);
            this.f6599z.position(0);
            this.f6550A = i;
        }
        j = this.f6599z.remaining();
        if (j > null) {
            int write = audioTrack.write(this.f6599z, j, 1);
            if (write < 0) {
                this.f6550A = 0;
                return write;
            } else if (write < j) {
                return 0;
            }
        }
        audioTrack = m7802a(audioTrack, byteBuffer, i);
        if (audioTrack < null) {
            this.f6550A = 0;
            return audioTrack;
        }
        this.f6550A -= audioTrack;
        return audioTrack;
    }

    @TargetApi(21)
    /* renamed from: a */
    private static void m7807a(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: b */
    private static void m7810b(android.media.AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }
}
