package com.google.android.gms.internal.ads;

public abstract class zzbbl<MessageType extends zzbbl<MessageType, BuilderType>, BuilderType extends zzbbm<MessageType, BuilderType>> implements zzbel {
    private static boolean zzdsu = false;
    protected int zzdst = 0;

    /* renamed from: h */
    public final zzbbu mo4211h() {
        try {
            ko b = zzbbu.m10264b(mo4810l());
            mo4808a(b.m8976b());
            return b.m8975a();
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

    /* renamed from: i */
    public final byte[] mo4212i() {
        try {
            byte[] bArr = new byte[mo4810l()];
            zzbck a = zzbck.m21513a(bArr);
            mo4808a(a);
            a.m21590c();
            return bArr;
        } catch (Throwable e) {
            String str = "byte array";
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

    /* renamed from: j */
    int mo4809j() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    void mo4807a(int i) {
        throw new UnsupportedOperationException();
    }
}
