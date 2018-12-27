package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.v4.view.C0560r;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.c */
class C0599c extends ImageView {
    /* renamed from: a */
    int f1915a;
    /* renamed from: b */
    private AnimationListener f1916b;

    /* renamed from: android.support.v4.widget.c$a */
    private class C0598a extends OvalShape {
        /* renamed from: a */
        final /* synthetic */ C0599c f1912a;
        /* renamed from: b */
        private RadialGradient f1913b;
        /* renamed from: c */
        private Paint f1914c = new Paint();

        C0598a(C0599c c0599c, int i) {
            this.f1912a = c0599c;
            c0599c.f1915a = i;
            m2378a((int) rect().width());
        }

        protected void onResize(float f, float f2) {
            super.onResize(f, f2);
            m2378a((int) f);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f1912a.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f1912a.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f1914c);
            canvas.drawCircle(f, height, (float) (width - this.f1912a.f1915a), paint);
        }

        /* renamed from: a */
        private void m2378a(int i) {
            float f = (float) (i / 2);
            this.f1913b = new RadialGradient(f, f, (float) this.f1912a.f1915a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f1914c.setShader(this.f1913b);
        }
    }

    C0599c(Context context, int i) {
        Drawable shapeDrawable;
        super(context);
        context = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * context);
        int i3 = (int) (0.0f * context);
        this.f1915a = (int) (3.5f * context);
        if (m2379a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0560r.m2166a((View) this, context * 4.0f);
        } else {
            Drawable shapeDrawable2 = new ShapeDrawable(new C0598a(this, this.f1915a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f1915a, (float) i3, (float) i2, 503316480);
            context = this.f1915a;
            setPadding(context, context, context, context);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i);
        C0560r.m2174a((View) this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m2379a() {
        return VERSION.SDK_INT >= 21;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (m2379a() == 0) {
            setMeasuredDimension(getMeasuredWidth() + (this.f1915a * 2), getMeasuredHeight() + (this.f1915a * 2));
        }
    }

    /* renamed from: a */
    public void m2380a(AnimationListener animationListener) {
        this.f1916b = animationListener;
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f1916b != null) {
            this.f1916b.onAnimationStart(getAnimation());
        }
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f1916b != null) {
            this.f1916b.onAnimationEnd(getAnimation());
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
