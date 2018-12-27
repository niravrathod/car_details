package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0165d;
import android.support.v4.p013c.C0373a;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    /* renamed from: a */
    final Rect f18368a = new Rect();
    /* renamed from: b */
    final Rect f18369b = new Rect();
    /* renamed from: c */
    private int f18370c = 0;
    /* renamed from: d */
    private int f18371d;

    /* renamed from: c */
    private static int m24152c(int i) {
        return i == 0 ? 8388659 : i;
    }

    /* renamed from: a */
    float mo4592a(View view) {
        return 1.0f;
    }

    /* renamed from: b */
    abstract View mo4596b(List<View> list);

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo3730a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        HeaderScrollingViewBehavior headerScrollingViewBehavior = this;
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View b = mo4596b(coordinatorLayout.m24135c(view));
            if (b != null) {
                View view2;
                if (!C0560r.m2205q(b) || C0560r.m2205q(view)) {
                    view2 = view;
                } else {
                    view2 = view;
                    C0560r.m2187b(view, true);
                    if (C0560r.m2205q(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.m24122a(view, i, i2, MeasureSpec.makeMeasureSpec((size - b.getMeasuredHeight()) + mo4595b(b), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    protected void mo3731b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View b = mo4596b(coordinatorLayout.m24135c(view));
        if (b != null) {
            C0165d c0165d = (C0165d) view.getLayoutParams();
            Rect rect = this.f18368a;
            rect.set(coordinatorLayout.getPaddingLeft() + c0165d.leftMargin, b.getBottom() + c0165d.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - c0165d.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - c0165d.bottomMargin);
            C0571z lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (!(lastWindowInsets == null || C0560r.m2205q(coordinatorLayout) == null || C0560r.m2205q(view) != null)) {
                rect.left += lastWindowInsets.m2251a();
                rect.right -= lastWindowInsets.m2254c();
            }
            coordinatorLayout = this.f18369b;
            C0543c.m2038a(m24152c(c0165d.f599c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, coordinatorLayout, i);
            i = m24160c(b);
            view.layout(coordinatorLayout.left, coordinatorLayout.top - i, coordinatorLayout.right, coordinatorLayout.bottom - i);
            this.f18370c = coordinatorLayout.top - b.getBottom();
            return;
        }
        super.mo3731b(coordinatorLayout, view, i);
        this.f18370c = null;
    }

    /* renamed from: c */
    final int m24160c(View view) {
        return this.f18371d == 0 ? 0 : C0373a.m1375a((int) (mo4592a(view) * ((float) this.f18371d)), 0, this.f18371d);
    }

    /* renamed from: b */
    int mo4595b(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: a */
    final int m24154a() {
        return this.f18370c;
    }

    /* renamed from: b */
    public final void m24158b(int i) {
        this.f18371d = i;
    }

    /* renamed from: d */
    public final int m24161d() {
        return this.f18371d;
    }
}
