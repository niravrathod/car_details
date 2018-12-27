package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class cm {
    /* renamed from: a */
    final String f10569a;
    /* renamed from: b */
    final String f10570b;
    /* renamed from: c */
    final String f10571c;
    /* renamed from: d */
    final long f10572d;
    /* renamed from: e */
    final Object f10573e;

    cm(String str, String str2, String str3, long j, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(obj);
        this.f10569a = str;
        this.f10570b = str2;
        this.f10571c = str3;
        this.f10572d = j;
        this.f10573e = obj;
    }
}
