package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.v4.app.C0364v;
import android.support.v4.view.C0545d;
import android.support.v4.view.C0554n;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0568v;
import android.support.v4.view.C0571z;
import android.support.v4.view.C3173x;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0629c;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.p020a.C0637a.C0635i;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.p022c.p023a.C0680b;
import android.support.v7.view.C0706b;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.view.C0708d;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.view.menu.C0730p;
import android.support.v7.view.menu.C3223f;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.C0862h;
import android.support.v7.widget.C0873v;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.C0754a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ab;
import android.support.v7.widget.ab.C0835a;
import android.support.v7.widget.bd;
import android.support.v7.widget.bg;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImplV9 extends C3202f implements C0723a, Factory2 {
    /* renamed from: t */
    private static final boolean f18459t = (VERSION.SDK_INT < 21);
    /* renamed from: A */
    private View f18460A;
    /* renamed from: B */
    private boolean f18461B;
    /* renamed from: C */
    private boolean f18462C;
    /* renamed from: D */
    private boolean f18463D;
    /* renamed from: E */
    private PanelFeatureState[] f18464E;
    /* renamed from: F */
    private PanelFeatureState f18465F;
    /* renamed from: G */
    private boolean f18466G;
    /* renamed from: H */
    private final Runnable f18467H = new C06521(this);
    /* renamed from: I */
    private boolean f18468I;
    /* renamed from: J */
    private Rect f18469J;
    /* renamed from: K */
    private Rect f18470K;
    /* renamed from: L */
    private AppCompatViewInflater f18471L;
    /* renamed from: m */
    C0706b f18472m;
    /* renamed from: n */
    ActionBarContextView f18473n;
    /* renamed from: o */
    PopupWindow f18474o;
    /* renamed from: p */
    Runnable f18475p;
    /* renamed from: q */
    C0568v f18476q = null;
    /* renamed from: r */
    boolean f18477r;
    /* renamed from: s */
    int f18478s;
    /* renamed from: u */
    private C0873v f18479u;
    /* renamed from: v */
    private C3192a f18480v;
    /* renamed from: w */
    private C3195d f18481w;
    /* renamed from: x */
    private boolean f18482x;
    /* renamed from: y */
    private ViewGroup f18483y;
    /* renamed from: z */
    private TextView f18484z;

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$1 */
    class C06521 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f2110a;

        C06521(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2110a = appCompatDelegateImplV9;
        }

        public void run() {
            if ((this.f2110a.f18478s & 1) != 0) {
                this.f2110a.m24404f(0);
            }
            if ((this.f2110a.f18478s & 4096) != 0) {
                this.f2110a.m24404f(108);
            }
            this.f2110a.f18477r = false;
            this.f2110a.f18478s = 0;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$5 */
    class C06535 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f2111a;

        /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$5$1 */
        class C44521 extends C3173x {
            /* renamed from: a */
            final /* synthetic */ C06535 f18456a;

            C44521(C06535 c06535) {
                this.f18456a = c06535;
            }

            /* renamed from: a */
            public void mo452a(View view) {
                this.f18456a.f2111a.f18473n.setVisibility(0);
            }

            /* renamed from: b */
            public void mo453b(View view) {
                this.f18456a.f2111a.f18473n.setAlpha(1.0f);
                this.f18456a.f2111a.f18476q.m2238a(null);
                this.f18456a.f2111a.f18476q = null;
            }
        }

        C06535(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f2111a = appCompatDelegateImplV9;
        }

        public void run() {
            this.f2111a.f18474o.showAtLocation(this.f2111a.f18473n, 55, 0, 0);
            this.f2111a.m24410u();
            if (this.f2111a.m24409t()) {
                this.f2111a.f18473n.setAlpha(0.0f);
                this.f2111a.f18476q = C0560r.m2199k(this.f2111a.f18473n).m2236a(1.0f);
                this.f2111a.f18476q.m2238a(new C44521(this));
                return;
            }
            this.f2111a.f18473n.setAlpha(1.0f);
            this.f2111a.f18473n.setVisibility(0);
        }
    }

    protected static final class PanelFeatureState {
        /* renamed from: a */
        int f2115a;
        /* renamed from: b */
        int f2116b;
        /* renamed from: c */
        int f2117c;
        /* renamed from: d */
        int f2118d;
        /* renamed from: e */
        int f2119e;
        /* renamed from: f */
        int f2120f;
        /* renamed from: g */
        ViewGroup f2121g;
        /* renamed from: h */
        View f2122h;
        /* renamed from: i */
        View f2123i;
        /* renamed from: j */
        C3224h f2124j;
        /* renamed from: k */
        C3223f f2125k;
        /* renamed from: l */
        Context f2126l;
        /* renamed from: m */
        boolean f2127m;
        /* renamed from: n */
        boolean f2128n;
        /* renamed from: o */
        boolean f2129o;
        /* renamed from: p */
        public boolean f2130p;
        /* renamed from: q */
        boolean f2131q = false;
        /* renamed from: r */
        boolean f2132r;
        /* renamed from: s */
        Bundle f2133s;

        private static class SavedState implements Parcelable {
            public static final Creator<SavedState> CREATOR = new C06541();
            /* renamed from: a */
            int f2112a;
            /* renamed from: b */
            boolean f2113b;
            /* renamed from: c */
            Bundle f2114c;

            /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$PanelFeatureState$SavedState$1 */
            static class C06541 implements ClassLoaderCreator<SavedState> {
                C06541() {
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return m2595a(parcel);
                }

                public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return m2596a(parcel, classLoader);
                }

                public /* synthetic */ Object[] newArray(int i) {
                    return m2597a(i);
                }

                /* renamed from: a */
                public SavedState m2596a(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m2598a(parcel, classLoader);
                }

                /* renamed from: a */
                public SavedState m2595a(Parcel parcel) {
                    return SavedState.m2598a(parcel, null);
                }

                /* renamed from: a */
                public SavedState[] m2597a(int i) {
                    return new SavedState[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2112a);
                parcel.writeInt(this.f2113b);
                if (this.f2113b != 0) {
                    parcel.writeBundle(this.f2114c);
                }
            }

            /* renamed from: a */
            static SavedState m2598a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f2112a = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f2113b = z;
                if (savedState.f2113b) {
                    savedState.f2114c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }

        PanelFeatureState(int i) {
            this.f2115a = i;
        }

        /* renamed from: a */
        public boolean m2602a() {
            boolean z = false;
            if (this.f2122h == null) {
                return false;
            }
            if (this.f2123i != null) {
                return true;
            }
            if (this.f2125k.m16127d().getCount() > 0) {
                z = true;
            }
            return z;
        }

        /* renamed from: a */
        void m2600a(Context context) {
            TypedValue typedValue = new TypedValue();
            Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0627a.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C0627a.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C0635i.Theme_AppCompat_CompactMenu, true);
            }
            Context c0708d = new C0708d(context, 0);
            c0708d.getTheme().setTo(newTheme);
            this.f2126l = c0708d;
            context = c0708d.obtainStyledAttributes(C0636j.AppCompatTheme);
            this.f2116b = context.getResourceId(C0636j.AppCompatTheme_panelBackground, 0);
            this.f2120f = context.getResourceId(C0636j.AppCompatTheme_android_windowAnimationStyle, 0);
            context.recycle();
        }

        /* renamed from: a */
        void m2601a(C3224h c3224h) {
            if (c3224h != this.f2124j) {
                if (this.f2124j != null) {
                    this.f2124j.m16160b(this.f2125k);
                }
                this.f2124j = c3224h;
                if (!(c3224h == null || this.f2125k == null)) {
                    c3224h.m16149a(this.f2125k);
                }
            }
        }

        /* renamed from: a */
        C0730p m2599a(C0727a c0727a) {
            if (this.f2124j == null) {
                return null;
            }
            if (this.f2125k == null) {
                this.f2125k = new C3223f(this.f2126l, C0633g.abc_list_menu_item_layout);
                this.f2125k.mo78a(c0727a);
                this.f2124j.m16149a(this.f2125k);
            }
            return this.f2125k.m16113a(this.f2121g);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$2 */
    class C31892 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13391a;

        C31892(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13391a = appCompatDelegateImplV9;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            int b = c0571z.m2253b();
            int g = this.f13391a.m24405g(b);
            if (b != g) {
                c0571z = c0571z.m2252a(c0571z.m2251a(), g, c0571z.m2254c(), c0571z.m2255d());
            }
            return C0560r.m2165a(view, c0571z);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$3 */
    class C31903 implements C0835a {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13392a;

        C31903(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13392a = appCompatDelegateImplV9;
        }

        /* renamed from: a */
        public void mo487a(Rect rect) {
            rect.top = this.f13392a.m24405g(rect.top);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$4 */
    class C31914 implements C0754a {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13393a;

        /* renamed from: a */
        public void mo488a() {
        }

        C31914(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13393a = appCompatDelegateImplV9;
        }

        /* renamed from: b */
        public void mo489b() {
            this.f13393a.m24412w();
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$a */
    private final class C3192a implements C0727a {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13394a;

        C3192a(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13394a = appCompatDelegateImplV9;
        }

        /* renamed from: a */
        public boolean mo491a(C3224h c3224h) {
            Callback r = this.f13394a.m15934r();
            if (r != null) {
                r.onMenuOpened(108, c3224h);
            }
            return true;
        }

        /* renamed from: a */
        public void mo490a(C3224h c3224h, boolean z) {
            this.f13394a.m24393b(c3224h);
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$b */
    class C3193b implements C0705a {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13395a;
        /* renamed from: b */
        private C0705a f13396b;

        /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$b$1 */
        class C44541 extends C3173x {
            /* renamed from: a */
            final /* synthetic */ C3193b f18458a;

            C44541(C3193b c3193b) {
                this.f18458a = c3193b;
            }

            /* renamed from: b */
            public void mo453b(View view) {
                this.f18458a.f13395a.f18473n.setVisibility(8);
                if (this.f18458a.f13395a.f18474o != null) {
                    this.f18458a.f13395a.f18474o.dismiss();
                } else if ((this.f18458a.f13395a.f18473n.getParent() instanceof View) != null) {
                    C0560r.m2204p((View) this.f18458a.f13395a.f18473n.getParent());
                }
                this.f18458a.f13395a.f18473n.removeAllViews();
                this.f18458a.f13395a.f18476q.m2238a(null);
                this.f18458a.f13395a.f18476q = null;
            }
        }

        public C3193b(AppCompatDelegateImplV9 appCompatDelegateImplV9, C0705a c0705a) {
            this.f13395a = appCompatDelegateImplV9;
            this.f13396b = c0705a;
        }

        /* renamed from: a */
        public boolean mo493a(C0706b c0706b, Menu menu) {
            return this.f13396b.mo493a(c0706b, menu);
        }

        /* renamed from: b */
        public boolean mo495b(C0706b c0706b, Menu menu) {
            return this.f13396b.mo495b(c0706b, menu);
        }

        /* renamed from: a */
        public boolean mo494a(C0706b c0706b, MenuItem menuItem) {
            return this.f13396b.mo494a(c0706b, menuItem);
        }

        /* renamed from: a */
        public void mo492a(C0706b c0706b) {
            this.f13396b.mo492a(c0706b);
            if (this.f13395a.f18474o != null) {
                this.f13395a.b.getDecorView().removeCallbacks(this.f13395a.f18475p);
            }
            if (this.f13395a.f18473n != null) {
                this.f13395a.m24410u();
                this.f13395a.f18476q = C0560r.m2199k(this.f13395a.f18473n).m2236a(0.0f);
                this.f13395a.f18476q.m2238a(new C44541(this));
            }
            if (this.f13395a.e != null) {
                this.f13395a.e.mo523b(this.f13395a.f18472m);
            }
            this.f13395a.f18472m = null;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$c */
    private class C3194c extends ContentFrameLayout {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13397a;

        public C3194c(AppCompatDelegateImplV9 appCompatDelegateImplV9, Context context) {
            this.f13397a = appCompatDelegateImplV9;
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!this.f13397a.mo3805a(keyEvent)) {
                if (super.dispatchKeyEvent(keyEvent) == null) {
                    return null;
                }
            }
            return true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m15879a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f13397a.m24402e(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C0680b.m2703b(getContext(), i));
        }

        /* renamed from: a */
        private boolean m15879a(int i, int i2) {
            if (i >= -5 && i2 >= -5 && i <= getWidth() + 5) {
                if (i2 <= getHeight() + 5) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$d */
    private final class C3195d implements C0727a {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f13398a;

        C3195d(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f13398a = appCompatDelegateImplV9;
        }

        /* renamed from: a */
        public void mo490a(C3224h c3224h, boolean z) {
            Menu menu;
            C3224h p = c3224h.mo3841p();
            Object obj = p != c3224h ? 1 : null;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = this.f13398a;
            if (obj != null) {
                menu = p;
            }
            PanelFeatureState a = appCompatDelegateImplV9.m24372a(menu);
            if (a == null) {
                return;
            }
            if (obj != null) {
                this.f13398a.m24376a(a.f2115a, a, p);
                this.f13398a.m24380a(a, true);
                return;
            }
            this.f13398a.m24380a(a, z);
        }

        /* renamed from: a */
        public boolean mo491a(C3224h c3224h) {
            if (c3224h == null && this.f13398a.h) {
                Callback r = this.f13398a.m15934r();
                if (!(r == null || this.f13398a.m15933q())) {
                    r.onMenuOpened(108, c3224h);
                }
            }
            return true;
        }
    }

    /* renamed from: android.support.v7.app.AppCompatDelegateImplV9$6 */
    class C44536 extends C3173x {
        /* renamed from: a */
        final /* synthetic */ AppCompatDelegateImplV9 f18457a;

        C44536(AppCompatDelegateImplV9 appCompatDelegateImplV9) {
            this.f18457a = appCompatDelegateImplV9;
        }

        /* renamed from: a */
        public void mo452a(View view) {
            this.f18457a.f18473n.setVisibility(0);
            this.f18457a.f18473n.sendAccessibilityEvent(32);
            if ((this.f18457a.f18473n.getParent() instanceof View) != null) {
                C0560r.m2204p((View) this.f18457a.f18473n.getParent());
            }
        }

        /* renamed from: b */
        public void mo453b(View view) {
            this.f18457a.f18473n.setAlpha(1.0f);
            this.f18457a.f18476q.m2238a(null);
            this.f18457a.f18476q = null;
        }
    }

    /* renamed from: a */
    void m24385a(ViewGroup viewGroup) {
    }

    AppCompatDelegateImplV9(Context context, Window window, C0662d c0662d) {
        super(context, window, c0662d);
    }

    /* renamed from: a */
    public void mo3800a(Bundle bundle) {
        if ((this.c instanceof Activity) != null && C0364v.m1329b((Activity) this.c) != null) {
            bundle = m15930n();
            if (bundle == null) {
                this.f18468I = true;
            } else {
                bundle.mo544f(true);
            }
        }
    }

    /* renamed from: b */
    public void mo3807b(Bundle bundle) {
        m24368x();
    }

    /* renamed from: m */
    public void mo3815m() {
        m24368x();
        if (this.h) {
            if (this.f == null) {
                if (this.c instanceof Activity) {
                    this.f = new C3211o((Activity) this.c, this.i);
                } else if (this.c instanceof Dialog) {
                    this.f = new C3211o((Dialog) this.c);
                }
                if (this.f != null) {
                    this.f.mo544f(this.f18468I);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3801a(Toolbar toolbar) {
        if (this.c instanceof Activity) {
            ActionBar a = mo512a();
            if (a instanceof C3211o) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.g = null;
            if (a != null) {
                a.mo546g();
            }
            if (toolbar != null) {
                a = new C3208l(toolbar, ((Activity) this.c).getTitle(), this.d);
                this.f = a;
                this.b.setCallback(a.m15971h());
            } else {
                this.f = null;
                this.b.setCallback(this.d);
            }
            mo3813f();
        }
    }

    /* renamed from: a */
    public <T extends View> T mo3797a(int i) {
        m24368x();
        return this.b.findViewById(i);
    }

    /* renamed from: a */
    public void mo3799a(Configuration configuration) {
        if (this.h && this.f18482x) {
            ActionBar a = mo512a();
            if (a != null) {
                a.mo529a(configuration);
            }
        }
        C0862h.m3671a().m3693a(this.a);
        mo520j();
    }

    /* renamed from: d */
    public void mo517d() {
        ActionBar a = mo512a();
        if (a != null) {
            a.mo547g(false);
        }
    }

    /* renamed from: e */
    public void mo3812e() {
        ActionBar a = mo512a();
        if (a != null) {
            a.mo547g(true);
        }
    }

    /* renamed from: a */
    public void mo3802a(View view) {
        m24368x();
        ViewGroup viewGroup = (ViewGroup) this.f18483y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c.onContentChanged();
    }

    /* renamed from: b */
    public void mo3806b(int i) {
        m24368x();
        ViewGroup viewGroup = (ViewGroup) this.f18483y.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a).inflate(i, viewGroup);
        this.c.onContentChanged();
    }

    /* renamed from: a */
    public void mo3803a(View view, LayoutParams layoutParams) {
        m24368x();
        ViewGroup viewGroup = (ViewGroup) this.f18483y.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c.onContentChanged();
    }

    /* renamed from: b */
    public void mo3808b(View view, LayoutParams layoutParams) {
        m24368x();
        ((ViewGroup) this.f18483y.findViewById(16908290)).addView(view, layoutParams);
        this.c.onContentChanged();
    }

    /* renamed from: g */
    public void mo518g() {
        if (this.f18477r) {
            this.b.getDecorView().removeCallbacks(this.f18467H);
        }
        super.mo518g();
        if (this.f != null) {
            this.f.mo546g();
        }
    }

    /* renamed from: x */
    private void m24368x() {
        if (!this.f18482x) {
            this.f18483y = m24369y();
            CharSequence s = m15935s();
            if (!TextUtils.isEmpty(s)) {
                mo3809b(s);
            }
            m24370z();
            m24385a(this.f18483y);
            this.f18482x = true;
            PanelFeatureState a = m24371a(0, false);
            if (!m15933q()) {
                if (a == null || a.f2124j == null) {
                    mo4610d(108);
                }
            }
        }
    }

    /* renamed from: y */
    private ViewGroup m24369y() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C0636j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(C0636j.AppCompatTheme_windowActionBar)) {
            View view;
            if (obtainStyledAttributes.getBoolean(C0636j.AppCompatTheme_windowNoTitle, false)) {
                mo3811c(1);
            } else if (obtainStyledAttributes.getBoolean(C0636j.AppCompatTheme_windowActionBar, false)) {
                mo3811c(108);
            }
            if (obtainStyledAttributes.getBoolean(C0636j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo3811c(109);
            }
            if (obtainStyledAttributes.getBoolean(C0636j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo3811c(10);
            }
            this.k = obtainStyledAttributes.getBoolean(C0636j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            this.b.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.a);
            if (this.l) {
                if (this.j) {
                    view = (ViewGroup) from.inflate(C0633g.abc_screen_simple_overlay_action_mode, null);
                } else {
                    view = (ViewGroup) from.inflate(C0633g.abc_screen_simple, null);
                }
                if (VERSION.SDK_INT >= 21) {
                    C0560r.m2176a(view, new C31892(this));
                } else {
                    ((ab) view).setOnFitSystemWindowsListener(new C31903(this));
                }
            } else if (this.k) {
                view = (ViewGroup) from.inflate(C0633g.abc_dialog_title_material, null);
                this.i = false;
                this.h = false;
            } else if (this.h) {
                Context c0708d;
                TypedValue typedValue = new TypedValue();
                this.a.getTheme().resolveAttribute(C0627a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    c0708d = new C0708d(this.a, typedValue.resourceId);
                } else {
                    c0708d = this.a;
                }
                view = (ViewGroup) LayoutInflater.from(c0708d).inflate(C0633g.abc_screen_toolbar, null);
                this.f18479u = (C0873v) view.findViewById(C0632f.decor_content_parent);
                this.f18479u.setWindowCallback(m15934r());
                if (this.i) {
                    this.f18479u.mo624a(109);
                }
                if (this.f18461B) {
                    this.f18479u.mo624a(2);
                }
                if (this.f18462C) {
                    this.f18479u.mo624a(5);
                }
            } else {
                view = null;
            }
            if (view != null) {
                if (this.f18479u == null) {
                    this.f18484z = (TextView) view.findViewById(C0632f.title);
                }
                bg.m3616b(view);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) view.findViewById(C0632f.action_bar_activity_content);
                ViewGroup viewGroup = (ViewGroup) this.b.findViewById(16908290);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View childAt = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout) viewGroup).setForeground(null);
                    }
                }
                this.b.setContentView(view);
                contentFrameLayout.setAttachListener(new C31914(this));
                return view;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AppCompat does not support the current theme features: { windowActionBar: ");
            stringBuilder.append(this.h);
            stringBuilder.append(", windowActionBarOverlay: ");
            stringBuilder.append(this.i);
            stringBuilder.append(", android:windowIsFloating: ");
            stringBuilder.append(this.k);
            stringBuilder.append(", windowActionModeOverlay: ");
            stringBuilder.append(this.j);
            stringBuilder.append(", windowNoTitle: ");
            stringBuilder.append(this.l);
            stringBuilder.append(" }");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: z */
    private void m24370z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f18483y.findViewById(16908290);
        View decorView = this.b.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(C0636j.AppCompatTheme);
        obtainStyledAttributes.getValue(C0636j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C0636j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C0636j.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C0636j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C0636j.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C0636j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C0636j.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C0636j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C0636j.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C0636j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: c */
    public boolean mo3811c(int i) {
        i = m24367h(i);
        if (this.l && i == 108) {
            return false;
        }
        if (this.h && i == 1) {
            this.h = false;
        }
        switch (i) {
            case 1:
                m24355A();
                this.l = true;
                return true;
            case 2:
                m24355A();
                this.f18461B = true;
                return true;
            case 5:
                m24355A();
                this.f18462C = true;
                return true;
            case 10:
                m24355A();
                this.j = true;
                return true;
            case 108:
                m24355A();
                this.h = true;
                return true;
            case 109:
                m24355A();
                this.i = true;
                return true;
            default:
                return this.b.requestFeature(i);
        }
    }

    /* renamed from: b */
    void mo3809b(CharSequence charSequence) {
        if (this.f18479u != null) {
            this.f18479u.setWindowTitle(charSequence);
        } else if (m15930n() != null) {
            m15930n().mo537b(charSequence);
        } else if (this.f18484z != null) {
            this.f18484z.setText(charSequence);
        }
    }

    /* renamed from: a */
    void mo3798a(int i, Menu menu) {
        if (i == 108) {
            i = mo512a();
            if (i != 0) {
                i.mo548h(false);
            }
        } else if (i == 0) {
            PanelFeatureState a = m24371a(i, true);
            if (a.f2129o) {
                m24380a(a, false);
            }
        }
    }

    /* renamed from: b */
    boolean mo3810b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        i = mo512a();
        if (i != 0) {
            i.mo548h(true);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
        Callback r = m15934r();
        if (!(r == null || m15933q())) {
            c3224h = m24372a(c3224h.mo3841p());
            if (c3224h != null) {
                return r.onMenuItemSelected(c3224h.f2115a, menuItem);
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo101a(C3224h c3224h) {
        m24357a(c3224h, true);
    }

    /* renamed from: b */
    public C0706b m24389b(C0705a c0705a) {
        if (c0705a != null) {
            if (this.f18472m != null) {
                this.f18472m.mo558c();
            }
            C0705a c3193b = new C3193b(this, c0705a);
            c0705a = mo512a();
            if (c0705a != null) {
                this.f18472m = c0705a.mo564a(c3193b);
                if (!(this.f18472m == null || this.e == null)) {
                    this.e.mo522a(this.f18472m);
                }
            }
            if (this.f18472m == null) {
                this.f18472m = mo3796a(c3193b);
            }
            return this.f18472m;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: f */
    public void mo3813f() {
        ActionBar a = mo512a();
        if (a == null || !a.mo543e()) {
            mo4610d(0);
        }
    }

    /* renamed from: a */
    android.support.v7.view.C0706b mo3796a(android.support.v7.view.C0706b.C0705a r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r7 = this;
        r7.m24410u();
        r0 = r7.f18472m;
        if (r0 == 0) goto L_0x000c;
    L_0x0007:
        r0 = r7.f18472m;
        r0.mo558c();
    L_0x000c:
        r0 = r8 instanceof android.support.v7.app.AppCompatDelegateImplV9.C3193b;
        if (r0 != 0) goto L_0x0016;
    L_0x0010:
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$b;
        r0.<init>(r7, r8);
        r8 = r0;
    L_0x0016:
        r0 = r7.e;
        r1 = 0;
        if (r0 == 0) goto L_0x0028;
    L_0x001b:
        r0 = r7.m15933q();
        if (r0 != 0) goto L_0x0028;
    L_0x0021:
        r0 = r7.e;	 Catch:{ AbstractMethodError -> 0x0028 }
        r0 = r0.mo521a(r8);	 Catch:{ AbstractMethodError -> 0x0028 }
        goto L_0x0029;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        if (r0 == 0) goto L_0x002f;
    L_0x002b:
        r7.f18472m = r0;
        goto L_0x016c;
    L_0x002f:
        r0 = r7.f18473n;
        r2 = 0;
        r3 = 1;
        if (r0 != 0) goto L_0x00dc;
    L_0x0035:
        r0 = r7.k;
        if (r0 == 0) goto L_0x00bd;
    L_0x0039:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r4 = r7.a;
        r4 = r4.getTheme();
        r5 = android.support.v7.p020a.C0637a.C0627a.actionBarTheme;
        r4.resolveAttribute(r5, r0, r3);
        r5 = r0.resourceId;
        if (r5 == 0) goto L_0x006e;
    L_0x004d:
        r5 = r7.a;
        r5 = r5.getResources();
        r5 = r5.newTheme();
        r5.setTo(r4);
        r4 = r0.resourceId;
        r5.applyStyle(r4, r3);
        r4 = new android.support.v7.view.d;
        r6 = r7.a;
        r4.<init>(r6, r2);
        r6 = r4.getTheme();
        r6.setTo(r5);
        goto L_0x0070;
    L_0x006e:
        r4 = r7.a;
    L_0x0070:
        r5 = new android.support.v7.widget.ActionBarContextView;
        r5.<init>(r4);
        r7.f18473n = r5;
        r5 = new android.widget.PopupWindow;
        r6 = android.support.v7.p020a.C0637a.C0627a.actionModePopupWindowStyle;
        r5.<init>(r4, r1, r6);
        r7.f18474o = r5;
        r5 = r7.f18474o;
        r6 = 2;
        android.support.v4.widget.C0617m.m2464a(r5, r6);
        r5 = r7.f18474o;
        r6 = r7.f18473n;
        r5.setContentView(r6);
        r5 = r7.f18474o;
        r6 = -1;
        r5.setWidth(r6);
        r5 = r4.getTheme();
        r6 = android.support.v7.p020a.C0637a.C0627a.actionBarSize;
        r5.resolveAttribute(r6, r0, r3);
        r0 = r0.data;
        r4 = r4.getResources();
        r4 = r4.getDisplayMetrics();
        r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4);
        r4 = r7.f18473n;
        r4.setContentHeight(r0);
        r0 = r7.f18474o;
        r4 = -2;
        r0.setHeight(r4);
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$5;
        r0.<init>(r7);
        r7.f18475p = r0;
        goto L_0x00dc;
    L_0x00bd:
        r0 = r7.f18483y;
        r4 = android.support.v7.p020a.C0637a.C0632f.action_mode_bar_stub;
        r0 = r0.findViewById(r4);
        r0 = (android.support.v7.widget.ViewStubCompat) r0;
        if (r0 == 0) goto L_0x00dc;
    L_0x00c9:
        r4 = r7.m15931o();
        r4 = android.view.LayoutInflater.from(r4);
        r0.setLayoutInflater(r4);
        r0 = r0.m3429a();
        r0 = (android.support.v7.widget.ActionBarContextView) r0;
        r7.f18473n = r0;
    L_0x00dc:
        r0 = r7.f18473n;
        if (r0 == 0) goto L_0x016c;
    L_0x00e0:
        r7.m24410u();
        r0 = r7.f18473n;
        r0.m16251c();
        r0 = new android.support.v7.view.e;
        r4 = r7.f18473n;
        r4 = r4.getContext();
        r5 = r7.f18473n;
        r6 = r7.f18474o;
        if (r6 != 0) goto L_0x00f7;
    L_0x00f6:
        goto L_0x00f8;
    L_0x00f7:
        r3 = 0;
    L_0x00f8:
        r0.<init>(r4, r5, r8, r3);
        r3 = r0.mo555b();
        r8 = r8.mo493a(r0, r3);
        if (r8 == 0) goto L_0x016a;
    L_0x0105:
        r0.mo559d();
        r8 = r7.f18473n;
        r8.m16248a(r0);
        r7.f18472m = r0;
        r8 = r7.m24409t();
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r8 == 0) goto L_0x0134;
    L_0x0117:
        r8 = r7.f18473n;
        r1 = 0;
        r8.setAlpha(r1);
        r8 = r7.f18473n;
        r8 = android.support.v4.view.C0560r.m2199k(r8);
        r8 = r8.m2236a(r0);
        r7.f18476q = r8;
        r8 = r7.f18476q;
        r0 = new android.support.v7.app.AppCompatDelegateImplV9$6;
        r0.<init>(r7);
        r8.m2238a(r0);
        goto L_0x015a;
    L_0x0134:
        r8 = r7.f18473n;
        r8.setAlpha(r0);
        r8 = r7.f18473n;
        r8.setVisibility(r2);
        r8 = r7.f18473n;
        r0 = 32;
        r8.sendAccessibilityEvent(r0);
        r8 = r7.f18473n;
        r8 = r8.getParent();
        r8 = r8 instanceof android.view.View;
        if (r8 == 0) goto L_0x015a;
    L_0x014f:
        r8 = r7.f18473n;
        r8 = r8.getParent();
        r8 = (android.view.View) r8;
        android.support.v4.view.C0560r.m2204p(r8);
    L_0x015a:
        r8 = r7.f18474o;
        if (r8 == 0) goto L_0x016c;
    L_0x015e:
        r8 = r7.b;
        r8 = r8.getDecorView();
        r0 = r7.f18475p;
        r8.post(r0);
        goto L_0x016c;
    L_0x016a:
        r7.f18472m = r1;
    L_0x016c:
        r8 = r7.f18472m;
        if (r8 == 0) goto L_0x017b;
    L_0x0170:
        r8 = r7.e;
        if (r8 == 0) goto L_0x017b;
    L_0x0174:
        r8 = r7.e;
        r0 = r7.f18472m;
        r8.mo522a(r0);
    L_0x017b:
        r8 = r7.f18472m;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.a(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    /* renamed from: t */
    final boolean m24409t() {
        return this.f18482x && this.f18483y != null && C0560r.m2212x(this.f18483y);
    }

    /* renamed from: u */
    void m24410u() {
        if (this.f18476q != null) {
            this.f18476q.m2243b();
        }
    }

    /* renamed from: v */
    boolean m24411v() {
        if (this.f18472m != null) {
            this.f18472m.mo558c();
            return true;
        }
        ActionBar a = mo512a();
        if (a == null || !a.mo545f()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    boolean mo3804a(int i, KeyEvent keyEvent) {
        ActionBar a = mo512a();
        if (a != null && a.mo533a(i, keyEvent) != 0) {
            return true;
        }
        if (this.f18465F == 0 || m24359a(this.f18465F, keyEvent.getKeyCode(), keyEvent, 1) == 0) {
            if (this.f18465F == 0) {
                PanelFeatureState a2 = m24371a(0, true);
                m24362b(a2, keyEvent);
                keyEvent = m24359a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f2127m = false;
                if (keyEvent != null) {
                    return true;
                }
            }
            return false;
        }
        if (this.f18465F != 0) {
            this.f18465F.f2128n = true;
        }
        return true;
    }

    /* renamed from: a */
    boolean mo3805a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.c.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? m24399c(keyCode, keyEvent) : m24396b(keyCode, keyEvent);
    }

    /* renamed from: b */
    boolean m24396b(int i, KeyEvent keyEvent) {
        if (i == 4) {
            i = this.f18466G;
            this.f18466G = false;
            PanelFeatureState a = m24371a(0, false);
            if (a != null && a.f2129o) {
                if (i == 0) {
                    m24380a(a, true);
                }
                return true;
            } else if (m24411v() != 0) {
                return true;
            }
        } else if (i == 82) {
            m24366e(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    boolean m24399c(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f18466G = z;
        } else if (i == 82) {
            m24365d(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public View m24390b(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f18471L == null) {
            String string = this.a.obtainStyledAttributes(C0636j.AppCompatTheme).getString(C0636j.AppCompatTheme_viewInflaterClass);
            if (string != null) {
                if (!AppCompatViewInflater.class.getName().equals(string)) {
                    try {
                        this.f18471L = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Throwable th) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to instantiate custom view inflater ");
                        stringBuilder.append(string);
                        stringBuilder.append(". Falling back to default.");
                        Log.i("AppCompatDelegate", stringBuilder.toString(), th);
                        this.f18471L = new AppCompatViewInflater();
                    }
                }
            }
            this.f18471L = new AppCompatViewInflater();
        }
        if (f18459t) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m24360a((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f18471L.m2611a(view, str, context, attributeSet, z, f18459t, true, bd.m3576a());
    }

    /* renamed from: a */
    private boolean m24360a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        ViewParent decorView = this.b.getDecorView();
        while (viewParent != null) {
            if (viewParent != decorView && (viewParent instanceof View)) {
                if (!C0560r.m2162A((View) viewParent)) {
                    viewParent = viewParent.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public void mo3814i() {
        LayoutInflater from = LayoutInflater.from(this.a);
        if (from.getFactory() == null) {
            C0545d.m2041b(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImplV9)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo4608a(view, str, context, attributeSet);
        if (a != null) {
            return a;
        }
        return m24390b(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* renamed from: a */
    View mo4608a(View view, String str, Context context, AttributeSet attributeSet) {
        if ((this.c instanceof Factory) != null) {
            view = ((Factory) this.c).onCreateView(str, context, attributeSet);
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m24356a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (!panelFeatureState.f2129o) {
            if (!m15933q()) {
                if (panelFeatureState.f2115a == 0) {
                    if (((this.a.getResources().getConfiguration().screenLayout & 15) == 4 ? 1 : null) != null) {
                        return;
                    }
                }
                Callback r = m15934r();
                if (r == null || r.onMenuOpened(panelFeatureState.f2115a, panelFeatureState.f2124j)) {
                    WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
                    if (windowManager != null && m24362b(panelFeatureState, keyEvent) != null) {
                        int i;
                        KeyEvent layoutParams;
                        if (panelFeatureState.f2121g != null) {
                            if (panelFeatureState.f2131q == null) {
                                if (panelFeatureState.f2123i != null) {
                                    keyEvent = panelFeatureState.f2123i.getLayoutParams();
                                    if (keyEvent != null && keyEvent.width == -1) {
                                        i = -1;
                                        panelFeatureState.f2128n = false;
                                        layoutParams = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2118d, panelFeatureState.f2119e, 1002, 8519680, -3);
                                        layoutParams.gravity = panelFeatureState.f2117c;
                                        layoutParams.windowAnimations = panelFeatureState.f2120f;
                                        windowManager.addView(panelFeatureState.f2121g, layoutParams);
                                        panelFeatureState.f2129o = true;
                                        return;
                                    }
                                }
                                i = -2;
                                panelFeatureState.f2128n = false;
                                layoutParams = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2118d, panelFeatureState.f2119e, 1002, 8519680, -3);
                                layoutParams.gravity = panelFeatureState.f2117c;
                                layoutParams.windowAnimations = panelFeatureState.f2120f;
                                windowManager.addView(panelFeatureState.f2121g, layoutParams);
                                panelFeatureState.f2129o = true;
                                return;
                            }
                        }
                        if (panelFeatureState.f2121g == null) {
                            if (m24358a(panelFeatureState) == null || panelFeatureState.f2121g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f2131q != null && panelFeatureState.f2121g.getChildCount() > null) {
                            panelFeatureState.f2121g.removeAllViews();
                        }
                        if (m24363c(panelFeatureState) != null) {
                            if (panelFeatureState.m2602a() != null) {
                                keyEvent = panelFeatureState.f2122h.getLayoutParams();
                                if (keyEvent == null) {
                                    keyEvent = new LayoutParams(-2, -2);
                                }
                                panelFeatureState.f2121g.setBackgroundResource(panelFeatureState.f2116b);
                                ViewParent parent = panelFeatureState.f2122h.getParent();
                                if (parent != null && (parent instanceof ViewGroup)) {
                                    ((ViewGroup) parent).removeView(panelFeatureState.f2122h);
                                }
                                panelFeatureState.f2121g.addView(panelFeatureState.f2122h, keyEvent);
                                if (panelFeatureState.f2122h.hasFocus() == null) {
                                    panelFeatureState.f2122h.requestFocus();
                                }
                                i = -2;
                                panelFeatureState.f2128n = false;
                                layoutParams = new WindowManager.LayoutParams(i, -2, panelFeatureState.f2118d, panelFeatureState.f2119e, 1002, 8519680, -3);
                                layoutParams.gravity = panelFeatureState.f2117c;
                                layoutParams.windowAnimations = panelFeatureState.f2120f;
                                windowManager.addView(panelFeatureState.f2121g, layoutParams);
                                panelFeatureState.f2129o = true;
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                m24380a(panelFeatureState, true);
            }
        }
    }

    /* renamed from: a */
    private boolean m24358a(PanelFeatureState panelFeatureState) {
        panelFeatureState.m2600a(m15931o());
        panelFeatureState.f2121g = new C3194c(this, panelFeatureState.f2126l);
        panelFeatureState.f2117c = 81;
        return true;
    }

    /* renamed from: a */
    private void m24357a(C3224h c3224h, boolean z) {
        if (this.f18479u == null || this.f18479u.mo625e() == null || (ViewConfiguration.get(this.a).hasPermanentMenuKey() != null && this.f18479u.mo627g() == null)) {
            PanelFeatureState a = m24371a(0, true);
            a.f2131q = true;
            m24380a(a, false);
            m24356a(a, (KeyEvent) false);
            return;
        }
        c3224h = m15934r();
        if (this.f18479u.mo626f()) {
            if (z) {
                this.f18479u.mo629i();
                if (!m15933q()) {
                    c3224h.onPanelClosed(108, m24371a(0, true).f2124j);
                }
            }
        }
        if (!(c3224h == null || m15933q())) {
            if (this.f18477r && (this.f18478s & true)) {
                this.b.getDecorView().removeCallbacks(this.f18467H);
                this.f18467H.run();
            }
            z = m24371a(0, true);
            if (!(z.f2124j == null || z.f2132r || !c3224h.onPreparePanel(0, z.f2123i, z.f2124j))) {
                c3224h.onMenuOpened(108, z.f2124j);
                this.f18479u.mo628h();
            }
        }
    }

    /* renamed from: b */
    private boolean m24361b(PanelFeatureState panelFeatureState) {
        Context context = this.a;
        if ((panelFeatureState.f2115a == 0 || panelFeatureState.f2115a == 108) && this.f18479u != null) {
            TypedValue typedValue = new TypedValue();
            Theme theme = context.getTheme();
            theme.resolveAttribute(C0627a.actionBarTheme, typedValue, true);
            Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C0627a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C0627a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                Context c0708d = new C0708d(context, 0);
                c0708d.getTheme().setTo(theme2);
                context = c0708d;
            }
        }
        C3224h c3224h = new C3224h(context);
        c3224h.mo3835a((C0723a) this);
        panelFeatureState.m2601a(c3224h);
        return true;
    }

    /* renamed from: c */
    private boolean m24363c(PanelFeatureState panelFeatureState) {
        boolean z = true;
        if (panelFeatureState.f2123i != null) {
            panelFeatureState.f2122h = panelFeatureState.f2123i;
            return true;
        } else if (panelFeatureState.f2124j == null) {
            return false;
        } else {
            if (this.f18481w == null) {
                this.f18481w = new C3195d(this);
            }
            panelFeatureState.f2122h = (View) panelFeatureState.m2599a(this.f18481w);
            if (panelFeatureState.f2122h == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: b */
    private boolean m24362b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (m15933q()) {
            return false;
        }
        if (panelFeatureState.f2127m) {
            return true;
        }
        Object obj;
        if (!(this.f18465F == null || this.f18465F == panelFeatureState)) {
            m24380a(this.f18465F, false);
        }
        Callback r = m15934r();
        if (r != null) {
            panelFeatureState.f2123i = r.onCreatePanelView(panelFeatureState.f2115a);
        }
        if (panelFeatureState.f2115a != 0) {
            if (panelFeatureState.f2115a != 108) {
                obj = null;
                if (!(obj == null || this.f18479u == null)) {
                    this.f18479u.setMenuPrepared();
                }
                if (panelFeatureState.f2123i == null && (obj == null || !(m15930n() instanceof C3208l))) {
                    if (panelFeatureState.f2124j == null || panelFeatureState.f2132r) {
                        if (panelFeatureState.f2124j != null && (!m24361b(panelFeatureState) || panelFeatureState.f2124j == null)) {
                            return false;
                        }
                        if (!(obj == null || this.f18479u == null)) {
                            if (this.f18480v == null) {
                                this.f18480v = new C3192a(this);
                            }
                            this.f18479u.setMenu(panelFeatureState.f2124j, this.f18480v);
                        }
                        panelFeatureState.f2124j.m16175g();
                        if (r.onCreatePanelMenu(panelFeatureState.f2115a, panelFeatureState.f2124j)) {
                            panelFeatureState.m2601a(null);
                            if (!(obj == null || this.f18479u == null)) {
                                this.f18479u.setMenu(null, this.f18480v);
                            }
                            return false;
                        }
                        panelFeatureState.f2132r = false;
                    }
                    panelFeatureState.f2124j.m16175g();
                    if (panelFeatureState.f2133s != null) {
                        panelFeatureState.f2124j.m16170d(panelFeatureState.f2133s);
                        panelFeatureState.f2133s = null;
                    }
                    if (r.onPreparePanel(0, panelFeatureState.f2123i, panelFeatureState.f2124j)) {
                        if (!(obj == null || this.f18479u == null)) {
                            this.f18479u.setMenu(null, this.f18480v);
                        }
                        panelFeatureState.f2124j.m16176h();
                        return false;
                    }
                    panelFeatureState.f2130p = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1 ? true : null;
                    panelFeatureState.f2124j.setQwertyMode(panelFeatureState.f2130p);
                    panelFeatureState.f2124j.m16176h();
                }
                panelFeatureState.f2127m = true;
                panelFeatureState.f2128n = false;
                this.f18465F = panelFeatureState;
                return true;
            }
        }
        obj = 1;
        this.f18479u.setMenuPrepared();
        if (panelFeatureState.f2124j != null) {
        }
        if (this.f18480v == null) {
            this.f18480v = new C3192a(this);
        }
        this.f18479u.setMenu(panelFeatureState.f2124j, this.f18480v);
        panelFeatureState.f2124j.m16175g();
        if (r.onCreatePanelMenu(panelFeatureState.f2115a, panelFeatureState.f2124j)) {
            panelFeatureState.f2132r = false;
            panelFeatureState.f2124j.m16175g();
            if (panelFeatureState.f2133s != null) {
                panelFeatureState.f2124j.m16170d(panelFeatureState.f2133s);
                panelFeatureState.f2133s = null;
            }
            if (r.onPreparePanel(0, panelFeatureState.f2123i, panelFeatureState.f2124j)) {
                if (keyEvent == null) {
                }
                if (KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                }
                panelFeatureState.f2130p = KeyCharacterMap.load(keyEvent == null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1 ? true : null;
                panelFeatureState.f2124j.setQwertyMode(panelFeatureState.f2130p);
                panelFeatureState.f2124j.m16176h();
                panelFeatureState.f2127m = true;
                panelFeatureState.f2128n = false;
                this.f18465F = panelFeatureState;
                return true;
            }
            this.f18479u.setMenu(null, this.f18480v);
            panelFeatureState.f2124j.m16176h();
            return false;
        }
        panelFeatureState.m2601a(null);
        this.f18479u.setMenu(null, this.f18480v);
        return false;
    }

    /* renamed from: b */
    void m24393b(C3224h c3224h) {
        if (!this.f18463D) {
            this.f18463D = true;
            this.f18479u.mo630j();
            Callback r = m15934r();
            if (!(r == null || m15933q())) {
                r.onPanelClosed(108, c3224h);
            }
            this.f18463D = null;
        }
    }

    /* renamed from: e */
    void m24402e(int i) {
        m24380a(m24371a(i, true), true);
    }

    /* renamed from: a */
    void m24380a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.f2115a == 0 && this.f18479u != null && this.f18479u.mo626f()) {
            m24393b(panelFeatureState.f2124j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.a.getSystemService("window");
        if (!(windowManager == null || !panelFeatureState.f2129o || panelFeatureState.f2121g == null)) {
            windowManager.removeView(panelFeatureState.f2121g);
            if (z) {
                m24376a(panelFeatureState.f2115a, panelFeatureState, null);
            }
        }
        panelFeatureState.f2127m = false;
        panelFeatureState.f2128n = false;
        panelFeatureState.f2129o = false;
        panelFeatureState.f2122h = null;
        panelFeatureState.f2131q = true;
        if (this.f18465F == panelFeatureState) {
            this.f18465F = null;
        }
    }

    /* renamed from: d */
    private boolean m24365d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState a = m24371a(i, true);
            if (!a.f2129o) {
                return m24362b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m24366e(int i, KeyEvent keyEvent) {
        if (this.f18472m != null) {
            return false;
        }
        PanelFeatureState a = m24371a(i, true);
        AudioManager audioManager;
        if (i != 0 || this.f18479u == 0 || this.f18479u.mo625e() == 0 || ViewConfiguration.get(this.a).hasPermanentMenuKey() != 0) {
            if (a.f2129o == 0) {
                if (a.f2128n == 0) {
                    if (a.f2127m != 0) {
                        if (a.f2132r != 0) {
                            a.f2127m = false;
                            i = m24362b(a, keyEvent);
                        } else {
                            i = 1;
                        }
                        if (i != 0) {
                            m24356a(a, keyEvent);
                            i = 1;
                            if (i != 0) {
                                audioManager = (AudioManager) this.a.getSystemService("audio");
                                if (audioManager == null) {
                                    audioManager.playSoundEffect(0);
                                } else {
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                }
                            }
                            return i;
                        }
                    }
                }
            }
            i = a.f2129o;
            m24380a(a, true);
            if (i != 0) {
                audioManager = (AudioManager) this.a.getSystemService("audio");
                if (audioManager == null) {
                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                } else {
                    audioManager.playSoundEffect(0);
                }
            }
            return i;
        }
        if (this.f18479u.mo626f() != 0) {
            i = this.f18479u.mo629i();
        } else if (m15933q() == 0 && m24362b(a, keyEvent) != 0) {
            i = this.f18479u.mo628h();
        }
        if (i != 0) {
            audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager == null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return i;
        i = 0;
        if (i != 0) {
            audioManager = (AudioManager) this.a.getSystemService("audio");
            if (audioManager == null) {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            } else {
                audioManager.playSoundEffect(0);
            }
        }
        return i;
    }

    /* renamed from: a */
    void m24376a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.f18464E.length) {
                panelFeatureState = this.f18464E[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f2124j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f2129o != null) && m15933q() == null) {
            this.c.onPanelClosed(i, menu);
        }
    }

    /* renamed from: a */
    PanelFeatureState m24372a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f18464E;
        int i = 0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        while (i < length) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f2124j == menu) {
                return panelFeatureState;
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    protected PanelFeatureState m24371a(int i, boolean z) {
        z = this.f18464E;
        if (!z || z.length <= i) {
            Object obj = new PanelFeatureState[(i + 1)];
            if (z) {
                System.arraycopy(z, 0, obj, 0, z.length);
            }
            this.f18464E = obj;
            z = obj;
        }
        PanelFeatureState panelFeatureState = z[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        panelFeatureState = new PanelFeatureState(i);
        z[i] = panelFeatureState;
        return panelFeatureState;
    }

    /* renamed from: a */
    private boolean m24359a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f2127m || m24362b(panelFeatureState, keyEvent)) && panelFeatureState.f2124j != null) {
            z = panelFeatureState.f2124j.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == null && this.f18479u == null) {
            m24380a(panelFeatureState, (boolean) 1);
        }
        return z;
    }

    /* renamed from: d */
    private void mo4610d(int i) {
        this.f18478s = (1 << i) | this.f18478s;
        if (this.f18477r == 0) {
            C0560r.m2178a(this.b.getDecorView(), this.f18467H);
            this.f18477r = true;
        }
    }

    /* renamed from: f */
    void m24404f(int i) {
        PanelFeatureState a = m24371a(i, true);
        if (a.f2124j != null) {
            Bundle bundle = new Bundle();
            a.f2124j.m16164c(bundle);
            if (bundle.size() > 0) {
                a.f2133s = bundle;
            }
            a.f2124j.m16175g();
            a.f2124j.clear();
        }
        a.f2132r = true;
        a.f2131q = true;
        if ((i == 108 || i == 0) && this.f18479u != 0) {
            PanelFeatureState a2 = m24371a(0, false);
            if (a2 != null) {
                a2.f2127m = false;
                m24362b(a2, (KeyEvent) 0);
            }
        }
    }

    /* renamed from: g */
    int m24405g(int i) {
        Object obj;
        int i2 = 0;
        if (this.f18473n == null || !(this.f18473n.getLayoutParams() instanceof MarginLayoutParams)) {
            obj = null;
        } else {
            Object obj2;
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f18473n.getLayoutParams();
            obj = 1;
            if (this.f18473n.isShown()) {
                if (this.f18469J == null) {
                    this.f18469J = new Rect();
                    this.f18470K = new Rect();
                }
                Rect rect = this.f18469J;
                Rect rect2 = this.f18470K;
                rect.set(0, i, 0, 0);
                bg.m3614a(this.f18483y, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f18460A == null) {
                        this.f18460A = new View(this.a);
                        this.f18460A.setBackgroundColor(this.a.getResources().getColor(C0629c.abc_input_method_navigation_guard));
                        this.f18483y.addView(this.f18460A, -1, new LayoutParams(-1, i));
                    } else {
                        LayoutParams layoutParams = this.f18460A.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f18460A.setLayoutParams(layoutParams);
                        }
                    }
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (this.f18460A == null) {
                    obj = null;
                }
                if (!(this.j || r3 == null)) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                this.f18473n.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.f18460A != null) {
            View view = this.f18460A;
            if (obj == null) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: A */
    private void m24355A() {
        if (this.f18482x) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: h */
    private int m24367h(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: w */
    void m24412w() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f18479u;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r2.f18479u;
        r0.mo630j();
    L_0x0009:
        r0 = r2.f18474o;
        if (r0 == 0) goto L_0x0028;
    L_0x000d:
        r0 = r2.b;
        r0 = r0.getDecorView();
        r1 = r2.f18475p;
        r0.removeCallbacks(r1);
        r0 = r2.f18474o;
        r0 = r0.isShowing();
        if (r0 == 0) goto L_0x0025;
    L_0x0020:
        r0 = r2.f18474o;	 Catch:{ IllegalArgumentException -> 0x0025 }
        r0.dismiss();	 Catch:{ IllegalArgumentException -> 0x0025 }
    L_0x0025:
        r0 = 0;
        r2.f18474o = r0;
    L_0x0028:
        r2.m24410u();
        r0 = 0;
        r0 = r2.m24371a(r0, r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r0.f2124j;
        if (r1 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r0.f2124j;
        r0.close();
    L_0x003b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.w():void");
    }
}
