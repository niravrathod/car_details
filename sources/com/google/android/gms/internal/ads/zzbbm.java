package com.google.android.gms.internal.ads;

public abstract class zzbbm<MessageType extends zzbbl<MessageType, BuilderType>, BuilderType extends zzbbm<MessageType, BuilderType>> implements zzbem {
    /* renamed from: a */
    public abstract BuilderType mo4800a();

    /* renamed from: a */
    protected abstract BuilderType mo4801a(MessageType messageType);

    public /* synthetic */ Object clone() {
        return mo4800a();
    }

    /* renamed from: a */
    public final /* synthetic */ zzbem mo4213a(zzbel zzbel) {
        if (mo4806q().getClass().isInstance(zzbel)) {
            return mo4801a((zzbbl) zzbel);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
