package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

final class bo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ OutputStream f7926a;
    /* renamed from: b */
    private final /* synthetic */ byte[] f7927b;

    bo(zzagf zzagf, OutputStream outputStream, byte[] bArr) {
        this.f7926a = outputStream;
        this.f7927b = bArr;
    }

    public final void run() {
        Closeable dataOutputStream;
        Throwable e;
        Throwable th;
        try {
            dataOutputStream = new DataOutputStream(this.f7926a);
            try {
                dataOutputStream.writeInt(this.f7927b.length);
                dataOutputStream.write(this.f7927b);
                IOUtils.closeQuietly(dataOutputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    zzaok.m10002b("Error transporting the ad response", e);
                    zzbv.zzeo().m9714a(e, "LargeParcelTeleporter.pipeData.1");
                    if (dataOutputStream != null) {
                        IOUtils.closeQuietly(this.f7926a);
                    } else {
                        IOUtils.closeQuietly(dataOutputStream);
                    }
                } catch (Throwable th2) {
                    e = th2;
                    if (dataOutputStream != null) {
                        IOUtils.closeQuietly(this.f7926a);
                    } else {
                        IOUtils.closeQuietly(dataOutputStream);
                    }
                    throw e;
                }
            }
        } catch (Throwable e3) {
            th = e3;
            dataOutputStream = null;
            e = th;
            zzaok.m10002b("Error transporting the ad response", e);
            zzbv.zzeo().m9714a(e, "LargeParcelTeleporter.pipeData.1");
            if (dataOutputStream != null) {
                IOUtils.closeQuietly(dataOutputStream);
            } else {
                IOUtils.closeQuietly(this.f7926a);
            }
        } catch (Throwable e32) {
            th = e32;
            dataOutputStream = null;
            e = th;
            if (dataOutputStream != null) {
                IOUtils.closeQuietly(dataOutputStream);
            } else {
                IOUtils.closeQuietly(this.f7926a);
            }
            throw e;
        }
    }
}
