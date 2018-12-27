package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ChangeClipBounds extends Transition {
    /* renamed from: g */
    private static final String[] f13026g = new String[]{"android:clipBounds:clip"};

    /* renamed from: a */
    public String[] mo173a() {
        return f13026g;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: d */
    private void m15107d(ah ahVar) {
        View view = ahVar.f995b;
        if (view.getVisibility() != 8) {
            Rect z = C0560r.m2214z(view);
            ahVar.f994a.put("android:clipBounds:clip", z);
            if (z == null) {
                ahVar.f994a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m15107d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m15107d(ahVar);
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (!(ahVar == null || ahVar2 == null || !ahVar.f994a.containsKey("android:clipBounds:clip"))) {
            if (ahVar2.f994a.containsKey("android:clipBounds:clip")) {
                Rect rect = (Rect) ahVar.f994a.get("android:clipBounds:clip");
                Object obj = (Rect) ahVar2.f994a.get("android:clipBounds:clip");
                Object obj2 = obj == null ? 1 : null;
                if (rect == null && obj == null) {
                    return null;
                }
                if (rect == null) {
                    rect = (Rect) ahVar.f994a.get("android:clipBounds:bounds");
                } else if (obj == null) {
                    obj = (Rect) ahVar2.f994a.get("android:clipBounds:bounds");
                }
                if (rect.equals(obj) != null) {
                    return null;
                }
                C0560r.m2173a(ahVar2.f995b, rect);
                viewGroup = ObjectAnimator.ofObject(ahVar2.f995b, au.f1018b, new C0294z(new Rect()), new Rect[]{rect, obj});
                if (obj2 != null) {
                    ahVar = ahVar2.f995b;
                    viewGroup.addListener(new AnimatorListenerAdapter(this) {
                        /* renamed from: b */
                        final /* synthetic */ ChangeClipBounds f894b;

                        public void onAnimationEnd(Animator animator) {
                            C0560r.m2173a(ahVar, null);
                        }
                    });
                }
                return viewGroup;
            }
        }
        return null;
    }
}
