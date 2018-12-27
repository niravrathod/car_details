package com.airbnb.lottie.p036d;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.p031a.p032a.C3291r;

/* renamed from: com.airbnb.lottie.d.f */
public final class C0954f {
    /* renamed from: a */
    private static final PathMeasure f3140a = new PathMeasure();
    /* renamed from: b */
    private static final Path f3141b = new Path();
    /* renamed from: c */
    private static final Path f3142c = new Path();
    /* renamed from: d */
    private static final float[] f3143d = new float[4];
    /* renamed from: e */
    private static final float f3144e = ((float) Math.sqrt(2.0d));
    /* renamed from: f */
    private static float f3145f = -1.0f;

    /* renamed from: a */
    public static int m4103a(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: a */
    public static boolean m4108a(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        if (i2 > i5) {
            return true;
        }
        if (i3 >= i6) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Path m4104a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            Path path2 = path;
            path2.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        return path;
    }

    /* renamed from: a */
    public static void m4107a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        goto L_0x0008;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.d.f.a(java.io.Closeable):void");
    }

    /* renamed from: a */
    public static float m4102a(Matrix matrix) {
        f3143d[0] = 0.0f;
        f3143d[1] = 0.0f;
        f3143d[2] = f3144e;
        f3143d[3] = f3144e;
        matrix.mapPoints(f3143d);
        return ((float) Math.hypot((double) (f3143d[2] - f3143d[0]), (double) (f3143d[3] - f3143d[1]))) / 2.0f;
    }

    /* renamed from: a */
    public static void m4106a(Path path, C3291r c3291r) {
        if (c3291r != null) {
            C0954f.m4105a(path, ((Float) c3291r.m16955d().mo871e()).floatValue() / 100.0f, ((Float) c3291r.m16956e().mo871e()).floatValue() / 100.0f, ((Float) c3291r.m16957f().mo871e()).floatValue() / 360.0f);
        }
    }

    /* renamed from: a */
    public static void m4105a(Path path, float f, float f2, float f3) {
        C0949c.m4078c("applyTrimPathIfNeeded");
        f3140a.setPath(path, false);
        float length = f3140a.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C0949c.m4079d("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f) {
            if (((double) Math.abs((f2 - f) - 1.0f)) >= 0.01d) {
                f *= length;
                f2 *= length;
                f3 *= length;
                float min = Math.min(f, f2) + f3;
                f = Math.max(f, f2) + f3;
                if (min >= length && f >= length) {
                    min = (float) C0953e.m4091a(min, length);
                    f = (float) C0953e.m4091a(f, length);
                }
                if (min < 0.0f) {
                    min = (float) C0953e.m4091a(min, length);
                }
                if (f < 0.0f) {
                    f = (float) C0953e.m4091a(f, length);
                }
                if (min == f) {
                    path.reset();
                    C0949c.m4079d("applyTrimPathIfNeeded");
                    return;
                }
                if (min >= f) {
                    min -= length;
                }
                f3141b.reset();
                f3140a.getSegment(min, f, f3141b, true);
                if (f > length) {
                    f3142c.reset();
                    f3140a.getSegment(0.0f, f % length, f3142c, true);
                    f3141b.addPath(f3142c);
                } else if (min < 0.0f) {
                    f3142c.reset();
                    f3140a.getSegment(min + length, length, f3142c, true);
                    f3141b.addPath(f3142c);
                }
                path.set(f3141b);
                C0949c.m4079d("applyTrimPathIfNeeded");
                return;
            }
        }
        C0949c.m4079d("applyTrimPathIfNeeded");
    }

    /* renamed from: a */
    public static float m4101a() {
        if (f3145f == -1.0f) {
            f3145f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f3145f;
    }
}
