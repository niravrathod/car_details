package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public final class zzako {
    /* renamed from: a */
    private final Clock f8816a;
    /* renamed from: b */
    private final zzala f8817b;
    @GuardedBy("mLock")
    /* renamed from: c */
    private final LinkedList<cr> f8818c;
    /* renamed from: d */
    private final Object f8819d = new Object();
    /* renamed from: e */
    private final String f8820e;
    /* renamed from: f */
    private final String f8821f;
    @GuardedBy("mLock")
    /* renamed from: g */
    private long f8822g = -1;
    @GuardedBy("mLock")
    /* renamed from: h */
    private long f8823h = -1;
    @GuardedBy("mLock")
    /* renamed from: i */
    private boolean f8824i = false;
    @GuardedBy("mLock")
    /* renamed from: j */
    private long f8825j = -1;
    @GuardedBy("mLock")
    /* renamed from: k */
    private long f8826k = 0;
    @GuardedBy("mLock")
    /* renamed from: l */
    private long f8827l = -1;
    @GuardedBy("mLock")
    /* renamed from: m */
    private long f8828m = -1;

    zzako(Clock clock, zzala zzala, String str, String str2) {
        this.f8816a = clock;
        this.f8817b = zzala;
        this.f8820e = str;
        this.f8821f = str2;
        this.f8818c = new LinkedList();
    }

    /* renamed from: a */
    public final void m9693a(zzjk zzjk) {
        synchronized (this.f8819d) {
            this.f8827l = this.f8816a.elapsedRealtime();
            this.f8817b.m21216a(zzjk, this.f8827l);
        }
    }

    /* renamed from: a */
    public final void m9692a(long j) {
        synchronized (this.f8819d) {
            this.f8828m = j;
            if (this.f8828m != -1) {
                this.f8817b.m21214a(this);
            }
        }
    }

    /* renamed from: b */
    public final void m9696b(long j) {
        synchronized (this.f8819d) {
            if (this.f8828m != -1) {
                this.f8822g = j;
                this.f8817b.m21214a(this);
            }
        }
    }

    /* renamed from: a */
    public final void m9691a() {
        synchronized (this.f8819d) {
            if (this.f8828m != -1 && this.f8823h == -1) {
                this.f8823h = this.f8816a.elapsedRealtime();
                this.f8817b.m21214a(this);
            }
            this.f8817b.m21219b();
        }
    }

    /* renamed from: b */
    public final void m9695b() {
        synchronized (this.f8819d) {
            if (this.f8828m != -1) {
                cr crVar = new cr(this);
                crVar.m8910c();
                this.f8818c.add(crVar);
                this.f8826k++;
                this.f8817b.m21213a();
                this.f8817b.m21214a(this);
            }
        }
    }

    /* renamed from: c */
    public final void m9698c() {
        synchronized (this.f8819d) {
            if (!(this.f8828m == -1 || this.f8818c.isEmpty())) {
                cr crVar = (cr) this.f8818c.getLast();
                if (crVar.m8908a() == -1) {
                    crVar.m8909b();
                    this.f8817b.m21214a(this);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m9694a(boolean z) {
        synchronized (this.f8819d) {
            if (this.f8828m != -1) {
                this.f8825j = this.f8816a.elapsedRealtime();
                if (!z) {
                    this.f8823h = this.f8825j;
                    this.f8817b.m21214a(this);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m9697b(boolean z) {
        synchronized (this.f8819d) {
            if (this.f8828m != -1) {
                this.f8824i = z;
                this.f8817b.m21214a(this);
            }
        }
    }

    /* renamed from: d */
    public final Bundle m9699d() {
        Bundle bundle;
        synchronized (this.f8819d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f8820e);
            bundle.putString("slotid", this.f8821f);
            bundle.putBoolean("ismediation", this.f8824i);
            bundle.putLong("treq", this.f8827l);
            bundle.putLong("tresponse", this.f8828m);
            bundle.putLong("timp", this.f8823h);
            bundle.putLong("tload", this.f8825j);
            bundle.putLong("pcc", this.f8826k);
            bundle.putLong("tfetch", this.f8822g);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f8818c.iterator();
            while (it.hasNext()) {
                arrayList.add(((cr) it.next()).m8911d());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    /* renamed from: e */
    public final String m9700e() {
        return this.f8820e;
    }
}
