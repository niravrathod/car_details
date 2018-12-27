package com.billing.inapp.p048b.p049a;

import com.billing.inapp.C1118b.C1108d;
import com.billing.inapp.p047a.C1102b;

/* renamed from: com.billing.inapp.b.a.a */
public class C3349a extends C1117i {
    /* renamed from: a */
    public String mo926a() {
        return "inapp";
    }

    public C3349a(C1102b c1102b) {
        super(c1102b);
    }

    /* renamed from: a */
    public void mo928a(C1115f c1115f, C3352e c3352e) {
        super.mo928a(c1115f, c3352e);
        if (this.a.m4601b() != null) {
            c3352e.f14203q.setText(C1108d.button_already_subscribed);
        } else {
            c3352e.f14203q.setText(C1108d.button_buy);
        }
    }

    /* renamed from: a */
    public void mo927a(C1115f c1115f) {
        if (!this.a.m4601b()) {
            super.mo927a(c1115f);
        }
    }
}
