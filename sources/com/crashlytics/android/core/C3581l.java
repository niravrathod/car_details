package com.crashlytics.android.core;

import io.fabric.sdk.android.services.network.C2836e;
import java.io.InputStream;

/* renamed from: com.crashlytics.android.core.l */
class C3581l implements C2836e {
    /* renamed from: a */
    private final PinningInfoProvider f14742a;

    /* renamed from: d */
    public long mo1154d() {
        return -1;
    }

    public C3581l(PinningInfoProvider pinningInfoProvider) {
        this.f14742a = pinningInfoProvider;
    }

    /* renamed from: a */
    public InputStream mo1151a() {
        return this.f14742a.getKeyStoreStream();
    }

    /* renamed from: b */
    public String mo1152b() {
        return this.f14742a.getKeyStorePassword();
    }

    /* renamed from: c */
    public String[] mo1153c() {
        return this.f14742a.getPins();
    }
}
