package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.v4.p017f.C0433m;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkj;
import com.google.android.gms.internal.ads.zzkm;
import com.google.android.gms.internal.ads.zzkq;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzpy;
import com.google.android.gms.internal.ads.zzrk;
import com.google.android.gms.internal.ads.zzrn;
import com.google.android.gms.internal.ads.zzrq;
import com.google.android.gms.internal.ads.zzrt;
import com.google.android.gms.internal.ads.zzrw;
import com.google.android.gms.internal.ads.zzrz;
import com.google.android.gms.internal.ads.zzti;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zzyn;

@zzaer
public final class zzak extends zzkq {
    /* renamed from: a */
    private zzkj f19562a;
    /* renamed from: b */
    private zzrk f19563b;
    /* renamed from: c */
    private zzrz f19564c;
    /* renamed from: d */
    private zzrn f19565d;
    /* renamed from: e */
    private C0433m<String, zzrq> f19566e = new C0433m();
    /* renamed from: f */
    private C0433m<String, zzrt> f19567f = new C0433m();
    /* renamed from: g */
    private zzrw f19568g;
    /* renamed from: h */
    private zzjo f19569h;
    /* renamed from: i */
    private PublisherAdViewOptions f19570i;
    /* renamed from: j */
    private zzpy f19571j;
    /* renamed from: k */
    private zzti f19572k;
    /* renamed from: l */
    private zzto f19573l;
    /* renamed from: m */
    private zzli f19574m;
    /* renamed from: n */
    private final Context f19575n;
    /* renamed from: o */
    private final zzyn f19576o;
    /* renamed from: p */
    private final String f19577p;
    /* renamed from: q */
    private final zzaop f19578q;
    /* renamed from: r */
    private final zzv f19579r;

    public zzak(Context context, String str, zzyn zzyn, zzaop zzaop, zzv zzv) {
        this.f19575n = context;
        this.f19577p = str;
        this.f19576o = zzyn;
        this.f19578q = zzaop;
        this.f19579r = zzv;
    }

    public final zzkm zzdi() {
        return new zzah(this.f19575n, this.f19577p, this.f19576o, this.f19578q, this.f19562a, this.f19563b, this.f19564c, this.f19573l, this.f19565d, this.f19567f, this.f19566e, this.f19571j, this.f19572k, this.f19574m, this.f19579r, this.f19568g, this.f19569h, this.f19570i);
    }

    public final void zzb(zzkj zzkj) {
        this.f19562a = zzkj;
    }

    public final void zza(zzpy zzpy) {
        this.f19571j = zzpy;
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.f19570i = publisherAdViewOptions;
    }

    public final void zzb(zzli zzli) {
        this.f19574m = zzli;
    }

    public final void zza(zzti zzti) {
        this.f19572k = zzti;
    }

    public final void zza(zzrn zzrn) {
        this.f19565d = zzrn;
    }

    public final void zza(zzrk zzrk) {
        this.f19563b = zzrk;
    }

    public final void zza(zzrz zzrz) {
        this.f19564c = zzrz;
    }

    public final void zza(zzto zzto) {
        this.f19573l = zzto;
    }

    public final void zza(String str, zzrt zzrt, zzrq zzrq) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
        }
        this.f19567f.put(str, zzrt);
        this.f19566e.put(str, zzrq);
    }

    public final void zza(zzrw zzrw, zzjo zzjo) {
        this.f19568g = zzrw;
        this.f19569h = zzjo;
    }
}
