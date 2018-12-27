package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.p011b.p012a.C0372b;
import android.support.v4.view.C0542b.C0538b;
import android.support.v7.view.menu.C4461k.C3228a;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.l */
class C4768l extends C4461k {

    /* renamed from: android.support.v7.view.menu.l$a */
    class C4462a extends C3228a implements VisibilityListener {
        /* renamed from: c */
        C0538b f18530c;
        /* renamed from: d */
        final /* synthetic */ C4768l f18531d;

        public C4462a(C4768l c4768l, Context context, ActionProvider actionProvider) {
            this.f18531d = c4768l;
            super(c4768l, context, actionProvider);
        }

        /* renamed from: a */
        public View mo3830a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        /* renamed from: b */
        public boolean mo3832b() {
            return this.a.overridesItemVisibility();
        }

        /* renamed from: c */
        public boolean mo3833c() {
            return this.a.isVisible();
        }

        /* renamed from: a */
        public void mo3831a(C0538b c0538b) {
            this.f18530c = c0538b;
            this.a.setVisibilityListener(c0538b != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f18530c != null) {
                this.f18530c.mo609a(z);
            }
        }
    }

    C4768l(Context context, C0372b c0372b) {
        super(context, c0372b);
    }

    /* renamed from: a */
    C3228a mo4613a(ActionProvider actionProvider) {
        return new C4462a(this, this.a, actionProvider);
    }
}
