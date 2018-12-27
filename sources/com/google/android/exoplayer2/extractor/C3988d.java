package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C2274i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p124a.C3946e;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.upstream.C2363a;
import com.google.android.exoplayer2.upstream.C2364b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.exoplayer2.extractor.d */
public final class C3988d implements C2267n {
    /* renamed from: a */
    private final C2364b f15953a;
    /* renamed from: b */
    private final int f15954b;
    /* renamed from: c */
    private final C2225b f15955c = new C2225b();
    /* renamed from: d */
    private final LinkedBlockingDeque<C2363a> f15956d = new LinkedBlockingDeque();
    /* renamed from: e */
    private final C2224a f15957e = new C2224a();
    /* renamed from: f */
    private final C2175k f15958f = new C2175k(32);
    /* renamed from: g */
    private final AtomicInteger f15959g = new AtomicInteger();
    /* renamed from: h */
    private long f15960h;
    /* renamed from: i */
    private Format f15961i;
    /* renamed from: j */
    private boolean f15962j;
    /* renamed from: k */
    private Format f15963k;
    /* renamed from: l */
    private long f15964l;
    /* renamed from: m */
    private long f15965m;
    /* renamed from: n */
    private C2363a f15966n;
    /* renamed from: o */
    private int f15967o = this.f15954b;
    /* renamed from: p */
    private boolean f15968p;
    /* renamed from: q */
    private C2226c f15969q;

    /* renamed from: com.google.android.exoplayer2.extractor.d$a */
    private static final class C2224a {
        /* renamed from: a */
        public int f6999a;
        /* renamed from: b */
        public long f7000b;
        /* renamed from: c */
        public long f7001c;
        /* renamed from: d */
        public byte[] f7002d;

        private C2224a() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d$b */
    private static final class C2225b {
        /* renamed from: a */
        private int f7003a = 1000;
        /* renamed from: b */
        private int[] f7004b = new int[this.f7003a];
        /* renamed from: c */
        private long[] f7005c = new long[this.f7003a];
        /* renamed from: d */
        private int[] f7006d = new int[this.f7003a];
        /* renamed from: e */
        private int[] f7007e = new int[this.f7003a];
        /* renamed from: f */
        private long[] f7008f = new long[this.f7003a];
        /* renamed from: g */
        private byte[][] f7009g = new byte[this.f7003a][];
        /* renamed from: h */
        private Format[] f7010h = new Format[this.f7003a];
        /* renamed from: i */
        private int f7011i;
        /* renamed from: j */
        private int f7012j;
        /* renamed from: k */
        private int f7013k;
        /* renamed from: l */
        private int f7014l;
        /* renamed from: m */
        private long f7015m = Long.MIN_VALUE;
        /* renamed from: n */
        private long f7016n = Long.MIN_VALUE;
        /* renamed from: o */
        private boolean f7017o = true;
        /* renamed from: p */
        private boolean f7018p = true;
        /* renamed from: q */
        private Format f7019q;
        /* renamed from: r */
        private int f7020r;

        /* renamed from: a */
        public void m8191a() {
            this.f7012j = 0;
            this.f7013k = 0;
            this.f7014l = 0;
            this.f7011i = 0;
            this.f7017o = true;
        }

        /* renamed from: b */
        public void m8195b() {
            this.f7015m = Long.MIN_VALUE;
            this.f7016n = Long.MIN_VALUE;
        }

        /* renamed from: c */
        public int m8197c() {
            return this.f7012j + this.f7011i;
        }

