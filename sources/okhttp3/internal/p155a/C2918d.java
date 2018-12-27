package okhttp3.internal.p155a;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.C2933c;
import okhttp3.internal.p158d.C2940a;
import okhttp3.internal.p159e.C2945f;
import okio.C2995s;
import okio.C4393d;
import okio.C4905m;

/* renamed from: okhttp3.internal.a.d */
public final class C2918d implements Closeable, Flushable {
    /* renamed from: a */
    static final Pattern f12319a = Pattern.compile("[a-z0-9_-]{1,120}");
    /* renamed from: m */
    static final /* synthetic */ boolean f12320m = (C2918d.class.desiredAssertionStatus() ^ 1);
    /* renamed from: b */
    final C2940a f12321b;
    /* renamed from: c */
    final File f12322c;
    /* renamed from: d */
    final int f12323d;
    /* renamed from: e */
    C4393d f12324e;
    /* renamed from: f */
    final LinkedHashMap<String, C2916b> f12325f = new LinkedHashMap(0, 0.75f, true);
    /* renamed from: g */
    int f12326g;
    /* renamed from: h */
    boolean f12327h;
    /* renamed from: i */
    boolean f12328i;
    /* renamed from: j */
    boolean f12329j;
    /* renamed from: k */
    boolean f12330k;
    /* renamed from: l */
    boolean f12331l;
    /* renamed from: n */
    private final File f12332n;
    /* renamed from: o */
    private final File f12333o;
    /* renamed from: p */
    private final File f12334p;
    /* renamed from: q */
    private final int f12335q;
    /* renamed from: r */
    private long f12336r;
    /* renamed from: s */
    private long f12337s = 0;
    /* renamed from: t */
    private long f12338t = 0;
    /* renamed from: u */
    private final Executor f12339u;
    /* renamed from: v */
    private final Runnable f12340v = new C29141(this);

    /* renamed from: okhttp3.internal.a.d$1 */
    class C29141 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2918d f12301a;

