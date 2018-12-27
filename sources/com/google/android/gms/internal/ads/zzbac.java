package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class zzbac implements zzavs {
    /* renamed from: a */
    private static final byte[] f17064a = new byte[0];
    /* renamed from: b */
    private final zzbae f17065b;
    /* renamed from: c */
    private final String f17066c;
    /* renamed from: d */
    private final byte[] f17067d;
    /* renamed from: e */
    private final zzbaj f17068e;
    /* renamed from: f */
    private final zzbaa f17069f;

    public zzbac(ECPublicKey eCPublicKey, byte[] bArr, String str, zzbaj zzbaj, zzbaa zzbaa) {
        zzbag.m10239a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f17065b = new zzbae(eCPublicKey);
        this.f17067d = bArr;
        this.f17066c = str;
        this.f17068e = zzbaj;
        this.f17069f = zzbaa;
    }

    /* renamed from: a */
    public final byte[] mo1962a(byte[] bArr, byte[] bArr2) {
        bArr2 = this.f17065b.m10231a(this.f17066c, this.f17067d, bArr2, this.f17069f.mo1963a(), this.f17068e);
        bArr = this.f17069f.mo1964a(bArr2.m10233b()).mo1966a(bArr, f17064a);
        bArr2 = bArr2.m10232a();
        return ByteBuffer.allocate(bArr2.length + bArr.length).put(bArr2).put(bArr).array();
    }
}
