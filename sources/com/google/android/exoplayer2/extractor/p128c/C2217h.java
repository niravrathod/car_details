package com.google.android.exoplayer2.extractor.p128c;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.p126c.C2175k;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.c.h */
public final class C2217h {
    /* renamed from: a */
    public static UUID m8174a(byte[] bArr) {
        bArr = C2217h.m8175b(bArr);
        if (bArr == null) {
            return null;
        }
        return (UUID) bArr.first;
    }

    /* renamed from: b */
    private static Pair<UUID, byte[]> m8175b(byte[] bArr) {
        C2175k c2175k = new C2175k(bArr);
        if (c2175k.m7978c() < 32) {
            return null;
        }
        c2175k.m7979c(0);
        if (c2175k.m7993n() != c2175k.m7976b() + 4 || c2175k.m7993n() != C2203a.f6851U) {
            return null;
        }
        int a = C2203a.m8129a(c2175k.m7993n());
        if (a > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported pssh version: ");
            stringBuilder.append(a);
            Log.w("PsshAtomUtil", stringBuilder.toString());
            return null;
        }
        UUID uuid = new UUID(c2175k.m7995p(), c2175k.m7995p());
        if (a == 1) {
            c2175k.m7981d(c2175k.m7999t() * 16);
        }
        a = c2175k.m7999t();
        if (a != c2175k.m7976b()) {
            return null;
        }
        Object obj = new byte[a];
        c2175k.m7975a(obj, 0, a);
        return Pair.create(uuid, obj);
    }
}
