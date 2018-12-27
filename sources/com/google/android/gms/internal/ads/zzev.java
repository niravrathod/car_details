package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzev implements zzfd {
    /* renamed from: a */
    private final Object f17182a = new Object();
    /* renamed from: b */
    private final WeakHashMap<zzakm, zzew> f17183b = new WeakHashMap();
    /* renamed from: c */
    private final ArrayList<zzew> f17184c = new ArrayList();
    /* renamed from: d */
    private final Context f17185d;
    /* renamed from: e */
    private final zzaop f17186e;
    /* renamed from: f */
    private final zzwc f17187f;

    public zzev(Context context, zzaop zzaop) {
        this.f17185d = context.getApplicationContext();
        this.f17186e = zzaop;
        this.f17187f = new zzwc(context.getApplicationContext(), zzaop, (String) zzkd.m10713e().m10897a(zznw.f9702a));
    }

    /* renamed from: a */
    public final void m21682a(zzjo zzjo, zzakm zzakm) {
        m21683a(zzjo, zzakm, zzakm.f8781b.getView());
    }

    /* renamed from: a */
    public final void m21683a(zzjo zzjo, zzakm zzakm, View view) {
        m21685a(zzjo, zzakm, new zzfc(view, zzakm), (zzasg) null);
    }

    /* renamed from: a */
    public final void m21684a(zzjo zzjo, zzakm zzakm, View view, zzasg zzasg) {
        m21685a(zzjo, zzakm, new zzfc(view, zzakm), zzasg);
    }

    /* renamed from: a */
    public final void m21685a(zzjo zzjo, zzakm zzakm, zzgg zzgg, zzasg zzasg) {
        synchronized (this.f17182a) {
            if (m21679e(zzakm)) {
                zzjo = (zzew) this.f17183b.get(zzakm);
            } else {
                zzew zzew = new zzew(this.f17185d, zzjo, zzakm, this.f17186e, zzgg);
                zzew.m10579a((zzfd) this);
                this.f17183b.put(zzakm, zzew);
                this.f17184c.add(zzew);
                zzjo = zzew;
            }
            if (zzasg != null) {
                zzjo.m10580a(new zzfe(zzjo, zzasg));
            } else {
                zzjo.m10580a(new zzfi(zzjo, this.f17187f, this.f17185d));
            }
        }
    }

    /* renamed from: e */
    private final boolean m21679e(zzakm zzakm) {
        synchronized (this.f17182a) {
            zzew zzew = (zzew) this.f17183b.get(zzakm);
            zzakm = (zzew == null || zzew.m10587c() == null) ? null : true;
        }
        return zzakm;
    }

    /* renamed from: a */
    public final void m21680a(zzakm zzakm) {
        synchronized (this.f17182a) {
            zzew zzew = (zzew) this.f17183b.get(zzakm);
            if (zzew != null) {
                zzew.m10583b();
            }
        }
    }

    /* renamed from: a */
    public final void mo2445a(zzew zzew) {
        synchronized (this.f17182a) {
            if (!zzew.m10587c()) {
                this.f17184c.remove(zzew);
                Iterator it = this.f17183b.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Entry) it.next()).getValue() == zzew) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void m21686b(zzakm zzakm) {
        synchronized (this.f17182a) {
            zzew zzew = (zzew) this.f17183b.get(zzakm);
            if (zzew != null) {
                zzew.m10588d();
            }
        }
    }

    /* renamed from: c */
    public final void m21687c(zzakm zzakm) {
        synchronized (this.f17182a) {
            zzew zzew = (zzew) this.f17183b.get(zzakm);
            if (zzew != null) {
                zzew.m10589e();
            }
        }
    }

    /* renamed from: d */
    public final void m21688d(zzakm zzakm) {
        synchronized (this.f17182a) {
            zzew zzew = (zzew) this.f17183b.get(zzakm);
            if (zzew != null) {
                zzew.m10590f();
            }
        }
    }
}
