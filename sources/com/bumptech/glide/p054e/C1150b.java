package com.bumptech.glide.p054e;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.e.b */
public final class C1150b {
    /* renamed from: a */
    private final List<ImageHeaderParser> f3769a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> m4798a() {
        return this.f3769a;
    }

    /* renamed from: a */
    public synchronized void m4799a(ImageHeaderParser imageHeaderParser) {
        this.f3769a.add(imageHeaderParser);
    }
}
