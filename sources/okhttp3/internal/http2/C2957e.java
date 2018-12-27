package okhttp3.internal.http2;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C2929b;
import okhttp3.internal.C2933c;
import okhttp3.internal.http2.C2959f.C2958b;
import okio.ByteString;
import okio.C4393d;
import okio.C4394e;
import okio.C4755c;

/* renamed from: okhttp3.internal.http2.e */
public final class C2957e implements Closeable {
    /* renamed from: r */
    static final /* synthetic */ boolean f12477r = (C2957e.class.desiredAssertionStatus() ^ true);
    /* renamed from: s */
    private static final ExecutorService f12478s = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), C2933c.m14192a("OkHttp Http2Connection", true));
    /* renamed from: a */
    final boolean f12479a;
    /* renamed from: b */
    final C2956b f12480b;
    /* renamed from: c */
    final Map<Integer, C2960g> f12481c = new LinkedHashMap();
    /* renamed from: d */
    final String f12482d;
    /* renamed from: e */
    int f12483e;
    /* renamed from: f */
    int f12484f;
    /* renamed from: g */
    boolean f12485g;
    /* renamed from: h */
    final C2964j f12486h;
    /* renamed from: i */
    long f12487i = 0;
    /* renamed from: j */
    long f12488j;
    /* renamed from: k */
    C2965k f12489k = new C2965k();
    /* renamed from: l */
    final C2965k f12490l = new C2965k();
    /* renamed from: m */
    boolean f12491m = false;
    /* renamed from: n */
    final Socket f12492n;
    /* renamed from: o */
    final C2961h f12493o;
    /* renamed from: p */
    final C4375d f12494p;
    /* renamed from: q */
    final Set<Integer> f12495q = new LinkedHashSet();
    /* renamed from: t */
    private final ScheduledExecutorService f12496t;
    /* renamed from: u */
    private final ExecutorService f12497u;
    /* renamed from: v */
    private boolean f12498v;

    /* renamed from: okhttp3.internal.http2.e$a */
    public static class C2955a {
        /* renamed from: a */
        Socket f12468a;
        /* renamed from: b */
        String f12469b;
        /* renamed from: c */
        C4394e f12470c;
        /* renamed from: d */
        C4393d f12471d;
        /* renamed from: e */
        C2956b f12472e = C2956b.f12476f;
        /* renamed from: f */
        C2964j f12473f = C2964j.f12531a;
        /* renamed from: g */
        boolean f12474g;
        /* renamed from: h */
        int f12475h;

        public C2955a(boolean z) {
            this.f12474g = z;
        }

        /* renamed from: a */
        public C2955a m14331a(Socket socket, String str, C4394e c4394e, C4393d c4393d) {
            this.f12468a = socket;
            this.f12469b = str;
            this.f12470c = c4394e;
            this.f12471d = c4393d;
            return this;
        }

        /* renamed from: a */
        public C2955a m14332a(C2956b c2956b) {
            this.f12472e = c2956b;
            return this;
        }

        /* renamed from: a */
        public C2955a m14330a(int i) {
            this.f12475h = i;
            return this;
        }

        /* renamed from: a */
        public C2957e m14333a() {
            return new C2957e(this);
        }
    }

    /* renamed from: okhttp3.internal.http2.e$b */
    public static abstract class C2956b {
        /* renamed from: f */
        public static final C2956b f12476f = new C43701();

        /* renamed from: okhttp3.internal.http2.e$b$1 */
        class C43701 extends C2956b {
            C43701() {
            }

            /* renamed from: a */
            public void mo3637a(C2960g c2960g) {
                c2960g.m14392a(ErrorCode.REFUSED_STREAM);
            }
        }

        /* renamed from: a */
        public void mo3636a(C2957e c2957e) {
        }

        /* renamed from: a */
        public abstract void mo3637a(C2960g c2960g);
    }

    /* renamed from: okhttp3.internal.http2.e$c */
    final class C4371c extends C2929b {
        /* renamed from: a */
        final boolean f18204a;
        /* renamed from: c */
        final int f18205c;
        /* renamed from: d */
        final int f18206d;
        /* renamed from: e */
        final /* synthetic */ C2957e f18207e;

        C4371c(C2957e c2957e, boolean z, int i, int i2) {
            this.f18207e = c2957e;
            super("OkHttp %s ping %08x%08x", c2957e.f12482d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f18204a = z;
            this.f18205c = i;
            this.f18206d = i2;
        }

        /* renamed from: c */
        public void mo3659c() {
            this.f18207e.m14355a(this.f18204a, this.f18205c, this.f18206d);
        }
    }

    /* renamed from: okhttp3.internal.http2.e$d */
    class C4375d extends C2929b implements C2958b {
        /* renamed from: a */
        final C2959f f18213a;
        /* renamed from: c */
        final /* synthetic */ C2957e f18214c;

        /* renamed from: a */
        public void mo3660a() {
        }

        /* renamed from: a */
        public void mo3661a(int i, int i2, int i3, boolean z) {
        }

        C4375d(C2957e c2957e, C2959f c2959f) {
            this.f18214c = c2957e;
            super("OkHttp %s", c2957e.f12482d);
            this.f18213a = c2959f;
        }

        /* renamed from: c */
        protected void mo3659c() {
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
            r5 = this;
            r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            r1 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR;
            r2 = r5.f18213a;	 Catch:{ IOException -> 0x001e }
            r2.m14386a(r5);	 Catch:{ IOException -> 0x001e }
        L_0x0009:
            r2 = r5.f18213a;	 Catch:{ IOException -> 0x001e }
            r3 = 0;	 Catch:{ IOException -> 0x001e }
            r2 = r2.m14387a(r3, r5);	 Catch:{ IOException -> 0x001e }
            if (r2 == 0) goto L_0x0013;	 Catch:{ IOException -> 0x001e }
        L_0x0012:
            goto L_0x0009;	 Catch:{ IOException -> 0x001e }
        L_0x0013:
            r2 = okhttp3.internal.http2.ErrorCode.NO_ERROR;	 Catch:{ IOException -> 0x001e }
            r0 = okhttp3.internal.http2.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x001a }
            r1 = r5.f18214c;	 Catch:{ IOException -> 0x0027 }
            goto L_0x0024;
        L_0x001a:
            r0 = r2;
            goto L_0x001e;
        L_0x001c:
            r2 = move-exception;
            goto L_0x0031;
        L_0x001e:
            r2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x001c }
            r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x002d }
            r1 = r5.f18214c;	 Catch:{ IOException -> 0x0027 }
        L_0x0024:
            r1.m14353a(r2, r0);	 Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r0 = r5.f18213a;
            okhttp3.internal.C2933c.m14194a(r0);
            return;
        L_0x002d:
            r0 = move-exception;
            r4 = r2;
            r2 = r0;
            r0 = r4;
        L_0x0031:
            r3 = r5.f18214c;	 Catch:{ IOException -> 0x0036 }
            r3.m14353a(r0, r1);	 Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r0 = r5.f18213a;
            okhttp3.internal.C2933c.m14194a(r0);
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.c():void");
        }

        /* renamed from: a */
        public void mo3668a(boolean z, int i, C4394e c4394e, int i2) {
            if (this.f18214c.m14361c(i)) {
                this.f18214c.m14349a(i, c4394e, i2, z);
                return;
            }
            C2960g a = this.f18214c.m14343a(i);
            if (a == null) {
                this.f18214c.m14348a(i, ErrorCode.PROTOCOL_ERROR);
                c4394e.mo4565i((long) i2);
                return;
            }
            a.m14393a(c4394e, i2);
            if (z) {
                a.m14403i();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: a */
        public void mo3667a(boolean r10, int r11, int r12, java.util.List<okhttp3.internal.http2.C2950a> r13) {
            /*
            r9 = this;
            r12 = r9.f18214c;
            r12 = r12.m14361c(r11);
            if (r12 == 0) goto L_0x000e;
        L_0x0008:
            r12 = r9.f18214c;
            r12.m14347a(r11, r13, r10);
            return;
        L_0x000e:
            r12 = r9.f18214c;
            monitor-enter(r12);
            r0 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r0 = r0.m14343a(r11);	 Catch:{ all -> 0x007a }
            if (r0 != 0) goto L_0x0070;
        L_0x0019:
            r0 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r0 = r0.f12485g;	 Catch:{ all -> 0x007a }
            if (r0 == 0) goto L_0x0021;
        L_0x001f:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0021:
            r0 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r0 = r0.f12483e;	 Catch:{ all -> 0x007a }
            if (r11 > r0) goto L_0x0029;
        L_0x0027:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0029:
            r0 = r11 % 2;
            r1 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r1 = r1.f12484f;	 Catch:{ all -> 0x007a }
            r2 = 2;
            r1 = r1 % r2;
            if (r0 != r1) goto L_0x0035;
        L_0x0033:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0035:
            r0 = new okhttp3.internal.http2.g;	 Catch:{ all -> 0x007a }
            r5 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r6 = 0;
            r3 = r0;
            r4 = r11;
            r7 = r10;
            r8 = r13;
            r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x007a }
            r10 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r10.f12483e = r11;	 Catch:{ all -> 0x007a }
            r10 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r10 = r10.f12481c;	 Catch:{ all -> 0x007a }
            r13 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x007a }
            r10.put(r13, r0);	 Catch:{ all -> 0x007a }
            r10 = okhttp3.internal.http2.C2957e.f12478s;	 Catch:{ all -> 0x007a }
            r13 = new okhttp3.internal.http2.e$d$1;	 Catch:{ all -> 0x007a }
            r1 = "OkHttp %s stream %d";
            r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x007a }
            r3 = 0;
            r4 = r9.f18214c;	 Catch:{ all -> 0x007a }
            r4 = r4.f12482d;	 Catch:{ all -> 0x007a }
            r2[r3] = r4;	 Catch:{ all -> 0x007a }
            r3 = 1;
            r11 = java.lang.Integer.valueOf(r11);	 Catch:{ all -> 0x007a }
            r2[r3] = r11;	 Catch:{ all -> 0x007a }
            r13.<init>(r9, r1, r2, r0);	 Catch:{ all -> 0x007a }
            r10.execute(r13);	 Catch:{ all -> 0x007a }
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            return;
        L_0x0070:
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            r0.m14391a(r13);
            if (r10 == 0) goto L_0x0079;
        L_0x0076:
            r0.m14403i();
        L_0x0079:
            return;
        L_0x007a:
            r10 = move-exception;
            monitor-exit(r12);	 Catch:{ all -> 0x007a }
            throw r10;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.a(boolean, int, int, java.util.List):void");
        }

        /* renamed from: a */
        public void mo3664a(int i, ErrorCode errorCode) {
            if (this.f18214c.m14361c(i)) {
                this.f18214c.m14360c(i, errorCode);
                return;
            }
            i = this.f18214c.m14356b(i);
            if (i != 0) {
                i.m14396c(errorCode);
            }
        }

        /* renamed from: a */
        public void mo3669a(boolean z, C2965k c2965k) {
            synchronized (this.f18214c) {
                long j;
                boolean d = this.f18214c.f12490l.m14442d();
                if (z) {
                    this.f18214c.f12490l.m14435a();
                }
                this.f18214c.f12490l.m14436a(c2965k);
                m23874a(c2965k);
                z = this.f18214c.f12490l.m14442d();
                C2960g[] c2960gArr = null;
                if (z || z == d) {
                    j = false;
                } else {
                    j = (long) (z - d);
                    if (!this.f18214c.f12491m) {
                        this.f18214c.m14351a(j);
                        this.f18214c.f12491m = true;
                    }
                    if (!this.f18214c.f12481c.isEmpty()) {
                        c2960gArr = (C2960g[]) this.f18214c.f12481c.values().toArray(new C2960g[this.f18214c.f12481c.size()]);
                    }
                }
                ExecutorService e = C2957e.f12478s;
                Object[] objArr = new Object[1];
                int i = 0;
                objArr[0] = this.f18214c.f12482d;
                e.execute(new C2929b(this, "OkHttp %s settings", objArr) {
                    /* renamed from: a */
                    final /* synthetic */ C4375d f18210a;

                    /* renamed from: c */
                    public void mo3659c() {
                        this.f18210a.f18214c.f12480b.mo3636a(this.f18210a.f18214c);
                    }
                });
            }
            if (c2960gArr != null && j != false) {
                int length = c2960gArr.length;
                while (i < length) {
                    C2960g c2960g = c2960gArr[i];
                    synchronized (c2960g) {
                        c2960g.m14390a(j);
                    }
                    i++;
                }
            }
        }

        /* renamed from: a */
        private void m23874a(final okhttp3.internal.http2.C2965k r7) {
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
            r6 = this;
            r0 = r6.f18214c;	 Catch:{ RejectedExecutionException -> 0x001a }
            r0 = r0.f12496t;	 Catch:{ RejectedExecutionException -> 0x001a }
            r1 = new okhttp3.internal.http2.e$d$3;	 Catch:{ RejectedExecutionException -> 0x001a }
            r2 = "OkHttp %s ACK Settings";	 Catch:{ RejectedExecutionException -> 0x001a }
            r3 = 1;	 Catch:{ RejectedExecutionException -> 0x001a }
            r3 = new java.lang.Object[r3];	 Catch:{ RejectedExecutionException -> 0x001a }
            r4 = 0;	 Catch:{ RejectedExecutionException -> 0x001a }
            r5 = r6.f18214c;	 Catch:{ RejectedExecutionException -> 0x001a }
            r5 = r5.f12482d;	 Catch:{ RejectedExecutionException -> 0x001a }
            r3[r4] = r5;	 Catch:{ RejectedExecutionException -> 0x001a }
            r1.<init>(r6, r2, r3, r7);	 Catch:{ RejectedExecutionException -> 0x001a }
            r0.execute(r1);	 Catch:{ RejectedExecutionException -> 0x001a }
        L_0x001a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.a(okhttp3.internal.http2.k):void");
        }

        /* renamed from: a */
        public void mo3666a(boolean r4, int r5, int r6) {
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
            r3 = this;
            if (r4 == 0) goto L_0x0015;
        L_0x0002:
            r4 = r3.f18214c;
            monitor-enter(r4);
            r5 = r3.f18214c;	 Catch:{ all -> 0x0012 }
            r6 = 0;	 Catch:{ all -> 0x0012 }
            r5.f12498v = r6;	 Catch:{ all -> 0x0012 }
            r5 = r3.f18214c;	 Catch:{ all -> 0x0012 }
            r5.notifyAll();	 Catch:{ all -> 0x0012 }
            monitor-exit(r4);	 Catch:{ all -> 0x0012 }
            goto L_0x0026;	 Catch:{ all -> 0x0012 }
        L_0x0012:
            r5 = move-exception;	 Catch:{ all -> 0x0012 }
            monitor-exit(r4);	 Catch:{ all -> 0x0012 }
            throw r5;
        L_0x0015:
            r4 = r3.f18214c;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r4 = r4.f12496t;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r0 = new okhttp3.internal.http2.e$c;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r1 = r3.f18214c;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r2 = 1;	 Catch:{ RejectedExecutionException -> 0x0026 }
            r0.<init>(r1, r2, r5, r6);	 Catch:{ RejectedExecutionException -> 0x0026 }
            r4.execute(r0);	 Catch:{ RejectedExecutionException -> 0x0026 }
        L_0x0026:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.d.a(boolean, int, int):void");
        }

        /* renamed from: a */
        public void mo3665a(int i, ErrorCode errorCode, ByteString byteString) {
            byteString.m14660h();
            synchronized (this.f18214c) {
                C2960g[] c2960gArr = (C2960g[]) this.f18214c.f12481c.values().toArray(new C2960g[this.f18214c.f12481c.size()]);
                this.f18214c.f12485g = true;
            }
            for (C2960g c2960g : c2960gArr) {
                if (c2960g.m14389a() > i && c2960g.m14397c()) {
                    c2960g.m14396c(ErrorCode.REFUSED_STREAM);
                    this.f18214c.m14356b(c2960g.m14389a());
                }
            }
        }

        /* renamed from: a */
        public void mo3663a(int i, long j) {
            if (i == 0) {
                synchronized (this.f18214c) {
                    i = this.f18214c;
                    i.f12488j += j;
                    this.f18214c.notifyAll();
                }
                return;
            }
            i = this.f18214c.m14343a(i);
            if (i != 0) {
                synchronized (i) {
                    i.m14390a(j);
                }
            }
        }

        /* renamed from: a */
        public void mo3662a(int i, int i2, List<C2950a> list) {
            this.f18214c.m14346a(i2, (List) list);
        }
    }

    /* renamed from: c */
    boolean m14361c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    C2957e(C2955a c2955a) {
        C2955a c2955a2 = c2955a;
        this.f12486h = c2955a2.f12473f;
        this.f12479a = c2955a2.f12474g;
        this.f12480b = c2955a2.f12472e;
        r0.f12484f = c2955a2.f12474g ? 1 : 2;
        if (c2955a2.f12474g) {
            r0.f12484f += 2;
        }
        if (c2955a2.f12474g) {
            r0.f12489k.m14434a(7, 16777216);
        }
        r0.f12482d = c2955a2.f12469b;
        r0.f12496t = new ScheduledThreadPoolExecutor(1, C2933c.m14192a(C2933c.m14186a("OkHttp %s Writer", r0.f12482d), false));
        if (c2955a2.f12475h != 0) {
            r0.f12496t.scheduleAtFixedRate(new C4371c(r0, false, 0, 0), (long) c2955a2.f12475h, (long) c2955a2.f12475h, TimeUnit.MILLISECONDS);
        }
        r0.f12497u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C2933c.m14192a(C2933c.m14186a("OkHttp %s Push Observer", r0.f12482d), true));
        r0.f12490l.m14434a(7, 65535);
        r0.f12490l.m14434a(5, 16384);
        r0.f12488j = (long) r0.f12490l.m14442d();
        r0.f12492n = c2955a2.f12468a;
        r0.f12493o = new C2961h(c2955a2.f12471d, r0.f12479a);
        r0.f12494p = new C4375d(r0, new C2959f(c2955a2.f12470c, r0.f12479a));
    }

    /* renamed from: a */
    synchronized C2960g m14343a(int i) {
        return (C2960g) this.f12481c.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    synchronized C2960g m14356b(int i) {
        C2960g c2960g;
        c2960g = (C2960g) this.f12481c.remove(Integer.valueOf(i));
        notifyAll();
        return c2960g;
    }

    /* renamed from: a */
    public synchronized int m14342a() {
        return this.f12490l.m14441c(BaseClientBuilder.API_PRIORITY_OTHER);
    }

    /* renamed from: a */
    public C2960g m14344a(List<C2950a> list, boolean z) {
        return m14339b(0, list, z);
    }

    /* renamed from: b */
    private C2960g m14339b(int i, List<C2950a> list, boolean z) {
        C2960g c2960g;
        boolean z2 = z ^ 1;
        synchronized (this.f12493o) {
            synchronized (this) {
                if (this.f12484f > 1073741823) {
                    m14352a(ErrorCode.REFUSED_STREAM);
                }
                if (this.f12485g) {
                    throw new ConnectionShutdownException();
                }
                int i2 = this.f12484f;
                this.f12484f += 2;
                c2960g = new C2960g(i2, this, z2, false, list);
                if (z && this.f12488j != 0) {
                    if (c2960g.f12506b != 0) {
                        z = false;
                        if (c2960g.m14395b()) {
                            this.f12481c.put(Integer.valueOf(i2), c2960g);
                        }
                    }
                }
                z = true;
                if (c2960g.m14395b()) {
                    this.f12481c.put(Integer.valueOf(i2), c2960g);
                }
            }
            if (i == 0) {
                this.f12493o.m14418a(z2, i2, i, (List) list);
            } else if (this.f12479a) {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            } else {
                this.f12493o.m14412a(i, i2, (List) list);
            }
        }
        if (z) {
            this.f12493o.m14421b();
        }
        return c2960g;
    }

    /* renamed from: a */
    public void m14350a(int r9, boolean r10, okio.C4755c r11, long r12) {
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
        r8 = this;
        r0 = 0;
        r1 = 0;
        r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r3 != 0) goto L_0x000d;
    L_0x0007:
        r12 = r8.f12493o;
        r12.m14420a(r10, r9, r11, r0);
        return;
    L_0x000d:
        r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r3 <= 0) goto L_0x0063;
    L_0x0011:
        monitor-enter(r8);
    L_0x0012:
        r3 = r8.f12488j;	 Catch:{ InterruptedException -> 0x005b }
        r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1));	 Catch:{ InterruptedException -> 0x005b }
        if (r5 > 0) goto L_0x0030;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0018:
        r3 = r8.f12481c;	 Catch:{ InterruptedException -> 0x005b }
        r4 = java.lang.Integer.valueOf(r9);	 Catch:{ InterruptedException -> 0x005b }
        r3 = r3.containsKey(r4);	 Catch:{ InterruptedException -> 0x005b }
        if (r3 == 0) goto L_0x0028;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0024:
        r8.wait();	 Catch:{ InterruptedException -> 0x005b }
        goto L_0x0012;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0028:
        r9 = new java.io.IOException;	 Catch:{ InterruptedException -> 0x005b }
        r10 = "stream closed";	 Catch:{ InterruptedException -> 0x005b }
        r9.<init>(r10);	 Catch:{ InterruptedException -> 0x005b }
        throw r9;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0030:
        r3 = r8.f12488j;	 Catch:{ all -> 0x0059 }
        r3 = java.lang.Math.min(r12, r3);	 Catch:{ all -> 0x0059 }
        r3 = (int) r3;	 Catch:{ all -> 0x0059 }
        r4 = r8.f12493o;	 Catch:{ all -> 0x0059 }
        r4 = r4.m14423c();	 Catch:{ all -> 0x0059 }
        r3 = java.lang.Math.min(r3, r4);	 Catch:{ all -> 0x0059 }
        r4 = r8.f12488j;	 Catch:{ all -> 0x0059 }
        r6 = (long) r3;	 Catch:{ all -> 0x0059 }
        r4 = r4 - r6;	 Catch:{ all -> 0x0059 }
        r8.f12488j = r4;	 Catch:{ all -> 0x0059 }
        monitor-exit(r8);	 Catch:{ all -> 0x0059 }
        r4 = 0;
        r12 = r12 - r6;
        r4 = r8.f12493o;
        if (r10 == 0) goto L_0x0054;
    L_0x004e:
        r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1));
        if (r5 != 0) goto L_0x0054;
    L_0x0052:
        r5 = 1;
        goto L_0x0055;
    L_0x0054:
        r5 = 0;
    L_0x0055:
        r4.m14420a(r5, r9, r11, r3);
        goto L_0x000d;
    L_0x0059:
        r9 = move-exception;
        goto L_0x0061;
    L_0x005b:
        r9 = new java.io.InterruptedIOException;	 Catch:{ all -> 0x0059 }
        r9.<init>();	 Catch:{ all -> 0x0059 }
        throw r9;	 Catch:{ all -> 0x0059 }
    L_0x0061:
        monitor-exit(r8);	 Catch:{ all -> 0x0059 }
        throw r9;
    L_0x0063:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, boolean, okio.c, long):void");
    }

    /* renamed from: a */
    void m14351a(long j) {
        this.f12488j += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: a */
    void m14348a(int r9, okhttp3.internal.http2.ErrorCode r10) {
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
        r8 = this;
        r0 = r8.f12496t;	 Catch:{ RejectedExecutionException -> 0x001f }
        r7 = new okhttp3.internal.http2.e$1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8.f12482d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r7;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r7);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, okhttp3.internal.http2.ErrorCode):void");
    }

    /* renamed from: b */
    void m14358b(int i, ErrorCode errorCode) {
        this.f12493o.m14414a(i, errorCode);
    }

    /* renamed from: a */
    void m14345a(int r10, long r11) {
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
        r9 = this;
        r0 = r9.f12496t;	 Catch:{ RejectedExecutionException -> 0x001f }
        r8 = new okhttp3.internal.http2.e$2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp Window Update %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9.f12482d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r10);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r8);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, long):void");
    }

    /* renamed from: a */
    void m14355a(boolean r3, int r4, int r5) {
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
        r2 = this;
        if (r3 != 0) goto L_0x0012;
    L_0x0002:
        monitor-enter(r2);
        r0 = r2.f12498v;	 Catch:{ all -> 0x000f }
        r1 = 1;	 Catch:{ all -> 0x000f }
        r2.f12498v = r1;	 Catch:{ all -> 0x000f }
        monitor-exit(r2);	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r2.m14341f();
        return;
    L_0x000f:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x000f }
        throw r3;
    L_0x0012:
        r0 = r2.f12493o;	 Catch:{ IOException -> 0x0018 }
        r0.m14417a(r3, r4, r5);	 Catch:{ IOException -> 0x0018 }
        goto L_0x001b;
    L_0x0018:
        r2.m14341f();
    L_0x001b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(boolean, int, int):void");
    }

    /* renamed from: b */
    public void m14357b() {
        this.f12493o.m14421b();
    }

    /* renamed from: a */
    public void m14352a(ErrorCode errorCode) {
        synchronized (this.f12493o) {
            synchronized (this) {
                if (this.f12485g) {
                    return;
                }
                this.f12485g = true;
                int i = this.f12483e;
                this.f12493o.m14415a(i, errorCode, C2933c.f12352a);
            }
        }
    }

    public void close() {
        m14353a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* renamed from: a */
    void m14353a(ErrorCode errorCode, ErrorCode errorCode2) {
        if (!f12477r) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        C2960g[] c2960gArr = null;
        try {
            m14352a(errorCode);
            errorCode = null;
        } catch (IOException e) {
            errorCode = e;
        }
        synchronized (this) {
            if (!this.f12481c.isEmpty()) {
                c2960gArr = (C2960g[]) this.f12481c.values().toArray(new C2960g[this.f12481c.size()]);
                this.f12481c.clear();
            }
        }
        if (c2960gArr != null) {
            for (C2960g a : c2960gArr) {
                try {
                    a.m14392a(errorCode2);
                } catch (IOException e2) {
                    if (errorCode != null) {
                        errorCode = e2;
                    }
                }
            }
        }
        try {
            this.f12493o.close();
        } catch (ErrorCode errorCode22) {
            if (errorCode == null) {
                errorCode = errorCode22;
            }
        }
        try {
            this.f12492n.close();
        } catch (IOException e3) {
            errorCode = e3;
        }
        this.f12496t.shutdown();
        this.f12497u.shutdown();
        if (errorCode != null) {
            throw errorCode;
        }
    }

    /* renamed from: f */
    private void m14341f() {
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
        r2 = this;
        r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0007 }
        r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0007 }
        r2.m14353a(r0, r1);	 Catch:{ IOException -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.f():void");
    }

    /* renamed from: c */
    public void m14359c() {
        m14354a(true);
    }

    /* renamed from: a */
    void m14354a(boolean z) {
        if (z) {
            this.f12493o.m14409a();
            this.f12493o.m14422b(this.f12489k);
            z = this.f12489k.m14442d();
            if (!z) {
                this.f12493o.m14413a(0, (long) (z - true));
            }
        }
        new Thread(this.f12494p).start();
    }

    /* renamed from: d */
    public synchronized boolean m14362d() {
        return this.f12485g;
    }

    /* renamed from: a */
    void m14346a(int r9, java.util.List<okhttp3.internal.http2.C2950a> r10) {
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
        r8 = this;
        monitor-enter(r8);
        r0 = r8.f12495q;	 Catch:{ all -> 0x003e }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003e }
        r0 = r0.contains(r1);	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x003e }
    L_0x000d:
        r10 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;	 Catch:{ all -> 0x003e }
        r8.m14348a(r9, r10);	 Catch:{ all -> 0x003e }
        monitor-exit(r8);	 Catch:{ all -> 0x003e }
        return;	 Catch:{ all -> 0x003e }
    L_0x0014:
        r0 = r8.f12495q;	 Catch:{ all -> 0x003e }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003e }
        r0.add(r1);	 Catch:{ all -> 0x003e }
        monitor-exit(r8);	 Catch:{ all -> 0x003e }
        r0 = r8.f12497u;	 Catch:{ RejectedExecutionException -> 0x003d }
        r7 = new okhttp3.internal.http2.e$3;	 Catch:{ RejectedExecutionException -> 0x003d }
        r3 = "OkHttp %s Push Request[%s]";	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x003d }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x003d }
        r2 = r8.f12482d;	 Catch:{ RejectedExecutionException -> 0x003d }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x003d }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x003d }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x003d }
        r1 = r7;	 Catch:{ RejectedExecutionException -> 0x003d }
        r2 = r8;	 Catch:{ RejectedExecutionException -> 0x003d }
        r5 = r9;	 Catch:{ RejectedExecutionException -> 0x003d }
        r6 = r10;	 Catch:{ RejectedExecutionException -> 0x003d }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x003d }
        r0.execute(r7);	 Catch:{ RejectedExecutionException -> 0x003d }
    L_0x003d:
        return;
    L_0x003e:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x003e }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, java.util.List):void");
    }

    /* renamed from: a */
    void m14347a(int r10, java.util.List<okhttp3.internal.http2.C2950a> r11, boolean r12) {
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
        r9 = this;
        r0 = r9.f12497u;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r8 = new okhttp3.internal.http2.e$4;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r3 = "OkHttp %s Push Headers[%s]";	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r2 = r9.f12482d;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r2 = java.lang.Integer.valueOf(r10);	 Catch:{ RejectedExecutionException -> 0x0020 }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r2 = r9;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r7 = r12;	 Catch:{ RejectedExecutionException -> 0x0020 }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ RejectedExecutionException -> 0x0020 }
        r0.execute(r8);	 Catch:{ RejectedExecutionException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.a(int, java.util.List, boolean):void");
    }

    /* renamed from: a */
    void m14349a(int i, C4394e c4394e, int i2, boolean z) {
        final C4755c c4755c = new C4755c();
        long j = (long) i2;
        c4394e.mo4547a(j);
        c4394e.mo3615a(c4755c, j);
        if (c4755c.m27502b() == j) {
            final int i3 = i;
            final int i4 = i2;
            final boolean z2 = z;
            this.f12497u.execute(new C2929b(this, "OkHttp %s Push Data[%s]", new Object[]{this.f12482d, Integer.valueOf(i)}) {
                /* renamed from: f */
                final /* synthetic */ C2957e f18200f;

                /* renamed from: c */
                public void mo3659c() {
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
                    r5 = this;
                    r0 = r5.f18200f;	 Catch:{ IOException -> 0x0038 }
                    r0 = r0.f12486h;	 Catch:{ IOException -> 0x0038 }
                    r1 = r4;	 Catch:{ IOException -> 0x0038 }
                    r2 = r5;	 Catch:{ IOException -> 0x0038 }
                    r3 = r6;	 Catch:{ IOException -> 0x0038 }
                    r4 = r7;	 Catch:{ IOException -> 0x0038 }
                    r0 = r0.mo3673a(r1, r2, r3, r4);	 Catch:{ IOException -> 0x0038 }
                    if (r0 == 0) goto L_0x001d;	 Catch:{ IOException -> 0x0038 }
                L_0x0012:
                    r1 = r5.f18200f;	 Catch:{ IOException -> 0x0038 }
                    r1 = r1.f12493o;	 Catch:{ IOException -> 0x0038 }
                    r2 = r4;	 Catch:{ IOException -> 0x0038 }
                    r3 = okhttp3.internal.http2.ErrorCode.CANCEL;	 Catch:{ IOException -> 0x0038 }
                    r1.m14414a(r2, r3);	 Catch:{ IOException -> 0x0038 }
                L_0x001d:
                    if (r0 != 0) goto L_0x0023;	 Catch:{ IOException -> 0x0038 }
                L_0x001f:
                    r0 = r7;	 Catch:{ IOException -> 0x0038 }
                    if (r0 == 0) goto L_0x0038;	 Catch:{ IOException -> 0x0038 }
                L_0x0023:
                    r0 = r5.f18200f;	 Catch:{ IOException -> 0x0038 }
                    monitor-enter(r0);	 Catch:{ IOException -> 0x0038 }
                    r1 = r5.f18200f;	 Catch:{ all -> 0x0035 }
                    r1 = r1.f12495q;	 Catch:{ all -> 0x0035 }
                    r2 = r4;	 Catch:{ all -> 0x0035 }
                    r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0035 }
                    r1.remove(r2);	 Catch:{ all -> 0x0035 }
                    monitor-exit(r0);	 Catch:{ all -> 0x0035 }
                    goto L_0x0038;	 Catch:{ all -> 0x0035 }
                L_0x0035:
                    r1 = move-exception;	 Catch:{ all -> 0x0035 }
                    monitor-exit(r0);	 Catch:{ all -> 0x0035 }
                    throw r1;	 Catch:{ IOException -> 0x0038 }
                L_0x0038:
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.e.5.c():void");
                }
            });
            return;
        }
        c4394e = new StringBuilder();
        c4394e.append(c4755c.m27502b());
        c4394e.append(" != ");
        c4394e.append(i2);
        throw new IOException(c4394e.toString());
    }

    /* renamed from: c */
    void m14360c(int i, ErrorCode errorCode) {
        final int i2 = i;
        final ErrorCode errorCode2 = errorCode;
        this.f12497u.execute(new C2929b(this, "OkHttp %s Push Reset[%s]", new Object[]{this.f12482d, Integer.valueOf(i)}) {
            /* renamed from: d */
            final /* synthetic */ C2957e f18203d;

            /* renamed from: c */
            public void mo3659c() {
                this.f18203d.f12486h.mo3670a(i2, errorCode2);
                synchronized (this.f18203d) {
                    this.f18203d.f12495q.remove(Integer.valueOf(i2));
                }
            }
        });
    }
}
