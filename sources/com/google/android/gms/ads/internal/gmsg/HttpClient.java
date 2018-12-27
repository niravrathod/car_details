package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzalo;
import com.google.android.gms.internal.ads.zzaoe;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzvd;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;

@Keep
@KeepName
@zzaer
public class HttpClient implements zzu<zzvd> {
    private final Context mContext;
    private final zzaop zzys;

    @zzaer
    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$a */
    static class C2400a {
        /* renamed from: a */
        private final String f7676a;
        /* renamed from: b */
        private final String f7677b;

        public C2400a(String str, String str2) {
            this.f7676a = str;
            this.f7677b = str2;
        }

        /* renamed from: a */
        public final String m8779a() {
            return this.f7676a;
        }

        /* renamed from: b */
        public final String m8780b() {
            return this.f7677b;
        }
    }

    @zzaer
    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$b */
    static class C2401b {
        /* renamed from: a */
        private final String f7678a;
        /* renamed from: b */
        private final URL f7679b;
        /* renamed from: c */
        private final ArrayList<C2400a> f7680c;
        /* renamed from: d */
        private final String f7681d;

        C2401b(String str, URL url, ArrayList<C2400a> arrayList, String str2) {
            this.f7678a = str;
            this.f7679b = url;
            this.f7680c = arrayList;
            this.f7681d = str2;
        }

        /* renamed from: a */
        public final String m8781a() {
            return this.f7678a;
        }

        /* renamed from: b */
        public final URL m8782b() {
            return this.f7679b;
        }

        /* renamed from: c */
        public final ArrayList<C2400a> m8783c() {
            return this.f7680c;
        }

        /* renamed from: d */
        public final String m8784d() {
            return this.f7681d;
        }
    }

    @zzaer
    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$c */
    class C2402c {
        /* renamed from: a */
        private final C2403d f7682a;
        /* renamed from: b */
        private final boolean f7683b;
        /* renamed from: c */
        private final String f7684c;

        public C2402c(HttpClient httpClient, boolean z, C2403d c2403d, String str) {
            this.f7683b = z;
            this.f7682a = c2403d;
            this.f7684c = str;
        }

        /* renamed from: a */
        public final String m8785a() {
            return this.f7684c;
        }

        /* renamed from: b */
        public final C2403d m8786b() {
            return this.f7682a;
        }

        /* renamed from: c */
        public final boolean m8787c() {
            return this.f7683b;
        }
    }

    @zzaer
    @VisibleForTesting
    /* renamed from: com.google.android.gms.ads.internal.gmsg.HttpClient$d */
    static class C2403d {
        /* renamed from: a */
        private final String f7685a;
        /* renamed from: b */
        private final int f7686b;
        /* renamed from: c */
        private final List<C2400a> f7687c;
        /* renamed from: d */
        private final String f7688d;

        C2403d(String str, int i, List<C2400a> list, String str2) {
            this.f7685a = str;
            this.f7686b = i;
            this.f7687c = list;
            this.f7688d = str2;
        }

        /* renamed from: a */
        public final String m8788a() {
            return this.f7685a;
        }

        /* renamed from: b */
        public final int m8789b() {
            return this.f7686b;
        }

        /* renamed from: c */
        public final Iterable<C2400a> m8790c() {
            return this.f7687c;
        }

        /* renamed from: d */
        public final String m8791d() {
            return this.f7688d;
        }
    }

    public HttpClient(Context context, zzaop zzaop) {
        this.mContext = context;
        this.zzys = zzaop;
    }

