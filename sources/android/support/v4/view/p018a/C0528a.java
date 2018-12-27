package android.support.v4.view.p018a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a.a */
public final class C0528a {
    /* renamed from: a */
    public static void m1947a(AccessibilityEvent accessibilityEvent, int i) {
        if (VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m1946a(AccessibilityEvent accessibilityEvent) {
        return VERSION.SDK_INT >= 19 ? accessibilityEvent.getContentChangeTypes() : null;
    }
}
