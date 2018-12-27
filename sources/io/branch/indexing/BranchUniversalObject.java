package io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import io.branch.referral.Branch;
import io.branch.referral.Branch.C2701b;
import io.branch.referral.Branch.C2702c;
import io.branch.referral.Branch.C2707j;
import io.branch.referral.Branch.C2709l;
import io.branch.referral.Branch.C4271h;
import io.branch.referral.C2734d;
import io.branch.referral.C4277f;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.util.BRANCH_STANDARD_EVENT;
import io.branch.referral.util.C2758a;
import io.branch.referral.util.ContentMetadata;
import io.branch.referral.util.LinkProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BranchUniversalObject implements Parcelable {
    public static final Creator CREATOR = new C26921();
    /* renamed from: a */
    private String f11254a;
    /* renamed from: b */
    private String f11255b;
    /* renamed from: c */
    private String f11256c;
    /* renamed from: d */
    private String f11257d;
    /* renamed from: e */
    private String f11258e;
    /* renamed from: f */
    private ContentMetadata f11259f;
    /* renamed from: g */
    private CONTENT_INDEX_MODE f11260g;
    /* renamed from: h */
    private final ArrayList<String> f11261h;
    /* renamed from: i */
    private long f11262i;
    /* renamed from: j */
    private CONTENT_INDEX_MODE f11263j;
    /* renamed from: k */
    private long f11264k;

    /* renamed from: io.branch.indexing.BranchUniversalObject$1 */
    static class C26921 implements Creator {
        C26921() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m13012a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m13013a(i);
        }

        /* renamed from: a */
        public BranchUniversalObject m13012a(Parcel parcel) {
            return new BranchUniversalObject(parcel);
        }

        /* renamed from: a */
        public BranchUniversalObject[] m13013a(int i) {
            return new BranchUniversalObject[i];
        }
    }

    public enum CONTENT_INDEX_MODE {
        PUBLIC,
        PRIVATE
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$a */
    private class C4267a implements C2702c {
        /* renamed from: a */
        final /* synthetic */ BranchUniversalObject f17902a;
        /* renamed from: b */
        private final C2702c f17903b;
        /* renamed from: c */
        private final C2709l f17904c;
        /* renamed from: d */
        private final LinkProperties f17905d;

        C4267a(BranchUniversalObject branchUniversalObject, C2702c c2702c, C2709l c2709l, LinkProperties linkProperties) {
            this.f17902a = branchUniversalObject;
            this.f17903b = c2702c;
            this.f17904c = c2709l;
            this.f17905d = linkProperties;
        }

        /* renamed from: a */
        public void mo1232a() {
            if (this.f17903b != null) {
                this.f17903b.mo1232a();
            }
        }

        /* renamed from: b */
        public void mo1235b() {
            if (this.f17903b != null) {
                this.f17903b.mo1235b();
            }
        }

        /* renamed from: a */
        public void mo1234a(String str, String str2, C2734d c2734d) {
            HashMap hashMap = new HashMap();
            if (c2734d == null) {
                hashMap.put(Jsonkey.SharedLink.m13131a(), str);
            } else {
                hashMap.put(Jsonkey.ShareError.m13131a(), c2734d.m13253a());
            }
            this.f17902a.m13023a(BRANCH_STANDARD_EVENT.SHARE.m13432a(), hashMap);
            if (this.f17903b != null) {
                this.f17903b.mo1234a(str, str2, c2734d);
            }
        }

        /* renamed from: a */
        public void mo1233a(String str) {
            if (this.f17903b != null) {
                this.f17903b.mo1233a(str);
            }
            if ((this.f17903b instanceof C4271h) && ((C4271h) this.f17903b).m23380a(str, this.f17902a, this.f17905d) != null) {
                this.f17904c.m13100a(this.f17902a.m13016a(this.f17904c.m13122p(), this.f17905d));
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public BranchUniversalObject() {
        this.f11259f = new ContentMetadata();
        this.f11261h = new ArrayList();
        this.f11254a = "";
        this.f11255b = "";
        this.f11256c = "";
        this.f11257d = "";
        this.f11260g = CONTENT_INDEX_MODE.PUBLIC;
        this.f11263j = CONTENT_INDEX_MODE.PUBLIC;
        this.f11262i = 0;
        this.f11264k = System.currentTimeMillis();
    }

    /* renamed from: a */
    public BranchUniversalObject m13019a(String str) {
        this.f11254a = str;
        return this;
    }

    /* renamed from: b */
    public BranchUniversalObject m13026b(String str) {
        this.f11256c = str;
        return this;
    }

    /* renamed from: c */
    public BranchUniversalObject m13028c(String str) {
        this.f11257d = str;
        return this;
    }

    /* renamed from: d */
    public BranchUniversalObject m13030d(String str) {
        this.f11258e = str;
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject m13018a(ContentMetadata contentMetadata) {
        this.f11259f = contentMetadata;
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject m13017a(CONTENT_INDEX_MODE content_index_mode) {
        this.f11260g = content_index_mode;
        return this;
    }

    /* renamed from: b */
    public BranchUniversalObject m13025b(CONTENT_INDEX_MODE content_index_mode) {
        this.f11263j = content_index_mode;
        return this;
    }

    /* renamed from: a */
    public void m13023a(java.lang.String r5, java.util.HashMap<java.lang.String, java.lang.String> r6) {
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
        r4 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0043 }
        r1.<init>();	 Catch:{ JSONException -> 0x0043 }
        r2 = r4.f11254a;	 Catch:{ JSONException -> 0x0043 }
        r1.put(r2);	 Catch:{ JSONException -> 0x0043 }
        r1 = r4.f11254a;	 Catch:{ JSONException -> 0x0043 }
        r2 = r4.m13031d();	 Catch:{ JSONException -> 0x0043 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0043 }
        if (r6 == 0) goto L_0x0036;	 Catch:{ JSONException -> 0x0043 }
    L_0x001a:
        r1 = r6.keySet();	 Catch:{ JSONException -> 0x0043 }
        r1 = r1.iterator();	 Catch:{ JSONException -> 0x0043 }
    L_0x0022:
        r2 = r1.hasNext();	 Catch:{ JSONException -> 0x0043 }
        if (r2 == 0) goto L_0x0036;	 Catch:{ JSONException -> 0x0043 }
    L_0x0028:
        r2 = r1.next();	 Catch:{ JSONException -> 0x0043 }
        r2 = (java.lang.String) r2;	 Catch:{ JSONException -> 0x0043 }
        r3 = r6.get(r2);	 Catch:{ JSONException -> 0x0043 }
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x0043 }
        goto L_0x0022;	 Catch:{ JSONException -> 0x0043 }
    L_0x0036:
        r6 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0043 }
        if (r6 == 0) goto L_0x0043;	 Catch:{ JSONException -> 0x0043 }
    L_0x003c:
        r6 = io.branch.referral.Branch.m23406b();	 Catch:{ JSONException -> 0x0043 }
        r6.m23454a(r5, r0);	 Catch:{ JSONException -> 0x0043 }
    L_0x0043:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.BranchUniversalObject.a(java.lang.String, java.util.HashMap):void");
    }

    /* renamed from: a */
    public boolean m13024a() {
        return this.f11260g == CONTENT_INDEX_MODE.PUBLIC;
    }

    /* renamed from: b */
    public boolean m13027b() {
        return this.f11263j == CONTENT_INDEX_MODE.PUBLIC;
    }

    /* renamed from: c */
    public JSONArray m13029c() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f11261h.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public void m13022a(Context context, LinkProperties linkProperties, C2701b c2701b) {
        m13014a(context, linkProperties).m23478a(c2701b);
    }

    /* renamed from: a */
    public void m13020a(Activity activity, LinkProperties linkProperties, C2758a c2758a, C2702c c2702c) {
        m13021a(activity, linkProperties, c2758a, c2702c, null);
    }

    /* renamed from: a */
    public void m13021a(Activity activity, LinkProperties linkProperties, C2758a c2758a, C2702c c2702c, C2707j c2707j) {
        if (Branch.m23406b() != null) {
            C2709l c2709l = new C2709l(activity, m13014a((Context) activity, linkProperties));
            c2709l.m13093a(new C4267a(this, c2702c, c2709l, linkProperties)).m13094a(c2707j).m13103b(c2758a.m13466g()).m13095a(c2758a.m13465f());
            if (c2758a.m13463d() != null) {
                c2709l.m13091a(c2758a.m13463d(), c2758a.m13467h(), c2758a.m13470k());
            }
            if (c2758a.m13464e() != null) {
                c2709l.m13090a(c2758a.m13464e(), c2758a.m13469j());
            }
            if (c2758a.m13468i() != null) {
                c2709l.m13106c(c2758a.m13468i());
            }
            if (c2758a.m13462c().size() > null) {
                c2709l.m13096a(c2758a.m13462c());
            }
            if (c2758a.m13476q() > null) {
                c2709l.m13110d(c2758a.m13476q());
            }
            c2709l.m13102b(c2758a.m13471l());
            c2709l.m13098a(c2758a.m13474o());
            c2709l.m13089a(c2758a.m13475p());
            c2709l.m13108d(c2758a.m13472m());
            c2709l.m13092a(c2758a.m13473n());
            c2709l.m13105c(c2758a.m13477r());
            if (c2758a.m13461b() != null && c2758a.m13461b().size() > null) {
                c2709l.m13104b(c2758a.m13461b());
            }
            if (c2758a.m13460a() != null && c2758a.m13460a().size() > null) {
                c2709l.m13097a(c2758a.m13460a());
            }
            c2709l.m13099a();
        } else if (c2702c != null) {
            c2702c.mo1234a(null, null, new C2734d("Trouble sharing link. ", -109));
        } else {
            Log.e("BranchSDK", "Sharing error. Branch instance is not created yet. Make sure you have initialised Branch.");
        }
    }

    /* renamed from: a */
    private C4277f m13014a(Context context, LinkProperties linkProperties) {
        return m13016a(new C4277f(context), linkProperties);
    }

    /* renamed from: a */
    private C4277f m13016a(C4277f c4277f, LinkProperties linkProperties) {
        String a;
        StringBuilder stringBuilder;
        if (linkProperties.m13444a() != null) {
            c4277f.m13282a(linkProperties.m13444a());
        }
        if (linkProperties.m13449e() != null) {
            c4277f.m23481c(linkProperties.m13449e());
        }
        if (linkProperties.m13448d() != null) {
            c4277f.m23477a(linkProperties.m13448d());
        }
        if (linkProperties.m13451g() != null) {
            c4277f.m23480b(linkProperties.m13451g());
        }
        if (linkProperties.m13450f() != null) {
            c4277f.m23482d(linkProperties.m13450f());
        }
        if (linkProperties.m13452h() != null) {
            c4277f.m23483e(linkProperties.m13452h());
        }
        if (linkProperties.m13447c() > 0) {
            c4277f.m23476a(linkProperties.m13447c());
        }
        if (!TextUtils.isEmpty(this.f11256c)) {
            c4277f.m13281a(Jsonkey.ContentTitle.m13131a(), this.f11256c);
        }
        if (!TextUtils.isEmpty(this.f11254a)) {
            c4277f.m13281a(Jsonkey.CanonicalIdentifier.m13131a(), this.f11254a);
        }
        if (!TextUtils.isEmpty(this.f11255b)) {
            c4277f.m13281a(Jsonkey.CanonicalUrl.m13131a(), this.f11255b);
        }
        JSONArray c = m13029c();
        if (c.length() > 0) {
            c4277f.m13281a(Jsonkey.ContentKeyWords.m13131a(), c);
        }
        if (!TextUtils.isEmpty(this.f11257d)) {
            c4277f.m13281a(Jsonkey.ContentDesc.m13131a(), this.f11257d);
        }
        if (!TextUtils.isEmpty(this.f11258e)) {
            c4277f.m13281a(Jsonkey.ContentImgUrl.m13131a(), this.f11258e);
        }
        if (this.f11262i > 0) {
            a = Jsonkey.ContentExpiryTime.m13131a();
            stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(this.f11262i);
            c4277f.m13281a(a, stringBuilder.toString());
        }
        a = Jsonkey.PublicallyIndexable.m13131a();
        stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(m13024a());
        c4277f.m13281a(a, stringBuilder.toString());
        JSONObject a2 = this.f11259f.m13438a();
        try {
            Iterator keys = a2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                c4277f.m13281a(str, a2.get(str));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        linkProperties = linkProperties.m13446b();
        for (String str2 : linkProperties.keySet()) {
            c4277f.m13281a(str2, linkProperties.get(str2));
        }
        return c4277f;
    }

    /* renamed from: d */
    public org.json.JSONObject m13031d() {
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
        r6 = this;
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = r6.f11259f;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13438a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r1.keys();	 Catch:{ JSONException -> 0x00e6 }
    L_0x000f:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x00e6 }
        if (r3 == 0) goto L_0x0023;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0015:
        r3 = r2.next();	 Catch:{ JSONException -> 0x00e6 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x00e6 }
        r4 = r1.get(r3);	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r3, r4);	 Catch:{ JSONException -> 0x00e6 }
        goto L_0x000f;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0023:
        r1 = r6.f11256c;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x0036;	 Catch:{ JSONException -> 0x00e6 }
    L_0x002b:
        r1 = io.branch.referral.Defines.Jsonkey.ContentTitle;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11256c;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x0036:
        r1 = r6.f11254a;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x0049;	 Catch:{ JSONException -> 0x00e6 }
    L_0x003e:
        r1 = io.branch.referral.Defines.Jsonkey.CanonicalIdentifier;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11254a;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x0049:
        r1 = r6.f11255b;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x005c;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0051:
        r1 = io.branch.referral.Defines.Jsonkey.CanonicalUrl;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11255b;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x005c:
        r1 = r6.f11261h;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.size();	 Catch:{ JSONException -> 0x00e6 }
        if (r1 <= 0) goto L_0x0088;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0064:
        r1 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x00e6 }
        r1.<init>();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11261h;	 Catch:{ JSONException -> 0x00e6 }
        r2 = r2.iterator();	 Catch:{ JSONException -> 0x00e6 }
    L_0x006f:
        r3 = r2.hasNext();	 Catch:{ JSONException -> 0x00e6 }
        if (r3 == 0) goto L_0x007f;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0075:
        r3 = r2.next();	 Catch:{ JSONException -> 0x00e6 }
        r3 = (java.lang.String) r3;	 Catch:{ JSONException -> 0x00e6 }
        r1.put(r3);	 Catch:{ JSONException -> 0x00e6 }
        goto L_0x006f;	 Catch:{ JSONException -> 0x00e6 }
    L_0x007f:
        r2 = io.branch.referral.Defines.Jsonkey.ContentKeyWords;	 Catch:{ JSONException -> 0x00e6 }
        r2 = r2.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r2, r1);	 Catch:{ JSONException -> 0x00e6 }
    L_0x0088:
        r1 = r6.f11257d;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x009b;	 Catch:{ JSONException -> 0x00e6 }
    L_0x0090:
        r1 = io.branch.referral.Defines.Jsonkey.ContentDesc;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11257d;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x009b:
        r1 = r6.f11258e;	 Catch:{ JSONException -> 0x00e6 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ JSONException -> 0x00e6 }
        if (r1 != 0) goto L_0x00ae;	 Catch:{ JSONException -> 0x00e6 }
    L_0x00a3:
        r1 = io.branch.referral.Defines.Jsonkey.ContentImgUrl;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11258e;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x00ae:
        r1 = r6.f11262i;	 Catch:{ JSONException -> 0x00e6 }
        r3 = 0;	 Catch:{ JSONException -> 0x00e6 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));	 Catch:{ JSONException -> 0x00e6 }
        if (r5 <= 0) goto L_0x00c1;	 Catch:{ JSONException -> 0x00e6 }
    L_0x00b6:
        r1 = io.branch.referral.Defines.Jsonkey.ContentExpiryTime;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11262i;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x00c1:
        r1 = io.branch.referral.Defines.Jsonkey.PublicallyIndexable;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.m13024a();	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
        r1 = io.branch.referral.Defines.Jsonkey.LocallyIndexable;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.m13027b();	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
        r1 = io.branch.referral.Defines.Jsonkey.CreationTimestamp;	 Catch:{ JSONException -> 0x00e6 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x00e6 }
        r2 = r6.f11264k;	 Catch:{ JSONException -> 0x00e6 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x00e6 }
    L_0x00e6:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.BranchUniversalObject.d():org.json.JSONObject");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11264k);
        parcel.writeString(this.f11254a);
        parcel.writeString(this.f11255b);
        parcel.writeString(this.f11256c);
        parcel.writeString(this.f11257d);
        parcel.writeString(this.f11258e);
        parcel.writeLong(this.f11262i);
        parcel.writeInt(this.f11260g.ordinal());
        parcel.writeSerializable(this.f11261h);
        parcel.writeParcelable(this.f11259f, i);
        parcel.writeInt(this.f11263j.ordinal());
    }

    private BranchUniversalObject(Parcel parcel) {
        this();
        this.f11264k = parcel.readLong();
        this.f11254a = parcel.readString();
        this.f11255b = parcel.readString();
        this.f11256c = parcel.readString();
        this.f11257d = parcel.readString();
        this.f11258e = parcel.readString();
        this.f11262i = parcel.readLong();
        this.f11260g = CONTENT_INDEX_MODE.values()[parcel.readInt()];
        ArrayList arrayList = (ArrayList) parcel.readSerializable();
        if (arrayList != null) {
            this.f11261h.addAll(arrayList);
        }
        this.f11259f = (ContentMetadata) parcel.readParcelable(ContentMetadata.class.getClassLoader());
        this.f11263j = CONTENT_INDEX_MODE.values()[parcel.readInt()];
    }
}
