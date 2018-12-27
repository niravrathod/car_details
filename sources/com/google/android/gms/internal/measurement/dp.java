package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class dp {
    /* renamed from: a */
    private static final Logger f10102a = Logger.getLogger(dp.class.getName());
    /* renamed from: b */
    private static final Unsafe f10103b = m11761c();
    /* renamed from: c */
    private static final Class<?> f10104c = as.m11495b();
    /* renamed from: d */
    private static final boolean f10105d = m11764c(Long.TYPE);
    /* renamed from: e */
    private static final boolean f10106e = m11764c(Integer.TYPE);
    /* renamed from: f */
    private static final C2470d f10107f;
    /* renamed from: g */
    private static final boolean f10108g = m11776g();
    /* renamed from: h */
    private static final boolean f10109h = m11774f();
    /* renamed from: i */
    private static final long f10110i = ((long) m11741a(byte[].class));
    /* renamed from: j */
    private static final long f10111j = ((long) m11741a(boolean[].class));
    /* renamed from: k */
    private static final long f10112k = ((long) m11756b(boolean[].class));
    /* renamed from: l */
    private static final long f10113l = ((long) m11741a(int[].class));
    /* renamed from: m */
    private static final long f10114m = ((long) m11756b(int[].class));
    /* renamed from: n */
    private static final long f10115n = ((long) m11741a(long[].class));
    /* renamed from: o */
    private static final long f10116o = ((long) m11756b(long[].class));
    /* renamed from: p */
    private static final long f10117p = ((long) m11741a(float[].class));
    /* renamed from: q */
    private static final long f10118q = ((long) m11756b(float[].class));
    /* renamed from: r */
    private static final long f10119r = ((long) m11741a(double[].class));
    /* renamed from: s */
    private static final long f10120s = ((long) m11756b(double[].class));
    /* renamed from: t */
    private static final long f10121t = ((long) m11741a(Object[].class));
    /* renamed from: u */
    private static final long f10122u = ((long) m11756b(Object[].class));
    /* renamed from: v */
    private static final long f10123v;
    /* renamed from: w */
    private static final boolean f10124w = (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.dp$d */
    static abstract class C2470d {
        /* renamed from: a */
        Unsafe f10101a;

        C2470d(Unsafe unsafe) {
            this.f10101a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo3098a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo3099a(long j, byte b);

        /* renamed from: a */
        public abstract void mo3100a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo3101a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo3102a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo3103a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo3104a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo3105b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo3106c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo3107d(Object obj, long j);

        /* renamed from: e */
        public final int m11738e(Object obj, long j) {
            return this.f10101a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void m11731a(Object obj, long j, int i) {
            this.f10101a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long m11739f(Object obj, long j) {
            return this.f10101a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void m11732a(Object obj, long j, long j2) {
            this.f10101a.putLong(obj, j, j2);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.dp$a */
    static final class C4111a extends C2470d {
        C4111a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo3099a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo3098a(Object obj, long j) {
            if (dp.f10124w) {
                return dp.m11781k(obj, j);
            }
            return dp.m11782l(obj, j);
        }

        /* renamed from: a */
        public final void mo3100a(Object obj, long j, byte b) {
            if (dp.f10124w) {
                dp.m11762c(obj, j, b);
            } else {
                dp.m11768d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo3105b(Object obj, long j) {
            if (dp.f10124w) {
                return dp.m11783m(obj, j);
            }
            return dp.m11784n(obj, j);
        }

        /* renamed from: a */
        public final void mo3103a(Object obj, long j, boolean z) {
            if (dp.f10124w) {
                dp.m11769d(obj, j, z);
            } else {
                dp.m11771e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo3106c(Object obj, long j) {
            return Float.intBitsToFloat(m11738e(obj, j));
        }

        /* renamed from: a */
        public final void mo3102a(Object obj, long j, float f) {
            m11731a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo3107d(Object obj, long j) {
            return Double.longBitsToDouble(m11739f(obj, j));
        }

        /* renamed from: a */
        public final void mo3101a(Object obj, long j, double d) {
            m11732a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo3104a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.dp$b */
    static final class C4112b extends C2470d {
        C4112b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo3099a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo3098a(Object obj, long j) {
            if (dp.f10124w) {
                return dp.m11781k(obj, j);
            }
            return dp.m11782l(obj, j);
        }

        /* renamed from: a */
        public final void mo3100a(Object obj, long j, byte b) {
            if (dp.f10124w) {
                dp.m11762c(obj, j, b);
            } else {
                dp.m11768d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo3105b(Object obj, long j) {
            if (dp.f10124w) {
                return dp.m11783m(obj, j);
            }
            return dp.m11784n(obj, j);
        }

        /* renamed from: a */
        public final void mo3103a(Object obj, long j, boolean z) {
            if (dp.f10124w) {
                dp.m11769d(obj, j, z);
            } else {
                dp.m11771e(obj, j, z);
            }
        }

        /* renamed from: c */
        public final float mo3106c(Object obj, long j) {
            return Float.intBitsToFloat(m11738e(obj, j));
        }

        /* renamed from: a */
        public final void mo3102a(Object obj, long j, float f) {
            m11731a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo3107d(Object obj, long j) {
            return Double.longBitsToDouble(m11739f(obj, j));
        }

        /* renamed from: a */
        public final void mo3101a(Object obj, long j, double d) {
            m11732a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo3104a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.dp$c */
    static final class C4113c extends C2470d {
        C4113c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo3099a(long j, byte b) {
            this.a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo3098a(Object obj, long j) {
            return this.a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo3100a(Object obj, long j, byte b) {
            this.a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo3105b(Object obj, long j) {
            return this.a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo3103a(Object obj, long j, boolean z) {
            this.a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo3106c(Object obj, long j) {
            return this.a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo3102a(Object obj, long j, float f) {
            this.a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo3107d(Object obj, long j) {
            return this.a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo3101a(Object obj, long j, double d) {
            this.a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo3104a(byte[] bArr, long j, long j2, long j3) {
            this.a.copyMemory(bArr, dp.f10110i + j, null, j2, j3);
        }
    }

    private dp() {
    }

    /* renamed from: a */
    static boolean m11755a() {
        return f10109h;
    }

    /* renamed from: b */
    static boolean m11760b() {
        return f10108g;
    }

    /* renamed from: a */
    private static int m11741a(Class<?> cls) {
        return f10109h ? f10107f.f10101a.arrayBaseOffset(cls) : -1;
    }

    /* renamed from: b */
    private static int m11756b(Class<?> cls) {
        return f10109h ? f10107f.f10101a.arrayIndexScale(cls) : -1;
    }

    /* renamed from: a */
    static int m11742a(Object obj, long j) {
        return f10107f.m11738e(obj, j);
    }

    /* renamed from: a */
    static void m11749a(Object obj, long j, int i) {
        f10107f.m11731a(obj, j, i);
    }

    /* renamed from: b */
    static long m11757b(Object obj, long j) {
        return f10107f.m11739f(obj, j);
    }

    /* renamed from: a */
    static void m11750a(Object obj, long j, long j2) {
        f10107f.m11732a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m11765c(Object obj, long j) {
        return f10107f.mo3105b(obj, j);
    }

    /* renamed from: a */
    static void m11752a(Object obj, long j, boolean z) {
        f10107f.mo3103a(obj, j, z);
    }

    /* renamed from: d */
    static float m11766d(Object obj, long j) {
        return f10107f.mo3106c(obj, j);
    }

    /* renamed from: a */
    static void m11748a(Object obj, long j, float f) {
        f10107f.mo3102a(obj, j, f);
    }

    /* renamed from: e */
    static double m11770e(Object obj, long j) {
        return f10107f.mo3107d(obj, j);
    }

    /* renamed from: a */
    static void m11747a(Object obj, long j, double d) {
        f10107f.mo3101a(obj, j, d);
    }

    /* renamed from: f */
    static Object m11773f(Object obj, long j) {
        return f10107f.f10101a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m11751a(Object obj, long j, Object obj2) {
        f10107f.f10101a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m11740a(byte[] bArr, long j) {
        return f10107f.mo3098a((Object) bArr, f10110i + j);
    }

    /* renamed from: a */
    static void m11753a(byte[] bArr, long j, byte b) {
        f10107f.mo3100a((Object) bArr, f10110i + j, b);
    }

    /* renamed from: a */
    static void m11754a(byte[] bArr, long j, long j2, long j3) {
        f10107f.mo3104a(bArr, j, j2, j3);
    }

    /* renamed from: a */
    static void m11745a(long j, byte b) {
        f10107f.mo3099a(j, b);
    }

    /* renamed from: a */
    static long m11743a(ByteBuffer byteBuffer) {
        return f10107f.m11739f(byteBuffer, f10123v);
    }

    /* renamed from: c */
    static sun.misc.Unsafe m11761c() {
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
        r0 = new com.google.android.gms.internal.measurement.dq;	 Catch:{ Throwable -> 0x000c }
        r0.<init>();	 Catch:{ Throwable -> 0x000c }
        r0 = java.security.AccessController.doPrivileged(r0);	 Catch:{ Throwable -> 0x000c }
        r0 = (sun.misc.Unsafe) r0;	 Catch:{ Throwable -> 0x000c }
        goto L_0x000d;
    L_0x000c:
        r0 = 0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dp.c():sun.misc.Unsafe");
    }

    /* renamed from: f */
    private static boolean m11774f() {
        if (f10103b == null) {
            return false;
        }
        try {
            Class cls = f10103b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (as.m11494a()) {
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
            f10102a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: g */
    private static boolean m11776g() {
        if (f10103b == null) {
            return false;
        }
        try {
            Class cls = f10103b.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m11778h() == null) {
                return false;
            }
            if (as.m11494a()) {
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
            f10102a.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m11764c(java.lang.Class<?> r9) {
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
        r0 = com.google.android.gms.internal.measurement.as.m11494a();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = f10104c;	 Catch:{ Throwable -> 0x008b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dp.c(java.lang.Class):boolean");
    }

    /* renamed from: h */
    private static Field m11778h() {
        Field a;
        if (as.m11494a()) {
            a = m11744a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        a = m11744a(Buffer.class, "address");
        return (a == null || a.getType() != Long.TYPE) ? null : a;
    }

    /* renamed from: a */
    private static java.lang.reflect.Field m11744a(java.lang.Class<?> r0, java.lang.String r1) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dp.a(java.lang.Class, java.lang.String):java.lang.reflect.Field");
    }

    /* renamed from: k */
    private static byte m11781k(Object obj, long j) {
        return (byte) (m11742a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* renamed from: l */
    private static byte m11782l(Object obj, long j) {
        return (byte) (m11742a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* renamed from: c */
    private static void m11762c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        j = ((((int) j) ^ -1) & 3) << 3;
        m11749a(obj, j2, ((255 & b) << j) | (m11742a(obj, j2) & ((255 << j) ^ -1)));
    }

    /* renamed from: d */
    private static void m11768d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        j = (((int) j) & 3) << 3;
        m11749a(obj, j2, ((255 & b) << j) | (m11742a(obj, j2) & ((255 << j) ^ -1)));
    }

    /* renamed from: m */
    private static boolean m11783m(Object obj, long j) {
        return m11781k(obj, j) != null ? true : null;
    }

    /* renamed from: n */
    private static boolean m11784n(Object obj, long j) {
        return m11782l(obj, j) != null ? true : null;
    }

    /* renamed from: d */
    private static void m11769d(Object obj, long j, boolean z) {
        m11762c(obj, j, (byte) z);
    }

    /* renamed from: e */
    private static void m11771e(Object obj, long j, boolean z) {
        m11768d(obj, j, (byte) z);
    }

    static {
        long objectFieldOffset;
        C2470d c2470d = null;
        if (f10103b != null) {
            if (!as.m11494a()) {
                c2470d = new C4113c(f10103b);
            } else if (f10105d) {
                c2470d = new C4112b(f10103b);
            } else if (f10106e) {
                c2470d = new C4111a(f10103b);
            }
        }
        f10107f = c2470d;
        Field h = m11778h();
        if (h != null) {
            if (f10107f != null) {
                objectFieldOffset = f10107f.f10101a.objectFieldOffset(h);
                f10123v = objectFieldOffset;
            }
        }
        objectFieldOffset = -1;
        f10123v = objectFieldOffset;
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN) {
        }
    }
}
