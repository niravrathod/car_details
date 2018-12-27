package com.cuvora.carinfo.videomodule.ui.fragment;

import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0028l;
import android.arch.lifecycle.C3006k;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.C1587a;
import com.cuvora.carinfo.videomodule.ui.fragment.RelatedListFragment.C1600a;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView;
import com.cuvora.carinfo.videomodule.ui.view.BannerAdView.C1609a;
import com.feedbox.C2109c;
import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.b */
public final class C4810b extends C4577a implements C1600a, C1609a {
    /* renamed from: a */
    private final C3006k<Content> f21070a = new C3006k();
    /* renamed from: b */
    private final C3006k<ArrayList<Content>> f21071b = new C3006k();
    /* renamed from: c */
    private C1602a f21072c;
    /* renamed from: d */
    private HashMap f21073d;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.b$a */
    public interface C1602a {
        /* renamed from: a */
        void mo5042a(Content content);
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.b$b */
    static final class C3722b<T> implements C0028l<Content> {
        /* renamed from: a */
        final /* synthetic */ C4810b f14945a;

        C3722b(C4810b c4810b) {
            this.f14945a = c4810b;
        }

        /* renamed from: a */
        public final void m18565a(Content content) {
            if (content != null) {
                C4810b c4810b = this.f14945a;
                C2885g.m13907a((Object) content, "it");
                c4810b.m27865b(content);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.b$c */
    static final class C3723c<T> implements C0028l<ArrayList<Content>> {
        /* renamed from: a */
        final /* synthetic */ C4810b f14946a;

        C3723c(C4810b c4810b) {
            this.f14946a = c4810b;
        }

        /* renamed from: a */
        public final void m18568a(ArrayList<Content> arrayList) {
            if (arrayList != null) {
                C1587a.m6120a(arrayList, new DetailFragment$onViewCreated$2$1(this));
            }
        }
    }

    /* renamed from: a */
    public View mo4642a(int i) {
        if (this.f21073d == null) {
            this.f21073d = new HashMap();
        }
        View view = (View) this.f21073d.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21073d.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4643a() {
        if (this.f21073d != null) {
            this.f21073d.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4643a();
    }

    /* renamed from: b */
    public final C3006k<Content> m27870b() {
        return this.f21070a;
    }

    /* renamed from: c */
    public final C3006k<ArrayList<Content>> m27871c() {
        return this.f21071b;
    }

    /* renamed from: d */
    public String mo4646d() {
        return C2109c.f6446a.m7674a().m7657d().m7653d();
    }

    /* renamed from: a */
    public final void m27868a(C1602a c1602a) {
        this.f21072c = c1602a;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_detail, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        ((BannerAdView) mo4642a(C1487a.bannerAdView)).m25222a((C1609a) this);
        C0023f c0023f = this;
        this.f21070a.m41a(c0023f, (C0028l) new C3722b(this));
        this.f21071b.m41a(c0023f, (C0028l) new C3723c(this));
    }

    /* renamed from: a */
    private final void m27864a(ArrayList<Content> arrayList) {
        Fragment a = getChildFragmentManager().mo289a((int) R.id.relatedListFragment);
        if (!(a instanceof RelatedListFragment)) {
            a = null;
        }
        RelatedListFragment relatedListFragment = (RelatedListFragment) a;
        if (relatedListFragment != null) {
            relatedListFragment.m25208a(arrayList, "");
        }
        arrayList = getChildFragmentManager().mo289a((int) R.id.relatedListFragment);
        if (!(arrayList instanceof RelatedListFragment)) {
            arrayList = null;
        }
        RelatedListFragment relatedListFragment2 = (RelatedListFragment) arrayList;
        if (relatedListFragment2 != null) {
            relatedListFragment2.m25207a(this);
        }
    }

    /* renamed from: b */
    private final void m27865b(Content content) {
        Fragment a = getChildFragmentManager().mo289a((int) R.id.contentDetailFragment);
        if (!(a instanceof ContentDetailFragment)) {
            a = null;
        }
        ContentDetailFragment contentDetailFragment = (ContentDetailFragment) a;
        if (contentDetailFragment != null) {
            contentDetailFragment.m25201a(content);
        }
    }

    /* renamed from: a */
    public void mo4648a(Content content) {
        C2885g.m13910b(content, "content");
        C1602a c1602a = this.f21072c;
        if (c1602a != null) {
            c1602a.mo5042a(content);
        }
    }
}
