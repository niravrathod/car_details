package com.airbnb.lottie;

import java.util.Map;

/* renamed from: com.airbnb.lottie.o */
public class C1001o {
    /* renamed from: a */
    private final Map<String, String> f3370a;
    /* renamed from: b */
    private boolean f3371b;

    /* renamed from: b */
    private String m4317b(String str) {
        return str;
    }

    /* renamed from: a */
    public final String m4318a(String str) {
        if (this.f3371b && this.f3370a.containsKey(str)) {
            return (String) this.f3370a.get(str);
        }
        String b = m4317b(str);
        if (this.f3371b) {
            this.f3370a.put(str, b);
        }
        return b;
    }
}
