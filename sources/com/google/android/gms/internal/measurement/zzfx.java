package com.google.android.gms.internal.measurement;

public final class zzfx extends zzza<zzfx> {
    /* renamed from: a */
    public Integer f20548a;
    /* renamed from: b */
    public Boolean f20549b;
    /* renamed from: c */
    public String f20550c;
    /* renamed from: d */
    public String f20551d;
    /* renamed from: e */
    public String f20552e;

    public zzfx() {
        this.f20548a = null;
        this.f20549b = null;
        this.f20550c = null;
        this.f20551d = null;
        this.f20552e = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfx)) {
            return false;
        }
        zzfx zzfx = (zzfx) obj;
        if (this.f20548a == null) {
            if (zzfx.f20548a != null) {
                return false;
            }
        } else if (!this.f20548a.equals(zzfx.f20548a)) {
            return false;
        }
        if (this.f20549b == null) {
            if (zzfx.f20549b != null) {
                return false;
            }
        } else if (!this.f20549b.equals(zzfx.f20549b)) {
            return false;
        }
        if (this.f20550c == null) {
            if (zzfx.f20550c != null) {
                return false;
            }
        } else if (!this.f20550c.equals(zzfx.f20550c)) {
            return false;
        }
        if (this.f20551d == null) {
            if (zzfx.f20551d != null) {
                return false;
            }
        } else if (!this.f20551d.equals(zzfx.f20551d)) {
            return false;
        }
        if (this.f20552e == null) {
            if (zzfx.f20552e != null) {
                return false;
            }
        } else if (!this.f20552e.equals(zzfx.f20552e)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzfx.J);
            }
        }
        if (zzfx.J != null) {
            if (zzfx.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20548a == null ? 0 : this.f20548a.intValue())) * 31) + (this.f20549b == null ? 0 : this.f20549b.hashCode())) * 31) + (this.f20550c == null ? 0 : this.f20550c.hashCode())) * 31) + (this.f20551d == null ? 0 : this.f20551d.hashCode())) * 31) + (this.f20552e == null ? 0 : this.f20552e.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20548a != null) {
            zzyy.m12167a(1, this.f20548a.intValue());
        }
        if (this.f20549b != null) {
            zzyy.m12172a(2, this.f20549b.booleanValue());
        }
        if (this.f20550c != null) {
            zzyy.m12171a(3, this.f20550c);
        }
        if (this.f20551d != null) {
            zzyy.m12171a(4, this.f20551d);
        }
        if (this.f20552e != null) {
            zzyy.m12171a(5, this.f20552e);
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20548a != null) {
            b += zzyy.m12156b(1, this.f20548a.intValue());
        }
        if (this.f20549b != null) {
            this.f20549b.booleanValue();
            b += zzyy.m12155b(2) + 1;
        }
        if (this.f20550c != null) {
            b += zzyy.m12158b(3, this.f20550c);
        }
        if (this.f20551d != null) {
            b += zzyy.m12158b(4, this.f20551d);
        }
        return this.f20552e != null ? b + zzyy.m12158b(5, this.f20552e) : b;
    }

    /* renamed from: b */
    private final com.google.android.gms.internal.measurement.zzfx m27112b(com.google.android.gms.internal.measurement.zzyx r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.m12129a();
        if (r0 == 0) goto L_0x0075;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x0041;
    L_0x000a:
        r1 = 16;
        if (r0 == r1) goto L_0x0036;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x002f;
    L_0x0012:
        r1 = 34;
        if (r0 == r1) goto L_0x0028;
    L_0x0016:
        r1 = 42;
        if (r0 == r1) goto L_0x0021;
    L_0x001a:
        r0 = super.m22647a(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0020:
        return r6;
    L_0x0021:
        r0 = r7.m12139c();
        r6.f20552e = r0;
        goto L_0x0000;
    L_0x0028:
        r0 = r7.m12139c();
        r6.f20551d = r0;
        goto L_0x0000;
    L_0x002f:
        r0 = r7.m12139c();
        r6.f20550c = r0;
        goto L_0x0000;
    L_0x0036:
        r0 = r7.m12136b();
        r0 = java.lang.Boolean.valueOf(r0);
        r6.f20549b = r0;
        goto L_0x0000;
    L_0x0041:
        r1 = r7.m12147i();
        r2 = r7.m12140d();	 Catch:{ IllegalArgumentException -> 0x006e }
        if (r2 < 0) goto L_0x0055;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x004b:
        r3 = 4;	 Catch:{ IllegalArgumentException -> 0x006e }
        if (r2 > r3) goto L_0x0055;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x004e:
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r6.f20548a = r2;	 Catch:{ IllegalArgumentException -> 0x006e }
        goto L_0x0000;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x0055:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x006e }
        r4 = 46;	 Catch:{ IllegalArgumentException -> 0x006e }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.<init>(r4);	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r2 = " is not a valid enum ComparisonType";	 Catch:{ IllegalArgumentException -> 0x006e }
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x006e }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x006e }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x006e }
    L_0x006e:
        r7.m12143e(r1);
        r6.m22647a(r7, r0);
        goto L_0x0000;
    L_0x0075:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfx.b(com.google.android.gms.internal.measurement.zzyx):com.google.android.gms.internal.measurement.zzfx");
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        return m27112b(zzyx);
    }
}
