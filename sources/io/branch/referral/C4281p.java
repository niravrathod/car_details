package io.branch.referral;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import io.branch.referral.Branch.C2701b;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import java.util.Collection;
import org.json.JSONObject;

/* renamed from: io.branch.referral.p */
class C4281p extends ServerRequest {
    /* renamed from: g */
    private C2735e f17981g;
    /* renamed from: h */
    private boolean f17982h = true;
    /* renamed from: i */
    private C2701b f17983i;
    /* renamed from: j */
    private boolean f17984j;
    /* renamed from: k */
    private boolean f17985k = true;

    /* renamed from: a */
    public boolean mo3537a() {
        return false;
    }

    /* renamed from: d */
    boolean mo3542d() {
        return false;
    }

    public C4281p(Context context, String str, int i, int i2, Collection<String> collection, String str2, String str3, String str4, String str5, JSONObject jSONObject, C2701b c2701b, boolean z, boolean z2) {
        super(context, RequestPath.GetURL.m13133a());
        this.f17983i = c2701b;
        this.f17982h = z;
        this.f17985k = z2;
        this.f17981g = new C2735e();
        try {
            this.f17981g.put(Jsonkey.IdentityID.m13131a(), this.b.m13386i());
            this.f17981g.put(Jsonkey.DeviceFingerprintID.m13131a(), this.b.m13382g());
            this.f17981g.put(Jsonkey.SessionID.m13131a(), this.b.m13384h());
            if (this.b.m13390k().equals("bnc_no_value") == null) {
                this.f17981g.put(Jsonkey.LinkClickID.m13131a(), this.b.m13390k());
            }
            this.f17981g.m13256a(i);
            this.f17981g.m13261b(i2);
            this.f17981g.m13258a((Collection) collection);
            this.f17981g.m13257a(str);
            this.f17981g.m13262b(str2);
            this.f17981g.m13264c(str3);
            this.f17981g.m13266d(str4);
            this.f17981g.m13268e(str5);
            this.f17981g.m13259a(jSONObject);
            mo3548a((JSONObject) this.f17981g);
        } catch (String str6) {
            str6.printStackTrace();
            this.e = true;
        }
    }

