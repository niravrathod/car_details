package com.google.android.gms.ads.internal;

import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.overlay.zza;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzabt;
import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaes;
import com.google.android.gms.internal.ads.zzahi;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzalw;
import com.google.android.gms.internal.ads.zzamb;
import com.google.android.gms.internal.ads.zzamc;
import com.google.android.gms.internal.ads.zzamd;
import com.google.android.gms.internal.ads.zzame;
import com.google.android.gms.internal.ads.zzamf;
import com.google.android.gms.internal.ads.zzamg;
import com.google.android.gms.internal.ads.zzamh;
import com.google.android.gms.internal.ads.zzamq;
import com.google.android.gms.internal.ads.zzanm;
import com.google.android.gms.internal.ads.zzann;
import com.google.android.gms.internal.ads.zzanw;
import com.google.android.gms.internal.ads.zzapt;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzarq;
import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzgj;
import com.google.android.gms.internal.ads.zzhf;
import com.google.android.gms.internal.ads.zzhg;
import com.google.android.gms.internal.ads.zzhu;
import com.google.android.gms.internal.ads.zzob;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzvn;
import com.google.android.gms.internal.ads.zzxd;
import com.google.android.gms.internal.ads.zzyg;

@zzaer
public final class zzbv {
    /* renamed from: a */
    private static zzbv f7752a = new zzbv();
    /* renamed from: A */
    private final zzann f7753A;
    /* renamed from: B */
    private final zzabt f7754B;
    /* renamed from: C */
    private final zzhu f7755C;
    /* renamed from: D */
    private final zzakd f7756D;
    /* renamed from: E */
    private final zzanw f7757E;
    /* renamed from: F */
    private final zzarq f7758F;
    /* renamed from: G */
    private final zzaqa f7759G;
    /* renamed from: b */
    private final zza f7760b;
    /* renamed from: c */
    private final zzaes f7761c;
    /* renamed from: d */
    private final zzl f7762d;
    /* renamed from: e */
    private final zzacs f7763e;
    /* renamed from: f */
    private final zzalo f7764f;
    /* renamed from: g */
    private final zzasm f7765g;
    /* renamed from: h */
    private final zzalw f7766h;
    /* renamed from: i */
    private final zzgj f7767i;
    /* renamed from: j */
    private final zzakr f7768j;
    /* renamed from: k */
    private final zzamh f7769k;
    /* renamed from: l */
    private final zzhf f7770l;
    /* renamed from: m */
    private final zzhg f7771m;
    /* renamed from: n */
    private final Clock f7772n;
    /* renamed from: o */
    private final zzad f7773o;
    /* renamed from: p */
    private final zzob f7774p;
    /* renamed from: q */
    private final zzamq f7775q;
    /* renamed from: r */
    private final zzahi f7776r;
    /* renamed from: s */
    private final zzvn f7777s;
    /* renamed from: t */
    private final zzapt f7778t;
    /* renamed from: u */
    private final zzuv f7779u;
    /* renamed from: v */
    private final zzxd f7780v;
    /* renamed from: w */
    private final zzanm f7781w;
    /* renamed from: x */
    private final zzu f7782x;
    /* renamed from: y */
    private final zzv f7783y;
    /* renamed from: z */
    private final zzyg f7784z;

