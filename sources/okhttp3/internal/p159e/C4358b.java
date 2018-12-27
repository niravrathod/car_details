package okhttp3.internal.p159e;

import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* renamed from: okhttp3.internal.e.b */
public class C4358b extends C2945f {
    private C4358b() {
    }

    /* renamed from: f */
    private Provider m23841f() {
        return new OpenSSLProvider();
    }

    /* renamed from: a */
    public void mo3654a(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C2945f.m14267a((List) list).toArray(new String[null]));
            return;
        }
        super.mo3654a(sSLSocket, str, (List) list);
    }

    @Nullable
    /* renamed from: a */
    public String mo3649a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo3649a(sSLSocket);
    }

    public SSLContext C_() {
        try {
            return SSLContext.getInstance("TLS", m23841f());
        } catch (Throwable e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: b */
    public static okhttp3.internal.p159e.C2945f m23840b() {
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
        r1 = "org.conscrypt.ConscryptEngineSocket";	 Catch:{ ClassNotFoundException -> 0x0017 }
        java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1 = org.conscrypt.Conscrypt.isAvailable();	 Catch:{ ClassNotFoundException -> 0x0017 }
        if (r1 != 0) goto L_0x000d;	 Catch:{ ClassNotFoundException -> 0x0017 }
    L_0x000c:
        return r0;	 Catch:{ ClassNotFoundException -> 0x0017 }
    L_0x000d:
        r1 = 1;	 Catch:{ ClassNotFoundException -> 0x0017 }
        org.conscrypt.Conscrypt.setUseEngineSocketByDefault(r1);	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1 = new okhttp3.internal.e.b;	 Catch:{ ClassNotFoundException -> 0x0017 }
        r1.<init>();	 Catch:{ ClassNotFoundException -> 0x0017 }
        return r1;
    L_0x0017:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.e.b.b():okhttp3.internal.e.f");
    }
}
