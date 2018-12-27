package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class cz implements Runnable {
    /* renamed from: a */
    private final zzalj f7981a;
    /* renamed from: b */
    private final Context f7982b;
    /* renamed from: c */
    private final String f7983c;

    cz(zzalj zzalj, Context context, String str) {
        this.f7981a = zzalj;
        this.f7982b = context;
        this.f7983c = str;
    }

    public final void run() {
        this.f7981a.m21232a(this.f7982b, this.f7983c);
    }
}
