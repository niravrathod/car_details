package com.google.android.gms.internal.measurement;

public final class zzfu extends zzza<zzfu> {
    /* renamed from: d */
    private static volatile zzfu[] f20529d;
    /* renamed from: a */
    public Integer f20530a;
    /* renamed from: b */
    public zzfy[] f20531b;
    /* renamed from: c */
    public zzfv[] f20532c;
    /* renamed from: e */
    private Boolean f20533e;
    /* renamed from: f */
    private Boolean f20534f;

    /* renamed from: a */
    public static zzfu[] m27100a() {
        if (f20529d == null) {
            synchronized (zzze.f10362b) {
                if (f20529d == null) {
                    f20529d = new zzfu[0];
                }
            }
        }
        return f20529d;
    }

    public zzfu() {
        this.f20530a = null;
        this.f20531b = zzfy.m27116a();
        this.f20532c = zzfv.m27104a();
        this.f20533e = null;
        this.f20534f = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfu)) {
            return false;
        }
        zzfu zzfu = (zzfu) obj;
        if (this.f20530a == null) {
            if (zzfu.f20530a != null) {
                return false;
            }
        } else if (!this.f20530a.equals(zzfu.f20530a)) {
            return false;
        }
        if (!zzze.m12193a(this.f20531b, zzfu.f20531b) || !zzze.m12193a(this.f20532c, zzfu.f20532c)) {
            return false;
        }
        if (this.f20533e == null) {
            if (zzfu.f20533e != null) {
                return false;
            }
        } else if (!this.f20533e.equals(zzfu.f20533e)) {
            return false;
        }
        if (this.f20534f == null) {
            if (zzfu.f20534f != null) {
                return false;
            }
        } else if (!this.f20534f.equals(zzfu.f20534f)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzfu.J);
            }
        }
        if (zzfu.J != null) {
            if (zzfu.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + (this.f20530a == null ? 0 : this.f20530a.hashCode())) * 31) + zzze.m12190a(this.f20531b)) * 31) + zzze.m12190a(this.f20532c)) * 31) + (this.f20533e == null ? 0 : this.f20533e.hashCode())) * 31) + (this.f20534f == null ? 0 : this.f20534f.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20530a != null) {
            zzyy.m12167a(1, this.f20530a.intValue());
        }
        if (this.f20531b != null && this.f20531b.length > 0) {
            for (zzzg zzzg : this.f20531b) {
                if (zzzg != null) {
                    zzyy.m12170a(2, zzzg);
                }
            }
        }
        if (this.f20532c != null && this.f20532c.length > 0) {
            for (zzzg zzzg2 : this.f20532c) {
                if (zzzg2 != null) {
                    zzyy.m12170a(3, zzzg2);
                }
            }
        }
        if (this.f20533e != null) {
            zzyy.m12172a(4, this.f20533e.booleanValue());
        }
        if (this.f20534f != null) {
            zzyy.m12172a(5, this.f20534f.booleanValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20530a != null) {
            b += zzyy.m12156b(1, this.f20530a.intValue());
        }
        if (this.f20531b != null && this.f20531b.length > 0) {
            int i = b;
            for (zzzg zzzg : this.f20531b) {
                if (zzzg != null) {
                    i += zzyy.m12157b(2, zzzg);
                }
            }
            b = i;
        }
        if (this.f20532c != null && this.f20532c.length > 0) {
            for (zzzg zzzg2 : this.f20532c) {
                if (zzzg2 != null) {
                    b += zzyy.m12157b(3, zzzg2);
                }
            }
        }
        if (this.f20533e != null) {
            this.f20533e.booleanValue();
            b += zzyy.m12155b(4) + 1;
        }
        if (this.f20534f == null) {
            return b;
        }
        this.f20534f.booleanValue();
        return b + (zzyy.m12155b(5) + 1);
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20530a = Integer.valueOf(zzyx.m12140d());
            } else if (a == 18) {
                a = zzzj.m12207a(zzyx, 18);
                r1 = this.f20531b == null ? 0 : this.f20531b.length;
                r0 = new zzfy[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20531b, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new zzfy();
                    zzyx.m12132a(r0[r1]);
                    zzyx.m12129a();
                    r1++;
                }
                r0[r1] = new zzfy();
                zzyx.m12132a(r0[r1]);
                this.f20531b = r0;
            } else if (a == 26) {
                a = zzzj.m12207a(zzyx, 26);
                r1 = this.f20532c == null ? 0 : this.f20532c.length;
                r0 = new zzfv[(a + r1)];
                if (r1 != 0) {
                    System.arraycopy(this.f20532c, 0, r0, 0, r1);
                }
                while (r1 < r0.length - 1) {
                    r0[r1] = new zzfv();
                    zzyx.m12132a(r0[r1]);
                    zzyx.m12129a();
                    r1++;
                }
                r0[r1] = new zzfv();
                zzyx.m12132a(r0[r1]);
                this.f20532c = r0;
            } else if (a == 32) {
                this.f20533e = Boolean.valueOf(zzyx.m12136b());
            } else if (a == 40) {
                this.f20534f = Boolean.valueOf(zzyx.m12136b());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
