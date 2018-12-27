package com.google.android.gms.internal.measurement;

public abstract class zztx<MessageType extends zztw<MessageType, BuilderType>, BuilderType extends zztx<MessageType, BuilderType>> implements zzwu {
    /* renamed from: a */
    public abstract BuilderType mo4826a();

    /* renamed from: a */
    protected abstract BuilderType mo4827a(MessageType messageType);

    public /* synthetic */ Object clone() {
        return mo4826a();
    }

    /* renamed from: a */
    public final /* synthetic */ zzwu mo4349a(zzwt zzwt) {
        if (mo4832j().getClass().isInstance(zzwt)) {
            return mo4827a((zztw) zzwt);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
