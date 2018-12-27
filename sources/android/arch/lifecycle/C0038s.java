package android.arch.lifecycle;

import java.util.HashMap;

/* renamed from: android.arch.lifecycle.s */
public class C0038s {
    /* renamed from: a */
    private final HashMap<String, C0035q> f66a = new HashMap();

    /* renamed from: a */
    final void m96a(String str, C0035q c0035q) {
        C0035q c0035q2 = (C0035q) this.f66a.put(str, c0035q);
        if (c0035q2 != null) {
            c0035q2.mo262a();
        }
    }

    /* renamed from: a */
    final C0035q m94a(String str) {
        return (C0035q) this.f66a.get(str);
    }

    /* renamed from: a */
    public final void m95a() {
        for (C0035q a : this.f66a.values()) {
            a.mo262a();
        }
        this.f66a.clear();
    }
}
