package com.google.android.exoplayer2.upstream;

import android.content.Context;
import com.google.android.exoplayer2.upstream.C2368d.C2367a;

/* renamed from: com.google.android.exoplayer2.upstream.i */
public final class C4056i implements C2367a {
    /* renamed from: a */
    private final Context f16324a;
    /* renamed from: b */
    private final C2371l<? super C2368d> f16325b;
    /* renamed from: c */
    private final C2367a f16326c;

    /* renamed from: a */
    public /* synthetic */ C2368d mo1698a() {
        return m20352b();
    }

    public C4056i(Context context, String str, C2371l<? super C2368d> c2371l) {
        this(context, (C2371l) c2371l, new C4827k(str, c2371l));
    }

    public C4056i(Context context, C2371l<? super C2368d> c2371l, C2367a c2367a) {
        this.f16324a = context.getApplicationContext();
        this.f16325b = c2371l;
        this.f16326c = c2367a;
    }

    /* renamed from: b */
    public C4055h m20352b() {
        return new C4055h(this.f16324a, this.f16325b, this.f16326c.mo1698a());
    }
}
