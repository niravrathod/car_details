package com.facebook.ads.internal.view.p116f.p120d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.facebook.ads.internal.p101q.p105d.C1953a;
import com.facebook.ads.internal.p101q.p105d.C1954b;
import com.facebook.ads.internal.settings.C1964b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import java.io.IOException;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.f.d.b */
public class C3905b extends TextureView implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnSeekCompleteListener, OnVideoSizeChangedListener, SurfaceTextureListener, C2071c {
    /* renamed from: t */
    private static final String f15519t = "b";
    /* renamed from: a */
    private Uri f15520a;
    /* renamed from: b */
    private C2073e f15521b;
    /* renamed from: c */
    private Surface f15522c;
    /* renamed from: d */
    private MediaPlayer f15523d;
    /* renamed from: e */
    private MediaController f15524e;
    /* renamed from: f */
    private C2072d f15525f = C2072d.IDLE;
    /* renamed from: g */
    private C2072d f15526g = C2072d.IDLE;
    /* renamed from: h */
    private C2072d f15527h = C2072d.IDLE;
    /* renamed from: i */
    private boolean f15528i = false;
    /* renamed from: j */
    private View f15529j;
    /* renamed from: k */
    private int f15530k = 0;
    /* renamed from: l */
    private long f15531l;
    /* renamed from: m */
    private int f15532m = 0;
    /* renamed from: n */
    private int f15533n = 0;
    /* renamed from: o */
    private float f15534o = 1.0f;
    /* renamed from: p */
    private boolean f15535p = false;
    /* renamed from: q */
    private int f15536q = 3;
    /* renamed from: r */
    private boolean f15537r = false;
    /* renamed from: s */
    private boolean f15538s = false;
    /* renamed from: u */
    private int f15539u = 0;
    /* renamed from: v */
    private boolean f15540v = false;
    /* renamed from: w */
    private C2038a f15541w = C2038a.NOT_STARTED;
    /* renamed from: x */
    private final MediaPlayerControl f15542x = new C20681(this);

    /* renamed from: com.facebook.ads.internal.view.f.d.b$1 */
    class C20681 implements MediaPlayerControl {
        /* renamed from: a */
        final /* synthetic */ C3905b f6375a;

        C20681(C3905b c3905b) {
            this.f6375a = c3905b;
        }

        public boolean canPause() {
            return true;
        }

        public boolean canSeekBackward() {
            return true;
        }

        public boolean canSeekForward() {
            return true;
        }

        public int getAudioSessionId() {
            return this.f6375a.f15523d != null ? this.f6375a.f15523d.getAudioSessionId() : 0;
        }

        public int getBufferPercentage() {
            return 0;
        }

        public int getCurrentPosition() {
            return this.f6375a.getCurrentPosition();
        }

        public int getDuration() {
            return this.f6375a.getDuration();
        }

        public boolean isPlaying() {
            return this.f6375a.f15523d != null && this.f6375a.f15523d.isPlaying();
        }

        public void pause() {
            this.f6375a.mo1458a(true);
        }

        public void seekTo(int i) {
            this.f6375a.mo1451a(i);
        }

