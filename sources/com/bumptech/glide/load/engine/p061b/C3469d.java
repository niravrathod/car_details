package com.bumptech.glide.load.engine.p061b;

import com.bumptech.glide.load.engine.p061b.C1242a.C1240a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.d */
public class C3469d implements C1240a {
    /* renamed from: a */
    private final long f14427a;
    /* renamed from: b */
    private final C1246a f14428b;

    /* renamed from: com.bumptech.glide.load.engine.b.d$a */
    public interface C1246a {
        /* renamed from: a */
        File mo1021a();
    }

    public C3469d(C1246a c1246a, long j) {
        this.f14427a = j;
        this.f14428b = c1246a;
    }

    /* renamed from: a */
    public C1242a mo1020a() {
        File a = this.f14428b.mo1021a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C3470e.m17645a(a, this.f14427a);
        }
        return null;
    }
}