        /* renamed from: a */
        public long m8189a(int i) {
            int c = m8197c() - i;
            boolean z = c >= 0 && c <= this.f7011i;
            C2163a.m7916a(z);
            if (c != 0) {
                this.f7011i -= c;
                this.f7014l = ((this.f7014l + this.f7003a) - c) % this.f7003a;
                this.f7016n = Long.MIN_VALUE;
                for (c = this.f7011i - 1; c >= 0; c--) {
                    int i2 = (this.f7013k + c) % this.f7003a;
                    this.f7016n = Math.max(this.f7016n, this.f7008f[i2]);
                    if ((this.f7007e[i2] & 1) != 0) {
                        break;
                    }
                }
                return this.f7005c[this.f7014l];
            } else if (this.f7012j == 0) {
                return 0;
            } else {
                c = (this.f7014l == 0 ? this.f7003a : this.f7014l) - 1;
                return this.f7005c[c] + ((long) this.f7006d[c]);
            }
        }

        /* renamed from: d */
        public synchronized boolean m8198d() {
            return this.f7011i == 0;
        }

        /* renamed from: e */
        public synchronized Format m8199e() {
            return this.f7018p ? null : this.f7019q;
        }

        /* renamed from: f */
        public synchronized long m8200f() {
            return Math.max(this.f7015m, this.f7016n);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public synchronized int m8188a(com.google.android.exoplayer2.C2274i r5, com.google.android.exoplayer2.p124a.C3946e r6, boolean r7, boolean r8, com.google.android.exoplayer2.Format r9, com.google.android.exoplayer2.extractor.C3988d.C2224a r10) {
            /*
            r4 = this;
            monitor-enter(r4);
            r0 = r4.f7011i;	 Catch:{ all -> 0x00a3 }
            r1 = -5;
            r2 = -3;
            r3 = -4;
            if (r0 != 0) goto L_0x0022;
        L_0x0008:
            if (r8 == 0) goto L_0x0010;
        L_0x000a:
            r5 = 4;
            r6.a_(r5);	 Catch:{ all -> 0x00a3 }
            monitor-exit(r4);
            return r3;
        L_0x0010:
            r6 = r4.f7019q;	 Catch:{ all -> 0x00a3 }
            if (r6 == 0) goto L_0x0020;
        L_0x0014:
            if (r7 != 0) goto L_0x001a;
        L_0x0016:
            r6 = r4.f7019q;	 Catch:{ all -> 0x00a3 }
            if (r6 == r9) goto L_0x0020;
        L_0x001a:
            r6 = r4.f7019q;	 Catch:{ all -> 0x00a3 }
            r5.f7223a = r6;	 Catch:{ all -> 0x00a3 }
            monitor-exit(r4);
            return r1;
        L_0x0020:
            monitor-exit(r4);
            return r2;
        L_0x0022:
            if (r7 != 0) goto L_0x0099;
        L_0x0024:
            r7 = r4.f7010h;	 Catch:{ all -> 0x00a3 }
            r8 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r7 = r7[r8];	 Catch:{ all -> 0x00a3 }
            if (r7 == r9) goto L_0x002d;
        L_0x002c:
            goto L_0x0099;
        L_0x002d:
            r5 = r6.m19608f();	 Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x0035;
        L_0x0033:
            monitor-exit(r4);
            return r2;
        L_0x0035:
            r5 = r4.f7008f;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r7 = r5[r7];	 Catch:{ all -> 0x00a3 }
            r6.f15689c = r7;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7007e;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r5 = r5[r7];	 Catch:{ all -> 0x00a3 }
            r6.a_(r5);	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7006d;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r5 = r5[r7];	 Catch:{ all -> 0x00a3 }
            r10.f6999a = r5;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7005c;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r7 = r5[r7];	 Catch:{ all -> 0x00a3 }
            r10.f7000b = r7;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7009g;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r5 = r5[r7];	 Catch:{ all -> 0x00a3 }
            r10.f7002d = r5;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7015m;	 Catch:{ all -> 0x00a3 }
            r5 = r6.f15689c;	 Catch:{ all -> 0x00a3 }
            r5 = java.lang.Math.max(r7, r5);	 Catch:{ all -> 0x00a3 }
            r4.f7015m = r5;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7011i;	 Catch:{ all -> 0x00a3 }
            r5 = r5 + -1;
            r4.f7011i = r5;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r5 = r5 + 1;
            r4.f7013k = r5;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7012j;	 Catch:{ all -> 0x00a3 }
            r5 = r5 + 1;
            r4.f7012j = r5;	 Catch:{ all -> 0x00a3 }
            r5 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r6 = r4.f7003a;	 Catch:{ all -> 0x00a3 }
            if (r5 != r6) goto L_0x0083;
        L_0x0080:
            r5 = 0;
            r4.f7013k = r5;	 Catch:{ all -> 0x00a3 }
        L_0x0083:
            r5 = r4.f7011i;	 Catch:{ all -> 0x00a3 }
            if (r5 <= 0) goto L_0x008f;
        L_0x0087:
            r5 = r4.f7005c;	 Catch:{ all -> 0x00a3 }
            r6 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r6 = r5[r6];	 Catch:{ all -> 0x00a3 }
            r5 = r6;
            goto L_0x0095;
        L_0x008f:
            r5 = r10.f7000b;	 Catch:{ all -> 0x00a3 }
            r7 = r10.f6999a;	 Catch:{ all -> 0x00a3 }
            r7 = (long) r7;	 Catch:{ all -> 0x00a3 }
            r5 = r5 + r7;
        L_0x0095:
            r10.f7001c = r5;	 Catch:{ all -> 0x00a3 }
            monitor-exit(r4);
            return r3;
        L_0x0099:
            r6 = r4.f7010h;	 Catch:{ all -> 0x00a3 }
            r7 = r4.f7013k;	 Catch:{ all -> 0x00a3 }
            r6 = r6[r7];	 Catch:{ all -> 0x00a3 }
            r5.f7223a = r6;	 Catch:{ all -> 0x00a3 }
            monitor-exit(r4);
            return r1;
        L_0x00a3:
            r5 = move-exception;
            monitor-exit(r4);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.d.b.a(com.google.android.exoplayer2.i, com.google.android.exoplayer2.a.e, boolean, boolean, com.google.android.exoplayer2.Format, com.google.android.exoplayer2.extractor.d$a):int");
        }

        /* renamed from: g */
        public synchronized long m8201g() {
            if (this.f7011i == 0) {
                return -1;
            }
            int i = ((this.f7013k + this.f7011i) - 1) % this.f7003a;
            this.f7013k = (this.f7013k + this.f7011i) % this.f7003a;
            this.f7012j += this.f7011i;
            this.f7011i = 0;
            return this.f7005c[i] + ((long) this.f7006d[i]);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public synchronized long m8190a(long r9, boolean r11) {
            /*
            r8 = this;
            monitor-enter(r8);
            r0 = r8.f7011i;	 Catch:{ all -> 0x0060 }
            r1 = -1;
            if (r0 == 0) goto L_0x005e;
        L_0x0007:
            r0 = r8.f7008f;	 Catch:{ all -> 0x0060 }
            r3 = r8.f7013k;	 Catch:{ all -> 0x0060 }
            r3 = r0[r3];	 Catch:{ all -> 0x0060 }
            r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
            if (r0 >= 0) goto L_0x0012;
        L_0x0011:
            goto L_0x005e;
        L_0x0012:
            r3 = r8.f7016n;	 Catch:{ all -> 0x0060 }
            r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1));
            if (r0 <= 0) goto L_0x001c;
        L_0x0018:
            if (r11 != 0) goto L_0x001c;
        L_0x001a:
            monitor-exit(r8);
            return r1;
        L_0x001c:
            r11 = 0;
            r0 = r8.f7013k;	 Catch:{ all -> 0x0060 }
            r3 = -1;
            r11 = -1;
            r4 = 0;
        L_0x0022:
            r5 = r8.f7014l;	 Catch:{ all -> 0x0060 }
            if (r0 == r5) goto L_0x0040;
        L_0x0026:
            r5 = r8.f7008f;	 Catch:{ all -> 0x0060 }
            r6 = r5[r0];	 Catch:{ all -> 0x0060 }
            r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
            if (r5 <= 0) goto L_0x002f;
        L_0x002e:
            goto L_0x0040;
        L_0x002f:
            r5 = r8.f7007e;	 Catch:{ all -> 0x0060 }
            r5 = r5[r0];	 Catch:{ all -> 0x0060 }
            r5 = r5 & 1;
            if (r5 == 0) goto L_0x0038;
        L_0x0037:
            r11 = r4;
        L_0x0038:
            r0 = r0 + 1;
            r5 = r8.f7003a;	 Catch:{ all -> 0x0060 }
            r0 = r0 % r5;
            r4 = r4 + 1;
            goto L_0x0022;
        L_0x0040:
            if (r11 != r3) goto L_0x0044;
        L_0x0042:
            monitor-exit(r8);
            return r1;
        L_0x0044:
            r9 = r8.f7013k;	 Catch:{ all -> 0x0060 }
            r9 = r9 + r11;
            r10 = r8.f7003a;	 Catch:{ all -> 0x0060 }
            r9 = r9 % r10;
            r8.f7013k = r9;	 Catch:{ all -> 0x0060 }
            r9 = r8.f7012j;	 Catch:{ all -> 0x0060 }
            r9 = r9 + r11;
            r8.f7012j = r9;	 Catch:{ all -> 0x0060 }
            r9 = r8.f7011i;	 Catch:{ all -> 0x0060 }
            r9 = r9 - r11;
            r8.f7011i = r9;	 Catch:{ all -> 0x0060 }
            r9 = r8.f7005c;	 Catch:{ all -> 0x0060 }
            r10 = r8.f7013k;	 Catch:{ all -> 0x0060 }
            r10 = r9[r10];	 Catch:{ all -> 0x0060 }
            monitor-exit(r8);
            return r10;
        L_0x005e:
            monitor-exit(r8);
            return r1;
        L_0x0060:
            r9 = move-exception;
            monitor-exit(r8);
            throw r9;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.d.b.a(long, boolean):long");
        }

        /* renamed from: a */
        public synchronized boolean m8194a(Format format) {
            if (format == null) {
                this.f7018p = true;
                return false;
            }
            this.f7018p = false;
            if (C2186s.m8052a((Object) format, this.f7019q)) {
                return false;
            }
            this.f7019q = format;
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public synchronized void m8193a(long r6, int r8, long r9, int r11, byte[] r12) {
            /*
            r5 = this;
            monitor-enter(r5);
            r0 = r5.f7017o;	 Catch:{ all -> 0x00ea }
            r1 = 0;
            if (r0 == 0) goto L_0x000e;
        L_0x0006:
            r0 = r8 & 1;
            if (r0 != 0) goto L_0x000c;
        L_0x000a:
            monitor-exit(r5);
            return;
        L_0x000c:
            r5.f7017o = r1;	 Catch:{ all -> 0x00ea }
        L_0x000e:
            r0 = r5.f7018p;	 Catch:{ all -> 0x00ea }
            r0 = r0 ^ 1;
            com.google.android.exoplayer2.p126c.C2163a.m7918b(r0);	 Catch:{ all -> 0x00ea }
            r5.m8192a(r6);	 Catch:{ all -> 0x00ea }
            r0 = r5.f7008f;	 Catch:{ all -> 0x00ea }
            r2 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r0[r2] = r6;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7005c;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r6[r7] = r9;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7006d;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r6[r7] = r11;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7007e;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r6[r7] = r8;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7009g;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r6[r7] = r12;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7010h;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r8 = r5.f7019q;	 Catch:{ all -> 0x00ea }
            r6[r7] = r8;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7004b;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r8 = r5.f7020r;	 Catch:{ all -> 0x00ea }
            r6[r7] = r8;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7011i;	 Catch:{ all -> 0x00ea }
            r6 = r6 + 1;
            r5.f7011i = r6;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7011i;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7003a;	 Catch:{ all -> 0x00ea }
            if (r6 != r7) goto L_0x00da;
        L_0x0052:
            r6 = r5.f7003a;	 Catch:{ all -> 0x00ea }
            r6 = r6 + 1000;
            r7 = new int[r6];	 Catch:{ all -> 0x00ea }
            r8 = new long[r6];	 Catch:{ all -> 0x00ea }
            r9 = new long[r6];	 Catch:{ all -> 0x00ea }
            r10 = new int[r6];	 Catch:{ all -> 0x00ea }
            r11 = new int[r6];	 Catch:{ all -> 0x00ea }
            r12 = new byte[r6][];	 Catch:{ all -> 0x00ea }
            r0 = new com.google.android.exoplayer2.Format[r6];	 Catch:{ all -> 0x00ea }
            r2 = r5.f7003a;	 Catch:{ all -> 0x00ea }
            r3 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            r2 = r2 - r3;
            r3 = r5.f7005c;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r8, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7008f;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r9, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7007e;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r10, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7006d;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r11, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7009g;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r12, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7010h;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r0, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7004b;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r3, r4, r7, r1, r2);	 Catch:{ all -> 0x00ea }
            r3 = r5.f7013k;	 Catch:{ all -> 0x00ea }
            r4 = r5.f7005c;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r8, r2, r3);	 Catch:{ all -> 0x00ea }
            r4 = r5.f7008f;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r9, r2, r3);	 Catch:{ all -> 0x00ea }
            r4 = r5.f7007e;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r10, r2, r3);	 Catch:{ all -> 0x00ea }
            r4 = r5.f7006d;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r11, r2, r3);	 Catch:{ all -> 0x00ea }
            r4 = r5.f7009g;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r12, r2, r3);	 Catch:{ all -> 0x00ea }
            r4 = r5.f7010h;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r0, r2, r3);	 Catch:{ all -> 0x00ea }
            r4 = r5.f7004b;	 Catch:{ all -> 0x00ea }
            java.lang.System.arraycopy(r4, r1, r7, r2, r3);	 Catch:{ all -> 0x00ea }
            r5.f7005c = r8;	 Catch:{ all -> 0x00ea }
            r5.f7008f = r9;	 Catch:{ all -> 0x00ea }
            r5.f7007e = r10;	 Catch:{ all -> 0x00ea }
            r5.f7006d = r11;	 Catch:{ all -> 0x00ea }
            r5.f7009g = r12;	 Catch:{ all -> 0x00ea }
            r5.f7010h = r0;	 Catch:{ all -> 0x00ea }
            r5.f7004b = r7;	 Catch:{ all -> 0x00ea }
            r5.f7013k = r1;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7003a;	 Catch:{ all -> 0x00ea }
            r5.f7014l = r7;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7003a;	 Catch:{ all -> 0x00ea }
            r5.f7011i = r7;	 Catch:{ all -> 0x00ea }
            r5.f7003a = r6;	 Catch:{ all -> 0x00ea }
            goto L_0x00e8;
        L_0x00da:
            r6 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r6 = r6 + 1;
            r5.f7014l = r6;	 Catch:{ all -> 0x00ea }
            r6 = r5.f7014l;	 Catch:{ all -> 0x00ea }
            r7 = r5.f7003a;	 Catch:{ all -> 0x00ea }
            if (r6 != r7) goto L_0x00e8;
        L_0x00e6:
            r5.f7014l = r1;	 Catch:{ all -> 0x00ea }
        L_0x00e8:
            monitor-exit(r5);
            return;
        L_0x00ea:
            r6 = move-exception;
            monitor-exit(r5);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.d.b.a(long, int, long, int, byte[]):void");
        }

        /* renamed from: a */
        public synchronized void m8192a(long j) {
            this.f7016n = Math.max(this.f7016n, j);
        }

        /* renamed from: b */
        public synchronized boolean m8196b(long j) {
            if (this.f7015m >= j) {
                return 0;
            }
            int i = this.f7011i;
            while (i > 0 && this.f7008f[((this.f7013k + i) - 1) % this.f7003a] >= j) {
                i--;
            }
            m8189a(this.f7012j + i);
            return true;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d$c */
    public interface C2226c {
        /* renamed from: a */
        void mo4056a(Format format);
    }

    public C3988d(C2364b c2364b) {
        this.f15953a = c2364b;
        this.f15954b = c2364b.mo1693c();
    }

    /* renamed from: a */
    public void m19937a(boolean z) {
        z = this.f15959g.getAndSet(z ? false : true);
        m19929i();
        this.f15955c.m8195b();
        if (z) {
            this.f15961i = false;
        }
    }

    /* renamed from: a */
    public int m19930a() {
        return this.f15955c.m8197c();
    }

    /* renamed from: b */
    public void m19939b() {
        if (this.f15959g.getAndSet(2) == 0) {
            m19929i();
        }
    }

    /* renamed from: c */
    public boolean m19940c() {
        return this.f15955c.m8198d();
    }

    /* renamed from: d */
    public Format m19941d() {
        return this.f15955c.m8199e();
    }

    /* renamed from: e */
    public long m19942e() {
        return this.f15955c.m8200f();
    }

    /* renamed from: f */
    public void m19943f() {
        long g = this.f15955c.m8201g();
        if (g != -1) {
            m19923a(g);
        }
    }

    /* renamed from: a */
    public boolean m19938a(long j, boolean z) {
        j = this.f15955c.m8190a(j, z);
        if (j == -1) {
            return 0;
        }
        m19923a(j);
        return 1;
    }

    /* renamed from: a */
    public int m19932a(C2274i c2274i, C3946e c3946e, boolean z, boolean z2, long j) {
        switch (this.f15955c.m8188a(c2274i, c3946e, z, z2, this.f15961i, this.f15957e)) {
            case true:
                this.f15961i = c2274i.f7223a;
                return -5;
            case true:
                if (c3946e.m7762c() == null) {
                    if (c3946e.f15689c < j) {
                        c3946e.m7760b(Integer.MIN_VALUE);
                    }
                    if (c3946e.m19609g() != null) {
                        m19926a(c3946e, this.f15957e);
                    }
                    c3946e.m19607e(this.f15957e.f6999a);
                    m19924a(this.f15957e.f7000b, c3946e.f15688b, this.f15957e.f6999a);
                    m19923a(this.f15957e.f7001c);
                }
                return -4;
            case true:
                return -3;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private void m19926a(C3946e c3946e, C2224a c2224a) {
        int h;
        int[] iArr;
        int[] iArr2;
        long j = c2224a.f7000b;
        this.f15958f.m7972a(1);
        m19925a(j, this.f15958f.f6735a, 1);
        j++;
        int i = 0;
        byte b = this.f15958f.f6735a[0];
        Object obj = (b & 128) != 0 ? 1 : null;
        int i2 = b & 127;
        if (c3946e.f15687a.f6513a == null) {
            c3946e.f15687a.f6513a = new byte[16];
        }
        m19925a(j, c3946e.f15687a.f6513a, i2);
        j += (long) i2;
        if (obj != null) {
            this.f15958f.m7972a(2);
            m19925a(j, this.f15958f.f6735a, 2);
            j += 2;
            h = this.f15958f.m7987h();
        } else {
            h = 1;
        }
        int[] iArr3 = c3946e.f15687a.f6516d;
        if (iArr3 != null) {
            if (iArr3.length < h) {
            }
            iArr = iArr3;
            iArr3 = c3946e.f15687a.f6517e;
            if (iArr3 != null) {
                if (iArr3.length < h) {
                }
                iArr2 = iArr3;
                if (obj == null) {
                    i2 = h * 6;
                    this.f15958f.m7972a(i2);
                    m19925a(j, this.f15958f.f6735a, i2);
                    j += (long) i2;
                    this.f15958f.m7979c(0);
                    while (i < h) {
                        iArr[i] = this.f15958f.m7987h();
                        iArr2[i] = this.f15958f.m7999t();
                        i++;
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = c2224a.f6999a - ((int) (j - c2224a.f7000b));
                }
                c3946e.f15687a.m7770a(h, iArr, iArr2, c2224a.f7002d, c3946e.f15687a.f6513a, 1);
                c3946e = (int) (j - c2224a.f7000b);
                c2224a.f7000b += (long) c3946e;
                c2224a.f6999a -= c3946e;
            }
            iArr3 = new int[h];
            iArr2 = iArr3;
            if (obj == null) {
                iArr[0] = 0;
                iArr2[0] = c2224a.f6999a - ((int) (j - c2224a.f7000b));
            } else {
                i2 = h * 6;
                this.f15958f.m7972a(i2);
                m19925a(j, this.f15958f.f6735a, i2);
                j += (long) i2;
                this.f15958f.m7979c(0);
                while (i < h) {
                    iArr[i] = this.f15958f.m7987h();
                    iArr2[i] = this.f15958f.m7999t();
                    i++;
                }
            }
            c3946e.f15687a.m7770a(h, iArr, iArr2, c2224a.f7002d, c3946e.f15687a.f6513a, 1);
            c3946e = (int) (j - c2224a.f7000b);
            c2224a.f7000b += (long) c3946e;
            c2224a.f6999a -= c3946e;
        }
        iArr3 = new int[h];
        iArr = iArr3;
        iArr3 = c3946e.f15687a.f6517e;
        if (iArr3 != null) {
            if (iArr3.length < h) {
            }
            iArr2 = iArr3;
            if (obj == null) {
                i2 = h * 6;
                this.f15958f.m7972a(i2);
                m19925a(j, this.f15958f.f6735a, i2);
                j += (long) i2;
                this.f15958f.m7979c(0);
                while (i < h) {
                    iArr[i] = this.f15958f.m7987h();
                    iArr2[i] = this.f15958f.m7999t();
                    i++;
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c2224a.f6999a - ((int) (j - c2224a.f7000b));
            }
            c3946e.f15687a.m7770a(h, iArr, iArr2, c2224a.f7002d, c3946e.f15687a.f6513a, 1);
            c3946e = (int) (j - c2224a.f7000b);
            c2224a.f7000b += (long) c3946e;
            c2224a.f6999a -= c3946e;
        }
        iArr3 = new int[h];
        iArr2 = iArr3;
        if (obj == null) {
            iArr[0] = 0;
            iArr2[0] = c2224a.f6999a - ((int) (j - c2224a.f7000b));
        } else {
            i2 = h * 6;
            this.f15958f.m7972a(i2);
            m19925a(j, this.f15958f.f6735a, i2);
            j += (long) i2;
            this.f15958f.m7979c(0);
            while (i < h) {
                iArr[i] = this.f15958f.m7987h();
                iArr2[i] = this.f15958f.m7999t();
                i++;
            }
        }
        c3946e.f15687a.m7770a(h, iArr, iArr2, c2224a.f7002d, c3946e.f15687a.f6513a, 1);
        c3946e = (int) (j - c2224a.f7000b);
        c2224a.f7000b += (long) c3946e;
        c2224a.f6999a -= c3946e;
    }

    /* renamed from: a */
    private void m19924a(long j, ByteBuffer byteBuffer, int i) {
        while (i > 0) {
            m19923a(j);
            int i2 = (int) (j - this.f15960h);
            int min = Math.min(i, this.f15954b - i2);
            C2363a c2363a = (C2363a) this.f15956d.peek();
            byteBuffer.put(c2363a.f7511a, c2363a.m8690a(i2), min);
            j += (long) min;
            i -= min;
        }
    }

    /* renamed from: a */
    private void m19925a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            m19923a(j);
            int i3 = (int) (j - this.f15960h);
            int min = Math.min(i - i2, this.f15954b - i3);
            C2363a c2363a = (C2363a) this.f15956d.peek();
            System.arraycopy(c2363a.f7511a, c2363a.m8690a(i3), bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    private void m19923a(long j) {
        j = ((int) (j - this.f15960h)) / this.f15954b;
        for (int i = 0; i < j; i++) {
            this.f15953a.mo1690a((C2363a) this.f15956d.remove());
            this.f15960h += (long) this.f15954b;
        }
    }

    /* renamed from: a */
    public void m19936a(C2226c c2226c) {
        this.f15969q = c2226c;
    }

    /* renamed from: a */
    public void mo1606a(Format format) {
        Format a = C3988d.m19922a(format, this.f15964l);
        boolean a2 = this.f15955c.m8194a(a);
        this.f15963k = format;
        this.f15962j = null;
        if (this.f15969q != null && a2) {
            this.f15969q.mo4056a(a);
        }
    }

    /* renamed from: a */
    public int mo1604a(C2260g c2260g, int i, boolean z) {
        if (m19927g()) {
            try {
                c2260g = c2260g.mo1582a(this.f15966n.f7511a, this.f15966n.m8690a(this.f15967o), m19921a(i));
                if (c2260g != -1) {
                    this.f15967o += c2260g;
                    this.f15965m += (long) c2260g;
                    m19928h();
                    return c2260g;
                } else if (z) {
                    return -1;
                } else {
                    throw new EOFException();
                }
            } finally {
                m19928h();
            }
        } else {
            c2260g = c2260g.mo1581a(i);
            if (c2260g != -1) {
                return c2260g;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public void mo1607a(C2175k c2175k, int i) {
        if (m19927g()) {
            while (i > 0) {
                int a = m19921a(i);
                c2175k.m7975a(this.f15966n.f7511a, this.f15966n.m8690a(this.f15967o), a);
                this.f15967o += a;
                this.f15965m += (long) a;
                i -= a;
            }
            m19928h();
            return;
        }
        c2175k.m7981d(i);
    }

    /* renamed from: a */
    public void mo1605a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        if (this.f15962j) {
            mo1606a(r1.f15963k);
        }
        if (m19927g()) {
            try {
                if (r1.f15968p) {
                    if ((i & 1) != 0) {
                        if (r1.f15955c.m8196b(j)) {
                            r1.f15968p = false;
                        }
                    }
                    m19928h();
                    return;
                }
                r1.f15955c.m8193a(r1.f15964l + j2, i, (r1.f15965m - ((long) i2)) - ((long) i3), i2, bArr);
                m19928h();
            } catch (Throwable th) {
                m19928h();
            }
        } else {
            r1.f15955c.m8192a(j);
        }
    }

    /* renamed from: g */
    private boolean m19927g() {
        return this.f15959g.compareAndSet(0, 1);
    }

    /* renamed from: h */
    private void m19928h() {
        if (!this.f15959g.compareAndSet(1, 0)) {
            m19929i();
        }
    }

    /* renamed from: i */
    private void m19929i() {
        this.f15955c.m8191a();
        this.f15953a.mo1691a((C2363a[]) this.f15956d.toArray(new C2363a[this.f15956d.size()]));
        this.f15956d.clear();
        this.f15953a.mo1692b();
        this.f15960h = 0;
        this.f15965m = 0;
        this.f15966n = null;
        this.f15967o = this.f15954b;
    }

    /* renamed from: a */
    private int m19921a(int i) {
        if (this.f15967o == this.f15954b) {
            this.f15967o = 0;
            this.f15966n = this.f15953a.mo1689a();
            this.f15956d.add(this.f15966n);
        }
        return Math.min(i, this.f15954b - this.f15967o);
    }

    /* renamed from: a */
    private static Format m19922a(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (!(j == 0 || format.f6506w == Long.MAX_VALUE)) {
            format = format.m7755a(format.f6506w + j);
        }
        return format;
    }
}
