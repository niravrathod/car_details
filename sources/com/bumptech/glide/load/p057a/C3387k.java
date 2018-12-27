package com.bumptech.glide.load.p057a;

import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.p057a.C1190e.C1189a;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.k */
public final class C3387k implements C1190e<InputStream> {
    /* renamed from: a */
    private final RecyclableBufferedInputStream f14278a;

    /* renamed from: com.bumptech.glide.load.a.k$a */
    public static final class C3386a implements C1189a<InputStream> {
        /* renamed from: a */
        private final C1230b f14277a;

        public C3386a(C1230b c1230b) {
            this.f14277a = c1230b;
        }

        /* renamed from: a */
        public C1190e<InputStream> m17331a(InputStream inputStream) {
            return new C3387k(inputStream, this.f14277a);
        }

        /* renamed from: a */
        public Class<InputStream> mo965a() {
            return InputStream.class;
        }
    }

    /* renamed from: a */
    public /* synthetic */ Object mo966a() {
        return m17336c();
    }

    C3387k(InputStream inputStream, C1230b c1230b) {
        this.f14278a = new RecyclableBufferedInputStream(inputStream, c1230b);
        this.f14278a.mark(5242880);
    }

    /* renamed from: c */
    public InputStream m17336c() {
        this.f14278a.reset();
        return this.f14278a;
    }

    /* renamed from: b */
    public void mo967b() {
        this.f14278a.m5168b();
    }
}
