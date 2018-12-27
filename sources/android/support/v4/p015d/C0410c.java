package android.support.v4.p015d;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.d.c */
public class C0410c {
    /* renamed from: a */
    private final Object f1390a = new Object();
    /* renamed from: b */
    private HandlerThread f1391b;
    /* renamed from: c */
    private Handler f1392c;
    /* renamed from: d */
    private int f1393d;
    /* renamed from: e */
    private Callback f1394e = new C04051(this);
    /* renamed from: f */
    private final int f1395f;
    /* renamed from: g */
    private final int f1396g;
    /* renamed from: h */
    private final String f1397h;

    /* renamed from: android.support.v4.d.c$1 */
    class C04051 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C0410c f1377a;

        C04051(C0410c c0410c) {
            this.f1377a = c0410c;
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    this.f1377a.m1502a();
                    return true;
                case 1:
                    this.f1377a.m1506b((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    }

    /* renamed from: android.support.v4.d.c$a */
    public interface C0409a<T> {
        /* renamed from: a */
        void mo326a(T t);
    }

    public C0410c(String str, int i, int i2) {
        this.f1397h = str;
        this.f1396g = i;
        this.f1395f = i2;
        this.f1393d = null;
    }

    /* renamed from: a */
    private void m1505a(Runnable runnable) {
        synchronized (this.f1390a) {
            if (this.f1391b == null) {
                this.f1391b = new HandlerThread(this.f1397h, this.f1396g);
                this.f1391b.start();
                this.f1392c = new Handler(this.f1391b.getLooper(), this.f1394e);
                this.f1393d++;
            }
            this.f1392c.removeMessages(0);
            this.f1392c.sendMessage(this.f1392c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public <T> void m1508a(final Callable<T> callable, final C0409a<T> c0409a) {
        final Handler handler = new Handler();
        m1505a(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C0410c f1383d;

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
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
                /*
                r3 = this;
                r0 = r3;	 Catch:{ Exception -> 0x0007 }
                r0 = r0.call();	 Catch:{ Exception -> 0x0007 }
                goto L_0x0008;
            L_0x0007:
                r0 = 0;
            L_0x0008:
                r1 = r0;
                r2 = new android.support.v4.d.c$2$1;
                r2.<init>(r3, r0);
                r1.post(r2);
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.d.c.2.run():void");
            }
        });
    }

    /* renamed from: a */
    public <T> T m1507a(java.util.concurrent.Callable<T> r13, int r14) {
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
        r12 = this;
        r7 = new java.util.concurrent.locks.ReentrantLock;
        r7.<init>();
        r8 = r7.newCondition();
        r9 = new java.util.concurrent.atomic.AtomicReference;
        r9.<init>();
        r10 = new java.util.concurrent.atomic.AtomicBoolean;
        r0 = 1;
        r10.<init>(r0);
        r11 = new android.support.v4.d.c$3;
        r0 = r11;
        r1 = r12;
        r2 = r9;
        r3 = r13;
        r4 = r7;
        r5 = r10;
        r6 = r8;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r12.m1505a(r11);
        r7.lock();
        r13 = r10.get();	 Catch:{ all -> 0x005d }
        if (r13 != 0) goto L_0x0034;	 Catch:{ all -> 0x005d }
    L_0x002c:
        r13 = r9.get();	 Catch:{ all -> 0x005d }
        r7.unlock();
        return r13;
    L_0x0034:
        r13 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x005d }
        r0 = (long) r14;	 Catch:{ all -> 0x005d }
        r13 = r13.toNanos(r0);	 Catch:{ all -> 0x005d }
    L_0x003b:
        r0 = r8.awaitNanos(r13);	 Catch:{ InterruptedException -> 0x0040 }
        r13 = r0;
    L_0x0040:
        r0 = r10.get();	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x004e;	 Catch:{ all -> 0x005d }
    L_0x0046:
        r13 = r9.get();	 Catch:{ all -> 0x005d }
        r7.unlock();
        return r13;
    L_0x004e:
        r0 = 0;
        r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x0055;
    L_0x0054:
        goto L_0x003b;
    L_0x0055:
        r13 = new java.lang.InterruptedException;	 Catch:{ all -> 0x005d }
        r14 = "timeout";	 Catch:{ all -> 0x005d }
        r13.<init>(r14);	 Catch:{ all -> 0x005d }
        throw r13;	 Catch:{ all -> 0x005d }
    L_0x005d:
        r13 = move-exception;
        r7.unlock();
        throw r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.d.c.a(java.util.concurrent.Callable, int):T");
    }

    /* renamed from: b */
    private void m1506b(Runnable runnable) {
        runnable.run();
        synchronized (this.f1390a) {
            this.f1392c.removeMessages(0);
            this.f1392c.sendMessageDelayed(this.f1392c.obtainMessage(0), (long) this.f1395f);
        }
    }

    /* renamed from: a */
    private void m1502a() {
        synchronized (this.f1390a) {
            if (this.f1392c.hasMessages(1)) {
                return;
            }
            this.f1391b.quit();
            this.f1391b = null;
            this.f1392c = null;
        }
    }
}
