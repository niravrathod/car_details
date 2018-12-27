package com.bumptech.glide.load.engine.p061b;

import android.content.Context;
import com.bumptech.glide.load.engine.p061b.C3469d.C1246a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.f */
public final class C4515f extends C3469d {

    /* renamed from: com.bumptech.glide.load.engine.b.f$1 */
    class C34711 implements C1246a {
        /* renamed from: a */
        final /* synthetic */ Context f14434a;
        /* renamed from: b */
        final /* synthetic */ String f14435b;

        C34711(Context context, String str) {
            this.f14434a = context;
            this.f14435b = str;
        }

        /* renamed from: a */
        public File mo1021a() {
            File cacheDir = this.f14434a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f14435b != null ? new File(cacheDir, this.f14435b) : cacheDir;
        }
    }

    public C4515f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C4515f(Context context, String str, long j) {
        super(new C34711(context, str), j);
    }
}
