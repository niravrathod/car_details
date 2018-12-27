package com.bumptech.glide.p052c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.C3377g;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.c.o */
public class C4505o extends Fragment {
    /* renamed from: a */
    private final C3358a f18820a;
    /* renamed from: b */
    private final C1141m f18821b;
    /* renamed from: c */
    private final Set<C4505o> f18822c;
    /* renamed from: d */
    private C4505o f18823d;
    /* renamed from: e */
    private C3377g f18824e;
    /* renamed from: f */
    private Fragment f18825f;

    /* renamed from: com.bumptech.glide.c.o$a */
    private class C3365a implements C1141m {
        /* renamed from: a */
        final /* synthetic */ C4505o f14237a;

        C3365a(C4505o c4505o) {
            this.f14237a = c4505o;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(this.f14237a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public C4505o() {
        this(new C3358a());
    }

    @SuppressLint({"ValidFragment"})
    public C4505o(C3358a c3358a) {
        this.f18821b = new C3365a(this);
        this.f18822c = new HashSet();
        this.f18820a = c3358a;
    }

    /* renamed from: a */
    public void m24923a(C3377g c3377g) {
        this.f18824e = c3377g;
    }

    /* renamed from: a */
    C3358a m24921a() {
        return this.f18820a;
    }

    /* renamed from: b */
    public C3377g m24924b() {
        return this.f18824e;
    }

    /* renamed from: c */
    public C1141m m24925c() {
        return this.f18821b;
    }

    /* renamed from: a */
    private void m24917a(C4505o c4505o) {
        this.f18822c.add(c4505o);
    }

    /* renamed from: b */
    private void m24918b(C4505o c4505o) {
        this.f18822c.remove(c4505o);
    }

    /* renamed from: a */
    void m24922a(Fragment fragment) {
        this.f18825f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m24916a(fragment.getActivity());
        }
    }

    /* renamed from: d */
    private Fragment m24919d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f18825f;
    }

    /* renamed from: a */
    private void m24916a(FragmentActivity fragmentActivity) {
        m24920e();
        this.f18823d = C1143c.m4768a((Context) fragmentActivity).m4786g().m4760b(fragmentActivity);
        if (equals(this.f18823d) == null) {
            this.f18823d.m24917a(this);
        }
    }

    /* renamed from: e */
    private void m24920e() {
        if (this.f18823d != null) {
            this.f18823d.m24918b(this);
            this.f18823d = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m24916a(getActivity());
        } catch (Context context2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", context2);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        this.f18825f = null;
        m24920e();
    }

    public void onStart() {
        super.onStart();
        this.f18820a.m17254a();
    }

    public void onStop() {
        super.onStop();
        this.f18820a.m17256b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18820a.m17258c();
        m24920e();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        stringBuilder.append(m24919d());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
