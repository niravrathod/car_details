package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.v4.p009a.p010a.C0297c;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: android.support.v7.widget.k */
class C0865k {
    /* renamed from: a */
    private static final int[] f2947a = new int[]{16843067, 16843068};
    /* renamed from: b */
    private final ProgressBar f2948b;
    /* renamed from: c */
    private Bitmap f2949c;

    C0865k(ProgressBar progressBar) {
        this.f2948b = progressBar;
    }

    /* renamed from: a */
    void mo826a(AttributeSet attributeSet, int i) {
        attributeSet = ay.m3543a(this.f2948b.getContext(), attributeSet, f2947a, i, 0);
        i = attributeSet.m3551b(0);
        if (i != 0) {
            this.f2948b.setIndeterminateDrawable(mo825a(i));
        }
        Drawable b = attributeSet.m3551b(1);
        if (b != null) {
            this.f2948b.setProgressDrawable(m3707a(b, false));
        }
        attributeSet.m3548a();
    }

    /* renamed from: a */
    private Drawable m3707a(Drawable drawable, boolean z) {
        Drawable a;
        if (drawable instanceof C0297c) {
            C0297c c0297c = (C0297c) drawable;
            a = c0297c.mo248a();
            if (a != null) {
                c0297c.mo249a(m3707a(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            z = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[z];
            for (boolean z2 = false; z2 < z; z2++) {
                boolean z3;
                int id = layerDrawable.getId(z2);
                Drawable drawable2 = layerDrawable.getDrawable(z2);
                if (id != 16908301) {
                    if (id != 16908303) {
                        z3 = false;
                        drawableArr[z2] = m3707a(drawable2, z3);
                    }
                }
                z3 = true;
                drawableArr[z2] = m3707a(drawable2, z3);
            }
            a = new LayerDrawable(drawableArr);
            for (boolean z4 = false; z4 < z; z4++) {
                a.setId(z4, layerDrawable.getId(z4));
            }
            return a;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f2949c == null) {
                this.f2949c = bitmap;
            }
            Drawable shapeDrawable = new ShapeDrawable(mo827b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, true, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo825a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        Drawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m3707a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    private Shape mo827b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: a */
    Bitmap m3709a() {
        return this.f2949c;
    }
}