    protected zzbv() {
        zzalw zzamg;
        zza zza = new zza();
        zzaes zzaes = new zzaes();
        zzl zzl = new zzl();
        zzacs zzacs = new zzacs();
        zzalo zzalo = new zzalo();
        zzasm zzasm = new zzasm();
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            zzamg = new zzamg();
        } else if (i >= 19) {
            zzamg = new zzamf();
        } else if (i >= 18) {
            zzamg = new zzamd();
        } else if (i >= 17) {
            zzamg = new zzamc();
        } else if (i >= 16) {
            zzamg = new zzame();
        } else {
            zzamg = new zzamb();
        }
        zzalw zzalw = zzamg;
        zzgj zzgj = r0;
        zzgj zzgj2 = new zzgj();
        zzakr zzakr = r0;
        zzakr zzakr2 = new zzakr();
        zzamh zzamh = r0;
        zzamh zzamh2 = new zzamh();
        zzhf zzhf = r0;
        zzhf zzhf2 = new zzhf();
        zzhg zzhg = r0;
        zzhg zzhg2 = new zzhg();
        Clock instance = DefaultClock.getInstance();
        zzad zzad = r0;
        zzad zzad2 = new zzad();
        zzob zzob = r0;
        zzob zzob2 = new zzob();
        zzamq zzamq = r0;
        zzamq zzamq2 = new zzamq();
        zzahi zzahi = r0;
        zzahi zzahi2 = new zzahi();
        zzvn zzvn = r0;
        zzvn zzvn2 = new zzvn();
        zzapt zzapt = r0;
        zzapt zzapt2 = new zzapt();
        zzxd zzxd = r0;
        zzxd zzxd2 = new zzxd();
        zzanm zzanm = r0;
        zzanm zzanm2 = new zzanm();
        zzu zzu = r0;
        zzu zzu2 = new zzu();
        zzv zzv = r0;
        zzv zzv2 = new zzv();
        zzyg zzyg = r0;
        zzyg zzyg2 = new zzyg();
        zzann zzann = r0;
        zzann zzann2 = new zzann();
        zzabt zzabt = r0;
        zzabt zzabt2 = new zzabt();
        zzhu zzhu = r0;
        zzhu zzhu2 = new zzhu();
        zzakd zzakd = r0;
        zzakd zzakd2 = new zzakd();
        zzanw zzanw = r0;
        zzanw zzanw2 = new zzanw();
        zzarq zzarq = r0;
        zzarq zzarq2 = new zzarq();
        zzaqa zzaqa = r0;
        zzaqa zzaqa2 = new zzaqa();
        this(zza, zzaes, zzl, zzacs, zzalo, zzasm, zzalw, zzgj, zzakr, zzamh, zzhf, zzhg, instance, zzad, zzob, zzamq, zzahi, zzvn, zzapt, zzxd, zzanm, zzu, zzv, zzyg, zzann, zzabt, zzhu, zzakd, zzanw, zzarq, zzaqa);
    }

    private zzbv(zza zza, zzaes zzaes, zzl zzl, zzacs zzacs, zzalo zzalo, zzasm zzasm, zzalw zzalw, zzgj zzgj, zzakr zzakr, zzamh zzamh, zzhf zzhf, zzhg zzhg, Clock clock, zzad zzad, zzob zzob, zzamq zzamq, zzahi zzahi, zzvn zzvn, zzapt zzapt, zzxd zzxd, zzanm zzanm, zzu zzu, zzv zzv, zzyg zzyg, zzann zzann, zzabt zzabt, zzhu zzhu, zzakd zzakd, zzanw zzanw, zzarq zzarq, zzaqa zzaqa) {
        this.f7760b = zza;
        this.f7761c = zzaes;
        this.f7762d = zzl;
        this.f7763e = zzacs;
        this.f7764f = zzalo;
        this.f7765g = zzasm;
        this.f7766h = zzalw;
        this.f7767i = zzgj;
        this.f7768j = zzakr;
        this.f7769k = zzamh;
        this.f7770l = zzhf;
        this.f7771m = zzhg;
        this.f7772n = clock;
        this.f7773o = zzad;
        this.f7774p = zzob;
        this.f7775q = zzamq;
        this.f7776r = zzahi;
        this.f7777s = zzvn;
        this.f7778t = zzapt;
        this.f7779u = new zzuv();
        this.f7780v = zzxd;
        this.f7781w = zzanm;
        this.f7782x = zzu;
        this.f7783y = zzv;
        this.f7784z = zzyg;
        this.f7753A = zzann;
        this.f7754B = zzabt;
        this.f7755C = zzhu;
        this.f7756D = zzakd;
        this.f7757E = zzanw;
        this.f7758F = zzarq;
        this.f7759G = zzaqa;
    }

    public static zzaes zzeg() {
        return f7752a.f7761c;
    }

    public static zza zzeh() {
        return f7752a.f7760b;
    }

    public static zzl zzei() {
        return f7752a.f7762d;
    }

    public static zzacs zzej() {
        return f7752a.f7763e;
    }

    public static zzalo zzek() {
        return f7752a.f7764f;
    }

    public static zzasm zzel() {
        return f7752a.f7765g;
    }

    public static zzalw zzem() {
        return f7752a.f7766h;
    }

    public static zzgj zzen() {
        return f7752a.f7767i;
    }

    public static zzakr zzeo() {
        return f7752a.f7768j;
    }

    public static zzamh zzep() {
        return f7752a.f7769k;
    }

    public static zzhg zzeq() {
        return f7752a.f7771m;
    }

    public static Clock zzer() {
        return f7752a.f7772n;
    }

    public static zzad zzes() {
        return f7752a.f7773o;
    }

    public static zzob zzet() {
        return f7752a.f7774p;
    }

    public static zzamq zzeu() {
        return f7752a.f7775q;
    }

    public static zzahi zzev() {
        return f7752a.f7776r;
    }

    public static zzvn zzew() {
        return f7752a.f7777s;
    }

    public static zzapt zzex() {
        return f7752a.f7778t;
    }

    public static zzuv zzey() {
        return f7752a.f7779u;
    }

    public static zzxd zzez() {
        return f7752a.f7780v;
    }

    public static zzanm zzfa() {
        return f7752a.f7781w;
    }

    public static zzabt zzfb() {
        return f7752a.f7754B;
    }

    public static zzu zzfc() {
        return f7752a.f7782x;
    }

    public static zzv zzfd() {
        return f7752a.f7783y;
    }

    public static zzyg zzfe() {
        return f7752a.f7784z;
    }

    public static zzann zzff() {
        return f7752a.f7753A;
    }

    public static zzanw zzfg() {
        return f7752a.f7757E;
    }

    public static zzarq zzfh() {
        return f7752a.f7758F;
    }

    public static zzaqa zzfi() {
        return f7752a.f7759G;
    }

    public static zzakd zzfj() {
        return f7752a.f7756D;
    }
}
