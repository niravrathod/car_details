package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

final class ck implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f7958a;
    /* renamed from: b */
    private final /* synthetic */ zzajn f7959b;

    ck(zzajn zzajn, Bitmap bitmap) {
        this.f7959b = zzajn;
        this.f7958a = bitmap;
    }

    public final void run() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f7958a.compress(CompressFormat.PNG, 0, byteArrayOutputStream);
        synchronized (this.f7959b.f16831l) {
            this.f7959b.f16822c.f20074g = new zzbhs();
            this.f7959b.f16822c.f20074g.f20103c = byteArrayOutputStream.toByteArray();
            this.f7959b.f16822c.f20074g.f20102b = "image/png";
            this.f7959b.f16822c.f20074g.f20101a = Integer.valueOf(1);
        }
    }
}
