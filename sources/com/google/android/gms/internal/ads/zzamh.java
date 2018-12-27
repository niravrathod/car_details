package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

@zzaer
public final class zzamh {
    /* renamed from: a */
    private boolean f8880a = false;
    /* renamed from: b */
    private float f8881b = 1.0f;

    /* renamed from: a */
    public final synchronized void m9877a(float f) {
        this.f8881b = f;
    }

    /* renamed from: a */
    public final synchronized float m9876a() {
        if (!m9875c()) {
            return 1.0f;
        }
        return this.f8881b;
    }

    /* renamed from: a */
    public final synchronized void m9878a(boolean z) {
        this.f8880a = z;
    }

    /* renamed from: b */
    public final synchronized boolean m9879b() {
        return this.f8880a;
    }

    /* renamed from: c */
    private final synchronized boolean m9875c() {
        return this.f8881b >= 0.0f;
    }

    /* renamed from: a */
    public static float m9874a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        context = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return ((float) context) / ((float) streamMaxVolume);
    }
}
