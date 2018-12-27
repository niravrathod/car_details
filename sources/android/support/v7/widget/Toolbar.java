package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0546e;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.C0707c;
import android.support.v7.view.C0712g;
import android.support.v7.view.menu.C0728o;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.view.menu.C3227j;
import android.support.v7.view.menu.C4465u;
import android.support.v7.widget.ActionMenuView.C0743d;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    /* renamed from: A */
    private int f2695A;
    /* renamed from: B */
    private int f2696B;
    /* renamed from: C */
    private boolean f2697C;
    /* renamed from: D */
    private boolean f2698D;
    /* renamed from: E */
    private final ArrayList<View> f2699E;
    /* renamed from: F */
    private final ArrayList<View> f2700F;
    /* renamed from: G */
    private final int[] f2701G;
    /* renamed from: H */
    private final C0743d f2702H;
    /* renamed from: I */
    private az f2703I;
    /* renamed from: J */
    private ActionMenuPresenter f2704J;
    /* renamed from: K */
    private C3252a f2705K;
    /* renamed from: L */
    private C0727a f2706L;
    /* renamed from: M */
    private C0723a f2707M;
    /* renamed from: N */
    private boolean f2708N;
    /* renamed from: O */
    private final Runnable f2709O;
    /* renamed from: a */
    ImageButton f2710a;
    /* renamed from: b */
    View f2711b;
    /* renamed from: c */
    int f2712c;
    /* renamed from: d */
    C0829b f2713d;
    /* renamed from: e */
    private ActionMenuView f2714e;
    /* renamed from: f */
    private TextView f2715f;
    /* renamed from: g */
    private TextView f2716g;
    /* renamed from: h */
    private ImageButton f2717h;
    /* renamed from: i */
    private ImageView f2718i;
    /* renamed from: j */
    private Drawable f2719j;
    /* renamed from: k */
    private CharSequence f2720k;
    /* renamed from: l */
    private Context f2721l;
    /* renamed from: m */
    private int f2722m;
    /* renamed from: n */
    private int f2723n;
    /* renamed from: o */
    private int f2724o;
    /* renamed from: p */
    private int f2725p;
    /* renamed from: q */
    private int f2726q;
    /* renamed from: r */
    private int f2727r;
    /* renamed from: s */
    private int f2728s;
    /* renamed from: t */
    private int f2729t;
    /* renamed from: u */
    private ao f2730u;
    /* renamed from: v */
    private int f2731v;
    /* renamed from: w */
    private int f2732w;
    /* renamed from: x */
    private int f2733x;
    /* renamed from: y */
    private CharSequence f2734y;
    /* renamed from: z */
    private CharSequence f2735z;

    /* renamed from: android.support.v7.widget.Toolbar$2 */
    class C08262 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Toolbar f2693a;

        C08262(Toolbar toolbar) {
            this.f2693a = toolbar;
        }

        public void run() {
            this.f2693a.m3419d();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$3 */
    class C08273 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ Toolbar f2694a;

        C08273(Toolbar toolbar) {
            this.f2694a = toolbar;
        }

        public void onClick(View view) {
            this.f2694a.m3423h();
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$b */
    public interface C0829b {
        /* renamed from: a */
        boolean mo524a(MenuItem menuItem);
    }

    /* renamed from: android.support.v7.widget.Toolbar$1 */
    class C32511 implements C0743d {
        /* renamed from: a */
        final /* synthetic */ Toolbar f13886a;

        C32511(Toolbar toolbar) {
            this.f13886a = toolbar;
        }

        /* renamed from: a */
        public boolean mo756a(MenuItem menuItem) {
            return this.f13886a.f2713d != null ? this.f13886a.f2713d.mo524a(menuItem) : null;
        }
    }

    public static class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams {
        /* renamed from: b */
        int f13887b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13887b = null;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f13887b = 0;
            this.a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((android.support.v7.app.ActionBar.LayoutParams) layoutParams);
            this.f13887b = 0;
            this.f13887b = layoutParams.f13887b;
        }

        public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13887b = null;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.f13887b = 0;
            m16627a(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13887b = null;
        }

        /* renamed from: a */
        void m16627a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C08281();
        /* renamed from: a */
        int f13888a;
        /* renamed from: b */
        boolean f13889b;

        /* renamed from: android.support.v7.widget.Toolbar$SavedState$1 */
        static class C08281 implements ClassLoaderCreator<SavedState> {
            C08281() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3389a(parcel);
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m3390a(parcel, classLoader);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m3391a(i);
            }

            /* renamed from: a */
            public SavedState m3390a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: a */
            public SavedState m3389a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState[] m3391a(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13888a = parcel.readInt();
            this.f13889b = parcel.readInt() != null ? true : null;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13888a);
            parcel.writeInt(this.f13889b);
        }
    }

    /* renamed from: android.support.v7.widget.Toolbar$a */
    private class C3252a implements C0728o {
        /* renamed from: a */
        C3224h f13890a;
        /* renamed from: b */
        C3227j f13891b;
        /* renamed from: c */
        final /* synthetic */ Toolbar f13892c;

        /* renamed from: a */
        public void mo76a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo77a(C3224h c3224h, boolean z) {
        }

        /* renamed from: a */
        public void mo78a(C0727a c0727a) {
        }

        /* renamed from: a */
        public boolean mo80a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo82a(C4465u c4465u) {
            return false;
        }

        /* renamed from: b */
        public int mo83b() {
            return 0;
        }

        /* renamed from: c */
        public Parcelable mo85c() {
            return null;
        }

        C3252a(Toolbar toolbar) {
            this.f13892c = toolbar;
        }

        /* renamed from: a */
        public void mo75a(Context context, C3224h c3224h) {
            if (!(this.f13890a == null || this.f13891b == null)) {
                this.f13890a.mo3840d(this.f13891b);
            }
            this.f13890a = c3224h;
        }

        /* renamed from: a */
        public void mo79a(boolean z) {
            if (this.f13891b) {
                Object obj = null;
                if (this.f13890a) {
                    z = this.f13890a.size();
                    for (boolean z2 = false; z2 < z; z2++) {
                        if (this.f13890a.getItem(z2) == this.f13891b) {
                            obj = 1;
                            break;
                        }
                    }
                }
                if (obj == null) {
                    mo84b(this.f13890a, this.f13891b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo81a(C3224h c3224h, C3227j c3227j) {
            this.f13892c.m3424i();
            c3224h = this.f13892c.f2710a.getParent();
            if (c3224h != this.f13892c) {
                if (c3224h instanceof ViewGroup) {
                    ((ViewGroup) c3224h).removeView(this.f13892c.f2710a);
                }
                this.f13892c.addView(this.f13892c.f2710a);
            }
            this.f13892c.f2711b = c3227j.getActionView();
            this.f13891b = c3227j;
            c3224h = this.f13892c.f2711b.getParent();
            if (c3224h != this.f13892c) {
                if (c3224h instanceof ViewGroup) {
                    ((ViewGroup) c3224h).removeView(this.f13892c.f2711b);
                }
                c3224h = this.f13892c.m3425j();
                c3224h.a = 8388611 | (this.f13892c.f2712c & 112);
                c3224h.f13887b = 2;
                this.f13892c.f2711b.setLayoutParams(c3224h);
                this.f13892c.addView(this.f13892c.f2711b);
            }
            this.f13892c.m3426k();
            this.f13892c.requestLayout();
            c3227j.m16211e(true);
            if ((this.f13892c.f2711b instanceof C0707c) != null) {
                ((C0707c) this.f13892c.f2711b).mo614a();
            }
            return true;
        }

        /* renamed from: b */
        public boolean mo84b(C3224h c3224h, C3227j c3227j) {
            if ((this.f13892c.f2711b instanceof C0707c) != null) {
                ((C0707c) this.f13892c.f2711b).mo615b();
            }
            this.f13892c.removeView(this.f13892c.f2711b);
            this.f13892c.removeView(this.f13892c.f2710a);
            this.f13892c.f2711b = null;
            this.f13892c.m3427l();
            this.f13891b = null;
            this.f13892c.requestLayout();
            c3227j.m16211e(null);
            return true;
        }
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m3425j();
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return m3414a(attributeSet);
    }

    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return m3415a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2733x = 8388627;
        this.f2699E = new ArrayList();
        this.f2700F = new ArrayList();
        this.f2701G = new int[2];
        this.f2702H = new C32511(this);
        this.f2709O = new C08262(this);
        context = ay.m3543a(getContext(), attributeSet, C0636j.Toolbar, i, 0);
        this.f2723n = context.m3560g(C0636j.Toolbar_titleTextAppearance, 0);
        this.f2724o = context.m3560g(C0636j.Toolbar_subtitleTextAppearance, 0);
        this.f2733x = context.m3552c(C0636j.Toolbar_android_gravity, this.f2733x);
        this.f2712c = context.m3552c(C0636j.Toolbar_buttonGravity, 48);
        attributeSet = context.m3554d(C0636j.Toolbar_titleMargin, 0);
        if (context.m3561g(C0636j.Toolbar_titleMargins) != 0) {
            attributeSet = context.m3554d(C0636j.Toolbar_titleMargins, attributeSet);
        }
        this.f2729t = attributeSet;
        this.f2728s = attributeSet;
        this.f2727r = attributeSet;
        this.f2726q = attributeSet;
        attributeSet = context.m3554d(C0636j.Toolbar_titleMarginStart, -1);
        if (attributeSet >= null) {
            this.f2726q = attributeSet;
        }
        attributeSet = context.m3554d(C0636j.Toolbar_titleMarginEnd, -1);
        if (attributeSet >= null) {
            this.f2727r = attributeSet;
        }
        attributeSet = context.m3554d(C0636j.Toolbar_titleMarginTop, -1);
        if (attributeSet >= null) {
            this.f2728s = attributeSet;
        }
        attributeSet = context.m3554d(C0636j.Toolbar_titleMarginBottom, -1);
        if (attributeSet >= null) {
            this.f2729t = attributeSet;
        }
        this.f2725p = context.m3556e(C0636j.Toolbar_maxButtonHeight, -1);
        attributeSet = context.m3554d(C0636j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int d = context.m3554d(C0636j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int e = context.m3556e(C0636j.Toolbar_contentInsetLeft, 0);
        int e2 = context.m3556e(C0636j.Toolbar_contentInsetRight, 0);
        m3413s();
        this.f2730u.m3525b(e, e2);
        if (!(attributeSet == -2147483648 && d == Integer.MIN_VALUE)) {
            this.f2730u.m3522a(attributeSet, d);
        }
        this.f2731v = context.m3554d(C0636j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f2732w = context.m3554d(C0636j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2719j = context.m3547a(C0636j.Toolbar_collapseIcon);
        this.f2720k = context.m3553c(C0636j.Toolbar_collapseContentDescription);
        CharSequence c = context.m3553c(C0636j.Toolbar_title);
        if (!TextUtils.isEmpty(c)) {
            setTitle(c);
        }
        c = context.m3553c(C0636j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c)) {
            setSubtitle(c);
        }
        this.f2721l = getContext();
        setPopupTheme(context.m3560g(C0636j.Toolbar_popupTheme, 0));
        Drawable a = context.m3547a(C0636j.Toolbar_navigationIcon);
        if (a != null) {
            setNavigationIcon(a);
        }
        c = context.m3553c(C0636j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c)) {
            setNavigationContentDescription(c);
        }
        a = context.m3547a(C0636j.Toolbar_logo);
        if (a != null) {
            setLogo(a);
        }
        c = context.m3553c(C0636j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c)) {
            setLogoDescription(c);
        }
        if (context.m3561g(C0636j.Toolbar_titleTextColor) != null) {
            setTitleTextColor(context.m3550b(C0636j.Toolbar_titleTextColor, -1));
        }
        if (context.m3561g(C0636j.Toolbar_subtitleTextColor) != null) {
            setSubtitleTextColor(context.m3550b(C0636j.Toolbar_subtitleTextColor, -1));
        }
        context.m3548a();
    }

    public void setPopupTheme(int i) {
        if (this.f2722m != i) {
            this.f2722m = i;
            if (i == 0) {
                this.f2721l = getContext();
            } else {
                this.f2721l = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f2722m;
    }

    public void setTitleMargin(int i, int i2, int i3, int i4) {
        this.f2726q = i;
        this.f2728s = i2;
        this.f2727r = i3;
        this.f2729t = i4;
        requestLayout();
    }

    public int getTitleMarginStart() {
        return this.f2726q;
    }

    public void setTitleMarginStart(int i) {
        this.f2726q = i;
        requestLayout();
    }

    public int getTitleMarginTop() {
        return this.f2728s;
    }

    public void setTitleMarginTop(int i) {
        this.f2728s = i;
        requestLayout();
    }

    public int getTitleMarginEnd() {
        return this.f2727r;
    }

    public void setTitleMarginEnd(int i) {
        this.f2727r = i;
        requestLayout();
    }

    public int getTitleMarginBottom() {
        return this.f2729t;
    }

    public void setTitleMarginBottom(int i) {
        this.f2729t = i;
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m3413s();
        ao aoVar = this.f2730u;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        aoVar.m3523a(z);
    }

    public void setLogo(int i) {
        setLogo(C0680b.m2703b(getContext(), i));
    }

    /* renamed from: a */
    public boolean m3416a() {
        return getVisibility() == 0 && this.f2714e != null && this.f2714e.m16290a();
    }

    /* renamed from: b */
    public boolean m3417b() {
        return this.f2714e != null && this.f2714e.m16300g();
    }

    /* renamed from: c */
    public boolean m3418c() {
        return this.f2714e != null && this.f2714e.m16301h();
    }

    /* renamed from: d */
    public boolean m3419d() {
        return this.f2714e != null && this.f2714e.m16298e();
    }

    /* renamed from: e */
    public boolean m3420e() {
        return this.f2714e != null && this.f2714e.m16299f();
    }

    public void setMenu(C3224h c3224h, ActionMenuPresenter actionMenuPresenter) {
        if (c3224h != null || this.f2714e != null) {
            m3409o();
            C3224h d = this.f2714e.m16297d();
            if (d != c3224h) {
                if (d != null) {
                    d.m16160b(this.f2704J);
                    d.m16160b(this.f2705K);
                }
                if (this.f2705K == null) {
                    this.f2705K = new C3252a(this);
                }
                actionMenuPresenter.m24521d(true);
                if (c3224h != null) {
                    c3224h.m16150a((C0728o) actionMenuPresenter, this.f2721l);
                    c3224h.m16150a(this.f2705K, this.f2721l);
                } else {
                    actionMenuPresenter.mo75a(this.f2721l, null);
                    this.f2705K.mo75a(this.f2721l, null);
                    actionMenuPresenter.mo79a(true);
                    this.f2705K.mo79a(true);
                }
                this.f2714e.setPopupTheme(this.f2722m);
                this.f2714e.setPresenter(actionMenuPresenter);
                this.f2704J = actionMenuPresenter;
            }
        }
    }

    /* renamed from: f */
    public void m3421f() {
        if (this.f2714e != null) {
            this.f2714e.m16302i();
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m3407m();
            if (!m3406d(this.f2718i)) {
                m3399a(this.f2718i, true);
            }
        } else if (this.f2718i != null && m3406d(this.f2718i)) {
            removeView(this.f2718i);
            this.f2700F.remove(this.f2718i);
        }
        if (this.f2718i != null) {
            this.f2718i.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        return this.f2718i != null ? this.f2718i.getDrawable() : null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3407m();
        }
        if (this.f2718i != null) {
            this.f2718i.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        return this.f2718i != null ? this.f2718i.getContentDescription() : null;
    }

    /* renamed from: m */
    private void m3407m() {
        if (this.f2718i == null) {
            this.f2718i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: g */
    public boolean m3422g() {
        return (this.f2705K == null || this.f2705K.f13891b == null) ? false : true;
    }

    /* renamed from: h */
    public void m3423h() {
        C3227j c3227j = this.f2705K == null ? null : this.f2705K.f13891b;
        if (c3227j != null) {
            c3227j.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.f2734y;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2715f == null) {
                Context context = getContext();
                this.f2715f = new AppCompatTextView(context);
                this.f2715f.setSingleLine();
                this.f2715f.setEllipsize(TruncateAt.END);
                if (this.f2723n != 0) {
                    this.f2715f.setTextAppearance(context, this.f2723n);
                }
                if (this.f2695A != 0) {
                    this.f2715f.setTextColor(this.f2695A);
                }
            }
            if (!m3406d(this.f2715f)) {
                m3399a(this.f2715f, true);
            }
        } else if (this.f2715f != null && m3406d(this.f2715f)) {
            removeView(this.f2715f);
            this.f2700F.remove(this.f2715f);
        }
        if (this.f2715f != null) {
            this.f2715f.setText(charSequence);
        }
        this.f2734y = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.f2735z;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2716g == null) {
                Context context = getContext();
                this.f2716g = new AppCompatTextView(context);
                this.f2716g.setSingleLine();
                this.f2716g.setEllipsize(TruncateAt.END);
                if (this.f2724o != 0) {
                    this.f2716g.setTextAppearance(context, this.f2724o);
                }
                if (this.f2696B != 0) {
                    this.f2716g.setTextColor(this.f2696B);
                }
            }
            if (!m3406d(this.f2716g)) {
                m3399a(this.f2716g, true);
            }
        } else if (this.f2716g != null && m3406d(this.f2716g)) {
            removeView(this.f2716g);
            this.f2700F.remove(this.f2716g);
        }
        if (this.f2716g != null) {
            this.f2716g.setText(charSequence);
        }
        this.f2735z = charSequence;
    }

    public void setTitleTextAppearance(Context context, int i) {
        this.f2723n = i;
        if (this.f2715f != null) {
            this.f2715f.setTextAppearance(context, i);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i) {
        this.f2724o = i;
        if (this.f2716g != null) {
            this.f2716g.setTextAppearance(context, i);
        }
    }

    public void setTitleTextColor(int i) {
        this.f2695A = i;
        if (this.f2715f != null) {
            this.f2715f.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.f2696B = i;
        if (this.f2716g != null) {
            this.f2716g.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        return this.f2717h != null ? this.f2717h.getContentDescription() : null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : 0);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3410p();
        }
        if (this.f2717h != null) {
            this.f2717h.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0680b.m2703b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3410p();
            if (!m3406d(this.f2717h)) {
                m3399a(this.f2717h, true);
            }
        } else if (this.f2717h != null && m3406d(this.f2717h)) {
            removeView(this.f2717h);
            this.f2700F.remove(this.f2717h);
        }
        if (this.f2717h != null) {
            this.f2717h.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        return this.f2717h != null ? this.f2717h.getDrawable() : null;
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m3410p();
        this.f2717h.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        m3408n();
        return this.f2714e.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        m3408n();
        this.f2714e.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        m3408n();
        return this.f2714e.getOverflowIcon();
    }

    /* renamed from: n */
    private void m3408n() {
        m3409o();
        if (this.f2714e.m16297d() == null) {
            C3224h c3224h = (C3224h) this.f2714e.getMenu();
            if (this.f2705K == null) {
                this.f2705K = new C3252a(this);
            }
            this.f2714e.setExpandedActionViewsExclusive(true);
            c3224h.m16150a(this.f2705K, this.f2721l);
        }
    }

    /* renamed from: o */
    private void m3409o() {
        if (this.f2714e == null) {
            this.f2714e = new ActionMenuView(getContext());
            this.f2714e.setPopupTheme(this.f2722m);
            this.f2714e.setOnMenuItemClickListener(this.f2702H);
            this.f2714e.setMenuCallbacks(this.f2706L, this.f2707M);
            android.view.ViewGroup.LayoutParams j = m3425j();
            j.a = 8388613 | (this.f2712c & 112);
            this.f2714e.setLayoutParams(j);
            m3399a(this.f2714e, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new C0712g(getContext());
    }

    public void setOnMenuItemClickListener(C0829b c0829b) {
        this.f2713d = c0829b;
    }

    public void setContentInsetsRelative(int i, int i2) {
        m3413s();
        this.f2730u.m3522a(i, i2);
    }

    public int getContentInsetStart() {
        return this.f2730u != null ? this.f2730u.m3526c() : 0;
    }

    public int getContentInsetEnd() {
        return this.f2730u != null ? this.f2730u.m3527d() : 0;
    }

    public void setContentInsetsAbsolute(int i, int i2) {
        m3413s();
        this.f2730u.m3525b(i, i2);
    }

    public int getContentInsetLeft() {
        return this.f2730u != null ? this.f2730u.m3521a() : 0;
    }

    public int getContentInsetRight() {
        return this.f2730u != null ? this.f2730u.m3524b() : 0;
    }

    public int getContentInsetStartWithNavigation() {
        if (this.f2731v != Integer.MIN_VALUE) {
            return this.f2731v;
        }
        return getContentInsetStart();
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2731v) {
            this.f2731v = i;
            if (getNavigationIcon() != 0) {
                requestLayout();
            }
        }
    }

    public int getContentInsetEndWithActions() {
        if (this.f2732w != Integer.MIN_VALUE) {
            return this.f2732w;
        }
        return getContentInsetEnd();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2732w) {
            this.f2732w = i;
            if (getNavigationIcon() != 0) {
                requestLayout();
            }
        }
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2731v, 0));
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        Object obj;
        if (this.f2714e != null) {
            C3224h d = this.f2714e.m16297d();
            if (d != null && d.hasVisibleItems()) {
                obj = 1;
                if (obj == null) {
                    return Math.max(getContentInsetEnd(), Math.max(this.f2732w, 0));
                }
                return getContentInsetEnd();
            }
        }
        obj = null;
        if (obj == null) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f2732w, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (C0560r.m2193e(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0560r.m2193e(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    /* renamed from: p */
    private void m3410p() {
        if (this.f2717h == null) {
            this.f2717h = new AppCompatImageButton(getContext(), null, C0627a.toolbarNavigationButtonStyle);
            android.view.ViewGroup.LayoutParams j = m3425j();
            j.a = 8388611 | (this.f2712c & 112);
            this.f2717h.setLayoutParams(j);
        }
    }

    /* renamed from: i */
    void m3424i() {
        if (this.f2710a == null) {
            this.f2710a = new AppCompatImageButton(getContext(), null, C0627a.toolbarNavigationButtonStyle);
            this.f2710a.setImageDrawable(this.f2719j);
            this.f2710a.setContentDescription(this.f2720k);
            android.view.ViewGroup.LayoutParams j = m3425j();
            j.a = 8388611 | (this.f2712c & 112);
            j.f13887b = 2;
            this.f2710a.setLayoutParams(j);
            this.f2710a.setOnClickListener(new C08273(this));
        }
    }

    /* renamed from: a */
    private void m3399a(View view, boolean z) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = m3425j();
        } else if (checkLayoutParams(layoutParams)) {
            layoutParams = (LayoutParams) layoutParams;
        } else {
            layoutParams = m3415a(layoutParams);
        }
        layoutParams.f13887b = 1;
        if (z && this.f2711b) {
            view.setLayoutParams(layoutParams);
            this.f2700F.add(view);
            return;
        }
        addView(view, layoutParams);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        if (!(this.f2705K == null || this.f2705K.f13891b == null)) {
            savedState.f13888a = this.f2705K.f13891b.getItemId();
        }
        savedState.f13889b = m3417b();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.m1885a());
            Menu d = this.f2714e != null ? this.f2714e.m16297d() : null;
            if (!(savedState.f13888a == 0 || this.f2705K == null || d == null)) {
                MenuItem findItem = d.findItem(savedState.f13888a);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
            if (savedState.f13889b != null) {
                m3411q();
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: q */
    private void m3411q() {
        removeCallbacks(this.f2709O);
        post(this.f2709O);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2709O);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2697C = false;
        }
        if (!this.f2697C) {
            motionEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && motionEvent == null) {
                this.f2697C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2697C = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2698D = false;
        }
        if (!this.f2698D) {
            motionEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && motionEvent == null) {
                this.f2698D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2698D = false;
        }
        return true;
    }

    /* renamed from: a */
    private void m3398a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        i = getChildMeasureSpec(i, (((getPaddingLeft() + getPaddingRight()) + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) + i2, marginLayoutParams.width);
        i2 = getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height);
        i3 = MeasureSpec.getMode(i2);
        if (i3 != 1073741824 && i5 >= 0) {
            if (i3 != 0) {
                i5 = Math.min(MeasureSpec.getSize(i2), i5);
            }
            i2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(i, i2);
    }

    /* renamed from: a */
    private int m3395a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, ((getPaddingLeft() + getPaddingRight()) + max) + i2, marginLayoutParams.width), getChildMeasureSpec(i3, (((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.topMargin) + marginLayoutParams.bottomMargin) + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: r */
    private boolean m3412r() {
        if (!this.f2708N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m3401a(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int measuredWidth;
        int max;
        int combineMeasuredStates;
        int measuredHeight;
        int combineMeasuredStates2;
        int[] iArr = this.f2701G;
        if (bg.m3615a(this)) {
            i3 = 1;
            i4 = 0;
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (m3401a(r7.f2717h)) {
            m3398a(r7.f2717h, i, 0, i2, 0, r7.f2725p);
            measuredWidth = r7.f2717h.getMeasuredWidth() + m3403b(r7.f2717h);
            max = Math.max(0, r7.f2717h.getMeasuredHeight() + m3405c(r7.f2717h));
            combineMeasuredStates = View.combineMeasuredStates(0, r7.f2717h.getMeasuredState());
        } else {
            measuredWidth = 0;
            max = 0;
            combineMeasuredStates = 0;
        }
        if (m3401a(r7.f2710a)) {
            m3398a(r7.f2710a, i, 0, i2, 0, r7.f2725p);
            measuredWidth = r7.f2710a.getMeasuredWidth() + m3403b(r7.f2710a);
            max = Math.max(max, r7.f2710a.getMeasuredHeight() + m3405c(r7.f2710a));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f2710a.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max2 = Math.max(currentContentInsetStart, measuredWidth) + 0;
        iArr[i3] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m3401a(r7.f2714e)) {
            m3398a(r7.f2714e, i, max2, i2, 0, r7.f2725p);
            measuredWidth = r7.f2714e.getMeasuredWidth() + m3403b(r7.f2714e);
            max = Math.max(max, r7.f2714e.getMeasuredHeight() + m3405c(r7.f2714e));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f2714e.getMeasuredState());
        } else {
            measuredWidth = 0;
        }
        currentContentInsetStart = getCurrentContentInsetEnd();
        i3 = max2 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[i4] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (m3401a(r7.f2711b)) {
            i3 += m3395a(r7.f2711b, i, i3, i2, 0, iArr);
            max = Math.max(max, r7.f2711b.getMeasuredHeight() + m3405c(r7.f2711b));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f2711b.getMeasuredState());
        }
        if (m3401a(r7.f2718i)) {
            i3 += m3395a(r7.f2718i, i, i3, i2, 0, iArr);
            max = Math.max(max, r7.f2718i.getMeasuredHeight() + m3405c(r7.f2718i));
            combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, r7.f2718i.getMeasuredState());
        }
        i4 = getChildCount();
        max2 = max;
        max = i3;
        for (i3 = 0; i3 < i4; i3++) {
            View childAt = getChildAt(i3);
            if (((LayoutParams) childAt.getLayoutParams()).f13887b == 0) {
                if (m3401a(childAt)) {
                    max += m3395a(childAt, i, max, i2, 0, iArr);
                    max2 = Math.max(max2, childAt.getMeasuredHeight() + m3405c(childAt));
                    combineMeasuredStates = View.combineMeasuredStates(combineMeasuredStates, childAt.getMeasuredState());
                }
            }
        }
        i3 = r7.f2728s + r7.f2729t;
        i4 = r7.f2726q + r7.f2727r;
        if (m3401a(r7.f2715f)) {
            m3395a(r7.f2715f, i, max + i4, i2, i3, iArr);
            measuredWidth = r7.f2715f.getMeasuredWidth() + m3403b(r7.f2715f);
            measuredHeight = r7.f2715f.getMeasuredHeight() + m3405c(r7.f2715f);
            combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, r7.f2715f.getMeasuredState());
            combineMeasuredStates = measuredWidth;
        } else {
            combineMeasuredStates2 = combineMeasuredStates;
            combineMeasuredStates = 0;
            measuredHeight = 0;
        }
        if (m3401a(r7.f2716g)) {
            int i5 = measuredHeight + i3;
            i3 = combineMeasuredStates2;
            combineMeasuredStates = Math.max(combineMeasuredStates, m3395a(r7.f2716g, i, max + i4, i2, i5, iArr));
            measuredHeight += r7.f2716g.getMeasuredHeight() + m3405c(r7.f2716g);
            combineMeasuredStates2 = View.combineMeasuredStates(i3, r7.f2716g.getMeasuredState());
        } else {
            i3 = combineMeasuredStates2;
        }
        max += combineMeasuredStates;
        measuredWidth = Math.max(max2, measuredHeight) + (getPaddingTop() + getPaddingBottom());
        int i6 = i;
        currentContentInsetStart = View.resolveSizeAndState(Math.max(max + (getPaddingLeft() + getPaddingRight()), getSuggestedMinimumWidth()), i6, -16777216 & combineMeasuredStates2);
        measuredWidth = View.resolveSizeAndState(Math.max(measuredWidth, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16);
        if (m3412r()) {
            measuredWidth = 0;
        }
        setMeasuredDimension(currentContentInsetStart, measuredWidth);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int b;
        int currentContentInsetLeft;
        int currentContentInsetRight;
        int max;
        boolean a;
        boolean a2;
        int i6;
        int i7;
        int i8;
        LayoutParams layoutParams;
        int i9;
        int i10;
        int size;
        LayoutParams layoutParams2;
        Object obj;
        int i11;
        LayoutParams layoutParams3;
        int i12;
        Toolbar toolbar = this;
        Object obj2 = C0560r.m2193e(this) == 1 ? 1 : null;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i13 = width - paddingRight;
        int[] iArr = toolbar.f2701G;
        iArr[1] = 0;
        iArr[0] = 0;
        int j = C0560r.m2198j(this);
        j = j >= 0 ? Math.min(j, i4 - i2) : 0;
        if (!m3401a(toolbar.f2717h)) {
            i5 = paddingLeft;
        } else if (obj2 != null) {
            b = m3404b(toolbar.f2717h, i13, iArr, j);
            i5 = paddingLeft;
            if (m3401a(toolbar.f2710a)) {
                if (obj2 == null) {
                    b = m3404b(toolbar.f2710a, b, iArr, j);
                } else {
                    i5 = m3396a(toolbar.f2710a, i5, iArr, j);
                }
            }
            if (m3401a(toolbar.f2714e)) {
                if (obj2 == null) {
                    i5 = m3396a(toolbar.f2714e, i5, iArr, j);
                } else {
                    b = m3404b(toolbar.f2714e, b, iArr, j);
                }
            }
            currentContentInsetLeft = getCurrentContentInsetLeft();
            currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - i5);
            iArr[1] = Math.max(0, currentContentInsetRight - (i13 - b));
            max = Math.max(i5, currentContentInsetLeft);
            i13 = Math.min(b, i13 - currentContentInsetRight);
            if (m3401a(toolbar.f2711b)) {
                if (obj2 == null) {
                    i13 = m3404b(toolbar.f2711b, i13, iArr, j);
                } else {
                    max = m3396a(toolbar.f2711b, max, iArr, j);
                }
            }
            if (m3401a(toolbar.f2718i)) {
                if (obj2 == null) {
                    i13 = m3404b(toolbar.f2718i, i13, iArr, j);
                } else {
                    max = m3396a(toolbar.f2718i, max, iArr, j);
                }
            }
            a = m3401a(toolbar.f2715f);
            a2 = m3401a(toolbar.f2716g);
            if (a) {
                i6 = paddingRight;
                i7 = 0;
            } else {
                LayoutParams layoutParams4 = (LayoutParams) toolbar.f2715f.getLayoutParams();
                i6 = paddingRight;
                i7 = ((layoutParams4.topMargin + toolbar.f2715f.getMeasuredHeight()) + layoutParams4.bottomMargin) + 0;
            }
            if (a2) {
                i8 = width;
            } else {
                layoutParams = (LayoutParams) toolbar.f2716g.getLayoutParams();
                i8 = width;
                i7 += (layoutParams.topMargin + toolbar.f2716g.getMeasuredHeight()) + layoutParams.bottomMargin;
            }
            if (!a) {
                if (a2) {
                    i9 = paddingLeft;
                    i10 = j;
                    paddingRight = 0;
                    m3400a(toolbar.f2699E, 3);
                    size = toolbar.f2699E.size();
                    i7 = max;
                    for (max = 0; max < size; max++) {
                        i7 = m3396a((View) toolbar.f2699E.get(max), i7, iArr, i10);
                    }
                    j = i10;
                    m3400a(toolbar.f2699E, 5);
                    size = toolbar.f2699E.size();
                    for (max = 0; max < size; max++) {
                        i13 = m3404b((View) toolbar.f2699E.get(max), i13, iArr, j);
                    }
                    m3400a(toolbar.f2699E, 1);
                    size = m3397a(toolbar.f2699E, iArr);
                    max = (i9 + (((i8 - i9) - i6) / 2)) - (size / 2);
                    size += max;
                    if (max < i7) {
                        i7 = size <= i13 ? max - (size - i13) : max;
                    }
                    size = toolbar.f2699E.size();
                    for (paddingRight = 
/*
Method generation error in method: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void, dex: classes.dex
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r7_17 'paddingRight' int) = (r7_8 'paddingRight' int), (r7_16 'paddingRight' int), (r7_16 'paddingRight' int) binds: {(r7_16 'paddingRight' int)=B:100:0x0296, (r7_8 'paddingRight' int)=B:46:0x0128, (r7_16 'paddingRight' int)=B:99:0x0294} in method: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void, dex: classes.dex
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:146)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:124)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:187)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:320)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:257)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:220)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:75)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:12)
	at jadx.core.ProcessClass.process(ProcessClass.java:40)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:537)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:509)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 35 more

*/

                    /* renamed from: a */
                    private int m3397a(List<View> list, int[] iArr) {
                        int i = iArr[0];
                        iArr = iArr[1];
                        int size = list.size();
                        int i2 = iArr;
                        iArr = null;
                        int i3 = 0;
                        while (iArr < size) {
                            View view = (View) list.get(iArr);
                            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                            int i4 = layoutParams.leftMargin - i;
                            i = layoutParams.rightMargin - i2;
                            i2 = Math.max(0, i4);
                            int max = Math.max(0, i);
                            i4 = Math.max(0, -i4);
                            i3 += (i2 + view.getMeasuredWidth()) + max;
                            iArr++;
                            i2 = Math.max(0, -i);
                            i = i4;
                        }
                        return i3;
                    }

                    /* renamed from: a */
                    private int m3396a(View view, int i, int[] iArr, int i2) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        int i3 = layoutParams.leftMargin - iArr[0];
                        i += Math.max(0, i3);
                        iArr[0] = Math.max(0, -i3);
                        iArr = m3394a(view, i2);
                        i2 = view.getMeasuredWidth();
                        view.layout(i, iArr, i + i2, view.getMeasuredHeight() + iArr);
                        return i + (i2 + layoutParams.rightMargin);
                    }

                    /* renamed from: b */
                    private int m3404b(View view, int i, int[] iArr, int i2) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        int i3 = layoutParams.rightMargin - iArr[1];
                        i -= Math.max(0, i3);
                        iArr[1] = Math.max(0, -i3);
                        iArr = m3394a(view, i2);
                        i2 = view.getMeasuredWidth();
                        view.layout(i - i2, iArr, i, view.getMeasuredHeight() + iArr);
                        return i - (i2 + layoutParams.leftMargin);
                    }

                    /* renamed from: a */
                    private int m3394a(View view, int i) {
                        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                        view = view.getMeasuredHeight();
                        i = i > 0 ? (view - i) / 2 : 0;
                        int a = m3393a(layoutParams.a);
                        if (a == 48) {
                            return getPaddingTop() - i;
                        }
                        if (a == 80) {
                            return (((getHeight() - getPaddingBottom()) - view) - layoutParams.bottomMargin) - i;
                        }
                        i = getPaddingTop();
                        a = getPaddingBottom();
                        int height = getHeight();
                        int i2 = (((height - i) - a) - view) / 2;
                        if (i2 < layoutParams.topMargin) {
                            i2 = layoutParams.topMargin;
                        } else {
                            height = (((height - a) - view) - i2) - i;
                            if (height < layoutParams.bottomMargin) {
                                i2 = Math.max(0, i2 - (layoutParams.bottomMargin - height));
                            }
                        }
                        return i + i2;
                    }

                    /* renamed from: a */
                    private int m3393a(int i) {
                        i &= 112;
                        return (i == 16 || i == 48 || i == 80) ? i : this.f2733x & 112;
                    }

                    /* renamed from: a */
                    private void m3400a(List<View> list, int i) {
                        Object obj = C0560r.m2193e(this) == 1 ? 1 : null;
                        int childCount = getChildCount();
                        i = C0543c.m2037a(i, C0560r.m2193e(this));
                        list.clear();
                        View childAt;
                        if (obj != null) {
                            for (childCount--; childCount >= 0; childCount--) {
                                childAt = getChildAt(childCount);
                                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                                if (layoutParams.f13887b == 0 && m3401a(childAt) && m3402b(layoutParams.a) == i) {
                                    list.add(childAt);
                                }
                            }
                            return;
                        }
                        for (int i2 = 0; i2 < childCount; i2++) {
                            childAt = getChildAt(i2);
                            LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                            if (layoutParams2.f13887b == 0 && m3401a(childAt) && m3402b(layoutParams2.a) == i) {
                                list.add(childAt);
                            }
                        }
                    }

                    /* renamed from: b */
                    private int m3402b(int i) {
                        int e = C0560r.m2193e(this);
                        i = C0543c.m2037a(i, e) & 7;
                        if (i != 1) {
                            int i2 = 3;
                            if (!(i == 3 || i == 5)) {
                                if (e == 1) {
                                    i2 = 5;
                                }
                                return i2;
                            }
                        }
                        return i;
                    }

                    /* renamed from: a */
                    private boolean m3401a(View view) {
                        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? null : true;
                    }

                    /* renamed from: b */
                    private int m3403b(View view) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                        return C0546e.m2042a(marginLayoutParams) + C0546e.m2044b(marginLayoutParams);
                    }

                    /* renamed from: c */
                    private int m3405c(View view) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }

                    /* renamed from: a */
                    public LayoutParams m3414a(AttributeSet attributeSet) {
                        return new LayoutParams(getContext(), attributeSet);
                    }

                    /* renamed from: a */
                    protected LayoutParams m3415a(android.view.ViewGroup.LayoutParams layoutParams) {
                        if (layoutParams instanceof LayoutParams) {
                            return new LayoutParams((LayoutParams) layoutParams);
                        }
                        if (layoutParams instanceof android.support.v7.app.ActionBar.LayoutParams) {
                            return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams) layoutParams);
                        }
                        if (layoutParams instanceof MarginLayoutParams) {
                            return new LayoutParams((MarginLayoutParams) layoutParams);
                        }
                        return new LayoutParams(layoutParams);
                    }

                    /* renamed from: j */
                    protected LayoutParams m3425j() {
                        return new LayoutParams(-2, -2);
                    }

                    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
                        return (!super.checkLayoutParams(layoutParams) || (layoutParams instanceof LayoutParams) == null) ? null : true;
                    }

                    public C0874w getWrapper() {
                        if (this.f2703I == null) {
                            this.f2703I = new az(this, true);
                        }
                        return this.f2703I;
                    }

                    /* renamed from: k */
                    void m3426k() {
                        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                            View childAt = getChildAt(childCount);
                            if (!(((LayoutParams) childAt.getLayoutParams()).f13887b == 2 || childAt == this.f2714e)) {
                                removeViewAt(childCount);
                                this.f2700F.add(childAt);
                            }
                        }
                    }

                    /* renamed from: l */
                    void m3427l() {
                        for (int size = this.f2700F.size() - 1; size >= 0; size--) {
                            addView((View) this.f2700F.get(size));
                        }
                        this.f2700F.clear();
                    }

                    /* renamed from: d */
                    private boolean m3406d(View view) {
                        if (view.getParent() != this) {
                            if (this.f2700F.contains(view) == null) {
                                return null;
                            }
                        }
                        return true;
                    }

                    public void setCollapsible(boolean z) {
                        this.f2708N = z;
                        requestLayout();
                    }

                    public void setMenuCallbacks(C0727a c0727a, C0723a c0723a) {
                        this.f2706L = c0727a;
                        this.f2707M = c0723a;
                        if (this.f2714e != null) {
                            this.f2714e.setMenuCallbacks(c0727a, c0723a);
                        }
                    }

                    /* renamed from: s */
                    private void m3413s() {
                        if (this.f2730u == null) {
                            this.f2730u = new ao();
                        }
                    }

                    ActionMenuPresenter getOuterActionMenuPresenter() {
                        return this.f2704J;
                    }

                    Context getPopupContext() {
                        return this.f2721l;
                    }
                }
