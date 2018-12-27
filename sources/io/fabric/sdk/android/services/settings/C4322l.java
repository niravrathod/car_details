package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2774k;
import io.fabric.sdk.android.services.common.C2789a;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequest.HttpRequestException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.l */
class C4322l extends C2789a implements C2857w {
    /* renamed from: a */
    boolean m23699a(int i) {
        if (!(i == 200 || i == 201 || i == 202)) {
            if (i != 203) {
                return false;
            }
        }
        return true;
    }

    public C4322l(C2771h c2771h, String str, String str2, C2834c c2834c) {
        this(c2771h, str, str2, c2834c, HttpMethod.GET);
    }

    C4322l(C2771h c2771h, String str, String str2, C2834c c2834c, HttpMethod httpMethod) {
        super(c2771h, str, str2, c2834c, httpMethod);
    }

    /* renamed from: a */
    public JSONObject mo3599a(C2856v c2856v) {
        StringBuilder stringBuilder;
        Throwable e;
        Throwable th;
        C2774k h;
        StringBuilder stringBuilder2;
        try {
            Map b = m23696b(c2856v);
            HttpRequest a = m13661a(b);
            try {
                c2856v = m23693a(a, c2856v);
                try {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Requesting settings from ");
                    stringBuilder3.append(m13662a());
                    C2766c.m13524h().mo3554a("Fabric", stringBuilder3.toString());
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Settings query params were: ");
                    stringBuilder3.append(b);
                    C2766c.m13524h().mo3554a("Fabric", stringBuilder3.toString());
                    JSONObject a2 = m23697a((HttpRequest) c2856v);
                    if (c2856v != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Settings request ID: ");
                        stringBuilder.append(c2856v.m13809b("X-REQUEST-ID"));
                        C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
                    }
                    return a2;
                } catch (HttpRequestException e2) {
                    e = e2;
                    try {
                        C2766c.m13524h().mo3562e("Fabric", "Settings request failed.", e);
                        if (c2856v != null) {
                            return null;
                        }
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Settings request ID: ");
                        stringBuilder.append(c2856v.m13809b("X-REQUEST-ID"));
                        C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (c2856v != null) {
                            h = C2766c.m13524h();
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Settings request ID: ");
                            stringBuilder2.append(c2856v.m13809b("X-REQUEST-ID"));
                            h.mo3554a("Fabric", stringBuilder2.toString());
                        }
                        throw th;
                    }
                }
            } catch (HttpRequestException e3) {
                e = e3;
                c2856v = a;
                C2766c.m13524h().mo3562e("Fabric", "Settings request failed.", e);
                if (c2856v != null) {
                    return null;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("Settings request ID: ");
                stringBuilder.append(c2856v.m13809b("X-REQUEST-ID"));
                C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
                return null;
            } catch (Throwable th3) {
                th = th3;
                c2856v = a;
                if (c2856v != null) {
                    h = C2766c.m13524h();
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Settings request ID: ");
                    stringBuilder2.append(c2856v.m13809b("X-REQUEST-ID"));
                    h.mo3554a("Fabric", stringBuilder2.toString());
                }
                throw th;
            }
        } catch (HttpRequestException e4) {
            e = e4;
            c2856v = null;
            C2766c.m13524h().mo3562e("Fabric", "Settings request failed.", e);
            if (c2856v != null) {
                return null;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Settings request ID: ");
            stringBuilder.append(c2856v.m13809b("X-REQUEST-ID"));
            C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
            return null;
        } catch (C2856v c2856v2) {
            th = c2856v2;
            c2856v2 = null;
            if (c2856v2 != null) {
                h = C2766c.m13524h();
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Settings request ID: ");
                stringBuilder2.append(c2856v2.m13809b("X-REQUEST-ID"));
                h.mo3554a("Fabric", stringBuilder2.toString());
            }
            throw th;
        }
    }

    /* renamed from: a */
    JSONObject m23697a(HttpRequest httpRequest) {
        int b = httpRequest.m13807b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Settings result was: ");
        stringBuilder.append(b);
        C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
        if (m23699a(b)) {
            return m23694a(httpRequest.m13818e());
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Failed to retrieve settings from ");
        stringBuilder2.append(m13662a());
        C2766c.m13524h().mo3561e("Fabric", stringBuilder2.toString());
        return null;
    }

    /* renamed from: a */
    private JSONObject m23694a(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse settings JSON from ");
            stringBuilder.append(m13662a());
            C2766c.m13524h().mo3555a("Fabric", stringBuilder.toString(), e);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Settings response ");
            stringBuilder2.append(str);
            C2766c.m13524h().mo3554a("Fabric", stringBuilder2.toString());
            return null;
        }
    }

    /* renamed from: b */
    private Map<String, String> m23696b(C2856v c2856v) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("build_version", c2856v.f12072h);
        hashMap.put("display_version", c2856v.f12071g);
        hashMap.put("source", Integer.toString(c2856v.f12073i));
        if (c2856v.f12074j != null) {
            hashMap.put("icon_hash", c2856v.f12074j);
        }
        String str = c2856v.f12070f;
        if (!CommonUtils.m13628d(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    private HttpRequest m23693a(HttpRequest httpRequest, C2856v c2856v) {
        m23695a(httpRequest, "X-CRASHLYTICS-API-KEY", c2856v.f12065a);
        m23695a(httpRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m23695a(httpRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", this.a.getVersion());
        m23695a(httpRequest, "Accept", "application/json");
        m23695a(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", c2856v.f12066b);
        m23695a(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", c2856v.f12067c);
        m23695a(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c2856v.f12068d);
        m23695a(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", c2856v.f12069e);
        return httpRequest;
    }

    /* renamed from: a */
    private void m23695a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.m13797a(str, str2);
        }
    }
}
