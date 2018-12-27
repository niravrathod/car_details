package com.google.android.exoplayer2.text.p134d;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.d.d */
final class C2346d {
    /* renamed from: a */
    public static C2347e m8560a(C2347e c2347e, String[] strArr, Map<String, C2347e> map) {
        if (c2347e == null && strArr == null) {
            return null;
        }
        int i = 0;
        if (c2347e == null && strArr.length == 1) {
            return (C2347e) map.get(strArr[0]);
        }
        int length;
        if (c2347e == null && strArr.length > 1) {
            c2347e = new C2347e();
            length = strArr.length;
            while (i < length) {
                c2347e.m8569a((C2347e) map.get(strArr[i]));
                i++;
            }
            return c2347e;
        } else if (c2347e != null && strArr != null && strArr.length == 1) {
            return c2347e.m8569a((C2347e) map.get(strArr[0]));
        } else {
            if (c2347e == null || strArr == null || strArr.length <= 1) {
                return c2347e;
            }
            length = strArr.length;
            while (i < length) {
                c2347e.m8569a((C2347e) map.get(strArr[i]));
                i++;
            }
            return c2347e;
        }
    }

    /* renamed from: a */
    public static void m8563a(SpannableStringBuilder spannableStringBuilder, int i, int i2, C2347e c2347e) {
        if (c2347e.m8565a() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(c2347e.m8565a()), i, i2, 33);
        }
        if (c2347e.m8575b()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (c2347e.m8578c()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (c2347e.m8582f()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(c2347e.m8581e()), i, i2, 33);
        }
        if (c2347e.m8584h()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(c2347e.m8583g()), i, i2, 33);
        }
        if (c2347e.m8580d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(c2347e.m8580d()), i, i2, 33);
        }
        if (c2347e.m8586j() != null) {
            spannableStringBuilder.setSpan(new Standard(c2347e.m8586j()), i, i2, 33);
        }
        switch (c2347e.m8587k()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c2347e.m8588l(), true), i, i2, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(c2347e.m8588l()), i, i2, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(c2347e.m8588l() / 100.0f), i, i2, 33);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    static void m8562a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    /* renamed from: a */
    static String m8561a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }
}
