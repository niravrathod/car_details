package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.b */
public abstract class C0542b {
    /* renamed from: a */
    private final Context f1746a;
    /* renamed from: b */
    private C0537a f1747b;
    /* renamed from: c */
    private C0538b f1748c;

    /* renamed from: android.support.v4.view.b$a */
    public interface C0537a {
        /* renamed from: b */
        void mo3848b(boolean z);
    }

    /* renamed from: android.support.v4.view.b$b */
    public interface C0538b {
        /* renamed from: a */
        void mo609a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo610a();

    /* renamed from: a */
    public void mo611a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo3832b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo3833c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo612d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo613e() {
        return false;
    }

    public C0542b(Context context) {
        this.f1746a = context;
    }

    /* renamed from: a */
    public View mo3830a(MenuItem menuItem) {
        return mo610a();
    }

    /* renamed from: a */
    public void m2031a(boolean z) {
        if (this.f1747b != null) {
            this.f1747b.mo3848b(z);
        }
    }

    /* renamed from: a */
    public void m2028a(C0537a c0537a) {
        this.f1747b = c0537a;
    }

    /* renamed from: a */
    public void mo3831a(C0538b c0538b) {
        if (!(this.f1748c == null || c0538b == null)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", stringBuilder.toString());
        }
        this.f1748c = c0538b;
    }

    /* renamed from: f */
    public void m2036f() {
        this.f1748c = null;
        this.f1747b = null;
    }
}
