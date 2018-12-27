package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.C0706b;
import android.support.v7.view.C0706b.C0705a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public abstract class ActionBar {

    public static class LayoutParams extends MarginLayoutParams {
        /* renamed from: a */
        public int f1997a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1997a = 0;
            context = context.obtainStyledAttributes(attributeSet, C0636j.ActionBarLayout);
            this.f1997a = context.getInt(C0636j.ActionBarLayout_android_layout_gravity, 0);
            context.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1997a = 0;
            this.f1997a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1997a = 0;
            this.f1997a = layoutParams.f1997a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1997a = null;
        }
    }

    /* renamed from: android.support.v7.app.ActionBar$a */
    public interface C0638a {
        /* renamed from: a */
        void m2536a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v7.app.ActionBar$b */
    public static abstract class C0639b {
        /* renamed from: a */
        public abstract Drawable m2537a();

        /* renamed from: b */
        public abstract CharSequence m2538b();

        /* renamed from: c */
        public abstract View m2539c();

        /* renamed from: d */
        public abstract void m2540d();

        /* renamed from: e */
        public abstract CharSequence m2541e();
    }

    /* renamed from: a */
    public abstract int mo526a();

    /* renamed from: a */
    public C0706b mo564a(C0705a c0705a) {
        return null;
    }

    /* renamed from: a */
    public abstract void mo528a(int i);

    /* renamed from: a */
    public void mo529a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo530a(Drawable drawable) {
    }

    /* renamed from: a */
    public abstract void mo531a(CharSequence charSequence);

    /* renamed from: a */
    public abstract void mo532a(boolean z);

    /* renamed from: a */
    public boolean mo533a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo534a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo535b() {
        return null;
    }

    /* renamed from: b */
    public void mo536b(int i) {
    }

    /* renamed from: b */
    public void mo537b(CharSequence charSequence) {
    }

    /* renamed from: b */
    public abstract void mo538b(boolean z);

    /* renamed from: c */
    public abstract void mo539c(boolean z);

    /* renamed from: c */
    public boolean mo540c() {
        return false;
    }

    /* renamed from: d */
    public void mo541d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo542d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo543e() {
        return false;
    }

    /* renamed from: f */
    public void mo544f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo545f() {
        return false;
    }

    /* renamed from: g */
    void mo546g() {
    }

    /* renamed from: g */
    public void mo547g(boolean z) {
    }

    /* renamed from: h */
    public void mo548h(boolean z) {
    }

    /* renamed from: e */
    public void mo566e(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    /* renamed from: a */
    public void mo527a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
