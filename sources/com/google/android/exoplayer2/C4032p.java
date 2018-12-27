package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.exoplayer2.C2195e.C2192a;
import com.google.android.exoplayer2.C2195e.C2193b;
import com.google.android.exoplayer2.C2195e.C2194c;
import com.google.android.exoplayer2.audio.C2146c;
import com.google.android.exoplayer2.metadata.C4815d.C2286a;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p124a.C2128d;
import com.google.android.exoplayer2.p125b.C2160h;
import com.google.android.exoplayer2.source.C2321d;
import com.google.android.exoplayer2.text.C2333a;
import com.google.android.exoplayer2.text.C4826i.C2358a;
import com.google.android.exoplayer2.video.C2390e;
import java.util.List;

@TargetApi(16)
/* renamed from: com.google.android.exoplayer2.p */
public class C4032p implements C2195e {
    /* renamed from: a */
    protected final C4023l[] f16213a;
    /* renamed from: b */
    private final C2195e f16214b;
    /* renamed from: c */
    private final C4031a f16215c = new C4031a();
    /* renamed from: d */
    private final int f16216d;
    /* renamed from: e */
    private final int f16217e;
    /* renamed from: f */
    private Format f16218f;
    /* renamed from: g */
    private Format f16219g;
    /* renamed from: h */
    private Surface f16220h;
    /* renamed from: i */
    private boolean f16221i;
    /* renamed from: j */
    private int f16222j;
    /* renamed from: k */
    private SurfaceHolder f16223k;
    /* renamed from: l */
    private TextureView f16224l;
    /* renamed from: m */
    private C2358a f16225m;
    /* renamed from: n */
    private C2286a f16226n;
    /* renamed from: o */
    private C2310b f16227o;
    /* renamed from: p */
    private C2146c f16228p;
    /* renamed from: q */
    private C2390e f16229q;
    /* renamed from: r */
    private C2128d f16230r;
    /* renamed from: s */
    private C2128d f16231s;
    /* renamed from: t */
    private int f16232t;
    /* renamed from: u */
    private int f16233u;
    /* renamed from: v */
    private float f16234v;

    /* renamed from: com.google.android.exoplayer2.p$b */
    public interface C2310b {
        /* renamed from: a */
        void mo1450a();

        /* renamed from: a */
        void mo1452a(int i, int i2, int i3, float f);
    }

    /* renamed from: com.google.android.exoplayer2.p$a */
    private final class C4031a implements Callback, SurfaceTextureListener, C2146c, C2286a, C2358a, C2390e {
        /* renamed from: a */
        final /* synthetic */ C4032p f16212a;

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        private C4031a(C4032p c4032p) {
            this.f16212a = c4032p;
        }

        /* renamed from: a */
        public void mo1651a(C2128d c2128d) {
            this.f16212a.f16230r = c2128d;
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1651a(c2128d);
            }
        }

