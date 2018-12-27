package io.branch.referral;

import android.annotation.SuppressLint;
import io.branch.referral.Defines.LinkParam;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.branch.referral.e */
class C2735e extends JSONObject {
    /* renamed from: a */
    private Collection<String> f11517a;
    /* renamed from: b */
    private String f11518b;
    /* renamed from: c */
    private int f11519c;
    /* renamed from: d */
    private String f11520d;
    /* renamed from: e */
    private String f11521e;
    /* renamed from: f */
    private String f11522f;
    /* renamed from: g */
    private String f11523g;
    /* renamed from: h */
    private JSONObject f11524h;
    /* renamed from: i */
    private int f11525i;

    /* renamed from: a */
    public void m13258a(Collection<String> collection) {
        if (collection != null) {
            this.f11517a = collection;
            JSONArray jSONArray = new JSONArray();
            for (String put : collection) {
                jSONArray.put(put);
            }
            put(LinkParam.Tags.m13132a(), jSONArray);
        }
    }

    /* renamed from: a */
    public Collection<String> m13255a() {
        return this.f11517a;
    }

    /* renamed from: a */
    public void m13257a(String str) {
        if (str != null) {
            this.f11518b = str;
            put(LinkParam.Alias.m13132a(), str);
        }
    }

    /* renamed from: b */
    public String m13260b() {
        return this.f11518b;
    }

    /* renamed from: a */
    public void m13256a(int i) {
        if (i != 0) {
            this.f11519c = i;
            put(LinkParam.Type.m13132a(), i);
        }
    }

    /* renamed from: c */
    public int m13263c() {
        return this.f11519c;
    }

    /* renamed from: b */
    public void m13261b(int i) {
        if (i > 0) {
            this.f11525i = i;
            put(LinkParam.Duration.m13132a(), i);
        }
    }

    /* renamed from: d */
    public int m13265d() {
        return this.f11525i;
    }

    /* renamed from: b */
    public void m13262b(String str) {
        if (str != null) {
            this.f11520d = str;
            put(LinkParam.Channel.m13132a(), str);
        }
    }

    /* renamed from: e */
    public String m13267e() {
        return this.f11520d;
    }

    /* renamed from: c */
    public void m13264c(String str) {
        if (str != null) {
            this.f11521e = str;
            put(LinkParam.Feature.m13132a(), str);
        }
    }

    /* renamed from: f */
    public String m13269f() {
        return this.f11521e;
    }

    /* renamed from: d */
    public void m13266d(String str) {
        if (str != null) {
            this.f11522f = str;
            put(LinkParam.Stage.m13132a(), str);
        }
    }

    /* renamed from: g */
    public String m13270g() {
        return this.f11522f;
    }

    /* renamed from: e */
    public void m13268e(String str) {
        if (str != null) {
            this.f11523g = str;
            put(LinkParam.Campaign.m13132a(), str);
        }
    }

    /* renamed from: h */
    public String m13271h() {
        return this.f11523g;
    }

    /* renamed from: a */
    public void m13259a(JSONObject jSONObject) {
        this.f11524h = jSONObject;
        put(LinkParam.Data.m13132a(), jSONObject);
    }

    /* renamed from: i */
    public JSONObject m13272i() {
        return this.f11524h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2735e c2735e = (C2735e) obj;
        if (this.f11518b == null) {
            if (c2735e.f11518b != null) {
                return false;
            }
        } else if (!this.f11518b.equals(c2735e.f11518b)) {
            return false;
        }
        if (this.f11520d == null) {
            if (c2735e.f11520d != null) {
                return false;
            }
        } else if (!this.f11520d.equals(c2735e.f11520d)) {
            return false;
        }
        if (this.f11521e == null) {
            if (c2735e.f11521e != null) {
                return false;
            }
        } else if (!this.f11521e.equals(c2735e.f11521e)) {
            return false;
        }
        if (this.f11524h == null) {
            if (c2735e.f11524h != null) {
                return false;
            }
        } else if (!this.f11524h.equals(c2735e.f11524h)) {
            return false;
        }
        if (this.f11522f == null) {
            if (c2735e.f11522f != null) {
                return false;
            }
        } else if (!this.f11522f.equals(c2735e.f11522f)) {
            return false;
        }
        if (this.f11523g == null) {
            if (c2735e.f11523g != null) {
                return false;
            }
        } else if (!this.f11523g.equals(c2735e.f11523g)) {
            return false;
        }
        if (this.f11519c != c2735e.f11519c || this.f11525i != c2735e.f11525i) {
            return false;
        }
        if (this.f11517a == null) {
            if (c2735e.f11517a != null) {
                return false;
            }
        } else if (this.f11517a.toString().equals(c2735e.f11517a.toString()) == null) {
            return false;
        }
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    public int hashCode() {
        int i;
        int i2 = (this.f11519c + 19) * 19;
        int i3 = 0;
        if (this.f11518b == null) {
            i = 0;
        } else {
            i = this.f11518b.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f11520d == null) {
            i = 0;
        } else {
            i = this.f11520d.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f11521e == null) {
            i = 0;
        } else {
            i = this.f11521e.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f11522f == null) {
            i = 0;
        } else {
            i = this.f11522f.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f11523g == null) {
            i = 0;
        } else {
            i = this.f11523g.toLowerCase().hashCode();
        }
        i2 = (i2 + i) * 19;
        if (this.f11524h != null) {
            i3 = this.f11524h.toString().toLowerCase().hashCode();
        }
        i2 = ((i2 + i3) * 19) + this.f11525i;
        if (this.f11517a != null) {
            for (String toLowerCase : this.f11517a) {
                i2 = (i2 * 19) + toLowerCase.toLowerCase().hashCode();
            }
        }
        return i2;
    }

    /* renamed from: j */
    public org.json.JSONObject m13273j() {
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
        r3 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r3.f11520d;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x0029;	 Catch:{ JSONException -> 0x0110 }
    L_0x000d:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Channel;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11520d;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0029:
        r1 = r3.f11518b;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x004d;	 Catch:{ JSONException -> 0x0110 }
    L_0x0031:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Alias;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11518b;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x004d:
        r1 = r3.f11521e;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x0071;	 Catch:{ JSONException -> 0x0110 }
    L_0x0055:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Feature;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11521e;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0071:
        r1 = r3.f11522f;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x0095;	 Catch:{ JSONException -> 0x0110 }
    L_0x0079:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Stage;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11522f;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0095:
        r1 = r3.f11523g;	 Catch:{ JSONException -> 0x0110 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 != 0) goto L_0x00b9;	 Catch:{ JSONException -> 0x0110 }
    L_0x009d:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Campaign;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11523g;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x00b9:
        r1 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1 = r3.has(r1);	 Catch:{ JSONException -> 0x0110 }
        if (r1 == 0) goto L_0x00d8;	 Catch:{ JSONException -> 0x0110 }
    L_0x00c5:
        r1 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Tags;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.getJSONArray(r2);	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x00d8:
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Type;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11519c;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0110 }
        r1.<init>();	 Catch:{ JSONException -> 0x0110 }
        r2 = "~";	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r2 = io.branch.referral.Defines.LinkParam.Duration;	 Catch:{ JSONException -> 0x0110 }
        r2 = r2.m13132a();	 Catch:{ JSONException -> 0x0110 }
        r1.append(r2);	 Catch:{ JSONException -> 0x0110 }
        r1 = r1.toString();	 Catch:{ JSONException -> 0x0110 }
        r2 = r3.f11525i;	 Catch:{ JSONException -> 0x0110 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0110 }
    L_0x0110:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.e.j():org.json.JSONObject");
    }
}
