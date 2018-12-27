package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzaqr extends FrameLayout implements zzaqo {
    /* renamed from: a */
    private final zzarg f16892a;
    /* renamed from: b */
    private final FrameLayout f16893b;
    /* renamed from: c */
    private final zzoj f16894c;
    /* renamed from: d */
    private final gb f16895d;
    /* renamed from: e */
    private final long f16896e;
    /* renamed from: f */
    private zzaqp f16897f;
    /* renamed from: g */
    private boolean f16898g;
    /* renamed from: h */
    private boolean f16899h;
    /* renamed from: i */
    private boolean f16900i;
    /* renamed from: j */
    private boolean f16901j;
    /* renamed from: k */
    private long f16902k;
    /* renamed from: l */
    private long f16903l;
    /* renamed from: m */
    private String f16904m;
    /* renamed from: n */
    private Bitmap f16905n;
    /* renamed from: o */
    private ImageView f16906o;
    /* renamed from: p */
    private boolean f16907p;

    /* renamed from: a */
    public static void m21305a(zzarg zzarg) {
        Map hashMap = new HashMap();
        hashMap.put("event", "no_video_view");
        zzarg.mo4743a("onVideoEvent", hashMap);
    }

    /* renamed from: a */
    public static void m21307a(zzarg zzarg, Map<String, List<Map<String, Object>>> map) {
        Map hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("mimeTypes", map);
        zzarg.mo4743a("onVideoEvent", hashMap);
    }

    /* renamed from: a */
    public static void m21306a(zzarg zzarg, String str) {
        Map hashMap = new HashMap();
        hashMap.put("event", "decoderProps");
        hashMap.put("error", str);
        zzarg.mo4743a("onVideoEvent", hashMap);
    }

    public zzaqr(Context context, zzarg zzarg, int i, boolean z, zzoj zzoj, zzarf zzarf) {
        Context context2 = context;
        super(context);
        zzarg zzarg2 = zzarg;
        this.f16892a = zzarg2;
        zzoj zzoj2 = zzoj;
        this.f16894c = zzoj2;
        this.f16893b = new FrameLayout(context);
        addView(this.f16893b, new LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzarg.mo4200e());
        this.f16897f = zzarg.mo4200e().zzxk.mo2386a(context, zzarg2, i, z, zzoj2, zzarf);
        if (this.f16897f != null) {
            r0.f16893b.addView(r0.f16897f, new LayoutParams(-1, -1, 17));
            if (((Boolean) zzkd.m10713e().m10897a(zznw.f9724v)).booleanValue()) {
                m21331m();
            }
        }
        r0.f16906o = new ImageView(context);
        r0.f16896e = ((Long) zzkd.m10713e().m10897a(zznw.f9728z)).longValue();
        r0.f16901j = ((Boolean) zzkd.m10713e().m10897a(zznw.f9726x)).booleanValue();
        if (r0.f16894c != null) {
            r0.f16894c.m10929a("spinner_used", r0.f16901j ? "1" : "0");
        }
        r0.f16895d = new gb(this);
        if (r0.f16897f != null) {
            r0.f16897f.mo4186a((zzaqo) this);
        }
        if (r0.f16897f == null) {
            mo2378a("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    /* renamed from: a */
    public final void m21315a(int i, int i2, int i3, int i4) {
        if (i3 != 0) {
            if (i4 != 0) {
                ViewGroup.LayoutParams layoutParams = new LayoutParams(i3, i4);
                layoutParams.setMargins(i, i2, 0, 0);
                this.f16893b.setLayoutParams(layoutParams);
                requestLayout();
            }
        }
    }

    /* renamed from: a */
    public final void m21317a(String str) {
        this.f16904m = str;
    }

    /* renamed from: a */
    public final void m21312a(float f, float f2) {
        if (this.f16897f != null) {
            this.f16897f.mo4184a(f, f2);
        }
    }

    /* renamed from: h */
    public final void m21326h() {
        if (this.f16897f != null) {
            if (TextUtils.isEmpty(this.f16904m)) {
                m21308a("no_src", new String[0]);
            } else {
                this.f16897f.setVideoPath(this.f16904m);
            }
        }
    }

    /* renamed from: i */
    public final void m21327i() {
        if (this.f16897f != null) {
            this.f16897f.mo4189d();
        }
    }

    /* renamed from: j */
    public final void m21328j() {
        if (this.f16897f != null) {
            this.f16897f.mo4188c();
        }
    }

    /* renamed from: a */
    public final void m21313a(int i) {
        if (this.f16897f != null) {
            this.f16897f.mo4185a(i);
        }
    }

    /* renamed from: k */
    public final void m21329k() {
        if (this.f16897f != null) {
            zzaqp zzaqp = this.f16897f;
            zzaqp.f16891b.m10080a(true);
            zzaqp.mo2375e();
        }
    }

    /* renamed from: l */
    public final void m21330l() {
        if (this.f16897f != null) {
            zzaqp zzaqp = this.f16897f;
            zzaqp.f16891b.m10080a(false);
            zzaqp.mo2375e();
        }
    }

    public final void setVolume(float f) {
        if (this.f16897f != null) {
            zzaqp zzaqp = this.f16897f;
            zzaqp.f16891b.m10079a(f);
            zzaqp.mo2375e();
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public final void m21316a(MotionEvent motionEvent) {
        if (this.f16897f != null) {
            this.f16897f.dispatchTouchEvent(motionEvent);
        }
    }

    @TargetApi(14)
    /* renamed from: m */
    public final void m21331m() {
        if (this.f16897f != null) {
            View textView = new TextView(this.f16897f.getContext());
            String str = "AdMob - ";
            String valueOf = String.valueOf(this.f16897f.mo4183a());
            textView.setText(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            textView.setTextColor(-65536);
            textView.setBackgroundColor(-256);
            this.f16893b.addView(textView, new LayoutParams(-2, -2, 17));
            this.f16893b.bringChildToFront(textView);
        }
    }

    /* renamed from: a */
    public final void mo2376a() {
        this.f16895d.m8938b();
        zzalo.f8872a.post(new fu(this));
    }

    /* renamed from: b */
    public final void mo2379b() {
        if (this.f16897f != null && this.f16903l == 0) {
            float duration = ((float) this.f16897f.getDuration()) / 1000.0f;
            int videoWidth = this.f16897f.getVideoWidth();
            int videoHeight = this.f16897f.getVideoHeight();
            m21308a("canplaythrough", "duration", String.valueOf(duration), "videoWidth", String.valueOf(videoWidth), "videoHeight", String.valueOf(videoHeight));
        }
    }

    /* renamed from: c */
    public final void mo2380c() {
        if (!(this.f16892a.mo4199d() == null || this.f16899h)) {
            this.f16900i = (this.f16892a.mo4199d().getWindow().getAttributes().flags & 128) != 0;
            if (!this.f16900i) {
                this.f16892a.mo4199d().getWindow().addFlags(128);
                this.f16899h = true;
            }
        }
        this.f16898g = true;
    }

    /* renamed from: d */
    public final void mo2381d() {
        m21308a("pause", new String[0]);
        m21310q();
        this.f16898g = false;
    }

    /* renamed from: e */
    public final void mo2382e() {
        m21308a("ended", new String[0]);
        m21310q();
    }

    /* renamed from: a */
    public final void mo2378a(String str, String str2) {
        m21308a("error", "what", str, "extra", str2);
    }

    /* renamed from: f */
    public final void mo2383f() {
        if (!(!this.f16907p || this.f16905n == null || m21309p())) {
            this.f16906o.setImageBitmap(this.f16905n);
            this.f16906o.invalidate();
            this.f16893b.addView(this.f16906o, new LayoutParams(-1, -1));
            this.f16893b.bringChildToFront(this.f16906o);
        }
        this.f16895d.m8937a();
        this.f16903l = this.f16902k;
        zzalo.f8872a.post(new fv(this));
    }

    /* renamed from: n */
    public final void m21332n() {
        this.f16895d.m8937a();
        if (this.f16897f != null) {
            this.f16897f.mo4187b();
        }
        m21310q();
    }

    public final void finalize() {
        try {
            this.f16895d.m8937a();
            if (this.f16897f != null) {
                zzaqp zzaqp = this.f16897f;
                Executor executor = zzapn.f8961a;
                zzaqp.getClass();
                executor.execute(fs.m8929a(zzaqp));
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /* renamed from: o */
    final void m21333o() {
        if (this.f16897f != null) {
            long currentPosition = (long) this.f16897f.getCurrentPosition();
            if (this.f16902k != currentPosition && currentPosition > 0) {
                float f = ((float) currentPosition) / 1000.0f;
                m21308a("timeupdate", "time", String.valueOf(f));
                this.f16902k = currentPosition;
            }
        }
    }

    /* renamed from: g */
    public final void mo2384g() {
        if (this.f16898g && m21309p()) {
            this.f16893b.removeView(this.f16906o);
        }
        if (this.f16905n != null) {
            long elapsedRealtime = zzbv.zzer().elapsedRealtime();
            if (this.f16897f.getBitmap(this.f16905n) != null) {
                this.f16907p = true;
            }
            long elapsedRealtime2 = zzbv.zzer().elapsedRealtime() - elapsedRealtime;
            if (zzalg.m21226a()) {
                StringBuilder stringBuilder = new StringBuilder(46);
                stringBuilder.append("Spinner frame grab took ");
                stringBuilder.append(elapsedRealtime2);
                stringBuilder.append("ms");
                zzalg.m21225a(stringBuilder.toString());
            }
            if (elapsedRealtime2 > this.f16896e) {
                zzaok.m10007e("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.f16901j = false;
                this.f16905n = null;
                if (this.f16894c != null) {
                    this.f16894c.m10929a("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2377a(int i, int i2) {
        if (this.f16901j) {
            i = Math.max(i / ((Integer) zzkd.m10713e().m10897a(zznw.f9727y)).intValue(), 1);
            i2 = Math.max(i2 / ((Integer) zzkd.m10713e().m10897a(zznw.f9727y)).intValue(), 1);
            if (this.f16905n == null || this.f16905n.getWidth() != i || this.f16905n.getHeight() != i2) {
                this.f16905n = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f16907p = false;
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f16895d.m8938b();
        } else {
            this.f16895d.m8937a();
            this.f16903l = this.f16902k;
        }
        zzalo.f8872a.post(new ft(this, z));
    }

    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f16895d.m8938b();
            i = 1;
        } else {
            this.f16895d.m8937a();
            this.f16903l = this.f16902k;
            i = 0;
        }
        zzalo.f8872a.post(new fw(this, i));
    }

    /* renamed from: p */
    private final boolean m21309p() {
        return this.f16906o.getParent() != null;
    }

    /* renamed from: a */
    private final void m21308a(String str, String... strArr) {
        Map hashMap = new HashMap();
        hashMap.put("event", str);
        Object obj = null;
        for (Object obj2 : strArr) {
            if (obj == null) {
                obj = obj2;
            } else {
                hashMap.put(obj, obj2);
                obj = null;
            }
        }
        this.f16892a.mo4743a("onVideoEvent", hashMap);
    }

    /* renamed from: q */
    private final void m21310q() {
        if (!(this.f16892a.mo4199d() == null || !this.f16899h || this.f16900i)) {
            this.f16892a.mo4199d().getWindow().clearFlags(128);
            this.f16899h = false;
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m21319a(boolean z) {
        m21308a("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
