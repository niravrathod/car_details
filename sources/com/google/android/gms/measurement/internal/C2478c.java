package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.c */
final class C2478c implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f10553a;
    /* renamed from: b */
    private final /* synthetic */ String f10554b;
    /* renamed from: c */
    private final /* synthetic */ Object f10555c;
    /* renamed from: d */
    private final /* synthetic */ Object f10556d;
    /* renamed from: e */
    private final /* synthetic */ Object f10557e;
    /* renamed from: f */
    private final /* synthetic */ zzap f10558f;

    C2478c(zzap zzap, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f10558f = zzap;
        this.f10553a = i;
        this.f10554b = str;
        this.f10555c = obj;
        this.f10556d = obj2;
        this.f10557e = obj3;
    }

    public final void run() {
        ao c = this.f10558f.r.m22722c();
        if (c.m27285z()) {
            if (this.f10558f.f21408a == '\u0000') {
                zzap zzap;
                if (this.f10558f.mo4400t().m27352g()) {
                    zzap = this.f10558f;
                    this.f10558f.mo3173u();
                    zzap.f21408a = 'C';
                } else {
                    zzap = this.f10558f;
                    this.f10558f.mo3173u();
                    zzap.f21408a = 'c';
                }
            }
            if (this.f10558f.f21409b < 0) {
                this.f10558f.f21409b = this.f10558f.mo4400t().m27350f();
            }
            char charAt = "01VDIWEA?".charAt(this.f10553a);
            char a = this.f10558f.f21408a;
            long b = this.f10558f.f21409b;
            String a2 = zzap.m28527a(true, this.f10554b, this.f10555c, this.f10556d, this.f10557e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(a2).length() + 24);
            stringBuilder.append("2");
            stringBuilder.append(charAt);
            stringBuilder.append(a);
            stringBuilder.append(b);
            stringBuilder.append(":");
            stringBuilder.append(a2);
            String stringBuilder2 = stringBuilder.toString();
            if (stringBuilder2.length() > 1024) {
                stringBuilder2 = this.f10554b.substring(0, 1024);
            }
            c.f21382b.m12365a(stringBuilder2, 1);
            return;
        }
        this.f10558f.m28531a(6, "Persisted config not initialized. Not logging error/warn");
    }
}
