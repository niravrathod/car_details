package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.support.transition.C0293y.C0292a;
import android.support.transition.Transition.C0262c;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.view.C0560r;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    /* renamed from: g */
    private static final String[] f13031g = new String[]{"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    /* renamed from: h */
    private static final Property<C0254b, float[]> f13032h = new Property<C0254b, float[]>(float[].class, "nonTranslations") {
        /* renamed from: a */
        public float[] m892a(C0254b c0254b) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m892a((C0254b) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m891a((C0254b) obj, (float[]) obj2);
        }

        /* renamed from: a */
        public void m891a(C0254b c0254b, float[] fArr) {
            c0254b.m899a(fArr);
        }
    };
    /* renamed from: i */
    private static final Property<C0254b, PointF> f13033i = new Property<C0254b, PointF>(PointF.class, "translations") {
        /* renamed from: a */
        public PointF m893a(C0254b c0254b) {
            return null;
        }

        public /* synthetic */ Object get(Object obj) {
            return m893a((C0254b) obj);
        }

        public /* synthetic */ void set(Object obj, Object obj2) {
            m894a((C0254b) obj, (PointF) obj2);
        }

        /* renamed from: a */
        public void m894a(C0254b c0254b, PointF pointF) {
            c0254b.m898a(pointF);
        }
    };
    /* renamed from: j */
    private static final boolean f13034j = (VERSION.SDK_INT >= 21);
    /* renamed from: k */
    private boolean f13035k = true;
    /* renamed from: l */
    private boolean f13036l = true;
    /* renamed from: m */
    private Matrix f13037m = new Matrix();

    /* renamed from: android.support.transition.ChangeTransform$b */
    private static class C0254b {
        /* renamed from: a */
        private final Matrix f904a = new Matrix();
        /* renamed from: b */
        private final View f905b;
        /* renamed from: c */
        private final float[] f906c;
        /* renamed from: d */
        private float f907d;
        /* renamed from: e */
        private float f908e;

        C0254b(View view, float[] fArr) {
            this.f905b = view;
            this.f906c = (float[]) fArr.clone();
            this.f907d = this.f906c[2];
            this.f908e = this.f906c[5];
            m896b();
        }

        /* renamed from: a */
        void m899a(float[] fArr) {
            System.arraycopy(fArr, 0, this.f906c, 0, fArr.length);
            m896b();
        }

        /* renamed from: a */
        void m898a(PointF pointF) {
            this.f907d = pointF.x;
            this.f908e = pointF.y;
            m896b();
        }

        /* renamed from: b */
        private void m896b() {
            this.f906c[2] = this.f907d;
            this.f906c[5] = this.f908e;
            this.f904a.setValues(this.f906c);
            au.m1010c(this.f905b, this.f904a);
        }

        /* renamed from: a */
        Matrix m897a() {
            return this.f904a;
        }
    }

    /* renamed from: android.support.transition.ChangeTransform$c */
    private static class C0255c {
        /* renamed from: a */
        final float f909a;
        /* renamed from: b */
        final float f910b;
        /* renamed from: c */
        final float f911c;
        /* renamed from: d */
        final float f912d;
        /* renamed from: e */
        final float f913e;
        /* renamed from: f */
        final float f914f;
        /* renamed from: g */
        final float f915g;
        /* renamed from: h */
        final float f916h;

        C0255c(View view) {
            this.f909a = view.getTranslationX();
            this.f910b = view.getTranslationY();
            this.f911c = C0560r.m2201m(view);
            this.f912d = view.getScaleX();
            this.f913e = view.getScaleY();
            this.f914f = view.getRotationX();
            this.f915g = view.getRotationY();
            this.f916h = view.getRotation();
        }

        /* renamed from: a */
        public void m900a(View view) {
            ChangeTransform.m15133b(view, this.f909a, this.f910b, this.f911c, this.f912d, this.f913e, this.f914f, this.f915g, this.f916h);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof C0255c)) {
                return false;
            }
            C0255c c0255c = (C0255c) obj;
            if (c0255c.f909a == this.f909a && c0255c.f910b == this.f910b && c0255c.f911c == this.f911c && c0255c.f912d == this.f912d && c0255c.f913e == this.f913e && c0255c.f914f == this.f914f && c0255c.f915g == this.f915g && c0255c.f916h == this.f916h) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            int i = 0;
            int floatToIntBits = (((((((((((((this.f909a != 0.0f ? Float.floatToIntBits(this.f909a) : 0) * 31) + (this.f910b != 0.0f ? Float.floatToIntBits(this.f910b) : 0)) * 31) + (this.f911c != 0.0f ? Float.floatToIntBits(this.f911c) : 0)) * 31) + (this.f912d != 0.0f ? Float.floatToIntBits(this.f912d) : 0)) * 31) + (this.f913e != 0.0f ? Float.floatToIntBits(this.f913e) : 0)) * 31) + (this.f914f != 0.0f ? Float.floatToIntBits(this.f914f) : 0)) * 31) + (this.f915g != 0.0f ? Float.floatToIntBits(this.f915g) : 0)) * 31;
            if (this.f916h != 0.0f) {
                i = Float.floatToIntBits(this.f916h);
            }
            return floatToIntBits + i;
        }
    }

    /* renamed from: android.support.transition.ChangeTransform$a */
    private static class C4414a extends ad {
        /* renamed from: a */
        private View f18376a;
        /* renamed from: b */
        private C0280i f18377b;

        C4414a(View view, C0280i c0280i) {
            this.f18376a = view;
            this.f18377b = c0280i;
        }

        /* renamed from: a */
        public void mo175a(Transition transition) {
            transition.mo206b((C0262c) this);
            C0281j.m1031a(this.f18376a);
            this.f18376a.setTag(C0292a.transition_transform, null);
            this.f18376a.setTag(C0292a.parent_matrix, null);
        }

        /* renamed from: b */
        public void mo176b(Transition transition) {
            this.f18377b.setVisibility(4);
        }

        /* renamed from: c */
        public void mo177c(Transition transition) {
            this.f18377b.setVisibility(0);
        }
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f981g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f13035k = C0388c.m1424a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f13036l = C0388c.m1424a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public String[] mo173a() {
        return f13031g;
    }

    /* renamed from: d */
    private void m15135d(ah ahVar) {
        View view = ahVar.f995b;
        if (view.getVisibility() != 8) {
            Object matrix;
            View view2;
            ahVar.f994a.put("android:changeTransform:parent", view.getParent());
            ahVar.f994a.put("android:changeTransform:transforms", new C0255c(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 != null) {
                if (!matrix2.isIdentity()) {
                    matrix = new Matrix(matrix2);
                    ahVar.f994a.put("android:changeTransform:matrix", matrix);
                    if (this.f13036l) {
                        matrix2 = new Matrix();
                        view2 = (ViewGroup) view.getParent();
                        au.m1006a(view2, matrix2);
                        matrix2.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                        ahVar.f994a.put("android:changeTransform:parentMatrix", matrix2);
                        ahVar.f994a.put("android:changeTransform:intermediateMatrix", view.getTag(C0292a.transition_transform));
                        ahVar.f994a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C0292a.parent_matrix));
                    }
                }
            }
            matrix = null;
            ahVar.f994a.put("android:changeTransform:matrix", matrix);
            if (this.f13036l) {
                matrix2 = new Matrix();
                view2 = (ViewGroup) view.getParent();
                au.m1006a(view2, matrix2);
                matrix2.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                ahVar.f994a.put("android:changeTransform:parentMatrix", matrix2);
                ahVar.f994a.put("android:changeTransform:intermediateMatrix", view.getTag(C0292a.transition_transform));
                ahVar.f994a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C0292a.parent_matrix));
            }
        }
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        m15135d(ahVar);
        if (!f13034j) {
            ((ViewGroup) ahVar.f995b.getParent()).startViewTransition(ahVar.f995b);
        }
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        m15135d(ahVar);
    }

    /* renamed from: a */
    public Animator mo97a(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        if (!(ahVar == null || ahVar2 == null || !ahVar.f994a.containsKey("android:changeTransform:parent"))) {
            if (ahVar2.f994a.containsKey("android:changeTransform:parent")) {
                ViewGroup viewGroup2 = (ViewGroup) ahVar.f994a.get("android:changeTransform:parent");
                boolean z = this.f13036l && !m15131a(viewGroup2, (ViewGroup) ahVar2.f994a.get("android:changeTransform:parent"));
                Matrix matrix = (Matrix) ahVar.f994a.get("android:changeTransform:intermediateMatrix");
                if (matrix != null) {
                    ahVar.f994a.put("android:changeTransform:matrix", matrix);
                }
                matrix = (Matrix) ahVar.f994a.get("android:changeTransform:intermediateParentMatrix");
                if (matrix != null) {
                    ahVar.f994a.put("android:changeTransform:parentMatrix", matrix);
                }
                if (z) {
                    m15132b(ahVar, ahVar2);
                }
                Animator a = m15127a(ahVar, ahVar2, z);
                if (z && a != null && this.f13035k) {
                    m15134b(viewGroup, ahVar, ahVar2);
                } else if (f13034j == null) {
                    viewGroup2.endViewTransition(ahVar.f995b);
                }
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private ObjectAnimator m15127a(ah ahVar, ah ahVar2, boolean z) {
        ahVar = (Matrix) ahVar.f994a.get("android:changeTransform:matrix");
        Matrix matrix = (Matrix) ahVar2.f994a.get("android:changeTransform:matrix");
        if (ahVar == null) {
            ahVar = C0286o.f1028a;
        }
        if (matrix == null) {
            matrix = C0286o.f1028a;
        }
        final Matrix matrix2 = matrix;
        if (ahVar.equals(matrix2)) {
            return null;
        }
        final C0255c c0255c = (C0255c) ahVar2.f994a.get("android:changeTransform:transforms");
        final View view = ahVar2.f995b;
        m15136g(view);
        r0 = new float[9];
        ahVar.getValues(r0);
        ahVar = new float[9];
        matrix2.getValues(ahVar);
        final C0254b c0254b = new C0254b(view, r0);
        PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(f13032h, new C0276f(new float[9]), new float[][]{r0, ahVar});
        ahVar = C0290u.m1043a(f13033i, m961l().mo172a(r0[2], r0[5], ahVar[2], ahVar[5]));
        ahVar = ObjectAnimator.ofPropertyValuesHolder(c0254b, new PropertyValuesHolder[]{ofObject, ahVar});
        final boolean z2 = z;
        ah c02533 = new AnimatorListenerAdapter(this) {
            /* renamed from: f */
            final /* synthetic */ ChangeTransform f901f;
            /* renamed from: g */
            private boolean f902g;
            /* renamed from: h */
            private Matrix f903h = new Matrix();

            public void onAnimationCancel(Animator animator) {
                this.f902g = true;
            }

            public void onAnimationEnd(Animator animator) {
                if (this.f902g == null) {
                    if (z2 == null || this.f901f.f13035k == null) {
                        view.setTag(C0292a.transition_transform, null);
                        view.setTag(C0292a.parent_matrix, null);
                    } else {
                        m895a(matrix2);
                    }
                }
                au.m1010c(view, null);
                c0255c.m900a(view);
            }

            public void onAnimationPause(Animator animator) {
                m895a(c0254b.m897a());
            }

            public void onAnimationResume(Animator animator) {
                ChangeTransform.m15136g(view);
            }

            /* renamed from: a */
            private void m895a(Matrix matrix) {
                this.f903h.set(matrix);
                view.setTag(C0292a.transition_transform, this.f903h);
                c0255c.m900a(view);
            }
        };
        ahVar.addListener(c02533);
        C0265a.m966a(ahVar, c02533);
        return ahVar;
    }

    /* renamed from: a */
    private boolean m15131a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (m946b((View) viewGroup)) {
            if (m946b((View) viewGroup2)) {
                viewGroup = m943b((View) viewGroup, true);
                if (viewGroup == null || viewGroup2 != viewGroup.f995b) {
                    return false;
                }
                return true;
            }
        }
        if (viewGroup == viewGroup2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m15134b(ViewGroup viewGroup, ah ahVar, ah ahVar2) {
        View view = ahVar2.f995b;
        Matrix matrix = new Matrix((Matrix) ahVar2.f994a.get("android:changeTransform:parentMatrix"));
        au.m1008b(viewGroup, matrix);
        viewGroup = C0281j.m1030a(view, viewGroup, matrix);
        if (viewGroup != null) {
            viewGroup.mo240a((ViewGroup) ahVar.f994a.get("android:changeTransform:parent"), ahVar.f995b);
            Transition transition = this;
            while (transition.f943d != null) {
                transition = transition.f943d;
            }
            transition.mo199a(new C4414a(view, viewGroup));
            if (f13034j != null) {
                if (ahVar.f995b != ahVar2.f995b) {
                    au.m1003a(ahVar.f995b, (float) null);
                }
                au.m1003a(view, 1.0f);
            }
        }
    }

    /* renamed from: b */
    private void m15132b(ah ahVar, ah ahVar2) {
        Matrix matrix = (Matrix) ahVar2.f994a.get("android:changeTransform:parentMatrix");
        ahVar2.f995b.setTag(C0292a.parent_matrix, matrix);
        ahVar2 = this.f13037m;
        ahVar2.reset();
        matrix.invert(ahVar2);
        matrix = (Matrix) ahVar.f994a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = new Matrix();
            ahVar.f994a.put("android:changeTransform:matrix", matrix);
        }
        matrix.postConcat((Matrix) ahVar.f994a.get("android:changeTransform:parentMatrix"));
        matrix.postConcat(ahVar2);
    }

    /* renamed from: g */
    private static void m15136g(View view) {
        m15133b(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: b */
    private static void m15133b(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C0560r.m2184b(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }
}
