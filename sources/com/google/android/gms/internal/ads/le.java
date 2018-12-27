package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class le extends kf<Float> implements mg, zzbdk<Float>, RandomAccess {
    /* renamed from: a */
    private static final le f19643a;
    /* renamed from: b */
    private float[] f19644b;
    /* renamed from: c */
    private int f19645c;

    le() {
        this(new float[10], 0);
    }

    private le(float[] fArr, int i) {
        this.f19644b = fArr;
        this.f19645c = i;
    }

    protected final void removeRange(int i, int i2) {
        m20595c();
        if (i2 >= i) {
            System.arraycopy(this.f19644b, i2, this.f19644b, i, this.f19645c - i2);
            this.f19645c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le)) {
            return super.equals(obj);
        }
        le leVar = (le) obj;
        if (this.f19645c != leVar.f19645c) {
            return false;
        }
        obj = leVar.f19644b;
        for (int i = 0; i < this.f19645c; i++) {
            if (this.f19644b[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19645c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f19644b[i2]);
        }
        return i;
    }

    public final int size() {
        return this.f19645c;
    }

    /* renamed from: a */
    public final void m26073a(float f) {
        m26069a(this.f19645c, f);
    }

    /* renamed from: a */
    private final void m26069a(int i, float f) {
        m20595c();
        if (i < 0 || i > this.f19645c) {
            throw new IndexOutOfBoundsException(m26071c(i));
        }
        if (this.f19645c < this.f19644b.length) {
            System.arraycopy(this.f19644b, i, this.f19644b, i + 1, this.f19645c - i);
        } else {
            Object obj = new float[(((this.f19645c * 3) / 2) + 1)];
            System.arraycopy(this.f19644b, 0, obj, 0, i);
            System.arraycopy(this.f19644b, i, obj, i + 1, this.f19645c - i);
            this.f19644b = obj;
        }
        this.f19644b[i] = f;
        this.f19645c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        m20595c();
        zzbdf.m10328a((Object) collection);
        if (!(collection instanceof le)) {
            return super.addAll(collection);
        }
        le leVar = (le) collection;
        if (leVar.f19645c == 0) {
            return false;
        }
        if (BaseClientBuilder.API_PRIORITY_OTHER - this.f19645c >= leVar.f19645c) {
            int i = this.f19645c + leVar.f19645c;
            if (i > this.f19644b.length) {
                this.f19644b = Arrays.copyOf(this.f19644b, i);
            }
            System.arraycopy(leVar.f19644b, 0, this.f19644b, this.f19645c, leVar.f19645c);
            this.f19645c = i;
            this.modCount += 1;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        m20595c();
        for (int i = 0; i < this.f19645c; i++) {
            if (obj.equals(Float.valueOf(this.f19644b[i]))) {
                System.arraycopy(this.f19644b, i + 1, this.f19644b, i, this.f19645c - i);
                this.f19645c -= 1;
                this.modCount += 1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m26070b(int i) {
        if (i < 0 || i >= this.f19645c) {
            throw new IndexOutOfBoundsException(m26071c(i));
        }
    }

    /* renamed from: c */
    private final String m26071c(int i) {
        int i2 = this.f19645c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = ((Float) obj).floatValue();
        m20595c();
        m26070b(i);
        float f = this.f19644b[i];
        this.f19644b[i] = obj;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        m20595c();
        m26070b(i);
        float f = this.f19644b[i];
        if (i < this.f19645c - 1) {
            System.arraycopy(this.f19644b, i + 1, this.f19644b, i, this.f19645c - i);
        }
        this.f19645c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        m26069a(i, ((Float) obj).floatValue());
    }

    /* renamed from: a */
    public final /* synthetic */ zzbdk mo4159a(int i) {
        if (i >= this.f19645c) {
            return new le(Arrays.copyOf(this.f19644b, i), this.f19645c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m26070b(i);
        return Float.valueOf(this.f19644b[i]);
    }

    static {
        kf leVar = new le();
        f19643a = leVar;
        leVar.mo1970b();
    }
}
