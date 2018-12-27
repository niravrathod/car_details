package com.facebook.ads.internal.p084c;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.facebook.ads.internal.p084c.C1772c.C1771a;
import com.facebook.ads.internal.p101q.p102a.C1907b;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.c.a */
public class C1769a {
    /* renamed from: a */
    public static final String f5340a = "a";
    /* renamed from: b */
    private final String f5341b;
    /* renamed from: c */
    private final boolean f5342c;
    /* renamed from: d */
    private final C1768c f5343d;

    /* renamed from: com.facebook.ads.internal.c.a$a */
    private static final class C1766a implements IInterface {
        /* renamed from: a */
        private IBinder f5331a;

        C1766a(IBinder iBinder) {
            this.f5331a = iBinder;
        }

        /* renamed from: a */
        public String m6663a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f5331a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f5331a;
        }

        /* renamed from: b */
        public boolean m6664b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f5331a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                obtain2.recycle();
                obtain.recycle();
                return z;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.c.a$b */
    private static final class C1767b implements ServiceConnection {
        /* renamed from: a */
        private AtomicBoolean f5332a;
        /* renamed from: b */
        private final BlockingQueue<IBinder> f5333b;

        private C1767b() {
            this.f5332a = new AtomicBoolean(false);
            this.f5333b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder m6665a() {
            if (!this.f5332a.compareAndSet(true, true)) {
                return (IBinder) this.f5333b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = this;
            r1 = r0.f5333b;	 Catch:{ InterruptedException -> 0x0005 }
            r1.put(r2);	 Catch:{ InterruptedException -> 0x0005 }
        L_0x0005:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.a.b.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.facebook.ads.internal.c.a$c */
    public enum C1768c {
        SHARED_PREFS,
        FB4A,
        DIRECT,
        REFLECTION,
        SERVICE
    }

    private C1769a(String str, boolean z, C1768c c1768c) {
        this.f5341b = str;
        this.f5342c = z;
        this.f5343d = c1768c;
    }

    /* renamed from: a */
    private static com.facebook.ads.internal.p084c.C1769a m6666a(android.content.Context r3) {
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
        r3 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r3);	 Catch:{ Throwable -> 0x0016 }
        if (r3 == 0) goto L_0x0016;	 Catch:{ Throwable -> 0x0016 }
    L_0x0006:
        r0 = new com.facebook.ads.internal.c.a;	 Catch:{ Throwable -> 0x0016 }
        r1 = r3.getId();	 Catch:{ Throwable -> 0x0016 }
        r3 = r3.isLimitAdTrackingEnabled();	 Catch:{ Throwable -> 0x0016 }
        r2 = com.facebook.ads.internal.p084c.C1769a.C1768c.DIRECT;	 Catch:{ Throwable -> 0x0016 }
        r0.<init>(r1, r3, r2);	 Catch:{ Throwable -> 0x0016 }
        return r0;
    L_0x0016:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.a.a(android.content.Context):com.facebook.ads.internal.c.a");
    }

    /* renamed from: a */
    public static C1769a m6667a(Context context, C1771a c1771a) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot get advertising info on main thread.");
        } else if (C1907b.m7252a() && C1907b.m7253b("idfa_override")) {
            return new C1769a(C1907b.m7251a("idfa_override"), false, C1768c.DIRECT);
        } else {
            if (c1771a != null && !TextUtils.isEmpty(c1771a.f5349b)) {
                return new C1769a(c1771a.f5349b, c1771a.f5350c, C1768c.FB4A);
            }
            C1769a a = C1769a.m6666a(context);
            if (a == null || TextUtils.isEmpty(a.m6670a())) {
                a = C1769a.m6668b(context);
            }
            if (a == null || TextUtils.isEmpty(a.m6670a())) {
                a = C1769a.m6669c(context);
            }
            return a;
        }
    }

    /* renamed from: b */
    private static C1769a m6668b(Context context) {
        Method a = C1773d.m6677a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        C1769a c1769a = null;
        if (a == null) {
            return null;
        }
        Object a2 = C1773d.m6675a(null, a, context);
        if (a2 != null) {
            if (((Integer) a2).intValue() == 0) {
                a = C1773d.m6677a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (a == null) {
                    return null;
                }
                Object a3 = C1773d.m6675a(null, a, context);
                if (a3 == null) {
                    return null;
                }
                a = C1773d.m6676a(a3.getClass(), "getId", new Class[0]);
                Method a4 = C1773d.m6676a(a3.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (a != null) {
                    if (a4 != null) {
                        c1769a = new C1769a((String) C1773d.m6675a(a3, a, new Object[0]), ((Boolean) C1773d.m6675a(a3, a4, new Object[0])).booleanValue(), C1768c.REFLECTION);
                    }
                }
            }
        }
        return c1769a;
    }

    /* renamed from: c */
    private static com.facebook.ads.internal.p084c.C1769a m6669c(android.content.Context r6) {
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
        r0 = new com.facebook.ads.internal.c.a$b;
        r1 = 0;
        r0.<init>();
        r2 = new android.content.Intent;
        r3 = "com.google.android.gms.ads.identifier.service.START";
        r2.<init>(r3);
        r3 = "com.google.android.gms";
        r2.setPackage(r3);
        r3 = 1;
        r2 = r6.bindService(r2, r0, r3);
        if (r2 == 0) goto L_0x003d;
    L_0x0019:
        r2 = new com.facebook.ads.internal.c.a$a;	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r3 = r0.m6665a();	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r3 = new com.facebook.ads.internal.c.a;	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r4 = r2.m6663a();	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r2 = r2.m6664b();	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r5 = com.facebook.ads.internal.p084c.C1769a.C1768c.SERVICE;	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r3.<init>(r4, r2, r5);	 Catch:{ Exception -> 0x003a, all -> 0x0035 }
        r6.unbindService(r0);
        return r3;
    L_0x0035:
        r1 = move-exception;
        r6.unbindService(r0);
        throw r1;
    L_0x003a:
        r6.unbindService(r0);
    L_0x003d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.c.a.c(android.content.Context):com.facebook.ads.internal.c.a");
    }

    /* renamed from: a */
    public String m6670a() {
        return this.f5341b;
    }

    /* renamed from: b */
    public boolean m6671b() {
        return this.f5342c;
    }

    /* renamed from: c */
    public C1768c m6672c() {
        return this.f5343d;
    }
}
