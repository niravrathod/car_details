package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.ConditionVariable;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zznt implements OnSharedPreferenceChangeListener {
    /* renamed from: a */
    private final Object f9669a = new Object();
    /* renamed from: b */
    private final ConditionVariable f9670b = new ConditionVariable();
    /* renamed from: c */
    private volatile boolean f9671c = false;
    @VisibleForTesting
    /* renamed from: d */
    private volatile boolean f9672d = false;
    /* renamed from: e */
    private SharedPreferences f9673e = null;
    /* renamed from: f */
    private Context f9674f;
    /* renamed from: g */
    private JSONObject f9675g = new JSONObject();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m10899a(android.content.Context r5) {
        /*
        r4 = this;
        r0 = r4.f9671c;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r4.f9669a;
        monitor-enter(r0);
        r1 = r4.f9671c;	 Catch:{ all -> 0x0069 }
        if (r1 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        return;
    L_0x000e:
        r1 = r4.f9672d;	 Catch:{ all -> 0x0069 }
        r2 = 1;
        if (r1 != 0) goto L_0x0015;
    L_0x0013:
        r4.f9672d = r2;	 Catch:{ all -> 0x0069 }
    L_0x0015:
        r1 = r5.getApplicationContext();	 Catch:{ all -> 0x0069 }
        if (r1 != 0) goto L_0x001d;
    L_0x001b:
        r1 = r5;
        goto L_0x0021;
    L_0x001d:
        r1 = r5.getApplicationContext();	 Catch:{ all -> 0x0069 }
    L_0x0021:
        r4.f9674f = r1;	 Catch:{ all -> 0x0069 }
        r1 = 0;
        r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(r5);	 Catch:{ all -> 0x0060 }
        if (r3 != 0) goto L_0x0033;
    L_0x002a:
        if (r5 == 0) goto L_0x0033;
    L_0x002c:
        r3 = r5.getApplicationContext();	 Catch:{ all -> 0x0060 }
        if (r3 != 0) goto L_0x0033;
    L_0x0032:
        r3 = r5;
    L_0x0033:
        if (r3 != 0) goto L_0x003e;
    L_0x0035:
        r4.f9672d = r1;	 Catch:{ all -> 0x0069 }
        r5 = r4.f9670b;	 Catch:{ all -> 0x0069 }
        r5.open();	 Catch:{ all -> 0x0069 }
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        return;
    L_0x003e:
        com.google.android.gms.internal.ads.zzkd.m10711c();	 Catch:{ all -> 0x0060 }
        r5 = "google_ads_flags";
        r5 = r3.getSharedPreferences(r5, r1);	 Catch:{ all -> 0x0060 }
        r4.f9673e = r5;	 Catch:{ all -> 0x0060 }
        r5 = r4.f9673e;	 Catch:{ all -> 0x0060 }
        if (r5 == 0) goto L_0x0052;
    L_0x004d:
        r5 = r4.f9673e;	 Catch:{ all -> 0x0060 }
        r5.registerOnSharedPreferenceChangeListener(r4);	 Catch:{ all -> 0x0060 }
    L_0x0052:
        r4.m10896b();	 Catch:{ all -> 0x0060 }
        r4.f9671c = r2;	 Catch:{ all -> 0x0060 }
        r4.f9672d = r1;	 Catch:{ all -> 0x0069 }
        r5 = r4.f9670b;	 Catch:{ all -> 0x0069 }
        r5.open();	 Catch:{ all -> 0x0069 }
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        return;
    L_0x0060:
        r5 = move-exception;
        r4.f9672d = r1;	 Catch:{ all -> 0x0069 }
        r1 = r4.f9670b;	 Catch:{ all -> 0x0069 }
        r1.open();	 Catch:{ all -> 0x0069 }
        throw r5;	 Catch:{ all -> 0x0069 }
    L_0x0069:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0069 }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznt.a(android.content.Context):void");
    }

    /* renamed from: a */
    public final <T> T m10897a(zznl<T> zznl) {
        if (!this.f9670b.block(5000)) {
            synchronized (this.f9669a) {
                if (this.f9672d) {
                } else {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f9671c || this.f9673e == null) {
            synchronized (this.f9669a) {
                if (this.f9671c) {
                    if (this.f9673e == null) {
                    }
                }
                zznl = zznl.m10887b();
                return zznl;
            }
        }
        if (zznl.m10888c() == 1 && this.f9675g.has(zznl.m10885a())) {
            return zznl.mo2170a(this.f9675g);
        }
        return zzanr.m9933a(this.f9674f, new sl(this, zznl));
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str) != null) {
            m10896b();
        }
    }

    /* renamed from: b */
    private final void m10896b() {
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
        r2 = this;
        r0 = r2.f9673e;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r2.f9674f;	 Catch:{ JSONException -> 0x001a }
        r1 = new com.google.android.gms.internal.ads.sk;	 Catch:{ JSONException -> 0x001a }
        r1.<init>(r2);	 Catch:{ JSONException -> 0x001a }
        r0 = com.google.android.gms.internal.ads.zzanr.m9933a(r0, r1);	 Catch:{ JSONException -> 0x001a }
        r0 = (java.lang.String) r0;	 Catch:{ JSONException -> 0x001a }
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x001a }
        r1.<init>(r0);	 Catch:{ JSONException -> 0x001a }
        r2.f9675g = r1;	 Catch:{ JSONException -> 0x001a }
        return;
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zznt.b():void");
    }

    /* renamed from: a */
    final /* synthetic */ String m10898a() {
        return this.f9673e.getString("flag_configuration", "{}");
    }
}
