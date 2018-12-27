package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.p148c.C2787c;
import io.fabric.sdk.android.services.p148c.C4298d;

/* renamed from: io.fabric.sdk.android.services.common.c */
class C2791c {
    /* renamed from: a */
    private final Context f11890a;
    /* renamed from: b */
    private final C2787c f11891b;

    public C2791c(Context context) {
        this.f11890a = context.getApplicationContext();
        this.f11891b = new C4298d(context, "TwitterAdvertisingInfoPreferences");
    }

    /* renamed from: a */
    public C2790b m13670a() {
        C2790b b = m13671b();
        if (m13668c(b)) {
            C2766c.m13524h().mo3554a("Fabric", "Using AdvertisingInfo from Preference Store");
            m13665a(b);
            return b;
        }
        b = m13669e();
        m13667b(b);
        return b;
    }

    /* renamed from: a */
    private void m13665a(final C2790b c2790b) {
        new Thread(new C2797h(this) {
            /* renamed from: b */
            final /* synthetic */ C2791c f18026b;

            /* renamed from: a */
            public void mo1138a() {
                C2790b a = this.f18026b.m13669e();
                if (!c2790b.equals(a)) {
                    C2766c.m13524h().mo3554a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                    this.f18026b.m13667b(a);
                }
            }
        }).start();
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private void m13667b(C2790b c2790b) {
        if (m13668c(c2790b)) {
            this.f11891b.mo3577a(this.f11891b.mo3578b().putString("advertising_id", c2790b.f11888a).putBoolean("limit_ad_tracking_enabled", c2790b.f11889b));
        } else {
            this.f11891b.mo3577a(this.f11891b.mo3578b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }

    /* renamed from: b */
    protected C2790b m13671b() {
        return new C2790b(this.f11891b.mo3576a().getString("advertising_id", ""), this.f11891b.mo3576a().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: c */
    public C2795f m13672c() {
        return new C4300d(this.f11890a);
    }

    /* renamed from: d */
    public C2795f m13673d() {
        return new C4301e(this.f11890a);
    }

    /* renamed from: c */
    private boolean m13668c(C2790b c2790b) {
        return (c2790b == null || TextUtils.isEmpty(c2790b.f11888a) != null) ? null : true;
    }

    /* renamed from: e */
    private C2790b m13669e() {
        C2790b a = m13672c().mo3579a();
        if (m13668c(a)) {
            C2766c.m13524h().mo3554a("Fabric", "Using AdvertisingInfo from Reflection Provider");
        } else {
            a = m13673d().mo3579a();
            if (m13668c(a)) {
                C2766c.m13524h().mo3554a("Fabric", "Using AdvertisingInfo from Service Provider");
            } else {
                C2766c.m13524h().mo3554a("Fabric", "AdvertisingInfo not present");
            }
        }
        return a;
    }
}
