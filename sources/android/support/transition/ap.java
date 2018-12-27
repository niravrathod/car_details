package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Method;

class ap extends ao {
    /* renamed from: a */
    private static Method f18401a;
    /* renamed from: b */
    private static boolean f18402b;

    ap() {
    }

    /* renamed from: a */
    public am mo219a(ViewGroup viewGroup) {
        return new al(viewGroup);
    }

    /* renamed from: a */
    public void mo220a(ViewGroup viewGroup, boolean z) {
        m24213a();
        if (f18401a != null) {
            try {
                f18401a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (ViewGroup viewGroup2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", viewGroup2);
            } catch (ViewGroup viewGroup22) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", viewGroup22);
            }
        }
    }

    /* renamed from: a */
    private void m24213a() {
        if (!f18402b) {
            try {
                f18401a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f18401a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f18402b = true;
        }
    }
}
