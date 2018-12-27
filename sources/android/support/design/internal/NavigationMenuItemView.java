package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0136e;
import android.support.design.C0143a.C0137f;
import android.support.design.C0143a.C0139h;
import android.support.v4.content.p014a.C0387b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0536a;
import android.support.v4.view.C0560r;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.widget.C0619o;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.view.menu.C0730p.C0729a;
import android.support.v7.view.menu.C3227j;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.ba;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C0729a {
    /* renamed from: d */
    private static final int[] f18324d = new int[]{16842912};
    /* renamed from: c */
    boolean f18325c;
    /* renamed from: e */
    private final int f18326e;
    /* renamed from: f */
    private boolean f18327f;
    /* renamed from: g */
    private final CheckedTextView f18328g;
    /* renamed from: h */
    private FrameLayout f18329h;
    /* renamed from: i */
    private C3227j f18330i;
    /* renamed from: j */
    private ColorStateList f18331j;
    /* renamed from: k */
    private boolean f18332k;
    /* renamed from: l */
    private Drawable f18333l;
    /* renamed from: m */
    private final C0536a f18334m;

    /* renamed from: android.support.design.internal.NavigationMenuItemView$1 */
    class C30351 extends C0536a {
        /* renamed from: a */
        final /* synthetic */ NavigationMenuItemView f12818a;

        C30351(NavigationMenuItemView navigationMenuItemView) {
            this.f12818a = navigationMenuItemView;
        }

        /* renamed from: a */
        public void mo87a(View view, C0532b c0532b) {
            super.mo87a(view, c0532b);
            c0532b.m1959a(this.f12818a.f18325c);
        }
    }

    /* renamed from: a */
    public boolean mo72a() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18334m = new C30351(this);
        setOrientation(null);
        LayoutInflater.from(context).inflate(C0139h.design_navigation_menu_item, this, true);
        this.f18326e = context.getResources().getDimensionPixelSize(C0135d.design_navigation_icon_size);
        this.f18328g = (CheckedTextView) findViewById(C0137f.design_menu_item_text);
        this.f18328g.setDuplicateParentStateEnabled(true);
        C0560r.m2175a(this.f18328g, this.f18334m);
    }

    /* renamed from: a */
    public void mo71a(C3227j c3227j, int i) {
        this.f18330i = c3227j;
        setVisibility(c3227j.isVisible() != 0 ? 0 : 8);
        if (getBackground() == 0) {
            C0560r.m2174a((View) this, m24088e());
        }
        setCheckable(c3227j.isCheckable());
        setChecked(c3227j.isChecked());
        setEnabled(c3227j.isEnabled());
        setTitle(c3227j.getTitle());
        setIcon(c3227j.getIcon());
        setActionView(c3227j.getActionView());
        setContentDescription(c3227j.getContentDescription());
        ba.m3562a(this, c3227j.getTooltipText());
        m24087d();
    }

    /* renamed from: c */
    private boolean m24086c() {
        return this.f18330i.getTitle() == null && this.f18330i.getIcon() == null && this.f18330i.getActionView() != null;
    }

    /* renamed from: d */
    private void m24087d() {
        if (m24086c()) {
            this.f18328g.setVisibility(8);
            if (this.f18329h != null) {
                LayoutParams layoutParams = (LayoutParams) this.f18329h.getLayoutParams();
                layoutParams.width = -1;
                this.f18329h.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f18328g.setVisibility(0);
        if (this.f18329h != null) {
            layoutParams = (LayoutParams) this.f18329h.getLayoutParams();
            layoutParams.width = -2;
            this.f18329h.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: b */
    public void m24091b() {
        if (this.f18329h != null) {
            this.f18329h.removeAllViews();
        }
        this.f18328g.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f18329h == null) {
                this.f18329h = (FrameLayout) ((ViewStub) findViewById(C0137f.design_menu_item_action_area_stub)).inflate();
            }
            this.f18329h.removeAllViews();
            this.f18329h.addView(view);
        }
    }

    /* renamed from: e */
    private StateListDrawable m24088e() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0627a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f18324d, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public C3227j getItemData() {
        return this.f18330i;
    }

    public void setTitle(CharSequence charSequence) {
        this.f18328g.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f18325c != z) {
            this.f18325c = z;
            this.f18334m.m2014a(this.f18328g, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f18328g.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f18332k) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0295a.m1061g(drawable).mutate();
                C0295a.m1050a(drawable, this.f18331j);
            }
            drawable.setBounds(0, 0, this.f18326e, this.f18326e);
        } else if (this.f18327f) {
            if (this.f18333l == null) {
                this.f18333l = C0387b.m1419a(getResources(), C0136e.navigation_empty_icon, getContext().getTheme());
                if (this.f18333l != null) {
                    this.f18333l.setBounds(0, 0, this.f18326e, this.f18326e);
                }
            }
            drawable = this.f18333l;
        }
        C0619o.m2475a(this.f18328g, drawable, null, null, null);
    }

    protected int[] onCreateDrawableState(int i) {
        i = super.onCreateDrawableState(i + 1);
        if (this.f18330i != null && this.f18330i.isCheckable() && this.f18330i.isChecked()) {
            mergeDrawableStates(i, f18324d);
        }
        return i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f18331j = colorStateList;
        this.f18332k = this.f18331j != null ? true : null;
        if (this.f18330i != null) {
            setIcon(this.f18330i.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        C0619o.m2474a(this.f18328g, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f18328g.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f18327f = z;
    }
}
