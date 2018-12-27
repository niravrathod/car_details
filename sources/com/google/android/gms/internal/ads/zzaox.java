package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@zzaer
public final class zzaox {
    /* renamed from: a */
    public static <V> void m10026a(zzapi<V> zzapi, zzaou<V> zzaou, Executor executor) {
        zzapi.mo1947a(new ep(zzaou, zzapi), executor);
    }

    /* renamed from: a */
    public static <A, B> zzapi<B> m10022a(zzapi<A> zzapi, zzaot<A, B> zzaot, Executor executor) {
        zzapi zzaps = new zzaps();
        zzapi.mo1947a(new eq(zzaps, zzaot, zzapi), executor);
        m10028a(zzaps, (Future) zzapi);
        return zzaps;
    }

    /* renamed from: a */
    public static <A, B> zzapi<B> m10021a(zzapi<A> zzapi, zzaos<? super A, ? extends B> zzaos, Executor executor) {
        zzapi zzaps = new zzaps();
        zzapi.mo1947a(new er(zzaps, zzaos, zzapi), executor);
        m10028a(zzaps, (Future) zzapi);
        return zzaps;
    }

    /* renamed from: a */
    public static <V> zzapi<V> m10020a(zzapi<V> zzapi, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzaps zzaps = new zzaps();
        m10028a((zzapi) zzaps, (Future) zzapi);
        j = scheduledExecutorService.schedule(new es(zzaps), j, timeUnit);
        m10027a((zzapi) zzapi, zzaps);
        zzaps.mo1947a(new et(j), zzapn.f8962b);
        return zzaps;
    }

    /* renamed from: a */
    public static <V, X extends Throwable> zzapi<V> m10023a(zzapi<? extends V> zzapi, Class<X> cls, zzaos<? super X, ? extends V> zzaos, Executor executor) {
        zzapi zzaps = new zzaps();
        m10028a(zzaps, (Future) zzapi);
        zzapi.mo1947a(new eu(zzaps, zzapi, cls, zzaos, executor), zzapn.f8962b);
        return zzaps;
    }

    /* renamed from: a */
    public static <T> T m10024a(Future<T> future, T t) {
        try {
            return future.get(((Long) zzkd.m10713e().m10897a(zznw.aZ)).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            future.cancel(true);
            zzaok.m10004c("InterruptedException caught while resolving future.", e);
            Thread.currentThread().interrupt();
            zzbv.zzeo().m9717b(e, "Futures.resolveFuture");
            return t;
        } catch (Throwable e2) {
            future.cancel(true);
            zzaok.m10002b("Error waiting for future.", e2);
            zzbv.zzeo().m9717b(e2, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> T m10025a(Future<T> future, T t, long j, TimeUnit timeUnit) {
        try {
            return future.get(j, timeUnit);
        } catch (long j2) {
            future.cancel(true);
            zzaok.m10004c("InterruptedException caught while resolving future.", j2);
            Thread.currentThread().interrupt();
            zzbv.zzeo().m9717b(j2, "Futures.resolveFuture");
            return t;
        } catch (long j22) {
            future.cancel(true);
            zzaok.m10002b("Error waiting for future.", j22);
            zzbv.zzeo().m9717b(j22, "Futures.resolveFuture");
            return t;
        }
    }

    /* renamed from: a */
    public static <T> ey<T> m10019a(T t) {
        return new ey(t);
    }

    /* renamed from: a */
    public static <T> ex<T> m10018a(Throwable th) {
        return new ex(th);
    }

    /* renamed from: a */
    private static <V> void m10027a(zzapi<? extends V> zzapi, zzaps<V> zzaps) {
        m10028a((zzapi) zzaps, (Future) zzapi);
        zzapi.mo1947a(new ev(zzaps, zzapi), zzapn.f8962b);
    }

    /* renamed from: a */
    private static <A, B> void m10028a(zzapi<A> zzapi, Future<B> future) {
        zzapi.mo1947a(new ew(zzapi, future), zzapn.f8962b);
    }

    /* renamed from: a */
    static final /* synthetic */ void m10030a(zzaps zzaps, zzapi zzapi, Class cls, zzaos zzaos, Executor executor) {
        Object cause;
        try {
            zzaps.m21290b(zzapi.get());
        } catch (zzapi zzapi2) {
            cause = zzapi2.getCause();
            if (cls.isInstance(cause) != null) {
                m10027a(m10021a(m10019a(cause), zzaos, executor), zzaps);
            } else {
                zzaps.m21289a(cause);
            }
        } catch (InterruptedException e) {
            cause = e;
            Thread.currentThread().interrupt();
            if (cls.isInstance(cause) != null) {
                zzaps.m21289a(cause);
            } else {
                m10027a(m10021a(m10019a(cause), zzaos, executor), zzaps);
            }
        } catch (Exception e2) {
            cause = e2;
            if (cls.isInstance(cause) != null) {
                m10027a(m10021a(m10019a(cause), zzaos, executor), zzaps);
            } else {
                zzaps.m21289a(cause);
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10029a(com.google.android.gms.internal.ads.zzaps r1, com.google.android.gms.internal.ads.zzaos r2, com.google.android.gms.internal.ads.zzapi r3) {
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
        r0 = r1.isCancelled();
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r3 = r3.get();	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        r2 = r2.mo1714a(r3);	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        m10027a(r2, r1);	 Catch:{ CancellationException -> 0x002d, ExecutionException -> 0x0024, InterruptedException -> 0x0018, Exception -> 0x0013 }
        return;
    L_0x0013:
        r2 = move-exception;
        r1.m21289a(r2);
        return;
    L_0x0018:
        r2 = move-exception;
        r3 = java.lang.Thread.currentThread();
        r3.interrupt();
        r1.m21289a(r2);
        return;
    L_0x0024:
        r2 = move-exception;
        r2 = r2.getCause();
        r1.m21289a(r2);
        return;
    L_0x002d:
        r2 = 1;
        r1.cancel(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaox.a(com.google.android.gms.internal.ads.zzaps, com.google.android.gms.internal.ads.zzaos, com.google.android.gms.internal.ads.zzapi):void");
    }
}
