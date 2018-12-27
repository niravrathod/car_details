package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzvd;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.o */
final class C2404o implements Runnable {
    /* renamed from: a */
    final /* synthetic */ zzvd f7689a;
    /* renamed from: b */
    private final /* synthetic */ Map f7690b;
    /* renamed from: c */
    private final /* synthetic */ HttpClient f7691c;

    C2404o(HttpClient httpClient, Map map, zzvd zzvd) {
        this.f7691c = httpClient;
        this.f7690b = map;
        this.f7689a = zzvd;
    }

    public final void run() {
        zzaok.m10001b("Received Http request.");
        try {
            JSONObject send = this.f7691c.send(new JSONObject((String) this.f7690b.get("http_request")));
            if (send == null) {
                zzaok.m10003c("Response should not be null.");
            } else {
                zzalo.f8872a.post(new C2405p(this, send));
            }
        } catch (Throwable e) {
            zzaok.m10002b("Error converting request to json.", e);
        }
    }
}
