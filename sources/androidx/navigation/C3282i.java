package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.navigation.C0909m.C0906a;
import androidx.navigation.C0909m.C0907b;
import java.util.ArrayDeque;
import java.util.Iterator;

@C0907b(a = "navigation")
/* renamed from: androidx.navigation.i */
public class C3282i extends C0909m<C3281h> {
    /* renamed from: a */
    private Context f14003a;
    /* renamed from: b */
    private ArrayDeque<Integer> f14004b = new ArrayDeque();

    /* renamed from: c */
    public /* synthetic */ C0900g mo855c() {
        return m16926a();
    }

    public C3282i(Context context) {
        this.f14003a = context;
    }

    /* renamed from: a */
    public C3281h m16926a() {
        return new C3281h(this);
    }

    /* renamed from: a */
    public void m16929a(C3281h c3281h, Bundle bundle, C0904k c0904k, C0906a c0906a) {
        int a = c3281h.m16918a();
        if (a == 0) {
            c0904k = new StringBuilder();
            c0904k.append("no start destination defined via app:startDestination for ");
            c0904k.append(c3281h.m3923d() != null ? C0900g.m3912a(this.f14003a, c3281h.m3923d()) : "the root navigation");
            throw new IllegalStateException(c0904k.toString());
        }
        C0900g a2 = c3281h.m16919a(a, false);
        if (a2 != null) {
            if (c0904k != null && c0904k.m3947a() && m16925a(c3281h)) {
                m3963a(c3281h.m3923d(), 0);
            } else {
                this.f14004b.add(Integer.valueOf(c3281h.m3923d()));
                m3963a(c3281h.m3923d(), 1);
            }
            a2.m3916a(bundle, c0904k, c0906a);
            return;
        }
        c3281h = C0900g.m3912a(this.f14003a, a);
        c0904k = new StringBuilder();
        c0904k.append("navigation destination ");
        c0904k.append(c3281h);
        c0904k.append(" is not a direct child of this NavGraph");
        throw new IllegalArgumentException(c0904k.toString());
    }

    /* renamed from: a */
    private boolean m16925a(C3281h c3281h) {
        if (this.f14004b.isEmpty()) {
            return false;
        }
        int intValue = ((Integer) this.f14004b.peekLast()).intValue();
        while (c3281h.m3923d() != intValue) {
            c3281h = c3281h.m16923c(c3281h.m16918a());
            if (!(c3281h instanceof C3281h)) {
                return false;
            }
            c3281h = c3281h;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo854b() {
        int i = 0;
        if (this.f14004b.isEmpty()) {
            return false;
        }
        this.f14004b.removeLast();
        if (!this.f14004b.isEmpty()) {
            i = ((Integer) this.f14004b.peekLast()).intValue();
        }
        m3963a(i, 2);
        return true;
    }

    /* renamed from: d */
    public Bundle mo859d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f14004b.size()];
        Iterator it = this.f14004b.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        bundle.putIntArray("androidx-nav-graph:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: a */
    public void mo858a(Bundle bundle) {
        if (bundle != null) {
            bundle = bundle.getIntArray("androidx-nav-graph:navigator:backStackIds");
            if (bundle != null) {
                this.f14004b.clear();
                for (int valueOf : bundle) {
                    this.f14004b.add(Integer.valueOf(valueOf));
                }
            }
        }
    }
}
