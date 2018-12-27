package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzbe {
    @VisibleForTesting
    /* renamed from: a */
    private final String f10759a;
    /* renamed from: b */
    private final String f10760b;
    /* renamed from: c */
    private final String f10761c;
    /* renamed from: d */
    private final long f10762d;
    /* renamed from: e */
    private final /* synthetic */ C4832l f10763e;

    private zzbe(C4832l c4832l, String str, long j) {
        this.f10763e = c4832l;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(j > 0 ? true : null);
        this.f10759a = String.valueOf(str).concat(":start");
        this.f10760b = String.valueOf(str).concat(":count");
        this.f10761c = String.valueOf(str).concat(":value");
        this.f10762d = j;
    }

    /* renamed from: b */
    private final void m12362b() {
        this.f10763e.mo4395d();
        long currentTimeMillis = this.f10763e.mo3169m().currentTimeMillis();
        Editor edit = this.f10763e.m28447x().edit();
        edit.remove(this.f10760b);
        edit.remove(this.f10761c);
        edit.putLong(this.f10759a, currentTimeMillis);
        edit.apply();
    }

    /* renamed from: a */
    public final void m12365a(String str, long j) {
        this.f10763e.mo4395d();
        if (m12363c() == 0) {
            m12362b();
        }
        if (str == null) {
            str = "";
        }
        j = this.f10763e.m28447x().getLong(this.f10760b, 0);
        if (j <= 0) {
            j = this.f10763e.m28447x().edit();
            j.putString(this.f10761c, str);
            j.putLong(this.f10760b, 1);
            j.apply();
            return;
        }
        j++;
        Object obj = (this.f10763e.mo4398p().m28636h().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j ? 1 : null;
        Editor edit = this.f10763e.m28447x().edit();
        if (obj != null) {
            edit.putString(this.f10761c, str);
        }
        edit.putLong(this.f10760b, j);
        edit.apply();
    }

    /* renamed from: a */
    public final Pair<String, Long> m12364a() {
        this.f10763e.mo4395d();
        this.f10763e.mo4395d();
        long c = m12363c();
        if (c == 0) {
            m12362b();
            c = 0;
        } else {
            c = Math.abs(c - this.f10763e.mo3169m().currentTimeMillis());
        }
        if (c < this.f10762d) {
            return null;
        }
        if (c > (this.f10762d << 1)) {
            m12362b();
            return null;
        }
        String string = this.f10763e.m28447x().getString(this.f10761c, null);
        long j = this.f10763e.m28447x().getLong(this.f10760b, 0);
        m12362b();
        if (string != null) {
            if (j > 0) {
                return new Pair(string, Long.valueOf(j));
            }
        }
        return C4832l.f21381a;
    }

    /* renamed from: c */
    private final long m12363c() {
        return this.f10763e.m28447x().getLong(this.f10759a, 0);
    }
}
