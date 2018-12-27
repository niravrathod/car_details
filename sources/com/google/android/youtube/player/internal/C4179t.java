package com.google.android.youtube.player.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.youtube.player.C2528a;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.C2535f.C4159a;
import com.google.android.youtube.player.internal.C2554v.C2552a;
import com.google.android.youtube.player.internal.C2554v.C2553b;
import java.util.ArrayList;

/* renamed from: com.google.android.youtube.player.internal.t */
public abstract class C4179t<T extends IInterface> implements C2554v {
    /* renamed from: a */
    final Handler f17689a;
    /* renamed from: b */
    private final Context f17690b;
    /* renamed from: c */
    private T f17691c;
    /* renamed from: d */
    private ArrayList<C2552a> f17692d;
    /* renamed from: e */
    private final ArrayList<C2552a> f17693e = new ArrayList();
    /* renamed from: f */
    private boolean f17694f = false;
    /* renamed from: g */
    private ArrayList<C2553b> f17695g;
    /* renamed from: h */
    private boolean f17696h = false;
    /* renamed from: i */
    private final ArrayList<C2550b<?>> f17697i = new ArrayList();
    /* renamed from: j */
    private ServiceConnection f17698j;
    /* renamed from: k */
    private boolean f17699k = false;

    /* renamed from: com.google.android.youtube.player.internal.t$1 */
    static /* synthetic */ class C25481 {
        /* renamed from: a */
        static final /* synthetic */ int[] f10894a = new int[YouTubeInitializationResult.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.google.android.youtube.player.YouTubeInitializationResult.values();
            r0 = r0.length;
            r0 = new int[r0];
            f10894a = r0;
            r0 = f10894a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.android.youtube.player.YouTubeInitializationResult.SUCCESS;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.t.1.<clinit>():void");
        }
    }

    /* renamed from: com.google.android.youtube.player.internal.t$a */
    final class C2549a extends Handler {
        /* renamed from: a */
        final /* synthetic */ C4179t f10895a;

        C2549a(C4179t c4179t) {
            this.f10895a = c4179t;
        }

