package com.google.android.exoplayer2.extractor.p130e;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2252b;
import com.google.android.exoplayer2.extractor.p130e.C2255v.C2253c;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.e */
public final class C3995e implements C2253c {
    /* renamed from: a */
    private final int f16012a;
    /* renamed from: b */
    private final List<Format> f16013b;

    public C3995e() {
        this(0);
    }

    public C3995e(int i) {
        this(i, Collections.emptyList());
    }

    public C3995e(int i, List<Format> list) {
        this.f16012a = i;
        if (m19979a(32) == 0 && list.isEmpty() != 0) {
            list = Collections.singletonList(Format.m7744a(null, "application/cea-608", null, -1, 0, null, null));
        }
        this.f16013b = list;
    }

    /* renamed from: a */
    public SparseArray<C2255v> mo1613a() {
        return new SparseArray();
    }

    /* renamed from: a */
    public C2255v mo1614a(int i, C2252b c2252b) {
        C2255v c2255v = null;
        switch (i) {
            case 2:
                return new C4003o(new C3998i());
            case 3:
            case 4:
                return new C4003o(new C4002m(c2252b.f7154b));
            case 15:
                if (m19979a(2) == 0) {
                    c2255v = new C4003o(new C3994d(false, c2252b.f7154b));
                }
                return c2255v;
            case 21:
                return new C4003o(new C4001l());
            case 27:
                if (m19979a(4) == 0) {
                    c2255v = new C4003o(new C3999j(m19978a(c2252b), m19979a(1), m19979a(8)));
                }
                return c2255v;
            case 36:
                return new C4003o(new C4000k(m19978a(c2252b)));
            case 89:
                return new C4003o(new C3997g(c2252b.f7155c));
            case 129:
            case 135:
                return new C4003o(new C3991b(c2252b.f7154b));
            case 130:
            case 138:
                return new C4003o(new C3996f(c2252b.f7154b));
            case 134:
                if (m19979a(16) == 0) {
                    c2255v = new C4006r(new C4007t());
                }
                return c2255v;
            default:
                return null;
        }
    }

    /* renamed from: a */
    private C2250s m19978a(C2252b c2252b) {
        if (m19979a(32)) {
            return new C2250s(this.f16013b);
        }
        C2175k c2175k = new C2175k(c2252b.f7156d);
        c2252b = this.f16013b;
        while (c2175k.m7976b() > 0) {
            int d = c2175k.m7980d() + c2175k.m7986g();
            if (c2175k.m7986g() == 134) {
                c2252b = new ArrayList();
                int g = c2175k.m7986g() & 31;
                for (int i = 0; i < g; i++) {
                    int i2;
                    String str;
                    String e = c2175k.m7983e(3);
                    int g2 = c2175k.m7986g();
                    if (((g2 & 128) != 0 ? 1 : null) != null) {
                        i2 = g2 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    c2252b.add(Format.m7742a(null, str, null, -1, 0, e, i2, null));
                    c2175k.m7981d(2);
                }
            }
            c2175k.m7979c(d);
        }
        return new C2250s(c2252b);
    }

    /* renamed from: a */
    private boolean m19979a(int i) {
        return (i & this.f16012a) != 0;
    }
}
