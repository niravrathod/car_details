package com.google.android.gms.internal.ads;

import android.view.View;

final class he implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ View f8141a;
    /* renamed from: b */
    private final /* synthetic */ zzajy f8142b;
    /* renamed from: c */
    private final /* synthetic */ int f8143c;
    /* renamed from: d */
    private final /* synthetic */ zzatu f8144d;

    he(zzatu zzatu, View view, zzajy zzajy, int i) {
        this.f8144d = zzatu;
        this.f8141a = view;
        this.f8142b = zzajy;
        this.f8143c = i;
    }

    public final void run() {
        this.f8144d.m21414a(this.f8141a, this.f8142b, this.f8143c - 1);
    }
}
