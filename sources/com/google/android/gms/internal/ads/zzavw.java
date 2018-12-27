package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class zzavw {
    /* renamed from: a */
    private static final CopyOnWriteArrayList<zzavv> f9039a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public static zzavv m10197a(String str) {
        Iterator it = f9039a.iterator();
        while (it.hasNext()) {
            zzavv zzavv = (zzavv) it.next();
            if (zzavv.m10195a(str)) {
                return zzavv;
            }
        }
        String str2 = "No KMS client does support: ";
        str = String.valueOf(str);
        throw new GeneralSecurityException(str.length() != 0 ? str2.concat(str) : new String(str2));
    }
}
