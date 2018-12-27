package com.google.android.gms.internal.ads;

import android.app.AlertDialog.Builder;
import android.content.Context;

final class dr implements Runnable {
    /* renamed from: a */
    final /* synthetic */ Context f8006a;
    /* renamed from: b */
    private final /* synthetic */ String f8007b;
    /* renamed from: c */
    private final /* synthetic */ boolean f8008c;
    /* renamed from: d */
    private final /* synthetic */ boolean f8009d;

    dr(zzamq zzamq, Context context, String str, boolean z, boolean z2) {
        this.f8006a = context;
        this.f8007b = str;
        this.f8008c = z;
        this.f8009d = z2;
    }

    public final void run() {
        Builder builder = new Builder(this.f8006a);
        builder.setMessage(this.f8007b);
        if (this.f8008c) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f8009d) {
            builder.setNeutralButton("Dismiss", null);
        } else {
            builder.setPositiveButton("Learn More", new ds(this));
            builder.setNegativeButton("Dismiss", null);
        }
        builder.create().show();
    }
}
