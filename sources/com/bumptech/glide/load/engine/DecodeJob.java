package com.bumptech.glide.load.engine;

import android.os.Build.VERSION;
import android.support.v4.p017f.C0431k.C0430a;
import android.util.Log;
import com.bumptech.glide.C1157e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry.NoResultEncoderAvailableException;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.C3500h;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C1261e.C1260a;
import com.bumptech.glide.load.engine.C1264g.C1263a;
import com.bumptech.glide.load.engine.p061b.C1242a;
import com.bumptech.glide.load.p057a.C1188d;
import com.bumptech.glide.load.resource.bitmap.C1285k;
import com.bumptech.glide.p055g.C1174e;
import com.bumptech.glide.p055g.p056a.C1167a.C1165c;
import com.bumptech.glide.p055g.p056a.C1168b;
import com.bumptech.glide.p055g.p056a.C1170c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class DecodeJob<R> implements C1165c, C1260a, Comparable<DecodeJob<?>>, Runnable {
    /* renamed from: A */
    private DataSource f14359A;
    /* renamed from: B */
    private C1188d<?> f14360B;
    /* renamed from: C */
    private volatile C1261e f14361C;
    /* renamed from: D */
    private volatile boolean f14362D;
    /* renamed from: E */
    private volatile boolean f14363E;
    /* renamed from: a */
    private final C1262f<R> f14364a = new C1262f();
    /* renamed from: b */
    private final List<Throwable> f14365b = new ArrayList();
    /* renamed from: c */
    private final C1170c f14366c = C1170c.m4851a();
    /* renamed from: d */
    private final C1222d f14367d;
    /* renamed from: e */
    private final C0430a<DecodeJob<?>> f14368e;
    /* renamed from: f */
    private final C1221c<?> f14369f = new C1221c();
    /* renamed from: g */
    private final C1223e f14370g = new C1223e();
    /* renamed from: h */
    private C1157e f14371h;
    /* renamed from: i */
    private C1216c f14372i;
    /* renamed from: j */
    private Priority f14373j;
    /* renamed from: k */
    private C3492l f14374k;
    /* renamed from: l */
    private int f14375l;
    /* renamed from: m */
    private int f14376m;
    /* renamed from: n */
    private C1265h f14377n;
    /* renamed from: o */
    private C3452e f14378o;
    /* renamed from: p */
    private C1220a<R> f14379p;
    /* renamed from: q */
    private int f14380q;
    /* renamed from: r */
    private Stage f14381r;
    /* renamed from: s */
    private RunReason f14382s;
    /* renamed from: t */
    private long f14383t;
    /* renamed from: u */
    private boolean f14384u;
    /* renamed from: v */
    private Object f14385v;
    /* renamed from: w */
    private Thread f14386w;
    /* renamed from: x */
    private C1216c f14387x;
    /* renamed from: y */
    private C1216c f14388y;
    /* renamed from: z */
    private Object f14389z;

    private enum RunReason {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    private enum Stage {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$a */
    interface C1220a<R> {
        /* renamed from: a */
        void mo1042a(DecodeJob<?> decodeJob);

        /* renamed from: a */
        void mo1043a(GlideException glideException);

        /* renamed from: a */
        void mo1044a(C1277s<R> c1277s, DataSource dataSource);
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$c */
    private static class C1221c<Z> {
        /* renamed from: a */
        private C1216c f3918a;
        /* renamed from: b */
        private C3499g<Z> f3919b;
        /* renamed from: c */
        private C3495r<Z> f3920c;

        C1221c() {
        }

        /* renamed from: a */
        <X> void m4997a(C1216c c1216c, C3499g<X> c3499g, C3495r<X> c3495r) {
            this.f3918a = c1216c;
            this.f3919b = c3499g;
            this.f3920c = c3495r;
        }

        /* renamed from: a */
        void m4998a(C1222d c1222d, C3452e c3452e) {
            C1168b.m4848a("DecodeJob.encode");
            try {
                c1222d.mo1037a().mo1019a(this.f3918a, new C3481d(this.f3919b, this.f3920c, c3452e));
            } finally {
                this.f3920c.m17737a();
                C1168b.m4847a();
            }
        }

        /* renamed from: a */
        boolean m4999a() {
            return this.f3920c != null;
        }

        /* renamed from: b */
        void m5000b() {
            this.f3918a = null;
            this.f3919b = null;
            this.f3920c = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$d */
    interface C1222d {
        /* renamed from: a */
        C1242a mo1037a();
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$e */
    private static class C1223e {
        /* renamed from: a */
        private boolean f3921a;
        /* renamed from: b */
        private boolean f3922b;
        /* renamed from: c */
        private boolean f3923c;

        C1223e() {
        }

        /* renamed from: a */
        synchronized boolean m5004a(boolean z) {
            this.f3921a = true;
            return m5002b(z);
        }

        /* renamed from: a */
        synchronized boolean m5003a() {
            this.f3922b = true;
            return m5002b(false);
        }

        /* renamed from: b */
        synchronized boolean m5005b() {
            this.f3923c = true;
            return m5002b(false);
        }

        /* renamed from: c */
        synchronized void m5006c() {
            this.f3922b = false;
            this.f3921a = false;
            this.f3923c = false;
        }

        /* renamed from: b */
        private boolean m5002b(boolean z) {
            return (this.f3923c || z || this.f3922b) && this.f3921a;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.DecodeJob$b */
    private final class C3453b<Z> implements C1263a<Z> {
        /* renamed from: a */
        final /* synthetic */ DecodeJob f14357a;
        /* renamed from: b */
        private final DataSource f14358b;

        C3453b(DecodeJob decodeJob, DataSource dataSource) {
            this.f14357a = decodeJob;
            this.f14358b = dataSource;
        }

        /* renamed from: a */
        public C1277s<Z> mo989a(C1277s<Z> c1277s) {
            return this.f14357a.m17548a(this.f14358b, (C1277s) c1277s);
        }
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m17546a((DecodeJob) obj);
    }

    DecodeJob(C1222d c1222d, C0430a<DecodeJob<?>> c0430a) {
        this.f14367d = c1222d;
        this.f14368e = c0430a;
    }

    /* renamed from: a */
    DecodeJob<R> m17547a(C1157e c1157e, Object obj, C3492l c3492l, C1216c c1216c, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, C1265h c1265h, Map<Class<?>, C3500h<?>> map, boolean z, boolean z2, boolean z3, C3452e c3452e, C1220a<R> c1220a, int i3) {
        this.f14364a.m5108a(c1157e, obj, c1216c, i, i2, c1265h, cls, cls2, priority, c3452e, map, z, z2, this.f14367d);
        this.f14371h = c1157e;
        this.f14372i = c1216c;
        this.f14373j = priority;
        this.f14374k = c3492l;
        this.f14375l = i;
        this.f14376m = i2;
        this.f14377n = c1265h;
        this.f14384u = z3;
        this.f14378o = c3452e;
        this.f14379p = c1220a;
        this.f14380q = i3;
        this.f14382s = RunReason.INITIALIZE;
        this.f14385v = obj;
        return r0;
    }

    /* renamed from: a */
    boolean m17552a() {
        Stage a = m17528a(Stage.INITIALIZE);
        if (a != Stage.RESOURCE_CACHE) {
            if (a != Stage.DATA_CACHE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    void m17551a(boolean z) {
        if (this.f14370g.m5004a(z)) {
            m17538g();
        }
    }

    /* renamed from: e */
    private void m17536e() {
        if (this.f14370g.m5003a()) {
            m17538g();
        }
    }

    /* renamed from: f */
    private void m17537f() {
        if (this.f14370g.m5005b()) {
            m17538g();
        }
    }

    /* renamed from: g */
    private void m17538g() {
        this.f14370g.m5006c();
        this.f14369f.m5000b();
        this.f14364a.m5107a();
        this.f14362D = false;
        this.f14371h = null;
        this.f14372i = null;
        this.f14378o = null;
        this.f14373j = null;
        this.f14374k = null;
        this.f14379p = null;
        this.f14381r = null;
        this.f14361C = null;
        this.f14386w = null;
        this.f14387x = null;
        this.f14389z = null;
        this.f14359A = null;
        this.f14360B = null;
        this.f14383t = 0;
        this.f14363E = false;
        this.f14385v = null;
        this.f14365b.clear();
        this.f14368e.mo339a(this);
    }

    /* renamed from: a */
    public int m17546a(DecodeJob<?> decodeJob) {
        int h = m17539h() - decodeJob.m17539h();
        return h == 0 ? this.f14380q - decodeJob.f14380q : h;
    }

    /* renamed from: h */
    private int m17539h() {
        return this.f14373j.ordinal();
    }

    /* renamed from: b */
    public void m17553b() {
        this.f14363E = true;
        C1261e c1261e = this.f14361C;
        if (c1261e != null) {
            c1261e.mo1030b();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r5 = this;
        r0 = "DecodeJob#run(model=%s)";
        r1 = r5.f14385v;
        com.bumptech.glide.p055g.p056a.C1168b.m4849a(r0, r1);
        r0 = r5.f14360B;
        r1 = r5.f14363E;	 Catch:{ Throwable -> 0x0027 }
        if (r1 == 0) goto L_0x0019;
    L_0x000d:
        r5.m17543l();	 Catch:{ Throwable -> 0x0027 }
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r0.mo961b();
    L_0x0015:
        com.bumptech.glide.p055g.p056a.C1168b.m4847a();
        return;
    L_0x0019:
        r5.m17540i();	 Catch:{ Throwable -> 0x0027 }
        if (r0 == 0) goto L_0x0021;
    L_0x001e:
        r0.mo961b();
    L_0x0021:
        com.bumptech.glide.p055g.p056a.C1168b.m4847a();
        goto L_0x0068;
    L_0x0025:
        r1 = move-exception;
        goto L_0x006a;
    L_0x0027:
        r1 = move-exception;
        r2 = "DecodeJob";
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0025 }
        if (r2 == 0) goto L_0x0053;
    L_0x0031:
        r2 = "DecodeJob";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0025 }
        r3.<init>();	 Catch:{ all -> 0x0025 }
        r4 = "DecodeJob threw unexpectedly, isCancelled: ";
        r3.append(r4);	 Catch:{ all -> 0x0025 }
        r4 = r5.f14363E;	 Catch:{ all -> 0x0025 }
        r3.append(r4);	 Catch:{ all -> 0x0025 }
        r4 = ", stage: ";
        r3.append(r4);	 Catch:{ all -> 0x0025 }
        r4 = r5.f14381r;	 Catch:{ all -> 0x0025 }
        r3.append(r4);	 Catch:{ all -> 0x0025 }
        r3 = r3.toString();	 Catch:{ all -> 0x0025 }
        android.util.Log.d(r2, r3, r1);	 Catch:{ all -> 0x0025 }
    L_0x0053:
        r2 = r5.f14381r;	 Catch:{ all -> 0x0025 }
        r3 = com.bumptech.glide.load.engine.DecodeJob.Stage.ENCODE;	 Catch:{ all -> 0x0025 }
        if (r2 == r3) goto L_0x0061;
    L_0x0059:
        r2 = r5.f14365b;	 Catch:{ all -> 0x0025 }
        r2.add(r1);	 Catch:{ all -> 0x0025 }
        r5.m17543l();	 Catch:{ all -> 0x0025 }
    L_0x0061:
        r2 = r5.f14363E;	 Catch:{ all -> 0x0025 }
        if (r2 == 0) goto L_0x0069;
    L_0x0065:
        if (r0 == 0) goto L_0x0021;
    L_0x0067:
        goto L_0x001e;
    L_0x0068:
        return;
    L_0x0069:
        throw r1;	 Catch:{ all -> 0x0025 }
    L_0x006a:
        if (r0 == 0) goto L_0x006f;
    L_0x006c:
        r0.mo961b();
    L_0x006f:
        com.bumptech.glide.p055g.p056a.C1168b.m4847a();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.DecodeJob.run():void");
    }

    /* renamed from: i */
    private void m17540i() {
        switch (this.f14382s) {
            case INITIALIZE:
                this.f14381r = m17528a(Stage.INITIALIZE);
                this.f14361C = m17541j();
                m17542k();
                return;
            case SWITCH_TO_SOURCE_SERVICE:
                m17542k();
                return;
            case DECODE_DATA:
                m17545n();
                return;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized run reason: ");
                stringBuilder.append(this.f14382s);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: j */
    private C1261e m17541j() {
        switch (this.f14381r) {
            case RESOURCE_CACHE:
                return new C3496t(this.f14364a, this);
            case DATA_CACHE:
                return new C3476b(this.f14364a, this);
            case SOURCE:
                return new C3498w(this.f14364a, this);
            case FINISHED:
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized stage: ");
                stringBuilder.append(this.f14381r);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: k */
    private void m17542k() {
        this.f14386w = Thread.currentThread();
        this.f14383t = C1174e.m4866a();
        boolean z = false;
        while (!this.f14363E && this.f14361C != null) {
            z = this.f14361C.mo1029a();
            if (z) {
                break;
            }
            this.f14381r = m17528a(this.f14381r);
            this.f14361C = m17541j();
            if (this.f14381r == Stage.SOURCE) {
                mo992c();
                return;
            }
        }
        if ((this.f14381r == Stage.FINISHED || this.f14363E) && !r0) {
            m17543l();
        }
    }

    /* renamed from: l */
    private void m17543l() {
        m17544m();
        this.f14379p.mo1043a(new GlideException("Failed to load resource", new ArrayList(this.f14365b)));
        m17537f();
    }

    /* renamed from: a */
    private void m17532a(C1277s<R> c1277s, DataSource dataSource) {
        m17544m();
        this.f14379p.mo1044a(c1277s, dataSource);
    }

    /* renamed from: m */
    private void m17544m() {
        this.f14366c.mo957b();
        if (this.f14362D) {
            throw new IllegalStateException("Already notified");
        }
        this.f14362D = true;
    }

    /* renamed from: a */
    private Stage m17528a(Stage stage) {
        switch (stage) {
            case RESOURCE_CACHE:
                return this.f14377n.mo1036b() != null ? Stage.DATA_CACHE : m17528a(Stage.DATA_CACHE);
            case DATA_CACHE:
                return this.f14384u != null ? Stage.FINISHED : Stage.SOURCE;
            case SOURCE:
            case FINISHED:
                return Stage.FINISHED;
            case INITIALIZE:
                return this.f14377n.mo1033a() != null ? Stage.RESOURCE_CACHE : m17528a(Stage.RESOURCE_CACHE);
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized stage: ");
                stringBuilder.append(stage);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    public void mo992c() {
        this.f14382s = RunReason.SWITCH_TO_SOURCE_SERVICE;
        this.f14379p.mo1042a(this);
    }

    /* renamed from: a */
    public void mo991a(C1216c c1216c, Object obj, C1188d<?> c1188d, DataSource dataSource, C1216c c1216c2) {
        this.f14387x = c1216c;
        this.f14389z = obj;
        this.f14360B = c1188d;
        this.f14359A = dataSource;
        this.f14388y = c1216c2;
        if (Thread.currentThread() != this.f14386w) {
            this.f14382s = RunReason.DECODE_DATA;
            this.f14379p.mo1042a(this);
            return;
        }
        C1168b.m4848a("DecodeJob.decodeFromRetrievedData");
        try {
            m17545n();
        } finally {
            C1168b.m4847a();
        }
    }

    /* renamed from: a */
    public void mo990a(C1216c c1216c, Exception exception, C1188d<?> c1188d, DataSource dataSource) {
        c1188d.mo961b();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exception);
        glideException.m5015a(c1216c, dataSource, c1188d.mo959a());
        this.f14365b.add(glideException);
        if (Thread.currentThread() != this.f14386w) {
            this.f14382s = RunReason.SWITCH_TO_SOURCE_SERVICE;
            this.f14379p.mo1042a(this);
            return;
        }
        m17542k();
    }

    /* renamed from: n */
    private void m17545n() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f14383t;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("data: ");
            stringBuilder.append(this.f14389z);
            stringBuilder.append(", cache key: ");
            stringBuilder.append(this.f14387x);
            stringBuilder.append(", fetcher: ");
            stringBuilder.append(this.f14360B);
            m17534a("Retrieved data", j, stringBuilder.toString());
        }
        C1277s c1277s = null;
        try {
            c1277s = m17529a(this.f14360B, this.f14389z, this.f14359A);
        } catch (GlideException e) {
            e.m5014a(this.f14388y, this.f14359A);
            this.f14365b.add(e);
        }
        if (c1277s != null) {
            m17535b(c1277s, this.f14359A);
        } else {
            m17542k();
        }
    }

    /* renamed from: b */
    private void m17535b(C1277s<R> c1277s, DataSource dataSource) {
        C1277s a;
        if (c1277s instanceof C1274o) {
            ((C1274o) c1277s).mo1049a();
        }
        C3495r c3495r = null;
        if (this.f14369f.m4999a()) {
            a = C3495r.m17734a(c1277s);
            c3495r = a;
        }
        m17532a(a, dataSource);
        this.f14381r = Stage.ENCODE;
        try {
            if (this.f14369f.m4999a() != null) {
                this.f14369f.m4998a(this.f14367d, this.f14378o);
            }
            if (c3495r != null) {
                c3495r.m17737a();
            }
            m17536e();
        } catch (Throwable th) {
            if (c3495r != null) {
                c3495r.m17737a();
            }
        }
    }

    /* renamed from: a */
    private <Data> C1277s<R> m17529a(C1188d<?> c1188d, Data data, DataSource dataSource) {
        if (data == null) {
            c1188d.mo961b();
            return null;
        }
        try {
            long a = C1174e.m4866a();
            data = m17530a((Object) data, dataSource);
            if (Log.isLoggable("DecodeJob", 2) != null) {
                dataSource = new StringBuilder();
                dataSource.append("Decoded result ");
                dataSource.append(data);
                m17533a(dataSource.toString(), a);
            }
            c1188d.mo961b();
            return data;
        } catch (Throwable th) {
            c1188d.mo961b();
        }
    }

    /* renamed from: a */
    private <Data> C1277s<R> m17530a(Data data, DataSource dataSource) {
        return m17531a((Object) data, dataSource, this.f14364a.m5113b(data.getClass()));
    }

    /* renamed from: a */
    private C3452e m17527a(DataSource dataSource) {
        C3452e c3452e = this.f14378o;
        if (VERSION.SDK_INT < 26) {
            return c3452e;
        }
        Boolean bool;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            if (this.f14364a.m5125l() == null) {
                dataSource = null;
                bool = (Boolean) c3452e.m17523a(C1285k.f4054d);
                if (bool == null && (!bool.booleanValue() || dataSource != null)) {
                    return c3452e;
                }
                c3452e = new C3452e();
                c3452e.m17524a(this.f14378o);
                c3452e.m17522a(C1285k.f4054d, Boolean.valueOf(dataSource));
                return c3452e;
            }
        }
        dataSource = true;
        bool = (Boolean) c3452e.m17523a(C1285k.f4054d);
        if (bool == null) {
        }
        c3452e = new C3452e();
        c3452e.m17524a(this.f14378o);
        c3452e.m17522a(C1285k.f4054d, Boolean.valueOf(dataSource));
        return c3452e;
    }

    /* renamed from: a */
    private <Data, ResourceType> C1277s<R> m17531a(Data data, DataSource dataSource, C1276q<Data, ResourceType, R> c1276q) {
        C3452e a = m17527a(dataSource);
        data = this.f14371h.m4819c().m4637b((Object) data);
        try {
            dataSource = c1276q.m5150a(data, a, this.f14375l, this.f14376m, new C3453b(this, dataSource));
            return dataSource;
        } finally {
            data.mo967b();
        }
    }

    /* renamed from: a */
    private void m17533a(String str, long j) {
        m17534a(str, j, null);
    }

    /* renamed from: a */
    private void m17534a(String str, long j, String str2) {
        String str3 = "DecodeJob";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(C1174e.m4865a(j));
        stringBuilder.append(", load key: ");
        stringBuilder.append(this.f14374k);
        if (str2 != null) {
            str = new StringBuilder();
            str.append(", ");
            str.append(str2);
            str = str.toString();
        } else {
            str = "";
        }
        stringBuilder.append(str);
        stringBuilder.append(", thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        Log.v(str3, stringBuilder.toString());
    }

    public C1170c e_() {
        return this.f14366c;
    }

    /* renamed from: a */
    <Z> C1277s<Z> m17548a(DataSource dataSource, C1277s<Z> c1277s) {
        C3500h c3500h;
        C1277s a;
        Class cls = c1277s.mo1046d().getClass();
        C3499g c3499g = null;
        if (dataSource != DataSource.RESOURCE_DISK_CACHE) {
            C3500h c = this.f14364a.m5116c(cls);
            c3500h = c;
            a = c.mo3903a(this.f14371h, c1277s, this.f14375l, this.f14376m);
        } else {
            a = c1277s;
            c3500h = null;
        }
        if (!c1277s.equals(a)) {
            c1277s.mo1048f();
        }
        if (this.f14364a.m5110a(a) != null) {
            c3499g = this.f14364a.m5114b(a);
            c1277s = c3499g.mo3904a(this.f14378o);
        } else {
            c1277s = EncodeStrategy.NONE;
        }
        C3499g c3499g2 = c3499g;
        if (this.f14377n.mo1035a(this.f14364a.m5109a(this.f14387x) ^ 1, dataSource, c1277s) == null) {
            return a;
        }
        if (c3499g2 != null) {
            switch (c1277s) {
                case SOURCE:
                    dataSource = new C3480c(this.f14387x, this.f14372i);
                    break;
                case TRANSFORMED:
                    DataSource c3497u = new C3497u(this.f14364a.m5122i(), this.f14387x, this.f14372i, this.f14375l, this.f14376m, c3500h, cls, this.f14378o);
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown strategy: ");
                    stringBuilder.append(c1277s);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
            C1277s<Z> a2 = C3495r.m17734a(a);
            this.f14369f.m4997a(dataSource, c3499g2, a2);
            return a2;
        }
        throw new NoResultEncoderAvailableException(a.mo1046d().getClass());
    }
}
