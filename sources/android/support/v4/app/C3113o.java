package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.C0555o;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.app.o */
public abstract class C3113o extends C0555o {
    /* renamed from: a */
    private final C0334l f13191a;
    /* renamed from: b */
    private C0347q f13192b = null;
    /* renamed from: c */
    private Fragment f13193c = null;

    /* renamed from: a */
    public Parcelable mo308a() {
        return null;
    }

    /* renamed from: a */
    public abstract Fragment mo3917a(int i);

    /* renamed from: a */
    public void mo310a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public long m15533b(int i) {
        return (long) i;
    }

    public C3113o(C0334l c0334l) {
        this.f13191a = c0334l;
    }

    /* renamed from: a */
    public void mo311a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPager with adapter ");
            stringBuilder.append(this);
            stringBuilder.append(" requires a view id");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public Object mo309a(ViewGroup viewGroup, int i) {
        if (this.f13192b == null) {
            this.f13192b = this.f13191a.mo292a();
        }
        long b = m15533b(i);
        Fragment a = this.f13191a.mo291a(C3113o.m15525a(viewGroup.getId(), b));
        if (a != null) {
            this.f13192b.mo279c(a);
        } else {
            a = mo3917a(i);
            this.f13192b.mo269a(viewGroup.getId(), a, C3113o.m15525a(viewGroup.getId(), b));
        }
        if (a != this.f13193c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    /* renamed from: a */
    public void mo312a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f13192b == null) {
            this.f13192b = this.f13191a.mo292a();
        }
        this.f13192b.mo277b((Fragment) obj);
    }

    /* renamed from: b */
    public void mo315b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f13193c) {
            if (this.f13193c != null) {
                this.f13193c.setMenuVisibility(false);
                this.f13193c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f13193c = fragment;
        }
    }

    /* renamed from: b */
    public void mo314b(ViewGroup viewGroup) {
        if (this.f13192b != null) {
            this.f13192b.mo283f();
            this.f13192b = null;
        }
    }

    /* renamed from: a */
    public boolean mo313a(View view, Object obj) {
        return ((Fragment) obj).getView() == view ? true : null;
    }

    /* renamed from: a */
    private static String m15525a(int i, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android:switcher:");
        stringBuilder.append(i);
        stringBuilder.append(":");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }
}
