package io.fabric.sdk.android.services.concurrency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.fabric.sdk.android.services.concurrency.g */
public class C4314g implements C2822a<C2828i>, C2825f, C2828i {
    /* renamed from: a */
    private final List<C2828i> f18045a = new ArrayList();
    /* renamed from: b */
    private final AtomicBoolean f18046b = new AtomicBoolean(false);
    /* renamed from: c */
    private final AtomicReference<Throwable> f18047c = new AtomicReference(null);

    /* renamed from: c */
    public /* synthetic */ void mo3585c(Object obj) {
        m23651a((C2828i) obj);
    }

    /* renamed from: c */
    public synchronized Collection<C2828i> mo3584c() {
        return Collections.unmodifiableCollection(this.f18045a);
    }

    /* renamed from: a */
    public synchronized void m23651a(C2828i c2828i) {
        this.f18045a.add(c2828i);
    }

    /* renamed from: d */
    public boolean mo3586d() {
        for (C2828i f : mo3584c()) {
            if (!f.mo3587f()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public synchronized void mo3583b(boolean z) {
        this.f18046b.set(z);
    }

    /* renamed from: f */
    public boolean mo3587f() {
        return this.f18046b.get();
    }

    /* renamed from: b */
    public Priority mo3582b() {
        return Priority.NORMAL;
    }

    /* renamed from: a */
    public void mo3581a(Throwable th) {
        this.f18047c.set(th);
    }

    public int compareTo(Object obj) {
        return Priority.m13755a(this, obj);
    }

    /* renamed from: a */
    public static boolean m23650a(java.lang.Object r3) {
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
        r0 = 0;
        r1 = r3;	 Catch:{ ClassCastException -> 0x0011 }
        r1 = (io.fabric.sdk.android.services.concurrency.C2822a) r1;	 Catch:{ ClassCastException -> 0x0011 }
        r2 = r3;	 Catch:{ ClassCastException -> 0x0011 }
        r2 = (io.fabric.sdk.android.services.concurrency.C2828i) r2;	 Catch:{ ClassCastException -> 0x0011 }
        r3 = (io.fabric.sdk.android.services.concurrency.C2825f) r3;	 Catch:{ ClassCastException -> 0x0011 }
        if (r1 == 0) goto L_0x0010;
    L_0x000b:
        if (r2 == 0) goto L_0x0010;
    L_0x000d:
        if (r3 == 0) goto L_0x0010;
    L_0x000f:
        r0 = 1;
    L_0x0010:
        return r0;
    L_0x0011:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.concurrency.g.a(java.lang.Object):boolean");
    }
}
