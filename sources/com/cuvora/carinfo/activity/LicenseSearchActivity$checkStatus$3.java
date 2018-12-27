package com.cuvora.carinfo.activity;

import android.widget.Toast;
import kotlin.C2864b;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p154a.C2877a;

final class LicenseSearchActivity$checkStatus$3 extends Lambda implements C2877a<C2864b> {
    final /* synthetic */ LicenseSearchActivity this$0;

    LicenseSearchActivity$checkStatus$3(LicenseSearchActivity licenseSearchActivity) {
        this.this$0 = licenseSearchActivity;
        super(0);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo3923a() {
        m25030b();
        return C2864b.f12079a;
    }

    /* renamed from: b */
    public final void m25030b() {
        Toast.makeText(this.this$0, "No Internet", 0).show();
    }
}
