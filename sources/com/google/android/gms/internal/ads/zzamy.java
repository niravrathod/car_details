package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzamy {
    /* renamed from: a */
    private final List<String> f8914a = new ArrayList();
    /* renamed from: b */
    private final List<Double> f8915b = new ArrayList();
    /* renamed from: c */
    private final List<Double> f8916c = new ArrayList();

    /* renamed from: a */
    public final zzamy m9916a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f8914a.size()) {
            double doubleValue = ((Double) this.f8916c.get(i)).doubleValue();
            double doubleValue2 = ((Double) this.f8915b.get(i)).doubleValue();
            if (d < doubleValue || (doubleValue == d && d2 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f8914a.add(i, str);
        this.f8916c.add(i, Double.valueOf(d));
        this.f8915b.add(i, Double.valueOf(d2));
        return this;
    }

    /* renamed from: a */
    public final zzamv m9915a() {
        return new zzamv();
    }
}
