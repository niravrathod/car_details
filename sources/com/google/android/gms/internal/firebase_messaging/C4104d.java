package com.google.android.gms.internal.firebase_messaging;

/* renamed from: com.google.android.gms.internal.firebase_messaging.d */
final class C4104d extends C2466a {
    /* renamed from: a */
    private final C2467b f17407a = new C2467b();

    C4104d() {
    }

    /* renamed from: a */
    public final void mo2918a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f17407a.m11489a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }
}
