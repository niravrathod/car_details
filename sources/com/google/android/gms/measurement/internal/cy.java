package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class cy {
    /* renamed from: a */
    final String f10612a;
    /* renamed from: b */
    final String f10613b;
    /* renamed from: c */
    final long f10614c;
    /* renamed from: d */
    final long f10615d;
    /* renamed from: e */
    final long f10616e;
    /* renamed from: f */
    final long f10617f;
    /* renamed from: g */
    final Long f10618g;
    /* renamed from: h */
    final Long f10619h;
    /* renamed from: i */
    final Long f10620i;
    /* renamed from: j */
    final Boolean f10621j;

    cy(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        cy cyVar = this;
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        boolean z = false;
        Preconditions.checkArgument(j5 >= 0);
        Preconditions.checkArgument(j6 >= 0);
        if (j7 >= 0) {
            z = true;
        }
        Preconditions.checkArgument(z);
        cyVar.f10612a = str;
        cyVar.f10613b = str2;
        cyVar.f10614c = j5;
        cyVar.f10615d = j6;
        cyVar.f10616e = j3;
        cyVar.f10617f = j7;
        cyVar.f10618g = l;
        cyVar.f10619h = l2;
        cyVar.f10620i = l3;
        cyVar.f10621j = bool;
    }

    /* renamed from: a */
    final cy m12311a() {
        return new cy(this.f10612a, this.f10613b, this.f10614c + 1, 1 + this.f10615d, this.f10616e, this.f10617f, this.f10618g, this.f10619h, this.f10620i, this.f10621j);
    }

    /* renamed from: a */
    final cy m12312a(long j) {
        return new cy(this.f10612a, this.f10613b, this.f10614c, this.f10615d, j, this.f10617f, this.f10618g, this.f10619h, this.f10620i, this.f10621j);
    }

    /* renamed from: a */
    final cy m12313a(long j, long j2) {
        return new cy(this.f10612a, this.f10613b, this.f10614c, this.f10615d, this.f10616e, j, Long.valueOf(j2), this.f10619h, this.f10620i, this.f10621j);
    }

    /* renamed from: a */
    final cy m12314a(Long l, Long l2, Boolean bool) {
        cy cyVar = this;
        Boolean bool2 = (bool == null || bool.booleanValue()) ? bool : null;
        return new cy(cyVar.f10612a, cyVar.f10613b, cyVar.f10614c, cyVar.f10615d, cyVar.f10616e, cyVar.f10617f, cyVar.f10618g, l, l2, bool2);
    }
}
