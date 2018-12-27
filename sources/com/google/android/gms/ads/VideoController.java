package com.google.android.gms.ads;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzne;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    /* renamed from: a */
    private final Object f7605a = new Object();
    @GuardedBy("mLock")
    /* renamed from: b */
    private zzly f7606b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private VideoLifecycleCallbacks f7607c;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void zza(zzly zzly) {
        synchronized (this.f7605a) {
            this.f7606b = zzly;
            if (this.f7607c != null) {
                setVideoLifecycleCallbacks(this.f7607c);
            }
        }
    }

    public final zzly zzbb() {
        zzly zzly;
        synchronized (this.f7605a) {
            zzly = this.f7606b;
        }
        return zzly;
    }

    public final void play() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return;
            }
            try {
                this.f7606b.mo2552a();
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call play on video controller.", e);
            }
        }
    }

    public final void pause() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return;
            }
            try {
                this.f7606b.mo2555b();
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call pause on video controller.", e);
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return;
            }
            try {
                this.f7606b.mo2554a(z);
            } catch (boolean z2) {
                zzaok.m10002b("Unable to call mute on video controller.", z2);
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return true;
            }
            try {
                boolean c = this.f7606b.mo2556c();
                return c;
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    @KeepForSdk
    public final int getPlaybackState() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return 0;
            }
            try {
                int d = this.f7606b.mo2557d();
                return d;
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return false;
            }
            try {
                boolean i = this.f7606b.mo2562i();
                return i;
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return false;
            }
            try {
                boolean j = this.f7606b.mo2563j();
                return j;
            } catch (Throwable e) {
                zzaok.m10002b("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f7605a) {
            this.f7607c = videoLifecycleCallbacks;
            if (this.f7606b == null) {
                return;
            }
            try {
                this.f7606b.mo2553a(new zzne(videoLifecycleCallbacks));
            } catch (VideoLifecycleCallbacks videoLifecycleCallbacks2) {
                zzaok.m10002b("Unable to call setVideoLifecycleCallbacks on video controller.", videoLifecycleCallbacks2);
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.f7605a) {
            videoLifecycleCallbacks = this.f7607c;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.f7605a) {
            z = this.f7606b != null;
        }
        return z;
    }

    public final float getAspectRatio() {
        synchronized (this.f7605a) {
            if (this.f7606b == null) {
                return 0.0f;
            }
            try {
                float e = this.f7606b.mo2558e();
                return e;
            } catch (Throwable e2) {
                zzaok.m10002b("Unable to call getAspectRatio on video controller.", e2);
                return 0.0f;
            }
        }
    }
}
