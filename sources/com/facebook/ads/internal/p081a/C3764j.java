package com.facebook.ads.internal.p081a;

import android.content.Context;
import android.net.Uri;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p094m.C1827c;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.j */
class C3764j extends C1712b {
    /* renamed from: d */
    private static final String f15093d = "j";
    /* renamed from: e */
    private final Uri f15094e;
    /* renamed from: f */
    private final Map<String, String> f15095f;

    C3764j(Context context, C1827c c1827c, String str, Uri uri, Map<String, String> map) {
        super(context, c1827c, str);
        this.f15094e = uri;
        this.f15095f = map;
    }

    /* renamed from: a */
    public C1810a mo1329a() {
        return null;
    }

    /* renamed from: b */
    public void mo1328b() {
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
        r6 = this;
        r0 = com.facebook.ads.internal.p094m.C1828e.IMMEDIATE;
        r1 = r6.f15094e;
        r2 = "priority";
        r1 = r1.getQueryParameter(r2);
        r2 = android.text.TextUtils.isEmpty(r1);
        if (r2 != 0) goto L_0x001f;
    L_0x0010:
        r2 = com.facebook.ads.internal.p094m.C1828e.values();	 Catch:{ Exception -> 0x001f }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x001f }
        r1 = r1.intValue();	 Catch:{ Exception -> 0x001f }
        r1 = r2[r1];	 Catch:{ Exception -> 0x001f }
        r0 = r1;
    L_0x001f:
        r1 = r6.b;
        r2 = r6.c;
        r3 = r6.f15095f;
        r4 = r6.f15094e;
        r5 = "type";
        r4 = r4.getQueryParameter(r5);
        r1.mo1356a(r2, r3, r4, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.a.j.b():void");
    }
}
