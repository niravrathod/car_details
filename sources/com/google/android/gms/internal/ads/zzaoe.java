package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.util.JsonWriter;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@zzaer
public final class zzaoe {
    /* renamed from: a */
    private static Object f8955a = new Object();
    /* renamed from: b */
    private static boolean f8956b = false;
    /* renamed from: c */
    private static boolean f8957c = false;
    /* renamed from: d */
    private static Clock f8958d = DefaultClock.getInstance();
    /* renamed from: e */
    private static final Set<String> f8959e = new HashSet(Arrays.asList(new String[0]));
    /* renamed from: f */
    private final List<String> f8960f;

    public zzaoe() {
        this(null);
    }

    public zzaoe(String str) {
        if (m9991c()) {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                str = new String[1];
                String str2 = "network_request_";
                uuid = String.valueOf(uuid);
                str[0] = uuid.length() != 0 ? str2.concat(uuid) : new String(str2);
                str = Arrays.asList(str);
            } else {
                String[] strArr = new String[2];
                String str3 = "ad_request_";
                str = String.valueOf(str);
                strArr[0] = str.length() != 0 ? str3.concat(str) : new String(str3);
                str = "network_request_";
                uuid = String.valueOf(uuid);
                strArr[1] = uuid.length() != 0 ? str.concat(uuid) : new String(str);
                str = Arrays.asList(strArr);
            }
        } else {
            str = new ArrayList();
        }
        this.f8960f = str;
    }

    /* renamed from: a */
    public final void m9995a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m9991c()) {
            Map map;
            if (httpURLConnection.getRequestProperties() == null) {
                map = null;
            } else {
                map = new HashMap(httpURLConnection.getRequestProperties());
            }
            m9987b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), map, bArr);
        }
    }

    /* renamed from: a */
    public final void m9993a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (m9991c()) {
            m9987b(str, str2, map, bArr);
        }
    }

    /* renamed from: b */
    private final void m9987b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        m9981a("onNetworkRequest", new ej(str, str2, map, bArr));
    }

    /* renamed from: a */
    public final void m9994a(HttpURLConnection httpURLConnection, int i) {
        if (m9991c()) {
            m9988b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    httpURLConnection = httpURLConnection.getResponseMessage();
                } catch (HttpURLConnection httpURLConnection2) {
                    i = "Can not get error message from error HttpURLConnection\n";
                    httpURLConnection2 = String.valueOf(httpURLConnection2.getMessage());
                    zzaok.m10007e(httpURLConnection2.length() != 0 ? i.concat(httpURLConnection2) : new String(i));
                    httpURLConnection2 = null;
                }
                m9986b(httpURLConnection2);
            }
        }
    }

    /* renamed from: a */
    public final void m9996a(Map<String, ?> map, int i) {
        if (m9991c()) {
            m9988b(map, i);
            if (i < 200 || i >= 300) {
                m9986b(null);
            }
        }
    }

    /* renamed from: b */
    private final void m9988b(Map<String, ?> map, int i) {
        m9981a("onNetworkResponse", new ek(i, map));
    }

    /* renamed from: a */
    public final void m9992a(String str) {
        if (m9991c() && str != null) {
            m9997a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void m9997a(byte[] bArr) {
        m9981a("onNetworkResponseBody", new el(bArr));
    }

    /* renamed from: b */
    private final void m9986b(String str) {
        m9981a("onNetworkRequestError", new em(str));
    }

    /* renamed from: a */
    private static void m9979a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                String str = (String) entry.getKey();
                if (!f8959e.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            zzaok.m10003c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: a */
    private final void m9981a(String str, en enVar) {
        Writer stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f8958d.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f8960f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            enVar.mo1946a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (String str2) {
            zzaok.m10002b("unable to log", str2);
        }
        m9990c(stringWriter.toString());
    }

    /* renamed from: c */
    private static synchronized void m9990c(String str) {
        synchronized (zzaoe.class) {
            zzaok.m10005d("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String str2 = "GMA Debug CONTENT ";
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                zzaok.m10005d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                i = i2;
            }
            zzaok.m10005d("GMA Debug FINISH");
        }
    }

    /* renamed from: a */
    public static void m9977a() {
        synchronized (f8955a) {
            f8956b = false;
            f8957c = false;
            zzaok.m10007e("Ad debug logging enablement is out of date.");
        }
    }

    /* renamed from: a */
    public static void m9983a(boolean z) {
        synchronized (f8955a) {
            f8956b = true;
            f8957c = z;
        }
    }

    /* renamed from: b */
    public static boolean m9989b() {
        boolean z;
        synchronized (f8955a) {
            z = f8956b;
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m9991c() {
        boolean z;
        synchronized (f8955a) {
            z = f8956b && f8957c;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m9985a(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.aP)).booleanValue()) {
            return false;
        }
        try {
            if (Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != null) {
                return true;
            }
            return false;
        } catch (Context context2) {
            zzaok.m10004c("Fail to determine debug setting.", context2);
            return false;
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m9980a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m9984a(byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String encode = Base64Utils.encode(bArr);
        if (length < 10000) {
            jsonWriter.name("body").value(encode);
        } else {
            bArr = zzaoa.m9955a(encode);
            if (bArr != null) {
                jsonWriter.name("bodydigest").value(bArr);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m9978a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        m9979a(jsonWriter, map);
        jsonWriter.endObject();
    }

    /* renamed from: a */
    static final /* synthetic */ void m9982a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        m9979a(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64Utils.encode(bArr));
        }
        jsonWriter.endObject();
    }
}
