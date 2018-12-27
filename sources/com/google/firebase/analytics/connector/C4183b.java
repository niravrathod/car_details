package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzak;
import com.google.android.gms.measurement.internal.zzbt;
import com.google.firebase.C2560a;
import com.google.firebase.C2572b;
import com.google.firebase.analytics.connector.internal.C2563b;
import com.google.firebase.p137b.C2568a;
import com.google.firebase.p137b.C2571d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.connector.b */
public class C4183b implements C2561a {
    /* renamed from: b */
    private static volatile C2561a f17703b;
    @VisibleForTesting
    /* renamed from: a */
    final Map<String, Object> f17704a = new ConcurrentHashMap();
    @VisibleForTesting
    /* renamed from: c */
    private final AppMeasurement f17705c;

    private C4183b(AppMeasurement appMeasurement) {
        Preconditions.checkNotNull(appMeasurement);
        this.f17705c = appMeasurement;
    }

    @KeepForSdk
    /* renamed from: a */
    public static C2561a m23022a(C2572b c2572b, Context context, C2571d c2571d) {
        Preconditions.checkNotNull(c2572b);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(c2571d);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f17703b == null) {
            synchronized (C4183b.class) {
                if (f17703b == null) {
                    Bundle bundle = new Bundle(1);
                    if (c2572b.m12612f()) {
                        c2571d.mo3315a(C2560a.class, C2562c.f10910a, C4184d.f17706a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", c2572b.m12611e());
                    }
                    f17703b = new C4183b(zzbt.m22702a(context, zzak.m12353a(bundle)).m22728i());
                }
            }
        }
        return f17703b;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo3307a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C2563b.m12582a(str) && C2563b.m12583a(str2, bundle) && C2563b.m12585a(str, str2, bundle)) {
            this.f17705c.logEventInternal(str, str2, bundle);
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo3308a(String str, String str2, Object obj) {
        if (C2563b.m12582a(str) && C2563b.m12584a(str, str2)) {
            this.f17705c.m12215a(str, str2, obj);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m23023a(C2568a c2568a) {
        c2568a = ((C2560a) c2568a.m12589b()).f10906a;
        synchronized (C4183b.class) {
            ((C4183b) f17703b).f17705c.m12216a(c2568a);
        }
    }
}
