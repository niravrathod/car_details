package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.C0334l;
import android.support.v4.app.C0334l.C0333c;
import android.support.v4.app.C0347q;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.navigation.C0900g;
import androidx.navigation.C0904k;
import androidx.navigation.C0909m;
import androidx.navigation.C0909m.C0906a;
import androidx.navigation.C0909m.C0907b;
import androidx.navigation.fragment.C0899c.C0898a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

@C0907b(a = "fragment")
/* renamed from: androidx.navigation.fragment.b */
public class C3280b extends C0909m<C3278a> {
    /* renamed from: a */
    C0334l f13996a;
    /* renamed from: b */
    ArrayDeque<Integer> f13997b = new ArrayDeque();
    /* renamed from: c */
    boolean f13998c = null;
    /* renamed from: d */
    private int f13999d;
    /* renamed from: e */
    private final C0333c f14000e = new C32771(this);

    /* renamed from: androidx.navigation.fragment.b$1 */
    class C32771 implements C0333c {
        /* renamed from: a */
        final /* synthetic */ C3280b f13993a;

        C32771(C3280b c3280b) {
            this.f13993a = c3280b;
        }

        /* renamed from: a */
        public void mo857a() {
            if (this.f13993a.f13998c) {
                this.f13993a.f13998c = this.f13993a.m16917g() ^ 1;
                return;
            }
            int e = this.f13993a.f13996a.mo303e() + 1;
            if (e < this.f13993a.f13997b.size()) {
                while (this.f13993a.f13997b.size() > e) {
                    this.f13993a.f13997b.removeLast();
                }
                this.f13993a.m3963a(this.f13993a.f13997b.isEmpty() ? 0 : ((Integer) this.f13993a.f13997b.peekLast()).intValue(), 2);
            }
        }
    }

    /* renamed from: androidx.navigation.fragment.b$a */
    public static class C3278a extends C0900g {
        /* renamed from: a */
        private Class<? extends Fragment> f13994a;

        public C3278a(C0909m<? extends C3278a> c0909m) {
            super(c0909m);
        }

        /* renamed from: a */
        public void mo852a(Context context, AttributeSet attributeSet) {
            super.mo852a(context, attributeSet);
            attributeSet = context.getResources().obtainAttributes(attributeSet, C0898a.FragmentNavigator);
            String string = attributeSet.getString(C0898a.FragmentNavigator_android_name);
            if (string != null) {
                m16904a(C0900g.m3911a(context, string, Fragment.class));
            }
            attributeSet.recycle();
        }

        /* renamed from: a */
        public C3278a m16904a(Class<? extends Fragment> cls) {
            this.f13994a = cls;
            return this;
        }

        /* renamed from: a */
        public Class<? extends Fragment> m16905a() {
            if (this.f13994a != null) {
                return this.f13994a;
            }
            throw new IllegalStateException("fragment class not set");
        }

        /* renamed from: a */
        public Fragment m16903a(Bundle bundle) {
            try {
                Fragment fragment = (Fragment) m16905a().newInstance();
                if (bundle != null) {
                    fragment.setArguments(bundle);
                }
                return fragment;
            } catch (Bundle bundle2) {
                throw new RuntimeException(bundle2);
            }
        }
    }

    /* renamed from: androidx.navigation.fragment.b$b */
    public static class C3279b implements C0906a {
        /* renamed from: a */
        private final LinkedHashMap<View, String> f13995a;

        /* renamed from: a */
        public Map<View, String> m16907a() {
            return Collections.unmodifiableMap(this.f13995a);
        }
    }

    /* renamed from: c */
    public /* synthetic */ C0900g mo855c() {
        return m16908a();
    }

    public C3280b(Context context, C0334l c0334l, int i) {
        this.f13996a = c0334l;
        this.f13999d = i;
    }

    /* renamed from: e */
    public void mo860e() {
        this.f13996a.mo296a(this.f14000e);
    }

    /* renamed from: f */
    public void mo861f() {
        this.f13996a.mo299b(this.f14000e);
    }

