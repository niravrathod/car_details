package com.bumptech.glide.load.resource.bitmap;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.resource.bitmap.n */
public final class C3521n implements ImageHeaderParser {
    /* renamed from: a */
    public ImageType mo1060a(InputStream inputStream) {
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public ImageType mo1061a(ByteBuffer byteBuffer) {
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public int mo1059a(InputStream inputStream, C1230b c1230b) {
        inputStream = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        return inputStream == null ? -1 : inputStream;
    }
}
