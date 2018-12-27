package android.support.v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.v4.app.C0328g;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.ResultReceiver;
import android.support.v4.p017f.C0429j;
import android.support.v4.p017f.C3131a;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    /* renamed from: a */
    static final boolean f1533a = Log.isLoggable("MBServiceCompat", 3);
    /* renamed from: b */
    final C3131a<IBinder, C0455b> f1534b = new C3131a();
    /* renamed from: c */
    C0455b f1535c;
    /* renamed from: d */
    final C0468g f1536d = new C0468g(this);
    /* renamed from: e */
    Token f1537e;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$a */
    public static final class C0453a {
        /* renamed from: a */
        private final String f1481a;
        /* renamed from: b */
        private final Bundle f1482b;

        /* renamed from: a */
        public String m1652a() {
            return this.f1481a;
        }

        /* renamed from: b */
        public Bundle m1653b() {
            return this.f1482b;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b */
    private class C0455b implements DeathRecipient {
        /* renamed from: a */
        String f1484a;
        /* renamed from: b */
        Bundle f1485b;
        /* renamed from: c */
        C0467e f1486c;
        /* renamed from: d */
        C0453a f1487d;
        /* renamed from: e */
        HashMap<String, List<C0429j<IBinder, Bundle>>> f1488e = new HashMap();
        /* renamed from: f */
        final /* synthetic */ MediaBrowserServiceCompat f1489f;

        /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b$1 */
        class C04541 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0455b f1483a;

            C04541(C0455b c0455b) {
                this.f1483a = c0455b;
            }

            public void run() {
                this.f1483a.f1489f.f1534b.remove(this.f1483a.f1486c.mo357a());
            }
        }

        C0455b(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1489f = mediaBrowserServiceCompat;
        }

        public void binderDied() {
            this.f1489f.f1536d.post(new C04541(this));
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$c */
    public static class C0456c<T> {
        /* renamed from: a */
        private final Object f1490a;
        /* renamed from: b */
        private boolean f1491b;
        /* renamed from: c */
        private boolean f1492c;
        /* renamed from: d */
        private boolean f1493d;
        /* renamed from: e */
        private int f1494e;

        /* renamed from: a */
        void mo355a(T t) {
        }

        C0456c(Object obj) {
            this.f1490a = obj;
        }

        /* renamed from: b */
        public void m1659b(T t) {
            if (this.f1492c || this.f1493d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
                stringBuilder.append(this.f1490a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f1492c = true;
            mo355a((Object) t);
        }

        /* renamed from: c */
        public void m1660c(Bundle bundle) {
            if (this.f1492c || this.f1493d) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("sendError() called when either sendResult() or sendError() had already been called for: ");
                stringBuilder.append(this.f1490a);
                throw new IllegalStateException(stringBuilder.toString());
            }
            this.f1493d = true;
            mo356b(bundle);
        }

        /* renamed from: a */
        boolean m1656a() {
            if (!(this.f1491b || this.f1492c)) {
                if (!this.f1493d) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: a */
        void m1654a(int i) {
            this.f1494e = i;
        }

        /* renamed from: b */
        int m1657b() {
            return this.f1494e;
        }

        /* renamed from: b */
        void mo356b(Bundle bundle) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("It is not supported to send an error for ");
            stringBuilder.append(this.f1490a);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d */
    private class C0466d {
        /* renamed from: a */
        final /* synthetic */ MediaBrowserServiceCompat f1530a;

        C0466d(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1530a = mediaBrowserServiceCompat;
        }

        /* renamed from: a */
        public void m1663a(String str, int i, Bundle bundle, C0467e c0467e) {
            if (this.f1530a.m1684a(str, i)) {
                final C0467e c0467e2 = c0467e;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final int i2 = i;
                this.f1530a.f1536d.m1674a(new Runnable(this) {
                    /* renamed from: e */
                    final /* synthetic */ C0466d f1499e;

                    public void run() {
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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                        /*
                        r6 = this;
                        r0 = r3;
                        r0 = r0.mo357a();
                        r1 = r6.f1499e;
                        r1 = r1.f1530a;
                        r1 = r1.f1534b;
                        r1.remove(r0);
                        r1 = new android.support.v4.media.MediaBrowserServiceCompat$b;
                        r2 = r6.f1499e;
                        r2 = r2.f1530a;
                        r1.<init>(r2);
                        r2 = r4;
                        r1.f1484a = r2;
                        r2 = r5;
                        r1.f1485b = r2;
                        r2 = r3;
                        r1.f1486c = r2;
                        r2 = r6.f1499e;
                        r2 = r2.f1530a;
                        r3 = r4;
                        r4 = r6;
                        r5 = r5;
                        r2 = r2.m1675a(r3, r4, r5);
                        r1.f1487d = r2;
                        r2 = r1.f1487d;
                        if (r2 != 0) goto L_0x007f;
                    L_0x0038:
                        r0 = "MBServiceCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "No root for client ";
                        r1.append(r2);
                        r2 = r4;
                        r1.append(r2);
                        r2 = " from service ";
                        r1.append(r2);
                        r2 = r6.getClass();
                        r2 = r2.getName();
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.i(r0, r1);
                        r0 = r3;	 Catch:{ RemoteException -> 0x0066 }
                        r0.mo360b();	 Catch:{ RemoteException -> 0x0066 }
                        goto L_0x00cd;
                    L_0x0066:
                        r0 = "MBServiceCompat";
                        r1 = new java.lang.StringBuilder;
                        r1.<init>();
                        r2 = "Calling onConnectFailed() failed. Ignoring. pkg=";
                        r1.append(r2);
                        r2 = r4;
                        r1.append(r2);
                        r1 = r1.toString();
                        android.util.Log.w(r0, r1);
                        goto L_0x00cd;
                    L_0x007f:
                        r2 = r6.f1499e;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1530a;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1534b;	 Catch:{ RemoteException -> 0x00ac }
                        r2.put(r0, r1);	 Catch:{ RemoteException -> 0x00ac }
                        r2 = 0;	 Catch:{ RemoteException -> 0x00ac }
                        r0.linkToDeath(r1, r2);	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r6.f1499e;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1530a;	 Catch:{ RemoteException -> 0x00ac }
                        r2 = r2.f1537e;	 Catch:{ RemoteException -> 0x00ac }
                        if (r2 == 0) goto L_0x00cd;	 Catch:{ RemoteException -> 0x00ac }
                    L_0x0094:
                        r2 = r3;	 Catch:{ RemoteException -> 0x00ac }
                        r3 = r1.f1487d;	 Catch:{ RemoteException -> 0x00ac }
                        r3 = r3.m1652a();	 Catch:{ RemoteException -> 0x00ac }
                        r4 = r6.f1499e;	 Catch:{ RemoteException -> 0x00ac }
                        r4 = r4.f1530a;	 Catch:{ RemoteException -> 0x00ac }
                        r4 = r4.f1537e;	 Catch:{ RemoteException -> 0x00ac }
                        r1 = r1.f1487d;	 Catch:{ RemoteException -> 0x00ac }
                        r1 = r1.m1653b();	 Catch:{ RemoteException -> 0x00ac }
                        r2.mo358a(r3, r4, r1);	 Catch:{ RemoteException -> 0x00ac }
                        goto L_0x00cd;
                    L_0x00ac:
                        r1 = "MBServiceCompat";
                        r2 = new java.lang.StringBuilder;
                        r2.<init>();
                        r3 = "Calling onConnect() failed. Dropping client. pkg=";
                        r2.append(r3);
                        r3 = r4;
                        r2.append(r3);
                        r2 = r2.toString();
                        android.util.Log.w(r1, r2);
                        r1 = r6.f1499e;
                        r1 = r1.f1530a;
                        r1 = r1.f1534b;
                        r1.remove(r0);
                    L_0x00cd:
                        return;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.d.1.run():void");
                    }
                });
                return;
            }
            c0467e = new StringBuilder();
            c0467e.append("Package/uid mismatch: uid=");
            c0467e.append(i);
            c0467e.append(" package=");
            c0467e.append(str);
            throw new IllegalArgumentException(c0467e.toString());
        }

        /* renamed from: a */
        public void m1661a(final C0467e c0467e) {
            this.f1530a.f1536d.m1674a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0466d f1501b;

                public void run() {
                    C0455b c0455b = (C0455b) this.f1501b.f1530a.f1534b.remove(c0467e.mo357a());
                    if (c0455b != null) {
                        c0455b.f1486c.mo357a().unlinkToDeath(c0455b, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void m1665a(String str, IBinder iBinder, Bundle bundle, C0467e c0467e) {
            final C0467e c0467e2 = c0467e;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            this.f1530a.f1536d.m1674a(new Runnable(this) {
                /* renamed from: e */
                final /* synthetic */ C0466d f1506e;

                public void run() {
                    C0455b c0455b = (C0455b) this.f1506e.f1530a.f1534b.get(c0467e2.mo357a());
                    if (c0455b == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("addSubscription for callback that isn't registered id=");
                        stringBuilder.append(str2);
                        Log.w("MBServiceCompat", stringBuilder.toString());
                        return;
                    }
                    this.f1506e.f1530a.m1680a(str2, c0455b, iBinder2, bundle2);
                }
            });
        }

        /* renamed from: a */
        public void m1666a(final String str, final IBinder iBinder, final C0467e c0467e) {
            this.f1530a.f1536d.m1674a(new Runnable(this) {
                /* renamed from: d */
                final /* synthetic */ C0466d f1510d;

                public void run() {
                    C0455b c0455b = (C0455b) this.f1510d.f1530a.f1534b.get(c0467e.mo357a());
                    if (c0455b == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("removeSubscription for callback that isn't registered id=");
                        stringBuilder.append(str);
                        Log.w("MBServiceCompat", stringBuilder.toString());
                        return;
                    }
                    if (!this.f1510d.f1530a.m1685a(str, c0455b, iBinder)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("removeSubscription called for ");
                        stringBuilder.append(str);
                        stringBuilder.append(" which is not subscribed");
                        Log.w("MBServiceCompat", stringBuilder.toString());
                    }
                }
            });
        }

        /* renamed from: a */
        public void m1667a(final String str, final ResultReceiver resultReceiver, final C0467e c0467e) {
            if (!TextUtils.isEmpty(str)) {
                if (resultReceiver != null) {
                    this.f1530a.f1536d.m1674a(new Runnable(this) {
                        /* renamed from: d */
                        final /* synthetic */ C0466d f1514d;

                        public void run() {
                            C0455b c0455b = (C0455b) this.f1514d.f1530a.f1534b.get(c0467e.mo357a());
                            if (c0455b == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("getMediaItem for callback that isn't registered id=");
                                stringBuilder.append(str);
                                Log.w("MBServiceCompat", stringBuilder.toString());
                                return;
                            }
                            this.f1514d.f1530a.m1681a(str, c0455b, resultReceiver);
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void m1662a(final C0467e c0467e, final Bundle bundle) {
            this.f1530a.f1536d.m1674a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C0466d f1517c;

                public void run() {
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
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                    /*
                    r3 = this;
                    r0 = r3;
                    r0 = r0.mo357a();
                    r1 = r3.f1517c;
                    r1 = r1.f1530a;
                    r1 = r1.f1534b;
                    r1.remove(r0);
                    r1 = new android.support.v4.media.MediaBrowserServiceCompat$b;
                    r2 = r3.f1517c;
                    r2 = r2.f1530a;
                    r1.<init>(r2);
                    r2 = r3;
                    r1.f1486c = r2;
                    r2 = r4;
                    r1.f1485b = r2;
                    r2 = r3.f1517c;
                    r2 = r2.f1530a;
                    r2 = r2.f1534b;
                    r2.put(r0, r1);
                    r2 = 0;
                    r0.linkToDeath(r1, r2);	 Catch:{ RemoteException -> 0x002e }
                    goto L_0x0035;
                L_0x002e:
                    r0 = "MBServiceCompat";
                    r1 = "IBinder is already dead.";
                    android.util.Log.w(r0, r1);
                L_0x0035:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.d.6.run():void");
                }
            });
        }

        /* renamed from: b */
        public void m1668b(final C0467e c0467e) {
            this.f1530a.f1536d.m1674a(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0466d f1519b;

                public void run() {
                    IBinder a = c0467e.mo357a();
                    C0455b c0455b = (C0455b) this.f1519b.f1530a.f1534b.remove(a);
                    if (c0455b != null) {
                        a.unlinkToDeath(c0455b, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public void m1664a(String str, Bundle bundle, ResultReceiver resultReceiver, C0467e c0467e) {
            if (!TextUtils.isEmpty(str)) {
                if (resultReceiver != null) {
                    final C0467e c0467e2 = c0467e;
                    final String str2 = str;
                    final Bundle bundle2 = bundle;
                    final ResultReceiver resultReceiver2 = resultReceiver;
                    this.f1530a.f1536d.m1674a(new Runnable(this) {
                        /* renamed from: e */
                        final /* synthetic */ C0466d f1524e;

                        public void run() {
                            C0455b c0455b = (C0455b) this.f1524e.f1530a.f1534b.get(c0467e2.mo357a());
                            if (c0455b == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("search for callback that isn't registered query=");
                                stringBuilder.append(str2);
                                Log.w("MBServiceCompat", stringBuilder.toString());
                                return;
                            }
                            this.f1524e.f1530a.m1677a(str2, bundle2, c0455b, resultReceiver2);
                        }
                    });
                }
            }
        }

        /* renamed from: b */
        public void m1669b(String str, Bundle bundle, ResultReceiver resultReceiver, C0467e c0467e) {
            if (!TextUtils.isEmpty(str)) {
                if (resultReceiver != null) {
                    final C0467e c0467e2 = c0467e;
                    final String str2 = str;
                    final Bundle bundle2 = bundle;
                    final ResultReceiver resultReceiver2 = resultReceiver;
                    this.f1530a.f1536d.m1674a(new Runnable(this) {
                        /* renamed from: e */
                        final /* synthetic */ C0466d f1529e;

                        public void run() {
                            C0455b c0455b = (C0455b) this.f1529e.f1530a.f1534b.get(c0467e2.mo357a());
                            if (c0455b == null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("sendCustomAction for callback that isn't registered action=");
                                stringBuilder.append(str2);
                                stringBuilder.append(", extras=");
                                stringBuilder.append(bundle2);
                                Log.w("MBServiceCompat", stringBuilder.toString());
                                return;
                            }
                            this.f1529e.f1530a.m1686b(str2, bundle2, c0455b, resultReceiver2);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$e */
    private interface C0467e {
        /* renamed from: a */
        IBinder mo357a();

        /* renamed from: a */
        void mo358a(String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo359a(String str, List<MediaItem> list, Bundle bundle);

        /* renamed from: b */
        void mo360b();
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$g */
    private final class C0468g extends Handler {
        /* renamed from: a */
        final /* synthetic */ MediaBrowserServiceCompat f1531a;
        /* renamed from: b */
        private final C0466d f1532b = new C0466d(this.f1531a);

        C0468g(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
            this.f1531a = mediaBrowserServiceCompat;
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.f1532b.m1663a(data.getString("data_package_name"), data.getInt("data_calling_uid"), data.getBundle("data_root_hints"), new C3142f(message.replyTo));
                    return;
                case 2:
                    this.f1532b.m1661a(new C3142f(message.replyTo));
                    return;
                case 3:
                    this.f1532b.m1665a(data.getString("data_media_item_id"), C0328g.m1170a(data, "data_callback_token"), data.getBundle("data_options"), new C3142f(message.replyTo));
                    return;
                case 4:
                    this.f1532b.m1666a(data.getString("data_media_item_id"), C0328g.m1170a(data, "data_callback_token"), new C3142f(message.replyTo));
                    return;
                case 5:
                    this.f1532b.m1667a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C3142f(message.replyTo));
                    return;
                case 6:
                    this.f1532b.m1662a(new C3142f(message.replyTo), data.getBundle("data_root_hints"));
                    return;
                case 7:
                    this.f1532b.m1668b(new C3142f(message.replyTo));
                    return;
                case 8:
                    this.f1532b.m1664a(data.getString("data_search_query"), data.getBundle("data_search_extras"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C3142f(message.replyTo));
                    return;
                case 9:
                    this.f1532b.m1669b(data.getString("data_custom_action"), data.getBundle("data_custom_action_extras"), (ResultReceiver) data.getParcelable("data_result_receiver"), new C3142f(message.replyTo));
                    return;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unhandled message: ");
                    stringBuilder.append(message);
                    stringBuilder.append("\n  Service version: ");
                    stringBuilder.append(2);
                    stringBuilder.append("\n  Client version: ");
                    stringBuilder.append(message.arg1);
                    Log.w("MBServiceCompat", stringBuilder.toString());
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }

        /* renamed from: a */
        public void m1674a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$f */
    private static class C3142f implements C0467e {
        /* renamed from: a */
        final Messenger f13279a;

        C3142f(Messenger messenger) {
            this.f13279a = messenger;
        }

        /* renamed from: a */
        public IBinder mo357a() {
            return this.f13279a.getBinder();
        }

        /* renamed from: a */
        public void mo358a(String str, Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m15660a(1, bundle2);
        }

        /* renamed from: b */
        public void mo360b() {
            m15660a(2, null);
        }

        /* renamed from: a */
        public void mo359a(String str, List<MediaItem> list, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", (list instanceof ArrayList) != null ? (ArrayList) list : new ArrayList(list));
            }
            m15660a(3, bundle2);
        }

        /* renamed from: a */
        private void m15660a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f13279a.send(obtain);
        }
    }

    /* renamed from: a */
    public abstract C0453a m1675a(String str, int i, Bundle bundle);

    /* renamed from: a */
    public abstract void m1682a(String str, C0456c<List<MediaItem>> c0456c);

    /* renamed from: a */
    public void m1683a(String str, C0456c<List<MediaItem>> c0456c, Bundle bundle) {
        c0456c.m1654a(1);
        m1682a(str, (C0456c) c0456c);
    }

    /* renamed from: b */
    public void m1688b(String str, C0456c<MediaItem> c0456c) {
        c0456c.m1654a(2);
        c0456c.m1659b((Object) null);
    }

    /* renamed from: a */
    public void m1678a(String str, Bundle bundle, C0456c<List<MediaItem>> c0456c) {
        c0456c.m1654a(4);
        c0456c.m1659b((Object) null);
    }

    /* renamed from: b */
    public void m1687b(String str, Bundle bundle, C0456c<Bundle> c0456c) {
        c0456c.m1660c(null);
    }

    /* renamed from: a */
    boolean m1684a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    void m1680a(String str, C0455b c0455b, IBinder iBinder, Bundle bundle) {
        List list = (List) c0455b.f1488e.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (C0429j c0429j : r0) {
            if (iBinder == c0429j.f1442a && C0480c.m1723a(bundle, (Bundle) c0429j.f1443b)) {
                return;
            }
        }
        r0.add(new C0429j(iBinder, bundle));
        c0455b.f1488e.put(str, r0);
        m1679a(str, c0455b, bundle);
    }

    /* renamed from: a */
    boolean m1685a(String str, C0455b c0455b, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            if (c0455b.f1488e.remove(str) == null) {
                z = false;
            }
            return z;
        }
        List list = (List) c0455b.f1488e.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (iBinder == ((C0429j) it.next()).f1442a) {
                    it.remove();
                    z2 = true;
                }
            }
            if (list.size() == null) {
                c0455b.f1488e.remove(str);
            }
        }
        return z2;
    }

    /* renamed from: a */
    void m1679a(String str, C0455b c0455b, Bundle bundle) {
        final C0455b c0455b2 = c0455b;
        final String str2 = str;
        final Bundle bundle2 = bundle;
        C0456c c31381 = new C0456c<List<MediaItem>>(this, str) {
            /* renamed from: d */
            final /* synthetic */ MediaBrowserServiceCompat f13272d;

            /* renamed from: a */
            void m15652a(java.util.List<android.support.v4.media.MediaBrowserCompat.MediaItem> r4) {
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
                r3 = this;
                r0 = r3.f13272d;
                r0 = r0.f1534b;
                r1 = r3;
                r1 = r1.f1486c;
                r1 = r1.mo357a();
                r0 = r0.get(r1);
                r1 = r3;
                if (r0 == r1) goto L_0x003d;
            L_0x0014:
                r4 = android.support.v4.media.MediaBrowserServiceCompat.f1533a;
                if (r4 == 0) goto L_0x003c;
            L_0x0018:
                r4 = "MBServiceCompat";
                r0 = new java.lang.StringBuilder;
                r0.<init>();
                r1 = "Not sending onLoadChildren result for connection that has been disconnected. pkg=";
                r0.append(r1);
                r1 = r3;
                r1 = r1.f1484a;
                r0.append(r1);
                r1 = " id=";
                r0.append(r1);
                r1 = r4;
                r0.append(r1);
                r0 = r0.toString();
                android.util.Log.d(r4, r0);
            L_0x003c:
                return;
            L_0x003d:
                r0 = r3.m1657b();
                r0 = r0 & 1;
                if (r0 == 0) goto L_0x004d;
            L_0x0045:
                r0 = r3.f13272d;
                r1 = r5;
                r4 = r0.m1676a(r4, r1);
            L_0x004d:
                r0 = r3;	 Catch:{ RemoteException -> 0x0059 }
                r0 = r0.f1486c;	 Catch:{ RemoteException -> 0x0059 }
                r1 = r4;	 Catch:{ RemoteException -> 0x0059 }
                r2 = r5;	 Catch:{ RemoteException -> 0x0059 }
                r0.mo359a(r1, r4, r2);	 Catch:{ RemoteException -> 0x0059 }
                goto L_0x007d;
            L_0x0059:
                r4 = "MBServiceCompat";
                r0 = new java.lang.StringBuilder;
                r0.<init>();
                r1 = "Calling onLoadChildren() failed for id=";
                r0.append(r1);
                r1 = r4;
                r0.append(r1);
                r1 = " package=";
                r0.append(r1);
                r1 = r3;
                r1 = r1.f1484a;
                r0.append(r1);
                r0 = r0.toString();
                android.util.Log.w(r4, r0);
            L_0x007d:
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserServiceCompat.1.a(java.util.List):void");
            }
        };
        this.f1535c = c0455b;
        if (bundle == null) {
            m1682a(str, c31381);
        } else {
            m1683a(str, c31381, bundle);
        }
        this.f1535c = null;
        if (c31381.m1656a() == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onLoadChildren must call detach() or sendResult() before returning for package=");
            stringBuilder.append(c0455b.f1484a);
            stringBuilder.append(" id=");
            stringBuilder.append(str);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    List<MediaItem> m1676a(List<MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
        bundle = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i == -1 && bundle == -1) {
            return list;
        }
        int i2 = bundle * i;
        int i3 = i2 + bundle;
        if (i >= 0 && bundle >= 1) {
            if (i2 < list.size()) {
                if (i3 > list.size()) {
                    i3 = list.size();
                }
                return list.subList(i2, i3);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    void m1681a(String str, C0455b c0455b, final ResultReceiver resultReceiver) {
        C0456c c31392 = new C0456c<MediaItem>(this, str) {
            /* renamed from: b */
            final /* synthetic */ MediaBrowserServiceCompat f13274b;

            /* renamed from: a */
            void m15653a(MediaItem mediaItem) {
                if ((m1657b() & 2) != 0) {
                    resultReceiver.m1877b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.m1877b(0, bundle);
            }
        };
        this.f1535c = c0455b;
        m1688b(str, c31392);
        this.f1535c = null;
        if (c31392.m1656a() == null) {
            resultReceiver = new StringBuilder();
            resultReceiver.append("onLoadItem must call detach() or sendResult() before returning for id=");
            resultReceiver.append(str);
            throw new IllegalStateException(resultReceiver.toString());
        }
    }

    /* renamed from: a */
    void m1677a(String str, Bundle bundle, C0455b c0455b, final ResultReceiver resultReceiver) {
        C0456c c31403 = new C0456c<List<MediaItem>>(this, str) {
            /* renamed from: b */
            final /* synthetic */ MediaBrowserServiceCompat f13276b;

            /* renamed from: a */
            void m15656a(List<MediaItem> list) {
                if ((m1657b() & 4) == 0) {
                    if (list != null) {
                        Bundle bundle = new Bundle();
                        bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
                        resultReceiver.m1877b(0, bundle);
                        return;
                    }
                }
                resultReceiver.m1877b(-1, null);
            }
        };
        this.f1535c = c0455b;
        m1678a(str, bundle, c31403);
        this.f1535c = null;
        if (c31403.m1656a() == null) {
            c0455b = new StringBuilder();
            c0455b.append("onSearch must call detach() or sendResult() before returning for query=");
            c0455b.append(str);
            throw new IllegalStateException(c0455b.toString());
        }
    }

    /* renamed from: b */
    void m1686b(String str, Bundle bundle, C0455b c0455b, final ResultReceiver resultReceiver) {
        C0456c c31414 = new C0456c<Bundle>(this, str) {
            /* renamed from: b */
            final /* synthetic */ MediaBrowserServiceCompat f13278b;

            /* renamed from: a */
            void m15657a(Bundle bundle) {
                resultReceiver.m1877b(0, bundle);
            }

            /* renamed from: b */
            void mo356b(Bundle bundle) {
                resultReceiver.m1877b(-1, bundle);
            }
        };
        this.f1535c = c0455b;
        m1687b(str, bundle, c31414);
        this.f1535c = null;
        if (c31414.m1656a() == null) {
            resultReceiver = new StringBuilder();
            resultReceiver.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            resultReceiver.append(str);
            resultReceiver.append(" extras=");
            resultReceiver.append(bundle);
            throw new IllegalStateException(resultReceiver.toString());
        }
    }
}
