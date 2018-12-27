package com.google.android.gms.internal.ads;

import java.util.List;

final class ab implements zzaot<List<zzpa>, zzov> {
    /* renamed from: a */
    private final /* synthetic */ String f16392a;
    /* renamed from: b */
    private final /* synthetic */ Integer f16393b;
    /* renamed from: c */
    private final /* synthetic */ Integer f16394c;
    /* renamed from: d */
    private final /* synthetic */ int f16395d;
    /* renamed from: e */
    private final /* synthetic */ int f16396e;
    /* renamed from: f */
    private final /* synthetic */ int f16397f;
    /* renamed from: g */
    private final /* synthetic */ int f16398g;
    /* renamed from: h */
    private final /* synthetic */ boolean f16399h;

    ab(zzadd zzadd, String str, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        this.f16392a = str;
        this.f16393b = num;
        this.f16394c = num2;
        this.f16395d = i;
        this.f16396e = i2;
        this.f16397f = i3;
        this.f16398g = i4;
        this.f16399h = z;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1932a(Object obj) {
        List list = (List) obj;
        Integer num = null;
        if (list != null) {
            if (!list.isEmpty()) {
                String str = this.f16392a;
                Integer num2 = this.f16393b;
                Integer num3 = this.f16394c;
                if (this.f16395d > 0) {
                    num = Integer.valueOf(this.f16395d);
                }
                return new zzov(str, list, num2, num3, num, this.f16396e + this.f16397f, this.f16398g, this.f16399h);
            }
        }
        return null;
    }
}
