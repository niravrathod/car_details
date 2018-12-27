package com.google.firebase.p137b;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.firebase.b.a */
public class C2568a<T> {
    /* renamed from: a */
    private final Class<T> f10920a;
    /* renamed from: b */
    private final T f10921b;

    @KeepForSdk
    /* renamed from: a */
    public Class<T> m12588a() {
        return this.f10920a;
    }

    @KeepForSdk
    /* renamed from: b */
    public T m12589b() {
        return this.f10921b;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f10920a, this.f10921b});
    }
}
