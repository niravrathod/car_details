package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
final class uv {
    /* renamed from: a */
    private static final zzuz f8424a = zzuz.m11133a();
    /* renamed from: b */
    private static final float f8425b = ((Float) zzkd.m10713e().m10897a(zznw.aN)).floatValue();
    /* renamed from: c */
    private static final long f8426c = ((Long) zzkd.m10713e().m10897a(zznw.aL)).longValue();
    /* renamed from: d */
    private static final float f8427d = ((Float) zzkd.m10713e().m10897a(zznw.aO)).floatValue();
    /* renamed from: e */
    private static final long f8428e = ((Long) zzkd.m10713e().m10897a(zznw.aM)).longValue();

    /* renamed from: a */
    static boolean m9402a() {
        int h = f8424a.m11141h();
        int i = f8424a.m11142i();
        int g = f8424a.m11140g() + f8424a.m11139f();
        int i2 = BaseClientBuilder.API_PRIORITY_OTHER;
        int a = (h >= 16 || f8428e == 0) ? f8427d != 0.0f ? ((int) (f8427d * ((float) h))) + 1 : BaseClientBuilder.API_PRIORITY_OTHER : m9401a(f8428e, h);
        if (i <= a) {
            if (h < 16 && f8426c != 0) {
                i2 = m9401a(f8426c, h);
            } else if (f8425b != 0.0f) {
                i2 = (int) (f8425b * ((float) h));
            }
            if (g <= i2) {
                return true;
            }
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: a */
    private static int m9401a(long j, int i) {
        return (int) ((j >>> ((i % 16) * 4)) & 15);
    }
}
