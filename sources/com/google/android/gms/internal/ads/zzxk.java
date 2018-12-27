package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzxk {
    @VisibleForTesting
    /* renamed from: a */
    private static final zzamu<zzvr> f9833a = new we();
    @VisibleForTesting
    /* renamed from: b */
    private static final zzamu<zzvr> f9834b = new wf();
    /* renamed from: c */
    private final zzwc f9835c;

    public zzxk(Context context, zzaop zzaop, String str) {
        this.f9835c = new zzwc(context, zzaop, str, f9833a, f9834b);
    }

    /* renamed from: a */
    public final <I, O> zzxc<I, O> m11182a(String str, zzxf<I> zzxf, zzxe<O> zzxe) {
        return new zzxn(this.f9835c, str, zzxf, zzxe);
    }
}
