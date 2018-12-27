package com.google.android.exoplayer2.p124a;

import com.google.android.exoplayer2.p126c.C2163a;
import java.util.LinkedList;

/* renamed from: com.google.android.exoplayer2.a.g */
public abstract class C3948g<I extends C3946e, O extends C3947f, E extends Exception> implements C2127c<I, O, E> {
    /* renamed from: a */
    private final Thread f15693a;
    /* renamed from: b */
    private final Object f15694b = new Object();
    /* renamed from: c */
    private final LinkedList<I> f15695c = new LinkedList();
    /* renamed from: d */
    private final LinkedList<O> f15696d = new LinkedList();
    /* renamed from: e */
    private final I[] f15697e;
    /* renamed from: f */
    private final O[] f15698f;
    /* renamed from: g */
    private int f15699g;
    /* renamed from: h */
    private int f15700h;
    /* renamed from: i */
    private I f15701i;
    /* renamed from: j */
    private E f15702j;
    /* renamed from: k */
    private boolean f15703k;
    /* renamed from: l */
    private boolean f15704l;
    /* renamed from: m */
    private int f15705m;

    /* renamed from: com.google.android.exoplayer2.a.g$1 */
    class C21291 extends Thread {
        /* renamed from: a */
        final /* synthetic */ C3948g f6530a;

        C21291(C3948g c3948g) {
            this.f6530a = c3948g;
        }

        public void run() {
            this.f6530a.m19616k();
        }
    }

    /* renamed from: a */
    protected abstract E mo4069a(I i, O o, boolean z);

    /* renamed from: g */
    protected abstract I mo4071g();

    /* renamed from: h */
    protected abstract O mo4072h();

    /* renamed from: a */
    public /* synthetic */ Object mo1521a() {
        return m19628e();
    }

    /* renamed from: b */
    public /* synthetic */ Object mo1523b() {
        return m19629f();
    }

    protected C3948g(I[] iArr, O[] oArr) {
        this.f15697e = iArr;
        this.f15699g = iArr.length;
        for (int i = 0; i < this.f15699g; i++) {
            this.f15697e[i] = mo4071g();
        }
        this.f15698f = oArr;
        this.f15700h = oArr.length;
        for (iArr = null; iArr < this.f15700h; iArr++) {
            this.f15698f[iArr] = mo4072h();
        }
        this.f15693a = new C21291(this);
        this.f15693a.start();
    }

    /* renamed from: a */
    protected final void m19621a(int i) {
        C2163a.m7918b(this.f15699g == this.f15697e.length);
        for (C3946e e : this.f15697e) {
            e.m19607e(i);
        }
    }

    /* renamed from: e */
    public final I m19628e() {
        I i;
        synchronized (this.f15694b) {
            C3946e c3946e;
            mo4073i();
            C2163a.m7918b(this.f15701i == null);
            if (this.f15699g == 0) {
                c3946e = null;
            } else {
                C3946e[] c3946eArr = this.f15697e;
                int i2 = this.f15699g - 1;
                this.f15699g = i2;
                c3946e = c3946eArr[i2];
            }
            this.f15701i = c3946e;
            i = this.f15701i;
        }
        return i;
    }

    /* renamed from: a */
    public final void m19622a(I i) {
        synchronized (this.f15694b) {
            mo4073i();
            C2163a.m7916a(i == this.f15701i);
            this.f15695c.addLast(i);
            mo4074j();
            this.f15701i = null;
        }
    }

    /* renamed from: f */
    public final O m19629f() {
        synchronized (this.f15694b) {
            mo4073i();
            if (this.f15696d.isEmpty()) {
                return null;
            }
            C3947f c3947f = (C3947f) this.f15696d.removeFirst();
            return c3947f;
        }
    }

    /* renamed from: a */
    protected void mo4070a(O o) {
        synchronized (this.f15694b) {
            m19613b((C3947f) o);
            mo4074j();
        }
    }

    /* renamed from: c */
    public final void mo1524c() {
        synchronized (this.f15694b) {
            this.f15703k = true;
            this.f15705m = 0;
            if (this.f15701i != null) {
                m19612b(this.f15701i);
                this.f15701i = null;
            }
            while (!this.f15695c.isEmpty()) {
                m19612b((C3946e) this.f15695c.removeFirst());
            }
            while (!this.f15696d.isEmpty()) {
                m19613b((C3947f) this.f15696d.removeFirst());
            }
        }
    }

    /* renamed from: d */
    public void mo1525d() {
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
        r2 = this;
        r0 = r2.f15694b;
        monitor-enter(r0);
        r1 = 1;
        r2.f15704l = r1;	 Catch:{ all -> 0x001a }
        r1 = r2.f15694b;	 Catch:{ all -> 0x001a }
        r1.notify();	 Catch:{ all -> 0x001a }
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        r0 = r2.f15693a;	 Catch:{ InterruptedException -> 0x0012 }
        r0.join();	 Catch:{ InterruptedException -> 0x0012 }
        goto L_0x0019;
    L_0x0012:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0019:
        return;
    L_0x001a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.a.g.d():void");
    }

