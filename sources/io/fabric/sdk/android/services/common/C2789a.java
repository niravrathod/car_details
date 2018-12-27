package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: io.fabric.sdk.android.services.common.a */
public abstract class C2789a {
    /* renamed from: b */
    private static final Pattern f11882b = Pattern.compile("http(s?)://[^\\/]+", 2);
    /* renamed from: a */
    protected final C2771h f11883a;
    /* renamed from: c */
    private final String f11884c;
    /* renamed from: d */
    private final C2834c f11885d;
    /* renamed from: e */
    private final HttpMethod f11886e;
    /* renamed from: f */
    private final String f11887f;

    public C2789a(C2771h c2771h, String str, String str2, C2834c c2834c, HttpMethod httpMethod) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (c2834c != null) {
            this.f11883a = c2771h;
            this.f11887f = str;
            this.f11884c = m13660a(str2);
            this.f11885d = c2834c;
            this.f11886e = httpMethod;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    /* renamed from: a */
    protected String m13662a() {
        return this.f11884c;
    }

    /* renamed from: b */
    protected HttpRequest m13663b() {
        return m13661a(Collections.emptyMap());
    }

    /* renamed from: a */
    protected HttpRequest m13661a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Android SDK/");
        stringBuilder.append(this.f11883a.getVersion());
        return this.f11885d.mo3592a(this.f11886e, m13662a(), map).m13804a(false).m13794a(10000).m13797a("User-Agent", stringBuilder.toString()).m13797a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: a */
    private String m13660a(String str) {
        return !CommonUtils.m13628d(this.f11887f) ? f11882b.matcher(str).replaceFirst(this.f11887f) : str;
    }
}
