package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

final class sx {
    /* renamed from: a */
    private final WeakReference<zzasg> f8383a;
    /* renamed from: b */
    private String f8384b;

    public sx(zzasg zzasg) {
        this.f8383a = new WeakReference(zzasg);
    }

    /* renamed from: a */
    public final void m9378a(zzadw zzadw) {
        zzadw.mo2223a("/loadHtml", new sy(this, zzadw));
        zzadw.mo2223a("/showOverlay", new ta(this, zzadw));
        zzadw.mo2223a("/hideOverlay", new tb(this, zzadw));
        zzasg zzasg = (zzasg) this.f8383a.get();
        if (zzasg != null) {
            zzasg.mo4740a("/sendMessageToSdk", new tc(this, zzadw));
        }
    }
}
