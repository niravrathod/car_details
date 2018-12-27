package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C0706b {
    /* renamed from: a */
    private Object f2245a;
    /* renamed from: b */
    private boolean f2246b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C0705a {
        /* renamed from: a */
        void mo492a(C0706b c0706b);

        /* renamed from: a */
        boolean mo493a(C0706b c0706b, Menu menu);

        /* renamed from: a */
        boolean mo494a(C0706b c0706b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo495b(C0706b c0706b, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo550a();

    /* renamed from: a */
    public abstract void mo551a(int i);

    /* renamed from: a */
    public abstract void mo552a(View view);

    /* renamed from: a */
    public abstract void mo553a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo555b();

    /* renamed from: b */
    public abstract void mo556b(int i);

    /* renamed from: b */
    public abstract void mo557b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo558c();

    /* renamed from: d */
    public abstract void mo559d();

    /* renamed from: f */
    public abstract CharSequence mo560f();

    /* renamed from: g */
    public abstract CharSequence mo561g();

    /* renamed from: h */
    public boolean mo562h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo563i();

    /* renamed from: a */
    public void m2770a(Object obj) {
        this.f2245a = obj;
    }

    /* renamed from: j */
    public Object m2781j() {
        return this.f2245a;
    }

    /* renamed from: a */
    public void mo554a(boolean z) {
        this.f2246b = z;
    }

    /* renamed from: k */
    public boolean m2782k() {
        return this.f2246b;
    }
}
