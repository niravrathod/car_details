package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class bz extends ar<Long> implements cp, zzvs<Long>, RandomAccess {
    /* renamed from: a */
    private static final bz f20514a;
    /* renamed from: b */
    private long[] f20515b;
    /* renamed from: c */
    private int f20516c;

    bz() {
        this(new long[10], 0);
    }

    private bz(long[] jArr, int i) {
        this.f20515b = jArr;
        this.f20516c = i;
    }

    protected final void removeRange(int i, int i2) {
        m22174c();
        if (i2 >= i) {
            System.arraycopy(this.f20515b, i2, this.f20515b, i, this.f20516c - i2);
            this.f20516c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return super.equals(obj);
        }
        bz bzVar = (bz) obj;
        if (this.f20516c != bzVar.f20516c) {
            return false;
        }
        obj = bzVar.f20515b;
        for (int i = 0; i < this.f20516c; i++) {
            if (this.f20515b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20516c; i2++) {
            i = (i * 31) + zzvo.m12067a(this.f20515b[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final long m27089b(int i) {
        m27085c(i);
        return this.f20515b[i];
    }

    public final int size() {
        return this.f20516c;
    }

    /* renamed from: a */
    public final void m27088a(long j) {
        m27084a(this.f20516c, j);
    }

    /* renamed from: a */
    private final void m27084a(int i, long j) {
        m22174c();
        if (i < 0 || i > this.f20516c) {
            throw new IndexOutOfBoundsException(m27086d(i));
        }
        if (this.f20516c < this.f20515b.length) {
            System.arraycopy(this.f20515b, i, this.f20515b, i + 1, this.f20516c - i);
        } else {
            Object obj = new long[(((this.f20516c * 3) / 2) + 1)];
            System.arraycopy(this.f20515b, 0, obj, 0, i);
            System.arraycopy(this.f20515b, i, obj, i + 1, this.f20516c - i);
            this.f20515b = obj;
        }
        this.f20515b[i] = j;
        this.f20516c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        m22174c();
        zzvo.m12069a((Object) collection);
        if (!(collection instanceof bz)) {
            return super.addAll(collection);
        }
        bz bzVar = (bz) collection;
        if (bzVar.f20516c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f20516c >= bzVar.f20516c) {
            int i = this.f20516c + bzVar.f20516c;
            if (i > this.f20515b.length) {
                this.f20515b = Arrays.copyOf(this.f20515b, i);
            }
            System.arraycopy(bzVar.f20515b, 0, this.f20515b, this.f20516c, bzVar.f20516c);
            this.f20516c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m22174c();
        for (int i = 0; i < this.f20516c; i++) {
            if (obj.equals(Long.valueOf(this.f20515b[i]))) {
                System.arraycopy(this.f20515b, i + 1, this.f20515b, i, this.f20516c - i);
                this.f20516c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m27085c(int i) {
        if (i < 0 || i >= this.f20516c) {
            throw new IndexOutOfBoundsException(m27086d(i));
        }
    }

    /* renamed from: d */
    private final String m27086d(int i) {
        int i2 = this.f20516c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m22174c();
        m27085c(i);
        long j = this.f20515b[i];
        this.f20515b[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ Object remove(int i) {
        m22174c();
        m27085c(i);
        long j = this.f20515b[i];
        if (i < this.f20516c - 1) {
            System.arraycopy(this.f20515b, i + 1, this.f20515b, i, this.f20516c - i);
        }
        this.f20516c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m27084a(i, ((Long) obj).longValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= this.f20516c) {
            return new bz(Arrays.copyOf(this.f20515b, i), this.f20516c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m27089b(i));
    }

    static {
        ar bzVar = new bz();
        f20514a = bzVar;
        bzVar.mo2924b();
    }
}
