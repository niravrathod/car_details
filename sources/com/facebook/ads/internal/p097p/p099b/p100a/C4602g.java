package com.facebook.ads.internal.p097p.p099b.p100a;

import java.io.File;

/* renamed from: com.facebook.ads.internal.p.b.a.g */
public class C4602g extends C3821e {
    /* renamed from: a */
    private final long f19129a;

    public C4602g(long j) {
        if (j > 0) {
            this.f19129a = j;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1398a(File file) {
        super.mo1398a(file);
    }

    /* renamed from: a */
    protected boolean mo3977a(File file, long j, int i) {
        return j <= this.f19129a;
    }
}
