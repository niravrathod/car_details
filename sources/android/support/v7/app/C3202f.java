package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.C3199a.C0657a;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.view.C0706b;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.view.C0712g;
import android.support.v7.view.C0714i;
import android.support.v7.view.menu.C3224h;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: android.support.v7.app.f */
abstract class C3202f extends C0663e {
    /* renamed from: m */
    private static boolean f13417m = true;
    /* renamed from: n */
    private static final boolean f13418n = (VERSION.SDK_INT < 21);
    /* renamed from: o */
    private static final int[] f13419o = new int[]{16842836};
    /* renamed from: a */
    final Context f13420a;
    /* renamed from: b */
    final Window f13421b;
    /* renamed from: c */
    final Callback f13422c = this.f13421b.getCallback();
    /* renamed from: d */
    final Callback f13423d;
    /* renamed from: e */
    final C0662d f13424e;
    /* renamed from: f */
    ActionBar f13425f;
    /* renamed from: g */
    MenuInflater f13426g;
    /* renamed from: h */
    boolean f13427h;
    /* renamed from: i */
    boolean f13428i;
    /* renamed from: j */
    boolean f13429j;
    /* renamed from: k */
    boolean f13430k;
    /* renamed from: l */
    boolean f13431l;
    /* renamed from: p */
    private CharSequence f13432p;
    /* renamed from: q */
    private boolean f13433q;
    /* renamed from: r */
    private boolean f13434r;

    /* renamed from: android.support.v7.app.f$a */
    private class C3200a implements C0657a {
        /* renamed from: a */
        final /* synthetic */ C3202f f13415a;

        C3200a(C3202f c3202f) {
            this.f13415a = c3202f;
        }

        /* renamed from: a */
        public Drawable mo496a() {
            ay a = ay.m3542a(mo499b(), null, new int[]{C0627a.homeAsUpIndicator});
            Drawable a2 = a.m3547a(0);
            a.m3548a();
            return a2;
        }

        /* renamed from: b */
        public Context mo499b() {
            return this.f13415a.m15931o();
        }

        /* renamed from: c */
        public boolean mo500c() {
            ActionBar a = this.f13415a.mo512a();
            return (a == null || (a.mo526a() & 4) == 0) ? false : true;
        }

        /* renamed from: a */
        public void mo498a(Drawable drawable, int i) {
            ActionBar a = this.f13415a.mo512a();
            if (a != null) {
                a.mo530a(drawable);
                a.mo536b(i);
            }
        }

        /* renamed from: a */
        public void mo497a(int i) {
            ActionBar a = this.f13415a.mo512a();
            if (a != null) {
                a.mo536b(i);
            }
        }
    }

    /* renamed from: android.support.v7.app.f$b */
    class C3201b extends C0714i {
        /* renamed from: a */
        final /* synthetic */ C3202f f13416a;

        public void onContentChanged() {
        }

        C3201b(C3202f c3202f, Callback callback) {
            this.f13416a = c3202f;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!this.f13416a.mo3805a(keyEvent)) {
                if (super.dispatchKeyEvent(keyEvent) == null) {
                    return null;
                }
            }
            return true;
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                if (this.f13416a.mo3804a(keyEvent.getKeyCode(), keyEvent) == null) {
                    return null;
                }
            }
            return true;
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C3224h)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C3224h c3224h = menu instanceof C3224h ? (C3224h) menu : null;
            if (i == 0 && c3224h == null) {
                return false;
            }
            if (c3224h != null) {
                c3224h.m16165c(true);
            }
            i = super.onPreparePanel(i, view, menu);
            if (c3224h != null) {
                c3224h.m16165c(false);
            }
            return i;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.f13416a.mo3810b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.f13416a.mo3798a(i, menu);
        }
    }

    /* renamed from: a */
    abstract C0706b mo3796a(C0705a c0705a);

    /* renamed from: a */
    abstract void mo3798a(int i, Menu menu);

    /* renamed from: a */
    abstract boolean mo3804a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    abstract boolean mo3805a(KeyEvent keyEvent);

    /* renamed from: b */
    abstract void mo3809b(CharSequence charSequence);

    /* renamed from: b */
    abstract boolean mo3810b(int i, Menu menu);

    /* renamed from: c */
    public void mo516c(Bundle bundle) {
    }

    /* renamed from: j */
    public boolean mo520j() {
        return false;
    }

    /* renamed from: m */
    abstract void mo3815m();

    /* renamed from: p */
    public boolean mo4611p() {
        return false;
    }

    static {
        if (f13418n && !f13417m) {
            final UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    if (m2677a(th)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(th.getMessage());
                        stringBuilder.append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                        Throwable notFoundException = new NotFoundException(stringBuilder.toString());
                        notFoundException.initCause(th.getCause());
                        notFoundException.setStackTrace(th.getStackTrace());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, notFoundException);
                        return;
                    }
                    defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                }

                /* renamed from: a */
                private boolean m2677a(Throwable th) {
                    boolean z = false;
                    if (!(th instanceof NotFoundException)) {
                        return false;
                    }
                    th = th.getMessage();
                    if (th != null && (th.contains("drawable") || th.contains("Drawable") != null)) {
                        z = true;
                    }
                    return z;
                }
            });
        }
    }

    C3202f(Context context, Window window, C0662d c0662d) {
        this.f13420a = context;
        this.f13421b = window;
        this.f13424e = c0662d;
        if ((this.f13422c instanceof C3201b) == null) {
            this.f13423d = mo4609a(this.f13422c);
            this.f13421b.setCallback(this.f13423d);
            context = ay.m3542a(context, (AttributeSet) null, f13419o);
            window = context.m3551b(null);
            if (window != null) {
                this.f13421b.setBackgroundDrawable(window);
            }
            context.m3548a();
            return;
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: a */
    Callback mo4609a(Callback callback) {
        return new C3201b(this, callback);
    }

    /* renamed from: a */
    public ActionBar mo512a() {
        mo3815m();
        return this.f13425f;
    }

    /* renamed from: n */
    final ActionBar m15930n() {
        return this.f13425f;
    }

    /* renamed from: b */
    public MenuInflater mo514b() {
        if (this.f13426g == null) {
            mo3815m();
            this.f13426g = new C0712g(this.f13425f != null ? this.f13425f.mo535b() : this.f13420a);
        }
        return this.f13426g;
    }

    /* renamed from: h */
    public final C0657a mo519h() {
        return new C3200a(this);
    }

    /* renamed from: o */
    final Context m15931o() {
        ActionBar a = mo512a();
        Context b = a != null ? a.mo535b() : null;
        return b == null ? this.f13420a : b;
    }

    /* renamed from: c */
    public void mo515c() {
        this.f13433q = true;
    }

    /* renamed from: d */
    public void mo517d() {
        this.f13433q = false;
    }

    /* renamed from: g */
    public void mo518g() {
        this.f13434r = true;
    }

    /* renamed from: q */
    final boolean m15933q() {
        return this.f13434r;
    }

    /* renamed from: r */
    final Callback m15934r() {
        return this.f13421b.getCallback();
    }

    /* renamed from: a */
    public final void mo513a(CharSequence charSequence) {
        this.f13432p = charSequence;
        mo3809b(charSequence);
    }

    /* renamed from: s */
    final CharSequence m15935s() {
        if (this.f13422c instanceof Activity) {
            return ((Activity) this.f13422c).getTitle();
        }
        return this.f13432p;
    }
}
