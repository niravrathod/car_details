package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbdd.zze;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class kv implements no {
    /* renamed from: a */
    private final zzbck f16535a;

    /* renamed from: a */
    public static kv m20683a(zzbck zzbck) {
        if (zzbck.f17080a != null) {
            return zzbck.f17080a;
        }
        return new kv(zzbck);
    }

    private kv(zzbck zzbck) {
        this.f16535a = (zzbck) zzbdf.m10330a((Object) zzbck, "output");
    }

    /* renamed from: a */
    public final int mo2042a() {
        return zze.f9175j;
    }

    /* renamed from: a */
    public final void mo2046a(int i, int i2) {
        this.f16535a.mo4252e(i, i2);
    }

    /* renamed from: a */
    public final void mo2047a(int i, long j) {
        this.f16535a.mo4229a(i, j);
    }

    /* renamed from: b */
    public final void mo2059b(int i, long j) {
        this.f16535a.mo4248c(i, j);
    }

    /* renamed from: a */
    public final void mo2045a(int i, float f) {
        this.f16535a.m21567a(i, f);
    }

    /* renamed from: a */
    public final void mo2044a(int i, double d) {
        this.f16535a.m21566a(i, d);
    }

    /* renamed from: b */
    public final void mo2058b(int i, int i2) {
        this.f16535a.mo4243b(i, i2);
    }

    /* renamed from: c */
    public final void mo2065c(int i, long j) {
        this.f16535a.mo4229a(i, j);
    }

    /* renamed from: c */
    public final void mo2064c(int i, int i2) {
        this.f16535a.mo4243b(i, i2);
    }

    /* renamed from: d */
    public final void mo2068d(int i, long j) {
        this.f16535a.mo4248c(i, j);
    }

    /* renamed from: d */
    public final void mo2067d(int i, int i2) {
        this.f16535a.mo4252e(i, i2);
    }

    /* renamed from: a */
    public final void mo2056a(int i, boolean z) {
        this.f16535a.mo4234a(i, z);
    }

    /* renamed from: a */
    public final void mo2052a(int i, String str) {
        this.f16535a.mo4233a(i, str);
    }

    /* renamed from: a */
    public final void mo2049a(int i, zzbbu zzbbu) {
        this.f16535a.mo4230a(i, zzbbu);
    }

    /* renamed from: e */
    public final void mo2070e(int i, int i2) {
        this.f16535a.mo4247c(i, i2);
    }

    /* renamed from: f */
    public final void mo2073f(int i, int i2) {
        this.f16535a.m21597d(i, i2);
    }

    /* renamed from: e */
    public final void mo2071e(int i, long j) {
        this.f16535a.m21585b(i, j);
    }

    /* renamed from: a */
    public final void mo2051a(int i, Object obj, ml mlVar) {
        this.f16535a.mo4232a(i, (zzbel) obj, mlVar);
    }

    /* renamed from: b */
    public final void mo2060b(int i, Object obj, ml mlVar) {
        zzbck zzbck = this.f16535a;
        obj = (zzbel) obj;
        zzbck.mo4228a(i, 3);
        mlVar.mo2111a(obj, zzbck.f17080a);
        zzbck.mo4228a(i, 4);
    }

    /* renamed from: a */
    public final void mo2043a(int i) {
        this.f16535a.mo4228a(i, 3);
    }

    /* renamed from: b */
    public final void mo2057b(int i) {
        this.f16535a.mo4228a(i, 4);
    }

    /* renamed from: a */
    public final void mo2050a(int i, Object obj) {
        if (obj instanceof zzbbu) {
            this.f16535a.mo4244b(i, (zzbbu) obj);
        } else {
            this.f16535a.mo4245b(i, (zzbel) obj);
        }
    }

    /* renamed from: a */
    public final void mo2055a(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21540f(((Integer) list.get(i)).intValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4227a(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4243b(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: b */
    public final void mo2063b(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21552i(((Integer) list.get(i)).intValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4251d(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4252e(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: c */
    public final void mo2066c(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21535d(((Long) list.get(i)).longValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4235a(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4229a(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: d */
    public final void mo2069d(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21539e(((Long) list.get(i)).longValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4235a(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4229a(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: e */
    public final void mo2072e(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21547g(((Long) list.get(i)).longValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4249c(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4248c(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: f */
    public final void mo2074f(int i, List<Float> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21515b(((Float) list.get(i)).floatValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.m21564a(((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.m21567a(i, ((Float) list.get(z2)).floatValue());
            z2++;
        }
    }

    /* renamed from: g */
    public final void mo2075g(int i, List<Double> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21514b(((Double) list.get(i)).doubleValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.m21563a(((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.m21566a(i, ((Double) list.get(z2)).doubleValue());
            z2++;
        }
    }

    /* renamed from: h */
    public final void mo2076h(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21557k(((Integer) list.get(i)).intValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4227a(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4243b(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: i */
    public final void mo2077i(int i, List<Boolean> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21526b(((Boolean) list.get(i)).booleanValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.m21581a(((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4234a(i, ((Boolean) list.get(z2)).booleanValue());
            z2++;
        }
    }

    /* renamed from: a */
    public final void mo2053a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof zzbdu) {
            zzbdu zzbdu = (zzbdu) list;
            while (i2 < list.size()) {
                Object b = zzbdu.mo2425b(i2);
                if (b instanceof String) {
                    this.f16535a.mo4233a(i, (String) b);
                } else {
                    this.f16535a.mo4230a(i, (zzbbu) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16535a.mo4233a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo2061b(int i, List<zzbbu> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16535a.mo4230a(i, (zzbbu) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo2078j(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21544g(((Integer) list.get(i)).intValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4242b(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4247c(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: k */
    public final void mo2079k(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21555j(((Integer) list.get(i)).intValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4251d(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4252e(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: l */
    public final void mo2080l(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21551h(((Long) list.get(i)).longValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.mo4249c(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.mo4248c(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: m */
    public final void mo2081m(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21548h(((Integer) list.get(i)).intValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.m21591c(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.m21597d(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: n */
    public final void mo2082n(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f16535a.mo4228a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzbck.m21543f(((Long) list.get(i)).longValue());
            }
            this.f16535a.mo4242b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f16535a.m21588b(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f16535a.m21585b(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: a */
    public final void mo2054a(int i, List<?> list, ml mlVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo2051a(i, list.get(i2), mlVar);
        }
    }

    /* renamed from: b */
    public final void mo2062b(int i, List<?> list, ml mlVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo2060b(i, list.get(i2), mlVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo2048a(int i, lt<K, V> ltVar, Map<K, V> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            this.f16535a.mo4228a(i, 2);
            this.f16535a.mo4242b(zzbed.m10359a(ltVar, entry.getKey(), entry.getValue()));
            zzbed.m10360a(this.f16535a, ltVar, entry.getKey(), entry.getValue());
        }
    }
}
