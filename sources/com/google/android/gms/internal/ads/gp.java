package com.google.android.gms.internal.ads;

import android.view.View;

final class gp implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ View f8111a;
    /* renamed from: b */
    private final /* synthetic */ zzajy f8112b;
    /* renamed from: c */
    private final /* synthetic */ int f8113c;
    /* renamed from: d */
    private final /* synthetic */ zzash f8114d;

    gp(zzash zzash, View view, zzajy zzajy, int i) {
        this.f8114d = zzash;
        this.f8111a = view;
        this.f8112b = zzajy;
        this.f8113c = i;
    }

    public final void run() {
        this.f8114d.m21375a(this.f8111a, this.f8112b, this.f8113c - 1);
    }
}
