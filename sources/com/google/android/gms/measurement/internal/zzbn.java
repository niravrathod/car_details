package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.v4.p017f.C3131a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzfu;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzga;
import com.google.android.gms.internal.measurement.zzgb;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzyx;
import com.google.android.gms.internal.measurement.zzyy;
import com.google.android.gms.internal.measurement.zzzg;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import java.io.IOException;
import java.util.Map;

public final class zzbn extends cg implements cs {
    @VisibleForTesting
    /* renamed from: b */
    private static int f21635b = 65535;
    @VisibleForTesting
    /* renamed from: c */
    private static int f21636c = 2;
    /* renamed from: d */
    private final Map<String, Map<String, String>> f21637d = new C3131a();
    /* renamed from: e */
    private final Map<String, Map<String, Boolean>> f21638e = new C3131a();
    /* renamed from: f */
    private final Map<String, Map<String, Boolean>> f21639f = new C3131a();
    /* renamed from: g */
    private final Map<String, zzgb> f21640g = new C3131a();
    /* renamed from: h */
    private final Map<String, Map<String, Integer>> f21641h = new C3131a();
    /* renamed from: i */
    private final Map<String, String> f21642i = new C3131a();

    zzbn(zzfa zzfa) {
        super(zzfa);
    }

    /* renamed from: e */
    protected final boolean mo4961e() {
        return false;
    }

    /* renamed from: h */
    private final void m29528h(String str) {
        m28438k();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        if (this.f21640g.get(str) == null) {
            byte[] d = mo4966i().m29431d(str);
            if (d == null) {
                this.f21637d.put(str, null);
                this.f21638e.put(str, null);
                this.f21639f.put(str, null);
                this.f21640g.put(str, null);
                this.f21642i.put(str, null);
                this.f21641h.put(str, null);
                return;
            }
            zzgb a = m29525a(str, d);
            this.f21637d.put(str, m29526a(a));
            m29527a(str, a);
            this.f21640g.put(str, a);
            this.f21642i.put(str, null);
        }
    }

    /* renamed from: a */
    protected final zzgb m29529a(String str) {
        m28438k();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        m29528h(str);
        return (zzgb) this.f21640g.get(str);
    }

    /* renamed from: b */
    protected final String m29533b(String str) {
        mo4395d();
        return (String) this.f21642i.get(str);
    }

    /* renamed from: c */
    protected final void m29537c(String str) {
        mo4395d();
        this.f21642i.put(str, null);
    }

    /* renamed from: d */
    final void m29541d(String str) {
        mo4395d();
        this.f21640g.remove(str);
    }

    /* renamed from: a */
    public final String mo3176a(String str, String str2) {
        mo4395d();
        m29528h(str);
        Map map = (Map) this.f21637d.get(str);
        return map != null ? (String) map.get(str2) : null;
    }

    /* renamed from: a */
    private static Map<String, String> m29526a(zzgb zzgb) {
        Map<String, String> c3131a = new C3131a();
        if (!(zzgb == null || zzgb.f20570c == null)) {
            for (zzgc zzgc : zzgb.f20570c) {
                if (zzgc != null) {
                    c3131a.put(zzgc.f20576a, zzgc.f20577b);
                }
            }
        }
        return c3131a;
    }

    /* renamed from: a */
    private final void m29527a(String str, zzgb zzgb) {
        Map c3131a = new C3131a();
        Map c3131a2 = new C3131a();
        Map c3131a3 = new C3131a();
        if (!(zzgb == null || zzgb.f20571d == null)) {
            for (zzga zzga : zzgb.f20571d) {
                if (TextUtils.isEmpty(zzga.f20564a)) {
                    mo3172r().m28540i().m12354a("EventConfig contained null event name");
                } else {
                    Object a = Event.m12208a(zzga.f20564a);
                    if (!TextUtils.isEmpty(a)) {
                        zzga.f20564a = a;
                    }
                    c3131a.put(zzga.f20564a, zzga.f20565b);
                    c3131a2.put(zzga.f20564a, zzga.f20566c);
                    if (zzga.f20567d != null) {
                        if (zzga.f20567d.intValue() >= f21636c) {
                            if (zzga.f20567d.intValue() <= f21635b) {
                                c3131a3.put(zzga.f20564a, zzga.f20567d);
                            }
                        }
                        mo3172r().m28540i().m12356a("Invalid sampling rate. Event name, sample rate", zzga.f20564a, zzga.f20567d);
                    }
                }
            }
        }
        this.f21638e.put(str, c3131a);
        this.f21639f.put(str, c3131a2);
        this.f21641h.put(str, c3131a3);
    }

