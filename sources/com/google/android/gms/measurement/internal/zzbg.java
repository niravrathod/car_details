package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzu;
import java.util.List;

public final class zzbg {
    /* renamed from: a */
    final zzbt f10769a;

    zzbg(zzbt zzbt) {
        this.f10769a = zzbt;
    }

    /* renamed from: a */
    protected final void m12370a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                this.f10769a.mo3171q().mo4395d();
                if (m12368a()) {
                    this.f10769a.mo3172r().m28553v().m12354a("Install Referrer Reporter is initializing");
                    ServiceConnection zzbh = new zzbh(this, str);
                    this.f10769a.mo3171q().mo4395d();
                    str = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                    str.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                    PackageManager packageManager = this.f10769a.mo3170n().getPackageManager();
                    if (packageManager == null) {
                        this.f10769a.mo3172r().m28540i().m12354a("Failed to obtain Package Manager to verify binding conditions");
                        return;
                    }
                    List queryIntentServices = packageManager.queryIntentServices(str, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        this.f10769a.mo3172r().m28553v().m12354a("Play Service for fetching Install Referrer is unavailable on device");
                        return;
                    }
                    ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                    if (resolveInfo.serviceInfo != null) {
                        String str2 = resolveInfo.serviceInfo.packageName;
                        if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str2) && m12368a()) {
                            try {
                                this.f10769a.mo3172r().m28553v().m12355a("Install Referrer Service is", ConnectionTracker.getInstance().bindService(this.f10769a.mo3170n(), new Intent(str), zzbh, 1) != null ? "available" : "not available");
                                return;
                            } catch (String str3) {
                                this.f10769a.mo3172r().v_().m12355a("Exception occurred while binding to Install Referrer Service", str3.getMessage());
                                return;
                            }
                        }
                        this.f10769a.mo3172r().m28553v().m12354a("Play Store missing or incompatible. Version 8.3.73 or later required");
                    }
                    return;
                }
                this.f10769a.mo3172r().m28553v().m12354a("Install Referrer Reporter is not available");
                return;
            }
        }
        this.f10769a.mo3172r().m28553v().m12354a("Install Referrer Reporter was called with invalid app package name");
    }

    @VisibleForTesting
    /* renamed from: a */
    private final boolean m12368a() {
        boolean z = false;
        try {
            PackageManagerWrapper packageManager = Wrappers.packageManager(this.f10769a.mo3170n());
            if (packageManager == null) {
                this.f10769a.mo3172r().m28553v().m12354a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f10769a.mo3172r().m28553v().m12355a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    final Bundle m12369a(String str, zzu zzu) {
        this.f10769a.mo3171q().mo4395d();
        if (zzu == null) {
            this.f10769a.mo3172r().m28540i().m12354a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            str = zzu.mo3155a(bundle);
            if (str != null) {
                return str;
            }
            this.f10769a.mo3172r().v_().m12354a("Install Referrer Service returned a null response");
            return null;
        } catch (String str2) {
            this.f10769a.mo3172r().v_().m12355a("Exception occurred while retrieving the Install Referrer", str2.getMessage());
            return null;
        }
    }
}
