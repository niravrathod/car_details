package com.google.android.exoplayer2;

import java.io.IOException;

public final class ExoPlaybackException extends Exception {
    public final int rendererIndex;
    public final int type;

    /* renamed from: a */
    public static ExoPlaybackException m7732a(Exception exception, int i) {
        return new ExoPlaybackException(1, null, exception, i);
    }

    /* renamed from: a */
    public static ExoPlaybackException m7731a(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    /* renamed from: a */
    static ExoPlaybackException m7733a(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    private ExoPlaybackException(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.type = i;
        this.rendererIndex = i2;
    }
}
