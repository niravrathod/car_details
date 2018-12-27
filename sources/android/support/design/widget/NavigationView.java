package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.C0143a.C0141j;
import android.support.design.C0143a.C0142k;
import android.support.design.internal.C3042c;
import android.support.design.internal.C4408b;
import android.support.design.internal.ScrimInsetsFrameLayout;
import android.support.v4.content.C0389b;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.C0712g;
import android.support.v7.view.menu.C0728o;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.view.menu.C3227j;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class NavigationView extends ScrimInsetsFrameLayout {
    /* renamed from: d */
    private static final int[] f12903d = new int[]{16842912};
    /* renamed from: e */
    private static final int[] f12904e = new int[]{-16842910};
    /* renamed from: c */
    C0171a f12905c;
    /* renamed from: f */
    private final C4408b f12906f;
    /* renamed from: g */
    private final C3042c f12907g;
    /* renamed from: h */
    private int f12908h;
    /* renamed from: i */
    private MenuInflater f12909i;

    /* renamed from: android.support.design.widget.NavigationView$a */
    public interface C0171a {
        /* renamed from: a */
        boolean m597a(MenuItem menuItem);
    }

    /* renamed from: android.support.design.widget.NavigationView$1 */
    class C30531 implements C0723a {
        /* renamed from: a */
        final /* synthetic */ NavigationView f12901a;

        /* renamed from: a */
        public void mo101a(C3224h c3224h) {
        }

        C30531(NavigationView navigationView) {
            this.f12901a = navigationView;
        }

        /* renamed from: a */
        public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
            return (this.f12901a.f12905c == null || this.f12901a.f12905c.m597a(menuItem) == null) ? null : true;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C01701();
        /* renamed from: a */
        public Bundle f12902a;

        /* renamed from: android.support.design.widget.NavigationView$SavedState$1 */
        static class C01701 implements ClassLoaderCreator<SavedState> {
            C01701() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m594a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m595a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m596a(i);
            }

            /* renamed from: a */
            public SavedState m595a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m594a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m596a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f12902a = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f12902a);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList e;
        int g;
        Object obj;
        super(context, attributeSet, i);
        this.f12907g = new C3042c();
        C0219m.m807a(context);
        this.f12906f = new C4408b(context);
        attributeSet = ay.m3543a(context, attributeSet, C0142k.NavigationView, i, C0141j.Widget_Design_NavigationView);
        C0560r.m2174a((View) this, attributeSet.m3547a(C0142k.NavigationView_android_background));
        if (attributeSet.m3561g(C0142k.NavigationView_elevation) != 0) {
            C0560r.m2166a((View) this, (float) attributeSet.m3556e(C0142k.NavigationView_elevation, 0));
        }
        C0560r.m2187b((View) this, attributeSet.m3549a(C0142k.NavigationView_android_fitsSystemWindows, false));
        this.f12908h = attributeSet.m3556e(C0142k.NavigationView_android_maxWidth, 0);
        if (attributeSet.m3561g(C0142k.NavigationView_itemIconTint) != 0) {
            e = attributeSet.m3557e(C0142k.NavigationView_itemIconTint);
        } else {
            e = m14985c(16842808);
        }
        if (attributeSet.m3561g(C0142k.NavigationView_itemTextAppearance)) {
            g = attributeSet.m3560g(C0142k.NavigationView_itemTextAppearance, 0);
            obj = 1;
        } else {
            obj = null;
            g = 0;
        }
        ColorStateList colorStateList = null;
        if (attributeSet.m3561g(C0142k.NavigationView_itemTextColor)) {
            colorStateList = attributeSet.m3557e(C0142k.NavigationView_itemTextColor);
        }
        if (obj == null && r4 == null) {
            colorStateList = m14985c(16842806);
        }
        Drawable a = attributeSet.m3547a(C0142k.NavigationView_itemBackground);
        this.f12906f.mo3835a(new C30531(this));
        this.f12907g.m14894a(1);
        this.f12907g.mo75a(context, this.f12906f);
        this.f12907g.m14896a(e);
        if (obj != null) {
            this.f12907g.m14914c(g);
        }
        this.f12907g.m14910b(colorStateList);
        this.f12907g.m14897a(a);
        this.f12906f.m16149a((C0728o) this.f12907g);
        addView((View) this.f12907g.m14893a((ViewGroup) this));
        if (attributeSet.m3561g(C0142k.NavigationView_menu) != null) {
            m14986a(attributeSet.m3560g(C0142k.NavigationView_menu, 0));
        }
        if (attributeSet.m3561g(C0142k.NavigationView_headerLayout) != null) {
            m14988b(attributeSet.m3560g(C0142k.NavigationView_headerLayout, 0));
        }
        attributeSet.m3548a();
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12902a = new Bundle();
        this.f12906f.m16146a(savedState.f12902a);
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            this.f12906f.m16158b((Bundle) savedState.f12902a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void setNavigationItemSelectedListener(C0171a c0171a) {
        this.f12905c = c0171a;
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.f12908h), 1073741824);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.f12908h, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    protected void mo131a(C0571z c0571z) {
        this.f12907g.m14899a(c0571z);
    }

    /* renamed from: a */
    public void m14986a(int i) {
        this.f12907g.m14911b(true);
        getMenuInflater().inflate(i, this.f12906f);
        this.f12907g.m14911b(false);
        this.f12907g.mo79a(false);
    }

    public Menu getMenu() {
        return this.f12906f;
    }

    /* renamed from: b */
    public View m14988b(int i) {
        return this.f12907g.m14909b(i);
    }

    public int getHeaderCount() {
        return this.f12907g.m14915d();
    }

    public ColorStateList getItemIconTintList() {
        return this.f12907g.m14916e();
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f12907g.m14896a(colorStateList);
    }

    public ColorStateList getItemTextColor() {
        return this.f12907g.m14917f();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f12907g.m14910b(colorStateList);
    }

    public Drawable getItemBackground() {
        return this.f12907g.m14918g();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C0389b.m1429a(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        this.f12907g.m14897a(drawable);
    }

    public void setCheckedItem(int i) {
        i = this.f12906f.findItem(i);
        if (i != 0) {
            this.f12907g.m14901a((C3227j) i);
        }
    }

    public void setItemTextAppearance(int i) {
        this.f12907g.m14914c(i);
    }

    private MenuInflater getMenuInflater() {
        if (this.f12909i == null) {
            this.f12909i = new C0712g(getContext());
        }
        return this.f12909i;
    }

    /* renamed from: c */
    private ColorStateList m14985c(int i) {
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
        return new ColorStateList(new int[][]{f12904e, f12903d, EMPTY_STATE_SET}, new int[]{i.getColorForState(f12904e, defaultColor), i2, defaultColor});
    }
}
