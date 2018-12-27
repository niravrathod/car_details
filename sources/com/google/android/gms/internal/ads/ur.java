package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzo;
import java.util.Arrays;

@zzaer
final class ur {
    /* renamed from: a */
    private final Object[] f8408a;

    ur(zzjk zzjk, String str, int i) {
        this.f8408a = zzo.zza((String) zzkd.m10713e().m10897a(zznw.aD), zzjk, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ur)) {
            return null;
        }
        return Arrays.equals(this.f8408a, ((ur) obj).f8408a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8408a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f8408a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 24);
        stringBuilder.append("[InterstitialAdPoolKey ");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
