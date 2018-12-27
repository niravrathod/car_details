package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import javax.annotation.Nonnull;

abstract class rw<T> {
    /* renamed from: a */
    private static final zzlf f8367a = m9368c();

    rw() {
    }

    @Nonnull
    /* renamed from: a */
    protected abstract T mo2166a();

    /* renamed from: a */
    protected abstract T mo2167a(zzlf zzlf);

    /* renamed from: b */
    protected abstract T mo2168b();

    /* renamed from: c */
    private static com.google.android.gms.internal.ads.zzlf m9368c() {
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
        r1 = com.google.android.gms.internal.ads.zzjs.class;	 Catch:{ Exception -> 0x0022 }
        r1 = r1.getClassLoader();	 Catch:{ Exception -> 0x0022 }
        r2 = "com.google.android.gms.ads.internal.ClientApi";	 Catch:{ Exception -> 0x0022 }
        r1 = r1.loadClass(r2);	 Catch:{ Exception -> 0x0022 }
        r1 = r1.newInstance();	 Catch:{ Exception -> 0x0022 }
        r2 = r1 instanceof android.os.IBinder;	 Catch:{ Exception -> 0x0022 }
        if (r2 != 0) goto L_0x001b;	 Catch:{ Exception -> 0x0022 }
    L_0x0015:
        r1 = "ClientApi class is not an instance of IBinder.";	 Catch:{ Exception -> 0x0022 }
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);	 Catch:{ Exception -> 0x0022 }
        return r0;	 Catch:{ Exception -> 0x0022 }
    L_0x001b:
        r1 = (android.os.IBinder) r1;	 Catch:{ Exception -> 0x0022 }
        r1 = com.google.android.gms.internal.ads.zzlg.asInterface(r1);	 Catch:{ Exception -> 0x0022 }
        return r1;
    L_0x0022:
        r1 = "Failed to instantiate ClientApi class.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rw.c():com.google.android.gms.internal.ads.zzlf");
    }

    /* renamed from: d */
    private final T m9369d() {
        if (f8367a == null) {
            zzaok.m10007e("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return mo2167a(f8367a);
        } catch (Throwable e) {
            zzaok.m10004c("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    /* renamed from: e */
    private final T m9370e() {
        try {
            return mo2168b();
        } catch (Throwable e) {
            zzaok.m10004c("Cannot invoke remote loader.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final T m9372a(Context context, boolean z) {
        Object obj = 1;
        if (!z) {
            zzkd.m10709a();
            if (!zzaoa.m9969c(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzaok.m10001b("Google Play Services is not available.");
                z = true;
            }
        }
        if (DynamiteModule.m8883a(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.m8890b(context, ModuleDescriptor.MODULE_ID)) {
            z = true;
        }
        zznw.m10901a(context);
        if (((Boolean) zzkd.m10713e().m10897a(zznw.cw)).booleanValue()) {
            z = false;
        }
        if (z) {
            context = m9369d();
            if (context == null) {
                context = m9370e();
            }
        } else {
            z = m9370e();
            int i = !z ? 1 : 0;
            if (i != 0) {
                if (zzkd.m10716h().nextInt(((Integer) zzkd.m10713e().m10897a(zznw.cM)).intValue()) != 0) {
                    obj = null;
                }
                if (obj != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzkd.m10709a().m9973a(context, zzkd.m10715g().f19893a, "gmob-apps", bundle, true);
                }
            }
            context = !z ? m9369d() : z;
        }
        return context == null ? mo2166a() : context;
    }
}
