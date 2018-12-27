package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class lh extends kf<Integer> implements mg, zzbdk<Integer>, RandomAccess {
    /* renamed from: a */
    private static final lh f19646a;
    /* renamed from: b */
    private int[] f19647b;
    /* renamed from: c */
    private int f19648c;

    /* renamed from: d */
    public static lh m26075d() {
        return f19646a;
    }

    lh() {
        this(new int[10], 0);
    }

    private lh(int[] iArr, int i) {
        this.f19647b = iArr;
        this.f19648c = i;
    }

    protected final void removeRange(int i, int i2) {
        m20595c();
        if (i2 >= i) {
            System.arraycopy(this.f19647b, i2, this.f19647b, i, this.f19648c - i2);
            this.f19648c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh)) {
            return super.equals(obj);
        }
        lh lhVar = (lh) obj;
        if (this.f19648c != lhVar.f19648c) {
            return false;
        }
        obj = lhVar.f19647b;
        for (int i = 0; i < this.f19648c; i++) {
            if (this.f19647b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19648c; i2++) {
            i = (i * 31) + this.f19647b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int m26079b(int i) {
        m26076d(i);
        return this.f19647b[i];
    }

    public final int size() {
        return this.f19648c;
    }

    /* renamed from: c */
    public final void m26080c(int i) {
        m26074a(this.f19648c, i);
    }

    /* renamed from: a */
    private final void m26074a(int i, int i2) {
        m20595c();
        if (i < 0 || i > this.f19648c) {
            throw new IndexOutOfBoundsException(m26077e(i));
        }
        if (this.f19648c < this.f19647b.length) {
            System.arraycopy(this.f19647b, i, this.f19647b, i + 1, this.f19648c - i);
        } else {
            Object obj = new int[(((this.f19648c * 3) / 2) + 1)];
            System.arraycopy(this.f19647b, 0, obj, 0, i);
            System.arraycopy(this.f19647b, i, obj, i + 1, this.f19648c - i);
            this.f19647b = obj;
        }
        this.f19647b[i] = i2;
        this.f19648c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        m20595c();
        zzbdf.m10328a((Object) collection);
        if (!(collection instanceof lh)) {
            return super.addAll(collection);
        }
        lh lhVar = (lh) collection;
        if (lhVar.f19648c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f19648c >= lhVar.f19648c) {
            int i = this.f19648c + lhVar.f19648c;
            if (i > this.f19647b.length) {
                this.f19647b = Arrays.copyOf(this.f19647b, i);
            }
            System.arraycopy(lhVar.f19647b, 0, this.f19647b, this.f19648c, lhVar.f19648c);
            this.f19648c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m20595c();
        for (int i = 0; i < this.f19648c; i++) {
            if (obj.equals(Integer.valueOf(this.f19647b[i]))) {
                System.arraycopy(this.f19647b, i + 1, this.f19647b, i, this.f19648c - i);
                this.f19648c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m26076d(int i) {
        if (i < 0 || i >= this.f19648c) {
            throw new IndexOutOfBoundsException(m26077e(i));
        }
    }

    /* renamed from: e */
    private final String m26077e(int i) {
        int i2 = this.f19648c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = ((Integer) obj).intValue();
        m20595c();
        m26076d(i);
        int i2 = this.f19647b[i];
        this.f19647b[i] = obj;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        m20595c();
        m26076d(i);
        int i2 = this.f19647b[i];
        if (i < this.f19648c - 1) {
            System.arraycopy(this.f19647b, i + 1, this.f19647b, i, this.f19648c - i);
        }
        this.f19648c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26074a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= this.f19648c) {
            return new lh(Arrays.copyOf(this.f19647b, i), this.f19648c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m26079b(i));
    }

    static {
        kf lhVar = new lh();
        f19646a = lhVar;
        lhVar.mo1970b();
    }
}
