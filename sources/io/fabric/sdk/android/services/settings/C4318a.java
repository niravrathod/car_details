package io.fabric.sdk.android.services.settings;

import android.content.res.Resources.NotFoundException;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.C2773j;
import io.fabric.sdk.android.services.common.C2789a;
import io.fabric.sdk.android.services.common.C2809p;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.network.C2834c;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: io.fabric.sdk.android.services.settings.a */
abstract class C4318a extends C2789a {
    public C4318a(C2771h c2771h, String str, String str2, C2834c c2834c, HttpMethod httpMethod) {
        super(c2771h, str, str2, c2834c, httpMethod);
    }

    /* renamed from: a */
    public boolean mo4538a(C2841d c2841d) {
        HttpRequest b = m23670b(m23669a(m13663b(), c2841d), c2841d);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending app info to ");
        stringBuilder.append(m13662a());
        C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
        if (c2841d.f12016j != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("App icon hash is ");
            stringBuilder.append(c2841d.f12016j.f12032a);
            C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("App icon size is ");
            stringBuilder.append(c2841d.f12016j.f12034c);
            stringBuilder.append("x");
            stringBuilder.append(c2841d.f12016j.f12035d);
            C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
        }
        c2841d = b.m13807b();
        String str = "POST".equals(b.m13831p()) ? "Create" : "Update";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(" app request ID: ");
        stringBuilder2.append(b.m13809b("X-REQUEST-ID"));
        C2766c.m13524h().mo3554a("Fabric", stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Result was ");
        stringBuilder3.append(c2841d);
        C2766c.m13524h().mo3554a("Fabric", stringBuilder3.toString());
        return C2809p.m13725a(c2841d) == null ? true : null;
    }

    /* renamed from: a */
    private HttpRequest m23669a(HttpRequest httpRequest, C2841d c2841d) {
        return httpRequest.m13797a("X-CRASHLYTICS-API-KEY", c2841d.f12007a).m13797a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").m13797a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.getVersion());
    }

    /* renamed from: b */
    private HttpRequest m23670b(HttpRequest httpRequest, C2841d c2841d) {
        Closeable openRawResource;
        Throwable e;
        StringBuilder stringBuilder;
        httpRequest = httpRequest.m13817e("app[identifier]", c2841d.f12008b).m13817e("app[name]", c2841d.f12012f).m13817e("app[display_version]", c2841d.f12009c).m13817e("app[build_version]", c2841d.f12010d).m13796a("app[source]", Integer.valueOf(c2841d.f12013g)).m13817e("app[minimum_sdk_version]", c2841d.f12014h).m13817e("app[built_sdk_version]", c2841d.f12015i);
        if (!CommonUtils.m13628d(c2841d.f12011e)) {
            httpRequest.m13817e("app[instance_identifier]", c2841d.f12011e);
        }
        if (c2841d.f12016j != null) {
            try {
                openRawResource = this.a.getContext().getResources().openRawResource(c2841d.f12016j.f12033b);
                try {
                    httpRequest.m13817e("app[icon][hash]", c2841d.f12016j.f12032a).m13801a("app[icon][data]", "icon.png", "application/octet-stream", (InputStream) openRawResource).m13796a("app[icon][width]", Integer.valueOf(c2841d.f12016j.f12034c)).m13796a("app[icon][height]", Integer.valueOf(c2841d.f12016j.f12035d));
                } catch (NotFoundException e2) {
                    e = e2;
                    try {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed to find app icon with resource ID: ");
                        stringBuilder.append(c2841d.f12016j.f12033b);
                        C2766c.m13524h().mo3562e("Fabric", stringBuilder.toString(), e);
                        CommonUtils.m13613a(openRawResource, "Failed to close app icon InputStream.");
                        if (c2841d.f12017k != null) {
                            for (C2773j c2773j : c2841d.f12017k) {
                                httpRequest.m13817e(m23671a(c2773j), c2773j.m13546b());
                                httpRequest.m13817e(m23673b(c2773j), c2773j.m13547c());
                            }
                        }
                        return httpRequest;
                    } catch (Throwable th) {
                        httpRequest = th;
                        CommonUtils.m13613a(openRawResource, "Failed to close app icon InputStream.");
                        throw httpRequest;
                    }
                }
            } catch (Throwable e3) {
                Throwable th2 = e3;
                openRawResource = null;
                e = th2;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Failed to find app icon with resource ID: ");
                stringBuilder.append(c2841d.f12016j.f12033b);
                C2766c.m13524h().mo3562e("Fabric", stringBuilder.toString(), e);
                CommonUtils.m13613a(openRawResource, "Failed to close app icon InputStream.");
                if (c2841d.f12017k != null) {
                    for (C2773j c2773j2 : c2841d.f12017k) {
                        httpRequest.m13817e(m23671a(c2773j2), c2773j2.m13546b());
                        httpRequest.m13817e(m23673b(c2773j2), c2773j2.m13547c());
                    }
                }
                return httpRequest;
            } catch (Throwable th3) {
                httpRequest = th3;
                openRawResource = null;
                CommonUtils.m13613a(openRawResource, "Failed to close app icon InputStream.");
                throw httpRequest;
            }
            CommonUtils.m13613a(openRawResource, "Failed to close app icon InputStream.");
        }
        if (c2841d.f12017k != null) {
            for (C2773j c2773j22 : c2841d.f12017k) {
                httpRequest.m13817e(m23671a(c2773j22), c2773j22.m13546b());
                httpRequest.m13817e(m23673b(c2773j22), c2773j22.m13547c());
            }
        }
        return httpRequest;
    }

    /* renamed from: a */
    String m23671a(C2773j c2773j) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{c2773j.m13545a()});
    }

    /* renamed from: b */
    String m23673b(C2773j c2773j) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{c2773j.m13545a()});
    }
}
