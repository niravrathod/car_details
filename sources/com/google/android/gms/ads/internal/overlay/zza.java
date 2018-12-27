package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalg;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;

@zzaer
public final class zza {
    public static boolean zza(android.content.Context r6, com.google.android.gms.ads.internal.overlay.zzc r7, com.google.android.gms.ads.internal.overlay.zzt r8) {
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
        r0 = 0;
        if (r7 != 0) goto L_0x0009;
    L_0x0003:
        r6 = "No intent data for launcher overlay.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r6);
        return r0;
    L_0x0009:
        com.google.android.gms.internal.ads.zznw.m10901a(r6);
        r1 = r7.intent;
        if (r1 == 0) goto L_0x0017;
    L_0x0010:
        r7 = r7.intent;
        r6 = m8801a(r6, r7, r8);
        return r6;
    L_0x0017:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = r7.url;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 == 0) goto L_0x002a;
    L_0x0024:
        r6 = "Open GMSG did not contain a URL.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r6);
        return r0;
    L_0x002a:
        r2 = r7.mimeType;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x003e;
    L_0x0032:
        r2 = r7.url;
        r2 = android.net.Uri.parse(r2);
        r3 = r7.mimeType;
        r1.setDataAndType(r2, r3);
        goto L_0x0047;
    L_0x003e:
        r2 = r7.url;
        r2 = android.net.Uri.parse(r2);
        r1.setData(r2);
    L_0x0047:
        r2 = "android.intent.action.VIEW";
        r1.setAction(r2);
        r2 = r7.packageName;
        r2 = android.text.TextUtils.isEmpty(r2);
        if (r2 != 0) goto L_0x0059;
    L_0x0054:
        r2 = r7.packageName;
        r1.setPackage(r2);
    L_0x0059:
        r2 = r7.zzcau;
        r2 = android.text.TextUtils.isEmpty(r2);
        r3 = 1;
        if (r2 != 0) goto L_0x0092;
    L_0x0062:
        r2 = r7.zzcau;
        r4 = "/";
        r5 = 2;
        r2 = r2.split(r4, r5);
        r4 = r2.length;
        if (r4 >= r5) goto L_0x008b;
    L_0x006e:
        r6 = "Could not parse component name from open GMSG: ";
        r7 = r7.zzcau;
        r7 = java.lang.String.valueOf(r7);
        r8 = r7.length();
        if (r8 == 0) goto L_0x0081;
    L_0x007c:
        r6 = r6.concat(r7);
        goto L_0x0087;
    L_0x0081:
        r7 = new java.lang.String;
        r7.<init>(r6);
        r6 = r7;
    L_0x0087:
        com.google.android.gms.internal.ads.zzaok.m10007e(r6);
        return r0;
    L_0x008b:
        r4 = r2[r0];
        r2 = r2[r3];
        r1.setClassName(r4, r2);
    L_0x0092:
        r7 = r7.zzcav;
        r2 = android.text.TextUtils.isEmpty(r7);
        if (r2 != 0) goto L_0x00a8;
    L_0x009a:
        r7 = java.lang.Integer.parseInt(r7);	 Catch:{ NumberFormatException -> 0x009f }
        goto L_0x00a5;
    L_0x009f:
        r7 = "Could not parse intent flags.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r7);
        r7 = 0;
    L_0x00a5:
        r1.addFlags(r7);
    L_0x00a8:
        r7 = com.google.android.gms.internal.ads.zznw.cd;
        r0 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r7 = r0.m10897a(r7);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x00c5;
    L_0x00ba:
        r7 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r1.addFlags(r7);
        r7 = "android.support.customtabs.extra.user_opt_out";
        r1.putExtra(r7, r3);
        goto L_0x00dd;
    L_0x00c5:
        r7 = com.google.android.gms.internal.ads.zznw.cc;
        r0 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r7 = r0.m10897a(r7);
        r7 = (java.lang.Boolean) r7;
        r7 = r7.booleanValue();
        if (r7 == 0) goto L_0x00dd;
    L_0x00d7:
        com.google.android.gms.ads.internal.zzbv.zzek();
        com.google.android.gms.internal.ads.zzalo.m9806b(r6, r1);
    L_0x00dd:
        r6 = m8801a(r6, r1, r8);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zza.zza(android.content.Context, com.google.android.gms.ads.internal.overlay.zzc, com.google.android.gms.ads.internal.overlay.zzt):boolean");
    }

    /* renamed from: a */
    private static boolean m8801a(Context context, Intent intent, zzt zzt) {
        try {
            String str = "Launching an intent: ";
            String valueOf = String.valueOf(intent.toURI());
            zzalg.m21225a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            zzbv.zzek();
            zzalo.m9789a(context, intent);
            if (zzt != null) {
                zzt.zzbl();
            }
            return true;
        } catch (Context context2) {
            zzaok.m10007e(context2.getMessage());
            return null;
        }
    }
}
