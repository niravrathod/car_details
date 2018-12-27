package com.facebook.ads.internal.p092k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;

/* renamed from: com.facebook.ads.internal.k.a */
public class C1819a {
    /* renamed from: a */
    private final Context f5501a;
    /* renamed from: b */
    private final String f5502b;
    /* renamed from: c */
    private final String f5503c;
    /* renamed from: d */
    private boolean f5504d = false;
    /* renamed from: e */
    private Messenger f5505e;
    /* renamed from: f */
    private final ServiceConnection f5506f = new C18181(this);

    /* renamed from: com.facebook.ads.internal.k.a$1 */
    class C18181 implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ C1819a f5500a;

        C18181(C1819a c1819a) {
            this.f5500a = c1819a;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f5500a.f5504d = true;
            this.f5500a.f5505e = new Messenger(iBinder);
            Message obtain = Message.obtain(null, 1);
            obtain.setData(this.f5500a.m6840b());
            try {
                this.f5500a.f5505e.send(obtain);
            } catch (Exception e) {
                C1953a.m7382a(this.f5500a.f5501a, "generic", C1954b.f5999m, e);
            }
            this.f5500a.f5501a.unbindService(this);
        }

        public void onServiceDisconnected(android.content.ComponentName r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r2 = r1.f5500a;	 Catch:{ IllegalArgumentException -> 0x0009 }
            r2 = r2.f5501a;	 Catch:{ IllegalArgumentException -> 0x0009 }
            r2.unbindService(r1);	 Catch:{ IllegalArgumentException -> 0x0009 }
        L_0x0009:
            r2 = r1.f5500a;
            r0 = 0;
            r2.f5505e = r0;
            r2 = r1.f5500a;
            r0 = 0;
            r2.f5504d = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.k.a.1.onServiceDisconnected(android.content.ComponentName):void");
        }
    }

    public C1819a(Context context, String str, String str2) {
        this.f5501a = context;
        this.f5502b = str;
        this.f5503c = str2;
    }

    /* renamed from: b */
    private Bundle m6840b() {
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_PROTOCOL_VERSION", 1);
        bundle.putString("PARAM_AN_UUID", this.f5503c);
        bundle.putString("PARAM_REQUEST_ID", this.f5502b);
        return bundle;
    }

    /* renamed from: a */
    public void m6843a() {
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.audiencenetwork.AudienceNetworkService");
        try {
            if (!this.f5501a.bindService(intent, this.f5506f, 1)) {
                this.f5501a.unbindService(this.f5506f);
            }
        } catch (Exception e) {
            C1953a.m7382a(this.f5501a, "generic", C1954b.f6000n, e);
        }
    }
}
