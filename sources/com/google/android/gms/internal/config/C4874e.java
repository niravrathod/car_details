package com.google.android.gms.internal.config;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolder.Builder;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.config.e */
final class C4874e extends C4864h {
    /* renamed from: b */
    private final /* synthetic */ zzi f21693b;

    C4874e(zzo zzo, GoogleApiClient googleApiClient, zzi zzi) {
        this.f21693b = zzi;
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final void mo4994a(Context context, zzah zzah) {
        String c;
        String d;
        Throwable e;
        DataHolder dataHolder;
        zzab zzab;
        Builder buildDataHolder = DataBufferSafeParcelable.buildDataHolder();
        for (Entry entry : this.f21693b.m11430b().entrySet()) {
            DataBufferSafeParcelable.addValue(buildDataHolder, new zzz((String) entry.getKey(), (String) entry.getValue()));
        }
        DataHolder build = buildDataHolder.build(0);
        try {
            c = FirebaseInstanceId.m12658a().m12678c();
            try {
                d = FirebaseInstanceId.m12658a().m12679d();
            } catch (IllegalStateException e2) {
                e = e2;
                if (Log.isLoggable("ConfigApiImpl", 3)) {
                    Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
                }
                d = null;
                dataHolder = build;
                zzab = new zzab(context.getPackageName(), r1.f21693b.m11429a(), dataHolder, r1.f21693b.m11432d(), c, d, null, r1.f21693b.m11431c(), zzn.m11448a(context), r1.f21693b.m11433e(), r1.f21693b.m11434f());
                zzah.mo2909a(r1.a, zzab);
            }
        } catch (IllegalStateException e3) {
            e = e3;
            c = null;
            if (Log.isLoggable("ConfigApiImpl", 3)) {
                Log.d("ConfigApiImpl", "Cannot retrieve instanceId or instanceIdToken.", e);
            }
            d = null;
            dataHolder = build;
            zzab = new zzab(context.getPackageName(), r1.f21693b.m11429a(), dataHolder, r1.f21693b.m11432d(), c, d, null, r1.f21693b.m11431c(), zzn.m11448a(context), r1.f21693b.m11433e(), r1.f21693b.m11434f());
            zzah.mo2909a(r1.a, zzab);
        }
        dataHolder = build;
        zzab = new zzab(context.getPackageName(), r1.f21693b.m11429a(), dataHolder, r1.f21693b.m11432d(), c, d, null, r1.f21693b.m11431c(), zzn.m11448a(context), r1.f21693b.m11433e(), r1.f21693b.m11434f());
        try {
            zzah.mo2909a(r1.a, zzab);
        } finally {
            build.close();
        }
    }

    protected final /* synthetic */ Result createFailedResult(Status status) {
        return new zzu(status, new HashMap());
    }
}
