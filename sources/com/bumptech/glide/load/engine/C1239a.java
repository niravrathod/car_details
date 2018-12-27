package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.engine.C3493n.C1273a;
import com.bumptech.glide.p055g.C1178i;
import com.bumptech.glide.p055g.C1180j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.a */
final class C1239a {
    /* renamed from: a */
    final Map<C1216c, C1228b> f3940a = new HashMap();
    /* renamed from: b */
    private final boolean f3941b;
    /* renamed from: c */
    private final Handler f3942c = new Handler(Looper.getMainLooper(), new C12251(this));
    /* renamed from: d */
    private C1273a f3943d;
    /* renamed from: e */
    private ReferenceQueue<C3493n<?>> f3944e;
    /* renamed from: f */
    private Thread f3945f;
    /* renamed from: g */
    private volatile boolean f3946g;
    /* renamed from: h */
    private volatile C1227a f3947h;

    /* renamed from: com.bumptech.glide.load.engine.a$1 */
    class C12251 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C1239a f3927a;

        C12251(C1239a c1239a) {
            this.f3927a = c1239a;
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return null;
            }
            this.f3927a.m5060a((C1228b) message.obj);
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$2 */
    class C12262 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1239a f3928a;

        C12262(C1239a c1239a) {
            this.f3928a = c1239a;
        }

        public void run() {
            Process.setThreadPriority(10);
            this.f3928a.m5057a();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    interface C1227a {
        /* renamed from: a */
        void m5018a();
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    static final class C1228b extends WeakReference<C3493n<?>> {
        /* renamed from: a */
        final C1216c f3929a;
        /* renamed from: b */
        final boolean f3930b;
        /* renamed from: c */
        C1277s<?> f3931c;

        C1228b(C1216c c1216c, C3493n<?> c3493n, ReferenceQueue<? super C3493n<?>> referenceQueue, boolean z) {
            super(c3493n, referenceQueue);
            this.f3929a = (C1216c) C1178i.m4880a((Object) c1216c);
            c1216c = (c3493n.m17725b() == null || !z) ? null : (C1277s) C1178i.m4880a(c3493n.m17723a());
            this.f3931c = c1216c;
            this.f3930b = c3493n.m17725b();
        }

        /* renamed from: a */
        void m5019a() {
            this.f3931c = null;
            clear();
        }
    }

    C1239a(boolean z) {
        this.f3941b = z;
    }

    /* renamed from: a */
    void m5061a(C1273a c1273a) {
        this.f3943d = c1273a;
    }

    /* renamed from: a */
    void m5059a(C1216c c1216c, C3493n<?> c3493n) {
        C1228b c1228b = (C1228b) this.f3940a.put(c1216c, new C1228b(c1216c, c3493n, m5056b(), this.f3941b));
        if (c1228b != null) {
            c1228b.m5019a();
        }
    }

    /* renamed from: a */
    void m5058a(C1216c c1216c) {
        C1228b c1228b = (C1228b) this.f3940a.remove(c1216c);
        if (c1228b != null) {
            c1228b.m5019a();
        }
    }

    /* renamed from: b */
    C3493n<?> m5062b(C1216c c1216c) {
        C1228b c1228b = (C1228b) this.f3940a.get(c1216c);
        if (c1228b == null) {
            return null;
        }
        C3493n<?> c3493n = (C3493n) c1228b.get();
        if (c3493n == null) {
            m5060a(c1228b);
        }
        return c3493n;
    }

    /* renamed from: a */
    void m5060a(C1228b c1228b) {
        C1180j.m4896a();
        this.f3940a.remove(c1228b.f3929a);
        if (c1228b.f3930b) {
            if (c1228b.f3931c != null) {
                C3493n c3493n = new C3493n(c1228b.f3931c, true, false);
                c3493n.m17724a(c1228b.f3929a, this.f3943d);
                this.f3943d.mo1038a(c1228b.f3929a, c3493n);
            }
        }
    }

    /* renamed from: b */
    private ReferenceQueue<C3493n<?>> m5056b() {
        if (this.f3944e == null) {
            this.f3944e = new ReferenceQueue();
            this.f3945f = new Thread(new C12262(this), "glide-active-resources");
            this.f3945f.start();
        }
        return this.f3944e;
    }

    /* renamed from: a */
    void m5057a() {
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
        r3 = this;
    L_0x0000:
        r0 = r3.f3946g;
        if (r0 != 0) goto L_0x0026;
    L_0x0004:
        r0 = r3.f3944e;	 Catch:{ InterruptedException -> 0x001e }
        r0 = r0.remove();	 Catch:{ InterruptedException -> 0x001e }
        r0 = (com.bumptech.glide.load.engine.C1239a.C1228b) r0;	 Catch:{ InterruptedException -> 0x001e }
        r1 = r3.f3942c;	 Catch:{ InterruptedException -> 0x001e }
        r2 = 1;	 Catch:{ InterruptedException -> 0x001e }
        r0 = r1.obtainMessage(r2, r0);	 Catch:{ InterruptedException -> 0x001e }
        r0.sendToTarget();	 Catch:{ InterruptedException -> 0x001e }
        r0 = r3.f3947h;	 Catch:{ InterruptedException -> 0x001e }
        if (r0 == 0) goto L_0x0000;	 Catch:{ InterruptedException -> 0x001e }
    L_0x001a:
        r0.m5018a();	 Catch:{ InterruptedException -> 0x001e }
        goto L_0x0000;
    L_0x001e:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
        goto L_0x0000;
    L_0x0026:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.a.a():void");
    }
}
