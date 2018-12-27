package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C1215b;
import com.bumptech.glide.load.C1218d;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.SampleSizeRounding;
import com.bumptech.glide.p055g.C1174e;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
public final class C1285k {
    /* renamed from: a */
    public static final C1218d<DecodeFormat> f4051a = C1218d.m4988a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f3847c);
    @Deprecated
    /* renamed from: b */
    public static final C1218d<DownsampleStrategy> f4052b = DownsampleStrategy.f4043h;
    /* renamed from: c */
    public static final C1218d<Boolean> f4053c = C1218d.m4988a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.valueOf(false));
    /* renamed from: d */
    public static final C1218d<Boolean> f4054d = C1218d.m4988a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.valueOf(false));
    /* renamed from: e */
    private static final Set<String> f4055e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"image/vnd.wap.wbmp", "image/x-ico"})));
    /* renamed from: f */
    private static final C1284a f4056f = new C35201();
    /* renamed from: g */
    private static final Set<ImageType> f4057g = Collections.unmodifiableSet(EnumSet.of(ImageType.JPEG, ImageType.PNG_A, ImageType.PNG));
    /* renamed from: h */
    private static final Queue<Options> f4058h = C1180j.m4895a(0);
    /* renamed from: i */
    private final C1232e f4059i;
    /* renamed from: j */
    private final DisplayMetrics f4060j;
    /* renamed from: k */
    private final C1230b f4061k;
    /* renamed from: l */
    private final List<ImageHeaderParser> f4062l;
    /* renamed from: m */
    private final C1287p f4063m = C1287p.m5205a();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$a */
    public interface C1284a {
        /* renamed from: a */
        void mo1062a();

        /* renamed from: a */
        void mo1063a(C1232e c1232e, Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$1 */
    class C35201 implements C1284a {
        /* renamed from: a */
        public void mo1062a() {
        }

        /* renamed from: a */
        public void mo1063a(C1232e c1232e, Bitmap bitmap) {
        }

        C35201() {
        }
    }

    /* renamed from: c */
    private static int m5196c(double d) {
        return (int) (d + 0.5d);
    }

    /* renamed from: a */
    public boolean m5201a(InputStream inputStream) {
        return true;
    }

    /* renamed from: a */
    public boolean m5202a(ByteBuffer byteBuffer) {
        return true;
    }

    public C1285k(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C1232e c1232e, C1230b c1230b) {
        this.f4062l = list;
        this.f4060j = (DisplayMetrics) C1178i.m4880a((Object) displayMetrics);
        this.f4059i = (C1232e) C1178i.m4880a((Object) c1232e);
        this.f4061k = (C1230b) C1178i.m4880a((Object) c1230b);
    }

    /* renamed from: a */
    public C1277s<Bitmap> m5199a(InputStream inputStream, int i, int i2, C3452e c3452e) {
        return m5200a(inputStream, i, i2, c3452e, f4056f);
    }

    /* renamed from: a */
    public C1277s<Bitmap> m5200a(InputStream inputStream, int i, int i2, C3452e c3452e, C1284a c1284a) {
        C3452e c3452e2 = c3452e;
        C1178i.m4884a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        Object obj = (byte[]) this.f4061k.mo1011a(65536, byte[].class);
        Options a = C1285k.m5183a();
        a.inTempStorage = obj;
        DecodeFormat decodeFormat = (DecodeFormat) c3452e2.m17523a(f4051a);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c3452e2.m17523a(DownsampleStrategy.f4043h);
        boolean booleanValue = ((Boolean) c3452e2.m17523a(f4053c)).booleanValue();
        boolean z = c3452e2.m17523a(f4054d) != null && ((Boolean) c3452e2.m17523a(f4054d)).booleanValue();
        try {
            C1277s<Bitmap> a2 = C3515d.m17802a(m5182a(inputStream, a, downsampleStrategy, decodeFormat, z, i, i2, booleanValue, c1284a), r11.f4059i);
            return a2;
        } finally {
            C1285k.m5197c(a);
            r11.f4061k.mo1014a(obj);
        }
    }

    /* renamed from: a */
    private Bitmap m5182a(InputStream inputStream, Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, boolean z, int i, int i2, boolean z2, C1284a c1284a) {
        boolean z3;
        int b;
        int a;
        boolean b2;
        int i3;
        int i4;
        int i5;
        int i6;
        ImageType a2;
        C1232e c1232e;
        ImageType imageType;
        String str;
        int i7;
        int i8;
        C1284a c1284a2;
        Options options2;
        C1285k c1285k;
        Bitmap b3;
        int i9;
        Bitmap bitmap;
        float f;
        int i10;
        int ceil;
        InputStream inputStream2 = inputStream;
        Options options3 = options;
        C1284a c1284a3 = c1284a;
        long a3 = C1174e.m4866a();
        int[] a4 = C1285k.m5192a(inputStream2, options3, c1284a3, this.f4059i);
        int i11 = 0;
        int i12 = a4[0];
        int i13 = a4[1];
        String str2 = options3.outMimeType;
        if (i12 != -1) {
            if (i13 != -1) {
                z3 = z;
                b = C1215b.m4984b(r8.f4062l, inputStream2, r8.f4061k);
                a = C1289u.m5208a(b);
                b2 = C1289u.m5221b(b);
                i3 = i;
                if (i3 != Integer.MIN_VALUE) {
                    i4 = i2;
                    i5 = i12;
                } else {
                    i4 = i2;
                    i5 = i3;
                }
                i6 = i4 != Integer.MIN_VALUE ? i13 : i4;
                a2 = C1215b.m4982a(r8.f4062l, inputStream2, r8.f4061k);
                c1232e = r8.f4059i;
                imageType = a2;
                C1285k.m5188a(a2, inputStream, c1284a, c1232e, downsampleStrategy, a, i12, i13, i5, i6, options);
                i3 = b;
                str = str2;
                i7 = i13;
                i8 = i12;
                c1284a2 = c1284a3;
                options2 = options3;
                m5189a(inputStream, decodeFormat, z3, b2, options, i5, i6);
                if (VERSION.SDK_INT >= 19) {
                    i11 = 1;
                }
                if (options2.inSampleSize != 1) {
                    if (i11 != 0) {
                        c1285k = this;
                        b3 = C1285k.m5194b(inputStream, options2, c1284a2, c1285k.f4059i);
                        c1284a2.mo1063a(c1285k.f4059i, b3);
                        if (Log.isLoggable("Downsampler", 2)) {
                            i9 = i3;
                        } else {
                            i9 = i3;
                            C1285k.m5186a(i8, i7, str, options, b3, i, i2, a3);
                        }
                        bitmap = null;
                        if (b3 != null) {
                            b3.setDensity(c1285k.f4060j.densityDpi);
                            bitmap = C1289u.m5211a(c1285k.f4059i, b3, i9);
                            if (!b3.equals(bitmap)) {
                                c1285k.f4059i.mo1005a(b3);
                            }
                        }
                        return bitmap;
                    }
                }
                if (m5191a(imageType)) {
                    if (i8 >= 0 || i7 < 0 || !z2 || i11 == 0) {
                        f = C1285k.m5190a(options) ? ((float) options2.inTargetDensity) / ((float) options2.inDensity) : 1.0f;
                        i10 = options2.inSampleSize;
                        float f2 = (float) i10;
                        i12 = (int) Math.ceil((double) (((float) i8) / f2));
                        ceil = (int) Math.ceil((double) (((float) i7) / f2));
                        i12 = Math.round(((float) i12) * f);
                        ceil = Math.round(((float) ceil) * f);
                        if (Log.isLoggable("Downsampler", 2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Calculated target [");
                            stringBuilder.append(i12);
                            stringBuilder.append("x");
                            stringBuilder.append(ceil);
                            stringBuilder.append("] for source [");
                            stringBuilder.append(i8);
                            stringBuilder.append("x");
                            stringBuilder.append(i7);
                            stringBuilder.append("], sampleSize: ");
                            stringBuilder.append(i10);
                            stringBuilder.append(", targetDensity: ");
                            stringBuilder.append(options2.inTargetDensity);
                            stringBuilder.append(", density: ");
                            stringBuilder.append(options2.inDensity);
                            stringBuilder.append(", density multiplier: ");
                            stringBuilder.append(f);
                            Log.v("Downsampler", stringBuilder.toString());
                        }
                    } else {
                        i12 = i5;
                        ceil = i6;
                    }
                    if (i12 > 0 && ceil > 0) {
                        C1285k.m5187a(options2, c1285k.f4059i, i12, ceil);
                    }
                }
                b3 = C1285k.m5194b(inputStream, options2, c1284a2, c1285k.f4059i);
                c1284a2.mo1063a(c1285k.f4059i, b3);
                if (Log.isLoggable("Downsampler", 2)) {
                    i9 = i3;
                } else {
                    i9 = i3;
                    C1285k.m5186a(i8, i7, str, options, b3, i, i2, a3);
                }
                bitmap = null;
                if (b3 != null) {
                    b3.setDensity(c1285k.f4060j.densityDpi);
                    bitmap = C1289u.m5211a(c1285k.f4059i, b3, i9);
                    if (b3.equals(bitmap)) {
                        c1285k.f4059i.mo1005a(b3);
                    }
                }
                return bitmap;
            }
        }
        z3 = false;
        b = C1215b.m4984b(r8.f4062l, inputStream2, r8.f4061k);
        a = C1289u.m5208a(b);
        b2 = C1289u.m5221b(b);
        i3 = i;
        if (i3 != Integer.MIN_VALUE) {
            i4 = i2;
            i5 = i3;
        } else {
            i4 = i2;
            i5 = i12;
        }
        if (i4 != Integer.MIN_VALUE) {
        }
        a2 = C1215b.m4982a(r8.f4062l, inputStream2, r8.f4061k);
        c1232e = r8.f4059i;
        imageType = a2;
        C1285k.m5188a(a2, inputStream, c1284a, c1232e, downsampleStrategy, a, i12, i13, i5, i6, options);
        i3 = b;
        str = str2;
        i7 = i13;
        i8 = i12;
        c1284a2 = c1284a3;
        options2 = options3;
        m5189a(inputStream, decodeFormat, z3, b2, options, i5, i6);
        if (VERSION.SDK_INT >= 19) {
            i11 = 1;
        }
        if (options2.inSampleSize != 1) {
            if (i11 != 0) {
                c1285k = this;
                b3 = C1285k.m5194b(inputStream, options2, c1284a2, c1285k.f4059i);
                c1284a2.mo1063a(c1285k.f4059i, b3);
                if (Log.isLoggable("Downsampler", 2)) {
                    i9 = i3;
                    C1285k.m5186a(i8, i7, str, options, b3, i, i2, a3);
                } else {
                    i9 = i3;
                }
                bitmap = null;
                if (b3 != null) {
                    b3.setDensity(c1285k.f4060j.densityDpi);
                    bitmap = C1289u.m5211a(c1285k.f4059i, b3, i9);
                    if (b3.equals(bitmap)) {
                        c1285k.f4059i.mo1005a(b3);
                    }
                }
                return bitmap;
            }
        }
        if (m5191a(imageType)) {
            if (i8 >= 0) {
            }
            if (C1285k.m5190a(options)) {
            }
            i10 = options2.inSampleSize;
            float f22 = (float) i10;
            i12 = (int) Math.ceil((double) (((float) i8) / f22));
            ceil = (int) Math.ceil((double) (((float) i7) / f22));
            i12 = Math.round(((float) i12) * f);
            ceil = Math.round(((float) ceil) * f);
            if (Log.isLoggable("Downsampler", 2)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Calculated target [");
                stringBuilder2.append(i12);
                stringBuilder2.append("x");
                stringBuilder2.append(ceil);
                stringBuilder2.append("] for source [");
                stringBuilder2.append(i8);
                stringBuilder2.append("x");
                stringBuilder2.append(i7);
                stringBuilder2.append("], sampleSize: ");
                stringBuilder2.append(i10);
                stringBuilder2.append(", targetDensity: ");
                stringBuilder2.append(options2.inTargetDensity);
                stringBuilder2.append(", density: ");
                stringBuilder2.append(options2.inDensity);
                stringBuilder2.append(", density multiplier: ");
                stringBuilder2.append(f);
                Log.v("Downsampler", stringBuilder2.toString());
            }
            C1285k.m5187a(options2, c1285k.f4059i, i12, ceil);
        }
        b3 = C1285k.m5194b(inputStream, options2, c1284a2, c1285k.f4059i);
        c1284a2.mo1063a(c1285k.f4059i, b3);
        if (Log.isLoggable("Downsampler", 2)) {
            i9 = i3;
        } else {
            i9 = i3;
            C1285k.m5186a(i8, i7, str, options, b3, i, i2, a3);
        }
        bitmap = null;
        if (b3 != null) {
            b3.setDensity(c1285k.f4060j.densityDpi);
            bitmap = C1289u.m5211a(c1285k.f4059i, b3, i9);
            if (b3.equals(bitmap)) {
                c1285k.f4059i.mo1005a(b3);
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static void m5188a(ImageType imageType, InputStream inputStream, C1284a c1284a, C1232e c1232e, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, Options options) {
        ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        Options options2 = options;
        if (i7 > 0) {
            if (i8 > 0) {
                float a;
                SampleSizeRounding b;
                float f;
                float f2;
                int c;
                int c2;
                int i11;
                float min;
                int ceil;
                int ceil2;
                int[] a2;
                double a3;
                StringBuilder stringBuilder;
                StringBuilder stringBuilder2;
                if (i6 != 90) {
                    if (i6 != 270) {
                        a = downsampleStrategy2.mo1052a(i7, i8, i9, i10);
                        if (a <= 0.0f) {
                            b = downsampleStrategy2.mo1053b(i7, i8, i9, i10);
                            if (b == null) {
                                f = (float) i7;
                                f2 = (float) i8;
                                c = i7 / C1285k.m5196c((double) (a * f));
                                c2 = i8 / C1285k.m5196c((double) (a * f2));
                                if (b != SampleSizeRounding.MEMORY) {
                                    c = Math.max(c, c2);
                                } else {
                                    c = Math.min(c, c2);
                                }
                                if (VERSION.SDK_INT <= 23 || !f4055e.contains(options2.outMimeType)) {
                                    c = Math.max(1, Integer.highestOneBit(c));
                                    i11 = (b == SampleSizeRounding.MEMORY || ((float) c) >= 1.0f / a) ? c : c << 1;
                                } else {
                                    i11 = 1;
                                }
                                options2.inSampleSize = i11;
                                if (imageType2 != ImageType.JPEG) {
                                    min = (float) Math.min(i11, 8);
                                    ceil = (int) Math.ceil((double) (f / min));
                                    ceil2 = (int) Math.ceil((double) (f2 / min));
                                    c = i11 / 8;
                                    if (c > 0) {
                                        ceil /= c;
                                        ceil2 /= c;
                                    }
                                } else {
                                    if (imageType2 != ImageType.PNG) {
                                        if (imageType2 == ImageType.PNG_A) {
                                            if (imageType2 != ImageType.WEBP) {
                                                if (imageType2 == ImageType.WEBP_A) {
                                                    if (i7 % i11 == 0) {
                                                        if (i8 % i11 != 0) {
                                                            ceil = i7 / i11;
                                                            ceil2 = i8 / i11;
                                                        }
                                                    }
                                                    a2 = C1285k.m5192a(inputStream, options2, c1284a, c1232e);
                                                    ceil = a2[0];
                                                    ceil2 = a2[1];
                                                }
                                            }
                                            if (VERSION.SDK_INT < 24) {
                                                min = (float) i11;
                                                ceil = Math.round(f / min);
                                                ceil2 = Math.round(f2 / min);
                                            } else {
                                                min = (float) i11;
                                                ceil = (int) Math.floor((double) (f / min));
                                                ceil2 = (int) Math.floor((double) (f2 / min));
                                            }
                                        }
                                    }
                                    min = (float) i11;
                                    ceil = (int) Math.floor((double) (f / min));
                                    ceil2 = (int) Math.floor((double) (f2 / min));
                                }
                                a3 = (double) downsampleStrategy2.mo1052a(ceil, ceil2, i9, i10);
                                if (VERSION.SDK_INT >= 19) {
                                    options2.inTargetDensity = C1285k.m5181a(a3);
                                    options2.inDensity = C1285k.m5193b(a3);
                                }
                                if (C1285k.m5190a(options)) {
                                    options2.inTargetDensity = 0;
                                    options2.inDensity = 0;
                                } else {
                                    options2.inScaled = true;
                                }
                                if (Log.isLoggable("Downsampler", 2)) {
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Calculate scaling, source: [");
                                    stringBuilder.append(i7);
                                    stringBuilder.append("x");
                                    stringBuilder.append(i8);
                                    stringBuilder.append("], target: [");
                                    stringBuilder.append(i9);
                                    stringBuilder.append("x");
                                    stringBuilder.append(i10);
                                    stringBuilder.append("], power of two scaled: [");
                                    stringBuilder.append(ceil);
                                    stringBuilder.append("x");
                                    stringBuilder.append(ceil2);
                                    stringBuilder.append("], exact scale factor: ");
                                    stringBuilder.append(a);
                                    stringBuilder.append(", power of 2 sample size: ");
                                    stringBuilder.append(i11);
                                    stringBuilder.append(", adjusted scale factor: ");
                                    stringBuilder.append(a3);
                                    stringBuilder.append(", target density: ");
                                    stringBuilder.append(options2.inTargetDensity);
                                    stringBuilder.append(", density: ");
                                    stringBuilder.append(options2.inDensity);
                                    Log.v("Downsampler", stringBuilder.toString());
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Cannot round with null rounding");
                        }
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Cannot scale with factor: ");
                        stringBuilder2.append(a);
                        stringBuilder2.append(" from: ");
                        stringBuilder2.append(downsampleStrategy2);
                        stringBuilder2.append(", source: [");
                        stringBuilder2.append(i7);
                        stringBuilder2.append("x");
                        stringBuilder2.append(i8);
                        stringBuilder2.append("], target: [");
                        stringBuilder2.append(i9);
                        stringBuilder2.append("x");
                        stringBuilder2.append(i10);
                        stringBuilder2.append("]");
                        throw new IllegalArgumentException(stringBuilder2.toString());
                    }
                }
                a = downsampleStrategy2.mo1052a(i8, i7, i9, i10);
                if (a <= 0.0f) {
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Cannot scale with factor: ");
                    stringBuilder2.append(a);
                    stringBuilder2.append(" from: ");
                    stringBuilder2.append(downsampleStrategy2);
                    stringBuilder2.append(", source: [");
                    stringBuilder2.append(i7);
                    stringBuilder2.append("x");
                    stringBuilder2.append(i8);
                    stringBuilder2.append("], target: [");
                    stringBuilder2.append(i9);
                    stringBuilder2.append("x");
                    stringBuilder2.append(i10);
                    stringBuilder2.append("]");
                    throw new IllegalArgumentException(stringBuilder2.toString());
                }
                b = downsampleStrategy2.mo1053b(i7, i8, i9, i10);
                if (b == null) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                f = (float) i7;
                f2 = (float) i8;
                c = i7 / C1285k.m5196c((double) (a * f));
                c2 = i8 / C1285k.m5196c((double) (a * f2));
                if (b != SampleSizeRounding.MEMORY) {
                    c = Math.min(c, c2);
                } else {
                    c = Math.max(c, c2);
                }
                if (VERSION.SDK_INT <= 23) {
                }
                c = Math.max(1, Integer.highestOneBit(c));
                if (b == SampleSizeRounding.MEMORY) {
                }
                options2.inSampleSize = i11;
                if (imageType2 != ImageType.JPEG) {
                    if (imageType2 != ImageType.PNG) {
                        if (imageType2 == ImageType.PNG_A) {
                            if (imageType2 != ImageType.WEBP) {
                                if (imageType2 == ImageType.WEBP_A) {
                                    if (i7 % i11 == 0) {
                                        if (i8 % i11 != 0) {
                                            ceil = i7 / i11;
                                            ceil2 = i8 / i11;
                                        }
                                    }
                                    a2 = C1285k.m5192a(inputStream, options2, c1284a, c1232e);
                                    ceil = a2[0];
                                    ceil2 = a2[1];
                                }
                            }
                            if (VERSION.SDK_INT < 24) {
                                min = (float) i11;
                                ceil = (int) Math.floor((double) (f / min));
                                ceil2 = (int) Math.floor((double) (f2 / min));
                            } else {
                                min = (float) i11;
                                ceil = Math.round(f / min);
                                ceil2 = Math.round(f2 / min);
                            }
                        }
                    }
                    min = (float) i11;
                    ceil = (int) Math.floor((double) (f / min));
                    ceil2 = (int) Math.floor((double) (f2 / min));
                } else {
                    min = (float) Math.min(i11, 8);
                    ceil = (int) Math.ceil((double) (f / min));
                    ceil2 = (int) Math.ceil((double) (f2 / min));
                    c = i11 / 8;
                    if (c > 0) {
                        ceil /= c;
                        ceil2 /= c;
                    }
                }
                a3 = (double) downsampleStrategy2.mo1052a(ceil, ceil2, i9, i10);
                if (VERSION.SDK_INT >= 19) {
                    options2.inTargetDensity = C1285k.m5181a(a3);
                    options2.inDensity = C1285k.m5193b(a3);
                }
                if (C1285k.m5190a(options)) {
                    options2.inTargetDensity = 0;
                    options2.inDensity = 0;
                } else {
                    options2.inScaled = true;
                }
                if (Log.isLoggable("Downsampler", 2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Calculate scaling, source: [");
                    stringBuilder.append(i7);
                    stringBuilder.append("x");
                    stringBuilder.append(i8);
                    stringBuilder.append("], target: [");
                    stringBuilder.append(i9);
                    stringBuilder.append("x");
                    stringBuilder.append(i10);
                    stringBuilder.append("], power of two scaled: [");
                    stringBuilder.append(ceil);
                    stringBuilder.append("x");
                    stringBuilder.append(ceil2);
                    stringBuilder.append("], exact scale factor: ");
                    stringBuilder.append(a);
                    stringBuilder.append(", power of 2 sample size: ");
                    stringBuilder.append(i11);
                    stringBuilder.append(", adjusted scale factor: ");
                    stringBuilder.append(a3);
                    stringBuilder.append(", target density: ");
                    stringBuilder.append(options2.inTargetDensity);
                    stringBuilder.append(", density: ");
                    stringBuilder.append(options2.inDensity);
                    Log.v("Downsampler", stringBuilder.toString());
                }
                return;
            }
        }
        if (Log.isLoggable("Downsampler", 3)) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Unable to determine dimensions for: ");
            stringBuilder3.append(imageType);
            stringBuilder3.append(" with target [");
            stringBuilder3.append(i9);
            stringBuilder3.append("x");
            stringBuilder3.append(i10);
            stringBuilder3.append("]");
            Log.d("Downsampler", stringBuilder3.toString());
        }
    }

    /* renamed from: a */
    private static int m5181a(double d) {
        int b = C1285k.m5193b(d);
        double d2 = (double) b;
        Double.isNaN(d2);
        int c = C1285k.m5196c(d2 * d);
        double d3 = (double) (((float) c) / ((float) b));
        Double.isNaN(d3);
        d /= d3;
        double d4 = (double) c;
        Double.isNaN(d4);
        return C1285k.m5196c(d * d4);
    }

    /* renamed from: b */
    private static int m5193b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: a */
    private boolean m5191a(ImageType imageType) {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return f4057g.contains(imageType);
    }

    /* renamed from: a */
    private void m5189a(InputStream inputStream, DecodeFormat decodeFormat, boolean z, boolean z2, Options options, int i, int i2) {
        if (!this.f4063m.m5207a(i, i2, options, decodeFormat, z, z2)) {
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                if (!VERSION.SDK_INT) {
                    try {
                        inputStream = C1215b.m4982a(this.f4062l, inputStream, this.f4061k).hasAlpha();
                    } catch (InputStream inputStream2) {
                        if (Log.isLoggable("Downsampler", 3)) {
                            i = new StringBuilder();
                            i.append("Cannot determine whether the image has alpha or not from header, format ");
                            i.append(decodeFormat);
                            Log.d("Downsampler", i.toString(), inputStream2);
                        }
                        inputStream2 = null;
                    }
                    options.inPreferredConfig = inputStream2 != null ? Config.ARGB_8888 : Config.RGB_565;
                    if (options.inPreferredConfig == Config.RGB_565) {
                        options.inDither = true;
                    }
                    return;
                }
            }
            options.inPreferredConfig = Config.ARGB_8888;
        }
    }

    /* renamed from: a */
    private static int[] m5192a(InputStream inputStream, Options options, C1284a c1284a, C1232e c1232e) {
        options.inJustDecodeBounds = true;
        C1285k.m5194b(inputStream, options, c1284a, c1232e);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: b */
    private static android.graphics.Bitmap m5194b(java.io.InputStream r5, android.graphics.BitmapFactory.Options r6, com.bumptech.glide.load.resource.bitmap.C1285k.C1284a r7, com.bumptech.glide.load.engine.p060a.C1232e r8) {
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
        r0 = r6.inJustDecodeBounds;
        if (r0 == 0) goto L_0x000a;
    L_0x0004:
        r0 = 10485760; // 0xa00000 float:1.469368E-38 double:5.180654E-317;
        r5.mark(r0);
        goto L_0x000d;
    L_0x000a:
        r7.mo1062a();
    L_0x000d:
        r0 = r6.outWidth;
        r1 = r6.outHeight;
        r2 = r6.outMimeType;
        r3 = com.bumptech.glide.load.resource.bitmap.C1289u.m5213a();
        r3.lock();
        r3 = 0;
        r4 = android.graphics.BitmapFactory.decodeStream(r5, r3, r6);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r7 = com.bumptech.glide.load.resource.bitmap.C1289u.m5213a();
        r7.unlock();
        r6 = r6.inJustDecodeBounds;
        if (r6 == 0) goto L_0x002d;
    L_0x002a:
        r5.reset();
    L_0x002d:
        return r4;
    L_0x002e:
        r5 = move-exception;
        goto L_0x0061;
    L_0x0030:
        r4 = move-exception;
        r0 = com.bumptech.glide.load.resource.bitmap.C1285k.m5184a(r4, r0, r1, r2, r6);	 Catch:{ all -> 0x002e }
        r1 = "Downsampler";	 Catch:{ all -> 0x002e }
        r2 = 3;	 Catch:{ all -> 0x002e }
        r1 = android.util.Log.isLoggable(r1, r2);	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0045;	 Catch:{ all -> 0x002e }
    L_0x003e:
        r1 = "Downsampler";	 Catch:{ all -> 0x002e }
        r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use";	 Catch:{ all -> 0x002e }
        android.util.Log.d(r1, r2, r0);	 Catch:{ all -> 0x002e }
    L_0x0045:
        r1 = r6.inBitmap;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0060;
    L_0x0049:
        r5.reset();	 Catch:{ IOException -> 0x005f }
        r1 = r6.inBitmap;	 Catch:{ IOException -> 0x005f }
        r8.mo1005a(r1);	 Catch:{ IOException -> 0x005f }
        r6.inBitmap = r3;	 Catch:{ IOException -> 0x005f }
        r5 = com.bumptech.glide.load.resource.bitmap.C1285k.m5194b(r5, r6, r7, r8);	 Catch:{ IOException -> 0x005f }
        r6 = com.bumptech.glide.load.resource.bitmap.C1289u.m5213a();
        r6.unlock();
        return r5;
    L_0x005f:
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x0060:
        throw r0;	 Catch:{ all -> 0x002e }
    L_0x0061:
        r6 = com.bumptech.glide.load.resource.bitmap.C1289u.m5213a();
        r6.unlock();
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.k.b(java.io.InputStream, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.k$a, com.bumptech.glide.load.engine.a.e):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static boolean m5190a(Options options) {
        return (options.inTargetDensity <= 0 || options.inDensity <= 0 || options.inTargetDensity == options.inDensity) ? null : true;
    }

    /* renamed from: a */
    private static void m5186a(int i, int i2, String str, Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoded ");
        stringBuilder.append(C1285k.m5185a(bitmap));
        stringBuilder.append(" from [");
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        stringBuilder.append(" with inBitmap ");
        stringBuilder.append(C1285k.m5195b(options));
        stringBuilder.append(" for [");
        stringBuilder.append(i3);
        stringBuilder.append("x");
        stringBuilder.append(i4);
        stringBuilder.append("], sample size: ");
        stringBuilder.append(options.inSampleSize);
        stringBuilder.append(", density: ");
        stringBuilder.append(options.inDensity);
        stringBuilder.append(", target density: ");
        stringBuilder.append(options.inTargetDensity);
        stringBuilder.append(", thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        stringBuilder.append(", duration: ");
        stringBuilder.append(C1174e.m4865a(j));
        Log.v("Downsampler", stringBuilder.toString());
    }

    /* renamed from: b */
    private static String m5195b(Options options) {
        return C1285k.m5185a(options.inBitmap);
    }

    @TargetApi(19)
    /* renamed from: a */
    private static String m5185a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        String stringBuilder;
        if (VERSION.SDK_INT >= 19) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" (");
            stringBuilder2.append(bitmap.getAllocationByteCount());
            stringBuilder2.append(")");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("[");
        stringBuilder3.append(bitmap.getWidth());
        stringBuilder3.append("x");
        stringBuilder3.append(bitmap.getHeight());
        stringBuilder3.append("] ");
        stringBuilder3.append(bitmap.getConfig());
        stringBuilder3.append(stringBuilder);
        return stringBuilder3.toString();
    }

    /* renamed from: a */
    private static IOException m5184a(IllegalArgumentException illegalArgumentException, int i, int i2, String str, Options options) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception decoding bitmap, outWidth: ");
        stringBuilder.append(i);
        stringBuilder.append(", outHeight: ");
        stringBuilder.append(i2);
        stringBuilder.append(", outMimeType: ");
        stringBuilder.append(str);
        stringBuilder.append(", inBitmap: ");
        stringBuilder.append(C1285k.m5195b(options));
        return new IOException(stringBuilder.toString(), illegalArgumentException);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m5187a(Options options, C1232e c1232e, int i, int i2) {
        Config config;
        if (VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = c1232e.mo1006b(i, i2, config);
    }

    /* renamed from: a */
    private static synchronized Options m5183a() {
        Options options;
        synchronized (C1285k.class) {
            synchronized (f4058h) {
                options = (Options) f4058h.poll();
            }
            if (options == null) {
                options = new Options();
                C1285k.m5198d(options);
            }
        }
        return options;
    }

    /* renamed from: c */
    private static void m5197c(Options options) {
        C1285k.m5198d(options);
        synchronized (f4058h) {
            f4058h.offer(options);
        }
    }

    /* renamed from: d */
    private static void m5198d(Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
