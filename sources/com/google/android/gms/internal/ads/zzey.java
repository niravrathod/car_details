package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class zzey implements zzgg {
    /* renamed from: a */
    private WeakReference<zzpm> f17188a;

    public zzey(zzpm zzpm) {
        this.f17188a = new WeakReference(zzpm);
    }

    /* renamed from: a */
    public final View mo2446a() {
        zzpm zzpm = (zzpm) this.f17188a.get();
        return zzpm != null ? zzpm.mo2609o() : null;
    }

    /* renamed from: b */
    public final boolean mo2447b() {
        return this.f17188a.get() == null;
    }

    /* renamed from: c */
    public final zzgg mo2448c() {
        return new zzfa((zzpm) this.f17188a.get());
    }
}
