package com.bumptech.glide.p055g;

import android.graphics.Bitmap.Config;
import android.os.Looper;
import com.bumptech.glide.load.p059b.C1202l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.g.j */
public final class C1180j {
    /* renamed from: a */
    private static final char[] f3836a = "0123456789abcdef".toCharArray();
    /* renamed from: b */
    private static final char[] f3837b = new char[64];

    /* renamed from: com.bumptech.glide.g.j$1 */
    static /* synthetic */ class C11791 {
        /* renamed from: a */
        static final /* synthetic */ int[] f3835a = new int[Config.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            f3835a = r0;
            r0 = f3835a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f3835a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f3835a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = f3835a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.RGBA_F16;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = f3835a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.j.1.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static int m4900b(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: c */
    private static boolean m4904c(int i) {
        if (i <= 0) {
            if (i != Integer.MIN_VALUE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m4892a(byte[] bArr) {
        synchronized (f3837b) {
            bArr = C1180j.m4893a(bArr, f3837b);
        }
        return bArr;
    }

    /* renamed from: a */
    private static String m4893a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f3836a[i2 >>> 4];
            cArr[i3 + 1] = f3836a[i2 & 15];
        }
        return new String(cArr);
    }

    @android.annotation.TargetApi(19)
    /* renamed from: a */
    public static int m4889a(android.graphics.Bitmap r3) {
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
        r0 = r3.isRecycled();
        if (r0 != 0) goto L_0x001c;
    L_0x0006:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 19;
        if (r0 < r1) goto L_0x0011;
    L_0x000c:
        r0 = r3.getAllocationByteCount();	 Catch:{ NullPointerException -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = r3.getHeight();
        r3 = r3.getRowBytes();
        r0 = r0 * r3;
        return r0;
    L_0x001c:
        r0 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot obtain size for recycled Bitmap: ";
        r1.append(r2);
        r1.append(r3);
        r2 = "[";
        r1.append(r2);
        r2 = r3.getWidth();
        r1.append(r2);
        r2 = "x";
        r1.append(r2);
        r2 = r3.getHeight();
        r1.append(r2);
        r2 = "] ";
        r1.append(r2);
        r3 = r3.getConfig();
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.j.a(android.graphics.Bitmap):int");
    }

    /* renamed from: a */
    public static int m4887a(int i, int i2, Config config) {
        return (i * i2) * C1180j.m4888a(config);
    }

    /* renamed from: a */
    private static int m4888a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        switch (C11791.f3835a[config.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 8;
            default:
                return 4;
        }
    }

    /* renamed from: a */
    public static boolean m4897a(int i, int i2) {
        return (C1180j.m4904c(i) == 0 || C1180j.m4904c(i2) == 0) ? false : true;
    }

    /* renamed from: a */
    public static void m4896a() {
        if (!C1180j.m4901b()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m4901b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    public static boolean m4903c() {
        return C1180j.m4901b() ^ 1;
    }

    /* renamed from: a */
    public static <T> Queue<T> m4895a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static <T> List<T> m4894a(Collection<T> collection) {
        List<T> arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m4898a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: b */
    public static boolean m4902b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null ? true : null;
        } else if (obj instanceof C1202l) {
            return ((C1202l) obj).m4954a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    /* renamed from: b */
    public static int m4899b(int i) {
        return C1180j.m4900b(i, 17);
    }

    /* renamed from: a */
    public static int m4885a(float f) {
        return C1180j.m4886a(f, 17);
    }

    /* renamed from: a */
    public static int m4886a(float f, int i) {
        return C1180j.m4900b(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m4890a(Object obj, int i) {
        return C1180j.m4900b(obj == null ? null : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m4891a(boolean z, int i) {
        return C1180j.m4900b((int) z, i);
    }
}
