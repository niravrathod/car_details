package com.cuvora.carinfo.helpers;

import android.os.Bundle;
import android.support.v4.app.C0363u.C0362a;
import android.support.v4.content.C0392c;
import android.support.v7.app.AppCompatActivity;
import com.cuvora.carinfo.loaders.C4570m;
import com.cuvora.carinfo.loaders.C4572p;
import com.cuvora.carinfo.models.MaydayAndResponse;
import com.cuvora.carinfo.modes.ScrapeMode;

/* renamed from: com.cuvora.carinfo.helpers.r */
public class C1564r {
    /* renamed from: a */
    private AppCompatActivity f4706a;
    /* renamed from: b */
    private C1563a f4707b;
    /* renamed from: c */
    private C0362a<String> f4708c = new C37001(this);
    /* renamed from: d */
    private C0362a<MaydayAndResponse> f4709d = new C37012(this);

    /* renamed from: com.cuvora.carinfo.helpers.r$a */
    public interface C1563a {
        void onResponseFound(MaydayAndResponse maydayAndResponse);
    }

    /* renamed from: com.cuvora.carinfo.helpers.r$1 */
    class C37001 implements C0362a<String> {
        /* renamed from: a */
        final /* synthetic */ C1564r f14927a;
        /* renamed from: b */
        private String f14928b;
        /* renamed from: c */
        private ScrapeMode f14929c;

        /* renamed from: a */
        public void mo1159a(C0392c<String> c0392c) {
        }

        C37001(C1564r c1564r) {
            this.f14927a = c1564r;
        }

        /* renamed from: a */
        public C0392c<String> mo1158a(int i, Bundle bundle) {
            this.f14928b = bundle.getString("KEY_VEHICLE_NUM");
            this.f14929c = (ScrapeMode) bundle.getSerializable("KEY_MODE");
            return new C4570m(this.f14927a.f4706a, this.f14928b);
        }

        /* renamed from: a */
        public void m18528a(C0392c<String> c0392c, String str) {
            if (this.f14927a.f4706a != null && this.f14927a.f4706a.isFinishing() == null) {
                if (C1562q.m5946a(str) != null) {
                    c0392c = new Bundle();
                    c0392c.putString("KEY_VEHICLE_NUM", this.f14928b);
                    c0392c.putString("KEY_SCRAPE_REQUEST", str);
                    c0392c.putString("KEY_MODE", this.f14929c.m6088a());
                    this.f14927a.f4706a.m28708g().mo264a(1, c0392c, this.f14927a.f4709d).m1455m();
                } else if (this.f14927a.f4707b != null) {
                    this.f14927a.f4707b.onResponseFound(null);
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.helpers.r$2 */
    class C37012 implements C0362a<MaydayAndResponse> {
        /* renamed from: a */
        final /* synthetic */ C1564r f14930a;
        /* renamed from: b */
        private String f14931b;

        /* renamed from: a */
        public void mo1159a(C0392c<MaydayAndResponse> c0392c) {
        }

        C37012(C1564r c1564r) {
            this.f14930a = c1564r;
        }

        /* renamed from: a */
        public C0392c<MaydayAndResponse> mo1158a(int i, Bundle bundle) {
            this.f14931b = bundle.getString("KEY_SCRAPE_REQUEST");
            return new C4572p(this.f14930a.f4706a, bundle.getString("KEY_VEHICLE_NUM"), this.f14931b, bundle.getString("KEY_MODE"));
        }

        /* renamed from: a */
        public void m18531a(C0392c<MaydayAndResponse> c0392c, MaydayAndResponse maydayAndResponse) {
            if (this.f14930a.f4706a != null && this.f14930a.f4706a.isFinishing() == null && this.f14930a.f4707b != null) {
                this.f14930a.f4707b.onResponseFound(maydayAndResponse);
            }
        }
    }

    private C1564r(AppCompatActivity appCompatActivity) {
        this.f4706a = appCompatActivity;
    }

    /* renamed from: a */
    public static C1564r m5949a(AppCompatActivity appCompatActivity) {
        return new C1564r(appCompatActivity);
    }

    /* renamed from: a */
    public void m5952a(C1563a c1563a, String str, ScrapeMode scrapeMode) {
        this.f4707b = c1563a;
        c1563a = new Bundle();
        c1563a.putString("KEY_VEHICLE_NUM", str);
        c1563a.putSerializable("KEY_MODE", scrapeMode);
        this.f4706a.m28708g().mo265a(3);
        this.f4706a.m28708g().mo264a(3, c1563a, this.f4708c).m1455m();
    }
}
