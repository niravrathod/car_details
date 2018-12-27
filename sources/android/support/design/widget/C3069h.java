package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p009a.p010a.C0295a;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.widget.h */
class C3069h extends C0209g {
    /* renamed from: p */
    private InsetDrawable f12985p;

    /* renamed from: android.support.design.widget.h$a */
    static class C0210a extends GradientDrawable {
        public boolean isStateful() {
            return true;
        }

        C0210a() {
        }
    }

    /* renamed from: a */
    void mo158a(int[] iArr) {
    }

    /* renamed from: b */
    void mo159b() {
    }

    /* renamed from: h */
    boolean mo162h() {
        return false;
    }

    C3069h(VisibilityAwareImageButton visibilityAwareImageButton, C0211j c0211j) {
        super(visibilityAwareImageButton, c0211j);
    }

    /* renamed from: a */
    void mo156a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        this.d = C0295a.m1061g(m777k());
        C0295a.m1050a(this.d, colorStateList);
        if (mode != null) {
            C0295a.m1053a(this.d, mode);
        }
        if (i2 > 0) {
            this.f = m755a(i2, colorStateList);
            colorStateList = new LayerDrawable(new Drawable[]{this.f, this.d});
        } else {
            this.f = null;
            colorStateList = this.d;
        }
        this.e = new RippleDrawable(ColorStateList.valueOf(i), colorStateList, null);
        this.g = this.e;
        this.o.mo128a(this.e);
    }

    /* renamed from: a */
    void mo155a(int i) {
        if (this.e instanceof RippleDrawable) {
            ((RippleDrawable) this.e).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo155a(i);
        }
    }

    /* renamed from: a */
    void mo154a(float f, float f2) {
        if (VERSION.SDK_INT != 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(k, animatorSet);
            f2 = new AnimatorSet();
            List arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{this.n.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            f2.playSequentially((Animator[]) arrayList.toArray(new ObjectAnimator[0]));
            f2.setInterpolator(a);
            stateListAnimator.addState(l, f2);
            f = new AnimatorSet();
            f.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            f.setInterpolator(a);
            stateListAnimator.addState(m, f);
            this.n.setStateListAnimator(stateListAnimator);
        } else if (this.n.isEnabled()) {
            this.n.setElevation(f);
            if (this.n.isFocused() == null) {
                if (this.n.isPressed() == null) {
                    this.n.setTranslationZ(0.0f);
                }
            }
            this.n.setTranslationZ(f2);
        } else {
            this.n.setElevation(0.0f);
            this.n.setTranslationZ(0.0f);
        }
        if (this.o.mo129b() != null) {
            m771e();
        }
    }

    /* renamed from: a */
    public float mo153a() {
        return this.n.getElevation();
    }

    /* renamed from: d */
    void mo161d() {
        m771e();
    }

    /* renamed from: b */
    void mo160b(Rect rect) {
        if (this.o.mo129b()) {
            this.f12985p = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            this.o.mo128a(this.f12985p);
            return;
        }
        this.o.mo128a(this.e);
    }

    /* renamed from: i */
    C0201c mo163i() {
        return new C3065d();
    }

    /* renamed from: l */
    GradientDrawable mo164l() {
        return new C0210a();
    }

    /* renamed from: a */
    void mo157a(Rect rect) {
        if (this.o.mo129b()) {
            float a = this.o.mo126a();
            float a2 = mo153a() + this.i;
            int ceil = (int) Math.ceil((double) C3070i.m15082b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) C3070i.m15079a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