    /* renamed from: i */
    private void mo4073i() {
        if (this.f15702j != null) {
            throw this.f15702j;
        }
    }

    /* renamed from: j */
    private void mo4074j() {
        if (m19618m()) {
            this.f15694b.notify();
        }
    }

    /* renamed from: k */
    private void m19616k() {
        while (m19617l()) {
            try {
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: l */
    private boolean m19617l() {
        /*
        r6 = this;
        r0 = r6.f15694b;
        monitor-enter(r0);
    L_0x0003:
        r1 = r6.f15704l;	 Catch:{ all -> 0x0086 }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = r6.m19618m();	 Catch:{ all -> 0x0086 }
        if (r1 != 0) goto L_0x0013;
    L_0x000d:
        r1 = r6.f15694b;	 Catch:{ all -> 0x0086 }
        r1.wait();	 Catch:{ all -> 0x0086 }
        goto L_0x0003;
    L_0x0013:
        r1 = r6.f15704l;	 Catch:{ all -> 0x0086 }
        r2 = 0;
        if (r1 == 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x0086 }
        return r2;
    L_0x001a:
        r1 = r6.f15695c;	 Catch:{ all -> 0x0086 }
        r1 = r1.removeFirst();	 Catch:{ all -> 0x0086 }
        r1 = (com.google.android.exoplayer2.p124a.C3946e) r1;	 Catch:{ all -> 0x0086 }
        r3 = r6.f15698f;	 Catch:{ all -> 0x0086 }
        r4 = r6.f15700h;	 Catch:{ all -> 0x0086 }
        r5 = 1;
        r4 = r4 - r5;
        r6.f15700h = r4;	 Catch:{ all -> 0x0086 }
        r3 = r3[r4];	 Catch:{ all -> 0x0086 }
        r4 = r6.f15703k;	 Catch:{ all -> 0x0086 }
        r6.f15703k = r2;	 Catch:{ all -> 0x0086 }
        monitor-exit(r0);	 Catch:{ all -> 0x0086 }
        r0 = r1.m7762c();
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = 4;
        r3.m7760b(r0);
        goto L_0x0059;
    L_0x003c:
        r0 = r1.l_();
        if (r0 == 0) goto L_0x0047;
    L_0x0042:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3.m7760b(r0);
    L_0x0047:
        r0 = r6.mo4069a(r1, r3, r4);
        r6.f15702j = r0;
        r0 = r6.f15702j;
        if (r0 == 0) goto L_0x0059;
    L_0x0051:
        r0 = r6.f15694b;
        monitor-enter(r0);
        monitor-exit(r0);	 Catch:{ all -> 0x0056 }
        return r2;
    L_0x0056:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0056 }
        throw r1;
    L_0x0059:
        r4 = r6.f15694b;
        monitor-enter(r4);
        r0 = r6.f15703k;	 Catch:{ all -> 0x0083 }
        if (r0 == 0) goto L_0x0064;
    L_0x0060:
        r6.m19613b(r3);	 Catch:{ all -> 0x0083 }
        goto L_0x007e;
    L_0x0064:
        r0 = r3.l_();	 Catch:{ all -> 0x0083 }
        if (r0 == 0) goto L_0x0073;
    L_0x006a:
        r0 = r6.f15705m;	 Catch:{ all -> 0x0083 }
        r0 = r0 + r5;
        r6.f15705m = r0;	 Catch:{ all -> 0x0083 }
        r6.m19613b(r3);	 Catch:{ all -> 0x0083 }
        goto L_0x007e;
    L_0x0073:
        r0 = r6.f15705m;	 Catch:{ all -> 0x0083 }
        r3.f15692b = r0;	 Catch:{ all -> 0x0083 }
        r6.f15705m = r2;	 Catch:{ all -> 0x0083 }
        r0 = r6.f15696d;	 Catch:{ all -> 0x0083 }
        r0.addLast(r3);	 Catch:{ all -> 0x0083 }
    L_0x007e:
        r6.m19612b(r1);	 Catch:{ all -> 0x0083 }
        monitor-exit(r4);	 Catch:{ all -> 0x0083 }
        return r5;
    L_0x0083:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0083 }
        throw r0;
    L_0x0086:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0086 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.a.g.l():boolean");
    }

    /* renamed from: m */
    private boolean m19618m() {
        return !this.f15695c.isEmpty() && this.f15700h > 0;
    }

    /* renamed from: b */
    private void m19612b(I i) {
        i.mo1520a();
        C3946e[] c3946eArr = this.f15697e;
        int i2 = this.f15699g;
        this.f15699g = i2 + 1;
        c3946eArr[i2] = i;
    }

    /* renamed from: b */
    private void m19613b(O o) {
        o.mo1520a();
        C3947f[] c3947fArr = this.f15698f;
        int i = this.f15700h;
        this.f15700h = i + 1;
        c3947fArr[i] = o;
    }
}
