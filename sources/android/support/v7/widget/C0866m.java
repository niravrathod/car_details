package android.support.v7.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.C0597b;
import android.support.v7.p020a.C0637a.C0636j;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.widget.m */
class C0866m {
    /* renamed from: a */
    final TextView f2950a;
    /* renamed from: b */
    private aw f2951b;
    /* renamed from: c */
    private aw f2952c;
    /* renamed from: d */
    private aw f2953d;
    /* renamed from: e */
    private aw f2954e;
    /* renamed from: f */
    private final C0867o f2955f;
    /* renamed from: g */
    private int f2956g = 0;
    /* renamed from: h */
    private Typeface f2957h;
    /* renamed from: i */
    private boolean f2958i;

    /* renamed from: a */
    static C0866m m3712a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new C3267n(textView);
        }
        return new C0866m(textView);
    }

    C0866m(TextView textView) {
        this.f2950a = textView;
        this.f2955f = new C0867o(this.f2950a);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    void mo831a(AttributeSet attributeSet, int i) {
        ay a;
        Object obj;
        boolean z;
        ColorStateList e;
        ColorStateList e2;
        Context context = this.f2950a.getContext();
        C0862h a2 = C0862h.m3671a();
        ay a3 = ay.m3543a(context, attributeSet, C0636j.AppCompatTextHelper, i, 0);
        int g = a3.m3560g(C0636j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.m3561g(C0636j.AppCompatTextHelper_android_drawableLeft)) {
            this.f2951b = C0866m.m3711a(context, a2, a3.m3560g(C0636j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.m3561g(C0636j.AppCompatTextHelper_android_drawableTop)) {
            this.f2952c = C0866m.m3711a(context, a2, a3.m3560g(C0636j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.m3561g(C0636j.AppCompatTextHelper_android_drawableRight)) {
            this.f2953d = C0866m.m3711a(context, a2, a3.m3560g(C0636j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.m3561g(C0636j.AppCompatTextHelper_android_drawableBottom)) {
            this.f2954e = C0866m.m3711a(context, a2, a3.m3560g(C0636j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a3.m3548a();
        boolean z2 = this.f2950a.getTransformationMethod() instanceof PasswordTransformationMethod;
        Object obj2 = 1;
        ColorStateList colorStateList = null;
        if (g != -1) {
            a = ay.m3541a(context, g, C0636j.TextAppearance);
            if (z2 || !a.m3561g(C0636j.TextAppearance_textAllCaps)) {
                obj = null;
                z = false;
            } else {
                z = a.m3549a(C0636j.TextAppearance_textAllCaps, false);
                obj = 1;
            }
            m3713a(context, a);
            if (VERSION.SDK_INT < 23) {
                e = a.m3561g(C0636j.TextAppearance_android_textColor) ? a.m3557e(C0636j.TextAppearance_android_textColor) : null;
                e2 = a.m3561g(C0636j.TextAppearance_android_textColorHint) ? a.m3557e(C0636j.TextAppearance_android_textColorHint) : null;
                if (a.m3561g(C0636j.TextAppearance_android_textColorLink)) {
                    colorStateList = a.m3557e(C0636j.TextAppearance_android_textColorLink);
                }
                ColorStateList colorStateList2 = e;
                e = colorStateList;
                colorStateList = colorStateList2;
            } else {
                e = null;
                e2 = e;
            }
            a.m3548a();
        } else {
            e = null;
            e2 = e;
            obj = null;
            z = false;
        }
        a = ay.m3543a(context, attributeSet, C0636j.TextAppearance, i, 0);
        if (z2 || !a.m3561g(C0636j.TextAppearance_textAllCaps)) {
            obj2 = obj;
        } else {
            z = a.m3549a(C0636j.TextAppearance_textAllCaps, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a.m3561g(C0636j.TextAppearance_android_textColor)) {
                colorStateList = a.m3557e(C0636j.TextAppearance_android_textColor);
            }
            if (a.m3561g(C0636j.TextAppearance_android_textColorHint)) {
                e2 = a.m3557e(C0636j.TextAppearance_android_textColorHint);
            }
            if (a.m3561g(C0636j.TextAppearance_android_textColorLink)) {
                e = a.m3557e(C0636j.TextAppearance_android_textColorLink);
            }
        }
        m3713a(context, a);
        a.m3548a();
        if (colorStateList != null) {
            this.f2950a.setTextColor(colorStateList);
        }
        if (e2 != null) {
            this.f2950a.setHintTextColor(e2);
        }
        if (e != null) {
            this.f2950a.setLinkTextColor(e);
        }
        if (!(z2 || r2 == null)) {
            m3724a(z);
        }
        if (this.f2957h != null) {
            this.f2950a.setTypeface(this.f2957h, this.f2956g);
        }
        this.f2955f.m3752a(attributeSet, i);
        if (C0597b.f1911a != null && this.f2955f.m3748a() != null) {
            attributeSet = this.f2955f.m3757e();
            if (attributeSet.length <= 0) {
                return;
            }
            if (((float) this.f2950a.getAutoSizeStepGranularity()) != -1082130432) {
                this.f2950a.setAutoSizeTextTypeUniformWithConfiguration(this.f2955f.m3755c(), this.f2955f.m3756d(), this.f2955f.m3754b(), 0);
            } else {
                this.f2950a.setAutoSizeTextTypeUniformWithPresetSizes(attributeSet, 0);
            }
        }
    }

    /* renamed from: a */
    private void m3713a(android.content.Context r5, android.support.v7.widget.ay r6) {
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
        r4 = this;
        r0 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_android_textStyle;
        r1 = r4.f2956g;
        r0 = r6.m3545a(r0, r1);
        r4.f2956g = r0;
        r0 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_android_fontFamily;
        r0 = r6.m3561g(r0);
        r1 = 1;
        r2 = 0;
        if (r0 != 0) goto L_0x0040;
    L_0x0014:
        r0 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_fontFamily;
        r0 = r6.m3561g(r0);
        if (r0 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x0040;
    L_0x001d:
        r5 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_android_typeface;
        r5 = r6.m3561g(r5);
        if (r5 == 0) goto L_0x003f;
    L_0x0025:
        r4.f2958i = r2;
        r5 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_android_typeface;
        r5 = r6.m3545a(r5, r1);
        switch(r5) {
            case 1: goto L_0x003b;
            case 2: goto L_0x0036;
            case 3: goto L_0x0031;
            default: goto L_0x0030;
        };
    L_0x0030:
        goto L_0x003f;
    L_0x0031:
        r5 = android.graphics.Typeface.MONOSPACE;
        r4.f2957h = r5;
        goto L_0x003f;
    L_0x0036:
        r5 = android.graphics.Typeface.SERIF;
        r4.f2957h = r5;
        goto L_0x003f;
    L_0x003b:
        r5 = android.graphics.Typeface.SANS_SERIF;
        r4.f2957h = r5;
    L_0x003f:
        return;
    L_0x0040:
        r0 = 0;
        r4.f2957h = r0;
        r0 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_fontFamily;
        r0 = r6.m3561g(r0);
        if (r0 == 0) goto L_0x004e;
    L_0x004b:
        r0 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_fontFamily;
        goto L_0x0050;
    L_0x004e:
        r0 = android.support.v7.p020a.C0637a.C0636j.TextAppearance_android_fontFamily;
    L_0x0050:
        r5 = r5.isRestricted();
        if (r5 != 0) goto L_0x0074;
    L_0x0056:
        r5 = new java.lang.ref.WeakReference;
        r3 = r4.f2950a;
        r5.<init>(r3);
        r3 = new android.support.v7.widget.m$1;
        r3.<init>(r4, r5);
        r5 = r4.f2956g;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
        r5 = r6.m3546a(r0, r5, r3);	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
        r4.f2957h = r5;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
        r5 = r4.f2957h;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
        if (r5 != 0) goto L_0x006f;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
    L_0x006e:
        goto L_0x0070;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
    L_0x006f:
        r1 = 0;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
    L_0x0070:
        r4.f2958i = r1;	 Catch:{ UnsupportedOperationException -> 0x0073, UnsupportedOperationException -> 0x0073 }
        goto L_0x0074;
    L_0x0074:
        r5 = r4.f2957h;
        if (r5 != 0) goto L_0x0086;
    L_0x0078:
        r5 = r6.m3555d(r0);
        if (r5 == 0) goto L_0x0086;
    L_0x007e:
        r6 = r4.f2956g;
        r5 = android.graphics.Typeface.create(r5, r6);
        r4.f2957h = r5;
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.m.a(android.content.Context, android.support.v7.widget.ay):void");
    }

    /* renamed from: a */
    private void m3715a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f2958i) {
            this.f2957h = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f2956g);
            }
        }
    }

    /* renamed from: a */
    void m3721a(Context context, int i) {
        ay a = ay.m3541a(context, i, C0636j.TextAppearance);
        if (a.m3561g(C0636j.TextAppearance_textAllCaps)) {
            m3724a(a.m3549a(C0636j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.m3561g(C0636j.TextAppearance_android_textColor)) {
            ColorStateList e = a.m3557e(C0636j.TextAppearance_android_textColor);
            if (e != null) {
                this.f2950a.setTextColor(e);
            }
        }
        m3713a(context, a);
        a.m3548a();
        if (this.f2957h != null) {
            this.f2950a.setTypeface(this.f2957h, this.f2956g);
        }
    }

    /* renamed from: a */
    void m3724a(boolean z) {
        this.f2950a.setAllCaps(z);
    }

    /* renamed from: a */
    void mo830a() {
        if (this.f2951b != null || this.f2952c != null || this.f2953d != null || this.f2954e != null) {
            Drawable[] compoundDrawables = this.f2950a.getCompoundDrawables();
            m3722a(compoundDrawables[0], this.f2951b);
            m3722a(compoundDrawables[1], this.f2952c);
            m3722a(compoundDrawables[2], this.f2953d);
            m3722a(compoundDrawables[3], this.f2954e);
        }
    }

    /* renamed from: a */
    final void m3722a(Drawable drawable, aw awVar) {
        if (drawable != null && awVar != null) {
            C0862h.m3674a(drawable, awVar, this.f2950a.getDrawableState());
        }
    }

    /* renamed from: a */
    protected static aw m3711a(Context context, C0862h c0862h, int i) {
        context = c0862h.m3694b(context, i);
        if (context == null) {
            return null;
        }
        c0862h = new aw();
        c0862h.f2848d = true;
        c0862h.f2845a = context;
        return c0862h;
    }

    /* renamed from: a */
    void m3725a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0597b.f1911a) {
            m3727b();
        }
    }

    /* renamed from: a */
    void m3719a(int i, float f) {
        if (!C0597b.f1911a && !m3728c()) {
            m3716b(i, f);
        }
    }

    /* renamed from: b */
    void m3727b() {
        this.f2955f.m3758f();
    }

    /* renamed from: c */
    boolean m3728c() {
        return this.f2955f.m3759g();
    }

    /* renamed from: b */
    private void m3716b(int i, float f) {
        this.f2955f.m3750a(i, f);
    }

    /* renamed from: a */
    void m3718a(int i) {
        this.f2955f.m3749a(i);
    }

    /* renamed from: a */
    void m3720a(int i, int i2, int i3, int i4) {
        this.f2955f.m3751a(i, i2, i3, i4);
    }

    /* renamed from: a */
    void m3726a(int[] iArr, int i) {
        this.f2955f.m3753a(iArr, i);
    }

    /* renamed from: d */
    int m3729d() {
        return this.f2955f.m3748a();
    }

    /* renamed from: e */
    int m3730e() {
        return this.f2955f.m3754b();
    }

    /* renamed from: f */
    int m3731f() {
        return this.f2955f.m3755c();
    }

    /* renamed from: g */
    int m3732g() {
        return this.f2955f.m3756d();
    }

    /* renamed from: h */
    int[] m3733h() {
        return this.f2955f.m3757e();
    }
}
