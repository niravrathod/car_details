package com.cuvora.carinfo.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import java.util.HashMap;

/* renamed from: com.cuvora.carinfo.fragment.a */
public class C4548a extends Fragment {
    /* renamed from: a */
    private HashMap f18869a;

    /* renamed from: a */
    public View mo4624a(int i) {
        if (this.f18869a == null) {
            this.f18869a = new HashMap();
        }
        View view = (View) this.f18869a.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f18869a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4625a() {
        if (this.f18869a != null) {
            this.f18869a.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4625a();
    }
}
