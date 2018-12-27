package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class bo extends ar<Float> implements cp, zzvs<Float>, RandomAccess {
    /* renamed from: a */
    private static final bo f20508a;
    /* renamed from: b */
    private float[] f20509b;
    /* renamed from: c */
    private int f20510c;

    bo() {
        this(new float[10], 0);
    }

    private bo(float[] fArr, int i) {
        this.f20509b = fArr;
        this.f20510c = i;
    }

    protected final void removeRange(int i, int i2) {
        m22174c();
        if (i2 >= i) {
            System.arraycopy(this.f20509b, i2, this.f20509b, i, this.f20510c - i2);
            this.f20510c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo)) {
            return super.equals(obj);
        }
        bo boVar = (bo) obj;
        if (this.f20510c != boVar.f20510c) {
            return false;
        }
        obj = boVar.f20509b;
        for (int i = 0; i < this.f20510c; i++) {
            if (this.f20509b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20510c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f20509b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f20510c;
    }

    /* renamed from: a */
    public final void m27077a(float f) {
        m27073a(this.f20510c, f);
    }

    /* renamed from: a */
    private final void m27073a(int i, float f) {
        m22174c();
        if (i < 0 || i > this.f20510c) {
            throw new IndexOutOfBoundsException(m27075c(i));
        }
        if (this.f20510c < this.f20509b.length) {
            System.arraycopy(this.f20509b, i, this.f20509b, i + 1, this.f20510c - i);
        } else {
            Object obj = new float[(((this.f20510c * 3) / 2) + 1)];
            System.arraycopy(this.f20509b, 0, obj, 0, i);
            System.arraycopy(this.f20509b, i, obj, i + 1, this.f20510c - i);
            this.f20509b = obj;
        }
        this.f20509b[i] = f;
        this.f20510c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        m22174c();
        zzvo.m12069a((Object) collection);
        if (!(collection instanceof bo)) {
            return super.addAll(collection);
        }
        bo boVar = (bo) collection;
        if (boVar.f20510c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f20510c >= boVar.f20510c) {
            int i = this.f20510c + boVar.f20510c;
            if (i > this.f20509b.length) {
                this.f20509b = Arrays.copyOf(this.f20509b, i);
            }
            System.arraycopy(boVar.f20509b, 0, this.f20509b, this.f20510c, boVar.f20510c);
            this.f20510c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m22174c();
        for (int i = 0; i < this.f20510c; i++) {
            if (obj.equals(Float.valueOf(this.f20509b[i]))) {
                System.arraycopy(this.f20509b, i + 1, this.f20509b, i, this.f20510c - i);
                this.f20510c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m27074b(int i) {
        if (i < 0 || i >= this.f20510c) {
            throw new IndexOutOfBoundsException(m27075c(i));
        }
    }

    /* renamed from: c */
    private final String m27075c(int i) {
        int i2 = this.f20510c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = ((Float) obj).floatValue();
        m22174c();
        m27074b(i);
        float f = this.f20509b[i];
        this.f20509b[i] = obj;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        m22174c();
        m27074b(i);
        float f = this.f20509b[i];
        if (i < this.f20510c - 1) {
            System.arraycopy(this.f20509b, i + 1, this.f20509b, i, this.f20510c - i);
        }
        this.f20510c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m27073a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzvs mo4339a(int i) {
        if (i >= this.f20510c) {
            return new bo(Arrays.copyOf(this.f20509b, i), this.f20510c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m27074b(i);
        return Float.valueOf(this.f20509b[i]);
    }

    static {
        ar boVar = new bo();
        f20508a = boVar;
        boVar.mo2924b();
    }
}
