package android.support.design.widget;

import android.content.Context;
import android.support.design.C0143a.C0139h;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.C0200b.C0195a;
import android.support.design.widget.C0200b.C0196c;
import android.support.design.widget.C0200b.C0199f;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public final class Snackbar extends C0200b<Snackbar> {
    /* renamed from: d */
    private C0195a<Snackbar> f12910d;

    public static final class SnackbarLayout extends C0199f {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            i = getChildCount();
            i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < i; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(i2, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* renamed from: android.support.design.widget.Snackbar$a */
    public static class C3054a extends C0195a<Snackbar> {
        /* renamed from: a */
        public void m14989a(Snackbar snackbar) {
        }

        /* renamed from: a */
        public void m14990a(Snackbar snackbar, int i) {
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, C0196c c0196c) {
        super(viewGroup, view, c0196c);
    }

    /* renamed from: a */
    public static Snackbar m14993a(View view, CharSequence charSequence, int i) {
        view = m14994a(view);
        if (view != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(view.getContext()).inflate(C0139h.design_layout_snackbar_include, view, false);
            Snackbar snackbar = new Snackbar(view, snackbarContentLayout, snackbarContentLayout);
            snackbar.m14996a(charSequence);
            snackbar.m681a(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: a */
    private static ViewGroup m14994a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                view = view.getParent();
                if (view instanceof View) {
                    view = view;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public Snackbar m14996a(CharSequence charSequence) {
        ((SnackbarContentLayout) this.b.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public Snackbar m14997a(CharSequence charSequence, final OnClickListener onClickListener) {
        TextView actionView = ((SnackbarContentLayout) this.b.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(charSequence)) {
            if (onClickListener != null) {
                actionView.setVisibility(0);
                actionView.setText(charSequence);
                actionView.setOnClickListener(new OnClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ Snackbar f620b;

                    public void onClick(View view) {
                        onClickListener.onClick(view);
                        this.f620b.m685b(1);
                    }
                });
                return this;
            }
        }
        actionView.setVisibility(8);
        actionView.setOnClickListener(null);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public Snackbar m14995a(C3054a c3054a) {
        if (this.f12910d != null) {
            m684b(this.f12910d);
        }
        if (c3054a != null) {
            m682a((C0195a) c3054a);
        }
        this.f12910d = c3054a;
        return this;
    }
}
