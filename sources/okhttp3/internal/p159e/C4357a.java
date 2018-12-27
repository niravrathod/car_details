package okhttp3.internal.p159e;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.C2933c;
import okhttp3.internal.p161g.C2947c;
import okhttp3.internal.p161g.C2949e;

/* renamed from: okhttp3.internal.e.a */
class C4357a extends C2945f {
    /* renamed from: a */
    private final Class<?> f18153a;
    /* renamed from: b */
    private final C2944e<Socket> f18154b;
    /* renamed from: c */
    private final C2944e<Socket> f18155c;
    /* renamed from: d */
    private final C2944e<Socket> f18156d;
    /* renamed from: e */
    private final C2944e<Socket> f18157e;
    /* renamed from: f */
    private final C2942c f18158f = C2942c.m14257a();

    /* renamed from: okhttp3.internal.e.a$c */
    static final class C2942c {
        /* renamed from: a */
        private final Method f12403a;
        /* renamed from: b */
        private final Method f12404b;
        /* renamed from: c */
        private final Method f12405c;

        C2942c(Method method, Method method2, Method method3) {
            this.f12403a = method;
            this.f12404b = method2;
            this.f12405c = method3;
        }

        /* renamed from: a */
        java.lang.Object m14258a(java.lang.String r6) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = r5.f12403a;
            r1 = 0;
            if (r0 == 0) goto L_0x0019;
        L_0x0005:
            r0 = r5.f12403a;	 Catch:{ Exception -> 0x0019 }
            r2 = 0;	 Catch:{ Exception -> 0x0019 }
            r3 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
            r0 = r0.invoke(r1, r3);	 Catch:{ Exception -> 0x0019 }
            r3 = r5.f12404b;	 Catch:{ Exception -> 0x0019 }
            r4 = 1;	 Catch:{ Exception -> 0x0019 }
            r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0019 }
            r4[r2] = r6;	 Catch:{ Exception -> 0x0019 }
            r3.invoke(r0, r4);	 Catch:{ Exception -> 0x0019 }
            return r0;
        L_0x0019:
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.c.a(java.lang.String):java.lang.Object");
        }

        /* renamed from: a */
        boolean m14259a(java.lang.Object r4) {
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
            if (r4 == 0) goto L_0x000b;
        L_0x0003:
            r1 = r3.f12405c;	 Catch:{ Exception -> 0x000b }
            r2 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x000b }
            r1.invoke(r4, r2);	 Catch:{ Exception -> 0x000b }
            r0 = 1;
        L_0x000b:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.c.a(java.lang.Object):boolean");
        }

        /* renamed from: a */
        static okhttp3.internal.p159e.C4357a.C2942c m14257a() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = 0;
            r1 = "dalvik.system.CloseGuard";	 Catch:{ Exception -> 0x0027 }
            r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0027 }
            r2 = "get";	 Catch:{ Exception -> 0x0027 }
            r3 = 0;	 Catch:{ Exception -> 0x0027 }
            r4 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0027 }
            r2 = r1.getMethod(r2, r4);	 Catch:{ Exception -> 0x0027 }
            r4 = "open";	 Catch:{ Exception -> 0x0027 }
            r5 = 1;	 Catch:{ Exception -> 0x0027 }
            r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0027 }
            r6 = java.lang.String.class;	 Catch:{ Exception -> 0x0027 }
            r5[r3] = r6;	 Catch:{ Exception -> 0x0027 }
            r4 = r1.getMethod(r4, r5);	 Catch:{ Exception -> 0x0027 }
            r5 = "warnIfOpen";	 Catch:{ Exception -> 0x0027 }
            r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0027 }
            r1 = r1.getMethod(r5, r3);	 Catch:{ Exception -> 0x0027 }
            r0 = r2;
            goto L_0x0029;
        L_0x0027:
            r1 = r0;
            r4 = r1;
        L_0x0029:
            r2 = new okhttp3.internal.e.a$c;
            r2.<init>(r0, r4, r1);
            return r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.c.a():okhttp3.internal.e.a$c");
        }
    }

    /* renamed from: okhttp3.internal.e.a$a */
    static final class C4355a extends C2947c {
        /* renamed from: a */
        private final Object f18149a;
        /* renamed from: b */
        private final Method f18150b;

        public int hashCode() {
            return 0;
        }

        C4355a(Object obj, Method method) {
            this.f18149a = obj;
            this.f18150b = method;
        }

        /* renamed from: a */
        public List<Certificate> mo3646a(List<Certificate> list, String str) {
            try {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
                return (List) this.f18150b.invoke(this.f18149a, new Object[]{x509CertificateArr, "RSA", str});
            } catch (List<Certificate> list2) {
                str = new SSLPeerUnverifiedException(list2.getMessage());
                str.initCause(list2);
                throw str;
            } catch (List<Certificate> list22) {
                throw new AssertionError(list22);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof C4355a;
        }
    }

    /* renamed from: okhttp3.internal.e.a$b */
    static final class C4356b implements C2949e {
        /* renamed from: a */
        private final X509TrustManager f18151a;
        /* renamed from: b */
        private final Method f18152b;

        C4356b(X509TrustManager x509TrustManager, Method method) {
            this.f18152b = method;
            this.f18151a = x509TrustManager;
        }

        /* renamed from: a */
        public java.security.cert.X509Certificate mo3647a(java.security.cert.X509Certificate r6) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r5 = this;
            r0 = 0;
            r1 = r5.f18152b;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r2 = r5.f18151a;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r3 = 1;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r3 = new java.lang.Object[r3];	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r4 = 0;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r3[r4] = r6;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r6 = r1.invoke(r2, r3);	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            r6 = (java.security.cert.TrustAnchor) r6;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            if (r6 == 0) goto L_0x0018;	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
        L_0x0013:
            r6 = r6.getTrustedCert();	 Catch:{ IllegalAccessException -> 0x001b, InvocationTargetException -> 0x001a }
            goto L_0x0019;
        L_0x0018:
            r6 = r0;
        L_0x0019:
            return r6;
        L_0x001a:
            return r0;
        L_0x001b:
            r6 = move-exception;
            r0 = "unable to get issues and signature";
            r6 = okhttp3.internal.C2933c.m14184a(r0, r6);
            throw r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.b.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4356b)) {
                return false;
            }
            C4356b c4356b = (C4356b) obj;
            if (!this.f18151a.equals(c4356b.f18151a) || this.f18152b.equals(c4356b.f18152b) == null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f18151a.hashCode() + (this.f18152b.hashCode() * 31);
        }
    }

    C4357a(Class<?> cls, C2944e<Socket> c2944e, C2944e<Socket> c2944e2, C2944e<Socket> c2944e3, C2944e<Socket> c2944e4) {
        this.f18153a = cls;
        this.f18154b = c2944e;
        this.f18155c = c2944e2;
        this.f18156d = c2944e3;
        this.f18157e = c2944e4;
    }

    /* renamed from: a */
    public void mo3653a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (C2933c.m14196a(e) != null) {
                throw new IOException(e);
            }
            throw e;
        } catch (Socket socket2) {
            inetSocketAddress = new IOException("Exception in connect");
            inetSocketAddress.initCause(socket2);
            throw inetSocketAddress;
        } catch (Socket socket22) {
            if (VERSION.SDK_INT == 26) {
                inetSocketAddress = new IOException("Exception in connect");
                inetSocketAddress.initCause(socket22);
                throw inetSocketAddress;
            }
            throw socket22;
        }
    }

    /* renamed from: a */
    public void mo3654a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (str != null) {
            this.f18154b.m14264b(sSLSocket, Boolean.valueOf(true));
            this.f18155c.m14264b(sSLSocket, str);
        }
        if (this.f18157e != null && this.f18157e.m14263a((Object) sSLSocket) != null) {
            this.f18157e.m14266d(sSLSocket, new Object[]{C2945f.m14269b((List) list)});
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo3649a(SSLSocket sSLSocket) {
        String str = null;
        if (this.f18156d == null || !this.f18156d.m14263a((Object) sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f18156d.m14266d(sSLSocket, new Object[0]);
        if (bArr != null) {
            str = new String(bArr, C2933c.f12356e);
        }
        return str;
    }

    /* renamed from: a */
    public void mo3651a(int i, String str, Throwable th) {
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('\n');
            stringBuilder.append(Log.getStackTraceString(th));
            str = stringBuilder.toString();
        }
        th = null;
        int length = str.length();
        while (th < length) {
            int min;
            int indexOf = str.indexOf(10, th);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, th + 4000);
                Log.println(i2, "OkHttp", str.substring(th, min));
                if (min >= indexOf) {
                    break;
                }
                th = min;
            }
            th = min + 1;
        }
    }

    /* renamed from: a */
    public Object mo3648a(String str) {
        return this.f18158f.m14258a(str);
    }

    /* renamed from: a */
    public void mo3652a(String str, Object obj) {
        if (this.f18158f.m14259a(obj) == null) {
            mo3651a(5, str, null);
        }
    }

    /* renamed from: b */
    public boolean mo3656b(java.lang.String r5) {
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
        r0 = "android.security.NetworkSecurityPolicy";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r0.getMethod(r1, r3);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = new java.lang.Object[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r1.invoke(r3, r2);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = r4.m23828a(r5, r0, r1);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        return r0;
    L_0x001b:
        r5 = move-exception;
        r0 = "unable to determine cleartext support";
        r5 = okhttp3.internal.C2933c.m14184a(r0, r5);
        throw r5;
    L_0x0023:
        r5 = super.mo3656b(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.b(java.lang.String):boolean");
    }

    /* renamed from: a */
    private boolean m23828a(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) {
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
        r5 = this;
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r3 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x001d }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r7.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r1[r4] = r6;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.invoke(r8, r1);	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = (java.lang.Boolean) r0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.booleanValue();	 Catch:{ NoSuchMethodException -> 0x001d }
        return r0;
    L_0x001d:
        r6 = r5.m23830b(r6, r7, r8);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: b */
    private boolean m23830b(java.lang.String r4, java.lang.Class<?> r5, java.lang.Object r6) {
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
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x0016 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r0 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.invoke(r6, r0);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = (java.lang.Boolean) r5;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.booleanValue();	 Catch:{ NoSuchMethodException -> 0x0016 }
        return r5;
    L_0x0016:
        r4 = super.mo3656b(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.b(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    /* renamed from: b */
    private static boolean m23829b() {
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
        r0 = "GMSCore_OpenSSL";
        r0 = java.security.Security.getProvider(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = "android.net.Network";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0010 }
        return r1;
    L_0x0010:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.b():boolean");
    }

    /* renamed from: a */
    public okhttp3.internal.p161g.C2947c mo3650a(javax.net.ssl.X509TrustManager r8) {
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
        r7 = this;
        r0 = "android.net.http.X509TrustManagerExtensions";	 Catch:{ Exception -> 0x0036 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0036 }
        r1 = 1;	 Catch:{ Exception -> 0x0036 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0036 }
        r3 = javax.net.ssl.X509TrustManager.class;	 Catch:{ Exception -> 0x0036 }
        r4 = 0;	 Catch:{ Exception -> 0x0036 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0036 }
        r2 = r0.getConstructor(r2);	 Catch:{ Exception -> 0x0036 }
        r3 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0036 }
        r3[r4] = r8;	 Catch:{ Exception -> 0x0036 }
        r2 = r2.newInstance(r3);	 Catch:{ Exception -> 0x0036 }
        r3 = "checkServerTrusted";	 Catch:{ Exception -> 0x0036 }
        r5 = 3;	 Catch:{ Exception -> 0x0036 }
        r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0036 }
        r6 = java.security.cert.X509Certificate[].class;	 Catch:{ Exception -> 0x0036 }
        r5[r4] = r6;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r1 = 2;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r0 = r0.getMethod(r3, r5);	 Catch:{ Exception -> 0x0036 }
        r1 = new okhttp3.internal.e.a$a;	 Catch:{ Exception -> 0x0036 }
        r1.<init>(r2, r0);	 Catch:{ Exception -> 0x0036 }
        return r1;
    L_0x0036:
        r8 = super.mo3650a(r8);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.a(javax.net.ssl.X509TrustManager):okhttp3.internal.g.c");
    }

    /* renamed from: a */
    public static okhttp3.internal.p159e.C2945f m23827a() {
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
        r0 = 0;
        r1 = "com.android.org.conscrypt.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0009 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0009 }
    L_0x0007:
        r3 = r1;
        goto L_0x0010;
    L_0x0009:
        r1 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x0007;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0010:
        r4 = new okhttp3.internal.e.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setUseSessionTickets";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = 1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = 0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5[r7] = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r4.<init>(r0, r1, r5);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new okhttp3.internal.e.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setHostname";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6[r7] = r8;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5.<init>(r0, r1, r6);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = okhttp3.internal.p159e.C4357a.m23829b();	 Catch:{ ClassNotFoundException -> 0x0056 }
        if (r1 == 0) goto L_0x004d;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0032:
        r1 = new okhttp3.internal.e.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "getAlpnSelectedProtocol";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = new java.lang.Class[r7];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1.<init>(r6, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new okhttp3.internal.e.e;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "setAlpnProtocols";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2[r7] = r9;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6.<init>(r0, r8, r2);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x004f;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004d:
        r6 = r0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004f:
        r1 = new okhttp3.internal.e.a;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x0056 }
        return r1;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.a():okhttp3.internal.e.f");
    }

    /* renamed from: b */
    public okhttp3.internal.p161g.C2949e mo3655b(javax.net.ssl.X509TrustManager r7) {
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
        r6 = this;
        r0 = r7.getClass();	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = "findTrustAnchorByIssuerAndSignature";	 Catch:{ NoSuchMethodException -> 0x001b }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001b }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001b }
        r5 = java.security.cert.X509Certificate.class;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x001b }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ NoSuchMethodException -> 0x001b }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = new okhttp3.internal.e.a$b;	 Catch:{ NoSuchMethodException -> 0x001b }
        r1.<init>(r7, r0);	 Catch:{ NoSuchMethodException -> 0x001b }
        return r1;
    L_0x001b:
        r7 = super.mo3655b(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.a.b(javax.net.ssl.X509TrustManager):okhttp3.internal.g.e");
    }
}
