package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0628b;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.p020a.C0637a.C0636j;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0704a {
    /* renamed from: a */
    private Context f2244a;

    /* renamed from: a */
    public static C0704a m2754a(Context context) {
        return new C0704a(context);
    }

    private C0704a(Context context) {
        this.f2244a = context;
    }

    /* renamed from: a */
    public int m2755a() {
        Configuration configuration = this.f2244a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600 && (i <= 960 || i2 <= 720)) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500 && (i <= 640 || i2 <= 480)) {
                    if (i <= 480 || i2 <= 640) {
                        return i >= 360 ? 3 : 2;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    /* renamed from: b */
    public boolean m2756b() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return ViewConfiguration.get(this.f2244a).hasPermanentMenuKey() ^ true;
    }

    /* renamed from: c */
    public int m2757c() {
        return this.f2244a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean m2758d() {
        return this.f2244a.getResources().getBoolean(C0628b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int m2759e() {
        TypedArray obtainStyledAttributes = this.f2244a.obtainStyledAttributes(null, C0636j.ActionBar, C0627a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0636j.ActionBar_height, 0);
        Resources resources = this.f2244a.getResources();
        if (!m2758d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0630d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean m2760f() {
        return this.f2244a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int m2761g() {
        return this.f2244a.getResources().getDimensionPixelSize(C0630d.abc_action_bar_stacked_tab_max_width);
    }
}
