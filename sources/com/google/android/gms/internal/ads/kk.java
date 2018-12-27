package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class kk implements zzbca {
    /* renamed from: a */
    private int f16520a = null;
    /* renamed from: b */
    private final int f16521b = this.f16522c.mo4215a();
    /* renamed from: c */
    private final /* synthetic */ zzbbu f16522c;

    kk(zzbbu zzbbu) {
        this.f16522c = zzbbu;
    }

    public final boolean hasNext() {
        return this.f16520a < this.f16521b;
    }

    /* renamed from: a */
    public final byte mo1971a() {
        try {
            zzbbu zzbbu = this.f16522c;
            int i = this.f16520a;
            this.f16520a = i + 1;
            return zzbbu.mo4214a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(mo1971a());
    }
}
