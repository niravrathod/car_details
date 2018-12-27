package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zze;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

final class bf implements dx {
    /* renamed from: a */
    private final zzut f17440a;

    /* renamed from: a */
    public static bf m22263a(zzut zzut) {
        if (zzut.f17551a != null) {
            return zzut.f17551a;
        }
        return new bf(zzut);
    }

    private bf(zzut zzut) {
        this.f17440a = (zzut) zzvo.m12071a((Object) zzut, "output");
    }

    /* renamed from: a */
    public final int mo2996a() {
        return zze.f10276j;
    }

    /* renamed from: a */
    public final void mo3000a(int i, int i2) {
        this.f17440a.mo4386e(i, i2);
    }

    /* renamed from: a */
    public final void mo3001a(int i, long j) {
        this.f17440a.mo4363a(i, j);
    }

    /* renamed from: b */
    public final void mo3013b(int i, long j) {
        this.f17440a.mo4382c(i, j);
    }

    /* renamed from: a */
    public final void mo2999a(int i, float f) {
        this.f17440a.m22599a(i, f);
    }

    /* renamed from: a */
    public final void mo2998a(int i, double d) {
        this.f17440a.m22598a(i, d);
    }

    /* renamed from: b */
    public final void mo3012b(int i, int i2) {
        this.f17440a.mo4377b(i, i2);
    }

    /* renamed from: c */
    public final void mo3019c(int i, long j) {
        this.f17440a.mo4363a(i, j);
    }

    /* renamed from: c */
    public final void mo3018c(int i, int i2) {
        this.f17440a.mo4377b(i, i2);
    }

    /* renamed from: d */
    public final void mo3022d(int i, long j) {
        this.f17440a.mo4382c(i, j);
    }

    /* renamed from: d */
    public final void mo3021d(int i, int i2) {
        this.f17440a.mo4386e(i, i2);
    }

    /* renamed from: a */
    public final void mo3010a(int i, boolean z) {
        this.f17440a.mo4368a(i, z);
    }

    /* renamed from: a */
    public final void mo3006a(int i, String str) {
        this.f17440a.mo4367a(i, str);
    }

    /* renamed from: a */
    public final void mo3003a(int i, zzud zzud) {
        this.f17440a.mo4364a(i, zzud);
    }

    /* renamed from: e */
    public final void mo3024e(int i, int i2) {
        this.f17440a.mo4381c(i, i2);
    }

    /* renamed from: f */
    public final void mo3027f(int i, int i2) {
        this.f17440a.m22628d(i, i2);
    }

    /* renamed from: e */
    public final void mo3025e(int i, long j) {
        this.f17440a.m22617b(i, j);
    }

    /* renamed from: a */
    public final void mo3005a(int i, Object obj, cu cuVar) {
        this.f17440a.mo4366a(i, (zzwt) obj, cuVar);
    }

    /* renamed from: b */
    public final void mo3014b(int i, Object obj, cu cuVar) {
        zzut zzut = this.f17440a;
        obj = (zzwt) obj;
        zzut.mo4362a(i, 3);
        cuVar.mo3066a(obj, zzut.f17551a);
        zzut.mo4362a(i, 4);
    }

    /* renamed from: a */
    public final void mo2997a(int i) {
        this.f17440a.mo4362a(i, 3);
    }

    /* renamed from: b */
    public final void mo3011b(int i) {
        this.f17440a.mo4362a(i, 4);
    }

    /* renamed from: a */
    public final void mo3004a(int i, Object obj) {
        if (obj instanceof zzud) {
            this.f17440a.mo4378b(i, (zzud) obj);
        } else {
            this.f17440a.mo4379b(i, (zzwt) obj);
        }
    }

    /* renamed from: a */
    public final void mo3009a(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22572f(((Integer) list.get(i)).intValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4361a(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4377b(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: b */
    public final void mo3017b(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22584i(((Integer) list.get(i)).intValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4385d(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4386e(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: c */
    public final void mo3020c(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22568d(((Long) list.get(i)).longValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4369a(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4363a(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: d */
    public final void mo3023d(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22571e(((Long) list.get(i)).longValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4369a(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4363a(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: e */
    public final void mo3026e(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22579g(((Long) list.get(i)).longValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4383c(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4382c(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: f */
    public final void mo3028f(int i, List<Float> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22547b(((Float) list.get(i)).floatValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.m22596a(((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.m22599a(i, ((Float) list.get(z2)).floatValue());
            z2++;
        }
    }

    /* renamed from: g */
    public final void mo3029g(int i, List<Double> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22546b(((Double) list.get(i)).doubleValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.m22595a(((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.m22598a(i, ((Double) list.get(z2)).doubleValue());
            z2++;
        }
    }

    /* renamed from: h */
    public final void mo3030h(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22589k(((Integer) list.get(i)).intValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4361a(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4377b(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: i */
    public final void mo3031i(int i, List<Boolean> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22558b(((Boolean) list.get(i)).booleanValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.m22613a(((Boolean) list.get(i3)).booleanValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4368a(i, ((Boolean) list.get(z2)).booleanValue());
            z2++;
        }
    }

    /* renamed from: a */
    public final void mo3007a(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof zzwc) {
            zzwc zzwc = (zzwc) list;
            while (i2 < list.size()) {
                Object b = zzwc.mo3157b(i2);
                if (b instanceof String) {
                    this.f17440a.mo4367a(i, (String) b);
                } else {
                    this.f17440a.mo4364a(i, (zzud) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f17440a.mo4367a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo3015b(int i, List<zzud> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f17440a.mo4364a(i, (zzud) list.get(i2));
        }
    }

    /* renamed from: j */
    public final void mo3032j(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22576g(((Integer) list.get(i)).intValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4376b(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4381c(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: k */
    public final void mo3033k(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22587j(((Integer) list.get(i)).intValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4385d(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4386e(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: l */
    public final void mo3034l(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22583h(((Long) list.get(i)).longValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.mo4383c(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.mo4382c(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: m */
    public final void mo3035m(int i, List<Integer> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22580h(((Integer) list.get(i)).intValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.m22622c(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.m22628d(i, ((Integer) list.get(z2)).intValue());
            z2++;
        }
    }

    /* renamed from: n */
    public final void mo3036n(int i, List<Long> list, boolean z) {
        boolean z2 = false;
        if (z) {
            this.f17440a.mo4362a(i, 2);
            int i2 = false;
            for (i = 0; i < list.size(); i++) {
                i2 += zzut.m22575f(((Long) list.get(i)).longValue());
            }
            this.f17440a.mo4376b(i2);
            int i3;
            while (i3 < list.size()) {
                this.f17440a.m22620b(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        while (z2 < list.size()) {
            this.f17440a.m22617b(i, ((Long) list.get(z2)).longValue());
            z2++;
        }
    }

    /* renamed from: a */
    public final void mo3008a(int i, List<?> list, cu cuVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo3005a(i, list.get(i2), cuVar);
        }
    }

    /* renamed from: b */
    public final void mo3016b(int i, List<?> list, cu cuVar) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo3014b(i, list.get(i2), cuVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo3002a(int i, cd<K, V> cdVar, Map<K, V> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            this.f17440a.mo4362a(i, 2);
            this.f17440a.mo4376b(zzwl.m12099a(cdVar, entry.getKey(), entry.getValue()));
            zzwl.m12100a(this.f17440a, cdVar, entry.getKey(), entry.getValue());
        }
    }
}
