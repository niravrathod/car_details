package com.bumptech.glide.request.p067a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.bumptech.glide.request.a.e */
public class C1303e {
    /* renamed from: a */
    public <Z> C4786i<ImageView, Z> m5256a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C4872b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C4873c(imageView);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unhandled class: ");
        stringBuilder.append(cls);
        stringBuilder.append(", try .as*(Class).transcode(ResourceTranscoder)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
