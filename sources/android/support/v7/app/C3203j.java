package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.view.C0706b;
import android.support.v7.view.C0706b.C0705a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.j */
public class C3203j extends Dialog implements C0662d {
    /* renamed from: a */
    private C0663e f13435a;

    /* renamed from: a */
    public C0706b mo521a(C0705a c0705a) {
        return null;
    }

    /* renamed from: a */
    public void mo522a(C0706b c0706b) {
    }

    /* renamed from: b */
    public void mo523b(C0706b c0706b) {
    }

    public C3203j(Context context, int i) {
        super(context, C3203j.m15936a(context, i));
        m15937a().mo3800a((Bundle) 0);
        m15937a().mo520j();
    }

    protected void onCreate(Bundle bundle) {
        m15937a().mo3814i();
        super.onCreate(bundle);
        m15937a().mo3800a(bundle);
    }

    public void setContentView(int i) {
        m15937a().mo3806b(i);
    }

    public void setContentView(View view) {
        m15937a().mo3802a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m15937a().mo3803a(view, layoutParams);
    }

    public <T extends View> T findViewById(int i) {
        return m15937a().mo3797a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m15937a().mo513a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m15937a().mo513a(getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m15937a().mo3808b(view, layoutParams);
    }

    protected void onStop() {
        super.onStop();
        m15937a().mo517d();
    }

    /* renamed from: a */
    public boolean m15940a(int i) {
        return m15937a().mo3811c(i);
    }

    public void invalidateOptionsMenu() {
        m15937a().mo3813f();
    }

    /* renamed from: a */
    public C0663e m15937a() {
        if (this.f13435a == null) {
            this.f13435a = C0663e.m2651a((Dialog) this, (C0662d) this);
        }
        return this.f13435a;
    }

    /* renamed from: a */
    private static int m15936a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        i = new TypedValue();
        context.getTheme().resolveAttribute(C0627a.dialogTheme, i, true);
        return i.resourceId;
    }
}
