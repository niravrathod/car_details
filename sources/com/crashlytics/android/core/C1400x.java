package com.crashlytics.android.core;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.core.x */
class C1400x {
    /* renamed from: a */
    private static final Charset f4372a = Charset.forName("UTF-8");
    /* renamed from: b */
    private final File f4373b;

    public C1400x(File file) {
        this.f4373b = file;
    }

    /* renamed from: a */
    public void m5689a(String str, UserMetaData userMetaData) {
        str = m5691b(str);
        Closeable closeable = null;
        try {
            userMetaData = C1400x.m5684a(userMetaData);
            Closeable bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), f4372a));
            try {
                bufferedWriter.write(userMetaData);
                bufferedWriter.flush();
                CommonUtils.m13613a(bufferedWriter, "Failed to close user metadata file.");
            } catch (Exception e) {
                str = e;
                closeable = bufferedWriter;
                try {
                    C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error serializing user metadata.", str);
                    CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = bufferedWriter;
                CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error serializing user metadata.", str);
            CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
        }
    }

    /* renamed from: a */
    public UserMetaData m5688a(String str) {
        str = m5691b(str);
        if (!str.exists()) {
            return UserMetaData.EMPTY;
        }
        Closeable closeable = null;
        try {
            Closeable fileInputStream = new FileInputStream(str);
            try {
                str = C1400x.m5687d(CommonUtils.m13602a((InputStream) fileInputStream));
                CommonUtils.m13613a(fileInputStream, "Failed to close user metadata file.");
                return str;
            } catch (Exception e) {
                str = e;
                closeable = fileInputStream;
                try {
                    C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error deserializing user metadata.", str);
                    CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
                    return UserMetaData.EMPTY;
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = fileInputStream;
                CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error deserializing user metadata.", str);
            CommonUtils.m13613a(closeable, "Failed to close user metadata file.");
            return UserMetaData.EMPTY;
        }
    }

    /* renamed from: a */
    public void m5690a(String str, Map<String, String> map) {
        str = m5692c(str);
        Closeable closeable = null;
        try {
            map = C1400x.m5685a((Map) map);
            Closeable bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), f4372a));
            try {
                bufferedWriter.write(map);
                bufferedWriter.flush();
                CommonUtils.m13613a(bufferedWriter, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                str = e;
                closeable = bufferedWriter;
                try {
                    C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", str);
                    CommonUtils.m13613a(closeable, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    str = th;
                    CommonUtils.m13613a(closeable, "Failed to close key/value metadata file.");
                    throw str;
                }
            } catch (Throwable th2) {
                str = th2;
                closeable = bufferedWriter;
                CommonUtils.m13613a(closeable, "Failed to close key/value metadata file.");
                throw str;
            }
        } catch (Exception e2) {
            str = e2;
            C2766c.m13524h().mo3562e(CrashlyticsCore.TAG, "Error serializing key/value metadata.", str);
            CommonUtils.m13613a(closeable, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: b */
    public File m5691b(String str) {
        File file = this.f4373b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("user");
        stringBuilder.append(".meta");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: c */
    public File m5692c(String str) {
        File file = this.f4373b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("keys");
        stringBuilder.append(".meta");
        return new File(file, stringBuilder.toString());
    }

    /* renamed from: d */
    private static UserMetaData m5687d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(C1400x.m5686a(jSONObject, "userId"), C1400x.m5686a(jSONObject, "userName"), C1400x.m5686a(jSONObject, "userEmail"));
    }

    /* renamed from: a */
    private static String m5684a(final UserMetaData userMetaData) {
        return new JSONObject() {
        }.toString();
    }

    /* renamed from: a */
    private static String m5685a(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: a */
    private static String m5686a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.optString(str, null) : null;
    }
}
