package com.google.android.gms.internal.measurement;

public abstract class zztw<MessageType extends zztw<MessageType, BuilderType>, BuilderType extends zztx<MessageType, BuilderType>> implements zzwt {
    private static boolean zzbts = false;
    protected int zzbtr = 0;

    /* renamed from: c */
    public final zzud mo4348c() {
        try {
            ay b = zzud.m12011b(mo4836f());
            mo4834a(b.m11498b());
            return b.m11497a();
        } catch (Throwable e) {
            String str = "ByteString";
            String name = getClass().getName();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 62) + String.valueOf(str).length());
            stringBuilder.append("Serializing ");
            stringBuilder.append(name);
            stringBuilder.append(" to a ");
            stringBuilder.append(str);
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* renamed from: d */
    int mo4835d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    void mo4833a(int i) {
        throw new UnsupportedOperationException();
    }
}
