package android.support.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

class an {
    /* renamed from: a */
    private static final aq f1010a;

    static {
        if (VERSION.SDK_INT >= 18) {
            f1010a = new ap();
        } else {
            f1010a = new ao();
        }
    }

    /* renamed from: a */
    static am m985a(ViewGroup viewGroup) {
        return f1010a.mo219a(viewGroup);
    }

    /* renamed from: a */
    static void m986a(ViewGroup viewGroup, boolean z) {
        f1010a.mo220a(viewGroup, z);
    }
}
