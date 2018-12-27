package com.cuvora.carinfo.activity;

import android.content.Intent;
import com.cuvora.carinfo.helpers.C1540d;
import kotlin.C2864b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p154a.C2877a;

final class LicenseSearchActivity$checkStatus$1 extends Lambda implements C2877a<C2864b> {
    final /* synthetic */ LicenseSearchActivity this$0;

    LicenseSearchActivity$checkStatus$1(LicenseSearchActivity licenseSearchActivity) {
        this.this$0 = licenseSearchActivity;
        super(0);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo3923a() {
        m25026b();
        return C2864b.f12079a;
    }

    /* renamed from: b */
    public final void m25026b() {
        C1540d.m5819b("Search Attempt", "Successful");
        C1540d.m5819b("Search Attempt", "Backend Served");
        Intent intent = new Intent(this.this$0, LicenseInfoActivity.class);
        intent.putExtra("license_data", this.this$0.f21867u);
        this.this$0.startActivity(intent);
    }
}
