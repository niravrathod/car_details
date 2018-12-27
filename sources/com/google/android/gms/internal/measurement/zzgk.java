package com.google.android.gms.internal.measurement;

public final class zzgk extends zzza<zzgk> {
    /* renamed from: c */
    private static volatile zzgk[] f20643c;
    /* renamed from: a */
    public Integer f20644a;
    /* renamed from: b */
    public long[] f20645b;

    /* renamed from: a */
    public static zzgk[] m27161a() {
        if (f20643c == null) {
            synchronized (zzze.f10362b) {
                if (f20643c == null) {
                    f20643c = new zzgk[0];
                }
            }
        }
        return f20643c;
    }

    public zzgk() {
        this.f20644a = null;
        this.f20645b = zzzj.f10366b;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgk)) {
            return false;
        }
        zzgk zzgk = (zzgk) obj;
        if (this.f20644a == null) {
            if (zzgk.f20644a != null) {
                return false;
            }
        } else if (!this.f20644a.equals(zzgk.f20644a)) {
            return false;
        }
        if (!zzze.m12192a(this.f20645b, zzgk.f20645b)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgk.J);
            }
        }
        if (zzgk.J != null) {
            if (zzgk.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f20644a == null ? 0 : this.f20644a.hashCode())) * 31) + zzze.m12189a(this.f20645b)) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20644a != null) {
            zzyy.m12167a(1, this.f20644a.intValue());
        }
        if (this.f20645b != null && this.f20645b.length > 0) {
            for (long b : this.f20645b) {
                zzyy.m12174b(2, b);
            }
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20644a != null) {
            b += zzyy.m12156b(1, this.f20644a.intValue());
        }
        if (this.f20645b == null || this.f20645b.length <= 0) {
            return b;
        }
        int i = 0;
        for (long a : this.f20645b) {
            i += zzyy.m12149a(a);
        }
        return (b + i) + (this.f20645b.length * 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20644a = Integer.valueOf(zzyx.m12140d());
            } else if (a == 16) {
                a = zzzj.m12207a(zzyx, 16);
                r1 = this.f20645b == null ? 0 : this.f20645b.length;
                Object obj = new long[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20645b, 0, obj, 0, r1);
                }
                while (r1 < obj.length - 1) {
                    obj[r1] = zzyx.m12142e();
                    zzyx.m12129a();
                    r1++;
                }
                obj[r1] = zzyx.m12142e();
                this.f20645b = obj;
            } else if (a == 18) {
                a = zzyx.m12138c(zzyx.m12140d());
                r1 = zzyx.m12147i();
                int i = 0;
                while (zzyx.m12146h() > 0) {
                    zzyx.m12142e();
                    i++;
                }
                zzyx.m12143e(r1);
                r1 = this.f20645b == null ? 0 : this.f20645b.length;
                Object obj2 = new long[(i + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20645b, 0, obj2, 0, r1);
                }
                while (r1 < obj2.length) {
                    obj2[r1] = zzyx.m12142e();
                    r1++;
                }
                this.f20645b = obj2;
                zzyx.m12141d(a);
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
