package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.AdRequest;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzxt extends zzaul {
    /* renamed from: a */
    private static final Object f20415a = new Object();
    @GuardedBy("lock")
    /* renamed from: b */
    private static zzxt f20416b;
    /* renamed from: c */
    private final AppMeasurementSdk f20417c;

    private zzxt(AppMeasurementSdk appMeasurementSdk) {
        this.f20417c = appMeasurementSdk;
    }

    /* renamed from: a */
    public static void m26871a(Context context, String str, Bundle bundle) {
        synchronized (f20415a) {
            if (f20416b != null) {
                return;
            }
            zzxt zzxt = new zzxt(AppMeasurementSdk.m12218a(context, AdRequest.LOGTAG, "am", str, bundle));
            f20416b = zzxt;
            new Thread(new wj(context, zzxt)).start();
        }
    }

    /* renamed from: a */
    public final void mo4307a(Bundle bundle) {
        this.f20417c.m12233c(bundle);
    }

    /* renamed from: b */
    public final Bundle mo4311b(Bundle bundle) {
        return this.f20417c.m12227b(bundle);
    }

    /* renamed from: a */
    public final void mo4309a(String str, String str2, Bundle bundle) {
        this.f20417c.m12225a(str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo4310a(String str, String str2, IObjectWrapper iObjectWrapper) {
        this.f20417c.m12226a(str, str2, iObjectWrapper != null ? ObjectWrapper.m26020a(iObjectWrapper) : null);
    }

    /* renamed from: a */
    public final Map mo4306a(String str, String str2, boolean z) {
        return this.f20417c.m12221a(str, str2, z);
    }

    /* renamed from: a */
    public final int mo4303a(String str) {
        return this.f20417c.m12231c(str);
    }

    /* renamed from: c */
    public final void mo4316c(Bundle bundle) {
        this.f20417c.m12223a(bundle);
    }

    /* renamed from: b */
    public final void mo4314b(String str, String str2, Bundle bundle) {
        this.f20417c.m12230b(str, str2, bundle);
    }

    /* renamed from: a */
    public final List mo4305a(String str, String str2) {
        return this.f20417c.m12220a(str, str2);
    }

    /* renamed from: a */
    public final String mo4304a() {
        return this.f20417c.m12232c();
    }

    /* renamed from: b */
    public final String mo4312b() {
        return this.f20417c.m12234d();
    }

    /* renamed from: c */
    public final long mo4315c() {
        return this.f20417c.m12235e();
    }

    /* renamed from: b */
    public final void mo4313b(String str) {
        this.f20417c.m12224a(str);
    }

    /* renamed from: c */
    public final void mo4317c(String str) {
        this.f20417c.m12229b(str);
    }

    /* renamed from: a */
    public final void mo4308a(IObjectWrapper iObjectWrapper, String str, String str2) {
        this.f20417c.m12222a(iObjectWrapper != null ? (Activity) ObjectWrapper.m26020a(iObjectWrapper) : null, str, str2);
    }

    /* renamed from: d */
    public final String mo4318d() {
        return this.f20417c.m12219a();
    }

    /* renamed from: e */
    public final String mo4319e() {
        return this.f20417c.m12228b();
    }

    /* renamed from: f */
    public final String mo4320f() {
        return this.f20417c.m12236f();
    }

    /* renamed from: a */
    static final /* synthetic */ void m26870a(Context context, zzxt zzxt) {
        try {
            ((zzaum) zzaol.m10010a(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", wk.f16723a)).mo2411a(zzxt);
        } catch (Context context2) {
            zzaok.m10006d("#007 Could not call remote method.", context2);
        }
    }
}
