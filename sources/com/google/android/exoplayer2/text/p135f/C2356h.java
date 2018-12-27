package com.google.android.exoplayer2.text.p135f;

import com.google.android.exoplayer2.p126c.C2175k;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.f.h */
public final class C2356h {
    /* renamed from: a */
    private static final Pattern f7494a = Pattern.compile("^NOTE(( |\t).*)?$");
    /* renamed from: b */
    private static final Pattern f7495b = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static void m8662a(C2175k c2175k) {
        c2175k = c2175k.m8004y();
        if (c2175k == null || !f7495b.matcher(c2175k).matches()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected WEBVTT. Got ");
            stringBuilder.append(c2175k);
            throw new SubtitleDecoderException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static long m8661a(String str) {
        str = str.split("\\.", 2);
        int i = 0;
        String[] split = str[0].split(":");
        long j = 0;
        while (i < split.length) {
            j = (j * 60) + Long.parseLong(split[i]);
            i++;
        }
        return ((j * 1000) + Long.parseLong(str[1])) * 1000;
    }

    /* renamed from: b */
    public static float m8663b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
}
