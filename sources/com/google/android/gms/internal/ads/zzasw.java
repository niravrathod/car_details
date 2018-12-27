package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzasw extends zzlz {
    /* renamed from: a */
    private final zzarg f19924a;
    /* renamed from: b */
    private final Object f19925b = new Object();
    /* renamed from: c */
    private final boolean f19926c;
    /* renamed from: d */
    private final boolean f19927d;
    @GuardedBy("lock")
    /* renamed from: e */
    private int f19928e;
    @GuardedBy("lock")
    /* renamed from: f */
    private zzmb f19929f;
    @GuardedBy("lock")
    /* renamed from: g */
    private boolean f19930g;
    @GuardedBy("lock")
    /* renamed from: h */
    private boolean f19931h = true;
    @GuardedBy("lock")
    /* renamed from: i */
    private float f19932i;
    @GuardedBy("lock")
    /* renamed from: j */
    private float f19933j;
    @GuardedBy("lock")
    /* renamed from: k */
    private float f19934k;
    @GuardedBy("lock")
    /* renamed from: l */
    private boolean f19935l;
    @GuardedBy("lock")
    /* renamed from: m */
    private boolean f19936m;

    public zzasw(zzarg zzarg, float f, boolean z, boolean z2) {
        this.f19924a = zzarg;
        this.f19932i = f;
        this.f19926c = z;
        this.f19927d = z2;
    }

    /* renamed from: a */
    public final void mo2552a() {
        m26355a("play", null);
    }

    /* renamed from: b */
    public final void mo2555b() {
        m26355a("pause", null);
    }

    /* renamed from: a */
    public final void mo2554a(boolean z) {
        m26355a(z ? "mute" : "unmute", null);
    }

    /* renamed from: a */
    public final void m26362a(zznf zznf) {
        m26365a(zznf.f20248a, zznf.f20249b, zznf.f20250c);
    }

    /* renamed from: a */
    public final void m26365a(boolean z, boolean z2, boolean z3) {
        synchronized (this.f19925b) {
            this.f19935l = z2;
            this.f19936m = z3;
        }
        m26355a("initialState", CollectionUtils.mapOf("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    /* renamed from: a */
    private final void m26355a(String str, Map<String, String> map) {
        map = map == null ? new HashMap() : new HashMap(map);
        map.put("action", str);
        zzapn.f8961a.execute(new gz(this, map));
    }

    /* renamed from: c */
    public final boolean mo2556c() {
        boolean z;
        synchronized (this.f19925b) {
            z = this.f19931h;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo2557d() {
        int i;
        synchronized (this.f19925b) {
            i = this.f19928e;
        }
        return i;
    }

    /* renamed from: e */
    public final float mo2558e() {
        float f;
        synchronized (this.f19925b) {
            f = this.f19934k;
        }
        return f;
    }

    /* renamed from: f */
    public final float mo2559f() {
        float f;
        synchronized (this.f19925b) {
            f = this.f19932i;
        }
        return f;
    }

    /* renamed from: g */
    public final float mo2560g() {
        float f;
        synchronized (this.f19925b) {
            f = this.f19933j;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo2553a(zzmb zzmb) {
        synchronized (this.f19925b) {
            this.f19929f = zzmb;
        }
    }

    /* renamed from: h */
    public final zzmb mo2561h() {
        zzmb zzmb;
        synchronized (this.f19925b) {
            zzmb = this.f19929f;
        }
        return zzmb;
    }

    /* renamed from: i */
    public final boolean mo2562i() {
        boolean z;
        synchronized (this.f19925b) {
            z = this.f19926c && this.f19935l;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo2563j() {
        boolean i = mo2562i();
        synchronized (this.f19925b) {
            if (!i) {
                if (this.f19936m && this.f19927d) {
                    i = true;
                }
            }
            i = false;
        }
        return i;
    }

    /* renamed from: a */
    public final void m26358a(float f) {
        synchronized (this.f19925b) {
            this.f19933j = f;
        }
    }

    /* renamed from: k */
    public final void m26375k() {
        boolean z;
        int i;
        synchronized (this.f19925b) {
            z = this.f19931h;
            i = this.f19928e;
            this.f19928e = 3;
        }
        m26356b(i, 3, z, z);
    }

    /* renamed from: a */
    public final void m26359a(float f, float f2, int i, boolean z, float f3) {
        synchronized (this.f19925b) {
            this.f19932i = f2;
            this.f19933j = f;
            f = this.f19931h;
            this.f19931h = z;
            f2 = this.f19928e;
            this.f19928e = i;
            float f4 = this.f19934k;
            this.f19934k = f3;
            if (Math.abs(this.f19934k - f4) > 1.0E-4f) {
                this.f19924a.getView().invalidate();
            }
        }
        m26356b(f2, i, f, z);
    }

    /* renamed from: b */
    private final void m26356b(int i, int i2, boolean z, boolean z2) {
        zzapn.f8961a.execute(new ha(this, i, i2, z, z2));
    }

    /* renamed from: a */
    final /* synthetic */ void m26360a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f19925b) {
            boolean z3 = false;
            i = i != i2 ? 1 : 0;
            Object obj = (this.f19930g || i2 != 1) ? null : 1;
            Object obj2 = (i == 0 || i2 != 1) ? null : 1;
            Object obj3 = (i == 0 || i2 != 2) ? null : 1;
            i = (i == 0 || i2 != 3) ? 0 : 1;
            i2 = z != z2 ? 1 : 0;
            if (this.f19930g || obj != null) {
                z3 = true;
            }
            this.f19930g = z3;
            if (this.f19929f) {
                if (obj != null) {
                    try {
                        this.f19929f.mo2564a();
                    } catch (boolean z4) {
                        zzaok.m10004c("Unable to call onVideoStart()", z4);
                    }
                }
                if (obj2 != null) {
                    try {
                        this.f19929f.mo2566b();
                    } catch (boolean z42) {
                        zzaok.m10004c("Unable to call onVideoPlay()", z42);
                    }
                }
                if (obj3 != null) {
                    try {
                        this.f19929f.mo2567c();
                    } catch (boolean z422) {
                        zzaok.m10004c("Unable to call onVideoPause()", z422);
                    }
                }
                if (i != 0) {
                    try {
                        this.f19929f.mo2568d();
                    } catch (int i3) {
                        zzaok.m10004c("Unable to call onVideoEnd()", i3);
                    }
                    this.f19924a.mo4765l();
                }
                if (i2 != 0) {
                    try {
                        this.f19929f.mo2565a(z2);
                    } catch (int i32) {
                        zzaok.m10004c("Unable to call onVideoMute()", i32);
                    }
                }
            } else {
                return;
            }
        }
        return;
    }

    /* renamed from: a */
    final /* synthetic */ void m26363a(Map map) {
        this.f19924a.mo4743a("pubVideoCmd", map);
    }
}
