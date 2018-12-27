package com.google.android.exoplayer2;

public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final C2313q timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(C2313q c2313q, int i, long j) {
        this.timeline = c2313q;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
