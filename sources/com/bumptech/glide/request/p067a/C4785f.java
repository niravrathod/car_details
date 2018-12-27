package com.bumptech.glide.request.p067a;

import com.bumptech.glide.p055g.C1180j;

@Deprecated
/* renamed from: com.bumptech.glide.request.a.f */
public abstract class C4785f<Z> extends C4527a<Z> {
    /* renamed from: a */
    private final int f20907a;
    /* renamed from: b */
    private final int f20908b;

    /* renamed from: b */
    public void mo4623b(C1304g c1304g) {
    }

    public C4785f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C4785f(int i, int i2) {
        this.f20907a = i;
        this.f20908b = i2;
    }

    /* renamed from: a */
    public final void mo4622a(C1304g c1304g) {
        if (C1180j.m4897a(this.f20907a, this.f20908b)) {
            c1304g.mo1074a(this.f20907a, this.f20908b);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(this.f20907a);
        stringBuilder.append(" and height: ");
        stringBuilder.append(this.f20908b);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
