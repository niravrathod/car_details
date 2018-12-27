package com.google.android.exoplayer2.p126c;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.c.f */
public final class C2168f {
    /* renamed from: a */
    private int f6712a;
    /* renamed from: b */
    private long[] f6713b;

    public C2168f() {
        this(32);
    }

    public C2168f(int i) {
        this.f6713b = new long[i];
    }

    /* renamed from: a */
    public void m7937a(long j) {
        if (this.f6712a == this.f6713b.length) {
            this.f6713b = Arrays.copyOf(this.f6713b, this.f6712a * 2);
        }
        long[] jArr = this.f6713b;
        int i = this.f6712a;
        this.f6712a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public long m7936a(int i) {
        if (i >= 0 && i < this.f6712a) {
            return this.f6713b[i];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid index ");
        stringBuilder.append(i);
        stringBuilder.append(", size is ");
        stringBuilder.append(this.f6712a);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    /* renamed from: a */
    public int m7935a() {
        return this.f6712a;
    }

    /* renamed from: b */
    public long[] m7938b() {
        return Arrays.copyOf(this.f6713b, this.f6712a);
    }
}
