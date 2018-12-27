package com.crashlytics.android.core;

import android.content.Context;
import android.os.Build.VERSION;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2774k;
import java.io.BufferedReader;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.core.c */
class C1356c {
    /* renamed from: a */
    private final Context f4263a;
    /* renamed from: b */
    private final C1355a f4264b;

    /* renamed from: com.crashlytics.android.core.c$a */
    interface C1355a {
        /* renamed from: a */
        String mo1139a(File file);
    }

    C1356c(Context context, C1355a c1355a) {
        this.f4263a = context;
        this.f4264b = c1355a;
    }

    /* renamed from: a */
    byte[] m5532a(String str) {
        return C1356c.m5525a(m5528b(str));
    }

    /* renamed from: a */
    byte[] m5531a(BufferedReader bufferedReader) {
        return C1356c.m5525a(m5527b(bufferedReader));
    }

    /* renamed from: b */
    private JSONArray m5527b(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject c = m5529c(readLine);
            if (c != null) {
                jSONArray.put(c);
            }
        }
    }

    /* renamed from: b */
    private JSONArray m5528b(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            str = C1356c.m5526b(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String c : str) {
                JSONObject c2 = m5529c(c);
                if (c2 != null) {
                    jSONArray.put(c2);
                }
            }
            return jSONArray;
        } catch (String str2) {
            C2766c.m13524h().mo3560d(CrashlyticsCore.TAG, "Unable to parse proc maps string", str2);
            return jSONArray;
        }
    }

    /* renamed from: c */
    private JSONObject m5529c(String str) {
        ae a = af.m5472a(str);
        if (a != null) {
            if (C1356c.m5524a(a)) {
                try {
                    try {
                        return C1356c.m5523a(this.f4264b.mo1139a(m5530d(a.f4242d)), a);
                    } catch (Throwable e) {
                        C2766c.m13524h().mo3555a(CrashlyticsCore.TAG, "Could not create a binary image json string", e);
                        return null;
                    }
                } catch (Throwable e2) {
                    C2774k h = C2766c.m13524h();
                    String str2 = CrashlyticsCore.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not generate ID for file ");
                    stringBuilder.append(a.f4242d);
                    h.mo3555a(str2, stringBuilder.toString(), e2);
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private File m5530d(String str) {
        File file = new File(str);
        return file.exists() == null ? m5522a(file) : file;
    }

    /* renamed from: a */
    private File m5522a(File file) {
        if (VERSION.SDK_INT < 9) {
            return file;
        }
        if (file.getAbsolutePath().startsWith("/data")) {
            try {
                file = new File(this.f4263a.getPackageManager().getApplicationInfo(this.f4263a.getPackageName(), 0).nativeLibraryDir, file.getName());
            } catch (Throwable e) {
                C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error getting ApplicationInfo", e);
            }
        }
        return file;
    }

    /* renamed from: a */
    private static byte[] m5525a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONArray jSONArray2) {
            C2766c.m13524h().mo3560d(CrashlyticsCore.TAG, "Binary images string is null", jSONArray2);
            return new byte[null];
        }
    }

    /* renamed from: a */
    private static JSONObject m5523a(String str, ae aeVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", aeVar.f4239a);
        jSONObject.put("size", aeVar.f4240b);
        jSONObject.put("name", aeVar.f4242d);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    /* renamed from: b */
    private static String m5526b(JSONArray jSONArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            stringBuilder.append(jSONArray.getString(i));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static boolean m5524a(ae aeVar) {
        return (aeVar.f4241c.indexOf(120) == -1 || aeVar.f4242d.indexOf(47) == -1) ? null : true;
    }
}
