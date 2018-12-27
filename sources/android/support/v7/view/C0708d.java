package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.p020a.C0637a.C0635i;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0708d extends ContextWrapper {
    /* renamed from: a */
    private int f2247a;
    /* renamed from: b */
    private Theme f2248b;
    /* renamed from: c */
    private LayoutInflater f2249c;
    /* renamed from: d */
    private Configuration f2250d;
    /* renamed from: e */
    private Resources f2251e;

    public C0708d() {
        super(null);
    }

    public C0708d(Context context, int i) {
        super(context);
        this.f2247a = i;
    }

    public C0708d(Context context, Theme theme) {
        super(context);
        this.f2248b = theme;
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public Resources getResources() {
        return m2785b();
    }

    /* renamed from: b */
    private Resources m2785b() {
        if (this.f2251e == null) {
            if (this.f2250d == null) {
                this.f2251e = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                this.f2251e = createConfigurationContext(this.f2250d).getResources();
            }
        }
        return this.f2251e;
    }

    public void setTheme(int i) {
        if (this.f2247a != i) {
            this.f2247a = i;
            m2786c();
        }
    }

    /* renamed from: a */
    public int m2787a() {
        return this.f2247a;
    }

    public Theme getTheme() {
        if (this.f2248b != null) {
            return this.f2248b;
        }
        if (this.f2247a == 0) {
            this.f2247a = C0635i.Theme_AppCompat_Light;
        }
        m2786c();
        return this.f2248b;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f2249c == null) {
            this.f2249c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f2249c;
    }

    /* renamed from: a */
    protected void m2788a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* renamed from: c */
    private void m2786c() {
        boolean z = this.f2248b == null;
        if (z) {
            this.f2248b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f2248b.setTo(theme);
            }
        }
        m2788a(this.f2248b, this.f2247a, z);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
