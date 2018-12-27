package android.support.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.transition.C0280i.C0279a;
import android.support.transition.C0293y.C0292a;
import android.support.v4.view.C0560r;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;

@SuppressLint({"ViewConstructor"})
/* renamed from: android.support.transition.g */
class C3085g extends View implements C0280i {
    /* renamed from: a */
    final View f13078a;
    /* renamed from: b */
    ViewGroup f13079b;
    /* renamed from: c */
    View f13080c;
    /* renamed from: d */
    int f13081d;
    /* renamed from: e */
    Matrix f13082e;
    /* renamed from: f */
    private int f13083f;
    /* renamed from: g */
    private int f13084g;
    /* renamed from: h */
    private final Matrix f13085h = new Matrix();
    /* renamed from: i */
    private final OnPreDrawListener f13086i = new C02771(this);

    /* renamed from: android.support.transition.g$1 */
    class C02771 implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ C3085g f1023a;

        C02771(C3085g c3085g) {
            this.f1023a = c3085g;
        }

        public boolean onPreDraw() {
            this.f1023a.f13082e = this.f1023a.f13078a.getMatrix();
            C0560r.m2189c(this.f1023a);
            if (!(this.f1023a.f13079b == null || this.f1023a.f13080c == null)) {
                this.f1023a.f13079b.endViewTransition(this.f1023a.f13080c);
                C0560r.m2189c(this.f1023a.f13079b);
                this.f1023a.f13079b = null;
                this.f1023a.f13080c = null;
            }
            return true;
        }
    }

    /* renamed from: android.support.transition.g$a */
    static class C3084a implements C0279a {
        C3084a() {
        }

        /* renamed from: a */
        public C0280i mo238a(View view, ViewGroup viewGroup, Matrix matrix) {
            matrix = C3085g.m15267a(view);
            if (matrix == null) {
                viewGroup = C3084a.m15264a(viewGroup);
                if (viewGroup == null) {
                    return null;
                }
                matrix = new C3085g(view);
                viewGroup.addView(matrix);
            }
            matrix.f13081d++;
            return matrix;
        }

        /* renamed from: a */
        public void mo239a(View view) {
            view = C3085g.m15267a(view);
            if (view != null) {
                view.f13081d--;
                if (view.f13081d <= 0) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) parent;
                        viewGroup.endViewTransition(view);
                        viewGroup.removeView(view);
                    }
                }
            }
        }

        /* renamed from: a */
        private static FrameLayout m15264a(ViewGroup viewGroup) {
            while (!(viewGroup instanceof FrameLayout)) {
                viewGroup = viewGroup.getParent();
                if (!(viewGroup instanceof ViewGroup)) {
                    return null;
                }
                viewGroup = viewGroup;
            }
            return (FrameLayout) viewGroup;
        }
    }

    C3085g(View view) {
        super(view.getContext());
        this.f13078a = view;
        setLayerType(2, null);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3085g.m15268a(this.f13078a, this);
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr);
        this.f13078a.getLocationOnScreen(iArr2);
        iArr2[0] = (int) (((float) iArr2[0]) - this.f13078a.getTranslationX());
        iArr2[1] = (int) (((float) iArr2[1]) - this.f13078a.getTranslationY());
        this.f13083f = iArr2[0] - iArr[0];
        this.f13084g = iArr2[1] - iArr[1];
        this.f13078a.getViewTreeObserver().addOnPreDrawListener(this.f13086i);
        this.f13078a.setVisibility(4);
    }

    protected void onDetachedFromWindow() {
        this.f13078a.getViewTreeObserver().removeOnPreDrawListener(this.f13086i);
        this.f13078a.setVisibility(0);
        C3085g.m15268a(this.f13078a, null);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas) {
        this.f13085h.set(this.f13082e);
        this.f13085h.postTranslate((float) this.f13083f, (float) this.f13084g);
        canvas.setMatrix(this.f13085h);
        this.f13078a.draw(canvas);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f13078a.setVisibility(i == 0 ? 4 : 0);
    }

    /* renamed from: a */
    public void mo240a(ViewGroup viewGroup, View view) {
        this.f13079b = viewGroup;
        this.f13080c = view;
    }

    /* renamed from: a */
    private static void m15268a(View view, C3085g c3085g) {
        view.setTag(C0292a.ghost_view, c3085g);
    }

    /* renamed from: a */
    static C3085g m15267a(View view) {
        return (C3085g) view.getTag(C0292a.ghost_view);
    }
}
