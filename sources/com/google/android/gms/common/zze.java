package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;

abstract class zze extends zzj {
    private int zzt;

    protected zze(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zzt = Arrays.hashCode(bArr);
    }

    abstract byte[] getBytes();

    public int hashCode() {
        return this.zzt;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof zzi) {
                try {
                    zzi zzi = (zzi) obj;
                    if (zzi.zzc() != hashCode()) {
                        return false;
                    }
                    IObjectWrapper zzb = zzi.zzb();
                    if (zzb == null) {
                        return false;
                    }
                    return Arrays.equals(getBytes(), (byte[]) ObjectWrapper.m26020a(zzb));
                } catch (Object obj2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", obj2);
                    return false;
                }
            }
        }
        return false;
    }

    public final IObjectWrapper zzb() {
        return ObjectWrapper.m26019a(getBytes());
    }

    public final int zzc() {
        return hashCode();
    }

    protected static byte[] zza(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (String str2) {
            throw new AssertionError(str2);
        }
    }
}
