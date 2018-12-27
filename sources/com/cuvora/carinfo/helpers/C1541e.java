package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.util.Log;
import com.cuvora.carinfo.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C2572b;
import com.google.firebase.C2574c;
import com.google.firebase.remoteconfig.C2614a;
import com.google.firebase.remoteconfig.C2617c.C2616a;
import com.google.gson.C2629e;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.helpers.e */
public class C1541e {
    /* renamed from: a */
    private static final String f4670a = "e";
    /* renamed from: b */
    private static long f4671b = 3600;
    /* renamed from: c */
    private static C2614a f4672c;

    /* renamed from: com.cuvora.carinfo.helpers.e$1 */
    static class C36891 implements OnCompleteListener<Void> {
        C36891() {
        }

        public void onComplete(Task<Void> task) {
            if (task.mo3216b() != null) {
                C1541e.f4672c.m12843b();
            }
        }
    }

    private C1541e() {
    }

    /* renamed from: a */
    public static void m5853a(Context context) {
        if (C2572b.m12595a(context).isEmpty()) {
            C2572b.m12593a(context, C2574c.m12614a(context));
        }
        f4672c = C2614a.m12827a();
        f4672c.m12842a(new C2616a().m12849a(false).m12850a());
        f4672c.m12839a((int) R.xml.remote_config_defaults);
        if (f4672c.m12846c().mo2910a().m12851a() != null) {
            f4671b = 0;
        }
        f4672c.m12836a(f4671b).mo3207a(new C36891());
    }

    /* renamed from: b */
    private static C2614a m5854b() {
        if (f4672c == null) {
            Log.e(f4670a, "HttpClient has not been initialized!");
        }
        return f4672c;
    }

    /* renamed from: a */
    public static String m5852a(String str) {
        return C1541e.m5854b().m12837a(str).replace("<br/>", "\n");
    }

    /* renamed from: b */
    public static java.lang.Integer m5855b(java.lang.String r1) {
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
        r0 = com.cuvora.carinfo.helpers.C1541e.m5854b();	 Catch:{ Exception -> 0x0011 }
        r1 = r0.m12837a(r1);	 Catch:{ Exception -> 0x0011 }
        r1 = r1.trim();	 Catch:{ Exception -> 0x0011 }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0011 }
        return r1;
    L_0x0011:
        r1 = -1;
        r1 = java.lang.Integer.valueOf(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.e.b(java.lang.String):java.lang.Integer");
    }

    /* renamed from: c */
    public static boolean m5856c(String str) {
        return C1541e.m5854b().m12844b(str);
    }

    /* renamed from: d */
    public static JSONObject m5857d(String str) {
        try {
            return new JSONObject(C1541e.m5854b().m12837a(str));
        } catch (String str2) {
            str2.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: e */
    public static JSONArray m5858e(String str) {
        try {
            return new JSONArray(C1541e.m5854b().m12837a(str));
        } catch (String str2) {
            str2.printStackTrace();
            return new JSONArray();
        }
    }

    /* renamed from: a */
    public static <T> T m5851a(Type type, String str) {
        return new C2629e().m12881a(C1541e.m5852a(str), type);
    }
}
