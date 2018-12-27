package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;

@VisibleForTesting
final class qo {
    @VisibleForTesting
    /* renamed from: a */
    private ByteArrayOutputStream f8357a = new ByteArrayOutputStream(4096);
    @VisibleForTesting
    /* renamed from: b */
    private Base64OutputStream f8358b = new Base64OutputStream(this.f8357a, 10);

    /* renamed from: a */
    public final void m9367a(byte[] bArr) {
        this.f8358b.write(bArr);
    }

    public final String toString() {
        String byteArrayOutputStream;
        try {
            this.f8358b.close();
        } catch (Throwable e) {
            zzaok.m10002b("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f8357a.close();
            byteArrayOutputStream = this.f8357a.toString();
            return byteArrayOutputStream;
        } catch (Throwable e2) {
            zzaok.m10002b("HashManager: Unable to convert to Base64.", e2);
            byteArrayOutputStream = "";
            return byteArrayOutputStream;
        } finally {
            this.f8357a = null;
            this.f8358b = null;
        }
    }
}
