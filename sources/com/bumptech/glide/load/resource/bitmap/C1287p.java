package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import com.bumptech.glide.load.DecodeFormat;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.p */
final class C1287p {
    /* renamed from: a */
    private static final File f4065a = new File("/proc/self/fd");
    /* renamed from: d */
    private static volatile C1287p f4066d;
    /* renamed from: b */
    private volatile int f4067b;
    /* renamed from: c */
    private volatile boolean f4068c = true;

    /* renamed from: a */
    static C1287p m5205a() {
        if (f4066d == null) {
            synchronized (C1287p.class) {
                if (f4066d == null) {
                    f4066d = new C1287p();
                }
            }
        }
        return f4066d;
    }

    private C1287p() {
    }

    @TargetApi(26)
    /* renamed from: a */
    boolean m5207a(int i, int i2, Options options, DecodeFormat decodeFormat, boolean z, boolean z2) {
        if (z && VERSION.SDK_INT >= true) {
            if (!z2) {
                i = (i < 128 || i2 < 128 || m5206b() == 0) ? 0 : 1;
                if (i != 0) {
                    options.inPreferredConfig = Config.HARDWARE;
                    options.inMutable = false;
                }
                return i;
            }
        }
        return false;
    }

    /* renamed from: b */
    private synchronized boolean m5206b() {
        int i = this.f4067b + 1;
        this.f4067b = i;
        if (i >= 50) {
            boolean z = false;
            this.f4067b = 0;
            int length = f4065a.list().length;
            if (length < 700) {
                z = true;
            }
            this.f4068c = z;
            if (!this.f4068c && Log.isLoggable("Downsampler", 5)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                stringBuilder.append(length);
                stringBuilder.append(", limit ");
                stringBuilder.append(700);
                Log.w("Downsampler", stringBuilder.toString());
            }
        }
        return this.f4068c;
    }
}
