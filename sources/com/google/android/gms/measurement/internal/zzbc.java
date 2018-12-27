package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbc {
    /* renamed from: a */
    private final String f10749a;
    /* renamed from: b */
    private final boolean f10750b = true;
    /* renamed from: c */
    private boolean f10751c;
    /* renamed from: d */
    private boolean f10752d;
    /* renamed from: e */
    private final /* synthetic */ C4832l f10753e;

    public zzbc(C4832l c4832l, String str, boolean z) {
        this.f10753e = c4832l;
        Preconditions.checkNotEmpty(str);
        this.f10749a = str;
    }

    /* renamed from: a */
    public final boolean m12359a() {
        if (!this.f10751c) {
            this.f10751c = true;
            this.f10752d = this.f10753e.m28447x().getBoolean(this.f10749a, this.f10750b);
        }
        return this.f10752d;
    }

    /* renamed from: a */
    public final void m12358a(boolean z) {
        Editor edit = this.f10753e.m28447x().edit();
        edit.putBoolean(this.f10749a, z);
        edit.apply();
        this.f10752d = z;
    }
}
