package com.bumptech.glide.load.resource.p065d;

import android.util.Log;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.C3499g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.p055g.C1171a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.d.d */
public class C4524d implements C3499g<C3536c> {
    /* renamed from: a */
    public EncodeStrategy mo3904a(C3452e c3452e) {
        return EncodeStrategy.SOURCE;
    }

    /* renamed from: a */
    public boolean m24980a(C1277s<C3536c> c1277s, File file, C3452e c3452e) {
        try {
            C1171a.m4855a(((C3536c) c1277s.mo1046d()).m17905c(), file);
            return true;
        } catch (C1277s<C3536c> c1277s2) {
            if (Log.isLoggable("GifEncoder", 5) != null) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", c1277s2);
            }
            return null;
        }
    }
}
