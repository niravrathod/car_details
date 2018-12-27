package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzx extends ao {
    /* renamed from: a */
    private long f21435a;
    /* renamed from: b */
    private String f21436b;
    /* renamed from: c */
    private Boolean f21437c;

    zzx(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: e */
    protected final boolean mo4839e() {
        Calendar instance = Calendar.getInstance();
        this.f21435a = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String toLowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String toLowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toLowerCase).length() + 1) + String.valueOf(toLowerCase2).length());
        stringBuilder.append(toLowerCase);
        stringBuilder.append("-");
        stringBuilder.append(toLowerCase2);
        this.f21436b = stringBuilder.toString();
        return false;
    }

    /* renamed from: g */
    public final long m28655g() {
        m27280A();
        return this.f21435a;
    }

    /* renamed from: h */
    public final String m28656h() {
        m27280A();
        return this.f21436b;
    }

    /* renamed from: a */
    public final boolean m28650a(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.f21437c;
        if (r0 != 0) goto L_0x0022;
    L_0x0004:
        r2.mo3173u();
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);
        r2.f21437c = r0;
        r3 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0022 }
        if (r3 == 0) goto L_0x0022;	 Catch:{ NameNotFoundException -> 0x0022 }
    L_0x0014:
        r0 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x0022 }
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0022 }
        r3.getPackageInfo(r0, r1);	 Catch:{ NameNotFoundException -> 0x0022 }
        r3 = 1;	 Catch:{ NameNotFoundException -> 0x0022 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ NameNotFoundException -> 0x0022 }
        r2.f21437c = r3;	 Catch:{ NameNotFoundException -> 0x0022 }
    L_0x0022:
        r3 = r2.f21437c;
        r3 = r3.booleanValue();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4394c() {
        super.mo4394c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4395d() {
        super.mo4395d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
