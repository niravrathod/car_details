package com.facebook.ads.internal.p086e;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.ads.internal.p086e.C1790f.C1789a;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.ads.internal.e.d */
public class C1787d {
    /* renamed from: a */
    private static final String f5385a;
    /* renamed from: b */
    private static final int f5386b = Runtime.getRuntime().availableProcessors();
    /* renamed from: c */
    private static final int f5387c = Math.max(2, Math.min(f5386b - 1, 4));
    /* renamed from: d */
    private static final int f5388d = ((f5386b * 2) + 1);
    /* renamed from: e */
    private static final ThreadFactory f5389e = new C17851();
    /* renamed from: f */
    private static final BlockingQueue<Runnable> f5390f = new LinkedBlockingQueue(128);
    /* renamed from: g */
    private static final Executor f5391g;
    /* renamed from: h */
    private static final ReentrantReadWriteLock f5392h = new ReentrantReadWriteLock();
    /* renamed from: i */
    private static final Lock f5393i = f5392h.readLock();
    /* renamed from: j */
    private static final Lock f5394j = f5392h.writeLock();
    /* renamed from: k */
    private final Context f5395k;
    /* renamed from: l */
    private final C3795h f5396l = new C3795h(this);
    /* renamed from: m */
    private final C3794c f5397m = new C3794c(this);
    /* renamed from: n */
    private SQLiteOpenHelper f5398n;

    /* renamed from: com.facebook.ads.internal.e.d$1 */
    static class C17851 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f5380a = new AtomicInteger(1);

