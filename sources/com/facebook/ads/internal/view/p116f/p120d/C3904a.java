package com.facebook.ads.internal.view.p116f.p120d;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
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
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.settings.C1964b;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.google.android.exoplayer2.C2195e.C2192a;
import com.google.android.exoplayer2.C2268f;
import com.google.android.exoplayer2.C2276k;
import com.google.android.exoplayer2.C2313q;
import com.google.android.exoplayer2.C3958c;
import com.google.android.exoplayer2.C4032p;
import com.google.android.exoplayer2.C4032p.C2310b;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.extractor.C3978c;
import com.google.android.exoplayer2.p125b.C2158g;
import com.google.android.exoplayer2.p125b.C4683a.C3954a;
import com.google.android.exoplayer2.p125b.C4684c;
import com.google.android.exoplayer2.p126c.C2186s;
import com.google.android.exoplayer2.source.C2327i;
import com.google.android.exoplayer2.source.C4036b;
import com.google.android.exoplayer2.upstream.C2371l;
import com.google.android.exoplayer2.upstream.C4054g;
import com.google.android.exoplayer2.upstream.C4056i;

@TargetApi(14)
/* renamed from: com.facebook.ads.internal.view.f.d.a */
public class C3904a extends TextureView implements SurfaceTextureListener, C2071c, C2192a, C2310b {
    /* renamed from: a */
    private static final String f15494a = "a";
    /* renamed from: b */
    private Uri f15495b;
    /* renamed from: c */
    private String f15496c;
    /* renamed from: d */
    private C2073e f15497d;
    /* renamed from: e */
    private Surface f15498e;
    /* renamed from: f */
    private C4032p f15499f;
    /* renamed from: g */
    private MediaController f15500g;
    /* renamed from: h */
    private C2072d f15501h = C2072d.IDLE;
    /* renamed from: i */
    private C2072d f15502i = C2072d.IDLE;
    /* renamed from: j */
    private C2072d f15503j = C2072d.IDLE;
    /* renamed from: k */
    private boolean f15504k = false;
    /* renamed from: l */
    private View f15505l;
    /* renamed from: m */
    private boolean f15506m = false;
    /* renamed from: n */
    private boolean f15507n = false;
    /* renamed from: o */
    private long f15508o;
    /* renamed from: p */
    private long f15509p;
    /* renamed from: q */
    private long f15510q;
    /* renamed from: r */
    private int f15511r;
    /* renamed from: s */
    private int f15512s;
    /* renamed from: t */
    private float f15513t = 1.0f;
    /* renamed from: u */
    private int f15514u = -1;
    /* renamed from: v */
    private boolean f15515v = false;
    /* renamed from: w */
    private boolean f15516w = false;
    /* renamed from: x */
    private C2038a f15517x = C2038a.NOT_STARTED;
    /* renamed from: y */
    private boolean f15518y = false;

    /* renamed from: com.facebook.ads.internal.view.f.d.a$1 */
    class C20651 implements MediaPlayerControl {
        /* renamed from: a */
        final /* synthetic */ C3904a f6372a;

        C20651(C3904a c3904a) {
            this.f6372a = c3904a;
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
            return this.f6372a.f15499f != null ? this.f6372a.f15499f.m20248i() : 0;
        }

        public int getBufferPercentage() {
            return this.f6372a.f15499f != null ? this.f6372a.f15499f.mo1635g() : 0;
        }

        public int getCurrentPosition() {
            return this.f6372a.getCurrentPosition();
        }

        public int getDuration() {
            return this.f6372a.getDuration();
        }

        public boolean isPlaying() {
            return this.f6372a.f15499f != null && this.f6372a.f15499f.mo1628a();
        }

        public void pause() {
            this.f6372a.mo1458a(true);
        }

        public void seekTo(int i) {
            this.f6372a.mo1451a(i);
        }

        public void start() {
            this.f6372a.mo1453a(C2038a.USER_STARTED);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.d.a$2 */
    class C20662 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3904a f6373a;

        C20662(C3904a c3904a) {
            this.f6373a = c3904a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f6373a.f15500g != null && motionEvent.getAction() == 1) {
                if (this.f6373a.f15500g.isShowing()) {
                    this.f6373a.f15500g.hide();
                } else {
                    this.f6373a.f15500g.show();
                }
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.d.a$3 */
    class C20673 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C3904a f6374a;

        C20673(C3904a c3904a) {
            this.f6374a = c3904a;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f6374a.f15500g != null && motionEvent.getAction() == 1) {
                if (this.f6374a.f15500g.isShowing()) {
                    this.f6374a.f15500g.hide();
                } else {
                    this.f6374a.f15500g.show();
                }
            }
            return true;
        }
    }

    public C3904a(Context context) {
        super(context);
    }

