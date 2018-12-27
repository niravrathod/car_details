package com.facebook.ads.internal.p101q.p102a;

import java.util.Set;

/* renamed from: com.facebook.ads.internal.q.a.u */
public class C1934u {
    /* renamed from: a */
    public static String m7322a(Set<String> set, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String append : set) {
            stringBuilder.append(append);
            stringBuilder.append(str);
        }
        return stringBuilder.length() > 0 ? stringBuilder.substring(0, stringBuilder.length() - 1) : "";
    }
}
