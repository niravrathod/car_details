package com.google.android.gms.internal.config;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class zzn {
    /* renamed from: a */
    public static List<zzl> m11448a(Context context) {
        AppMeasurement b = m11449b(context);
        if (b == null) {
            if (Log.isLoggable("FRCAnalytics", 3)) {
                Log.d("FRCAnalytics", "Unable to get user properties: analytics library is missing.");
            }
            return null;
        }
        Map b2;
        try {
            b2 = b.m12217b(false);
        } catch (Throwable e) {
            if (Log.isLoggable("FRCAnalytics", 3)) {
                Log.d("FRCAnalytics", "Unable to get user properties.", e);
            }
            b2 = null;
        }
        if (b2 == null) {
            return null;
        }
        List<zzl> arrayList = new ArrayList();
        for (Entry entry : b2.entrySet()) {
            if (entry.getValue() != null) {
                arrayList.add(new zzl((String) entry.getKey(), entry.getValue().toString()));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static com.google.android.gms.measurement.AppMeasurement m11449b(android.content.Context r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = com.google.android.gms.measurement.AppMeasurement.getInstance(r0);	 Catch:{ NoClassDefFoundError -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.config.zzn.b(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }
}
