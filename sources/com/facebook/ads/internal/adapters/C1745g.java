package com.facebook.ads.internal.adapters;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.adapters.g */
public enum C1745g {
    ANBANNER(C4595r.class, C1744f.AN, AdPlacementType.BANNER),
    ANINTERSTITIAL(C4592k.class, C1744f.AN, AdPlacementType.INTERSTITIAL),
    ADMOBNATIVE(C4593o.class, C1744f.ADMOB, AdPlacementType.NATIVE),
    ANNATIVE(C4597v.class, C1744f.AN, AdPlacementType.NATIVE),
    ANNATIVEBANNER(C4597v.class, C1744f.AN, AdPlacementType.NATIVE_BANNER),
    ANINSTREAMVIDEO(C4596s.class, C1744f.AN, AdPlacementType.INSTREAM),
    ANREWARDEDVIDEO(C4598w.class, C1744f.AN, AdPlacementType.REWARDED_VIDEO),
    INMOBINATIVE(ab.class, C1744f.INMOBI, AdPlacementType.NATIVE),
    YAHOONATIVE(C4599y.class, C1744f.YAHOO, AdPlacementType.NATIVE);
    
    /* renamed from: n */
    private static List<C1745g> f5277n;
    /* renamed from: j */
    public Class<?> f5279j;
    /* renamed from: k */
    public String f5280k;
    /* renamed from: l */
    public C1744f f5281l;
    /* renamed from: m */
    public AdPlacementType f5282m;

    private C1745g(Class<?> cls, C1744f c1744f, AdPlacementType adPlacementType) {
        this.f5279j = cls;
        this.f5281l = c1744f;
        this.f5282m = adPlacementType;
    }

    /* renamed from: a */
    public static List<C1745g> m6610a() {
        if (f5277n == null) {
            synchronized (C1745g.class) {
                f5277n = new ArrayList();
                f5277n.add(ANBANNER);
                f5277n.add(ANINTERSTITIAL);
                f5277n.add(ANNATIVE);
                f5277n.add(ANNATIVEBANNER);
                f5277n.add(ANINSTREAMVIDEO);
                f5277n.add(ANREWARDEDVIDEO);
                if (ah.m6592a(C1744f.YAHOO)) {
                    f5277n.add(YAHOONATIVE);
                }
                if (ah.m6592a(C1744f.INMOBI)) {
                    f5277n.add(INMOBINATIVE);
                }
                if (ah.m6592a(C1744f.ADMOB)) {
                    f5277n.add(ADMOBNATIVE);
                }
            }
        }
        return f5277n;
    }
}
