package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzu;
import java.util.Map;

final /* synthetic */ class vc implements Runnable {
    /* renamed from: a */
    private final zzvp f8438a;
    /* renamed from: b */
    private final zzu f8439b;
    /* renamed from: c */
    private final Map f8440c;

    vc(zzvp zzvp, zzu zzu, Map map) {
        this.f8438a = zzvp;
        this.f8439b = zzu;
        this.f8440c = map;
    }

    public final void run() {
        this.f8438a.m11155a(this.f8439b, this.f8440c);
    }
}
