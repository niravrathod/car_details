package com.facebook.ads.internal.p097p.p099b.p100a;

import android.text.TextUtils;
import com.facebook.ads.internal.p097p.p099b.C1891m;

/* renamed from: com.facebook.ads.internal.p.b.a.f */
public class C3822f implements C1869c {
    /* renamed from: b */
    private String m19075b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
    }

    /* renamed from: a */
    public String mo1399a(String str) {
        Object b = m19075b(str);
        str = C1891m.m7214d(str);
        if (TextUtils.isEmpty(b)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(".");
        stringBuilder.append(b);
        return stringBuilder.toString();
    }
}
