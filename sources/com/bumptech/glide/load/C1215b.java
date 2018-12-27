package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p060a.C1230b;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.b */
public final class C1215b {
    /* renamed from: a */
    public static ImageType m4982a(List<ImageHeaderParser> list, InputStream inputStream, C1230b c1230b) {
        if (inputStream == null) {
            return ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, c1230b);
        }
        inputStream.mark(5242880);
        c1230b = null;
        int size = list.size();
        while (c1230b < size) {
            try {
                ImageType a = ((ImageHeaderParser) list.get(c1230b)).mo1060a(inputStream);
                if (a != ImageType.UNKNOWN) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                c1230b++;
            } catch (List<ImageHeaderParser> list2) {
                inputStream.reset();
                throw list2;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public static ImageType m4983a(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageType a = ((ImageHeaderParser) list.get(i)).mo1061a(byteBuffer);
            if (a != ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageType.UNKNOWN;
    }

    /* renamed from: b */
    public static int m4984b(List<ImageHeaderParser> list, InputStream inputStream, C1230b c1230b) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, c1230b);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int a = ((ImageHeaderParser) list.get(i)).mo1059a(inputStream, c1230b);
                if (a != -1) {
                    inputStream.reset();
                    return a;
                }
                inputStream.reset();
                i++;
            } catch (List<ImageHeaderParser> list2) {
                inputStream.reset();
                throw list2;
            }
        }
        return -1;
    }
}
