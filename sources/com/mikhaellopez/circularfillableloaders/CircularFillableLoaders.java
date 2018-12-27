package com.mikhaellopez.circularfillableloaders;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.mikhaellopez.circularfillableloaders.C2687a.C2686a;

public class CircularFillableLoaders extends ImageView {
    /* renamed from: a */
    private int f11225a;
    /* renamed from: b */
    private float f11226b;
    /* renamed from: c */
    private int f11227c;
    /* renamed from: d */
    private float f11228d;
    /* renamed from: e */
    private float f11229e;
    /* renamed from: f */
    private float f11230f;
    /* renamed from: g */
    private Bitmap f11231g;
    /* renamed from: h */
    private Drawable f11232h;
    /* renamed from: i */
    private Paint f11233i;
    /* renamed from: j */
    private Paint f11234j;
    /* renamed from: k */
    private Paint f11235k;
    /* renamed from: l */
    private BitmapShader f11236l;
    /* renamed from: m */
    private Matrix f11237m;
    /* renamed from: n */
    private AnimatorSet f11238n;

    public CircularFillableLoaders(Context context) {
        this(context, null);
    }

    public CircularFillableLoaders(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularFillableLoaders(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11228d = 1.0f;
        this.f11229e = 0.0f;
        m12986a(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m12986a(Context context, AttributeSet attributeSet, int i) {
        this.f11233i = new Paint();
        this.f11233i.setAntiAlias(true);
        this.f11237m = new Matrix();
        this.f11235k = new Paint();
        this.f11235k.setAntiAlias(true);
        this.f11234j = new Paint();
        this.f11234j.setAntiAlias(true);
        this.f11234j.setStyle(Style.STROKE);
        m12991e();
        context = context.obtainStyledAttributes(attributeSet, C2686a.CircularFillableLoaders, i, 0);
        this.f11227c = context.getColor(C2686a.CircularFillableLoaders_cfl_wave_color, -16777216);
        attributeSet = context.getFloat(C2686a.CircularFillableLoaders_cfl_wave_amplitude, 0.05f);
        if (attributeSet > 1028443341) {
            attributeSet = 1028443341;
        }
        this.f11226b = attributeSet;
        setProgress(context.getInteger(C2686a.CircularFillableLoaders_cfl_progress, 0));
        if (context.getBoolean(C2686a.CircularFillableLoaders_cfl_border, true) != null) {
            this.f11234j.setStrokeWidth(context.getDimension(C2686a.CircularFillableLoaders_cfl_border_width, getContext().getResources().getDisplayMetrics().density * 1092616192));
            return;
        }
        this.f11234j.setStrokeWidth(null);
    }

    public void onDraw(Canvas canvas) {
        m12985a();
        if (this.f11231g != null) {
            if (!isInEditMode()) {
                this.f11225a = canvas.getWidth();
                if (canvas.getHeight() < this.f11225a) {
                    this.f11225a = canvas.getHeight();
                }
            }
            float f = (float) (this.f11225a / 2);
            canvas.drawCircle(f, f, f - this.f11234j.getStrokeWidth(), this.f11233i);
            if (this.f11236l != null) {
                if (this.f11235k.getShader() == null) {
                    this.f11235k.setShader(this.f11236l);
                }
                this.f11237m.setScale(1.0f, this.f11226b / 0.05f, 0.0f, this.f11230f);
                this.f11237m.postTranslate(this.f11229e * ((float) getWidth()), (0.5f - this.f11228d) * ((float) getHeight()));
                this.f11236l.setLocalMatrix(this.f11237m);
                this.f11234j.setColor(this.f11227c);
                f = this.f11234j.getStrokeWidth();
                if (f > 0.0f) {
                    canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((((float) getWidth()) - f) / 2.0f) - 1.0f, this.f11234j);
                }
                canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, (((float) getWidth()) / 2.0f) - f, this.f11235k);
            } else {
                this.f11235k.setShader(null);
            }
        }
    }

    /* renamed from: a */
    private void m12985a() {
        if (this.f11232h != getDrawable()) {
            this.f11232h = getDrawable();
            this.f11231g = m12984a(this.f11232h);
            m12988b();
        }
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f11225a = i;
        if (i2 < this.f11225a) {
            this.f11225a = i2;
        }
        if (this.f11231g != 0) {
            m12988b();
        }
    }

    /* renamed from: b */
    private void m12988b() {
        if (this.f11231g != null) {
            this.f11231g = m12983a(this.f11231g);
            Shader bitmapShader = new BitmapShader(this.f11231g, TileMode.CLAMP, TileMode.CLAMP);
            Matrix matrix = new Matrix();
            matrix.setScale(((float) this.f11225a) / ((float) this.f11231g.getWidth()), ((float) this.f11225a) / ((float) this.f11231g.getHeight()));
            bitmapShader.setLocalMatrix(matrix);
            this.f11233i.setShader(bitmapShader);
            m12989c();
        }
    }

    /* renamed from: c */
    private void m12989c() {
        float[] fArr;
        double width = (double) getWidth();
        Double.isNaN(width);
        double d = 6.283185307179586d / width;
        float height = ((float) getHeight()) * 0.05f;
        this.f11230f = ((float) getHeight()) * 0.5f;
        float width2 = (float) getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);
        paint.setAntiAlias(true);
        int width3 = getWidth() + 1;
        int height2 = getHeight() + 1;
        float[] fArr2 = new float[width3];
        paint.setColor(m12982a(this.f11227c, 0.3f));
        int i = 0;
        while (i < width3) {
            double d2 = (double) i;
            Double.isNaN(d2);
            d2 *= d;
            double d3 = (double) r0.f11230f;
            double d4 = d;
            d = (double) height;
            d2 = Math.sin(d2);
            Double.isNaN(d);
            d *= d2;
            Double.isNaN(d3);
            float f = (float) (d3 + d);
            float f2 = (float) i;
            int i2 = i;
            fArr = fArr2;
            canvas.drawLine(f2, f, f2, (float) height2, paint);
            fArr[i2] = f;
            i = i2 + 1;
            fArr2 = fArr;
            d = d4;
        }
        fArr = fArr2;
        paint.setColor(r0.f11227c);
        int i3 = (int) (width2 / 4.0f);
        for (int i4 = 0; i4 < width3; i4++) {
            f2 = (float) i4;
            canvas.drawLine(f2, fArr[(i4 + i3) % width3], f2, (float) height2, paint);
        }
        r0.f11236l = new BitmapShader(createBitmap, TileMode.REPEAT, TileMode.CLAMP);
        r0.f11235k.setShader(r0.f11236l);
    }

