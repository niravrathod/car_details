package androidx.navigation;

import android.app.Activity;
import android.support.v4.app.C3104a;
import android.view.View;
import androidx.navigation.C0913o.C0911a;
import java.lang.ref.WeakReference;

/* renamed from: androidx.navigation.l */
public class C0905l {
    /* renamed from: a */
    public static C0894d m3956a(Activity activity, int i) {
        C0894d b = C0905l.m3959b(C3104a.m15333a(activity, i));
        if (b != null) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Activity ");
        stringBuilder.append(activity);
        stringBuilder.append(" does not have a NavController set on ");
        stringBuilder.append(i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static C0894d m3957a(View view) {
        C0894d b = C0905l.m3959b(view);
        if (b != null) {
            return b;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("View ");
        stringBuilder.append(view);
        stringBuilder.append(" does not have a NavController set");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /* renamed from: a */
    public static void m3958a(View view, C0894d c0894d) {
        view.setTag(C0911a.nav_controller_view_tag, c0894d);
    }

    /* renamed from: b */
    private static C0894d m3959b(View view) {
        while (view != null) {
            C0894d c = C0905l.m3960c(view);
            if (c != null) {
                return c;
            }
            view = view.getParent();
            view = view instanceof View ? view : null;
        }
        return null;
    }

    /* renamed from: c */
    private static C0894d m3960c(View view) {
        view = view.getTag(C0911a.nav_controller_view_tag);
        if (view instanceof WeakReference) {
            return (C0894d) ((WeakReference) view).get();
        }
        return view instanceof C0894d ? (C0894d) view : null;
    }
}
