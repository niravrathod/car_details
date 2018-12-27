package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzakw {
    @VisibleForTesting
    /* renamed from: a */
    int f8851a = -1;
    @VisibleForTesting
    /* renamed from: b */
    private long f8852b = -1;
    @VisibleForTesting
    /* renamed from: c */
    private long f8853c = -1;
    @GuardedBy("mLock")
    @VisibleForTesting
    /* renamed from: d */
    private int f8854d = -1;
    @VisibleForTesting
    /* renamed from: e */
    private long f8855e = 0;
    /* renamed from: f */
    private final Object f8856f = new Object();
    @VisibleForTesting
    /* renamed from: g */
    private final String f8857g;
    /* renamed from: h */
    private final zzali f8858h;
    @GuardedBy("mLock")
    @VisibleForTesting
    /* renamed from: i */
    private int f8859i = 0;
    @GuardedBy("mLock")
    @VisibleForTesting
    /* renamed from: j */
    private int f8860j = 0;

    public zzakw(String str, zzali zzali) {
        this.f8857g = str;
        this.f8858h = zzali;
    }

    /* renamed from: a */
    public final void m9733a() {
        synchronized (this.f8856f) {
            this.f8859i++;
        }
    }

    /* renamed from: b */
    public final void m9735b() {
        synchronized (this.f8856f) {
            this.f8860j++;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m9734a(com.google.android.gms.internal.ads.zzjk r11, long r12) {
        /*
        r10 = this;
        r0 = r10.f8856f;
        monitor-enter(r0);
        r1 = r10.f8858h;	 Catch:{ all -> 0x007c }
        r1 = r1.mo2357i();	 Catch:{ all -> 0x007c }
        r3 = com.google.android.gms.ads.internal.zzbv.zzer();	 Catch:{ all -> 0x007c }
        r3 = r3.currentTimeMillis();	 Catch:{ all -> 0x007c }
        r5 = r10.f8853c;	 Catch:{ all -> 0x007c }
        r7 = -1;
        r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x0042;
    L_0x0019:
        r1 = r3 - r1;
        r5 = com.google.android.gms.internal.ads.zznw.au;	 Catch:{ all -> 0x007c }
        r6 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ all -> 0x007c }
        r5 = r6.m10897a(r5);	 Catch:{ all -> 0x007c }
        r5 = (java.lang.Long) r5;	 Catch:{ all -> 0x007c }
        r5 = r5.longValue();	 Catch:{ all -> 0x007c }
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 <= 0) goto L_0x0033;
    L_0x002f:
        r1 = -1;
        r10.f8851a = r1;	 Catch:{ all -> 0x007c }
        goto L_0x003b;
    L_0x0033:
        r1 = r10.f8858h;	 Catch:{ all -> 0x007c }
        r1 = r1.mo2358j();	 Catch:{ all -> 0x007c }
        r10.f8851a = r1;	 Catch:{ all -> 0x007c }
    L_0x003b:
        r10.f8853c = r12;	 Catch:{ all -> 0x007c }
        r12 = r10.f8853c;	 Catch:{ all -> 0x007c }
        r10.f8852b = r12;	 Catch:{ all -> 0x007c }
        goto L_0x0044;
    L_0x0042:
        r10.f8852b = r12;	 Catch:{ all -> 0x007c }
    L_0x0044:
        r12 = 1;
        if (r11 == 0) goto L_0x0058;
    L_0x0047:
        r13 = r11.f20208c;	 Catch:{ all -> 0x007c }
        if (r13 == 0) goto L_0x0058;
    L_0x004b:
        r11 = r11.f20208c;	 Catch:{ all -> 0x007c }
        r13 = "gw";
        r1 = 2;
        r11 = r11.getInt(r13, r1);	 Catch:{ all -> 0x007c }
        if (r11 != r12) goto L_0x0058;
    L_0x0056:
        monitor-exit(r0);	 Catch:{ all -> 0x007c }
        return;
    L_0x0058:
        r11 = r10.f8854d;	 Catch:{ all -> 0x007c }
        r11 = r11 + r12;
        r10.f8854d = r11;	 Catch:{ all -> 0x007c }
        r11 = r10.f8851a;	 Catch:{ all -> 0x007c }
        r11 = r11 + r12;
        r10.f8851a = r11;	 Catch:{ all -> 0x007c }
        r11 = r10.f8851a;	 Catch:{ all -> 0x007c }
        if (r11 != 0) goto L_0x0070;
    L_0x0066:
        r11 = 0;
        r10.f8855e = r11;	 Catch:{ all -> 0x007c }
        r11 = r10.f8858h;	 Catch:{ all -> 0x007c }
        r11.mo2341b(r3);	 Catch:{ all -> 0x007c }
        goto L_0x007a;
    L_0x0070:
        r11 = r10.f8858h;	 Catch:{ all -> 0x007c }
        r11 = r11.mo2359k();	 Catch:{ all -> 0x007c }
        r13 = 0;
        r3 = r3 - r11;
        r10.f8855e = r3;	 Catch:{ all -> 0x007c }
    L_0x007a:
        monitor-exit(r0);	 Catch:{ all -> 0x007c }
        return;
    L_0x007c:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007c }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.a(com.google.android.gms.internal.ads.zzjk, long):void");
    }

    /* renamed from: a */
    public final Bundle m9732a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f8856f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f8857g);
            bundle.putLong("basets", this.f8853c);
            bundle.putLong("currts", this.f8852b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f8854d);
            bundle.putInt("preqs_in_session", this.f8851a);
            bundle.putLong("time_in_session", this.f8855e);
            bundle.putInt("pclick", this.f8859i);
            bundle.putInt("pimp", this.f8860j);
            bundle.putBoolean("support_transparent_background", m9731a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    private static boolean m9731a(android.content.Context r5) {
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
        r0 = r5.getResources();
        r1 = "Theme.Translucent";
        r2 = "style";
        r3 = "android";
        r0 = r0.getIdentifier(r1, r2, r3);
        r1 = 0;
        if (r0 != 0) goto L_0x0017;
    L_0x0011:
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        com.google.android.gms.internal.ads.zzaok.m10005d(r5);
        return r1;
    L_0x0017:
        r2 = new android.content.ComponentName;
        r3 = r5.getPackageName();
        r4 = "com.google.android.gms.ads.AdActivity";
        r2.<init>(r3, r4);
        r5 = r5.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0036 }
        r5 = r5.getActivityInfo(r2, r1);	 Catch:{ NameNotFoundException -> 0x0036 }
        r5 = r5.theme;	 Catch:{ NameNotFoundException -> 0x0036 }
        if (r0 != r5) goto L_0x0030;	 Catch:{ NameNotFoundException -> 0x0036 }
    L_0x002e:
        r5 = 1;	 Catch:{ NameNotFoundException -> 0x0036 }
        return r5;	 Catch:{ NameNotFoundException -> 0x0036 }
    L_0x0030:
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";	 Catch:{ NameNotFoundException -> 0x0036 }
        com.google.android.gms.internal.ads.zzaok.m10005d(r5);	 Catch:{ NameNotFoundException -> 0x0036 }
        return r1;
    L_0x0036:
        r5 = "Fail to fetch AdActivity theme";
        com.google.android.gms.internal.ads.zzaok.m10007e(r5);
        r5 = "Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.";
        com.google.android.gms.internal.ads.zzaok.m10005d(r5);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakw.a(android.content.Context):boolean");
    }
}
