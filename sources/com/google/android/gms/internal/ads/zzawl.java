package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class zzawl implements zzavm {
    /* renamed from: a */
    private static final byte[] f17002a = new byte[0];
    /* renamed from: b */
    private final zzaza f17003b;
    /* renamed from: c */
    private final zzavm f17004c;

    public zzawl(zzaza zzaza, zzavm zzavm) {
        this.f17003b = zzaza;
        this.f17004c = zzavm;
    }

    /* renamed from: a */
    public final byte[] mo1966a(byte[] bArr, byte[] bArr2) {
        byte[] i = zzawb.m10216b(this.f17003b).mo4212i();
        byte[] a = this.f17004c.mo1966a(i, f17002a);
        bArr = ((zzavm) zzawb.m10211a(this.f17003b.m29171a(), i)).mo1966a(bArr, bArr2);
        return ByteBuffer.allocate((a.length + 4) + bArr.length).putInt(a.length).put(a).put(bArr).array();
    }
}
