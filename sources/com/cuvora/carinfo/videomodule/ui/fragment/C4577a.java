package com.cuvora.carinfo.videomodule.ui.fragment;

import android.support.v4.app.Fragment;
import android.view.View;
import java.util.HashMap;

/* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.a */
public class C4577a extends Fragment {
    /* renamed from: a */
    private HashMap f18962a;

    /* renamed from: a */
    public View mo4642a(int i) {
        if (this.f18962a == null) {
            this.f18962a = new HashMap();
        }
        View view = (View) this.f18962a.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f18962a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4643a() {
        if (this.f18962a != null) {
            this.f18962a.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4643a();
    }
}
