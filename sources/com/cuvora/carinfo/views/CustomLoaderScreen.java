package com.cuvora.carinfo.views;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.helpers.C1541e;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.p071d.C1473c;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.mikhaellopez.circularfillableloaders.CircularFillableLoaders;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class CustomLoaderScreen extends FrameLayout {
    /* renamed from: a */
    private final Handler f4913a = new Handler();
    /* renamed from: b */
    private final long f4914b = 1000;
    /* renamed from: c */
    private final int f4915c = 90;
    /* renamed from: d */
    private final long f4916d = 4000;
    /* renamed from: e */
    private int f4917e;
    /* renamed from: f */
    private int f4918f = 10;
    /* renamed from: g */
    private boolean f4919g;
    /* renamed from: h */
    private int f4920h;
    /* renamed from: i */
    private final Runnable f4921i = ((Runnable) new C1634e(this));
    /* renamed from: j */
    private C1631a f4922j;
    /* renamed from: k */
    private final Runnable f4923k;
    /* renamed from: l */
    private final Runnable f4924l;
    /* renamed from: m */
    private HashMap f4925m;

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$a */
    public interface C1631a {
        /* renamed from: n */
        void mo5029n();
    }

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$b */
    static final class C1632b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ CustomLoaderScreen f4906a;
        /* renamed from: b */
        final /* synthetic */ C1473c f4907b;

        C1632b(CustomLoaderScreen customLoaderScreen, C1473c c1473c) {
            this.f4906a = customLoaderScreen;
            this.f4907b = c1473c;
        }

        public final void run() {
            super.setVisibility(8);
            this.f4907b.mo1162a(Boolean.valueOf(true));
            ((CircularFillableLoaders) this.f4906a.m6237a(C1487a.pb)).setProgress(0);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$d */
    static final class C1633d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ CustomLoaderScreen f4908a;

        C1633d(CustomLoaderScreen customLoaderScreen) {
            this.f4908a = customLoaderScreen;
        }

        public final void run() {
            if (this.f4908a.f4917e != this.f4908a.f4915c) {
                this.f4908a.f4913a.postDelayed(this.f4908a.f4923k, this.f4908a.f4914b);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$e */
    static final class C1634e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ CustomLoaderScreen f4909a;

        C1634e(CustomLoaderScreen customLoaderScreen) {
            this.f4909a = customLoaderScreen;
        }

        public final void run() {
            this.f4909a.f4919g = true;
            C1631a callbacks = this.f4909a.getCallbacks();
            if (callbacks != null) {
                callbacks.mo5029n();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$f */
    static final class C1635f implements Runnable {
        /* renamed from: a */
        final /* synthetic */ CustomLoaderScreen f4910a;
        /* renamed from: b */
        final /* synthetic */ int f4911b;

        C1635f(CustomLoaderScreen customLoaderScreen, int i) {
            this.f4910a = customLoaderScreen;
            this.f4911b = i;
        }

        public final void run() {
            super.setVisibility(this.f4911b);
        }
    }

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$g */
    static final class C1636g implements Runnable {
        /* renamed from: a */
        final /* synthetic */ CustomLoaderScreen f4912a;

        C1636g(CustomLoaderScreen customLoaderScreen) {
            this.f4912a = customLoaderScreen;
        }

        public final void run() {
            CustomLoaderScreen customLoaderScreen = this.f4912a;
            customLoaderScreen.f4917e = customLoaderScreen.f4917e + this.f4912a.f4918f;
            ((CircularFillableLoaders) this.f4912a.m6237a(C1487a.pb)).setProgress(this.f4912a.f4917e);
            this.f4912a.f4924l.run();
        }
    }

    /* renamed from: com.cuvora.carinfo.views.CustomLoaderScreen$c */
    public static final class C3738c extends AdListener {
        C3738c() {
        }

        public void onAdLoaded() {
            super.onAdLoaded();
        }

        public void onAdFailedToLoad(int i) {
            super.onAdFailedToLoad(i);
        }
    }

    /* renamed from: a */
    public View m6237a(int i) {
        if (this.f4925m == null) {
            this.f4925m = new HashMap();
        }
        View view = (View) this.f4925m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f4925m.put(Integer.valueOf(i), view);
        return view;
    }

    public CustomLoaderScreen(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attributeSet");
        super(context, attributeSet);
        View.inflate(context, R.layout.view_custom_loader, this);
        m6230c();
        if (C1570t.m6032q(context) != null) {
            context = 2000;
        } else {
            Object b = C1541e.m5855b("searchScreenLoaderWaitTime");
            C2885g.m13907a(b, "FirebaseRemote.getRemote…tants.KEY_LOADER_TIMEOUT)");
            context = b.intValue();
        }
        this.f4920h = context;
        this.f4923k = (Runnable) new C1636g(this);
        this.f4924l = (Runnable) new C1633d(this);
    }

    /* renamed from: c */
    private final void m6230c() {
        C1533a.m5793b((AdView) m6237a(C1487a.adView), getContext(), new C3738c());
    }

    public final C1631a getCallbacks() {
        return this.f4922j;
    }

    public final void setCallbacks(C1631a c1631a) {
        this.f4922j = c1631a;
    }

    /* renamed from: a */
    public final boolean m6239a() {
        return this.f4919g;
    }

    /* renamed from: d */
    private final void m6232d() {
        this.f4923k.run();
    }

    public void setVisibility(int i) {
        if (i == 0) {
            this.f4913a.postDelayed(this.f4921i, (long) this.f4920h);
            m6232d();
            Object obj = (AdView) m6237a(C1487a.adView);
            C2885g.m13907a(obj, "adView");
            obj.setVisibility(8);
            m6230c();
            super.setVisibility(i);
        } else if (i == 8) {
            ((CircularFillableLoaders) m6237a(C1487a.pb)).setProgress(100);
            this.f4913a.removeCallbacksAndMessages(null);
            m6234e();
            this.f4913a.postDelayed(new C1635f(this, i), 1000);
        }
    }

    /* renamed from: e */
    private final void m6234e() {
        this.f4913a.removeCallbacks(this.f4921i);
        this.f4913a.removeCallbacksAndMessages(null);
        this.f4917e = 0;
        this.f4919g = false;
    }

    /* renamed from: b */
    public final void m6240b() {
        m6234e();
    }

    /* renamed from: a */
    public final void m6238a(C1473c<Boolean> c1473c) {
        C2885g.m13910b(c1473c, "callback");
        this.f4913a.removeCallbacks(this.f4921i);
        ((CircularFillableLoaders) m6237a(C1487a.pb)).setProgress(100);
        this.f4913a.removeCallbacksAndMessages(null);
        m6234e();
        this.f4913a.postDelayed(new C1632b(this, c1473c), 1000);
    }
}
