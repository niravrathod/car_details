package okhttp3.internal.p159e;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.internal.e.d */
class C4360d extends C2945f {
    /* renamed from: a */
    private final Method f18161a;
    /* renamed from: b */
    private final Method f18162b;
    /* renamed from: c */
    private final Method f18163c;
    /* renamed from: d */
    private final Class<?> f18164d;
    /* renamed from: e */
    private final Class<?> f18165e;

    /* renamed from: okhttp3.internal.e.d$a */
    private static class C2943a implements InvocationHandler {
        /* renamed from: a */
        boolean f12406a;
        /* renamed from: b */
        String f12407b;
        /* renamed from: c */
        private final List<String> f12408c;

        C2943a(List<String> list) {
            this.f12408c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            obj = method.getName();
            Class returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C2933c.f12353b;
            }
            if (obj.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.valueOf(true);
            }
            if (obj.equals("unsupported") && Void.TYPE == returnType) {
                this.f12406a = true;
                return null;
            } else if (obj.equals("protocols") && objArr.length == 0) {
                return this.f12408c;
            } else {
                if ((obj.equals("selectProtocol") || obj.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    String str;
                    List list = (List) objArr[0];
                    method = list.size();
                    for (objArr = null; objArr < method; objArr++) {
                        if (this.f12408c.contains(list.get(objArr))) {
                            str = (String) list.get(objArr);
                            this.f12407b = str;
                            return str;
                        }
                    }
                    str = (String) this.f12408c.get(0);
                    this.f12407b = str;
                    return str;
                } else if ((!obj.equals("protocolSelected") && obj.equals("selected") == null) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f12407b = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    C4360d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f18161a = method;
        this.f18162b = method2;
        this.f18163c = method3;
        this.f18164d = cls;
        this.f18165e = cls2;
    }

    /* renamed from: a */
    public void mo3654a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        str = C2945f.m14267a((List) list);
        try {
            str = Proxy.newProxyInstance(C2945f.class.getClassLoader(), new Class[]{this.f18164d, this.f18165e}, new C2943a(str));
            this.f18161a.invoke(null, new Object[]{sSLSocket, str});
        } catch (Exception e) {
            throw C2933c.m14184a("unable to set alpn", e);
        }
    }

    /* renamed from: b */
    public void mo3658b(SSLSocket sSLSocket) {
        try {
            this.f18163c.invoke(null, new Object[]{sSLSocket});
        } catch (Exception e) {
            throw C2933c.m14184a("unable to remove alpn", e);
        }
    }

    @Nullable
    /* renamed from: a */
    public String mo3649a(SSLSocket sSLSocket) {
        try {
            Object[] objArr = new Object[]{sSLSocket};
            sSLSocket = null;
            C2943a c2943a = (C2943a) Proxy.getInvocationHandler(this.f18162b.invoke(null, objArr));
            if (c2943a.f12406a || c2943a.f12407b != null) {
                if (!c2943a.f12406a) {
                    sSLSocket = c2943a.f12407b;
                }
                return sSLSocket;
            }
            C2945f.m14270c().mo3651a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
            return null;
        } catch (Exception e) {
            throw C2933c.m14184a("unable to get selected protocol", e);
        }
    }

    /* renamed from: b */
    public static okhttp3.internal.p159e.C2945f m23847b() {
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
        r0 = "org.eclipse.jetty.alpn.ALPN";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r1 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2.<init>();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = "$Provider";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2.append(r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = r2.toString();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.<init>();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = "$ClientProvider";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r4);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r8 = java.lang.Class.forName(r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.StringBuilder;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.<init>();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = "$ServerProvider";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3.append(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = r3.toString();	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r9 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = "put";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = 2;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.Class[r3];	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r5 = 0;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r5] = r4;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = 1;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r4] = r2;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r0 = r1.getMethod(r0, r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = "get";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r6 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r5] = r6;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r6 = r1.getMethod(r2, r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r2 = "remove";	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3 = new java.lang.Class[r4];	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = javax.net.ssl.SSLSocket.class;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r3[r5] = r4;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r7 = r1.getMethod(r2, r3);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r1 = new okhttp3.internal.e.d;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4 = r1;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r5 = r0;	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0076, ClassNotFoundException -> 0x0076 }
        return r1;
    L_0x0076:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.d.b():okhttp3.internal.e.f");
    }
}
