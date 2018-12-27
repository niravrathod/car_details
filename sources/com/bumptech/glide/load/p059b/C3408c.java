package com.bumptech.glide.load.p059b;

import android.util.Log;
import com.bumptech.glide.load.C1194a;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.p055g.C1171a;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.b.c */
public class C3408c implements C1194a<ByteBuffer> {
    /* renamed from: a */
    public boolean m17395a(ByteBuffer byteBuffer, File file, C3452e c3452e) {
        try {
            C1171a.m4855a(byteBuffer, file);
            return true;
        } catch (ByteBuffer byteBuffer2) {
            if (Log.isLoggable("ByteBufferEncoder", 3) != null) {
                Log.d("ByteBufferEncoder", "Failed to write data", byteBuffer2);
            }
            return null;
        }
    }
}
