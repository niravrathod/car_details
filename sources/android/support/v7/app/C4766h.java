package android.support.v7.app;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C3202f.C3201b;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.view.C0709f.C3217a;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import com.google.android.gms.ads.AdRequest;

/* renamed from: android.support.v7.app.h */
class C4766h extends AppCompatDelegateImplV9 {
    /* renamed from: t */
    private int f20835t = -100;
    /* renamed from: u */
    private boolean f20836u;
    /* renamed from: v */
    private boolean f20837v = true;
    /* renamed from: w */
    private C0666b f20838w;

    /* renamed from: android.support.v7.app.h$b */
    final class C0666b {
        /* renamed from: a */
        final /* synthetic */ C4766h f2154a;
        /* renamed from: b */
        private C0671n f2155b;
        /* renamed from: c */
        private boolean f2156c;
        /* renamed from: d */
        private BroadcastReceiver f2157d;
        /* renamed from: e */
        private IntentFilter f2158e;

        /* renamed from: android.support.v7.app.h$b$1 */
        class C06651 extends BroadcastReceiver {
            /* renamed from: a */
            final /* synthetic */ C0666b f2153a;

            C06651(C0666b c0666b) {
                this.f2153a = c0666b;
            }

            public void onReceive(Context context, Intent intent) {
                this.f2153a.m2679b();
            }
        }

        C0666b(C4766h c4766h, C0671n c0671n) {
            this.f2154a = c4766h;
            this.f2155b = c0671n;
            this.f2156c = c0671n.m2694a();
        }

        /* renamed from: a */
        final int m2678a() {
            this.f2156c = this.f2155b.m2694a();
            return this.f2156c ? 2 : 1;
        }

        /* renamed from: b */
        final void m2679b() {
            boolean a = this.f2155b.m2694a();
            if (a != this.f2156c) {
                this.f2156c = a;
                this.f2154a.mo520j();
            }
        }

        /* renamed from: c */
        final void m2680c() {
            m2681d();
            if (this.f2157d == null) {
                this.f2157d = new C06651(this);
            }
            if (this.f2158e == null) {
                this.f2158e = new IntentFilter();
                this.f2158e.addAction("android.intent.action.TIME_SET");
                this.f2158e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f2158e.addAction("android.intent.action.TIME_TICK");
            }
            this.f2154a.a.registerReceiver(this.f2157d, this.f2158e);
        }

        /* renamed from: d */
        final void m2681d() {
            if (this.f2157d != null) {
                this.f2154a.a.unregisterReceiver(this.f2157d);
                this.f2157d = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.h$a */
    class C4456a extends C3201b {
        /* renamed from: c */
        final /* synthetic */ C4766h f18486c;

        C4456a(C4766h c4766h, Callback callback) {
            this.f18486c = c4766h;
            super(c4766h, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (this.f18486c.mo4611p()) {
                return m24414a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        /* renamed from: a */
        final ActionMode m24414a(ActionMode.Callback callback) {
            Object c3217a = new C3217a(this.f18486c.a, callback);
            callback = this.f18486c.m24389b((C0705a) c3217a);
            return callback != null ? c3217a.m16069b(callback) : null;
        }
    }

    /* renamed from: a */
    View mo4608a(View view, String str, Context context, AttributeSet attributeSet) {
        return null;
    }

    C4766h(Context context, Window window, C0662d c0662d) {
        super(context, window, c0662d);
    }

    /* renamed from: a */
    public void mo3800a(Bundle bundle) {
        super.mo3800a(bundle);
        if (bundle != null && this.f20835t == -100) {
            this.f20835t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    /* renamed from: a */
    Callback mo4609a(Callback callback) {
        return new C4456a(this, callback);
    }

    /* renamed from: p */
    public boolean mo4611p() {
        return this.f20837v;
    }

    /* renamed from: j */
    public boolean mo520j() {
        int x = m27647x();
        int d = mo4610d(x);
        boolean h = d != -1 ? m27646h(d) : false;
        if (x == 0) {
            m27648y();
            this.f20838w.m2680c();
        }
        this.f20836u = true;
        return h;
    }

    /* renamed from: c */
    public void mo515c() {
        super.mo515c();
        mo520j();
    }

    /* renamed from: d */
    public void mo517d() {
        super.mo517d();
        if (this.f20838w != null) {
            this.f20838w.m2681d();
        }
    }

    /* renamed from: d */
    int mo4610d(int i) {
        if (i == -100) {
            return -1;
        }
        if (i != 0) {
            return i;
        }
        m27648y();
        return this.f20838w.m2678a();
    }

    /* renamed from: x */
    private int m27647x() {
        return this.f20835t != -100 ? this.f20835t : C0663e.m2653k();
    }

    /* renamed from: c */
    public void mo516c(Bundle bundle) {
        super.mo516c(bundle);
        if (this.f20835t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.f20835t);
        }
    }

    /* renamed from: g */
    public void mo518g() {
        super.mo518g();
        if (this.f20838w != null) {
            this.f20838w.m2681d();
        }
    }

    /* renamed from: h */
    private boolean m27646h(int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        i = i == 2 ? 32 : 16;
        if (i2 == i) {
            return false;
        }
        if (m27649z()) {
            ((Activity) this.a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                C0667k.m2682a(resources);
            }
        }
        return true;
    }

    /* renamed from: y */
    private void m27648y() {
        if (this.f20838w == null) {
            this.f20838w = new C0666b(this, C0671n.m2690a(this.a));
        }
    }

    /* renamed from: z */
    private boolean m27649z() {
        boolean z = false;
        if (!this.f20836u || !(this.a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.a.getPackageManager().getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                z = true;
            }
            return z;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }
}
