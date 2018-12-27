package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0568v;
import android.support.v4.view.C0569w;
import android.support.v4.view.C0570y;
import android.support.v4.view.C3173x;
import android.support.v7.app.ActionBar.C0638a;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.C0704a;
import android.support.v7.view.C0706b;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.view.C0712g;
import android.support.v7.view.C0713h;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.C0739a;
import android.support.v7.widget.C0874w;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.o */
public class C3211o extends ActionBar implements C0739a {
    /* renamed from: s */
    static final /* synthetic */ boolean f13455s = (C3211o.class.desiredAssertionStatus() ^ 1);
    /* renamed from: t */
    private static final Interpolator f13456t = new AccelerateInterpolator();
    /* renamed from: u */
    private static final Interpolator f13457u = new DecelerateInterpolator();
    /* renamed from: A */
    private boolean f13458A;
    /* renamed from: B */
    private boolean f13459B;
    /* renamed from: C */
    private ArrayList<C0638a> f13460C = new ArrayList();
    /* renamed from: D */
    private boolean f13461D;
    /* renamed from: E */
    private int f13462E = 0;
    /* renamed from: F */
    private boolean f13463F;
    /* renamed from: G */
    private boolean f13464G = true;
    /* renamed from: H */
    private boolean f13465H;
    /* renamed from: a */
    Context f13466a;
    /* renamed from: b */
    ActionBarOverlayLayout f13467b;
    /* renamed from: c */
    ActionBarContainer f13468c;
    /* renamed from: d */
    C0874w f13469d;
    /* renamed from: e */
    ActionBarContextView f13470e;
    /* renamed from: f */
    View f13471f;
    /* renamed from: g */
    ScrollingTabContainerView f13472g;
    /* renamed from: h */
    C3210a f13473h;
    /* renamed from: i */
    C0706b f13474i;
    /* renamed from: j */
    C0705a f13475j;
    /* renamed from: k */
    boolean f13476k = true;
    /* renamed from: l */
    boolean f13477l;
    /* renamed from: m */
    boolean f13478m;
    /* renamed from: n */
    C0713h f13479n;
    /* renamed from: o */
    boolean f13480o;
    /* renamed from: p */
    final C0569w f13481p = new C44571(this);
    /* renamed from: q */
    final C0569w f13482q = new C44582(this);
    /* renamed from: r */
    final C0570y f13483r = new C32093(this);
    /* renamed from: v */
    private Context f13484v;
    /* renamed from: w */
    private Activity f13485w;
    /* renamed from: x */
    private Dialog f13486x;
    /* renamed from: y */
    private ArrayList<Object> f13487y = new ArrayList();
    /* renamed from: z */
    private int f13488z = -1;

    /* renamed from: android.support.v7.app.o$3 */
    class C32093 implements C0570y {
        /* renamed from: a */
        final /* synthetic */ C3211o f13449a;

        C32093(C3211o c3211o) {
            this.f13449a = c3211o;
        }

        /* renamed from: a */
        public void mo549a(View view) {
            ((View) this.f13449a.f13468c.getParent()).invalidate();
        }
    }

    /* renamed from: android.support.v7.app.o$a */
    public class C3210a extends C0706b implements C0723a {
        /* renamed from: a */
        final /* synthetic */ C3211o f13450a;
        /* renamed from: b */
        private final Context f13451b;
        /* renamed from: c */
        private final C3224h f13452c;
        /* renamed from: d */
        private C0705a f13453d;
        /* renamed from: e */
        private WeakReference<View> f13454e;

        public C3210a(C3211o c3211o, Context context, C0705a c0705a) {
            this.f13450a = c3211o;
            this.f13451b = context;
            this.f13453d = c0705a;
            this.f13452c = new C3224h(context).m16139a(1);
            this.f13452c.mo3835a((C0723a) this);
        }

        /* renamed from: a */
        public MenuInflater mo550a() {
            return new C0712g(this.f13451b);
        }

