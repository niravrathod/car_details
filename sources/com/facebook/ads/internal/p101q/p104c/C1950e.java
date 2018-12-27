package com.facebook.ads.internal.p101q.p104c;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p097p.p098a.C1856a;
import com.facebook.ads.internal.p097p.p098a.C1863n;
import com.facebook.ads.internal.p097p.p098a.C1865p;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.facebook.ads.internal.q.c.e */
public class C1950e extends AsyncTask<String, Void, C1951f> {
    /* renamed from: a */
    private static final String f5979a = "e";
    /* renamed from: b */
    private static final Set<String> f5980b = new HashSet();
    /* renamed from: c */
    private Context f5981c;
    /* renamed from: d */
    private Map<String, String> f5982d;
    /* renamed from: e */
    private Map<String, String> f5983e;
    /* renamed from: f */
    private C1863n f5984f;
    /* renamed from: g */
    private C1949a f5985g;

    /* renamed from: com.facebook.ads.internal.q.c.e$a */
    public interface C1949a {
        /* renamed from: a */
        void mo1437a();

        /* renamed from: a */
        void mo1438a(C1951f c1951f);
    }

    static {
        f5980b.add("#");
        f5980b.add("null");
    }

    public C1950e(Context context) {
        this(context, null, null);
    }

    public C1950e(Context context, Map<String, String> map) {
        this(context, map, null);
    }

    public C1950e(Context context, Map<String, String> map, Map<String, String> map2) {
        this.f5981c = context;
        Map map3 = null;
        this.f5982d = map != null ? new HashMap(map) : null;
        if (map2 != null) {
            map3 = new HashMap(map2);
        }
        this.f5983e = map3;
    }

    /* renamed from: a */
    private String m7366a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (TextUtils.isEmpty(str3)) {
            return str;
        }
        String str4 = str.contains("?") ? "&" : "?";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str4);
        stringBuilder.append(str2);
        stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
        stringBuilder.append(URLEncoder.encode(str3));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private boolean m7367a(String str) {
        C1856a a = C1948d.m7354a(this.f5981c);
        boolean z = false;
        try {
            C1863n b;
            if (this.f5983e != null) {
                if (this.f5983e.size() != 0) {
                    C1865p c1865p = new C1865p();
                    c1865p.m7121a(this.f5983e);
                    b = a.m7096b(str, c1865p);
                    this.f5984f = b;
                    if (this.f5984f != null && this.f5984f.m7114a() == 200) {
                        z = true;
                    }
                    return z;
                }
            }
            b = a.m7087a(str, null);
            this.f5984f = b;
            z = true;
            return z;
        } catch (Throwable e) {
            String str2 = f5979a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error opening url: ");
            stringBuilder.append(str);
            Log.e(str2, stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    private java.lang.String m7368b(java.lang.String r3) {
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
        r0 = com.facebook.ads.internal.p088g.C1799a.m6761a();	 Catch:{ Exception -> 0x000f }
        r1 = "analog";	 Catch:{ Exception -> 0x000f }
        r0 = com.facebook.ads.internal.p101q.p102a.C1921k.m7293a(r0);	 Catch:{ Exception -> 0x000f }
        r0 = r2.m7366a(r3, r1, r0);	 Catch:{ Exception -> 0x000f }
        return r0;
    L_0x000f:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.q.c.e.b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    protected C1951f m7369a(String... strArr) {
        Object obj = strArr[0];
        if (!TextUtils.isEmpty(obj)) {
            if (!f5980b.contains(obj)) {
                String b = m7368b(obj);
                if (!(this.f5982d == null || this.f5982d.isEmpty())) {
                    for (Entry entry : this.f5982d.entrySet()) {
                        b = m7366a(b, (String) entry.getKey(), (String) entry.getValue());
                    }
                }
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    if (i > 2) {
                        break;
                    } else if (m7367a(b)) {
                        return new C1951f(this.f5984f);
                    } else {
                        i = i2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m7370a(C1949a c1949a) {
        this.f5985g = c1949a;
    }

    /* renamed from: a */
    protected void m7371a(C1951f c1951f) {
        if (this.f5985g != null) {
            this.f5985g.mo1438a(c1951f);
        }
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7369a((String[]) objArr);
    }

    protected void onCancelled() {
        if (this.f5985g != null) {
            this.f5985g.mo1437a();
        }
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7371a((C1951f) obj);
    }
}
