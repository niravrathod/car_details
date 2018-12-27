package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.Nonnull;

@zzaer
public final class zzmn extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(@Nonnull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final void attachInfo(android.content.Context r5, android.content.pm.ProviderInfo r6) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = m10867a(r5);
        r1 = 0;
        if (r0 == 0) goto L_0x0026;
    L_0x0007:
        r2 = "com.google.android.gms.ads.APPLICATION_ID";	 Catch:{ ClassCastException -> 0x0010 }
        r2 = r0.get(r2);	 Catch:{ ClassCastException -> 0x0010 }
        r2 = (java.lang.String) r2;	 Catch:{ ClassCastException -> 0x0010 }
        goto L_0x0016;
    L_0x0010:
        r2 = "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value";
        com.google.android.gms.internal.ads.zzaok.m10003c(r2);
        r2 = r1;
    L_0x0016:
        r3 = "com.google.android.gms.ads.AD_MANAGER_APP";	 Catch:{ ClassCastException -> 0x0020 }
        r0 = r0.get(r3);	 Catch:{ ClassCastException -> 0x0020 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ ClassCastException -> 0x0020 }
        r1 = r0;
        goto L_0x0027;
    L_0x0020:
        r0 = "The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value";
        com.google.android.gms.internal.ads.zzaok.m10003c(r0);
        goto L_0x0027;
    L_0x0026:
        r2 = r1;
    L_0x0027:
        if (r1 == 0) goto L_0x002f;
    L_0x0029:
        r0 = r1.booleanValue();
        if (r0 != 0) goto L_0x0031;
    L_0x002f:
        if (r2 == 0) goto L_0x0070;
    L_0x0031:
        if (r2 == 0) goto L_0x006c;
    L_0x0033:
        r0 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$";
        r0 = r2.matches(r0);
        if (r0 == 0) goto L_0x0064;
    L_0x003b:
        r0 = "Publisher provided Google AdMob App ID in manifest: ";
        r1 = java.lang.String.valueOf(r2);
        r3 = r1.length();
        if (r3 == 0) goto L_0x004c;
    L_0x0047:
        r0 = r0.concat(r1);
        goto L_0x0052;
    L_0x004c:
        r1 = new java.lang.String;
        r1.<init>(r0);
        r0 = r1;
    L_0x0052:
        com.google.android.gms.internal.ads.zzaok.m10001b(r0);
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = "measurementEnabled";
        r3 = 0;
        r0.putBoolean(r1, r3);
        com.google.android.gms.internal.ads.zzxt.m26871a(r5, r2, r0);
        goto L_0x006c;
    L_0x0064:
        r5 = new java.lang.IllegalStateException;
        r6 = "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here: https://goo.gl/fQ2neu to *\n* find your app ID.                                                          *\n******************************************************************************\n\n";
        r5.<init>(r6);
        throw r5;
    L_0x006c:
        super.attachInfo(r5, r6);
        return;
    L_0x0070:
        r5 = new java.lang.IllegalStateException;
        r6 = "\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here: https://goo.gl/fQ2neu to add a valid  *\n* App ID inside the AndroidManifest. Google Ad Manager publishers should     *\n* follow instructions here: https://goo.gl/h17b6x.                           *\n******************************************************************************\n\n";
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmn.attachInfo(android.content.Context, android.content.pm.ProviderInfo):void");
    }

    /* renamed from: a */
    private static Bundle m10867a(Context context) {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Context context2) {
            zzaok.m10002b("Failed to load metadata: Null pointer exception", context2);
            return null;
        } catch (Context context22) {
            zzaok.m10002b("Failed to load metadata: Package name not found", context22);
            return null;
        }
    }
}
