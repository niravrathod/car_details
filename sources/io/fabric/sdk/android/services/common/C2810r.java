package io.fabric.sdk.android.services.common;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: io.fabric.sdk.android.services.common.r */
public class C2810r {
    /* renamed from: a */
    private final String f11914a;
    /* renamed from: b */
    private final String f11915b;
    /* renamed from: c */
    private final boolean f11916c;
    /* renamed from: d */
    private long f11917d;
    /* renamed from: e */
    private long f11918e;

    public C2810r(String str, String str2) {
        this.f11914a = str;
        this.f11915b = str2;
        this.f11916c = Log.isLoggable(str2, 2) ^ 1;
    }

    /* renamed from: a */
    public synchronized void m13727a() {
        if (!this.f11916c) {
            this.f11917d = SystemClock.elapsedRealtime();
            this.f11918e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void m13728b() {
        if (!this.f11916c) {
            if (this.f11918e == 0) {
                this.f11918e = SystemClock.elapsedRealtime() - this.f11917d;
                m13726c();
            }
        }
    }

    /* renamed from: c */
    private void m13726c() {
        String str = this.f11915b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f11914a);
        stringBuilder.append(": ");
        stringBuilder.append(this.f11918e);
        stringBuilder.append("ms");
        Log.v(str, stringBuilder.toString());
    }
}
