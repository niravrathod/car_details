package com.bumptech.glide.load.resource.p165a;

import com.bumptech.glide.load.p057a.C1190e;
import com.bumptech.glide.load.p057a.C1190e.C1189a;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.a.a */
public class C3502a implements C1190e<ByteBuffer> {
    /* renamed from: a */
    private final ByteBuffer f14540a;

    /* renamed from: com.bumptech.glide.load.resource.a.a$a */
    public static class C3501a implements C1189a<ByteBuffer> {
        /* renamed from: a */
        public C1190e<ByteBuffer> m17761a(ByteBuffer byteBuffer) {
            return new C3502a(byteBuffer);
        }

        /* renamed from: a */
        public Class<ByteBuffer> mo965a() {
            return ByteBuffer.class;
        }
    }

    /* renamed from: b */
    public void mo967b() {
    }

    /* renamed from: a */
    public /* synthetic */ Object mo966a() {
        return m17765c();
    }

    public C3502a(ByteBuffer byteBuffer) {
        this.f14540a = byteBuffer;
    }

    /* renamed from: c */
    public ByteBuffer m17765c() {
        this.f14540a.position(0);
        return this.f14540a;
    }
}