        /* renamed from: b */
        public Menu mo555b() {
            return this.f13452c;
        }

        /* renamed from: c */
        public void mo558c() {
            if (this.f13450a.f13473h == this) {
                if (C3211o.m15993a(this.f13450a.f13477l, this.f13450a.f13478m, false)) {
                    this.f13453d.mo492a(this);
                } else {
                    this.f13450a.f13474i = this;
                    this.f13450a.f13475j = this.f13453d;
                }
                this.f13453d = null;
                this.f13450a.m16030l(false);
                this.f13450a.f13470e.m16250b();
                this.f13450a.f13469d.mo790a().sendAccessibilityEvent(32);
                this.f13450a.f13467b.setHideOnContentScrollEnabled(this.f13450a.f13480o);
                this.f13450a.f13473h = null;
            }
        }

        /* renamed from: d */
        public void mo559d() {
            if (this.f13450a.f13473h == this) {
                this.f13452c.m16175g();
                try {
                    this.f13453d.mo495b(this, this.f13452c);
                } finally {
                    this.f13452c.m16176h();
                }
            }
        }

        /* renamed from: e */
        public boolean m15987e() {
            this.f13452c.m16175g();
            try {
                boolean a = this.f13453d.mo493a((C0706b) this, this.f13452c);
                return a;
            } finally {
                this.f13452c.m16176h();
            }
        }

        /* renamed from: a */
        public void mo552a(View view) {
            this.f13450a.f13470e.setCustomView(view);
            this.f13454e = new WeakReference(view);
        }

        /* renamed from: a */
        public void mo553a(CharSequence charSequence) {
            this.f13450a.f13470e.setSubtitle(charSequence);
        }

        /* renamed from: b */
        public void mo557b(CharSequence charSequence) {
            this.f13450a.f13470e.setTitle(charSequence);
        }

