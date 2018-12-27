package com.google.android.gms.internal.measurement;

public final class zzfz extends zzza<zzfz> {
    /* renamed from: a */
    public Integer f20559a;
    /* renamed from: b */
    public String f20560b;
    /* renamed from: c */
    public Boolean f20561c;
    /* renamed from: d */
    public String[] f20562d;

    public zzfz() {
        this.f20559a = null;
        this.f20560b = null;
        this.f20561c = null;
        this.f20562d = zzzj.f10367c;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfz)) {
            return false;
        }
        zzfz zzfz = (zzfz) obj;
        if (this.f20559a == null) {
            if (zzfz.f20559a != null) {
                return false;
            }
        } else if (!this.f20559a.equals(zzfz.f20559a)) {
            return false;
        }
        if (this.f20560b == null) {
            if (zzfz.f20560b != null) {
                return false;
            }
        } else if (!this.f20560b.equals(zzfz.f20560b)) {
            return false;
        }
        if (this.f20561c == null) {
            if (zzfz.f20561c != null) {
                return false;
            }
        } else if (!this.f20561c.equals(zzfz.f20561c)) {
            return false;
        }
        if (!zzze.m12193a(this.f20562d, zzfz.f20562d)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzfz.J);
            }
        }
        if (zzfz.J != null) {
            if (zzfz.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20559a == null ? 0 : this.f20559a.intValue())) * 31) + (this.f20560b == null ? 0 : this.f20560b.hashCode())) * 31) + (this.f20561c == null ? 0 : this.f20561c.hashCode())) * 31) + zzze.m12190a(this.f20562d)) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20559a != null) {
            zzyy.m12167a(1, this.f20559a.intValue());
        }
        if (this.f20560b != null) {
            zzyy.m12171a(2, this.f20560b);
        }
        if (this.f20561c != null) {
            zzyy.m12172a(3, this.f20561c.booleanValue());
        }
        if (this.f20562d != null && this.f20562d.length > 0) {
            for (String str : this.f20562d) {
                if (str != null) {
                    zzyy.m12171a(4, str);
                }
            }
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20559a != null) {
            b += zzyy.m12156b(1, this.f20559a.intValue());
        }
        if (this.f20560b != null) {
            b += zzyy.m12158b(2, this.f20560b);
        }
        if (this.f20561c != null) {
            this.f20561c.booleanValue();
            b += zzyy.m12155b(3) + 1;
        }
        if (this.f20562d == null || this.f20562d.length <= 0) {
            return b;
        }
        int i = 0;
        int i2 = 0;
        for (String str : this.f20562d) {
            if (str != null) {
                i2++;
                i += zzyy.m12151a(str);
            }
        }
        return (b + i) + (i2 * 1);
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.measurement.zzfz m27120b(com.google.android.gms.internal.measurement.zzyx r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m12129a();
        if (r0 == 0) goto L_0x0096;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0061;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x005a;
    L_0x000e:
        r1 = 24;
        if (r0 == r1) goto L_0x004f;
    L_0x0012:
        r1 = 34;
        if (r0 == r1) goto L_0x001d;
    L_0x0016:
        r0 = super.m22647a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x001c:
        return r6;
    L_0x001d:
        r0 = com.google.android.gms.internal.measurement.zzzj.m12207a(r7, r1);
        r1 = r6.f20562d;
        r2 = 0;
        if (r1 != 0) goto L_0x0028;
    L_0x0026:
        r1 = 0;
        goto L_0x002b;
    L_0x0028:
        r1 = r6.f20562d;
        r1 = r1.length;
    L_0x002b:
        r0 = r0 + r1;
        r0 = new java.lang.String[r0];
        if (r1 == 0) goto L_0x0035;
    L_0x0030:
        r3 = r6.f20562d;
        java.lang.System.arraycopy(r3, r2, r0, r2, r1);
    L_0x0035:
        r2 = r0.length;
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x0046;
    L_0x003a:
        r2 = r7.m12139c();
        r0[r1] = r2;
        r7.m12129a();
        r1 = r1 + 1;
        goto L_0x0035;
    L_0x0046:
        r2 = r7.m12139c();
        r0[r1] = r2;
        r6.f20562d = r0;
        goto L_0x0000;
    L_0x004f:
        r0 = r7.m12136b();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f20561c = r0;
        goto L_0x0000;
    L_0x005a:
        r0 = r7.m12139c();
        r6.f20560b = r0;
        goto L_0x0000;
    L_0x0061:
        r1 = r7.m12147i();
        r2 = r7.m12140d();	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r2 < 0) goto L_0x0075;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x006b:
        r3 = 6;	 Catch:{ IllegalArgumentException -> 0x008e }
        if (r2 > r3) goto L_0x0075;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x006e:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x008e }
        r6.f20559a = r2;	 Catch:{ IllegalArgumentException -> 0x008e }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x0075:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x008e }
        r4 = 41;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x008e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x008e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = " is not a valid enum MatchType";	 Catch:{ IllegalArgumentException -> 0x008e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x008e }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x008e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x008e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x008e }
    L_0x008e:
        r7.m12143e(r1);
        r6.m22647a(r7, r0);
        goto L_0x0000;
    L_0x0096:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfz.b(com.google.android.gms.internal.measurement.zzyx):com.google.android.gms.internal.measurement.zzfz");
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        return m27120b(zzyx);
    }
}
