package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.gson.internal.e */
public class C2650e {
    /* renamed from: a */
    public static DateFormat m12949a(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C2650e.m12948a(i));
        stringBuilder.append(" ");
        stringBuilder.append(C2650e.m12950b(i2));
        return new SimpleDateFormat(stringBuilder.toString(), Locale.US);
    }

    /* renamed from: a */
    private static String m12948a(int i) {
        switch (i) {
            case 0:
                return "EEEE, MMMM d, yyyy";
            case 1:
                return "MMMM d, yyyy";
            case 2:
                return "MMM d, yyyy";
            case 3:
                return "M/d/yy";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private static String m12950b(int i) {
        switch (i) {
            case 0:
            case 1:
                return "h:mm:ss a z";
            case 2:
                return "h:mm:ss a";
            case 3:
                return "h:mm a";
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(i);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
