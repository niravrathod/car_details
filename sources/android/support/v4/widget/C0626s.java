package android.support.v4.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: android.support.v4.widget.s */
public class C0626s {
    /* renamed from: a */
    private static final ThreadLocal<Matrix> f1995a = new ThreadLocal();
    /* renamed from: b */
    private static final ThreadLocal<RectF> f1996b = new ThreadLocal();

    /* renamed from: a */
    static void m2533a(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f1995a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f1995a.set(matrix);
        } else {
            matrix.reset();
        }
        C0626s.m2534a((ViewParent) viewGroup, view, matrix);
        viewGroup = (RectF) f1996b.get();
        if (viewGroup == null) {
            viewGroup = new RectF();
            f1996b.set(viewGroup);
        }
        viewGroup.set(rect);
        matrix.mapRect(viewGroup);
        rect.set((int) (viewGroup.left + 1056964608), (int) (viewGroup.top + 0.5f), (int) (viewGroup.right + 0.5f), (int) (viewGroup.bottom + 1056964608));
    }

    /* renamed from: b */
    public static void m2535b(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        C0626s.m2533a(viewGroup, view, rect);
    }

    /* renamed from: a */
    private static void m2534a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            C0626s.m2534a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (view.getMatrix().isIdentity() == null) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
