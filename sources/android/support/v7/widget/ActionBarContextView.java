package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0568v;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.C0706b;
import android.support.v7.view.menu.C3224h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView extends C0831a {
    /* renamed from: g */
    private CharSequence f13645g;
    /* renamed from: h */
    private CharSequence f13646h;
    /* renamed from: i */
    private View f13647i;
    /* renamed from: j */
    private View f13648j;
    /* renamed from: k */
    private LinearLayout f13649k;
    /* renamed from: l */
    private TextView f13650l;
    /* renamed from: m */
    private TextView f13651m;
    /* renamed from: n */
    private int f13652n;
    /* renamed from: o */
    private int f13653o;
    /* renamed from: p */
    private boolean f13654p;
    /* renamed from: q */
    private int f13655q;

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0568v mo616a(int i, long j) {
        return super.mo616a(i, j);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context = ay.m3543a(context, attributeSet, C0636j.ActionMode, i, 0);
        C0560r.m2174a((View) this, context.m3547a(C0636j.ActionMode_background));
        this.f13652n = context.m3560g(C0636j.ActionMode_titleTextStyle, 0);
        this.f13653o = context.m3560g(C0636j.ActionMode_subtitleTextStyle, 0);
        this.e = context.m3558f(C0636j.ActionMode_height, 0);
        this.f13655q = context.m3560g(C0636j.ActionMode_closeItemLayout, C0633g.abc_action_mode_close_item_material);
        context.m3548a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.m24524g();
            this.d.m24526i();
        }
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        if (this.f13648j != null) {
            removeView(this.f13648j);
        }
        this.f13648j = view;
        if (!(view == null || this.f13649k == null)) {
            removeView(this.f13649k);
            this.f13649k = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.f13645g = charSequence;
        m16246e();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13646h = charSequence;
        m16246e();
    }

    public CharSequence getTitle() {
        return this.f13645g;
    }

    public CharSequence getSubtitle() {
        return this.f13646h;
    }

    /* renamed from: e */
    private void m16246e() {
        if (this.f13649k == null) {
            LayoutInflater.from(getContext()).inflate(C0633g.abc_action_bar_title_item, this);
            this.f13649k = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f13650l = (TextView) this.f13649k.findViewById(C0632f.action_bar_title);
            this.f13651m = (TextView) this.f13649k.findViewById(C0632f.action_bar_subtitle);
            if (this.f13652n != 0) {
                this.f13650l.setTextAppearance(getContext(), this.f13652n);
            }
            if (this.f13653o != 0) {
                this.f13651m.setTextAppearance(getContext(), this.f13653o);
            }
        }
        this.f13650l.setText(this.f13645g);
        this.f13651m.setText(this.f13646h);
        int isEmpty = TextUtils.isEmpty(this.f13645g) ^ 1;
        int isEmpty2 = TextUtils.isEmpty(this.f13646h) ^ 1;
        int i = 8;
        this.f13651m.setVisibility(isEmpty2 != 0 ? 0 : 8);
        LinearLayout linearLayout = this.f13649k;
        if (!(isEmpty == 0 && isEmpty2 == 0)) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f13649k.getParent() == null) {
            addView(this.f13649k);
        }
    }

    /* renamed from: a */
    public void m16248a(final C0706b c0706b) {
        if (this.f13647i == null) {
            this.f13647i = LayoutInflater.from(getContext()).inflate(this.f13655q, this, false);
            addView(this.f13647i);
        } else if (this.f13647i.getParent() == null) {
            addView(this.f13647i);
        }
        this.f13647i.findViewById(C0632f.action_mode_close_button).setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ ActionBarContextView f2346b;

            public void onClick(View view) {
                c0706b.mo558c();
            }
        });
        C3224h c3224h = (C3224h) c0706b.mo555b();
        if (this.d != null) {
            this.d.m24525h();
        }
        this.d = new ActionMenuPresenter(getContext());
        this.d.m24520c(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        c3224h.m16150a(this.d, this.b);
        this.c = (ActionMenuView) this.d.mo3843a((ViewGroup) this);
        C0560r.m2174a(this.c, null);
        addView(this.c, layoutParams);
    }

    /* renamed from: b */
    public void m16250b() {
        if (this.f13647i == null) {
            m16251c();
        }
    }

    /* renamed from: c */
    public void m16251c() {
        removeAllViews();
        this.f13648j = null;
        this.c = null;
    }

    /* renamed from: a */
    public boolean mo617a() {
        return this.d != null ? this.d.m24523f() : false;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            i2 = new StringBuilder();
            i2.append(getClass().getSimpleName());
            i2.append(" can only be used ");
            i2.append("with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(i2.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            i = MeasureSpec.getSize(i);
            if (this.e > 0) {
                i2 = this.e;
            } else {
                i2 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int i4 = i2 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            int i5 = 0;
            if (this.f13647i != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f13647i.getLayoutParams();
                paddingLeft = m3433a(this.f13647i, paddingLeft, makeMeasureSpec, 0) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = m3433a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f13649k != null && this.f13648j == null) {
                if (this.f13654p) {
                    this.f13649k.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    makeMeasureSpec = this.f13649k.getMeasuredWidth();
                    Object obj = makeMeasureSpec <= paddingLeft ? 1 : null;
                    if (obj != null) {
                        paddingLeft -= makeMeasureSpec;
                    }
                    this.f13649k.setVisibility(obj != null ? 0 : 8);
                } else {
                    paddingLeft = m3433a(this.f13649k, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f13648j != null) {
                LayoutParams layoutParams = this.f13648j.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i4);
                }
                this.f13648j.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i4, i3));
            }
            if (this.e <= 0) {
                i2 = getChildCount();
                i3 = 0;
                while (i5 < i2) {
                    paddingLeft = getChildAt(i5).getMeasuredHeight() + paddingTop;
                    if (paddingLeft > i3) {
                        i3 = paddingLeft;
                    }
                    i5++;
                }
                setMeasuredDimension(i, i3);
                return;
            }
            setMeasuredDimension(i, i2);
        } else {
            i2 = new StringBuilder();
            i2.append(getClass().getSimpleName());
            i2.append(" can only be used ");
            i2.append("with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(i2.toString());
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = bg.m3615a(this);
        int paddingRight = z ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        i2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f13647i == 0 || this.f13647i.getVisibility() == 8) {
            i4 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f13647i.getLayoutParams();
            int i5 = z ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            i4 = z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a = C0831a.m3430a(paddingRight, i5, z);
            i4 = C0831a.m3430a(a + m3434a(this.f13647i, a, paddingTop, i2, z), i4, z);
        }
        if (!(this.f13649k == null || this.f13648j != null || this.f13649k.getVisibility() == 8)) {
            i4 += m3434a(this.f13649k, i4, paddingTop, i2, z);
        }
        int i6 = i4;
        if (this.f13648j != 0) {
            m3434a(this.f13648j, i6, paddingTop, i2, z);
        }
        int paddingLeft = z ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != 0) {
            m3434a(this.c, paddingLeft, paddingTop, i2, z ^ 1);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f13645g);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f13654p) {
            requestLayout();
        }
        this.f13654p = z;
    }

    /* renamed from: d */
    public boolean m16252d() {
        return this.f13654p;
    }
}
