package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

final class ql implements ValueCallback<String> {
    /* renamed from: a */
    private final /* synthetic */ qk f8354a;

    ql(qk qkVar) {
        this.f8354a = qkVar;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        this.f8354a.f8352d.m10640a(this.f8354a.f8349a, this.f8354a.f8350b, (String) obj, this.f8354a.f8351c);
    }
}
