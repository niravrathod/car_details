package android.support.v7.app;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.app.C4766h.C4456a;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Window;

/* renamed from: android.support.v7.app.i */
class C4845i extends C4766h {
    /* renamed from: t */
    private final UiModeManager f21473t;

    /* renamed from: android.support.v7.app.i$a */
    class C4767a extends C4456a {
        /* renamed from: d */
        final /* synthetic */ C4845i f20839d;

        public ActionMode onWindowStartingActionMode(Callback callback) {
            return null;
        }

        C4767a(C4845i c4845i, Window.Callback callback) {
            this.f20839d = c4845i;
            super(c4845i, callback);
        }

        public ActionMode onWindowStartingActionMode(Callback callback, int i) {
            if (this.f20839d.mo4611p()) {
                if (i == 0) {
                    return m24414a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C4845i(Context context, Window window, C0662d c0662d) {
        super(context, window, c0662d);
        this.f21473t = (UiModeManager) context.getSystemService("uimode");
    }

    /* renamed from: a */
    Window.Callback mo4609a(Window.Callback callback) {
        return new C4767a(this, callback);
    }

    /* renamed from: d */
    int mo4610d(int i) {
        if (i == 0 && this.f21473t.getNightMode() == 0) {
            return -1;
        }
        return super.mo4610d(i);
    }
}
