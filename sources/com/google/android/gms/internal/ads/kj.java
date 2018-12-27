package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class kj extends kf<Boolean> implements mg, zzbdk<Boolean>, RandomAccess {
    /* renamed from: a */
    private static final kj f19637a;
    /* renamed from: b */
    private boolean[] f19638b;
    /* renamed from: c */
    private int f19639c;

    kj() {
        this(new boolean[10], 0);
    }

    private kj(boolean[] zArr, int i) {
        this.f19638b = zArr;
        this.f19639c = i;
    }

    protected final void removeRange(int i, int i2) {
        m20595c();
        if (i2 >= i) {
            System.arraycopy(this.f19638b, i2, this.f19638b, i, this.f19639c - i2);
            this.f19639c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj)) {
            return super.equals(obj);
        }
        kj kjVar = (kj) obj;
        if (this.f19639c != kjVar.f19639c) {
            return false;
        }
        obj = kjVar.f19638b;
        for (int i = 0; i < this.f19639c; i++) {
            if (this.f19638b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19639c; i2++) {
            i = (i * 31) + zzbdf.m10327a(this.f19638b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f19639c;
    }

    /* renamed from: a */
    public final void m26063a(boolean z) {
        m26059a(this.f19639c, z);
    }

    /* renamed from: a */
    private final void m26059a(int i, boolean z) {
        m20595c();
        if (i < 0 || i > this.f19639c) {
            throw new IndexOutOfBoundsException(m26061c(i));
        }
        if (this.f19639c < this.f19638b.length) {
            System.arraycopy(this.f19638b, i, this.f19638b, i + 1, this.f19639c - i);
        } else {
            Object obj = new boolean[(((this.f19639c * 3) / 2) + 1)];
            System.arraycopy(this.f19638b, 0, obj, 0, i);
            System.arraycopy(this.f19638b, i, obj, i + 1, this.f19639c - i);
            this.f19638b = obj;
        }
        this.f19638b[i] = z;
        this.f19639c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        m20595c();
        zzbdf.m10328a((Object) collection);
        if (!(collection instanceof kj)) {
            return super.addAll(collection);
        }
        kj kjVar = (kj) collection;
        if (kjVar.f19639c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f19639c >= kjVar.f19639c) {
            int i = this.f19639c + kjVar.f19639c;
            if (i > this.f19638b.length) {
                this.f19638b = Arrays.copyOf(this.f19638b, i);
            }
            System.arraycopy(kjVar.f19638b, 0, this.f19638b, this.f19639c, kjVar.f19639c);
            this.f19639c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m20595c();
        for (int i = 0; i < this.f19639c; i++) {
            if (obj.equals(Boolean.valueOf(this.f19638b[i]))) {
                System.arraycopy(this.f19638b, i + 1, this.f19638b, i, this.f19639c - i);
                this.f19639c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m26060b(int i) {
        if (i < 0 || i >= this.f19639c) {
            throw new IndexOutOfBoundsException(m26061c(i));
        }
    }

    /* renamed from: c */
    private final String m26061c(int i) {
        int i2 = this.f19639c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = ((Boolean) obj).booleanValue();
        m20595c();
        m26060b(i);
        boolean z = this.f19638b[i];
        this.f19638b[i] = obj;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        m20595c();
        m26060b(i);
        boolean z = this.f19638b[i];
        if (i < this.f19639c - 1) {
            System.arraycopy(this.f19638b, i + 1, this.f19638b, i, this.f19639c - i);
        }
        this.f19639c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26059a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= this.f19639c) {
            return new kj(Arrays.copyOf(this.f19638b, i), this.f19639c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m26060b(i);
        return Boolean.valueOf(this.f19638b[i]);
    }

    static {
        kf kjVar = new kj();
        f19637a = kjVar;
        kjVar.mo1970b();
    }
}
