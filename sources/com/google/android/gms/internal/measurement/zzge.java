package com.google.android.gms.internal.measurement;

public final class zzge extends zzza<zzge> {
    /* renamed from: c */
    private static volatile zzge[] f20583c;
    /* renamed from: a */
    public Integer f20584a;
    /* renamed from: b */
    public Long f20585b;

    /* renamed from: a */
    public static zzge[] m27139a() {
        if (f20583c == null) {
            synchronized (zzze.f10362b) {
                if (f20583c == null) {
                    f20583c = new zzge[0];
                }
            }
        }
        return f20583c;
    }

    public zzge() {
        this.f20584a = null;
        this.f20585b = null;
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzge)) {
            return false;
        }
        zzge zzge = (zzge) obj;
        if (this.f20584a == null) {
            if (zzge.f20584a != null) {
                return false;
            }
        } else if (!this.f20584a.equals(zzge.f20584a)) {
            return false;
        }
        if (this.f20585b == null) {
            if (zzge.f20585b != null) {
                return false;
            }
        } else if (!this.f20585b.equals(zzge.f20585b)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzge.J);
            }
        }
        if (zzge.J != null) {
            if (zzge.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + (this.f20584a == null ? 0 : this.f20584a.hashCode())) * 31) + (this.f20585b == null ? 0 : this.f20585b.hashCode())) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                i = this.J.hashCode();
            }
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20584a != null) {
            zzyy.m12167a(1, this.f20584a.intValue());
        }
        if (this.f20585b != null) {
            zzyy.m12174b(2, this.f20585b.longValue());
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20584a != null) {
            b += zzyy.m12156b(1, this.f20584a.intValue());
        }
        return this.f20585b != null ? b + zzyy.m12161c(2, this.f20585b.longValue()) : b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 8) {
                this.f20584a = Integer.valueOf(zzyx.m12140d());
            } else if (a == 16) {
                this.f20585b = Long.valueOf(zzyx.m12142e());
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
