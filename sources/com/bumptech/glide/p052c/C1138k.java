package com.bumptech.glide.p052c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.C1143c;
import com.bumptech.glide.C3377g;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: com.bumptech.glide.c.k */
public class C1138k extends Fragment {
    /* renamed from: a */
    private final C3358a f3719a;
    /* renamed from: b */
    private final C1141m f3720b;
    /* renamed from: c */
    private final Set<C1138k> f3721c;
    /* renamed from: d */
    private C3377g f3722d;
    /* renamed from: e */
    private C1138k f3723e;
    /* renamed from: f */
    private Fragment f3724f;

    /* renamed from: com.bumptech.glide.c.k$a */
    private class C3363a implements C1141m {
        /* renamed from: a */
        final /* synthetic */ C1138k f14236a;

        C3363a(C1138k c1138k) {
            this.f14236a = c1138k;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(super.toString());
            stringBuilder.append("{fragment=");
            stringBuilder.append(this.f14236a);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

    public C1138k() {
        this(new C3358a());
    }

    @SuppressLint({"ValidFragment"})
    C1138k(C3358a c3358a) {
        this.f3720b = new C3363a(this);
        this.f3721c = new HashSet();
        this.f3719a = c3358a;
    }

    /* renamed from: a */
    public void m4745a(C3377g c3377g) {
        this.f3722d = c3377g;
    }

    /* renamed from: a */
    C3358a m4743a() {
        return this.f3719a;
    }

    /* renamed from: b */
    public C3377g m4746b() {
        return this.f3722d;
    }

    /* renamed from: c */
    public C1141m m4747c() {
        return this.f3720b;
    }

    /* renamed from: a */
    private void m4739a(C1138k c1138k) {
        this.f3721c.add(c1138k);
    }

    /* renamed from: b */
    private void m4740b(C1138k c1138k) {
        this.f3721c.remove(c1138k);
    }

    /* renamed from: a */
    void m4744a(Fragment fragment) {
        this.f3724f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m4738a(fragment.getActivity());
        }
    }

    @TargetApi(17)
    /* renamed from: d */
    private Fragment m4741d() {
        Fragment parentFragment = VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f3724f;
    }

    /* renamed from: a */
    private void m4738a(Activity activity) {
        m4742e();
        this.f3723e = C1143c.m4768a((Context) activity).m4786g().m4759b(activity);
        if (equals(this.f3723e) == null) {
            this.f3723e.m4739a(this);
        }
    }

    /* renamed from: e */
    private void m4742e() {
        if (this.f3723e != null) {
            this.f3723e.m4740b(this);
            this.f3723e = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m4738a(activity);
        } catch (Activity activity2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", activity2);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        m4742e();
    }

    public void onStart() {
        super.onStart();
        this.f3719a.m17254a();
    }

    public void onStop() {
        super.onStop();
        this.f3719a.m17256b();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3719a.m17258c();
        m4742e();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("{parent=");
        stringBuilder.append(m4741d());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
