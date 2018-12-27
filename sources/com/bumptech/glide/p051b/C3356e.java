package com.bumptech.glide.p051b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p051b.C1129a.C1128a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.b.e */
public class C3356e implements C1129a {
    /* renamed from: a */
    private static final String f14212a = "e";
    /* renamed from: b */
    private int[] f14213b;
    /* renamed from: c */
    private final int[] f14214c;
    /* renamed from: d */
    private final C1128a f14215d;
    /* renamed from: e */
    private ByteBuffer f14216e;
    /* renamed from: f */
    private byte[] f14217f;
    /* renamed from: g */
    private short[] f14218g;
    /* renamed from: h */
    private byte[] f14219h;
    /* renamed from: i */
    private byte[] f14220i;
    /* renamed from: j */
    private byte[] f14221j;
    /* renamed from: k */
    private int[] f14222k;
    /* renamed from: l */
    private int f14223l;
    /* renamed from: m */
    private C1131c f14224m;
    /* renamed from: n */
    private Bitmap f14225n;
    /* renamed from: o */
    private boolean f14226o;
    /* renamed from: p */
    private int f14227p;
    /* renamed from: q */
    private int f14228q;
    /* renamed from: r */
    private int f14229r;
    /* renamed from: s */
    private int f14230s;
    /* renamed from: t */
    private Boolean f14231t;
    /* renamed from: u */
    private Config f14232u;

    public C3356e(C1128a c1128a, C1131c c1131c, ByteBuffer byteBuffer, int i) {
        this(c1128a);
        m17245a(c1131c, byteBuffer, i);
    }

    public C3356e(C1128a c1128a) {
        this.f14214c = new int[256];
        this.f14232u = Config.ARGB_8888;
        this.f14215d = c1128a;
        this.f14224m = new C1131c();
    }

    /* renamed from: a */
    public ByteBuffer mo932a() {
        return this.f14216e;
    }

    /* renamed from: b */
    public void mo934b() {
        this.f14223l = (this.f14223l + 1) % this.f14224m.f3703c;
    }

    /* renamed from: a */
    public int m17242a(int i) {
        return (i < 0 || i >= this.f14224m.f3703c) ? -1 : ((C1130b) this.f14224m.f3705e.get(i)).f3698i;
    }

    /* renamed from: c */
    public int mo935c() {
        if (this.f14224m.f3703c > 0) {
            if (this.f14223l >= 0) {
                return m17242a(this.f14223l);
            }
        }
        return 0;
    }

    /* renamed from: d */
    public int mo936d() {
        return this.f14224m.f3703c;
    }

    /* renamed from: e */
    public int mo937e() {
        return this.f14223l;
    }

    /* renamed from: f */
    public void mo938f() {
        this.f14223l = -1;
    }

