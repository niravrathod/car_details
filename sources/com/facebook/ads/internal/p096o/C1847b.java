package com.facebook.ads.internal.p096o;

import android.content.Context;
import com.facebook.ads.internal.p084c.C1770b;
import com.facebook.ads.internal.p090i.C1809c;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p101q.p102a.C1922l;
import com.facebook.ads.internal.p101q.p102a.C1932s;
import com.facebook.ads.internal.p101q.p102a.C1938y;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1897c;
import com.facebook.ads.internal.protocol.C1898d;
import com.facebook.ads.internal.protocol.C1900f;
import com.facebook.ads.internal.protocol.C1904h;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.o.b */
public class C1847b {
    /* renamed from: a */
    protected String f5643a;
    /* renamed from: b */
    public Context f5644b;
    /* renamed from: c */
    public C1900f f5645c;
    /* renamed from: d */
    private C1897c f5646d;
    /* renamed from: e */
    private final AdPlacementType f5647e = this.f5646d.m7235a();
    /* renamed from: f */
    private final String f5648f;
    /* renamed from: g */
    private final String f5649g;
    /* renamed from: h */
    private C1898d f5650h;
    /* renamed from: i */
    private boolean f5651i;
    /* renamed from: j */
    private boolean f5652j;
    /* renamed from: k */
    private int f5653k;
    /* renamed from: l */
    private C1922l f5654l;
    /* renamed from: m */
    private final Map<String, String> f5655m;
    /* renamed from: n */
    private final C1904h f5656n;
    /* renamed from: o */
    private String f5657o;

    public C1847b(Context context, C1809c c1809c, String str, C1922l c1922l, C1900f c1900f, C1898d c1898d, String str2, String str3, int i, boolean z, boolean z2, C1904h c1904h, String str4) {
        this.f5643a = str;
        this.f5654l = c1922l;
        this.f5645c = c1900f;
        this.f5646d = C1897c.m7234a(c1900f);
        this.f5650h = c1898d;
        this.f5648f = str2;
        this.f5649g = str3;
        this.f5653k = i;
        this.f5651i = z;
        this.f5652j = z2;
        this.f5655m = c1809c.m6817a();
        this.f5656n = c1904h;
        this.f5644b = context;
        this.f5657o = str4;
    }

    /* renamed from: a */
    private void m7040a(Map<String, String> map, String str, String str2) {
        map.put(str, str2);
    }

    /* renamed from: a */
    public String m7041a() {
        return this.f5643a;
    }

    /* renamed from: b */
    public C1897c m7042b() {
        return this.f5646d;
    }

    /* renamed from: c */
    public C1922l m7043c() {
        return this.f5654l;
    }

    /* renamed from: d */
    public int m7044d() {
        return this.f5653k;
    }

    /* renamed from: e */
    public C1904h m7045e() {
        return this.f5656n;
    }

    /* renamed from: f */
    public Map<String, String> m7046f() {
        Map<String, String> hashMap = new HashMap(this.f5655m);
        m7040a(hashMap, "IDFA", C1770b.f5345b);
        m7040a(hashMap, "IDFA_FLAG", C1770b.f5346c ? "0" : "1");
        m7040a(hashMap, "COPPA", String.valueOf(this.f5652j));
        m7040a(hashMap, "PLACEMENT_ID", this.f5643a);
        if (this.f5647e != AdPlacementType.UNKNOWN) {
            m7040a(hashMap, "PLACEMENT_TYPE", this.f5647e.toString().toLowerCase());
        }
        if (this.f5654l != null) {
            m7040a(hashMap, "WIDTH", String.valueOf(this.f5654l.m7297b()));
            m7040a(hashMap, "HEIGHT", String.valueOf(this.f5654l.m7296a()));
        }
        m7040a(hashMap, "ADAPTERS", this.f5649g);
        if (this.f5645c != null) {
            m7040a(hashMap, "TEMPLATE_ID", String.valueOf(this.f5645c.m7240a()));
        }
        if (this.f5650h != null) {
            m7040a(hashMap, "REQUEST_TYPE", String.valueOf(this.f5650h.m7236a()));
        }
        if (this.f5651i) {
            m7040a(hashMap, "TEST_MODE", "1");
        }
        if (this.f5648f != null) {
            m7040a(hashMap, "DEMO_AD_ID", this.f5648f);
        }
        if (this.f5653k != 0) {
            m7040a(hashMap, "NUM_ADS_REQUESTED", String.valueOf(this.f5653k));
        }
        m7040a(hashMap, "CLIENT_EVENTS", C1813b.m6822a());
        m7040a(hashMap, "KG_RESTRICTED", String.valueOf(C1938y.m7334a(this.f5644b)));
        m7040a(hashMap, "REQUEST_TIME", C1932s.m7314a(System.currentTimeMillis()));
        if (this.f5656n.m7247c()) {
            m7040a(hashMap, "BID_ID", this.f5656n.m7248d());
        }
        if (this.f5657o != null) {
            m7040a(hashMap, "STACK_TRACE", this.f5657o);
        }
        m7040a(hashMap, "CLIENT_REQUEST_ID", UUID.randomUUID().toString());
        return hashMap;
    }
}
