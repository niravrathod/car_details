package com.google.android.gms.internal.ads;

import android.text.TextUtils;

public final class zzl {
    /* renamed from: a */
    private final String f9585a;
    /* renamed from: b */
    private final String f9586b;

    public zzl(String str, String str2) {
        this.f9585a = str;
        this.f9586b = str2;
    }

    /* renamed from: a */
    public final String m10728a() {
        return this.f9585a;
    }

    /* renamed from: b */
    public final String m10729b() {
        return this.f9586b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                zzl zzl = (zzl) obj;
                return TextUtils.equals(this.f9585a, zzl.f9585a) && TextUtils.equals(this.f9586b, zzl.f9586b) != null;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9585a.hashCode() * 31) + this.f9586b.hashCode();
    }

    public final String toString() {
        String str = this.f9585a;
        String str2 = this.f9586b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 20) + String.valueOf(str2).length());
        stringBuilder.append("Header[name=");
        stringBuilder.append(str);
        stringBuilder.append(",value=");
        stringBuilder.append(str2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
