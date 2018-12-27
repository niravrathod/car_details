package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.app.C4455c;
import android.support.v7.app.C4455c.C0661a;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.view.menu.C0728o.C0727a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: android.support.v7.view.menu.i */
class C3225i implements OnClickListener, OnDismissListener, OnKeyListener, C0727a {
    /* renamed from: a */
    C3223f f13599a;
    /* renamed from: b */
    private C3224h f13600b;
    /* renamed from: c */
    private C4455c f13601c;
    /* renamed from: d */
    private C0727a f13602d;

    public C3225i(C3224h c3224h) {
        this.f13600b = c3224h;
    }

    /* renamed from: a */
    public void m16188a(IBinder iBinder) {
        C3224h c3224h = this.f13600b;
        C0661a c0661a = new C0661a(c3224h.m16172e());
        this.f13599a = new C3223f(c0661a.m2633a(), C0633g.abc_list_menu_item_layout);
        this.f13599a.mo78a((C0727a) this);
        this.f13600b.m16149a(this.f13599a);
        c0661a.m2638a(this.f13599a.m16127d(), (OnClickListener) this);
        View o = c3224h.m16183o();
        if (o != null) {
            c0661a.m2637a(o);
        } else {
            c0661a.m2636a(c3224h.m16182n()).m2639a(c3224h.m16181m());
        }
        c0661a.m2635a((OnKeyListener) this);
        this.f13601c = c0661a.m2645b();
        this.f13601c.setOnDismissListener(this);
        LayoutParams attributes = this.f13601c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f13601c.show();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                dialogInterface = this.f13601c.getWindow();
                if (dialogInterface != null) {
                    dialogInterface = dialogInterface.getDecorView();
                    if (dialogInterface != null) {
                        dialogInterface = dialogInterface.getKeyDispatcherState();
                        if (dialogInterface != null) {
                            dialogInterface.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                Window window = this.f13601c.getWindow();
                if (window != null) {
                    View decorView = window.getDecorView();
                    if (decorView != null) {
                        DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f13600b.m16161b(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f13600b.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void m16187a() {
        if (this.f13601c != null) {
            this.f13601c.dismiss();
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f13599a.mo77a(this.f13600b, true);
    }

    /* renamed from: a */
    public void mo490a(C3224h c3224h, boolean z) {
        if (z || c3224h == this.f13600b) {
            m16187a();
        }
        if (this.f13602d != null) {
            this.f13602d.mo490a(c3224h, z);
        }
    }

    /* renamed from: a */
    public boolean mo491a(C3224h c3224h) {
        return this.f13602d != null ? this.f13602d.mo491a(c3224h) : null;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f13600b.m16155a((C3227j) this.f13599a.m16127d().getItem(i), 0);
    }
}