    /* renamed from: g */
    public int mo939g() {
        return (this.f14216e.limit() + this.f14221j.length) + (this.f14222k.length * 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: h */
    public synchronized android.graphics.Bitmap mo940h() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f14224m;	 Catch:{ all -> 0x00ea }
        r0 = r0.f3703c;	 Catch:{ all -> 0x00ea }
        r1 = 3;
        r2 = 1;
        if (r0 <= 0) goto L_0x000d;
    L_0x0009:
        r0 = r7.f14223l;	 Catch:{ all -> 0x00ea }
        if (r0 >= 0) goto L_0x003b;
    L_0x000d:
        r0 = f14212a;	 Catch:{ all -> 0x00ea }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ea }
        if (r0 == 0) goto L_0x0039;
    L_0x0015:
        r0 = f14212a;	 Catch:{ all -> 0x00ea }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ea }
        r3.<init>();	 Catch:{ all -> 0x00ea }
        r4 = "Unable to decode frame, frameCount=";
        r3.append(r4);	 Catch:{ all -> 0x00ea }
        r4 = r7.f14224m;	 Catch:{ all -> 0x00ea }
        r4 = r4.f3703c;	 Catch:{ all -> 0x00ea }
        r3.append(r4);	 Catch:{ all -> 0x00ea }
        r4 = ", framePointer=";
        r3.append(r4);	 Catch:{ all -> 0x00ea }
        r4 = r7.f14223l;	 Catch:{ all -> 0x00ea }
        r3.append(r4);	 Catch:{ all -> 0x00ea }
        r3 = r3.toString();	 Catch:{ all -> 0x00ea }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x00ea }
    L_0x0039:
        r7.f14227p = r2;	 Catch:{ all -> 0x00ea }
    L_0x003b:
        r0 = r7.f14227p;	 Catch:{ all -> 0x00ea }
        r3 = 0;
        if (r0 == r2) goto L_0x00c8;
    L_0x0040:
        r0 = r7.f14227p;	 Catch:{ all -> 0x00ea }
        r4 = 2;
        if (r0 != r4) goto L_0x0047;
    L_0x0045:
        goto L_0x00c8;
    L_0x0047:
        r0 = 0;
        r7.f14227p = r0;	 Catch:{ all -> 0x00ea }
        r4 = r7.f14217f;	 Catch:{ all -> 0x00ea }
        if (r4 != 0) goto L_0x0058;
    L_0x004e:
        r4 = r7.f14215d;	 Catch:{ all -> 0x00ea }
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r4 = r4.mo1069a(r5);	 Catch:{ all -> 0x00ea }
        r7.f14217f = r4;	 Catch:{ all -> 0x00ea }
    L_0x0058:
        r4 = r7.f14224m;	 Catch:{ all -> 0x00ea }
        r4 = r4.f3705e;	 Catch:{ all -> 0x00ea }
        r5 = r7.f14223l;	 Catch:{ all -> 0x00ea }
        r4 = r4.get(r5);	 Catch:{ all -> 0x00ea }
        r4 = (com.bumptech.glide.p051b.C1130b) r4;	 Catch:{ all -> 0x00ea }
        r5 = r7.f14223l;	 Catch:{ all -> 0x00ea }
        r5 = r5 - r2;
        if (r5 < 0) goto L_0x0074;
    L_0x0069:
        r6 = r7.f14224m;	 Catch:{ all -> 0x00ea }
        r6 = r6.f3705e;	 Catch:{ all -> 0x00ea }
        r5 = r6.get(r5);	 Catch:{ all -> 0x00ea }
        r5 = (com.bumptech.glide.p051b.C1130b) r5;	 Catch:{ all -> 0x00ea }
        goto L_0x0075;
    L_0x0074:
        r5 = r3;
    L_0x0075:
        r6 = r4.f3700k;	 Catch:{ all -> 0x00ea }
        if (r6 == 0) goto L_0x007c;
    L_0x0079:
        r6 = r4.f3700k;	 Catch:{ all -> 0x00ea }
        goto L_0x0080;
    L_0x007c:
        r6 = r7.f14224m;	 Catch:{ all -> 0x00ea }
        r6 = r6.f3701a;	 Catch:{ all -> 0x00ea }
    L_0x0080:
        r7.f14213b = r6;	 Catch:{ all -> 0x00ea }
        r6 = r7.f14213b;	 Catch:{ all -> 0x00ea }
        if (r6 != 0) goto L_0x00aa;
    L_0x0086:
        r0 = f14212a;	 Catch:{ all -> 0x00ea }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ea }
        if (r0 == 0) goto L_0x00a6;
    L_0x008e:
        r0 = f14212a;	 Catch:{ all -> 0x00ea }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ea }
        r1.<init>();	 Catch:{ all -> 0x00ea }
        r4 = "No valid color table found for frame #";
        r1.append(r4);	 Catch:{ all -> 0x00ea }
        r4 = r7.f14223l;	 Catch:{ all -> 0x00ea }
        r1.append(r4);	 Catch:{ all -> 0x00ea }
        r1 = r1.toString();	 Catch:{ all -> 0x00ea }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00ea }
    L_0x00a6:
        r7.f14227p = r2;	 Catch:{ all -> 0x00ea }
        monitor-exit(r7);
        return r3;
    L_0x00aa:
        r1 = r4.f3695f;	 Catch:{ all -> 0x00ea }
        if (r1 == 0) goto L_0x00c2;
    L_0x00ae:
        r1 = r7.f14213b;	 Catch:{ all -> 0x00ea }
        r2 = r7.f14214c;	 Catch:{ all -> 0x00ea }
        r3 = r7.f14213b;	 Catch:{ all -> 0x00ea }
        r3 = r3.length;	 Catch:{ all -> 0x00ea }
        java.lang.System.arraycopy(r1, r0, r2, r0, r3);	 Catch:{ all -> 0x00ea }
        r1 = r7.f14214c;	 Catch:{ all -> 0x00ea }
        r7.f14213b = r1;	 Catch:{ all -> 0x00ea }
        r1 = r7.f14213b;	 Catch:{ all -> 0x00ea }
        r2 = r4.f3697h;	 Catch:{ all -> 0x00ea }
        r1[r2] = r0;	 Catch:{ all -> 0x00ea }
    L_0x00c2:
        r0 = r7.m17235a(r4, r5);	 Catch:{ all -> 0x00ea }
        monitor-exit(r7);
        return r0;
    L_0x00c8:
        r0 = f14212a;	 Catch:{ all -> 0x00ea }
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ all -> 0x00ea }
        if (r0 == 0) goto L_0x00e8;
    L_0x00d0:
        r0 = f14212a;	 Catch:{ all -> 0x00ea }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ea }
        r1.<init>();	 Catch:{ all -> 0x00ea }
        r2 = "Unable to decode frame, status=";
        r1.append(r2);	 Catch:{ all -> 0x00ea }
        r2 = r7.f14227p;	 Catch:{ all -> 0x00ea }
        r1.append(r2);	 Catch:{ all -> 0x00ea }
        r1 = r1.toString();	 Catch:{ all -> 0x00ea }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x00ea }
    L_0x00e8:
        monitor-exit(r7);
        return r3;
    L_0x00ea:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.e.h():android.graphics.Bitmap");
    }

    /* renamed from: i */
    public void mo941i() {
        this.f14224m = null;
        if (this.f14221j != null) {
            this.f14215d.mo1067a(this.f14221j);
        }
        if (this.f14222k != null) {
            this.f14215d.mo1068a(this.f14222k);
        }
        if (this.f14225n != null) {
            this.f14215d.mo1066a(this.f14225n);
        }
        this.f14225n = null;
        this.f14216e = null;
        this.f14231t = null;
        if (this.f14217f != null) {
            this.f14215d.mo1067a(this.f14217f);
        }
    }

    /* renamed from: a */
    public synchronized void m17245a(C1131c c1131c, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            i = Integer.highestOneBit(i);
            this.f14227p = 0;
            this.f14224m = c1131c;
            this.f14223l = -1;
            this.f14216e = byteBuffer.asReadOnlyBuffer();
            this.f14216e.position(0);
            this.f14216e.order(ByteOrder.LITTLE_ENDIAN);
            this.f14226o = false;
            for (C1130b c1130b : c1131c.f3705e) {
                if (c1130b.f3696g == 3) {
                    this.f14226o = true;
                    break;
                }
            }
            this.f14228q = i;
            this.f14230s = c1131c.f3706f / i;
            this.f14229r = c1131c.f3707g / i;
            this.f14221j = this.f14215d.mo1069a(c1131c.f3706f * c1131c.f3707g);
            this.f14222k = this.f14215d.mo1070b(this.f14230s * this.f14229r);
        } else {
            byteBuffer = new StringBuilder();
            byteBuffer.append("Sample size must be >=0, not: ");
            byteBuffer.append(i);
            throw new IllegalArgumentException(byteBuffer.toString());
        }
    }

    /* renamed from: a */
    public void mo933a(Config config) {
        if (config != Config.ARGB_8888) {
            if (config != Config.RGB_565) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported format: ");
                stringBuilder.append(config);
                stringBuilder.append(", must be one of ");
                stringBuilder.append(Config.ARGB_8888);
                stringBuilder.append(" or ");
                stringBuilder.append(Config.RGB_565);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        this.f14232u = config;
    }

    /* renamed from: a */
    private Bitmap m17235a(C1130b c1130b, C1130b c1130b2) {
        int[] iArr = this.f14222k;
        int i = 0;
        if (c1130b2 == null) {
            if (this.f14225n != null) {
                this.f14215d.mo1066a(this.f14225n);
            }
            this.f14225n = null;
            Arrays.fill(iArr, 0);
        }
        if (c1130b2 != null && c1130b2.f3696g == 3 && this.f14225n == null) {
            Arrays.fill(iArr, 0);
        }
        if (c1130b2 != null && c1130b2.f3696g > 0) {
            if (c1130b2.f3696g == 2) {
                int i2;
                if (!c1130b.f3695f) {
                    i2 = this.f14224m.f3712l;
                    if (c1130b.f3700k == null || this.f14224m.f3710j != c1130b.f3697h) {
                        i = i2;
                    }
                } else if (this.f14223l == 0) {
                    this.f14231t = Boolean.valueOf(true);
                }
                i2 = c1130b2.f3693d / this.f14228q;
                int i3 = c1130b2.f3691b / this.f14228q;
                int i4 = c1130b2.f3692c / this.f14228q;
                i3 = (i3 * this.f14230s) + (c1130b2.f3690a / this.f14228q);
                i2 = (i2 * this.f14230s) + i3;
                while (i3 < i2) {
                    c1130b2 = i3 + i4;
                    for (int i5 = i3; i5 < c1130b2; i5++) {
                        iArr[i5] = i;
                    }
                    i3 += this.f14230s;
                }
            } else if (c1130b2.f3696g == 3 && this.f14225n != null) {
                this.f14225n.getPixels(iArr, 0, this.f14230s, 0, 0, this.f14230s, this.f14229r);
            }
        }
        m17238c(c1130b);
        if (c1130b.f3694e == null) {
            if (this.f14228q == 1) {
                m17236a(c1130b);
                if (this.f14226o != null && (c1130b.f3696g == null || c1130b.f3696g == 1)) {
                    if (this.f14225n == null) {
                        this.f14225n = m17241l();
                    }
                    this.f14225n.setPixels(iArr, 0, this.f14230s, 0, 0, this.f14230s, this.f14229r);
                }
                c1130b = m17241l();
                c1130b.setPixels(iArr, 0, this.f14230s, 0, 0, this.f14230s, this.f14229r);
                return c1130b;
            }
        }
        m17237b(c1130b);
        if (this.f14225n == null) {
            this.f14225n = m17241l();
        }
        this.f14225n.setPixels(iArr, 0, this.f14230s, 0, 0, this.f14230s, this.f14229r);
        c1130b = m17241l();
        c1130b.setPixels(iArr, 0, this.f14230s, 0, 0, this.f14230s, this.f14229r);
        return c1130b;
    }

    /* renamed from: a */
    private void m17236a(C1130b c1130b) {
        C1130b c1130b2 = c1130b;
        int[] iArr = this.f14222k;
        int i = c1130b2.f3693d;
        int i2 = c1130b2.f3691b;
        int i3 = c1130b2.f3692c;
        int i4 = c1130b2.f3690a;
        Object obj = this.f14223l == 0 ? 1 : null;
        int i5 = r0.f14230s;
        byte[] bArr = r0.f14221j;
        int[] iArr2 = r0.f14213b;
        int i6 = 0;
        int i7 = -1;
        while (i6 < i) {
            int i8;
            int i9 = (i6 + i2) * i5;
            int i10 = i9 + i4;
            int i11 = i10 + i3;
            int i12 = i9 + i5;
            if (i12 < i11) {
                i11 = i12;
            }
            int i13 = i7;
            i7 = c1130b2.f3692c * i6;
            i12 = i10;
            while (i12 < i11) {
                byte b = bArr[i7];
                i8 = i;
                i = b & 255;
                if (i != i13) {
                    i = iArr2[i];
                    if (i != 0) {
                        iArr[i12] = i;
                    } else {
                        i13 = b;
                    }
                }
                i7++;
                i12++;
                i = i8;
                c1130b2 = c1130b;
            }
            i8 = i;
            i6++;
            i7 = i13;
            c1130b2 = c1130b;
        }
        boolean z = (r0.f14231t != null || obj == null || i7 == -1) ? false : true;
        r0.f14231t = Boolean.valueOf(z);
    }

    /* renamed from: b */
    private void m17237b(C1130b c1130b) {
        C1130b c1130b2 = c1130b;
        int[] iArr = this.f14222k;
        int i = c1130b2.f3693d / this.f14228q;
        int i2 = c1130b2.f3691b / this.f14228q;
        int i3 = c1130b2.f3692c / this.f14228q;
        int i4 = c1130b2.f3690a / this.f14228q;
        Object obj = this.f14223l == 0 ? 1 : null;
        int i5 = r0.f14228q;
        int i6 = r0.f14230s;
        int i7 = r0.f14229r;
        byte[] bArr = r0.f14221j;
        int[] iArr2 = r0.f14213b;
        Boolean bool = r0.f14231t;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        int i11 = 8;
        while (i9 < i) {
            int i12;
            int i13;
            int i14;
            if (c1130b2.f3694e) {
                if (i8 >= i) {
                    i10++;
                    switch (i10) {
                        case 2:
                            i8 = 4;
                            break;
                        case 3:
                            i8 = 2;
                            i11 = 4;
                            break;
                        case 4:
                            i8 = 1;
                            i11 = 2;
                            break;
                        default:
                            break;
                    }
                }
                i12 = i8 + i11;
            } else {
                i12 = i8;
                i8 = i9;
            }
            i8 += i2;
            int i15 = i;
            Object obj2 = i5 == 1 ? 1 : null;
            if (i8 < i7) {
                i8 *= i6;
                int i16 = i8 + i4;
                i13 = i2;
                i2 = i16 + i3;
                i8 += i6;
                if (i8 < i2) {
                    i2 = i8;
                }
                i14 = i3;
                i8 = (i9 * i5) * c1130b2.f3692c;
                if (obj2 != null) {
                    for (i = i16; i < i2; i++) {
                        i3 = iArr2[bArr[i8] & 255];
                        if (i3 != 0) {
                            iArr[i] = i3;
                        } else if (obj != null && r16 == null) {
                            bool = Boolean.valueOf(true);
                        }
                        i8 += i5;
                    }
                } else {
                    i = ((i2 - i16) * i5) + i8;
                    i3 = i16;
                    while (i3 < i2) {
                        int i17 = i2;
                        i2 = m17234a(i8, i, c1130b2.f3692c);
                        if (i2 != 0) {
                            iArr[i3] = i2;
                        } else if (obj != null && r16 == null) {
                            bool = Boolean.valueOf(true);
                            i8 += i5;
                            i3++;
                            i2 = i17;
                        }
                        i8 += i5;
                        i3++;
                        i2 = i17;
                    }
                }
            } else {
                i13 = i2;
                i14 = i3;
            }
            i9++;
            i8 = i12;
            i = i15;
            i2 = i13;
            i3 = i14;
        }
        if (r0.f14231t == null) {
            boolean z;
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            r0.f14231t = Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    private int m17234a(int i, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i4 < this.f14228q + i && i4 < this.f14221j.length && i4 < i2) {
            int i10 = this.f14213b[this.f14221j[i4] & 255];
            if (i10 != 0) {
                i5 += (i10 >> 24) & 255;
                i6 += (i10 >> 16) & 255;
                i7 += (i10 >> 8) & 255;
                i8 += i10 & 255;
                i9++;
            }
            i4++;
        }
        i += i3;
        i3 = i;
        while (i3 < this.f14228q + i && i3 < this.f14221j.length && i3 < i2) {
            i4 = this.f14213b[this.f14221j[i3] & 255];
            if (i4 != 0) {
                i5 += (i4 >> 24) & 255;
                i6 += (i4 >> 16) & 255;
                i7 += (i4 >> 8) & 255;
                i8 += i4 & 255;
                i9++;
            }
            i3++;
        }
        if (i9 == 0) {
            return 0;
        }
        return ((((i5 / i9) << 24) | ((i6 / i9) << 16)) | ((i7 / i9) << 8)) | (i8 / i9);
    }

    /* renamed from: c */
    private void m17238c(C1130b c1130b) {
        short s;
        C3356e c3356e = this;
        C1130b c1130b2 = c1130b;
        if (c1130b2 != null) {
            c3356e.f14216e.position(c1130b2.f3699j);
        }
        if (c1130b2 == null) {
            s = c3356e.f14224m.f3706f * c3356e.f14224m.f3707g;
        } else {
            s = c1130b2.f3693d * c1130b2.f3692c;
        }
        if (c3356e.f14221j == null || c3356e.f14221j.length < s) {
            c3356e.f14221j = c3356e.f14215d.mo1069a((int) s);
        }
        byte[] bArr = c3356e.f14221j;
        if (c3356e.f14218g == null) {
            c3356e.f14218g = new short[4096];
        }
        short[] sArr = c3356e.f14218g;
        if (c3356e.f14219h == null) {
            c3356e.f14219h = new byte[4096];
        }
        byte[] bArr2 = c3356e.f14219h;
        if (c3356e.f14220i == null) {
            c3356e.f14220i = new byte[4097];
        }
        byte[] bArr3 = c3356e.f14220i;
        int j = m17239j();
        int i = 1 << j;
        int i2 = i + 1;
        int i3 = i + 2;
        j++;
        int i4 = (1 << j) - 1;
        short s2 = (short) 0;
        for (int i5 = 0; i5 < i; i5++) {
            sArr[i5] = (short) 0;
            bArr2[i5] = (byte) i5;
        }
        byte[] bArr4 = c3356e.f14217f;
        int i6 = j;
        int i7 = i3;
        int i8 = i4;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        while (s2 < s) {
            if (i9 == 0) {
                i9 = m17240k();
                if (i9 <= 0) {
                    c3356e.f14227p = 3;
                    break;
                }
                i13 = 0;
            }
            i12 += (bArr4[i13] & 255) << i11;
            i13++;
            i9--;
            int i17 = i11 + 8;
            int i18 = i14;
            int i19 = i15;
            int i20 = i7;
            i11 = i10;
            short s3 = s2;
            int i21 = i6;
            while (i17 >= i21) {
                int i22 = i12 & i8;
                i12 >>= i21;
                i17 -= i21;
                if (i22 == i) {
                    i21 = j;
                    i20 = i3;
                    i8 = i4;
                    i18 = -1;
                } else if (i22 == i2) {
                    i14 = i18;
                    i6 = i21;
                    s2 = s3;
                    i10 = i11;
                    i7 = i20;
                    i15 = i19;
                    i11 = i17;
                    break;
                } else {
                    if (i18 == -1) {
                        bArr[i11] = bArr2[i22];
                        i11++;
                        s3++;
                        i18 = i22;
                        i19 = i18;
                    } else {
                        int i23;
                        int i24 = i20;
                        if (i22 >= i24) {
                            i23 = i17;
                            bArr3[i16] = (byte) i19;
                            i16++;
                            i17 = i18;
                        } else {
                            i23 = i17;
                            i17 = i22;
                        }
                        while (i17 >= i) {
                            bArr3[i16] = bArr2[i17];
                            i16++;
                            i17 = sArr[i17];
                        }
                        i17 = bArr2[i17] & 255;
                        int i25 = j;
                        byte b = (byte) i17;
                        bArr[i11] = b;
                        i11++;
                        s3++;
                        while (i16 > 0) {
                            i16--;
                            bArr[i11] = bArr3[i16];
                            i11++;
                            s3++;
                        }
                        int i26 = i17;
                        if (i24 < 4096) {
                            sArr[i24] = (short) i18;
                            bArr2[i24] = b;
                            i24++;
                            if ((i24 & i8) == 0 && i24 < 4096) {
                                i21++;
                                i8 += i24;
                            }
                        }
                        i20 = i24;
                        i18 = i22;
                        i17 = i23;
                        j = i25;
                        i19 = i26;
                    }
                    c3356e = this;
                }
            }
            i7 = i20;
            i14 = i18;
            i6 = i21;
            s2 = s3;
            i10 = i11;
            i15 = i19;
            i11 = i17;
            c3356e = this;
        }
        Arrays.fill(bArr, i10, s, (byte) 0);
    }

    /* renamed from: j */
    private int m17239j() {
        return this.f14216e.get() & 255;
    }

    /* renamed from: k */
    private int m17240k() {
        int j = m17239j();
        if (j <= 0) {
            return j;
        }
        this.f14216e.get(this.f14217f, 0, Math.min(j, this.f14216e.remaining()));
        return j;
    }

    /* renamed from: l */
    private Bitmap m17241l() {
        Config config;
        Bitmap a;
        if (this.f14231t != null) {
            if (!this.f14231t.booleanValue()) {
                config = this.f14232u;
                a = this.f14215d.mo1065a(this.f14230s, this.f14229r, config);
                a.setHasAlpha(true);
                return a;
            }
        }
        config = Config.ARGB_8888;
        a = this.f14215d.mo1065a(this.f14230s, this.f14229r, config);
        a.setHasAlpha(true);
        return a;
    }
}
