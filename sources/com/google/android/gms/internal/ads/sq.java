package com.google.android.gms.internal.ads;

import android.text.TextUtils;

final class sq extends zzod {
    sq() {
    }

    /* renamed from: a */
    public final String mo2172a(String str, String str2) {
        str = m20990a(str);
        str2 = m20990a(str2);
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(",");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m20990a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int i = 0;
        int length = str.length();
        while (i < str.length() && str.charAt(i) == ',') {
            i++;
        }
        while (length > 0 && str.charAt(length - 1) == ',') {
            length--;
        }
        if (length < i) {
            return null;
        }
        if (i == 0 && length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }
}
