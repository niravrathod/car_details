package android.support.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    /* renamed from: g */
    private static final TimeInterpolator f18383g = new DecelerateInterpolator();
    /* renamed from: h */
    private static final TimeInterpolator f18384h = new AccelerateInterpolator();
    /* renamed from: k */
    private static final C0257a f18385k = new C44161();
    /* renamed from: l */
    private static final C0257a f18386l = new C44172();
    /* renamed from: m */
    private static final C0257a f18387m = new C44183();
    /* renamed from: n */
    private static final C0257a f18388n = new C44194();
    /* renamed from: o */
    private static final C0257a f18389o = new C44205();
    /* renamed from: p */
    private static final C0257a f18390p = new C44216();
    /* renamed from: i */
    private C0257a f18391i = f18390p;
    /* renamed from: j */
    private int f18392j = 80;

    /* renamed from: android.support.transition.Slide$a */
    private interface C0257a {
        /* renamed from: a */
        float mo196a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo195b(ViewGroup viewGroup, View view);
    }

    /* renamed from: android.support.transition.Slide$b */
    private static abstract class C3078b implements C0257a {
        private C3078b() {
        }

        /* renamed from: b */
        public float mo195b(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: android.support.transition.Slide$c */
    private static abstract class C3079c implements C0257a {
        private C3079c() {
        }

        /* renamed from: a */
        public float mo196a(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    /* renamed from: android.support.transition.Slide$1 */
    static class C44161 extends C3078b {
        C44161() {
            super();
        }

        /* renamed from: a */
        public float mo196a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$2 */
    static class C44172 extends C3078b {
        C44172() {
            super();
        }

        /* renamed from: a */
        public float mo196a(ViewGroup viewGroup, View view) {
            Object obj = 1;
            if (C0560r.m2193e(viewGroup) != 1) {
                obj = null;
            }
            if (obj != null) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$3 */
    static class C44183 extends C3079c {
        C44183() {
            super();
        }

        /* renamed from: b */
        public float mo195b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: android.support.transition.Slide$4 */
    static class C44194 extends C3078b {
        C44194() {
            super();
        }

        /* renamed from: a */
        public float mo196a(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$5 */
    static class C44205 extends C3078b {
        C44205() {
            super();
        }

        /* renamed from: a */
        public float mo196a(ViewGroup viewGroup, View view) {
            Object obj = 1;
            if (C0560r.m2193e(viewGroup) != 1) {
                obj = null;
            }
            if (obj != null) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: android.support.transition.Slide$6 */
    static class C44216 extends C3079c {
        C44216() {
            super();
        }

        /* renamed from: b */
        public float mo195b(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    public Slide() {
        mo200a(80);
    }

    public Slide(int i) {
        mo200a(i);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f982h);
        int a = C0388c.m1421a(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo200a(a);
    }

    /* renamed from: d */
    private void m24192d(ah ahVar) {
        Object obj = new int[2];
        ahVar.f995b.getLocationOnScreen(obj);
        ahVar.f994a.put("android:slide:screenPosition", obj);
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        super.mo98a(ahVar);
        m24192d(ahVar);
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        super.mo99b(ahVar);
        m24192d(ahVar);
    }

    /* renamed from: a */
    public void mo200a(int i) {
        if (i == 3) {
            this.f18391i = f18385k;
        } else if (i == 5) {
            this.f18391i = f18388n;
        } else if (i == 48) {
            this.f18391i = f18387m;
        } else if (i == 80) {
            this.f18391i = f18390p;
        } else if (i == 8388611) {
            this.f18391i = f18386l;
        } else if (i == 8388613) {
            this.f18391i = f18389o;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.f18392j = i;
        af abVar = new ab();
        abVar.m24204a(i);
        mo203a(abVar);
    }

    /* renamed from: a */
    public Animator mo3734a(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) ahVar2.f994a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return aj.m984a(view, ahVar2, iArr[null], iArr[1], this.f18391i.mo196a(viewGroup, view), this.f18391i.mo195b(viewGroup, view), translationX, translationY, f18383g);
    }

    /* renamed from: b */
    public Animator mo3735b(ViewGroup viewGroup, View view, ah ahVar, ah ahVar2) {
        if (ahVar == null) {
            return null;
        }
        int[] iArr = (int[]) ahVar.f994a.get("android:slide:screenPosition");
        return aj.m984a(view, ahVar, iArr[null], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f18391i.mo196a(viewGroup, view), this.f18391i.mo195b(viewGroup, view), f18384h);
    }
}
