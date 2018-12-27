package io.branch.referral;

import android.content.Context;
import android.util.Log;
import io.branch.referral.Branch.C2701b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: io.branch.referral.h */
abstract class C2741h<T extends C2741h> {
    /* renamed from: a */
    protected JSONObject f11542a;
    /* renamed from: b */
    protected String f11543b;
    /* renamed from: c */
    protected String f11544c;
    /* renamed from: d */
    protected String f11545d;
    /* renamed from: e */
    protected String f11546e;
    /* renamed from: f */
    protected String f11547f;
    /* renamed from: g */
    protected int f11548g = 0;
    /* renamed from: h */
    protected int f11549h = 0;
    /* renamed from: i */
    protected ArrayList<String> f11550i;
    /* renamed from: j */
    protected Branch f11551j = Branch.m23406b();
    /* renamed from: k */
    private boolean f11552k;
    /* renamed from: l */
    private final Context f11553l;

    protected C2741h(Context context) {
        this.f11553l = context.getApplicationContext();
        this.f11552k = true;
    }

    /* renamed from: a */
    public T m13282a(List<String> list) {
        if (this.f11550i == null) {
            this.f11550i = new ArrayList();
        }
        this.f11550i.addAll(list);
        return this;
    }

    /* renamed from: a */
    public T m13281a(java.lang.String r2, java.lang.Object r3) {
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
        r0 = r1.f11542a;	 Catch:{ JSONException -> 0x0010 }
        if (r0 != 0) goto L_0x000b;	 Catch:{ JSONException -> 0x0010 }
    L_0x0004:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0010 }
        r0.<init>();	 Catch:{ JSONException -> 0x0010 }
        r1.f11542a = r0;	 Catch:{ JSONException -> 0x0010 }
    L_0x000b:
        r0 = r1.f11542a;	 Catch:{ JSONException -> 0x0010 }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x0010 }
    L_0x0010:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.h.a(java.lang.String, java.lang.Object):T");
    }

    /* renamed from: b */
    protected void m13283b(C2701b c2701b) {
        m13284b(c2701b, false);
    }

    /* renamed from: b */
    protected void m13284b(C2701b c2701b, boolean z) {
        C2701b c2701b2 = c2701b;
        if (this.f11551j != null) {
            C4281p c4281p = new C4281p(r0.f11553l, r0.f11547f, r0.f11548g, r0.f11549h, r0.f11550i, r0.f11543b, r0.f11544c, r0.f11545d, r0.f11546e, C2742i.m13286a(r0.f11542a), c2701b, true, r0.f11552k);
            c4281p.m23502a(z);
            r0.f11551j.m23448a(c4281p);
            return;
        }
        if (c2701b2 != null) {
            c2701b2.mo1226a(null, new C2734d("session has not been initialized", -101));
        }
        Log.i("BranchSDK", "Branch Warning: User session has not been initialized");
    }
}