        /* renamed from: a */
        public void mo1653a(String str, long j, long j2) {
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1653a(str, j, j2);
            }
        }

        /* renamed from: a */
        public void mo1650a(Format format) {
            this.f16212a.f16218f = format;
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1650a(format);
            }
        }

        /* renamed from: a */
        public void mo1647a(int i, long j) {
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1647a(i, j);
            }
        }

        /* renamed from: a */
        public void mo1646a(int i, int i2, int i3, float f) {
            if (this.f16212a.f16227o != null) {
                this.f16212a.f16227o.mo1452a(i, i2, i3, f);
            }
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1646a(i, i2, i3, f);
            }
        }

        /* renamed from: a */
        public void mo1649a(Surface surface) {
            if (this.f16212a.f16227o != null && this.f16212a.f16220h == surface) {
                this.f16212a.f16227o.mo1450a();
            }
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1649a(surface);
            }
        }

        /* renamed from: b */
        public void mo1656b(C2128d c2128d) {
            if (this.f16212a.f16229q != null) {
                this.f16212a.f16229q.mo1656b(c2128d);
            }
            this.f16212a.f16218f = null;
            this.f16212a.f16230r = null;
        }

        /* renamed from: c */
        public void mo1658c(C2128d c2128d) {
            this.f16212a.f16231s = c2128d;
            if (this.f16212a.f16228p != null) {
                this.f16212a.f16228p.mo1658c(c2128d);
            }
        }

        /* renamed from: a */
        public void mo1645a(int i) {
            this.f16212a.f16232t = i;
            if (this.f16212a.f16228p != null) {
                this.f16212a.f16228p.mo1645a(i);
            }
        }

        /* renamed from: b */
        public void mo1657b(String str, long j, long j2) {
            if (this.f16212a.f16228p != null) {
                this.f16212a.f16228p.mo1657b(str, j, j2);
            }
        }

        /* renamed from: b */
        public void mo1655b(Format format) {
            this.f16212a.f16219g = format;
            if (this.f16212a.f16228p != null) {
                this.f16212a.f16228p.mo1655b(format);
            }
        }

        /* renamed from: a */
        public void mo1648a(int i, long j, long j2) {
            if (this.f16212a.f16228p != null) {
                this.f16212a.f16228p.mo1648a(i, j, j2);
            }
        }

        /* renamed from: d */
        public void mo1659d(C2128d c2128d) {
            if (this.f16212a.f16228p != null) {
                this.f16212a.f16228p.mo1659d(c2128d);
            }
            this.f16212a.f16219g = null;
            this.f16212a.f16231s = null;
            this.f16212a.f16232t = 0;
        }

        /* renamed from: a */
        public void mo1654a(List<C2333a> list) {
            if (this.f16212a.f16225m != null) {
                this.f16212a.f16225m.mo1654a(list);
            }
        }

        /* renamed from: a */
        public void mo1652a(Metadata metadata) {
            if (this.f16212a.f16226n != null) {
                this.f16212a.f16226n.mo1652a(metadata);
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f16212a.m20221a((Surface) surfaceHolder.getSurface(), false);
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f16212a.m20221a(null, false);
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f16212a.m20221a((Surface) new Surface(surfaceTexture), true);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f16212a.m20221a(null, true);
            return true;
        }
    }

    protected C4032p(C2308o c2308o, C2160h c2160h, C2275j c2275j) {
        this.f16213a = c2308o.mo1560a(new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()), this.f16215c, this.f16215c, this.f16215c, this.f16215c);
        int i = 0;
        int i2 = 0;
        for (C4023l a : this.f16213a) {
            switch (a.mo4028a()) {
                case 1:
                    i2++;
                    break;
                case 2:
                    i++;
                    break;
                default:
                    break;
            }
        }
        this.f16216d = i;
        this.f16217e = i2;
        this.f16234v = 1.0f;
        this.f16232t = 0;
        this.f16233u = 3;
        this.f16222j = 1;
        this.f16214b = new C4022g(this.f16213a, c2160h, c2275j);
    }

    /* renamed from: a */
    public void m20233a(Surface surface) {
        m20230j();
        m20221a(surface, false);
    }

    /* renamed from: a */
    public void m20231a(float f) {
        this.f16234v = f;
        C2194c[] c2194cArr = new C2194c[this.f16217e];
        int i = 0;
        for (C2193b c2193b : this.f16213a) {
            if (c2193b.mo4028a() == 1) {
                int i2 = i + 1;
                c2194cArr[i] = new C2194c(c2193b, 2, Float.valueOf(f));
                i = i2;
            }
        }
        this.f16214b.mo1627a(c2194cArr);
    }

    /* renamed from: h */
    public Format m20247h() {
        return this.f16219g;
    }

    /* renamed from: i */
    public int m20248i() {
        return this.f16232t;
    }

    /* renamed from: a */
    public void m20235a(C2310b c2310b) {
        this.f16227o = c2310b;
    }

    /* renamed from: a */
    public void mo1624a(C2192a c2192a) {
        this.f16214b.mo1624a(c2192a);
    }

    /* renamed from: a */
    public void mo1625a(C2321d c2321d) {
        this.f16214b.mo1625a(c2321d);
    }

    /* renamed from: a */
    public void mo1626a(boolean z) {
        this.f16214b.mo1626a(z);
    }

    /* renamed from: a */
    public boolean mo1628a() {
        return this.f16214b.mo1628a();
    }

    /* renamed from: b */
    public void mo1629b() {
        this.f16214b.mo1629b();
    }

    /* renamed from: a */
    public void mo1623a(long j) {
        this.f16214b.mo1623a(j);
    }

    /* renamed from: c */
    public void mo1631c() {
        this.f16214b.mo1631c();
    }

    /* renamed from: d */
    public void mo1632d() {
        this.f16214b.mo1632d();
        m20230j();
        if (this.f16220h != null) {
            if (this.f16221i) {
                this.f16220h.release();
            }
            this.f16220h = null;
        }
    }

    /* renamed from: a */
    public void mo1627a(C2194c... c2194cArr) {
        this.f16214b.mo1627a(c2194cArr);
    }

    /* renamed from: b */
    public void mo1630b(C2194c... c2194cArr) {
        this.f16214b.mo1630b(c2194cArr);
    }

    /* renamed from: e */
    public long mo1633e() {
        return this.f16214b.mo1633e();
    }

    /* renamed from: f */
    public long mo1634f() {
        return this.f16214b.mo1634f();
    }

    /* renamed from: g */
    public int mo1635g() {
        return this.f16214b.mo1635g();
    }

    /* renamed from: j */
    private void m20230j() {
        if (this.f16224l != null) {
            if (this.f16224l.getSurfaceTextureListener() != this.f16215c) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f16224l.setSurfaceTextureListener(null);
            }
            this.f16224l = null;
        }
        if (this.f16223k != null) {
            this.f16223k.removeCallback(this.f16215c);
            this.f16223k = null;
        }
    }

    /* renamed from: a */
    private void m20221a(Surface surface, boolean z) {
        C2194c[] c2194cArr = new C2194c[this.f16216d];
        int i = 0;
        for (C2193b c2193b : this.f16213a) {
            if (c2193b.mo4028a() == 2) {
                int i2 = i + 1;
                c2194cArr[i] = new C2194c(c2193b, 1, surface);
                i = i2;
            }
        }
        if (this.f16220h == null || this.f16220h == surface) {
            this.f16214b.mo1627a(c2194cArr);
        } else {
            if (this.f16221i) {
                this.f16220h.release();
            }
            this.f16214b.mo1630b(c2194cArr);
        }
        this.f16220h = surface;
        this.f16221i = z;
    }
}
