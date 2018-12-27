package com.google.android.gms.internal.measurement;

public final class zzgj extends zzza<zzgj> {
    /* renamed from: a */
    public long[] f20639a;
    /* renamed from: b */
    public long[] f20640b;
    /* renamed from: c */
    public zzge[] f20641c;
    /* renamed from: d */
    public zzgk[] f20642d;

    public zzgj() {
        this.f20639a = zzzj.f10366b;
        this.f20640b = zzzj.f10366b;
        this.f20641c = zzge.m27139a();
        this.f20642d = zzgk.m27161a();
        this.J = null;
        this.K = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgj)) {
            return false;
        }
        zzgj zzgj = (zzgj) obj;
        if (!zzze.m12192a(this.f20639a, zzgj.f20639a) || !zzze.m12192a(this.f20640b, zzgj.f20640b) || !zzze.m12193a(this.f20641c, zzgj.f20641c) || !zzze.m12193a(this.f20642d, zzgj.f20642d)) {
            return false;
        }
        if (this.J != null) {
            if (!this.J.m12188b()) {
                return this.J.equals(zzgj.J);
            }
        }
        if (zzgj.J != null) {
            if (zzgj.J.m12188b() == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((getClass().getName().hashCode() + 527) * 31) + zzze.m12189a(this.f20639a)) * 31) + zzze.m12189a(this.f20640b)) * 31) + zzze.m12190a(this.f20641c)) * 31) + zzze.m12190a(this.f20642d)) * 31;
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
        if (this.f20639a != null && this.f20639a.length > 0) {
            for (long a : this.f20639a) {
                zzyy.m12168a(1, a);
            }
        }
        if (this.f20640b != null && this.f20640b.length > 0) {
            for (long a2 : this.f20640b) {
                zzyy.m12168a(2, a2);
            }
        }
        if (this.f20641c != null && this.f20641c.length > 0) {
            for (zzzg zzzg : this.f20641c) {
                if (zzzg != null) {
                    zzyy.m12170a(3, zzzg);
                }
            }
        }
        if (this.f20642d != null && this.f20642d.length > 0) {
            for (zzzg zzzg2 : this.f20642d) {
                if (zzzg2 != null) {
                    zzyy.m12170a(4, zzzg2);
                }
            }
        }
        super.mo3160a(zzyy);
    }

    /* renamed from: b */
    protected final int mo3161b() {
        int i;
        int i2;
        int b = super.mo3161b();
        if (this.f20639a != null && this.f20639a.length > 0) {
            i = 0;
            for (long a : this.f20639a) {
                i += zzyy.m12149a(a);
            }
            b = (b + i) + (this.f20639a.length * 1);
        }
        if (this.f20640b != null && this.f20640b.length > 0) {
            i = 0;
            for (long a2 : this.f20640b) {
                i += zzyy.m12149a(a2);
            }
            b = (b + i) + (this.f20640b.length * 1);
        }
        if (this.f20641c != null && this.f20641c.length > 0) {
            i2 = b;
            for (zzzg zzzg : this.f20641c) {
                if (zzzg != null) {
                    i2 += zzyy.m12157b(3, zzzg);
                }
            }
            b = i2;
        }
        if (this.f20642d != null && this.f20642d.length > 0) {
            for (zzzg zzzg2 : this.f20642d) {
                if (zzzg2 != null) {
                    b += zzyy.m12157b(4, zzzg2);
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
            int length;
            Object obj;
            if (a == 8) {
                a = zzzj.m12207a(zzyx, 8);
                length = this.f20639a == null ? 0 : this.f20639a.length;
                obj = new long[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20639a, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = zzyx.m12142e();
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = zzyx.m12142e();
                this.f20639a = obj;
            } else if (a == 10) {
                a = zzyx.m12138c(zzyx.m12140d());
                length = zzyx.m12147i();
                r3 = 0;
                while (zzyx.m12146h() > 0) {
                    zzyx.m12142e();
                    r3++;
                }
                zzyx.m12143e(length);
                length = this.f20639a == null ? 0 : this.f20639a.length;
                r3 = new long[(r3 + length)];
                if (length != 0) {
                    System.arraycopy(this.f20639a, 0, r3, 0, length);
                }
                while (length < r3.length) {
                    r3[length] = zzyx.m12142e();
                    length++;
                }
                this.f20639a = r3;
                zzyx.m12141d(a);
            } else if (a == 16) {
                a = zzzj.m12207a(zzyx, 16);
                length = this.f20640b == null ? 0 : this.f20640b.length;
                obj = new long[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20640b, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = zzyx.m12142e();
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = zzyx.m12142e();
                this.f20640b = obj;
            } else if (a == 18) {
                a = zzyx.m12138c(zzyx.m12140d());
                length = zzyx.m12147i();
                r3 = 0;
                while (zzyx.m12146h() > 0) {
                    zzyx.m12142e();
                    r3++;
                }
                zzyx.m12143e(length);
                length = this.f20640b == null ? 0 : this.f20640b.length;
                r3 = new long[(r3 + length)];
                if (length != 0) {
                    System.arraycopy(this.f20640b, 0, r3, 0, length);
                }
                while (length < r3.length) {
                    r3[length] = zzyx.m12142e();
                    length++;
                }
                this.f20640b = r3;
                zzyx.m12141d(a);
            } else if (a == 26) {
                a = zzzj.m12207a(zzyx, 26);
                length = this.f20641c == null ? 0 : this.f20641c.length;
                obj = new zzge[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20641c, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzge();
                    zzyx.m12132a(obj[length]);
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = new zzge();
                zzyx.m12132a(obj[length]);
                this.f20641c = obj;
            } else if (a == 34) {
                a = zzzj.m12207a(zzyx, 34);
                length = this.f20642d == null ? 0 : this.f20642d.length;
                obj = new zzgk[(a + length)];
                if (length != 0) {
                    System.arraycopy(this.f20642d, 0, obj, 0, length);
                }
                while (length < obj.length - 1) {
                    obj[length] = new zzgk();
                    zzyx.m12132a(obj[length]);
                    zzyx.m12129a();
                    length++;
                }
                obj[length] = new zzgk();
                zzyx.m12132a(obj[length]);
                this.f20642d = obj;
            } else if (!super.m22647a(zzyx, a)) {
                return this;
            }
        }
    }
}
