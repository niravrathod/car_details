package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzea extends zzek {
    /* renamed from: d */
    private List<Long> f17174d = null;

    public zzea(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2) {
        super(zzdb, str, str2, zzbb, i, 31);
    }

    /* renamed from: a */
    protected final void mo2435a() {
        this.b.f19999p = Long.valueOf(-1);
        this.b.f20000q = Long.valueOf(-1);
        if (this.f17174d == null) {
            this.f17174d = (List) this.c.invoke(null, new Object[]{this.a.m10504a()});
        }
        if (this.f17174d != null && this.f17174d.size() == 2) {
            synchronized (this.b) {
                this.b.f19999p = Long.valueOf(((Long) this.f17174d.get(0)).longValue());
                this.b.f20000q = Long.valueOf(((Long) this.f17174d.get(1)).longValue());
            }
        }
    }
}
