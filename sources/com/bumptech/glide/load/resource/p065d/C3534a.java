package com.bumptech.glide.load.resource.p065d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.load.C1215b;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.engine.p060a.C1232e;
import com.bumptech.glide.load.resource.C4517b;
import com.bumptech.glide.p051b.C1129a;
import com.bumptech.glide.p051b.C1129a.C1128a;
import com.bumptech.glide.p051b.C1131c;
import com.bumptech.glide.p051b.C1132d;
import com.bumptech.glide.p051b.C3356e;
import com.bumptech.glide.p055g.C1174e;
import com.bumptech.glide.p055g.C1180j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.resource.d.a */
public class C3534a implements C1280f<ByteBuffer, C3536c> {
    /* renamed from: a */
    private static final C1292a f14571a = new C1292a();
    /* renamed from: b */
    private static final C1293b f14572b = new C1293b();
    /* renamed from: c */
    private final Context f14573c;
    /* renamed from: d */
    private final List<ImageHeaderParser> f14574d;
    /* renamed from: e */
    private final C1293b f14575e;
    /* renamed from: f */
    private final C1292a f14576f;
    /* renamed from: g */
    private final C3535b f14577g;

    /* renamed from: com.bumptech.glide.load.resource.d.a$a */
    static class C1292a {
        C1292a() {
        }

        /* renamed from: a */
        C1129a m5226a(C1128a c1128a, C1131c c1131c, ByteBuffer byteBuffer, int i) {
            return new C3356e(c1128a, c1131c, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.d.a$b */
    static class C1293b {
        /* renamed from: a */
        private final Queue<C1132d> f4074a = C1180j.m4895a(0);

        C1293b() {
        }

        /* renamed from: a */
        synchronized C1132d m5227a(ByteBuffer byteBuffer) {
            C1132d c1132d;
            c1132d = (C1132d) this.f4074a.poll();
            if (c1132d == null) {
                c1132d = new C1132d();
            }
            return c1132d.m4728a(byteBuffer);
        }

        /* renamed from: a */
        synchronized void m5228a(C1132d c1132d) {
            c1132d.m4729a();
            this.f4074a.offer(c1132d);
        }
    }

    public C3534a(Context context, List<ImageHeaderParser> list, C1232e c1232e, C1230b c1230b) {
        this(context, list, c1232e, c1230b, f14572b, f14571a);
    }

    C3534a(Context context, List<ImageHeaderParser> list, C1232e c1232e, C1230b c1230b, C1293b c1293b, C1292a c1292a) {
        this.f14573c = context.getApplicationContext();
        this.f14574d = list;
        this.f14576f = c1292a;
        this.f14577g = new C3535b(c1232e, c1230b);
        this.f14575e = c1293b;
    }

    /* renamed from: a */
    public boolean m17889a(ByteBuffer byteBuffer, C3452e c3452e) {
        return (((Boolean) c3452e.m17523a(C1299i.f4094b)).booleanValue() == null && C1215b.m4983a(this.f14574d, byteBuffer) == ImageType.GIF) ? true : null;
    }

    /* renamed from: a */
    public C4525e m17887a(ByteBuffer byteBuffer, int i, int i2, C3452e c3452e) {
        C1132d a = this.f14575e.m5227a(byteBuffer);
        try {
            byteBuffer = m17885a(byteBuffer, i, i2, a, c3452e);
            return byteBuffer;
        } finally {
            this.f14575e.m5228a(a);
        }
    }

    /* renamed from: a */
    private C4525e m17885a(ByteBuffer byteBuffer, int i, int i2, C1132d c1132d, C3452e c3452e) {
        C3534a c3534a = this;
        long a = C1174e.m4866a();
        StringBuilder stringBuilder;
        try {
            C1131c b = c1132d.m4730b();
            if (b.m4711c() > 0) {
                if (b.m4712d() == 0) {
                    Config config = c3452e.m17523a(C1299i.f4093a) == DecodeFormat.PREFER_RGB_565 ? Config.RGB_565 : Config.ARGB_8888;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    C1129a a2 = c3534a.f14576f.m5226a(c3534a.f14577g, b, byteBuffer, C3534a.m17884a(b, i, i2));
                    a2.mo933a(config);
                    a2.mo934b();
                    Bitmap h = a2.mo940h();
                    if (h == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Decoded GIF from stream in ");
                            stringBuilder.append(C1174e.m4865a(a));
                            Log.v("BufferGifDecoder", stringBuilder.toString());
                        }
                        return null;
                    }
                    C4525e c4525e = new C4525e(new C3536c(c3534a.f14573c, a2, C4517b.m24962a(), i, i2, h));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Decoded GIF from stream in ");
                        stringBuilder.append(C1174e.m4865a(a));
                        Log.v("BufferGifDecoder", stringBuilder.toString());
                    }
                    return c4525e;
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Decoded GIF from stream in ");
                stringBuilder.append(C1174e.m4865a(a));
                Log.v("BufferGifDecoder", stringBuilder.toString());
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Decoded GIF from stream in ");
                stringBuilder.append(C1174e.m4865a(a));
                Log.v("BufferGifDecoder", stringBuilder.toString());
            }
        }
    }

    /* renamed from: a */
    private static int m17884a(C1131c c1131c, int i, int i2) {
        int min = Math.min(c1131c.m4709a() / i2, c1131c.m4710b() / i);
        if (min == 0) {
            min = 0;
        } else {
            min = Integer.highestOneBit(min);
        }
        min = Math.max(1, min);
        if (Log.isLoggable("BufferGifDecoder", 2) && min > 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Downsampling GIF, sampleSize: ");
            stringBuilder.append(min);
            stringBuilder.append(", target dimens: [");
            stringBuilder.append(i);
            stringBuilder.append("x");
            stringBuilder.append(i2);
            stringBuilder.append("], actual dimens: [");
            stringBuilder.append(c1131c.m4710b());
            stringBuilder.append("x");
            stringBuilder.append(c1131c.m4709a());
            stringBuilder.append("]");
            Log.v("BufferGifDecoder", stringBuilder.toString());
        }
        return min;
    }
}
