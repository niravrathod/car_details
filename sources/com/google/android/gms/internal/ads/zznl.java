package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

@zzaer
public abstract class zznl<T> {
    /* renamed from: a */
    private final int f9663a;
    /* renamed from: b */
    private final String f9664b;
    /* renamed from: c */
    private final T f9665c;

    private zznl(int i, String str, T t) {
        this.f9663a = i;
        this.f9664b = str;
        this.f9665c = t;
        zzkd.m10712d().m10891a(this);
    }

    /* renamed from: a */
    protected abstract T mo2169a(SharedPreferences sharedPreferences);

    /* renamed from: a */
    protected abstract T mo2170a(JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo2171a(Editor editor, T t);

    /* renamed from: a */
    public final String m10885a() {
        return this.f9664b;
    }

    /* renamed from: b */
    public final T m10887b() {
        return this.f9665c;
    }

    /* renamed from: a */
    public static zznl<Boolean> m10880a(int i, String str, Boolean bool) {
        return new sf(i, str, bool);
    }

    /* renamed from: a */
    public static zznl<Integer> m10878a(int i, String str, int i2) {
        return new sg(i, str, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public static zznl<Long> m10879a(int i, String str, long j) {
        return new sh(i, str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static zznl<Float> m10877a(int i, String str, float f) {
        return new si(i, str, Float.valueOf(f));
    }

    /* renamed from: a */
    public static zznl<String> m10881a(int i, String str, String str2) {
        return new sj(i, str, str2);
    }

    /* renamed from: a */
    public static zznl<String> m10876a(int i, String str) {
        i = m10881a(i, str, null);
        zzkd.m10712d().m10893b(i);
        return i;
    }

    /* renamed from: b */
    public static zznl<String> m10882b(int i, String str) {
        i = m10881a(i, str, null);
        zzkd.m10712d().m10894c(i);
        return i;
    }

    /* renamed from: c */
    public final int m10888c() {
        return this.f9663a;
    }
}
