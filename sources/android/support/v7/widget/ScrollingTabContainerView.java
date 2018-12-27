package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar.C0639b;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.view.C0704a;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class ScrollingTabContainerView extends HorizontalScrollView implements OnItemSelectedListener {
    /* renamed from: l */
    private static final Interpolator f2591l = new DecelerateInterpolator();
    /* renamed from: a */
    Runnable f2592a;
    /* renamed from: b */
    LinearLayoutCompat f2593b;
    /* renamed from: c */
    int f2594c;
    /* renamed from: d */
    int f2595d;
    /* renamed from: e */
    protected ViewPropertyAnimator f2596e;
    /* renamed from: f */
    protected final C0803d f2597f = new C0803d(this);
    /* renamed from: g */
    private C0801b f2598g;
    /* renamed from: h */
    private Spinner f2599h;
    /* renamed from: i */
    private boolean f2600i;
    /* renamed from: j */
    private int f2601j;
    /* renamed from: k */
    private int f2602k;

    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$a */
    private class C0800a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ ScrollingTabContainerView f2580a;

        public long getItemId(int i) {
            return (long) i;
        }

        C0800a(ScrollingTabContainerView scrollingTabContainerView) {
            this.f2580a = scrollingTabContainerView;
        }

        public int getCount() {
            return this.f2580a.f2593b.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0802c) this.f2580a.f2593b.getChildAt(i)).m3308b();
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return this.f2580a.m3314a((C0639b) getItem(i), true);
            }
            ((C0802c) view).m3307a((C0639b) getItem(i));
            return view;
        }
    }

    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$b */
    private class C0801b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ScrollingTabContainerView f2581a;

        C0801b(ScrollingTabContainerView scrollingTabContainerView) {
            this.f2581a = scrollingTabContainerView;
        }

        public void onClick(View view) {
            ((C0802c) view).m3308b().m2540d();
            int childCount = this.f2581a.f2593b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2581a.f2593b.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$c */
    private class C0802c extends LinearLayout {
        /* renamed from: a */
        final /* synthetic */ ScrollingTabContainerView f2582a;
        /* renamed from: b */
        private final int[] f2583b = new int[]{16842964};
        /* renamed from: c */
        private C0639b f2584c;
        /* renamed from: d */
        private TextView f2585d;
        /* renamed from: e */
        private ImageView f2586e;
        /* renamed from: f */
        private View f2587f;

        public C0802c(ScrollingTabContainerView scrollingTabContainerView, Context context, C0639b c0639b, boolean z) {
            this.f2582a = scrollingTabContainerView;
            super(context, null, C0627a.actionBarTabStyle);
            this.f2584c = c0639b;
            scrollingTabContainerView = ay.m3543a(context, null, this.f2583b, C0627a.actionBarTabStyle, 0);
            if (scrollingTabContainerView.m3561g(0) != null) {
                setBackgroundDrawable(scrollingTabContainerView.m3547a(0));
            }
            scrollingTabContainerView.m3548a();
            if (z) {
                setGravity(8388627);
            }
            m3306a();
        }

        /* renamed from: a */
        public void m3307a(C0639b c0639b) {
            this.f2584c = c0639b;
            m3306a();
        }

        public void setSelected(boolean z) {
            Object obj = isSelected() != z ? 1 : null;
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(true);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C0639b.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C0639b.class.getName());
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.f2582a.f2594c > 0 && getMeasuredWidth() > this.f2582a.f2594c) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.f2582a.f2594c, 1073741824), i2);
            }
        }

        /* renamed from: a */
        public void m3306a() {
            C0639b c0639b = this.f2584c;
            View c = c0639b.m2539c();
            CharSequence charSequence = null;
            if (c != null) {
                C0802c parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        parent.removeView(c);
                    }
                    addView(c);
                }
                this.f2587f = c;
                if (this.f2585d != null) {
                    this.f2585d.setVisibility(8);
                }
                if (this.f2586e != null) {
                    this.f2586e.setVisibility(8);
                    this.f2586e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f2587f != null) {
                removeView(this.f2587f);
                this.f2587f = null;
            }
            Drawable a = c0639b.m2537a();
            CharSequence b = c0639b.m2538b();
            if (a != null) {
                if (this.f2586e == null) {
                    View appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2586e = appCompatImageView;
                }
                this.f2586e.setImageDrawable(a);
                this.f2586e.setVisibility(0);
            } else if (this.f2586e != null) {
                this.f2586e.setVisibility(8);
                this.f2586e.setImageDrawable(null);
            }
            int isEmpty = TextUtils.isEmpty(b) ^ 1;
            if (isEmpty != 0) {
                if (this.f2585d == null) {
                    View appCompatTextView = new AppCompatTextView(getContext(), null, C0627a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2585d = appCompatTextView;
                }
                this.f2585d.setText(b);
                this.f2585d.setVisibility(0);
            } else if (this.f2585d != null) {
                this.f2585d.setVisibility(8);
                this.f2585d.setText(null);
            }
            if (this.f2586e != null) {
                this.f2586e.setContentDescription(c0639b.m2541e());
            }
            if (isEmpty == 0) {
                charSequence = c0639b.m2541e();
            }
            ba.m3562a(this, charSequence);
        }

        /* renamed from: b */
        public C0639b m3308b() {
            return this.f2584c;
        }
    }

    /* renamed from: android.support.v7.widget.ScrollingTabContainerView$d */
    protected class C0803d extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ ScrollingTabContainerView f2588a;
        /* renamed from: b */
        private boolean f2589b = null;
        /* renamed from: c */
        private int f2590c;

        protected C0803d(ScrollingTabContainerView scrollingTabContainerView) {
            this.f2588a = scrollingTabContainerView;
        }

        public void onAnimationStart(Animator animator) {
            this.f2588a.setVisibility(0);
            this.f2589b = false;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2589b == null) {
                this.f2588a.f2596e = null;
                this.f2588a.setVisibility(this.f2590c);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f2589b = true;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        context = C0704a.m2754a(context);
        setContentHeight(context.m2759e());
        this.f2595d = context.m2761g();
        this.f2593b = m3312d();
        addView(this.f2593b, new LayoutParams(-2, -1));
    }

    public void onMeasure(int i, int i2) {
        i2 = MeasureSpec.getMode(i);
        Object obj = 1;
        boolean z = i2 == 1073741824;
        setFillViewport(z);
        int childCount = this.f2593b.getChildCount();
        if (childCount <= 1 || !(i2 == 1073741824 || i2 == Integer.MIN_VALUE)) {
            this.f2594c = -1;
        } else {
            if (childCount > 2) {
                this.f2594c = (int) (((float) MeasureSpec.getSize(i)) * 1053609165);
            } else {
                this.f2594c = MeasureSpec.getSize(i) / 2;
            }
            this.f2594c = Math.min(this.f2594c, this.f2595d);
        }
        i2 = MeasureSpec.makeMeasureSpec(this.f2601j, 1073741824);
        if (z || !this.f2600i) {
            obj = null;
        }
        if (obj != null) {
            this.f2593b.measure(0, i2);
            if (this.f2593b.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m3310b();
            } else {
                m3311c();
            }
        } else {
            m3311c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, i2);
        i = getMeasuredWidth();
        if (z && measuredWidth != i) {
            setTabSelected(this.f2602k);
        }
    }

    /* renamed from: a */
    private boolean m3309a() {
        return this.f2599h != null && this.f2599h.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.f2600i = z;
    }

    /* renamed from: b */
    private void m3310b() {
        if (!m3309a()) {
            if (this.f2599h == null) {
                this.f2599h = m3313e();
            }
            removeView(this.f2593b);
            addView(this.f2599h, new LayoutParams(-2, -1));
            if (this.f2599h.getAdapter() == null) {
                this.f2599h.setAdapter(new C0800a(this));
            }
            if (this.f2592a != null) {
                removeCallbacks(this.f2592a);
                this.f2592a = null;
            }
            this.f2599h.setSelection(this.f2602k);
        }
    }

    /* renamed from: c */
    private boolean m3311c() {
        if (!m3309a()) {
            return false;
        }
        removeView(this.f2599h);
        addView(this.f2593b, new LayoutParams(-2, -1));
        setTabSelected(this.f2599h.getSelectedItemPosition());
        return false;
    }

    public void setTabSelected(int i) {
        this.f2602k = i;
        int childCount = this.f2593b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2593b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m3315a(i);
            }
            i2++;
        }
        if (this.f2599h != null && i >= 0) {
            this.f2599h.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.f2601j = i;
        requestLayout();
    }

    /* renamed from: d */
    private LinearLayoutCompat m3312d() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, C0627a.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    /* renamed from: e */
    private Spinner m3313e() {
        Spinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0627a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        configuration = C0704a.m2754a(getContext());
        setContentHeight(configuration.m2759e());
        this.f2595d = configuration.m2761g();
    }

    /* renamed from: a */
    public void m3315a(int i) {
        i = this.f2593b.getChildAt(i);
        if (this.f2592a != null) {
            removeCallbacks(this.f2592a);
        }
        this.f2592a = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ ScrollingTabContainerView f2579b;

            public void run() {
                this.f2579b.smoothScrollTo(i.getLeft() - ((this.f2579b.getWidth() - i.getWidth()) / 2), 0);
                this.f2579b.f2592a = null;
            }
        };
        post(this.f2592a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2592a != null) {
            post(this.f2592a);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2592a != null) {
            removeCallbacks(this.f2592a);
        }
    }

    /* renamed from: a */
    C0802c m3314a(C0639b c0639b, boolean z) {
        C0802c c0802c = new C0802c(this, getContext(), c0639b, z);
        if (z) {
            c0802c.setBackgroundDrawable(null);
            c0802c.setLayoutParams(new AbsListView.LayoutParams(true, this.f2601j));
        } else {
            c0802c.setFocusable(true);
            if (this.f2598g == null) {
                this.f2598g = new C0801b(this);
            }
            c0802c.setOnClickListener(this.f2598g);
        }
        return c0802c;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0802c) view).m3308b().m2540d();
    }
}
