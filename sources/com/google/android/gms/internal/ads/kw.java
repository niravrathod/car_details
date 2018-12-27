package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class kw extends kf<Double> implements mg, zzbdk<Double>, RandomAccess {
    /* renamed from: a */
    private static final kw f19640a;
    /* renamed from: b */
    private double[] f19641b;
    /* renamed from: c */
    private int f19642c;

    kw() {
        this(new double[10], 0);
    }

    private kw(double[] dArr, int i) {
        this.f19641b = dArr;
        this.f19642c = i;
    }

    protected final void removeRange(int i, int i2) {
        m20595c();
        if (i2 >= i) {
            System.arraycopy(this.f19641b, i2, this.f19641b, i, this.f19642c - i2);
            this.f19642c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return super.equals(obj);
        }
        kw kwVar = (kw) obj;
        if (this.f19642c != kwVar.f19642c) {
            return false;
        }
        obj = kwVar.f19641b;
        for (int i = 0; i < this.f19642c; i++) {
            if (this.f19641b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19642c; i2++) {
            i = (i * 31) + zzbdf.m10326a(Double.doubleToLongBits(this.f19641b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f19642c;
    }

    /* renamed from: a */
    public final void m26068a(double d) {
        m26064a(this.f19642c, d);
    }

    /* renamed from: a */
    private final void m26064a(int i, double d) {
        m20595c();
        if (i < 0 || i > this.f19642c) {
            throw new IndexOutOfBoundsException(m26066c(i));
        }
        if (this.f19642c < this.f19641b.length) {
            System.arraycopy(this.f19641b, i, this.f19641b, i + 1, this.f19642c - i);
        } else {
            Object obj = new double[(((this.f19642c * 3) / 2) + 1)];
            System.arraycopy(this.f19641b, 0, obj, 0, i);
            System.arraycopy(this.f19641b, i, obj, i + 1, this.f19642c - i);
            this.f19641b = obj;
        }
        this.f19641b[i] = d;
        this.f19642c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        m20595c();
        zzbdf.m10328a((Object) collection);
        if (!(collection instanceof kw)) {
            return super.addAll(collection);
        }
        kw kwVar = (kw) collection;
        if (kwVar.f19642c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f19642c >= kwVar.f19642c) {
            int i = this.f19642c + kwVar.f19642c;
            if (i > this.f19641b.length) {
                this.f19641b = Arrays.copyOf(this.f19641b, i);
            }
            System.arraycopy(kwVar.f19641b, 0, this.f19641b, this.f19642c, kwVar.f19642c);
            this.f19642c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m20595c();
        for (int i = 0; i < this.f19642c; i++) {
            if (obj.equals(Double.valueOf(this.f19641b[i]))) {
                System.arraycopy(this.f19641b, i + 1, this.f19641b, i, this.f19642c - i);
                this.f19642c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m26065b(int i) {
        if (i < 0 || i >= this.f19642c) {
            throw new IndexOutOfBoundsException(m26066c(i));
        }
    }

    /* renamed from: c */
    private final String m26066c(int i) {
        int i2 = this.f19642c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m20595c();
        m26065b(i);
        double d = this.f19641b[i];
        this.f19641b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        m20595c();
        m26065b(i);
        double d = this.f19641b[i];
        if (i < this.f19642c - 1) {
            System.arraycopy(this.f19641b, i + 1, this.f19641b, i, this.f19642c - i);
        }
        this.f19642c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26064a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= this.f19642c) {
            return new kw(Arrays.copyOf(this.f19641b, i), this.f19642c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m26065b(i);
        return Double.valueOf(this.f19641b[i]);
    }

    static {
        kf kwVar = new kw();
        f19640a = kwVar;
        kwVar.mo1970b();
    }
}
