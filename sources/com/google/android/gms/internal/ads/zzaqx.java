package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
public final class zzaqx {
    /* renamed from: a */
    private final Context f8969a;
    /* renamed from: b */
    private final zzarg f8970b;
    /* renamed from: c */
    private final ViewGroup f8971c;
    /* renamed from: d */
    private zzaqr f8972d;

    public zzaqx(Context context, ViewGroup viewGroup, zzasg zzasg) {
        this(context, viewGroup, zzasg, null);
    }

    @VisibleForTesting
    private zzaqx(Context context, ViewGroup viewGroup, zzarg zzarg, zzaqr zzaqr) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f8969a = context;
        this.f8971c = viewGroup;
        this.f8970b = zzarg;
        this.f8972d = null;
    }

    /* renamed from: a */
    public final void m10060a(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        if (this.f8972d != null) {
            this.f8972d.m21315a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void m10061a(int i, int i2, int i3, int i4, int i5, boolean z, zzarf zzarf) {
        if (this.f8972d == null) {
            zzoc.m10917a(r0.f8970b.mo4203h().m10922a(), r0.f8970b.mo4752c(), "vpr2");
            r0.f8972d = new zzaqr(r0.f8969a, r0.f8970b, i5, z, r0.f8970b.mo4203h().m10922a(), zzarf);
            r0.f8971c.addView(r0.f8972d, 0, new LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            int i8 = i3;
            int i9 = i4;
            r0.f8972d.m21315a(i, i2, i3, i4);
            r0.f8970b.mo4744a(false);
        }
    }

    /* renamed from: a */
    public final zzaqr m10059a() {
        Preconditions.checkMainThread("getAdVideoUnderlay must be called from the UI thread.");
        return this.f8972d;
    }

    /* renamed from: b */
    public final void m10062b() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        if (this.f8972d != null) {
            this.f8972d.m21327i();
        }
    }

    /* renamed from: c */
    public final void m10063c() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        if (this.f8972d != null) {
            this.f8972d.m21332n();
            this.f8971c.removeView(this.f8972d);
            this.f8972d = null;
        }
    }
}
