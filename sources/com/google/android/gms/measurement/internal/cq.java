package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v4.p017f.C3131a;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzfz;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzge;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgk;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzyy;
import com.google.android.gms.internal.measurement.zzzg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

final class cq extends cg {
    cq(zzfa zzfa) {
        super(zzfa);
    }

    /* renamed from: e */
    protected final boolean mo4961e() {
        return false;
    }

    /* renamed from: a */
    final zzgd[] m29383a(String str, zzgf[] zzgfArr, zzgl[] zzglArr) {
        int intValue;
        int length;
        HashSet hashSet;
        int i;
        Map map;
        Map map2;
        Map map3;
        zzgd zzgd;
        int length2;
        String str2;
        int i2;
        Long l;
        long j;
        an i3;
        zzgf zzgf;
        Object e;
        zzgf zzgf2;
        Map map4;
        int i4;
        zzgf zzgf3;
        zzgg[] zzggArr;
        int i5;
        zzgf zzgf4;
        String str3;
        zzgg[] zzggArr2;
        Long l2;
        cy a;
        C3131a c3131a;
        Map map5;
        Map map6;
        Map map7;
        Map map8;
        HashSet hashSet2;
        zzgf zzgf5;
        zzgl[] zzglArr2;
        String str4;
        long j2;
        Map map9;
        Map map10;
        Iterator it;
        HashSet hashSet3;
        Map map11;
        BitSet bitSet;
        zzgf zzgf6;
        Map map12;
        BitSet bitSet2;
        Iterator it2;
        Map map13;
        Map map14;
        Map map15;
        C3131a c3131a2;
        C3131a c3131a3;
        BitSet bitSet3;
        C3131a c3131a4;
        C3131a c3131a5;
        BitSet bitSet4;
        Map map16;
        Map map17;
        Map map18;
        String str5;
        zzfv zzfv;
        Map map19;
        Map map20;
        zzgf zzgf7;
        BitSet bitSet5;
        Map map21;
        BitSet bitSet6;
        Boolean a2;
        Object obj;
        Object obj2;
        zzfv zzfv2;
        zzgl[] zzglArr3;
        C3131a c3131a6;
        C3131a c3131a7;
        Map map22;
        Iterator it3;
        Map map23;
        Map map24;
        Map map25;
        Map map26;
        Map map27;
        String str6;
        Iterator it4;
        Map map28;
        cq cqVar = this;
        String str7 = str;
        zzgf[] zzgfArr2 = zzgfArr;
        zzgl[] zzglArr4 = zzglArr;
        Preconditions.checkNotEmpty(str);
        HashSet hashSet4 = new HashSet();
        Map c3131a8 = new C3131a();
        Map c3131a9 = new C3131a();
        Map c3131a10 = new C3131a();
        Map c3131a11 = new C3131a();
        Map c3131a12 = new C3131a();
        boolean c = mo4400t().m27345c(str7, zzaf.ab);
        Map e2 = mo4966i().m29433e(str7);
        if (e2 != null) {
            Iterator it5 = e2.keySet().iterator();
            while (it5.hasNext()) {
                Map map29;
                Iterator it6;
                BitSet bitSet7;
                intValue = ((Integer) it5.next()).intValue();
                zzgj zzgj = (zzgj) e2.get(Integer.valueOf(intValue));
                BitSet bitSet8 = (BitSet) c3131a9.get(Integer.valueOf(intValue));
                BitSet bitSet9 = (BitSet) c3131a10.get(Integer.valueOf(intValue));
                if (c) {
                    map29 = e2;
                    e2 = new C3131a();
                    if (zzgj != null) {
                        it6 = it5;
                        if (zzgj.f20641c != null) {
                            zzge[] zzgeArr = zzgj.f20641c;
                            bitSet7 = bitSet9;
                            length = zzgeArr.length;
                            hashSet = hashSet4;
                            int i6 = 0;
                            while (i6 < length) {
                                int i7 = length;
                                zzge zzge = zzgeArr[i6];
                                zzge[] zzgeArr2 = zzgeArr;
                                if (zzge.f20584a != null) {
                                    e2.put(zzge.f20584a, zzge.f20585b);
                                }
                                i6++;
                                length = i7;
                                zzgeArr = zzgeArr2;
                            }
                            c3131a11.put(Integer.valueOf(intValue), e2);
                        }
                    } else {
                        it6 = it5;
                    }
                    bitSet7 = bitSet9;
                    hashSet = hashSet4;
                    c3131a11.put(Integer.valueOf(intValue), e2);
                } else {
                    map29 = e2;
                    it6 = it5;
                    bitSet7 = bitSet9;
                    hashSet = hashSet4;
                    e2 = null;
                }
                if (bitSet8 == null) {
                    bitSet8 = new BitSet();
                    c3131a9.put(Integer.valueOf(intValue), bitSet8);
                    bitSet9 = new BitSet();
                    c3131a10.put(Integer.valueOf(intValue), bitSet9);
                } else {
                    bitSet9 = bitSet7;
                }
                i = 0;
                while (i < (zzgj.f20639a.length << 6)) {
                    Object obj3;
                    if (zzfg.m29771a(zzgj.f20639a, i)) {
                        map = c3131a11;
                        map2 = c3131a10;
                        map3 = c3131a9;
                        mo3172r().m28555x().m12356a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet9.set(i);
                        if (zzfg.m29771a(zzgj.f20640b, i)) {
                            bitSet8.set(i);
                            obj3 = 1;
                            if (e2 != null && r8 == null) {
                                e2.remove(Integer.valueOf(i));
                            }
                            i++;
                            c3131a11 = map;
                            c3131a10 = map2;
                            c3131a9 = map3;
                        }
                    } else {
                        map = c3131a11;
                        map2 = c3131a10;
                        map3 = c3131a9;
                    }
                    obj3 = null;
                    e2.remove(Integer.valueOf(i));
                    i++;
                    c3131a11 = map;
                    c3131a10 = map2;
                    c3131a9 = map3;
                }
                map = c3131a11;
                map2 = c3131a10;
                map3 = c3131a9;
                zzgd = new zzgd();
                c3131a8.put(Integer.valueOf(intValue), zzgd);
                zzgd.f20582d = Boolean.valueOf(false);
                zzgd.f20581c = zzgj;
                zzgd.f20580b = new zzgj();
                zzgd.f20580b.f20640b = zzfg.m29772a(bitSet8);
                zzgd.f20580b.f20639a = zzfg.m29772a(bitSet9);
                if (c) {
                    zzgd.f20580b.f20641c = m29381a(e2);
                    c3131a12.put(Integer.valueOf(intValue), new C3131a());
                }
                e2 = map29;
                it5 = it6;
                hashSet4 = hashSet;
                c3131a11 = map;
                c3131a10 = map2;
                c3131a9 = map3;
            }
        }
        map = c3131a11;
        map2 = c3131a10;
        map3 = c3131a9;
        hashSet = hashSet4;
        if (zzgfArr2 != null) {
            C3131a c3131a13 = new C3131a();
            length2 = zzgfArr2.length;
            long j3 = 0;
            zzgf zzgf8 = null;
            Long l3 = null;
            int i8 = 0;
            while (i8 < length2) {
                boolean z;
                cy cyVar;
                int intValue2;
                BitSet bitSet10;
                Map map30;
                BitSet bitSet11;
                Map map31;
                zzgf zzgf9 = zzgfArr2[i8];
                str2 = zzgf9.f20588b;
                zzgg[] zzggArr3 = zzgf9.f20587a;
                long j4 = j3;
                if (mo4400t().m27345c(str7, zzaf.f10707V)) {
                    Object obj4;
                    zzgf zzgf10;
                    long j5;
                    SQLiteDatabase y;
                    String str8;
                    String[] strArr;
                    zzgg[] zzggArr4;
                    zzgg zzgg;
                    zzgf zzgf11;
                    Pair a3;
                    long longValue;
                    Long l4;
                    mo4964g();
                    Long l5 = (Long) zzfg.m29774b(zzgf9, "_eid");
                    Object obj5 = l5 != null ? 1 : null;
                    if (obj5 != null) {
                        i2 = i8;
                        if (str2.equals("_ep")) {
                            obj4 = 1;
                            if (obj4 == null) {
                                mo4964g();
                                str2 = (String) zzfg.m29774b(zzgf9, "_en");
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!(zzgf8 == null || l3 == null)) {
                                        if (l5.longValue() != l3.longValue()) {
                                            zzgf10 = zzgf8;
                                            l = l3;
                                            j5 = j4;
                                            j = j5 - 1;
                                            if (j > 0) {
                                                i3 = mo4966i();
                                                i3.mo4395d();
                                                i3.mo3172r().m28555x().m12355a("Clearing complex main event info. appId", str7);
                                                try {
                                                    y = i3.m29442y();
                                                    str8 = "delete from main_event_params where app_id=?";
                                                    zzgf = zzgf10;
                                                    try {
                                                        strArr = new String[1];
                                                        try {
                                                            strArr[0] = str7;
                                                            y.execSQL(str8, strArr);
                                                        } catch (SQLiteException e3) {
                                                            e = e3;
                                                            i3.mo3172r().v_().m12355a("Error clearing complex main event", e);
                                                            zzgf2 = zzgf9;
                                                            map4 = c3131a12;
                                                            i4 = i2;
                                                            zzgf3 = zzgf;
                                                            z = true;
                                                            zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                                                            zzggArr = zzgf3.f20587a;
                                                            length = zzggArr.length;
                                                            i8 = 0;
                                                            i5 = 0;
                                                            while (i8 < length) {
                                                                zzgg = zzggArr[i8];
                                                                mo4964g();
                                                                zzgf4 = zzgf3;
                                                                if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                                                    i = i5 + 1;
                                                                    zzggArr4[i5] = zzgg;
                                                                    i5 = i;
                                                                }
                                                                i8++;
                                                                zzgf3 = zzgf4;
                                                            }
                                                            zzgf4 = zzgf3;
                                                            if (i5 > 0) {
                                                                mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                                                str3 = str2;
                                                                zzggArr2 = zzggArr3;
                                                            } else {
                                                                i = zzggArr3.length;
                                                                intValue = 0;
                                                                while (intValue < i) {
                                                                    i8 = i5 + 1;
                                                                    zzggArr4[i5] = zzggArr3[intValue];
                                                                    intValue++;
                                                                    i5 = i8;
                                                                }
                                                                if (i5 == zzggArr4.length) {
                                                                    zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                                                }
                                                                zzggArr2 = zzggArr4;
                                                                str3 = str2;
                                                            }
                                                            l2 = l;
                                                            j4 = j;
                                                            a = mo4966i().m29409a(str7, zzgf2.f20588b);
                                                            if (a != null) {
                                                                mo3172r().m28540i().m12356a("Event aggregate wasn't created during raw event logging. appId, event", zzap.m28525a(str), mo4397o().m28503a(str3));
                                                                i7 = length2;
                                                                c3131a = c3131a13;
                                                                map5 = map2;
                                                                map6 = map3;
                                                                map7 = map;
                                                                map8 = c3131a8;
                                                                hashSet2 = hashSet;
                                                                zzgf5 = zzgf2;
                                                                zzglArr2 = zzglArr4;
                                                                str4 = str7;
                                                                cyVar = new cy(str, zzgf2.f20588b, 1, 1, zzgf2.f20589c.longValue(), 0, null, null, null, null);
                                                            } else {
                                                                i7 = length2;
                                                                c3131a = c3131a13;
                                                                map8 = c3131a8;
                                                                zzgf5 = zzgf2;
                                                                zzglArr2 = zzglArr4;
                                                                str4 = str7;
                                                                hashSet2 = hashSet;
                                                                map7 = map;
                                                                map5 = map2;
                                                                map6 = map3;
                                                                a = a.m12311a();
                                                            }
                                                            mo4966i().m29417a(a);
                                                            j2 = a.f10614c;
                                                            c3131a9 = c3131a;
                                                            map9 = (Map) c3131a9.get(str3);
                                                            if (map9 == null) {
                                                                map9 = mo4966i().m29436f(str4, str3);
                                                                if (map9 == null) {
                                                                    map9 = new C3131a();
                                                                }
                                                                c3131a9.put(str3, map9);
                                                            }
                                                            map10 = map9;
                                                            it = map10.keySet().iterator();
                                                            while (it.hasNext()) {
                                                                intValue2 = ((Integer) it.next()).intValue();
                                                                hashSet3 = hashSet2;
                                                                if (hashSet3.contains(Integer.valueOf(intValue2))) {
                                                                    map11 = map8;
                                                                    zzgd = (zzgd) map11.get(Integer.valueOf(intValue2));
                                                                    c3131a12 = map6;
                                                                    bitSet = (BitSet) c3131a12.get(Integer.valueOf(intValue2));
                                                                    zzgf6 = zzgf5;
                                                                    map12 = c3131a9;
                                                                    c3131a9 = map5;
                                                                    bitSet10 = (BitSet) c3131a9.get(Integer.valueOf(intValue2));
                                                                    if (c) {
                                                                        bitSet2 = bitSet10;
                                                                        it2 = it;
                                                                        map13 = map4;
                                                                        c3131a8 = map7;
                                                                        map14 = null;
                                                                        map30 = null;
                                                                    } else {
                                                                        bitSet2 = bitSet10;
                                                                        it2 = it;
                                                                        c3131a8 = map7;
                                                                        map30 = (Map) c3131a8.get(Integer.valueOf(intValue2));
                                                                        map13 = map4;
                                                                        map14 = (Map) map13.get(Integer.valueOf(intValue2));
                                                                    }
                                                                    if (zzgd != null) {
                                                                        zzgd = new zzgd();
                                                                        map11.put(Integer.valueOf(intValue2), zzgd);
                                                                        zzgd.f20582d = Boolean.valueOf(z);
                                                                        bitSet = new BitSet();
                                                                        c3131a12.put(Integer.valueOf(intValue2), bitSet);
                                                                        bitSet11 = new BitSet();
                                                                        map31 = map14;
                                                                        c3131a9.put(Integer.valueOf(intValue2), bitSet11);
                                                                        if (c) {
                                                                            map15 = map13;
                                                                            c3131a2 = map30;
                                                                            map13 = map31;
                                                                            bitSet10 = bitSet11;
                                                                        } else {
                                                                            c3131a3 = new C3131a();
                                                                            bitSet3 = bitSet11;
                                                                            c3131a8.put(Integer.valueOf(intValue2), c3131a3);
                                                                            c3131a4 = new C3131a();
                                                                            c3131a5 = c3131a3;
                                                                            map13.put(Integer.valueOf(intValue2), c3131a4);
                                                                            map15 = map13;
                                                                            bitSet10 = bitSet3;
                                                                            c3131a2 = c3131a5;
                                                                            map13 = c3131a4;
                                                                        }
                                                                    } else {
                                                                        map31 = map14;
                                                                        map15 = map13;
                                                                        bitSet10 = bitSet2;
                                                                        c3131a2 = map30;
                                                                        map13 = map31;
                                                                    }
                                                                    for (zzfv zzfv3 : (List) r11.get(Integer.valueOf(intValue2))) {
                                                                        bitSet4 = bitSet10;
                                                                        map16 = map10;
                                                                        if (mo3172r().m28533a(2)) {
                                                                            map17 = c3131a12;
                                                                            map18 = c3131a8;
                                                                        } else {
                                                                            map17 = c3131a12;
                                                                            map18 = c3131a8;
                                                                            mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzfv3.f20536a, mo4397o().m28503a(zzfv3.f20537b));
                                                                            mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29776a(zzfv3));
                                                                        }
                                                                        if (zzfv3.f20536a != null) {
                                                                            if (zzfv3.f20536a.intValue() > 256) {
                                                                                if (c) {
                                                                                    str5 = str3;
                                                                                    zzfv = zzfv3;
                                                                                    map19 = c3131a9;
                                                                                    map20 = map11;
                                                                                    zzgf7 = zzgf6;
                                                                                    c3131a8 = c3131a2;
                                                                                    bitSet5 = bitSet4;
                                                                                    map21 = map17;
                                                                                    bitSet6 = bitSet;
                                                                                    if (bitSet6.get(zzfv.f20536a.intValue())) {
                                                                                        a2 = m29373a(zzfv, str5, zzggArr2, j2);
                                                                                        mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                                                        if (a2 != null) {
                                                                                            hashSet3.add(Integer.valueOf(intValue2));
                                                                                        } else {
                                                                                            bitSet5.set(zzfv.f20536a.intValue());
                                                                                            if (a2.booleanValue()) {
                                                                                                bitSet6.set(zzfv.f20536a.intValue());
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        mo3172r().m28555x().m12356a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), zzfv.f20536a);
                                                                                    }
                                                                                } else {
                                                                                    if (zzfv3 == null) {
                                                                                    }
                                                                                    if (zzfv3 == null) {
                                                                                    }
                                                                                    if (!bitSet.get(zzfv3.f20536a.intValue())) {
                                                                                    }
                                                                                    zzfv2 = zzfv3;
                                                                                    bitSet5 = bitSet4;
                                                                                    map19 = c3131a9;
                                                                                    map20 = map11;
                                                                                    zzglArr3 = zzglArr;
                                                                                    zzgf7 = zzgf6;
                                                                                    bitSet6 = bitSet;
                                                                                    str5 = str3;
                                                                                    zzfv = zzfv2;
                                                                                    c3131a6 = c3131a2;
                                                                                    map21 = map17;
                                                                                    a2 = m29373a(zzfv2, str3, zzggArr2, j2);
                                                                                    mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                                                    if (a2 != null) {
                                                                                        hashSet3.add(Integer.valueOf(intValue2));
                                                                                    } else {
                                                                                        bitSet5.set(zzfv.f20536a.intValue());
                                                                                        if (a2.booleanValue()) {
                                                                                            bitSet6.set(zzfv.f20536a.intValue());
                                                                                            if (obj2 == null) {
                                                                                                m29382b(map13, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                                            } else {
                                                                                                c3131a8 = c3131a6;
                                                                                                m29380a(c3131a8, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    bitSet = bitSet6;
                                                                                    bitSet10 = bitSet5;
                                                                                    zzgf6 = zzgf7;
                                                                                    map10 = map16;
                                                                                    c3131a8 = map18;
                                                                                    c3131a9 = map19;
                                                                                    map11 = map20;
                                                                                    c3131a12 = map21;
                                                                                    str3 = str5;
                                                                                    c3131a2 = c3131a6;
                                                                                    zzglArr2 = zzglArr;
                                                                                    str4 = str;
                                                                                }
                                                                                bitSet = bitSet6;
                                                                                bitSet10 = bitSet5;
                                                                                c3131a2 = c3131a8;
                                                                                zzgf6 = zzgf7;
                                                                                map10 = map16;
                                                                                c3131a8 = map18;
                                                                                c3131a9 = map19;
                                                                                map11 = map20;
                                                                                c3131a12 = map21;
                                                                                str3 = str5;
                                                                                zzglArr2 = zzglArr;
                                                                                str4 = str;
                                                                            }
                                                                        }
                                                                        str5 = str3;
                                                                        map19 = c3131a9;
                                                                        map20 = map11;
                                                                        zzgf7 = zzgf6;
                                                                        c3131a8 = c3131a2;
                                                                        bitSet5 = bitSet4;
                                                                        map21 = map17;
                                                                        bitSet6 = bitSet;
                                                                        mo3172r().m28540i().m12356a("Invalid event filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfv3.f20536a));
                                                                        bitSet = bitSet6;
                                                                        bitSet10 = bitSet5;
                                                                        c3131a2 = c3131a8;
                                                                        zzgf6 = zzgf7;
                                                                        map10 = map16;
                                                                        c3131a8 = map18;
                                                                        c3131a9 = map19;
                                                                        map11 = map20;
                                                                        c3131a12 = map21;
                                                                        str3 = str5;
                                                                        zzglArr2 = zzglArr;
                                                                        str4 = str;
                                                                    }
                                                                    map6 = c3131a12;
                                                                    map5 = c3131a9;
                                                                    map7 = c3131a8;
                                                                    hashSet2 = hashSet3;
                                                                    zzgf5 = zzgf6;
                                                                    c3131a9 = map12;
                                                                    it = it2;
                                                                    map4 = map15;
                                                                    map8 = map11;
                                                                    zzglArr2 = zzglArr;
                                                                    str4 = str;
                                                                    cqVar = this;
                                                                } else {
                                                                    mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(intValue2));
                                                                    hashSet2 = hashSet3;
                                                                }
                                                            }
                                                            c3131a7 = c3131a9;
                                                            map15 = map4;
                                                            map19 = map5;
                                                            map21 = map6;
                                                            hashSet3 = hashSet2;
                                                            map20 = map8;
                                                            map18 = map7;
                                                            l3 = l2;
                                                            j3 = j4;
                                                            zzgf8 = zzgf4;
                                                            i8 = i4 + 1;
                                                            zzgfArr2 = zzgfArr;
                                                            hashSet = hashSet3;
                                                            length2 = i7;
                                                            c3131a13 = c3131a7;
                                                            c3131a12 = map15;
                                                            map = map18;
                                                            map2 = map19;
                                                            c3131a8 = map20;
                                                            map3 = map21;
                                                            cqVar = this;
                                                            zzglArr4 = zzglArr;
                                                            str7 = str;
                                                        }
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        i3.mo3172r().v_().m12355a("Error clearing complex main event", e);
                                                        zzgf2 = zzgf9;
                                                        map4 = c3131a12;
                                                        i4 = i2;
                                                        zzgf3 = zzgf;
                                                        z = true;
                                                        zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                                                        zzggArr = zzgf3.f20587a;
                                                        length = zzggArr.length;
                                                        i8 = 0;
                                                        i5 = 0;
                                                        while (i8 < length) {
                                                            zzgg = zzggArr[i8];
                                                            mo4964g();
                                                            zzgf4 = zzgf3;
                                                            if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                                                i = i5 + 1;
                                                                zzggArr4[i5] = zzgg;
                                                                i5 = i;
                                                            }
                                                            i8++;
                                                            zzgf3 = zzgf4;
                                                        }
                                                        zzgf4 = zzgf3;
                                                        if (i5 > 0) {
                                                            i = zzggArr3.length;
                                                            intValue = 0;
                                                            while (intValue < i) {
                                                                i8 = i5 + 1;
                                                                zzggArr4[i5] = zzggArr3[intValue];
                                                                intValue++;
                                                                i5 = i8;
                                                            }
                                                            if (i5 == zzggArr4.length) {
                                                                zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                                            }
                                                            zzggArr2 = zzggArr4;
                                                            str3 = str2;
                                                        } else {
                                                            mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                                            str3 = str2;
                                                            zzggArr2 = zzggArr3;
                                                        }
                                                        l2 = l;
                                                        j4 = j;
                                                        a = mo4966i().m29409a(str7, zzgf2.f20588b);
                                                        if (a != null) {
                                                            i7 = length2;
                                                            c3131a = c3131a13;
                                                            map8 = c3131a8;
                                                            zzgf5 = zzgf2;
                                                            zzglArr2 = zzglArr4;
                                                            str4 = str7;
                                                            hashSet2 = hashSet;
                                                            map7 = map;
                                                            map5 = map2;
                                                            map6 = map3;
                                                            a = a.m12311a();
                                                        } else {
                                                            mo3172r().m28540i().m12356a("Event aggregate wasn't created during raw event logging. appId, event", zzap.m28525a(str), mo4397o().m28503a(str3));
                                                            i7 = length2;
                                                            c3131a = c3131a13;
                                                            map5 = map2;
                                                            map6 = map3;
                                                            map7 = map;
                                                            map8 = c3131a8;
                                                            hashSet2 = hashSet;
                                                            zzgf5 = zzgf2;
                                                            zzglArr2 = zzglArr4;
                                                            str4 = str7;
                                                            cyVar = new cy(str, zzgf2.f20588b, 1, 1, zzgf2.f20589c.longValue(), 0, null, null, null, null);
                                                        }
                                                        mo4966i().m29417a(a);
                                                        j2 = a.f10614c;
                                                        c3131a9 = c3131a;
                                                        map9 = (Map) c3131a9.get(str3);
                                                        if (map9 == null) {
                                                            map9 = mo4966i().m29436f(str4, str3);
                                                            if (map9 == null) {
                                                                map9 = new C3131a();
                                                            }
                                                            c3131a9.put(str3, map9);
                                                        }
                                                        map10 = map9;
                                                        it = map10.keySet().iterator();
                                                        while (it.hasNext()) {
                                                            intValue2 = ((Integer) it.next()).intValue();
                                                            hashSet3 = hashSet2;
                                                            if (hashSet3.contains(Integer.valueOf(intValue2))) {
                                                                map11 = map8;
                                                                zzgd = (zzgd) map11.get(Integer.valueOf(intValue2));
                                                                c3131a12 = map6;
                                                                bitSet = (BitSet) c3131a12.get(Integer.valueOf(intValue2));
                                                                zzgf6 = zzgf5;
                                                                map12 = c3131a9;
                                                                c3131a9 = map5;
                                                                bitSet10 = (BitSet) c3131a9.get(Integer.valueOf(intValue2));
                                                                if (c) {
                                                                    bitSet2 = bitSet10;
                                                                    it2 = it;
                                                                    map13 = map4;
                                                                    c3131a8 = map7;
                                                                    map14 = null;
                                                                    map30 = null;
                                                                } else {
                                                                    bitSet2 = bitSet10;
                                                                    it2 = it;
                                                                    c3131a8 = map7;
                                                                    map30 = (Map) c3131a8.get(Integer.valueOf(intValue2));
                                                                    map13 = map4;
                                                                    map14 = (Map) map13.get(Integer.valueOf(intValue2));
                                                                }
                                                                if (zzgd != null) {
                                                                    map31 = map14;
                                                                    map15 = map13;
                                                                    bitSet10 = bitSet2;
                                                                    c3131a2 = map30;
                                                                    map13 = map31;
                                                                } else {
                                                                    zzgd = new zzgd();
                                                                    map11.put(Integer.valueOf(intValue2), zzgd);
                                                                    zzgd.f20582d = Boolean.valueOf(z);
                                                                    bitSet = new BitSet();
                                                                    c3131a12.put(Integer.valueOf(intValue2), bitSet);
                                                                    bitSet11 = new BitSet();
                                                                    map31 = map14;
                                                                    c3131a9.put(Integer.valueOf(intValue2), bitSet11);
                                                                    if (c) {
                                                                        map15 = map13;
                                                                        c3131a2 = map30;
                                                                        map13 = map31;
                                                                        bitSet10 = bitSet11;
                                                                    } else {
                                                                        c3131a3 = new C3131a();
                                                                        bitSet3 = bitSet11;
                                                                        c3131a8.put(Integer.valueOf(intValue2), c3131a3);
                                                                        c3131a4 = new C3131a();
                                                                        c3131a5 = c3131a3;
                                                                        map13.put(Integer.valueOf(intValue2), c3131a4);
                                                                        map15 = map13;
                                                                        bitSet10 = bitSet3;
                                                                        c3131a2 = c3131a5;
                                                                        map13 = c3131a4;
                                                                    }
                                                                }
                                                                for (zzfv zzfv32 : (List) r11.get(Integer.valueOf(intValue2))) {
                                                                    bitSet4 = bitSet10;
                                                                    map16 = map10;
                                                                    if (mo3172r().m28533a(2)) {
                                                                        map17 = c3131a12;
                                                                        map18 = c3131a8;
                                                                    } else {
                                                                        map17 = c3131a12;
                                                                        map18 = c3131a8;
                                                                        mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzfv32.f20536a, mo4397o().m28503a(zzfv32.f20537b));
                                                                        mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29776a(zzfv32));
                                                                    }
                                                                    if (zzfv32.f20536a != null) {
                                                                        if (zzfv32.f20536a.intValue() > 256) {
                                                                            if (c) {
                                                                                str5 = str3;
                                                                                zzfv = zzfv32;
                                                                                map19 = c3131a9;
                                                                                map20 = map11;
                                                                                zzgf7 = zzgf6;
                                                                                c3131a8 = c3131a2;
                                                                                bitSet5 = bitSet4;
                                                                                map21 = map17;
                                                                                bitSet6 = bitSet;
                                                                                if (bitSet6.get(zzfv.f20536a.intValue())) {
                                                                                    a2 = m29373a(zzfv, str5, zzggArr2, j2);
                                                                                    if (a2 != null) {
                                                                                    }
                                                                                    mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                                                    if (a2 != null) {
                                                                                        bitSet5.set(zzfv.f20536a.intValue());
                                                                                        if (a2.booleanValue()) {
                                                                                            bitSet6.set(zzfv.f20536a.intValue());
                                                                                        }
                                                                                    } else {
                                                                                        hashSet3.add(Integer.valueOf(intValue2));
                                                                                    }
                                                                                } else {
                                                                                    mo3172r().m28555x().m12356a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), zzfv.f20536a);
                                                                                }
                                                                            } else {
                                                                                if (zzfv32 == null) {
                                                                                }
                                                                                if (zzfv32 == null) {
                                                                                }
                                                                                if (!bitSet.get(zzfv32.f20536a.intValue())) {
                                                                                }
                                                                                zzfv2 = zzfv32;
                                                                                bitSet5 = bitSet4;
                                                                                map19 = c3131a9;
                                                                                map20 = map11;
                                                                                zzglArr3 = zzglArr;
                                                                                zzgf7 = zzgf6;
                                                                                bitSet6 = bitSet;
                                                                                str5 = str3;
                                                                                zzfv = zzfv2;
                                                                                c3131a6 = c3131a2;
                                                                                map21 = map17;
                                                                                a2 = m29373a(zzfv2, str3, zzggArr2, j2);
                                                                                if (a2 != null) {
                                                                                }
                                                                                mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                                                if (a2 != null) {
                                                                                    bitSet5.set(zzfv.f20536a.intValue());
                                                                                    if (a2.booleanValue()) {
                                                                                        bitSet6.set(zzfv.f20536a.intValue());
                                                                                        if (obj2 == null) {
                                                                                            c3131a8 = c3131a6;
                                                                                            m29380a(c3131a8, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                                        } else {
                                                                                            m29382b(map13, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    hashSet3.add(Integer.valueOf(intValue2));
                                                                                }
                                                                                bitSet = bitSet6;
                                                                                bitSet10 = bitSet5;
                                                                                zzgf6 = zzgf7;
                                                                                map10 = map16;
                                                                                c3131a8 = map18;
                                                                                c3131a9 = map19;
                                                                                map11 = map20;
                                                                                c3131a12 = map21;
                                                                                str3 = str5;
                                                                                c3131a2 = c3131a6;
                                                                                zzglArr2 = zzglArr;
                                                                                str4 = str;
                                                                            }
                                                                            bitSet = bitSet6;
                                                                            bitSet10 = bitSet5;
                                                                            c3131a2 = c3131a8;
                                                                            zzgf6 = zzgf7;
                                                                            map10 = map16;
                                                                            c3131a8 = map18;
                                                                            c3131a9 = map19;
                                                                            map11 = map20;
                                                                            c3131a12 = map21;
                                                                            str3 = str5;
                                                                            zzglArr2 = zzglArr;
                                                                            str4 = str;
                                                                        }
                                                                    }
                                                                    str5 = str3;
                                                                    map19 = c3131a9;
                                                                    map20 = map11;
                                                                    zzgf7 = zzgf6;
                                                                    c3131a8 = c3131a2;
                                                                    bitSet5 = bitSet4;
                                                                    map21 = map17;
                                                                    bitSet6 = bitSet;
                                                                    mo3172r().m28540i().m12356a("Invalid event filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfv32.f20536a));
                                                                    bitSet = bitSet6;
                                                                    bitSet10 = bitSet5;
                                                                    c3131a2 = c3131a8;
                                                                    zzgf6 = zzgf7;
                                                                    map10 = map16;
                                                                    c3131a8 = map18;
                                                                    c3131a9 = map19;
                                                                    map11 = map20;
                                                                    c3131a12 = map21;
                                                                    str3 = str5;
                                                                    zzglArr2 = zzglArr;
                                                                    str4 = str;
                                                                }
                                                                map6 = c3131a12;
                                                                map5 = c3131a9;
                                                                map7 = c3131a8;
                                                                hashSet2 = hashSet3;
                                                                zzgf5 = zzgf6;
                                                                c3131a9 = map12;
                                                                it = it2;
                                                                map4 = map15;
                                                                map8 = map11;
                                                                zzglArr2 = zzglArr;
                                                                str4 = str;
                                                                cqVar = this;
                                                            } else {
                                                                mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(intValue2));
                                                                hashSet2 = hashSet3;
                                                            }
                                                        }
                                                        c3131a7 = c3131a9;
                                                        map15 = map4;
                                                        map19 = map5;
                                                        map21 = map6;
                                                        hashSet3 = hashSet2;
                                                        map20 = map8;
                                                        map18 = map7;
                                                        l3 = l2;
                                                        j3 = j4;
                                                        zzgf8 = zzgf4;
                                                        i8 = i4 + 1;
                                                        zzgfArr2 = zzgfArr;
                                                        hashSet = hashSet3;
                                                        length2 = i7;
                                                        c3131a13 = c3131a7;
                                                        c3131a12 = map15;
                                                        map = map18;
                                                        map2 = map19;
                                                        c3131a8 = map20;
                                                        map3 = map21;
                                                        cqVar = this;
                                                        zzglArr4 = zzglArr;
                                                        str7 = str;
                                                    }
                                                } catch (SQLiteException e5) {
                                                    e = e5;
                                                    zzgf = zzgf10;
                                                    i3.mo3172r().v_().m12355a("Error clearing complex main event", e);
                                                    zzgf2 = zzgf9;
                                                    map4 = c3131a12;
                                                    i4 = i2;
                                                    zzgf3 = zzgf;
                                                    z = true;
                                                    zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                                                    zzggArr = zzgf3.f20587a;
                                                    length = zzggArr.length;
                                                    i8 = 0;
                                                    i5 = 0;
                                                    while (i8 < length) {
                                                        zzgg = zzggArr[i8];
                                                        mo4964g();
                                                        zzgf4 = zzgf3;
                                                        if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                                            i = i5 + 1;
                                                            zzggArr4[i5] = zzgg;
                                                            i5 = i;
                                                        }
                                                        i8++;
                                                        zzgf3 = zzgf4;
                                                    }
                                                    zzgf4 = zzgf3;
                                                    if (i5 > 0) {
                                                        i = zzggArr3.length;
                                                        intValue = 0;
                                                        while (intValue < i) {
                                                            i8 = i5 + 1;
                                                            zzggArr4[i5] = zzggArr3[intValue];
                                                            intValue++;
                                                            i5 = i8;
                                                        }
                                                        if (i5 == zzggArr4.length) {
                                                            zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                                        }
                                                        zzggArr2 = zzggArr4;
                                                        str3 = str2;
                                                    } else {
                                                        mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                                        str3 = str2;
                                                        zzggArr2 = zzggArr3;
                                                    }
                                                    l2 = l;
                                                    j4 = j;
                                                    a = mo4966i().m29409a(str7, zzgf2.f20588b);
                                                    if (a != null) {
                                                        i7 = length2;
                                                        c3131a = c3131a13;
                                                        map8 = c3131a8;
                                                        zzgf5 = zzgf2;
                                                        zzglArr2 = zzglArr4;
                                                        str4 = str7;
                                                        hashSet2 = hashSet;
                                                        map7 = map;
                                                        map5 = map2;
                                                        map6 = map3;
                                                        a = a.m12311a();
                                                    } else {
                                                        mo3172r().m28540i().m12356a("Event aggregate wasn't created during raw event logging. appId, event", zzap.m28525a(str), mo4397o().m28503a(str3));
                                                        i7 = length2;
                                                        c3131a = c3131a13;
                                                        map5 = map2;
                                                        map6 = map3;
                                                        map7 = map;
                                                        map8 = c3131a8;
                                                        hashSet2 = hashSet;
                                                        zzgf5 = zzgf2;
                                                        zzglArr2 = zzglArr4;
                                                        str4 = str7;
                                                        cyVar = new cy(str, zzgf2.f20588b, 1, 1, zzgf2.f20589c.longValue(), 0, null, null, null, null);
                                                    }
                                                    mo4966i().m29417a(a);
                                                    j2 = a.f10614c;
                                                    c3131a9 = c3131a;
                                                    map9 = (Map) c3131a9.get(str3);
                                                    if (map9 == null) {
                                                        map9 = mo4966i().m29436f(str4, str3);
                                                        if (map9 == null) {
                                                            map9 = new C3131a();
                                                        }
                                                        c3131a9.put(str3, map9);
                                                    }
                                                    map10 = map9;
                                                    it = map10.keySet().iterator();
                                                    while (it.hasNext()) {
                                                        intValue2 = ((Integer) it.next()).intValue();
                                                        hashSet3 = hashSet2;
                                                        if (hashSet3.contains(Integer.valueOf(intValue2))) {
                                                            map11 = map8;
                                                            zzgd = (zzgd) map11.get(Integer.valueOf(intValue2));
                                                            c3131a12 = map6;
                                                            bitSet = (BitSet) c3131a12.get(Integer.valueOf(intValue2));
                                                            zzgf6 = zzgf5;
                                                            map12 = c3131a9;
                                                            c3131a9 = map5;
                                                            bitSet10 = (BitSet) c3131a9.get(Integer.valueOf(intValue2));
                                                            if (c) {
                                                                bitSet2 = bitSet10;
                                                                it2 = it;
                                                                map13 = map4;
                                                                c3131a8 = map7;
                                                                map14 = null;
                                                                map30 = null;
                                                            } else {
                                                                bitSet2 = bitSet10;
                                                                it2 = it;
                                                                c3131a8 = map7;
                                                                map30 = (Map) c3131a8.get(Integer.valueOf(intValue2));
                                                                map13 = map4;
                                                                map14 = (Map) map13.get(Integer.valueOf(intValue2));
                                                            }
                                                            if (zzgd != null) {
                                                                map31 = map14;
                                                                map15 = map13;
                                                                bitSet10 = bitSet2;
                                                                c3131a2 = map30;
                                                                map13 = map31;
                                                            } else {
                                                                zzgd = new zzgd();
                                                                map11.put(Integer.valueOf(intValue2), zzgd);
                                                                zzgd.f20582d = Boolean.valueOf(z);
                                                                bitSet = new BitSet();
                                                                c3131a12.put(Integer.valueOf(intValue2), bitSet);
                                                                bitSet11 = new BitSet();
                                                                map31 = map14;
                                                                c3131a9.put(Integer.valueOf(intValue2), bitSet11);
                                                                if (c) {
                                                                    map15 = map13;
                                                                    c3131a2 = map30;
                                                                    map13 = map31;
                                                                    bitSet10 = bitSet11;
                                                                } else {
                                                                    c3131a3 = new C3131a();
                                                                    bitSet3 = bitSet11;
                                                                    c3131a8.put(Integer.valueOf(intValue2), c3131a3);
                                                                    c3131a4 = new C3131a();
                                                                    c3131a5 = c3131a3;
                                                                    map13.put(Integer.valueOf(intValue2), c3131a4);
                                                                    map15 = map13;
                                                                    bitSet10 = bitSet3;
                                                                    c3131a2 = c3131a5;
                                                                    map13 = c3131a4;
                                                                }
                                                            }
                                                            for (zzfv zzfv322 : (List) r11.get(Integer.valueOf(intValue2))) {
                                                                bitSet4 = bitSet10;
                                                                map16 = map10;
                                                                if (mo3172r().m28533a(2)) {
                                                                    map17 = c3131a12;
                                                                    map18 = c3131a8;
                                                                } else {
                                                                    map17 = c3131a12;
                                                                    map18 = c3131a8;
                                                                    mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzfv322.f20536a, mo4397o().m28503a(zzfv322.f20537b));
                                                                    mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29776a(zzfv322));
                                                                }
                                                                if (zzfv322.f20536a != null) {
                                                                    if (zzfv322.f20536a.intValue() > 256) {
                                                                        if (c) {
                                                                            str5 = str3;
                                                                            zzfv = zzfv322;
                                                                            map19 = c3131a9;
                                                                            map20 = map11;
                                                                            zzgf7 = zzgf6;
                                                                            c3131a8 = c3131a2;
                                                                            bitSet5 = bitSet4;
                                                                            map21 = map17;
                                                                            bitSet6 = bitSet;
                                                                            if (bitSet6.get(zzfv.f20536a.intValue())) {
                                                                                a2 = m29373a(zzfv, str5, zzggArr2, j2);
                                                                                if (a2 != null) {
                                                                                }
                                                                                mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                                                if (a2 != null) {
                                                                                    bitSet5.set(zzfv.f20536a.intValue());
                                                                                    if (a2.booleanValue()) {
                                                                                        bitSet6.set(zzfv.f20536a.intValue());
                                                                                    }
                                                                                } else {
                                                                                    hashSet3.add(Integer.valueOf(intValue2));
                                                                                }
                                                                            } else {
                                                                                mo3172r().m28555x().m12356a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), zzfv.f20536a);
                                                                            }
                                                                        } else {
                                                                            if (zzfv322 == null) {
                                                                            }
                                                                            if (zzfv322 == null) {
                                                                            }
                                                                            if (!bitSet.get(zzfv322.f20536a.intValue())) {
                                                                            }
                                                                            zzfv2 = zzfv322;
                                                                            bitSet5 = bitSet4;
                                                                            map19 = c3131a9;
                                                                            map20 = map11;
                                                                            zzglArr3 = zzglArr;
                                                                            zzgf7 = zzgf6;
                                                                            bitSet6 = bitSet;
                                                                            str5 = str3;
                                                                            zzfv = zzfv2;
                                                                            c3131a6 = c3131a2;
                                                                            map21 = map17;
                                                                            a2 = m29373a(zzfv2, str3, zzggArr2, j2);
                                                                            if (a2 != null) {
                                                                            }
                                                                            mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                                            if (a2 != null) {
                                                                                bitSet5.set(zzfv.f20536a.intValue());
                                                                                if (a2.booleanValue()) {
                                                                                    bitSet6.set(zzfv.f20536a.intValue());
                                                                                    if (obj2 == null) {
                                                                                        c3131a8 = c3131a6;
                                                                                        m29380a(c3131a8, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                                    } else {
                                                                                        m29382b(map13, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                hashSet3.add(Integer.valueOf(intValue2));
                                                                            }
                                                                            bitSet = bitSet6;
                                                                            bitSet10 = bitSet5;
                                                                            zzgf6 = zzgf7;
                                                                            map10 = map16;
                                                                            c3131a8 = map18;
                                                                            c3131a9 = map19;
                                                                            map11 = map20;
                                                                            c3131a12 = map21;
                                                                            str3 = str5;
                                                                            c3131a2 = c3131a6;
                                                                            zzglArr2 = zzglArr;
                                                                            str4 = str;
                                                                        }
                                                                        bitSet = bitSet6;
                                                                        bitSet10 = bitSet5;
                                                                        c3131a2 = c3131a8;
                                                                        zzgf6 = zzgf7;
                                                                        map10 = map16;
                                                                        c3131a8 = map18;
                                                                        c3131a9 = map19;
                                                                        map11 = map20;
                                                                        c3131a12 = map21;
                                                                        str3 = str5;
                                                                        zzglArr2 = zzglArr;
                                                                        str4 = str;
                                                                    }
                                                                }
                                                                str5 = str3;
                                                                map19 = c3131a9;
                                                                map20 = map11;
                                                                zzgf7 = zzgf6;
                                                                c3131a8 = c3131a2;
                                                                bitSet5 = bitSet4;
                                                                map21 = map17;
                                                                bitSet6 = bitSet;
                                                                mo3172r().m28540i().m12356a("Invalid event filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfv322.f20536a));
                                                                bitSet = bitSet6;
                                                                bitSet10 = bitSet5;
                                                                c3131a2 = c3131a8;
                                                                zzgf6 = zzgf7;
                                                                map10 = map16;
                                                                c3131a8 = map18;
                                                                c3131a9 = map19;
                                                                map11 = map20;
                                                                c3131a12 = map21;
                                                                str3 = str5;
                                                                zzglArr2 = zzglArr;
                                                                str4 = str;
                                                            }
                                                            map6 = c3131a12;
                                                            map5 = c3131a9;
                                                            map7 = c3131a8;
                                                            hashSet2 = hashSet3;
                                                            zzgf5 = zzgf6;
                                                            c3131a9 = map12;
                                                            it = it2;
                                                            map4 = map15;
                                                            map8 = map11;
                                                            zzglArr2 = zzglArr;
                                                            str4 = str;
                                                            cqVar = this;
                                                        } else {
                                                            mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(intValue2));
                                                            hashSet2 = hashSet3;
                                                        }
                                                    }
                                                    c3131a7 = c3131a9;
                                                    map15 = map4;
                                                    map19 = map5;
                                                    map21 = map6;
                                                    hashSet3 = hashSet2;
                                                    map20 = map8;
                                                    map18 = map7;
                                                    l3 = l2;
                                                    j3 = j4;
                                                    zzgf8 = zzgf4;
                                                    i8 = i4 + 1;
                                                    zzgfArr2 = zzgfArr;
                                                    hashSet = hashSet3;
                                                    length2 = i7;
                                                    c3131a13 = c3131a7;
                                                    c3131a12 = map15;
                                                    map = map18;
                                                    map2 = map19;
                                                    c3131a8 = map20;
                                                    map3 = map21;
                                                    cqVar = this;
                                                    zzglArr4 = zzglArr;
                                                    str7 = str;
                                                }
                                                zzgf2 = zzgf9;
                                                map4 = c3131a12;
                                                i4 = i2;
                                                zzgf3 = zzgf;
                                                z = true;
                                            } else {
                                                zzgf2 = zzgf9;
                                                i4 = i2;
                                                zzgf11 = zzgf10;
                                                z = true;
                                                map4 = c3131a12;
                                                mo4966i().m29424a(str, l5, j, zzgf11);
                                                zzgf3 = zzgf11;
                                            }
                                            zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                                            zzggArr = zzgf3.f20587a;
                                            length = zzggArr.length;
                                            i8 = 0;
                                            i5 = 0;
                                            while (i8 < length) {
                                                zzgg = zzggArr[i8];
                                                mo4964g();
                                                zzgf4 = zzgf3;
                                                if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                                    i = i5 + 1;
                                                    zzggArr4[i5] = zzgg;
                                                    i5 = i;
                                                }
                                                i8++;
                                                zzgf3 = zzgf4;
                                            }
                                            zzgf4 = zzgf3;
                                            if (i5 > 0) {
                                                i = zzggArr3.length;
                                                intValue = 0;
                                                while (intValue < i) {
                                                    i8 = i5 + 1;
                                                    zzggArr4[i5] = zzggArr3[intValue];
                                                    intValue++;
                                                    i5 = i8;
                                                }
                                                if (i5 == zzggArr4.length) {
                                                    zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                                }
                                                zzggArr2 = zzggArr4;
                                                str3 = str2;
                                            } else {
                                                mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                                str3 = str2;
                                                zzggArr2 = zzggArr3;
                                            }
                                            l2 = l;
                                            j4 = j;
                                        }
                                    }
                                    a3 = mo4966i().m29408a(str7, l5);
                                    if (a3 != null) {
                                        if (a3.first == null) {
                                            zzgf8 = (zzgf) a3.first;
                                            j5 = ((Long) a3.second).longValue();
                                            mo4964g();
                                            l = (Long) zzfg.m29774b(zzgf8, "_eid");
                                            zzgf10 = zzgf8;
                                            j = j5 - 1;
                                            if (j > 0) {
                                                zzgf2 = zzgf9;
                                                i4 = i2;
                                                zzgf11 = zzgf10;
                                                z = true;
                                                map4 = c3131a12;
                                                mo4966i().m29424a(str, l5, j, zzgf11);
                                                zzgf3 = zzgf11;
                                            } else {
                                                i3 = mo4966i();
                                                i3.mo4395d();
                                                i3.mo3172r().m28555x().m12355a("Clearing complex main event info. appId", str7);
                                                y = i3.m29442y();
                                                str8 = "delete from main_event_params where app_id=?";
                                                zzgf = zzgf10;
                                                strArr = new String[1];
                                                strArr[0] = str7;
                                                y.execSQL(str8, strArr);
                                                zzgf2 = zzgf9;
                                                map4 = c3131a12;
                                                i4 = i2;
                                                zzgf3 = zzgf;
                                                z = true;
                                            }
                                            zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                                            zzggArr = zzgf3.f20587a;
                                            length = zzggArr.length;
                                            i8 = 0;
                                            i5 = 0;
                                            while (i8 < length) {
                                                zzgg = zzggArr[i8];
                                                mo4964g();
                                                zzgf4 = zzgf3;
                                                if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                                    i = i5 + 1;
                                                    zzggArr4[i5] = zzgg;
                                                    i5 = i;
                                                }
                                                i8++;
                                                zzgf3 = zzgf4;
                                            }
                                            zzgf4 = zzgf3;
                                            if (i5 > 0) {
                                                mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                                str3 = str2;
                                                zzggArr2 = zzggArr3;
                                            } else {
                                                i = zzggArr3.length;
                                                intValue = 0;
                                                while (intValue < i) {
                                                    i8 = i5 + 1;
                                                    zzggArr4[i5] = zzggArr3[intValue];
                                                    intValue++;
                                                    i5 = i8;
                                                }
                                                if (i5 == zzggArr4.length) {
                                                    zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                                }
                                                zzggArr2 = zzggArr4;
                                                str3 = str2;
                                            }
                                            l2 = l;
                                            j4 = j;
                                        }
                                    }
                                    map4 = c3131a12;
                                    i4 = i2;
                                    mo3172r().v_().m12356a("Extra parameter without existing main event. eventName, eventId", str2, l5);
                                } else {
                                    mo3172r().v_().m12355a("Extra parameter without an event name. eventId", l5);
                                    map4 = c3131a12;
                                    i4 = i2;
                                }
                                i7 = length2;
                                c3131a7 = c3131a13;
                                map20 = c3131a8;
                                hashSet3 = hashSet;
                                map18 = map;
                                map19 = map2;
                                map21 = map3;
                                j3 = j4;
                                map15 = map4;
                                i8 = i4 + 1;
                                zzgfArr2 = zzgfArr;
                                hashSet = hashSet3;
                                length2 = i7;
                                c3131a13 = c3131a7;
                                c3131a12 = map15;
                                map = map18;
                                map2 = map19;
                                c3131a8 = map20;
                                map3 = map21;
                                cqVar = this;
                                zzglArr4 = zzglArr;
                                str7 = str;
                            } else {
                                zzgf2 = zzgf9;
                                map4 = c3131a12;
                                i4 = i2;
                                z = true;
                                if (obj5 != null) {
                                    mo4964g();
                                    l3 = Long.valueOf(0);
                                    e = zzfg.m29774b(zzgf2, "_epc");
                                    if (e == null) {
                                        e = l3;
                                    }
                                    longValue = ((Long) e).longValue();
                                    if (longValue > 0) {
                                        mo3172r().m28540i().m12355a("Complex event with zero extra param count. eventName", str2);
                                        l4 = l5;
                                    } else {
                                        l4 = l5;
                                        mo4966i().m29424a(str, l5, longValue, zzgf2);
                                    }
                                    l2 = l4;
                                    str3 = str2;
                                    zzggArr2 = zzggArr3;
                                    zzgf4 = zzgf2;
                                    j4 = longValue;
                                }
                            }
                            a = mo4966i().m29409a(str7, zzgf2.f20588b);
                            if (a != null) {
                                mo3172r().m28540i().m12356a("Event aggregate wasn't created during raw event logging. appId, event", zzap.m28525a(str), mo4397o().m28503a(str3));
                                i7 = length2;
                                c3131a = c3131a13;
                                map5 = map2;
                                map6 = map3;
                                map7 = map;
                                map8 = c3131a8;
                                hashSet2 = hashSet;
                                zzgf5 = zzgf2;
                                zzglArr2 = zzglArr4;
                                str4 = str7;
                                cyVar = new cy(str, zzgf2.f20588b, 1, 1, zzgf2.f20589c.longValue(), 0, null, null, null, null);
                            } else {
                                i7 = length2;
                                c3131a = c3131a13;
                                map8 = c3131a8;
                                zzgf5 = zzgf2;
                                zzglArr2 = zzglArr4;
                                str4 = str7;
                                hashSet2 = hashSet;
                                map7 = map;
                                map5 = map2;
                                map6 = map3;
                                a = a.m12311a();
                            }
                            mo4966i().m29417a(a);
                            j2 = a.f10614c;
                            c3131a9 = c3131a;
                            map9 = (Map) c3131a9.get(str3);
                            if (map9 == null) {
                                map9 = mo4966i().m29436f(str4, str3);
                                if (map9 == null) {
                                    map9 = new C3131a();
                                }
                                c3131a9.put(str3, map9);
                            }
                            map10 = map9;
                            it = map10.keySet().iterator();
                            while (it.hasNext()) {
                                intValue2 = ((Integer) it.next()).intValue();
                                hashSet3 = hashSet2;
                                if (hashSet3.contains(Integer.valueOf(intValue2))) {
                                    mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(intValue2));
                                    hashSet2 = hashSet3;
                                } else {
                                    map11 = map8;
                                    zzgd = (zzgd) map11.get(Integer.valueOf(intValue2));
                                    c3131a12 = map6;
                                    bitSet = (BitSet) c3131a12.get(Integer.valueOf(intValue2));
                                    zzgf6 = zzgf5;
                                    map12 = c3131a9;
                                    c3131a9 = map5;
                                    bitSet10 = (BitSet) c3131a9.get(Integer.valueOf(intValue2));
                                    if (c) {
                                        bitSet2 = bitSet10;
                                        it2 = it;
                                        c3131a8 = map7;
                                        map30 = (Map) c3131a8.get(Integer.valueOf(intValue2));
                                        map13 = map4;
                                        map14 = (Map) map13.get(Integer.valueOf(intValue2));
                                    } else {
                                        bitSet2 = bitSet10;
                                        it2 = it;
                                        map13 = map4;
                                        c3131a8 = map7;
                                        map14 = null;
                                        map30 = null;
                                    }
                                    if (zzgd != null) {
                                        zzgd = new zzgd();
                                        map11.put(Integer.valueOf(intValue2), zzgd);
                                        zzgd.f20582d = Boolean.valueOf(z);
                                        bitSet = new BitSet();
                                        c3131a12.put(Integer.valueOf(intValue2), bitSet);
                                        bitSet11 = new BitSet();
                                        map31 = map14;
                                        c3131a9.put(Integer.valueOf(intValue2), bitSet11);
                                        if (c) {
                                            c3131a3 = new C3131a();
                                            bitSet3 = bitSet11;
                                            c3131a8.put(Integer.valueOf(intValue2), c3131a3);
                                            c3131a4 = new C3131a();
                                            c3131a5 = c3131a3;
                                            map13.put(Integer.valueOf(intValue2), c3131a4);
                                            map15 = map13;
                                            bitSet10 = bitSet3;
                                            c3131a2 = c3131a5;
                                            map13 = c3131a4;
                                        } else {
                                            map15 = map13;
                                            c3131a2 = map30;
                                            map13 = map31;
                                            bitSet10 = bitSet11;
                                        }
                                    } else {
                                        map31 = map14;
                                        map15 = map13;
                                        bitSet10 = bitSet2;
                                        c3131a2 = map30;
                                        map13 = map31;
                                    }
                                    for (zzfv zzfv3222 : (List) r11.get(Integer.valueOf(intValue2))) {
                                        bitSet4 = bitSet10;
                                        map16 = map10;
                                        if (mo3172r().m28533a(2)) {
                                            map17 = c3131a12;
                                            map18 = c3131a8;
                                            mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzfv3222.f20536a, mo4397o().m28503a(zzfv3222.f20537b));
                                            mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29776a(zzfv3222));
                                        } else {
                                            map17 = c3131a12;
                                            map18 = c3131a8;
                                        }
                                        if (zzfv3222.f20536a != null) {
                                            if (zzfv3222.f20536a.intValue() > 256) {
                                                if (c) {
                                                    obj = (zzfv3222 == null && zzfv3222.f20540e != null && zzfv3222.f20540e.booleanValue()) ? 1 : null;
                                                    obj2 = (zzfv3222 == null && zzfv3222.f20541f != null && zzfv3222.f20541f.booleanValue()) ? 1 : null;
                                                    if (!bitSet.get(zzfv3222.f20536a.intValue()) && obj == null && obj2 == null) {
                                                        mo3172r().m28555x().m12356a("Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(intValue2), zzfv3222.f20536a);
                                                        bitSet10 = bitSet4;
                                                        map10 = map16;
                                                        c3131a12 = map17;
                                                        c3131a8 = map18;
                                                        zzglArr2 = zzglArr;
                                                        str4 = str;
                                                    } else {
                                                        zzfv2 = zzfv3222;
                                                        bitSet5 = bitSet4;
                                                        map19 = c3131a9;
                                                        map20 = map11;
                                                        zzglArr3 = zzglArr;
                                                        zzgf7 = zzgf6;
                                                        bitSet6 = bitSet;
                                                        str5 = str3;
                                                        zzfv = zzfv2;
                                                        c3131a6 = c3131a2;
                                                        map21 = map17;
                                                        a2 = m29373a(zzfv2, str3, zzggArr2, j2);
                                                        if (a2 != null) {
                                                        }
                                                        mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                        if (a2 != null) {
                                                            hashSet3.add(Integer.valueOf(intValue2));
                                                        } else {
                                                            bitSet5.set(zzfv.f20536a.intValue());
                                                            if (a2.booleanValue()) {
                                                                bitSet6.set(zzfv.f20536a.intValue());
                                                                if (!((obj == null && obj2 == null) || zzgf7.f20589c == null)) {
                                                                    if (obj2 == null) {
                                                                        m29382b(map13, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                    } else {
                                                                        c3131a8 = c3131a6;
                                                                        m29380a(c3131a8, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        bitSet = bitSet6;
                                                        bitSet10 = bitSet5;
                                                        zzgf6 = zzgf7;
                                                        map10 = map16;
                                                        c3131a8 = map18;
                                                        c3131a9 = map19;
                                                        map11 = map20;
                                                        c3131a12 = map21;
                                                        str3 = str5;
                                                        c3131a2 = c3131a6;
                                                        zzglArr2 = zzglArr;
                                                        str4 = str;
                                                    }
                                                } else {
                                                    str5 = str3;
                                                    zzfv = zzfv3222;
                                                    map19 = c3131a9;
                                                    map20 = map11;
                                                    zzgf7 = zzgf6;
                                                    c3131a8 = c3131a2;
                                                    bitSet5 = bitSet4;
                                                    map21 = map17;
                                                    bitSet6 = bitSet;
                                                    if (bitSet6.get(zzfv.f20536a.intValue())) {
                                                        mo3172r().m28555x().m12356a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), zzfv.f20536a);
                                                    } else {
                                                        a2 = m29373a(zzfv, str5, zzggArr2, j2);
                                                        if (a2 != null) {
                                                        }
                                                        mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                        if (a2 != null) {
                                                            hashSet3.add(Integer.valueOf(intValue2));
                                                        } else {
                                                            bitSet5.set(zzfv.f20536a.intValue());
                                                            if (a2.booleanValue()) {
                                                                bitSet6.set(zzfv.f20536a.intValue());
                                                            }
                                                        }
                                                    }
                                                }
                                                bitSet = bitSet6;
                                                bitSet10 = bitSet5;
                                                c3131a2 = c3131a8;
                                                zzgf6 = zzgf7;
                                                map10 = map16;
                                                c3131a8 = map18;
                                                c3131a9 = map19;
                                                map11 = map20;
                                                c3131a12 = map21;
                                                str3 = str5;
                                                zzglArr2 = zzglArr;
                                                str4 = str;
                                            }
                                        }
                                        str5 = str3;
                                        map19 = c3131a9;
                                        map20 = map11;
                                        zzgf7 = zzgf6;
                                        c3131a8 = c3131a2;
                                        bitSet5 = bitSet4;
                                        map21 = map17;
                                        bitSet6 = bitSet;
                                        mo3172r().m28540i().m12356a("Invalid event filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfv3222.f20536a));
                                        bitSet = bitSet6;
                                        bitSet10 = bitSet5;
                                        c3131a2 = c3131a8;
                                        zzgf6 = zzgf7;
                                        map10 = map16;
                                        c3131a8 = map18;
                                        c3131a9 = map19;
                                        map11 = map20;
                                        c3131a12 = map21;
                                        str3 = str5;
                                        zzglArr2 = zzglArr;
                                        str4 = str;
                                    }
                                    map6 = c3131a12;
                                    map5 = c3131a9;
                                    map7 = c3131a8;
                                    hashSet2 = hashSet3;
                                    zzgf5 = zzgf6;
                                    c3131a9 = map12;
                                    it = it2;
                                    map4 = map15;
                                    map8 = map11;
                                    zzglArr2 = zzglArr;
                                    str4 = str;
                                    cqVar = this;
                                }
                            }
                            c3131a7 = c3131a9;
                            map15 = map4;
                            map19 = map5;
                            map21 = map6;
                            hashSet3 = hashSet2;
                            map20 = map8;
                            map18 = map7;
                            l3 = l2;
                            j3 = j4;
                            zzgf8 = zzgf4;
                            i8 = i4 + 1;
                            zzgfArr2 = zzgfArr;
                            hashSet = hashSet3;
                            length2 = i7;
                            c3131a13 = c3131a7;
                            c3131a12 = map15;
                            map = map18;
                            map2 = map19;
                            c3131a8 = map20;
                            map3 = map21;
                            cqVar = this;
                            zzglArr4 = zzglArr;
                            str7 = str;
                        }
                    } else {
                        i2 = i8;
                    }
                    obj4 = null;
                    if (obj4 == null) {
                        zzgf2 = zzgf9;
                        map4 = c3131a12;
                        i4 = i2;
                        z = true;
                        if (obj5 != null) {
                            mo4964g();
                            l3 = Long.valueOf(0);
                            e = zzfg.m29774b(zzgf2, "_epc");
                            if (e == null) {
                                e = l3;
                            }
                            longValue = ((Long) e).longValue();
                            if (longValue > 0) {
                                l4 = l5;
                                mo4966i().m29424a(str, l5, longValue, zzgf2);
                            } else {
                                mo3172r().m28540i().m12355a("Complex event with zero extra param count. eventName", str2);
                                l4 = l5;
                            }
                            l2 = l4;
                            str3 = str2;
                            zzggArr2 = zzggArr3;
                            zzgf4 = zzgf2;
                            j4 = longValue;
                        }
                    } else {
                        mo4964g();
                        str2 = (String) zzfg.m29774b(zzgf9, "_en");
                        if (!TextUtils.isEmpty(str2)) {
                            mo3172r().v_().m12355a("Extra parameter without an event name. eventId", l5);
                            map4 = c3131a12;
                            i4 = i2;
                        } else if (l5.longValue() != l3.longValue()) {
                            zzgf10 = zzgf8;
                            l = l3;
                            j5 = j4;
                            j = j5 - 1;
                            if (j > 0) {
                                i3 = mo4966i();
                                i3.mo4395d();
                                i3.mo3172r().m28555x().m12355a("Clearing complex main event info. appId", str7);
                                y = i3.m29442y();
                                str8 = "delete from main_event_params where app_id=?";
                                zzgf = zzgf10;
                                strArr = new String[1];
                                strArr[0] = str7;
                                y.execSQL(str8, strArr);
                                zzgf2 = zzgf9;
                                map4 = c3131a12;
                                i4 = i2;
                                zzgf3 = zzgf;
                                z = true;
                            } else {
                                zzgf2 = zzgf9;
                                i4 = i2;
                                zzgf11 = zzgf10;
                                z = true;
                                map4 = c3131a12;
                                mo4966i().m29424a(str, l5, j, zzgf11);
                                zzgf3 = zzgf11;
                            }
                            zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                            zzggArr = zzgf3.f20587a;
                            length = zzggArr.length;
                            i8 = 0;
                            i5 = 0;
                            while (i8 < length) {
                                zzgg = zzggArr[i8];
                                mo4964g();
                                zzgf4 = zzgf3;
                                if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                    i = i5 + 1;
                                    zzggArr4[i5] = zzgg;
                                    i5 = i;
                                }
                                i8++;
                                zzgf3 = zzgf4;
                            }
                            zzgf4 = zzgf3;
                            if (i5 > 0) {
                                i = zzggArr3.length;
                                intValue = 0;
                                while (intValue < i) {
                                    i8 = i5 + 1;
                                    zzggArr4[i5] = zzggArr3[intValue];
                                    intValue++;
                                    i5 = i8;
                                }
                                if (i5 == zzggArr4.length) {
                                    zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                }
                                zzggArr2 = zzggArr4;
                                str3 = str2;
                            } else {
                                mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                str3 = str2;
                                zzggArr2 = zzggArr3;
                            }
                            l2 = l;
                            j4 = j;
                        } else {
                            a3 = mo4966i().m29408a(str7, l5);
                            if (a3 != null) {
                                if (a3.first == null) {
                                    zzgf8 = (zzgf) a3.first;
                                    j5 = ((Long) a3.second).longValue();
                                    mo4964g();
                                    l = (Long) zzfg.m29774b(zzgf8, "_eid");
                                    zzgf10 = zzgf8;
                                    j = j5 - 1;
                                    if (j > 0) {
                                        zzgf2 = zzgf9;
                                        i4 = i2;
                                        zzgf11 = zzgf10;
                                        z = true;
                                        map4 = c3131a12;
                                        mo4966i().m29424a(str, l5, j, zzgf11);
                                        zzgf3 = zzgf11;
                                    } else {
                                        i3 = mo4966i();
                                        i3.mo4395d();
                                        i3.mo3172r().m28555x().m12355a("Clearing complex main event info. appId", str7);
                                        y = i3.m29442y();
                                        str8 = "delete from main_event_params where app_id=?";
                                        zzgf = zzgf10;
                                        strArr = new String[1];
                                        strArr[0] = str7;
                                        y.execSQL(str8, strArr);
                                        zzgf2 = zzgf9;
                                        map4 = c3131a12;
                                        i4 = i2;
                                        zzgf3 = zzgf;
                                        z = true;
                                    }
                                    zzggArr4 = new zzgg[(zzgf3.f20587a.length + zzggArr3.length)];
                                    zzggArr = zzgf3.f20587a;
                                    length = zzggArr.length;
                                    i8 = 0;
                                    i5 = 0;
                                    while (i8 < length) {
                                        zzgg = zzggArr[i8];
                                        mo4964g();
                                        zzgf4 = zzgf3;
                                        if (zzfg.m29764a(zzgf2, zzgg.f20593a) != null) {
                                            i = i5 + 1;
                                            zzggArr4[i5] = zzgg;
                                            i5 = i;
                                        }
                                        i8++;
                                        zzgf3 = zzgf4;
                                    }
                                    zzgf4 = zzgf3;
                                    if (i5 > 0) {
                                        mo3172r().m28540i().m12355a("No unique parameters in main event. eventName", str2);
                                        str3 = str2;
                                        zzggArr2 = zzggArr3;
                                    } else {
                                        i = zzggArr3.length;
                                        intValue = 0;
                                        while (intValue < i) {
                                            i8 = i5 + 1;
                                            zzggArr4[i5] = zzggArr3[intValue];
                                            intValue++;
                                            i5 = i8;
                                        }
                                        if (i5 == zzggArr4.length) {
                                            zzggArr4 = (zzgg[]) Arrays.copyOf(zzggArr4, i5);
                                        }
                                        zzggArr2 = zzggArr4;
                                        str3 = str2;
                                    }
                                    l2 = l;
                                    j4 = j;
                                }
                            }
                            map4 = c3131a12;
                            i4 = i2;
                            mo3172r().v_().m12356a("Extra parameter without existing main event. eventName, eventId", str2, l5);
                        }
                        i7 = length2;
                        c3131a7 = c3131a13;
                        map20 = c3131a8;
                        hashSet3 = hashSet;
                        map18 = map;
                        map19 = map2;
                        map21 = map3;
                        j3 = j4;
                        map15 = map4;
                        i8 = i4 + 1;
                        zzgfArr2 = zzgfArr;
                        hashSet = hashSet3;
                        length2 = i7;
                        c3131a13 = c3131a7;
                        c3131a12 = map15;
                        map = map18;
                        map2 = map19;
                        c3131a8 = map20;
                        map3 = map21;
                        cqVar = this;
                        zzglArr4 = zzglArr;
                        str7 = str;
                    }
                    a = mo4966i().m29409a(str7, zzgf2.f20588b);
                    if (a != null) {
                        i7 = length2;
                        c3131a = c3131a13;
                        map8 = c3131a8;
                        zzgf5 = zzgf2;
                        zzglArr2 = zzglArr4;
                        str4 = str7;
                        hashSet2 = hashSet;
                        map7 = map;
                        map5 = map2;
                        map6 = map3;
                        a = a.m12311a();
                    } else {
                        mo3172r().m28540i().m12356a("Event aggregate wasn't created during raw event logging. appId, event", zzap.m28525a(str), mo4397o().m28503a(str3));
                        i7 = length2;
                        c3131a = c3131a13;
                        map5 = map2;
                        map6 = map3;
                        map7 = map;
                        map8 = c3131a8;
                        hashSet2 = hashSet;
                        zzgf5 = zzgf2;
                        zzglArr2 = zzglArr4;
                        str4 = str7;
                        cyVar = new cy(str, zzgf2.f20588b, 1, 1, zzgf2.f20589c.longValue(), 0, null, null, null, null);
                    }
                    mo4966i().m29417a(a);
                    j2 = a.f10614c;
                    c3131a9 = c3131a;
                    map9 = (Map) c3131a9.get(str3);
                    if (map9 == null) {
                        map9 = mo4966i().m29436f(str4, str3);
                        if (map9 == null) {
                            map9 = new C3131a();
                        }
                        c3131a9.put(str3, map9);
                    }
                    map10 = map9;
                    it = map10.keySet().iterator();
                    while (it.hasNext()) {
                        intValue2 = ((Integer) it.next()).intValue();
                        hashSet3 = hashSet2;
                        if (hashSet3.contains(Integer.valueOf(intValue2))) {
                            map11 = map8;
                            zzgd = (zzgd) map11.get(Integer.valueOf(intValue2));
                            c3131a12 = map6;
                            bitSet = (BitSet) c3131a12.get(Integer.valueOf(intValue2));
                            zzgf6 = zzgf5;
                            map12 = c3131a9;
                            c3131a9 = map5;
                            bitSet10 = (BitSet) c3131a9.get(Integer.valueOf(intValue2));
                            if (c) {
                                bitSet2 = bitSet10;
                                it2 = it;
                                map13 = map4;
                                c3131a8 = map7;
                                map14 = null;
                                map30 = null;
                            } else {
                                bitSet2 = bitSet10;
                                it2 = it;
                                c3131a8 = map7;
                                map30 = (Map) c3131a8.get(Integer.valueOf(intValue2));
                                map13 = map4;
                                map14 = (Map) map13.get(Integer.valueOf(intValue2));
                            }
                            if (zzgd != null) {
                                map31 = map14;
                                map15 = map13;
                                bitSet10 = bitSet2;
                                c3131a2 = map30;
                                map13 = map31;
                            } else {
                                zzgd = new zzgd();
                                map11.put(Integer.valueOf(intValue2), zzgd);
                                zzgd.f20582d = Boolean.valueOf(z);
                                bitSet = new BitSet();
                                c3131a12.put(Integer.valueOf(intValue2), bitSet);
                                bitSet11 = new BitSet();
                                map31 = map14;
                                c3131a9.put(Integer.valueOf(intValue2), bitSet11);
                                if (c) {
                                    map15 = map13;
                                    c3131a2 = map30;
                                    map13 = map31;
                                    bitSet10 = bitSet11;
                                } else {
                                    c3131a3 = new C3131a();
                                    bitSet3 = bitSet11;
                                    c3131a8.put(Integer.valueOf(intValue2), c3131a3);
                                    c3131a4 = new C3131a();
                                    c3131a5 = c3131a3;
                                    map13.put(Integer.valueOf(intValue2), c3131a4);
                                    map15 = map13;
                                    bitSet10 = bitSet3;
                                    c3131a2 = c3131a5;
                                    map13 = c3131a4;
                                }
                            }
                            for (zzfv zzfv32222 : (List) r11.get(Integer.valueOf(intValue2))) {
                                bitSet4 = bitSet10;
                                map16 = map10;
                                if (mo3172r().m28533a(2)) {
                                    map17 = c3131a12;
                                    map18 = c3131a8;
                                } else {
                                    map17 = c3131a12;
                                    map18 = c3131a8;
                                    mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzfv32222.f20536a, mo4397o().m28503a(zzfv32222.f20537b));
                                    mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29776a(zzfv32222));
                                }
                                if (zzfv32222.f20536a != null) {
                                    if (zzfv32222.f20536a.intValue() > 256) {
                                        if (c) {
                                            str5 = str3;
                                            zzfv = zzfv32222;
                                            map19 = c3131a9;
                                            map20 = map11;
                                            zzgf7 = zzgf6;
                                            c3131a8 = c3131a2;
                                            bitSet5 = bitSet4;
                                            map21 = map17;
                                            bitSet6 = bitSet;
                                            if (bitSet6.get(zzfv.f20536a.intValue())) {
                                                a2 = m29373a(zzfv, str5, zzggArr2, j2);
                                                if (a2 != null) {
                                                }
                                                mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                                if (a2 != null) {
                                                    bitSet5.set(zzfv.f20536a.intValue());
                                                    if (a2.booleanValue()) {
                                                        bitSet6.set(zzfv.f20536a.intValue());
                                                    }
                                                } else {
                                                    hashSet3.add(Integer.valueOf(intValue2));
                                                }
                                            } else {
                                                mo3172r().m28555x().m12356a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), zzfv.f20536a);
                                            }
                                        } else {
                                            if (zzfv32222 == null) {
                                            }
                                            if (zzfv32222 == null) {
                                            }
                                            if (!bitSet.get(zzfv32222.f20536a.intValue())) {
                                            }
                                            zzfv2 = zzfv32222;
                                            bitSet5 = bitSet4;
                                            map19 = c3131a9;
                                            map20 = map11;
                                            zzglArr3 = zzglArr;
                                            zzgf7 = zzgf6;
                                            bitSet6 = bitSet;
                                            str5 = str3;
                                            zzfv = zzfv2;
                                            c3131a6 = c3131a2;
                                            map21 = map17;
                                            a2 = m29373a(zzfv2, str3, zzggArr2, j2);
                                            if (a2 != null) {
                                            }
                                            mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                            if (a2 != null) {
                                                bitSet5.set(zzfv.f20536a.intValue());
                                                if (a2.booleanValue()) {
                                                    bitSet6.set(zzfv.f20536a.intValue());
                                                    if (obj2 == null) {
                                                        c3131a8 = c3131a6;
                                                        m29380a(c3131a8, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                    } else {
                                                        m29382b(map13, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                    }
                                                }
                                            } else {
                                                hashSet3.add(Integer.valueOf(intValue2));
                                            }
                                            bitSet = bitSet6;
                                            bitSet10 = bitSet5;
                                            zzgf6 = zzgf7;
                                            map10 = map16;
                                            c3131a8 = map18;
                                            c3131a9 = map19;
                                            map11 = map20;
                                            c3131a12 = map21;
                                            str3 = str5;
                                            c3131a2 = c3131a6;
                                            zzglArr2 = zzglArr;
                                            str4 = str;
                                        }
                                        bitSet = bitSet6;
                                        bitSet10 = bitSet5;
                                        c3131a2 = c3131a8;
                                        zzgf6 = zzgf7;
                                        map10 = map16;
                                        c3131a8 = map18;
                                        c3131a9 = map19;
                                        map11 = map20;
                                        c3131a12 = map21;
                                        str3 = str5;
                                        zzglArr2 = zzglArr;
                                        str4 = str;
                                    }
                                }
                                str5 = str3;
                                map19 = c3131a9;
                                map20 = map11;
                                zzgf7 = zzgf6;
                                c3131a8 = c3131a2;
                                bitSet5 = bitSet4;
                                map21 = map17;
                                bitSet6 = bitSet;
                                mo3172r().m28540i().m12356a("Invalid event filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfv32222.f20536a));
                                bitSet = bitSet6;
                                bitSet10 = bitSet5;
                                c3131a2 = c3131a8;
                                zzgf6 = zzgf7;
                                map10 = map16;
                                c3131a8 = map18;
                                c3131a9 = map19;
                                map11 = map20;
                                c3131a12 = map21;
                                str3 = str5;
                                zzglArr2 = zzglArr;
                                str4 = str;
                            }
                            map6 = c3131a12;
                            map5 = c3131a9;
                            map7 = c3131a8;
                            hashSet2 = hashSet3;
                            zzgf5 = zzgf6;
                            c3131a9 = map12;
                            it = it2;
                            map4 = map15;
                            map8 = map11;
                            zzglArr2 = zzglArr;
                            str4 = str;
                            cqVar = this;
                        } else {
                            mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(intValue2));
                            hashSet2 = hashSet3;
                        }
                    }
                    c3131a7 = c3131a9;
                    map15 = map4;
                    map19 = map5;
                    map21 = map6;
                    hashSet3 = hashSet2;
                    map20 = map8;
                    map18 = map7;
                    l3 = l2;
                    j3 = j4;
                    zzgf8 = zzgf4;
                    i8 = i4 + 1;
                    zzgfArr2 = zzgfArr;
                    hashSet = hashSet3;
                    length2 = i7;
                    c3131a13 = c3131a7;
                    c3131a12 = map15;
                    map = map18;
                    map2 = map19;
                    c3131a8 = map20;
                    map3 = map21;
                    cqVar = this;
                    zzglArr4 = zzglArr;
                    str7 = str;
                } else {
                    i4 = i8;
                    zzgf2 = zzgf9;
                    map4 = c3131a12;
                    z = true;
                }
                zzgf4 = zzgf8;
                l2 = l3;
                str3 = str2;
                zzggArr2 = zzggArr3;
                a = mo4966i().m29409a(str7, zzgf2.f20588b);
                if (a != null) {
                    mo3172r().m28540i().m12356a("Event aggregate wasn't created during raw event logging. appId, event", zzap.m28525a(str), mo4397o().m28503a(str3));
                    i7 = length2;
                    c3131a = c3131a13;
                    map5 = map2;
                    map6 = map3;
                    map7 = map;
                    map8 = c3131a8;
                    hashSet2 = hashSet;
                    zzgf5 = zzgf2;
                    zzglArr2 = zzglArr4;
                    str4 = str7;
                    cyVar = new cy(str, zzgf2.f20588b, 1, 1, zzgf2.f20589c.longValue(), 0, null, null, null, null);
                } else {
                    i7 = length2;
                    c3131a = c3131a13;
                    map8 = c3131a8;
                    zzgf5 = zzgf2;
                    zzglArr2 = zzglArr4;
                    str4 = str7;
                    hashSet2 = hashSet;
                    map7 = map;
                    map5 = map2;
                    map6 = map3;
                    a = a.m12311a();
                }
                mo4966i().m29417a(a);
                j2 = a.f10614c;
                c3131a9 = c3131a;
                map9 = (Map) c3131a9.get(str3);
                if (map9 == null) {
                    map9 = mo4966i().m29436f(str4, str3);
                    if (map9 == null) {
                        map9 = new C3131a();
                    }
                    c3131a9.put(str3, map9);
                }
                map10 = map9;
                it = map10.keySet().iterator();
                while (it.hasNext()) {
                    intValue2 = ((Integer) it.next()).intValue();
                    hashSet3 = hashSet2;
                    if (hashSet3.contains(Integer.valueOf(intValue2))) {
                        mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(intValue2));
                        hashSet2 = hashSet3;
                    } else {
                        map11 = map8;
                        zzgd = (zzgd) map11.get(Integer.valueOf(intValue2));
                        c3131a12 = map6;
                        bitSet = (BitSet) c3131a12.get(Integer.valueOf(intValue2));
                        zzgf6 = zzgf5;
                        map12 = c3131a9;
                        c3131a9 = map5;
                        bitSet10 = (BitSet) c3131a9.get(Integer.valueOf(intValue2));
                        if (c) {
                            bitSet2 = bitSet10;
                            it2 = it;
                            c3131a8 = map7;
                            map30 = (Map) c3131a8.get(Integer.valueOf(intValue2));
                            map13 = map4;
                            map14 = (Map) map13.get(Integer.valueOf(intValue2));
                        } else {
                            bitSet2 = bitSet10;
                            it2 = it;
                            map13 = map4;
                            c3131a8 = map7;
                            map14 = null;
                            map30 = null;
                        }
                        if (zzgd != null) {
                            zzgd = new zzgd();
                            map11.put(Integer.valueOf(intValue2), zzgd);
                            zzgd.f20582d = Boolean.valueOf(z);
                            bitSet = new BitSet();
                            c3131a12.put(Integer.valueOf(intValue2), bitSet);
                            bitSet11 = new BitSet();
                            map31 = map14;
                            c3131a9.put(Integer.valueOf(intValue2), bitSet11);
                            if (c) {
                                c3131a3 = new C3131a();
                                bitSet3 = bitSet11;
                                c3131a8.put(Integer.valueOf(intValue2), c3131a3);
                                c3131a4 = new C3131a();
                                c3131a5 = c3131a3;
                                map13.put(Integer.valueOf(intValue2), c3131a4);
                                map15 = map13;
                                bitSet10 = bitSet3;
                                c3131a2 = c3131a5;
                                map13 = c3131a4;
                            } else {
                                map15 = map13;
                                c3131a2 = map30;
                                map13 = map31;
                                bitSet10 = bitSet11;
                            }
                        } else {
                            map31 = map14;
                            map15 = map13;
                            bitSet10 = bitSet2;
                            c3131a2 = map30;
                            map13 = map31;
                        }
                        for (zzfv zzfv322222 : (List) r11.get(Integer.valueOf(intValue2))) {
                            bitSet4 = bitSet10;
                            map16 = map10;
                            if (mo3172r().m28533a(2)) {
                                map17 = c3131a12;
                                map18 = c3131a8;
                                mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue2), zzfv322222.f20536a, mo4397o().m28503a(zzfv322222.f20537b));
                                mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29776a(zzfv322222));
                            } else {
                                map17 = c3131a12;
                                map18 = c3131a8;
                            }
                            if (zzfv322222.f20536a != null) {
                                if (zzfv322222.f20536a.intValue() > 256) {
                                    if (c) {
                                        if (zzfv322222 == null) {
                                        }
                                        if (zzfv322222 == null) {
                                        }
                                        if (!bitSet.get(zzfv322222.f20536a.intValue())) {
                                        }
                                        zzfv2 = zzfv322222;
                                        bitSet5 = bitSet4;
                                        map19 = c3131a9;
                                        map20 = map11;
                                        zzglArr3 = zzglArr;
                                        zzgf7 = zzgf6;
                                        bitSet6 = bitSet;
                                        str5 = str3;
                                        zzfv = zzfv2;
                                        c3131a6 = c3131a2;
                                        map21 = map17;
                                        a2 = m29373a(zzfv2, str3, zzggArr2, j2);
                                        if (a2 != null) {
                                        }
                                        mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                        if (a2 != null) {
                                            hashSet3.add(Integer.valueOf(intValue2));
                                        } else {
                                            bitSet5.set(zzfv.f20536a.intValue());
                                            if (a2.booleanValue()) {
                                                bitSet6.set(zzfv.f20536a.intValue());
                                                if (obj2 == null) {
                                                    m29382b(map13, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                } else {
                                                    c3131a8 = c3131a6;
                                                    m29380a(c3131a8, zzfv.f20536a.intValue(), zzgf7.f20589c.longValue());
                                                }
                                            }
                                        }
                                        bitSet = bitSet6;
                                        bitSet10 = bitSet5;
                                        zzgf6 = zzgf7;
                                        map10 = map16;
                                        c3131a8 = map18;
                                        c3131a9 = map19;
                                        map11 = map20;
                                        c3131a12 = map21;
                                        str3 = str5;
                                        c3131a2 = c3131a6;
                                        zzglArr2 = zzglArr;
                                        str4 = str;
                                    } else {
                                        str5 = str3;
                                        zzfv = zzfv322222;
                                        map19 = c3131a9;
                                        map20 = map11;
                                        zzgf7 = zzgf6;
                                        c3131a8 = c3131a2;
                                        bitSet5 = bitSet4;
                                        map21 = map17;
                                        bitSet6 = bitSet;
                                        if (bitSet6.get(zzfv.f20536a.intValue())) {
                                            mo3172r().m28555x().m12356a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue2), zzfv.f20536a);
                                        } else {
                                            a2 = m29373a(zzfv, str5, zzggArr2, j2);
                                            if (a2 != null) {
                                            }
                                            mo3172r().m28555x().m12355a("Event filter result", a2 != null ? "null" : a2);
                                            if (a2 != null) {
                                                hashSet3.add(Integer.valueOf(intValue2));
                                            } else {
                                                bitSet5.set(zzfv.f20536a.intValue());
                                                if (a2.booleanValue()) {
                                                    bitSet6.set(zzfv.f20536a.intValue());
                                                }
                                            }
                                        }
                                    }
                                    bitSet = bitSet6;
                                    bitSet10 = bitSet5;
                                    c3131a2 = c3131a8;
                                    zzgf6 = zzgf7;
                                    map10 = map16;
                                    c3131a8 = map18;
                                    c3131a9 = map19;
                                    map11 = map20;
                                    c3131a12 = map21;
                                    str3 = str5;
                                    zzglArr2 = zzglArr;
                                    str4 = str;
                                }
                            }
                            str5 = str3;
                            map19 = c3131a9;
                            map20 = map11;
                            zzgf7 = zzgf6;
                            c3131a8 = c3131a2;
                            bitSet5 = bitSet4;
                            map21 = map17;
                            bitSet6 = bitSet;
                            mo3172r().m28540i().m12356a("Invalid event filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfv322222.f20536a));
                            bitSet = bitSet6;
                            bitSet10 = bitSet5;
                            c3131a2 = c3131a8;
                            zzgf6 = zzgf7;
                            map10 = map16;
                            c3131a8 = map18;
                            c3131a9 = map19;
                            map11 = map20;
                            c3131a12 = map21;
                            str3 = str5;
                            zzglArr2 = zzglArr;
                            str4 = str;
                        }
                        map6 = c3131a12;
                        map5 = c3131a9;
                        map7 = c3131a8;
                        hashSet2 = hashSet3;
                        zzgf5 = zzgf6;
                        c3131a9 = map12;
                        it = it2;
                        map4 = map15;
                        map8 = map11;
                        zzglArr2 = zzglArr;
                        str4 = str;
                        cqVar = this;
                    }
                }
                c3131a7 = c3131a9;
                map15 = map4;
                map19 = map5;
                map21 = map6;
                hashSet3 = hashSet2;
                map20 = map8;
                map18 = map7;
                l3 = l2;
                j3 = j4;
                zzgf8 = zzgf4;
                i8 = i4 + 1;
                zzgfArr2 = zzgfArr;
                hashSet = hashSet3;
                length2 = i7;
                c3131a13 = c3131a7;
                c3131a12 = map15;
                map = map18;
                map2 = map19;
                c3131a8 = map20;
                map3 = map21;
                cqVar = this;
                zzglArr4 = zzglArr;
                str7 = str;
            }
        }
        map15 = c3131a12;
        map20 = c3131a8;
        hashSet3 = hashSet;
        map18 = map;
        map19 = map2;
        map21 = map3;
        zzgl[] zzglArr5 = zzglArr;
        if (zzglArr5 != null) {
            e2 = new C3131a();
            intValue = zzglArr5.length;
            length = 0;
            while (length < intValue) {
                String str9;
                Map map32;
                int i9;
                zzgl zzgl = zzglArr5[length];
                map22 = (Map) e2.get(zzgl.f20648b);
                if (map22 == null) {
                    map22 = mo4966i().m29438g(str, zzgl.f20648b);
                    if (map22 == null) {
                        map22 = new C3131a();
                    }
                    e2.put(zzgl.f20648b, map22);
                } else {
                    str9 = str;
                }
                Iterator it7 = map22.keySet().iterator();
                while (it7.hasNext()) {
                    length2 = ((Integer) it7.next()).intValue();
                    if (hashSet3.contains(Integer.valueOf(length2))) {
                        mo3172r().m28555x().m12355a("Skipping failed audience ID", Integer.valueOf(length2));
                    } else {
                        Map map33;
                        Map map34;
                        Iterator it8;
                        zzfy zzfy;
                        Map map35;
                        Iterator it9;
                        Object obj6;
                        Object obj7;
                        Boolean a4;
                        zzar x;
                        c3131a9 = map20;
                        zzgd zzgd2 = (zzgd) c3131a9.get(Integer.valueOf(length2));
                        c3131a8 = map21;
                        bitSet5 = (BitSet) c3131a8.get(Integer.valueOf(length2));
                        map11 = map19;
                        BitSet bitSet12 = (BitSet) map11.get(Integer.valueOf(length2));
                        if (c) {
                            map32 = e2;
                            map9 = map18;
                            map33 = (Map) map9.get(Integer.valueOf(length2));
                            i9 = intValue;
                            map14 = map15;
                            e2 = (Map) map14.get(Integer.valueOf(length2));
                        } else {
                            map32 = e2;
                            i9 = intValue;
                            map14 = map15;
                            map9 = map18;
                            e2 = null;
                            map33 = null;
                        }
                        if (zzgd2 == null) {
                            zzgd2 = new zzgd();
                            c3131a9.put(Integer.valueOf(length2), zzgd2);
                            zzgd2.f20582d = Boolean.valueOf(true);
                            bitSet5 = new BitSet();
                            c3131a8.put(Integer.valueOf(length2), bitSet5);
                            bitSet12 = new BitSet();
                            map11.put(Integer.valueOf(length2), bitSet12);
                            if (c) {
                                C3131a c3131a14 = new C3131a();
                                map9.put(Integer.valueOf(length2), c3131a14);
                                c3131a10 = new C3131a();
                                C3131a c3131a15 = c3131a14;
                                map14.put(Integer.valueOf(length2), c3131a10);
                                map34 = map14;
                                e2 = c3131a15;
                                it3 = ((List) map22.get(Integer.valueOf(length2))).iterator();
                                while (it3.hasNext()) {
                                    it8 = it3;
                                    zzfy = (zzfy) it3.next();
                                    map35 = map22;
                                    it9 = it7;
                                    if (mo3172r().m28533a(2)) {
                                        map23 = map9;
                                        map24 = c3131a9;
                                        map25 = map11;
                                    } else {
                                        map23 = map9;
                                        map25 = map11;
                                        map24 = c3131a9;
                                        mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, property", Integer.valueOf(length2), zzfy.f20554a, mo4397o().m28507c(zzfy.f20555b));
                                        mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29777a(zzfy));
                                    }
                                    if (zzfy.f20554a == null) {
                                        if (zzfy.f20554a.intValue() > 256) {
                                            if (c) {
                                                map26 = c3131a8;
                                                map27 = map34;
                                                cqVar = this;
                                                if (bitSet5.get(zzfy.f20554a.intValue())) {
                                                    a2 = m29374a(zzfy, zzgl);
                                                    mo3172r().m28555x().m12355a("Property filter result", a2 != null ? "null" : a2);
                                                    if (a2 != null) {
                                                        hashSet3.add(Integer.valueOf(length2));
                                                    } else {
                                                        bitSet12.set(zzfy.f20554a.intValue());
                                                        if (a2.booleanValue()) {
                                                            bitSet5.set(zzfy.f20554a.intValue());
                                                        }
                                                    }
                                                } else {
                                                    mo3172r().m28555x().m12356a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(length2), zzfy.f20554a);
                                                }
                                            } else {
                                                obj6 = (zzfy == null && zzfy.f20557d != null && zzfy.f20557d.booleanValue()) ? 1 : null;
                                                obj7 = (zzfy == null && zzfy.f20558e != null && zzfy.f20558e.booleanValue()) ? 1 : null;
                                                if (!bitSet5.get(zzfy.f20554a.intValue()) && obj6 == null && obj7 == null) {
                                                    mo3172r().m28555x().m12356a("Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(length2), zzfy.f20554a);
                                                    it3 = it8;
                                                    map22 = map35;
                                                    it7 = it9;
                                                    map9 = map23;
                                                    map11 = map25;
                                                    c3131a9 = map24;
                                                    str9 = str;
                                                } else {
                                                    c3131a9 = map34;
                                                    a4 = m29374a(zzfy, zzgl);
                                                    x = mo3172r().m28555x();
                                                    map27 = c3131a9;
                                                    str2 = "Property filter result";
                                                    if (a4 != null) {
                                                        map26 = c3131a8;
                                                        obj = "null";
                                                    } else {
                                                        map26 = c3131a8;
                                                        obj = a4;
                                                    }
                                                    x.m12355a(str2, obj);
                                                    if (a4 != null) {
                                                        hashSet3.add(Integer.valueOf(length2));
                                                    } else {
                                                        bitSet12.set(zzfy.f20554a.intValue());
                                                        bitSet5.set(zzfy.f20554a.intValue(), a4.booleanValue());
                                                        if (a4.booleanValue() && !((obj6 == null && obj7 == null) || zzgl.f20647a == null)) {
                                                            if (obj7 == null) {
                                                                m29382b(c3131a10, zzfy.f20554a.intValue(), zzgl.f20647a.longValue());
                                                            } else {
                                                                m29380a(e2, zzfy.f20554a.intValue(), zzgl.f20647a.longValue());
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            it3 = it8;
                                            map22 = map35;
                                            it7 = it9;
                                            map9 = map23;
                                            map11 = map25;
                                            c3131a9 = map24;
                                            map34 = map27;
                                            c3131a8 = map26;
                                            str9 = str;
                                        }
                                    }
                                    map26 = c3131a8;
                                    map27 = map34;
                                    cqVar = this;
                                    mo3172r().m28540i().m12356a("Invalid property filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfy.f20554a));
                                    hashSet3.add(Integer.valueOf(length2));
                                    e2 = map32;
                                    intValue = i9;
                                    map22 = map35;
                                    it7 = it9;
                                    map18 = map23;
                                    map19 = map25;
                                    map20 = map24;
                                    map15 = map27;
                                    map21 = map26;
                                }
                                cqVar = this;
                                map18 = map9;
                                map20 = c3131a9;
                                map21 = c3131a8;
                                map19 = map11;
                                e2 = map32;
                                intValue = i9;
                                map15 = map34;
                                zzglArr5 = zzglArr;
                                str9 = str;
                            }
                        }
                        c3131a10 = e2;
                        map34 = map14;
                        e2 = map33;
                        it3 = ((List) map22.get(Integer.valueOf(length2))).iterator();
                        while (it3.hasNext()) {
                            it8 = it3;
                            zzfy = (zzfy) it3.next();
                            map35 = map22;
                            it9 = it7;
                            if (mo3172r().m28533a(2)) {
                                map23 = map9;
                                map24 = c3131a9;
                                map25 = map11;
                            } else {
                                map23 = map9;
                                map25 = map11;
                                map24 = c3131a9;
                                mo3172r().m28555x().m12357a("Evaluating filter. audience, filter, property", Integer.valueOf(length2), zzfy.f20554a, mo4397o().m28507c(zzfy.f20555b));
                                mo3172r().m28555x().m12355a("Filter definition", mo4964g().m29777a(zzfy));
                            }
                            if (zzfy.f20554a == null) {
                                if (zzfy.f20554a.intValue() > 256) {
                                    if (c) {
                                        map26 = c3131a8;
                                        map27 = map34;
                                        cqVar = this;
                                        if (bitSet5.get(zzfy.f20554a.intValue())) {
                                            a2 = m29374a(zzfy, zzgl);
                                            if (a2 != null) {
                                            }
                                            mo3172r().m28555x().m12355a("Property filter result", a2 != null ? "null" : a2);
                                            if (a2 != null) {
                                                bitSet12.set(zzfy.f20554a.intValue());
                                                if (a2.booleanValue()) {
                                                    bitSet5.set(zzfy.f20554a.intValue());
                                                }
                                            } else {
                                                hashSet3.add(Integer.valueOf(length2));
                                            }
                                        } else {
                                            mo3172r().m28555x().m12356a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(length2), zzfy.f20554a);
                                        }
                                    } else {
                                        if (zzfy == null) {
                                        }
                                        if (zzfy == null) {
                                        }
                                        if (!bitSet5.get(zzfy.f20554a.intValue())) {
                                        }
                                        c3131a9 = map34;
                                        a4 = m29374a(zzfy, zzgl);
                                        x = mo3172r().m28555x();
                                        map27 = c3131a9;
                                        str2 = "Property filter result";
                                        if (a4 != null) {
                                            map26 = c3131a8;
                                            obj = a4;
                                        } else {
                                            map26 = c3131a8;
                                            obj = "null";
                                        }
                                        x.m12355a(str2, obj);
                                        if (a4 != null) {
                                            bitSet12.set(zzfy.f20554a.intValue());
                                            bitSet5.set(zzfy.f20554a.intValue(), a4.booleanValue());
                                            if (obj7 == null) {
                                                m29380a(e2, zzfy.f20554a.intValue(), zzgl.f20647a.longValue());
                                            } else {
                                                m29382b(c3131a10, zzfy.f20554a.intValue(), zzgl.f20647a.longValue());
                                            }
                                        } else {
                                            hashSet3.add(Integer.valueOf(length2));
                                        }
                                    }
                                    it3 = it8;
                                    map22 = map35;
                                    it7 = it9;
                                    map9 = map23;
                                    map11 = map25;
                                    c3131a9 = map24;
                                    map34 = map27;
                                    c3131a8 = map26;
                                    str9 = str;
                                }
                            }
                            map26 = c3131a8;
                            map27 = map34;
                            cqVar = this;
                            mo3172r().m28540i().m12356a("Invalid property filter ID. appId, id", zzap.m28525a(str), String.valueOf(zzfy.f20554a));
                            hashSet3.add(Integer.valueOf(length2));
                            e2 = map32;
                            intValue = i9;
                            map22 = map35;
                            it7 = it9;
                            map18 = map23;
                            map19 = map25;
                            map20 = map24;
                            map15 = map27;
                            map21 = map26;
                        }
                        cqVar = this;
                        map18 = map9;
                        map20 = c3131a9;
                        map21 = c3131a8;
                        map19 = map11;
                        e2 = map32;
                        intValue = i9;
                        map15 = map34;
                        zzglArr5 = zzglArr;
                        str9 = str;
                    }
                }
                map32 = e2;
                i9 = intValue;
                map27 = map15;
                map23 = map18;
                map25 = map19;
                map24 = map20;
                map26 = map21;
                cqVar = this;
                length++;
                zzglArr5 = zzglArr;
            }
        }
        map27 = map15;
        map23 = map18;
        map25 = map19;
        map24 = map20;
        map26 = map21;
        cqVar = this;
        zzgd[] zzgdArr = new zzgd[map26.size()];
        it3 = map26.keySet().iterator();
        length = 0;
        while (it3.hasNext()) {
            int intValue3 = ((Integer) it3.next()).intValue();
            if (hashSet3.contains(Integer.valueOf(intValue3))) {
                str6 = str;
            } else {
                map22 = map24;
                zzgd zzgd3 = (zzgd) map22.get(Integer.valueOf(intValue3));
                if (zzgd3 == null) {
                    zzgd3 = new zzgd();
                }
                int i10 = length + 1;
                zzgdArr[length] = zzgd3;
                zzgd3.f20579a = Integer.valueOf(intValue3);
                zzgd3.f20580b = new zzgj();
                c3131a10 = map26;
                zzgd3.f20580b.f20640b = zzfg.m29772a((BitSet) c3131a10.get(Integer.valueOf(intValue3)));
                c3131a9 = map25;
                zzgd3.f20580b.f20639a = zzfg.m29772a((BitSet) c3131a9.get(Integer.valueOf(intValue3)));
                if (c) {
                    zzgk[] zzgkArr;
                    map10 = map23;
                    zzgd3.f20580b.f20641c = m29381a((Map) map10.get(Integer.valueOf(intValue3)));
                    zzgj zzgj2 = zzgd3.f20580b;
                    c3131a8 = map27;
                    c3131a11 = (Map) c3131a8.get(Integer.valueOf(intValue3));
                    if (c3131a11 == null) {
                        it4 = it3;
                        map28 = map22;
                        zzgkArr = new zzgk[0];
                    } else {
                        zzgkArr = new zzgk[c3131a11.size()];
                        int i11 = 0;
                        for (Integer num : c3131a11.keySet()) {
                            it4 = it3;
                            zzgk zzgk = new zzgk();
                            zzgk.f20644a = num;
                            List<Long> list = (List) c3131a11.get(num);
                            if (list != null) {
                                Collections.sort(list);
                                map28 = map22;
                                long[] jArr = new long[list.size()];
                                int i12 = 0;
                                for (Long longValue2 : list) {
                                    int i13 = i12 + 1;
                                    jArr[i12] = longValue2.longValue();
                                    i12 = i13;
                                }
                                zzgk.f20645b = jArr;
                            } else {
                                map28 = map22;
                            }
                            i5 = i11 + 1;
                            zzgkArr[i11] = zzgk;
                            i11 = i5;
                            it3 = it4;
                            map22 = map28;
                        }
                        it4 = it3;
                        map28 = map22;
                    }
                    zzgj2.f20642d = zzgkArr;
                } else {
                    it4 = it3;
                    map28 = map22;
                    map10 = map23;
                    c3131a8 = map27;
                }
                an i14 = mo4966i();
                zzzg zzzg = zzgd3.f20580b;
                i14.m28438k();
                i14.mo4395d();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzzg);
                try {
                    byte[] bArr = new byte[zzzg.m12203e()];
                    try {
                        zzyy a5 = zzyy.m12153a(bArr, 0, bArr.length);
                        zzzg.mo3160a(a5);
                        a5.m12164a();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("app_id", str);
                        contentValues.put("audience_id", Integer.valueOf(intValue3));
                        contentValues.put("current_results", bArr);
                        try {
                            try {
                                if (i14.m29442y().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    i14.mo3172r().v_().m12355a("Failed to insert filter results (got -1). appId", zzap.m28525a(str));
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                i14.mo3172r().v_().m12356a("Error storing filter results. appId", zzap.m28525a(str), e);
                                length = i10;
                                map26 = c3131a10;
                                map25 = c3131a9;
                                map23 = map10;
                                map27 = c3131a8;
                                it3 = it4;
                                map24 = map28;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            i14.mo3172r().v_().m12356a("Error storing filter results. appId", zzap.m28525a(str), e);
                            length = i10;
                            map26 = c3131a10;
                            map25 = c3131a9;
                            map23 = map10;
                            map27 = c3131a8;
                            it3 = it4;
                            map24 = map28;
                        }
                    } catch (IOException e8) {
                        e = e8;
                        str6 = str;
                        i14.mo3172r().v_().m12356a("Configuration loss. Failed to serialize filter results. appId", zzap.m28525a(str), e);
                        length = i10;
                        map26 = c3131a10;
                        map25 = c3131a9;
                        map23 = map10;
                        map27 = c3131a8;
                        it3 = it4;
                        map24 = map28;
                    }
                } catch (IOException e9) {
                    e = e9;
                    str6 = str;
                    i14.mo3172r().v_().m12356a("Configuration loss. Failed to serialize filter results. appId", zzap.m28525a(str), e);
                    length = i10;
                    map26 = c3131a10;
                    map25 = c3131a9;
                    map23 = map10;
                    map27 = c3131a8;
                    it3 = it4;
                    map24 = map28;
                }
                length = i10;
                map26 = c3131a10;
                map25 = c3131a9;
                map23 = map10;
                map27 = c3131a8;
                it3 = it4;
                map24 = map28;
            }
        }
        return (zzgd[]) Arrays.copyOf(zzgdArr, length);
    }

    /* renamed from: a */
    private final Boolean m29373a(zzfv zzfv, String str, zzgg[] zzggArr, long j) {
        if (zzfv.f20539d != null) {
            j = m29372a(j, zzfv.f20539d);
            if (j == null) {
                return null;
            }
            if (j.booleanValue() == null) {
                return Boolean.valueOf(false);
            }
        }
        j = new HashSet();
        for (zzfw zzfw : zzfv.f20538c) {
            if (TextUtils.isEmpty(zzfw.f20547d)) {
                mo3172r().m28540i().m12355a("null or empty param name in filter. event", mo4397o().m28503a(str));
                return null;
            }
            j.add(zzfw.f20547d);
        }
        Map c3131a = new C3131a();
        for (zzgg zzgg : zzggArr) {
            if (j.contains(zzgg.f20593a)) {
                if (zzgg.f20595c != null) {
                    c3131a.put(zzgg.f20593a, zzgg.f20595c);
                } else if (zzgg.f20596d != null) {
                    c3131a.put(zzgg.f20593a, zzgg.f20596d);
                } else if (zzgg.f20594b != null) {
                    c3131a.put(zzgg.f20593a, zzgg.f20594b);
                } else {
                    mo3172r().m28540i().m12356a("Unknown value for param. event, param", mo4397o().m28503a(str), mo4397o().m28505b(zzgg.f20593a));
                    return null;
                }
            }
        }
        for (zzfw zzfw2 : zzfv.f20538c) {
            boolean equals = Boolean.TRUE.equals(zzfw2.f20546c);
            String str2 = zzfw2.f20547d;
            if (TextUtils.isEmpty(str2)) {
                mo3172r().m28540i().m12355a("Event has empty param name. event", mo4397o().m28503a(str));
                return null;
            }
            Object obj = c3131a.get(str2);
            Boolean a;
            if (obj instanceof Long) {
                if (zzfw2.f20545b == null) {
                    mo3172r().m28540i().m12356a("No number filter for long param. event, param", mo4397o().m28503a(str), mo4397o().m28505b(str2));
                    return null;
                }
                a = m29372a(((Long) obj).longValue(), zzfw2.f20545b);
                if (a == null) {
                    return null;
                }
                if (((1 ^ a.booleanValue()) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (zzfw2.f20545b == null) {
                    mo3172r().m28540i().m12356a("No number filter for double param. event, param", mo4397o().m28503a(str), mo4397o().m28505b(str2));
                    return null;
                }
                a = m29371a(((Double) obj).doubleValue(), zzfw2.f20545b);
                if (a == null) {
                    return null;
                }
                if (((1 ^ a.booleanValue()) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (zzfw2.f20544a != null) {
                    a = m29378a((String) obj, zzfw2.f20544a);
                } else if (zzfw2.f20545b != null) {
                    String str3 = (String) obj;
                    if (zzfg.m29770a(str3)) {
                        a = m29377a(str3, zzfw2.f20545b);
                    } else {
                        mo3172r().m28540i().m12356a("Invalid param value for number filter. event, param", mo4397o().m28503a(str), mo4397o().m28505b(str2));
                        return null;
                    }
                } else {
                    mo3172r().m28540i().m12356a("No filter for String param. event, param", mo4397o().m28503a(str), mo4397o().m28505b(str2));
                    return null;
                }
                if (a == null) {
                    return null;
                }
                if (((1 ^ a.booleanValue()) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                mo3172r().m28555x().m12356a("Missing param for filter. event, param", mo4397o().m28503a(str), mo4397o().m28505b(str2));
                return Boolean.valueOf(false);
            } else {
                mo3172r().m28540i().m12356a("Unknown param type. event, param", mo4397o().m28503a(str), mo4397o().m28505b(str2));
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    /* renamed from: a */
    private final Boolean m29374a(zzfy zzfy, zzgl zzgl) {
        zzfy = zzfy.f20556c;
        if (zzfy == null) {
            mo3172r().m28540i().m12355a("Missing property filter. property", mo4397o().m28507c(zzgl.f20648b));
            return null;
        }
        boolean equals = Boolean.TRUE.equals(zzfy.f20546c);
        if (zzgl.f20650d != null) {
            if (zzfy.f20545b != null) {
                return m29375a(m29372a(zzgl.f20650d.longValue(), zzfy.f20545b), equals);
            }
            mo3172r().m28540i().m12355a("No number filter for long property. property", mo4397o().m28507c(zzgl.f20648b));
            return null;
        } else if (zzgl.f20651e != null) {
            if (zzfy.f20545b != null) {
                return m29375a(m29371a(zzgl.f20651e.doubleValue(), zzfy.f20545b), equals);
            }
            mo3172r().m28540i().m12355a("No number filter for double property. property", mo4397o().m28507c(zzgl.f20648b));
            return null;
        } else if (zzgl.f20649c == null) {
            mo3172r().m28540i().m12355a("User property has no value, property", mo4397o().m28507c(zzgl.f20648b));
            return null;
        } else if (zzfy.f20544a != null) {
            return m29375a(m29378a(zzgl.f20649c, zzfy.f20544a), equals);
        } else {
            if (zzfy.f20545b == null) {
                mo3172r().m28540i().m12355a("No string or number filter defined. property", mo4397o().m28507c(zzgl.f20648b));
            } else if (zzfg.m29770a(zzgl.f20649c)) {
                return m29375a(m29377a(zzgl.f20649c, zzfy.f20545b), equals);
            } else {
                mo3172r().m28540i().m12356a("Invalid user property value for Numeric number filter. property, value", mo4397o().m28507c(zzgl.f20648b), zzgl.f20649c);
            }
            return null;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    private static Boolean m29375a(Boolean bool, boolean z) {
        return bool == null ? null : Boolean.valueOf(bool.booleanValue() ^ z);
    }

    @VisibleForTesting
    /* renamed from: a */
    private final Boolean m29378a(String str, zzfz zzfz) {
        Preconditions.checkNotNull(zzfz);
        if (!(str == null || zzfz.f20559a == null)) {
            if (zzfz.f20559a.intValue() != 0) {
                String toUpperCase;
                String str2;
                List list;
                List arrayList;
                if (zzfz.f20559a.intValue() == 6) {
                    if (zzfz.f20562d == null || zzfz.f20562d.length == 0) {
                        return null;
                    }
                } else if (zzfz.f20560b == null) {
                    return null;
                }
                int intValue = zzfz.f20559a.intValue();
                boolean z = zzfz.f20561c != null && zzfz.f20561c.booleanValue();
                if (!(z || intValue == 1)) {
                    if (intValue != 6) {
                        toUpperCase = zzfz.f20560b.toUpperCase(Locale.ENGLISH);
                        str2 = toUpperCase;
                        if (zzfz.f20562d != null) {
                            list = null;
                        } else {
                            zzfz = zzfz.f20562d;
                            if (z) {
                                arrayList = new ArrayList();
                                for (String toUpperCase2 : zzfz) {
                                    arrayList.add(toUpperCase2.toUpperCase(Locale.ENGLISH));
                                }
                                list = arrayList;
                            } else {
                                list = Arrays.asList(zzfz);
                            }
                        }
                        return m29376a(str, intValue, z, str2, list, intValue != 1 ? str2 : null);
                    }
                }
                toUpperCase = zzfz.f20560b;
                str2 = toUpperCase;
                if (zzfz.f20562d != null) {
                    zzfz = zzfz.f20562d;
                    if (z) {
                        arrayList = new ArrayList();
                        while (r3 < r2) {
                            arrayList.add(toUpperCase2.toUpperCase(Locale.ENGLISH));
                        }
                        list = arrayList;
                    } else {
                        list = Arrays.asList(zzfz);
                    }
                } else {
                    list = null;
                }
                if (intValue != 1) {
                }
                return m29376a(str, intValue, z, str2, list, intValue != 1 ? str2 : null);
            }
        }
        return null;
    }

    /* renamed from: a */
    private final java.lang.Boolean m29376a(java.lang.String r3, int r4, boolean r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.lang.String r8) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 6;
        if (r4 != r1) goto L_0x0010;
    L_0x0007:
        if (r7 == 0) goto L_0x000f;
    L_0x0009:
        r1 = r7.size();
        if (r1 != 0) goto L_0x0013;
    L_0x000f:
        return r0;
    L_0x0010:
        if (r6 != 0) goto L_0x0013;
    L_0x0012:
        return r0;
    L_0x0013:
        if (r5 != 0) goto L_0x001f;
    L_0x0015:
        r1 = 1;
        if (r4 != r1) goto L_0x0019;
    L_0x0018:
        goto L_0x001f;
    L_0x0019:
        r1 = java.util.Locale.ENGLISH;
        r3 = r3.toUpperCase(r1);
    L_0x001f:
        switch(r4) {
            case 1: goto L_0x0050;
            case 2: goto L_0x0047;
            case 3: goto L_0x003e;
            case 4: goto L_0x0035;
            case 5: goto L_0x002c;
            case 6: goto L_0x0023;
            default: goto L_0x0022;
        };
    L_0x0022:
        return r0;
    L_0x0023:
        r3 = r7.contains(r3);
        r3 = java.lang.Boolean.valueOf(r3);
        return r3;
    L_0x002c:
        r3 = r3.equals(r6);
        r3 = java.lang.Boolean.valueOf(r3);
        return r3;
    L_0x0035:
        r3 = r3.contains(r6);
        r3 = java.lang.Boolean.valueOf(r3);
        return r3;
    L_0x003e:
        r3 = r3.endsWith(r6);
        r3 = java.lang.Boolean.valueOf(r3);
        return r3;
    L_0x0047:
        r3 = r3.startsWith(r6);
        r3 = java.lang.Boolean.valueOf(r3);
        return r3;
    L_0x0050:
        if (r5 == 0) goto L_0x0054;
    L_0x0052:
        r4 = 0;
        goto L_0x0056;
    L_0x0054:
        r4 = 66;
    L_0x0056:
        r4 = java.util.regex.Pattern.compile(r8, r4);	 Catch:{ PatternSyntaxException -> 0x0067 }
        r3 = r4.matcher(r3);	 Catch:{ PatternSyntaxException -> 0x0067 }
        r3 = r3.matches();	 Catch:{ PatternSyntaxException -> 0x0067 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ PatternSyntaxException -> 0x0067 }
        return r3;
    L_0x0067:
        r3 = r2.mo3172r();
        r3 = r3.m28540i();
        r4 = "Invalid regular expression in REGEXP audience filter. expression";
        r3.m12355a(r4, r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.cq.a(java.lang.String, int, boolean, java.lang.String, java.util.List, java.lang.String):java.lang.Boolean");
    }

    /* renamed from: a */
    private final java.lang.Boolean m29372a(long r2, com.google.android.gms.internal.measurement.zzfx r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x000c }
        r0.<init>(r2);	 Catch:{ NumberFormatException -> 0x000c }
        r2 = 0;	 Catch:{ NumberFormatException -> 0x000c }
        r2 = m29379a(r0, r4, r2);	 Catch:{ NumberFormatException -> 0x000c }
        return r2;
    L_0x000c:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.cq.a(long, com.google.android.gms.internal.measurement.zzfx):java.lang.Boolean");
    }

    /* renamed from: a */
    private final java.lang.Boolean m29371a(double r2, com.google.android.gms.internal.measurement.zzfx r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x000e }
        r0.<init>(r2);	 Catch:{ NumberFormatException -> 0x000e }
        r2 = java.lang.Math.ulp(r2);	 Catch:{ NumberFormatException -> 0x000e }
        r2 = m29379a(r0, r4, r2);	 Catch:{ NumberFormatException -> 0x000e }
        return r2;
    L_0x000e:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.cq.a(double, com.google.android.gms.internal.measurement.zzfx):java.lang.Boolean");
    }

    /* renamed from: a */
    private final java.lang.Boolean m29377a(java.lang.String r5, com.google.android.gms.internal.measurement.zzfx r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = com.google.android.gms.measurement.internal.zzfg.m29770a(r5);
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r0 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0014 }
        r0.<init>(r5);	 Catch:{ NumberFormatException -> 0x0014 }
        r2 = 0;	 Catch:{ NumberFormatException -> 0x0014 }
        r5 = m29379a(r0, r6, r2);	 Catch:{ NumberFormatException -> 0x0014 }
        return r5;
    L_0x0014:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.cq.a(java.lang.String, com.google.android.gms.internal.measurement.zzfx):java.lang.Boolean");
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    private static java.lang.Boolean m29379a(java.math.BigDecimal r7, com.google.android.gms.internal.measurement.zzfx r8, double r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r8);
        r0 = r8.f20548a;
        r1 = 0;
        if (r0 == 0) goto L_0x00f0;
    L_0x0008:
        r0 = r8.f20548a;
        r0 = r0.intValue();
        if (r0 != 0) goto L_0x0012;
    L_0x0010:
        goto L_0x00f0;
    L_0x0012:
        r0 = r8.f20548a;
        r0 = r0.intValue();
        r2 = 4;
        if (r0 != r2) goto L_0x0024;
    L_0x001b:
        r0 = r8.f20551d;
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r0 = r8.f20552e;
        if (r0 != 0) goto L_0x0029;
    L_0x0023:
        return r1;
    L_0x0024:
        r0 = r8.f20550c;
        if (r0 != 0) goto L_0x0029;
    L_0x0028:
        return r1;
    L_0x0029:
        r0 = r8.f20548a;
        r0 = r0.intValue();
        r3 = r8.f20548a;
        r3 = r3.intValue();
        if (r3 != r2) goto L_0x005b;
    L_0x0037:
        r3 = r8.f20551d;
        r3 = com.google.android.gms.measurement.internal.zzfg.m29770a(r3);
        if (r3 == 0) goto L_0x005a;
    L_0x003f:
        r3 = r8.f20552e;
        r3 = com.google.android.gms.measurement.internal.zzfg.m29770a(r3);
        if (r3 != 0) goto L_0x0048;
    L_0x0047:
        goto L_0x005a;
    L_0x0048:
        r3 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0059 }
        r4 = r8.f20551d;	 Catch:{ NumberFormatException -> 0x0059 }
        r3.<init>(r4);	 Catch:{ NumberFormatException -> 0x0059 }
        r4 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x0059 }
        r8 = r8.f20552e;	 Catch:{ NumberFormatException -> 0x0059 }
        r4.<init>(r8);	 Catch:{ NumberFormatException -> 0x0059 }
        r8 = r3;
        r3 = r1;
        goto L_0x006d;
    L_0x0059:
        return r1;
    L_0x005a:
        return r1;
    L_0x005b:
        r3 = r8.f20550c;
        r3 = com.google.android.gms.measurement.internal.zzfg.m29770a(r3);
        if (r3 != 0) goto L_0x0064;
    L_0x0063:
        return r1;
    L_0x0064:
        r3 = new java.math.BigDecimal;	 Catch:{ NumberFormatException -> 0x00ef }
        r8 = r8.f20550c;	 Catch:{ NumberFormatException -> 0x00ef }
        r3.<init>(r8);	 Catch:{ NumberFormatException -> 0x00ef }
        r8 = r1;
        r4 = r8;
    L_0x006d:
        if (r0 != r2) goto L_0x0072;
    L_0x006f:
        if (r8 != 0) goto L_0x0074;
    L_0x0071:
        return r1;
    L_0x0072:
        if (r3 == 0) goto L_0x00ee;
    L_0x0074:
        r2 = -1;
        r5 = 0;
        r6 = 1;
        switch(r0) {
            case 1: goto L_0x00e2;
            case 2: goto L_0x00d6;
            case 3: goto L_0x008d;
            case 4: goto L_0x007b;
            default: goto L_0x007a;
        };
    L_0x007a:
        goto L_0x00ee;
    L_0x007b:
        r8 = r7.compareTo(r8);
        if (r8 == r2) goto L_0x0088;
    L_0x0081:
        r7 = r7.compareTo(r4);
        if (r7 == r6) goto L_0x0088;
    L_0x0087:
        r5 = 1;
    L_0x0088:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x008d:
        r0 = 0;
        r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r8 == 0) goto L_0x00ca;
    L_0x0093:
        r8 = new java.math.BigDecimal;
        r8.<init>(r9);
        r0 = new java.math.BigDecimal;
        r1 = 2;
        r0.<init>(r1);
        r8 = r8.multiply(r0);
        r8 = r3.subtract(r8);
        r8 = r7.compareTo(r8);
        if (r8 != r6) goto L_0x00c5;
    L_0x00ac:
        r8 = new java.math.BigDecimal;
        r8.<init>(r9);
        r9 = new java.math.BigDecimal;
        r9.<init>(r1);
        r8 = r8.multiply(r9);
        r8 = r3.add(r8);
        r7 = r7.compareTo(r8);
        if (r7 != r2) goto L_0x00c5;
    L_0x00c4:
        r5 = 1;
    L_0x00c5:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00ca:
        r7 = r7.compareTo(r3);
        if (r7 != 0) goto L_0x00d1;
    L_0x00d0:
        r5 = 1;
    L_0x00d1:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00d6:
        r7 = r7.compareTo(r3);
        if (r7 != r6) goto L_0x00dd;
    L_0x00dc:
        r5 = 1;
    L_0x00dd:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00e2:
        r7 = r7.compareTo(r3);
        if (r7 != r2) goto L_0x00e9;
    L_0x00e8:
        r5 = 1;
    L_0x00e9:
        r7 = java.lang.Boolean.valueOf(r5);
        return r7;
    L_0x00ee:
        return r1;
    L_0x00ef:
        return r1;
    L_0x00f0:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.cq.a(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzfx, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static zzge[] m29381a(Map<Integer, Long> map) {
        if (map == null) {
            return null;
        }
        int i = 0;
        zzge[] zzgeArr = new zzge[map.size()];
        for (Integer num : map.keySet()) {
            zzge zzge = new zzge();
            zzge.f20584a = num;
            zzge.f20585b = (Long) map.get(num);
            int i2 = i + 1;
            zzgeArr[i] = zzge;
            i = i2;
        }
        return zzgeArr;
    }

    /* renamed from: a */
    private static void m29380a(Map<Integer, Long> map, int i, long j) {
        Long l = (Long) map.get(Integer.valueOf(i));
        j /= 1000;
        if (l == null || j > l.longValue()) {
            map.put(Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: b */
    private static void m29382b(Map<Integer, List<Long>> map, int i, long j) {
        List list = (List) map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
            map.put(Integer.valueOf(i), list);
        }
        list.add(Long.valueOf(j / 1000));
    }
}
