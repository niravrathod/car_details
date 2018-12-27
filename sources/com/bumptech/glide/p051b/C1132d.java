package com.bumptech.glide.p051b;

import android.util.Log;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.b.d */
public class C1132d {
    /* renamed from: a */
    private final byte[] f3714a = new byte[256];
    /* renamed from: b */
    private ByteBuffer f3715b;
    /* renamed from: c */
    private C1131c f3716c;
    /* renamed from: d */
    private int f3717d = 0;

    /* renamed from: a */
    public C1132d m4728a(ByteBuffer byteBuffer) {
        m4715c();
        this.f3715b = byteBuffer.asReadOnlyBuffer();
        this.f3715b.position(0);
        this.f3715b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: a */
    public void m4729a() {
        this.f3715b = null;
        this.f3716c = null;
    }

    /* renamed from: c */
    private void m4715c() {
        this.f3715b = null;
        Arrays.fill(this.f3714a, (byte) 0);
        this.f3716c = new C1131c();
        this.f3717d = 0;
    }

    /* renamed from: b */
    public C1131c m4730b() {
        if (this.f3715b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m4727o()) {
            return this.f3716c;
        } else {
            m4720h();
            if (!m4727o()) {
                m4716d();
                if (this.f3716c.f3703c < 0) {
                    this.f3716c.f3702b = 1;
                }
            }
            return this.f3716c;
        }
    }

    /* renamed from: d */
    private void m4716d() {
        m4713a((int) BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: a */
    private void m4713a(int i) {
        Object obj = null;
        while (obj == null && !m4727o() && this.f3716c.f3703c <= i) {
            int m = m4725m();
            if (m == 33) {
                m = m4725m();
                if (m == 1) {
                    m4723k();
                } else if (m != 249) {
                    switch (m) {
                        case 254:
                            m4723k();
                            break;
                        case 255:
                            m4724l();
                            StringBuilder stringBuilder = new StringBuilder();
                            for (int i2 = 0; i2 < 11; i2++) {
                                stringBuilder.append((char) this.f3714a[i2]);
                            }
                            if (!stringBuilder.toString().equals("NETSCAPE2.0")) {
                                m4723k();
                                break;
                            } else {
                                m4719g();
                                break;
                            }
                        default:
                            m4723k();
                            break;
                    }
                } else {
                    this.f3716c.f3704d = new C1130b();
                    m4717e();
                }
            } else if (m == 44) {
                if (this.f3716c.f3704d == null) {
                    this.f3716c.f3704d = new C1130b();
                }
                m4718f();
            } else if (m != 59) {
                this.f3716c.f3702b = 1;
            } else {
                obj = 1;
            }
        }
    }

    /* renamed from: e */
    private void m4717e() {
        m4725m();
        int m = m4725m();
        this.f3716c.f3704d.f3696g = (m & 28) >> 2;
        boolean z = true;
        if (this.f3716c.f3704d.f3696g == 0) {
            this.f3716c.f3704d.f3696g = 1;
        }
        C1130b c1130b = this.f3716c.f3704d;
        if ((m & 1) == 0) {
            z = false;
        }
        c1130b.f3695f = z;
        m = m4726n();
        if (m < 2) {
            m = 10;
        }
        this.f3716c.f3704d.f3698i = m * 10;
        this.f3716c.f3704d.f3697h = m4725m();
        m4725m();
    }

    /* renamed from: f */
    private void m4718f() {
        this.f3716c.f3704d.f3690a = m4726n();
        this.f3716c.f3704d.f3691b = m4726n();
        this.f3716c.f3704d.f3692c = m4726n();
        this.f3716c.f3704d.f3693d = m4726n();
        int m = m4725m();
        boolean z = false;
        Object obj = (m & 128) != 0 ? 1 : null;
        int pow = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        C1130b c1130b = this.f3716c.f3704d;
        if ((m & 64) != 0) {
            z = true;
        }
        c1130b.f3694e = z;
        if (obj != null) {
            this.f3716c.f3704d.f3700k = m4714b(pow);
        } else {
            this.f3716c.f3704d.f3700k = null;
        }
        this.f3716c.f3704d.f3699j = this.f3715b.position();
        m4722j();
        if (!m4727o()) {
            C1131c c1131c = this.f3716c;
            c1131c.f3703c++;
            this.f3716c.f3705e.add(this.f3716c.f3704d);
        }
    }

    /* renamed from: g */
    private void m4719g() {
        do {
            m4724l();
            if (this.f3714a[0] == (byte) 1) {
                this.f3716c.f3713m = (this.f3714a[1] & 255) | ((this.f3714a[2] & 255) << 8);
            }
            if (this.f3717d <= 0) {
                return;
            }
        } while (!m4727o());
    }

    /* renamed from: h */
    private void m4720h() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            stringBuilder.append((char) m4725m());
        }
        if (stringBuilder.toString().startsWith("GIF")) {
            m4721i();
            if (this.f3716c.f3708h && !m4727o()) {
                this.f3716c.f3701a = m4714b(this.f3716c.f3709i);
                this.f3716c.f3712l = this.f3716c.f3701a[this.f3716c.f3710j];
            }
            return;
        }
        this.f3716c.f3702b = 1;
    }

    /* renamed from: i */
    private void m4721i() {
        this.f3716c.f3706f = m4726n();
        this.f3716c.f3707g = m4726n();
        int m = m4725m();
        this.f3716c.f3708h = (m & 128) != 0;
        this.f3716c.f3709i = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        this.f3716c.f3710j = m4725m();
        this.f3716c.f3711k = m4725m();
    }

    /* renamed from: b */
    private int[] m4714b(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f3715b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((((bArr[i3] & 255) << 16) | -16777216) | ((bArr[i4] & 255) << 8)) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    i = e;
                }
            }
        } catch (BufferUnderflowException e2) {
            i = e2;
            iArr = null;
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", i);
            }
            this.f3716c.f3702b = 1;
            return iArr;
        }
        return iArr;
    }

    /* renamed from: j */
    private void m4722j() {
        m4725m();
        m4723k();
    }

    /* renamed from: k */
    private void m4723k() {
        int m;
        do {
            m = m4725m();
            this.f3715b.position(Math.min(this.f3715b.position() + m, this.f3715b.limit()));
        } while (m > 0);
    }

    /* renamed from: l */
    private void m4724l() {
        this.f3717d = m4725m();
        if (this.f3717d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f3717d) {
                try {
                    i2 = this.f3717d - i;
                    this.f3715b.get(this.f3714a, i, i2);
                    i += i2;
                } catch (Throwable e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Error Reading Block n: ");
                        stringBuilder.append(i);
                        stringBuilder.append(" count: ");
                        stringBuilder.append(i2);
                        stringBuilder.append(" blockSize: ");
                        stringBuilder.append(this.f3717d);
                        Log.d("GifHeaderParser", stringBuilder.toString(), e);
                    }
                    this.f3716c.f3702b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    private int m4725m() {
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
        r2 = this;
        r0 = r2.f3715b;	 Catch:{ Exception -> 0x0009 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0009 }
        r0 = r0 & 255;
        goto L_0x000f;
    L_0x0009:
        r0 = r2.f3716c;
        r1 = 1;
        r0.f3702b = r1;
        r0 = 0;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.d.m():int");
    }

    /* renamed from: n */
    private int m4726n() {
        return this.f3715b.getShort();
    }

    /* renamed from: o */
    private boolean m4727o() {
        return this.f3716c.f3702b != 0;
    }
}