        public final void handleMessage(Message message) {
            if (message.what == 3) {
                this.f10895a.m22986a((YouTubeInitializationResult) message.obj);
            } else if (message.what == 4) {
                synchronized (this.f10895a.f17692d) {
                    if (this.f10895a.f17699k && this.f10895a.m22993f() && this.f10895a.f17692d.contains(message.obj)) {
                        ((C2552a) message.obj).mo3221a();
                    }
                }
            } else if (message.what != 2 || this.f10895a.m22993f()) {
                if (message.what != 2) {
                    if (message.what != 1) {
                        return;
                    }
                }
                ((C2550b) message.obj).m12555a();
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.internal.t$b */
    protected abstract class C2550b<TListener> {
        /* renamed from: a */
        final /* synthetic */ C4179t f10896a;
        /* renamed from: b */
        private TListener f10897b;

        public C2550b(C4179t c4179t, TListener tListener) {
            this.f10896a = c4179t;
            this.f10897b = tListener;
            synchronized (c4179t.f17697i) {
                c4179t.f17697i.add(this);
            }
        }

        /* renamed from: a */
        public final void m12555a() {
            Object obj;
            synchronized (this) {
                obj = this.f10897b;
            }
            mo3297a(obj);
        }

        /* renamed from: a */
        protected abstract void mo3297a(TListener tListener);

        /* renamed from: b */
        public final void m12557b() {
            synchronized (this) {
                this.f10897b = null;
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.internal.t$e */
    final class C2551e implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ C4179t f10898a;

        C2551e(C4179t c4179t) {
            this.f10898a = c4179t;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f10898a.m22989b(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            this.f10898a.f17691c = null;
            this.f10898a.m22995h();
        }
    }

    /* renamed from: com.google.android.youtube.player.internal.t$c */
    protected final class C4178c extends C2550b<Boolean> {
        /* renamed from: b */
        public final YouTubeInitializationResult f17686b;
        /* renamed from: c */
        public final IBinder f17687c;
        /* renamed from: d */
        final /* synthetic */ C4179t f17688d;

        public C4178c(C4179t c4179t, String str, IBinder iBinder) {
            this.f17688d = c4179t;
            super(c4179t, Boolean.valueOf(true));
            this.f17686b = C4179t.m22980b(str);
            this.f17687c = iBinder;
        }

        /* renamed from: a */
        protected final /* synthetic */ void mo3297a(java.lang.Object r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r3 = (java.lang.Boolean) r3;
            if (r3 == 0) goto L_0x0052;
        L_0x0004:
            r3 = com.google.android.youtube.player.internal.C4179t.C25481.f10894a;
            r0 = r2.f17686b;
            r0 = r0.ordinal();
            r3 = r3[r0];
            r0 = 1;
            if (r3 == r0) goto L_0x0019;
        L_0x0011:
            r3 = r2.f17688d;
            r0 = r2.f17686b;
            r3.m22986a(r0);
            goto L_0x0052;
        L_0x0019:
            r3 = r2.f17687c;	 Catch:{ RemoteException -> 0x0046 }
            r3 = r3.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0046 }
            r0 = r2.f17688d;	 Catch:{ RemoteException -> 0x0046 }
            r0 = r0.mo4410b();	 Catch:{ RemoteException -> 0x0046 }
            r3 = r0.equals(r3);	 Catch:{ RemoteException -> 0x0046 }
            if (r3 == 0) goto L_0x0046;	 Catch:{ RemoteException -> 0x0046 }
        L_0x002b:
            r3 = r2.f17688d;	 Catch:{ RemoteException -> 0x0046 }
            r0 = r2.f17688d;	 Catch:{ RemoteException -> 0x0046 }
            r1 = r2.f17687c;	 Catch:{ RemoteException -> 0x0046 }
            r0 = r0.mo4407a(r1);	 Catch:{ RemoteException -> 0x0046 }
            r3.f17691c = r0;	 Catch:{ RemoteException -> 0x0046 }
            r3 = r2.f17688d;	 Catch:{ RemoteException -> 0x0046 }
            r3 = r3.f17691c;	 Catch:{ RemoteException -> 0x0046 }
            if (r3 == 0) goto L_0x0046;	 Catch:{ RemoteException -> 0x0046 }
        L_0x0040:
            r3 = r2.f17688d;	 Catch:{ RemoteException -> 0x0046 }
            r3.m22994g();	 Catch:{ RemoteException -> 0x0046 }
            return;
        L_0x0046:
            r3 = r2.f17688d;
            r3.mo4406a();
            r3 = r2.f17688d;
            r0 = com.google.android.youtube.player.YouTubeInitializationResult.INTERNAL_ERROR;
            r3.m22986a(r0);
        L_0x0052:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.t.c.a(java.lang.Object):void");
        }
    }

    /* renamed from: com.google.android.youtube.player.internal.t$d */
    protected final class C4717d extends C4159a {
        /* renamed from: a */
        final /* synthetic */ C4179t f20767a;

        protected C4717d(C4179t c4179t) {
            this.f20767a = c4179t;
        }

        /* renamed from: a */
        public final void mo3226a(String str, IBinder iBinder) {
            this.f20767a.f17689a.sendMessage(this.f20767a.f17689a.obtainMessage(1, new C4178c(this.f20767a, str, iBinder)));
        }
    }

    protected C4179t(Context context, C2552a c2552a, C2553b c2553b) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f17690b = (Context) C2534c.m12477a((Object) context);
            this.f17692d = new ArrayList();
            this.f17692d.add(C2534c.m12477a((Object) c2552a));
            this.f17695g = new ArrayList();
            this.f17695g.add(C2534c.m12477a((Object) c2553b));
            this.f17689a = new C2549a(this);
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    /* renamed from: a */
    private void mo4406a() {
        if (this.f17698j != null) {
            try {
                this.f17690b.unbindService(this.f17698j);
            } catch (Throwable e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f17691c = null;
        this.f17698j = null;
    }

    /* renamed from: b */
    private static com.google.android.youtube.player.YouTubeInitializationResult m22980b(java.lang.String r0) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = com.google.android.youtube.player.YouTubeInitializationResult.valueOf(r0);	 Catch:{ IllegalArgumentException -> 0x0008, NullPointerException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = com.google.android.youtube.player.YouTubeInitializationResult.UNKNOWN_ERROR;
        return r0;
    L_0x0008:
        r0 = com.google.android.youtube.player.YouTubeInitializationResult.UNKNOWN_ERROR;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.t.b(java.lang.String):com.google.android.youtube.player.YouTubeInitializationResult");
    }

    /* renamed from: a */
    protected abstract T mo4407a(IBinder iBinder);

    /* renamed from: a */
    protected final void m22986a(YouTubeInitializationResult youTubeInitializationResult) {
        this.f17689a.removeMessages(4);
        synchronized (this.f17695g) {
            this.f17696h = true;
            ArrayList arrayList = this.f17695g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (this.f17699k) {
                    if (this.f17695g.contains(arrayList.get(i))) {
                        ((C2553b) arrayList.get(i)).mo3223a(youTubeInitializationResult);
                    }
                    i++;
                } else {
                    return;
                }
            }
            this.f17696h = false;
        }
    }

    /* renamed from: a */
    protected abstract void mo4408a(C2541l c2541l, C4717d c4717d);

    /* renamed from: b */
    protected abstract String mo4410b();

    /* renamed from: b */
    protected final void m22989b(android.os.IBinder r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r2 = com.google.android.youtube.player.internal.C2541l.C4171a.m22961a(r2);	 Catch:{ RemoteException -> 0x000d }
        r0 = new com.google.android.youtube.player.internal.t$d;	 Catch:{ RemoteException -> 0x000d }
        r0.<init>(r1);	 Catch:{ RemoteException -> 0x000d }
        r1.mo4408a(r2, r0);	 Catch:{ RemoteException -> 0x000d }
        return;
    L_0x000d:
        r2 = "YouTubeClient";
        r0 = "service died";
        android.util.Log.w(r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.t.b(android.os.IBinder):void");
    }

    /* renamed from: c */
    protected abstract String mo4411c();

    /* renamed from: d */
    public void mo3298d() {
        m22995h();
        int i = 0;
        this.f17699k = false;
        synchronized (this.f17697i) {
            int size = this.f17697i.size();
            while (i < size) {
                ((C2550b) this.f17697i.get(i)).m12557b();
                i++;
            }
            this.f17697i.clear();
        }
        mo4406a();
    }

    /* renamed from: e */
    public final void mo3299e() {
        this.f17699k = true;
        YouTubeInitializationResult a = C2528a.m12457a(this.f17690b);
        if (a != YouTubeInitializationResult.SUCCESS) {
            this.f17689a.sendMessage(this.f17689a.obtainMessage(3, a));
            return;
        }
        Intent intent = new Intent(mo4411c()).setPackage(ab.m12467a(this.f17690b));
        if (this.f17698j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            mo4406a();
        }
        this.f17698j = new C2551e(this);
        if (!this.f17690b.bindService(intent, this.f17698j, 129)) {
            this.f17689a.sendMessage(this.f17689a.obtainMessage(3, YouTubeInitializationResult.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    /* renamed from: f */
    public final boolean m22993f() {
        return this.f17691c != null;
    }

    /* renamed from: g */
    protected final void m22994g() {
        synchronized (this.f17692d) {
            boolean z = true;
            C2534c.m12480a(this.f17694f ^ true);
            this.f17689a.removeMessages(4);
            this.f17694f = true;
            if (this.f17693e.size() != 0) {
                z = false;
            }
            C2534c.m12480a(z);
            ArrayList arrayList = this.f17692d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f17699k && m22993f(); i++) {
                if (!this.f17693e.contains(arrayList.get(i))) {
                    ((C2552a) arrayList.get(i)).mo3221a();
                }
            }
            this.f17693e.clear();
            this.f17694f = false;
        }
    }

    /* renamed from: h */
    protected final void m22995h() {
        this.f17689a.removeMessages(4);
        synchronized (this.f17692d) {
            this.f17694f = true;
            ArrayList arrayList = this.f17692d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f17699k; i++) {
                if (this.f17692d.contains(arrayList.get(i))) {
                    ((C2552a) arrayList.get(i)).mo3222b();
                }
            }
            this.f17694f = false;
        }
    }

    /* renamed from: i */
    protected final void m22996i() {
        if (!m22993f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: j */
    protected final T m22997j() {
        m22996i();
        return this.f17691c;
    }
}
