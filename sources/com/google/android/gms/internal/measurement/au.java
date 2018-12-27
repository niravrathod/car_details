package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class au implements zzuj {
    /* renamed from: a */
    private int f17421a = null;
    /* renamed from: b */
    private final int f17422b = this.f17423c.mo4351a();
    /* renamed from: c */
    private final /* synthetic */ zzud f17423c;

    au(zzud zzud) {
        this.f17423c = zzud;
    }

    public final boolean hasNext() {
        return this.f17421a < this.f17422b;
    }

    /* renamed from: a */
    public final byte mo2925a() {
        try {
            zzud zzud = this.f17423c;
            int i = this.f17421a;
            this.f17421a = i + 1;
            return zzud.mo4350a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(mo2925a());
    }
}
