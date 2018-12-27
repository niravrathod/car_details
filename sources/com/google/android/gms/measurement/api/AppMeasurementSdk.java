package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.measurement.zzem;
import java.util.List;
import java.util.Map;

@KeepForSdk
public class AppMeasurementSdk {
    /* renamed from: a */
    private final zzem f10402a;

    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    @KeepForSdk
    public interface EventInterceptor {
    }

    @KeepForSdk
    public interface OnEventListener {
    }

    @KeepForSdk
    /* renamed from: a */
    public static AppMeasurementSdk m12218a(Context context, String str, String str2, String str3, Bundle bundle) {
        return zzem.m11908a(context, str, str2, str3, bundle).m11928a();
    }

    public AppMeasurementSdk(zzem zzem) {
        this.f10402a = zzem;
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12225a(String str, String str2, Bundle bundle) {
        this.f10402a.m11935a(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12226a(String str, String str2, Object obj) {
        this.f10402a.m11936a(str, str2, obj, true);
    }

    @KeepForSdk
    /* renamed from: a */
    public Map<String, Object> m12221a(String str, String str2, boolean z) {
        return this.f10402a.m11930a(str, str2, z);
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12223a(Bundle bundle) {
        this.f10402a.m11933a(bundle);
    }

    @KeepForSdk
    /* renamed from: b */
    public void m12230b(String str, String str2, Bundle bundle) {
        this.f10402a.m11939b(str, str2, bundle);
    }

    @KeepForSdk
    /* renamed from: a */
    public List<Bundle> m12220a(String str, String str2) {
        return this.f10402a.m11929a(str, str2);
    }

    @KeepForSdk
    /* renamed from: a */
    public String m12219a() {
        return this.f10402a.m11943e();
    }

    @KeepForSdk
    /* renamed from: b */
    public String m12228b() {
        return this.f10402a.m11944f();
    }

    @KeepForSdk
    /* renamed from: c */
    public String m12232c() {
        return this.f10402a.m11941c();
    }

    @KeepForSdk
    /* renamed from: d */
    public String m12234d() {
        return this.f10402a.m11937b();
    }

    @KeepForSdk
    /* renamed from: e */
    public long m12235e() {
        return this.f10402a.m11942d();
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12224a(String str) {
        this.f10402a.m11934a(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public void m12229b(String str) {
        this.f10402a.m11938b(str);
    }

    @KeepForSdk
    /* renamed from: b */
    public Bundle m12227b(Bundle bundle) {
        return this.f10402a.m11926a(bundle, true);
    }

    @KeepForSdk
    /* renamed from: c */
    public void m12233c(Bundle bundle) {
        this.f10402a.m11926a(bundle, false);
    }

    @KeepForSdk
    /* renamed from: c */
    public int m12231c(String str) {
        return this.f10402a.m11940c(str);
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12222a(Activity activity, String str, String str2) {
        this.f10402a.m11932a(activity, str, str2);
    }

    @KeepForSdk
    /* renamed from: f */
    public String m12236f() {
        return this.f10402a.m11945g();
    }
}
