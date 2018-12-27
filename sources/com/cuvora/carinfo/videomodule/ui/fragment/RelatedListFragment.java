package com.cuvora.carinfo.videomodule.ui.fragment;

import android.databinding.C0060f;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView.C0786l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.p172b.C4789c;
import com.cuvora.carinfo.videomodule.ui.model.C1608e;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.utils.C3735c;
import com.cuvora.carinfo.videomodule.utils.C3735c.C1623a;
import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class RelatedListFragment extends Fragment {
    /* renamed from: a */
    private C1600a f18958a;
    /* renamed from: b */
    private ArrayList<Content> f18959b = new ArrayList();
    /* renamed from: c */
    private C4789c f18960c;
    /* renamed from: d */
    private HashMap f18961d;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.RelatedListFragment$a */
    public interface C1600a {
        /* renamed from: a */
        void mo4648a(Content content);
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.RelatedListFragment$b */
    static final class C3720b implements C1623a {
        /* renamed from: a */
        final /* synthetic */ RelatedListFragment f14943a;

        C3720b(RelatedListFragment relatedListFragment) {
            this.f14943a = relatedListFragment;
        }

        /* renamed from: a */
        public final void mo1236a(View view, int i) {
            view = this.f14943a.m25206a();
            if (view != null) {
                Object obj = this.f14943a.m25209b().get(i);
                C2885g.m13907a(obj, "list[position]");
                view.mo4648a((Content) obj);
            }
        }
    }

    /* renamed from: c */
    public void m25210c() {
        if (this.f18961d != null) {
            this.f18961d.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m25210c();
    }

    /* renamed from: a */
    public final C1600a m25206a() {
        return this.f18958a;
    }

    /* renamed from: a */
    public final void m25207a(C1600a c1600a) {
        this.f18958a = c1600a;
    }

    /* renamed from: b */
    public final ArrayList<Content> m25209b() {
        return this.f18959b;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        this.f18960c = (C4789c) C0060f.m134a(layoutInflater, (int) R.layout.fragment_related_list, viewGroup, false);
        layoutInflater = this.f18960c;
        if (layoutInflater == null) {
            C2885g.m13906a();
        }
        Object d = layoutInflater.m24026d();
        C2885g.m13907a(d, "binding!!.root");
        viewGroup = this.f18960c;
        if (viewGroup == null) {
            C2885g.m13906a();
        }
        viewGroup.f20936c.m24638a((C0786l) new C3735c(getContext(), new C3720b(this)));
        return d;
    }

    /* renamed from: a */
    public final void m25208a(ArrayList<Content> arrayList, String str) {
        C2885g.m13910b(arrayList, "list");
        C2885g.m13910b(str, "railId");
        this.f18959b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Content a : arrayList) {
            C3730d a2 = C1608e.m6143a(a, "RELATED", i, str);
            if (a2 != null) {
                arrayList2.add(a2);
            }
            i++;
        }
        arrayList = this.f18960c;
        if (arrayList == null) {
            C2885g.m13906a();
        }
        arrayList.mo4909a(arrayList2);
    }
}