    /* renamed from: b */
    public boolean mo854b() {
        int i = 0;
        if (this.f13997b.isEmpty()) {
            return false;
        }
        if (this.f13996a.mo307i()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        boolean z = true;
        if (this.f13996a.mo303e() > 0) {
            this.f13996a.mo301c();
            this.f13998c = true;
        } else {
            z = false;
        }
        this.f13997b.removeLast();
        if (!this.f13997b.isEmpty()) {
            i = ((Integer) this.f13997b.peekLast()).intValue();
        }
        m3963a(i, 2);
        return z;
    }

    /* renamed from: a */
    public C3278a m16908a() {
        return new C3278a(this);
    }

    /* renamed from: a */
    public void m16910a(C3278a c3278a, Bundle bundle, C0904k c0904k, C0906a c0906a) {
        if (this.f13996a.mo307i()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        bundle = c3278a.m16903a(bundle);
        C0347q a = this.f13996a.mo292a();
        int f = c0904k != null ? c0904k.m3952f() : -1;
        int g = c0904k != null ? c0904k.m3953g() : -1;
        int h = c0904k != null ? c0904k.m3954h() : -1;
        int i = c0904k != null ? c0904k.m3955i() : -1;
        int i2 = 0;
        if (!(f == -1 && g == -1 && h == -1 && i == -1)) {
            if (f == -1) {
                f = 0;
            }
            if (g == -1) {
                g = 0;
            }
            if (h == -1) {
                h = 0;
            }
            if (i == -1) {
                i = 0;
            }
            a.mo267a(f, g, h, i);
        }
        a.mo276b(this.f13999d, bundle);
        a.mo281d(bundle);
        C0904k d = c3278a.m3923d();
        bundle = this.f13997b.isEmpty();
        Object obj = (c0904k == null || !c0904k.m3949c()) ? null : 1;
        c0904k = (c0904k == null || bundle != null || c0904k.m3947a() == null || ((Integer) this.f13997b.peekLast()).intValue() != d) ? null : true;
        if (bundle == null) {
            if (obj == null) {
                if (c0904k != null) {
                    if (this.f13997b.size() > 1) {
                        this.f13996a.mo301c();
                        a.mo273a(Integer.toString(d));
                        this.f13998c = true;
                    }
                    if ((c0906a instanceof C3279b) != null) {
                        for (Entry entry : ((C3279b) c0906a).m16907a().entrySet()) {
                            a.mo272a((View) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    a.mo274a(true);
                    a.mo278c();
                    if (i2 == 1) {
                        this.f13997b.add(Integer.valueOf(d));
                    }
                    m3963a(d, i2);
                }
                a.mo273a(Integer.toString(d));
                this.f13998c = true;
            }
        }
        i2 = 1;
        if ((c0906a instanceof C3279b) != null) {
            for (Entry entry2 : ((C3279b) c0906a).m16907a().entrySet()) {
                a.mo272a((View) entry2.getKey(), (String) entry2.getValue());
            }
        }
        a.mo274a(true);
        a.mo278c();
        if (i2 == 1) {
            this.f13997b.add(Integer.valueOf(d));
        }
        m3963a(d, i2);
    }

    /* renamed from: d */
    public Bundle mo859d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.f13997b.size()];
        Iterator it = this.f13997b.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) it.next()).intValue();
            i = i2;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    /* renamed from: a */
    public void mo858a(Bundle bundle) {
        if (bundle != null) {
            bundle = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
            if (bundle != null) {
                this.f13997b.clear();
                for (int valueOf : bundle) {
                    this.f13997b.add(Integer.valueOf(valueOf));
                }
            }
        }
    }

    /* renamed from: g */
    boolean m16917g() {
        int e = this.f13996a.mo303e();
        if (this.f13997b.size() != e + 1) {
            return false;
        }
        Iterator descendingIterator = this.f13997b.descendingIterator();
        e--;
        while (descendingIterator.hasNext() && e >= 0) {
            int i = e - 1;
            if (((Integer) descendingIterator.next()).intValue() != Integer.valueOf(this.f13996a.mo298b(e).mo284i()).intValue()) {
                return false;
            }
            e = i;
        }
        return true;
    }
}
