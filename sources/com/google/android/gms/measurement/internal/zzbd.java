package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbd {
    /* renamed from: a */
    private final String f10754a;
    /* renamed from: b */
    private final long f10755b;
    /* renamed from: c */
    private boolean f10756c;
    /* renamed from: d */
    private long f10757d;
    /* renamed from: e */
    private final /* synthetic */ C4832l f10758e;

    public zzbd(C4832l c4832l, String str, long j) {
        this.f10758e = c4832l;
        Preconditions.checkNotEmpty(str);
        this.f10754a = str;
        this.f10755b = j;
    }

    /* renamed from: a */
    public final long m12360a() {
        if (!this.f10756c) {
            this.f10756c = true;
            this.f10757d = this.f10758e.m28447x().getLong(this.f10754a, this.f10755b);
        }
        return this.f10757d;
    }

    /* renamed from: a */
    public final void m12361a(long j) {
        Editor edit = this.f10758e.m28447x().edit();
        edit.putLong(this.f10754a, j);
        edit.apply();
        this.f10757d = j;
    }
}
