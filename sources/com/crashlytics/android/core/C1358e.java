package com.crashlytics.android.core;

import android.os.Process;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.crashlytics.android.core.e */
class C1358e {
    /* renamed from: a */
    private static final AtomicLong f4268a = new AtomicLong(0);
    /* renamed from: b */
    private static String f4269b;

    public C1358e(IdManager idManager) {
        r0 = new byte[10];
        m5538a(r0);
        m5540b(r0);
        m5542c(r0);
        idManager = CommonUtils.m13604a(idManager.m13649b());
        String a = CommonUtils.m13606a(r0);
        f4269b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a.substring(0, 12), a.substring(12, 16), a.subSequence(16, 20), idManager.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private void m5538a(byte[] bArr) {
        long time = new Date().getTime();
        long j = time / 1000;
        time %= 1000;
        byte[] a = C1358e.m5539a(j);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = C1358e.m5541b(time);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    /* renamed from: b */
    private void m5540b(byte[] bArr) {
        byte[] b = C1358e.m5541b(f4268a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: c */
    private void m5542c(byte[] bArr) {
        byte[] b = C1358e.m5541b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: a */
    private static byte[] m5539a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m5541b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f4269b;
    }
}
