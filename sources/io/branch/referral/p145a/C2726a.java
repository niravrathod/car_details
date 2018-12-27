package io.branch.referral.p145a;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import com.cuvora.carinfo.helpers.C1543g;
import io.branch.referral.Branch;
import io.branch.referral.Defines.Jsonkey;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: io.branch.referral.a.a */
public class C2726a {
    /* renamed from: a */
    private static WeakReference<Activity> f11496a;

    /* renamed from: io.branch.referral.a.a$2 */
    static class C27222 implements OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }

        C27222() {
        }
    }

    /* renamed from: io.branch.referral.a.a$5 */
    static class C27255 implements OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
        }

        C27255() {
        }
    }

    /* renamed from: a */
    public static void m13201a(WeakReference<Activity> weakReference) {
        f11496a = weakReference;
        if (!TextUtils.isEmpty(C2726a.m13203b()) && weakReference != null) {
            final JSONObject i = Branch.m23406b().m23468i();
            if (i.optInt("_branch_validate") == 60514) {
                if (i.optBoolean(Jsonkey.Clicked_Branch_Link.m13131a())) {
                    C2726a.m13202a(i);
                } else {
                    C2726a.m13199a();
                }
            } else if (i.optBoolean("bnc_validate")) {
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        C2726a.m13205b(C2726a.m13204b(i, ""));
                    }
                }, 500);
            }
        }
    }

    /* renamed from: a */
    private static void m13202a(final JSONObject jSONObject) {
        if (f11496a.get() != null) {
            Builder builder;
            if (VERSION.SDK_INT >= 21) {
                builder = new Builder((Context) f11496a.get(), 16974374);
            } else {
                builder = new Builder((Context) f11496a.get());
            }
            builder.setTitle("Branch Deeplinking Routing").setMessage("Good news - we got link data. Now a question for you, astute developer: did the app deep link to the specific piece of content you expected to see?").setPositiveButton("Yes", new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C2726a.m13205b(C2726a.m13204b(jSONObject, C1543g.f4675a));
                }
            }).setNegativeButton("No", new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C2726a.m13205b(C2726a.m13204b(jSONObject, "r"));
                }
            }).setNeutralButton(17039360, new C27222()).setCancelable(false).setIcon(17301651).show();
        }
    }

    /* renamed from: b */
    private static void m13205b(java.lang.String r2) {
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
        r0 = f11496a;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0058;
    L_0x0008:
        r2 = android.net.Uri.parse(r2);
        r2 = r2.buildUpon();
        r0 = "$uri_redirect_mode";
        r1 = "2";
        r2 = r2.appendQueryParameter(r0, r1);
        r2 = r2.build();
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r0.<init>(r1, r2);
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0.addFlags(r2);
        r2 = "com.android.chrome";
        r0.setPackage(r2);
        r2 = f11496a;
        r2 = r2.get();
        r2 = (android.app.Activity) r2;
        r2 = r2.getPackageManager();
        r1 = 0;
        r2.queryIntentActivities(r0, r1);
        r2 = f11496a;	 Catch:{ ActivityNotFoundException -> 0x0049 }
        r2 = r2.get();	 Catch:{ ActivityNotFoundException -> 0x0049 }
        r2 = (android.app.Activity) r2;	 Catch:{ ActivityNotFoundException -> 0x0049 }
        r2.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0049 }
        goto L_0x0058;
    L_0x0049:
        r2 = 0;
        r0.setPackage(r2);
        r2 = f11496a;
        r2 = r2.get();
        r2 = (android.app.Activity) r2;
        r2.startActivity(r0);
    L_0x0058:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.a.a.b(java.lang.String):void");
    }

    /* renamed from: b */
    private static java.lang.String m13204b(org.json.JSONObject r4, java.lang.String r5) {
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
        r0 = "";
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0028 }
        r1.<init>();	 Catch:{ Exception -> 0x0028 }
        r2 = "~";	 Catch:{ Exception -> 0x0028 }
        r1.append(r2);	 Catch:{ Exception -> 0x0028 }
        r2 = io.branch.referral.Defines.Jsonkey.ReferringLink;	 Catch:{ Exception -> 0x0028 }
        r2 = r2.m13131a();	 Catch:{ Exception -> 0x0028 }
        r1.append(r2);	 Catch:{ Exception -> 0x0028 }
        r1 = r1.toString();	 Catch:{ Exception -> 0x0028 }
        r1 = r4.getString(r1);	 Catch:{ Exception -> 0x0028 }
        r0 = "\\?";	 Catch:{ Exception -> 0x0027 }
        r0 = r1.split(r0);	 Catch:{ Exception -> 0x0027 }
        r2 = 0;	 Catch:{ Exception -> 0x0027 }
        r0 = r0[r2];	 Catch:{ Exception -> 0x0027 }
        goto L_0x002f;
    L_0x0027:
        r0 = r1;
    L_0x0028:
        r1 = "BRANCH SDK";
        r2 = "Failed to get referring link";
        android.util.Log.e(r1, r2);
    L_0x002f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = "?validate=true";
        r1.append(r0);
        r0 = r1.toString();
        r1 = android.text.TextUtils.isEmpty(r5);
        if (r1 != 0) goto L_0x01a1;
    L_0x0046:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r1.<init>();	 Catch:{ Exception -> 0x019d }
        r1.append(r0);	 Catch:{ Exception -> 0x019d }
        r2 = "ct";	 Catch:{ Exception -> 0x019d }
        r2 = r4.getString(r2);	 Catch:{ Exception -> 0x019d }
        r3 = "t1";	 Catch:{ Exception -> 0x019d }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x019d }
        if (r2 == 0) goto L_0x006e;	 Catch:{ Exception -> 0x019d }
    L_0x005c:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r2.<init>();	 Catch:{ Exception -> 0x019d }
        r3 = "&t1=";	 Catch:{ Exception -> 0x019d }
        r2.append(r3);	 Catch:{ Exception -> 0x019d }
        r2.append(r5);	 Catch:{ Exception -> 0x019d }
    L_0x0069:
        r2 = r2.toString();	 Catch:{ Exception -> 0x019d }
        goto L_0x0082;	 Catch:{ Exception -> 0x019d }
    L_0x006e:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r2.<init>();	 Catch:{ Exception -> 0x019d }
        r3 = "&t1=";	 Catch:{ Exception -> 0x019d }
        r2.append(r3);	 Catch:{ Exception -> 0x019d }
        r3 = "t1";	 Catch:{ Exception -> 0x019d }
        r3 = r4.getString(r3);	 Catch:{ Exception -> 0x019d }
        r2.append(r3);	 Catch:{ Exception -> 0x019d }
        goto L_0x0069;	 Catch:{ Exception -> 0x019d }
    L_0x0082:
        r1.append(r2);	 Catch:{ Exception -> 0x019d }
        r1 = r1.toString();	 Catch:{ Exception -> 0x019d }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r0.<init>();	 Catch:{ Exception -> 0x019a }
        r0.append(r1);	 Catch:{ Exception -> 0x019a }
        r2 = "ct";	 Catch:{ Exception -> 0x019a }
        r2 = r4.getString(r2);	 Catch:{ Exception -> 0x019a }
        r3 = "t2";	 Catch:{ Exception -> 0x019a }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x019a }
        if (r2 == 0) goto L_0x00b1;	 Catch:{ Exception -> 0x019a }
    L_0x009f:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r2.<init>();	 Catch:{ Exception -> 0x019a }
        r3 = "&t2=";	 Catch:{ Exception -> 0x019a }
        r2.append(r3);	 Catch:{ Exception -> 0x019a }
        r2.append(r5);	 Catch:{ Exception -> 0x019a }
    L_0x00ac:
        r2 = r2.toString();	 Catch:{ Exception -> 0x019a }
        goto L_0x00c5;	 Catch:{ Exception -> 0x019a }
    L_0x00b1:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r2.<init>();	 Catch:{ Exception -> 0x019a }
        r3 = "&t2=";	 Catch:{ Exception -> 0x019a }
        r2.append(r3);	 Catch:{ Exception -> 0x019a }
        r3 = "t2";	 Catch:{ Exception -> 0x019a }
        r3 = r4.getString(r3);	 Catch:{ Exception -> 0x019a }
        r2.append(r3);	 Catch:{ Exception -> 0x019a }
        goto L_0x00ac;	 Catch:{ Exception -> 0x019a }
    L_0x00c5:
        r0.append(r2);	 Catch:{ Exception -> 0x019a }
        r0 = r0.toString();	 Catch:{ Exception -> 0x019a }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r1.<init>();	 Catch:{ Exception -> 0x019d }
        r1.append(r0);	 Catch:{ Exception -> 0x019d }
        r2 = "ct";	 Catch:{ Exception -> 0x019d }
        r2 = r4.getString(r2);	 Catch:{ Exception -> 0x019d }
        r3 = "t3";	 Catch:{ Exception -> 0x019d }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x019d }
        if (r2 == 0) goto L_0x00f4;	 Catch:{ Exception -> 0x019d }
    L_0x00e2:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r2.<init>();	 Catch:{ Exception -> 0x019d }
        r3 = "&t3=";	 Catch:{ Exception -> 0x019d }
        r2.append(r3);	 Catch:{ Exception -> 0x019d }
        r2.append(r5);	 Catch:{ Exception -> 0x019d }
    L_0x00ef:
        r2 = r2.toString();	 Catch:{ Exception -> 0x019d }
        goto L_0x0108;	 Catch:{ Exception -> 0x019d }
    L_0x00f4:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r2.<init>();	 Catch:{ Exception -> 0x019d }
        r3 = "&t3=";	 Catch:{ Exception -> 0x019d }
        r2.append(r3);	 Catch:{ Exception -> 0x019d }
        r3 = "t3";	 Catch:{ Exception -> 0x019d }
        r3 = r4.getString(r3);	 Catch:{ Exception -> 0x019d }
        r2.append(r3);	 Catch:{ Exception -> 0x019d }
        goto L_0x00ef;	 Catch:{ Exception -> 0x019d }
    L_0x0108:
        r1.append(r2);	 Catch:{ Exception -> 0x019d }
        r1 = r1.toString();	 Catch:{ Exception -> 0x019d }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r0.<init>();	 Catch:{ Exception -> 0x019a }
        r0.append(r1);	 Catch:{ Exception -> 0x019a }
        r2 = "ct";	 Catch:{ Exception -> 0x019a }
        r2 = r4.getString(r2);	 Catch:{ Exception -> 0x019a }
        r3 = "t4";	 Catch:{ Exception -> 0x019a }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x019a }
        if (r2 == 0) goto L_0x0137;	 Catch:{ Exception -> 0x019a }
    L_0x0125:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r2.<init>();	 Catch:{ Exception -> 0x019a }
        r3 = "&t4=";	 Catch:{ Exception -> 0x019a }
        r2.append(r3);	 Catch:{ Exception -> 0x019a }
        r2.append(r5);	 Catch:{ Exception -> 0x019a }
    L_0x0132:
        r2 = r2.toString();	 Catch:{ Exception -> 0x019a }
        goto L_0x014b;	 Catch:{ Exception -> 0x019a }
    L_0x0137:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019a }
        r2.<init>();	 Catch:{ Exception -> 0x019a }
        r3 = "&t4=";	 Catch:{ Exception -> 0x019a }
        r2.append(r3);	 Catch:{ Exception -> 0x019a }
        r3 = "t4";	 Catch:{ Exception -> 0x019a }
        r3 = r4.getString(r3);	 Catch:{ Exception -> 0x019a }
        r2.append(r3);	 Catch:{ Exception -> 0x019a }
        goto L_0x0132;	 Catch:{ Exception -> 0x019a }
    L_0x014b:
        r0.append(r2);	 Catch:{ Exception -> 0x019a }
        r0 = r0.toString();	 Catch:{ Exception -> 0x019a }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r1.<init>();	 Catch:{ Exception -> 0x019d }
        r1.append(r0);	 Catch:{ Exception -> 0x019d }
        r2 = "ct";	 Catch:{ Exception -> 0x019d }
        r2 = r4.getString(r2);	 Catch:{ Exception -> 0x019d }
        r3 = "t5";	 Catch:{ Exception -> 0x019d }
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x019d }
        if (r2 == 0) goto L_0x017a;	 Catch:{ Exception -> 0x019d }
    L_0x0168:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r4.<init>();	 Catch:{ Exception -> 0x019d }
        r2 = "&t5=";	 Catch:{ Exception -> 0x019d }
        r4.append(r2);	 Catch:{ Exception -> 0x019d }
        r4.append(r5);	 Catch:{ Exception -> 0x019d }
        r4 = r4.toString();	 Catch:{ Exception -> 0x019d }
        goto L_0x0191;	 Catch:{ Exception -> 0x019d }
    L_0x017a:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x019d }
        r5.<init>();	 Catch:{ Exception -> 0x019d }
        r2 = "&t5=";	 Catch:{ Exception -> 0x019d }
        r5.append(r2);	 Catch:{ Exception -> 0x019d }
        r2 = "t5";	 Catch:{ Exception -> 0x019d }
        r4 = r4.getString(r2);	 Catch:{ Exception -> 0x019d }
        r5.append(r4);	 Catch:{ Exception -> 0x019d }
        r4 = r5.toString();	 Catch:{ Exception -> 0x019d }
    L_0x0191:
        r1.append(r4);	 Catch:{ Exception -> 0x019d }
        r4 = r1.toString();	 Catch:{ Exception -> 0x019d }
        r0 = r4;
        goto L_0x01a1;
    L_0x019a:
        r4 = move-exception;
        r0 = r1;
        goto L_0x019e;
    L_0x019d:
        r4 = move-exception;
    L_0x019e:
        r4.printStackTrace();
    L_0x01a1:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4.append(r0);
        r5 = "&os=android";
        r4.append(r5);
        r4 = r4.toString();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.a.a.b(org.json.JSONObject, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m13199a() {
        if (f11496a.get() != null) {
            Builder builder;
            if (VERSION.SDK_INT >= 21) {
                builder = new Builder((Context) f11496a.get(), 16974374);
            } else {
                builder = new Builder((Context) f11496a.get());
            }
            builder.setTitle("Branch Deeplink Routing Support").setMessage("Bummer. It seems like +clicked_branch_link is false - we didn't deep link.  Double check that the link you're clicking has the same branch_key that is being used in your Manifest file. Return to Chrome when you're ready to test again.").setNeutralButton("Got it", new C27255()).setCancelable(false).setIcon(17301651).show();
        }
    }

    /* renamed from: b */
    private static String m13203b() {
        String str = "";
        if (Branch.m23406b() == null || Branch.m23406b().m23468i() == null) {
            return str;
        }
        JSONObject i = Branch.m23406b().m23468i();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("~");
        stringBuilder.append(Jsonkey.ReferringLink.m13131a());
        return i.optString(stringBuilder.toString());
    }
}
