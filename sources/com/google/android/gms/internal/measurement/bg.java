package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class bg extends ar<Double> implements cp, zzvs<Double>, RandomAccess {
    /* renamed from: a */
    private static final bg f20505a;
    /* renamed from: b */
    private double[] f20506b;
    /* renamed from: c */
    private int f20507c;

    bg() {
        this(new double[10], 0);
    }

    private bg(double[] dArr, int i) {
        this.f20506b = dArr;
        this.f20507c = i;
    }

    protected final void removeRange(int i, int i2) {
        m22174c();
        if (i2 >= i) {
            System.arraycopy(this.f20506b, i2, this.f20506b, i, this.f20507c - i2);
            this.f20507c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return super.equals(obj);
        }
        bg bgVar = (bg) obj;
        if (this.f20507c != bgVar.f20507c) {
            return false;
        }
        obj = bgVar.f20506b;
        for (int i = 0; i < this.f20507c; i++) {
            if (this.f20506b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20507c; i2++) {
            i = (i * 31) + zzvo.m12067a(Double.doubleToLongBits(this.f20506b[i2]));
        }
        return i;
    }

    public final int size() {
        return this.f20507c;
    }

    /* renamed from: a */
    public final void m27072a(double d) {
        m27068a(this.f20507c, d);
    }

    /* renamed from: a */
    private final void m27068a(int i, double d) {
        m22174c();
        if (i < 0 || i > this.f20507c) {
            throw new IndexOutOfBoundsException(m27070c(i));
        }
        if (this.f20507c < this.f20506b.length) {
            System.arraycopy(this.f20506b, i, this.f20506b, i + 1, this.f20507c - i);
        } else {
            Object obj = new double[(((this.f20507c * 3) / 2) + 1)];
            System.arraycopy(this.f20506b, 0, obj, 0, i);
            System.arraycopy(this.f20506b, i, obj, i + 1, this.f20507c - i);
            this.f20506b = obj;
        }
        this.f20506b[i] = d;
        this.f20507c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        m22174c();
        zzvo.m12069a((Object) collection);
        if (!(collection instanceof bg)) {
            return super.addAll(collection);
        }
        bg bgVar = (bg) collection;
        if (bgVar.f20507c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f20507c >= bgVar.f20507c) {
            int i = this.f20507c + bgVar.f20507c;
            if (i > this.f20506b.length) {
                this.f20506b = Arrays.copyOf(this.f20506b, i);
            }
            System.arraycopy(bgVar.f20506b, 0, this.f20506b, this.f20507c, bgVar.f20507c);
            this.f20507c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m22174c();
        for (int i = 0; i < this.f20507c; i++) {
            if (obj.equals(Double.valueOf(this.f20506b[i]))) {
                System.arraycopy(this.f20506b, i + 1, this.f20506b, i, this.f20507c - i);
                this.f20507c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m27069b(int i) {
        if (i < 0 || i >= this.f20507c) {
            throw new IndexOutOfBoundsException(m27070c(i));
        }
    }

    /* renamed from: c */
    private final String m27070c(int i) {
        int i2 = this.f20507c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m22174c();
        m27069b(i);
        double d = this.f20506b[i];
        this.f20506b[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        m22174c();
        m27069b(i);
        double d = this.f20506b[i];
        if (i < this.f20507c - 1) {
            System.arraycopy(this.f20506b, i + 1, this.f20506b, i, this.f20507c - i);
        }
        this.f20507c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m27068a(i, ((Double) obj).doubleValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= this.f20507c) {
            return new bg(Arrays.copyOf(this.f20506b, i), this.f20507c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m27069b(i);
        return Double.valueOf(this.f20506b[i]);
    }

    static {
        ar bgVar = new bg();
        f20505a = bgVar;
        bgVar.mo2924b();
    }
}
