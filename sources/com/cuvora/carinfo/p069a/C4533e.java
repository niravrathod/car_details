package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v4.app.C0334l;
import android.support.v4.app.C3113o;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.fragment.C4550e;
import com.cuvora.carinfo.fragment.C4551i;
import com.cuvora.carinfo.fragment.C4553n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.cuvora.carinfo.a.e */
public class C4533e extends C3113o {
    /* renamed from: a */
    private Context f18857a;
    /* renamed from: b */
    private Map<Integer, Fragment> f18858b = new HashMap();
    /* renamed from: c */
    private String[] f18859c = new String[]{"Overview", "Specifications", "Features"};

    /* renamed from: b */
    public int mo1187b() {
        return 3;
    }

    /* renamed from: c */
    public CharSequence mo3918c(int i) {
        switch (i) {
            case 0:
                return "Overview";
            case 1:
                return "Specifications";
            case 2:
                return "Features";
            default:
                return null;
        }
    }

    public C4533e(C0334l c0334l, Context context) {
        super(c0334l);
        this.f18857a = context;
    }

    /* renamed from: a */
    public Fragment mo3917a(int i) {
        Fragment fragment;
        switch (i) {
            case 0:
                fragment = (Fragment) this.f18858b.get(Integer.valueOf(i));
                if (fragment != null) {
                    return fragment;
                }
                fragment = C4551i.m25068a();
                this.f18858b.put(Integer.valueOf(i), fragment);
                return fragment;
            case 1:
                fragment = (Fragment) this.f18858b.get(Integer.valueOf(i));
                if (fragment != null) {
                    return fragment;
                }
                fragment = C4553n.m25080a();
                this.f18858b.put(Integer.valueOf(i), fragment);
                return fragment;
            case 2:
                fragment = (Fragment) this.f18858b.get(Integer.valueOf(i));
                if (fragment != null) {
                    return fragment;
                }
                fragment = C4550e.m25067a();
                this.f18858b.put(Integer.valueOf(i), fragment);
                return fragment;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    public Fragment m25015e(int i) {
        Fragment fragment = (Fragment) this.f18858b.get(Integer.valueOf(i));
        return fragment == null ? mo3917a(i) : fragment;
    }

    /* renamed from: f */
    public View m25016f(int i) {
        View inflate = LayoutInflater.from(this.f18857a).inflate(R.layout.custom_tab_view, null);
        ((TextView) inflate.findViewById(R.id.customTabLayoutTab)).setText(this.f18859c[i]);
        return inflate;
    }
}
