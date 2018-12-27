package com.facebook.ads.internal.p097p.p099b;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.internal.p097p.p099b.p100a.C1868a;
import com.facebook.ads.internal.p097p.p099b.p100a.C1869c;
import com.facebook.ads.internal.p097p.p099b.p100a.C3822f;
import com.facebook.ads.internal.p097p.p099b.p100a.C4602g;
import java.io.File;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.p.b.f */
public class C1884f {
    /* renamed from: a */
    private final Object f5728a;
    /* renamed from: b */
    private final ExecutorService f5729b;
    /* renamed from: c */
    private final Map<String, C1885g> f5730c;
    /* renamed from: d */
    private final ServerSocket f5731d;
    /* renamed from: e */
    private final int f5732e;
    /* renamed from: f */
    private final Thread f5733f;
    /* renamed from: g */
    private final C1876c f5734g;
    /* renamed from: h */
    private boolean f5735h;

    /* renamed from: com.facebook.ads.internal.p.b.f$a */
    public static final class C1879a {
        /* renamed from: a */
        private File f5718a;
        /* renamed from: b */
        private C1869c f5719b = new C3822f();
        /* renamed from: c */
        private C1868a f5720c = new C4602g(67108864);

        public C1879a(Context context) {
            this.f5718a = C1893o.m7219a(context);
        }

        /* renamed from: a */
        private C1876c m7159a() {
            return new C1876c(this.f5718a, this.f5719b, this.f5720c);
        }
    }

    /* renamed from: com.facebook.ads.internal.p.b.f$b */
    private class C1880b implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1884f f5721a;

        private C1880b(C1884f c1884f) {
            this.f5721a = c1884f;
        }

        /* renamed from: a */
        public Boolean m7161a() {
            return Boolean.valueOf(this.f5721a.m7172c());
        }

