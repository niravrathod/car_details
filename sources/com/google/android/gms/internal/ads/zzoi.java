package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzoi {
    /* renamed from: a */
    private final Map<String, zzoh> f9748a = new HashMap();
    /* renamed from: b */
    private final zzoj f9749b;

    public zzoi(zzoj zzoj) {
        this.f9749b = zzoj;
    }

    /* renamed from: a */
    public final void m10923a(String str, zzoh zzoh) {
        this.f9748a.put(str, zzoh);
    }

    /* renamed from: a */
    public final void m10924a(String str, String str2, long j) {
        zzoj zzoj = this.f9749b;
        zzoh zzoh = (zzoh) this.f9748a.get(str2);
        String[] strArr = new String[]{str};
        if (zzoj != null) {
            if (zzoh != null) {
                zzoj.m10930a(zzoh, j, strArr);
            }
        }
        str2 = this.f9748a;
        zzoj = this.f9749b;
        if (zzoj == null) {
            j = null;
        } else {
            j = zzoj.m10926a(j);
        }
        str2.put(str, j);
    }

    /* renamed from: a */
    public final zzoj m10922a() {
        return this.f9749b;
    }
}
