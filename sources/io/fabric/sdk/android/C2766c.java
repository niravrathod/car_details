package io.fabric.sdk.android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.fabric.sdk.android.C2764a.C2763b;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.C2823b;
import io.fabric.sdk.android.services.concurrency.C2827h;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.fabric.sdk.android.c */
public class C2766c {
    /* renamed from: a */
    static volatile C2766c f11806a;
    /* renamed from: b */
    static final C2774k f11807b = new C4290b();
    /* renamed from: c */
    final C2774k f11808c;
    /* renamed from: d */
    final boolean f11809d;
    /* renamed from: e */
    private final Context f11810e;
    /* renamed from: f */
    private final Map<Class<? extends C2771h>, C2771h> f11811f;
    /* renamed from: g */
    private final ExecutorService f11812g;
    /* renamed from: h */
    private final Handler f11813h;
    /* renamed from: i */
    private final C2770f<C2766c> f11814i;
    /* renamed from: j */
    private final C2770f<?> f11815j;
    /* renamed from: k */
    private final IdManager f11816k;
    /* renamed from: l */
    private C2764a f11817l;
    /* renamed from: m */
    private WeakReference<Activity> f11818m;
    /* renamed from: n */
    private AtomicBoolean f11819n = new AtomicBoolean(null);

    /* renamed from: io.fabric.sdk.android.c$a */
    public static class C2765a {
        /* renamed from: a */
        private final Context f11797a;
        /* renamed from: b */
        private C2771h[] f11798b;
        /* renamed from: c */
        private C2827h f11799c;
        /* renamed from: d */
        private Handler f11800d;
        /* renamed from: e */
        private C2774k f11801e;
        /* renamed from: f */
        private boolean f11802f;
        /* renamed from: g */
        private String f11803g;
        /* renamed from: h */
        private String f11804h;
        /* renamed from: i */
        private C2770f<C2766c> f11805i;