    private static C2401b zzc(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString(ImagesContract.URL);
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (Throwable e) {
            zzaok.m10002b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        jSONObject = jSONObject.optJSONArray("headers");
        if (jSONObject == null) {
            jSONObject = new JSONArray();
        }
        for (int i = 0; i < jSONObject.length(); i++) {
            JSONObject optJSONObject = jSONObject.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C2400a(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C2401b(optString, url, arrayList, optString3);
    }

    private static JSONObject zza(C2403d c2403d) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", c2403d.m8788a());
            if (c2403d.m8791d() != null) {
                jSONObject.put("body", c2403d.m8791d());
            }
            JSONArray jSONArray = new JSONArray();
            for (C2400a c2400a : c2403d.m8790c()) {
                jSONArray.put(new JSONObject().put("key", c2400a.m8779a()).put("value", c2400a.m8780b()));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", c2403d.m8789b());
        } catch (C2403d c2403d2) {
            zzaok.m10002b("Error constructing JSON for http response.", c2403d2);
        }
        return jSONObject;
    }

    private final C2402c zza(C2401b c2401b) {
        C2402c c2402c;
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = (HttpURLConnection) c2401b.m8782b().openConnection();
            try {
                byte[] bArr;
                zzbv.zzek().m9836a(this.mContext, this.zzys.f19893a, false, httpURLConnection);
                ArrayList c = c2401b.m8783c();
                int size = c.size();
                int i = 0;
                while (i < size) {
                    Object obj = c.get(i);
                    i++;
                    C2400a c2400a = (C2400a) obj;
                    httpURLConnection.addRequestProperty(c2400a.m8779a(), c2400a.m8780b());
                }
                if (TextUtils.isEmpty(c2401b.m8784d())) {
                    bArr = null;
                } else {
                    httpURLConnection.setDoOutput(true);
                    bArr = c2401b.m8784d().getBytes();
                    httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    bufferedOutputStream.write(bArr);
                    bufferedOutputStream.close();
                }
                zzaoe zzaoe = new zzaoe();
                zzaoe.m9995a(httpURLConnection, bArr);
                List arrayList = new ArrayList();
                if (httpURLConnection.getHeaderFields() != null) {
                    for (Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                        for (String c2400a2 : (List) entry.getValue()) {
                            arrayList.add(new C2400a((String) entry.getKey(), c2400a2));
                        }
                    }
                }
                c2401b = c2401b.m8781a();
                int responseCode = httpURLConnection.getResponseCode();
                zzbv.zzek();
                C2403d c2403d = new C2403d(c2401b, responseCode, arrayList, zzalo.m9784a(new InputStreamReader(httpURLConnection.getInputStream())));
                zzaoe.m9994a(httpURLConnection, c2403d.m8789b());
                zzaoe.m9992a(c2403d.m8791d());
                c2401b = new C2402c(this, true, c2403d, null);
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return c2401b;
            } catch (Exception e) {
                c2401b = e;
                try {
                    c2402c = new C2402c(this, false, null, c2401b.toString());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return c2402c;
                } catch (Throwable th) {
                    c2401b = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw c2401b;
                }
            }
        } catch (Exception e2) {
            c2401b = e2;
            httpURLConnection = null;
            c2402c = new C2402c(this, false, null, c2401b.toString());
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return c2402c;
        } catch (Throwable th2) {
            c2401b = th2;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw c2401b;
        }
    }

    @Keep
    @KeepName
    public JSONObject send(JSONObject jSONObject) {
        Object optString;
        JSONObject jSONObject2 = new JSONObject();
        String str = "";
        try {
            optString = jSONObject.optString("http_request_id");
            try {
                jSONObject = zza(zzc(jSONObject));
                if (jSONObject.m8787c()) {
                    jSONObject2.put("response", zza(jSONObject.m8786b()));
                    jSONObject2.put("success", true);
                } else {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", jSONObject.m8785a());
                }
            } catch (Exception e) {
                jSONObject = e;
                zzaok.m10002b("Error executing http request.", jSONObject);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", jSONObject.toString());
                } catch (JSONObject jSONObject3) {
                    zzaok.m10002b("Error executing http request.", jSONObject3);
                }
                return jSONObject2;
            }
        } catch (Exception e2) {
            jSONObject3 = e2;
            optString = str;
            zzaok.m10002b("Error executing http request.", jSONObject3);
            jSONObject2.put("response", new JSONObject().put("http_request_id", optString));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", jSONObject3.toString());
            return jSONObject2;
        }
        return jSONObject2;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzalm.m9772a(new C2404o(this, map, (zzvd) obj));
    }
}
