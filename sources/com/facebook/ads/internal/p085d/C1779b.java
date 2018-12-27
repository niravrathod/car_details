package com.facebook.ads.internal.p085d;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.d.b */
public class C1779b {
    /* renamed from: a */
    private static final String f5362a = "b";
    /* renamed from: b */
    private static final ExecutorService f5363b = Executors.newSingleThreadExecutor();
    /* renamed from: c */
    private static final ExecutorService f5364c = Executors.newFixedThreadPool(5);
    /* renamed from: d */
    private final Handler f5365d = new Handler();
    /* renamed from: e */
    private final C1780c f5366e;
    /* renamed from: f */
    private final C1782d f5367f;
    /* renamed from: g */
    private final List<Callable<Boolean>> f5368g;

    /* renamed from: com.facebook.ads.internal.d.b$a */
    private class C1777a implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1779b f5356a;
        /* renamed from: b */
        private final String f5357b;
        /* renamed from: c */
        private final int f5358c;
        /* renamed from: d */
        private final int f5359d;

        public C1777a(C1779b c1779b, String str, int i, int i2) {
            this.f5356a = c1779b;
            this.f5357b = str;
            this.f5358c = i;
            this.f5359d = i2;
        }

        /* renamed from: a */
        public Boolean m6680a() {
            return Boolean.valueOf(this.f5356a.f5366e.m6699a(this.f5357b, this.f5358c, this.f5359d) != null);
        }

        public /* synthetic */ Object call() {
            return m6680a();
        }
    }

    /* renamed from: com.facebook.ads.internal.d.b$b */
    private class C1778b implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1779b f5360a;
        /* renamed from: b */
        private final String f5361b;

        public C1778b(C1779b c1779b, String str) {
            this.f5360a = c1779b;
            this.f5361b = str;
        }

        /* renamed from: a */
        public Boolean m6681a() {
            return Boolean.valueOf(this.f5360a.f5367f.m6703a(this.f5361b));
        }

        public /* synthetic */ Object call() {
            return m6681a();
        }
    }

    public C1779b(Context context) {
        this.f5366e = C1780c.m6692a(context);
        this.f5367f = C1782d.m6701a(context);
        this.f5368g = new ArrayList();
    }

    /* renamed from: a */
    public void m6687a(final C1774a c1774a) {
        final ArrayList arrayList = new ArrayList(this.f5368g);
        f5363b.execute(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C1779b f5355c;

            public void run() {
                List<Future> arrayList = new ArrayList(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(C1779b.f5364c.submit((Callable) it.next()));
                }
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList) {
                        atomicBoolean.set(((Boolean) future.get()).booleanValue() & atomicBoolean.get());
                    }
                } catch (Throwable e) {
                    Log.e(C1779b.f5362a, "Exception while executing cache downloads.", e);
                    atomicBoolean.set(false);
                }
                this.f5355c.f5365d.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C17761 f5352b;

                    public void run() {
                        if (c1774a == null) {
                            return;
                        }
                        if (atomicBoolean.get()) {
                            c1774a.mo1334a();
                        } else {
                            c1774a.mo1335b();
                        }
                    }
                });
            }
        });
        this.f5368g.clear();
    }

    /* renamed from: a */
    public void m6688a(String str) {
        this.f5368g.add(new C1778b(this, str));
    }

    /* renamed from: a */
    public void m6689a(String str, int i, int i2) {
        this.f5368g.add(new C1777a(this, str, i, i2));
    }

    /* renamed from: b */
    public String m6690b(String str) {
        return this.f5367f.m6704b(str);
    }
}
