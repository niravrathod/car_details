package io.branch.referral.network;

import android.content.Context;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.branch.referral.Branch;
import io.branch.referral.C2754n;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class BranchRemoteInterface {

    public static class BranchRemoteException extends Exception {
        private int branchErrorCode = -113;

        public BranchRemoteException(int i) {
            this.branchErrorCode = i;
        }
    }

    /* renamed from: io.branch.referral.network.BranchRemoteInterface$a */
    public static class C2755a {
        /* renamed from: a */
        private final String f11608a;
        /* renamed from: b */
        private final int f11609b;

        public C2755a(String str, int i) {
            this.f11608a = str;
            this.f11609b = i;
        }
    }

    /* renamed from: a */
    public abstract C2755a mo3533a(String str);

    /* renamed from: a */
    public abstract C2755a mo3534a(String str, JSONObject jSONObject);

    /* renamed from: a */
    public final ab m13428a(String str, JSONObject jSONObject, String str2, String str3) {
        StringBuilder stringBuilder;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (m13427a(jSONObject, str3) == null) {
            return new ab(str2, -114);
        }
        str3 = new StringBuilder();
        str3.append(str);
        str3.append(m13426a(jSONObject));
        str = str3.toString();
        long currentTimeMillis = System.currentTimeMillis();
        str3 = new StringBuilder();
        str3.append("getting ");
        str3.append(str);
        C2754n.m13344b("BranchSDK", str3.toString());
        try {
            str = mo3533a(str);
            str = m13424a(str.f11608a, str.f11609b, str2);
            if (Branch.m23406b() != null) {
                jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.m23406b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                str3.m23453a(stringBuilder.toString(), String.valueOf(jSONObject));
            }
            return str;
        } catch (String str4) {
            if (str4.branchErrorCode == -111) {
                str4 = new ab(str2, -111);
                if (Branch.m23406b() != null) {
                    jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                    str3 = Branch.m23406b();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("-");
                    stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                    str3.m23453a(stringBuilder.toString(), String.valueOf(jSONObject));
                }
                return str4;
            }
            str4 = new ab(str2, -113);
            if (Branch.m23406b() != null) {
                jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.m23406b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                str3.m23453a(stringBuilder.toString(), String.valueOf(jSONObject));
            }
            return str4;
        } catch (String str42) {
            if (Branch.m23406b() != null) {
                jSONObject = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.m23406b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                str3.m23453a(stringBuilder.toString(), String.valueOf(jSONObject));
            }
            throw str42;
        }
    }

    /* renamed from: a */
    public final ab m13429a(JSONObject jSONObject, String str, String str2, String str3) {
        StringBuilder stringBuilder;
        long currentTimeMillis = System.currentTimeMillis();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (m13427a(jSONObject, str3) == null) {
            return new ab(str2, -114);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("posting to ");
        stringBuilder2.append(str);
        C2754n.m13344b("BranchSDK", stringBuilder2.toString());
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Post value = ");
        stringBuilder2.append(jSONObject.toString());
        C2754n.m13344b("BranchSDK", stringBuilder2.toString());
        try {
            jSONObject = mo3534a(str, jSONObject);
            jSONObject = m13424a(jSONObject.f11608a, jSONObject.f11609b, str2);
            if (Branch.m23406b() != null) {
                str = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.m23406b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                str3.m23453a(stringBuilder.toString(), String.valueOf(str));
            }
            return jSONObject;
        } catch (JSONObject jSONObject2) {
            if (jSONObject2.branchErrorCode == -111) {
                jSONObject2 = new ab(str2, -111);
                if (Branch.m23406b() != null) {
                    str = (int) (System.currentTimeMillis() - currentTimeMillis);
                    str3 = Branch.m23406b();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str2);
                    stringBuilder.append("-");
                    stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                    str3.m23453a(stringBuilder.toString(), String.valueOf(str));
                }
                return jSONObject2;
            }
            jSONObject2 = new ab(str2, -113);
            if (Branch.m23406b() != null) {
                str = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.m23406b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                str3.m23453a(stringBuilder.toString(), String.valueOf(str));
            }
            return jSONObject2;
        } catch (JSONObject jSONObject22) {
            if (Branch.m23406b() != null) {
                str = (int) (System.currentTimeMillis() - currentTimeMillis);
                str3 = Branch.m23406b();
                stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append("-");
                stringBuilder.append(Jsonkey.Branch_Round_Trip_Time.m13131a());
                str3.m23453a(stringBuilder.toString(), String.valueOf(str));
            }
            throw jSONObject22;
        }
    }

    /* renamed from: a */
    public static final BranchRemoteInterface m13425a(Context context) {
        return new C4279a(context);
    }

    /* renamed from: a */
    private io.branch.referral.ab m13424a(java.lang.String r3, int r4, java.lang.String r5) {
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
        r2 = this;
        r0 = new io.branch.referral.ab;
        r0.<init>(r5, r4);
        r4 = "BranchSDK";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = "returned ";
        r5.append(r1);
        r5.append(r3);
        r5 = r5.toString();
        io.branch.referral.C2754n.m13344b(r4, r5);
        if (r3 == 0) goto L_0x0050;
    L_0x001d:
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0026 }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x0026 }
        r0.m13212a(r4);	 Catch:{ JSONException -> 0x0026 }
        goto L_0x0050;
    L_0x0026:
        r4 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x002f }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x002f }
        r0.m13212a(r4);	 Catch:{ JSONException -> 0x002f }
        goto L_0x0050;
    L_0x002f:
        r3 = move-exception;
        r4 = r2.getClass();
        r4 = r4.getSimpleName();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r1 = "JSON exception: ";
        r5.append(r1);
        r3 = r3.getMessage();
        r5.append(r3);
        r3 = r5.toString();
        io.branch.referral.C2754n.m13344b(r4, r3);
    L_0x0050:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterface.a(java.lang.String, int, java.lang.String):io.branch.referral.ab");
    }

    /* renamed from: a */
    private boolean m13427a(org.json.JSONObject r3, java.lang.String r4) {
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
        r2 = this;
        r0 = io.branch.referral.Defines.Jsonkey.UserData;	 Catch:{ JSONException -> 0x002a }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x002a }
        r0 = r3.has(r0);	 Catch:{ JSONException -> 0x002a }
        if (r0 != 0) goto L_0x0017;	 Catch:{ JSONException -> 0x002a }
    L_0x000c:
        r0 = io.branch.referral.Defines.Jsonkey.SDK;	 Catch:{ JSONException -> 0x002a }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x002a }
        r1 = "android2.19.5";	 Catch:{ JSONException -> 0x002a }
        r3.put(r0, r1);	 Catch:{ JSONException -> 0x002a }
    L_0x0017:
        r0 = "bnc_no_value";	 Catch:{ JSONException -> 0x002a }
        r0 = r4.equals(r0);	 Catch:{ JSONException -> 0x002a }
        if (r0 != 0) goto L_0x002a;	 Catch:{ JSONException -> 0x002a }
    L_0x001f:
        r0 = io.branch.referral.Defines.Jsonkey.BranchKey;	 Catch:{ JSONException -> 0x002a }
        r0 = r0.m13131a();	 Catch:{ JSONException -> 0x002a }
        r3.put(r0, r4);	 Catch:{ JSONException -> 0x002a }
        r3 = 1;
        return r3;
    L_0x002a:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.network.BranchRemoteInterface.a(org.json.JSONObject, java.lang.String):boolean");
    }

    /* renamed from: a */
    private String m13426a(JSONObject jSONObject) {
        StringBuilder stringBuilder = new StringBuilder();
        if (jSONObject != null) {
            JSONArray names = jSONObject.names();
            if (names != null) {
                int length = names.length();
                int i = 0;
                Object obj = 1;
                while (i < length) {
                    try {
                        String string = names.getString(i);
                        if (obj != null) {
                            stringBuilder.append("?");
                            obj = null;
                        } else {
                            stringBuilder.append("&");
                        }
                        String string2 = jSONObject.getString(string);
                        stringBuilder.append(string);
                        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
                        stringBuilder.append(string2);
                        i++;
                    } catch (JSONObject jSONObject2) {
                        jSONObject2.printStackTrace();
                        return null;
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
