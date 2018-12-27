package android.support.v7.app;

import android.content.Context;
import android.support.v7.app.C4845i.C4767a;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

/* renamed from: android.support.v7.app.g */
class C4871g extends C4845i {

    /* renamed from: android.support.v7.app.g$a */
    class C4844a extends C4767a {
        /* renamed from: b */
        final /* synthetic */ C4871g f21472b;

        C4844a(C4871g c4871g, Callback callback) {
            this.f21472b = c4871g;
            super(c4871g, callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            PanelFeatureState a = this.f21472b.m24371a(0, true);
            if (a == null || a.f2124j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f2124j, i);
            }
        }
    }

    C4871g(Context context, Window window, C0662d c0662d) {
        super(context, window, c0662d);
    }

    /* renamed from: a */
    Callback mo4609a(Callback callback) {
        return new C4844a(this, callback);
    }
}
