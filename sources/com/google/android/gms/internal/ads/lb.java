package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class lb<FieldDescriptorType extends zzbcw<FieldDescriptorType>> {
    /* renamed from: d */
    private static final lb f8216d = new lb(true);
    /* renamed from: a */
    private final mo<FieldDescriptorType, Object> f8217a = mo.m9162a(16);
    /* renamed from: b */
    private boolean f8218b;
    /* renamed from: c */
    private boolean f8219c = false;

    private lb() {
    }

    private lb(boolean z) {
        m9009c();
    }

    /* renamed from: a */
    public static <T extends zzbcw<T>> lb<T> m8996a() {
        return f8216d;
    }

    /* renamed from: b */
    final boolean m9008b() {
        return this.f8217a.isEmpty();
    }

    /* renamed from: c */
    public final void m9009c() {
        if (!this.f8218b) {
            this.f8217a.mo2122a();
            this.f8218b = true;
        }
    }

    /* renamed from: d */
    public final boolean m9010d() {
        return this.f8218b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return null;
        }
        return this.f8217a.equals(((lb) obj).f8217a);
    }

    public final int hashCode() {
        return this.f8217a.hashCode();
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> m9011e() {
        if (this.f8219c) {
            return new lk(this.f8217a.entrySet().iterator());
        }
        return this.f8217a.entrySet().iterator();
    }

    /* renamed from: f */
    final Iterator<Entry<FieldDescriptorType, Object>> m9012f() {
        if (this.f8219c) {
            return new lk(this.f8217a.m9177e().iterator());
        }
        return this.f8217a.m9177e().iterator();
    }

    /* renamed from: a */
    private final Object m8997a(FieldDescriptorType fieldDescriptorType) {
        fieldDescriptorType = this.f8217a.get(fieldDescriptorType);
        return fieldDescriptorType instanceof zzbdo ? zzbdo.m21599a() : fieldDescriptorType;
    }

    /* renamed from: a */
    private final void m9000a(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.m10321d()) {
            m9001a(fieldDescriptorType.m10319b(), obj);
        } else if (obj instanceof List) {
            List arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m9001a(fieldDescriptorType.m10319b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzbdo) {
            this.f8219c = true;
        }
        this.f8217a.m9171a((Comparable) fieldDescriptorType, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m9001a(com.google.android.gms.internal.ads.zzbgj r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.ads.zzbdf.m10328a(r3);
        r0 = com.google.android.gms.internal.ads.lc.f8220a;
        r2 = r2.m10383a();
        r2 = r2.ordinal();
        r2 = r0[r2];
        r0 = 1;
        r1 = 0;
        switch(r2) {
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0037;
            case 5: goto L_0x0034;
            case 6: goto L_0x0031;
            case 7: goto L_0x0028;
            case 8: goto L_0x001e;
            case 9: goto L_0x0015;
            default: goto L_0x0014;
        };
    L_0x0014:
        goto L_0x0043;
    L_0x0015:
        r2 = r3 instanceof com.google.android.gms.internal.ads.zzbel;
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = r3 instanceof com.google.android.gms.internal.ads.zzbdo;
        if (r2 == 0) goto L_0x0043;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r2 = r3 instanceof com.google.android.gms.internal.ads.zzbdg;
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r1 = 1;
        goto L_0x0043;
    L_0x0028:
        r2 = r3 instanceof com.google.android.gms.internal.ads.zzbbu;
        if (r2 != 0) goto L_0x0026;
    L_0x002c:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0043;
    L_0x0030:
        goto L_0x0026;
    L_0x0031:
        r0 = r3 instanceof java.lang.String;
        goto L_0x0042;
    L_0x0034:
        r0 = r3 instanceof java.lang.Boolean;
        goto L_0x0042;
    L_0x0037:
        r0 = r3 instanceof java.lang.Double;
        goto L_0x0042;
    L_0x003a:
        r0 = r3 instanceof java.lang.Float;
        goto L_0x0042;
    L_0x003d:
        r0 = r3 instanceof java.lang.Long;
        goto L_0x0042;
    L_0x0040:
        r0 = r3 instanceof java.lang.Integer;
    L_0x0042:
        r1 = r0;
    L_0x0043:
        if (r1 == 0) goto L_0x0046;
    L_0x0045:
        return;
    L_0x0046:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lb.a(com.google.android.gms.internal.ads.zzbgj, java.lang.Object):void");
    }

    /* renamed from: g */
    public final boolean m9013g() {
        for (int i = 0; i < this.f8217a.m9175c(); i++) {
            if (!m9002a(this.f8217a.m9173b(i))) {
                return false;
            }
        }
        for (Entry a : this.f8217a.m9176d()) {
            if (!m9002a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m9002a(Entry<FieldDescriptorType, Object> entry) {
        zzbcw zzbcw = (zzbcw) entry.getKey();
        if (zzbcw.m10320c() == zzbgo.MESSAGE) {
            if (zzbcw.m10321d()) {
                for (zzbel k : (List) entry.getValue()) {
                    if (!k.mo4805k()) {
                        return false;
                    }
                }
            }
            entry = entry.getValue();
            if (entry instanceof zzbel) {
                if (((zzbel) entry).mo4805k() == null) {
                    return false;
                }
            } else if ((entry instanceof zzbdo) != null) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m9007a(lb<FieldDescriptorType> lbVar) {
        for (int i = 0; i < lbVar.f8217a.m9175c(); i++) {
            m9005b(lbVar.f8217a.m9173b(i));
        }
        for (FieldDescriptorType b : lbVar.f8217a.m9176d()) {
            m9005b(b);
        }
    }

    /* renamed from: a */
    private static Object m8998a(Object obj) {
        if (obj instanceof zzbes) {
            return ((zzbes) obj).m26519a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        Object obj2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, obj2, 0, bArr.length);
        return obj2;
    }

    /* renamed from: b */
    private final void m9005b(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (zzbcw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzbdo) {
            value = zzbdo.m21599a();
        }
        Object a;
        if (comparable.m10321d()) {
            a = m8997a((zzbcw) comparable);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m8998a(a2));
            }
            this.f8217a.m9171a(comparable, a);
        } else if (comparable.m10320c() == zzbgo.MESSAGE) {
            a = m8997a((zzbcw) comparable);
            if (a == null) {
                this.f8217a.m9171a(comparable, m8998a(value));
                return;
            }
            if (a instanceof zzbes) {
                value = comparable.m10318a((zzbes) a, (zzbes) value);
            } else {
                value = comparable.m10317a(((zzbel) a).mo4811o(), (zzbel) value).mo4804f();
            }
            this.f8217a.m9171a(comparable, value);
        } else {
            this.f8217a.m9171a(comparable, m8998a(value));
        }
    }

    /* renamed from: a */
    static void m8999a(zzbck zzbck, zzbgj zzbgj, int i, Object obj) {
        if (zzbgj == zzbgj.GROUP) {
            zzbel zzbel = (zzbel) obj;
            zzbdf.m10331a(zzbel);
            zzbck.mo4228a(i, 3);
            zzbel.mo4808a(zzbck);
            zzbck.mo4228a(i, 4);
            return;
        }
        zzbck.mo4228a(i, zzbgj.m10384b());
        switch (lc.f8221b[zzbgj.ordinal()]) {
            case 1:
                zzbck.m21563a(((Double) obj).doubleValue());
                return;
            case 2:
                zzbck.m21564a(((Float) obj).floatValue());
                return;
            case 3:
                zzbck.mo4235a(((Long) obj).longValue());
                return;
            case 4:
                zzbck.mo4235a(((Long) obj).longValue());
                return;
            case 5:
                zzbck.mo4227a(((Integer) obj).intValue());
                return;
            case 6:
                zzbck.mo4249c(((Long) obj).longValue());
                return;
            case 7:
                zzbck.mo4251d(((Integer) obj).intValue());
                return;
            case 8:
                zzbck.m21581a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzbel) obj).mo4808a(zzbck);
                return;
            case 10:
                zzbck.mo4237a((zzbel) obj);
                return;
            case 11:
                if ((obj instanceof zzbbu) != null) {
                    zzbck.mo4236a((zzbbu) obj);
                    return;
                } else {
                    zzbck.mo4239a((String) obj);
                    return;
                }
            case 12:
                if ((obj instanceof zzbbu) != null) {
                    zzbck.mo4236a((zzbbu) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzbck.mo4250c(bArr, (int) null, bArr.length);
                return;
            case 13:
                zzbck.mo4242b(((Integer) obj).intValue());
                return;
            case 14:
                zzbck.mo4251d(((Integer) obj).intValue());
                return;
            case 15:
                zzbck.mo4249c(((Long) obj).longValue());
                return;
            case 16:
                zzbck.m21591c(((Integer) obj).intValue());
                return;
            case 17:
                zzbck.m21588b(((Long) obj).longValue());
                return;
            case 18:
                if ((obj instanceof zzbdg) == null) {
                    zzbck.mo4227a(((Integer) obj).intValue());
                    break;
                } else {
                    zzbck.mo4227a(((zzbdg) obj).mo2419a());
                    return;
                }
            default:
                break;
        }
    }

    /* renamed from: h */
    public final int m9014h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f8217a.m9175c(); i2++) {
            Entry b = this.f8217a.m9173b(i2);
            i += m9003b((zzbcw) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f8217a.m9176d()) {
            i += m9003b((zzbcw) b2.getKey(), b2.getValue());
        }
        return i;
    }

    /* renamed from: i */
    public final int m9015i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f8217a.m9175c(); i2++) {
            i += m9006c(this.f8217a.m9173b(i2));
        }
        for (Entry c : this.f8217a.m9176d()) {
            i += m9006c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m9006c(Entry<FieldDescriptorType, Object> entry) {
        zzbcw zzbcw = (zzbcw) entry.getKey();
        Object value = entry.getValue();
        if (zzbcw.m10320c() != zzbgo.MESSAGE || zzbcw.m10321d() || zzbcw.m10322e()) {
            return m9003b(zzbcw, value);
        }
        if (value instanceof zzbdo) {
            return zzbck.m21518b(((zzbcw) entry.getKey()).m10316a(), (zzbdo) value);
        }
        return zzbck.m21534d(((zzbcw) entry.getKey()).m10316a(), (zzbel) value);
    }

    /* renamed from: a */
    static int m8995a(zzbgj zzbgj, int i, Object obj) {
        i = zzbck.m21537e(i);
        if (zzbgj == zzbgj.GROUP) {
            zzbdf.m10331a((zzbel) obj);
            i <<= 1;
        }
        return i + m9004b(zzbgj, obj);
    }

    /* renamed from: b */
    private static int m9004b(zzbgj zzbgj, Object obj) {
        switch (lc.f8221b[zzbgj.ordinal()]) {
            case 1:
                return zzbck.m21514b(((Double) obj).doubleValue());
            case 2:
                return zzbck.m21515b(((Float) obj).floatValue());
            case 3:
                return zzbck.m21535d(((Long) obj).longValue());
            case 4:
                return zzbck.m21539e(((Long) obj).longValue());
            case 5:
                return zzbck.m21540f(((Integer) obj).intValue());
            case 6:
                return zzbck.m21547g(((Long) obj).longValue());
            case 7:
                return zzbck.m21552i(((Integer) obj).intValue());
            case 8:
                return zzbck.m21526b(((Boolean) obj).booleanValue());
            case 9:
                return zzbck.m21531c((zzbel) obj);
            case 10:
                if ((obj instanceof zzbdo) != null) {
                    return zzbck.m21511a((zzbdo) obj);
                }
                return zzbck.m21523b((zzbel) obj);
            case 11:
                if ((obj instanceof zzbbu) != null) {
                    return zzbck.m21522b((zzbbu) obj);
                }
                return zzbck.m21525b((String) obj);
            case 12:
                if ((obj instanceof zzbbu) != null) {
                    return zzbck.m21522b((zzbbu) obj);
                }
                return zzbck.m21527b((byte[]) obj);
            case 13:
                return zzbck.m21544g(((Integer) obj).intValue());
            case 14:
                return zzbck.m21555j(((Integer) obj).intValue());
            case 15:
                return zzbck.m21551h(((Long) obj).longValue());
            case 16:
                return zzbck.m21548h(((Integer) obj).intValue());
            case 17:
                return zzbck.m21543f(((Long) obj).longValue());
            case 18:
                if ((obj instanceof zzbdg) != null) {
                    return zzbck.m21557k(((zzbdg) obj).mo2419a());
                }
                return zzbck.m21557k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m9003b(zzbcw<?> zzbcw, Object obj) {
        zzbgj b = zzbcw.m10319b();
        int a = zzbcw.m10316a();
        if (!zzbcw.m10321d()) {
            return m8995a(b, a, obj);
        }
        int i = 0;
        if (zzbcw.m10322e() != null) {
            for (Object obj2 : (List) obj2) {
                i += m9004b(b, obj2);
            }
            return (zzbck.m21537e(a) + i) + zzbck.m21559l(i);
        }
        for (Object obj22 : (List) obj22) {
            i += m8995a(b, a, obj22);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        lb lbVar = new lb();
        for (int i = 0; i < this.f8217a.m9175c(); i++) {
            Entry b = this.f8217a.m9173b(i);
            lbVar.m9000a((zzbcw) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f8217a.m9176d()) {
            lbVar.m9000a((zzbcw) b2.getKey(), b2.getValue());
        }
        lbVar.f8219c = this.f8219c;
        return lbVar;
    }
}
