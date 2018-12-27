package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

final class cd {
    /* renamed from: a */
    private final Clock f10563a;
    /* renamed from: b */
    private long f10564b;

    public cd(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f10563a = clock;
    }

    /* renamed from: a */
    public final void m12242a() {
        this.f10564b = this.f10563a.elapsedRealtime();
    }

    /* renamed from: b */
    public final void m12244b() {
        this.f10564b = 0;
    }

    /* renamed from: a */
    public final boolean m12243a(long j) {
        if (this.f10564b != 0 && this.f10563a.elapsedRealtime() - this.f10564b < 3600000) {
            return 0;
        }
        return true;
    }
}
