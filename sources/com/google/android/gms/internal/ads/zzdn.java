package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

public final class zzdn extends zzek {
    /* renamed from: d */
    private final Activity f17159d;
    /* renamed from: e */
    private final View f17160e;

    public zzdn(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2, View view, Activity activity) {
        super(zzdb, str, str2, zzbb, i, 62);
        this.f17160e = view;
        this.f17159d = activity;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        if (this.f17160e != null) {
            boolean booleanValue = ((Boolean) zzkd.m10713e().m10897a(zznw.bf)).booleanValue();
            Object[] objArr = (Object[]) this.c.invoke(null, new Object[]{this.f17160e, this.f17159d, Boolean.valueOf(booleanValue)});
            synchronized (this.b) {
                this.b.f19975Q = Long.valueOf(((Long) objArr[0]).longValue());
                this.b.f19976R = Long.valueOf(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.b.f19977S = (String) objArr[2];
                }
            }
        }
    }
}
