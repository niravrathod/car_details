package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public final class zzdp extends zzek {
    /* renamed from: d */
    private static zzel<String> f17161d = new zzel();
    /* renamed from: e */
    private final Context f17162e;

    public zzdp(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2, Context context) {
        super(zzdb, str, str2, zzbb, i, 29);
        this.f17162e = context;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        this.b.f19998o = "E";
        AtomicReference a = f17161d.m10544a(this.f17162e.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.c.invoke(null, new Object[]{this.f17162e}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.b) {
            this.b.f19998o = zzbk.m10467a(str.getBytes(), true);
        }
    }
}
