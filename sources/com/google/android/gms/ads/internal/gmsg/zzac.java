package com.google.android.gms.ads.internal.gmsg;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cuvora.carinfo.fragment.C4552m;
import com.facebook.ads.internal.p084c.C1769a;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzath;
import com.google.android.gms.internal.ads.zzatk;
import com.google.android.gms.internal.ads.zzatm;
import java.util.Map;

@zzaer
public final class zzac<T extends zzatc & zzatd & zzath & zzatk & zzatm> implements zzu<T> {
    /* renamed from: a */
    private final zzw f16347a;
    /* renamed from: b */
    private final zzabh f16348b;

    public zzac(zzw zzw, zzabh zzabh) {
        this.f16347a = zzw;
        this.f16348b = zzabh;
    }

    /* renamed from: a */
    private static boolean m20365a(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* renamed from: b */
    private static int m20366b(Map<String, String> map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return zzbv.zzem().mo2365b();
            }
            if ("l".equalsIgnoreCase(str)) {
                return zzbv.zzem().mo2363a();
            }
            if ("c".equalsIgnoreCase(str) != null) {
                return zzbv.zzem().mo5034c();
            }
        }
        return -1;
    }

    /* renamed from: a */
    private final void m20364a(boolean z) {
        if (this.f16348b != null) {
            this.f16348b.m21070a(z);
        }
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    static java.lang.String m20363a(android.content.Context r2, com.google.android.gms.internal.ads.zzck r3, java.lang.String r4, android.view.View r5, android.app.Activity r6) {
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
        if (r3 != 0) goto L_0x0003;
    L_0x0002:
        return r4;
    L_0x0003:
        r0 = android.net.Uri.parse(r4);	 Catch:{ zzcl -> 0x0020, Exception -> 0x0016 }
        r1 = r3.m10482b(r0);	 Catch:{ zzcl -> 0x0020, Exception -> 0x0016 }
        if (r1 == 0) goto L_0x0011;	 Catch:{ zzcl -> 0x0020, Exception -> 0x0016 }
    L_0x000d:
        r0 = r3.m10478a(r0, r2, r5, r6);	 Catch:{ zzcl -> 0x0020, Exception -> 0x0016 }
    L_0x0011:
        r2 = r0.toString();	 Catch:{ zzcl -> 0x0020, Exception -> 0x0016 }
        return r2;
    L_0x0016:
        r2 = move-exception;
        r3 = com.google.android.gms.ads.internal.zzbv.zzeo();
        r5 = "OpenGmsgHandler.maybeAddClickSignalsToUrl";
        r3.m9714a(r2, r5);
    L_0x0020:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.gmsg.zzac.a(android.content.Context, com.google.android.gms.internal.ads.zzck, java.lang.String, android.view.View, android.app.Activity):java.lang.String");
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzatc zzatc = (zzatc) obj;
        String a = zzakg.m9683a((String) map.get("u"), zzatc.getContext(), true);
        String str = (String) map.get(C1769a.f5340a);
        if (str == null) {
            zzaok.m10007e("Action missing from an open GMSG.");
        } else if (this.f16347a != null && !this.f16347a.zzcz()) {
            this.f16347a.zzu(a);
        } else if ("expand".equalsIgnoreCase(str)) {
            if (((zzatd) zzatc).mo4208z()) {
                zzaok.m10007e("Cannot expand WebView that is already expanded.");
                return;
            }
            m20364a(false);
            ((zzath) zzatc).mo4745a(m20365a(map), m20366b(map));
        } else if ("webapp".equalsIgnoreCase(str)) {
            m20364a(false);
            if (a != null) {
                ((zzath) zzatc).mo4746a(m20365a(map), m20366b(map), a);
            } else {
                ((zzath) zzatc).mo4747a(m20365a(map), m20366b(map), (String) map.get("html"), (String) map.get("baseurl"));
            }
        } else if ("app".equalsIgnoreCase(str) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            m20364a(true);
            zzatc.getContext();
            if (TextUtils.isEmpty(a)) {
                zzaok.m10007e("Destination url cannot be empty.");
                return;
            }
            try {
                ((zzath) zzatc).mo4734a(new zzc(new zzad(zzatc.getContext(), ((zzatk) zzatc).mo4207x(), ((zzatm) zzatc).getView()).zzi(map)));
            } catch (Object obj2) {
                zzaok.m10007e(obj2.getMessage());
            }
        } else {
            m20364a(true);
            str = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    intent = Intent.parseUri(str, 0);
                } catch (Throwable e) {
                    String str2 = "Error parsing the url: ";
                    str = String.valueOf(str);
                    zzaok.m10002b(str.length() != 0 ? str2.concat(str) : new String(str2), e);
                }
            }
            if (!(intent == null || intent.getData() == null)) {
                Uri data = intent.getData();
                String uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    try {
                        uri = m20363a(zzatc.getContext(), ((zzatk) zzatc).mo4207x(), uri, ((zzatm) zzatc).getView(), zzatc.mo4199d());
                    } catch (Throwable e2) {
                        zzaok.m10002b("Error occurred while adding signals.", e2);
                        zzbv.zzeo().m9714a(e2, "OpenGmsgHandler.onGmsg");
                    }
                    try {
                        data = Uri.parse(uri);
                    } catch (Throwable e22) {
                        String str3 = "Error parsing the uri: ";
                        uri = String.valueOf(uri);
                        zzaok.m10002b(uri.length() != 0 ? str3.concat(uri) : new String(str3), e22);
                        zzbv.zzeo().m9714a(e22, "OpenGmsgHandler.onGmsg");
                    }
                }
                intent.setData(data);
            }
            if (intent != null) {
                ((zzath) zzatc).mo4734a(new zzc(intent));
                return;
            }
            if (!TextUtils.isEmpty(a)) {
                a = m20363a(zzatc.getContext(), ((zzatk) zzatc).mo4207x(), a, ((zzatm) zzatc).getView(), zzatc.mo4199d());
            }
            ((zzath) zzatc).mo4734a(new zzc((String) map.get("i"), a, (String) map.get(C4552m.f18877a), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e")));
        }
    }
}
