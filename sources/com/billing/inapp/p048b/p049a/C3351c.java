package com.billing.inapp.p048b.p049a;

import com.billing.inapp.C1118b.C1108d;
import com.billing.inapp.p047a.C1102b;
import java.util.ArrayList;

/* renamed from: com.billing.inapp.b.a.c */
public class C3351c extends C1117i {
    /* renamed from: a */
    public String mo926a() {
        return "subs";
    }

    public C3351c(C1102b c1102b) {
        super(c1102b);
    }

    /* renamed from: a */
    public void mo928a(C1115f c1115f, C3352e c3352e) {
        super.mo928a(c1115f, c3352e);
        if (this.a.m4603d() != null) {
            c3352e.f14203q.setText(C1108d.button_own);
        } else {
            c3352e.f14203q.setText(this.a.m4602c() != null ? C1108d.button_change : C1108d.button_buy);
        }
    }

    /* renamed from: a */
    public void mo927a(C1115f c1115f) {
        if (c1115f != null && this.a.m4602c() != null) {
            new ArrayList().add("ad_free_monthly");
        }
    }
}