        public C2765a(Context context) {
            if (context != null) {
                this.f11797a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C2765a m13511a(C2771h... c2771hArr) {
            if (this.f11798b == null) {
                this.f11798b = c2771hArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: a */
        public C2766c m13512a() {
            HashMap hashMap;
            if (this.f11799c == null) {
                this.f11799c = C2827h.m13766a();
            }
            if (this.f11800d == null) {
                this.f11800d = new Handler(Looper.getMainLooper());
            }
            if (this.f11801e == null) {
                if (this.f11802f) {
                    this.f11801e = new C4290b(3);
                } else {
                    this.f11801e = new C4290b();
                }
            }
            if (this.f11804h == null) {
                this.f11804h = this.f11797a.getPackageName();
            }
            if (this.f11805i == null) {
                this.f11805i = C2770f.f11823d;
            }
            if (this.f11798b == null) {
                hashMap = new HashMap();
            } else {
                hashMap = C2766c.m13520b(Arrays.asList(this.f11798b));
            }
            HashMap hashMap2 = hashMap;
            Context applicationContext = this.f11797a.getApplicationContext();
            return new C2766c(applicationContext, hashMap2, this.f11799c, this.f11800d, this.f11801e, this.f11802f, this.f11805i, new IdManager(applicationContext, this.f11804h, this.f11803g, hashMap2.values()), C2766c.m13523d(this.f11797a));
        }
    }

    /* renamed from: io.fabric.sdk.android.c$1 */
    class C42911 extends C2763b {
        /* renamed from: a */
        final /* synthetic */ C2766c f17997a;

        C42911(C2766c c2766c) {
            this.f17997a = c2766c;
        }

        /* renamed from: a */
        public void mo1103a(Activity activity, Bundle bundle) {
            this.f17997a.m13527a(activity);
        }

        /* renamed from: a */
        public void mo1102a(Activity activity) {
            this.f17997a.m13527a(activity);
        }

        /* renamed from: b */
        public void mo1104b(Activity activity) {
            this.f17997a.m13527a(activity);
        }
    }

    /* renamed from: c */
    public String m13533c() {
        return "1.4.3.25";
    }

    /* renamed from: d */
    public String m13534d() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: a */
    static C2766c m13513a() {
        if (f11806a != null) {
            return f11806a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    C2766c(Context context, Map<Class<? extends C2771h>, C2771h> map, C2827h c2827h, Handler handler, C2774k c2774k, boolean z, C2770f c2770f, IdManager idManager, Activity activity) {
        this.f11810e = context;
        this.f11811f = map;
        this.f11812g = c2827h;
        this.f11813h = handler;
        this.f11808c = c2774k;
        this.f11809d = z;
        this.f11814i = c2770f;
        this.f11815j = m13528a(map.size());
        this.f11816k = idManager;
        m13527a(activity);
    }

    /* renamed from: a */
    public static C2766c m13514a(Context context, C2771h... c2771hArr) {
        if (f11806a == null) {
            synchronized (C2766c.class) {
                if (f11806a == null) {
                    C2766c.m13522c(new C2765a(context).m13511a(c2771hArr).m13512a());
                }
            }
        }
        return f11806a;
    }

    /* renamed from: c */
    private static void m13522c(C2766c c2766c) {
        f11806a = c2766c;
        c2766c.m13526j();
    }

    /* renamed from: a */
    public C2766c m13527a(Activity activity) {
        this.f11818m = new WeakReference(activity);
        return this;
    }

    /* renamed from: b */
    public Activity m13531b() {
        return this.f11818m != null ? (Activity) this.f11818m.get() : null;
    }

    /* renamed from: j */
    private void m13526j() {
        this.f11817l = new C2764a(this.f11810e);
        this.f11817l.m13510a(new C42911(this));
        m13529a(this.f11810e);
    }

    /* renamed from: a */
    void m13529a(Context context) {
        Future b = m13532b(context);
        Collection g = m13537g();
        C4294l c4294l = new C4294l(b, g);
        List<C2771h> arrayList = new ArrayList(g);
        Collections.sort(arrayList);
        c4294l.injectParameters(context, this, C2770f.f11823d, this.f11816k);
        for (C2771h injectParameters : arrayList) {
            injectParameters.injectParameters(context, this, this.f11815j, this.f11816k);
        }
        c4294l.initialize();
        if (C2766c.m13524h().mo3556a("Fabric", 3) != null) {
            context = new StringBuilder("Initializing ");
            context.append(m13534d());
            context.append(" [Version: ");
            context.append(m13533c());
            context.append("], with the following kits:\n");
        } else {
            context = null;
        }
        for (C2771h c2771h : arrayList) {
            c2771h.initializationTask.m23630a(c4294l.initializationTask);
            m13530a(this.f11811f, c2771h);
            c2771h.initialize();
            if (context != null) {
                context.append(c2771h.getIdentifier());
                context.append(" [Version: ");
                context.append(c2771h.getVersion());
                context.append("]\n");
            }
        }
        if (context != null) {
            C2766c.m13524h().mo3554a("Fabric", context.toString());
        }
    }

    /* renamed from: a */
    void m13530a(Map<Class<? extends C2771h>, C2771h> map, C2771h c2771h) {
        C2823b c2823b = c2771h.dependsOnAnnotation;
        if (c2823b != null) {
            for (Class cls : c2823b.m13763a()) {
                if (cls.isInterface()) {
                    for (C2771h c2771h2 : map.values()) {
                        if (cls.isAssignableFrom(c2771h2.getClass())) {
                            c2771h.initializationTask.m23630a(c2771h2.initializationTask);
                        }
                    }
                } else if (((C2771h) map.get(cls)) != null) {
                    c2771h.initializationTask.m23630a(((C2771h) map.get(cls)).initializationTask);
                } else {
                    throw new UnmetDependencyException("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* renamed from: d */
    private static Activity m13523d(Context context) {
        return context instanceof Activity ? (Activity) context : null;
    }

    /* renamed from: e */
    public C2764a m13535e() {
        return this.f11817l;
    }

    /* renamed from: f */
    public ExecutorService m13536f() {
        return this.f11812g;
    }

    /* renamed from: g */
    public Collection<C2771h> m13537g() {
        return this.f11811f.values();
    }

    /* renamed from: a */
    public static <T extends C2771h> T m13515a(Class<T> cls) {
        return (C2771h) C2766c.m13513a().f11811f.get(cls);
    }

    /* renamed from: h */
    public static C2774k m13524h() {
        if (f11806a == null) {
            return f11807b;
        }
        return f11806a.f11808c;
    }

    /* renamed from: i */
    public static boolean m13525i() {
        if (f11806a == null) {
            return false;
        }
        return f11806a.f11809d;
    }

    /* renamed from: b */
    private static Map<Class<? extends C2771h>, C2771h> m13520b(Collection<? extends C2771h> collection) {
        Map hashMap = new HashMap(collection.size());
        C2766c.m13518a(hashMap, (Collection) collection);
        return hashMap;
    }

    /* renamed from: a */
    private static void m13518a(Map<Class<? extends C2771h>, C2771h> map, Collection<? extends C2771h> collection) {
        for (C2771h c2771h : collection) {
            map.put(c2771h.getClass(), c2771h);
            if (c2771h instanceof C2772i) {
                C2766c.m13518a((Map) map, ((C2772i) c2771h).getKits());
            }
        }
    }

    /* renamed from: a */
    C2770f<?> m13528a(final int i) {
        return new C2770f(this) {
            /* renamed from: a */
            final CountDownLatch f17998a = new CountDownLatch(i);
            /* renamed from: c */
            final /* synthetic */ C2766c f18000c;

            /* renamed from: a */
            public void mo3564a(Object obj) {
                this.f17998a.countDown();
                if (this.f17998a.getCount() == 0) {
                    this.f18000c.f11819n.set(true);
                    this.f18000c.f11814i.mo3564a(this.f18000c);
                }
            }

            /* renamed from: a */
            public void mo3563a(Exception exception) {
                this.f18000c.f11814i.mo3563a(exception);
            }
        };
    }

    /* renamed from: b */
    Future<Map<String, C2773j>> m13532b(Context context) {
        return m13536f().submit(new C2768e(context.getPackageCodePath()));
    }
}
