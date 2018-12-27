package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzgi {
    /* renamed from: a */
    private final Object f9487a = new Object();
    /* renamed from: b */
    private int f9488b;
    /* renamed from: c */
    private List<zzgh> f9489c = new LinkedList();

    /* renamed from: a */
    public final zzgh m10626a() {
        synchronized (this.f9487a) {
            zzgh zzgh = null;
            if (this.f9489c.size() == 0) {
                zzaok.m10001b("Queue empty");
                return null;
            }
            int i = 0;
            if (this.f9489c.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzgh zzgh2 : this.f9489c) {
                    int i4 = zzgh2.m10624i();
                    if (i4 > i2) {
                        i = i3;
                        zzgh = zzgh2;
                        i2 = i4;
                    }
                    i3++;
                }
                this.f9489c.remove(i);
                return zzgh;
            }
            zzgh zzgh3 = (zzgh) this.f9489c.get(0);
            zzgh3.m10620e();
            return zzgh3;
        }
    }

    /* renamed from: a */
    public final boolean m10627a(zzgh zzgh) {
        synchronized (this.f9487a) {
            if (this.f9489c.contains(zzgh) != null) {
                return true;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final boolean m10628b(zzgh zzgh) {
        synchronized (this.f9487a) {
            Iterator it = this.f9489c.iterator();
            while (it.hasNext()) {
                zzgh zzgh2 = (zzgh) it.next();
                if (zzbv.zzeo().m9726k().mo2344b()) {
                    if (!(zzbv.zzeo().m9726k().mo2350d() || zzgh == zzgh2 || !zzgh2.m10619d().equals(zzgh.m10619d()))) {
                        it.remove();
                        return true;
                    }
                } else if (zzgh != zzgh2 && zzgh2.m10616b().equals(zzgh.m10616b())) {
                    it.remove();
                    return true;
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public final void m10629c(zzgh zzgh) {
        synchronized (this.f9487a) {
            int size;
            if (this.f9489c.size() >= 10) {
                size = this.f9489c.size();
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Queue is full, current size = ");
                stringBuilder.append(size);
                zzaok.m10001b(stringBuilder.toString());
                this.f9489c.remove(0);
            }
            size = this.f9488b;
            this.f9488b = size + 1;
            zzgh.m10613a(size);
            this.f9489c.add(zzgh);
        }
    }
}
