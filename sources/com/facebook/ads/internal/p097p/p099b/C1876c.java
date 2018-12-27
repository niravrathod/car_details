package com.facebook.ads.internal.p097p.p099b;

import com.facebook.ads.internal.p097p.p099b.p100a.C1868a;
import com.facebook.ads.internal.p097p.p099b.p100a.C1869c;
import java.io.File;

/* renamed from: com.facebook.ads.internal.p.b.c */
class C1876c {
    /* renamed from: a */
    public final File f5710a;
    /* renamed from: b */
    public final C1869c f5711b;
    /* renamed from: c */
    public final C1868a f5712c;

    C1876c(File file, C1869c c1869c, C1868a c1868a) {
        this.f5710a = file;
        this.f5711b = c1869c;
        this.f5712c = c1868a;
    }

    /* renamed from: a */
    File m7155a(String str) {
        return new File(this.f5710a, this.f5711b.mo1399a(str));
    }
}
