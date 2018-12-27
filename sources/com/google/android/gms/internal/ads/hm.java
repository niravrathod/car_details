package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@zzaer
final class hm {
    @GuardedBy("InvokeJavascriptWorkaround.class")
    @VisibleForTesting
    /* renamed from: a */
    private static Boolean f8158a;

    private hm() {
    }

    @android.annotation.TargetApi(19)
    /* renamed from: a */
    private static boolean m8942a(android.webkit.WebView r3) {
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
        r0 = com.google.android.gms.internal.ads.hm.class;
        monitor-enter(r0);
        r1 = f8158a;	 Catch:{ all -> 0x0024 }
        if (r1 != 0) goto L_0x001c;
    L_0x0007:
        r1 = "(function(){})()";	 Catch:{ IllegalStateException -> 0x0015 }
        r2 = 0;	 Catch:{ IllegalStateException -> 0x0015 }
        r3.evaluateJavascript(r1, r2);	 Catch:{ IllegalStateException -> 0x0015 }
        r3 = 1;	 Catch:{ IllegalStateException -> 0x0015 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ IllegalStateException -> 0x0015 }
        f8158a = r3;	 Catch:{ IllegalStateException -> 0x0015 }
        goto L_0x001c;
    L_0x0015:
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ all -> 0x0024 }
        f8158a = r3;	 Catch:{ all -> 0x0024 }
    L_0x001c:
        r3 = f8158a;	 Catch:{ all -> 0x0024 }
        r3 = r3.booleanValue();	 Catch:{ all -> 0x0024 }
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        return r3;	 Catch:{ all -> 0x0024 }
    L_0x0024:
        r3 = move-exception;	 Catch:{ all -> 0x0024 }
        monitor-exit(r0);	 Catch:{ all -> 0x0024 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hm.a(android.webkit.WebView):boolean");
    }

    @TargetApi(19)
    /* renamed from: a */
    static void m8941a(WebView webView, String str) {
        if (PlatformVersion.isAtLeastKitKat() && m8942a(webView)) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String str2 = "javascript:";
        str = String.valueOf(str);
        webView.loadUrl(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
