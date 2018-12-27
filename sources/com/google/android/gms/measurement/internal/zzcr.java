package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzcr {
    /* renamed from: a */
    final Context f10773a;
    /* renamed from: b */
    String f10774b;
    /* renamed from: c */
    String f10775c;
    /* renamed from: d */
    String f10776d;
    /* renamed from: e */
    boolean f10777e = true;
    /* renamed from: f */
    Boolean f10778f;

    @VisibleForTesting
    public zzcr(Context context, zzak zzak) {
        Preconditions.checkNotNull(context);
        context = context.getApplicationContext();
        Preconditions.checkNotNull(context);
        this.f10773a = context;
        if (zzak != null) {
            this.f10774b = zzak.f10743f;
            this.f10775c = zzak.f10742e;
            this.f10776d = zzak.f10741d;
            this.f10777e = zzak.f10740c;
            if (zzak.f10744g != null) {
                this.f10778f = Boolean.valueOf(zzak.f10744g.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
