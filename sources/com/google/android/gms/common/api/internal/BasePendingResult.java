package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
@KeepForSdk
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    static final ThreadLocal<Boolean> zadm = new zap();
    @KeepName
    private zaa mResultGuardian;
    private Status mStatus;
    private R zaci;
    private final Object zadn;
    private final CallbackHandler<R> zado;
    private final WeakReference<GoogleApiClient> zadp;
    private final CountDownLatch zadq;
    private final ArrayList<StatusListener> zadr;
    private ResultCallback<? super R> zads;
    private final AtomicReference<zacs> zadt;
    private volatile boolean zadu;
    private boolean zadv;
    private boolean zadw;
    private ICancelToken zadx;
    private volatile zacm<R> zady;
    private boolean zadz;

    private final class zaa {
        private final /* synthetic */ BasePendingResult zaea;

        private zaa(BasePendingResult basePendingResult) {
            this.zaea = basePendingResult;
        }

        protected final void finalize() {
            BasePendingResult.zab(this.zaea.zaci);
            super.finalize();
        }
    }

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zal {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public final void zaa(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    ResultCallback resultCallback = (ResultCallback) pair.first;
                    Result result = (Result) pair.second;
                    try {
                        resultCallback.onResult(result);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.zab(result);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).zab(Status.RESULT_TIMEOUT);
                    return;
                default:
                    message = message.what;
                    StringBuilder stringBuilder = new StringBuilder(45);
                    stringBuilder.append("Don't know how to handle message: ");
                    stringBuilder.append(message);
                    Log.wtf("BasePendingResult", stringBuilder.toString(), new Exception());
                    return;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = new CallbackHandler(Looper.getMainLooper());
        this.zadp = new WeakReference(null);
    }

    @KeepForSdk
    protected abstract R createFailedResult(Status status);

    public final Integer zam() {
        return null;
    }

    @KeepForSdk
    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = new CallbackHandler(googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper());
        this.zadp = new WeakReference(googleApiClient);
    }

    @KeepForSdk
    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = new CallbackHandler(looper);
        this.zadp = new WeakReference(null);
    }

    @KeepForSdk
    @VisibleForTesting
    protected BasePendingResult(CallbackHandler<R> callbackHandler) {
        this.zadn = new Object();
        this.zadq = new CountDownLatch(1);
        this.zadr = new ArrayList();
        this.zadt = new AtomicReference();
        this.zadz = false;
        this.zado = (CallbackHandler) Preconditions.checkNotNull(callbackHandler, "CallbackHandler must not be null");
        this.zadp = new WeakReference(null);
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.zadq.getCount() == 0;
    }

    public final R await() {
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
        r0 = "await must not be called on the UI thread";
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0);
        r0 = r3.zadu;
        r1 = 1;
        r0 = r0 ^ r1;
        r2 = "Result has already been consumed";
        com.google.android.gms.common.internal.Preconditions.checkState(r0, r2);
        r0 = r3.zady;
        if (r0 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0014;
    L_0x0013:
        r1 = 0;
    L_0x0014:
        r0 = "Cannot await if then() has been called.";
        com.google.android.gms.common.internal.Preconditions.checkState(r1, r0);
        r0 = r3.zadq;	 Catch:{ InterruptedException -> 0x001f }
        r0.await();	 Catch:{ InterruptedException -> 0x001f }
        goto L_0x0024;
    L_0x001f:
        r0 = com.google.android.gms.common.api.Status.RESULT_INTERRUPTED;
        r3.zab(r0);
    L_0x0024:
        r0 = r3.isReady();
        r1 = "Result is not ready.";
        com.google.android.gms.common.internal.Preconditions.checkState(r0, r1);
        r0 = r3.get();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.await():R");
    }

    public final R await(long r4, java.util.concurrent.TimeUnit r6) {
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
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x000b;
    L_0x0006:
        r0 = "await must not be called on the UI thread when time is greater than zero.";
        com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r0);
    L_0x000b:
        r0 = r3.zadu;
        r1 = 1;
        r0 = r0 ^ r1;
        r2 = "Result has already been consumed.";
        com.google.android.gms.common.internal.Preconditions.checkState(r0, r2);
        r0 = r3.zady;
        if (r0 != 0) goto L_0x0019;
    L_0x0018:
        goto L_0x001a;
    L_0x0019:
        r1 = 0;
    L_0x001a:
        r0 = "Cannot await if then() has been called.";
        com.google.android.gms.common.internal.Preconditions.checkState(r1, r0);
        r0 = r3.zadq;	 Catch:{ InterruptedException -> 0x002d }
        r4 = r0.await(r4, r6);	 Catch:{ InterruptedException -> 0x002d }
        if (r4 != 0) goto L_0x0032;	 Catch:{ InterruptedException -> 0x002d }
    L_0x0027:
        r4 = com.google.android.gms.common.api.Status.RESULT_TIMEOUT;	 Catch:{ InterruptedException -> 0x002d }
        r3.zab(r4);	 Catch:{ InterruptedException -> 0x002d }
        goto L_0x0032;
    L_0x002d:
        r4 = com.google.android.gms.common.api.Status.RESULT_INTERRUPTED;
        r3.zab(r4);
    L_0x0032:
        r4 = r3.isReady();
        r5 = "Result is not ready.";
        com.google.android.gms.common.internal.Preconditions.checkState(r4, r5);
        r4 = r3.get();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.await(long, java.util.concurrent.TimeUnit):R");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r5) {
        /*
        r4 = this;
        r0 = r4.zadn;
        monitor-enter(r0);
        if (r5 != 0) goto L_0x000c;
    L_0x0005:
        r5 = 0;
        r4.zads = r5;	 Catch:{ all -> 0x000a }
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x000a:
        r5 = move-exception;
        goto L_0x003c;
    L_0x000c:
        r1 = r4.zadu;	 Catch:{ all -> 0x000a }
        r2 = 1;
        r1 = r1 ^ r2;
        r3 = "Result has already been consumed.";
        com.google.android.gms.common.internal.Preconditions.checkState(r1, r3);	 Catch:{ all -> 0x000a }
        r1 = r4.zady;	 Catch:{ all -> 0x000a }
        if (r1 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.Preconditions.checkState(r2, r1);	 Catch:{ all -> 0x000a }
        r1 = r4.isCanceled();	 Catch:{ all -> 0x000a }
        if (r1 == 0) goto L_0x0028;
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x0028:
        r1 = r4.isReady();	 Catch:{ all -> 0x000a }
        if (r1 == 0) goto L_0x0038;
    L_0x002e:
        r1 = r4.zado;	 Catch:{ all -> 0x000a }
        r2 = r4.get();	 Catch:{ all -> 0x000a }
        r1.zaa(r5, r2);	 Catch:{ all -> 0x000a }
        goto L_0x003a;
    L_0x0038:
        r4.zads = r5;	 Catch:{ all -> 0x000a }
    L_0x003a:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x003c:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @com.google.android.gms.common.annotation.KeepForSdk
    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback<? super R> r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
        r4 = this;
        r0 = r4.zadn;
        monitor-enter(r0);
        if (r5 != 0) goto L_0x000c;
    L_0x0005:
        r5 = 0;
        r4.zads = r5;	 Catch:{ all -> 0x000a }
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x000a:
        r5 = move-exception;
        goto L_0x004a;
    L_0x000c:
        r1 = r4.zadu;	 Catch:{ all -> 0x000a }
        r2 = 1;
        r1 = r1 ^ r2;
        r3 = "Result has already been consumed.";
        com.google.android.gms.common.internal.Preconditions.checkState(r1, r3);	 Catch:{ all -> 0x000a }
        r1 = r4.zady;	 Catch:{ all -> 0x000a }
        if (r1 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001b;
    L_0x001a:
        r2 = 0;
    L_0x001b:
        r1 = "Cannot set callbacks if then() has been called.";
        com.google.android.gms.common.internal.Preconditions.checkState(r2, r1);	 Catch:{ all -> 0x000a }
        r1 = r4.isCanceled();	 Catch:{ all -> 0x000a }
        if (r1 == 0) goto L_0x0028;
    L_0x0026:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x0028:
        r1 = r4.isReady();	 Catch:{ all -> 0x000a }
        if (r1 == 0) goto L_0x0038;
    L_0x002e:
        r6 = r4.zado;	 Catch:{ all -> 0x000a }
        r7 = r4.get();	 Catch:{ all -> 0x000a }
        r6.zaa(r5, r7);	 Catch:{ all -> 0x000a }
        goto L_0x0048;
    L_0x0038:
        r4.zads = r5;	 Catch:{ all -> 0x000a }
        r5 = r4.zado;	 Catch:{ all -> 0x000a }
        r6 = r8.toMillis(r6);	 Catch:{ all -> 0x000a }
        r8 = 2;
        r8 = r5.obtainMessage(r8, r4);	 Catch:{ all -> 0x000a }
        r5.sendMessageDelayed(r8, r6);	 Catch:{ all -> 0x000a }
    L_0x0048:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;
    L_0x004a:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(com.google.android.gms.common.api.ResultCallback, long, java.util.concurrent.TimeUnit):void");
    }

    public final void addStatusListener(StatusListener statusListener) {
        Preconditions.checkArgument(statusListener != null, "Callback cannot be null.");
        synchronized (this.zadn) {
            if (isReady()) {
                statusListener.onComplete(this.mStatus);
            } else {
                this.zadr.add(statusListener);
            }
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void cancel() {
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
        r2 = this;
        r0 = r2.zadn;
        monitor-enter(r0);
        r1 = r2.zadv;	 Catch:{ all -> 0x002a }
        if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x002a }
    L_0x0007:
        r1 = r2.zadu;	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x000c;	 Catch:{ all -> 0x002a }
    L_0x000b:
        goto L_0x0028;	 Catch:{ all -> 0x002a }
    L_0x000c:
        r1 = r2.zadx;	 Catch:{ all -> 0x002a }
        if (r1 == 0) goto L_0x0015;
    L_0x0010:
        r1 = r2.zadx;	 Catch:{ RemoteException -> 0x0015 }
        r1.cancel();	 Catch:{ RemoteException -> 0x0015 }
    L_0x0015:
        r1 = r2.zaci;	 Catch:{ all -> 0x002a }
        zab(r1);	 Catch:{ all -> 0x002a }
        r1 = 1;	 Catch:{ all -> 0x002a }
        r2.zadv = r1;	 Catch:{ all -> 0x002a }
        r1 = com.google.android.gms.common.api.Status.RESULT_CANCELED;	 Catch:{ all -> 0x002a }
        r1 = r2.createFailedResult(r1);	 Catch:{ all -> 0x002a }
        r2.zaa(r1);	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;	 Catch:{ all -> 0x002a }
    L_0x0028:
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r1 = move-exception;	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public final boolean zat() {
        boolean isCanceled;
        synchronized (this.zadn) {
            if (((GoogleApiClient) this.zadp.get()) == null || !this.zadz) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.zadn) {
            z = this.zadv;
        }
        return z;
    }

    public <S extends Result> TransformedResult<S> then(ResultTransform<? super R, ? extends S> resultTransform) {
        Preconditions.checkState(this.zadu ^ true, "Result has already been consumed.");
        synchronized (this.zadn) {
            boolean z = false;
            Preconditions.checkState(this.zady == null, "Cannot call then() twice.");
            if (this.zads == null) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(this.zadv ^ true, "Cannot call then() if result was canceled.");
            this.zadz = true;
            this.zady = new zacm(this.zadp);
            resultTransform = this.zady.then(resultTransform);
            if (isReady()) {
                this.zado.zaa(this.zady, get());
            } else {
                this.zads = this.zady;
            }
        }
        return resultTransform;
    }

    @KeepForSdk
    public final void setResult(R r) {
        synchronized (this.zadn) {
            if (this.zadw || this.zadv) {
                zab((Result) r);
                return;
            }
            isReady();
            Preconditions.checkState(isReady() ^ 1, "Results have already been set");
            Preconditions.checkState(this.zadu ^ 1, "Result has already been consumed");
            zaa((Result) r);
        }
    }

    public final void zab(Status status) {
        synchronized (this.zadn) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zadw = true;
            }
        }
    }

    public final void zaa(zacs zacs) {
        this.zadt.set(zacs);
    }

    @KeepForSdk
    protected final void setCancelToken(ICancelToken iCancelToken) {
        synchronized (this.zadn) {
            this.zadx = iCancelToken;
        }
    }

    public final void zau() {
        boolean z;
        if (!this.zadz) {
            if (!((Boolean) zadm.get()).booleanValue()) {
                z = false;
                this.zadz = z;
            }
        }
        z = true;
        this.zadz = z;
    }

    private final R get() {
        R r;
        synchronized (this.zadn) {
            Preconditions.checkState(this.zadu ^ true, "Result has already been consumed.");
            Preconditions.checkState(isReady(), "Result is not ready.");
            r = this.zaci;
            this.zaci = null;
            this.zads = null;
            this.zadu = true;
        }
        zacs zacs = (zacs) this.zadt.getAndSet(null);
        if (zacs != null) {
            zacs.zac(this);
        }
        return r;
    }

    private final void zaa(R r) {
        this.zaci = r;
        this.zadx = null;
        this.zadq.countDown();
        this.mStatus = this.zaci.getStatus();
        if (this.zadv) {
            this.zads = null;
        } else if (this.zads != null) {
            this.zado.removeMessages(2);
            this.zado.zaa(this.zads, get());
        } else if (this.zaci instanceof Releasable) {
            this.mResultGuardian = new zaa();
        }
        ArrayList arrayList = (ArrayList) this.zadr;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((StatusListener) obj).onComplete(this.mStatus);
        }
        this.zadr.clear();
    }

    public static void zab(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                result = String.valueOf(result);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(result).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(result);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }
}
