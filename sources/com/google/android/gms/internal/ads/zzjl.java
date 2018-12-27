package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzjl {
    /* renamed from: a */
    private long f9545a;
    /* renamed from: b */
    private Bundle f9546b;
    /* renamed from: c */
    private int f9547c;
    /* renamed from: d */
    private List<String> f9548d;
    /* renamed from: e */
    private boolean f9549e;
    /* renamed from: f */
    private int f9550f;
    /* renamed from: g */
    private boolean f9551g;
    /* renamed from: h */
    private String f9552h;
    /* renamed from: i */
    private zznb f9553i;
    /* renamed from: j */
    private Location f9554j;
    /* renamed from: k */
    private String f9555k;
    /* renamed from: l */
    private Bundle f9556l;
    /* renamed from: m */
    private Bundle f9557m;
    /* renamed from: n */
    private List<String> f9558n;
    /* renamed from: o */
    private String f9559o;
    /* renamed from: p */
    private String f9560p;
    /* renamed from: q */
    private boolean f9561q;
    /* renamed from: r */
    private zzje f9562r;
    /* renamed from: s */
    private int f9563s;
    /* renamed from: t */
    private String f9564t;

    public zzjl() {
        this.f9545a = -1;
        this.f9546b = new Bundle();
        this.f9547c = -1;
        this.f9548d = new ArrayList();
        this.f9549e = false;
        this.f9550f = -1;
        this.f9551g = false;
        this.f9552h = null;
        this.f9553i = null;
        this.f9554j = null;
        this.f9555k = null;
        this.f9556l = new Bundle();
        this.f9557m = new Bundle();
        this.f9558n = new ArrayList();
        this.f9559o = null;
        this.f9560p = null;
        this.f9561q = false;
        this.f9563s = -1;
        this.f9564t = null;
    }

    public zzjl(zzjk zzjk) {
        this.f9545a = zzjk.f20207b;
        this.f9546b = zzjk.f20208c;
        this.f9547c = zzjk.f20209d;
        this.f9548d = zzjk.f20210e;
        this.f9549e = zzjk.f20211f;
        this.f9550f = zzjk.f20212g;
        this.f9551g = zzjk.f20213h;
        this.f9552h = zzjk.f20214i;
        this.f9553i = zzjk.f20215j;
        this.f9554j = zzjk.f20216k;
        this.f9555k = zzjk.f20217l;
        this.f9556l = zzjk.f20218m;
        this.f9557m = zzjk.f20219n;
        this.f9558n = zzjk.f20220o;
        this.f9559o = zzjk.f20221p;
        this.f9560p = zzjk.f20222q;
        this.f9561q = zzjk.f20223r;
        this.f9562r = zzjk.f20224s;
        this.f9563s = zzjk.f20225t;
        this.f9564t = zzjk.f20226u;
    }

    /* renamed from: a */
    public final zzjk m10690a() {
        return new zzjk(8, this.f9545a, this.f9546b, this.f9547c, this.f9548d, this.f9549e, this.f9550f, this.f9551g, this.f9552h, this.f9553i, this.f9554j, this.f9555k, this.f9556l, this.f9557m, this.f9558n, this.f9559o, this.f9560p, this.f9561q, this.f9562r, this.f9563s, this.f9564t);
    }

    /* renamed from: a */
    public final zzjl m10691a(Location location) {
        this.f9554j = null;
        return this;
    }
}
