package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class lp extends kf<Long> implements mg, zzbdk<Long>, RandomAccess {
    /* renamed from: a */
    private static final lp f19649a;
    /* renamed from: b */
    private long[] f19650b;
    /* renamed from: c */
    private int f19651c;

    lp() {
        this(new long[10], 0);
    }

    private lp(long[] jArr, int i) {
        this.f19650b = jArr;
        this.f19651c = i;
    }

    protected final void removeRange(int i, int i2) {
        m20595c();
        if (i2 >= i) {
            System.arraycopy(this.f19650b, i2, this.f19650b, i, this.f19651c - i2);
            this.f19651c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return super.equals(obj);
        }
        lp lpVar = (lp) obj;
        if (this.f19651c != lpVar.f19651c) {
            return false;
        }
        obj = lpVar.f19650b;
        for (int i = 0; i < this.f19651c; i++) {
            if (this.f19650b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19651c; i2++) {
            i = (i * 31) + zzbdf.m10326a(this.f19650b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long m26086b(int i) {
        m26082c(i);
        return this.f19650b[i];
    }

    public final int size() {
        return this.f19651c;
    }

    /* renamed from: a */
    public final void m26085a(long j) {
        m26081a(this.f19651c, j);
    }

    /* renamed from: a */
    private final void m26081a(int i, long j) {
        m20595c();
        if (i < 0 || i > this.f19651c) {
            throw new IndexOutOfBoundsException(m26083d(i));
        }
        if (this.f19651c < this.f19650b.length) {
            System.arraycopy(this.f19650b, i, this.f19650b, i + 1, this.f19651c - i);
        } else {
            Object obj = new long[(((this.f19651c * 3) / 2) + 1)];
            System.arraycopy(this.f19650b, 0, obj, 0, i);
            System.arraycopy(this.f19650b, i, obj, i + 1, this.f19651c - i);
            this.f19650b = obj;
        }
        this.f19650b[i] = j;
        this.f19651c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        m20595c();
        zzbdf.m10328a((Object) collection);
        if (!(collection instanceof lp)) {
            return super.addAll(collection);
        }
        lp lpVar = (lp) collection;
        if (lpVar.f19651c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f19651c >= lpVar.f19651c) {
            int i = this.f19651c + lpVar.f19651c;
            if (i > this.f19650b.length) {
                this.f19650b = Arrays.copyOf(this.f19650b, i);
            }
            System.arraycopy(lpVar.f19650b, 0, this.f19650b, this.f19651c, lpVar.f19651c);
            this.f19651c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m20595c();
        for (int i = 0; i < this.f19651c; i++) {
            if (obj.equals(Long.valueOf(this.f19650b[i]))) {
                System.arraycopy(this.f19650b, i + 1, this.f19650b, i, this.f19651c - i);
                this.f19651c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m26082c(int i) {
        if (i < 0 || i >= this.f19651c) {
            throw new IndexOutOfBoundsException(m26083d(i));
        }
    }

    /* renamed from: d */
    private final String m26083d(int i) {
        int i2 = this.f19651c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m20595c();
        m26082c(i);
        long j = this.f19650b[i];
        this.f19650b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        m20595c();
        m26082c(i);
        long j = this.f19650b[i];
        if (i < this.f19651c - 1) {
            System.arraycopy(this.f19650b, i + 1, this.f19650b, i, this.f19651c - i);
        }
        this.f19651c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26081a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= this.f19651c) {
            return new lp(Arrays.copyOf(this.f19650b, i), this.f19651c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m26086b(i));
    }

    static {
        kf lpVar = new lp();
        f19649a = lpVar;
        lpVar.mo1970b();
    }
}