    /* renamed from: a */
    private Bitmap m12983a(Bitmap bitmap) {
        if (bitmap.getWidth() >= bitmap.getHeight()) {
            return Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight());
        }
        return Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
    }

    /* renamed from: a */
    private android.graphics.Bitmap m12984a(android.graphics.drawable.Drawable r7) {
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
        r6 = this;
        r0 = 0;
        if (r7 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r7 instanceof android.graphics.drawable.BitmapDrawable;
        if (r1 == 0) goto L_0x000f;
    L_0x0008:
        r7 = (android.graphics.drawable.BitmapDrawable) r7;
        r7 = r7.getBitmap();
        return r7;
    L_0x000f:
        r1 = r7.getIntrinsicWidth();
        r2 = r7.getIntrinsicHeight();
        if (r1 <= 0) goto L_0x0045;
    L_0x0019:
        if (r2 > 0) goto L_0x001c;
    L_0x001b:
        goto L_0x0045;
    L_0x001c:
        r3 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ OutOfMemoryError -> 0x0037 }
        r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3);	 Catch:{ OutOfMemoryError -> 0x0037 }
        r2 = new android.graphics.Canvas;	 Catch:{ OutOfMemoryError -> 0x0037 }
        r2.<init>(r1);	 Catch:{ OutOfMemoryError -> 0x0037 }
        r3 = r2.getWidth();	 Catch:{ OutOfMemoryError -> 0x0037 }
        r4 = r2.getHeight();	 Catch:{ OutOfMemoryError -> 0x0037 }
        r5 = 0;	 Catch:{ OutOfMemoryError -> 0x0037 }
        r7.setBounds(r5, r5, r3, r4);	 Catch:{ OutOfMemoryError -> 0x0037 }
        r7.draw(r2);	 Catch:{ OutOfMemoryError -> 0x0037 }
        return r1;
    L_0x0037:
        r7 = r6.getClass();
        r7 = r7.toString();
        r1 = "Encountered OutOfMemoryError while generating bitmap!";
        android.util.Log.e(r7, r1);
        return r0;
    L_0x0045:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mikhaellopez.circularfillableloaders.CircularFillableLoaders.a(android.graphics.drawable.Drawable):android.graphics.Bitmap");
    }

    protected void onMeasure(int i, int i2) {
        i = m12981a(i);
        i2 = m12987b(i2);
        if (i >= i2) {
            i = i2;
        }
        setMeasuredDimension(i, i);
    }

    /* renamed from: a */
    private int m12981a(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return i;
        }
        return mode == Integer.MIN_VALUE ? i : this.f11225a;
    }

    /* renamed from: b */
    private int m12987b(int i) {
        int mode = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            if (mode != Integer.MIN_VALUE) {
                i = this.f11225a;
            }
        }
        return i + 2;
    }

    public void setColor(int i) {
        this.f11227c = i;
        m12989c();
        invalidate();
    }

    public void setBorderWidth(float f) {
        this.f11234j.setStrokeWidth(f);
        invalidate();
    }

    public void setAmplitudeRatio(float f) {
        if (this.f11226b != f) {
            this.f11226b = f;
            invalidate();
        }
    }

    public void setProgress(int i) {
        i = ObjectAnimator.ofFloat(this, "waterLevelRatio", new float[]{this.f11228d, 1.0f - (((float) i) / 1120403456)});
        i.setDuration(1000);
        i.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(i);
        animatorSet.start();
    }

    /* renamed from: d */
    private void m12990d() {
        if (this.f11238n != null) {
            this.f11238n.start();
        }
    }

    /* renamed from: e */
    private void m12991e() {
        Animator ofFloat = ObjectAnimator.ofFloat(this, "waveShiftRatio", new float[]{0.0f, 1.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000);
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f11238n = new AnimatorSet();
        this.f11238n.play(ofFloat);
    }

    private void setWaveShiftRatio(float f) {
        if (this.f11229e != f) {
            this.f11229e = f;
            invalidate();
        }
    }

    private void setWaterLevelRatio(float f) {
        if (this.f11228d != f) {
            this.f11228d = f;
            invalidate();
        }
    }

    /* renamed from: f */
    private void m12992f() {
        if (this.f11238n != null) {
            this.f11238n.end();
        }
    }

    protected void onAttachedToWindow() {
        m12990d();
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow() {
        m12992f();
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private int m12982a(int i, float f) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * f), Color.red(i), Color.green(i), Color.blue(i));
    }
}
