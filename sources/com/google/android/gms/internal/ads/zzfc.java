package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;

public final class zzfc implements zzgg {
    /* renamed from: a */
    private final WeakReference<View> f17192a;
    /* renamed from: b */
    private final WeakReference<zzakm> f17193b;

    public zzfc(View view, zzakm zzakm) {
        this.f17192a = new WeakReference(view);
        this.f17193b = new WeakReference(zzakm);
    }

    /* renamed from: a */
    public final View mo2446a() {
        return (View) this.f17192a.get();
    }

    /* renamed from: b */
    public final boolean mo2447b() {
        if (this.f17192a.get() != null) {
            if (this.f17193b.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public final zzgg mo2448c() {
        return new zzfb((View) this.f17192a.get(), (zzakm) this.f17193b.get());
    }
}
