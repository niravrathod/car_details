package io.branch.referral;

import android.text.TextUtils;
import com.crashlytics.android.answers.shim.KitEvent;
import io.branch.referral.Defines.Jsonkey;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.branch.referral.m */
class C2753m {
    C2753m() {
    }

    /* renamed from: a */
    public void m13338a(java.lang.String r2, org.json.JSONObject r3, java.lang.String r4) {
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
        r1 = this;
        r0 = new com.crashlytics.android.answers.shim.KitEvent;	 Catch:{ Throwable -> 0x001c }
        r0.<init>(r2);	 Catch:{ Throwable -> 0x001c }
        if (r3 == 0) goto L_0x001c;	 Catch:{ Throwable -> 0x001c }
    L_0x0007:
        r2 = "";	 Catch:{ Throwable -> 0x001c }
        r1.m13337a(r0, r3, r2);	 Catch:{ Throwable -> 0x001c }
        r2 = io.branch.referral.Defines.Jsonkey.BranchIdentity;	 Catch:{ Throwable -> 0x001c }
        r2 = r2.m13131a();	 Catch:{ Throwable -> 0x001c }
        r0.putAttribute(r2, r4);	 Catch:{ Throwable -> 0x001c }
        r2 = com.crashlytics.android.answers.shim.AnswersOptionalLogger.get();	 Catch:{ Throwable -> 0x001c }
        r2.logKitEvent(r0);	 Catch:{ Throwable -> 0x001c }
    L_0x001c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.m.a(java.lang.String, org.json.JSONObject, java.lang.String):void");
    }

    /* renamed from: a */
    private void m13337a(KitEvent kitEvent, JSONObject jSONObject, String str) {
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            Object obj = jSONObject.get(str2);
            if (!str2.startsWith("+")) {
                StringBuilder stringBuilder;
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    stringBuilder.append(".");
                    m13337a(kitEvent, jSONObject2, stringBuilder.toString());
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append(".");
                    m13336a(kitEvent, jSONArray, stringBuilder.toString());
                } else {
                    m13335a(kitEvent, str, str2, jSONObject.getString(str2));
                }
            }
        }
    }

    /* renamed from: a */
    private void m13336a(KitEvent kitEvent, JSONArray jSONArray, String str) {
        for (int i = 0; i < jSONArray.length(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("~");
            stringBuilder.append(Integer.toString(i));
            m13335a(kitEvent, str, stringBuilder.toString(), jSONArray.getString(i));
        }
    }

    /* renamed from: a */
    private void m13335a(KitEvent kitEvent, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            if (str2.startsWith("~")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.replaceFirst("~", ""));
                stringBuilder.append(str2.replaceFirst("~", ""));
                kitEvent.putAttribute(stringBuilder.toString(), str3);
                return;
            }
            str = new StringBuilder();
            str.append("$");
            str.append(Jsonkey.IdentityID.m13131a());
            if (str2.equals(str.toString()) != null) {
                kitEvent.putAttribute(Jsonkey.ReferringBranchIdentity.m13131a(), str3);
            }
        }
    }
}
