package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.C1218d;

public abstract class DownsampleStrategy {
    /* renamed from: a */
    public static final DownsampleStrategy f4036a = new C3512e();
    /* renamed from: b */
    public static final DownsampleStrategy f4037b = new C3511d();
    /* renamed from: c */
    public static final DownsampleStrategy f4038c = new C3508a();
    /* renamed from: d */
    public static final DownsampleStrategy f4039d = new C3509b();
    /* renamed from: e */
    public static final DownsampleStrategy f4040e = new C3510c();
    /* renamed from: f */
    public static final DownsampleStrategy f4041f = new C3513f();
    /* renamed from: g */
    public static final DownsampleStrategy f4042g = f4037b;
    /* renamed from: h */
    public static final C1218d<DownsampleStrategy> f4043h = C1218d.m4988a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", f4042g);

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    private static class C3508a extends DownsampleStrategy {
        C3508a() {
        }

        /* renamed from: a */
        public float mo1052a(int i, int i2, int i3, int i4) {
            i = Math.min(i2 / i4, i / i3);
            if (i == 0) {
                return 1.0f;
            }
            return 1065353216 / ((float) Integer.highestOneBit(i));
        }

        /* renamed from: b */
        public SampleSizeRounding mo1053b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    private static class C3509b extends DownsampleStrategy {
        C3509b() {
        }

        /* renamed from: a */
        public float mo1052a(int i, int i2, int i3, int i4) {
            i = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            i3 = 1;
            i2 = Math.max(1, Integer.highestOneBit(i));
            if (i2 >= i) {
                i3 = 0;
            }
            return 1065353216 / ((float) (i2 << i3));
        }

        /* renamed from: b */
        public SampleSizeRounding mo1053b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    private static class C3510c extends DownsampleStrategy {
        C3510c() {
        }

        /* renamed from: a */
        public float mo1052a(int i, int i2, int i3, int i4) {
            return Math.min(1065353216, a.mo1052a(i, i2, i3, i4));
        }

        /* renamed from: b */
        public SampleSizeRounding mo1053b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    private static class C3511d extends DownsampleStrategy {
        C3511d() {
        }

        /* renamed from: a */
        public float mo1052a(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        /* renamed from: b */
        public SampleSizeRounding mo1053b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$e */
    private static class C3512e extends DownsampleStrategy {
        C3512e() {
        }

        /* renamed from: a */
        public float mo1052a(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        /* renamed from: b */
        public SampleSizeRounding mo1053b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$f */
    private static class C3513f extends DownsampleStrategy {
        /* renamed from: a */
        public float mo1052a(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        C3513f() {
        }

        /* renamed from: b */
        public SampleSizeRounding mo1053b(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    /* renamed from: a */
    public abstract float mo1052a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract SampleSizeRounding mo1053b(int i, int i2, int i3, int i4);
}
