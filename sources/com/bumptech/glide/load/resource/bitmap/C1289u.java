package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.p055g.C1178i;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
public final class C1289u {
    /* renamed from: a */
    private static final Paint f4069a = new Paint(6);
    /* renamed from: b */
    private static final Paint f4070b = new Paint(7);
    /* renamed from: c */
    private static final Paint f4071c = new Paint(7);
    /* renamed from: d */
    private static final Set<String> f4072d = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
    /* renamed from: e */
    private static final Lock f4073e = (f4072d.contains(Build.MODEL) ? new ReentrantLock() : new C1288a());

    /* renamed from: com.bumptech.glide.load.resource.bitmap.u$a */
    private static final class C1288a implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() {
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j, TimeUnit timeUnit) {
            return true;
        }

        public void unlock() {
        }

        C1288a() {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }
    }

    /* renamed from: a */
    public static int m5208a(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static boolean m5221b(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    static {
        f4071c.setXfermode(new PorterDuffXfermode(Mode.SRC_IN));
    }

    /* renamed from: a */
    public static Lock m5213a() {
        return f4073e;
    }

    /* renamed from: a */
    public static Bitmap m5212a(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        float height;
        float width;
        Matrix matrix = new Matrix();
        float f = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            height = ((float) i2) / ((float) bitmap.getHeight());
            width = (((float) i) - (((float) bitmap.getWidth()) * height)) * 0.5f;
        } else {
            height = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * height)) * 0.5f;
            width = 0.0f;
        }
        matrix.setScale(height, height);
        matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap a = c1232e.mo1002a(i, i2, C1289u.m5218b(bitmap));
        C1289u.m5215a(bitmap, a);
        C1289u.m5216a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: b */
    public static Bitmap m5220b(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2) != null) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2) != null) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap a = c1232e.mo1002a((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), C1289u.m5218b(bitmap));
        C1289u.m5215a(bitmap, a);
        if (Log.isLoggable("TransformationUtils", 2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("request: ");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            Log.v("TransformationUtils", stringBuilder.toString());
            i2 = new StringBuilder();
            i2.append("toFit:   ");
            i2.append(bitmap.getWidth());
            i2.append("x");
            i2.append(bitmap.getHeight());
            Log.v("TransformationUtils", i2.toString());
            i2 = new StringBuilder();
            i2.append("toReuse: ");
            i2.append(a.getWidth());
            i2.append("x");
            i2.append(a.getHeight());
            Log.v("TransformationUtils", i2.toString());
            i2 = new StringBuilder();
            i2.append("minPct:   ");
            i2.append(min);
            Log.v("TransformationUtils", i2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        C1289u.m5216a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: c */
    public static Bitmap m5222c(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return C1289u.m5220b(c1232e, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2) != null) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: a */
    public static void m5215a(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* renamed from: a */
    public static Bitmap m5211a(C1232e c1232e, Bitmap bitmap, int i) {
        if (!C1289u.m5221b(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        C1289u.m5214a(i, matrix);
        i = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(i);
        Bitmap a = c1232e.mo1002a(Math.round(i.width()), Math.round(i.height()), C1289u.m5218b(bitmap));
        matrix.postTranslate(-i.left, -i.top);
        C1289u.m5216a(bitmap, a, matrix);
        return a;
    }

    /* renamed from: d */
    public static Bitmap m5223d(C1232e c1232e, Bitmap bitmap, int i, int i2) {
        i = Math.min(i, i2);
        i2 = (float) i;
        float f = i2 / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(i2 / width, i2 / height);
        width *= max;
        max *= height;
        height = (i2 - width) / 2.0f;
        i2 = (i2 - max) / 1073741824;
        RectF rectF = new RectF(height, i2, width + height, max + i2);
        Bitmap a = C1289u.m5210a(c1232e, bitmap);
        i = c1232e.mo1002a(i, i, C1289u.m5209a(bitmap));
        i.setHasAlpha(true);
        f4073e.lock();
        try {
            Canvas canvas = new Canvas(i);
            canvas.drawCircle(f, f, f, f4070b);
            canvas.drawBitmap(a, null, rectF, f4071c);
            C1289u.m5217a(canvas);
            if (a.equals(bitmap) == null) {
                c1232e.mo1005a(a);
            }
            return i;
        } finally {
            bitmap = f4073e;
            bitmap.unlock();
        }
    }

    /* renamed from: a */
    private static Bitmap m5210a(C1232e c1232e, Bitmap bitmap) {
        Config a = C1289u.m5209a(bitmap);
        if (a.equals(bitmap.getConfig())) {
            return bitmap;
        }
        c1232e = c1232e.mo1002a(bitmap.getWidth(), bitmap.getHeight(), a);
        new Canvas(c1232e).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return c1232e;
    }

    /* renamed from: a */
    private static Config m5209a(Bitmap bitmap) {
        if (VERSION.SDK_INT < 26 || Config.RGBA_F16.equals(bitmap.getConfig()) == null) {
            return Config.ARGB_8888;
        }
        return Config.RGBA_F16;
    }

    /* renamed from: b */
    public static Bitmap m5219b(C1232e c1232e, Bitmap bitmap, int i) {
        C1178i.m4884a(i > 0, "roundingRadius must be greater than 0.");
        Config a = C1289u.m5209a(bitmap);
        Bitmap a2 = C1289u.m5210a(c1232e, bitmap);
        Bitmap a3 = c1232e.mo1002a(a2.getWidth(), a2.getHeight(), a);
        a3.setHasAlpha(true);
        Shader bitmapShader = new BitmapShader(a2, TileMode.CLAMP, TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) a3.getWidth(), (float) a3.getHeight());
        f4073e.lock();
        try {
            Canvas canvas = new Canvas(a3);
            canvas.drawColor(0, Mode.CLEAR);
            i = (float) i;
            canvas.drawRoundRect(rectF, i, i, paint);
            C1289u.m5217a(canvas);
            if (a2.equals(bitmap) == null) {
                c1232e.mo1005a(a2);
            }
            return a3;
        } finally {
            bitmap = f4073e;
            bitmap.unlock();
        }
    }

    /* renamed from: a */
    private static void m5217a(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: b */
    private static Config m5218b(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Config.ARGB_8888;
    }

    /* renamed from: a */
    private static void m5216a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f4073e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f4069a);
            C1289u.m5217a(canvas);
        } finally {
            f4073e.unlock();
        }
    }

    /* renamed from: a */
    static void m5214a(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}
