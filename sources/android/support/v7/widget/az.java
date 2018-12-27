package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0568v;
import android.support.v4.view.C3173x;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0631e;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0634h;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C3219a;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class az implements C0874w {
    /* renamed from: a */
    Toolbar f13948a;
    /* renamed from: b */
    CharSequence f13949b;
    /* renamed from: c */
    Callback f13950c;
    /* renamed from: d */
    boolean f13951d;
    /* renamed from: e */
    private int f13952e;
    /* renamed from: f */
    private View f13953f;
    /* renamed from: g */
    private View f13954g;
    /* renamed from: h */
    private Drawable f13955h;
    /* renamed from: i */
    private Drawable f13956i;
    /* renamed from: j */
    private Drawable f13957j;
    /* renamed from: k */
    private boolean f13958k;
    /* renamed from: l */
    private CharSequence f13959l;
    /* renamed from: m */
    private CharSequence f13960m;
    /* renamed from: n */
    private ActionMenuPresenter f13961n;
    /* renamed from: o */
    private int f13962o;
    /* renamed from: p */
    private int f13963p;
    /* renamed from: q */
    private Drawable f13964q;

    /* renamed from: android.support.v7.widget.az$1 */
    class C08431 implements OnClickListener {
        /* renamed from: a */
        final C3219a f2852a = new C3219a(this.f2853b.f13948a.getContext(), 0, 16908332, 0, 0, this.f2853b.f13949b);
        /* renamed from: b */
        final /* synthetic */ az f2853b;

        C08431(az azVar) {
            this.f2853b = azVar;
        }

        public void onClick(View view) {
            if (this.f2853b.f13950c != null && this.f2853b.f13951d != null) {
                this.f2853b.f13950c.onMenuItemSelected(0, this.f2852a);
            }
        }
    }

    /* renamed from: b */
    public void mo803b(boolean z) {
    }

    public az(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0634h.abc_action_bar_up_description, C0631e.abc_ic_ab_back_material);
    }

    public az(Toolbar toolbar, boolean z, int i, int i2) {
        this.f13962o = 0;
        this.f13963p = 0;
        this.f13948a = toolbar;
        this.f13949b = toolbar.getTitle();
        this.f13959l = toolbar.getSubtitle();
        this.f13958k = this.f13949b != null;
        this.f13957j = toolbar.getNavigationIcon();
        toolbar = ay.m3543a(toolbar.getContext(), null, C0636j.ActionBar, C0627a.actionBarStyle, 0);
        this.f13964q = toolbar.m3547a(C0636j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence c = toolbar.m3553c(C0636j.ActionBar_title);
            if (!TextUtils.isEmpty(c)) {
                mo802b(c);
            }
            c = toolbar.m3553c(C0636j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(c)) {
                m16790c(c);
            }
            Drawable a = toolbar.m3547a(C0636j.ActionBar_logo);
            if (a == true) {
                m16789c(a);
            }
            a = toolbar.m3547a(C0636j.ActionBar_icon);
            if (a == true) {
                mo792a(a);
            }
            if (!this.f13957j && this.f13964q) {
                mo801b(this.f13964q);
            }
            mo804c(toolbar.m3545a(C0636j.ActionBar_displayOptions, 0));
            z = toolbar.m3560g(C0636j.ActionBar_customNavigationLayout, 0);
            if (z) {
                m16779a(LayoutInflater.from(this.f13948a.getContext()).inflate(z, this.f13948a, false));
                mo804c(this.f13952e | 16);
            }
            z = toolbar.m3558f(C0636j.ActionBar_height, 0);
            if (z <= false) {
                LayoutParams layoutParams = this.f13948a.getLayoutParams();
                layoutParams.height = z;
                this.f13948a.setLayoutParams(layoutParams);
            }
            z = toolbar.m3554d(C0636j.ActionBar_contentInsetStart, -1);
            int d = toolbar.m3554d(C0636j.ActionBar_contentInsetEnd, -1);
            if (z < false || d >= 0) {
                this.f13948a.setContentInsetsRelative(Math.max(z, 0), Math.max(d, 0));
            }
            z = toolbar.m3560g(C0636j.ActionBar_titleTextStyle, 0);
            if (z) {
                this.f13948a.setTitleTextAppearance(this.f13948a.getContext(), z);
            }
            z = toolbar.m3560g(C0636j.ActionBar_subtitleTextStyle, 0);
            if (z) {
                this.f13948a.setSubtitleTextAppearance(this.f13948a.getContext(), z);
            }
            z = toolbar.m3560g(C0636j.ActionBar_popupTheme, 0);
            if (z) {
                this.f13948a.setPopupTheme(z);
            }
        } else {
            this.f13952e = m16768r();
        }
        toolbar.m3548a();
        m16798f(i);
        this.f13960m = this.f13948a.getNavigationContentDescription();
        this.f13948a.setNavigationOnClickListener(new C08431(this));
    }

    /* renamed from: f */
    public void m16798f(int i) {
        if (i != this.f13963p) {
            this.f13963p = i;
            if (TextUtils.isEmpty(this.f13948a.getNavigationContentDescription()) != 0) {
                mo807d(this.f13963p);
            }
        }
    }

    /* renamed from: r */
    private int m16768r() {
        if (this.f13948a.getNavigationIcon() == null) {
            return 11;
        }
        this.f13964q = this.f13948a.getNavigationIcon();
        return 15;
    }

    /* renamed from: a */
    public ViewGroup mo790a() {
        return this.f13948a;
    }

    /* renamed from: b */
    public Context mo799b() {
        return this.f13948a.getContext();
    }

    /* renamed from: c */
    public boolean mo805c() {
        return this.f13948a.m3422g();
    }

    /* renamed from: d */
    public void mo806d() {
        this.f13948a.m3423h();
    }

    /* renamed from: a */
    public void mo796a(Callback callback) {
        this.f13950c = callback;
    }

    /* renamed from: a */
    public void mo797a(CharSequence charSequence) {
        if (!this.f13958k) {
            m16767e(charSequence);
        }
    }

    /* renamed from: e */
    public CharSequence mo808e() {
        return this.f13948a.getTitle();
    }

    /* renamed from: b */
    public void mo802b(CharSequence charSequence) {
        this.f13958k = true;
        m16767e(charSequence);
    }

    /* renamed from: e */
    private void m16767e(CharSequence charSequence) {
        this.f13949b = charSequence;
        if ((this.f13952e & 8) != 0) {
            this.f13948a.setTitle(charSequence);
        }
    }

    /* renamed from: c */
    public void m16790c(CharSequence charSequence) {
        this.f13959l = charSequence;
        if ((this.f13952e & 8) != 0) {
            this.f13948a.setSubtitle(charSequence);
        }
    }

    /* renamed from: f */
    public void mo810f() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: g */
    public void mo811g() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    /* renamed from: a */
    public void mo791a(int i) {
        mo792a(i != 0 ? C0680b.m2703b(mo799b(), i) : 0);
    }

    /* renamed from: a */
    public void mo792a(Drawable drawable) {
        this.f13955h = drawable;
        m16769s();
    }

    /* renamed from: b */
    public void mo800b(int i) {
        m16789c(i != 0 ? C0680b.m2703b(mo799b(), i) : 0);
    }

    /* renamed from: c */
    public void m16789c(Drawable drawable) {
        this.f13956i = drawable;
        m16769s();
    }

    /* renamed from: s */
    private void m16769s() {
        Drawable drawable = (this.f13952e & 2) != 0 ? (this.f13952e & 1) != 0 ? this.f13956i != null ? this.f13956i : this.f13955h : this.f13955h : null;
        this.f13948a.setLogo(drawable);
    }

    /* renamed from: h */
    public boolean mo812h() {
        return this.f13948a.m3416a();
    }

    /* renamed from: i */
    public boolean mo813i() {
        return this.f13948a.m3417b();
    }

    /* renamed from: j */
    public boolean mo814j() {
        return this.f13948a.m3418c();
    }

    /* renamed from: k */
    public boolean mo815k() {
        return this.f13948a.m3419d();
    }

    /* renamed from: l */
    public boolean mo816l() {
        return this.f13948a.m3420e();
    }

    /* renamed from: m */
    public void mo817m() {
        this.f13951d = true;
    }

    /* renamed from: a */
    public void mo795a(Menu menu, C0727a c0727a) {
        if (this.f13961n == null) {
            this.f13961n = new ActionMenuPresenter(this.f13948a.getContext());
            this.f13961n.m16090a(C0632f.action_menu_presenter);
        }
        this.f13961n.mo78a(c0727a);
        this.f13948a.setMenu((C3224h) menu, this.f13961n);
    }

    /* renamed from: n */
    public void mo818n() {
        this.f13948a.m3421f();
    }

    /* renamed from: o */
    public int mo819o() {
        return this.f13952e;
    }

    /* renamed from: c */
    public void mo804c(int i) {
        int i2 = this.f13952e ^ i;
        this.f13952e = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m16771u();
                }
                m16770t();
            }
            if ((i2 & 3) != 0) {
                m16769s();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f13948a.setTitle(this.f13949b);
                    this.f13948a.setSubtitle(this.f13959l);
                } else {
                    this.f13948a.setTitle(null);
                    this.f13948a.setSubtitle(null);
                }
            }
            if ((i2 & 16) != 0 && this.f13954g != null) {
                if ((i & 16) != 0) {
                    this.f13948a.addView(this.f13954g);
                } else {
                    this.f13948a.removeView(this.f13954g);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo794a(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.f13953f != null && this.f13953f.getParent() == this.f13948a) {
            this.f13948a.removeView(this.f13953f);
        }
        this.f13953f = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f13962o == 2) {
            this.f13948a.addView(this.f13953f, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.f13953f.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo798a(boolean z) {
        this.f13948a.setCollapsible(z);
    }

    /* renamed from: p */
    public int mo820p() {
        return this.f13962o;
    }

    /* renamed from: a */
    public void m16779a(View view) {
        if (!(this.f13954g == null || (this.f13952e & 16) == 0)) {
            this.f13948a.removeView(this.f13954g);
        }
        this.f13954g = view;
        if (view != null && (this.f13952e & 16) != null) {
            this.f13948a.addView(this.f13954g);
        }
    }

    /* renamed from: a */
    public C0568v mo789a(final int i, long j) {
        return C0560r.m2199k(this.f13948a).m2236a(i == 0 ? 1.0f : 0.0f).m2237a(j).m2238a(new C3173x(this) {
            /* renamed from: b */
            final /* synthetic */ az f18649b;
            /* renamed from: c */
            private boolean f18650c = null;

            /* renamed from: a */
            public void mo452a(View view) {
                this.f18649b.f13948a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo453b(View view) {
                if (this.f18650c == null) {
                    this.f18649b.f13948a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo454c(View view) {
                this.f18650c = true;
            }
        });
    }

    /* renamed from: b */
    public void mo801b(Drawable drawable) {
        this.f13957j = drawable;
        m16770t();
    }

    /* renamed from: t */
    private void m16770t() {
        if ((this.f13952e & 4) != 0) {
            this.f13948a.setNavigationIcon(this.f13957j != null ? this.f13957j : this.f13964q);
        } else {
            this.f13948a.setNavigationIcon(null);
        }
    }

    /* renamed from: d */
    public void m16794d(CharSequence charSequence) {
        this.f13960m = charSequence;
        m16771u();
    }

    /* renamed from: d */
    public void mo807d(int i) {
        m16794d(i == 0 ? 0 : mo799b().getString(i));
    }

    /* renamed from: u */
    private void m16771u() {
        if ((this.f13952e & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f13960m)) {
            this.f13948a.setNavigationContentDescription(this.f13963p);
        } else {
            this.f13948a.setNavigationContentDescription(this.f13960m);
        }
    }

    /* renamed from: e */
    public void mo809e(int i) {
        this.f13948a.setVisibility(i);
    }

    /* renamed from: a */
    public void mo793a(C0727a c0727a, C0723a c0723a) {
        this.f13948a.setMenuCallbacks(c0727a, c0723a);
    }

    /* renamed from: q */
    public Menu mo821q() {
        return this.f13948a.getMenu();
    }
}
