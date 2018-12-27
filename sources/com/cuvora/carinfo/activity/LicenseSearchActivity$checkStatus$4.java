package com.cuvora.carinfo.activity;

import android.content.Intent;
import com.cuvora.carinfo.SearchErrorActivity;
import com.cuvora.carinfo.helpers.C1540d;
import kotlin.C2864b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p154a.C2877a;

final class LicenseSearchActivity$checkStatus$4 extends Lambda implements C2877a<C2864b> {
    final /* synthetic */ LicenseSearchActivity this$0;

    LicenseSearchActivity$checkStatus$4(LicenseSearchActivity licenseSearchActivity) {
        this.this$0 = licenseSearchActivity;
        super(0);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo3923a() {
        m25032b();
        return C2864b.f12079a;
    }

    /* renamed from: b */
    public final void m25032b() {
        C1540d.m5819b("Search Attempt", "Successful");
        C1540d.m5819b("Search Attempt", "Wrong Info Entered");
        Intent intent = new Intent(this.this$0, SearchErrorActivity.class);
        intent.putExtra("KEY_LICENCE_NUMBER", this.this$0.m30123m());
        intent.putExtra("KEY_ERROR_RESPONSE", this.this$0.m30122l());
        this.this$0.startActivity(intent);
    }
}
