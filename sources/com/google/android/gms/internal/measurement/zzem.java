package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class zzem {
    /* renamed from: b */
    private static volatile zzem f10139b;
    /* renamed from: a */
    protected final Clock f10140a;
    /* renamed from: c */
    private final String f10141c;
    /* renamed from: d */
    private final ExecutorService f10142d;
    /* renamed from: e */
    private final AppMeasurementSdk f10143e;
    /* renamed from: f */
    private Map<OnEventListener, Object> f10144f;
    /* renamed from: g */
    private int f10145g;
    /* renamed from: h */
    private boolean f10146h;
    /* renamed from: i */
    private String f10147i;
    /* renamed from: j */
    private zzdz f10148j;

    /* renamed from: com.google.android.gms.internal.measurement.zzem$b */
    abstract class C2472b implements Runnable {
        /* renamed from: a */
        final long f10134a;
        /* renamed from: b */
        final long f10135b;
        /* renamed from: c */
        private final boolean f10136c;
        /* renamed from: d */
        private final /* synthetic */ zzem f10137d;

        C2472b(zzem zzem) {
            this(zzem, true);
        }

        /* renamed from: a */
        protected void mo3053a() {
        }

        /* renamed from: b */
        abstract void mo2919b();

        C2472b(zzem zzem, boolean z) {
            this.f10137d = zzem;
            this.f10134a = zzem.f10140a.currentTimeMillis();
            this.f10135b = zzem.f10140a.elapsedRealtime();
            this.f10136c = z;
        }

        public void run() {
            if (this.f10137d.f10146h) {
                mo3053a();
                return;
            }
            try {
                mo2919b();
            } catch (Exception e) {
                this.f10137d.m11913a(e, false, this.f10136c);
                mo3053a();
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzem$c */
    class C2473c implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        final /* synthetic */ zzem f10138a;

        C2473c(zzem zzem) {
            this.f10138a = zzem;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            this.f10138a.m11910a(new C4128s(this, activity, bundle));
        }

        public final void onActivityStarted(Activity activity) {
            this.f10138a.m11910a(new C4129t(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            this.f10138a.m11910a(new C4130u(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            this.f10138a.m11910a(new C4131v(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            this.f10138a.m11910a(new C4132w(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C4708a c4708a = new C4708a(this.f10138a);
            this.f10138a.m11910a(new C4133x(this, activity, c4708a));
            activity = c4708a.m27099e(50);
            if (activity != null) {
                bundle.putAll(activity);
            }
        }

        public final void onActivityDestroyed(Activity activity) {
            this.f10138a.m11910a(new C4134y(this, activity));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.zzem$a */
    class C4708a extends zzed {
        /* renamed from: a */
        private final AtomicReference<Bundle> f20526a = new AtomicReference();
        /* renamed from: b */
        private boolean f20527b;
        /* renamed from: c */
        private final /* synthetic */ zzem f20528c;

        C4708a(zzem zzem) {
            this.f20528c = zzem;
        }

        /* renamed from: a */
        public final void mo3150a(Bundle bundle) {
            synchronized (this.f20526a) {
                try {
                    this.f20526a.set(bundle);
                    this.f20527b = true;
                    this.f20526a.notify();
                } catch (Throwable th) {
                    this.f20526a.notify();
                }
            }
        }

        /* renamed from: a */
        final String m27094a(long j) {
            return (String) m27092a(m27093f(j), String.class);
        }

        /* renamed from: b */
        final <T extends Parcelable> List<T> m27096b(long j) {
            return (List) m27092a(m27093f(5000), List.class);
        }

        /* renamed from: c */
        final Long m27097c(long j) {
            return (Long) m27092a(m27093f(500), Long.class);
        }

        /* renamed from: d */
        final Integer m27098d(long j) {
            return (Integer) m27092a(m27093f(10000), Integer.class);
        }

        /* renamed from: e */
        final Bundle m27099e(long j) {
            return m27093f(j);
        }

        /* renamed from: f */
        private final android.os.Bundle m27093f(long r3) {
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
            r2 = this;
            r0 = r2.f20526a;
            monitor-enter(r0);
            r1 = r2.f20527b;	 Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0010;
        L_0x0007:
            r1 = r2.f20526a;	 Catch:{ InterruptedException -> 0x000d }
            r1.wait(r3);	 Catch:{ InterruptedException -> 0x000d }
            goto L_0x0010;
        L_0x000d:
            r3 = 0;
            monitor-exit(r0);	 Catch:{ all -> 0x001a }
            return r3;	 Catch:{ all -> 0x001a }
        L_0x0010:
            r3 = r2.f20526a;	 Catch:{ all -> 0x001a }
            r3 = r3.get();	 Catch:{ all -> 0x001a }
            r3 = (android.os.Bundle) r3;	 Catch:{ all -> 0x001a }
            monitor-exit(r0);	 Catch:{ all -> 0x001a }
            return r3;	 Catch:{ all -> 0x001a }
        L_0x001a:
            r3 = move-exception;	 Catch:{ all -> 0x001a }
            monitor-exit(r0);	 Catch:{ all -> 0x001a }
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzem.a.f(long):android.os.Bundle");
        }

        /* renamed from: a */
        private final <T> T m27092a(Bundle bundle, Class<T> cls) {
            if (bundle == null) {
                return null;
            }
            bundle = bundle.get("r");
            if (bundle == null) {
                return null;
            }
            try {
                return cls.cast(bundle);
            } catch (Throwable e) {
                String str = "Unexpected object type. Expected, Received";
                this.f20528c.m11931a(5, str, (Object) cls.getCanonicalName(), (Object) bundle.getClass().getCanonicalName(), (Object) e);
                Log.w(this.f20528c.f10141c, String.format(String.valueOf(str).concat(": %s, %s"), new Object[]{cls, bundle}), e);
                throw e;
            }
        }
    }

    /* renamed from: a */
    public static zzem m11908a(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (f10139b == null) {
            synchronized (zzem.class) {
                if (f10139b == null) {
                    f10139b = new zzem(context, str, str2, str3, bundle);
                }
            }
        }
        return f10139b;
    }

    /* renamed from: a */
    public final AppMeasurementSdk m11928a() {
        return this.f10143e;
    }

    private zzem(Context context, String str, String str2, String str3, Bundle bundle) {
        Application application;
        int i;
        if (str != null) {
            if (m11919b(str2, str3)) {
                this.f10141c = str;
                this.f10140a = DefaultClock.getInstance();
                this.f10142d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
                application = (Application) context.getApplicationContext();
                if (application != null) {
                    Log.w(this.f10141c, "Unable to register lifecycle notifications. Application null.");
                } else {
                    application.registerActivityLifecycleCallbacks(new C2473c(this));
                }
                this.f10143e = new AppMeasurementSdk(this);
                i = 0;
                if (m11922d(context) != null) {
                    if (m11925h() != null) {
                        str = null;
                        if (str != null) {
                            this.f10147i = null;
                            this.f10146h = true;
                            Log.w(this.f10141c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                        }
                        if (m11919b(str2, str3) != null) {
                            this.f10147i = "fa";
                            if (str2 != null || str3 == null) {
                                str = str2 != null ? true : null;
                                if (str3 == null) {
                                    i = 1;
                                }
                                if ((str ^ i) != null) {
                                    Log.w(this.f10141c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                                }
                            } else {
                                Log.v(this.f10141c, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
                                this.f10146h = true;
                                return;
                            }
                        }
                        this.f10147i = str2;
                        m11910a(new C4107a(this, context, str2, str3, bundle));
                        return;
                    }
                }
                str = true;
                if (str != null) {
                    if (m11919b(str2, str3) != null) {
                        this.f10147i = str2;
                    } else {
                        this.f10147i = "fa";
                        if (str2 != null) {
                        }
                        if (str2 != null) {
                        }
                        if (str3 == null) {
                            i = 1;
                        }
                        if ((str ^ i) != null) {
                            Log.w(this.f10141c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                        }
                    }
                    m11910a(new C4107a(this, context, str2, str3, bundle));
                    return;
                }
                this.f10147i = null;
                this.f10146h = true;
                Log.w(this.f10141c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            }
        }
        this.f10141c = "FA";
        this.f10140a = DefaultClock.getInstance();
        this.f10142d = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new C2473c(this));
        } else {
            Log.w(this.f10141c, "Unable to register lifecycle notifications. Application null.");
        }
        this.f10143e = new AppMeasurementSdk(this);
        i = 0;
        if (m11922d(context) != null) {
            if (m11925h() != null) {
                str = null;
                if (str != null) {
                    this.f10147i = null;
                    this.f10146h = true;
                    Log.w(this.f10141c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                }
                if (m11919b(str2, str3) != null) {
                    this.f10147i = "fa";
                    if (str2 != null) {
                    }
                    if (str2 != null) {
                    }
                    if (str3 == null) {
                        i = 1;
                    }
                    if ((str ^ i) != null) {
                        Log.w(this.f10141c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                    }
                } else {
                    this.f10147i = str2;
                }
                m11910a(new C4107a(this, context, str2, str3, bundle));
                return;
            }
        }
        str = true;
        if (str != null) {
            if (m11919b(str2, str3) != null) {
                this.f10147i = str2;
            } else {
                this.f10147i = "fa";
                if (str2 != null) {
                }
                if (str2 != null) {
                }
                if (str3 == null) {
                    i = 1;
                }
                if ((str ^ i) != null) {
                    Log.w(this.f10141c, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
            m11910a(new C4107a(this, context, str2, str3, bundle));
            return;
        }
        this.f10147i = null;
        this.f10146h = true;
        Log.w(this.f10141c, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
    }

    /* renamed from: d */
    private static boolean m11922d(android.content.Context r1) {
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
        r0 = 0;
        com.google.android.gms.common.api.internal.GoogleServices.initialize(r1);	 Catch:{ IllegalStateException -> 0x000d }
        r1 = com.google.android.gms.common.api.internal.GoogleServices.getGoogleAppId();	 Catch:{ IllegalStateException -> 0x000d }
        if (r1 == 0) goto L_0x000c;
    L_0x000a:
        r1 = 1;
        return r1;
    L_0x000c:
        return r0;
    L_0x000d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzem.d(android.content.Context):boolean");
    }

    /* renamed from: b */
    private static boolean m11919b(String str, String str2) {
        return (str2 == null || str == null || m11925h() != null) ? null : true;
    }

    /* renamed from: a */
    private final void m11910a(C2472b c2472b) {
        this.f10142d.execute(c2472b);
    }

    /* renamed from: a */
    protected final zzdz m11927a(Context context) {
        try {
            return zzea.m22495a(DynamiteModule.m8886a(context, DynamiteModule.f7880a, "com.google.android.gms.measurement.dynamite").m8898a("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (Exception e) {
            m11913a(e, true, false);
            return null;
        }
    }

    /* renamed from: e */
    private static int m11923e(Context context) {
        return DynamiteModule.m8890b(context, "com.google.android.gms.measurement.dynamite");
    }

    /* renamed from: f */
    private static int m11924f(Context context) {
        return DynamiteModule.m8883a(context, "com.google.android.gms.measurement.dynamite");
    }

    /* renamed from: a */
    private final void m11913a(Exception exception, boolean z, boolean z2) {
        this.f10146h |= z;
        if (z) {
            Log.w(this.f10141c, "Data collection startup failed. No data will be collected.", exception);
            return;
        }
        z = "Error with data collection. Data lost.";
        if (z2) {
            m11931a(5, (String) z, (Object) exception, null, null);
        }
        Log.w(this.f10141c, z, exception);
    }

    /* renamed from: h */
    private static boolean m11925h() {
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
        r0 = "com.google.firebase.analytics.FirebaseAnalytics";	 Catch:{ ClassNotFoundException -> 0x0007 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0007 }
        r0 = 1;
        return r0;
    L_0x0007:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzem.h():boolean");
    }

    /* renamed from: a */
    public final void m11935a(String str, String str2, Bundle bundle) {
        m11914a(str, str2, bundle, true, true, null);
    }

    /* renamed from: a */
    private final void m11914a(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        m11910a(new C4125p(this, l, str, str2, bundle, true, z2));
    }

    /* renamed from: a */
    public final void m11936a(String str, String str2, Object obj, boolean z) {
        m11910a(new C4126q(this, str, str2, obj, true));
    }

    /* renamed from: a */
    public final void m11933a(Bundle bundle) {
        m11910a(new C4127r(this, bundle));
    }

    /* renamed from: b */
    public final void m11939b(String str, String str2, Bundle bundle) {
        m11910a(new C4108b(this, str, str2, bundle));
    }

    /* renamed from: a */
    public final List<Bundle> m11929a(String str, String str2) {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4109c(this, str, str2, c4708a));
        str = c4708a.m27096b(5000);
        return str == null ? Collections.emptyList() : str;
    }

    /* renamed from: a */
    public final void m11932a(Activity activity, String str, String str2) {
        m11910a(new C4110d(this, activity, str, str2));
    }

    /* renamed from: a */
    public final void m11934a(String str) {
        m11910a(new C4114e(this, str));
    }

    /* renamed from: b */
    public final void m11938b(String str) {
        m11910a(new C4115f(this, str));
    }

    /* renamed from: b */
    public final String m11937b() {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4116g(this, c4708a));
        return c4708a.m27094a(500);
    }

    /* renamed from: c */
    public final String m11941c() {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4117h(this, c4708a));
        return c4708a.m27094a(50);
    }

    /* renamed from: d */
    public final long m11942d() {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4118i(this, c4708a));
        Long c = c4708a.m27097c(500);
        if (c != null) {
            return c.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f10140a.currentTimeMillis()).nextLong();
        int i = this.f10145g + 1;
        this.f10145g = i;
        return nextLong + ((long) i);
    }

    /* renamed from: e */
    public final String m11943e() {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4119j(this, c4708a));
        return c4708a.m27094a(500);
    }

    /* renamed from: f */
    public final String m11944f() {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4120k(this, c4708a));
        return c4708a.m27094a(500);
    }

    /* renamed from: a */
    public final Map<String, Object> m11930a(String str, String str2, boolean z) {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4121l(this, str, str2, z, c4708a));
        str = c4708a.m27099e(5000);
        if (str != null) {
            if (str.size() != null) {
                str2 = new HashMap(str.size());
                for (String str3 : str.keySet()) {
                    Object obj = str.get(str3);
                    if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                        str2.put(str3, obj);
                    }
                }
                return str2;
            }
        }
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final void m11931a(int i, String str, Object obj, Object obj2, Object obj3) {
        m11910a(new C4122m(this, false, 5, str, obj, obj2, obj3));
    }

    /* renamed from: a */
    public final Bundle m11926a(Bundle bundle, boolean z) {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4123n(this, bundle, c4708a));
        return z ? c4708a.m27099e(5000) : null;
    }

    /* renamed from: c */
    public final int m11940c(String str) {
        C4708a c4708a = new C4708a(this);
        m11910a(new C4124o(this, str, c4708a));
        str = c4708a.m27098d(10000);
        if (str == null) {
            return 25;
        }
        return str.intValue();
    }

    /* renamed from: g */
    public final String m11945g() {
        return this.f10147i;
    }
}
