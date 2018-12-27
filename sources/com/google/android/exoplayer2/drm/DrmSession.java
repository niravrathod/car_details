package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;

@TargetApi(16)
public interface DrmSession<T extends C2191b> {

    public static class DrmSessionException extends Exception {
    }

    /* renamed from: a */
    int m8076a();

    /* renamed from: a */
    boolean m8077a(String str);

    /* renamed from: b */
    T m8078b();

    /* renamed from: c */
    DrmSessionException m8079c();
}
