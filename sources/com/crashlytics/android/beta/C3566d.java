package com.crashlytics.android.beta;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.services.common.C2789a;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.beta.d */
class C3566d extends C2789a {
    /* renamed from: b */
    private final C1341f f14675b;

    /* renamed from: a */
    static String m18079a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("3:");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public C3566d(C2771h c2771h, String str, String str2, C2834c c2834c, C1341f c1341f) {
        super(c2771h, str, str2, c2834c, HttpMethod.GET);
        this.f14675b = c1341f;
    }

    /* renamed from: a */
    public C1340e m18081a(String str, String str2, C1339c c1339c) {
        String str3;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String str4;
        StringBuilder stringBuilder3;
        try {
            c1339c = m18080a(c1339c);
            HttpRequest a = m13661a((Map) c1339c);
            try {
                str = m18078a(a, str, str2);
                try {
                    str2 = C2766c.m13524h();
                    str3 = Beta.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Checking for updates from ");
                    stringBuilder.append(m13662a());
                    str2.mo3554a(str3, stringBuilder.toString());
                    str2 = C2766c.m13524h();
                    str3 = Beta.TAG;
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Checking for updates query params are: ");
                    stringBuilder.append(c1339c);
                    str2.mo3554a(str3, stringBuilder.toString());
                    if (str.m13813c() != null) {
                        C2766c.m13524h().mo3554a(Beta.TAG, "Checking for updates was successful");
                        str2 = this.f14675b.m5389a(new JSONObject(str.m13818e()));
                        if (str != null) {
                            str = str.m13809b("X-REQUEST-ID");
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Checking for updates request ID: ");
                            stringBuilder2.append(str);
                            C2766c.m13524h().mo3554a("Fabric", stringBuilder2.toString());
                        }
                        return str2;
                    }
                    str2 = C2766c.m13524h();
                    c1339c = Beta.TAG;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Checking for updates failed. Response code: ");
                    stringBuilder2.append(str.m13807b());
                    str2.mo3561e(c1339c, stringBuilder2.toString());
                    if (str != null) {
                        str = str.m13809b("X-REQUEST-ID");
                        str2 = C2766c.m13524h();
                        str4 = "Fabric";
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Checking for updates request ID: ");
                        stringBuilder2.append(str);
                        str2.mo3554a(str4, stringBuilder2.toString());
                    }
                    return null;
                } catch (Exception e) {
                    str2 = e;
                    try {
                        c1339c = C2766c.m13524h();
                        str3 = Beta.TAG;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Error while checking for updates from ");
                        stringBuilder.append(m13662a());
                        c1339c.mo3562e(str3, stringBuilder.toString(), str2);
                        if (str != null) {
                            str = str.m13809b("X-REQUEST-ID");
                            str2 = C2766c.m13524h();
                            str4 = "Fabric";
                            stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Checking for updates request ID: ");
                            stringBuilder2.append(str);
                            str2.mo3554a(str4, stringBuilder2.toString());
                        }
                        return null;
                    } catch (Throwable th) {
                        str2 = th;
                        if (str != null) {
                            str = str.m13809b("X-REQUEST-ID");
                            c1339c = C2766c.m13524h();
                            stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Checking for updates request ID: ");
                            stringBuilder3.append(str);
                            c1339c.mo3554a("Fabric", stringBuilder3.toString());
                        }
                        throw str2;
                    }
                }
            } catch (Exception e2) {
                str2 = e2;
                str = a;
                c1339c = C2766c.m13524h();
                str3 = Beta.TAG;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error while checking for updates from ");
                stringBuilder.append(m13662a());
                c1339c.mo3562e(str3, stringBuilder.toString(), str2);
                if (str != null) {
                    str = str.m13809b("X-REQUEST-ID");
                    str2 = C2766c.m13524h();
                    str4 = "Fabric";
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Checking for updates request ID: ");
                    stringBuilder2.append(str);
                    str2.mo3554a(str4, stringBuilder2.toString());
                }
                return null;
            } catch (Throwable th2) {
                str2 = th2;
                str = a;
                if (str != null) {
                    str = str.m13809b("X-REQUEST-ID");
                    c1339c = C2766c.m13524h();
                    stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("Checking for updates request ID: ");
                    stringBuilder3.append(str);
                    c1339c.mo3554a("Fabric", stringBuilder3.toString());
                }
                throw str2;
            }
        } catch (Exception e3) {
            str2 = e3;
            str = null;
            c1339c = C2766c.m13524h();
            str3 = Beta.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error while checking for updates from ");
            stringBuilder.append(m13662a());
            c1339c.mo3562e(str3, stringBuilder.toString(), str2);
            if (str != null) {
                str = str.m13809b("X-REQUEST-ID");
                str2 = C2766c.m13524h();
                str4 = "Fabric";
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Checking for updates request ID: ");
                stringBuilder2.append(str);
                str2.mo3554a(str4, stringBuilder2.toString());
            }
            return null;
        } catch (Throwable th3) {
            str2 = th3;
            str = null;
            if (str != null) {
                str = str.m13809b("X-REQUEST-ID");
                c1339c = C2766c.m13524h();
                stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Checking for updates request ID: ");
                stringBuilder3.append(str);
                c1339c.mo3554a("Fabric", stringBuilder3.toString());
            }
            throw str2;
        }
    }

    /* renamed from: a */
    private HttpRequest m18078a(HttpRequest httpRequest, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Crashlytics Android SDK/");
        stringBuilder.append(this.a.getVersion());
        return httpRequest.m13797a("Accept", "application/json").m13797a("User-Agent", stringBuilder.toString()).m13797a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa").m13797a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").m13797a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.getVersion()).m13797a("X-CRASHLYTICS-API-KEY", str).m13797a("X-CRASHLYTICS-BETA-TOKEN", C3566d.m18079a(str2));
    }

    /* renamed from: a */
    private Map<String, String> m18080a(C1339c c1339c) {
        Map<String, String> hashMap = new HashMap();
        hashMap.put("build_version", c1339c.f4208a);
        hashMap.put("display_version", c1339c.f4209b);
        hashMap.put("instance", c1339c.f4210c);
        hashMap.put("source", "3");
        return hashMap;
    }
}
