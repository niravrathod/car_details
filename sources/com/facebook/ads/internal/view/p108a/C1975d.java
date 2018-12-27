package com.facebook.ads.internal.view.p108a;

/* renamed from: com.facebook.ads.internal.view.a.d */
public class C1975d {
    /* renamed from: a */
    private final C3829f f6099a;
    /* renamed from: b */
    private boolean f6100b = true;

    public C1975d(C3829f c3829f) {
        this.f6099a = c3829f;
    }

    /* renamed from: a */
    private static long m7461a(java.lang.String r6, java.lang.String r7) {
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
        r7 = r7.length();
        r6 = r6.substring(r7);
        r7 = android.text.TextUtils.isEmpty(r6);
        r0 = -1;
        if (r7 == 0) goto L_0x0011;
    L_0x0010:
        return r0;
    L_0x0011:
        r6 = java.lang.Long.parseLong(r6);	 Catch:{ NumberFormatException -> 0x002a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ NumberFormatException -> 0x002a }
        r2 = r6.longValue();	 Catch:{ NumberFormatException -> 0x002a }
        r4 = 0;	 Catch:{ NumberFormatException -> 0x002a }
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x002a }
        if (r7 >= 0) goto L_0x0025;	 Catch:{ NumberFormatException -> 0x002a }
    L_0x0023:
        r6 = r0;	 Catch:{ NumberFormatException -> 0x002a }
        goto L_0x0029;	 Catch:{ NumberFormatException -> 0x002a }
    L_0x0025:
        r6 = r6.longValue();	 Catch:{ NumberFormatException -> 0x002a }
    L_0x0029:
        return r6;
    L_0x002a:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.a.d.a(java.lang.String, java.lang.String):long");
    }

    /* renamed from: a */
    public void m7462a() {
        if (this.f6100b) {
            if (!this.f6099a.canGoBack()) {
                if (!this.f6099a.canGoForward()) {
                    this.f6099a.m19102a("void((function() {try {  if (!window.performance || !window.performance.timing || !document ||       !document.body || document.body.scrollHeight <= 0 ||       !document.body.children || document.body.children.length < 1) {    return;  }  var nvtiming__an_t = window.performance.timing;  if (nvtiming__an_t.responseEnd > 0) {    console.log('ANNavResponseEnd:'+nvtiming__an_t.responseEnd);  }  if (nvtiming__an_t.domContentLoadedEventStart > 0) {    console.log('ANNavDomContentLoaded:' + nvtiming__an_t.domContentLoadedEventStart);  }  if (nvtiming__an_t.loadEventEnd > 0) {    console.log('ANNavLoadEventEnd:' + nvtiming__an_t.loadEventEnd);  }} catch(err) {  console.log('an_navigation_timing_error:' + err.message);}})());");
                    return;
                }
            }
            this.f6100b = false;
        }
    }

    /* renamed from: a */
    public void m7463a(String str) {
        if (this.f6100b) {
            if (str.startsWith("ANNavResponseEnd:")) {
                this.f6099a.m19101a(C1975d.m7461a(str, "ANNavResponseEnd:"));
            } else if (str.startsWith("ANNavDomContentLoaded:")) {
                this.f6099a.m19104b(C1975d.m7461a(str, "ANNavDomContentLoaded:"));
            } else if (str.startsWith("ANNavLoadEventEnd:")) {
                this.f6099a.m19105c(C1975d.m7461a(str, "ANNavLoadEventEnd:"));
            }
        }
    }

    /* renamed from: a */
    public void m7464a(boolean z) {
        this.f6100b = z;
    }
}
