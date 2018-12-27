package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.p126c.C2163a;
import com.google.android.exoplayer2.p126c.C2186s;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

public final class Loader {
    /* renamed from: a */
    private final ExecutorService f7508a;
    /* renamed from: b */
    private C2361b<? extends C2362c> f7509b;
    /* renamed from: c */
    private IOException f7510c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected ");
            stringBuilder.append(th.getClass().getSimpleName());
            stringBuilder.append(": ");
            stringBuilder.append(th.getMessage());
            super(stringBuilder.toString(), th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$a */
    public interface C2360a<T extends C2362c> {
        /* renamed from: a */
        int mo4051a(T t, long j, long j2, IOException iOException);

        /* renamed from: a */
        void mo4059a(T t, long j, long j2);

        /* renamed from: a */
        void mo4060a(T t, long j, long j2, boolean z);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.upstream.Loader$b */
    private final class C2361b<T extends C2362c> extends Handler implements Runnable {
        /* renamed from: a */
        public final int f7499a;
        /* renamed from: b */
        final /* synthetic */ Loader f7500b;
        /* renamed from: c */
        private final T f7501c;
        /* renamed from: d */
        private final C2360a<T> f7502d;
        /* renamed from: e */
        private final long f7503e;
        /* renamed from: f */
        private IOException f7504f;
        /* renamed from: g */
        private int f7505g;
        /* renamed from: h */
        private volatile Thread f7506h;
        /* renamed from: i */
        private volatile boolean f7507i;

        public C2361b(Loader loader, Looper looper, T t, C2360a<T> c2360a, int i, long j) {
            this.f7500b = loader;
            super(looper);
            this.f7501c = t;
            this.f7502d = c2360a;
            this.f7499a = i;
            this.f7503e = j;
        }

        /* renamed from: a */
        public void m8674a(int i) {
            if (this.f7504f == null) {
                return;
            }
            if (this.f7505g > i) {
                throw this.f7504f;
            }
        }

        /* renamed from: a */
        public void m8675a(long j) {
            C2163a.m7918b(this.f7500b.f7509b == null);
            this.f7500b.f7509b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m8671a();
            }
        }

        /* renamed from: a */
        public void m8676a(boolean z) {
            this.f7507i = z;
            this.f7504f = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f7501c.mo1665a();
                if (this.f7506h != null) {
                    this.f7506h.interrupt();
                }
            }
            if (z) {
                m8672b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f7502d.mo4060a(this.f7501c, elapsedRealtime, elapsedRealtime - this.f7503e, true);
            }
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r4 = this;
            r0 = 2;
            r1 = 3;
            r2 = java.lang.Thread.currentThread();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r4.f7506h = r2;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r4.f7501c;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r2.mo1666b();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            if (r2 != 0) goto L_0x003c;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x0010:
            r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2.<init>();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = "load:";	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2.append(r3);	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = r4.f7501c;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = r3.getClass();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r3 = r3.getSimpleName();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2.append(r3);	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r2.toString();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            com.google.android.exoplayer2.p126c.C2184r.m8036a(r2);	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            r2 = r4.f7501c;	 Catch:{ all -> 0x0037 }
            r2.mo1667c();	 Catch:{ all -> 0x0037 }
            com.google.android.exoplayer2.p126c.C2184r.m8035a();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            goto L_0x003c;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x0037:
            r2 = move-exception;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            com.google.android.exoplayer2.p126c.C2184r.m8035a();	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            throw r2;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x003c:
            r2 = r4.f7507i;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            if (r2 != 0) goto L_0x00a9;	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
        L_0x0040:
            r4.sendEmptyMessage(r0);	 Catch:{ IOException -> 0x009d, InterruptedException -> 0x008b, Exception -> 0x0072, OutOfMemoryError -> 0x0059, Error -> 0x0044 }
            goto L_0x00a9;
        L_0x0044:
            r0 = move-exception;
            r1 = "LoadTask";
            r2 = "Unexpected error loading stream";
            android.util.Log.e(r1, r2, r0);
            r1 = r4.f7507i;
            if (r1 != 0) goto L_0x0058;
        L_0x0050:
            r1 = 4;
            r1 = r4.obtainMessage(r1, r0);
            r1.sendToTarget();
        L_0x0058:
            throw r0;
        L_0x0059:
            r0 = move-exception;
            r2 = "LoadTask";
            r3 = "OutOfMemory error loading stream";
            android.util.Log.e(r2, r3, r0);
            r2 = r4.f7507i;
            if (r2 != 0) goto L_0x00a9;
        L_0x0065:
            r2 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
            r2.<init>(r0);
            r0 = r4.obtainMessage(r1, r2);
            r0.sendToTarget();
            goto L_0x00a9;
        L_0x0072:
            r0 = move-exception;
            r2 = "LoadTask";
            r3 = "Unexpected exception loading stream";
            android.util.Log.e(r2, r3, r0);
            r2 = r4.f7507i;
            if (r2 != 0) goto L_0x00a9;
        L_0x007e:
            r2 = new com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
            r2.<init>(r0);
            r0 = r4.obtainMessage(r1, r2);
            r0.sendToTarget();
            goto L_0x00a9;
            r1 = r4.f7501c;
            r1 = r1.mo1666b();
            com.google.android.exoplayer2.p126c.C2163a.m7918b(r1);
            r1 = r4.f7507i;
            if (r1 != 0) goto L_0x00a9;
        L_0x0099:
            r4.sendEmptyMessage(r0);
            goto L_0x00a9;
        L_0x009d:
            r0 = move-exception;
            r2 = r4.f7507i;
            if (r2 != 0) goto L_0x00a9;
        L_0x00a2:
            r0 = r4.obtainMessage(r1, r0);
            r0.sendToTarget();
        L_0x00a9:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.Loader.b.run():void");
        }

        public void handleMessage(Message message) {
            if (!this.f7507i) {
                if (message.what == 0) {
                    m8671a();
                } else if (message.what != 4) {
                    m8672b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f7503e;
                    if (this.f7501c.mo1666b()) {
                        this.f7502d.mo4060a(this.f7501c, elapsedRealtime, j, false);
                        return;
                    }
                    switch (message.what) {
                        case 1:
                            this.f7502d.mo4060a(this.f7501c, elapsedRealtime, j, false);
                            break;
                        case 2:
                            this.f7502d.mo4059a(this.f7501c, elapsedRealtime, j);
                            break;
                        case 3:
                            this.f7504f = (IOException) message.obj;
                            message = this.f7502d.mo4051a(this.f7501c, elapsedRealtime, j, this.f7504f);
                            if (message != 3) {
                                if (message != 2) {
                                    int i = 1;
                                    if (message != 1) {
                                        i = 1 + this.f7505g;
                                    }
                                    this.f7505g = i;
                                    m8675a(m8673c());
                                    break;
                                }
                            }
                            this.f7500b.f7510c = this.f7504f;
                            break;
                            break;
                        default:
                            break;
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        /* renamed from: a */
        private void m8671a() {
            this.f7504f = null;
            this.f7500b.f7508a.execute(this.f7500b.f7509b);
        }

        /* renamed from: b */
        private void m8672b() {
            this.f7500b.f7509b = null;
        }

        /* renamed from: c */
        private long m8673c() {
            return (long) Math.min((this.f7505g - 1) * 1000, 5000);
        }
    }

    /* renamed from: com.google.android.exoplayer2.upstream.Loader$c */
    public interface C2362c {
        /* renamed from: a */
        void mo1665a();

        /* renamed from: b */
        boolean mo1666b();

        /* renamed from: c */
        void mo1667c();
    }

    public Loader(String str) {
        this.f7508a = C2186s.m8047a(str);
    }

    /* renamed from: a */
    public <T extends C2362c> long m8684a(T t, C2360a<T> c2360a, int i) {
        Looper myLooper = Looper.myLooper();
        C2163a.m7918b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C2361b(this, myLooper, t, c2360a, i, elapsedRealtime).m8675a((long) null);
        return elapsedRealtime;
    }

    /* renamed from: a */
    public boolean m8687a() {
        return this.f7509b != null;
    }

    /* renamed from: b */
    public void m8688b() {
        this.f7509b.m8676a(false);
    }

    /* renamed from: a */
    public void m8686a(Runnable runnable) {
        if (this.f7509b != null) {
            this.f7509b.m8676a(true);
        }
        if (runnable != null) {
            this.f7508a.execute(runnable);
        }
        this.f7508a.shutdown();
    }

    /* renamed from: c */
    public void m8689c() {
        m8685a(Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void m8685a(int i) {
        if (this.f7510c != null) {
            throw this.f7510c;
        } else if (this.f7509b != null) {
            C2361b c2361b = this.f7509b;
            if (i == Integer.MIN_VALUE) {
                i = this.f7509b.f7499a;
            }
            c2361b.m8674a(i);
        }
    }
}
