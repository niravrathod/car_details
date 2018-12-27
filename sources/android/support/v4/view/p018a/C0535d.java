package android.support.v4.view.p018a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: android.support.v4.view.a.d */
public class C0535d {
    /* renamed from: a */
    private final AccessibilityRecord f1738a;

    /* renamed from: a */
    public static void m2010a(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m2011b(AccessibilityRecord accessibilityRecord, int i) {
        if (VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        return this.f1738a == null ? 0 : this.f1738a.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0535d c0535d = (C0535d) obj;
        if (this.f1738a == null) {
            if (c0535d.f1738a != null) {
                return false;
            }
        } else if (this.f1738a.equals(c0535d.f1738a) == null) {
            return false;
        }
        return true;
    }
}