    public C3904a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C3904a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: h */
    private void m19405h() {
        C2371l c4054g = new C4054g();
        this.f15499f = C2268f.m8340a(getContext(), new C4684c(new C3954a(c4054g)), new C3958c());
        this.f15499f.m20235a((C2310b) this);
        this.f15499f.mo1624a((C2192a) this);
        this.f15499f.mo1626a(false);
        if (this.f15507n && !this.f15515v) {
            this.f15500g = new MediaController(getContext());
            this.f15500g.setAnchorView(this.f15505l == null ? this : this.f15505l);
            this.f15500g.setMediaPlayer(new C20651(this));
            this.f15500g.setEnabled(true);
        }
        if (this.f15496c == null || this.f15496c.length() == 0 || this.f15518y) {
            this.f15499f.mo1625a(new C4036b(this.f15495b, new C4056i(getContext(), C2186s.m8045a(getContext(), "ads"), c4054g), new C3978c(), null, null));
        }
        setVideoState(C2072d.PREPARING);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    /* renamed from: i */
    private void m19406i() {
        if (this.f15498e != null) {
            this.f15498e.release();
            this.f15498e = null;
        }
        if (this.f15499f != null) {
            this.f15499f.mo1632d();
            this.f15499f = null;
        }
        this.f15500g = null;
        this.f15506m = false;
        setVideoState(C2072d.IDLE);
    }

    private void setVideoState(C2072d c2072d) {
        if (c2072d != this.f15501h) {
            this.f15501h = c2072d;
            if (this.f15501h == C2072d.STARTED) {
                this.f15506m = true;
            }
            if (this.f15497d != null) {
                this.f15497d.mo1443a(c2072d);
            }
        }
    }

    /* renamed from: a */
    public void mo1450a() {
    }

    /* renamed from: a */
    public void mo1451a(int i) {
        if (this.f15499f != null) {
            this.f15514u = getCurrentPosition();
            this.f15499f.mo1623a((long) i);
            return;
        }
        this.f15510q = (long) i;
    }

    /* renamed from: a */
    public void mo1452a(int i, int i2, int i3, float f) {
        this.f15511r = i;
        this.f15512s = i2;
        if (this.f15511r != 0 && this.f15512s != 0) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo1453a(C2038a c2038a) {
        this.f15502i = C2072d.STARTED;
        this.f15517x = c2038a;
        if (this.f15499f == null) {
            setup(this.f15495b);
        } else if (this.f15501h == C2072d.PREPARED || this.f15501h == C2072d.PAUSED || this.f15501h == C2072d.PLAYBACK_COMPLETED) {
            this.f15499f.mo1626a(true);
            setVideoState(C2072d.STARTED);
        }
    }

    /* renamed from: a */
    public void mo1454a(ExoPlaybackException exoPlaybackException) {
        setVideoState(C2072d.ERROR);
        exoPlaybackException.printStackTrace();
        C1813b.m6823a(C1812a.m6820a(exoPlaybackException, "[ExoPlayer] Error during playback of ExoPlayer"));
    }

    /* renamed from: a */
    public void mo1455a(C2276k c2276k) {
    }

    /* renamed from: a */
    public void mo1456a(C2313q c2313q, Object obj) {
    }

    /* renamed from: a */
    public void mo1457a(C2327i c2327i, C2158g c2158g) {
    }

    /* renamed from: a */
    public void mo1458a(boolean z) {
        if (this.f15499f != null) {
            this.f15499f.mo1626a(false);
        } else {
            setVideoState(C2072d.IDLE);
        }
    }

    /* renamed from: a */
    public void mo1459a(boolean z, int i) {
        C2072d c2072d;
        switch (i) {
            case 1:
                c2072d = C2072d.IDLE;
                break;
            case 2:
                if (this.f15514u >= 0) {
                    int i2 = this.f15514u;
                    this.f15514u = -1;
                    this.f15497d.mo1442a(i2, getCurrentPosition());
                    return;
                }
                return;
            case 3:
                if (this.f15508o != 0) {
                    this.f15509p = System.currentTimeMillis() - this.f15508o;
                }
                setRequestedVolume(this.f15513t);
                if (this.f15510q > 0 && this.f15510q < this.f15499f.mo1633e()) {
                    this.f15499f.mo1623a(this.f15510q);
                    this.f15510q = 0;
                }
                if (this.f15499f.mo1634f() != 0 && !z && this.f15506m) {
                    c2072d = C2072d.PAUSED;
                    break;
                } else if (!z && this.f15501h != C2072d.PLAYBACK_COMPLETED) {
                    setVideoState(C2072d.PREPARED);
                    if (this.f15502i == C2072d.STARTED) {
                        mo1453a(this.f15517x);
                        this.f15502i = C2072d.IDLE;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                if (z) {
                    setVideoState(C2072d.PLAYBACK_COMPLETED);
                }
                if (this.f15499f != null) {
                    this.f15499f.mo1626a(false);
                    if (!z) {
                        this.f15499f.mo1629b();
                    }
                }
                this.f15506m = false;
                return;
            default:
                return;
        }
        setVideoState(c2072d);
    }

    /* renamed from: b */
    public void m19417b() {
        if (!this.f15516w) {
            mo1458a(false);
        }
    }

    /* renamed from: b */
    public void mo1460b(boolean z) {
    }

    /* renamed from: c */
    public void mo1461c() {
        setVideoState(C2072d.PLAYBACK_COMPLETED);
        mo1462d();
        this.f15510q = 0;
    }

    /* renamed from: d */
    public void mo1462d() {
        this.f15502i = C2072d.IDLE;
        if (this.f15499f != null) {
            this.f15499f.mo1631c();
            this.f15499f.mo1632d();
            this.f15499f = null;
        }
        setVideoState(C2072d.IDLE);
    }

    /* renamed from: e */
    public boolean mo1463e() {
        return (this.f15499f == null || this.f15499f.m20247h() == null) ? false : true;
    }

    /* renamed from: f */
    public void mo1464f() {
    }

    /* renamed from: g */
    public void mo1465g() {
        m19406i();
    }

    public int getCurrentPosition() {
        return this.f15499f != null ? (int) this.f15499f.mo1634f() : 0;
    }

    public int getDuration() {
        return this.f15499f == null ? 0 : (int) this.f15499f.mo1633e();
    }

    public long getInitialBufferTime() {
        return this.f15509p;
    }

    public C2038a getStartReason() {
        return this.f15517x;
    }

    public C2072d getState() {
        return this.f15501h;
    }

    public C2072d getTargetState() {
        return this.f15502i;
    }

    public int getVideoHeight() {
        return this.f15512s;
    }

    public int getVideoWidth() {
        return this.f15511r;
    }

    public View getView() {
        return this;
    }

    public float getVolume() {
        return this.f15513t;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f15498e != null) {
            this.f15498e.release();
        }
        this.f15498e = new Surface(surfaceTexture);
        if (this.f15499f != null) {
            this.f15499f.m20233a(this.f15498e);
            this.f15504k = false;
            if (this.f15501h == C2072d.PAUSED && this.f15503j != C2072d.PAUSED) {
                mo1453a(this.f15517x);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.f15498e != null) {
            this.f15498e.release();
            this.f15498e = null;
            if (this.f15499f != null) {
                this.f15499f.m20233a(null);
            }
        }
        if (!this.f15504k) {
            this.f15503j = this.f15507n ? C2072d.STARTED : this.f15501h;
            this.f15504k = true;
        }
        if (this.f15501h != C2072d.PAUSED) {
            mo1458a(false);
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f15499f != null) {
            if (this.f15500g == null || !this.f15500g.isShowing()) {
                if (z) {
                    this.f15504k = false;
                    if (this.f15501h == C2072d.PAUSED && this.f15503j != C2072d.PAUSED) {
                        mo1453a(this.f15517x);
                    }
                } else {
                    if (!this.f15504k) {
                        this.f15503j = this.f15507n ? C2072d.STARTED : this.f15501h;
                        this.f15504k = true;
                    }
                    if (this.f15501h != C2072d.PAUSED) {
                        m19417b();
                    }
                }
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else if (C1964b.m7441f()) {
            Log.w(f15494a, "Google always throw an exception with setBackgroundDrawable on Nougat above. so we silently ignore it.");
        }
    }

    public void setBackgroundPlaybackEnabled(boolean z) {
        this.f15516w = z;
    }

    public void setControlsAnchorView(View view) {
        this.f15505l = view;
        view.setOnTouchListener(new C20673(this));
    }

    public void setForeground(Drawable drawable) {
        if (VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else if (C1964b.m7441f()) {
            Log.w(f15494a, "Google always throw an exception with setForeground on Nougat above. so we silently ignore it.");
        }
    }

    public void setFullScreen(boolean z) {
        this.f15507n = z;
        if (z && !this.f15515v) {
            setOnTouchListener(new C20662(this));
        }
    }

    public void setRequestedVolume(float f) {
        this.f15513t = f;
        if (this.f15499f != null && this.f15501h != C2072d.PREPARING && this.f15501h != C2072d.IDLE) {
            this.f15499f.m20231a(f);
        }
    }

    public void setTestMode(boolean z) {
        this.f15518y = z;
    }

    public void setVideoMPD(String str) {
        this.f15496c = str;
    }

    public void setVideoStateChangeListener(C2073e c2073e) {
        this.f15497d = c2073e;
    }

    public void setup(Uri uri) {
        if (this.f15499f != null) {
            m19406i();
        }
        this.f15495b = uri;
        setSurfaceTextureListener(this);
        m19405h();
    }
}
