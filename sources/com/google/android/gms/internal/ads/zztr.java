package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzal;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.VisibleForTesting;

@zzaer
@VisibleForTesting
public final class zztr {
    /* renamed from: a */
    private final Context f9785a;
    /* renamed from: b */
    private final zzyn f9786b;
    /* renamed from: c */
    private final zzaop f9787c;
    /* renamed from: d */
    private final zzv f9788d;

    zztr(Context context, zzyn zzyn, zzaop zzaop, zzv zzv) {
        this.f9785a = context;
        this.f9786b = zzyn;
        this.f9787c = zzaop;
        this.f9788d = zzv;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final zzal m11116a(String str) {
        return new zzal(this.f9785a, new zzjo(), str, this.f9786b, this.f9787c, this.f9788d);
    }

    @VisibleForTesting
    /* renamed from: b */
    public final zzal m11117b(String str) {
        return new zzal(this.f9785a.getApplicationContext(), new zzjo(), str, this.f9786b, this.f9787c, this.f9788d);
    }

    @VisibleForTesting
    /* renamed from: a */
    public final Context m11115a() {
        return this.f9785a.getApplicationContext();
    }

    @VisibleForTesting
    /* renamed from: b */
    public final zztr m11118b() {
        return new zztr(this.f9785a.getApplicationContext(), this.f9786b, this.f9787c, this.f9788d);
    }
}