    public C4281p(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: u */
    public C2735e mo3543u() {
        return this.f17981g;
    }

    /* renamed from: v */
    boolean mo3544v() {
        return this.f17985k;
    }

    /* renamed from: a */
    public boolean mo3538a(Context context) {
        if (super.m13159b(context) != null) {
            return null;
        }
        if (this.f17983i != null) {
            this.f17983i.mo1226a(null, new C2734d("Trouble creating a URL.", -102));
        }
        return true;
    }

    /* renamed from: a */
    public void mo3536a(ab abVar, Branch branch) {
        try {
            abVar = abVar.m13213b().getString(ImagesContract.URL);
            if (this.f17983i != null) {
                this.f17983i.mo1226a(abVar, null);
            }
            m23498c(abVar);
        } catch (ab abVar2) {
            abVar2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m23501a(String str) {
        if (this.f17983i != null) {
            this.f17983i.mo1226a(str, null);
        }
        m23498c(str);
    }

    /* renamed from: a */
    public void mo3535a(int i, String str) {
        if (this.f17983i != null) {
            String str2 = null;
            if (this.f17985k) {
                str2 = mo3545w();
            }
            C2701b c2701b = this.f17983i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trouble creating a URL. ");
            stringBuilder.append(str);
            c2701b.mo1226a(str2, new C2734d(stringBuilder.toString(), i));
        }
    }

    /* renamed from: w */
    public String mo3545w() {
        if (!this.b.m13414w().equals("bnc_no_value")) {
            return m23497b(this.b.m13414w());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("https://bnc.lt/a/");
        stringBuilder.append(this.b.m13380f());
        return m23497b(stringBuilder.toString());
    }

    /* renamed from: x */
    public void mo3546x() {
        if (this.f17983i != null) {
            this.f17983i.mo1226a(null, new C2734d("Trouble creating a URL.", -105));
        }
    }

    /* renamed from: b */
    public void mo3539b() {
        this.f17983i = null;
    }

    /* renamed from: y */
    public boolean m23511y() {
        return this.f17982h;
    }

    /* renamed from: b */
    private java.lang.String m23497b(java.lang.String r6) {
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
        r5 = this;
        r0 = io.branch.referral.Branch.m23406b();	 Catch:{ Exception -> 0x021c }
        r0 = r0.m23456a();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x0022;	 Catch:{ Exception -> 0x021c }
    L_0x000a:
        r0 = "https://bnc.lt/a/";	 Catch:{ Exception -> 0x021c }
        r0 = r6.contains(r0);	 Catch:{ Exception -> 0x021c }
        if (r0 != 0) goto L_0x0022;	 Catch:{ Exception -> 0x021c }
    L_0x0012:
        r0 = new java.net.URL;	 Catch:{ Exception -> 0x021c }
        r0.<init>(r6);	 Catch:{ Exception -> 0x021c }
        r0 = r0.getQuery();	 Catch:{ Exception -> 0x021c }
        r1 = "";	 Catch:{ Exception -> 0x021c }
        r0 = r6.replace(r0, r1);	 Catch:{ Exception -> 0x021c }
        r6 = r0;	 Catch:{ Exception -> 0x021c }
    L_0x0022:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r0.<init>();	 Catch:{ Exception -> 0x021c }
        r0.append(r6);	 Catch:{ Exception -> 0x021c }
        r1 = "?";	 Catch:{ Exception -> 0x021c }
        r1 = r6.contains(r1);	 Catch:{ Exception -> 0x021c }
        if (r1 == 0) goto L_0x0035;	 Catch:{ Exception -> 0x021c }
    L_0x0032:
        r1 = "";	 Catch:{ Exception -> 0x021c }
        goto L_0x0037;	 Catch:{ Exception -> 0x021c }
    L_0x0035:
        r1 = "?";	 Catch:{ Exception -> 0x021c }
    L_0x0037:
        r0.append(r1);	 Catch:{ Exception -> 0x021c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x021c }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021b }
        r6.<init>();	 Catch:{ Exception -> 0x021b }
        r6.append(r0);	 Catch:{ Exception -> 0x021b }
        r1 = "?";	 Catch:{ Exception -> 0x021b }
        r1 = r0.endsWith(r1);	 Catch:{ Exception -> 0x021b }
        if (r1 == 0) goto L_0x0051;	 Catch:{ Exception -> 0x021b }
    L_0x004e:
        r1 = "";	 Catch:{ Exception -> 0x021b }
        goto L_0x0053;	 Catch:{ Exception -> 0x021b }
    L_0x0051:
        r1 = "&";	 Catch:{ Exception -> 0x021b }
    L_0x0053:
        r6.append(r1);	 Catch:{ Exception -> 0x021b }
        r6 = r6.toString();	 Catch:{ Exception -> 0x021b }
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13255a();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x021c }
    L_0x0062:
        r0 = r0.iterator();	 Catch:{ Exception -> 0x021c }
    L_0x0066:
        r1 = r0.hasNext();	 Catch:{ Exception -> 0x021c }
        if (r1 == 0) goto L_0x00a0;	 Catch:{ Exception -> 0x021c }
    L_0x006c:
        r1 = r0.next();	 Catch:{ Exception -> 0x021c }
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x021c }
        if (r1 == 0) goto L_0x0066;	 Catch:{ Exception -> 0x021c }
    L_0x0074:
        r2 = r1.length();	 Catch:{ Exception -> 0x021c }
        if (r2 <= 0) goto L_0x0066;	 Catch:{ Exception -> 0x021c }
    L_0x007a:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r2.<init>();	 Catch:{ Exception -> 0x021c }
        r2.append(r6);	 Catch:{ Exception -> 0x021c }
        r3 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ Exception -> 0x021c }
        r2.append(r3);	 Catch:{ Exception -> 0x021c }
        r3 = "=";	 Catch:{ Exception -> 0x021c }
        r2.append(r3);	 Catch:{ Exception -> 0x021c }
        r3 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r1 = java.net.URLEncoder.encode(r1, r3);	 Catch:{ Exception -> 0x021c }
        r2.append(r1);	 Catch:{ Exception -> 0x021c }
        r1 = "&";	 Catch:{ Exception -> 0x021c }
        r2.append(r1);	 Catch:{ Exception -> 0x021c }
        r1 = r2.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r1;	 Catch:{ Exception -> 0x021c }
        goto L_0x0066;	 Catch:{ Exception -> 0x021c }
    L_0x00a0:
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13260b();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x00d3;	 Catch:{ Exception -> 0x021c }
    L_0x00a8:
        r1 = r0.length();	 Catch:{ Exception -> 0x021c }
        if (r1 <= 0) goto L_0x00d3;	 Catch:{ Exception -> 0x021c }
    L_0x00ae:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r1.<init>();	 Catch:{ Exception -> 0x021c }
        r1.append(r6);	 Catch:{ Exception -> 0x021c }
        r2 = io.branch.referral.Defines.LinkParam.Alias;	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "=";	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = "&";	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r1.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r0;	 Catch:{ Exception -> 0x021c }
    L_0x00d3:
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13267e();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x0106;	 Catch:{ Exception -> 0x021c }
    L_0x00db:
        r1 = r0.length();	 Catch:{ Exception -> 0x021c }
        if (r1 <= 0) goto L_0x0106;	 Catch:{ Exception -> 0x021c }
    L_0x00e1:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r1.<init>();	 Catch:{ Exception -> 0x021c }
        r1.append(r6);	 Catch:{ Exception -> 0x021c }
        r2 = io.branch.referral.Defines.LinkParam.Channel;	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "=";	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = "&";	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r1.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r0;	 Catch:{ Exception -> 0x021c }
    L_0x0106:
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13269f();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x0139;	 Catch:{ Exception -> 0x021c }
    L_0x010e:
        r1 = r0.length();	 Catch:{ Exception -> 0x021c }
        if (r1 <= 0) goto L_0x0139;	 Catch:{ Exception -> 0x021c }
    L_0x0114:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r1.<init>();	 Catch:{ Exception -> 0x021c }
        r1.append(r6);	 Catch:{ Exception -> 0x021c }
        r2 = io.branch.referral.Defines.LinkParam.Feature;	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "=";	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = "&";	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r1.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r0;	 Catch:{ Exception -> 0x021c }
    L_0x0139:
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13270g();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x016c;	 Catch:{ Exception -> 0x021c }
    L_0x0141:
        r1 = r0.length();	 Catch:{ Exception -> 0x021c }
        if (r1 <= 0) goto L_0x016c;	 Catch:{ Exception -> 0x021c }
    L_0x0147:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r1.<init>();	 Catch:{ Exception -> 0x021c }
        r1.append(r6);	 Catch:{ Exception -> 0x021c }
        r2 = io.branch.referral.Defines.LinkParam.Stage;	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "=";	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = "&";	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r1.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r0;	 Catch:{ Exception -> 0x021c }
    L_0x016c:
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13271h();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x019f;	 Catch:{ Exception -> 0x021c }
    L_0x0174:
        r1 = r0.length();	 Catch:{ Exception -> 0x021c }
        if (r1 <= 0) goto L_0x019f;	 Catch:{ Exception -> 0x021c }
    L_0x017a:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r1.<init>();	 Catch:{ Exception -> 0x021c }
        r1.append(r6);	 Catch:{ Exception -> 0x021c }
        r2 = io.branch.referral.Defines.LinkParam.Campaign;	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "=";	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r2 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r0 = java.net.URLEncoder.encode(r0, r2);	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = "&";	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r1.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r0;	 Catch:{ Exception -> 0x021c }
    L_0x019f:
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13263c();	 Catch:{ Exception -> 0x021c }
        r0 = (long) r0;	 Catch:{ Exception -> 0x021c }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r2.<init>();	 Catch:{ Exception -> 0x021c }
        r2.append(r6);	 Catch:{ Exception -> 0x021c }
        r3 = io.branch.referral.Defines.LinkParam.Type;	 Catch:{ Exception -> 0x021c }
        r2.append(r3);	 Catch:{ Exception -> 0x021c }
        r3 = "=";	 Catch:{ Exception -> 0x021c }
        r2.append(r3);	 Catch:{ Exception -> 0x021c }
        r2.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = "&";	 Catch:{ Exception -> 0x021c }
        r2.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r2.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r5.f17981g;	 Catch:{ Exception -> 0x021b }
        r6 = r6.m13265d();	 Catch:{ Exception -> 0x021b }
        r1 = (long) r6;	 Catch:{ Exception -> 0x021b }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021b }
        r6.<init>();	 Catch:{ Exception -> 0x021b }
        r6.append(r0);	 Catch:{ Exception -> 0x021b }
        r3 = io.branch.referral.Defines.LinkParam.Duration;	 Catch:{ Exception -> 0x021b }
        r6.append(r3);	 Catch:{ Exception -> 0x021b }
        r3 = "=";	 Catch:{ Exception -> 0x021b }
        r6.append(r3);	 Catch:{ Exception -> 0x021b }
        r6.append(r1);	 Catch:{ Exception -> 0x021b }
        r6 = r6.toString();	 Catch:{ Exception -> 0x021b }
        r0 = r5.f17981g;	 Catch:{ Exception -> 0x021c }
        r0 = r0.m13272i();	 Catch:{ Exception -> 0x021c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x021c }
        if (r0 == 0) goto L_0x022b;	 Catch:{ Exception -> 0x021c }
    L_0x01f0:
        r1 = r0.length();	 Catch:{ Exception -> 0x021c }
        if (r1 <= 0) goto L_0x022b;	 Catch:{ Exception -> 0x021c }
    L_0x01f6:
        r0 = r0.getBytes();	 Catch:{ Exception -> 0x021c }
        r1 = 2;	 Catch:{ Exception -> 0x021c }
        r0 = io.branch.referral.C2732b.m13248b(r0, r1);	 Catch:{ Exception -> 0x021c }
        r1 = "UTF8";	 Catch:{ Exception -> 0x021c }
        r0 = java.net.URLEncoder.encode(r0, r1);	 Catch:{ Exception -> 0x021c }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021c }
        r1.<init>();	 Catch:{ Exception -> 0x021c }
        r1.append(r6);	 Catch:{ Exception -> 0x021c }
        r2 = "&source=android&data=";	 Catch:{ Exception -> 0x021c }
        r1.append(r2);	 Catch:{ Exception -> 0x021c }
        r1.append(r0);	 Catch:{ Exception -> 0x021c }
        r0 = r1.toString();	 Catch:{ Exception -> 0x021c }
        r6 = r0;
        goto L_0x022b;
    L_0x021b:
        r6 = r0;
    L_0x021c:
        r0 = r5.f17983i;
        r1 = 0;
        r2 = new io.branch.referral.d;
        r3 = "Trouble creating a URL.";
        r4 = -116; // 0xffffffffffffff8c float:NaN double:NaN;
        r2.<init>(r3, r4);
        r0.mo1226a(r1, r2);
    L_0x022b:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.p.b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    void m23502a(boolean z) {
        this.f17984j = z;
    }

    /* renamed from: z */
    boolean m23512z() {
        return this.f17984j;
    }

    /* renamed from: c */
    private void m23498c(String str) {
        JSONObject j = this.f17981g.m13273j();
        if (m23512z() && j != null) {
            new C2753m().m13338a("Branch Share", j, this.b.m13386i());
        }
    }
}
