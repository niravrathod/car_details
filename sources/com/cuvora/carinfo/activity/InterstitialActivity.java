package com.cuvora.carinfo.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.cuvora.carinfo.helpers.C1533a;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import java.util.HashMap;

public abstract class InterstitialActivity extends AppCompatActivity {
    /* renamed from: n */
    private InterstitialAd f21849n;
    /* renamed from: o */
    private int f21850o = 1;
    /* renamed from: p */
    private long f21851p = 5000;
    /* renamed from: q */
    private Handler f21852q = new Handler();
    /* renamed from: r */
    private final Runnable f21853r = new C1465b(this);
    /* renamed from: s */
    private HashMap f21854s;

    /* renamed from: com.cuvora.carinfo.activity.InterstitialActivity$b */
    static final class C1465b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ InterstitialActivity f4451a;

        C1465b(InterstitialActivity interstitialActivity) {
            this.f4451a = interstitialActivity;
        }

        public final void run() {
            InterstitialActivity interstitialActivity = this.f4451a;
            interstitialActivity.f21850o = interstitialActivity.f21850o + 1;
            C1533a.m5789a(this.f4451a.f21849n);
        }
    }

    /* renamed from: com.cuvora.carinfo.activity.InterstitialActivity$a */
    public static final class C3654a extends AdListener {
        /* renamed from: a */
        final /* synthetic */ InterstitialActivity f14873a;

        C3654a(InterstitialActivity interstitialActivity) {
            this.f14873a = interstitialActivity;
        }

        public void onAdClosed() {
            this.f14873a.f21850o = 1;
            this.f14873a.f21851p = 5000;
            C1533a.m5789a(this.f14873a.f21849n);
        }

        public void onAdFailedToLoad(int i) {
            if (this.f14873a.f21850o != 5) {
                InterstitialActivity interstitialActivity = this.f14873a;
                interstitialActivity.f21851p = interstitialActivity.f21851p * ((long) this.f14873a.f21850o);
                this.f14873a.f21852q.postDelayed(this.f14873a.m30101n(), this.f14873a.f21851p);
            }
        }
    }

    /* renamed from: c */
    public View mo5038c(int i) {
        if (this.f21854s == null) {
            this.f21854s = new HashMap();
        }
        View view = (View) this.f21854s.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21854s.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: l */
    public abstract String mo5036l();

    /* renamed from: m */
    public abstract boolean mo5037m();

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21849n = new InterstitialAd(this);
        bundle = this.f21849n;
        if (bundle != null) {
            bundle.setAdUnitId(mo5036l());
        }
        bundle = this.f21849n;
        if (bundle != null) {
            bundle.setAdListener(new C3654a(this));
        }
        C1533a.m5789a(this.f21849n);
    }

    /* renamed from: n */
    public final Runnable m30101n() {
        return this.f21853r;
    }

    protected void onResume() {
        super.onResume();
        if (!mo5037m()) {
            C1533a.m5790a(this.f21849n, (Context) this);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (mo5037m()) {
            C1533a.m5794b(this.f21849n, this);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f21852q.removeCallbacks(this.f21853r);
    }
}
