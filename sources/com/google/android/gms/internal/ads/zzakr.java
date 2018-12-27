package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzakr {
    /* renamed from: a */
    private final Object f8837a = new Object();
    /* renamed from: b */
    private zzev f8838b;
    /* renamed from: c */
    private final zzalj f8839c = new zzalj();
    /* renamed from: d */
    private final zzala f8840d = new zzala(zzkd.m10714f(), this.f8839c);
    /* renamed from: e */
    private boolean f8841e = false;
    /* renamed from: f */
    private Context f8842f;
    /* renamed from: g */
    private zzaop f8843g;
    @Nullable
    /* renamed from: h */
    private zznz f8844h = null;
    @Nullable
    /* renamed from: i */
    private Boolean f8845i = null;
    /* renamed from: j */
    private String f8846j;
    /* renamed from: k */
    private final AtomicInteger f8847k = new AtomicInteger(0);
    /* renamed from: l */
    private final cu f8848l = new cu();
    /* renamed from: m */
    private final Object f8849m = new Object();
    /* renamed from: n */
    private zzapi<ArrayList<String>> f8850n;

    @Nullable
    /* renamed from: a */
    public final zznz m9711a() {
        zznz zznz;
        synchronized (this.f8837a) {
            zznz = this.f8844h;
        }
        return zznz;
    }

    /* renamed from: a */
    public final void m9713a(Boolean bool) {
        synchronized (this.f8837a) {
            this.f8845i = bool;
        }
    }

    /* renamed from: b */
    public final Boolean m9716b() {
        Boolean bool;
        synchronized (this.f8837a) {
            bool = this.f8845i;
        }
        return bool;
    }

    /* renamed from: a */
    public final void m9715a(boolean z) {
        this.f8848l.m8914a(z);
    }

    /* renamed from: c */
    public final boolean m9718c() {
        return this.f8848l.m8915a();
    }

    /* renamed from: d */
    public final boolean m9719d() {
        return this.f8848l.m8916b();
    }

    /* renamed from: e */
    public final void m9720e() {
        this.f8848l.m8917c();
    }

    @TargetApi(23)
    /* renamed from: a */
    public final void m9712a(Context context, zzaop zzaop) {
        synchronized (this.f8837a) {
            if (!this.f8841e) {
                this.f8842f = context.getApplicationContext();
                this.f8843g = zzaop;
                zzbv.zzen().m10632a(this.f8840d);
                zznz zznz = null;
                this.f8839c.m21233a(this.f8842f, null, true);
                zzael.m21107a(this.f8842f, this.f8843g);
                this.f8846j = zzbv.zzek().m9840b(context, zzaop.f19893a);
                this.f8838b = new zzev(context.getApplicationContext(), this.f8843g);
                zzbv.zzet();
                if (((Boolean) zzkd.m10713e().m10897a(zznw.f9685J)).booleanValue() == null) {
                    zzalg.m21225a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zznz = new zznz();
                }
                this.f8844h = zznz;
                if (this.f8844h != null) {
                    zzaov.m10017a((zzapi) new ct(this).mo2219c(), "AppState.registerCsiReporter");
                }
                this.f8841e = true;
                m9728m();
            }
        }
    }

    /* renamed from: f */
    public final zzev m9721f() {
        return this.f8838b;
    }

    @Nullable
    /* renamed from: g */
    public final Resources m9722g() {
        if (this.f8843g.f19896d) {
            return this.f8842f.getResources();
        }
        try {
            zzaol.m10009a(this.f8842f).getResources();
            return null;
        } catch (Throwable e) {
            zzaok.m10004c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void m9714a(Throwable th, String str) {
        zzael.m21107a(this.f8842f, this.f8843g).mo2229a(th, str);
    }

    /* renamed from: b */
    public final void m9717b(Throwable th, String str) {
        zzael.m21107a(this.f8842f, this.f8843g).mo2230a(th, str, ((Float) zzkd.m10713e().m10897a(zznw.f9708f)).floatValue());
    }

    /* renamed from: h */
    public final void m9723h() {
        this.f8847k.incrementAndGet();
    }

    /* renamed from: i */
    public final void m9724i() {
        this.f8847k.decrementAndGet();
    }

    /* renamed from: j */
    public final int m9725j() {
        return this.f8847k.get();
    }

    @Deprecated
    /* renamed from: k */
    public final zzali m9726k() {
        zzali zzali;
        synchronized (this.f8837a) {
            zzali = this.f8839c;
        }
        return zzali;
    }

    @Nullable
    /* renamed from: l */
    public final Context m9727l() {
        return this.f8842f;
    }

    /* renamed from: m */
    public final zzapi<ArrayList<String>> m9728m() {
        if (PlatformVersion.isAtLeastJellyBean() && this.f8842f != null) {
            if (!((Boolean) zzkd.m10713e().m10897a(zznw.bi)).booleanValue()) {
                synchronized (this.f8849m) {
                    zzapi<ArrayList<String>> zzapi;
                    if (this.f8850n != null) {
                        zzapi = this.f8850n;
                        return zzapi;
                    }
                    zzapi = zzalm.m9773a(new cs(this));
                    this.f8850n = zzapi;
                    return zzapi;
                }
            }
        }
        return zzaox.m10019a(new ArrayList());
    }

    @android.annotation.TargetApi(16)
    /* renamed from: a */
    private static java.util.ArrayList<java.lang.String> m9707a(android.content.Context r3) {
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
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3);	 Catch:{ NameNotFoundException -> 0x0038 }
        r3 = r3.getApplicationInfo();	 Catch:{ NameNotFoundException -> 0x0038 }
        r3 = r3.packageName;	 Catch:{ NameNotFoundException -> 0x0038 }
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;	 Catch:{ NameNotFoundException -> 0x0038 }
        r3 = r1.getPackageInfo(r3, r2);	 Catch:{ NameNotFoundException -> 0x0038 }
        r1 = r3.requestedPermissions;
        if (r1 == 0) goto L_0x0037;
    L_0x0019:
        r1 = r3.requestedPermissionsFlags;
        if (r1 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0037;
    L_0x001e:
        r1 = 0;
    L_0x001f:
        r2 = r3.requestedPermissions;
        r2 = r2.length;
        if (r1 >= r2) goto L_0x0036;
    L_0x0024:
        r2 = r3.requestedPermissionsFlags;
        r2 = r2[r1];
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x0033;
    L_0x002c:
        r2 = r3.requestedPermissions;
        r2 = r2[r1];
        r0.add(r2);
    L_0x0033:
        r1 = r1 + 1;
        goto L_0x001f;
    L_0x0036:
        return r0;
    L_0x0037:
        return r0;
    L_0x0038:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakr.a(android.content.Context):java.util.ArrayList<java.lang.String>");
    }

    /* renamed from: n */
    public final zzala m9729n() {
        return this.f8840d;
    }

    /* renamed from: o */
    final /* synthetic */ ArrayList m9730o() {
        return m9707a(zzaht.m9573a(this.f8842f));
    }
}
