package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.TimeUnit;

@zzaer
public final class zzarh {
    /* renamed from: a */
    private final Context f8986a;
    /* renamed from: b */
    private final String f8987b;
    /* renamed from: c */
    private final zzaop f8988c;
    /* renamed from: d */
    private final zzoh f8989d;
    /* renamed from: e */
    private final zzoj f8990e;
    /* renamed from: f */
    private final zzamv f8991f = new zzamy().m9916a("min_1", Double.MIN_VALUE, 1.0d).m9916a("1_5", 1.0d, 5.0d).m9916a("5_10", 5.0d, 10.0d).m9916a("10_20", 10.0d, 20.0d).m9916a("20_30", 20.0d, 30.0d).m9916a("30_max", 30.0d, Double.MAX_VALUE).m9915a();
    /* renamed from: g */
    private final long[] f8992g;
    /* renamed from: h */
    private final String[] f8993h;
    /* renamed from: i */
    private boolean f8994i = false;
    /* renamed from: j */
    private boolean f8995j = false;
    /* renamed from: k */
    private boolean f8996k = false;
    /* renamed from: l */
    private boolean f8997l = false;
    /* renamed from: m */
    private boolean f8998m;
    /* renamed from: n */
    private zzaqp f8999n;
    /* renamed from: o */
    private boolean f9000o;
    /* renamed from: p */
    private boolean f9001p;
    /* renamed from: q */
    private long f9002q = -1;

    public zzarh(Context context, zzaop zzaop, String str, zzoj zzoj, zzoh zzoh) {
        this.f8986a = context;
        this.f8988c = zzaop;
        this.f8987b = str;
        this.f8990e = zzoj;
        this.f8989d = zzoh;
        String str2 = (String) zzkd.m10713e().m10897a(zznw.f9722t);
        if (str2 == null) {
            r1.f8993h = new String[0];
            r1.f8992g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        r1.f8993h = new String[split.length];
        r1.f8992g = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            try {
                r1.f8992g[i] = Long.parseLong(split[i]);
            } catch (Throwable e) {
                zzaok.m10004c("Unable to parse frame hash target time number.", e);
                r1.f8992g[i] = -1;
            }
        }
    }

    /* renamed from: a */
    public final void m10072a(zzaqp zzaqp) {
        zzoc.m10917a(this.f8990e, this.f8989d, "vpc2");
        this.f8994i = true;
        if (this.f8990e != null) {
            this.f8990e.m10929a("vpn", zzaqp.mo4183a());
        }
        this.f8999n = zzaqp;
    }

    /* renamed from: a */
    public final void m10071a() {
        if (this.f8994i) {
            if (!this.f8995j) {
                zzoc.m10917a(this.f8990e, this.f8989d, "vfr2");
                this.f8995j = true;
            }
        }
    }

    /* renamed from: b */
    public final void m10073b() {
        if (((Boolean) zzkd.m10713e().m10897a(zznw.f9721s)).booleanValue() && !this.f9000o) {
            String valueOf;
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", this.f8987b);
            bundle.putString("player", this.f8999n.mo4183a());
            for (zzamx zzamx : this.f8991f.m9910a()) {
                valueOf = String.valueOf("fps_c_");
                String valueOf2 = String.valueOf(zzamx.f8909a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Integer.toString(zzamx.f8911c));
                valueOf = String.valueOf("fps_p_");
                valueOf2 = String.valueOf(zzamx.f8909a);
                bundle.putString(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), Double.toString(zzamx.f8910b));
            }
            for (int i = 0; i < this.f8992g.length; i++) {
                String str = this.f8993h[i];
                if (str != null) {
                    valueOf = String.valueOf(Long.valueOf(this.f8992g[i]));
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder.append("fh_");
                    stringBuilder.append(valueOf);
                    bundle.putString(stringBuilder.toString(), str);
                }
            }
            zzbv.zzek().m9835a(this.f8986a, this.f8988c.f19893a, "gmob-apps", bundle, true);
            this.f9000o = true;
        }
    }

    /* renamed from: b */
    public final void m10074b(zzaqp zzaqp) {
        if (this.f8996k && !r0.f8997l) {
            if (zzalg.m21226a() && !r0.f8997l) {
                zzalg.m21225a("VideoMetricsMixin first frame");
            }
            zzoc.m10917a(r0.f8990e, r0.f8989d, "vff2");
            r0.f8997l = true;
        }
        long nanoTime = zzbv.zzer().nanoTime();
        if (r0.f8998m && r0.f9001p && r0.f9002q != -1) {
            double toNanos = (double) TimeUnit.SECONDS.toNanos(1);
            double d = (double) (nanoTime - r0.f9002q);
            Double.isNaN(toNanos);
            Double.isNaN(d);
            r0.f8991f.m9911a(toNanos / d);
        }
        r0.f9001p = r0.f8998m;
        r0.f9002q = nanoTime;
        nanoTime = ((Long) zzkd.m10713e().m10897a(zznw.f9723u)).longValue();
        long currentPosition = (long) zzaqp.getCurrentPosition();
        int i = 0;
        while (i < r0.f8993h.length) {
            if (r0.f8993h[i] != null || nanoTime <= Math.abs(currentPosition - r0.f8992g[i])) {
                zzaqp zzaqp2 = zzaqp;
                i++;
            } else {
                String[] strArr = r0.f8993h;
                int i2 = 8;
                Bitmap bitmap = zzaqp.getBitmap(8, 8);
                long j = 63;
                int i3 = 0;
                long j2 = 0;
                while (i3 < i2) {
                    long j3 = j;
                    j = j2;
                    int i4 = 0;
                    while (i4 < i2) {
                        int pixel = bitmap.getPixel(i4, i3);
                        j |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1 : 0) << ((int) j3);
                        i4++;
                        j3--;
                        i2 = 8;
                    }
                    i3++;
                    j2 = j;
                    i2 = 8;
                    j = j3;
                }
                strArr[i] = String.format("%016X", new Object[]{Long.valueOf(j2)});
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m10075c() {
        this.f8998m = true;
        if (this.f8995j && !this.f8996k) {
            zzoc.m10917a(this.f8990e, this.f8989d, "vfp2");
            this.f8996k = true;
        }
    }

    /* renamed from: d */
    public final void m10076d() {
        this.f8998m = false;
    }
}
