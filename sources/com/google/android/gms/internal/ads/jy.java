package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

abstract class jy implements zzavm {
    /* renamed from: a */
    private final byte[] f16515a;
    /* renamed from: b */
    private final jx f16516b;
    /* renamed from: c */
    private final jx f16517c;

    jy(byte[] bArr) {
        this.f16515a = (byte[]) bArr.clone();
        this.f16516b = mo4210a(bArr, 1);
        this.f16517c = mo4210a(bArr, 0);
    }

    /* renamed from: a */
    abstract jx mo4210a(byte[] bArr, int i);

    /* renamed from: a */
    public byte[] mo1966a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.f16516b.mo4157a();
        if (length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate((bArr.length + this.f16516b.mo4157a()) + 16);
            if (allocate.remaining() >= (bArr.length + this.f16516b.mo4157a()) + 16) {
                int position = allocate.position();
                this.f16516b.m20585a(allocate, bArr);
                allocate.position(position);
                bArr = new byte[this.f16516b.mo4157a()];
                allocate.get(bArr);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr3 = new byte[32];
                this.f16517c.mo4158a(bArr, 0).get(bArr3);
                bArr = bArr2.length % 16 == null ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                i = (i == 0 ? remaining : (remaining + 16) - i) + bArr;
                ByteBuffer order = ByteBuffer.allocate(i + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(bArr);
                order.put(allocate);
                order.position(i);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                bArr = jv.m8952a(bArr3, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(bArr);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
