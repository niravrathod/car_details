package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.support.design.C0143a.C0135d;
import android.support.transition.AutoTransition;
import android.support.transition.TransitionSet;
import android.support.transition.ae;
import android.support.v4.p017f.C0431k.C0430a;
import android.support.v4.p017f.C0431k.C4435c;
import android.support.v4.view.C0560r;
import android.support.v4.view.p019b.C3163b;
import android.support.v7.view.menu.C0730p;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3227j;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class BottomNavigationMenuView extends ViewGroup implements C0730p {
    /* renamed from: a */
    private final TransitionSet f12791a;
    /* renamed from: b */
    private final int f12792b;
    /* renamed from: c */
    private final int f12793c;
    /* renamed from: d */
    private final int f12794d;
    /* renamed from: e */
    private final int f12795e;
    /* renamed from: f */
    private final OnClickListener f12796f;
    /* renamed from: g */
    private final C0430a<BottomNavigationItemView> f12797g;
    /* renamed from: h */
    private boolean f12798h;
    /* renamed from: i */
    private BottomNavigationItemView[] f12799i;
    /* renamed from: j */
    private int f12800j;
    /* renamed from: k */
    private int f12801k;
    /* renamed from: l */
    private ColorStateList f12802l;
    /* renamed from: m */
    private ColorStateList f12803m;
    /* renamed from: n */
    private int f12804n;
    /* renamed from: o */
    private int[] f12805o;
    /* renamed from: p */
    private BottomNavigationPresenter f12806p;
    /* renamed from: q */
    private C3224h f12807q;

    /* renamed from: android.support.design.internal.BottomNavigationMenuView$1 */
    class C01441 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ BottomNavigationMenuView f536a;

        C01441(BottomNavigationMenuView bottomNavigationMenuView) {
            this.f536a = bottomNavigationMenuView;
        }

        public void onClick(View view) {
            MenuItem itemData = ((BottomNavigationItemView) view).getItemData();
            if (!this.f536a.f12807q.m16156a(itemData, this.f536a.f12806p, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public int getWindowAnimations() {
        return 0;
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12797g = new C4435c(5);
        this.f12798h = true;
        this.f12800j = 0;
        this.f12801k = 0;
        Resources resources = getResources();
        this.f12792b = resources.getDimensionPixelSize(C0135d.design_bottom_navigation_item_max_width);
        this.f12793c = resources.getDimensionPixelSize(C0135d.design_bottom_navigation_item_min_width);
        this.f12794d = resources.getDimensionPixelSize(C0135d.design_bottom_navigation_active_item_max_width);
        this.f12795e = resources.getDimensionPixelSize(C0135d.design_bottom_navigation_height);
        this.f12791a = new AutoTransition();
        this.f12791a.mo200a(0);
        this.f12791a.m15196c(115);
        this.f12791a.m15192b(new C3163b());
        this.f12791a.m15193b(new C3043e());
        this.f12796f = new C01441(this);
        this.f12805o = new int[5];
    }

    /* renamed from: a */
    public void mo74a(C3224h c3224h) {
        this.f12807q = c3224h;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        i = MeasureSpec.getSize(i);
        i2 = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f12795e, 1073741824);
        int min;
        if (this.f12798h) {
            i3 = i2 - 1;
            min = Math.min(i - (this.f12793c * i3), this.f12794d);
            i -= min;
            int min2 = Math.min(i / i3, this.f12792b);
            i3 = i - (i3 * min2);
            i = 0;
            while (i < i2) {
                this.f12805o[i] = i == this.f12801k ? min : min2;
                if (i3 > 0) {
                    int[] iArr = this.f12805o;
                    iArr[i] = iArr[i] + 1;
                    i3--;
                }
                i++;
            }
        } else {
            i3 = Math.min(i / (i2 == 0 ? 1 : i2), this.f12794d);
            min = i - (i3 * i2);
            for (i = 0; i < i2; i++) {
                this.f12805o[i] = i3;
                if (min > 0) {
                    int[] iArr2 = this.f12805o;
                    iArr2[i] = iArr2[i] + 1;
                    min--;
                }
            }
        }
        i3 = 0;
        for (i = 0; i < i2; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f12805o[i], 1073741824), makeMeasureSpec);
                childAt.getLayoutParams().width = childAt.getMeasuredWidth();
                i3 += childAt.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, MeasureSpec.makeMeasureSpec(i3, 1073741824), 0), View.resolveSizeAndState(this.f12795e, makeMeasureSpec, 0));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        z = getChildCount();
        i3 -= i;
        i4 -= i2;
        int i5 = 0;
        for (boolean z2 = false; z2 < z; z2++) {
            View childAt = getChildAt(z2);
            if (childAt.getVisibility() != 8) {
                if (C0560r.m2193e(this) == 1) {
                    int i6 = i3 - i5;
                    childAt.layout(i6 - childAt.getMeasuredWidth(), 0, i6, i4);
                } else {
                    childAt.layout(i5, 0, childAt.getMeasuredWidth() + i5, i4);
                }
                i5 += childAt.getMeasuredWidth();
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f12802l = colorStateList;
        if (this.f12799i != null) {
            for (BottomNavigationItemView iconTintList : this.f12799i) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public ColorStateList getIconTintList() {
        return this.f12802l;
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12803m = colorStateList;
        if (this.f12799i != null) {
            for (BottomNavigationItemView textColor : this.f12799i) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public ColorStateList getItemTextColor() {
        return this.f12803m;
    }

    public void setItemBackgroundRes(int i) {
        this.f12804n = i;
        if (this.f12799i != null) {
            for (BottomNavigationItemView itemBackground : this.f12799i) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public int getItemBackgroundRes() {
        return this.f12804n;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f12806p = bottomNavigationPresenter;
    }

    /* renamed from: a */
    public void m14850a() {
        removeAllViews();
        if (this.f12799i != null) {
            for (Object a : this.f12799i) {
                this.f12797g.mo339a(a);
            }
        }
        if (this.f12807q.size() == 0) {
            this.f12800j = 0;
            this.f12801k = 0;
            this.f12799i = null;
            return;
        }
        this.f12799i = new BottomNavigationItemView[this.f12807q.size()];
        this.f12798h = this.f12807q.size() > 3;
        for (int i = 0; i < this.f12807q.size(); i++) {
            this.f12806p.m14865b(true);
            this.f12807q.getItem(i).setCheckable(true);
            this.f12806p.m14865b(false);
            View newItem = getNewItem();
            this.f12799i[i] = newItem;
            newItem.setIconTintList(this.f12802l);
            newItem.setTextColor(this.f12803m);
            newItem.setItemBackground(this.f12804n);
            newItem.setShiftingMode(this.f12798h);
            newItem.mo71a((C3227j) this.f12807q.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f12796f);
            addView(newItem);
        }
        this.f12801k = Math.min(this.f12807q.size() - 1, this.f12801k);
        this.f12807q.getItem(this.f12801k).setChecked(true);
    }

    /* renamed from: b */
    public void m14853b() {
        int size = this.f12807q.size();
        if (size != this.f12799i.length) {
            m14850a();
            return;
        }
        int i = this.f12800j;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f12807q.getItem(i2);
            if (item.isChecked()) {
                this.f12800j = item.getItemId();
                this.f12801k = i2;
            }
        }
        if (i != this.f12800j) {
            ae.m973a(this, this.f12791a);
        }
        for (i = 0; i < size; i++) {
            this.f12806p.m14865b(true);
            this.f12799i[i].mo71a((C3227j) this.f12807q.getItem(i), 0);
            this.f12806p.m14865b(false);
        }
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) this.f12797g.mo338a();
        return bottomNavigationItemView == null ? new BottomNavigationItemView(getContext()) : bottomNavigationItemView;
    }

    public int getSelectedItemId() {
        return this.f12800j;
    }

    /* renamed from: a */
    void m14851a(int i) {
        int size = this.f12807q.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f12807q.getItem(i2);
            if (i == item.getItemId()) {
                this.f12800j = i;
                this.f12801k = i2;
                item.setChecked(1);
                return;
            }
        }
    }
}
