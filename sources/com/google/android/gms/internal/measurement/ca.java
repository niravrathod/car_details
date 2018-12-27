package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzvm.zze;

final class ca implements cv {
    /* renamed from: b */
    private static final ci f17447b = new cb();
    /* renamed from: a */
    private final ci f17448a;

    public ca() {
        this(new cc(bq.m22316a(), m22330a()));
    }

    private ca(ci ciVar) {
        this.f17448a = (ci) zzvo.m12071a((Object) ciVar, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> cu<T> mo3054a(Class<T> cls) {
        cw.m11641a((Class) cls);
        ch b = this.f17448a.mo3049b(cls);
        if (b.mo3074b()) {
            if (zzvm.class.isAssignableFrom(cls) != null) {
                return cl.m22385a(cw.m11653c(), bk.m11514a(), b.mo3075c());
            }
            return cl.m22385a(cw.m11631a(), bk.m11515b(), b.mo3075c());
        } else if (zzvm.class.isAssignableFrom(cls)) {
            if (m22331a(b)) {
                return ck.m22346a(cls, b, co.m11568b(), bv.m11542b(), cw.m11653c(), bk.m11514a(), cg.m11555b());
            }
            return ck.m22346a(cls, b, co.m11568b(), bv.m11542b(), cw.m11653c(), null, cg.m11555b());
        } else if (m22331a(b)) {
            return ck.m22346a(cls, b, co.m11567a(), bv.m11541a(), cw.m11631a(), bk.m11515b(), cg.m11554a());
        } else {
            return ck.m22346a(cls, b, co.m11567a(), bv.m11541a(), cw.m11647b(), null, cg.m11554a());
        }
    }

    /* renamed from: a */
    private static boolean m22331a(ch chVar) {
        return chVar.mo3073a() == zze.f10274h ? true : null;
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.measurement.ci m22330a() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "com.google.protobuf.DescriptorMessageInfoFactory";	 Catch:{ Exception -> 0x0019 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0019 }
        r1 = "getInstance";	 Catch:{ Exception -> 0x0019 }
        r2 = 0;	 Catch:{ Exception -> 0x0019 }
        r3 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0019 }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ Exception -> 0x0019 }
        r1 = 0;	 Catch:{ Exception -> 0x0019 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0019 }
        r0 = r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0019 }
        r0 = (com.google.android.gms.internal.measurement.ci) r0;	 Catch:{ Exception -> 0x0019 }
        return r0;
    L_0x0019:
        r0 = f17447b;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ca.a():com.google.android.gms.internal.measurement.ci");
    }
}
