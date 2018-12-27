package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        if (!m16309c(i, i2)) {
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: c */
    private boolean m16309c(int i, int i2) {
        int i3;
        int combineMeasuredStates;
        int c;
        int measuredHeight;
        int i4;
        AlertDialogLayout alertDialogLayout = this;
        int i5 = i;
        int i6 = i2;
        int childCount = getChildCount();
        View view = null;
        View view2 = view;
        View view3 = view2;
        for (i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0632f.topPanel) {
                    view = childAt;
                } else if (id == C0632f.buttonPanel) {
                    view2 = childAt;
                } else {
                    if (id != C0632f.contentPanel) {
                        if (id != C0632f.customPanel) {
                            return false;
                        }
                    }
                    if (view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        i3 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i5, 0);
            paddingTop += view.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            combineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i5, 0);
            c = m16308c(view2);
            measuredHeight = view2.getMeasuredHeight() - c;
            paddingTop += c;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        } else {
            c = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            if (i3 == 0) {
                i4 = 0;
            } else {
                i4 = MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), i3);
            }
            view3.measure(i5, i4);
            i4 = view3.getMeasuredHeight();
            paddingTop += i4;
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        } else {
            i4 = 0;
        }
        size -= paddingTop;
        if (view2 != null) {
            paddingTop -= c;
            measuredHeight = Math.min(size, measuredHeight);
            if (measuredHeight > 0) {
                size -= measuredHeight;
                c += measuredHeight;
            }
            view2.measure(i5, MeasureSpec.makeMeasureSpec(c, 1073741824));
            paddingTop += view2.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && size > 0) {
            paddingTop -= i4;
            view3.measure(i5, MeasureSpec.makeMeasureSpec(i4 + size, i3));
            paddingTop += view3.getMeasuredHeight();
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, view3.getMeasuredState());
        }
        int i7 = 0;
        for (i3 = 0; i3 < childCount; i3++) {
            view3 = getChildAt(i3);
            if (view3.getVisibility() != 8) {
                i7 = Math.max(i7, view3.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i7 + (getPaddingLeft() + getPaddingRight()), i5, combineMeasuredStates), View.resolveSizeAndState(paddingTop, i6, 0));
        if (mode != 1073741824) {
            m16310d(childCount, i6);
        }
        return true;
    }

    /* renamed from: d */
    private void m16310d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
        }
    }

    /* renamed from: c */
    private static int m16308c(View view) {
        int j = C0560r.m2198j(view);
        if (j > 0) {
            return j;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m16308c(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        AlertDialogLayout alertDialogLayout = this;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        i6 = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i7 = gravity & 112;
        int i8 = gravity & 8388615;
        if (i7 == 16) {
            paddingTop = (((i4 - i2) - i6) / 2) + getPaddingTop();
        } else if (i7 != 80) {
            paddingTop = getPaddingTop();
        } else {
            paddingTop = ((getPaddingTop() + i4) - i2) - i6;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i5 = 0;
        } else {
            i5 = dividerDrawable.getIntrinsicHeight();
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                i7 = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i6 = layoutParams.f2419h;
                if (i6 < 0) {
                    i6 = i8;
                }
                i6 = C0543c.m2037a(i6, C0560r.m2193e(this)) & 7;
                if (i6 == 1) {
                    i6 = ((((paddingRight2 - i7) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (i6 != 5) {
                    i6 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i6 = (paddingRight - i7) - layoutParams.rightMargin;
                }
                if (m2920c(i9)) {
                    paddingTop += i5;
                }
                int i10 = paddingTop + layoutParams.topMargin;
                m16307a(childAt, i6, i10, i7, measuredHeight);
                paddingTop = i10 + (measuredHeight + layoutParams.bottomMargin);
            }
        }
    }

    /* renamed from: a */
    private void m16307a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
