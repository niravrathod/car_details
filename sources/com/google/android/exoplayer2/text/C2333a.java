package com.google.android.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout.Alignment;

/* renamed from: com.google.android.exoplayer2.text.a */
public class C2333a {
    /* renamed from: a */
    public final CharSequence f7352a;
    /* renamed from: b */
    public final Alignment f7353b;
    /* renamed from: c */
    public final Bitmap f7354c;
    /* renamed from: d */
    public final float f7355d;
    /* renamed from: e */
    public final int f7356e;
    /* renamed from: f */
    public final int f7357f;
    /* renamed from: g */
    public final float f7358g;
    /* renamed from: h */
    public final int f7359h;
    /* renamed from: i */
    public final float f7360i;
    /* renamed from: j */
    public final float f7361j;
    /* renamed from: k */
    public final boolean f7362k;
    /* renamed from: l */
    public final int f7363l;

    public C2333a(Bitmap bitmap, float f, int i, float f2, int i2, float f3, float f4) {
        this(null, null, bitmap, f2, 0, i2, f, i, f3, f4, false, -16777216);
    }

    public C2333a(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public C2333a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        this(charSequence, alignment, f, i, i2, f2, i3, f3, false, -16777216);
    }

    public C2333a(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4) {
        this(charSequence, alignment, null, f, i, i2, f2, i3, f3, Float.MIN_VALUE, z, i4);
    }

    private C2333a(CharSequence charSequence, Alignment alignment, Bitmap bitmap, float f, int i, int i2, float f2, int i3, float f3, float f4, boolean z, int i4) {
        this.f7352a = charSequence;
        this.f7353b = alignment;
        this.f7354c = bitmap;
        this.f7355d = f;
        this.f7356e = i;
        this.f7357f = i2;
        this.f7358g = f2;
        this.f7359h = i3;
        this.f7360i = f3;
        this.f7361j = f4;
        this.f7362k = z;
        this.f7363l = i4;
    }
}
