package okhttp3.internal.p156b;

import okhttp3.Protocol;

/* renamed from: okhttp3.internal.b.k */
public final class C2927k {
    /* renamed from: a */
    public final Protocol f12346a;
    /* renamed from: b */
    public final int f12347b;
    /* renamed from: c */
    public final String f12348c;

    public C2927k(Protocol protocol, int i, String str) {
        this.f12346a = protocol;
        this.f12347b = i;
        this.f12348c = str;
    }

    /* renamed from: a */
    public static okhttp3.internal.p156b.C2927k m14175a(java.lang.String r8) {
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
        r0 = "HTTP/1.";
        r0 = r8.startsWith(r0);
        r1 = 4;
        r2 = 32;
        r3 = 9;
        if (r0 == 0) goto L_0x005b;
    L_0x000d:
        r0 = r8.length();
        if (r0 < r3) goto L_0x0044;
    L_0x0013:
        r0 = 8;
        r0 = r8.charAt(r0);
        if (r0 != r2) goto L_0x0044;
    L_0x001b:
        r0 = 7;
        r0 = r8.charAt(r0);
        r0 = r0 + -48;
        if (r0 != 0) goto L_0x0027;
    L_0x0024:
        r0 = okhttp3.Protocol.HTTP_1_0;
        goto L_0x0066;
    L_0x0027:
        r4 = 1;
        if (r0 != r4) goto L_0x002d;
    L_0x002a:
        r0 = okhttp3.Protocol.HTTP_1_1;
        goto L_0x0066;
    L_0x002d:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x0044:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x005b:
        r0 = "ICY ";
        r0 = r8.startsWith(r0);
        if (r0 == 0) goto L_0x00d5;
    L_0x0063:
        r0 = okhttp3.Protocol.HTTP_1_0;
        r3 = 4;
    L_0x0066:
        r4 = r8.length();
        r5 = r3 + 3;
        if (r4 < r5) goto L_0x00be;
    L_0x006e:
        r4 = r8.substring(r3, r5);	 Catch:{ NumberFormatException -> 0x00a7 }
        r4 = java.lang.Integer.parseInt(r4);	 Catch:{ NumberFormatException -> 0x00a7 }
        r6 = "";
        r7 = r8.length();
        if (r7 <= r5) goto L_0x00a1;
    L_0x007e:
        r5 = r8.charAt(r5);
        if (r5 != r2) goto L_0x008a;
    L_0x0084:
        r3 = r3 + r1;
        r6 = r8.substring(r3);
        goto L_0x00a1;
    L_0x008a:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00a1:
        r8 = new okhttp3.internal.b.k;
        r8.<init>(r0, r4, r6);
        return r8;
    L_0x00a7:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00be:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00d5:
        r0 = new java.net.ProtocolException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Unexpected status line: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.b.k.a(java.lang.String):okhttp3.internal.b.k");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f12346a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        stringBuilder.append(' ');
        stringBuilder.append(this.f12347b);
        if (this.f12348c != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.f12348c);
        }
        return stringBuilder.toString();
    }
}
