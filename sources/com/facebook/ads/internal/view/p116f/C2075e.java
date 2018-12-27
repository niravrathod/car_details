package com.facebook.ads.internal.view.p116f;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.facebook.ads.internal.view.f.e */
class C2075e extends ContentObserver {
    /* renamed from: a */
    private final C3903c f6390a;

    C2075e(Handler handler, C3903c c3903c) {
        super(handler);
        this.f6390a = c3903c;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        this.f6390a.m19397e();
    }
}
