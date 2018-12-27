package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import com.google.android.gms.ads.internal.zzbv;
import java.util.HashMap;
import java.util.Map;

@zzaer
@TargetApi(14)
public final class zzaqe extends zzaqp implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    /* renamed from: c */
    private static final Map<Integer, String> f19899c = new HashMap();
    /* renamed from: d */
    private final zzarh f19900d;
    /* renamed from: e */
    private final boolean f19901e;
    /* renamed from: f */
    private int f19902f = 0;
    /* renamed from: g */
    private int f19903g = 0;
    /* renamed from: h */
    private MediaPlayer f19904h;
    /* renamed from: i */
    private Uri f19905i;
    /* renamed from: j */
    private int f19906j;
    /* renamed from: k */
    private int f19907k;
    /* renamed from: l */
    private int f19908l;
    /* renamed from: m */
    private int f19909m;
    /* renamed from: n */
    private int f19910n;
    /* renamed from: o */
    private zzare f19911o;
    /* renamed from: p */
    private boolean f19912p;
    /* renamed from: q */
    private int f19913q;
    /* renamed from: r */
    private zzaqo f19914r;

    public zzaqe(Context context, boolean z, boolean z2, zzarf zzarf, zzarh zzarh) {
        super(context);
        setSurfaceTextureListener(this);
        this.f19900d = zzarh;
        this.f19912p = z;
        this.f19901e = z2;
        this.f19900d.m10072a(this);
    }

    /* renamed from: a */
    public final String mo4183a() {
        String str = "MediaPlayer";
        String valueOf = String.valueOf(this.f19912p ? " spherical" : "");
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* renamed from: a */
    public final void mo4186a(zzaqo zzaqo) {
        this.f19914r = zzaqo;
    }

    public final void setVideoPath(String str) {
        str = Uri.parse(str);
        zzho a = zzho.m26575a((Uri) str);
        if (a != null) {
            str = Uri.parse(a.f20131a);
        }
        this.f19905i = str;
        this.f19913q = null;
        m26287f();
        requestLayout();
        invalidate();
    }

    /* renamed from: b */
    public final void mo4187b() {
        zzalg.m21225a("AdMediaPlayerView stop");
        if (this.f19904h != null) {
            this.f19904h.stop();
            this.f19904h.release();
            this.f19904h = null;
            m26286c(0);
            this.f19903g = 0;
        }
        this.f19900d.m10073b();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("AdMediaPlayerView size changed: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        zzalg.m21225a(stringBuilder.toString());
        this.f19906j = mediaPlayer.getVideoWidth();
        this.f19907k = mediaPlayer.getVideoHeight();
        if (this.f19906j != null && this.f19907k != null) {
            requestLayout();
        }
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzalg.m21225a("AdMediaPlayerView prepared");
        m26286c(2);
        this.f19900d.m10071a();
        zzalo.f8872a.post(new fk(this));
        this.f19906j = mediaPlayer.getVideoWidth();
        this.f19907k = mediaPlayer.getVideoHeight();
        if (this.f19913q != null) {
            mo4185a(this.f19913q);
        }
        m26288g();
        mediaPlayer = this.f19906j;
        int i = this.f19907k;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("AdMediaPlayerView stream dimensions: ");
        stringBuilder.append(mediaPlayer);
        stringBuilder.append(" x ");
        stringBuilder.append(i);
        zzaok.m10005d(stringBuilder.toString());
        if (this.f19903g == 3) {
            mo4188c();
        }
        mo2375e();
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzalg.m21225a("AdMediaPlayerView completion");
        m26286c(5);
        this.f19903g = 5;
        zzalo.f8872a.post(new fl(this));
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f19899c.get(Integer.valueOf(i));
        String str2 = (String) f19899c.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer info: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        zzalg.m21225a(stringBuilder.toString());
        return true;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) f19899c.get(Integer.valueOf(i));
        String str2 = (String) f19899c.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer error: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        zzaok.m10007e(stringBuilder.toString());
        m26286c(-1);
        this.f19903g = -1;
        zzalo.f8872a.post(new fm(this, str, str2));
        return true;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f19908l = i;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzalg.m21225a("AdMediaPlayerView surface created");
        m26287f();
        zzalo.f8872a.post(new fn(this));
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzalg.m21225a("AdMediaPlayerView surface changed");
        Object obj = null;
        surfaceTexture = this.f19903g == 3 ? true : null;
        if (this.f19906j == i && this.f19907k == i2) {
            obj = 1;
        }
        if (!(this.f19904h == null || surfaceTexture == null || r0 == null)) {
            if (this.f19913q != null) {
                mo4185a(this.f19913q);
            }
            mo4188c();
        }
        if (this.f19911o != null) {
            this.f19911o.m21343a(i, i2);
        }
        zzalo.f8872a.post(new fo(this, i, i2));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzalg.m21225a("AdMediaPlayerView surface destroyed");
        if (this.f19904h != null && this.f19913q == null) {
            this.f19913q = this.f19904h.getCurrentPosition();
        }
        if (this.f19911o != null) {
            this.f19911o.m21345b();
        }
        zzalo.f8872a.post(new fp(this));
        m26285a(true);
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f19900d.m10074b(this);
        this.a.m10065a(surfaceTexture, this.f19914r);
    }

    protected final void onWindowVisibilityChanged(int i) {
        StringBuilder stringBuilder = new StringBuilder(58);
        stringBuilder.append("AdMediaPlayerView window visibility changed to ");
        stringBuilder.append(i);
        zzalg.m21225a(stringBuilder.toString());
        zzalo.f8872a.post(new fj(this, i));
        super.onWindowVisibilityChanged(i);
    }

    protected final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.f19906j, i);
        int defaultSize2 = getDefaultSize(this.f19907k, i2);
        if (this.f19906j <= 0 || this.f19907k <= 0 || this.f19911o != null) {
            i = defaultSize;
        } else {
            defaultSize = MeasureSpec.getMode(i);
            i = MeasureSpec.getSize(i);
            defaultSize2 = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            if (defaultSize == 1073741824 && defaultSize2 == 1073741824) {
                if (this.f19906j * i2 < this.f19907k * i) {
                    i = (this.f19906j * i2) / this.f19907k;
                } else if (this.f19906j * i2 > this.f19907k * i) {
                    defaultSize2 = (this.f19907k * i) / this.f19906j;
                }
                setMeasuredDimension(i, i2);
                if (this.f19911o != null) {
                    this.f19911o.m21343a(i, i2);
                }
                if (VERSION.SDK_INT != 16) {
                    m26288g();
                    this.f19909m = i;
                    this.f19910n = i2;
                }
            }
            if (defaultSize == 1073741824) {
                defaultSize = (this.f19907k * i) / this.f19906j;
                if (defaultSize2 != Integer.MIN_VALUE || defaultSize <= i2) {
                    i2 = defaultSize;
                }
            } else {
                if (defaultSize2 == 1073741824) {
                    defaultSize2 = (this.f19906j * i2) / this.f19907k;
                    if (defaultSize == Integer.MIN_VALUE && defaultSize2 > i) {
                    }
                } else {
                    int i3 = this.f19906j;
                    int i4 = this.f19907k;
                    if (defaultSize2 != Integer.MIN_VALUE || i4 <= i2) {
                        defaultSize2 = i3;
                        i2 = i4;
                    } else {
                        defaultSize2 = (this.f19906j * i2) / this.f19907k;
                    }
                    if (defaultSize == Integer.MIN_VALUE && r1 > i) {
                        defaultSize2 = (this.f19907k * i) / this.f19906j;
                    }
                }
                i = defaultSize2;
            }
            setMeasuredDimension(i, i2);
            if (this.f19911o != null) {
                this.f19911o.m21343a(i, i2);
            }
            if (VERSION.SDK_INT != 16) {
                if ((this.f19909m > 0 && this.f19909m != i) || (this.f19910n > 0 && this.f19910n != i2)) {
                    m26288g();
                }
                this.f19909m = i;
                this.f19910n = i2;
            }
        }
        i2 = defaultSize2;
        setMeasuredDimension(i, i2);
        if (this.f19911o != null) {
            this.f19911o.m21343a(i, i2);
        }
        if (VERSION.SDK_INT != 16) {
            m26288g();
            this.f19909m = i;
            this.f19910n = i2;
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String toHexString = Integer.toHexString(hashCode());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(toHexString).length());
        stringBuilder.append(name);
        stringBuilder.append("@");
        stringBuilder.append(toHexString);
        return stringBuilder.toString();
    }

    /* renamed from: f */
    private final void m26287f() {
        zzalg.m21225a("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f19905i != null) {
            if (surfaceTexture != null) {
                m26285a(false);
                try {
                    zzbv.zzfc();
                    this.f19904h = new MediaPlayer();
                    this.f19904h.setOnBufferingUpdateListener(this);
                    this.f19904h.setOnCompletionListener(this);
                    this.f19904h.setOnErrorListener(this);
                    this.f19904h.setOnInfoListener(this);
                    this.f19904h.setOnPreparedListener(this);
                    this.f19904h.setOnVideoSizeChangedListener(this);
                    this.f19908l = 0;
                    if (this.f19912p) {
                        this.f19911o = new zzare(getContext());
                        this.f19911o.m21344a(surfaceTexture, getWidth(), getHeight());
                        this.f19911o.start();
                        SurfaceTexture c = this.f19911o.m21346c();
                        if (c != null) {
                            surfaceTexture = c;
                        } else {
                            this.f19911o.m21345b();
                            this.f19911o = null;
                        }
                    }
                    this.f19904h.setDataSource(getContext(), this.f19905i);
                    zzbv.zzfd();
                    this.f19904h.setSurface(new Surface(surfaceTexture));
                    this.f19904h.setAudioStreamType(3);
                    this.f19904h.setScreenOnWhilePlaying(true);
                    this.f19904h.prepareAsync();
                    m26286c(1);
                } catch (Throwable e) {
                    String valueOf = String.valueOf(this.f19905i);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                    stringBuilder.append("Failed to initialize MediaPlayer at ");
                    stringBuilder.append(valueOf);
                    zzaok.m10004c(stringBuilder.toString(), e);
                    onError(this.f19904h, 1, 0);
                }
            }
        }
    }

    /* renamed from: g */
    private final void m26288g() {
        if (this.f19901e && m26289h() && this.f19904h.getCurrentPosition() > 0 && this.f19903g != 3) {
            zzalg.m21225a("AdMediaPlayerView nudging MediaPlayer");
            m26284a(0.0f);
            this.f19904h.start();
            int currentPosition = this.f19904h.getCurrentPosition();
            long currentTimeMillis = zzbv.zzer().currentTimeMillis();
            while (m26289h() && this.f19904h.getCurrentPosition() == currentPosition) {
                if (zzbv.zzer().currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.f19904h.pause();
            mo2375e();
        }
    }

    /* renamed from: a */
    private final void m26285a(boolean z) {
        zzalg.m21225a("AdMediaPlayerView release");
        if (this.f19911o != null) {
            this.f19911o.m21345b();
            this.f19911o = null;
        }
        if (this.f19904h != null) {
            this.f19904h.reset();
            this.f19904h.release();
            this.f19904h = null;
            m26286c(0);
            if (z) {
                this.f19903g = 0;
                this.f19903g = 0;
            }
        }
    }

    /* renamed from: c */
    public final void mo4188c() {
        zzalg.m21225a("AdMediaPlayerView play");
        if (m26289h()) {
            this.f19904h.start();
            m26286c(3);
            this.a.m10064a();
            zzalo.f8872a.post(new fq(this));
        }
        this.f19903g = 3;
    }

    /* renamed from: d */
    public final void mo4189d() {
        zzalg.m21225a("AdMediaPlayerView pause");
        if (m26289h() && this.f19904h.isPlaying()) {
            this.f19904h.pause();
            m26286c(4);
            zzalo.f8872a.post(new fr(this));
        }
        this.f19903g = 4;
    }

    public final int getDuration() {
        return m26289h() ? this.f19904h.getDuration() : -1;
    }

    public final int getCurrentPosition() {
        return m26289h() ? this.f19904h.getCurrentPosition() : 0;
    }

    /* renamed from: a */
    public final void mo4185a(int i) {
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("AdMediaPlayerView seek ");
        stringBuilder.append(i);
        zzalg.m21225a(stringBuilder.toString());
        if (m26289h()) {
            this.f19904h.seekTo(i);
            this.f19913q = 0;
            return;
        }
        this.f19913q = i;
    }

    /* renamed from: h */
    private final boolean m26289h() {
        return (this.f19904h == null || this.f19902f == -1 || this.f19902f == 0 || this.f19902f == 1) ? false : true;
    }

    /* renamed from: a */
    public final void mo4184a(float f, float f2) {
        if (this.f19911o != null) {
            this.f19911o.m21342a(f, f2);
        }
    }

    public final int getVideoWidth() {
        return this.f19904h != null ? this.f19904h.getVideoWidth() : 0;
    }

    public final int getVideoHeight() {
        return this.f19904h != null ? this.f19904h.getVideoHeight() : 0;
    }

    /* renamed from: e */
    public final void mo2375e() {
        m26284a(this.b.m10078a());
    }

    /* renamed from: a */
    private final void m26284a(float r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r1.f19904h;
        if (r0 == 0) goto L_0x000b;
    L_0x0004:
        r0 = r1.f19904h;	 Catch:{ IllegalStateException -> 0x000a }
        r0.setVolume(r2, r2);	 Catch:{ IllegalStateException -> 0x000a }
        return;
    L_0x000a:
        return;
    L_0x000b:
        r2 = "AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().";
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqe.a(float):void");
    }

    /* renamed from: c */
    private final void m26286c(int i) {
        if (i == 3) {
            this.f19900d.m10075c();
            this.b.m10081b();
        } else if (this.f19902f == 3) {
            this.f19900d.m10076d();
            this.b.m10082c();
        }
        this.f19902f = i;
    }

    /* renamed from: b */
    final /* synthetic */ void m26295b(int i) {
        if (this.f19914r != null) {
            this.f19914r.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            f19899c.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            f19899c.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            f19899c.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            f19899c.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            f19899c.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        f19899c.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        f19899c.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        f19899c.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        f19899c.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        f19899c.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        f19899c.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        f19899c.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        f19899c.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        f19899c.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            f19899c.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            f19899c.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
