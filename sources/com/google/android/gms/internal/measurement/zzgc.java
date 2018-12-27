package com.google.android.gms.internal.measurement;

public final class zzgc extends zzza<zzgc> {
    /* renamed from: c */
    private static volatile zzgc[] f20575c;
    /* renamed from: a */
    public String f20576a;
    /* renamed from: b */
    public String f20577b;

    /* renamed from: a */
    public static zzgc[] m27131a() {
        if (f20575c == null) {
            synchronized (zzze.f10362b) {
                if (f20575c == null) {
                    f20575c = new zzgc[0];
                }
            }
        }
        return f20575c;
    }

    public zzgc() {
        this.f20576a = null;
        this.f20577b = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgc)) {
            return false;
        }
        zzgc zzgc = (zzgc) obj;
        if (this.f20576a == null) {
            if (zzgc.f20576a != null) {
                return false;
            }
        } else if (!this.f20576a.equals(zzgc.f20576a)) {
            return false;
        }
        if (this.f20577b == null) {
            if (zzgc.f20577b != null) {
                return false;
            }
        } else if (!this.f20577b.equals(zzgc.f20577b)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgc.J);
            }
        }
        if (zzgc.J != null) {
            if (zzgc.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f20576a == null ? 0 : this.f20576a.hashCode())) * 31) + (this.f20577b == null ? 0 : this.f20577b.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20576a != null) {
            zzyy.m12171a(1, this.f20576a);
        }
        if (this.f20577b != null) {
            zzyy.m12171a(2, this.f20577b);
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20576a != null) {
            b += zzyy.m12158b(1, this.f20576a);
        }
        return this.f20577b != null ? b + zzyy.m12158b(2, this.f20577b) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                this.f20576a = zzyx.m12139c();
            } else if (a == 18) {
                this.f20577b = zzyx.m12139c();
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
