package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class br extends ar<Integer> implements cp, zzvs<Integer>, RandomAccess {
    /* renamed from: a */
    private static final br f20511a;
    /* renamed from: b */
    private int[] f20512b;
    /* renamed from: c */
    private int f20513c;

    br() {
        this(new int[10], 0);
    }

    private br(int[] iArr, int i) {
        this.f20512b = iArr;
        this.f20513c = i;
    }

    protected final void removeRange(int i, int i2) {
        m22174c();
        if (i2 >= i) {
            System.arraycopy(this.f20512b, i2, this.f20512b, i, this.f20513c - i2);
            this.f20513c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br)) {
            return super.equals(obj);
        }
        br brVar = (br) obj;
        if (this.f20513c != brVar.f20513c) {
            return false;
        }
        obj = brVar.f20512b;
        for (int i = 0; i < this.f20513c; i++) {
            if (this.f20512b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20513c; i2++) {
            i = (i * 31) + this.f20512b[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final int m27082b(int i) {
        m27079d(i);
        return this.f20512b[i];
    }

    public final int size() {
        return this.f20513c;
    }

    /* renamed from: c */
    public final void m27083c(int i) {
        m27078a(this.f20513c, i);
    }

    /* renamed from: a */
    private final void m27078a(int i, int i2) {
        m22174c();
        if (i < 0 || i > this.f20513c) {
            throw new IndexOutOfBoundsException(m27080e(i));
        }
        if (this.f20513c < this.f20512b.length) {
            System.arraycopy(this.f20512b, i, this.f20512b, i + 1, this.f20513c - i);
        } else {
            Object obj = new int[(((this.f20513c * 3) / 2) + 1)];
            System.arraycopy(this.f20512b, 0, obj, 0, i);
            System.arraycopy(this.f20512b, i, obj, i + 1, this.f20513c - i);
            this.f20512b = obj;
        }
        this.f20512b[i] = i2;
        this.f20513c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        m22174c();
        zzvo.m12069a((Object) collection);
        if (!(collection instanceof br)) {
            return super.addAll(collection);
        }
        br brVar = (br) collection;
        if (brVar.f20513c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f20513c >= brVar.f20513c) {
            int i = this.f20513c + brVar.f20513c;
            if (i > this.f20512b.length) {
                this.f20512b = Arrays.copyOf(this.f20512b, i);
            }
            System.arraycopy(brVar.f20512b, 0, this.f20512b, this.f20513c, brVar.f20513c);
            this.f20513c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m22174c();
        for (int i = 0; i < this.f20513c; i++) {
            if (obj.equals(Integer.valueOf(this.f20512b[i]))) {
                System.arraycopy(this.f20512b, i + 1, this.f20512b, i, this.f20513c - i);
                this.f20513c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final void m27079d(int i) {
        if (i < 0 || i >= this.f20513c) {
            throw new IndexOutOfBoundsException(m27080e(i));
        }
    }

    /* renamed from: e */
    private final String m27080e(int i) {
        int i2 = this.f20513c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = ((Integer) obj).intValue();
        m22174c();
        m27079d(i);
        int i2 = this.f20512b[i];
        this.f20512b[i] = obj;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        m22174c();
        m27079d(i);
        int i2 = this.f20512b[i];
        if (i < this.f20513c - 1) {
            System.arraycopy(this.f20512b, i + 1, this.f20512b, i, this.f20513c - i);
        }
        this.f20513c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m27078a(i, ((Integer) obj).intValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= this.f20513c) {
            return new br(Arrays.copyOf(this.f20512b, i), this.f20513c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m27082b(i));
    }

    static {
        ar brVar = new br();
        f20511a = brVar;
        brVar.mo2924b();
    }
}
