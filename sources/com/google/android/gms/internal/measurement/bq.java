package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zze;

final class bq implements ci {
    /* renamed from: a */
    private static final bq f17441a = new bq();

    private bq() {
    }

    /* renamed from: a */
    public static bq m22316a() {
        return f17441a;
    }

    /* renamed from: a */
    public final boolean mo3048a(Class<?> cls) {
        return zzvm.class.isAssignableFrom(cls);
    }

    /* renamed from: b */
    public final ch mo3049b(Class<?> cls) {
        if (zzvm.class.isAssignableFrom(cls)) {
            try {
                return (ch) zzvm.m28421a(cls.asSubclass(zzvm.class)).mo4960a(zze.f10269c, null, null);
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
