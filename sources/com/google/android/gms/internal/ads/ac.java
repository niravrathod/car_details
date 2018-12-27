package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.util.PlatformVersion;
import java.io.InputStream;

final class ac implements zzanf<zzpa> {
    /* renamed from: a */
    private final /* synthetic */ boolean f16400a;
    /* renamed from: b */
    private final /* synthetic */ double f16401b;
    /* renamed from: c */
    private final /* synthetic */ boolean f16402c;
    /* renamed from: d */
    private final /* synthetic */ String f16403d;
    /* renamed from: e */
    private final /* synthetic */ zzadd f16404e;

    ac(zzadd zzadd, boolean z, double d, boolean z2, String str) {
        this.f16404e = zzadd;
        this.f16400a = z;
        this.f16401b = d;
        this.f16402c = z2;
        this.f16403d = str;
    }

    @TargetApi(19)
    /* renamed from: b */
    private final zzpa m20420b(InputStream inputStream) {
        Options options = new Options();
        options.inDensity = (int) (this.f16401b * 160.0d);
        if (!this.f16402c) {
            options.inPreferredConfig = Config.RGB_565;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            inputStream = BitmapFactory.decodeStream(inputStream, null, options);
        } catch (InputStream inputStream2) {
            zzaok.m10002b("Error grabbing image.", inputStream2);
            inputStream2 = null;
        }
        if (inputStream2 == null) {
            this.f16404e.m9482a(2, this.f16400a);
            return null;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (PlatformVersion.isAtLeastKitKat() && zzalg.m21226a()) {
            int width = inputStream2.getWidth();
            int height = inputStream2.getHeight();
            int allocationByteCount = inputStream2.getAllocationByteCount();
            uptimeMillis2 -= uptimeMillis;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder stringBuilder = new StringBuilder(108);
            stringBuilder.append("Decoded image w: ");
            stringBuilder.append(width);
            stringBuilder.append(" h:");
            stringBuilder.append(height);
            stringBuilder.append(" bytes: ");
            stringBuilder.append(allocationByteCount);
            stringBuilder.append(" time: ");
            stringBuilder.append(uptimeMillis2);
            stringBuilder.append(" on ui thread: ");
            stringBuilder.append(z);
            zzalg.m21225a(stringBuilder.toString());
        }
        return new zzpa(new BitmapDrawable(Resources.getSystem(), inputStream2), Uri.parse(this.f16403d), this.f16401b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo1933a() {
        this.f16404e.m9482a(2, this.f16400a);
        return null;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final /* synthetic */ Object mo1934a(InputStream inputStream) {
        return m20420b(inputStream);
    }
}
