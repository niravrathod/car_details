package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.Looper;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.C2560a;
import com.google.firebase.C2572b;
import com.google.firebase.p137b.C2569b;
import com.google.firebase.p137b.C2571d;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId {
    /* renamed from: a */
    private static final long f10975a = TimeUnit.HOURS.toSeconds(8);
    /* renamed from: b */
    private static C2604x f10976b;
    @GuardedBy("FirebaseInstanceId.class")
    @VisibleForTesting
    /* renamed from: c */
    private static ScheduledThreadPoolExecutor f10977c;
    /* renamed from: d */
    private final Executor f10978d;
    /* renamed from: e */
    private final C2572b f10979e;
    /* renamed from: f */
    private final C2599o f10980f;
    /* renamed from: g */
    private C2588b f10981g;
    /* renamed from: h */
    private final C2600r f10982h;
    /* renamed from: i */
    private final ab f10983i;
    @GuardedBy("this")
    /* renamed from: j */
    private boolean f10984j;
    /* renamed from: k */
    private final C2585a f10985k;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    private class C2585a {
        /* renamed from: a */
        final /* synthetic */ FirebaseInstanceId f10970a;
        /* renamed from: b */
        private final boolean f10971b = m12655c();
        /* renamed from: c */
        private final C2571d f10972c;
        @GuardedBy("this")
        /* renamed from: d */
        private C2569b<C2560a> f10973d;
        @GuardedBy("this")
        /* renamed from: e */
        private Boolean f10974e = m12654b();

        C2585a(FirebaseInstanceId firebaseInstanceId, C2571d c2571d) {
            this.f10970a = firebaseInstanceId;
            this.f10972c = c2571d;
            if (this.f10974e == null && this.f10971b != null) {
                this.f10973d = new ap(this);
                c2571d.mo3314a(C2560a.class, this.f10973d);
            }
        }

        /* renamed from: a */
        final synchronized boolean m12656a() {
            if (this.f10974e == null) {
                return this.f10971b && this.f10970a.f10979e.m12611e();
            } else {
                return this.f10974e.booleanValue();
            }
        }

        /* renamed from: b */
        private final java.lang.Boolean m12654b() {
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
            r0 = r4.f10970a;
            r0 = r0.f10979e;
            r0 = r0.m12607a();
            r1 = "com.google.firebase.messaging";
            r2 = 0;
            r1 = r0.getSharedPreferences(r1, r2);
            r3 = "auto_init";
            r3 = r1.contains(r3);
            if (r3 == 0) goto L_0x0024;
        L_0x0019:
            r0 = "auto_init";
            r0 = r1.getBoolean(r0, r2);
            r0 = java.lang.Boolean.valueOf(r0);
            return r0;
        L_0x0024:
            r1 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0051 }
            if (r1 == 0) goto L_0x0051;	 Catch:{ NameNotFoundException -> 0x0051 }
        L_0x002a:
            r0 = r0.getPackageName();	 Catch:{ NameNotFoundException -> 0x0051 }
            r2 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0051 }
            r0 = r1.getApplicationInfo(r0, r2);	 Catch:{ NameNotFoundException -> 0x0051 }
            if (r0 == 0) goto L_0x0051;	 Catch:{ NameNotFoundException -> 0x0051 }
        L_0x0036:
            r1 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0051 }
            if (r1 == 0) goto L_0x0051;	 Catch:{ NameNotFoundException -> 0x0051 }
        L_0x003a:
            r1 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0051 }
            r2 = "firebase_messaging_auto_init_enabled";	 Catch:{ NameNotFoundException -> 0x0051 }
            r1 = r1.containsKey(r2);	 Catch:{ NameNotFoundException -> 0x0051 }
            if (r1 == 0) goto L_0x0051;	 Catch:{ NameNotFoundException -> 0x0051 }
        L_0x0044:
            r0 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0051 }
            r1 = "firebase_messaging_auto_init_enabled";	 Catch:{ NameNotFoundException -> 0x0051 }
            r0 = r0.getBoolean(r1);	 Catch:{ NameNotFoundException -> 0x0051 }
            r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ NameNotFoundException -> 0x0051 }
            return r0;
        L_0x0051:
            r0 = 0;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.b():java.lang.Boolean");
        }

        /* renamed from: c */
        private final boolean m12655c() {
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
            r0 = 1;
            r1 = "com.google.firebase.messaging.a";	 Catch:{ ClassNotFoundException -> 0x0007 }
            java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0007 }
            return r0;
        L_0x0007:
            r1 = r4.f10970a;
            r1 = r1.f10979e;
            r1 = r1.m12607a();
            r2 = new android.content.Intent;
            r3 = "com.google.firebase.MESSAGING_EVENT";
            r2.<init>(r3);
            r3 = r1.getPackageName();
            r2.setPackage(r3);
            r1 = r1.getPackageManager();
            r3 = 0;
            r1 = r1.resolveService(r2, r3);
            if (r1 == 0) goto L_0x002f;
        L_0x002a:
            r1 = r1.serviceInfo;
            if (r1 == 0) goto L_0x002f;
        L_0x002e:
            return r0;
        L_0x002f:
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.c():boolean");
        }
    }

    /* renamed from: a */
    public static FirebaseInstanceId m12658a() {
        return getInstance(C2572b.m12602d());
    }

    @Keep
    public static synchronized FirebaseInstanceId getInstance(C2572b c2572b) {
        FirebaseInstanceId firebaseInstanceId;
        synchronized (FirebaseInstanceId.class) {
            firebaseInstanceId = (FirebaseInstanceId) c2572b.m12608a(FirebaseInstanceId.class);
        }
        return firebaseInstanceId;
    }

    FirebaseInstanceId(C2572b c2572b, C2571d c2571d) {
        this(c2572b, new C2599o(c2572b.m12607a()), ai.m12702b(), ai.m12702b(), c2571d);
    }

    private FirebaseInstanceId(C2572b c2572b, C2599o c2599o, Executor executor, Executor executor2, C2571d c2571d) {
        this.f10984j = false;
        if (C2599o.m12755a(c2572b) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f10976b == null) {
                    f10976b = new C2604x(c2572b.m12607a());
                }
            }
            this.f10979e = c2572b;
            this.f10980f = c2599o;
            if (this.f10981g == null) {
                C2588b c2588b = (C2588b) c2572b.m12608a(C2588b.class);
                if (c2588b == null || !c2588b.mo3325b()) {
                    this.f10981g = new aq(c2572b, c2599o, executor);
                } else {
                    this.f10981g = c2588b;
                }
            }
            this.f10981g = this.f10981g;
            this.f10978d = executor2;
            this.f10983i = new ab(f10976b);
            this.f10985k = new C2585a(this, c2571d);
            this.f10982h = new C2600r(executor);
            if (this.f10985k.m12656a() != null) {
                m12666m();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: m */
    private final void m12666m() {
        C2605y e = m12680e();
        if (!m12684j() || e == null || e.m12794b(this.f10980f.m12759b()) || this.f10983i.m12692a()) {
            m12667n();
        }
    }

    /* renamed from: b */
    final C2572b m12676b() {
        return this.f10979e;
    }

    /* renamed from: a */
    final synchronized void m12675a(boolean z) {
        this.f10984j = z;
    }

    /* renamed from: n */
    private final synchronized void m12667n() {
        if (!this.f10984j) {
            m12671a(0);
        }
    }

    /* renamed from: a */
    final synchronized void m12671a(long j) {
        m12660a(new C2606z(this, this.f10980f, this.f10983i, Math.min(Math.max(30, j << 1), f10975a)), j);
        this.f10984j = true;
    }

    /* renamed from: a */
    static void m12660a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f10977c == null) {
                f10977c = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            f10977c.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: c */
    public String m12678c() {
        m12666m();
        return m12668o();
    }

    /* renamed from: o */
    private static String m12668o() {
        return C2599o.m12756a(f10976b.m12788b("").m12727a());
    }

    /* renamed from: b */
    private final Task<C2587a> m12661b(String str, String str2) {
        String c = m12664c(str2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f10978d.execute(new am(this, str, str2, taskCompletionSource, c));
        return taskCompletionSource.m12417a();
    }

    @Deprecated
    /* renamed from: d */
    public String m12679d() {
        C2605y e = m12680e();
        if (e == null || e.m12794b(this.f10980f.m12759b())) {
            m12667n();
        }
        return e != null ? e.f11068a : null;
    }

    /* renamed from: e */
    final C2605y m12680e() {
        return m12663c(C2599o.m12755a(this.f10979e), "*");
    }

    @VisibleForTesting
    /* renamed from: c */
    private static C2605y m12663c(String str, String str2) {
        return f10976b.m12784a("", str, str2);
    }

    /* renamed from: f */
    final String m12681f() {
        return m12670a(C2599o.m12755a(this.f10979e), "*");
    }

    /* renamed from: a */
    public String m12670a(String str, String str2) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C2587a) m12659a(m12661b(str, str2))).mo3327a();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: a */
    private final <T> T m12659a(com.google.android.gms.tasks.Task<T> r4) {
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
        r3 = this;
        r0 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ ExecutionException -> 0x0011, InterruptedException -> 0x0009, InterruptedException -> 0x0009 }
        r4 = com.google.android.gms.tasks.Tasks.m12424a(r4, r0, r2);	 Catch:{ ExecutionException -> 0x0011, InterruptedException -> 0x0009, InterruptedException -> 0x0009 }
        return r4;
    L_0x0009:
        r4 = new java.io.IOException;
        r0 = "SERVICE_NOT_AVAILABLE";
        r4.<init>(r0);
        throw r4;
    L_0x0011:
        r4 = move-exception;
        r0 = r4.getCause();
        r1 = r0 instanceof java.io.IOException;
        if (r1 == 0) goto L_0x002c;
    L_0x001a:
        r4 = "INSTANCE_ID_RESET";
        r1 = r0.getMessage();
        r4 = r4.equals(r1);
        if (r4 == 0) goto L_0x0029;
    L_0x0026:
        r3.m12682h();
    L_0x0029:
        r0 = (java.io.IOException) r0;
        throw r0;
    L_0x002c:
        r1 = r0 instanceof java.lang.RuntimeException;
        if (r1 == 0) goto L_0x0033;
    L_0x0030:
        r0 = (java.lang.RuntimeException) r0;
        throw r0;
    L_0x0033:
        r0 = new java.io.IOException;
        r0.<init>(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a(com.google.android.gms.tasks.Task):T");
    }

    /* renamed from: a */
    final void m12672a(String str) {
        C2605y e = m12680e();
        if (e == null || e.m12794b(this.f10980f.m12759b())) {
            throw new IOException("token not available");
        }
        m12659a(this.f10981g.mo3321a(m12668o(), e.f11068a, str));
    }

    /* renamed from: b */
    final void m12677b(String str) {
        C2605y e = m12680e();
        if (e == null || e.m12794b(this.f10980f.m12759b())) {
            throw new IOException("token not available");
        }
        m12659a(this.f10981g.mo3324b(m12668o(), e.f11068a, str));
    }

    /* renamed from: g */
    static boolean m12665g() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            if (VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", 3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    final synchronized void m12682h() {
        f10976b.m12789b();
        if (this.f10985k.m12656a()) {
            m12667n();
        }
    }

    /* renamed from: i */
    final boolean m12683i() {
        return this.f10981g.mo3325b();
    }

    /* renamed from: j */
    final boolean m12684j() {
        return this.f10981g.mo3323a();
    }

    /* renamed from: k */
    final void m12685k() {
        m12659a(this.f10981g.mo3320a(m12668o(), C2605y.m12792a(m12680e())));
    }

    /* renamed from: l */
    final void m12686l() {
        f10976b.m12790c("");
        m12667n();
    }

    /* renamed from: c */
    private static String m12664c(String str) {
        if (!(str.isEmpty() || str.equalsIgnoreCase("fcm"))) {
            if (!str.equalsIgnoreCase("gcm")) {
                return str;
            }
        }
        return "*";
    }

    /* renamed from: a */
    final /* synthetic */ void m12673a(String str, String str2, TaskCompletionSource taskCompletionSource, String str3) {
        String o = m12668o();
        C2605y c = m12663c(str, str2);
        if (c == null || c.m12794b(this.f10980f.m12759b())) {
            this.f10982h.m12763a(str, str3, new an(this, o, C2605y.m12792a(c), str, str3)).mo3210a(this.f10978d, new ao(this, str, str3, taskCompletionSource, o));
            return;
        }
        taskCompletionSource.m12419a(new aw(o, c.f11068a));
    }

    /* renamed from: a */
    final /* synthetic */ void m12674a(String str, String str2, TaskCompletionSource taskCompletionSource, String str3, Task task) {
        if (task.mo3216b()) {
            String str4 = (String) task.mo3218d();
            f10976b.m12787a("", str, str2, str4, this.f10980f.m12759b());
            taskCompletionSource.m12419a(new aw(str3, str4));
            return;
        }
        taskCompletionSource.m12418a(task.mo3219e());
    }

    /* renamed from: a */
    final /* synthetic */ Task m12669a(String str, String str2, String str3, String str4) {
        return this.f10981g.mo3322a(str, str2, str3, str4);
    }
}
