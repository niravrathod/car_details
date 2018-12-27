package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

public final class zzy {
    /* renamed from: a */
    final String f10791a;
    /* renamed from: b */
    final String f10792b;
    /* renamed from: c */
    final long f10793c;
    /* renamed from: d */
    final long f10794d;
    /* renamed from: e */
    final zzaa f10795e;
    /* renamed from: f */
    private final String f10796f;

    private zzy(zzbt zzbt, String str, String str2, String str3, long j, long j2, zzaa zzaa) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzaa);
        this.f10791a = str2;
        this.f10792b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f10796f = str;
        this.f10793c = j;
        this.f10794d = j2;
        if (this.f10794d != 0 && this.f10794d > this.f10793c) {
            zzbt.mo3172r().m28540i().m12356a("Event created with reverse previous/current timestamps. appId, name", zzap.m28525a(str2), zzap.m28525a(str3));
        }
        this.f10795e = zzaa;
    }

    zzy(zzbt zzbt, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f10791a = str2;
        this.f10792b = str3;
        if (TextUtils.isEmpty(str) != null) {
            str = null;
        }
        this.f10796f = str;
        this.f10793c = j;
        this.f10794d = j2;
        if (this.f10794d != 0 && this.f10794d > this.f10793c) {
            zzbt.mo3172r().m28540i().m12355a("Event created with reverse previous/current timestamps. appId", zzap.m28525a(str2));
        }
        if (bundle == null || bundle.isEmpty() != null) {
            zzbt = new zzaa(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            str2 = bundle2.keySet().iterator();
            while (str2.hasNext() != null) {
                str3 = (String) str2.next();
                if (str3 == null) {
                    zzbt.mo3172r().v_().m12354a("Param name can't be null");
                    str2.remove();
                } else {
                    Object a = zzbt.m22729j().m28615a(str3, bundle2.get(str3));
                    if (a == null) {
                        zzbt.mo3172r().m28540i().m12355a("Param value can't be null", zzbt.m22730k().m28505b(str3));
                        str2.remove();
                    } else {
                        zzbt.m22729j().m28618a(bundle2, str3, a);
                    }
                }
            }
            zzbt = new zzaa(bundle2);
        }
        this.f10795e = zzbt;
    }

    /* renamed from: a */
    final zzy m12395a(zzbt zzbt, long j) {
        return new zzy(zzbt, this.f10796f, this.f10791a, this.f10792b, this.f10793c, j, this.f10795e);
    }

    public final String toString() {
        String str = this.f10791a;
        String str2 = this.f10792b;
        String valueOf = String.valueOf(this.f10795e);
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 33) + String.valueOf(str2).length()) + String.valueOf(valueOf).length());
        stringBuilder.append("Event{appId='");
        stringBuilder.append(str);
        stringBuilder.append("', name='");
        stringBuilder.append(str2);
        stringBuilder.append("', params=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
