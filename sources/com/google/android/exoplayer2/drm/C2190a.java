package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.os.Looper;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.drm.a */
public interface C2190a<T extends C2191b> {
    /* renamed from: a */
    DrmSession<T> m8080a(Looper looper, DrmInitData drmInitData);

    /* renamed from: a */
    void m8081a(DrmSession<T> drmSession);
}
