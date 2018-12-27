package com.crashlytics.android.answers;

import io.fabric.sdk.android.C2766c;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.crashlytics.android.answers.b */
class C1322b {
    /* renamed from: a */
    final int f4171a;
    /* renamed from: b */
    final int f4172b;
    /* renamed from: c */
    boolean f4173c;

    public C1322b(int i, int i2, boolean z) {
        this.f4171a = i;
        this.f4172b = i2;
        this.f4173c = z;
    }

    /* renamed from: a */
    public String m5373a(String str) {
        if (str.length() <= this.f4172b) {
            return str;
        }
        m5372a(new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[]{Integer.valueOf(this.f4172b)})));
        return str.substring(0, this.f4172b);
    }

    /* renamed from: a */
    public boolean m5374a(Object obj, String str) {
        if (obj != null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" must not be null");
        m5372a(new NullPointerException(stringBuilder.toString()));
        return true;
    }

    /* renamed from: a */
    public boolean m5375a(Map<String, Object> map, String str) {
        if (map.size() < this.f4171a || map.containsKey(str) != null) {
            return false;
        }
        m5372a(new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[]{Integer.valueOf(this.f4171a)})));
        return true;
    }

    /* renamed from: a */
    private void m5372a(RuntimeException runtimeException) {
        if (this.f4173c) {
            throw runtimeException;
        }
        C2766c.m13524h().mo3562e(Answers.TAG, "Invalid user input detected", runtimeException);
    }
}
