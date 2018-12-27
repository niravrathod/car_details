package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbf {
    /* renamed from: a */
    private final String f10764a;
    /* renamed from: b */
    private final String f10765b = null;
    /* renamed from: c */
    private boolean f10766c;
    /* renamed from: d */
    private String f10767d;
    /* renamed from: e */
    private final /* synthetic */ C4832l f10768e;

    public zzbf(C4832l c4832l, String str, String str2) {
        this.f10768e = c4832l;
        Preconditions.checkNotEmpty(str);
        this.f10764a = str;
    }

    /* renamed from: a */
    public final String m12366a() {
        if (!this.f10766c) {
            this.f10766c = true;
            this.f10767d = this.f10768e.m28447x().getString(this.f10764a, null);
        }
        return this.f10767d;
    }

    /* renamed from: a */
    public final void m12367a(String str) {
        if (!zzfk.m28604c(str, this.f10767d)) {
            Editor edit = this.f10768e.m28447x().edit();
            edit.putString(this.f10764a, str);
            edit.apply();
            this.f10767d = str;
        }
    }
}
