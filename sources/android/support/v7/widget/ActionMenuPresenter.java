package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.view.C0542b;
import android.support.v4.view.C0542b.C0537a;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.view.C0704a;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.C0715b;
import android.support.v7.view.menu.C0726n;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C0730p;
import android.support.v7.view.menu.C0730p.C0729a;
import android.support.v7.view.menu.C0732s;
import android.support.v7.view.menu.C3220b;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3227j;
import android.support.v7.view.menu.C4465u;
import android.support.v7.widget.ActionMenuView.C0742a;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class ActionMenuPresenter extends C3220b implements C0537a {
    /* renamed from: A */
    private C3234b f18556A;
    /* renamed from: g */
    C4466d f18557g;
    /* renamed from: h */
    C3236e f18558h;
    /* renamed from: i */
    C3233a f18559i;
    /* renamed from: j */
    C0741c f18560j;
    /* renamed from: k */
    final C3237f f18561k = new C3237f(this);
    /* renamed from: l */
    int f18562l;
    /* renamed from: m */
    private Drawable f18563m;
    /* renamed from: n */
    private boolean f18564n;
    /* renamed from: o */
    private boolean f18565o;
    /* renamed from: p */
    private boolean f18566p;
    /* renamed from: q */
    private int f18567q;
    /* renamed from: r */
    private int f18568r;
    /* renamed from: s */
    private int f18569s;
    /* renamed from: t */
    private boolean f18570t;
    /* renamed from: u */
    private boolean f18571u;
    /* renamed from: v */
    private boolean f18572v;
    /* renamed from: w */
    private boolean f18573w;
    /* renamed from: x */
    private int f18574x;
    /* renamed from: y */
    private final SparseBooleanArray f18575y = new SparseBooleanArray();
    /* renamed from: z */
    private View f18576z;

    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C07401();
        /* renamed from: a */
        public int f2350a;

        /* renamed from: android.support.v7.widget.ActionMenuPresenter$SavedState$1 */
        static class C07401 implements Creator<SavedState> {
            C07401() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m2865a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m2866a(i);
            }

            /* renamed from: a */
            public SavedState m2865a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m2866a(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.f2350a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2350a);
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$c */
    private class C0741c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ActionMenuPresenter f2351a;
        /* renamed from: b */
        private C3236e f2352b;

        public C0741c(ActionMenuPresenter actionMenuPresenter, C3236e c3236e) {
            this.f2351a = actionMenuPresenter;
            this.f2352b = c3236e;
        }

        public void run() {
            if (this.f2351a.c != null) {
                this.f2351a.c.m16174f();
            }
            View view = (View) this.f2351a.f;
            if (!(view == null || view.getWindowToken() == null || !this.f2352b.m2830c())) {
                this.f2351a.f18558h = this.f2352b;
            }
            this.f2351a.f18560j = null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$a */
    private class C3233a extends C0726n {
        /* renamed from: a */
        final /* synthetic */ ActionMenuPresenter f13685a;

        public C3233a(ActionMenuPresenter actionMenuPresenter, Context context, C4465u c4465u, View view) {
            this.f13685a = actionMenuPresenter;
            super(context, c4465u, view, false, C0627a.actionOverflowMenuStyle);
            if (((C3227j) c4465u.getItem()).m16216j() == null) {
                m2825a((View) actionMenuPresenter.f18557g == null ? (View) actionMenuPresenter.f : actionMenuPresenter.f18557g);
            }
            m2824a((C0727a) actionMenuPresenter.f18561k);
        }

        /* renamed from: e */
        protected void mo635e() {
            this.f13685a.f18559i = null;
            this.f13685a.f18562l = 0;
            super.mo635e();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$b */
    private class C3234b extends C0715b {
        /* renamed from: a */
        final /* synthetic */ ActionMenuPresenter f13686a;

        C3234b(ActionMenuPresenter actionMenuPresenter) {
            this.f13686a = actionMenuPresenter;
        }

        /* renamed from: a */
        public C0732s mo636a() {
            return this.f13686a.f18559i != null ? this.f13686a.f18559i.m2829b() : null;
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$e */
    private class C3236e extends C0726n {
        /* renamed from: a */
        final /* synthetic */ ActionMenuPresenter f13689a;

        public C3236e(ActionMenuPresenter actionMenuPresenter, Context context, C3224h c3224h, View view, boolean z) {
            this.f13689a = actionMenuPresenter;
            super(context, c3224h, view, z, C0627a.actionOverflowMenuStyle);
            m2823a(8388613);
            m2824a((C0727a) actionMenuPresenter.f18561k);
        }

        /* renamed from: e */
        protected void mo635e() {
            if (this.f13689a.c != null) {
                this.f13689a.c.close();
            }
            this.f13689a.f18558h = null;
            super.mo635e();
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$f */
    private class C3237f implements C0727a {
        /* renamed from: a */
        final /* synthetic */ ActionMenuPresenter f13690a;

        C3237f(ActionMenuPresenter actionMenuPresenter) {
            this.f13690a = actionMenuPresenter;
        }

        /* renamed from: a */
        public boolean mo491a(C3224h c3224h) {
            boolean z = false;
            if (c3224h == null) {
                return false;
            }
            this.f13690a.f18562l = ((C4465u) c3224h).getItem().getItemId();
            C0727a d = this.f13690a.m16105d();
            if (d != null) {
                z = d.mo491a(c3224h);
            }
            return z;
        }

        /* renamed from: a */
        public void mo490a(C3224h c3224h, boolean z) {
            if (c3224h instanceof C4465u) {
                c3224h.mo3841p().m16161b(false);
            }
            C0727a d = this.f13690a.m16105d();
            if (d != null) {
                d.mo490a(c3224h, z);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ActionMenuPresenter$d */
    private class C4466d extends AppCompatImageView implements C0742a {
        /* renamed from: a */
        final /* synthetic */ ActionMenuPresenter f18554a;
        /* renamed from: b */
        private final float[] f18555b = new float[2];

        /* renamed from: c */
        public boolean mo3819c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo3820d() {
            return false;
        }

        public C4466d(final ActionMenuPresenter actionMenuPresenter, Context context) {
            this.f18554a = actionMenuPresenter;
            super(context, null, C0627a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            ba.m3562a(this, getContentDescription());
            setOnTouchListener(new ac(this, this) {
                /* renamed from: b */
                final /* synthetic */ C4466d f13688b;

                /* renamed from: a */
                public C0732s mo581a() {
                    if (this.f13688b.f18554a.f18558h == null) {
                        return null;
                    }
                    return this.f13688b.f18554a.f18558h.m2829b();
                }

                /* renamed from: b */
                public boolean mo582b() {
                    this.f13688b.f18554a.m24523f();
                    return true;
                }

                /* renamed from: c */
                public boolean mo637c() {
                    if (this.f13688b.f18554a.f18560j != null) {
                        return false;
                    }
                    this.f13688b.f18554a.m24524g();
                    return true;
                }
            });
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            this.f18554a.m24523f();
            return true;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            i = super.setFrame(i, i2, i3, i4);
            i2 = getDrawable();
            Drawable background = getBackground();
            if (!(i2 == 0 || background == 0)) {
                i2 = getWidth();
                i4 = getHeight();
                int max = Math.max(i2, i4) / 2;
                i2 = (i2 + (getPaddingLeft() - getPaddingRight())) / 2;
                i4 = (i4 + (getPaddingTop() - getPaddingBottom())) / 2;
                C0295a.m1049a(background, i2 - max, i4 - max, i2 + max, i4 + max);
            }
            return i;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0633g.abc_action_menu_layout, C0633g.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    public void mo75a(Context context, C3224h c3224h) {
        super.mo75a(context, c3224h);
        c3224h = context.getResources();
        context = C0704a.m2754a(context);
        if (!this.f18566p) {
            this.f18565o = context.m2756b();
        }
        if (!this.f18572v) {
            this.f18567q = context.m2757c();
        }
        if (!this.f18570t) {
            this.f18569s = context.m2755a();
        }
        context = this.f18567q;
        if (this.f18565o) {
            if (this.f18557g == null) {
                this.f18557g = new C4466d(this, this.a);
                if (this.f18564n) {
                    this.f18557g.setImageDrawable(this.f18563m);
                    this.f18563m = null;
                    this.f18564n = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f18557g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            context -= this.f18557g.getMeasuredWidth();
        } else {
            this.f18557g = null;
        }
        this.f18568r = context;
        this.f18574x = (int) (c3224h.getDisplayMetrics().density * 1113587712);
        this.f18576z = null;
    }

    /* renamed from: a */
    public void m24507a(Configuration configuration) {
        if (this.f18570t == null) {
            this.f18569s = C0704a.m2754a(this.b).m2755a();
        }
        if (this.c != null) {
            this.c.mo4579a(true);
        }
    }

    /* renamed from: c */
    public void m24520c(boolean z) {
        this.f18565o = z;
        this.f18566p = true;
    }

    /* renamed from: d */
    public void m24521d(boolean z) {
        this.f18573w = z;
    }

    /* renamed from: a */
    public void m24508a(Drawable drawable) {
        if (this.f18557g != null) {
            this.f18557g.setImageDrawable(drawable);
            return;
        }
        this.f18564n = true;
        this.f18563m = drawable;
    }

    /* renamed from: e */
    public Drawable m24522e() {
        if (this.f18557g != null) {
            return this.f18557g.getDrawable();
        }
        return this.f18564n ? this.f18563m : null;
    }

    /* renamed from: a */
    public C0730p mo3843a(ViewGroup viewGroup) {
        C0730p c0730p = this.f;
        C0730p a = super.mo3843a(viewGroup);
        if (c0730p != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo3844a(C3227j c3227j, View view, ViewGroup viewGroup) {
        View actionView = c3227j.getActionView();
        if (actionView == null || c3227j.m16220n()) {
            actionView = super.mo3844a(c3227j, view, viewGroup);
        }
        actionView.setVisibility(c3227j.isActionViewExpanded() != null ? 8 : null);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (actionMenuView.checkLayoutParams(layoutParams) == null) {
            actionView.setLayoutParams(actionMenuView.m16288a(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo3845a(C3227j c3227j, C0729a c0729a) {
        c0729a.mo71a(c3227j, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) c0729a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.f18556A == null) {
            this.f18556A = new C3234b(this);
        }
        actionMenuItemView.setPopupCallback(this.f18556A);
    }

    /* renamed from: a */
    public boolean mo3846a(int i, C3227j c3227j) {
        return c3227j.m16216j();
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        int size;
        super.mo79a(z);
        ((View) this.f).requestLayout();
        int i = 0;
        if (this.c) {
            z = this.c.m16179k();
            size = z.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0542b a = ((C3227j) z.get(i2)).mo586a();
                if (a != null) {
                    a.m2028a((C0537a) this);
                }
            }
        }
        z = this.c ? this.c.m16180l() : false;
        if (this.f18565o && z) {
            size = z.size();
            if (size == 1) {
                i = ((C3227j) z.get(0)).isActionViewExpanded() ^ 1;
            } else if (size > 0) {
                i = 1;
            }
        }
        if (i != 0) {
            if (!this.f18557g) {
                this.f18557g = new C4466d(this, this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f18557g.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f18557g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.f18557g, actionMenuView.m16296c());
            }
        } else if (this.f18557g && this.f18557g.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.f18557g);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.f18565o);
    }

    /* renamed from: a */
    public boolean mo3847a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f18557g) {
            return null;
        }
        return super.mo3847a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        boolean z = false;
        if (!c4465u.hasVisibleItems()) {
            return false;
        }
        C4465u c4465u2 = c4465u;
        while (c4465u2.m24494s() != this.c) {
            c4465u2 = (C4465u) c4465u2.m24494s();
        }
        View a = m24498a(c4465u2.getItem());
        if (a == null) {
            return false;
        }
        this.f18562l = c4465u.getItem().getItemId();
        int size = c4465u.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c4465u.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
        }
        this.f18559i = new C3233a(this, this.b, c4465u, a);
        this.f18559i.m2827a(z);
        this.f18559i.m2822a();
        super.mo82a(c4465u);
        return true;
    }

    /* renamed from: a */
    private View m24498a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0729a) && ((C0729a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: f */
    public boolean m24523f() {
        if (!this.f18565o || m24527j() || this.c == null || this.f == null || this.f18560j != null || this.c.m16180l().isEmpty()) {
            return false;
        }
        this.f18560j = new C0741c(this, new C3236e(this, this.b, this.c, this.f18557g, true));
        ((View) this.f).post(this.f18560j);
        super.mo82a(null);
        return true;
    }

    /* renamed from: g */
    public boolean m24524g() {
        if (this.f18560j == null || this.f == null) {
            C0726n c0726n = this.f18558h;
            if (c0726n == null) {
                return false;
            }
            c0726n.m2831d();
            return true;
        }
        ((View) this.f).removeCallbacks(this.f18560j);
        this.f18560j = null;
        return true;
    }

    /* renamed from: h */
    public boolean m24525h() {
        return m24524g() | m24526i();
    }

    /* renamed from: i */
    public boolean m24526i() {
        if (this.f18559i == null) {
            return false;
        }
        this.f18559i.m2831d();
        return true;
    }

    /* renamed from: j */
    public boolean m24527j() {
        return this.f18558h != null && this.f18558h.m2833f();
    }

    /* renamed from: k */
    public boolean m24528k() {
        if (this.f18560j == null) {
            if (!m24527j()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo80a() {
        ArrayList i;
        ActionMenuPresenter actionMenuPresenter;
        int size;
        int i2;
        int i3 = 0;
        if (this.c != null) {
            i = actionMenuPresenter.c.m16177i();
            size = i.size();
        } else {
            i = null;
            size = 0;
        }
        int i4 = actionMenuPresenter.f18569s;
        int i5 = actionMenuPresenter.f18568r;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f;
        int i6 = i4;
        int i7 = 0;
        Object obj = null;
        int i8 = 0;
        for (i4 = 0; i4 < size; i4++) {
            C3227j c3227j = (C3227j) i.get(i4);
            if (c3227j.m16218l()) {
                i7++;
            } else if (c3227j.m16217k()) {
                i8++;
            } else {
                obj = 1;
            }
            if (actionMenuPresenter.f18573w && c3227j.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f18565o && (r9 != null || i8 + i7 > i6)) {
            i6--;
        }
        i6 -= i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f18575y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f18571u) {
            i7 = i5 / actionMenuPresenter.f18574x;
            i2 = ((i5 % actionMenuPresenter.f18574x) / i7) + actionMenuPresenter.f18574x;
        } else {
            i7 = 0;
            i2 = 0;
        }
        i8 = i5;
        i5 = 0;
        int i9 = 0;
        while (i5 < size) {
            int i10;
            C3227j c3227j2 = (C3227j) i.get(i5);
            int measuredWidth;
            boolean z;
            if (c3227j2.m16218l()) {
                View a = actionMenuPresenter.mo3844a(c3227j2, actionMenuPresenter.f18576z, viewGroup);
                if (actionMenuPresenter.f18576z == null) {
                    actionMenuPresenter.f18576z = a;
                }
                if (actionMenuPresenter.f18571u) {
                    i7 -= ActionMenuView.m16285a(a, i2, i7, makeMeasureSpec, i3);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                measuredWidth = a.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i9 != 0) {
                    measuredWidth = i9;
                }
                i9 = c3227j2.getGroupId();
                if (i9 != 0) {
                    z = true;
                    sparseBooleanArray.put(i9, true);
                } else {
                    z = true;
                }
                c3227j2.m16209d(z);
                i10 = size;
                i9 = measuredWidth;
            } else if (c3227j2.m16217k()) {
                measuredWidth = c3227j2.getGroupId();
                z = sparseBooleanArray.get(measuredWidth);
                boolean z2 = (i6 > 0 || z) && i8 > 0 && (!actionMenuPresenter.f18571u || i7 > 0);
                if (z2) {
                    int i11 = z2;
                    View a2 = actionMenuPresenter.mo3844a(c3227j2, actionMenuPresenter.f18576z, viewGroup);
                    i10 = size;
                    if (actionMenuPresenter.f18576z == null) {
                        actionMenuPresenter.f18576z = a2;
                    }
                    if (actionMenuPresenter.f18571u) {
                        int a3 = ActionMenuView.m16285a(a2, i2, i7, makeMeasureSpec, 0);
                        i7 -= a3;
                        if (a3 == 0) {
                            i11 = 0;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    i3 = a2.getMeasuredWidth();
                    i8 -= i3;
                    if (i9 == 0) {
                        i9 = i3;
                    }
                    if (actionMenuPresenter.f18571u) {
                        z2 = i11 & (i8 >= 0 ? 1 : 0);
                    } else {
                        z2 = i11 & (i8 + i9 > 0 ? 1 : 0);
                    }
                } else {
                    boolean z3 = z2;
                    i10 = size;
                }
                if (z2 && measuredWidth != 0) {
                    sparseBooleanArray.put(measuredWidth, true);
                } else if (z) {
                    sparseBooleanArray.put(measuredWidth, false);
                    size = 0;
                    while (size < i5) {
                        C3227j c3227j3 = (C3227j) i.get(size);
                        if (c3227j3.getGroupId() == measuredWidth) {
                            if (c3227j3.m16216j()) {
                                i6++;
                            }
                            c3227j3.m16209d(false);
                        }
                        size++;
                        actionMenuPresenter = this;
                    }
                }
                if (z2) {
                    i6--;
                }
                c3227j2.m16209d(z2);
            } else {
                i10 = size;
                c3227j2.m16209d(false);
                i5++;
                size = i10;
                actionMenuPresenter = this;
                i3 = 0;
            }
            i5++;
            size = i10;
            actionMenuPresenter = this;
            i3 = 0;
        }
        return true;
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
        m24525h();
        super.mo77a(c3224h, z);
    }

    /* renamed from: c */
    public Parcelable mo85c() {
        Parcelable savedState = new SavedState();
        savedState.f2350a = this.f18562l;
        return savedState;
    }

    /* renamed from: a */
    public void mo76a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f2350a > 0) {
                parcelable = this.c.findItem(savedState.f2350a);
                if (parcelable != null) {
                    mo82a((C4465u) parcelable.getSubMenu());
                }
            }
        }
    }

    /* renamed from: b */
    public void mo3848b(boolean z) {
        if (z) {
            super.mo82a((C4465u) false);
        } else if (this.c) {
            this.c.m16161b(false);
        }
    }

    /* renamed from: a */
    public void m24512a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.mo74a(this.c);
    }
}
