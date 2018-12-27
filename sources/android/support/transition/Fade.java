package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.Transition.C0262c;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class Fade extends Visibility {

    /* renamed from: android.support.transition.Fade$a */
    private static class C0256a extends AnimatorListenerAdapter {
        /* renamed from: a */
        private final View f917a;
        /* renamed from: b */
        private boolean f918b = false;

        C0256a(View view) {
            this.f917a = view;
        }

        public void onAnimationStart(Animator animator) {
            if (C0560r.m2206r(this.f917a) != null && this.f917a.getLayerType() == null) {
                this.f918b = true;
                this.f917a.setLayerType(2, null);
            }
        }

        public void onAnimationEnd(Animator animator) {
            au.m1003a(this.f917a, 1.0f);
            if (this.f918b != null) {
                this.f917a.setLayerType(0, null);
            }
        }
    }

    public Fade(int i) {
        m15224b(i);
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f980f);
        m15224b((int) C0388c.m1421a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo215p()));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        super.mo98a(ahVar);
        ahVar.f994a.put("android:fade:transitionAlpha", Float.valueOf(au.m1009c(ahVar.f995b)));
    }

    /* renamed from: a */
    private Animator m24182a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        au.m1003a(view, f);
        f = ObjectAnimator.ofFloat(view, au.f1017a, new float[]{f2});
        f.addListener(new C0256a(view));
        mo199a((C0262c) new ad(this) {
            /* renamed from: b */
            final /* synthetic */ Fade f18382b;

            /* renamed from: a */
            public void mo175a(Transition transition) {
                au.m1003a(view, 1.0f);
                au.m1012e(view);
                transition.mo206b((C0262c) this);
            }
        });
        return f;
    }

    /* renamed from: a */
    public Animator mo3734a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        viewGroup = null;
        ahVar = m24181a(ahVar, 0.0f);
        if (ahVar != 1065353216) {
            viewGroup = ahVar;
        }
        return m24182a(view, viewGroup, 1.0f);
    }

    /* renamed from: b */
    public Animator mo3735b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        au.m1011d(view);
        return m24182a(view, m24181a(ahVar, 1.0f), null);
    }

    /* renamed from: a */
    private static float m24181a(ah ahVar, float f) {
        if (ahVar == null) {
            return f;
        }
        Float f2 = (Float) ahVar.f994a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }
}
