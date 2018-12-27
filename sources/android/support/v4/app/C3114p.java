package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment.SavedState;
import android.support.v4.view.C0555o;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.p */
public abstract class C3114p extends C0555o {
    /* renamed from: a */
    private final C0334l f13194a;
    /* renamed from: b */
    private C0347q f13195b = null;
    /* renamed from: c */
    private ArrayList<SavedState> f13196c = new ArrayList();
    /* renamed from: d */
    private ArrayList<Fragment> f13197d = new ArrayList();
    /* renamed from: e */
    private Fragment f13198e = null;

    /* renamed from: a */
    public abstract Fragment mo3919a(int i);

    public C3114p(C0334l c0334l) {
        this.f13194a = c0334l;
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
        Fragment fragment;
        if (this.f13197d.size() > i) {
            fragment = (Fragment) this.f13197d.get(i);
            if (fragment != null) {
                return fragment;
            }
        }
        if (this.f13195b == null) {
            this.f13195b = this.f13194a.mo292a();
        }
        fragment = mo3919a(i);
        if (this.f13196c.size() > i) {
            SavedState savedState = (SavedState) this.f13196c.get(i);
            if (savedState != null) {
                fragment.setInitialSavedState(savedState);
            }
        }
        while (this.f13197d.size() <= i) {
            this.f13197d.add(null);
        }
        fragment.setMenuVisibility(false);
        fragment.setUserVisibleHint(false);
        this.f13197d.set(i, fragment);
        this.f13195b.mo268a(viewGroup.getId(), fragment);
        return fragment;
    }

    /* renamed from: a */
    public void mo312a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f13195b == null) {
            this.f13195b = this.f13194a.mo292a();
        }
        while (this.f13196c.size() <= i) {
            this.f13196c.add(null);
        }
        this.f13196c.set(i, fragment.isAdded() ? this.f13194a.mo288a(fragment) : null);
        this.f13197d.set(i, null);
        this.f13195b.mo270a(fragment);
    }

    /* renamed from: b */
    public void mo315b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f13198e) {
            if (this.f13198e != null) {
                this.f13198e.setMenuVisibility(false);
                this.f13198e.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f13198e = fragment;
        }
    }

    /* renamed from: b */
    public void mo314b(ViewGroup viewGroup) {
        if (this.f13195b != null) {
            this.f13195b.mo283f();
            this.f13195b = null;
        }
    }

    /* renamed from: a */
    public boolean mo313a(View view, Object obj) {
        return ((Fragment) obj).getView() == view ? true : null;
    }

    /* renamed from: a */
    public Parcelable mo308a() {
        Parcelable bundle;
        if (this.f13196c.size() > 0) {
            bundle = new Bundle();
            Parcelable[] parcelableArr = new SavedState[this.f13196c.size()];
            this.f13196c.toArray(parcelableArr);
            bundle.putParcelableArray("states", parcelableArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f13197d.size(); i++) {
            Fragment fragment = (Fragment) this.f13197d.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("f");
                stringBuilder.append(i);
                this.f13194a.mo294a(bundle, stringBuilder.toString(), fragment);
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo310a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            classLoader = bundle.getParcelableArray("states");
            this.f13196c.clear();
            this.f13197d.clear();
            if (classLoader != null) {
                for (Object obj : classLoader) {
                    this.f13196c.add((SavedState) obj);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment a = this.f13194a.mo290a(bundle, str);
                    if (a != null) {
                        while (this.f13197d.size() <= parseInt) {
                            this.f13197d.add(null);
                        }
                        a.setMenuVisibility(false);
                        this.f13197d.set(parseInt, a);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Bad fragment at key ");
                        stringBuilder.append(str);
                        Log.w("FragmentStatePagerAdapt", stringBuilder.toString());
                    }
                }
            }
        }
    }
}