        /* renamed from: a */
        public void mo551a(int i) {
            mo557b(this.f13450a.f13466a.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo556b(int i) {
            mo553a(this.f13450a.f13466a.getResources().getString(i));
        }

        /* renamed from: f */
        public CharSequence mo560f() {
            return this.f13450a.f13470e.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo561g() {
            return this.f13450a.f13470e.getSubtitle();
        }

        /* renamed from: a */
        public void mo554a(boolean z) {
            super.mo554a(z);
            this.f13450a.f13470e.setTitleOptional(z);
        }

        /* renamed from: h */
        public boolean mo562h() {
            return this.f13450a.f13470e.m16252d();
        }

        /* renamed from: i */
        public View mo563i() {
            return this.f13454e != null ? (View) this.f13454e.get() : null;
        }

        /* renamed from: a */
        public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
            return this.f13453d != null ? this.f13453d.mo494a((C0706b) this, menuItem) : null;
        }

        /* renamed from: a */
        public void mo101a(C3224h c3224h) {
            if (this.f13453d != null) {
                mo559d();
                this.f13450a.f13470e.mo617a();
            }
        }
    }

    /* renamed from: android.support.v7.app.o$1 */
    class C44571 extends C3173x {
        /* renamed from: a */
        final /* synthetic */ C3211o f18487a;

        C44571(C3211o c3211o) {
            this.f18487a = c3211o;
        }

        /* renamed from: b */
        public void mo453b(View view) {
            if (!(this.f18487a.f13476k == null || this.f18487a.f13471f == null)) {
                this.f18487a.f13471f.setTranslationY(0.0f);
                this.f18487a.f13468c.setTranslationY(0.0f);
            }
            this.f18487a.f13468c.setVisibility(8);
            this.f18487a.f13468c.setTransitioning(false);
            this.f18487a.f13479n = null;
            this.f18487a.m16021h();
            if (this.f18487a.f13467b != null) {
                C0560r.m2204p(this.f18487a.f13467b);
            }
        }
    }

    /* renamed from: android.support.v7.app.o$2 */
    class C44582 extends C3173x {
        /* renamed from: a */
        final /* synthetic */ C3211o f18488a;

        C44582(C3211o c3211o) {
            this.f18488a = c3211o;
        }

        /* renamed from: b */
        public void mo453b(View view) {
            this.f18488a.f13479n = null;
            this.f18488a.f13468c.requestLayout();
        }
    }

    /* renamed from: a */
    static boolean m15993a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (!z) {
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo571m() {
    }

    public C3211o(Activity activity, boolean z) {
        this.f13485w = activity;
        View decorView = activity.getWindow().getDecorView();
        m15992a(decorView);
        if (!z) {
            this.f13471f = decorView.findViewById(true);
        }
    }

    public C3211o(Dialog dialog) {
        this.f13486x = dialog;
        m15992a(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    private void m15992a(View view) {
        this.f13467b = (ActionBarOverlayLayout) view.findViewById(C0632f.decor_content_parent);
        if (this.f13467b != null) {
            this.f13467b.setActionBarVisibilityCallback(this);
        }
        this.f13469d = m15994b(view.findViewById(C0632f.action_bar));
        this.f13470e = (ActionBarContextView) view.findViewById(C0632f.action_context_bar);
        this.f13468c = (ActionBarContainer) view.findViewById(C0632f.action_bar_container);
        if (this.f13469d == null || this.f13470e == null || this.f13468c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" can only be used ");
            stringBuilder.append("with a compatible window decor layout");
            throw new IllegalStateException(stringBuilder.toString());
        }
        int dimensionPixelSize;
        this.f13466a = this.f13469d.mo799b();
        view = (this.f13469d.mo819o() & 4) != null ? true : null;
        if (view != null) {
            this.f13458A = true;
        }
        C0704a a = C0704a.m2754a(this.f13466a);
        if (!a.m2760f()) {
            if (view == null) {
                view = null;
                mo541d(view);
                m15995m(a.m2758d());
                view = this.f13466a.obtainStyledAttributes(null, C0636j.ActionBar, C0627a.actionBarStyle, 0);
                if (view.getBoolean(C0636j.ActionBar_hideOnContentScroll, false)) {
                    mo566e(true);
                }
                dimensionPixelSize = view.getDimensionPixelSize(C0636j.ActionBar_elevation, 0);
                if (dimensionPixelSize != 0) {
                    mo527a((float) dimensionPixelSize);
                }
                view.recycle();
            }
        }
        view = true;
        mo541d(view);
        m15995m(a.m2758d());
        view = this.f13466a.obtainStyledAttributes(null, C0636j.ActionBar, C0627a.actionBarStyle, 0);
        if (view.getBoolean(C0636j.ActionBar_hideOnContentScroll, false)) {
            mo566e(true);
        }
        dimensionPixelSize = view.getDimensionPixelSize(C0636j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo527a((float) dimensionPixelSize);
        }
        view.recycle();
    }

    /* renamed from: b */
    private C0874w m15994b(View view) {
        if (view instanceof C0874w) {
            return (C0874w) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Can't make a decor toolbar out of ");
        stringBuilder.append(view);
        throw new IllegalStateException(stringBuilder.toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: a */
    public void mo527a(float f) {
        C0560r.m2166a(this.f13468c, f);
    }

    /* renamed from: a */
    public void mo529a(Configuration configuration) {
        m15995m(C0704a.m2754a(this.f13466a).m2758d());
    }

    /* renamed from: m */
    private void m15995m(boolean z) {
        this.f13461D = z;
        if (this.f13461D) {
            this.f13468c.setTabContainer(null);
            this.f13469d.mo794a(this.f13472g);
        } else {
            this.f13469d.mo794a(null);
            this.f13468c.setTabContainer(this.f13472g);
        }
        boolean z2 = true;
        z = m16023i();
        if (this.f13472g != null) {
            if (z) {
                this.f13472g.setVisibility(0);
                if (this.f13467b != null) {
                    C0560r.m2204p(this.f13467b);
                }
            } else {
                this.f13472g.setVisibility(8);
            }
        }
        C0874w c0874w = this.f13469d;
        boolean z3 = !this.f13461D && z;
        c0874w.mo798a(z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f13467b;
        if (this.f13461D || !z) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: h */
    void m16021h() {
        if (this.f13475j != null) {
            this.f13475j.mo492a(this.f13474i);
            this.f13474i = null;
            this.f13475j = null;
        }
    }

    /* renamed from: c */
    public void mo565c(int i) {
        this.f13462E = i;
    }

    /* renamed from: g */
    public void mo547g(boolean z) {
        this.f13465H = z;
        if (!z && this.f13479n) {
            this.f13479n.m2808c();
        }
    }

    /* renamed from: h */
    public void mo548h(boolean z) {
        if (z != this.f13459B) {
            this.f13459B = z;
            int size = this.f13460C.size();
            for (int i = 0; i < size; i++) {
                ((C0638a) this.f13460C.get(i)).m2536a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo532a(boolean z) {
        m16004a(z ? true : false, 2);
    }

    /* renamed from: b */
    public void mo538b(boolean z) {
        m16004a(z ? true : false, 4);
    }

    /* renamed from: c */
    public void mo539c(boolean z) {
        m16004a(z ? true : false, 8);
    }

    /* renamed from: d */
    public void mo541d(boolean z) {
        this.f13469d.mo803b(z);
    }

    /* renamed from: a */
    public void mo528a(int i) {
        mo531a(this.f13466a.getString(i));
    }

    /* renamed from: a */
    public void mo531a(CharSequence charSequence) {
        this.f13469d.mo802b(charSequence);
    }

    /* renamed from: b */
    public void mo537b(CharSequence charSequence) {
        this.f13469d.mo797a(charSequence);
    }

    /* renamed from: a */
    public void m16004a(int i, int i2) {
        int o = this.f13469d.mo819o();
        if ((i2 & 4) != 0) {
            this.f13458A = true;
        }
        this.f13469d.mo804c((i & i2) | ((i2 ^ -1) & o));
    }

    /* renamed from: i */
    public int m16023i() {
        return this.f13469d.mo820p();
    }

    /* renamed from: a */
    public int mo526a() {
        return this.f13469d.mo819o();
    }

    /* renamed from: a */
    public C0706b mo564a(C0705a c0705a) {
        if (this.f13473h != null) {
            this.f13473h.mo558c();
        }
        this.f13467b.setHideOnContentScrollEnabled(false);
        this.f13470e.m16251c();
        C0706b c3210a = new C3210a(this, this.f13470e.getContext(), c0705a);
        if (c3210a.m15987e() == null) {
            return null;
        }
        this.f13473h = c3210a;
        c3210a.mo559d();
        this.f13470e.m16248a(c3210a);
        m16030l(true);
        this.f13470e.sendAccessibilityEvent(32);
        return c3210a;
    }

    /* renamed from: i */
    public void mo567i(boolean z) {
        this.f13476k = z;
    }

    /* renamed from: n */
    private void m15996n() {
        if (!this.f13463F) {
            this.f13463F = true;
            if (this.f13467b != null) {
                this.f13467b.setShowingForActionMode(true);
            }
            m15997n(false);
        }
    }

    /* renamed from: j */
    public void mo568j() {
        if (this.f13478m) {
            this.f13478m = false;
            m15997n(true);
        }
    }

    /* renamed from: o */
    private void m15998o() {
        if (this.f13463F) {
            this.f13463F = false;
            if (this.f13467b != null) {
                this.f13467b.setShowingForActionMode(false);
            }
            m15997n(false);
        }
    }

    /* renamed from: k */
    public void mo569k() {
        if (!this.f13478m) {
            this.f13478m = true;
            m15997n(true);
        }
    }

    /* renamed from: e */
    public void mo566e(boolean z) {
        if (z) {
            if (!this.f13467b.m16263a()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        this.f13480o = z;
        this.f13467b.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: n */
    private void m15997n(boolean z) {
        if (C3211o.m15993a(this.f13477l, this.f13478m, this.f13463F)) {
            if (!this.f13464G) {
                this.f13464G = true;
                m16026j(z);
            }
        } else if (this.f13464G) {
            this.f13464G = false;
            m16028k(z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: j */
    public void m16026j(boolean r5) {
        /*
        r4 = this;
        r0 = r4.f13479n;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r4.f13479n;
        r0.m2808c();
    L_0x0009:
        r0 = r4.f13468c;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r4.f13462E;
        r1 = 0;
        if (r0 != 0) goto L_0x0084;
    L_0x0014:
        r0 = r4.f13465H;
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        if (r5 == 0) goto L_0x0084;
    L_0x001a:
        r0 = r4.f13468c;
        r0.setTranslationY(r1);
        r0 = r4.f13468c;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = (float) r0;
        if (r5 == 0) goto L_0x0039;
    L_0x0029:
        r5 = 2;
        r5 = new int[r5];
        r5 = {0, 0};
        r2 = r4.f13468c;
        r2.getLocationInWindow(r5);
        r2 = 1;
        r5 = r5[r2];
        r5 = (float) r5;
        r0 = r0 - r5;
    L_0x0039:
        r5 = r4.f13468c;
        r5.setTranslationY(r0);
        r5 = new android.support.v7.view.h;
        r5.<init>();
        r2 = r4.f13468c;
        r2 = android.support.v4.view.C0560r.m2199k(r2);
        r2 = r2.m2241b(r1);
        r3 = r4.f13483r;
        r2.m2239a(r3);
        r5.m2802a(r2);
        r2 = r4.f13476k;
        if (r2 == 0) goto L_0x006f;
    L_0x0059:
        r2 = r4.f13471f;
        if (r2 == 0) goto L_0x006f;
    L_0x005d:
        r2 = r4.f13471f;
        r2.setTranslationY(r0);
        r0 = r4.f13471f;
        r0 = android.support.v4.view.C0560r.m2199k(r0);
        r0 = r0.m2241b(r1);
        r5.m2802a(r0);
    L_0x006f:
        r0 = f13457u;
        r5.m2805a(r0);
        r0 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r5.m2801a(r0);
        r0 = r4.f13482q;
        r5.m2804a(r0);
        r4.f13479n = r5;
        r5.m2806a();
        goto L_0x00a3;
    L_0x0084:
        r5 = r4.f13468c;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5.setAlpha(r0);
        r5 = r4.f13468c;
        r5.setTranslationY(r1);
        r5 = r4.f13476k;
        if (r5 == 0) goto L_0x009d;
    L_0x0094:
        r5 = r4.f13471f;
        if (r5 == 0) goto L_0x009d;
    L_0x0098:
        r5 = r4.f13471f;
        r5.setTranslationY(r1);
    L_0x009d:
        r5 = r4.f13482q;
        r0 = 0;
        r5.mo453b(r0);
    L_0x00a3:
        r5 = r4.f13467b;
        if (r5 == 0) goto L_0x00ac;
    L_0x00a7:
        r5 = r4.f13467b;
        android.support.v4.view.C0560r.m2204p(r5);
    L_0x00ac:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.o.j(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: k */
    public void m16028k(boolean r5) {
        /*
        r4 = this;
        r0 = r4.f13479n;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r4.f13479n;
        r0.m2808c();
    L_0x0009:
        r0 = r4.f13462E;
        if (r0 != 0) goto L_0x007a;
    L_0x000d:
        r0 = r4.f13465H;
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        if (r5 == 0) goto L_0x007a;
    L_0x0013:
        r0 = r4.f13468c;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.setAlpha(r1);
        r0 = r4.f13468c;
        r1 = 1;
        r0.setTransitioning(r1);
        r0 = new android.support.v7.view.h;
        r0.<init>();
        r2 = r4.f13468c;
        r2 = r2.getHeight();
        r2 = -r2;
        r2 = (float) r2;
        if (r5 == 0) goto L_0x003e;
    L_0x002f:
        r5 = 2;
        r5 = new int[r5];
        r5 = {0, 0};
        r3 = r4.f13468c;
        r3.getLocationInWindow(r5);
        r5 = r5[r1];
        r5 = (float) r5;
        r2 = r2 - r5;
    L_0x003e:
        r5 = r4.f13468c;
        r5 = android.support.v4.view.C0560r.m2199k(r5);
        r5 = r5.m2241b(r2);
        r1 = r4.f13483r;
        r5.m2239a(r1);
        r0.m2802a(r5);
        r5 = r4.f13476k;
        if (r5 == 0) goto L_0x0065;
    L_0x0054:
        r5 = r4.f13471f;
        if (r5 == 0) goto L_0x0065;
    L_0x0058:
        r5 = r4.f13471f;
        r5 = android.support.v4.view.C0560r.m2199k(r5);
        r5 = r5.m2241b(r2);
        r0.m2802a(r5);
    L_0x0065:
        r5 = f13456t;
        r0.m2805a(r5);
        r1 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r0.m2801a(r1);
        r5 = r4.f13481p;
        r0.m2804a(r5);
        r4.f13479n = r0;
        r0.m2806a();
        goto L_0x0080;
    L_0x007a:
        r5 = r4.f13481p;
        r0 = 0;
        r5.mo453b(r0);
    L_0x0080:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.o.k(boolean):void");
    }

    /* renamed from: l */
    public void m16030l(boolean z) {
        if (z) {
            m15996n();
        } else {
            m15998o();
        }
        if (m15999p()) {
            C0568v a;
            if (z) {
                z = this.f13469d.mo789a(4, 100);
                a = this.f13470e.mo616a(0, 200);
            } else {
                a = this.f13469d.mo789a(0, 200);
                z = this.f13470e.mo616a(8, 100);
            }
            C0713h c0713h = new C0713h();
            c0713h.m2803a(z, a);
            c0713h.m2806a();
        } else if (z) {
            this.f13469d.mo809e(4);
            this.f13470e.setVisibility(0);
        } else {
            this.f13469d.mo809e(0);
            this.f13470e.setVisibility(8);
        }
    }

    /* renamed from: p */
    private boolean m15999p() {
        return C0560r.m2212x(this.f13468c);
    }

    /* renamed from: b */
    public Context mo535b() {
        if (this.f13484v == null) {
            TypedValue typedValue = new TypedValue();
            this.f13466a.getTheme().resolveAttribute(C0627a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f13484v = new ContextThemeWrapper(this.f13466a, i);
            } else {
                this.f13484v = this.f13466a;
            }
        }
        return this.f13484v;
    }

    /* renamed from: a */
    public void mo530a(Drawable drawable) {
        this.f13469d.mo801b(drawable);
    }

    /* renamed from: b */
    public void mo536b(int i) {
        this.f13469d.mo807d(i);
    }

    /* renamed from: l */
    public void mo570l() {
        if (this.f13479n != null) {
            this.f13479n.m2808c();
            this.f13479n = null;
        }
    }

    /* renamed from: f */
    public boolean mo545f() {
        if (this.f13469d == null || !this.f13469d.mo805c()) {
            return false;
        }
        this.f13469d.mo806d();
        return true;
    }

    /* renamed from: f */
    public void mo544f(boolean z) {
        if (!this.f13458A) {
            mo538b(z);
        }
    }

    /* renamed from: a */
    public boolean mo533a(int i, KeyEvent keyEvent) {
        if (this.f13473h == null) {
            return false;
        }
        Menu b = this.f13473h.mo555b();
        if (b == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        b.setQwertyMode(z);
        return b.performShortcut(i, keyEvent, 0);
    }
}
