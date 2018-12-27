package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import javax.annotation.concurrent.GuardedBy;

@zzaer
public abstract class zzaco extends zzalc {
    /* renamed from: a */
    protected final zzact f19672a;
    /* renamed from: b */
    protected final Context f19673b;
    /* renamed from: c */
    protected final Object f19674c = new Object();
    /* renamed from: d */
    protected final Object f19675d = new Object();
    /* renamed from: e */
    protected final zzakn f19676e;
    @GuardedBy("mLock")
    /* renamed from: f */
    protected zzaft f19677f;

    protected zzaco(Context context, zzakn zzakn, zzact zzact) {
        super(true);
        this.f19673b = context;
        this.f19676e = zzakn;
        this.f19677f = zzakn.f8807b;
        this.f19672a = zzact;
    }

    /* renamed from: a */
    protected abstract zzakm mo4792a(int i);

    /* renamed from: a */
    protected abstract void mo4793a(long j);

    public void m_() {
    }

    /* renamed from: a */
    public final void mo4075a() {
        int a;
        synchronized (this.f19674c) {
            zzaok.m10001b("AdRendererBackgroundTask started.");
            int i = this.f19676e.f8810e;
            try {
                mo4793a(SystemClock.elapsedRealtime());
            } catch (zzacr e) {
                a = e.m9459a();
                if (a != 3) {
                    if (a != -1) {
                        zzaok.m10007e(e.getMessage());
                        if (this.f19677f != null) {
                            this.f19677f = new zzaft(a);
                        } else {
                            this.f19677f = new zzaft(a, this.f19677f.f19795j);
                        }
                        zzalo.f8872a.post(new C2447s(this));
                        i = a;
                    }
                }
                zzaok.m10005d(e.getMessage());
                if (this.f19677f != null) {
                    this.f19677f = new zzaft(a, this.f19677f.f19795j);
                } else {
                    this.f19677f = new zzaft(a);
                }
                zzalo.f8872a.post(new C2447s(this));
                i = a;
            }
            zzalo.f8872a.post(new C2448t(this, mo4792a(i)));
        }
    }
}
