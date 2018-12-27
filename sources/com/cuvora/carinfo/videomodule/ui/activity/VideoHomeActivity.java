package com.cuvora.carinfo.videomodule.ui.activity;

import android.arch.lifecycle.C3006k;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.app.C3199a;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import androidx.navigation.C0891a;
import androidx.navigation.C0894d;
import androidx.navigation.C0894d.C0893a;
import androidx.navigation.C0900g;
import androidx.navigation.fragment.NavHostFragment;
import com.crashlytics.android.Crashlytics;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.ui.base.BaseActivity;
import com.cuvora.carinfo.videomodule.ui.fragment.C4810b;
import com.cuvora.carinfo.videomodule.ui.fragment.C4810b.C1602a;
import com.cuvora.carinfo.videomodule.ui.fragment.C4811c;
import com.cuvora.carinfo.videomodule.ui.fragment.C4811c.C1603a;
import com.cuvora.carinfo.videomodule.ui.fragment.SeeAllFragment;
import com.cuvora.carinfo.videomodule.ui.fragment.SeeAllFragment.C1601a;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import com.cuvora.carinfo.videomodule.ui.view.PIPRelativeLayout.C1611a;
import com.cuvora.carinfo.videomodule.ui.view.PIPView;
import com.cuvora.carinfo.videomodule.utils.C1625e;
import com.feedbox.C2100a;
import com.feedbox.C2109c;
import com.feedbox.Event;
import com.feedbox.data.network.model.C2112b;
import com.feedbox.data.network.model.C2113c;
import com.feedbox.data.network.model.C2115e;
import com.feedbox.data.network.model.Content;
import com.feedbox.p121a.C2099a;
import com.feedbox.p121a.C2099a.C2095a;
import io.fabric.sdk.android.C2766c;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class VideoHomeActivity extends PlayerActivity implements C1602a, C1603a, C1611a {
    /* renamed from: n */
    public static final C1590a f21911n = new C1590a();
    /* renamed from: v */
    private static final String f21912v = f21912v;
    /* renamed from: p */
    private PIPView f21913p;
    /* renamed from: q */
    private boolean f21914q = true;
    /* renamed from: r */
    private C2112b f21915r;
    /* renamed from: s */
    private C4810b f21916s;
    /* renamed from: t */
    private C4811c f21917t;
    /* renamed from: u */
    private C3199a f21918u;
    /* renamed from: w */
    private HashMap f21919w;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$a */
    public static final class C1590a {
        private C1590a() {
        }

        /* renamed from: a */
        public final String m6123a() {
            return VideoHomeActivity.f21912v;
        }

        /* renamed from: a */
        public final Intent m6122a(Context context, String str) {
            C2885g.m13910b(context, "context");
            C2885g.m13910b(str, "videoId");
            Intent intent = new Intent(context, VideoHomeActivity.class);
            intent.putExtra(m6123a(), str);
            return intent;
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$c */
    static final class C1591c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ VideoHomeActivity f4808a;

        C1591c(VideoHomeActivity videoHomeActivity) {
            this.f4808a = videoHomeActivity;
        }

        public final void run() {
            C3006k b;
            C4811c w = this.f4808a.m30215w();
            if (w != null) {
                b = w.m27879b();
                if (b != null) {
                    b.mo19b(this.f4808a.m30185l());
                }
            }
            w = this.f4808a.m30215w();
            if (w != null) {
                b = w.m27880c();
                if (b != null) {
                    b.mo19b(this.f4808a.m30188o());
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$d */
    static final class C1592d implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VideoHomeActivity f4809a;

        C1592d(VideoHomeActivity videoHomeActivity) {
            this.f4809a = videoHomeActivity;
        }

        public final void onClick(View view) {
            this.f4809a.onBackPressed();
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$f */
    static final class C1593f implements Runnable {
        /* renamed from: a */
        final /* synthetic */ VideoHomeActivity f4810a;

        C1593f(VideoHomeActivity videoHomeActivity) {
            this.f4810a = videoHomeActivity;
        }

        public final void run() {
            C3006k b;
            C4811c w = this.f4810a.m30215w();
            if (w != null) {
                b = w.m27879b();
                if (b != null) {
                    b.mo19b(this.f4810a.m30185l());
                }
            }
            w = this.f4810a.m30215w();
            if (w != null) {
                b = w.m27880c();
                if (b != null) {
                    b.mo19b(this.f4810a.m30188o());
                }
            }
            C4810b v = this.f4810a.m30214v();
            if (v != null) {
                b = v.m27870b();
                if (b != null) {
                    b.mo19b(this.f4810a.m30189p());
                }
            }
            v = this.f4810a.m30214v();
            if (v != null) {
                b = v.m27871c();
                if (b != null) {
                    b.mo19b(this.f4810a.m30187n());
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$g */
    static final class C1594g implements Runnable {
        /* renamed from: a */
        final /* synthetic */ VideoHomeActivity f4811a;

        C1594g(VideoHomeActivity videoHomeActivity) {
            this.f4811a = videoHomeActivity;
        }

        public final void run() {
            C3006k b;
            C4811c w = this.f4811a.m30215w();
            if (w != null) {
                b = w.m27879b();
                if (b != null) {
                    b.mo19b(this.f4811a.m30185l());
                }
            }
            w = this.f4811a.m30215w();
            if (w != null) {
                b = w.m27880c();
                if (b != null) {
                    b.mo19b(this.f4811a.m30188o());
                }
            }
            C4810b v = this.f4811a.m30214v();
            if (v != null) {
                b = v.m27870b();
                if (b != null) {
                    b.mo19b(this.f4811a.m30189p());
                }
            }
            v = this.f4811a.m30214v();
            if (v != null) {
                b = v.m27871c();
                if (b != null) {
                    b.mo19b(this.f4811a.m30187n());
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$b */
    public static final class C3716b implements C2095a<C2115e> {
        /* renamed from: a */
        final /* synthetic */ VideoHomeActivity f14940a;

        /* renamed from: a */
        public void mo1230a(String str) {
            C2885g.m13910b(str, "message");
        }

        C3716b(VideoHomeActivity videoHomeActivity) {
            this.f14940a = videoHomeActivity;
        }

        /* renamed from: a */
        public void m18550a(C2115e c2115e) {
            C2885g.m13910b(c2115e, "t");
            this.f14940a.m30183a(c2115e.m7713b());
            ArrayList m = this.f14940a.m30186m();
            if (m != null) {
                m.add(0, c2115e.m7712a());
            }
            c2115e = this.f14940a.m30215w();
            if (c2115e != null) {
                c2115e = c2115e.m27880c();
                if (c2115e != null) {
                    c2115e.mo19b(this.f14940a.m30188o());
                }
            }
            c2115e = this.f14940a.m30214v();
            if (c2115e != null) {
                c2115e = c2115e.m27870b();
                if (c2115e != null) {
                    c2115e.mo19b(this.f14940a.m30189p());
                }
            }
            c2115e = this.f14940a.m30214v();
            if (c2115e != null) {
                c2115e = c2115e.m27871c();
                if (c2115e != null) {
                    c2115e.mo19b(this.f14940a.m30187n());
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.activity.VideoHomeActivity$e */
    static final class C3717e implements C0893a {
        /* renamed from: a */
        final /* synthetic */ VideoHomeActivity f14941a;

        C3717e(VideoHomeActivity videoHomeActivity) {
            this.f14941a = videoHomeActivity;
        }

        /* renamed from: a */
        public final void mo1231a(C0894d c0894d, C0900g c0900g) {
            C2885g.m13910b(c0894d, "controller");
            C2885g.m13910b(c0900g, "destination");
            this.f14941a.mo4973h();
            c0900g.m3924e();
            Object g = c0894d.m3903g();
            C2885g.m13907a(g, "controller.graph");
            boolean z = g.m16918a() == c0900g.m3923d() ? true : null;
            c0900g = this.f14941a.mo4973h();
            if (c0900g != null) {
                c0900g.mo538b(false);
            }
            c0900g = this.f14941a.mo4973h();
            if (c0900g != null) {
                c0900g.mo539c(false);
            }
            this.f14941a.m30207c(z);
            if (z) {
                ((AppCompatImageView) this.f14941a.mo5039c(C1487a.ivHomeUp)).setImageResource(R.drawable.ic_left_arrow);
                g = (AppCompatTextView) this.f14941a.mo5039c(C1487a.tvToolbarTitle);
                C2885g.m13907a(g, "tvToolbarTitle");
                g.setText(C2109c.f6446a.m7674a().m7655b());
                return;
            }
            ((AppCompatImageView) this.f14941a.mo5039c(C1487a.ivHomeUp)).setImageResource(R.drawable.ic_left_arrow);
            g = (AppCompatTextView) this.f14941a.mo5039c(C1487a.tvToolbarTitle);
            C2885g.m13907a(g, "tvToolbarTitle");
            g.setText(C2109c.f6446a.m7674a().m7655b());
        }
    }

    /* renamed from: b */
    public void mo5043b(boolean z) {
    }

    /* renamed from: c */
    public View mo5039c(int i) {
        if (this.f21919w == null) {
            this.f21919w = new HashMap();
        }
        View view = (View) this.f21919w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21919w.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: r */
    public void mo1250r() {
    }

    /* renamed from: q */
    public void mo5044q() {
        if (C2109c.f6446a.m7674a().m7658e()) {
            PIPView pIPView = this.f21913p;
            if (pIPView != null) {
                pIPView.m18628g();
            }
        }
    }

    /* renamed from: s */
    public void mo1251s() {
        C4811c c4811c = this.f21917t;
        if (c4811c != null) {
            c4811c.m27883f();
        }
    }

    /* renamed from: t */
    public void mo1252t() {
        PIPView pIPView = this.f21913p;
        if (pIPView != null) {
            pIPView.m18625d();
        }
        ((FrameLayout) mo5039c(C1487a.pipCon)).removeAllViews();
        Object obj = (FrameLayout) mo5039c(C1487a.pipCon);
        C2885g.m13907a(obj, "pipCon");
        obj.setVisibility(8);
    }

    /* renamed from: u */
    public void mo1253u() {
        PIPView pIPView = this.f21913p;
        if (pIPView != null) {
            pIPView.m18625d();
        }
        ((FrameLayout) mo5039c(C1487a.pipCon)).removeAllViews();
        Object obj = (FrameLayout) mo5039c(C1487a.pipCon);
        C2885g.m13907a(obj, "pipCon");
        obj.setVisibility(8);
    }

    /* renamed from: c */
    public final void m30207c(boolean z) {
        this.f21914q = z;
    }

    /* renamed from: a */
    public final void m30201a(C2112b c2112b) {
        this.f21915r = c2112b;
    }

    /* renamed from: v */
    public final C4810b m30214v() {
        return this.f21916s;
    }

    /* renamed from: w */
    public final C4811c m30215w() {
        return this.f21917t;
    }

    /* renamed from: a */
    public void mo5042a(Content content) {
        C2885g.m13910b(content, "content");
        m30182a((String) content.m7692d());
        content = this.f21917t;
        if (content != null) {
            content = content.m27879b();
            if (content != null) {
                content.mo19b(m30185l());
            }
        }
        content = this.f21917t;
        if (content != null) {
            content = content.m27880c();
            if (content != null) {
                content.mo19b(m30188o());
            }
        }
        content = this.f21916s;
        if (content != null) {
            content = content.m27870b();
            if (content != null) {
                content.mo19b(m30189p());
            }
        }
        content = this.f21916s;
        if (content != null) {
            content = content.m27871c();
            if (content != null) {
                content.mo19b(m30187n());
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.app_bar_main);
        String stringExtra = getIntent().getStringExtra(f21912v);
        if (stringExtra != null) {
            m30204b(stringExtra);
        }
        bundle = this.f21917t;
        if (bundle != null) {
            bundle.m27876a((C1603a) this);
        }
        bundle = this.f21916s;
        if (bundle != null) {
            bundle.m27868a((C1602a) this);
        }
        m29816a((Toolbar) mo5039c(C1487a.toolbar));
        ((AppCompatImageView) mo5039c(C1487a.ivHomeUp)).setOnClickListener(new C1592d(this));
        bundle = mo4973h();
        if (bundle != null) {
            bundle.mo538b(false);
        }
        bundle = mo4973h();
        if (bundle != null) {
            bundle.mo539c(false);
        }
        C2766c.m13514a((Context) this, new Crashlytics());
        C0891a.m3880a(this, R.id.nav_host).m3892a((C0893a) new C3717e(this));
        Object c = mo5039c(C1487a.connectivity_view);
        C2885g.m13907a(c, "connectivity_view");
        c.setVisibility(8);
        BaseActivity.f21880o.m6127a("Home Screen");
        bundle = this.f21918u;
        if (bundle != null) {
            bundle.m15898a();
        }
        if (this.f21918u != null) {
            bundle = this.f21918u;
            if (bundle != null) {
                bundle.m15903a(false);
            }
        }
    }

    public void onNewIntent(Intent intent) {
        C2885g.m13910b(intent, "intent");
        setIntent(intent);
    }

    public void onBackPressed() {
        Object obj = (FrameLayout) mo5039c(C1487a.pipCon);
        C2885g.m13907a(obj, "pipCon");
        if (obj.getChildCount() > 0) {
            obj = getResources();
            C2885g.m13907a(obj, "resources");
            if (obj.getConfiguration().orientation == 2) {
                C4811c c4811c = this.f21917t;
                if (c4811c != null) {
                    c4811c.m27882e();
                }
            } else {
                PIPView pIPView;
                if (!C2109c.f6446a.m7674a().m7658e()) {
                    pIPView = this.f21913p;
                    if (pIPView != null) {
                        pIPView.m18625d();
                    }
                    ((FrameLayout) mo5039c(C1487a.pipCon)).removeAllViews();
                    obj = (FrameLayout) mo5039c(C1487a.pipCon);
                    C2885g.m13907a(obj, "pipCon");
                    obj.setVisibility(8);
                }
                pIPView = this.f21913p;
                if (pIPView != null && pIPView.m18626e()) {
                    pIPView = this.f21913p;
                    if (pIPView != null) {
                        pIPView.m18622b();
                    }
                } else if (!mo5016i()) {
                    pIPView = this.f21913p;
                    if (pIPView != null) {
                        pIPView.m18625d();
                    }
                    ((FrameLayout) mo5039c(C1487a.pipCon)).removeAllViews();
                    obj = (FrameLayout) mo5039c(C1487a.pipCon);
                    C2885g.m13907a(obj, "pipCon");
                    obj.setVisibility(8);
                }
            }
            return;
        }
        if (!mo5016i()) {
            super.onBackPressed();
        }
    }

    /* renamed from: i */
    public boolean mo5016i() {
        return NavHostFragment.m24753a(m28707f().mo289a(C1487a.nav_host)).m3900d();
    }

    /* renamed from: a */
    public void m30202a(String str, String str2) {
        C2885g.m13910b(str2, "webUrl");
        C1625e.m6203b(this, str2);
    }

    /* renamed from: a */
    public final void m30199a(C3730d c3730d, ArrayList<C3729b> arrayList) {
        C2885g.m13910b(c3730d, "railItemModel");
        C2885g.m13910b(arrayList, "homeRailList");
        arrayList = c3730d.m18603m().m6133a();
        if (arrayList != null) {
            int i = 0;
            ArrayList arrayList2 = null;
            switch (C1595a.f4812a[arrayList.ordinal()]) {
                case 1:
                    arrayList = new HashMap();
                    arrayList.put(f21912v, c3730d.m18595e());
                    C2100a.f6432a.m7664a(Event.f6413a, arrayList);
                    Object obj = (FrameLayout) mo5039c(C1487a.pipCon);
                    C2885g.m13907a(obj, "pipCon");
                    if (obj.getChildCount() > null) {
                        arrayList = this.f21913p;
                        if (arrayList != null && arrayList.m18627f() == 1) {
                            arrayList = this.f21913p;
                            if (arrayList != null) {
                                arrayList.m18624c();
                            }
                        }
                        arrayList = this.f21915r;
                        if (arrayList != null) {
                            arrayList = arrayList.m7706b();
                            if (arrayList != null) {
                                C2113c c2113c = (C2113c) arrayList.get(c3730d.m18594d());
                                if (c2113c != null) {
                                    arrayList2 = c2113c.m7707a();
                                }
                            }
                        }
                        m30183a(arrayList2);
                        m30182a((String) c3730d.m18595e());
                        new Handler().postDelayed((Runnable) new C1593f(this), 500);
                        return;
                    }
                    this.f21913p = new PIPView(this, null);
                    ((FrameLayout) mo5039c(C1487a.pipCon)).addView(this.f21913p);
                    arrayList = this.f21913p;
                    if (arrayList != null) {
                        Object f = m28707f();
                        C2885g.m13907a(f, "supportFragmentManager");
                        arrayList.setFragmentManager(f);
                    }
                    this.f21917t = new C4811c();
                    this.f21916s = new C4810b();
                    arrayList = this.f21917t;
                    if (arrayList != null) {
                        arrayList.m27876a((C1603a) this);
                    }
                    arrayList = this.f21916s;
                    if (arrayList != null) {
                        arrayList.m27868a((C1602a) this);
                    }
                    arrayList = this.f21913p;
                    if (arrayList != null) {
                        C4811c c4811c = this.f21917t;
                        if (c4811c == null) {
                            C2885g.m13906a();
                        }
                        arrayList.m18621a((Fragment) c4811c);
                    }
                    arrayList = this.f21913p;
                    if (arrayList != null) {
                        C4810b c4810b = this.f21916s;
                        if (c4810b == null) {
                            C2885g.m13906a();
                        }
                        arrayList.m18623b(c4810b);
                    }
                    arrayList = this.f21913p;
                    if (arrayList != null) {
                        arrayList.setCallbacks(this);
                    }
                    arrayList = this.f21913p;
                    if (arrayList != null) {
                        arrayList.m18620a();
                    }
                    m30182a((String) c3730d.m18595e());
                    arrayList = this.f21915r;
                    if (arrayList != null) {
                        arrayList = arrayList.m7706b();
                        if (arrayList != null) {
                            C2113c c2113c2 = (C2113c) arrayList.get(c3730d.m18594d());
                            if (c2113c2 != null) {
                                arrayList2 = c2113c2.m7707a();
                            }
                        }
                    }
                    m30183a(arrayList2);
                    c3730d = this.f21917t;
                    if (c3730d != null) {
                        c3730d = c3730d.m27879b();
                        if (c3730d != null) {
                            c3730d.mo19b(m30185l());
                        }
                    }
                    c3730d = this.f21917t;
                    if (c3730d != null) {
                        c3730d = c3730d.m27880c();
                        if (c3730d != null) {
                            c3730d.mo19b(m30188o());
                        }
                    }
                    c3730d = this.f21916s;
                    if (c3730d != null) {
                        c3730d = c3730d.m27870b();
                        if (c3730d != null) {
                            c3730d.mo19b(m30189p());
                        }
                    }
                    c3730d = this.f21916s;
                    if (c3730d != null) {
                        c3730d = c3730d.m27871c();
                        if (c3730d != null) {
                            c3730d.mo19b(m30187n());
                        }
                    }
                    Object obj2 = (FrameLayout) mo5039c(C1487a.pipCon);
                    C2885g.m13907a(obj2, "pipCon");
                    obj2.setVisibility(0);
                    return;
                case 2:
                    arrayList = NavHostFragment.m24753a(m28707f().mo289a(C1487a.nav_host));
                    C1601a c1601a = SeeAllFragment.f21064a;
                    c3730d = c3730d.m18603m().m6135c();
                    if (c3730d == null) {
                        c3730d = "";
                    }
                    arrayList.m3888a((int) R.id.action_homeFragment_to_listingFragment, c1601a.m6129a(c3730d));
                    return;
                case 3:
                    arrayList = c3730d.m18603m().m6134b();
                    if (arrayList != null) {
                        if (((CharSequence) arrayList).length() > null) {
                            i = 1;
                        }
                        if (i == 1) {
                            m30202a(c3730d.m18596f(), c3730d.m18603m().m6134b());
                            return;
                        }
                    }
                    Crashlytics.logException((Throwable) new NullPointerException("url empty"));
                    return;
                case 4:
                    if (c3730d.m18603m().m6136d() != null) {
                        startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", c3730d.m18603m().m6136d(), null)));
                        return;
                    }
                    return;
                case 5:
                    C1625e.m6202a(this, c3730d.m18603m().m6137e());
                    return;
                case 6:
                    Context context = this;
                    Float f2 = c3730d.m18603m().m6138f();
                    float f3 = 0.0f;
                    float floatValue = f2 != null ? f2.floatValue() : 0.0f;
                    c3730d = c3730d.m18603m().m6139g();
                    if (c3730d != null) {
                        f3 = c3730d.floatValue();
                    }
                    C1625e.m6201a(context, floatValue, f3);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void m30203b(C3730d c3730d, ArrayList<Content> arrayList) {
        C2885g.m13910b(c3730d, "railItemModel");
        C2885g.m13910b(arrayList, "list");
        arrayList = c3730d.m18603m().m6133a();
        if (arrayList != null) {
            int i = 0;
            ArrayList arrayList2 = null;
            switch (C1595a.f4813b[arrayList.ordinal()]) {
                case 1:
                    arrayList = new HashMap();
                    arrayList.put(f21912v, c3730d.m18595e());
                    C2100a.f6432a.m7664a(Event.f6413a, arrayList);
                    Object obj = (FrameLayout) mo5039c(C1487a.pipCon);
                    C2885g.m13907a(obj, "pipCon");
                    if (obj.getChildCount() > null) {
                        arrayList = this.f21913p;
                        if (arrayList != null && arrayList.m18627f() == 1) {
                            arrayList = this.f21913p;
                            if (arrayList != null) {
                                arrayList.m18624c();
                            }
                        }
                        arrayList = this.f21915r;
                        if (arrayList != null) {
                            arrayList = arrayList.m7706b();
                            if (arrayList != null) {
                                C2113c c2113c = (C2113c) arrayList.get(c3730d.m18594d());
                                if (c2113c != null) {
                                    arrayList2 = c2113c.m7707a();
                                }
                            }
                        }
                        m30183a(arrayList2);
                        m30182a((String) c3730d.m18595e());
                        new Handler().postDelayed((Runnable) new C1594g(this), 500);
                        return;
                    }
                    Object obj2;
                    m30182a((String) c3730d.m18595e());
                    arrayList = this.f21915r;
                    if (arrayList != null) {
                        arrayList = arrayList.m7706b();
                        if (arrayList != null) {
                            C2113c c2113c2 = (C2113c) arrayList.get(c3730d.m18594d());
                            if (c2113c2 != null) {
                                c3730d = c2113c2.m7707a();
                                m30183a((ArrayList) c3730d);
                                this.f21913p = new PIPView(this, null);
                                ((FrameLayout) mo5039c(C1487a.pipCon)).addView((View) this.f21913p);
                                c3730d = this.f21913p;
                                if (c3730d != null) {
                                    obj = m28707f();
                                    C2885g.m13907a(obj, "supportFragmentManager");
                                    c3730d.setFragmentManager(obj);
                                }
                                this.f21917t = new C4811c();
                                this.f21916s = new C4810b();
                                c3730d = this.f21917t;
                                if (c3730d != null) {
                                    c3730d.m27876a((C1603a) this);
                                }
                                c3730d = this.f21916s;
                                if (c3730d != null) {
                                    c3730d.m27868a((C1602a) this);
                                }
                                c3730d = this.f21913p;
                                if (c3730d != null) {
                                    arrayList = this.f21917t;
                                    if (arrayList == null) {
                                        C2885g.m13906a();
                                    }
                                    c3730d.m18621a((Fragment) arrayList);
                                }
                                c3730d = this.f21913p;
                                if (c3730d != null) {
                                    arrayList = this.f21916s;
                                    if (arrayList == null) {
                                        C2885g.m13906a();
                                    }
                                    c3730d.m18623b((Fragment) arrayList);
                                }
                                c3730d = this.f21913p;
                                if (c3730d != null) {
                                    c3730d.setCallbacks(this);
                                }
                                c3730d = this.f21913p;
                                if (c3730d != null) {
                                    c3730d.m18620a();
                                }
                                c3730d = this.f21917t;
                                if (c3730d != null) {
                                    c3730d = c3730d.m27879b();
                                    if (c3730d != null) {
                                        c3730d.mo19b(m30185l());
                                    }
                                }
                                c3730d = this.f21917t;
                                if (c3730d != null) {
                                    c3730d = c3730d.m27880c();
                                    if (c3730d != null) {
                                        c3730d.mo19b(m30188o());
                                    }
                                }
                                c3730d = this.f21916s;
                                if (c3730d != null) {
                                    c3730d = c3730d.m27870b();
                                    if (c3730d != null) {
                                        c3730d.mo19b(m30189p());
                                    }
                                }
                                c3730d = this.f21916s;
                                if (c3730d != null) {
                                    c3730d = c3730d.m27871c();
                                    if (c3730d != null) {
                                        c3730d.mo19b(m30187n());
                                    }
                                }
                                obj2 = (FrameLayout) mo5039c(C1487a.pipCon);
                                C2885g.m13907a(obj2, "pipCon");
                                obj2.setVisibility(0);
                                return;
                            }
                        }
                    }
                    c3730d = null;
                    m30183a((ArrayList) c3730d);
                    this.f21913p = new PIPView(this, null);
                    ((FrameLayout) mo5039c(C1487a.pipCon)).addView((View) this.f21913p);
                    c3730d = this.f21913p;
                    if (c3730d != null) {
                        obj = m28707f();
                        C2885g.m13907a(obj, "supportFragmentManager");
                        c3730d.setFragmentManager(obj);
                    }
                    this.f21917t = new C4811c();
                    this.f21916s = new C4810b();
                    c3730d = this.f21917t;
                    if (c3730d != null) {
                        c3730d.m27876a((C1603a) this);
                    }
                    c3730d = this.f21916s;
                    if (c3730d != null) {
                        c3730d.m27868a((C1602a) this);
                    }
                    c3730d = this.f21913p;
                    if (c3730d != null) {
                        arrayList = this.f21917t;
                        if (arrayList == null) {
                            C2885g.m13906a();
                        }
                        c3730d.m18621a((Fragment) arrayList);
                    }
                    c3730d = this.f21913p;
                    if (c3730d != null) {
                        arrayList = this.f21916s;
                        if (arrayList == null) {
                            C2885g.m13906a();
                        }
                        c3730d.m18623b((Fragment) arrayList);
                    }
                    c3730d = this.f21913p;
                    if (c3730d != null) {
                        c3730d.setCallbacks(this);
                    }
                    c3730d = this.f21913p;
                    if (c3730d != null) {
                        c3730d.m18620a();
                    }
                    c3730d = this.f21917t;
                    if (c3730d != null) {
                        c3730d = c3730d.m27879b();
                        if (c3730d != null) {
                            c3730d.mo19b(m30185l());
                        }
                    }
                    c3730d = this.f21917t;
                    if (c3730d != null) {
                        c3730d = c3730d.m27880c();
                        if (c3730d != null) {
                            c3730d.mo19b(m30188o());
                        }
                    }
                    c3730d = this.f21916s;
                    if (c3730d != null) {
                        c3730d = c3730d.m27870b();
                        if (c3730d != null) {
                            c3730d.mo19b(m30189p());
                        }
                    }
                    c3730d = this.f21916s;
                    if (c3730d != null) {
                        c3730d = c3730d.m27871c();
                        if (c3730d != null) {
                            c3730d.mo19b(m30187n());
                        }
                    }
                    obj2 = (FrameLayout) mo5039c(C1487a.pipCon);
                    C2885g.m13907a(obj2, "pipCon");
                    obj2.setVisibility(0);
                    return;
                case 2:
                    arrayList = NavHostFragment.m24753a(m28707f().mo289a(C1487a.nav_host));
                    C1601a c1601a = SeeAllFragment.f21064a;
                    c3730d = c3730d.m18603m().m6135c();
                    if (c3730d == null) {
                        c3730d = "";
                    }
                    arrayList.m3888a((int) R.id.action_homeFragment_to_listingFragment, c1601a.m6129a(c3730d));
                    return;
                case 3:
                    arrayList = c3730d.m18603m().m6134b();
                    if (arrayList != null) {
                        if (((CharSequence) arrayList).length() > null) {
                            i = 1;
                        }
                        if (i == 1) {
                            m30202a(c3730d.m18596f(), c3730d.m18603m().m6134b());
                            return;
                        }
                    }
                    Crashlytics.logException((Throwable) new NullPointerException("url empty"));
                    return;
                case 4:
                    if (c3730d.m18603m().m6136d() != null) {
                        startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", c3730d.m18603m().m6136d(), null)));
                        return;
                    }
                    return;
                case 5:
                    C1625e.m6202a(this, c3730d.m18603m().m6137e());
                    return;
                case 6:
                    Context context = this;
                    Float f = c3730d.m18603m().m6138f();
                    float f2 = 0.0f;
                    float floatValue = f != null ? f.floatValue() : 0.0f;
                    c3730d = c3730d.m18603m().m6139g();
                    if (c3730d != null) {
                        f2 = c3730d.floatValue();
                    }
                    C1625e.m6201a(context, floatValue, f2);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void m30204b(String str) {
        C2885g.m13910b(str, "videoId");
        HashMap hashMap = new HashMap();
        hashMap.put(f21912v, str);
        C2100a.f6432a.m7664a(Event.f6413a, hashMap);
        m30182a(str);
        C2099a.f6431a.m7663b(str, new C3716b(this));
        m30183a((ArrayList) new ArrayList());
        this.f21913p = new PIPView(this, null);
        ((FrameLayout) mo5039c(C1487a.pipCon)).addView(this.f21913p);
        str = this.f21913p;
        if (str != null) {
            Object f = m28707f();
            C2885g.m13907a(f, "supportFragmentManager");
            str.setFragmentManager(f);
        }
        this.f21917t = new C4811c();
        this.f21916s = new C4810b();
        str = this.f21917t;
        if (str != null) {
            str.m27876a((C1603a) this);
        }
        str = this.f21916s;
        if (str != null) {
            str.m27868a((C1602a) this);
        }
        str = this.f21913p;
        if (str != null) {
            C4811c c4811c = this.f21917t;
            if (c4811c == null) {
                C2885g.m13906a();
            }
            str.m18621a((Fragment) c4811c);
        }
        str = this.f21913p;
        if (str != null) {
            C4810b c4810b = this.f21916s;
            if (c4810b == null) {
                C2885g.m13906a();
            }
            str.m18623b(c4810b);
        }
        str = this.f21913p;
        if (str != null) {
            str.setCallbacks(this);
        }
        str = this.f21913p;
        if (str != null) {
            str.m18620a();
        }
        new Handler().postDelayed(new C1591c(this), 500);
        Object obj = (FrameLayout) mo5039c(C1487a.pipCon);
        C2885g.m13907a(obj, "pipCon");
        obj.setVisibility(0);
    }
}
