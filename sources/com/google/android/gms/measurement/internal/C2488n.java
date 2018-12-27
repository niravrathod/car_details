package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzu;

/* renamed from: com.google.android.gms.measurement.internal.n */
final class C2488n implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ zzu f10644a;
    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f10645b;
    /* renamed from: c */
    private final /* synthetic */ zzbh f10646c;

    C2488n(zzbh zzbh, zzu zzu, ServiceConnection serviceConnection) {
        this.f10646c = zzbh;
        this.f10644a = zzu;
        this.f10645b = serviceConnection;
    }

    public final void run() {
        zzbg zzbg = this.f10646c.f10770a;
        String a = this.f10646c.f10771b;
        zzu zzu = this.f10644a;
        ServiceConnection serviceConnection = this.f10645b;
        Bundle a2 = zzbg.m12369a(a, zzu);
        zzbg.f10769a.mo3171q().mo4395d();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                zzbg.f10769a.mo3172r().v_().m12354a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string != null) {
                    if (!string.isEmpty()) {
                        zzbg.f10769a.mo3172r().m28555x().m12355a("InstallReferrer API result", string);
                        zzfk j2 = zzbg.f10769a.m22729j();
                        String str = "?";
                        string = String.valueOf(string);
                        Bundle a3 = j2.m28611a(Uri.parse(string.length() != 0 ? str.concat(string) : new String(str)));
                        if (a3 == null) {
                            zzbg.f10769a.mo3172r().v_().m12354a("No campaign params defined in install referrer result");
                        } else {
                            String string2 = a3.getString("medium");
                            Object obj = (string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? null : 1;
                            if (obj != null) {
                                long j3 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                                if (j3 == 0) {
                                    zzbg.f10769a.mo3172r().v_().m12354a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    a3.putLong("click_timestamp", j3);
                                }
                            }
                            if (j == zzbg.f10769a.m22722c().f21389i.m12360a()) {
                                zzbg.f10769a.mo3173u();
                                zzbg.f10769a.mo3172r().m28555x().m12354a("Campaign has already been logged");
                            } else {
                                zzbg.f10769a.m22722c().f21389i.m12361a(j);
                                zzbg.f10769a.mo3173u();
                                zzbg.f10769a.mo3172r().m28555x().m12355a("Logging Install Referrer campaign from sdk with ", "referrer API");
                                a3.putString("_cis", "referrer API");
                                zzbg.f10769a.m22727h().m29583a("auto", "_cmp", a3);
                            }
                        }
                    }
                }
                zzbg.f10769a.mo3172r().v_().m12354a("No referrer defined in install referrer response");
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzbg.f10769a.mo3170n(), serviceConnection);
        }
    }
}
