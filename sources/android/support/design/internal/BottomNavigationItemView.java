package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0136e;
import android.support.design.C0143a.C0137f;
import android.support.design.C0143a.C0139h;
import android.support.v4.content.C0389b;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0556p;
import android.support.v4.view.C0560r;
import android.support.v7.view.menu.C0730p.C0729a;
import android.support.v7.view.menu.C3227j;
import android.support.v7.widget.ba;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

public class BottomNavigationItemView extends FrameLayout implements C0729a {
    /* renamed from: a */
    private static final int[] f12779a = new int[]{16842912};
    /* renamed from: b */
    private final int f12780b;
    /* renamed from: c */
    private final int f12781c;
    /* renamed from: d */
    private final float f12782d;
    /* renamed from: e */
    private final float f12783e;
    /* renamed from: f */
    private boolean f12784f;
    /* renamed from: g */
    private ImageView f12785g;
    /* renamed from: h */
    private final TextView f12786h;
    /* renamed from: i */
    private final TextView f12787i;
    /* renamed from: j */
    private int f12788j;
    /* renamed from: k */
    private C3227j f12789k;
    /* renamed from: l */
    private ColorStateList f12790l;

    /* renamed from: a */
    public boolean mo72a() {
        return false;
    }

    public void setShortcut(boolean z, char c) {
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12788j = -1;
        attributeSet = getResources();
        i = attributeSet.getDimensionPixelSize(C0135d.design_bottom_navigation_text_size);
        int dimensionPixelSize = attributeSet.getDimensionPixelSize(C0135d.design_bottom_navigation_active_text_size);
        this.f12780b = attributeSet.getDimensionPixelSize(C0135d.design_bottom_navigation_margin);
        this.f12781c = i - dimensionPixelSize;
        attributeSet = (float) dimensionPixelSize;
        i = (float) i;
        this.f12782d = (attributeSet * 1.0f) / i;
        this.f12783e = (i * 1065353216) / attributeSet;
        LayoutInflater.from(context).inflate(C0139h.design_bottom_navigation_item, this, 1);
        setBackgroundResource(C0136e.design_bottom_navigation_item_background);
        this.f12785g = (ImageView) findViewById(C0137f.icon);
        this.f12786h = (TextView) findViewById(C0137f.smallLabel);
        this.f12787i = (TextView) findViewById(C0137f.largeLabel);
    }

    /* renamed from: a */
    public void mo71a(C3227j c3227j, int i) {
        this.f12789k = c3227j;
        setCheckable(c3227j.isCheckable());
        setChecked(c3227j.isChecked());
        setEnabled(c3227j.isEnabled());
        setIcon(c3227j.getIcon());
        setTitle(c3227j.getTitle());
        setId(c3227j.getItemId());
        setContentDescription(c3227j.getContentDescription());
        ba.m3562a(this, c3227j.getTooltipText());
    }

    public void setItemPosition(int i) {
        this.f12788j = i;
    }

    public int getItemPosition() {
        return this.f12788j;
    }

    public void setShiftingMode(boolean z) {
        this.f12784f = z;
    }

    public C3227j getItemData() {
        return this.f12789k;
    }

    public void setTitle(CharSequence charSequence) {
        this.f12786h.setText(charSequence);
        this.f12787i.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.f12787i.setPivotX((float) (this.f12787i.getWidth() / 2));
        this.f12787i.setPivotY((float) this.f12787i.getBaseline());
        this.f12786h.setPivotX((float) (this.f12786h.getWidth() / 2));
        this.f12786h.setPivotY((float) this.f12786h.getBaseline());
        LayoutParams layoutParams;
        if (this.f12784f) {
            if (z) {
                layoutParams = (LayoutParams) this.f12785g.getLayoutParams();
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.f12780b;
                this.f12785g.setLayoutParams(layoutParams);
                this.f12787i.setVisibility(0);
                this.f12787i.setScaleX(1.0f);
                this.f12787i.setScaleY(1.0f);
            } else {
                layoutParams = (LayoutParams) this.f12785g.getLayoutParams();
                layoutParams.gravity = 17;
                layoutParams.topMargin = this.f12780b;
                this.f12785g.setLayoutParams(layoutParams);
                this.f12787i.setVisibility(4);
                this.f12787i.setScaleX(0.5f);
                this.f12787i.setScaleY(0.5f);
            }
            this.f12786h.setVisibility(4);
        } else if (z) {
            layoutParams = (LayoutParams) this.f12785g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f12780b + this.f12781c;
            this.f12785g.setLayoutParams(layoutParams);
            this.f12787i.setVisibility(0);
            this.f12786h.setVisibility(4);
            this.f12787i.setScaleX(1.0f);
            this.f12787i.setScaleY(1.0f);
            this.f12786h.setScaleX(this.f12782d);
            this.f12786h.setScaleY(this.f12782d);
        } else {
            layoutParams = (LayoutParams) this.f12785g.getLayoutParams();
            layoutParams.gravity = 49;
            layoutParams.topMargin = this.f12780b;
            this.f12785g.setLayoutParams(layoutParams);
            this.f12787i.setVisibility(4);
            this.f12786h.setVisibility(0);
            this.f12787i.setScaleX(this.f12783e);
            this.f12787i.setScaleY(this.f12783e);
            this.f12786h.setScaleX(1.0f);
            this.f12786h.setScaleY(1.0f);
        }
        refreshDrawableState();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f12786h.setEnabled(z);
        this.f12787i.setEnabled(z);
        this.f12785g.setEnabled(z);
        if (z) {
            C0560r.m2177a((View) this, C0556p.m2106a(getContext(), 1002));
        } else {
            C0560r.m2177a((View) this, (C0556p) false);
        }
    }

    public int[] onCreateDrawableState(int i) {
        i = super.onCreateDrawableState(i + 1);
        if (this.f12789k != null && this.f12789k.isCheckable() && this.f12789k.isChecked()) {
            mergeDrawableStates(i, f12779a);
        }
        return i;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0295a.m1061g(drawable).mutate();
            C0295a.m1050a(drawable, this.f12790l);
        }
        this.f12785g.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f12790l = colorStateList;
        if (this.f12789k != null) {
            setIcon(this.f12789k.getIcon());
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f12786h.setTextColor(colorStateList);
        this.f12787i.setTextColor(colorStateList);
    }

    public void setItemBackground(int i) {
        C0560r.m2174a((View) this, i == 0 ? 0 : C0389b.m1429a(getContext(), i));
    }
}
