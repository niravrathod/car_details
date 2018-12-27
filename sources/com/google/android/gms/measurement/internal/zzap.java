package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;

public final class zzap extends ao {
    /* renamed from: a */
    private char f21408a = '\u0000';
    /* renamed from: b */
    private long f21409b = -1;
    /* renamed from: c */
    private String f21410c;
    /* renamed from: d */
    private final zzar f21411d = new zzar(this, 6, false, false);
    /* renamed from: e */
    private final zzar f21412e = new zzar(this, 6, true, false);
    /* renamed from: f */
    private final zzar f21413f = new zzar(this, 6, false, true);
    /* renamed from: g */
    private final zzar f21414g = new zzar(this, 5, false, false);
    /* renamed from: h */
    private final zzar f21415h = new zzar(this, 5, true, false);
    /* renamed from: i */
    private final zzar f21416i = new zzar(this, 5, false, true);
    /* renamed from: j */
    private final zzar f21417j = new zzar(this, 4, false, false);
    /* renamed from: k */
    private final zzar f21418k = new zzar(this, 3, false, false);
    /* renamed from: l */
    private final zzar f21419l = new zzar(this, 2, false, false);

    zzap(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: e */
    protected final boolean mo4839e() {
        return false;
    }

    public final zzar v_() {
        return this.f21411d;
    }

    /* renamed from: g */
    public final zzar m28538g() {
        return this.f21412e;
    }

    /* renamed from: h */
    public final zzar m28539h() {
        return this.f21413f;
    }

    /* renamed from: i */
    public final zzar m28540i() {
        return this.f21414g;
    }

    /* renamed from: j */
    public final zzar m28541j() {
        return this.f21415h;
    }

    /* renamed from: k */
    public final zzar m28542k() {
        return this.f21416i;
    }

    /* renamed from: v */
    public final zzar m28553v() {
        return this.f21417j;
    }

    /* renamed from: w */
    public final zzar m28554w() {
        return this.f21418k;
    }

    /* renamed from: x */
    public final zzar m28555x() {
        return this.f21419l;
    }

    /* renamed from: a */
    protected static Object m28525a(String str) {
        return str == null ? null : new C2479d(str);
    }

    /* renamed from: a */
    protected final void m28532a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m28533a(i)) {
            m28531a(i, m28527a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= true) {
            Preconditions.checkNotNull(str);
            z = this.r.m22726g();
            if (!z) {
                m28531a(6, "Scheduler not set. Not logging error/warn");
            } else if (z.m27285z()) {
                boolean z3;
                if (i < 0) {
                    z3 = false;
                }
                z.m28568a(new C2478c(this, z3 >= true ? 8 : z3, str, obj, obj2, obj3));
            } else {
                m28531a(6, "Scheduler not initialized. Not logging error/warn");
            }
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    protected final boolean m28533a(int i) {
        return Log.isLoggable(m28521D(), i);
    }

    @VisibleForTesting
    /* renamed from: a */
    protected final void m28531a(int i, String str) {
        Log.println(i, m28521D(), str);
    }

    @VisibleForTesting
    /* renamed from: D */
    private final String m28521D() {
        String str;
        synchronized (this) {
            if (this.f21410c == null) {
                if (this.r.m22739t() != null) {
                    this.f21410c = this.r.m22739t();
                } else {
                    this.f21410c = zzn.m27329e();
                }
            }
            str = this.f21410c;
        }
        return str;
    }

    /* renamed from: a */
    static String m28527a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        obj = m28526a(z, obj);
        obj2 = m28526a(z, obj2);
        z = m28526a(z, obj3);
        obj3 = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            obj3.append(str);
            str2 = ": ";
        }
        if (TextUtils.isEmpty(obj) == null) {
            obj3.append(str2);
            obj3.append(obj);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(obj2) == null) {
            obj3.append(str2);
            obj3.append(obj2);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(z) == null) {
            obj3.append(str2);
            obj3.append(z);
        }
        return obj3.toString();
    }

    @VisibleForTesting
    /* renamed from: a */
    private static String m28526a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            obj = String.valueOf(obj).charAt(0) == 45 ? "-" : "";
            z = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (z.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) z.length()) - 1.0d);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 43) + String.valueOf(obj).length());
            stringBuilder.append(obj);
            stringBuilder.append(round);
            stringBuilder.append("...");
            stringBuilder.append(obj);
            stringBuilder.append(round2);
            return stringBuilder.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder stringBuilder2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                z = m28529b(AppMeasurement.class.getCanonicalName());
                String b = m28529b(zzbt.class.getCanonicalName());
                obj = th.getStackTrace();
                int length = obj.length;
                while (i < length) {
                    StackTraceElement stackTraceElement = obj[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            className = m28529b(className);
                            if (className.equals(z) || className.equals(b)) {
                                stringBuilder2.append(": ");
                                stringBuilder2.append(stackTraceElement);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return stringBuilder2.toString();
            } else if (obj instanceof C2479d) {
                return ((C2479d) obj).f10622a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: b */
    private static String m28529b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: y */
    public final String m28556y() {
        Pair a = mo4399s().f21382b.m12364a();
        if (a != null) {
            if (a != C4832l.f21381a) {
                String valueOf = String.valueOf(a.second);
                String str = (String) a.first;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length());
                stringBuilder.append(valueOf);
                stringBuilder.append(":");
                stringBuilder.append(str);
                return stringBuilder.toString();
            }
        }
        return null;
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
