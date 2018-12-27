package com.crashlytics.android.core;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2808o;
import io.fabric.sdk.android.services.common.C2808o.C2807c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.io.InputStream;
import java.util.Locale;

class QueueFileLogStore implements C1398u {
    /* renamed from: a */
    private final File f14679a;
    /* renamed from: b */
    private final int f14680b;
    /* renamed from: c */
    private C2808o f14681c;

    public class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public QueueFileLogStore(File file, int i) {
        this.f14679a = file;
        this.f14680b = i;
    }

    /* renamed from: a */
    public void mo1123a(long j, String str) {
        m18090f();
        m18088b(j, str);
    }

    /* renamed from: a */
    public C1357d mo1122a() {
        LogBytes e = m18089e();
        if (e == null) {
            return null;
        }
        return C1357d.m5534a(e.bytes, 0, e.offset);
    }

    /* renamed from: b */
    public byte[] mo1124b() {
        LogBytes e = m18089e();
        if (e == null) {
            return null;
        }
        return e.bytes;
    }

    /* renamed from: e */
    private LogBytes m18089e() {
        if (!this.f14679a.exists()) {
            return null;
        }
        m18090f();
        if (this.f14681c == null) {
            return null;
        }
        final int[] iArr = new int[]{0};
        final byte[] bArr = new byte[this.f14681c.m13717a()];
        try {
            this.f14681c.m13718a(new C2807c(this) {
                /* renamed from: c */
                final /* synthetic */ QueueFileLogStore f14678c;

                /* renamed from: a */
                public void mo1127a(InputStream inputStream, int i) {
                    try {
                        inputStream.read(bArr, iArr[0], i);
                        int[] iArr = iArr;
                        iArr[0] = iArr[0] + i;
                    } finally {
                        inputStream.close();
                    }
                }
            });
        } catch (Throwable e) {
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    /* renamed from: c */
    public void mo1125c() {
        CommonUtils.m13613a(this.f14681c, "There was a problem closing the Crashlytics log file.");
        this.f14681c = null;
    }

    /* renamed from: d */
    public void mo1126d() {
        mo1125c();
        this.f14679a.delete();
    }

    /* renamed from: f */
    private void m18090f() {
        if (this.f14681c == null) {
            try {
                this.f14681c = new C2808o(this.f14679a);
            } catch (Throwable e) {
                C2774k h = C2766c.m13524h();
                String str = CrashlyticsCore.TAG;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not open log file: ");
                stringBuilder.append(this.f14679a);
                h.mo3562e(str, stringBuilder.toString(), e);
            }
        }
    }

    /* renamed from: b */
    private void m18088b(long j, String str) {
        if (this.f14681c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f14680b / 4;
                if (str.length() > i) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("...");
                    stringBuilder.append(str.substring(str.length() - i));
                    str = stringBuilder.toString();
                }
                str = str.replaceAll("\r", " ").replaceAll("\n", " ");
                this.f14681c.m13719a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str}).getBytes("UTF-8"));
                while (this.f14681c.m13722b() == null && this.f14681c.m13717a() > this.f14680b) {
                    this.f14681c.m13723c();
                }
            } catch (long j2) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "There was a problem writing to the Crashlytics log.", j2);
            }
        }
    }
}
