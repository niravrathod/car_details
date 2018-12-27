package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.C0396d;
import com.facebook.ads.internal.view.C4662j;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3871f;
import com.facebook.ads.internal.view.p116f.p118b.C3872g;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3881p;
import java.io.Serializable;

public class ae extends BroadcastReceiver {
    /* renamed from: a */
    private Context f5254a;
    /* renamed from: b */
    private C4662j f5255b;
    /* renamed from: c */
    private boolean f5256c = false;

    public ae(C4662j c4662j, Context context) {
        this.f5255b = c4662j;
        this.f5254a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m6588a() {
        IntentFilter intentFilter = new IntentFilter();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.facebook.ads.interstitial.displayed:");
        stringBuilder.append(this.f5255b.getUniqueId());
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("videoInterstitalEvent:");
        stringBuilder.append(this.f5255b.getUniqueId());
        intentFilter.addAction(stringBuilder.toString());
        stringBuilder = new StringBuilder();
        stringBuilder.append("performCtaClick:");
        stringBuilder.append(this.f5255b.getUniqueId());
        intentFilter.addAction(stringBuilder.toString());
        C0396d.m1465a(this.f5254a).m1469a(this, intentFilter);
    }

    /* renamed from: b */
    public void m6589b() {
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
        r0 = r1.f5254a;	 Catch:{ Exception -> 0x0009 }
        r0 = android.support.v4.content.C0396d.m1465a(r0);	 Catch:{ Exception -> 0x0009 }
        r0.m1468a(r1);	 Catch:{ Exception -> 0x0009 }
    L_0x0009:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.ae.b():void");
    }

    public void onReceive(Context context, Intent intent) {
        String[] split = intent.getAction().split(":");
        if (split.length == 2 && split[1].equals(this.f5255b.getUniqueId())) {
            if (split[0].equals("com.facebook.ads.interstitial.displayed")) {
                if (this.f5255b.getListener() != null) {
                    this.f5255b.getListener().mo1294g();
                    this.f5255b.getListener().mo1288a();
                }
            } else if (split[0].equals("videoInterstitalEvent")) {
                Serializable serializableExtra = intent.getSerializableExtra("event");
                if (serializableExtra instanceof C3881p) {
                    if (this.f5255b.getListener() != null) {
                        this.f5255b.getListener().mo1293f();
                        this.f5255b.getListener().mo1288a();
                    }
                    if (this.f5256c) {
                        this.f5255b.m19253a(1);
                    } else {
                        this.f5255b.m19253a(((C3881p) serializableExtra).m19306b());
                    }
                    this.f5255b.setVisibility(0);
                    this.f5255b.m19255a(C2038a.USER_STARTED);
                } else if (serializableExtra instanceof C3871f) {
                    if (this.f5255b.getListener() != null) {
                        this.f5255b.getListener().mo1291d();
                    }
                } else if (serializableExtra instanceof C3872g) {
                    if (this.f5255b.getListener() != null) {
                        this.f5255b.getListener().mo1292e();
                    }
                } else if (serializableExtra instanceof C3867b) {
                    if (this.f5255b.getListener() != null) {
                        this.f5255b.getListener().mo1295h();
                    }
                    this.f5256c = true;
                } else if (serializableExtra instanceof C3875j) {
                    if (this.f5255b.getListener() != null) {
                        this.f5255b.getListener().mo1290c();
                    }
                    this.f5256c = false;
                } else if ((serializableExtra instanceof C3873h) && this.f5255b.getListener() != null) {
                    this.f5255b.getListener().mo1289b();
                }
            } else if (split[0].equals("performCtaClick")) {
                this.f5255b.mo3992s();
            }
        }
    }
}