        C17851() {
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DatabaseTask #");
            stringBuilder.append(this.f5380a.getAndIncrement());
            return new Thread(runnable, stringBuilder.toString());
        }
    }

    /* renamed from: com.facebook.ads.internal.e.d$a */
    private static class C1786a<T> extends AsyncTask<Void, Void, T> {
        /* renamed from: a */
        private final C1790f<T> f5381a;
        /* renamed from: b */
        private final C1783a<T> f5382b;
        /* renamed from: c */
        private final Context f5383c;
        /* renamed from: d */
        private C1789a f5384d;

        C1786a(Context context, C1790f<T> c1790f, C1783a<T> c1783a) {
            this.f5381a = c1790f;
            this.f5382b = c1783a;
            this.f5383c = context;
        }

        /* renamed from: a */
        protected T m6709a(Void... voidArr) {
            T b;
            Exception e;
            try {
                b = this.f5381a.mo3976b();
                try {
                    this.f5384d = this.f5381a.m6731c();
                } catch (Exception e2) {
                    e = e2;
                    C1953a.m7382a(this.f5383c, "database", C1954b.f5998l, e);
                    this.f5384d = C1789a.UNKNOWN;
                    return b;
                }
            } catch (Exception e3) {
                Exception exception = e3;
                b = null;
                e = exception;
                C1953a.m7382a(this.f5383c, "database", C1954b.f5998l, e);
                this.f5384d = C1789a.UNKNOWN;
                return b;
            }
            return b;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m6709a((Void[]) objArr);
        }

        protected void onPostExecute(T t) {
            if (this.f5384d == null) {
                this.f5382b.mo1353a(t);
            } else {
                this.f5382b.mo1352a(this.f5384d.m6727a(), this.f5384d.m6728b());
            }
            this.f5382b.m6705a();
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT tokens.");
        stringBuilder.append(C3795h.f15213a.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("tokens");
        stringBuilder.append(".");
        stringBuilder.append(C3795h.f15214b.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15202a.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15204c.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15205d.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15206e.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15207f.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15208g.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15209h.f5378b);
        stringBuilder.append(", ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15210i.f5378b);
        stringBuilder.append(" FROM ");
        stringBuilder.append("events");
        stringBuilder.append(" JOIN ");
        stringBuilder.append("tokens");
        stringBuilder.append(" ON ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15203b.f5378b);
        stringBuilder.append(" = ");
        stringBuilder.append("tokens");
        stringBuilder.append(".");
        stringBuilder.append(C3795h.f15213a.f5378b);
        stringBuilder.append(" ORDER BY ");
        stringBuilder.append("events");
        stringBuilder.append(".");
        stringBuilder.append(C3794c.f15206e.f5378b);
        stringBuilder.append(" ASC");
        f5385a = stringBuilder.toString();
        Executor threadPoolExecutor = new ThreadPoolExecutor(f5387c, f5388d, 30, TimeUnit.SECONDS, f5390f, f5389e);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f5391g = threadPoolExecutor;
    }

    public C1787d(Context context) {
        this.f5395k = context;
    }

    /* renamed from: i */
    private synchronized SQLiteDatabase m6714i() {
        if (this.f5398n == null) {
            this.f5398n = new C1788e(this.f5395k, this);
        }
        return this.f5398n.getWritableDatabase();
    }

    /* renamed from: a */
    public Cursor m6715a(int i) {
        f5393i.lock();
        try {
            SQLiteDatabase a = m6716a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f5385a);
            stringBuilder.append(" LIMIT ");
            stringBuilder.append(String.valueOf(i));
            Cursor rawQuery = a.rawQuery(stringBuilder.toString(), null);
            return rawQuery;
        } finally {
            f5393i.unlock();
        }
    }

    /* renamed from: a */
    public SQLiteDatabase m6716a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return m6714i();
        }
        throw new IllegalStateException("Cannot call getDatabase from the UI thread!");
    }

    /* renamed from: a */
    public <T> AsyncTask m6717a(C1790f<T> c1790f, C1783a<T> c1783a) {
        return C1909d.m7256a(f5391g, new C1786a(this.f5395k.getApplicationContext(), c1790f, c1783a), new Void[0]);
    }

    /* renamed from: a */
    public AsyncTask m6718a(String str, int i, String str2, double d, double d2, String str3, Map<String, String> map, C1783a<String> c1783a) {
        final String str4 = str;
        final int i2 = i;
        final String str5 = str2;
        final double d3 = d;
        final double d4 = d2;
        final String str6 = str3;
        final Map<String, String> map2 = map;
        C1790f c46002 = new C3796i<String>(this) {
            /* renamed from: h */
            final /* synthetic */ C1787d f19127h;

            /* renamed from: a */
            public String m25460a() {
                SQLiteDatabase a;
                Exception e;
                Throwable th;
                if (TextUtils.isEmpty(str4)) {
                    return null;
                }
                C1787d.f5394j.lock();
                try {
                    a = this.f19127h.m6716a();
                    try {
                        a.beginTransaction();
                        String a2 = this.f19127h.f5397m.m18975a(this.f19127h.f5396l.m18981a(str4), i2, str5, d3, d4, str6, map2);
                        a.setTransactionSuccessful();
                        if (a != null && a.isOpen()) {
                            try {
                                if (a.inTransaction()) {
                                    a.endTransaction();
                                }
                            } catch (Exception e2) {
                                C1953a.m7382a(this.f19127h.f5395k, "database", C1954b.f5997k, e2);
                            }
                        }
                        C1787d.f5394j.unlock();
                        return a2;
                    } catch (Exception e3) {
                        e = e3;
                        try {
                            m6729a(C1789a.DATABASE_INSERT);
                            C1953a.m7382a(this.f19127h.f5395k, "database", C1954b.f5995i, e);
                            try {
                                if (a.inTransaction()) {
                                    a.endTransaction();
                                }
                            } catch (Exception e22) {
                                C1953a.m7382a(this.f19127h.f5395k, "database", C1954b.f5997k, e22);
                            }
                            C1787d.f5394j.unlock();
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                if (a.inTransaction()) {
                                    a.endTransaction();
                                }
                            } catch (Exception e222) {
                                C1953a.m7382a(this.f19127h.f5395k, "database", C1954b.f5997k, e222);
                            }
                            C1787d.f5394j.unlock();
                            throw th;
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    a = null;
                    m6729a(C1789a.DATABASE_INSERT);
                    C1953a.m7382a(this.f19127h.f5395k, "database", C1954b.f5995i, e);
                    if (a != null && a.isOpen()) {
                        if (a.inTransaction()) {
                            a.endTransaction();
                        }
                    }
                    C1787d.f5394j.unlock();
                    return null;
                } catch (Throwable th3) {
                    th = th3;
                    a = null;
                    if (a != null && a.isOpen()) {
                        if (a.inTransaction()) {
                            a.endTransaction();
                        }
                    }
                    C1787d.f5394j.unlock();
                    throw th;
                }
            }

            /* renamed from: b */
            public /* synthetic */ Object mo3976b() {
                return m25460a();
            }
        };
        C1787d c1787d = this;
        return m6717a(c46002, c1783a);
    }

    /* renamed from: a */
    public boolean m6719a(java.lang.String r6) {
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
        r5 = this;
        r0 = f5394j;
        r0.lock();
        r0 = 1;
        r1 = 0;
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x0054 }
        r2.<init>();	 Catch:{ SQLiteException -> 0x0054 }
        r3 = "UPDATE ";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = "events";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = " SET ";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = com.facebook.ads.internal.p086e.C3794c.f15210i;	 Catch:{ SQLiteException -> 0x0054 }
        r3 = r3.f5378b;	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = "=";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = com.facebook.ads.internal.p086e.C3794c.f15210i;	 Catch:{ SQLiteException -> 0x0054 }
        r3 = r3.f5378b;	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = "+1";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = " WHERE ";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = com.facebook.ads.internal.p086e.C3794c.f15202a;	 Catch:{ SQLiteException -> 0x0054 }
        r3 = r3.f5378b;	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = "=?";	 Catch:{ SQLiteException -> 0x0054 }
        r2.append(r3);	 Catch:{ SQLiteException -> 0x0054 }
        r3 = r5.m6716a();	 Catch:{ SQLiteException -> 0x0054 }
        r2 = r2.toString();	 Catch:{ SQLiteException -> 0x0054 }
        r4 = new java.lang.String[r0];	 Catch:{ SQLiteException -> 0x0054 }
        r4[r1] = r6;	 Catch:{ SQLiteException -> 0x0054 }
        r3.execSQL(r2, r4);	 Catch:{ SQLiteException -> 0x0054 }
        goto L_0x0055;
    L_0x0054:
        r0 = 0;
    L_0x0055:
        r6 = f5394j;
        r6.unlock();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.e.d.a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public synchronized void m6720b() {
        for (C1791g e : m6722c()) {
            e.m6739e();
        }
        if (this.f5398n != null) {
            this.f5398n.close();
            this.f5398n = null;
        }
    }

    /* renamed from: b */
    public boolean m6721b(String str) {
        f5394j.lock();
        try {
            boolean a = this.f5397m.m18976a(str);
            return a;
        } finally {
            f5394j.unlock();
        }
    }

    /* renamed from: c */
    public C1791g[] m6722c() {
        return new C1791g[]{this.f5396l, this.f5397m};
    }

    /* renamed from: d */
    public Cursor m6723d() {
        f5393i.lock();
        try {
            Cursor c = this.f5397m.mo1350c();
            return c;
        } finally {
            f5393i.unlock();
        }
    }

    /* renamed from: e */
    public Cursor m6724e() {
        f5393i.lock();
        try {
            Cursor d = this.f5397m.m18979d();
            return d;
        } finally {
            f5393i.unlock();
        }
    }

    /* renamed from: f */
    public Cursor m6725f() {
        f5393i.lock();
        try {
            Cursor c = this.f5396l.mo1350c();
            return c;
        } finally {
            f5393i.unlock();
        }
    }

    /* renamed from: g */
    public void m6726g() {
        f5394j.lock();
        try {
            this.f5396l.m18984d();
        } finally {
            f5394j.unlock();
        }
    }
}
