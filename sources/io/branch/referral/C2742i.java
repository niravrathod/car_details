package io.branch.referral;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.i */
public class C2742i {
    /* renamed from: a */
    static boolean f11554a = false;

    /* renamed from: a */
    public static boolean m13287a(android.content.Context r5) {
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
        r0 = f11554a;
        if (r0 == 0) goto L_0x0006;
    L_0x0004:
        r5 = 1;
        return r5;
    L_0x0006:
        r0 = "io.branch.sdk.TestMode";
        r1 = 0;
        r2 = r5.getPackageManager();	 Catch:{ Exception -> 0x0042 }
        r3 = r5.getPackageName();	 Catch:{ Exception -> 0x0042 }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x0042 }
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ Exception -> 0x0042 }
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0042 }
        if (r3 == 0) goto L_0x002b;	 Catch:{ Exception -> 0x0042 }
    L_0x001b:
        r3 = r2.metaData;	 Catch:{ Exception -> 0x0042 }
        r3 = r3.containsKey(r0);	 Catch:{ Exception -> 0x0042 }
        if (r3 == 0) goto L_0x002b;	 Catch:{ Exception -> 0x0042 }
    L_0x0023:
        r5 = r2.metaData;	 Catch:{ Exception -> 0x0042 }
        r5 = r5.getBoolean(r0, r1);	 Catch:{ Exception -> 0x0042 }
    L_0x0029:
        r1 = r5;	 Catch:{ Exception -> 0x0042 }
        goto L_0x0042;	 Catch:{ Exception -> 0x0042 }
    L_0x002b:
        r2 = r5.getResources();	 Catch:{ Exception -> 0x0042 }
        r3 = "string";	 Catch:{ Exception -> 0x0042 }
        r5 = r5.getPackageName();	 Catch:{ Exception -> 0x0042 }
        r5 = r2.getIdentifier(r0, r3, r5);	 Catch:{ Exception -> 0x0042 }
        r5 = r2.getString(r5);	 Catch:{ Exception -> 0x0042 }
        r5 = java.lang.Boolean.parseBoolean(r5);	 Catch:{ Exception -> 0x0042 }
        goto L_0x0029;
    L_0x0042:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.i.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    static JSONObject m13286a(JSONObject jSONObject) {
        return C2742i.m13289b(jSONObject);
    }

    /* renamed from: b */
    static JSONObject m13289b(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("source", "android");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Drawable m13285a(Context context, int i) {
        if (VERSION.SDK_INT >= 21) {
            return context.getResources().getDrawable(i, context.getTheme());
        }
        return context.getResources().getDrawable(i);
    }

    /* renamed from: b */
    public static int m13288b(Context context, int i) {
        return Math.round(((float) i) * (context.getResources().getDisplayMetrics().xdpi / 160.0f));
    }
}
