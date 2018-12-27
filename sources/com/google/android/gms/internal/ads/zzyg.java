package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

@zzaer
public final class zzyg {
    /* renamed from: a */
    public static List<String> m11194a(JSONObject jSONObject, String str) {
        jSONObject = jSONObject.optJSONArray(str);
        if (jSONObject == null) {
            return null;
        }
        str = new ArrayList(jSONObject.length());
        for (int i = 0; i < jSONObject.length(); i++) {
            str.add(jSONObject.getString(i));
        }
        return Collections.unmodifiableList(str);
    }

    /* renamed from: a */
    public static void m11195a(Context context, String str, zzakm zzakm, String str2, boolean z, List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                z = z ? "1" : "0";
                for (String a : list) {
                    String a2 = m11193a(m11193a(m11193a(m11193a(m11193a(m11193a(m11193a(a2, "@gw_adlocid@", str2), "@gw_adnetrefresh@", z), "@gw_qdata@", zzakm.f8797r.f9865i), "@gw_sdkver@", str), "@gw_sessid@", zzkd.m10714f()), "@gw_seqnum@", zzakm.f8789j), "@gw_adnetstatus@", zzakm.f8799t);
                    if (zzakm.f8794o != null) {
                        a2 = m11193a(m11193a(a2, "@gw_adnetid@", zzakm.f8794o.f9837b), "@gw_allocid@", zzakm.f8794o.f9839d);
                    }
                    a2 = zzakg.m9683a(a2, context, zzakm.f8775P);
                    zzbv.zzek();
                    zzalo.m9791a(context, str, a2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11196a(Context context, String str, List<String> list, String str2, String str3, zzajk zzajk) {
        if (list != null) {
            if (!list.isEmpty()) {
                str2 = m11192a(str2);
                str3 = m11192a(str3);
                long currentTimeMillis = zzbv.zzer().currentTimeMillis();
                for (String a : list) {
                    String a2 = m11193a(m11193a(m11193a(a2, "@gw_rwd_userid@", Uri.encode(str2)), "@gw_rwd_custom_data@", Uri.encode(str3)), "@gw_tmstmp@", Long.toString(currentTimeMillis));
                    if (zzajk != null) {
                        a2 = m11193a(m11193a(a2, "@gw_rwd_itm@", Uri.encode(zzajk.f19880a)), "@gw_rwd_amt@", Integer.toString(zzajk.f19881b));
                    }
                    zzbv.zzek();
                    zzalo.m9791a(context, str, a2);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m11193a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* renamed from: a */
    private static String m11192a(String str) {
        return (TextUtils.isEmpty(str) || !zzaoe.m9991c()) ? str : "fakeForAdDebugLog";
    }

    /* renamed from: a */
    public static boolean m11197a(java.lang.String r3, int[] r4) {
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
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = r4.length;
        r2 = 2;
        if (r0 == r2) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = "x";
        r3 = r3.split(r0);
        r0 = r3.length;
        if (r0 == r2) goto L_0x0017;
    L_0x0016:
        return r1;
    L_0x0017:
        r0 = r3[r1];	 Catch:{ NumberFormatException -> 0x0029 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0029 }
        r4[r1] = r0;	 Catch:{ NumberFormatException -> 0x0029 }
        r0 = 1;	 Catch:{ NumberFormatException -> 0x0029 }
        r3 = r3[r0];	 Catch:{ NumberFormatException -> 0x0029 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0029 }
        r4[r0] = r3;	 Catch:{ NumberFormatException -> 0x0029 }
        return r0;
    L_0x0029:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyg.a(java.lang.String, int[]):boolean");
    }
}
