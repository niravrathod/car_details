package com.crashlytics.android.answers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.answers.a */
class C1321a {
    /* renamed from: a */
    final C1322b f4169a;
    /* renamed from: b */
    final Map<String, Object> f4170b = new ConcurrentHashMap();

    public C1321a(C1322b c1322b) {
        this.f4169a = c1322b;
    }

    /* renamed from: a */
    void m5371a(String str, String str2) {
        if (!this.f4169a.m5374a((Object) str, "key")) {
            if (!this.f4169a.m5374a((Object) str2, "value")) {
                m5370a(this.f4169a.m5373a(str), this.f4169a.m5373a(str2));
            }
        }
    }

    /* renamed from: a */
    void m5369a(String str, Number number) {
        if (!this.f4169a.m5374a((Object) str, "key")) {
            if (!this.f4169a.m5374a((Object) number, "value")) {
                m5370a(this.f4169a.m5373a(str), (Object) number);
            }
        }
    }

    /* renamed from: a */
    void m5370a(String str, Object obj) {
        if (!this.f4169a.m5375a(this.f4170b, str)) {
            this.f4170b.put(str, obj);
        }
    }

    public String toString() {
        return new JSONObject(this.f4170b).toString();
    }
}
