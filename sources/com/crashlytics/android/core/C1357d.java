package com.crashlytics.android.core;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.crashlytics.android.core.d */
final class C1357d {
    /* renamed from: a */
    public static final C1357d f4265a = new C1357d(new byte[0]);
    /* renamed from: b */
    private final byte[] f4266b;
    /* renamed from: c */
    private volatile int f4267c = 0;

    private C1357d(byte[] bArr) {
        this.f4266b = bArr;
    }

    /* renamed from: a */
    public int m5535a() {
        return this.f4266b.length;
    }

    /* renamed from: a */
    public static C1357d m5534a(byte[] bArr, int i, int i2) {
        Object obj = new byte[i2];
        System.arraycopy(bArr, i, obj, 0, i2);
        return new C1357d(obj);
    }

    /* renamed from: a */
    public static C1357d m5533a(String str) {
        try {
            return new C1357d(str.getBytes("UTF-8"));
        } catch (String str2) {
            throw new RuntimeException("UTF-8 not supported.", str2);
        }
    }

    /* renamed from: a */
    public void m5536a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f4266b, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1357d)) {
            return false;
        }
        C1357d c1357d = (C1357d) obj;
        int length = this.f4266b.length;
        if (length != c1357d.f4266b.length) {
            return false;
        }
        byte[] bArr = this.f4266b;
        obj = c1357d.f4266b;
        for (int i = 0; i < length; i++) {
            if (bArr[i] != obj[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.f4267c;
        if (i == 0) {
            byte[] bArr = this.f4266b;
            int length = this.f4266b.length;
            int i2 = length;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = (i2 * 31) + bArr[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f4267c = i;
        }
        return i;
    }

    /* renamed from: b */
    public InputStream m5537b() {
        return new ByteArrayInputStream(this.f4266b);
    }
}
