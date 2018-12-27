package androidx.navigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.p017f.C0429j;
import android.support.v4.p017f.C0434n;
import android.util.AttributeSet;
import androidx.navigation.p030a.C0890a.C0889a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.navigation.h */
public class C3281h extends C0900g implements Iterable<C0900g> {
    /* renamed from: a */
    final C0434n<C0900g> f14001a = new C0434n();
    /* renamed from: b */
    private int f14002b;

    /* renamed from: androidx.navigation.h$1 */
    class C09011 implements Iterator<C0900g> {
        /* renamed from: a */
        final /* synthetic */ C3281h f3062a;
        /* renamed from: b */
        private int f3063b = -1;
        /* renamed from: c */
        private boolean f3064c = null;

        C09011(C3281h c3281h) {
            this.f3062a = c3281h;
        }

        public /* synthetic */ Object next() {
            return m3928a();
        }

        public boolean hasNext() {
            return this.f3063b + 1 < this.f3062a.f14001a.m1592b();
        }

        /* renamed from: a */
        public C0900g m3928a() {
            if (hasNext()) {
                this.f3064c = true;
                C0434n c0434n = this.f3062a.f14001a;
                int i = this.f3063b + 1;
                this.f3063b = i;
                return (C0900g) c0434n.m1600f(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3064c) {
                ((C0900g) this.f3062a.f14001a.m1600f(this.f3063b)).m3917a(null);
                this.f3062a.f14001a.m1598d(this.f3063b);
                this.f3063b--;
                this.f3064c = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public C3281h(C0909m<? extends C3281h> c0909m) {
        super(c0909m);
    }

    /* renamed from: a */
    public void mo852a(Context context, AttributeSet attributeSet) {
        super.mo852a(context, attributeSet);
        context = context.getResources().obtainAttributes(attributeSet, C0889a.NavGraphNavigator);
        m16924d(context.getResourceId(C0889a.NavGraphNavigator_startDestination, 0));
        context.recycle();
    }

    /* renamed from: b */
    C0429j<C0900g, Bundle> mo862b(Uri uri) {
        C0429j<C0900g, Bundle> b = super.mo862b(uri);
        if (b != null) {
            return b;
        }
        Iterator it = iterator();
        while (it.hasNext()) {
            C0429j<C0900g, Bundle> b2 = ((C0900g) it.next()).mo862b(uri);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m16921a(C0900g c0900g) {
        if (c0900g.m3923d() != 0) {
            C0900g c0900g2 = (C0900g) this.f14001a.m1590a(c0900g.m3923d());
            if (c0900g2 != c0900g) {
                if (c0900g.m3921c() == null) {
                    if (c0900g2 != null) {
                        c0900g2.m3917a(null);
                    }
                    c0900g.m3917a(this);
                    this.f14001a.m1594b(c0900g.m3923d(), c0900g);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            return;
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    /* renamed from: c */
    public C0900g m16923c(int i) {
        return m16919a(i, true);
    }

    /* renamed from: a */
    C0900g m16919a(int i, boolean z) {
        C0900g c0900g = (C0900g) this.f14001a.m1590a(i);
        if (c0900g != null) {
            return c0900g;
        }
        return (z && m3921c()) ? m3921c().m16923c(i) : null;
    }

    public Iterator<C0900g> iterator() {
        return new C09011(this);
    }

    /* renamed from: a */
    public int m16918a() {
        return this.f14002b;
    }

    /* renamed from: d */
    public void m16924d(int i) {
        this.f14002b = i;
    }
}
