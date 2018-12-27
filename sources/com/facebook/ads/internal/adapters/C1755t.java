package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.C0396d;
import com.facebook.ads.C1700b;

/* renamed from: com.facebook.ads.internal.adapters.t */
public class C1755t extends BroadcastReceiver {
    /* renamed from: a */
    private String f5295a;
    /* renamed from: b */
    private Context f5296b;
    /* renamed from: c */
    private C1743e f5297c;
    /* renamed from: d */
    private C3768d f5298d;

    public C1755t(Context context, String str, C3768d c3768d, C1743e c1743e) {
        this.f5296b = context;
        this.f5295a = str;
        this.f5297c = c1743e;
        this.f5298d = c3768d;
    }

    /* renamed from: a */
    public void m6642a() {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.impression.logged:");
        stringBuilder.append(this.f5295a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.displayed:");
        stringBuilder.append(this.f5295a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.dismissed:");
        stringBuilder.append(this.f5295a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.clicked:");
        stringBuilder.append(this.f5295a);
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.error:");
        stringBuilder.append(this.f5295a);
        intentFilter.addAction(stringBuilder.toString());
        C0396d.m1465a(this.f5296b).m1469a(this, intentFilter);
    }

    /* renamed from: b */
    public void m6643b() {
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
        r1 = this;
        r0 = r1.f5296b;	 Catch:{ Exception -> 0x0009 }
        r0 = android.support.v4.content.C0396d.m1465a(r0);	 Catch:{ Exception -> 0x0009 }
        r0.m1468a(r1);	 Catch:{ Exception -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.t.b():void");
    }

    public void onReceive(Context context, Intent intent) {
        Object obj = intent.getAction().split(":")[0];
        if (this.f5297c == null) {
            return;
        }
        if (obj != null) {
            if ("com.facebook.ads.interstitial.clicked".equals(obj)) {
                this.f5297c.mo1314a(this.f5298d, null, true);
            } else if ("com.facebook.ads.interstitial.dismissed".equals(obj)) {
                this.f5297c.mo1317d(this.f5298d);
            } else if ("com.facebook.ads.interstitial.displayed".equals(obj)) {
                this.f5297c.mo1316c(this.f5298d);
            } else if ("com.facebook.ads.interstitial.impression.logged".equals(obj)) {
                this.f5297c.mo1315b(this.f5298d);
            } else if ("com.facebook.ads.interstitial.error".equals(obj)) {
                this.f5297c.mo1313a(this.f5298d, C1700b.f5123e);
            }
        }
    }
}
