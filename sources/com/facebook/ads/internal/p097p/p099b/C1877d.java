package com.facebook.ads.internal.p097p.p099b;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.internal.p.b.d */
class C1877d {
    /* renamed from: d */
    private static final Pattern f5713d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
    /* renamed from: e */
    private static final Pattern f5714e = Pattern.compile("GET /(.*) HTTP");
    /* renamed from: a */
    public final String f5715a;
    /* renamed from: b */
    public final long f5716b;
    /* renamed from: c */
    public final boolean f5717c;

    public C1877d(String str) {
        C1886j.m7191a(str);
        long a = m7156a(str);
        this.f5716b = Math.max(0, a);
        this.f5717c = a >= 0;
        this.f5715a = m7158b(str);
    }

    /* renamed from: a */
    private long m7156a(String str) {
        Matcher matcher = f5713d.matcher(str);
        return matcher.find() ? Long.parseLong(matcher.group(1)) : -1;
    }

    /* renamed from: a */
    public static C1877d m7157a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            Object readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new C1877d(stringBuilder.toString());
            }
            stringBuilder.append(readLine);
            stringBuilder.append('\n');
        }
    }

    /* renamed from: b */
    private String m7158b(String str) {
        Matcher matcher = f5714e.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid request `");
        stringBuilder.append(str);
        stringBuilder.append("`: url not found!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GetRequest{rangeOffset=");
        stringBuilder.append(this.f5716b);
        stringBuilder.append(", partial=");
        stringBuilder.append(this.f5717c);
        stringBuilder.append(", uri='");
        stringBuilder.append(this.f5715a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
