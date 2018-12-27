package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.resource.bitmap.C1285k.C1284a;
import com.bumptech.glide.p055g.C1173d;
import com.bumptech.glide.p055g.C1176g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.t */
public class C3525t implements C1280f<InputStream, Bitmap> {
    /* renamed from: a */
    private final C1285k f14560a;
    /* renamed from: b */
    private final C1230b f14561b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.t$a */
    static class C3524a implements C1284a {
        /* renamed from: a */
        private final RecyclableBufferedInputStream f14558a;
        /* renamed from: b */
        private final C1173d f14559b;

        C3524a(RecyclableBufferedInputStream recyclableBufferedInputStream, C1173d c1173d) {
            this.f14558a = recyclableBufferedInputStream;
            this.f14559b = c1173d;
        }

        /* renamed from: a */
        public void mo1062a() {
            this.f14558a.m5167a();
        }

        /* renamed from: a */
        public void mo1063a(C1232e c1232e, Bitmap bitmap) {
            IOException a = this.f14559b.m4862a();
            if (a != null) {
                if (bitmap != null) {
                    c1232e.mo1005a(bitmap);
                }
                throw a;
            }
        }
    }

    public C3525t(C1285k c1285k, C1230b c1230b) {
        this.f14560a = c1285k;
        this.f14561b = c1230b;
    }

    /* renamed from: a */
    public boolean m17854a(InputStream inputStream, C3452e c3452e) {
        return this.f14560a.m5201a(inputStream);
    }

    /* renamed from: a */
    public C1277s<Bitmap> m17852a(InputStream inputStream, int i, int i2, C3452e c3452e) {
        Object obj;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            inputStream = (RecyclableBufferedInputStream) inputStream;
            obj = null;
        } else {
            inputStream = new RecyclableBufferedInputStream(inputStream, this.f14561b);
            obj = 1;
        }
        InputStream a = C1173d.m4861a(inputStream);
        try {
            i = this.f14560a.m5200a(new C1176g(a), i, i2, c3452e, new C3524a(inputStream, a));
            return i;
        } finally {
            a.m4863b();
            if (obj != null) {
                inputStream.m5168b();
            }
        }
    }
}
