package com.facebook.ads.internal.p101q.p103b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.ads.internal.q.b.c */
public class C1941c {
    /* renamed from: a */
    private static int m7339a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            i3 /= 2;
            i4 /= 2;
            while (i3 / i5 >= i2 && i4 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m7340a(C1940b c1940b) {
        byte[] decode = Base64.decode(c1940b.m7338a(C1936w.f5934b), 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: a */
    public static Bitmap m7341a(InputStream inputStream, int i, int i2) {
        InputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(8192);
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(bufferedInputStream, null, options);
        try {
            bufferedInputStream.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        options.inSampleSize = C1941c.m7339a(options, i2, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(bufferedInputStream, null, options);
    }

    /* renamed from: a */
    public static Bitmap m7342a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = C1941c.m7339a(options, i2, i);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static Drawable m7343a(Context context, C1940b c1940b) {
        return new BitmapDrawable(context.getResources(), C1941c.m7340a(c1940b));
    }
}
