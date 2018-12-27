package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.C0706b.C0705a;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.C3224h.C0723a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v7.view.e */
public class C3216e extends C0706b implements C0723a {
    /* renamed from: a */
    private Context f13497a;
    /* renamed from: b */
    private ActionBarContextView f13498b;
    /* renamed from: c */
    private C0705a f13499c;
    /* renamed from: d */
    private WeakReference<View> f13500d;
    /* renamed from: e */
    private boolean f13501e;
    /* renamed from: f */
    private boolean f13502f;
    /* renamed from: g */
    private C3224h f13503g;

    public C3216e(Context context, ActionBarContextView actionBarContextView, C0705a c0705a, boolean z) {
        this.f13497a = context;
        this.f13498b = actionBarContextView;
        this.f13499c = c0705a;
        this.f13503g = new C3224h(actionBarContextView.getContext()).m16139a(1);
        this.f13503g.mo3835a((C0723a) this);
        this.f13502f = z;
    }

    /* renamed from: b */
    public void mo557b(CharSequence charSequence) {
        this.f13498b.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo553a(CharSequence charSequence) {
        this.f13498b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo551a(int i) {
        mo557b(this.f13497a.getString(i));
    }

    /* renamed from: b */
    public void mo556b(int i) {
        mo553a(this.f13497a.getString(i));
    }

    /* renamed from: a */
    public void mo554a(boolean z) {
        super.mo554a(z);
        this.f13498b.setTitleOptional(z);
    }

    /* renamed from: h */
    public boolean mo562h() {
        return this.f13498b.m16252d();
    }

    /* renamed from: a */
    public void mo552a(View view) {
        this.f13498b.setCustomView(view);
        this.f13500d = view != null ? new WeakReference(view) : null;
    }

    /* renamed from: d */
    public void mo559d() {
        this.f13499c.mo495b(this, this.f13503g);
    }

    /* renamed from: c */
    public void mo558c() {
        if (!this.f13501e) {
            this.f13501e = true;
            this.f13498b.sendAccessibilityEvent(32);
            this.f13499c.mo492a(this);
        }
    }

    /* renamed from: b */
    public Menu mo555b() {
        return this.f13503g;
    }

    /* renamed from: f */
    public CharSequence mo560f() {
        return this.f13498b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo561g() {
        return this.f13498b.getSubtitle();
    }

    /* renamed from: i */
    public View mo563i() {
        return this.f13500d != null ? (View) this.f13500d.get() : null;
    }

    /* renamed from: a */
    public MenuInflater mo550a() {
        return new C0712g(this.f13498b.getContext());
    }

    /* renamed from: a */
    public boolean mo102a(C3224h c3224h, MenuItem menuItem) {
        return this.f13499c.mo494a((C0706b) this, menuItem);
    }

    /* renamed from: a */
    public void mo101a(C3224h c3224h) {
        mo559d();
        this.f13498b.mo617a();
    }
}
