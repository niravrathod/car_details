package com.facebook.ads.internal.p097p.p098a;

import com.facebook.ads.internal.settings.C1964b;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.p.a.g */
public class C3816g implements C1867r {
    /* renamed from: a */
    private void m19054a(Map<String, List<String>> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                for (String str2 : (List) map.get(str)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(":");
                    stringBuilder.append(str2);
                    mo1388a(stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1387a(C1863n c1863n) {
        if (c1863n != null) {
            mo1388a("=== HTTP Response ===");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Receive url: ");
            stringBuilder.append(c1863n.m7115b());
            mo1388a(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.append("Status: ");
            stringBuilder.append(c1863n.m7114a());
            mo1388a(stringBuilder.toString());
            m19054a(c1863n.m7116c());
            stringBuilder = new StringBuilder();
            stringBuilder.append("Content:\n");
            stringBuilder.append(c1863n.m7118e());
            mo1388a(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void mo1388a(String str) {
        System.out.println(str);
    }

    /* renamed from: a */
    public void mo1389a(HttpURLConnection httpURLConnection, Object obj) {
        mo1388a("=== HTTP Request ===");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(httpURLConnection.getRequestMethod());
        stringBuilder.append(" ");
        stringBuilder.append(httpURLConnection.getURL().toString());
        mo1388a(stringBuilder.toString());
        if (obj instanceof String) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Content: ");
            stringBuilder.append((String) obj);
            mo1388a(stringBuilder.toString());
        }
        m19054a(httpURLConnection.getRequestProperties());
    }

    /* renamed from: a */
    public boolean mo1390a() {
        return C1964b.m7441f();
    }
}