        public /* synthetic */ Object call() {
            return m7161a();
        }
    }

    /* renamed from: com.facebook.ads.internal.p.b.f$c */
    private class C1881c implements Callable<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C1884f f5722a;
        /* renamed from: b */
        private final String f5723b;

        public C1881c(C1884f c1884f, String str) {
            this.f5722a = c1884f;
            this.f5723b = str;
        }

        /* renamed from: a */
        public Boolean m7162a() {
            return Boolean.valueOf(this.f5722a.m7173c(this.f5723b));
        }

        public /* synthetic */ Object call() {
            return m7162a();
        }
    }

    /* renamed from: com.facebook.ads.internal.p.b.f$d */
    private final class C1882d implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1884f f5724a;
        /* renamed from: b */
        private final Socket f5725b;

        public C1882d(C1884f c1884f, Socket socket) {
            this.f5724a = c1884f;
            this.f5725b = socket;
        }

        public void run() {
            this.f5724a.m7166a(this.f5725b);
        }
    }

    /* renamed from: com.facebook.ads.internal.p.b.f$e */
    private final class C1883e implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C1884f f5726a;
        /* renamed from: b */
        private final CountDownLatch f5727b;

        public C1883e(C1884f c1884f, CountDownLatch countDownLatch) {
            this.f5726a = c1884f;
            this.f5727b = countDownLatch;
        }

        public void run() {
            this.f5727b.countDown();
            this.f5726a.m7178e();
        }
    }

    public C1884f(Context context) {
        this(new C1879a(context).m7159a());
    }

    private C1884f(C1876c c1876c) {
        this.f5728a = new Object();
        this.f5729b = Executors.newFixedThreadPool(8);
        this.f5730c = new ConcurrentHashMap();
        this.f5734g = (C1876c) C1886j.m7191a(c1876c);
        try {
            this.f5731d = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f5732e = this.f5731d.getLocalPort();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f5733f = new Thread(new C1883e(this, countDownLatch));
            this.f5733f.start();
            countDownLatch.await();
            Log.i("ProxyCache", "Proxy cache server started. Ping it...");
            m7168b();
        } catch (Throwable e) {
            this.f5729b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e);
        }
    }

    /* renamed from: a */
    private void m7165a(Throwable th) {
        Log.e("ProxyCache", "HttpProxyCacheServer error", th);
    }

    /* renamed from: a */
    private void m7166a(java.net.Socket r5) {
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
        r0 = r5.getInputStream();	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r0 = com.facebook.ads.internal.p097p.p099b.C1877d.m7157a(r0);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1 = "ProxyCache";	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = new java.lang.StringBuilder;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2.<init>();	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r3 = "Request to cache proxy:";	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2.append(r3);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2.append(r0);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = r2.toString();	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        android.util.Log.i(r1, r2);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1 = r0.f5715a;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1 = com.facebook.ads.internal.p097p.p099b.C1891m.m7213c(r1);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = "ping";	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r2 = r2.equals(r1);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        if (r2 == 0) goto L_0x0030;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
    L_0x002c:
        r4.m7169b(r5);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        goto L_0x0037;	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
    L_0x0030:
        r1 = r4.m7177e(r1);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
        r1.m7189a(r0, r5);	 Catch:{ SocketException -> 0x005a, l -> 0x0044, l -> 0x0044 }
    L_0x0037:
        r4.m7171c(r5);
        r5 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        goto L_0x006b;
    L_0x0042:
        r0 = move-exception;
        goto L_0x007f;
    L_0x0044:
        r0 = move-exception;
        r1 = new com.facebook.ads.internal.p.b.l;	 Catch:{ all -> 0x0042 }
        r2 = "Error processing request";	 Catch:{ all -> 0x0042 }
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0042 }
        r4.m7165a(r1);	 Catch:{ all -> 0x0042 }
        r4.m7171c(r5);
        r5 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        goto L_0x006b;
    L_0x005a:
        r0 = "ProxyCache";	 Catch:{ all -> 0x0042 }
        r1 = "Closing socket... Socket is closed by client.";	 Catch:{ all -> 0x0042 }
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x0042 }
        r4.m7171c(r5);
        r5 = "ProxyCache";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
    L_0x006b:
        r1 = "Opened connections: ";
        r0.append(r1);
        r1 = r4.m7180f();
        r0.append(r1);
        r0 = r0.toString();
        android.util.Log.d(r5, r0);
        return;
    L_0x007f:
        r4.m7171c(r5);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = "Opened connections: ";
        r5.append(r1);
        r1 = r4.m7180f();
        r5.append(r1);
        r5 = r5.toString();
        r1 = "ProxyCache";
        android.util.Log.d(r1, r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.b.f.a(java.net.Socket):void");
    }

    /* renamed from: b */
    private void m7168b() {
        int i = 300;
        int i2 = 0;
        while (i2 < 3) {
            try {
                Future submit = this.f5729b.submit(new C1880b());
                long j = (long) i;
                this.f5735h = ((Boolean) submit.get(j, TimeUnit.MILLISECONDS)).booleanValue();
                if (!this.f5735h) {
                    SystemClock.sleep(j);
                    i2++;
                    i *= 2;
                } else {
                    return;
                }
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error pinging server [attempt: ");
                stringBuilder.append(i2);
                stringBuilder.append(", timeout: ");
                stringBuilder.append(i);
                stringBuilder.append("]. ");
                Log.e("ProxyCache", stringBuilder.toString(), e);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Shutdown server... Error pinging server [attempts: ");
        stringBuilder2.append(i2);
        stringBuilder2.append(", max timeout: ");
        stringBuilder2.append(i / 2);
        stringBuilder2.append("].");
        Log.e("ProxyCache", stringBuilder2.toString());
        m7182a();
    }

    /* renamed from: b */
    private void m7169b(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
        outputStream.write("ping ok".getBytes());
    }

    /* renamed from: c */
    private void m7171c(Socket socket) {
        m7176d(socket);
        m7179e(socket);
        m7181f(socket);
    }

    /* renamed from: c */
    private boolean m7172c() {
        boolean equals;
        C3825h c3825h = new C3825h(m7174d("ping"));
        try {
            byte[] bytes = "ping ok".getBytes();
            c3825h.mo1404a(0);
            byte[] bArr = new byte[bytes.length];
            c3825h.mo1403a(bArr);
            equals = Arrays.equals(bytes, bArr);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ping response: `");
            stringBuilder.append(new String(bArr));
            stringBuilder.append("`, pinged? ");
            stringBuilder.append(equals);
            Log.d("ProxyCache", stringBuilder.toString());
            return equals;
        } catch (C1890l e) {
            equals = e;
            Log.e("ProxyCache", "Error reading ping response", equals);
            return false;
        } finally {
            c3825h.mo1405b();
        }
    }

    /* renamed from: c */
    private boolean m7173c(String str) {
        C3825h c3825h = new C3825h(m7174d(str));
        try {
            c3825h.mo1404a(0);
            while (c3825h.mo1403a(new byte[8192]) != -1) {
            }
            return true;
        } catch (Throwable e) {
            Log.e("ProxyCache", "Error reading url", e);
            return false;
        } finally {
            c3825h.mo1405b();
        }
    }

    /* renamed from: d */
    private String m7174d(String str) {
        return String.format("http://%s:%d/%s", new Object[]{"127.0.0.1", Integer.valueOf(this.f5732e), C1891m.m7212b(str)});
    }

    /* renamed from: d */
    private void m7175d() {
        synchronized (this.f5728a) {
            for (C1885g a : this.f5730c.values()) {
                a.m7188a();
            }
            this.f5730c.clear();
        }
    }

    /* renamed from: d */
    private void m7176d(java.net.Socket r3) {
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
        r0 = r3.isInputShutdown();	 Catch:{ SocketException -> 0x0016, IOException -> 0x000a }
        if (r0 != 0) goto L_0x001d;	 Catch:{ SocketException -> 0x0016, IOException -> 0x000a }
    L_0x0006:
        r3.shutdownInput();	 Catch:{ SocketException -> 0x0016, IOException -> 0x000a }
        goto L_0x001d;
    L_0x000a:
        r3 = move-exception;
        r0 = new com.facebook.ads.internal.p.b.l;
        r1 = "Error closing socket input stream";
        r0.<init>(r1, r3);
        r2.m7165a(r0);
        goto L_0x001d;
    L_0x0016:
        r3 = "ProxyCache";
        r0 = "Releasing input stream... Socket is closed by client.";
        android.util.Log.d(r3, r0);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p.b.f.d(java.net.Socket):void");
    }

    /* renamed from: e */
    private C1885g m7177e(String str) {
        C1885g c1885g;
        synchronized (this.f5728a) {
            c1885g = (C1885g) this.f5730c.get(str);
            if (c1885g == null) {
                c1885g = new C1885g(str, this.f5734g);
                this.f5730c.put(str, c1885g);
            }
        }
        return c1885g;
    }

    /* renamed from: e */
    private void m7178e() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket accept = this.f5731d.accept();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Accept new socket ");
                stringBuilder.append(accept);
                Log.d("ProxyCache", stringBuilder.toString());
                this.f5729b.submit(new C1882d(this, accept));
            } catch (Throwable e) {
                m7165a(new C1890l("Error during waiting connection", e));
                return;
            }
        }
    }

    /* renamed from: e */
    private void m7179e(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                socket.shutdownOutput();
            }
        } catch (Throwable e) {
            m7165a(new C1890l("Error closing socket output stream", e));
        }
    }

    /* renamed from: f */
    private int m7180f() {
        int i;
        synchronized (this.f5728a) {
            i = 0;
            for (C1885g b : this.f5730c.values()) {
                i += b.m7190b();
            }
        }
        return i;
    }

    /* renamed from: f */
    private void m7181f(Socket socket) {
        try {
            if (!socket.isClosed()) {
                socket.close();
            }
        } catch (Throwable e) {
            m7165a(new C1890l("Error closing socket", e));
        }
    }

    /* renamed from: a */
    public void m7182a() {
        Log.i("ProxyCache", "Shutdown proxy server");
        m7175d();
        this.f5733f.interrupt();
        try {
            if (!this.f5731d.isClosed()) {
                this.f5731d.close();
            }
        } catch (Throwable e) {
            m7165a(new C1890l("Error shutting down proxy server", e));
        }
    }

    /* renamed from: a */
    public boolean m7183a(String str) {
        int i = 0;
        int i2 = 300;
        while (i < 3) {
            try {
                if (((Boolean) this.f5729b.submit(new C1881c(this, str)).get()).booleanValue()) {
                    return true;
                }
                SystemClock.sleep((long) i2);
                i++;
                i2 *= 2;
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error precaching url [attempt: ");
                stringBuilder.append(i);
                stringBuilder.append(", url: ");
                stringBuilder.append(str);
                stringBuilder.append("]. ");
                Log.e("ProxyCache", stringBuilder.toString(), e);
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Shutdown server... Error precaching url [attempts: ");
        stringBuilder2.append(i);
        stringBuilder2.append(", url: ");
        stringBuilder2.append(str);
        stringBuilder2.append("].");
        Log.e("ProxyCache", stringBuilder2.toString());
        m7182a();
        return false;
    }

    /* renamed from: b */
    public String m7184b(String str) {
        if (!this.f5735h) {
            Log.e("ProxyCache", "Proxy server isn't pinged. Caching doesn't work.");
        }
        return this.f5735h ? m7174d(str) : str;
    }
}
