package com.cuvora.carinfo.activity;

import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.views.DlScraperView;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p154a.C2877a;

final class LicenseSearchActivity$checkStatus$5 extends Lambda implements C2877a<C2864b> {
    final /* synthetic */ LicenseSearchActivity this$0;

    LicenseSearchActivity$checkStatus$5(LicenseSearchActivity licenseSearchActivity) {
        this.this$0 = licenseSearchActivity;
        super(0);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo3923a() {
        m25034b();
        return C2864b.f12079a;
    }

    /* renamed from: b */
    public final void m25034b() {
        C1540d.m5819b("Webview", "Max Polling Reached");
        Object obj = (DlScraperView) this.this$0.m30121c(C1487a.dlScraper);
        C2885g.m13907a(obj, "dlScraper");
        obj.setVisibility(0);
        ((DlScraperView) this.this$0.m30121c(C1487a.dlScraper)).m6313b();
    }
}
