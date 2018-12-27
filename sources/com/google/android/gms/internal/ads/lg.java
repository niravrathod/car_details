package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;

final class lg implements ly {
    /* renamed from: a */
    private static final lg f16536a = new lg();

    private lg() {
    }

    /* renamed from: a */
    public static lg m20736a() {
        return f16536a;
    }

    /* renamed from: a */
    public final boolean mo2094a(Class<?> cls) {
        return zzbdd.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final lx mo2095b(Class<?> cls) {
        if (zzbdd.class.isAssignableFrom(cls)) {
            try {
                return (lx) zzbdd.m28346a(cls.asSubclass(zzbdd.class)).mo4959a(zze.f9168c, null, null);
            } catch (Throwable e) {
                String str = "Unable to get message info for ";
                cls = String.valueOf(cls.getName());
                throw new RuntimeException(cls.length() != 0 ? str.concat(cls) : new String(str), e);
            }
        }
        String str2 = "Unsupported message type: ";
        cls = String.valueOf(cls.getName());
        throw new IllegalArgumentException(cls.length() != 0 ? str2.concat(cls) : new String(str2));
    }
}
