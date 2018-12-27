package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@zzaer
public final class zzjq extends zzld {
    /* renamed from: a */
    private final AppEventListener f20237a;

    public zzjq(AppEventListener appEventListener) {
        this.f20237a = appEventListener;
    }

    /* renamed from: a */
    public final void mo2523a(String str, String str2) {
        this.f20237a.onAppEvent(str, str2);
    }

    /* renamed from: a */
    public final AppEventListener m26620a() {
        return this.f20237a;
    }
}
