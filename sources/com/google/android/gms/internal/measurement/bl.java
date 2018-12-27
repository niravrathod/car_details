package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class bl<FieldDescriptorType extends zzvf<FieldDescriptorType>> {
    /* renamed from: d */
    private static final bl f10047d = new bl(true);
    /* renamed from: a */
    private final cx<FieldDescriptorType, Object> f10048a = cx.m11683a(16);
    /* renamed from: b */
    private boolean f10049b;
    /* renamed from: c */
    private boolean f10050c = false;

    private bl() {
    }

    private bl(boolean z) {
        m11531c();
    }

    /* renamed from: a */
    public static <T extends zzvf<T>> bl<T> m11518a() {
        return f10047d;
    }

    /* renamed from: b */
    final boolean m11530b() {
        return this.f10048a.isEmpty();
    }

    /* renamed from: c */
    public final void m11531c() {
        if (!this.f10049b) {
            this.f10048a.mo3076a();
            this.f10049b = true;
        }
    }

    /* renamed from: d */
    public final boolean m11532d() {
        return this.f10049b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return null;
        }
        return this.f10048a.equals(((bl) obj).f10048a);
    }

    public final int hashCode() {
        return this.f10048a.hashCode();
    }

    /* renamed from: e */
    public final Iterator<Entry<FieldDescriptorType, Object>> m11533e() {
        if (this.f10050c) {
            return new bu(this.f10048a.entrySet().iterator());
        }
        return this.f10048a.entrySet().iterator();
    }

    /* renamed from: f */
    final Iterator<Entry<FieldDescriptorType, Object>> m11534f() {
        if (this.f10050c) {
            return new bu(this.f10048a.m11698e().iterator());
        }
        return this.f10048a.m11698e().iterator();
    }

    /* renamed from: a */
    private final Object m11519a(FieldDescriptorType fieldDescriptorType) {
        fieldDescriptorType = this.f10048a.get(fieldDescriptorType);
        return fieldDescriptorType instanceof zzvw ? zzvw.m22631a() : fieldDescriptorType;
    }

    /* renamed from: a */
    private final void m11522a(FieldDescriptorType fieldDescriptorType, Object obj) {
        if (!fieldDescriptorType.m12062d()) {
            m11523a(fieldDescriptorType.m12060b(), obj);
        } else if (obj instanceof List) {
            List arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = (ArrayList) arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                m11523a(fieldDescriptorType.m12060b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzvw) {
            this.f10050c = true;
        }
        this.f10048a.m11692a((Comparable) fieldDescriptorType, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private static void m11523a(com.google.android.gms.internal.measurement.zzyq r2, java.lang.Object r3) {
        /*
        com.google.android.gms.internal.measurement.zzvo.m12069a(r3);
        r0 = com.google.android.gms.internal.measurement.bm.f10051a;
        r2 = r2.m12122a();
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
        r2 = r3 instanceof com.google.android.gms.internal.measurement.zzwt;
        if (r2 != 0) goto L_0x0026;
    L_0x0019:
        r2 = r3 instanceof com.google.android.gms.internal.measurement.zzvw;
        if (r2 == 0) goto L_0x0043;
    L_0x001d:
        goto L_0x0026;
    L_0x001e:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x0026;
    L_0x0022:
        r2 = r3 instanceof com.google.android.gms.internal.measurement.zzvp;
        if (r2 == 0) goto L_0x0043;
    L_0x0026:
        r1 = 1;
        goto L_0x0043;
    L_0x0028:
        r2 = r3 instanceof com.google.android.gms.internal.measurement.zzud;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.bl.a(com.google.android.gms.internal.measurement.zzyq, java.lang.Object):void");
    }

    /* renamed from: g */
    public final boolean m11535g() {
        for (int i = 0; i < this.f10048a.m11696c(); i++) {
            if (!m11524a(this.f10048a.m11694b(i))) {
                return false;
            }
        }
        for (Entry a : this.f10048a.m11697d()) {
            if (!m11524a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m11524a(Entry<FieldDescriptorType, Object> entry) {
        zzvf zzvf = (zzvf) entry.getKey();
        if (zzvf.m12061c() == zzyv.MESSAGE) {
            if (zzvf.m12062d()) {
                for (zzwt e : (List) entry.getValue()) {
                    if (!e.mo4830e()) {
                        return false;
                    }
                }
            }
            entry = entry.getValue();
            if (entry instanceof zzwt) {
                if (((zzwt) entry).mo4830e() == null) {
                    return false;
                }
            } else if ((entry instanceof zzvw) != null) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m11529a(bl<FieldDescriptorType> blVar) {
        for (int i = 0; i < blVar.f10048a.m11696c(); i++) {
            m11527b(blVar.f10048a.m11694b(i));
        }
        for (FieldDescriptorType b : blVar.f10048a.m11697d()) {
            m11527b(b);
        }
    }

    /* renamed from: a */
    private static Object m11520a(Object obj) {
        if (obj instanceof zzwz) {
            return ((zzwz) obj).m27279a();
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
    private final void m11527b(Entry<FieldDescriptorType, Object> entry) {
        Comparable comparable = (zzvf) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzvw) {
            value = zzvw.m22631a();
        }
        Object a;
        if (comparable.m12062d()) {
            a = m11519a((zzvf) comparable);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m11520a(a2));
            }
            this.f10048a.m11692a(comparable, a);
        } else if (comparable.m12061c() == zzyv.MESSAGE) {
            a = m11519a((zzvf) comparable);
            if (a == null) {
                this.f10048a.m11692a(comparable, m11520a(value));
                return;
            }
            if (a instanceof zzwz) {
                value = comparable.m12059a((zzwz) a, (zzwz) value);
            } else {
                value = comparable.m12058a(((zzwt) a).mo4837h(), (zzwt) value).mo4831f();
            }
            this.f10048a.m11692a(comparable, value);
        } else {
            this.f10048a.m11692a(comparable, m11520a(value));
        }
    }

    /* renamed from: a */
    static void m11521a(zzut zzut, zzyq zzyq, int i, Object obj) {
        if (zzyq == zzyq.GROUP) {
            zzwt zzwt = (zzwt) obj;
            zzvo.m12072a(zzwt);
            zzut.mo4362a(i, 3);
            zzwt.mo4834a(zzut);
            zzut.mo4362a(i, 4);
            return;
        }
        zzut.mo4362a(i, zzyq.m12123b());
        switch (bm.f10052b[zzyq.ordinal()]) {
            case 1:
                zzut.m22595a(((Double) obj).doubleValue());
                return;
            case 2:
                zzut.m22596a(((Float) obj).floatValue());
                return;
            case 3:
                zzut.mo4369a(((Long) obj).longValue());
                return;
            case 4:
                zzut.mo4369a(((Long) obj).longValue());
                return;
            case 5:
                zzut.mo4361a(((Integer) obj).intValue());
                return;
            case 6:
                zzut.mo4383c(((Long) obj).longValue());
                return;
            case 7:
                zzut.mo4385d(((Integer) obj).intValue());
                return;
            case 8:
                zzut.m22613a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzwt) obj).mo4834a(zzut);
                return;
            case 10:
                zzut.mo4371a((zzwt) obj);
                return;
            case 11:
                if ((obj instanceof zzud) != null) {
                    zzut.mo4370a((zzud) obj);
                    return;
                } else {
                    zzut.mo4373a((String) obj);
                    return;
                }
            case 12:
                if ((obj instanceof zzud) != null) {
                    zzut.mo4370a((zzud) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzut.mo4384c(bArr, (int) null, bArr.length);
                return;
            case 13:
                zzut.mo4376b(((Integer) obj).intValue());
                return;
            case 14:
                zzut.mo4385d(((Integer) obj).intValue());
                return;
            case 15:
                zzut.mo4383c(((Long) obj).longValue());
                return;
            case 16:
                zzut.m22622c(((Integer) obj).intValue());
                return;
            case 17:
                zzut.m22620b(((Long) obj).longValue());
                return;
            case 18:
                if ((obj instanceof zzvp) == null) {
                    zzut.mo4361a(((Integer) obj).intValue());
                    break;
                } else {
                    zzut.mo4361a(((zzvp) obj).mo3152a());
                    return;
                }
            default:
                break;
        }
    }

    /* renamed from: h */
    public final int m11536h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f10048a.m11696c(); i2++) {
            Entry b = this.f10048a.m11694b(i2);
            i += m11525b((zzvf) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f10048a.m11697d()) {
            i += m11525b((zzvf) b2.getKey(), b2.getValue());
        }
        return i;
    }

    /* renamed from: i */
    public final int m11537i() {
        int i = 0;
        for (int i2 = 0; i2 < this.f10048a.m11696c(); i2++) {
            i += m11528c(this.f10048a.m11694b(i2));
        }
        for (Entry c : this.f10048a.m11697d()) {
            i += m11528c(c);
        }
        return i;
    }

    /* renamed from: c */
    private static int m11528c(Entry<FieldDescriptorType, Object> entry) {
        zzvf zzvf = (zzvf) entry.getKey();
        Object value = entry.getValue();
        if (zzvf.m12061c() != zzyv.MESSAGE || zzvf.m12062d() || zzvf.m12063e()) {
            return m11525b(zzvf, value);
        }
        if (value instanceof zzvw) {
            return zzut.m22550b(((zzvf) entry.getKey()).m12057a(), (zzvw) value);
        }
        return zzut.m22567d(((zzvf) entry.getKey()).m12057a(), (zzwt) value);
    }

    /* renamed from: a */
    static int m11517a(zzyq zzyq, int i, Object obj) {
        i = zzut.m22569e(i);
        if (zzyq == zzyq.GROUP) {
            zzvo.m12072a((zzwt) obj);
            i <<= 1;
        }
        return i + m11526b(zzyq, obj);
    }

    /* renamed from: b */
    private static int m11526b(zzyq zzyq, Object obj) {
        switch (bm.f10052b[zzyq.ordinal()]) {
            case 1:
                return zzut.m22546b(((Double) obj).doubleValue());
            case 2:
                return zzut.m22547b(((Float) obj).floatValue());
            case 3:
                return zzut.m22568d(((Long) obj).longValue());
            case 4:
                return zzut.m22571e(((Long) obj).longValue());
            case 5:
                return zzut.m22572f(((Integer) obj).intValue());
            case 6:
                return zzut.m22579g(((Long) obj).longValue());
            case 7:
                return zzut.m22584i(((Integer) obj).intValue());
            case 8:
                return zzut.m22558b(((Boolean) obj).booleanValue());
            case 9:
                return zzut.m22563c((zzwt) obj);
            case 10:
                if ((obj instanceof zzvw) != null) {
                    return zzut.m22543a((zzvw) obj);
                }
                return zzut.m22555b((zzwt) obj);
            case 11:
                if ((obj instanceof zzud) != null) {
                    return zzut.m22554b((zzud) obj);
                }
                return zzut.m22557b((String) obj);
            case 12:
                if ((obj instanceof zzud) != null) {
                    return zzut.m22554b((zzud) obj);
                }
                return zzut.m22559b((byte[]) obj);
            case 13:
                return zzut.m22576g(((Integer) obj).intValue());
            case 14:
                return zzut.m22587j(((Integer) obj).intValue());
            case 15:
                return zzut.m22583h(((Long) obj).longValue());
            case 16:
                return zzut.m22580h(((Integer) obj).intValue());
            case 17:
                return zzut.m22575f(((Long) obj).longValue());
            case 18:
                if ((obj instanceof zzvp) != null) {
                    return zzut.m22589k(((zzvp) obj).mo3152a());
                }
                return zzut.m22589k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: b */
    private static int m11525b(zzvf<?> zzvf, Object obj) {
        zzyq b = zzvf.m12060b();
        int a = zzvf.m12057a();
        if (!zzvf.m12062d()) {
            return m11517a(b, a, obj);
        }
        int i = 0;
        if (zzvf.m12063e() != null) {
            for (Object obj2 : (List) obj2) {
                i += m11526b(b, obj2);
            }
            return (zzut.m22569e(a) + i) + zzut.m22591l(i);
        }
        for (Object obj22 : (List) obj22) {
            i += m11517a(b, a, obj22);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        bl blVar = new bl();
        for (int i = 0; i < this.f10048a.m11696c(); i++) {
            Entry b = this.f10048a.m11694b(i);
            blVar.m11522a((zzvf) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.f10048a.m11697d()) {
            blVar.m11522a((zzvf) b2.getKey(), b2.getValue());
        }
        blVar.f10050c = this.f10050c;
        return blVar;
    }
}
