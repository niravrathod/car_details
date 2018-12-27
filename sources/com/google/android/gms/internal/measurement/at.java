package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class at extends ar<Boolean> implements cp, zzvs<Boolean>, RandomAccess {
    /* renamed from: a */
    private static final at f20502a;
    /* renamed from: b */
    private boolean[] f20503b;
    /* renamed from: c */
    private int f20504c;

    at() {
        this(new boolean[10], 0);
    }

    private at(boolean[] zArr, int i) {
        this.f20503b = zArr;
        this.f20504c = i;
    }

    protected final void removeRange(int i, int i2) {
        m22174c();
        if (i2 >= i) {
            System.arraycopy(this.f20503b, i2, this.f20503b, i, this.f20504c - i2);
            this.f20504c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return super.equals(obj);
        }
        at atVar = (at) obj;
        if (this.f20504c != atVar.f20504c) {
            return false;
        }
        obj = atVar.f20503b;
        for (int i = 0; i < this.f20504c; i++) {
            if (this.f20503b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20504c; i2++) {
            i = (i * 31) + zzvo.m12068a(this.f20503b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f20504c;
    }

    /* renamed from: a */
    public final void m27067a(boolean z) {
        m27063a(this.f20504c, z);
    }

    /* renamed from: a */
    private final void m27063a(int i, boolean z) {
        m22174c();
        if (i < 0 || i > this.f20504c) {
            throw new IndexOutOfBoundsException(m27065c(i));
        }
        if (this.f20504c < this.f20503b.length) {
            System.arraycopy(this.f20503b, i, this.f20503b, i + 1, this.f20504c - i);
        } else {
            Object obj = new boolean[(((this.f20504c * 3) / 2) + 1)];
            System.arraycopy(this.f20503b, 0, obj, 0, i);
            System.arraycopy(this.f20503b, i, obj, i + 1, this.f20504c - i);
            this.f20503b = obj;
        }
        this.f20503b[i] = z;
        this.f20504c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        m22174c();
        zzvo.m12069a((Object) collection);
        if (!(collection instanceof at)) {
            return super.addAll(collection);
        }
        at atVar = (at) collection;
        if (atVar.f20504c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f20504c >= atVar.f20504c) {
            int i = this.f20504c + atVar.f20504c;
            if (i > this.f20503b.length) {
                this.f20503b = Arrays.copyOf(this.f20503b, i);
            }
            System.arraycopy(atVar.f20503b, 0, this.f20503b, this.f20504c, atVar.f20504c);
            this.f20504c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m22174c();
        for (int i = 0; i < this.f20504c; i++) {
            if (obj.equals(Boolean.valueOf(this.f20503b[i]))) {
                System.arraycopy(this.f20503b, i + 1, this.f20503b, i, this.f20504c - i);
                this.f20504c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m27064b(int i) {
        if (i < 0 || i >= this.f20504c) {
            throw new IndexOutOfBoundsException(m27065c(i));
        }
    }

    /* renamed from: c */
    private final String m27065c(int i) {
        int i2 = this.f20504c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = ((Boolean) obj).booleanValue();
        m22174c();
        m27064b(i);
        boolean z = this.f20503b[i];
        this.f20503b[i] = obj;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Object remove(int i) {
        m22174c();
        m27064b(i);
        boolean z = this.f20503b[i];
        if (i < this.f20504c - 1) {
            System.arraycopy(this.f20503b, i + 1, this.f20503b, i, this.f20504c - i);
        }
        this.f20504c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m27063a(i, ((Boolean) obj).booleanValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= this.f20504c) {
            return new at(Arrays.copyOf(this.f20503b, i), this.f20504c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m27064b(i);
        return Boolean.valueOf(this.f20503b[i]);
    }

    static {
        ar atVar = new at();
        f20502a = atVar;
        atVar.mo2924b();
    }
}
