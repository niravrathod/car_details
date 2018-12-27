package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzov extends zzqh {
    /* renamed from: a */
    private static final int f20255a = Color.rgb(12, 174, 206);
    /* renamed from: b */
    private static final int f20256b;
    /* renamed from: c */
    private static final int f20257c;
    /* renamed from: d */
    private static final int f20258d = f20255a;
    /* renamed from: e */
    private final String f20259e;
    /* renamed from: f */
    private final List<zzpa> f20260f = new ArrayList();
    /* renamed from: g */
    private final List<zzqk> f20261g = new ArrayList();
    /* renamed from: h */
    private final int f20262h;
    /* renamed from: i */
    private final int f20263i;
    /* renamed from: j */
    private final int f20264j;
    /* renamed from: k */
    private final int f20265k;
    /* renamed from: l */
    private final int f20266l;
    /* renamed from: m */
    private final boolean f20267m;

    public zzov(String str, List<zzpa> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f20259e = str;
        if (list != null) {
            for (str = null; str < list.size(); str++) {
                zzpa zzpa = (zzpa) list.get(str);
                this.f20260f.add(zzpa);
                this.f20261g.add(zzpa);
            }
        }
        this.f20262h = num != null ? num.intValue() : f20257c;
        this.f20263i = num2 != null ? num2.intValue() : f20258d;
        this.f20264j = num3 != null ? num3.intValue() : 12;
        this.f20265k = i;
        this.f20266l = i2;
        this.f20267m = z;
    }

    /* renamed from: a */
    public final String mo2611a() {
        return this.f20259e;
    }

    /* renamed from: b */
    public final List<zzqk> mo2612b() {
        return this.f20261g;
    }

    /* renamed from: c */
    public final List<zzpa> m26669c() {
        return this.f20260f;
    }

    /* renamed from: d */
    public final int m26670d() {
        return this.f20262h;
    }

    /* renamed from: e */
    public final int m26671e() {
        return this.f20263i;
    }

    /* renamed from: f */
    public final int m26672f() {
        return this.f20264j;
    }

    /* renamed from: g */
    public final int m26673g() {
        return this.f20265k;
    }

    /* renamed from: h */
    public final int m26674h() {
        return this.f20266l;
    }

    /* renamed from: i */
    public final boolean m26675i() {
        return this.f20267m;
    }

    static {
        int rgb = Color.rgb(204, 204, 204);
        f20256b = rgb;
        f20257c = rgb;
    }
}
