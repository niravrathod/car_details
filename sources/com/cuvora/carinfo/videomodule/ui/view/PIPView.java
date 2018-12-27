package com.cuvora.carinfo.videomodule.ui.view;

import android.content.Context;
import android.support.v4.app.C0334l;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout.C1611a;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class PIPView extends RelativeLayout implements C1611a {
    /* renamed from: a */
    public C0334l f14975a;
    /* renamed from: b */
    private C1611a f14976b;
    /* renamed from: c */
    private HashMap f14977c;

    public enum AspectRatio {
    }

    /* renamed from: a */
    public View m18619a(int i) {
        if (this.f14977c == null) {
            this.f14977c = new HashMap();
        }
        View view = (View) this.f14977c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f14977c.put(Integer.valueOf(i), view);
        return view;
    }

    public final void setTopFragmentMarginBottom(int i) {
    }

    public final void setTopFragmentMarginRight(int i) {
    }

    public PIPView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        super(context, attributeSet);
        View.inflate(context, R.layout.view_pip, this);
    }

    /* renamed from: r */
    public void mo1250r() {
        C1611a c1611a = this.f14976b;
        if (c1611a != null) {
            c1611a.mo1250r();
        }
    }

    /* renamed from: s */
    public void mo1251s() {
        C1611a c1611a = this.f14976b;
        if (c1611a != null) {
            c1611a.mo1251s();
        }
    }

    /* renamed from: t */
    public void mo1252t() {
        C1611a c1611a = this.f14976b;
        if (c1611a != null) {
            c1611a.mo1252t();
        }
    }

    /* renamed from: u */
    public void mo1253u() {
        C1611a c1611a = this.f14976b;
        if (c1611a != null) {
            c1611a.mo1253u();
        }
    }

    public final C1611a getCallbacks() {
        return this.f14976b;
    }

    public final void setCallbacks(C1611a c1611a) {
        this.f14976b = c1611a;
    }

    public final C0334l getFragmentManager() {
        C0334l c0334l = this.f14975a;
        if (c0334l == null) {
            C2885g.m13911b("fragmentManager");
        }
        return c0334l;
    }

    public final void setFragmentManager(C0334l c0334l) {
        C2885g.m13910b(c0334l, "<set-?>");
        this.f14975a = c0334l;
    }

    /* renamed from: a */
    public final void m18620a() {
        PIPRelativeLayout pIPRelativeLayout = (PIPRelativeLayout) m18619a(C1487a.dragViewCon);
        Object context = getContext();
        C2885g.m13907a(context, "context");
        pIPRelativeLayout.m6178a(context.getResources().getDimensionPixelSize(R.dimen.dp190), com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout.AspectRatio.f4827a);
        ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).setCallbacks(this);
    }

    /* renamed from: b */
    public final void m18622b() {
        ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).m6187h();
    }

    /* renamed from: c */
    public final void m18624c() {
        ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).m6186g();
    }

    /* renamed from: a */
    public final void m18621a(Fragment fragment) {
        C2885g.m13910b(fragment, "topFragment");
        m18617a(R.id.dragView, fragment);
    }

    /* renamed from: b */
    public final void m18623b(Fragment fragment) {
        C2885g.m13910b(fragment, "bottomFragment");
        m18618b(R.id.detailView, fragment);
    }

    /* renamed from: a */
    private final void m18617a(int i, Fragment fragment) {
        C0334l c0334l = this.f14975a;
        if (c0334l == null) {
            C2885g.m13911b("fragmentManager");
        }
        if (!c0334l.mo305g()) {
            c0334l = this.f14975a;
            if (c0334l == null) {
                C2885g.m13911b("fragmentManager");
            }
            c0334l.mo292a().mo276b(i, fragment).mo283f();
        }
    }

    /* renamed from: b */
    private final void m18618b(int i, Fragment fragment) {
        C0334l c0334l = this.f14975a;
        if (c0334l == null) {
            C2885g.m13911b("fragmentManager");
        }
        if (!c0334l.mo305g()) {
            c0334l = this.f14975a;
            if (c0334l == null) {
                C2885g.m13911b("fragmentManager");
            }
            c0334l.mo292a().mo276b(i, fragment).mo283f();
        }
    }

    /* renamed from: d */
    public final void m18625d() {
        C0334l c0334l = this.f14975a;
        if (c0334l == null) {
            C2885g.m13911b("fragmentManager");
        }
        Fragment a = c0334l.mo289a((int) R.id.dragView);
        C0334l c0334l2 = this.f14975a;
        if (c0334l2 == null) {
            C2885g.m13911b("fragmentManager");
        }
        Fragment a2 = c0334l2.mo289a((int) R.id.detailView);
        if (a != null) {
            C0334l c0334l3 = this.f14975a;
            if (c0334l3 == null) {
                C2885g.m13911b("fragmentManager");
            }
            c0334l3.mo292a().mo270a(a).mo283f();
        }
        if (a2 != null) {
            c0334l = this.f14975a;
            if (c0334l == null) {
                C2885g.m13911b("fragmentManager");
            }
            c0334l.mo292a().mo270a(a2).mo283f();
        }
        ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).m6177a();
    }

    /* renamed from: e */
    public final boolean m18626e() {
        return ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).m6183d();
    }

    /* renamed from: f */
    public final boolean m18627f() {
        return ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).m6182c();
    }

    /* renamed from: g */
    public final void m18628g() {
        ((PIPRelativeLayout) m18619a(C1487a.dragViewCon)).m6188i();
    }
}
