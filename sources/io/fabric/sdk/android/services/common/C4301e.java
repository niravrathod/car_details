package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: io.fabric.sdk.android.services.common.e */
class C4301e implements C2795f {
    /* renamed from: a */
    private final Context f18028a;

    /* renamed from: io.fabric.sdk.android.services.common.e$a */
    private static final class C2793a implements ServiceConnection {
        /* renamed from: a */
        private boolean f11892a;
        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f11893b;

        private C2793a() {
            this.f11892a = false;
            this.f11893b = new LinkedBlockingQueue(1);
        }

        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = this;
            r1 = r0.f11893b;	 Catch:{ InterruptedException -> 0x0005 }
            r1.put(r2);	 Catch:{ InterruptedException -> 0x0005 }
        L_0x0005:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.e.a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f11893b.clear();
        }

        /* renamed from: a */
        public android.os.IBinder m13674a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r4 = this;
            r0 = r4.f11892a;
            if (r0 == 0) goto L_0x000f;
        L_0x0004:
            r0 = io.fabric.sdk.android.C2766c.m13524h();
            r1 = "Fabric";
            r2 = "getBinder already called";
            r0.mo3561e(r1, r2);
        L_0x000f:
            r0 = 1;
            r4.f11892a = r0;
            r0 = r4.f11893b;	 Catch:{ InterruptedException -> 0x001f }
            r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ InterruptedException -> 0x001f }
            r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x001f }
            r0 = r0.poll(r1, r3);	 Catch:{ InterruptedException -> 0x001f }
            r0 = (android.os.IBinder) r0;	 Catch:{ InterruptedException -> 0x001f }
            return r0;
        L_0x001f:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.e.a.a():android.os.IBinder");
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.e$b */
    private static final class C2794b implements IInterface {
        /* renamed from: a */
        private final IBinder f11894a;

        public C2794b(IBinder iBinder) {
            this.f11894a = iBinder;
        }

        public IBinder asBinder() {
            return this.f11894a;
        }

        /* renamed from: a */
        public java.lang.String m13675a() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r5 = this;
            r0 = android.os.Parcel.obtain();
            r1 = android.os.Parcel.obtain();
            r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";	 Catch:{ Exception -> 0x0024 }
            r0.writeInterfaceToken(r2);	 Catch:{ Exception -> 0x0024 }
            r2 = r5.f11894a;	 Catch:{ Exception -> 0x0024 }
            r3 = 1;	 Catch:{ Exception -> 0x0024 }
            r4 = 0;	 Catch:{ Exception -> 0x0024 }
            r2.transact(r3, r0, r1, r4);	 Catch:{ Exception -> 0x0024 }
            r1.readException();	 Catch:{ Exception -> 0x0024 }
            r2 = r1.readString();	 Catch:{ Exception -> 0x0024 }
            r1.recycle();
            r0.recycle();
            goto L_0x0036;
        L_0x0022:
            r2 = move-exception;
            goto L_0x0037;
        L_0x0024:
            r2 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ all -> 0x0022 }
            r3 = "Fabric";	 Catch:{ all -> 0x0022 }
            r4 = "Could not get parcel from Google Play Service to capture AdvertisingId";	 Catch:{ all -> 0x0022 }
            r2.mo3554a(r3, r4);	 Catch:{ all -> 0x0022 }
            r1.recycle();
            r0.recycle();
            r2 = 0;
        L_0x0036:
            return r2;
        L_0x0037:
            r1.recycle();
            r0.recycle();
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.e.b.a():java.lang.String");
        }

        /* renamed from: b */
        public boolean m13676b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r6 = this;
            r0 = android.os.Parcel.obtain();
            r1 = android.os.Parcel.obtain();
            r2 = 0;
            r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";	 Catch:{ Exception -> 0x0025 }
            r0.writeInterfaceToken(r3);	 Catch:{ Exception -> 0x0025 }
            r3 = 1;	 Catch:{ Exception -> 0x0025 }
            r0.writeInt(r3);	 Catch:{ Exception -> 0x0025 }
            r4 = r6.f11894a;	 Catch:{ Exception -> 0x0025 }
            r5 = 2;	 Catch:{ Exception -> 0x0025 }
            r4.transact(r5, r0, r1, r2);	 Catch:{ Exception -> 0x0025 }
            r1.readException();	 Catch:{ Exception -> 0x0025 }
            r4 = r1.readInt();	 Catch:{ Exception -> 0x0025 }
            if (r4 == 0) goto L_0x0030;
        L_0x0021:
            r2 = 1;
            goto L_0x0030;
        L_0x0023:
            r2 = move-exception;
            goto L_0x0037;
        L_0x0025:
            r3 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ all -> 0x0023 }
            r4 = "Fabric";	 Catch:{ all -> 0x0023 }
            r5 = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking";	 Catch:{ all -> 0x0023 }
            r3.mo3554a(r4, r5);	 Catch:{ all -> 0x0023 }
        L_0x0030:
            r1.recycle();
            r0.recycle();
            return r2;
        L_0x0037:
            r1.recycle();
            r0.recycle();
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.e.b.b():boolean");
        }
    }

    public C4301e(Context context) {
        this.f18028a = context.getApplicationContext();
    }

    /* renamed from: a */
    public io.fabric.sdk.android.services.common.C2790b mo3579a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
        r0 = android.os.Looper.myLooper();
        r1 = android.os.Looper.getMainLooper();
        r2 = 0;
        if (r0 != r1) goto L_0x0017;
    L_0x000b:
        r0 = io.fabric.sdk.android.C2766c.m13524h();
        r1 = "Fabric";
        r3 = "AdvertisingInfoServiceStrategy cannot be called on the main thread";
        r0.mo3554a(r1, r3);
        return r2;
    L_0x0017:
        r0 = r6.f18028a;	 Catch:{ NameNotFoundException -> 0x0099, Exception -> 0x008c }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0099, Exception -> 0x008c }
        r1 = "com.android.vending";	 Catch:{ NameNotFoundException -> 0x0099, Exception -> 0x008c }
        r3 = 0;	 Catch:{ NameNotFoundException -> 0x0099, Exception -> 0x008c }
        r0.getPackageInfo(r1, r3);	 Catch:{ NameNotFoundException -> 0x0099, Exception -> 0x008c }
        r0 = new io.fabric.sdk.android.services.common.e$a;
        r0.<init>();
        r1 = new android.content.Intent;
        r3 = "com.google.android.gms.ads.identifier.service.START";
        r1.<init>(r3);
        r3 = "com.google.android.gms";
        r1.setPackage(r3);
        r3 = r6.f18028a;	 Catch:{ Throwable -> 0x007f }
        r4 = 1;	 Catch:{ Throwable -> 0x007f }
        r1 = r3.bindService(r1, r0, r4);	 Catch:{ Throwable -> 0x007f }
        if (r1 == 0) goto L_0x0073;
    L_0x003d:
        r1 = new io.fabric.sdk.android.services.common.e$b;	 Catch:{ Exception -> 0x005b }
        r3 = r0.m13674a();	 Catch:{ Exception -> 0x005b }
        r1.<init>(r3);	 Catch:{ Exception -> 0x005b }
        r3 = new io.fabric.sdk.android.services.common.b;	 Catch:{ Exception -> 0x005b }
        r4 = r1.m13675a();	 Catch:{ Exception -> 0x005b }
        r1 = r1.m13676b();	 Catch:{ Exception -> 0x005b }
        r3.<init>(r4, r1);	 Catch:{ Exception -> 0x005b }
        r1 = r6.f18028a;	 Catch:{ Throwable -> 0x007f }
        r1.unbindService(r0);	 Catch:{ Throwable -> 0x007f }
        return r3;
    L_0x0059:
        r1 = move-exception;
        goto L_0x006d;
    L_0x005b:
        r1 = move-exception;
        r3 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ all -> 0x0059 }
        r4 = "Fabric";	 Catch:{ all -> 0x0059 }
        r5 = "Exception in binding to Google Play Service to capture AdvertisingId";	 Catch:{ all -> 0x0059 }
        r3.mo3560d(r4, r5, r1);	 Catch:{ all -> 0x0059 }
        r1 = r6.f18028a;	 Catch:{ Throwable -> 0x007f }
        r1.unbindService(r0);	 Catch:{ Throwable -> 0x007f }
        goto L_0x008b;	 Catch:{ Throwable -> 0x007f }
    L_0x006d:
        r3 = r6.f18028a;	 Catch:{ Throwable -> 0x007f }
        r3.unbindService(r0);	 Catch:{ Throwable -> 0x007f }
        throw r1;	 Catch:{ Throwable -> 0x007f }
    L_0x0073:
        r0 = io.fabric.sdk.android.C2766c.m13524h();	 Catch:{ Throwable -> 0x007f }
        r1 = "Fabric";	 Catch:{ Throwable -> 0x007f }
        r3 = "Could not bind to Google Play Service to capture AdvertisingId";	 Catch:{ Throwable -> 0x007f }
        r0.mo3554a(r1, r3);	 Catch:{ Throwable -> 0x007f }
        goto L_0x008b;
    L_0x007f:
        r0 = move-exception;
        r1 = io.fabric.sdk.android.C2766c.m13524h();
        r3 = "Fabric";
        r4 = "Could not bind to Google Play Service to capture AdvertisingId";
        r1.mo3555a(r3, r4, r0);
    L_0x008b:
        return r2;
    L_0x008c:
        r0 = move-exception;
        r1 = io.fabric.sdk.android.C2766c.m13524h();
        r3 = "Fabric";
        r4 = "Unable to determine if Google Play Services is available";
        r1.mo3555a(r3, r4, r0);
        return r2;
    L_0x0099:
        r0 = io.fabric.sdk.android.C2766c.m13524h();
        r1 = "Fabric";
        r3 = "Unable to find Google Play Services package name";
        r0.mo3554a(r1, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.common.e.a():io.fabric.sdk.android.services.common.b");
    }
}
