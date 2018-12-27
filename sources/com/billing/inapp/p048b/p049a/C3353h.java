package com.billing.inapp.p048b.p049a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.billing.inapp.C1118b.C1107c;
import com.billing.inapp.p047a.C1102b;
import com.billing.inapp.p048b.p049a.C3352e.C1114a;

/* renamed from: com.billing.inapp.b.a.h */
public class C3353h implements C1114a {
    /* renamed from: a */
    private final C1112d f14205a;
    /* renamed from: b */
    private final C1116g f14206b;

    public C3353h(C1112d c1112d, C1102b c1102b) {
        this.f14205a = c1112d;
        this.f14206b = new C1116g(c1102b);
    }

    /* renamed from: a */
    public C1116g m17221a() {
        return this.f14206b;
    }

    /* renamed from: a */
    public final C3352e m17220a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C3352e(LayoutInflater.from(viewGroup.getContext()).inflate(C1107c.sku_details_row_header, viewGroup, false), this);
        }
        return new C3352e(LayoutInflater.from(viewGroup.getContext()).inflate(C1107c.sku_details_row, viewGroup, false), this);
    }

    /* renamed from: a */
    public void m17223a(C1115f c1115f, C3352e c3352e) {
        if (c1115f != null) {
            c3352e.f14200n.setText(c1115f.m4613b());
            if (c1115f.m4616e() != 0) {
                this.f14206b.m4619a(c1115f, c3352e);
            }
        }
    }

    /* renamed from: a */
    public void mo929a(int i) {
        C1115f c = this.f14205a.mo931c(i);
        if (c != 0) {
            this.f14206b.m4618a(c);
        }
    }
}
