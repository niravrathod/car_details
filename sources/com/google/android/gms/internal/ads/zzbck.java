package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbck extends zzbbt {
    /* renamed from: b */
    private static final Logger f17078b = Logger.getLogger(zzbck.class.getName());
    /* renamed from: c */
    private static final boolean f17079c = ng.m9234a();
    /* renamed from: a */
    kv f17080a = this;

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            str = String.valueOf(str);
            super(str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
            str = String.valueOf(str);
            super(str.length() != 0 ? valueOf.concat(str) : new String(valueOf), th);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbck$a */
    static class C4703a extends zzbck {
        /* renamed from: b */
        private final byte[] f20032b;
        /* renamed from: c */
        private final int f20033c;
        /* renamed from: d */
        private final int f20034d;
        /* renamed from: e */
        private int f20035e;

        C4703a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if (((i | i2) | (bArr.length - i3)) >= 0) {
                    this.f20032b = bArr;
                    this.f20033c = i;
                    this.f20035e = i;
                    this.f20034d = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo4225a() {
        }

        /* renamed from: a */
        public final void mo4228a(int i, int i2) {
            mo4242b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo4243b(int i, int i2) {
            mo4228a(i, 0);
            mo4227a(i2);
        }

        /* renamed from: c */
        public final void mo4247c(int i, int i2) {
            mo4228a(i, 0);
            mo4242b(i2);
        }

        /* renamed from: e */
        public final void mo4252e(int i, int i2) {
            mo4228a(i, 5);
            mo4251d(i2);
        }

        /* renamed from: a */
        public final void mo4229a(int i, long j) {
            mo4228a(i, 0);
            mo4235a(j);
        }

        /* renamed from: c */
        public final void mo4248c(int i, long j) {
            mo4228a(i, 1);
            mo4249c(j);
        }

        /* renamed from: a */
        public final void mo4234a(int i, boolean z) {
            mo4228a(i, 0);
            mo4226a((byte) z);
        }

        /* renamed from: a */
        public final void mo4233a(int i, String str) {
            mo4228a(i, 2);
            mo4239a(str);
        }

        /* renamed from: a */
        public final void mo4230a(int i, zzbbu zzbbu) {
            mo4228a(i, 2);
            mo4236a(zzbbu);
        }

        /* renamed from: a */
        public final void mo4236a(zzbbu zzbbu) {
            mo4242b(zzbbu.mo4215a());
            zzbbu.mo4219a((zzbbt) this);
        }

        /* renamed from: c */
        public final void mo4250c(byte[] bArr, int i, int i2) {
            mo4242b(i2);
            mo4246b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo4231a(int i, zzbel zzbel) {
            mo4228a(i, 2);
            mo4237a(zzbel);
        }

        /* renamed from: a */
        final void mo4232a(int i, zzbel zzbel, ml mlVar) {
            mo4228a(i, 2);
            zzbbl zzbbl = (zzbbl) zzbel;
            int j = zzbbl.mo4809j();
            if (j == -1) {
                j = mlVar.mo2114b(zzbbl);
                zzbbl.mo4807a(j);
            }
            mo4242b(j);
            mlVar.mo2111a((Object) zzbel, this.a);
        }

        /* renamed from: b */
        public final void mo4245b(int i, zzbel zzbel) {
            mo4228a(1, 3);
            mo4247c(2, i);
            mo4231a(3, zzbel);
            mo4228a(1, 4);
        }

        /* renamed from: b */
        public final void mo4244b(int i, zzbbu zzbbu) {
            mo4228a(1, 3);
            mo4247c(2, i);
            mo4230a(3, zzbbu);
            mo4228a(1, 4);
        }

        /* renamed from: a */
        public final void mo4237a(zzbel zzbel) {
            mo4242b(zzbel.mo4810l());
            zzbel.mo4808a(this);
        }

        /* renamed from: a */
        final void mo4238a(zzbel zzbel, ml mlVar) {
            zzbbl zzbbl = (zzbbl) zzbel;
            int j = zzbbl.mo4809j();
            if (j == -1) {
                j = mlVar.mo2114b(zzbbl);
                zzbbl.mo4807a(j);
            }
            mo4242b(j);
            mlVar.mo2111a((Object) zzbel, this.a);
        }

        /* renamed from: a */
        public final void mo4226a(byte b) {
            try {
                byte[] bArr = this.f20032b;
                int i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = b;
            } catch (byte b2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20035e), Integer.valueOf(this.f20034d), Integer.valueOf(1)}), b2);
            }
        }

        /* renamed from: a */
        public final void mo4227a(int i) {
            if (i >= 0) {
                mo4242b(i);
            } else {
                mo4235a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo4242b(int i) {
            byte[] bArr;
            int i2;
            if (!zzbck.f17079c || mo4241b() < 10) {
                while ((i & -128) != 0) {
                    bArr = this.f20032b;
                    i2 = this.f20035e;
                    this.f20035e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    bArr = this.f20032b;
                    i2 = this.f20035e;
                    this.f20035e = i2 + 1;
                    bArr[i2] = (byte) i;
                    return;
                } catch (int i3) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20035e), Integer.valueOf(this.f20034d), Integer.valueOf(1)}), i3);
                }
            }
            while ((i3 & -128) != 0) {
                bArr = this.f20032b;
                i2 = this.f20035e;
                this.f20035e = i2 + 1;
                ng.m9232a(bArr, (long) i2, (byte) ((i3 & 127) | 128));
                i3 >>>= 7;
            }
            bArr = this.f20032b;
            i2 = this.f20035e;
            this.f20035e = i2 + 1;
            ng.m9232a(bArr, (long) i2, (byte) i3);
        }

        /* renamed from: d */
        public final void mo4251d(int i) {
            try {
                byte[] bArr = this.f20032b;
                int i2 = this.f20035e;
                this.f20035e = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.f20032b;
                i2 = this.f20035e;
                this.f20035e = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.f20032b;
                i2 = this.f20035e;
                this.f20035e = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.f20032b;
                i2 = this.f20035e;
                this.f20035e = i2 + 1;
                bArr[i2] = i >> 24;
            } catch (int i3) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20035e), Integer.valueOf(this.f20034d), Integer.valueOf(1)}), i3);
            }
        }

        /* renamed from: a */
        public final void mo4235a(long j) {
            byte[] bArr;
            if (!zzbck.f17079c || mo4241b() < 10) {
                while ((j & -128) != 0) {
                    bArr = this.f20032b;
                    int i = this.f20035e;
                    this.f20035e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    bArr = this.f20032b;
                    int i2 = this.f20035e;
                    this.f20035e = i2 + 1;
                    bArr[i2] = (byte) ((int) j);
                    return;
                } catch (long j2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20035e), Integer.valueOf(this.f20034d), Integer.valueOf(1)}), j2);
                }
            }
            while ((j2 & -128) != 0) {
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                ng.m9232a(bArr, (long) i, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            bArr = this.f20032b;
            i2 = this.f20035e;
            this.f20035e = i2 + 1;
            ng.m9232a(bArr, (long) i2, (byte) ((int) j2));
        }

        /* renamed from: c */
        public final void mo4249c(long j) {
            try {
                byte[] bArr = this.f20032b;
                int i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.f20032b;
                i = this.f20035e;
                this.f20035e = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (long j2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20035e), Integer.valueOf(this.f20034d), Integer.valueOf(1)}), j2);
            }
        }

        /* renamed from: b */
        public final void mo4246b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f20032b, this.f20035e, i2);
                this.f20035e += i2;
            } catch (byte[] bArr2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20035e), Integer.valueOf(this.f20034d), Integer.valueOf(i2)}), bArr2);
            }
        }

        /* renamed from: a */
        public final void mo4240a(byte[] bArr, int i, int i2) {
            mo4246b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo4239a(String str) {
            int i = this.f20035e;
            try {
                int g = zzbck.m21544g(str.length() * 3);
                int g2 = zzbck.m21544g(str.length());
                if (g2 == g) {
                    this.f20035e = i + g2;
                    g = ni.m9268a(str, this.f20032b, this.f20035e, mo4241b());
                    this.f20035e = i;
                    mo4242b((g - i) - g2);
                    this.f20035e = g;
                    return;
                }
                mo4242b(ni.m9267a((CharSequence) str));
                this.f20035e = ni.m9268a(str, this.f20032b, this.f20035e, mo4241b());
            } catch (zzbgg e) {
                this.f20035e = i;
                m21580a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: b */
        public final int mo4241b() {
            return this.f20034d - this.f20035e;
        }

        /* renamed from: e */
        public final int m26445e() {
            return this.f20035e - this.f20033c;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbck$c */
    static final class C4704c extends zzbck {
        /* renamed from: b */
        private final ByteBuffer f20036b;
        /* renamed from: c */
        private final ByteBuffer f20037c;
        /* renamed from: d */
        private final int f20038d;

        C4704c(ByteBuffer byteBuffer) {
            super();
            this.f20036b = byteBuffer;
            this.f20037c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f20038d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo4228a(int i, int i2) {
            mo4242b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo4243b(int i, int i2) {
            mo4228a(i, 0);
            mo4227a(i2);
        }

        /* renamed from: c */
        public final void mo4247c(int i, int i2) {
            mo4228a(i, 0);
            mo4242b(i2);
        }

        /* renamed from: e */
        public final void mo4252e(int i, int i2) {
            mo4228a(i, 5);
            mo4251d(i2);
        }

        /* renamed from: a */
        public final void mo4229a(int i, long j) {
            mo4228a(i, 0);
            mo4235a(j);
        }

        /* renamed from: c */
        public final void mo4248c(int i, long j) {
            mo4228a(i, 1);
            mo4249c(j);
        }

        /* renamed from: a */
        public final void mo4234a(int i, boolean z) {
            mo4228a(i, 0);
            mo4226a((byte) z);
        }

        /* renamed from: a */
        public final void mo4233a(int i, String str) {
            mo4228a(i, 2);
            mo4239a(str);
        }

        /* renamed from: a */
        public final void mo4230a(int i, zzbbu zzbbu) {
            mo4228a(i, 2);
            mo4236a(zzbbu);
        }

        /* renamed from: a */
        public final void mo4231a(int i, zzbel zzbel) {
            mo4228a(i, 2);
            mo4237a(zzbel);
        }

        /* renamed from: a */
        final void mo4232a(int i, zzbel zzbel, ml mlVar) {
            mo4228a(i, 2);
            mo4238a(zzbel, mlVar);
        }

        /* renamed from: b */
        public final void mo4245b(int i, zzbel zzbel) {
            mo4228a(1, 3);
            mo4247c(2, i);
            mo4231a(3, zzbel);
            mo4228a(1, 4);
        }

        /* renamed from: b */
        public final void mo4244b(int i, zzbbu zzbbu) {
            mo4228a(1, 3);
            mo4247c(2, i);
            mo4230a(3, zzbbu);
            mo4228a(1, 4);
        }

        /* renamed from: a */
        public final void mo4237a(zzbel zzbel) {
            mo4242b(zzbel.mo4810l());
            zzbel.mo4808a(this);
        }

        /* renamed from: a */
        final void mo4238a(zzbel zzbel, ml mlVar) {
            zzbbl zzbbl = (zzbbl) zzbel;
            int j = zzbbl.mo4809j();
            if (j == -1) {
                j = mlVar.mo2114b(zzbbl);
                zzbbl.mo4807a(j);
            }
            mo4242b(j);
            mlVar.mo2111a((Object) zzbel, this.a);
        }

        /* renamed from: a */
        public final void mo4226a(byte b) {
            try {
                this.f20037c.put(b);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: a */
        public final void mo4236a(zzbbu zzbbu) {
            mo4242b(zzbbu.mo4215a());
            zzbbu.mo4219a((zzbbt) this);
        }

        /* renamed from: c */
        public final void mo4250c(byte[] bArr, int i, int i2) {
            mo4242b(i2);
            mo4246b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo4227a(int i) {
            if (i >= 0) {
                mo4242b(i);
            } else {
                mo4235a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo4242b(int i) {
            while ((i & -128) != 0) {
                this.f20037c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f20037c.put((byte) i);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: d */
        public final void mo4251d(int i) {
            try {
                this.f20037c.putInt(i);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: a */
        public final void mo4235a(long j) {
            while ((-128 & j) != 0) {
                this.f20037c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f20037c.put((byte) ((int) j));
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: c */
        public final void mo4249c(long j) {
            try {
                this.f20037c.putLong(j);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: b */
        public final void mo4246b(byte[] bArr, int i, int i2) {
            try {
                this.f20037c.put(bArr, i, i2);
            } catch (Throwable e) {
                throw new zzc(e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: a */
        public final void mo4240a(byte[] bArr, int i, int i2) {
            mo4246b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo4239a(String str) {
            int position = this.f20037c.position();
            try {
                int g = zzbck.m21544g(str.length() * 3);
                int g2 = zzbck.m21544g(str.length());
                if (g2 == g) {
                    g = this.f20037c.position() + g2;
                    this.f20037c.position(g);
                    m26447c(str);
                    g2 = this.f20037c.position();
                    this.f20037c.position(position);
                    mo4242b(g2 - g);
                    this.f20037c.position(g2);
                    return;
                }
                mo4242b(ni.m9267a((CharSequence) str));
                m26447c(str);
            } catch (zzbgg e) {
                this.f20037c.position(position);
                m21580a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: a */
        public final void mo4225a() {
            this.f20036b.position(this.f20037c.position());
        }

        /* renamed from: b */
        public final int mo4241b() {
            return this.f20037c.remaining();
        }

        /* renamed from: c */
        private final void m26447c(String str) {
            try {
                ni.m9269a((CharSequence) str, this.f20037c);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbck$d */
    static final class C4705d extends zzbck {
        /* renamed from: b */
        private final ByteBuffer f20039b;
        /* renamed from: c */
        private final ByteBuffer f20040c;
        /* renamed from: d */
        private final long f20041d;
        /* renamed from: e */
        private final long f20042e;
        /* renamed from: f */
        private final long f20043f;
        /* renamed from: g */
        private final long f20044g = (this.f20043f - 10);
        /* renamed from: h */
        private long f20045h = this.f20042e;

        C4705d(ByteBuffer byteBuffer) {
            super();
            this.f20039b = byteBuffer;
            this.f20040c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f20041d = ng.m9222a(byteBuffer);
            this.f20042e = this.f20041d + ((long) byteBuffer.position());
            this.f20043f = this.f20041d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo4228a(int i, int i2) {
            mo4242b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo4243b(int i, int i2) {
            mo4228a(i, 0);
            mo4227a(i2);
        }

        /* renamed from: c */
        public final void mo4247c(int i, int i2) {
            mo4228a(i, 0);
            mo4242b(i2);
        }

        /* renamed from: e */
        public final void mo4252e(int i, int i2) {
            mo4228a(i, 5);
            mo4251d(i2);
        }

        /* renamed from: a */
        public final void mo4229a(int i, long j) {
            mo4228a(i, 0);
            mo4235a(j);
        }

        /* renamed from: c */
        public final void mo4248c(int i, long j) {
            mo4228a(i, 1);
            mo4249c(j);
        }

        /* renamed from: a */
        public final void mo4234a(int i, boolean z) {
            mo4228a(i, 0);
            mo4226a((byte) z);
        }

        /* renamed from: a */
        public final void mo4233a(int i, String str) {
            mo4228a(i, 2);
            mo4239a(str);
        }

        /* renamed from: a */
        public final void mo4230a(int i, zzbbu zzbbu) {
            mo4228a(i, 2);
            mo4236a(zzbbu);
        }

        /* renamed from: a */
        public final void mo4231a(int i, zzbel zzbel) {
            mo4228a(i, 2);
            mo4237a(zzbel);
        }

        /* renamed from: a */
        final void mo4232a(int i, zzbel zzbel, ml mlVar) {
            mo4228a(i, 2);
            mo4238a(zzbel, mlVar);
        }

        /* renamed from: b */
        public final void mo4245b(int i, zzbel zzbel) {
            mo4228a(1, 3);
            mo4247c(2, i);
            mo4231a(3, zzbel);
            mo4228a(1, 4);
        }

        /* renamed from: b */
        public final void mo4244b(int i, zzbbu zzbbu) {
            mo4228a(1, 3);
            mo4247c(2, i);
            mo4230a(3, zzbbu);
            mo4228a(1, 4);
        }

        /* renamed from: a */
        public final void mo4237a(zzbel zzbel) {
            mo4242b(zzbel.mo4810l());
            zzbel.mo4808a(this);
        }

        /* renamed from: a */
        final void mo4238a(zzbel zzbel, ml mlVar) {
            zzbbl zzbbl = (zzbbl) zzbel;
            int j = zzbbl.mo4809j();
            if (j == -1) {
                j = mlVar.mo2114b(zzbbl);
                zzbbl.mo4807a(j);
            }
            mo4242b(j);
            mlVar.mo2111a((Object) zzbel, this.a);
        }

        /* renamed from: a */
        public final void mo4226a(byte b) {
            if (this.f20045h < this.f20043f) {
                long j = this.f20045h;
                this.f20045h = 1 + j;
                ng.m9224a(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20045h), Long.valueOf(this.f20043f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo4236a(zzbbu zzbbu) {
            mo4242b(zzbbu.mo4215a());
            zzbbu.mo4219a((zzbbt) this);
        }

        /* renamed from: c */
        public final void mo4250c(byte[] bArr, int i, int i2) {
            mo4242b(i2);
            mo4246b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo4227a(int i) {
            if (i >= 0) {
                mo4242b(i);
            } else {
                mo4235a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo4242b(int i) {
            long j;
            if (this.f20045h <= this.f20044g) {
                while ((i & -128) != 0) {
                    j = this.f20045h;
                    this.f20045h = j + 1;
                    ng.m9224a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.f20045h;
                this.f20045h = 1 + j;
                ng.m9224a(j, (byte) i);
                return;
            }
            while (this.f20045h < this.f20043f) {
                if ((i & -128) == 0) {
                    j = this.f20045h;
                    this.f20045h = 1 + j;
                    ng.m9224a(j, (byte) i);
                    return;
                }
                j = this.f20045h;
                this.f20045h = j + 1;
                ng.m9224a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20045h), Long.valueOf(this.f20043f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo4251d(int i) {
            this.f20040c.putInt((int) (this.f20045h - this.f20041d), i);
            this.f20045h += 4;
        }

        /* renamed from: a */
        public final void mo4235a(long j) {
            long j2;
            if (this.f20045h <= this.f20044g) {
                while ((j & -128) != 0) {
                    j2 = this.f20045h;
                    this.f20045h = j2 + 1;
                    ng.m9224a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                j2 = this.f20045h;
                this.f20045h = 1 + j2;
                ng.m9224a(j2, (byte) ((int) j));
                return;
            }
            while (this.f20045h < this.f20043f) {
                if ((j & -128) == 0) {
                    j2 = this.f20045h;
                    this.f20045h = 1 + j2;
                    ng.m9224a(j2, (byte) ((int) j));
                    return;
                }
                j2 = this.f20045h;
                this.f20045h = j2 + 1;
                ng.m9224a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20045h), Long.valueOf(this.f20043f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo4249c(long j) {
            this.f20040c.putLong((int) (this.f20045h - this.f20041d), j);
            this.f20045h += 8;
        }

        /* renamed from: b */
        public final void mo4246b(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f20043f - j >= this.f20045h) {
                    ng.m9233a(bArr, (long) i, this.f20045h, j);
                    this.f20045h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20045h), Long.valueOf(this.f20043f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo4240a(byte[] bArr, int i, int i2) {
            mo4246b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo4239a(String str) {
            long j = this.f20045h;
            try {
                int g = zzbck.m21544g(str.length() * 3);
                int g2 = zzbck.m21544g(str.length());
                if (g2 == g) {
                    g = ((int) (this.f20045h - this.f20041d)) + g2;
                    this.f20040c.position(g);
                    ni.m9269a((CharSequence) str, this.f20040c);
                    g2 = this.f20040c.position() - g;
                    mo4242b(g2);
                    this.f20045h += (long) g2;
                    return;
                }
                g = ni.m9267a((CharSequence) str);
                mo4242b(g);
                m26476i(this.f20045h);
                ni.m9269a((CharSequence) str, this.f20040c);
                this.f20045h += (long) g;
            } catch (zzbgg e) {
                this.f20045h = j;
                m26476i(this.f20045h);
                m21580a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            } catch (Throwable e22) {
                throw new zzc(e22);
            }
        }

        /* renamed from: a */
        public final void mo4225a() {
            this.f20039b.position((int) (this.f20045h - this.f20041d));
        }

        /* renamed from: b */
        public final int mo4241b() {
            return (int) (this.f20043f - this.f20045h);
        }

        /* renamed from: i */
        private final void m26476i(long j) {
            this.f20040c.position((int) (j - this.f20041d));
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbck$b */
    static final class C4828b extends C4703a {
        /* renamed from: b */
        private final ByteBuffer f21362b;
        /* renamed from: c */
        private int f21363c;

        C4828b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f21362b = byteBuffer;
            this.f21363c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo4225a() {
            this.f21362b.position(this.f21363c + m26445e());
        }
    }

    /* renamed from: a */
    public static zzbck m21513a(byte[] bArr) {
        return new C4703a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m21514b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m21515b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m21526b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m21539e(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: g */
    public static int m21544g(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m21547g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m21551h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m21552i(int i) {
        return 4;
    }

    /* renamed from: i */
    private static long m21554i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m21555j(int i) {
        return 4;
    }

    /* renamed from: m */
    private static int m21560m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo4225a();

    /* renamed from: a */
    public abstract void mo4226a(byte b);

    /* renamed from: a */
    public abstract void mo4227a(int i);

    /* renamed from: a */
    public abstract void mo4228a(int i, int i2);

    /* renamed from: a */
    public abstract void mo4229a(int i, long j);

    /* renamed from: a */
    public abstract void mo4230a(int i, zzbbu zzbbu);

    /* renamed from: a */
    public abstract void mo4231a(int i, zzbel zzbel);

    /* renamed from: a */
    abstract void mo4232a(int i, zzbel zzbel, ml mlVar);

    /* renamed from: a */
    public abstract void mo4233a(int i, String str);

    /* renamed from: a */
    public abstract void mo4234a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo4235a(long j);

    /* renamed from: a */
    public abstract void mo4236a(zzbbu zzbbu);

    /* renamed from: a */
    public abstract void mo4237a(zzbel zzbel);

    /* renamed from: a */
    abstract void mo4238a(zzbel zzbel, ml mlVar);

    /* renamed from: a */
    public abstract void mo4239a(String str);

    /* renamed from: b */
    public abstract int mo4241b();

    /* renamed from: b */
    public abstract void mo4242b(int i);

    /* renamed from: b */
    public abstract void mo4243b(int i, int i2);

    /* renamed from: b */
    public abstract void mo4244b(int i, zzbbu zzbbu);

    /* renamed from: b */
    public abstract void mo4245b(int i, zzbel zzbel);

    /* renamed from: b */
    public abstract void mo4246b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public abstract void mo4247c(int i, int i2);

    /* renamed from: c */
    public abstract void mo4248c(int i, long j);

    /* renamed from: c */
    public abstract void mo4249c(long j);

    /* renamed from: c */
    abstract void mo4250c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract void mo4251d(int i);

    /* renamed from: e */
    public abstract void mo4252e(int i, int i2);

    /* renamed from: a */
    public static zzbck m21512a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C4828b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (ng.m9239b()) {
            return new C4705d(byteBuffer);
        } else {
            return new C4704c(byteBuffer);
        }
    }

    private zzbck() {
    }

    /* renamed from: d */
    public final void m21597d(int i, int i2) {
        mo4247c(i, m21560m(i2));
    }

    /* renamed from: b */
    public final void m21585b(int i, long j) {
        mo4229a(i, m21554i(j));
    }

    /* renamed from: a */
    public final void m21567a(int i, float f) {
        mo4252e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void m21566a(int i, double d) {
        mo4248c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void m21591c(int i) {
        mo4242b(m21560m(i));
    }

    /* renamed from: b */
    public final void m21588b(long j) {
        mo4235a(m21554i(j));
    }

    /* renamed from: a */
    public final void m21564a(float f) {
        mo4251d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void m21563a(double d) {
        mo4249c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m21581a(boolean z) {
        mo4226a((byte) z);
    }

    /* renamed from: f */
    public static int m21541f(int i, int i2) {
        return m21537e(i) + m21540f(i2);
    }

    /* renamed from: g */
    public static int m21545g(int i, int i2) {
        return m21537e(i) + m21544g(i2);
    }

    /* renamed from: h */
    public static int m21549h(int i, int i2) {
        return m21537e(i) + m21544g(m21560m(i2));
    }

    /* renamed from: i */
    public static int m21553i(int i, int i2) {
        return m21537e(i) + 4;
    }

    /* renamed from: j */
    public static int m21556j(int i, int i2) {
        return m21537e(i) + 4;
    }

    /* renamed from: d */
    public static int m21532d(int i, long j) {
        return m21537e(i) + m21539e(j);
    }

    /* renamed from: e */
    public static int m21538e(int i, long j) {
        return m21537e(i) + m21539e(j);
    }

    /* renamed from: f */
    public static int m21542f(int i, long j) {
        return m21537e(i) + m21539e(m21554i(j));
    }

    /* renamed from: g */
    public static int m21546g(int i, long j) {
        return m21537e(i) + 8;
    }

    /* renamed from: h */
    public static int m21550h(int i, long j) {
        return m21537e(i) + 8;
    }

    /* renamed from: b */
    public static int m21517b(int i, float f) {
        return m21537e(i) + 4;
    }

    /* renamed from: b */
    public static int m21516b(int i, double d) {
        return m21537e(i) + 8;
    }

    /* renamed from: b */
    public static int m21521b(int i, boolean z) {
        return m21537e(i) + 1;
    }

    /* renamed from: k */
    public static int m21558k(int i, int i2) {
        return m21537e(i) + m21540f(i2);
    }

    /* renamed from: b */
    public static int m21520b(int i, String str) {
        return m21537e(i) + m21525b(str);
    }

    /* renamed from: c */
    public static int m21528c(int i, zzbbu zzbbu) {
        i = m21537e(i);
        int a = zzbbu.mo4215a();
        return i + (m21544g(a) + a);
    }

    /* renamed from: a */
    public static int m21510a(int i, zzbds zzbds) {
        i = m21537e(i);
        int b = zzbds.m10353b();
        return i + (m21544g(b) + b);
    }

    /* renamed from: c */
    public static int m21529c(int i, zzbel zzbel) {
        return m21537e(i) + m21523b(zzbel);
    }

    /* renamed from: b */
    static int m21519b(int i, zzbel zzbel, ml mlVar) {
        return m21537e(i) + m21524b(zzbel, mlVar);
    }

    /* renamed from: d */
    public static int m21534d(int i, zzbel zzbel) {
        return ((m21537e(1) << 1) + m21545g(2, i)) + m21529c(3, zzbel);
    }

    /* renamed from: d */
    public static int m21533d(int i, zzbbu zzbbu) {
        return ((m21537e(1) << 1) + m21545g(2, i)) + m21528c(3, zzbbu);
    }

    /* renamed from: b */
    public static int m21518b(int i, zzbds zzbds) {
        return ((m21537e(1) << 1) + m21545g(2, i)) + m21510a(3, zzbds);
    }

    /* renamed from: e */
    public static int m21537e(int i) {
        return m21544g(i << 3);
    }

    /* renamed from: f */
    public static int m21540f(int i) {
        return i >= 0 ? m21544g(i) : 10;
    }

    /* renamed from: h */
    public static int m21548h(int i) {
        return m21544g(m21560m(i));
    }

    /* renamed from: d */
    public static int m21535d(long j) {
        return m21539e(j);
    }

    /* renamed from: f */
    public static int m21543f(long j) {
        return m21539e(m21554i(j));
    }

    /* renamed from: k */
    public static int m21557k(int i) {
        return m21540f(i);
    }

    /* renamed from: b */
    public static int m21525b(java.lang.String r1) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = com.google.android.gms.internal.ads.ni.m9267a(r1);	 Catch:{ zzbgg -> 0x0005 }
        goto L_0x000c;
    L_0x0005:
        r0 = com.google.android.gms.internal.ads.zzbdf.f9180a;
        r1 = r1.getBytes(r0);
        r0 = r1.length;
    L_0x000c:
        r1 = m21544g(r0);
        r1 = r1 + r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbck.b(java.lang.String):int");
    }

    /* renamed from: a */
    public static int m21511a(zzbds zzbds) {
        int b = zzbds.m10353b();
        return m21544g(b) + b;
    }

    /* renamed from: b */
    public static int m21522b(zzbbu zzbbu) {
        int a = zzbbu.mo4215a();
        return m21544g(a) + a;
    }

    /* renamed from: b */
    public static int m21527b(byte[] bArr) {
        int length = bArr.length;
        return m21544g(length) + length;
    }

    /* renamed from: b */
    public static int m21523b(zzbel zzbel) {
        int l = zzbel.mo4810l();
        return m21544g(l) + l;
    }

    /* renamed from: b */
    static int m21524b(zzbel zzbel, ml mlVar) {
        zzbbl zzbbl = (zzbbl) zzbel;
        int j = zzbbl.mo4809j();
        if (j == -1) {
            j = mlVar.mo2114b(zzbbl);
            zzbbl.mo4807a(j);
        }
        return m21544g(j) + j;
    }

    /* renamed from: c */
    public final void m21590c() {
        if (mo4241b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: a */
    final void m21580a(String str, zzbgg zzbgg) {
        f17078b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzbgg);
        str = str.getBytes(zzbdf.f9180a);
        try {
            mo4242b(str.length);
            mo4240a(str, null, str.length);
        } catch (Throwable e) {
            throw new zzc(e);
        } catch (String str2) {
            throw str2;
        }
    }

    @Deprecated
    /* renamed from: c */
    static int m21530c(int i, zzbel zzbel, ml mlVar) {
        i = m21537e(i) << 1;
        zzbbl zzbbl = (zzbbl) zzbel;
        int j = zzbbl.mo4809j();
        if (j == -1) {
            j = mlVar.mo2114b(zzbbl);
            zzbbl.mo4807a(j);
        }
        return i + j;
    }

    @Deprecated
    /* renamed from: c */
    public static int m21531c(zzbel zzbel) {
        return zzbel.mo4810l();
    }

    @Deprecated
    /* renamed from: l */
    public static int m21559l(int i) {
        return m21544g(i);
    }
}