        public void start() {
            this.f6375a.mo1453a(C2038a.USER_STARTED);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.d.b$2 */
    class C20692 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3905b f6376a;

        C20692(C3905b c3905b) {
            this.f6376a = c3905b;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(this.f6376a.f15540v || this.f6376a.f15524e == null || motionEvent.getAction() != 1)) {
                if (this.f6376a.f15524e.isShowing()) {
                    this.f6376a.f15524e.hide();
                } else {
                    this.f6376a.f15524e.show();
                }
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.d.b$3 */
    class C20703 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3905b f6377a;

        C20703(C3905b c3905b) {
            this.f6377a = c3905b;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (!(this.f6377a.f15540v || this.f6377a.f15524e == null || motionEvent.getAction() != 1)) {
                if (this.f6377a.f15524e.isShowing()) {
                    this.f6377a.f15524e.hide();
                } else {
                    this.f6377a.f15524e.show();
                }
            }
            return true;
        }
    }

    public C3905b(Context context) {
        super(context);
    }

    public C3905b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C3905b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private boolean m19425a(Surface surface) {
        if (this.f15523d == null) {
            return false;
        }
        try {
            this.f15523d.setSurface(surface);
            return true;
        } catch (Exception e) {
            C1953a.m7382a(getContext(), "player", C1954b.f6005s, e);
            Log.d(f15519t, "The MediaPlayer failed", e);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m19426b() {
        if (!(this.f15525f == C2072d.PREPARED || this.f15525f == C2072d.STARTED || this.f15525f == C2072d.PAUSED)) {
            if (this.f15525f != C2072d.PLAYBACK_COMPLETED) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private boolean m19429f() {
        if (this.f15523d == null) {
            return false;
        }
        try {
            this.f15523d.reset();
            return true;
        } catch (Exception e) {
            C1953a.m7382a(getContext(), "player", C1954b.f6006t, e);
            Log.d(f15519t, "The MediaPlayer failed", e);
            return false;
        }
    }

    /* renamed from: h */
    private boolean m19430h() {
        return (this.f15525f == C2072d.PREPARING || this.f15525f == C2072d.PREPARED) ? false : true;
    }

    /* renamed from: i */
    private boolean m19431i() {
        return (this.f15525f == C2072d.PREPARING || this.f15525f == C2072d.PREPARED) ? false : true;
    }

    private void setVideoState(C2072d c2072d) {
        if (c2072d != this.f15525f) {
            this.f15525f = c2072d;
            if (this.f15521b != null) {
                this.f15521b.mo1443a(c2072d);
            }
        }
    }

    /* renamed from: a */
    public void m19432a() {
        if (!this.f15537r) {
            mo1458a(false);
        }
    }

    /* renamed from: a */
    public void mo1451a(int i) {
        if (this.f15523d == null || !m19426b()) {
            this.f15530k = i;
        } else if (i < getDuration() && i > 0) {
            this.f15539u = getCurrentPosition();
            this.f15530k = i;
            this.f15523d.seekTo(i);
        }
    }

    /* renamed from: a */
    public void mo1453a(C2038a c2038a) {
        this.f15526g = C2072d.STARTED;
        this.f15541w = c2038a;
        if (this.f15525f == C2072d.STARTED || this.f15525f == C2072d.PREPARED || this.f15525f == C2072d.IDLE || this.f15525f == C2072d.PAUSED || this.f15525f == C2072d.PLAYBACK_COMPLETED) {
            if (this.f15523d == null) {
                setup(this.f15520a);
            } else {
                if (this.f15530k > 0) {
                    this.f15523d.seekTo(this.f15530k);
                }
                this.f15523d.start();
                if (this.f15525f != C2072d.PREPARED || this.f15538s) {
                    setVideoState(C2072d.STARTED);
                }
            }
        }
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: a */
    public void mo1458a(boolean z) {
        C2072d c2072d;
        this.f15526g = C2072d.PAUSED;
        if (this.f15523d == null) {
            c2072d = C2072d.IDLE;
        } else if (m19431i()) {
            if (z) {
                this.f15527h = C2072d.PAUSED;
                this.f15528i = true;
            }
            this.f15523d.pause();
            if (this.f15525f != C2072d.PLAYBACK_COMPLETED) {
                c2072d = C2072d.PAUSED;
            }
        } else {
            return;
        }
        setVideoState(c2072d);
    }

    /* renamed from: c */
    public void mo1461c() {
        setVideoState(C2072d.PLAYBACK_COMPLETED);
        mo1462d();
        this.f15530k = 0;
    }

    /* renamed from: d */
    public void mo1462d() {
        this.f15526g = C2072d.IDLE;
        if (this.f15523d != null) {
            int currentPosition = this.f15523d.getCurrentPosition();
            if (currentPosition > 0) {
                this.f15530k = currentPosition;
            }
            this.f15523d.stop();
            m19429f();
            this.f15523d.release();
            this.f15523d = null;
            if (this.f15524e != null) {
                this.f15524e.hide();
                this.f15524e.setEnabled(false);
            }
        }
        setVideoState(C2072d.IDLE);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public boolean mo1463e() {
        if (this.f15523d != null) {
            if (VERSION.SDK_INT >= 16) {
                try {
                    for (TrackInfo trackType : this.f15523d.getTrackInfo()) {
                        if (trackType.getTrackType() == 2) {
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable e) {
                    Log.e(f15519t, "Couldn't retrieve video information", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public void mo1465g() {
        if (this.f15523d != null) {
            m19425a(null);
            this.f15523d.setOnBufferingUpdateListener(null);
            this.f15523d.setOnCompletionListener(null);
            this.f15523d.setOnErrorListener(null);
            this.f15523d.setOnInfoListener(null);
            this.f15523d.setOnPreparedListener(null);
            this.f15523d.setOnVideoSizeChangedListener(null);
            this.f15523d.setOnSeekCompleteListener(null);
            m19429f();
            this.f15523d = null;
            setVideoState(C2072d.IDLE);
        }
    }

    public int getCurrentPosition() {
        return (this.f15523d == null || !m19426b()) ? 0 : this.f15523d.getCurrentPosition();
    }

    public int getDuration() {
        if (this.f15523d != null) {
            if (m19426b()) {
                return this.f15523d.getDuration();
            }
        }
        return 0;
    }

    public long getInitialBufferTime() {
        return this.f15531l;
    }

    public C2038a getStartReason() {
        return this.f15541w;
    }

    public C2072d getState() {
        return this.f15525f;
    }

    public C2072d getTargetState() {
        return this.f15526g;
    }

    public int getVideoHeight() {
        return this.f15533n;
    }

    public int getVideoWidth() {
        return this.f15532m;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f15534o;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f15523d != null) {
            this.f15523d.pause();
        }
        setVideoState(C2072d.PLAYBACK_COMPLETED);
        mo1451a(0);
        this.f15530k = 0;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (this.f15536q <= 0 || getState() != C2072d.STARTED) {
            setVideoState(C2072d.ERROR);
            mo1462d();
        } else {
            this.f15536q--;
            mo1462d();
            mo1453a(this.f15541w);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInfo(android.media.MediaPlayer r1, int r2, int r3) {
        /*
        r0 = this;
        r1 = 3;
        if (r2 == r1) goto L_0x0017;
    L_0x0003:
        switch(r2) {
            case 701: goto L_0x0010;
            case 702: goto L_0x0007;
            default: goto L_0x0006;
        };
    L_0x0006:
        goto L_0x0015;
    L_0x0007:
        r1 = r0.m19430h();
        if (r1 == 0) goto L_0x0015;
    L_0x000d:
        r1 = com.facebook.ads.internal.view.p116f.p120d.C2072d.STARTED;
        goto L_0x0012;
    L_0x0010:
        r1 = com.facebook.ads.internal.view.p116f.p120d.C2072d.BUFFERING;
    L_0x0012:
        r0.setVideoState(r1);
    L_0x0015:
        r1 = 0;
        return r1;
    L_0x0017:
        r1 = 1;
        r0.f15538s = r1;
        r2 = r0.f15526g;
        r3 = com.facebook.ads.internal.view.p116f.p120d.C2072d.STARTED;
        if (r2 != r3) goto L_0x0025;
    L_0x0020:
        r2 = com.facebook.ads.internal.view.p116f.p120d.C2072d.STARTED;
        r0.setVideoState(r2);
    L_0x0025:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.f.d.b.onInfo(android.media.MediaPlayer, int, int):boolean");
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(C2072d.PREPARED);
        if (this.f15535p && !this.f15540v) {
            this.f15524e = new MediaController(getContext());
            this.f15524e.setAnchorView(this.f15529j == null ? this : this.f15529j);
            this.f15524e.setMediaPlayer(this.f15542x);
            this.f15524e.setEnabled(true);
        }
        setRequestedVolume(this.f15534o);
        this.f15532m = mediaPlayer.getVideoWidth();
        this.f15533n = mediaPlayer.getVideoHeight();
        if (this.f15530k > 0) {
            if (this.f15530k >= this.f15523d.getDuration()) {
                this.f15530k = 0;
            }
            this.f15523d.seekTo(this.f15530k);
            this.f15530k = 0;
        }
        if (this.f15526g == C2072d.STARTED) {
            mo1453a(this.f15541w);
        }
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f15521b != null) {
            this.f15521b.mo1442a(this.f15539u, this.f15530k);
            this.f15530k = 0;
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f15522c == null) {
            this.f15522c = new Surface(surfaceTexture);
        }
        if (m19425a(this.f15522c)) {
            this.f15528i = false;
            if (this.f15525f == C2072d.PAUSED && this.f15527h != C2072d.PAUSED) {
                mo1453a(this.f15541w);
            }
            return;
        }
        setVideoState(C2072d.ERROR);
        mo1465g();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m19425a(null);
        if (this.f15522c != null) {
            this.f15522c.release();
            this.f15522c = null;
        }
        if (!this.f15528i) {
            this.f15527h = this.f15535p ? C2072d.STARTED : this.f15525f;
            this.f15528i = true;
        }
        if (this.f15525f != C2072d.PAUSED) {
            mo1458a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.f15532m = mediaPlayer.getVideoWidth();
        this.f15533n = mediaPlayer.getVideoHeight();
        if (this.f15532m != 0 && this.f15533n != 0) {
            requestLayout();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f15523d != null) {
            if (this.f15524e == null || !this.f15524e.isShowing()) {
                if (z) {
                    this.f15528i = false;
                    if (this.f15525f == C2072d.PAUSED && this.f15527h != C2072d.PAUSED) {
                        mo1453a(this.f15541w);
                    }
                } else {
                    if (!this.f15528i) {
                        this.f15527h = this.f15535p ? C2072d.STARTED : this.f15525f;
                        this.f15528i = true;
                    }
                    if (this.f15525f != C2072d.PAUSED) {
                        m19432a();
                    }
                }
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (C1964b.m7441f()) {
            Log.w(f15519t, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f15537r = z;
    }

    public void setControlsAnchorView(View view) {
        this.f15529j = view;
        view.setOnTouchListener(new C20703(this));
    }

    public void setForeground(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (C1964b.m7441f()) {
            Log.w(f15519t, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    public void setFullScreen(boolean z) {
        this.f15535p = z;
        if (this.f15535p && !this.f15540v) {
            setOnTouchListener(new C20692(this));
        }
    }

    public void setRequestedVolume(float f) {
        this.f15534o = f;
        if (this.f15523d != null && this.f15525f != C2072d.PREPARING && this.f15525f != C2072d.IDLE) {
            this.f15523d.setVolume(f, f);
        }
    }

    public void setVideoMPD(String str) {
    }

    public void setVideoStateChangeListener(C2073e c2073e) {
        this.f15521b = c2073e;
    }

    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        String str;
        StringBuilder stringBuilder;
        String stringBuilder2;
        Object obj;
        String str2;
        StringBuilder stringBuilder3;
        Throwable th;
        this.f15538s = false;
        this.f15520a = uri;
        AssetFileDescriptor assetFileDescriptor = null;
        if (this.f15523d != null) {
            m19429f();
            m19425a(null);
            mediaPlayer = this.f15523d;
            setVideoState(C2072d.IDLE);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals("asset")) {
                try {
                    AssetFileDescriptor openFd = getContext().getAssets().openFd(uri.getPath().substring(1));
                    try {
                        MediaPlayer mediaPlayer2 = mediaPlayer;
                        mediaPlayer2.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        if (openFd != null) {
                            try {
                                openFd.close();
                            } catch (IOException e) {
                                str = f15519t;
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Unable to close");
                                stringBuilder.append(e);
                                stringBuilder2 = stringBuilder.toString();
                                Log.w(str, stringBuilder2);
                                mediaPlayer.setLooping(false);
                                mediaPlayer.setOnBufferingUpdateListener(this);
                                mediaPlayer.setOnCompletionListener(this);
                                mediaPlayer.setOnErrorListener(this);
                                mediaPlayer.setOnInfoListener(this);
                                mediaPlayer.setOnPreparedListener(this);
                                mediaPlayer.setOnVideoSizeChangedListener(this);
                                mediaPlayer.setOnSeekCompleteListener(this);
                                mediaPlayer.prepareAsync();
                                this.f15523d = mediaPlayer;
                                setVideoState(C2072d.PREPARING);
                                setSurfaceTextureListener(this);
                                if (isAvailable()) {
                                    onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                                }
                            }
                        }
                    } catch (SecurityException e2) {
                        SecurityException securityException = e2;
                        assetFileDescriptor = openFd;
                        obj = securityException;
                        try {
                            str2 = f15519t;
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Failed to open assets ");
                            stringBuilder3.append(obj);
                            Log.w(str2, stringBuilder3.toString());
                            setVideoState(C2072d.ERROR);
                            if (assetFileDescriptor != null) {
                                try {
                                    assetFileDescriptor.close();
                                } catch (IOException e3) {
                                    str = f15519t;
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unable to close");
                                    stringBuilder.append(e3);
                                    stringBuilder2 = stringBuilder.toString();
                                    Log.w(str, stringBuilder2);
                                    mediaPlayer.setLooping(false);
                                    mediaPlayer.setOnBufferingUpdateListener(this);
                                    mediaPlayer.setOnCompletionListener(this);
                                    mediaPlayer.setOnErrorListener(this);
                                    mediaPlayer.setOnInfoListener(this);
                                    mediaPlayer.setOnPreparedListener(this);
                                    mediaPlayer.setOnVideoSizeChangedListener(this);
                                    mediaPlayer.setOnSeekCompleteListener(this);
                                    mediaPlayer.prepareAsync();
                                    this.f15523d = mediaPlayer;
                                    setVideoState(C2072d.PREPARING);
                                    setSurfaceTextureListener(this);
                                    if (isAvailable()) {
                                        onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                                    }
                                }
                            }
                            mediaPlayer.setLooping(false);
                            mediaPlayer.setOnBufferingUpdateListener(this);
                            mediaPlayer.setOnCompletionListener(this);
                            mediaPlayer.setOnErrorListener(this);
                            mediaPlayer.setOnInfoListener(this);
                            mediaPlayer.setOnPreparedListener(this);
                            mediaPlayer.setOnVideoSizeChangedListener(this);
                            mediaPlayer.setOnSeekCompleteListener(this);
                            mediaPlayer.prepareAsync();
                            this.f15523d = mediaPlayer;
                            setVideoState(C2072d.PREPARING);
                            setSurfaceTextureListener(this);
                            if (isAvailable()) {
                                onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (assetFileDescriptor != null) {
                                try {
                                    assetFileDescriptor.close();
                                } catch (IOException e4) {
                                    str2 = f15519t;
                                    stringBuilder3 = new StringBuilder();
                                    stringBuilder3.append("Unable to close");
                                    stringBuilder3.append(e4);
                                    Log.w(str2, stringBuilder3.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        assetFileDescriptor = openFd;
                        th = th4;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        throw th;
                    }
                } catch (SecurityException e5) {
                    obj = e5;
                    str2 = f15519t;
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Failed to open assets ");
                    stringBuilder3.append(obj);
                    Log.w(str2, stringBuilder3.toString());
                    setVideoState(C2072d.ERROR);
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    mediaPlayer.setLooping(false);
                    mediaPlayer.setOnBufferingUpdateListener(this);
                    mediaPlayer.setOnCompletionListener(this);
                    mediaPlayer.setOnErrorListener(this);
                    mediaPlayer.setOnInfoListener(this);
                    mediaPlayer.setOnPreparedListener(this);
                    mediaPlayer.setOnVideoSizeChangedListener(this);
                    mediaPlayer.setOnSeekCompleteListener(this);
                    mediaPlayer.prepareAsync();
                    this.f15523d = mediaPlayer;
                    setVideoState(C2072d.PREPARING);
                    setSurfaceTextureListener(this);
                    if (isAvailable()) {
                        onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
                    }
                }
            }
            mediaPlayer.setDataSource(uri.toString());
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.f15523d = mediaPlayer;
            setVideoState(C2072d.PREPARING);
        } catch (Exception e6) {
            setVideoState(C2072d.ERROR);
            mediaPlayer.release();
            String str3 = f15519t;
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Cannot prepare media player with SurfaceTexture: ");
            stringBuilder4.append(e6);
            Log.e(str3, stringBuilder4.toString());
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