        C29141(C2918d c2918d) {
            this.f12301a = c2918d;
        }

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
            r4 = this;
            r0 = r4.f12301a;
            monitor-enter(r0);
            r1 = r4.f12301a;	 Catch:{ all -> 0x0041 }
            r1 = r1.f12328i;	 Catch:{ all -> 0x0041 }
            r2 = 1;	 Catch:{ all -> 0x0041 }
            r1 = r1 ^ r2;	 Catch:{ all -> 0x0041 }
            r3 = r4.f12301a;	 Catch:{ all -> 0x0041 }
            r3 = r3.f12329j;	 Catch:{ all -> 0x0041 }
            r1 = r1 | r3;	 Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0012;	 Catch:{ all -> 0x0041 }
        L_0x0010:
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            return;
        L_0x0012:
            r1 = r4.f12301a;	 Catch:{ IOException -> 0x0018 }
            r1.m14124e();	 Catch:{ IOException -> 0x0018 }
            goto L_0x001c;
        L_0x0018:
            r1 = r4.f12301a;	 Catch:{ all -> 0x0041 }
            r1.f12330k = r2;	 Catch:{ all -> 0x0041 }
        L_0x001c:
            r1 = r4.f12301a;	 Catch:{ IOException -> 0x002f }
            r1 = r1.m14121c();	 Catch:{ IOException -> 0x002f }
            if (r1 == 0) goto L_0x003f;	 Catch:{ IOException -> 0x002f }
        L_0x0024:
            r1 = r4.f12301a;	 Catch:{ IOException -> 0x002f }
            r1.m14120b();	 Catch:{ IOException -> 0x002f }
            r1 = r4.f12301a;	 Catch:{ IOException -> 0x002f }
            r3 = 0;	 Catch:{ IOException -> 0x002f }
            r1.f12326g = r3;	 Catch:{ IOException -> 0x002f }
            goto L_0x003f;
        L_0x002f:
            r1 = r4.f12301a;	 Catch:{ all -> 0x0041 }
            r1.f12331l = r2;	 Catch:{ all -> 0x0041 }
            r1 = r4.f12301a;	 Catch:{ all -> 0x0041 }
            r2 = okio.C4905m.a();	 Catch:{ all -> 0x0041 }
            r2 = okio.C4905m.a(r2);	 Catch:{ all -> 0x0041 }
            r1.f12324e = r2;	 Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            return;	 Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception;	 Catch:{ all -> 0x0041 }
            monitor-exit(r0);	 Catch:{ all -> 0x0041 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.1.run():void");
        }
    }

    /* renamed from: okhttp3.internal.a.d$a */
    public final class C2915a {
        /* renamed from: a */
        final C2916b f12302a;
        /* renamed from: b */
        final boolean[] f12303b;
        /* renamed from: c */
        final /* synthetic */ C2918d f12304c;
        /* renamed from: d */
        private boolean f12305d;

        C2915a(C2918d c2918d, C2916b c2916b) {
            this.f12304c = c2918d;
            this.f12302a = c2916b;
            this.f12303b = c2916b.f12310e != null ? null : new boolean[c2918d.f12323d];
        }

        /* renamed from: a */
        void m14098a() {
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
            r0 = r3.f12302a;
            r0 = r0.f12311f;
            if (r0 != r3) goto L_0x0022;
        L_0x0006:
            r0 = 0;
        L_0x0007:
            r1 = r3.f12304c;
            r1 = r1.f12323d;
            if (r0 >= r1) goto L_0x001d;
        L_0x000d:
            r1 = r3.f12304c;	 Catch:{ IOException -> 0x001a }
            r1 = r1.f12321b;	 Catch:{ IOException -> 0x001a }
            r2 = r3.f12302a;	 Catch:{ IOException -> 0x001a }
            r2 = r2.f12309d;	 Catch:{ IOException -> 0x001a }
            r2 = r2[r0];	 Catch:{ IOException -> 0x001a }
            r1.mo3642d(r2);	 Catch:{ IOException -> 0x001a }
        L_0x001a:
            r0 = r0 + 1;
            goto L_0x0007;
        L_0x001d:
            r0 = r3.f12302a;
            r1 = 0;
            r0.f12311f = r1;
        L_0x0022:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.a.a():void");
        }

        /* renamed from: a */
        public okio.C2994r m14097a(int r4) {
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
            r0 = r3.f12304c;
            monitor-enter(r0);
            r1 = r3.f12305d;	 Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x0039;	 Catch:{ all -> 0x003f }
        L_0x0007:
            r1 = r3.f12302a;	 Catch:{ all -> 0x003f }
            r1 = r1.f12311f;	 Catch:{ all -> 0x003f }
            if (r1 == r3) goto L_0x0013;	 Catch:{ all -> 0x003f }
        L_0x000d:
            r4 = okio.C4905m.a();	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return r4;	 Catch:{ all -> 0x003f }
        L_0x0013:
            r1 = r3.f12302a;	 Catch:{ all -> 0x003f }
            r1 = r1.f12310e;	 Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x001e;	 Catch:{ all -> 0x003f }
        L_0x0019:
            r1 = r3.f12303b;	 Catch:{ all -> 0x003f }
            r2 = 1;	 Catch:{ all -> 0x003f }
            r1[r4] = r2;	 Catch:{ all -> 0x003f }
        L_0x001e:
            r1 = r3.f12302a;	 Catch:{ all -> 0x003f }
            r1 = r1.f12309d;	 Catch:{ all -> 0x003f }
            r4 = r1[r4];	 Catch:{ all -> 0x003f }
            r1 = r3.f12304c;	 Catch:{ FileNotFoundException -> 0x0033 }
            r1 = r1.f12321b;	 Catch:{ FileNotFoundException -> 0x0033 }
            r4 = r1.mo3640b(r4);	 Catch:{ FileNotFoundException -> 0x0033 }
            r1 = new okhttp3.internal.a.d$a$1;	 Catch:{ all -> 0x003f }
            r1.<init>(r3, r4);	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return r1;	 Catch:{ all -> 0x003f }
        L_0x0033:
            r4 = okio.C4905m.a();	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            return r4;	 Catch:{ all -> 0x003f }
        L_0x0039:
            r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003f }
            r4.<init>();	 Catch:{ all -> 0x003f }
            throw r4;	 Catch:{ all -> 0x003f }
        L_0x003f:
            r4 = move-exception;	 Catch:{ all -> 0x003f }
            monitor-exit(r0);	 Catch:{ all -> 0x003f }
            throw r4;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.a.a(int):okio.r");
        }

        /* renamed from: b */
        public void m14099b() {
            synchronized (this.f12304c) {
                if (this.f12305d) {
                    throw new IllegalStateException();
                }
                if (this.f12302a.f12311f == this) {
                    this.f12304c.m14117a(this, true);
                }
                this.f12305d = true;
            }
        }

        /* renamed from: c */
        public void m14100c() {
            synchronized (this.f12304c) {
                if (this.f12305d) {
                    throw new IllegalStateException();
                }
                if (this.f12302a.f12311f == this) {
                    this.f12304c.m14117a(this, false);
                }
                this.f12305d = true;
            }
        }
    }

    /* renamed from: okhttp3.internal.a.d$b */
    private final class C2916b {
        /* renamed from: a */
        final String f12306a;
        /* renamed from: b */
        final long[] f12307b;
        /* renamed from: c */
        final File[] f12308c;
        /* renamed from: d */
        final File[] f12309d;
        /* renamed from: e */
        boolean f12310e;
        /* renamed from: f */
        C2915a f12311f;
        /* renamed from: g */
        long f12312g;
        /* renamed from: h */
        final /* synthetic */ C2918d f12313h;

        C2916b(C2918d c2918d, String str) {
            this.f12313h = c2918d;
            this.f12306a = str;
            this.f12307b = new long[c2918d.f12323d];
            this.f12308c = new File[c2918d.f12323d];
            this.f12309d = new File[c2918d.f12323d];
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append('.');
            str = stringBuilder.length();
            for (int i = 0; i < c2918d.f12323d; i++) {
                stringBuilder.append(i);
                this.f12308c[i] = new File(c2918d.f12322c, stringBuilder.toString());
                stringBuilder.append(".tmp");
                this.f12309d[i] = new File(c2918d.f12322c, stringBuilder.toString());
                stringBuilder.setLength(str);
            }
        }

        /* renamed from: a */
        void m14104a(java.lang.String[] r5) {
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
            r4 = this;
            r0 = r5.length;
            r1 = r4.f12313h;
            r1 = r1.f12323d;
            if (r0 != r1) goto L_0x001e;
        L_0x0007:
            r0 = 0;
        L_0x0008:
            r1 = r5.length;	 Catch:{ NumberFormatException -> 0x0019 }
            if (r0 >= r1) goto L_0x0018;	 Catch:{ NumberFormatException -> 0x0019 }
        L_0x000b:
            r1 = r4.f12307b;	 Catch:{ NumberFormatException -> 0x0019 }
            r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x0019 }
            r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x0019 }
            r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x0019 }
            r0 = r0 + 1;
            goto L_0x0008;
        L_0x0018:
            return;
        L_0x0019:
            r5 = r4.m14101b(r5);
            throw r5;
        L_0x001e:
            r5 = r4.m14101b(r5);
            throw r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.b.a(java.lang.String[]):void");
        }

        /* renamed from: a */
        void m14103a(C4393d c4393d) {
            for (long m : this.f12307b) {
                c4393d.mo4568k(32).mo4573m(m);
            }
        }

        /* renamed from: b */
        private IOException m14101b(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected journal line: ");
            stringBuilder.append(Arrays.toString(strArr));
            throw new IOException(stringBuilder.toString());
        }

        /* renamed from: a */
        okhttp3.internal.p155a.C2918d.C2917c m14102a() {
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
            r10 = this;
            r0 = r10.f12313h;
            r0 = java.lang.Thread.holdsLock(r0);
            if (r0 == 0) goto L_0x0057;
        L_0x0008:
            r0 = r10.f12313h;
            r0 = r0.f12323d;
            r0 = new okio.C2995s[r0];
            r1 = r10.f12307b;
            r1 = r1.clone();
            r7 = r1;
            r7 = (long[]) r7;
            r8 = 0;
            r1 = 0;
        L_0x0019:
            r2 = r10.f12313h;	 Catch:{ FileNotFoundException -> 0x003e }
            r2 = r2.f12323d;	 Catch:{ FileNotFoundException -> 0x003e }
            if (r1 >= r2) goto L_0x0030;	 Catch:{ FileNotFoundException -> 0x003e }
        L_0x001f:
            r2 = r10.f12313h;	 Catch:{ FileNotFoundException -> 0x003e }
            r2 = r2.f12321b;	 Catch:{ FileNotFoundException -> 0x003e }
            r3 = r10.f12308c;	 Catch:{ FileNotFoundException -> 0x003e }
            r3 = r3[r1];	 Catch:{ FileNotFoundException -> 0x003e }
            r2 = r2.mo3638a(r3);	 Catch:{ FileNotFoundException -> 0x003e }
            r0[r1] = r2;	 Catch:{ FileNotFoundException -> 0x003e }
            r1 = r1 + 1;	 Catch:{ FileNotFoundException -> 0x003e }
            goto L_0x0019;	 Catch:{ FileNotFoundException -> 0x003e }
        L_0x0030:
            r9 = new okhttp3.internal.a.d$c;	 Catch:{ FileNotFoundException -> 0x003e }
            r2 = r10.f12313h;	 Catch:{ FileNotFoundException -> 0x003e }
            r3 = r10.f12306a;	 Catch:{ FileNotFoundException -> 0x003e }
            r4 = r10.f12312g;	 Catch:{ FileNotFoundException -> 0x003e }
            r1 = r9;	 Catch:{ FileNotFoundException -> 0x003e }
            r6 = r0;	 Catch:{ FileNotFoundException -> 0x003e }
            r1.<init>(r2, r3, r4, r6, r7);	 Catch:{ FileNotFoundException -> 0x003e }
            return r9;
        L_0x003e:
            r1 = r10.f12313h;
            r1 = r1.f12323d;
            if (r8 >= r1) goto L_0x0050;
        L_0x0044:
            r1 = r0[r8];
            if (r1 == 0) goto L_0x0050;
        L_0x0048:
            r1 = r0[r8];
            okhttp3.internal.C2933c.m14194a(r1);
            r8 = r8 + 1;
            goto L_0x003e;
        L_0x0050:
            r0 = r10.f12313h;	 Catch:{ IOException -> 0x0055 }
            r0.m14118a(r10);	 Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = 0;
            return r0;
        L_0x0057:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.b.a():okhttp3.internal.a.d$c");
        }
    }

    /* renamed from: okhttp3.internal.a.d$c */
    public final class C2917c implements Closeable {
        /* renamed from: a */
        final /* synthetic */ C2918d f12314a;
        /* renamed from: b */
        private final String f12315b;
        /* renamed from: c */
        private final long f12316c;
        /* renamed from: d */
        private final C2995s[] f12317d;
        /* renamed from: e */
        private final long[] f12318e;

        C2917c(C2918d c2918d, String str, long j, C2995s[] c2995sArr, long[] jArr) {
            this.f12314a = c2918d;
            this.f12315b = str;
            this.f12316c = j;
            this.f12317d = c2995sArr;
            this.f12318e = jArr;
        }

        @Nullable
        /* renamed from: a */
        public C2915a m14105a() {
            return this.f12314a.m14114a(this.f12315b, this.f12316c);
        }

        /* renamed from: a */
        public C2995s m14106a(int i) {
            return this.f12317d[i];
        }

        public void close() {
            for (Closeable a : this.f12317d) {
                C2933c.m14194a(a);
            }
        }
    }

    C2918d(C2940a c2940a, File file, int i, int i2, long j, Executor executor) {
        this.f12321b = c2940a;
        this.f12322c = file;
        this.f12335q = i;
        this.f12332n = new File(file, "journal");
        this.f12333o = new File(file, "journal.tmp");
        this.f12334p = new File(file, "journal.bkp");
        this.f12323d = i2;
        this.f12336r = j;
        this.f12339u = executor;
    }

    /* renamed from: a */
    public synchronized void m14116a() {
        if (!f12320m) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.f12328i) {
            if (this.f12321b.mo3643e(this.f12334p)) {
                if (this.f12321b.mo3643e(this.f12332n)) {
                    this.f12321b.mo3642d(this.f12334p);
                } else {
                    this.f12321b.mo3639a(this.f12334p, this.f12332n);
                }
            }
            if (this.f12321b.mo3643e(this.f12332n)) {
                try {
                    m14110g();
                    m14112i();
                    this.f12328i = true;
                    return;
                } catch (Throwable e) {
                    C2945f c = C2945f.m14270c();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DiskLruCache ");
                    stringBuilder.append(this.f12322c);
                    stringBuilder.append(" is corrupt: ");
                    stringBuilder.append(e.getMessage());
                    stringBuilder.append(", removing");
                    c.mo3651a(5, stringBuilder.toString(), e);
                    m14125f();
                } finally {
                    this.f12329j = false;
                }
            }
            m14120b();
            this.f12328i = true;
        }
    }

    /* renamed from: a */
    public static C2918d m14107a(C2940a c2940a, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            return new C2918d(c2940a, file, i, i2, j, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C2933c.m14192a("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: g */
    private void m14110g() {
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
        r8 = this;
        r0 = r8.f12321b;
        r1 = r8.f12332n;
        r0 = r0.mo3638a(r1);
        r0 = okio.C4905m.a(r0);
        r1 = r0.mo4576q();	 Catch:{ all -> 0x00ac }
        r2 = r0.mo4576q();	 Catch:{ all -> 0x00ac }
        r3 = r0.mo4576q();	 Catch:{ all -> 0x00ac }
        r4 = r0.mo4576q();	 Catch:{ all -> 0x00ac }
        r5 = r0.mo4576q();	 Catch:{ all -> 0x00ac }
        r6 = "libcore.io.DiskLruCache";	 Catch:{ all -> 0x00ac }
        r6 = r6.equals(r1);	 Catch:{ all -> 0x00ac }
        if (r6 == 0) goto L_0x0078;	 Catch:{ all -> 0x00ac }
    L_0x0028:
        r6 = "1";	 Catch:{ all -> 0x00ac }
        r6 = r6.equals(r2);	 Catch:{ all -> 0x00ac }
        if (r6 == 0) goto L_0x0078;	 Catch:{ all -> 0x00ac }
    L_0x0030:
        r6 = r8.f12335q;	 Catch:{ all -> 0x00ac }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ all -> 0x00ac }
        r3 = r6.equals(r3);	 Catch:{ all -> 0x00ac }
        if (r3 == 0) goto L_0x0078;	 Catch:{ all -> 0x00ac }
    L_0x003c:
        r3 = r8.f12323d;	 Catch:{ all -> 0x00ac }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ all -> 0x00ac }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x00ac }
        if (r3 == 0) goto L_0x0078;	 Catch:{ all -> 0x00ac }
    L_0x0048:
        r3 = "";	 Catch:{ all -> 0x00ac }
        r3 = r3.equals(r5);	 Catch:{ all -> 0x00ac }
        if (r3 == 0) goto L_0x0078;
    L_0x0050:
        r1 = 0;
    L_0x0051:
        r2 = r0.mo4576q();	 Catch:{ EOFException -> 0x005b }
        r8.m14108d(r2);	 Catch:{ EOFException -> 0x005b }
        r1 = r1 + 1;
        goto L_0x0051;
    L_0x005b:
        r2 = r8.f12325f;	 Catch:{ all -> 0x00ac }
        r2 = r2.size();	 Catch:{ all -> 0x00ac }
        r1 = r1 - r2;	 Catch:{ all -> 0x00ac }
        r8.f12326g = r1;	 Catch:{ all -> 0x00ac }
        r1 = r0.mo4557e();	 Catch:{ all -> 0x00ac }
        if (r1 != 0) goto L_0x006e;	 Catch:{ all -> 0x00ac }
    L_0x006a:
        r8.m14120b();	 Catch:{ all -> 0x00ac }
        goto L_0x0074;	 Catch:{ all -> 0x00ac }
    L_0x006e:
        r1 = r8.m14111h();	 Catch:{ all -> 0x00ac }
        r8.f12324e = r1;	 Catch:{ all -> 0x00ac }
    L_0x0074:
        okhttp3.internal.C2933c.m14194a(r0);
        return;
    L_0x0078:
        r3 = new java.io.IOException;	 Catch:{ all -> 0x00ac }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ac }
        r6.<init>();	 Catch:{ all -> 0x00ac }
        r7 = "unexpected journal header: [";	 Catch:{ all -> 0x00ac }
        r6.append(r7);	 Catch:{ all -> 0x00ac }
        r6.append(r1);	 Catch:{ all -> 0x00ac }
        r1 = ", ";	 Catch:{ all -> 0x00ac }
        r6.append(r1);	 Catch:{ all -> 0x00ac }
        r6.append(r2);	 Catch:{ all -> 0x00ac }
        r1 = ", ";	 Catch:{ all -> 0x00ac }
        r6.append(r1);	 Catch:{ all -> 0x00ac }
        r6.append(r4);	 Catch:{ all -> 0x00ac }
        r1 = ", ";	 Catch:{ all -> 0x00ac }
        r6.append(r1);	 Catch:{ all -> 0x00ac }
        r6.append(r5);	 Catch:{ all -> 0x00ac }
        r1 = "]";	 Catch:{ all -> 0x00ac }
        r6.append(r1);	 Catch:{ all -> 0x00ac }
        r1 = r6.toString();	 Catch:{ all -> 0x00ac }
        r3.<init>(r1);	 Catch:{ all -> 0x00ac }
        throw r3;	 Catch:{ all -> 0x00ac }
    L_0x00ac:
        r1 = move-exception;
        okhttp3.internal.C2933c.m14194a(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.g():void");
    }

    /* renamed from: h */
    private C4393d m14111h() {
        return C4905m.a(new C4748e(this, this.f12321b.mo3641c(this.f12332n)) {
            /* renamed from: a */
            static final /* synthetic */ boolean f21451a = (C2918d.class.desiredAssertionStatus() ^ 1);
            /* renamed from: b */
            final /* synthetic */ C2918d f21452b;

            /* renamed from: a */
            protected void mo4885a(IOException iOException) {
                if (f21451a == null) {
                    if (Thread.holdsLock(this.f21452b) == null) {
                        throw new AssertionError();
                    }
                }
                this.f21452b.f12327h = true;
            }
        });
    }

    /* renamed from: d */
    private void m14108d(String str) {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            String substring;
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == "REMOVE".length() && str.startsWith("REMOVE")) {
                    this.f12325f.remove(substring);
                    return;
                }
            }
            substring = str.substring(i, indexOf2);
            C2916b c2916b = (C2916b) this.f12325f.get(substring);
            if (c2916b == null) {
                c2916b = new C2916b(this, substring);
                this.f12325f.put(substring, c2916b);
            }
            if (indexOf2 != -1 && indexOf == "CLEAN".length() && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c2916b.f12310e = true;
                c2916b.f12311f = null;
                c2916b.m14104a(split);
            } else if (indexOf2 == -1 && indexOf == "DIRTY".length() && str.startsWith("DIRTY")) {
                c2916b.f12311f = new C2915a(this, c2916b);
            } else if (!(indexOf2 == -1 && indexOf == "READ".length() && str.startsWith("READ"))) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected journal line: ");
                stringBuilder.append(str);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected journal line: ");
        stringBuilder.append(str);
        throw new IOException(stringBuilder.toString());
    }

    /* renamed from: i */
    private void m14112i() {
        this.f12321b.mo3642d(this.f12333o);
        Iterator it = this.f12325f.values().iterator();
        while (it.hasNext()) {
            C2916b c2916b = (C2916b) it.next();
            int i = 0;
            if (c2916b.f12311f == null) {
                while (i < this.f12323d) {
                    this.f12337s += c2916b.f12307b[i];
                    i++;
                }
            } else {
                c2916b.f12311f = null;
                while (i < this.f12323d) {
                    this.f12321b.mo3642d(c2916b.f12308c[i]);
                    this.f12321b.mo3642d(c2916b.f12309d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: b */
    synchronized void m14120b() {
        if (this.f12324e != null) {
            this.f12324e.close();
        }
        C4393d a = C4905m.a(this.f12321b.mo3640b(this.f12333o));
        try {
            a.mo4550b("libcore.io.DiskLruCache").mo4568k(10);
            a.mo4550b("1").mo4568k(10);
            a.mo4573m((long) this.f12335q).mo4568k(10);
            a.mo4573m((long) this.f12323d).mo4568k(10);
            a.mo4568k(10);
            for (C2916b c2916b : this.f12325f.values()) {
                if (c2916b.f12311f != null) {
                    a.mo4550b("DIRTY").mo4568k(32);
                    a.mo4550b(c2916b.f12306a);
                    a.mo4568k(10);
                } else {
                    a.mo4550b("CLEAN").mo4568k(32);
                    a.mo4550b(c2916b.f12306a);
                    c2916b.m14103a(a);
                    a.mo4568k(10);
                }
            }
            if (this.f12321b.mo3643e(this.f12332n)) {
                this.f12321b.mo3639a(this.f12332n, this.f12334p);
            }
            this.f12321b.mo3639a(this.f12333o, this.f12332n);
            this.f12321b.mo3642d(this.f12334p);
            this.f12324e = m14111h();
            this.f12327h = false;
            this.f12331l = false;
        } finally {
            a.close();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public synchronized okhttp3.internal.p155a.C2918d.C2917c m14115a(java.lang.String r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.m14116a();	 Catch:{ all -> 0x0050 }
        r3.m14113j();	 Catch:{ all -> 0x0050 }
        r3.m14109e(r4);	 Catch:{ all -> 0x0050 }
        r0 = r3.f12325f;	 Catch:{ all -> 0x0050 }
        r0 = r0.get(r4);	 Catch:{ all -> 0x0050 }
        r0 = (okhttp3.internal.p155a.C2918d.C2916b) r0;	 Catch:{ all -> 0x0050 }
        r1 = 0;
        if (r0 == 0) goto L_0x004e;
    L_0x0015:
        r2 = r0.f12310e;	 Catch:{ all -> 0x0050 }
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x004e;
    L_0x001a:
        r0 = r0.m14102a();	 Catch:{ all -> 0x0050 }
        if (r0 != 0) goto L_0x0022;
    L_0x0020:
        monitor-exit(r3);
        return r1;
    L_0x0022:
        r1 = r3.f12326g;	 Catch:{ all -> 0x0050 }
        r1 = r1 + 1;
        r3.f12326g = r1;	 Catch:{ all -> 0x0050 }
        r1 = r3.f12324e;	 Catch:{ all -> 0x0050 }
        r2 = "READ";
        r1 = r1.mo4550b(r2);	 Catch:{ all -> 0x0050 }
        r2 = 32;
        r1 = r1.mo4568k(r2);	 Catch:{ all -> 0x0050 }
        r4 = r1.mo4550b(r4);	 Catch:{ all -> 0x0050 }
        r1 = 10;
        r4.mo4568k(r1);	 Catch:{ all -> 0x0050 }
        r4 = r3.m14121c();	 Catch:{ all -> 0x0050 }
        if (r4 == 0) goto L_0x004c;
    L_0x0045:
        r4 = r3.f12339u;	 Catch:{ all -> 0x0050 }
        r1 = r3.f12340v;	 Catch:{ all -> 0x0050 }
        r4.execute(r1);	 Catch:{ all -> 0x0050 }
    L_0x004c:
        monitor-exit(r3);
        return r0;
    L_0x004e:
        monitor-exit(r3);
        return r1;
    L_0x0050:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.a(java.lang.String):okhttp3.internal.a.d$c");
    }

    @Nullable
    /* renamed from: b */
    public C2915a m14119b(String str) {
        return m14114a(str, -1);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    synchronized okhttp3.internal.p155a.C2918d.C2915a m14114a(java.lang.String r6, long r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.m14116a();	 Catch:{ all -> 0x0074 }
        r5.m14113j();	 Catch:{ all -> 0x0074 }
        r5.m14109e(r6);	 Catch:{ all -> 0x0074 }
        r0 = r5.f12325f;	 Catch:{ all -> 0x0074 }
        r0 = r0.get(r6);	 Catch:{ all -> 0x0074 }
        r0 = (okhttp3.internal.p155a.C2918d.C2916b) r0;	 Catch:{ all -> 0x0074 }
        r1 = -1;
        r3 = 0;
        r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1));
        if (r4 == 0) goto L_0x0023;
    L_0x0019:
        if (r0 == 0) goto L_0x0021;
    L_0x001b:
        r1 = r0.f12312g;	 Catch:{ all -> 0x0074 }
        r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r4 == 0) goto L_0x0023;
    L_0x0021:
        monitor-exit(r5);
        return r3;
    L_0x0023:
        if (r0 == 0) goto L_0x002b;
    L_0x0025:
        r7 = r0.f12311f;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x002b;
    L_0x0029:
        monitor-exit(r5);
        return r3;
    L_0x002b:
        r7 = r5.f12330k;	 Catch:{ all -> 0x0074 }
        if (r7 != 0) goto L_0x006b;
    L_0x002f:
        r7 = r5.f12331l;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x006b;
    L_0x0034:
        r7 = r5.f12324e;	 Catch:{ all -> 0x0074 }
        r8 = "DIRTY";
        r7 = r7.mo4550b(r8);	 Catch:{ all -> 0x0074 }
        r8 = 32;
        r7 = r7.mo4568k(r8);	 Catch:{ all -> 0x0074 }
        r7 = r7.mo4550b(r6);	 Catch:{ all -> 0x0074 }
        r8 = 10;
        r7.mo4568k(r8);	 Catch:{ all -> 0x0074 }
        r7 = r5.f12324e;	 Catch:{ all -> 0x0074 }
        r7.flush();	 Catch:{ all -> 0x0074 }
        r7 = r5.f12327h;	 Catch:{ all -> 0x0074 }
        if (r7 == 0) goto L_0x0056;
    L_0x0054:
        monitor-exit(r5);
        return r3;
    L_0x0056:
        if (r0 != 0) goto L_0x0062;
    L_0x0058:
        r0 = new okhttp3.internal.a.d$b;	 Catch:{ all -> 0x0074 }
        r0.<init>(r5, r6);	 Catch:{ all -> 0x0074 }
        r7 = r5.f12325f;	 Catch:{ all -> 0x0074 }
        r7.put(r6, r0);	 Catch:{ all -> 0x0074 }
    L_0x0062:
        r6 = new okhttp3.internal.a.d$a;	 Catch:{ all -> 0x0074 }
        r6.<init>(r5, r0);	 Catch:{ all -> 0x0074 }
        r0.f12311f = r6;	 Catch:{ all -> 0x0074 }
        monitor-exit(r5);
        return r6;
    L_0x006b:
        r6 = r5.f12339u;	 Catch:{ all -> 0x0074 }
        r7 = r5.f12340v;	 Catch:{ all -> 0x0074 }
        r6.execute(r7);	 Catch:{ all -> 0x0074 }
        monitor-exit(r5);
        return r3;
    L_0x0074:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.a(java.lang.String, long):okhttp3.internal.a.d$a");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    synchronized void m14117a(okhttp3.internal.p155a.C2918d.C2915a r10, boolean r11) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r10.f12302a;	 Catch:{ all -> 0x00fc }
        r1 = r0.f12311f;	 Catch:{ all -> 0x00fc }
        if (r1 != r10) goto L_0x00f6;
    L_0x0007:
        r1 = 0;
        if (r11 == 0) goto L_0x0047;
    L_0x000a:
        r2 = r0.f12310e;	 Catch:{ all -> 0x00fc }
        if (r2 != 0) goto L_0x0047;
    L_0x000e:
        r2 = 0;
    L_0x000f:
        r3 = r9.f12323d;	 Catch:{ all -> 0x00fc }
        if (r2 >= r3) goto L_0x0047;
    L_0x0013:
        r3 = r10.f12303b;	 Catch:{ all -> 0x00fc }
        r3 = r3[r2];	 Catch:{ all -> 0x00fc }
        if (r3 == 0) goto L_0x002d;
    L_0x0019:
        r3 = r9.f12321b;	 Catch:{ all -> 0x00fc }
        r4 = r0.f12309d;	 Catch:{ all -> 0x00fc }
        r4 = r4[r2];	 Catch:{ all -> 0x00fc }
        r3 = r3.mo3643e(r4);	 Catch:{ all -> 0x00fc }
        if (r3 != 0) goto L_0x002a;
    L_0x0025:
        r10.m14100c();	 Catch:{ all -> 0x00fc }
        monitor-exit(r9);
        return;
    L_0x002a:
        r2 = r2 + 1;
        goto L_0x000f;
    L_0x002d:
        r10.m14100c();	 Catch:{ all -> 0x00fc }
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00fc }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fc }
        r11.<init>();	 Catch:{ all -> 0x00fc }
        r0 = "Newly created entry didn't create value for index ";
        r11.append(r0);	 Catch:{ all -> 0x00fc }
        r11.append(r2);	 Catch:{ all -> 0x00fc }
        r11 = r11.toString();	 Catch:{ all -> 0x00fc }
        r10.<init>(r11);	 Catch:{ all -> 0x00fc }
        throw r10;	 Catch:{ all -> 0x00fc }
    L_0x0047:
        r10 = r9.f12323d;	 Catch:{ all -> 0x00fc }
        if (r1 >= r10) goto L_0x0080;
    L_0x004b:
        r10 = r0.f12309d;	 Catch:{ all -> 0x00fc }
        r10 = r10[r1];	 Catch:{ all -> 0x00fc }
        if (r11 == 0) goto L_0x0078;
    L_0x0051:
        r2 = r9.f12321b;	 Catch:{ all -> 0x00fc }
        r2 = r2.mo3643e(r10);	 Catch:{ all -> 0x00fc }
        if (r2 == 0) goto L_0x007d;
    L_0x0059:
        r2 = r0.f12308c;	 Catch:{ all -> 0x00fc }
        r2 = r2[r1];	 Catch:{ all -> 0x00fc }
        r3 = r9.f12321b;	 Catch:{ all -> 0x00fc }
        r3.mo3639a(r10, r2);	 Catch:{ all -> 0x00fc }
        r10 = r0.f12307b;	 Catch:{ all -> 0x00fc }
        r3 = r10[r1];	 Catch:{ all -> 0x00fc }
        r10 = r9.f12321b;	 Catch:{ all -> 0x00fc }
        r5 = r10.mo3644f(r2);	 Catch:{ all -> 0x00fc }
        r10 = r0.f12307b;	 Catch:{ all -> 0x00fc }
        r10[r1] = r5;	 Catch:{ all -> 0x00fc }
        r7 = r9.f12337s;	 Catch:{ all -> 0x00fc }
        r10 = 0;
        r7 = r7 - r3;
        r7 = r7 + r5;
        r9.f12337s = r7;	 Catch:{ all -> 0x00fc }
        goto L_0x007d;
    L_0x0078:
        r2 = r9.f12321b;	 Catch:{ all -> 0x00fc }
        r2.mo3642d(r10);	 Catch:{ all -> 0x00fc }
    L_0x007d:
        r1 = r1 + 1;
        goto L_0x0047;
    L_0x0080:
        r10 = r9.f12326g;	 Catch:{ all -> 0x00fc }
        r1 = 1;
        r10 = r10 + r1;
        r9.f12326g = r10;	 Catch:{ all -> 0x00fc }
        r10 = 0;
        r0.f12311f = r10;	 Catch:{ all -> 0x00fc }
        r10 = r0.f12310e;	 Catch:{ all -> 0x00fc }
        r10 = r10 | r11;
        r2 = 10;
        r3 = 32;
        if (r10 == 0) goto L_0x00bc;
    L_0x0092:
        r0.f12310e = r1;	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r1 = "CLEAN";
        r10 = r10.mo4550b(r1);	 Catch:{ all -> 0x00fc }
        r10.mo4568k(r3);	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r1 = r0.f12306a;	 Catch:{ all -> 0x00fc }
        r10.mo4550b(r1);	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r0.m14103a(r10);	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r10.mo4568k(r2);	 Catch:{ all -> 0x00fc }
        if (r11 == 0) goto L_0x00da;
    L_0x00b2:
        r10 = r9.f12338t;	 Catch:{ all -> 0x00fc }
        r1 = 1;
        r1 = r1 + r10;
        r9.f12338t = r1;	 Catch:{ all -> 0x00fc }
        r0.f12312g = r10;	 Catch:{ all -> 0x00fc }
        goto L_0x00da;
    L_0x00bc:
        r10 = r9.f12325f;	 Catch:{ all -> 0x00fc }
        r11 = r0.f12306a;	 Catch:{ all -> 0x00fc }
        r10.remove(r11);	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r11 = "REMOVE";
        r10 = r10.mo4550b(r11);	 Catch:{ all -> 0x00fc }
        r10.mo4568k(r3);	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r11 = r0.f12306a;	 Catch:{ all -> 0x00fc }
        r10.mo4550b(r11);	 Catch:{ all -> 0x00fc }
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r10.mo4568k(r2);	 Catch:{ all -> 0x00fc }
    L_0x00da:
        r10 = r9.f12324e;	 Catch:{ all -> 0x00fc }
        r10.flush();	 Catch:{ all -> 0x00fc }
        r10 = r9.f12337s;	 Catch:{ all -> 0x00fc }
        r0 = r9.f12336r;	 Catch:{ all -> 0x00fc }
        r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x00ed;
    L_0x00e7:
        r10 = r9.m14121c();	 Catch:{ all -> 0x00fc }
        if (r10 == 0) goto L_0x00f4;
    L_0x00ed:
        r10 = r9.f12339u;	 Catch:{ all -> 0x00fc }
        r11 = r9.f12340v;	 Catch:{ all -> 0x00fc }
        r10.execute(r11);	 Catch:{ all -> 0x00fc }
    L_0x00f4:
        monitor-exit(r9);
        return;
    L_0x00f6:
        r10 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x00fc }
        r10.<init>();	 Catch:{ all -> 0x00fc }
        throw r10;	 Catch:{ all -> 0x00fc }
    L_0x00fc:
        r10 = move-exception;
        monitor-exit(r9);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.a(okhttp3.internal.a.d$a, boolean):void");
    }

    /* renamed from: c */
    boolean m14121c() {
        return this.f12326g >= 2000 && this.f12326g >= this.f12325f.size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public synchronized boolean m14122c(java.lang.String r7) {
        /*
        r6 = this;
        monitor-enter(r6);
        r6.m14116a();	 Catch:{ all -> 0x0029 }
        r6.m14113j();	 Catch:{ all -> 0x0029 }
        r6.m14109e(r7);	 Catch:{ all -> 0x0029 }
        r0 = r6.f12325f;	 Catch:{ all -> 0x0029 }
        r7 = r0.get(r7);	 Catch:{ all -> 0x0029 }
        r7 = (okhttp3.internal.p155a.C2918d.C2916b) r7;	 Catch:{ all -> 0x0029 }
        r0 = 0;
        if (r7 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r6);
        return r0;
    L_0x0017:
        r7 = r6.m14118a(r7);	 Catch:{ all -> 0x0029 }
        if (r7 == 0) goto L_0x0027;
    L_0x001d:
        r1 = r6.f12337s;	 Catch:{ all -> 0x0029 }
        r3 = r6.f12336r;	 Catch:{ all -> 0x0029 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 > 0) goto L_0x0027;
    L_0x0025:
        r6.f12330k = r0;	 Catch:{ all -> 0x0029 }
    L_0x0027:
        monitor-exit(r6);
        return r7;
    L_0x0029:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.a.d.c(java.lang.String):boolean");
    }

    /* renamed from: a */
    boolean m14118a(C2916b c2916b) {
        if (c2916b.f12311f != null) {
            c2916b.f12311f.m14098a();
        }
        for (int i = 0; i < this.f12323d; i++) {
            this.f12321b.mo3642d(c2916b.f12308c[i]);
            this.f12337s -= c2916b.f12307b[i];
            c2916b.f12307b[i] = 0;
        }
        this.f12326g++;
        this.f12324e.mo4550b("REMOVE").mo4568k(32).mo4550b(c2916b.f12306a).mo4568k(10);
        this.f12325f.remove(c2916b.f12306a);
        if (m14121c() != null) {
            this.f12339u.execute(this.f12340v);
        }
        return true;
    }

    /* renamed from: d */
    public synchronized boolean m14123d() {
        return this.f12329j;
    }

    /* renamed from: j */
    private synchronized void m14113j() {
        if (m14123d()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public synchronized void flush() {
        if (this.f12328i) {
            m14113j();
            m14124e();
            this.f12324e.flush();
        }
    }

    public synchronized void close() {
        if (this.f12328i) {
            if (!this.f12329j) {
                for (C2916b c2916b : (C2916b[]) this.f12325f.values().toArray(new C2916b[this.f12325f.size()])) {
                    if (c2916b.f12311f != null) {
                        c2916b.f12311f.m14100c();
                    }
                }
                m14124e();
                this.f12324e.close();
                this.f12324e = null;
                this.f12329j = true;
                return;
            }
        }
        this.f12329j = true;
    }

    /* renamed from: e */
    void m14124e() {
        while (this.f12337s > this.f12336r) {
            m14118a((C2916b) this.f12325f.values().iterator().next());
        }
        this.f12330k = false;
    }

    /* renamed from: f */
    public void m14125f() {
        close();
        this.f12321b.mo3645g(this.f12322c);
    }

    /* renamed from: e */
    private void m14109e(String str) {
        if (!f12319a.matcher(str).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            stringBuilder.append(str);
            stringBuilder.append("\"");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
