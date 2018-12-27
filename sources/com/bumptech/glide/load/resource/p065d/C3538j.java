package com.bumptech.glide.load.resource.p065d;

import android.util.Log;
import com.bumptech.glide.load.C1215b;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.d.j */
public class C3538j implements C1280f<InputStream, C3536c> {
    /* renamed from: a */
    private final List<ImageHeaderParser> f14591a;
    /* renamed from: b */
    private final C1280f<ByteBuffer, C3536c> f14592b;
    /* renamed from: c */
    private final C1230b f14593c;

    public C3538j(List<ImageHeaderParser> list, C1280f<ByteBuffer, C3536c> c1280f, C1230b c1230b) {
        this.f14591a = list;
        this.f14592b = c1280f;
        this.f14593c = c1230b;
    }

    /* renamed from: a */
    public boolean m17917a(InputStream inputStream, C3452e c3452e) {
        return (((Boolean) c3452e.m17523a(C1299i.f4094b)).booleanValue() == null && C1215b.m4982a(this.f14591a, inputStream, this.f14593c) == ImageType.GIF) ? true : null;
    }

    /* renamed from: a */
    public C1277s<C3536c> m17915a(InputStream inputStream, int i, int i2, C3452e c3452e) {
        inputStream = C3538j.m17914a(inputStream);
        if (inputStream == null) {
            return null;
        }
        return this.f14592b.mo1050a(ByteBuffer.wrap(inputStream), i, i2, c3452e);
    }

    /* renamed from: a */
    private static byte[] m17914a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (InputStream inputStream2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", inputStream2);
            }
            return null;
        }
    }
}
