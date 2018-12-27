package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.p060a.C1230b;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        private ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    /* renamed from: a */
    int mo1059a(InputStream inputStream, C1230b c1230b);

    /* renamed from: a */
    ImageType mo1060a(InputStream inputStream);

    /* renamed from: a */
    ImageType mo1061a(ByteBuffer byteBuffer);
}
