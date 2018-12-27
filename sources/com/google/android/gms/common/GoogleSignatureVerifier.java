package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;

@ShowFirstParty
@CheckReturnValue
@KeepForSdk
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zzal;
    private final Context mContext;
    private volatile String zzam;

    private GoogleSignatureVerifier(Context context) {
        this.mContext = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zzal == null) {
                zzc.zza(context);
                zzal = new GoogleSignatureVerifier(context);
            }
        }
        return zzal;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzm zzm;
        String[] packagesForUid = Wrappers.packageManager(this.mContext).getPackagesForUid(i);
        if (packagesForUid != null) {
            if (packagesForUid.length != 0) {
                zzm = null;
                for (String zza : packagesForUid) {
                    zzm = zza(zza, i);
                    if (zzm.zzac) {
                        break;
                    }
                }
                zzm.zzf();
                return zzm.zzac;
            }
        }
        zzm = zzm.zzb("no pkgs");
        zzm.zzf();
        return zzm.zzac;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        str = zzc(str);
        str.zzf();
        return str.zzac;
    }

    public static boolean zza(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                packageInfo = zza(packageInfo, zzh.zzx);
            } else {
                packageInfo = zza(packageInfo, zzh.zzx[0]);
            }
            if (packageInfo != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        if (zza(packageInfo, true) != null) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext) != null) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    private final com.google.android.gms.common.zzm zza(java.lang.String r3, int r4) {
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
        r2 = this;
        r0 = r2.mContext;	 Catch:{ NameNotFoundException -> 0x0011 }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x0011 }
        r1 = 64;	 Catch:{ NameNotFoundException -> 0x0011 }
        r4 = r0.zza(r3, r1, r4);	 Catch:{ NameNotFoundException -> 0x0011 }
        r4 = r2.zza(r4);	 Catch:{ NameNotFoundException -> 0x0011 }
        return r4;
        r4 = "no pkg ";
        r3 = java.lang.String.valueOf(r3);
        r0 = r3.length();
        if (r0 == 0) goto L_0x0023;
    L_0x001e:
        r3 = r4.concat(r3);
        goto L_0x0028;
    L_0x0023:
        r3 = new java.lang.String;
        r3.<init>(r4);
    L_0x0028:
        r3 = com.google.android.gms.common.zzm.zzb(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zza(java.lang.String, int):com.google.android.gms.common.zzm");
    }

    private final com.google.android.gms.common.zzm zzc(java.lang.String r3) {
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
        r2 = this;
        if (r3 != 0) goto L_0x0009;
    L_0x0002:
        r3 = "null pkg";
        r3 = com.google.android.gms.common.zzm.zzb(r3);
        return r3;
    L_0x0009:
        r0 = r2.zzam;
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0016;
    L_0x0011:
        r3 = com.google.android.gms.common.zzm.zze();
        return r3;
    L_0x0016:
        r0 = r2.mContext;	 Catch:{ NameNotFoundException -> 0x002d }
        r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0);	 Catch:{ NameNotFoundException -> 0x002d }
        r1 = 64;	 Catch:{ NameNotFoundException -> 0x002d }
        r0 = r0.getPackageInfo(r3, r1);	 Catch:{ NameNotFoundException -> 0x002d }
        r0 = r2.zza(r0);
        r1 = r0.zzac;
        if (r1 == 0) goto L_0x002c;
    L_0x002a:
        r2.zzam = r3;
    L_0x002c:
        return r0;
        r0 = "no pkg ";
        r3 = java.lang.String.valueOf(r3);
        r1 = r3.length();
        if (r1 == 0) goto L_0x003f;
    L_0x003a:
        r3 = r0.concat(r3);
        goto L_0x0044;
    L_0x003f:
        r3 = new java.lang.String;
        r3.<init>(r0);
    L_0x0044:
        r3 = com.google.android.gms.common.zzm.zzb(r3);
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zzc(java.lang.String):com.google.android.gms.common.zzm");
    }

    private final zzm zza(PackageInfo packageInfo) {
        boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
        if (packageInfo == null) {
            return zzm.zzb("null pkg");
        }
        if (packageInfo.signatures.length != 1) {
            return zzm.zzb("single cert required");
        }
        zze zzf = new zzf(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        zzm zza = zzc.zza(str, zzf, honorsDebugCertificates);
        return (!zza.zzac || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == null || (honorsDebugCertificates && zzc.zza(str, zzf, false).zzac == null)) ? zza : zzm.zzb("debuggable release cert app rejected");
    }

    private static zze zza(PackageInfo packageInfo, zze... zzeArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        int i = 0;
        zzf zzf = new zzf(packageInfo.signatures[0].toByteArray());
        while (i < zzeArr.length) {
            if (zzeArr[i].equals(zzf) != null) {
                return zzeArr[i];
            }
            i++;
        }
        return null;
    }
}