    /* renamed from: a */
    protected final boolean m29532a(String str, byte[] bArr, String str2) {
        zzbn zzbn = this;
        String str3 = str;
        m28438k();
        mo4395d();
        Preconditions.checkNotEmpty(str);
        zzgb a = m29525a(str, bArr);
        if (a == null) {
            return false;
        }
        byte[] bArr2;
        m29527a(str3, a);
        zzbn.f21640g.put(str3, a);
        zzbn.f21642i.put(str3, str2);
        zzbn.f21637d.put(str3, m29526a(a));
        cf h = mo4965h();
        zzfu[] zzfuArr = a.f20572e;
        Preconditions.checkNotNull(zzfuArr);
        for (zzfu zzfu : zzfuArr) {
            for (zzfv zzfv : zzfu.f20532c) {
                String a2 = Event.m12208a(zzfv.f20537b);
                if (a2 != null) {
                    zzfv.f20537b = a2;
                }
                for (zzfw zzfw : zzfv.f20538c) {
                    String a3 = Param.m12211a(zzfw.f20547d);
                    if (a3 != null) {
                        zzfw.f20547d = a3;
                    }
                }
            }
            for (zzfy zzfy : zzfu.f20531b) {
                String a4 = UserProperty.m12212a(zzfy.f20555b);
                if (a4 != null) {
                    zzfy.f20555b = a4;
                }
            }
        }
        h.mo4966i().m29418a(str3, zzfuArr);
        try {
            a.f20572e = null;
            bArr2 = new byte[a.m12203e()];
            a.mo3160a(zzyy.m12153a(bArr2, 0, bArr2.length));
        } catch (IOException e) {
            mo3172r().m28540i().m12356a("Unable to serialize reduced-size config. Storing full config instead. appId", zzap.m28525a(str), e);
            bArr2 = bArr;
        }
        an i = mo4966i();
        Preconditions.checkNotEmpty(str);
        i.mo4395d();
        i.m28438k();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        try {
            if (((long) i.m29442y().update("apps", contentValues, "app_id = ?", new String[]{str3})) == 0) {
                i.mo3172r().v_().m12355a("Failed to update remote config (got 0). appId", zzap.m28525a(str));
            }
        } catch (SQLiteException e2) {
            i.mo3172r().v_().m12356a("Error storing remote config. appId", zzap.m28525a(str), e2);
        }
        return true;
    }

    /* renamed from: b */
    final boolean m29535b(String str, String str2) {
        mo4395d();
        m29528h(str);
        if (m29544f(str) && zzfk.m28606e(str2)) {
            return true;
        }
        if (m29546g(str) && zzfk.m28595a(str2)) {
            return true;
        }
        Map map = (Map) this.f21638e.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    final boolean m29538c(String str, String str2) {
        mo4395d();
        m29528h(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f21639f.get(str);
        if (map == null) {
            return false;
        }
        Boolean bool = (Boolean) map.get(str2);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: d */
    final int m29539d(String str, String str2) {
        mo4395d();
        m29528h(str);
        Map map = (Map) this.f21641h.get(str);
        if (map == null) {
            return 1;
        }
        Integer num = (Integer) map.get(str2);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: e */
    final long m29542e(String str) {
        Object a = mo3176a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.parseLong(a);
            } catch (NumberFormatException e) {
                mo3172r().m28540i().m12356a("Unable to parse timezone offset. appId", zzap.m28525a(str), e);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final zzgb m29525a(String str, byte[] bArr) {
        if (bArr == null) {
            return new zzgb();
        }
        zzyx a = zzyx.m12125a(bArr, 0, bArr.length);
        zzzg zzgb = new zzgb();
        try {
            zzgb.mo4347a(a);
            mo3172r().m28555x().m12356a("Parsed config. version, gmp_app_id", zzgb.f20568a, zzgb.f20569b);
            return zzgb;
        } catch (byte[] bArr2) {
            mo3172r().m28540i().m12356a("Unable to merge remote config. appId", zzap.m28525a(str), bArr2);
            return new zzgb();
        }
    }

    /* renamed from: f */
    final boolean m29544f(String str) {
        return "1".equals(mo3176a(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: g */
    final boolean m29546g(String str) {
        return "1".equals(mo3176a(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfg mo4964g() {
        return super.mo4964g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ cq mo4965h() {
        return super.mo4965h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ ct mo4966i() {
        return super.mo4966i();
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
