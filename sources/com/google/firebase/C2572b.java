package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.C0389b;
import android.support.v4.p017f.C3131a;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.C2577a;
import com.google.firebase.components.C2577a.C25751;
import com.google.firebase.components.C4722j;
import com.google.firebase.p137b.C2570c;
import com.google.firebase.p171d.C4194a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.b */
public class C2572b {
    @GuardedBy("LOCK")
    /* renamed from: a */
    static final Map<String, C2572b> f10922a = new C3131a();
    /* renamed from: b */
    private static final List<String> f10923b = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});
    /* renamed from: c */
    private static final List<String> f10924c = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");
    /* renamed from: d */
    private static final List<String> f10925d = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});
    /* renamed from: e */
    private static final List<String> f10926e = Arrays.asList(new String[0]);
    /* renamed from: f */
    private static final Set<String> f10927f = Collections.emptySet();
    /* renamed from: g */
    private static final Object f10928g = new Object();
    /* renamed from: h */
    private static final Executor f10929h = new C2566d();
    /* renamed from: i */
    private final Context f10930i;
    /* renamed from: j */
    private final String f10931j;
    /* renamed from: k */
    private final C2574c f10932k;
    /* renamed from: l */
    private final C4722j f10933l;
    /* renamed from: m */
    private final SharedPreferences f10934m;
    /* renamed from: n */
    private final C2570c f10935n;
    /* renamed from: o */
    private final AtomicBoolean f10936o = new AtomicBoolean(false);
    /* renamed from: p */
    private final AtomicBoolean f10937p = new AtomicBoolean();
    /* renamed from: q */
    private final AtomicBoolean f10938q;
    /* renamed from: r */
    private final List<Object> f10939r = new CopyOnWriteArrayList();
    /* renamed from: s */
    private final List<C2564a> f10940s = new CopyOnWriteArrayList();
    /* renamed from: t */
    private final List<Object> f10941t = new CopyOnWriteArrayList();
    /* renamed from: u */
    private C2565b f10942u;

    @KeepForSdk
    /* renamed from: com.google.firebase.b$a */
    public interface C2564a {
        @KeepForSdk
        /* renamed from: a */
        void m12586a(boolean z);
    }

    @KeepForSdk
    @Deprecated
    /* renamed from: com.google.firebase.b$b */
    public interface C2565b {
    }

    /* renamed from: com.google.firebase.b$d */
    static class C2566d implements Executor {
        /* renamed from: a */
        private static final Handler f10917a = new Handler(Looper.getMainLooper());

        private C2566d() {
        }

        public final void execute(Runnable runnable) {
            f10917a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.b$e */
    static class C2567e extends BroadcastReceiver {
        /* renamed from: a */
        private static AtomicReference<C2567e> f10918a = new AtomicReference();
        /* renamed from: b */
        private final Context f10919b;

        private C2567e(Context context) {
            this.f10919b = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (C2572b.f10928g) {
                for (C2572b a : C2572b.f10922a.values()) {
                    a.m12606j();
                }
            }
            this.f10919b.unregisterReceiver(this);
        }

        /* renamed from: a */
        static /* synthetic */ void m12587a(Context context) {
            if (f10918a.get() == null) {
                BroadcastReceiver c2567e = new C2567e(context);
                if (f10918a.compareAndSet(null, c2567e)) {
                    context.registerReceiver(c2567e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.b$c */
    static class C4186c implements BackgroundStateChangeListener {
        /* renamed from: a */
        private static AtomicReference<C4186c> f17708a = new AtomicReference();

        private C4186c() {
        }

        public final void onBackgroundStateChanged(boolean z) {
            synchronized (C2572b.f10928g) {
                Iterator it = new ArrayList(C2572b.f10922a.values()).iterator();
                while (it.hasNext()) {
                    C2572b c2572b = (C2572b) it.next();
                    if (c2572b.f10936o.get()) {
                        c2572b.m12599a(z);
                    }
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m23028a(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich()) {
                if (context.getApplicationContext() instanceof Application) {
                    Application application = (Application) context.getApplicationContext();
                    if (f17708a.get() == null) {
                        BackgroundStateChangeListener c4186c = new C4186c();
                        if (f17708a.compareAndSet(null, c4186c)) {
                            BackgroundDetector.initialize(application);
                            BackgroundDetector.getInstance().addListener(c4186c);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Context m12607a() {
        m12605i();
        return this.f10930i;
    }

    /* renamed from: b */
    public String m12609b() {
        m12605i();
        return this.f10931j;
    }

    /* renamed from: c */
    public C2574c m12610c() {
        m12605i();
        return this.f10932k;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2572b) {
            return this.f10931j.equals(((C2572b) obj).m12609b());
        }
        return null;
    }

    public int hashCode() {
        return this.f10931j.hashCode();
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f10931j).add("options", this.f10932k).toString();
    }

    /* renamed from: a */
    public static List<C2572b> m12595a(Context context) {
        List arrayList;
        synchronized (f10928g) {
            arrayList = new ArrayList(f10922a.values());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static C2572b m12602d() {
        C2572b c2572b;
        synchronized (f10928g) {
            c2572b = (C2572b) f10922a.get("[DEFAULT]");
            if (c2572b != null) {
            } else {
                StringBuilder stringBuilder = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                stringBuilder.append(ProcessUtils.getMyProcessName());
                stringBuilder.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return c2572b;
    }

    /* renamed from: b */
    public static C2572b m12600b(Context context) {
        synchronized (f10928g) {
            if (f10922a.containsKey("[DEFAULT]")) {
                context = C2572b.m12602d();
                return context;
            }
            C2574c a = C2574c.m12614a(context);
            if (a == null) {
                Log.d("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            context = C2572b.m12593a(context, a);
            return context;
        }
    }

    /* renamed from: a */
    public static C2572b m12593a(Context context, C2574c c2574c) {
        return C2572b.m12594a(context, c2574c, "[DEFAULT]");
    }

    /* renamed from: a */
    public static C2572b m12594a(Context context, C2574c c2574c, String str) {
        C2572b c2572b;
        C4186c.m23028a(context);
        str = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f10928g) {
            boolean containsKey = f10922a.containsKey(str) ^ 1;
            StringBuilder stringBuilder = new StringBuilder("FirebaseApp name ");
            stringBuilder.append(str);
            stringBuilder.append(" already exists!");
            Preconditions.checkState(containsKey, stringBuilder.toString());
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c2572b = new C2572b(context, str, c2574c);
            f10922a.put(str, c2572b);
        }
        c2572b.m12606j();
        return c2572b;
    }

    @KeepForSdk
    /* renamed from: a */
    public <T> T m12608a(Class<T> cls) {
        m12605i();
        return this.f10933l.mo3312a((Class) cls);
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean m12611e() {
        m12605i();
        return this.f10938q.get();
    }

    private C2572b(Context context, String str, C2574c c2574c) {
        this.f10930i = (Context) Preconditions.checkNotNull(context);
        this.f10931j = Preconditions.checkNotEmpty(str);
        this.f10932k = (C2574c) Preconditions.checkNotNull(c2574c);
        this.f10942u = new C4194a();
        this.f10934m = context.getSharedPreferences("com.google.firebase.common.prefs", 0);
        this.f10938q = new AtomicBoolean(m12604h());
        str = C25751.m12617a(context).m12621a();
        this.f10933l = new C4722j(f10929h, str, C2577a.m12630a(context, Context.class, new Class[0]), C2577a.m12630a(this, C2572b.class, new Class[0]), C2577a.m12630a(c2574c, C2574c.class, new Class[0]));
        this.f10935n = (C2570c) this.f10933l.mo3312a(C2570c.class);
    }

    /* renamed from: h */
    private boolean m12604h() {
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
        r4 = this;
        r0 = r4.f10934m;
        r1 = "firebase_data_collection_default_enabled";
        r0 = r0.contains(r1);
        r1 = 1;
        if (r0 == 0) goto L_0x0014;
    L_0x000b:
        r0 = r4.f10934m;
        r2 = "firebase_data_collection_default_enabled";
        r0 = r0.getBoolean(r2, r1);
        return r0;
    L_0x0014:
        r0 = r4.f10930i;	 Catch:{ NameNotFoundException -> 0x0041 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0041 }
        if (r0 == 0) goto L_0x0041;	 Catch:{ NameNotFoundException -> 0x0041 }
    L_0x001c:
        r2 = r4.f10930i;	 Catch:{ NameNotFoundException -> 0x0041 }
        r2 = r2.getPackageName();	 Catch:{ NameNotFoundException -> 0x0041 }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0041 }
        r0 = r0.getApplicationInfo(r2, r3);	 Catch:{ NameNotFoundException -> 0x0041 }
        if (r0 == 0) goto L_0x0041;	 Catch:{ NameNotFoundException -> 0x0041 }
    L_0x002a:
        r2 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0041 }
        if (r2 == 0) goto L_0x0041;	 Catch:{ NameNotFoundException -> 0x0041 }
    L_0x002e:
        r2 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0041 }
        r3 = "firebase_data_collection_default_enabled";	 Catch:{ NameNotFoundException -> 0x0041 }
        r2 = r2.containsKey(r3);	 Catch:{ NameNotFoundException -> 0x0041 }
        if (r2 == 0) goto L_0x0041;	 Catch:{ NameNotFoundException -> 0x0041 }
    L_0x0038:
        r0 = r0.metaData;	 Catch:{ NameNotFoundException -> 0x0041 }
        r2 = "firebase_data_collection_default_enabled";	 Catch:{ NameNotFoundException -> 0x0041 }
        r0 = r0.getBoolean(r2);	 Catch:{ NameNotFoundException -> 0x0041 }
        return r0;
    L_0x0041:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.b.h():boolean");
    }

    /* renamed from: i */
    private void m12605i() {
        Preconditions.checkState(this.f10937p.get() ^ 1, "FirebaseApp was deleted");
    }

    @KeepForSdk
    /* renamed from: f */
    public boolean m12612f() {
        return "[DEFAULT]".equals(m12609b());
    }

    /* renamed from: a */
    private void m12599a(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C2564a a : this.f10940s) {
            a.m12586a(z);
        }
    }

    /* renamed from: j */
    private void m12606j() {
        boolean c = C0389b.m1439c(this.f10930i);
        if (c) {
            C2567e.m12587a(this.f10930i);
        } else {
            this.f10933l.m27418a(m12612f());
        }
        C2572b.m12598a(C2572b.class, this, f10923b, c);
        if (m12612f()) {
            C2572b.m12598a(C2572b.class, this, f10924c, c);
            C2572b.m12598a(Context.class, this.f10930i, f10925d, c);
        }
    }

    /* renamed from: a */
    private static <T> void m12598a(java.lang.Class<T> r6, T r7, java.lang.Iterable<java.lang.String> r8, boolean r9) {
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
        r8 = r8.iterator();
    L_0x0004:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x00b4;
    L_0x000a:
        r0 = r8.next();
        r0 = (java.lang.String) r0;
        if (r9 == 0) goto L_0x0021;
    L_0x0012:
        r1 = f10926e;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r1 = r1.contains(r0);	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        if (r1 == 0) goto L_0x0004;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
    L_0x001a:
        goto L_0x0021;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
    L_0x001b:
        r1 = move-exception;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        goto L_0x004a;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
    L_0x001d:
        r0 = move-exception;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        goto L_0x005e;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        goto L_0x007d;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
    L_0x0021:
        r1 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r2 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r3 = 1;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r4 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r5 = 0;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r4[r5] = r6;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r1 = r1.getMethod(r2, r4);	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r2 = r1.getModifiers();	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r4 = java.lang.reflect.Modifier.isPublic(r2);	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        if (r4 == 0) goto L_0x0004;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
    L_0x003b:
        r2 = java.lang.reflect.Modifier.isStatic(r2);	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        if (r2 == 0) goto L_0x0004;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
    L_0x0041:
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r3 = new java.lang.Object[r3];	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r3[r5] = r7;	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        r1.invoke(r2, r3);	 Catch:{ ClassNotFoundException -> 0x001f, NoSuchMethodException -> 0x0066, InvocationTargetException -> 0x001d, IllegalAccessException -> 0x001b }
        goto L_0x0004;
    L_0x004a:
        r2 = "FirebaseApp";
        r3 = new java.lang.StringBuilder;
        r4 = "Failed to initialize ";
        r3.<init>(r4);
        r3.append(r0);
        r0 = r3.toString();
        android.util.Log.wtf(r2, r0, r1);
        goto L_0x0004;
    L_0x005e:
        r1 = "FirebaseApp";
        r2 = "Firebase API initialization failure.";
        android.util.Log.wtf(r1, r2, r0);
        goto L_0x0004;
    L_0x0066:
        r6 = new java.lang.IllegalStateException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r0);
        r8 = "#getInstance has been removed by Proguard. Add keep rule to prevent it.";
        r7.append(r8);
        r7 = r7.toString();
        r6.<init>(r7);
        throw r6;
    L_0x007d:
        r1 = f10927f;
        r1 = r1.contains(r0);
        if (r1 != 0) goto L_0x009d;
    L_0x0085:
        r1 = "FirebaseApp";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r2.append(r0);
        r0 = " is not linked. Skipping initialization.";
        r2.append(r0);
        r0 = r2.toString();
        android.util.Log.d(r1, r0);
        goto L_0x0004;
    L_0x009d:
        r6 = new java.lang.IllegalStateException;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r0);
        r8 = " is missing, but is required. Check if it has been removed by Proguard.";
        r7.append(r8);
        r7 = r7.toString();
        r6.<init>(r7);
        throw r6;
    L_0x00b4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.b.a(java.lang.Class, java.lang.Object, java.lang.Iterable, boolean):void");
    }
}
