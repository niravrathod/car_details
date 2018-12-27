package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzaer
public final class zzarq implements Iterable<zzaro> {
    /* renamed from: a */
    private final List<zzaro> f9009a = new ArrayList();

    /* renamed from: a */
    public static boolean m10083a(zzarg zzarg) {
        zzarg = m10084b(zzarg);
        if (zzarg == null) {
            return null;
        }
        zzarg.f19916b.mo4195a();
        return true;
    }

    /* renamed from: b */
    static zzaro m10084b(zzarg zzarg) {
        Iterator it = zzbv.zzfh().iterator();
        while (it.hasNext()) {
            zzaro zzaro = (zzaro) it.next();
            if (zzaro.f19915a == zzarg) {
                return zzaro;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m10086a(zzaro zzaro) {
        this.f9009a.add(zzaro);
    }

    /* renamed from: b */
    public final void m10087b(zzaro zzaro) {
        this.f9009a.remove(zzaro);
    }

    public final Iterator<zzaro> iterator() {
        return this.f9009a.iterator();
    }

    /* renamed from: a */
    public final int m10085a() {
        return this.f9009a.size();
    }
}
