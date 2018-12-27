package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.Param;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.concurrent.atomic.AtomicReference;

public final class zzan extends ao {
    /* renamed from: a */
    private static final AtomicReference<String[]> f21405a = new AtomicReference();
    /* renamed from: b */
    private static final AtomicReference<String[]> f21406b = new AtomicReference();
    /* renamed from: c */
    private static final AtomicReference<String[]> f21407c = new AtomicReference();

    zzan(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: e */
    protected final boolean mo4839e() {
        return false;
    }

    /* renamed from: g */
    private final boolean m28499g() {
        mo3173u();
        return this.r.m22734o() && this.r.mo3172r().m28533a(3);
    }

    /* renamed from: a */
    protected final String m28503a(String str) {
        if (str == null) {
            return null;
        }
        if (m28499g()) {
            return m28498a(str, Event.f10396b, Event.f10395a, f21405a);
        }
        return str;
    }

    /* renamed from: b */
    protected final String m28505b(String str) {
        if (str == null) {
            return null;
        }
        if (m28499g()) {
            return m28498a(str, Param.f10398b, Param.f10397a, f21406b);
        }
        return str;
    }

    /* renamed from: c */
    protected final String m28507c(String str) {
        if (str == null) {
            return null;
        }
        if (!m28499g()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m28498a(str, UserProperty.f10400b, UserProperty.f10399a, f21407c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("experiment_id");
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m28498a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzfk.m28604c(str, strArr[i])) {
                synchronized (atomicReference) {
                    str = (String[]) atomicReference.get();
                    if (str == null) {
                        str = new String[strArr2.length];
                        atomicReference.set(str);
                    }
                    if (str[i] == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(strArr2[i]);
                        stringBuilder.append("(");
                        stringBuilder.append(strArr[i]);
                        stringBuilder.append(")");
                        str[i] = stringBuilder.toString();
                    }
                    str = str[i];
                }
                return str;
            }
        }
        return str;
    }

    /* renamed from: a */
    protected final String m28501a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        if (!m28499g()) {
            return zzad.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("origin=");
        stringBuilder.append(zzad.f20676c);
        stringBuilder.append(",name=");
        stringBuilder.append(m28503a(zzad.f20674a));
        stringBuilder.append(",params=");
        stringBuilder.append(m28497a(zzad.f20675b));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    protected final String m28502a(zzy zzy) {
        if (zzy == null) {
            return null;
        }
        if (!m28499g()) {
            return zzy.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Event{appId='");
        stringBuilder.append(zzy.f10791a);
        stringBuilder.append("', name='");
        stringBuilder.append(m28503a(zzy.f10792b));
        stringBuilder.append("', params=");
        stringBuilder.append(m28497a(zzy.f10795e));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private final String m28497a(zzaa zzaa) {
        if (zzaa == null) {
            return null;
        }
        if (m28499g()) {
            return m28500a(zzaa.m27303b());
        }
        return zzaa.toString();
    }

    /* renamed from: a */
    protected final String m28500a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m28499g()) {
            return bundle.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            } else {
                stringBuilder.append("Bundle[{");
            }
            stringBuilder.append(m28505b(str));
            stringBuilder.append(SimpleComparison.EQUAL_TO_OPERATION);
            stringBuilder.append(bundle.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
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
