package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzut extends zzuc {
    /* renamed from: b */
    private static final Logger f17549b = Logger.getLogger(zzut.class.getName());
    /* renamed from: c */
    private static final boolean f17550c = dp.m11755a();
    /* renamed from: a */
    bf f17551a = this;

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

    /* renamed from: com.google.android.gms.internal.measurement.zzut$a */
    static class C4709a extends zzut {
        /* renamed from: b */
        private final byte[] f20653b;
        /* renamed from: c */
        private final int f20654c;
        /* renamed from: d */
        private final int f20655d;
        /* renamed from: e */
        private int f20656e;

        C4709a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if (((i | i2) | (bArr.length - i3)) >= 0) {
                    this.f20653b = bArr;
                    this.f20654c = i;
                    this.f20656e = i;
                    this.f20655d = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo4359a() {
        }

        /* renamed from: a */
        public final void mo4362a(int i, int i2) {
            mo4376b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo4377b(int i, int i2) {
            mo4362a(i, 0);
            mo4361a(i2);
        }

        /* renamed from: c */
        public final void mo4381c(int i, int i2) {
            mo4362a(i, 0);
            mo4376b(i2);
        }

        /* renamed from: e */
        public final void mo4386e(int i, int i2) {
            mo4362a(i, 5);
            mo4385d(i2);
        }

        /* renamed from: a */
        public final void mo4363a(int i, long j) {
            mo4362a(i, 0);
            mo4369a(j);
        }

        /* renamed from: c */
        public final void mo4382c(int i, long j) {
            mo4362a(i, 1);
            mo4383c(j);
        }

        /* renamed from: a */
        public final void mo4368a(int i, boolean z) {
            mo4362a(i, 0);
            mo4360a((byte) z);
        }

        /* renamed from: a */
        public final void mo4367a(int i, String str) {
            mo4362a(i, 2);
            mo4373a(str);
        }

        /* renamed from: a */
        public final void mo4364a(int i, zzud zzud) {
            mo4362a(i, 2);
            mo4370a(zzud);
        }

        /* renamed from: a */
        public final void mo4370a(zzud zzud) {
            mo4376b(zzud.mo4351a());
            zzud.mo4355a((zzuc) this);
        }

        /* renamed from: c */
        public final void mo4384c(byte[] bArr, int i, int i2) {
            mo4376b(i2);
            mo4380b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo4365a(int i, zzwt zzwt) {
            mo4362a(i, 2);
            mo4371a(zzwt);
        }

        /* renamed from: a */
        final void mo4366a(int i, zzwt zzwt, cu cuVar) {
            mo4362a(i, 2);
            zztw zztw = (zztw) zzwt;
            int d = zztw.mo4835d();
            if (d == -1) {
                d = cuVar.mo3068b(zztw);
                zztw.mo4833a(d);
            }
            mo4376b(d);
            cuVar.mo3066a((Object) zzwt, this.a);
        }

        /* renamed from: b */
        public final void mo4379b(int i, zzwt zzwt) {
            mo4362a(1, 3);
            mo4381c(2, i);
            mo4365a(3, zzwt);
            mo4362a(1, 4);
        }

        /* renamed from: b */
        public final void mo4378b(int i, zzud zzud) {
            mo4362a(1, 3);
            mo4381c(2, i);
            mo4364a(3, zzud);
            mo4362a(1, 4);
        }

        /* renamed from: a */
        public final void mo4371a(zzwt zzwt) {
            mo4376b(zzwt.mo4836f());
            zzwt.mo4834a(this);
        }

        /* renamed from: a */
        final void mo4372a(zzwt zzwt, cu cuVar) {
            zztw zztw = (zztw) zzwt;
            int d = zztw.mo4835d();
            if (d == -1) {
                d = cuVar.mo3068b(zztw);
                zztw.mo4833a(d);
            }
            mo4376b(d);
            cuVar.mo3066a((Object) zzwt, this.a);
        }

        /* renamed from: a */
        public final void mo4360a(byte b) {
            try {
                byte[] bArr = this.f20653b;
                int i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = b;
            } catch (byte b2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20656e), Integer.valueOf(this.f20655d), Integer.valueOf(1)}), b2);
            }
        }

        /* renamed from: a */
        public final void mo4361a(int i) {
            if (i >= 0) {
                mo4376b(i);
            } else {
                mo4369a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo4376b(int i) {
            byte[] bArr;
            int i2;
            if (!zzut.f17550c || mo4375b() < 10) {
                while ((i & -128) != 0) {
                    bArr = this.f20653b;
                    i2 = this.f20656e;
                    this.f20656e = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    bArr = this.f20653b;
                    i2 = this.f20656e;
                    this.f20656e = i2 + 1;
                    bArr[i2] = (byte) i;
                    return;
                } catch (int i3) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20656e), Integer.valueOf(this.f20655d), Integer.valueOf(1)}), i3);
                }
            }
            while ((i3 & -128) != 0) {
                bArr = this.f20653b;
                i2 = this.f20656e;
                this.f20656e = i2 + 1;
                dp.m11753a(bArr, (long) i2, (byte) ((i3 & 127) | 128));
                i3 >>>= 7;
            }
            bArr = this.f20653b;
            i2 = this.f20656e;
            this.f20656e = i2 + 1;
            dp.m11753a(bArr, (long) i2, (byte) i3);
        }

        /* renamed from: d */
        public final void mo4385d(int i) {
            try {
                byte[] bArr = this.f20653b;
                int i2 = this.f20656e;
                this.f20656e = i2 + 1;
                bArr[i2] = (byte) i;
                bArr = this.f20653b;
                i2 = this.f20656e;
                this.f20656e = i2 + 1;
                bArr[i2] = (byte) (i >> 8);
                bArr = this.f20653b;
                i2 = this.f20656e;
                this.f20656e = i2 + 1;
                bArr[i2] = (byte) (i >> 16);
                bArr = this.f20653b;
                i2 = this.f20656e;
                this.f20656e = i2 + 1;
                bArr[i2] = i >> 24;
            } catch (int i3) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20656e), Integer.valueOf(this.f20655d), Integer.valueOf(1)}), i3);
            }
        }

        /* renamed from: a */
        public final void mo4369a(long j) {
            byte[] bArr;
            if (!zzut.f17550c || mo4375b() < 10) {
                while ((j & -128) != 0) {
                    bArr = this.f20653b;
                    int i = this.f20656e;
                    this.f20656e = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    bArr = this.f20653b;
                    int i2 = this.f20656e;
                    this.f20656e = i2 + 1;
                    bArr[i2] = (byte) ((int) j);
                    return;
                } catch (long j2) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20656e), Integer.valueOf(this.f20655d), Integer.valueOf(1)}), j2);
                }
            }
            while ((j2 & -128) != 0) {
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                dp.m11753a(bArr, (long) i, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            bArr = this.f20653b;
            i2 = this.f20656e;
            this.f20656e = i2 + 1;
            dp.m11753a(bArr, (long) i2, (byte) ((int) j2));
        }

        /* renamed from: c */
        public final void mo4383c(long j) {
            try {
                byte[] bArr = this.f20653b;
                int i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) j);
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 8));
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 16));
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 24));
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 32));
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 40));
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 48));
                bArr = this.f20653b;
                i = this.f20656e;
                this.f20656e = i + 1;
                bArr[i] = (byte) ((int) (j >> 56));
            } catch (long j2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20656e), Integer.valueOf(this.f20655d), Integer.valueOf(1)}), j2);
            }
        }

        /* renamed from: b */
        public final void mo4380b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f20653b, this.f20656e, i2);
                this.f20656e += i2;
            } catch (byte[] bArr2) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f20656e), Integer.valueOf(this.f20655d), Integer.valueOf(i2)}), bArr2);
            }
        }

        /* renamed from: a */
        public final void mo4374a(byte[] bArr, int i, int i2) {
            mo4380b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo4373a(String str) {
            int i = this.f20656e;
            try {
                int g = zzut.m22576g(str.length() * 3);
                int g2 = zzut.m22576g(str.length());
                if (g2 == g) {
                    this.f20656e = i + g2;
                    g = dr.m11789a(str, this.f20653b, this.f20656e, mo4375b());
                    this.f20656e = i;
                    mo4376b((g - i) - g2);
                    this.f20656e = g;
                    return;
                }
                mo4376b(dr.m11788a((CharSequence) str));
                this.f20656e = dr.m11789a(str, this.f20653b, this.f20656e, mo4375b());
            } catch (zzyn e) {
                this.f20656e = i;
                m22612a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: b */
        public final int mo4375b() {
            return this.f20655d - this.f20656e;
        }

        /* renamed from: d */
        public final int m27210d() {
            return this.f20656e - this.f20654c;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzut$c */
    static final class C4710c extends zzut {
        /* renamed from: b */
        private final ByteBuffer f20657b;
        /* renamed from: c */
        private final ByteBuffer f20658c;
        /* renamed from: d */
        private final int f20659d;

        C4710c(ByteBuffer byteBuffer) {
            super();
            this.f20657b = byteBuffer;
            this.f20658c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f20659d = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo4362a(int i, int i2) {
            mo4376b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo4377b(int i, int i2) {
            mo4362a(i, 0);
            mo4361a(i2);
        }

        /* renamed from: c */
        public final void mo4381c(int i, int i2) {
            mo4362a(i, 0);
            mo4376b(i2);
        }

        /* renamed from: e */
        public final void mo4386e(int i, int i2) {
            mo4362a(i, 5);
            mo4385d(i2);
        }

        /* renamed from: a */
        public final void mo4363a(int i, long j) {
            mo4362a(i, 0);
            mo4369a(j);
        }

        /* renamed from: c */
        public final void mo4382c(int i, long j) {
            mo4362a(i, 1);
            mo4383c(j);
        }

        /* renamed from: a */
        public final void mo4368a(int i, boolean z) {
            mo4362a(i, 0);
            mo4360a((byte) z);
        }

        /* renamed from: a */
        public final void mo4367a(int i, String str) {
            mo4362a(i, 2);
            mo4373a(str);
        }

        /* renamed from: a */
        public final void mo4364a(int i, zzud zzud) {
            mo4362a(i, 2);
            mo4370a(zzud);
        }

        /* renamed from: a */
        public final void mo4365a(int i, zzwt zzwt) {
            mo4362a(i, 2);
            mo4371a(zzwt);
        }

        /* renamed from: a */
        final void mo4366a(int i, zzwt zzwt, cu cuVar) {
            mo4362a(i, 2);
            mo4372a(zzwt, cuVar);
        }

        /* renamed from: b */
        public final void mo4379b(int i, zzwt zzwt) {
            mo4362a(1, 3);
            mo4381c(2, i);
            mo4365a(3, zzwt);
            mo4362a(1, 4);
        }

        /* renamed from: b */
        public final void mo4378b(int i, zzud zzud) {
            mo4362a(1, 3);
            mo4381c(2, i);
            mo4364a(3, zzud);
            mo4362a(1, 4);
        }

        /* renamed from: a */
        public final void mo4371a(zzwt zzwt) {
            mo4376b(zzwt.mo4836f());
            zzwt.mo4834a(this);
        }

        /* renamed from: a */
        final void mo4372a(zzwt zzwt, cu cuVar) {
            zztw zztw = (zztw) zzwt;
            int d = zztw.mo4835d();
            if (d == -1) {
                d = cuVar.mo3068b(zztw);
                zztw.mo4833a(d);
            }
            mo4376b(d);
            cuVar.mo3066a((Object) zzwt, this.a);
        }

        /* renamed from: a */
        public final void mo4360a(byte b) {
            try {
                this.f20658c.put(b);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: a */
        public final void mo4370a(zzud zzud) {
            mo4376b(zzud.mo4351a());
            zzud.mo4355a((zzuc) this);
        }

        /* renamed from: c */
        public final void mo4384c(byte[] bArr, int i, int i2) {
            mo4376b(i2);
            mo4380b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo4361a(int i) {
            if (i >= 0) {
                mo4376b(i);
            } else {
                mo4369a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo4376b(int i) {
            while ((i & -128) != 0) {
                this.f20658c.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f20658c.put((byte) i);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: d */
        public final void mo4385d(int i) {
            try {
                this.f20658c.putInt(i);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: a */
        public final void mo4369a(long j) {
            while ((-128 & j) != 0) {
                this.f20658c.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f20658c.put((byte) ((int) j));
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: c */
        public final void mo4383c(long j) {
            try {
                this.f20658c.putLong(j);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }

        /* renamed from: b */
        public final void mo4380b(byte[] bArr, int i, int i2) {
            try {
                this.f20658c.put(bArr, i, i2);
            } catch (Throwable e) {
                throw new zzc(e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: a */
        public final void mo4374a(byte[] bArr, int i, int i2) {
            mo4380b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo4373a(String str) {
            int position = this.f20658c.position();
            try {
                int g = zzut.m22576g(str.length() * 3);
                int g2 = zzut.m22576g(str.length());
                if (g2 == g) {
                    g = this.f20658c.position() + g2;
                    this.f20658c.position(g);
                    m27213c(str);
                    g2 = this.f20658c.position();
                    this.f20658c.position(position);
                    mo4376b(g2 - g);
                    this.f20658c.position(g2);
                    return;
                }
                mo4376b(dr.m11788a((CharSequence) str));
                m27213c(str);
            } catch (zzyn e) {
                this.f20658c.position(position);
                m22612a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            }
        }

        /* renamed from: a */
        public final void mo4359a() {
            this.f20657b.position(this.f20658c.position());
        }

        /* renamed from: b */
        public final int mo4375b() {
            return this.f20658c.remaining();
        }

        /* renamed from: c */
        private final void m27213c(String str) {
            try {
                dr.m11790a((CharSequence) str, this.f20658c);
            } catch (Throwable e) {
                throw new zzc(e);
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzut$d */
    static final class C4711d extends zzut {
        /* renamed from: b */
        private final ByteBuffer f20660b;
        /* renamed from: c */
        private final ByteBuffer f20661c;
        /* renamed from: d */
        private final long f20662d;
        /* renamed from: e */
        private final long f20663e;
        /* renamed from: f */
        private final long f20664f;
        /* renamed from: g */
        private final long f20665g = (this.f20664f - 10);
        /* renamed from: h */
        private long f20666h = this.f20663e;

        C4711d(ByteBuffer byteBuffer) {
            super();
            this.f20660b = byteBuffer;
            this.f20661c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f20662d = dp.m11743a(byteBuffer);
            this.f20663e = this.f20662d + ((long) byteBuffer.position());
            this.f20664f = this.f20662d + ((long) byteBuffer.limit());
        }

        /* renamed from: a */
        public final void mo4362a(int i, int i2) {
            mo4376b((i << 3) | i2);
        }

        /* renamed from: b */
        public final void mo4377b(int i, int i2) {
            mo4362a(i, 0);
            mo4361a(i2);
        }

        /* renamed from: c */
        public final void mo4381c(int i, int i2) {
            mo4362a(i, 0);
            mo4376b(i2);
        }

        /* renamed from: e */
        public final void mo4386e(int i, int i2) {
            mo4362a(i, 5);
            mo4385d(i2);
        }

        /* renamed from: a */
        public final void mo4363a(int i, long j) {
            mo4362a(i, 0);
            mo4369a(j);
        }

        /* renamed from: c */
        public final void mo4382c(int i, long j) {
            mo4362a(i, 1);
            mo4383c(j);
        }

        /* renamed from: a */
        public final void mo4368a(int i, boolean z) {
            mo4362a(i, 0);
            mo4360a((byte) z);
        }

        /* renamed from: a */
        public final void mo4367a(int i, String str) {
            mo4362a(i, 2);
            mo4373a(str);
        }

        /* renamed from: a */
        public final void mo4364a(int i, zzud zzud) {
            mo4362a(i, 2);
            mo4370a(zzud);
        }

        /* renamed from: a */
        public final void mo4365a(int i, zzwt zzwt) {
            mo4362a(i, 2);
            mo4371a(zzwt);
        }

        /* renamed from: a */
        final void mo4366a(int i, zzwt zzwt, cu cuVar) {
            mo4362a(i, 2);
            mo4372a(zzwt, cuVar);
        }

        /* renamed from: b */
        public final void mo4379b(int i, zzwt zzwt) {
            mo4362a(1, 3);
            mo4381c(2, i);
            mo4365a(3, zzwt);
            mo4362a(1, 4);
        }

        /* renamed from: b */
        public final void mo4378b(int i, zzud zzud) {
            mo4362a(1, 3);
            mo4381c(2, i);
            mo4364a(3, zzud);
            mo4362a(1, 4);
        }

        /* renamed from: a */
        public final void mo4371a(zzwt zzwt) {
            mo4376b(zzwt.mo4836f());
            zzwt.mo4834a(this);
        }

        /* renamed from: a */
        final void mo4372a(zzwt zzwt, cu cuVar) {
            zztw zztw = (zztw) zzwt;
            int d = zztw.mo4835d();
            if (d == -1) {
                d = cuVar.mo3068b(zztw);
                zztw.mo4833a(d);
            }
            mo4376b(d);
            cuVar.mo3066a((Object) zzwt, this.a);
        }

        /* renamed from: a */
        public final void mo4360a(byte b) {
            if (this.f20666h < this.f20664f) {
                long j = this.f20666h;
                this.f20666h = 1 + j;
                dp.m11745a(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20666h), Long.valueOf(this.f20664f), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo4370a(zzud zzud) {
            mo4376b(zzud.mo4351a());
            zzud.mo4355a((zzuc) this);
        }

        /* renamed from: c */
        public final void mo4384c(byte[] bArr, int i, int i2) {
            mo4376b(i2);
            mo4380b(bArr, 0, i2);
        }

        /* renamed from: a */
        public final void mo4361a(int i) {
            if (i >= 0) {
                mo4376b(i);
            } else {
                mo4369a((long) i);
            }
        }

        /* renamed from: b */
        public final void mo4376b(int i) {
            long j;
            if (this.f20666h <= this.f20665g) {
                while ((i & -128) != 0) {
                    j = this.f20666h;
                    this.f20666h = j + 1;
                    dp.m11745a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.f20666h;
                this.f20666h = 1 + j;
                dp.m11745a(j, (byte) i);
                return;
            }
            while (this.f20666h < this.f20664f) {
                if ((i & -128) == 0) {
                    j = this.f20666h;
                    this.f20666h = 1 + j;
                    dp.m11745a(j, (byte) i);
                    return;
                }
                j = this.f20666h;
                this.f20666h = j + 1;
                dp.m11745a(j, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20666h), Long.valueOf(this.f20664f), Integer.valueOf(1)}));
        }

        /* renamed from: d */
        public final void mo4385d(int i) {
            this.f20661c.putInt((int) (this.f20666h - this.f20662d), i);
            this.f20666h += 4;
        }

        /* renamed from: a */
        public final void mo4369a(long j) {
            long j2;
            if (this.f20666h <= this.f20665g) {
                while ((j & -128) != 0) {
                    j2 = this.f20666h;
                    this.f20666h = j2 + 1;
                    dp.m11745a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                j2 = this.f20666h;
                this.f20666h = 1 + j2;
                dp.m11745a(j2, (byte) ((int) j));
                return;
            }
            while (this.f20666h < this.f20664f) {
                if ((j & -128) == 0) {
                    j2 = this.f20666h;
                    this.f20666h = 1 + j2;
                    dp.m11745a(j2, (byte) ((int) j));
                    return;
                }
                j2 = this.f20666h;
                this.f20666h = j2 + 1;
                dp.m11745a(j2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20666h), Long.valueOf(this.f20664f), Integer.valueOf(1)}));
        }

        /* renamed from: c */
        public final void mo4383c(long j) {
            this.f20661c.putLong((int) (this.f20666h - this.f20662d), j);
            this.f20666h += 8;
        }

        /* renamed from: b */
        public final void mo4380b(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                if (this.f20664f - j >= this.f20666h) {
                    dp.m11754a(bArr, (long) i, this.f20666h, j);
                    this.f20666h += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f20666h), Long.valueOf(this.f20664f), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public final void mo4374a(byte[] bArr, int i, int i2) {
            mo4380b(bArr, i, i2);
        }

        /* renamed from: a */
        public final void mo4373a(String str) {
            long j = this.f20666h;
            try {
                int g = zzut.m22576g(str.length() * 3);
                int g2 = zzut.m22576g(str.length());
                if (g2 == g) {
                    g = ((int) (this.f20666h - this.f20662d)) + g2;
                    this.f20661c.position(g);
                    dr.m11790a((CharSequence) str, this.f20661c);
                    g2 = this.f20661c.position() - g;
                    mo4376b(g2);
                    this.f20666h += (long) g2;
                    return;
                }
                g = dr.m11788a((CharSequence) str);
                mo4376b(g);
                m27242i(this.f20666h);
                dr.m11790a((CharSequence) str, this.f20661c);
                this.f20666h += (long) g;
            } catch (zzyn e) {
                this.f20666h = j;
                m27242i(this.f20666h);
                m22612a(str, e);
            } catch (Throwable e2) {
                throw new zzc(e2);
            } catch (Throwable e22) {
                throw new zzc(e22);
            }
        }

        /* renamed from: a */
        public final void mo4359a() {
            this.f20660b.position((int) (this.f20666h - this.f20662d));
        }

        /* renamed from: b */
        public final int mo4375b() {
            return (int) (this.f20664f - this.f20666h);
        }

        /* renamed from: i */
        private final void m27242i(long j) {
            this.f20661c.position((int) (j - this.f20662d));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzut$b */
    static final class C4831b extends C4709a {
        /* renamed from: b */
        private final ByteBuffer f21374b;
        /* renamed from: c */
        private int f21375c;

        C4831b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f21374b = byteBuffer;
            this.f21375c = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo4359a() {
            this.f21374b.position(this.f21375c + m27210d());
        }
    }

    /* renamed from: a */
    public static zzut m22545a(byte[] bArr) {
        return new C4709a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m22546b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m22547b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m22558b(boolean z) {
        return 1;
    }

    /* renamed from: e */
    public static int m22571e(long j) {
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
    public static int m22576g(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: g */
    public static int m22579g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m22583h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m22584i(int i) {
        return 4;
    }

    /* renamed from: i */
    private static long m22586i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m22587j(int i) {
        return 4;
    }

    /* renamed from: m */
    private static int m22592m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: a */
    public abstract void mo4359a();

    /* renamed from: a */
    public abstract void mo4360a(byte b);

    /* renamed from: a */
    public abstract void mo4361a(int i);

    /* renamed from: a */
    public abstract void mo4362a(int i, int i2);

    /* renamed from: a */
    public abstract void mo4363a(int i, long j);

    /* renamed from: a */
    public abstract void mo4364a(int i, zzud zzud);

    /* renamed from: a */
    public abstract void mo4365a(int i, zzwt zzwt);

    /* renamed from: a */
    abstract void mo4366a(int i, zzwt zzwt, cu cuVar);

    /* renamed from: a */
    public abstract void mo4367a(int i, String str);

    /* renamed from: a */
    public abstract void mo4368a(int i, boolean z);

    /* renamed from: a */
    public abstract void mo4369a(long j);

    /* renamed from: a */
    public abstract void mo4370a(zzud zzud);

    /* renamed from: a */
    public abstract void mo4371a(zzwt zzwt);

    /* renamed from: a */
    abstract void mo4372a(zzwt zzwt, cu cuVar);

    /* renamed from: a */
    public abstract void mo4373a(String str);

    /* renamed from: b */
    public abstract int mo4375b();

    /* renamed from: b */
    public abstract void mo4376b(int i);

    /* renamed from: b */
    public abstract void mo4377b(int i, int i2);

    /* renamed from: b */
    public abstract void mo4378b(int i, zzud zzud);

    /* renamed from: b */
    public abstract void mo4379b(int i, zzwt zzwt);

    /* renamed from: b */
    public abstract void mo4380b(byte[] bArr, int i, int i2);

    /* renamed from: c */
    public abstract void mo4381c(int i, int i2);

    /* renamed from: c */
    public abstract void mo4382c(int i, long j);

    /* renamed from: c */
    public abstract void mo4383c(long j);

    /* renamed from: c */
    abstract void mo4384c(byte[] bArr, int i, int i2);

    /* renamed from: d */
    public abstract void mo4385d(int i);

    /* renamed from: e */
    public abstract void mo4386e(int i, int i2);

    /* renamed from: a */
    public static zzut m22544a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C4831b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (dp.m11760b()) {
            return new C4711d(byteBuffer);
        } else {
            return new C4710c(byteBuffer);
        }
    }

    private zzut() {
    }

    /* renamed from: d */
    public final void m22628d(int i, int i2) {
        mo4381c(i, m22592m(i2));
    }

    /* renamed from: b */
    public final void m22617b(int i, long j) {
        mo4363a(i, m22586i(j));
    }

    /* renamed from: a */
    public final void m22599a(int i, float f) {
        mo4386e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void m22598a(int i, double d) {
        mo4382c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: c */
    public final void m22622c(int i) {
        mo4376b(m22592m(i));
    }

    /* renamed from: b */
    public final void m22620b(long j) {
        mo4369a(m22586i(j));
    }

    /* renamed from: a */
    public final void m22596a(float f) {
        mo4385d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void m22595a(double d) {
        mo4383c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void m22613a(boolean z) {
        mo4360a((byte) z);
    }

    /* renamed from: f */
    public static int m22573f(int i, int i2) {
        return m22569e(i) + m22572f(i2);
    }

    /* renamed from: g */
    public static int m22577g(int i, int i2) {
        return m22569e(i) + m22576g(i2);
    }

    /* renamed from: h */
    public static int m22581h(int i, int i2) {
        return m22569e(i) + m22576g(m22592m(i2));
    }

    /* renamed from: i */
    public static int m22585i(int i, int i2) {
        return m22569e(i) + 4;
    }

    /* renamed from: j */
    public static int m22588j(int i, int i2) {
        return m22569e(i) + 4;
    }

    /* renamed from: d */
    public static int m22565d(int i, long j) {
        return m22569e(i) + m22571e(j);
    }

    /* renamed from: e */
    public static int m22570e(int i, long j) {
        return m22569e(i) + m22571e(j);
    }

    /* renamed from: f */
    public static int m22574f(int i, long j) {
        return m22569e(i) + m22571e(m22586i(j));
    }

    /* renamed from: g */
    public static int m22578g(int i, long j) {
        return m22569e(i) + 8;
    }

    /* renamed from: h */
    public static int m22582h(int i, long j) {
        return m22569e(i) + 8;
    }

    /* renamed from: b */
    public static int m22549b(int i, float f) {
        return m22569e(i) + 4;
    }

    /* renamed from: b */
    public static int m22548b(int i, double d) {
        return m22569e(i) + 8;
    }

    /* renamed from: b */
    public static int m22553b(int i, boolean z) {
        return m22569e(i) + 1;
    }

    /* renamed from: k */
    public static int m22590k(int i, int i2) {
        return m22569e(i) + m22572f(i2);
    }

    /* renamed from: b */
    public static int m22552b(int i, String str) {
        return m22569e(i) + m22557b(str);
    }

    /* renamed from: c */
    public static int m22560c(int i, zzud zzud) {
        i = m22569e(i);
        int a = zzud.mo4351a();
        return i + (m22576g(a) + a);
    }

    /* renamed from: a */
    public static int m22542a(int i, zzwa zzwa) {
        i = m22569e(i);
        int b = zzwa.m12093b();
        return i + (m22576g(b) + b);
    }

    /* renamed from: c */
    public static int m22561c(int i, zzwt zzwt) {
        return m22569e(i) + m22555b(zzwt);
    }

    /* renamed from: b */
    static int m22551b(int i, zzwt zzwt, cu cuVar) {
        return m22569e(i) + m22556b(zzwt, cuVar);
    }

    /* renamed from: d */
    public static int m22567d(int i, zzwt zzwt) {
        return ((m22569e(1) << 1) + m22577g(2, i)) + m22561c(3, zzwt);
    }

    /* renamed from: d */
    public static int m22566d(int i, zzud zzud) {
        return ((m22569e(1) << 1) + m22577g(2, i)) + m22560c(3, zzud);
    }

    /* renamed from: b */
    public static int m22550b(int i, zzwa zzwa) {
        return ((m22569e(1) << 1) + m22577g(2, i)) + m22542a(3, zzwa);
    }

    /* renamed from: e */
    public static int m22569e(int i) {
        return m22576g(i << 3);
    }

    /* renamed from: f */
    public static int m22572f(int i) {
        return i >= 0 ? m22576g(i) : 10;
    }

    /* renamed from: h */
    public static int m22580h(int i) {
        return m22576g(m22592m(i));
    }

    /* renamed from: d */
    public static int m22568d(long j) {
        return m22571e(j);
    }

    /* renamed from: f */
    public static int m22575f(long j) {
        return m22571e(m22586i(j));
    }

    /* renamed from: k */
    public static int m22589k(int i) {
        return m22572f(i);
    }

    /* renamed from: b */
    public static int m22557b(java.lang.String r1) {
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
        r0 = com.google.android.gms.internal.measurement.dr.m11788a(r1);	 Catch:{ zzyn -> 0x0005 }
        goto L_0x000c;
    L_0x0005:
        r0 = com.google.android.gms.internal.measurement.zzvo.f10281a;
        r1 = r1.getBytes(r0);
        r0 = r1.length;
    L_0x000c:
        r1 = m22576g(r0);
        r1 = r1 + r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzut.b(java.lang.String):int");
    }

    /* renamed from: a */
    public static int m22543a(zzwa zzwa) {
        int b = zzwa.m12093b();
        return m22576g(b) + b;
    }

    /* renamed from: b */
    public static int m22554b(zzud zzud) {
        int a = zzud.mo4351a();
        return m22576g(a) + a;
    }

    /* renamed from: b */
    public static int m22559b(byte[] bArr) {
        int length = bArr.length;
        return m22576g(length) + length;
    }

    /* renamed from: b */
    public static int m22555b(zzwt zzwt) {
        int f = zzwt.mo4836f();
        return m22576g(f) + f;
    }

    /* renamed from: b */
    static int m22556b(zzwt zzwt, cu cuVar) {
        zztw zztw = (zztw) zzwt;
        int d = zztw.mo4835d();
        if (d == -1) {
            d = cuVar.mo3068b(zztw);
            zztw.mo4833a(d);
        }
        return m22576g(d) + d;
    }

    /* renamed from: a */
    final void m22612a(String str, zzyn zzyn) {
        f17549b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzyn);
        str = str.getBytes(zzvo.f10281a);
        try {
            mo4376b(str.length);
            mo4374a(str, null, str.length);
        } catch (Throwable e) {
            throw new zzc(e);
        } catch (String str2) {
            throw str2;
        }
    }

    @Deprecated
    /* renamed from: c */
    static int m22562c(int i, zzwt zzwt, cu cuVar) {
        i = m22569e(i) << 1;
        zztw zztw = (zztw) zzwt;
        int d = zztw.mo4835d();
        if (d == -1) {
            d = cuVar.mo3068b(zztw);
            zztw.mo4833a(d);
        }
        return i + d;
    }

    @Deprecated
    /* renamed from: c */
    public static int m22563c(zzwt zzwt) {
        return zzwt.mo4836f();
    }

    @Deprecated
    /* renamed from: l */
    public static int m22591l(int i) {
        return m22576g(i);
    }
}
