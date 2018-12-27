package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.support.design.C0143a.C0133b;
import android.support.design.C0143a.C0138g;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: android.support.design.widget.p */
class C0222p {
    /* renamed from: a */
    private static final int[] f841a = new int[]{16843848};

    /* renamed from: a */
    static void m815a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: a */
    static void m817a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        attributeSet = context.obtainStyledAttributes(attributeSet, f841a, i, i2);
        try {
            if (attributeSet.hasValue(0) != 0) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, attributeSet.getResourceId(0, 0)));
            }
            attributeSet.recycle();
        } catch (Throwable th) {
            attributeSet.recycle();
        }
    }

    /* renamed from: a */
    static void m816a(View view, float f) {
        int integer = view.getResources().getInteger(C0138g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, C0133b.state_collapsible, -C0133b.state_collapsed}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
