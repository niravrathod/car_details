package com.cuvora.carinfo.videomodule.p079a;

import android.annotation.SuppressLint;
import android.arch.lifecycle.C0035q;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.aj;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import com.cuvora.carinfo.videomodule.ui.p167a.C4576a;
import com.cuvora.carinfo.videomodule.ui.view.C3733a;
import com.feedbox.p123b.C2104b;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.videomodule.a.a */
public final class C1586a {
    /* renamed from: a */
    public static final C1586a f4807a = new C1586a();

    private C1586a() {
    }

    /* renamed from: a */
    public static final void m6118a(View view, boolean z) {
        C2885g.m13910b(view, "view");
        view.setVisibility(z ? false : true);
    }

    /* renamed from: a */
    public static final void m6115a(RecyclerView recyclerView, List<? extends C1596b> list) {
        C2885g.m13910b(recyclerView, "view");
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new C4576a());
        }
        recyclerView = recyclerView.getAdapter();
        if (recyclerView != null) {
            ((C4576a) recyclerView).m16038a(list);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.videomodule.ui.adapter.RecyclerViewAdapter<com.cuvora.carinfo.videomodule.ui.RecyclerViewModel>");
    }

    /* renamed from: a */
    public static final void m6114a(RecyclerView recyclerView, C3733a c3733a) {
        C2885g.m13910b(recyclerView, "view");
        recyclerView.m24635a((C0780h) new C3733a());
    }

    /* renamed from: a */
    public static final void m6112a(AppCompatImageView appCompatImageView, String str) {
        C2885g.m13910b(appCompatImageView, "view");
        C2885g.m13910b(str, "imageUrl");
        C2104b.f6439a.m7666a(str, appCompatImageView);
    }

    /* renamed from: a */
    public static final void m6117a(View view, String str) {
        C2885g.m13910b(view, "view");
        C2885g.m13910b(str, "aspectRatio");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if ((C2885g.m13909a(layoutParams2.f157B, (Object) str) ^ 1) != 0) {
                layoutParams2.f157B = str;
                view.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams");
    }

    /* renamed from: a */
    public static final void m6113a(RecyclerView recyclerView, C0035q c0035q) {
        C2885g.m13910b(recyclerView, "view");
        recyclerView = recyclerView.getAdapter();
        if (recyclerView != null) {
            ((C4576a) recyclerView).m25178a(c0035q);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.cuvora.carinfo.videomodule.ui.adapter.RecyclerViewAdapter<com.cuvora.carinfo.videomodule.ui.RecyclerViewModel>");
    }

    /* renamed from: a */
    public static final void m6116a(RecyclerView recyclerView, boolean z) {
        C2885g.m13910b(recyclerView, "view");
        new aj().m16762a(recyclerView);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* renamed from: a */
    public static final void m6119a(WebView webView, String str) {
        C2885g.m13910b(webView, "view");
        C2885g.m13910b(str, "html");
        str = "<iframe scrolling src=\"http://sailortodaytv.livebox.co.in:3000/?chnl=sailortv\" width=\"400px\" height=\"400px\" allowfullscreen webkitallowfullscreen mozallowfullscreen oallowfullscreen msallowfullscreen ></iframe>";
        Object tag = webView.getTag();
        if (tag == null || !tag.equals("hey")) {
            tag = webView.getSettings();
            C2885g.m13907a(tag, "view.settings");
            tag.setJavaScriptEnabled(true);
            webView.setTag("hey");
            webView.loadData(str, "text/html", null);
        }
    }
}
