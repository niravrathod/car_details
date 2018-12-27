package com.bumptech.glide.p055g;

import android.support.v4.p017f.C0433m;
import android.support.v4.p017f.C3131a;

/* renamed from: com.bumptech.glide.g.b */
public final class C4507b<K, V> extends C3131a<K, V> {
    /* renamed from: i */
    private int f18826i;

    public void clear() {
        this.f18826i = 0;
        super.clear();
    }

    /* renamed from: a */
    public V mo3893a(int i, V v) {
        this.f18826i = 0;
        return super.mo3893a(i, (Object) v);
    }

    public V put(K k, V v) {
        this.f18826i = 0;
        return super.put(k, v);
    }

    /* renamed from: a */
    public void mo3894a(C0433m<? extends K, ? extends V> c0433m) {
        this.f18826i = 0;
        super.mo3894a((C0433m) c0433m);
    }

    /* renamed from: d */
    public V mo3896d(int i) {
        this.f18826i = 0;
        return super.mo3896d(i);
    }

    public int hashCode() {
        if (this.f18826i == 0) {
            this.f18826i = super.hashCode();
        }
        return this.f18826i;
    }
}
