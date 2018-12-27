package android.support.v4.view.p018a;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.view.a.c */
public class C0534c {
    /* renamed from: a */
    private final Object f1737a;

    /* renamed from: android.support.v4.view.a.c$a */
    static class C0533a extends AccessibilityNodeProvider {
        /* renamed from: a */
        final C0534c f1736a;

        C0533a(C0534c c0534c) {
            this.f1736a = c0534c;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            i = this.f1736a.m2005a(i);
            if (i == 0) {
                return 0;
            }
            return i.m1953a();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            str = this.f1736a.m2007a(str, i);
            if (str == null) {
                return null;
            }
            i = new ArrayList();
            int size = str.size();
            for (int i2 = 0; i2 < size; i2++) {
                i.add(((C0532b) str.get(i2)).m1953a());
            }
            return i;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f1736a.m2008a(i, i2, bundle);
        }
    }

    /* renamed from: android.support.v4.view.a.c$b */
    static class C3161b extends C0533a {
        C3161b(C0534c c0534c) {
            super(c0534c);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            i = this.a.m2009b(i);
            if (i == 0) {
                return 0;
            }
            return i.m1953a();
        }
    }

    /* renamed from: a */
    public C0532b m2005a(int i) {
        return null;
    }

    /* renamed from: a */
    public List<C0532b> m2007a(String str, int i) {
        return null;
    }

    /* renamed from: a */
    public boolean m2008a(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: b */
    public C0532b m2009b(int i) {
        return null;
    }

    public C0534c() {
        if (VERSION.SDK_INT >= 19) {
            this.f1737a = new C3161b(this);
        } else if (VERSION.SDK_INT >= 16) {
            this.f1737a = new C0533a(this);
        } else {
            this.f1737a = null;
        }
    }

    public C0534c(Object obj) {
        this.f1737a = obj;
    }

    /* renamed from: a */
    public Object m2006a() {
        return this.f1737a;
    }
}
