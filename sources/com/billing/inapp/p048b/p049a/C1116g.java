package com.billing.inapp.p048b.p049a;

import com.billing.inapp.p047a.C1102b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.billing.inapp.b.a.g */
public class C1116g {
    /* renamed from: a */
    private final Map<String, C1117i> f3629a = new HashMap();

    public C1116g(C1102b c1102b) {
        this.f3629a.put("ad_free", new C3349a(c1102b));
        this.f3629a.put("ad_free_monthly", new C3350b(c1102b));
        this.f3629a.put("ad_free_yearly", new C3351c(c1102b));
    }

    /* renamed from: a */
    public final List<String> m4617a(String str) {
        List<String> arrayList = new ArrayList();
        for (String str2 : this.f3629a.keySet()) {
            if (((C1117i) this.f3629a.get(str2)).mo926a().equals(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m4619a(C1115f c1115f, C3352e c3352e) {
        ((C1117i) this.f3629a.get(c1115f.m4612a())).mo928a(c1115f, c3352e);
    }

    /* renamed from: a */
    public void m4618a(C1115f c1115f) {
        ((C1117i) this.f3629a.get(c1115f.m4612a())).mo927a(c1115f);
    }
}
