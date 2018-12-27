package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.C0576c;
import android.support.v7.app.C0660b.C0659a;
import android.support.v7.p024d.p025a.C0683b;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.app.a */
public class C3199a implements C0576c {
    /* renamed from: a */
    boolean f13405a;
    /* renamed from: b */
    OnClickListener f13406b;
    /* renamed from: c */
    private final C0657a f13407c;
    /* renamed from: d */
    private final DrawerLayout f13408d;
    /* renamed from: e */
    private C0683b f13409e;
    /* renamed from: f */
    private boolean f13410f;
    /* renamed from: g */
    private Drawable f13411g;
    /* renamed from: h */
    private final int f13412h;
    /* renamed from: i */
    private final int f13413i;
    /* renamed from: j */
    private boolean f13414j;

    /* renamed from: android.support.v7.app.a$1 */
    class C06561 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3199a f2143a;

        C06561(C3199a c3199a) {
            this.f2143a = c3199a;
        }

        public void onClick(View view) {
            if (this.f2143a.f13405a) {
                this.f2143a.m15904b();
            } else if (this.f2143a.f13406b != null) {
                this.f2143a.f13406b.onClick(view);
            }
        }
    }

    /* renamed from: android.support.v7.app.a$a */
    public interface C0657a {
        /* renamed from: a */
        Drawable mo496a();

        /* renamed from: a */
        void mo497a(int i);

        /* renamed from: a */
        void mo498a(Drawable drawable, int i);

        /* renamed from: b */
        Context mo499b();

        /* renamed from: c */
        boolean mo500c();
    }

    /* renamed from: android.support.v7.app.a$b */
    public interface C0658b {
        /* renamed from: b */
        C0657a mo4971b();
    }

    /* renamed from: android.support.v7.app.a$c */
    private static class C3196c implements C0657a {
        /* renamed from: a */
        final Activity f13399a;
        /* renamed from: b */
        C0659a f13400b;

        C3196c(Activity activity) {
            this.f13399a = activity;
        }

        /* renamed from: a */
        public Drawable mo496a() {
            return C0660b.m2630a(this.f13399a);
        }

        /* renamed from: b */
        public Context mo499b() {
            ActionBar actionBar = this.f13399a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f13399a;
        }

        /* renamed from: c */
        public boolean mo500c() {
            ActionBar actionBar = this.f13399a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        /* renamed from: a */
        public void mo498a(Drawable drawable, int i) {
            ActionBar actionBar = this.f13399a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.f13400b = C0660b.m2632a(this.f13400b, this.f13399a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(null);
            }
        }

        /* renamed from: a */
        public void mo497a(int i) {
            this.f13400b = C0660b.m2631a(this.f13400b, this.f13399a, i);
        }
    }

    /* renamed from: android.support.v7.app.a$d */
    private static class C3197d implements C0657a {
        /* renamed from: a */
        final Activity f13401a;

        C3197d(Activity activity) {
            this.f13401a = activity;
        }

        /* renamed from: a */
        public Drawable mo496a() {
            TypedArray obtainStyledAttributes = mo499b().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: b */
        public Context mo499b() {
            ActionBar actionBar = this.f13401a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f13401a;
        }

        /* renamed from: c */
        public boolean mo500c() {
            ActionBar actionBar = this.f13401a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        /* renamed from: a */
        public void mo498a(Drawable drawable, int i) {
            ActionBar actionBar = this.f13401a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo497a(int i) {
            ActionBar actionBar = this.f13401a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }
    }

    /* renamed from: android.support.v7.app.a$e */
    static class C3198e implements C0657a {
        /* renamed from: a */
        final Toolbar f13402a;
        /* renamed from: b */
        final Drawable f13403b;
        /* renamed from: c */
        final CharSequence f13404c;

        /* renamed from: c */
        public boolean mo500c() {
            return true;
        }

        C3198e(Toolbar toolbar) {
            this.f13402a = toolbar;
            this.f13403b = toolbar.getNavigationIcon();
            this.f13404c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public void mo498a(Drawable drawable, int i) {
            this.f13402a.setNavigationIcon(drawable);
            mo497a(i);
        }

        /* renamed from: a */
        public void mo497a(int i) {
            if (i == 0) {
                this.f13402a.setNavigationContentDescription(this.f13404c);
            } else {
                this.f13402a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: a */
        public Drawable mo496a() {
            return this.f13403b;
        }

        /* renamed from: b */
        public Context mo499b() {
            return this.f13402a.getContext();
        }
    }

    /* renamed from: a */
    public void mo501a(int i) {
    }

    public C3199a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i, int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    C3199a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0683b c0683b, int i, int i2) {
        this.f13410f = true;
        this.f13405a = true;
        this.f13414j = false;
        if (toolbar != null) {
            this.f13407c = new C3198e(toolbar);
            toolbar.setNavigationOnClickListener(new C06561(this));
        } else if ((activity instanceof C0658b) != null) {
            this.f13407c = ((C0658b) activity).mo4971b();
        } else if (VERSION.SDK_INT >= 18) {
            this.f13407c = new C3197d(activity);
        } else {
            this.f13407c = new C3196c(activity);
        }
        this.f13408d = drawerLayout;
        this.f13412h = i;
        this.f13413i = i2;
        if (c0683b == null) {
            this.f13409e = new C0683b(this.f13407c.mo499b());
        } else {
            this.f13409e = c0683b;
        }
        this.f13411g = m15907c();
    }

    /* renamed from: a */
    public void m15898a() {
        if (this.f13408d.m2304g(8388611)) {
            m15897a(1.0f);
        } else {
            m15897a(0.0f);
        }
        if (this.f13405a) {
            m15900a(this.f13409e, this.f13408d.m2304g(8388611) ? this.f13413i : this.f13412h);
        }
    }

    /* renamed from: b */
    void m15904b() {
        int a = this.f13408d.m2277a(8388611);
        if (this.f13408d.m2307h(8388611) && a != 2) {
            this.f13408d.m2302f(8388611);
        } else if (a != 1) {
            this.f13408d.m2301e(8388611);
        }
    }

    /* renamed from: a */
    public void m15903a(boolean z) {
        if (z != this.f13405a) {
            if (z) {
                m15900a(this.f13409e, this.f13408d.m2304g(8388611) ? this.f13413i : this.f13412h);
            } else {
                m15900a(this.f13411g, 0);
            }
            this.f13405a = z;
        }
    }

    /* renamed from: a */
    public void mo503a(View view, float f) {
        if (this.f13410f != null) {
            m15897a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m15897a(0.0f);
        }
    }

    /* renamed from: a */
    public void mo502a(View view) {
        m15897a(1.0f);
        if (this.f13405a != null) {
            m15905b(this.f13413i);
        }
    }

    /* renamed from: b */
    public void mo504b(View view) {
        m15897a((float) null);
        if (this.f13405a != null) {
            m15905b(this.f13412h);
        }
    }

    /* renamed from: a */
    void m15900a(Drawable drawable, int i) {
        if (!(this.f13414j || this.f13407c.mo500c())) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f13414j = true;
        }
        this.f13407c.mo498a(drawable, i);
    }

    /* renamed from: b */
    void m15905b(int i) {
        this.f13407c.mo497a(i);
    }

    /* renamed from: c */
    Drawable m15907c() {
        return this.f13407c.mo496a();
    }

    /* renamed from: a */
    private void m15897a(float f) {
        if (f == 1.0f) {
            this.f13409e.m2717b(true);
        } else if (f == 0.0f) {
            this.f13409e.m2717b(false);
        }
        this.f13409e.m2718c(f);
    }
}
