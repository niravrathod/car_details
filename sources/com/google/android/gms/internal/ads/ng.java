package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class ng {
    /* renamed from: a */
    private static final Logger f8276a = Logger.getLogger(ng.class.getName());
    /* renamed from: b */
    private static final Unsafe f8277b = m9240c();
    /* renamed from: c */
    private static final Class<?> f8278c = kg.m8959b();
    /* renamed from: d */
    private static final boolean f8279d = m9243c(Long.TYPE);
    /* renamed from: e */
    private static final boolean f8280e = m9243c(Integer.TYPE);
    /* renamed from: f */
    private static final C2443d f8281f;
    /* renamed from: g */
    private static final boolean f8282g = m9255g();
    /* renamed from: h */
    private static final boolean f8283h = m9253f();
    /* renamed from: i */
    private static final long f8284i = ((long) m9220a(byte[].class));
    /* renamed from: j */
    private static final long f8285j = ((long) m9220a(boolean[].class));
    /* renamed from: k */
    private static final long f8286k = ((long) m9235b(boolean[].class));
    /* renamed from: l */
    private static final long f8287l = ((long) m9220a(int[].class));
    /* renamed from: m */
    private static final long f8288m = ((long) m9235b(int[].class));
    /* renamed from: n */
    private static final long f8289n = ((long) m9220a(long[].class));
    /* renamed from: o */
    private static final long f8290o = ((long) m9235b(long[].class));
    /* renamed from: p */
    private static final long f8291p = ((long) m9220a(float[].class));
    /* renamed from: q */
    private static final long f8292q = ((long) m9235b(float[].class));
    /* renamed from: r */
    private static final long f8293r = ((long) m9220a(double[].class));
    /* renamed from: s */
    private static final long f8294s = ((long) m9235b(double[].class));
    /* renamed from: t */
    private static final long f8295t = ((long) m9220a(Object[].class));
    /* renamed from: u */
    private static final long f8296u = ((long) m9235b(Object[].class));
    /* renamed from: v */
    private static final long f8297v;
    /* renamed from: w */
    private static final boolean f8298w = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.ads.ng$d */
    static abstract class C2443d {
        /* renamed from: a */
        Unsafe f8275a;

        C2443d(Unsafe unsafe) {
            this.f8275a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo2144a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo2145a(long j, byte b);

        /* renamed from: a */
        public abstract void mo2146a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo2147a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo2148a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo2149a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo2150a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo2151b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo2152c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo2153d(Object obj, long j);

        /* renamed from: e */
        public final int m9217e(Object obj, long j) {
            return this.f8275a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void m9210a(Object obj, long j, int i) {
            this.f8275a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long m9218f(Object obj, long j) {
            return this.f8275a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void m9211a(Object obj, long j, long j2) {
            this.f8275a.putLong(obj, j, j2);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ng$a */
    static final class C4097a extends C2443d {
        C4097a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo2145a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo2144a(Object obj, long j) {
            if (ng.f8298w) {
                return ng.m9260k(obj, j);
            }
            return ng.m9261l(obj, j);
        }

        /* renamed from: a */
        public final void mo2146a(Object obj, long j, byte b) {
            if (ng.f8298w) {
                ng.m9241c(obj, j, b);
            } else {
                ng.m9247d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo2151b(Object obj, long j) {
            if (ng.f8298w) {
                return ng.m9262m(obj, j);
            }
            return ng.m9263n(obj, j);
        }

        /* renamed from: a */
        public final void mo2149a(Object obj, long j, boolean z) {
            if (ng.f8298w) {
                ng.m9248d(obj, j, z);
            } else {
                ng.m9250e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo2152c(Object obj, long j) {
            return Float.intBitsToFloat(m9217e(obj, j));
        }

        /* renamed from: a */
        public final void mo2148a(Object obj, long j, float f) {
            m9210a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo2153d(Object obj, long j) {
            return Double.longBitsToDouble(m9218f(obj, j));
        }

        /* renamed from: a */
        public final void mo2147a(Object obj, long j, double d) {
            m9211a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo2150a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ng$b */
    static final class C4098b extends C2443d {
        C4098b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo2145a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo2144a(Object obj, long j) {
            if (ng.f8298w) {
                return ng.m9260k(obj, j);
            }
            return ng.m9261l(obj, j);
        }

        /* renamed from: a */
        public final void mo2146a(Object obj, long j, byte b) {
            if (ng.f8298w) {
                ng.m9241c(obj, j, b);
            } else {
                ng.m9247d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo2151b(Object obj, long j) {
            if (ng.f8298w) {
                return ng.m9262m(obj, j);
            }
            return ng.m9263n(obj, j);
        }

        /* renamed from: a */
        public final void mo2149a(Object obj, long j, boolean z) {
            if (ng.f8298w) {
                ng.m9248d(obj, j, z);
            } else {
                ng.m9250e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo2152c(Object obj, long j) {
            return Float.intBitsToFloat(m9217e(obj, j));
        }

        /* renamed from: a */
        public final void mo2148a(Object obj, long j, float f) {
            m9210a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo2153d(Object obj, long j) {
            return Double.longBitsToDouble(m9218f(obj, j));
        }

        /* renamed from: a */
        public final void mo2147a(Object obj, long j, double d) {
            m9211a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo2150a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ng$c */
    static final class C4099c extends C2443d {
        C4099c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo2145a(long j, byte b) {
            this.a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo2144a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo2146a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo2151b(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo2149a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo2152c(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo2148a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo2153d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo2147a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo2150a(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, ng.f8284i + j, null, j2, j3);
        }
    }

    private ng() {
    }

    /* renamed from: a */
    static boolean m9234a() {
        return f8283h;
    }

    /* renamed from: b */
    static boolean m9239b() {
        return f8282g;
    }

    /* renamed from: a */
    private static int m9220a(Class<?> cls) {
        return f8283h ? f8281f.f8275a.arrayBaseOffset(cls) : -1;
    }

    /* renamed from: b */
    private static int m9235b(Class<?> cls) {
        return f8283h ? f8281f.f8275a.arrayIndexScale(cls) : -1;
    }

    /* renamed from: a */
    static int m9221a(Object obj, long j) {
        return f8281f.m9217e(obj, j);
    }

    /* renamed from: a */
    static void m9228a(Object obj, long j, int i) {
        f8281f.m9210a(obj, j, i);
    }

    /* renamed from: b */
    static long m9236b(Object obj, long j) {
        return f8281f.m9218f(obj, j);
    }

    /* renamed from: a */
    static void m9229a(Object obj, long j, long j2) {
        f8281f.m9211a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m9244c(Object obj, long j) {
        return f8281f.mo2151b(obj, j);
    }

    /* renamed from: a */
    static void m9231a(Object obj, long j, boolean z) {
        f8281f.mo2149a(obj, j, z);
    }

    /* renamed from: d */
    static float m9245d(Object obj, long j) {
        return f8281f.mo2152c(obj, j);
    }

    /* renamed from: a */
    static void m9227a(Object obj, long j, float f) {
        f8281f.mo2148a(obj, j, f);
    }

    /* renamed from: e */
    static double m9249e(Object obj, long j) {
        return f8281f.mo2153d(obj, j);
    }

    /* renamed from: a */
    static void m9226a(Object obj, long j, double d) {
        f8281f.mo2147a(obj, j, d);
    }

    /* renamed from: f */
    static Object m9252f(Object obj, long j) {
        return f8281f.f8275a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m9230a(Object obj, long j, Object obj2) {
        f8281f.f8275a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m9219a(byte[] bArr, long j) {
        return f8281f.mo2144a((Object) bArr, f8284i + j);
    }

    /* renamed from: a */
    static void m9232a(byte[] bArr, long j, byte b) {
        f8281f.mo2146a((Object) bArr, f8284i + j, b);
    }

    /* renamed from: a */
    static void m9233a(byte[] bArr, long j, long j2, long j3) {
        f8281f.mo2150a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m9224a(long j, byte b) {
        f8281f.mo2145a(j, b);
    }

    /* renamed from: a */
    static long m9222a(ByteBuffer byteBuffer) {
        return f8281f.m9218f(byteBuffer, f8297v);
    }

    /* renamed from: c */
    static sun.misc.Unsafe m9240c() {
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
        r0 = new com.google.android.gms.internal.ads.nh;	 Catch:{ Throwable -> 0x000c }
        r0.<init>();	 Catch:{ Throwable -> 0x000c }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ Throwable -> 0x000c }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ Throwable -> 0x000c }
        goto L_0x000d;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ng.c():sun.misc.Unsafe");
    }

    /* renamed from: f */
    private static boolean m9253f() {
        if (f8277b == null) {
            return false;
        }
        try {
            Class cls = f8277b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (kg.m8958a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            f8276a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m9255g() {
        if (f8277b == null) {
            return false;
        }
        try {
            Class cls = f8277b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m9257h() == null) {
                return false;
            }
            if (kg.m8958a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            f8276a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m9243c(java.lang.Class<?> r9) {
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
        r0 = com.google.android.gms.internal.ads.kg.m8958a();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = f8278c;	 Catch:{ Throwable -> 0x008b }
        r2 = "peekLong";	 Catch:{ Throwable -> 0x008b }
        r3 = 2;	 Catch:{ Throwable -> 0x008b }
        r4 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x008b }
        r4[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r5 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r6 = 1;	 Catch:{ Throwable -> 0x008b }
        r4[r6] = r5;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r4);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeLong";	 Catch:{ Throwable -> 0x008b }
        r4 = 3;	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r3] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeInt";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r4];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r3] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "peekInt";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeByte";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r3];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r7 = java.lang.Byte.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r7;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "peekByte";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r6];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        r2 = "pokeByteArray";	 Catch:{ Throwable -> 0x008b }
        r5 = 4;	 Catch:{ Throwable -> 0x008b }
        r7 = new java.lang.Class[r5];	 Catch:{ Throwable -> 0x008b }
        r7[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r8 = byte[].class;	 Catch:{ Throwable -> 0x008b }
        r7[r6] = r8;	 Catch:{ Throwable -> 0x008b }
        r8 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r7[r3] = r8;	 Catch:{ Throwable -> 0x008b }
        r8 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r7[r4] = r8;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r7);	 Catch:{ Throwable -> 0x008b }
        r2 = "peekByteArray";	 Catch:{ Throwable -> 0x008b }
        r5 = new java.lang.Class[r5];	 Catch:{ Throwable -> 0x008b }
        r5[r1] = r9;	 Catch:{ Throwable -> 0x008b }
        r9 = byte[].class;	 Catch:{ Throwable -> 0x008b }
        r5[r6] = r9;	 Catch:{ Throwable -> 0x008b }
        r9 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r3] = r9;	 Catch:{ Throwable -> 0x008b }
        r9 = java.lang.Integer.TYPE;	 Catch:{ Throwable -> 0x008b }
        r5[r4] = r9;	 Catch:{ Throwable -> 0x008b }
        r0.getMethod(r2, r5);	 Catch:{ Throwable -> 0x008b }
        return r6;
    L_0x008b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ng.c(java.lang.Class):boolean");
    }

    /* renamed from: h */
    private static Field m9257h() {
        Field a;
        if (kg.m8958a()) {
            a = m9223a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        a = m9223a(Buffer.class, "address");
        return (a == null || a.getType() != Long.TYPE) ? null : a;
    }

    /* renamed from: a */
    private static java.lang.reflect.Field m9223a(java.lang.Class<?> r0, java.lang.String r1) {
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
        r0 = r0.getDeclaredField(r1);	 Catch:{ Throwable -> 0x0009 }
        r1 = 1;	 Catch:{ Throwable -> 0x0009 }
        r0.setAccessible(r1);	 Catch:{ Throwable -> 0x0009 }
        goto L_0x000a;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ng.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* renamed from: k */
    private static byte m9260k(Object obj, long j) {
        return (byte) (m9221a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: l */
    private static byte m9261l(Object obj, long j) {
        return (byte) (m9221a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: c */
    private static void m9241c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        j = ((((int) j) ^ -1) & 3) << 3;
        m9228a(obj, j2, ((255 & b) << j) | (m9221a(obj, j2) & ((255 << j) ^ -1)));
    }

    /* renamed from: d */
    private static void m9247d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        j = (((int) j) & 3) << 3;
        m9228a(obj, j2, ((255 & b) << j) | (m9221a(obj, j2) & ((255 << j) ^ -1)));
    }

    /* renamed from: m */
    private static boolean m9262m(Object obj, long j) {
        return m9260k(obj, j) != null ? true : null;
    }

    /* renamed from: n */
    private static boolean m9263n(Object obj, long j) {
        return m9261l(obj, j) != null ? true : null;
    }

    /* renamed from: d */
    private static void m9248d(Object obj, long j, boolean z) {
        m9241c(obj, j, (byte) z);
    }

    /* renamed from: e */
    private static void m9250e(Object obj, long j, boolean z) {
        m9247d(obj, j, (byte) z);
    }

    static {
        long objectFieldOffset;
        C2443d c2443d = null;
        if (f8277b != null) {
            if (!kg.m8958a()) {
                c2443d = new C4099c(f8277b);
            } else if (f8279d) {
                c2443d = new C4098b(f8277b);
            } else if (f8280e) {
                c2443d = new C4097a(f8277b);
            }
        }
        f8281f = c2443d;
        Field h = m9257h();
        if (h != null) {
            if (f8281f != null) {
                objectFieldOffset = f8281f.f8275a.objectFieldOffset(h);
                f8297v = objectFieldOffset;
            }
        }
        objectFieldOffset = -1;
        f8297v = objectFieldOffset;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
    }
}
