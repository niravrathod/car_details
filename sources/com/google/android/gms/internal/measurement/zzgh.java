package com.google.android.gms.internal.measurement;

public final class zzgh extends zzza<zzgh> {
    /* renamed from: a */
    public zzgi[] f20598a;

    public zzgh() {
        this.f20598a = zzgi.m27154a();
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgh)) {
            return false;
        }
        zzgh zzgh = (zzgh) obj;
        if (!zzze.m12193a(this.f20598a, zzgh.f20598a)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgh.J);
            }
        }
        if (zzgh.J != null) {
            if (zzgh.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((getClass().getName().hashCode() + 527) * 31) + zzze.m12190a(this.f20598a)) * 31;
        if (this.J != null) {
            if (!this.J.m12188b()) {
                hashCode = this.J.hashCode();
                return hashCode2 + hashCode;
            }
        }
        hashCode = 0;
        return hashCode2 + hashCode;
    }

    /* renamed from: a */
    public final void mo3160a(zzyy zzyy) {
        if (this.f20598a != null && this.f20598a.length > 0) {
            for (zzzg zzzg : this.f20598a) {
                if (zzzg != null) {
                    zzyy.m12170a(1, zzzg);
                }
            }
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int b = super.mo3161b();
        if (this.f20598a != null && this.f20598a.length > 0) {
            for (zzzg zzzg : this.f20598a) {
                if (zzzg != null) {
                    b += zzyy.m12157b(1, zzzg);
                }
            }
        }
        return b;
    }

    /* renamed from: a */
    public final /* synthetic */ zzzg mo4347a(zzyx zzyx) {
        while (true) {
            int a = zzyx.m12129a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                a = zzzj.m12207a(zzyx, 10);
                int length = this.f20598a == null ? 0 : this.f20598a.length;
                Object obj = new zzgi[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20598a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzgi();
                    zzyx.m12132a(obj[length]);
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = new zzgi();
                zzyx.m12132a(obj[length]);
                this.f20598a = obj;
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
