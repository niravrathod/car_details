package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0143a.C0134c;
import android.support.design.C0143a.C0135d;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.internal.BottomNavigationPresenter;
import android.support.design.internal.C4407a;
import android.support.v4.content.C0389b;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.C0712g;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class BottomNavigationView extends FrameLayout {
    /* renamed from: a */
    private static final int[] f559a = new int[]{16842912};
    /* renamed from: b */
    private static final int[] f560b = new int[]{-16842910};
    /* renamed from: c */
    private final C3224h f561c;
    /* renamed from: d */
    private final BottomNavigationMenuView f562d;
    /* renamed from: e */
    private final BottomNavigationPresenter f563e;
    /* renamed from: f */
    private MenuInflater f564f;
    /* renamed from: g */
    private C0156b f565g;
    /* renamed from: h */
    private C0155a f566h;

    /* renamed from: android.support.design.widget.BottomNavigationView$a */
    public interface C0155a {
        /* renamed from: a */
        void m512a(MenuItem menuItem);
    }

    /* renamed from: android.support.design.widget.BottomNavigationView$b */
    public interface C0156b {
        /* renamed from: a */
        boolean m513a(MenuItem menuItem);
    }

    /* renamed from: android.support.design.widget.BottomNavigationView$1 */
    class C30451 implements C0723a {
        /* renamed from: a */
        final /* synthetic */ BottomNavigationView f12851a;

        /* renamed from: a */
        public void mo101a(C3224h c3224h) {
        }

        C30451(BottomNavigationView bottomNavigationView) {
            this.f12851a = bottomNavigationView;
        }

        /* renamed from: a */
        public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
            boolean z = true;
            if (this.f12851a.f566h == null || menuItem.getItemId() != this.f12851a.getSelectedItemId()) {
                if (this.f12851a.f565g == null || this.f12851a.f565g.m513a(menuItem) != null) {
                    z = false;
                }
                return z;
            }
            this.f12851a.f566h.m512a(menuItem);
            return true;
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01541();
        /* renamed from: a */
        Bundle f12852a;

        /* renamed from: android.support.design.widget.BottomNavigationView$SavedState$1 */
        static class C01541 implements ClassLoaderCreator<SavedState> {
            C01541() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m509a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m510a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m511a(i);
            }

            /* renamed from: a */
            public SavedState m510a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m509a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m511a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m14926a(parcel, classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f12852a);
        }

        /* renamed from: a */
        private void m14926a(Parcel parcel, ClassLoader classLoader) {
            this.f12852a = parcel.readBundle(classLoader);
        }
    }

    public int getMaxItemCount() {
        return 5;
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f563e = new BottomNavigationPresenter();
        C0219m.m807a(context);
        this.f561c = new C4407a(context);
        this.f562d = new BottomNavigationMenuView(context);
        LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f562d.setLayoutParams(layoutParams);
        this.f563e.m14857a(this.f562d);
        this.f563e.m14854a(1);
        this.f562d.setPresenter(this.f563e);
        this.f561c.m16149a(this.f563e);
        this.f563e.mo75a(getContext(), this.f561c);
        attributeSet = ay.m3543a(context, attributeSet, C0142k.BottomNavigationView, i, C0141j.Widget_Design_BottomNavigationView);
        if (attributeSet.m3561g(C0142k.BottomNavigationView_itemIconTint) != 0) {
            this.f562d.setIconTintList(attributeSet.m3557e(C0142k.BottomNavigationView_itemIconTint));
        } else {
            this.f562d.setIconTintList(m516b(16842808));
        }
        if (attributeSet.m3561g(C0142k.BottomNavigationView_itemTextColor) != 0) {
            this.f562d.setItemTextColor(attributeSet.m3557e(C0142k.BottomNavigationView_itemTextColor));
        } else {
            this.f562d.setItemTextColor(m516b(16842808));
        }
        if (attributeSet.m3561g(C0142k.BottomNavigationView_elevation) != 0) {
            C0560r.m2166a((View) this, (float) attributeSet.m3556e(C0142k.BottomNavigationView_elevation, 0));
        }
        this.f562d.setItemBackgroundRes(attributeSet.m3560g(C0142k.BottomNavigationView_itemBackground, 0));
        if (attributeSet.m3561g(C0142k.BottomNavigationView_menu) != 0) {
            m518a(attributeSet.m3560g(C0142k.BottomNavigationView_menu, 0));
        }
        attributeSet.m3548a();
        addView(this.f562d, layoutParams);
        if (VERSION.SDK_INT < 21) {
            m515a(context);
        }
        this.f561c.mo3835a(new C30451(this));
    }

    public void setOnNavigationItemSelectedListener(C0156b c0156b) {
        this.f565g = c0156b;
    }

    public void setOnNavigationItemReselectedListener(C0155a c0155a) {
        this.f566h = c0155a;
    }

    public Menu getMenu() {
        return this.f561c;
    }

    /* renamed from: a */
    public void m518a(int i) {
        this.f563e.m14865b(true);
        getMenuInflater().inflate(i, this.f561c);
        this.f563e.m14865b(false);
        this.f563e.mo79a(true);
    }

    public ColorStateList getItemIconTintList() {
        return this.f562d.getIconTintList();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f562d.setIconTintList(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.f562d.getItemTextColor();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f562d.setItemTextColor(colorStateList);
    }

    public int getItemBackgroundResource() {
        return this.f562d.getItemBackgroundRes();
    }

    public void setItemBackgroundResource(int i) {
        this.f562d.setItemBackgroundRes(i);
    }

    public int getSelectedItemId() {
        return this.f562d.getSelectedItemId();
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f561c.findItem(i);
        if (findItem != null && !this.f561c.m16156a(findItem, this.f563e, 0)) {
            findItem.setChecked(true);
        }
    }

    /* renamed from: a */
    private void m515a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0389b.m1438c(context, C0134c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0135d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private MenuInflater getMenuInflater() {
        if (this.f564f == null) {
            this.f564f = new C0712g(getContext());
        }
        return this.f564f;
    }

    /* renamed from: b */
    private ColorStateList m516b(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true) == 0) {
            return null;
        }
        i = C0680b.m2700a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0627a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = i.getDefaultColor();
        return new ColorStateList(new int[][]{f560b, f559a, EMPTY_STATE_SET}, new int[]{i.getColorForState(f560b, defaultColor), i2, defaultColor});
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12852a = new Bundle();
        this.f561c.m16146a(savedState.f12852a);
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            this.f561c.m16158b(savedState.f12852a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
