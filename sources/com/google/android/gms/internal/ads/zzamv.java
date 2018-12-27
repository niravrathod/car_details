package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzamv {
    /* renamed from: a */
    private final String[] f8904a;
    /* renamed from: b */
    private final double[] f8905b;
    /* renamed from: c */
    private final double[] f8906c;
    /* renamed from: d */
    private final int[] f8907d;
    /* renamed from: e */
    private int f8908e;

    private zzamv(zzamy zzamy) {
        int size = zzamy.f8915b.size();
        this.f8904a = (String[]) zzamy.f8914a.toArray(new String[size]);
        this.f8905b = m9909a(zzamy.f8915b);
        this.f8906c = m9909a(zzamy.f8916c);
        this.f8907d = new int[size];
        this.f8908e = null;
    }

    /* renamed from: a */
    private static double[] m9909a(List<Double> list) {
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    /* renamed from: a */
    public final void m9911a(double d) {
        this.f8908e++;
        int i = 0;
        while (i < this.f8906c.length) {
            if (this.f8906c[i] <= d && d < this.f8905b[i]) {
                int[] iArr = this.f8907d;
                iArr[i] = iArr[i] + 1;
            }
            if (d >= this.f8906c[i]) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final List<zzamx> m9910a() {
        List<zzamx> arrayList = new ArrayList(this.f8904a.length);
        for (int i = 0; i < this.f8904a.length; i++) {
            String str = this.f8904a[i];
            double d = this.f8906c[i];
            double d2 = this.f8905b[i];
            double d3 = (double) this.f8907d[i];
            double d4 = (double) this.f8908e;
            Double.isNaN(d3);
            Double.isNaN(d4);
            arrayList.add(new zzamx(str, d, d2, d3 / d4, this.f8907d[i]));
        }
        return arrayList;
    }
}
