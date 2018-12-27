package io.fabric.sdk.android.services.settings;

import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.p148c.C4297b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import org.json.JSONObject;

/* renamed from: io.fabric.sdk.android.services.settings.i */
class C4319i implements C2844g {
    /* renamed from: a */
    private final C2771h f18054a;

    public C4319i(C2771h c2771h) {
        this.f18054a = c2771h;
    }

    /* renamed from: a */
    public JSONObject mo3594a() {
        Closeable fileInputStream;
        Throwable e;
        C2766c.m13524h().mo3554a("Fabric", "Reading cached settings...");
        Closeable closeable = null;
        try {
            JSONObject jSONObject;
            File file = new File(new C4297b(this.f18054a).mo3575a(), "com.crashlytics.settings.json");
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(CommonUtils.m13602a((InputStream) fileInputStream));
                    closeable = fileInputStream;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C2766c.m13524h().mo3562e("Fabric", "Failed to fetch cached settings", e);
                        CommonUtils.m13613a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        e = th;
                        closeable = fileInputStream;
                        CommonUtils.m13613a(closeable, "Error while closing settings cache file.");
                        throw e;
                    }
                }
            }
            C2766c.m13524h().mo3554a("Fabric", "No cached settings found.");
            jSONObject = null;
            CommonUtils.m13613a(closeable, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C2766c.m13524h().mo3562e("Fabric", "Failed to fetch cached settings", e);
            CommonUtils.m13613a(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            e = th2;
            CommonUtils.m13613a(closeable, "Error while closing settings cache file.");
            throw e;
        }
    }

    /* renamed from: a */
    public void mo3595a(long j, JSONObject jSONObject) {
        Throwable e;
        C2766c.m13524h().mo3554a("Fabric", "Writing settings to cache file...");
        if (jSONObject != null) {
            Closeable closeable = null;
            try {
                jSONObject.put("expires_at", j);
                Closeable fileWriter = new FileWriter(new File(new C4297b(this.f18054a).mo3575a(), "com.crashlytics.settings.json"));
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                    CommonUtils.m13613a(fileWriter, "Failed to close settings writer.");
                } catch (Exception e2) {
                    e = e2;
                    closeable = fileWriter;
                    try {
                        C2766c.m13524h().mo3562e("Fabric", "Failed to cache settings", e);
                        CommonUtils.m13613a(closeable, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        e = th;
                        CommonUtils.m13613a(closeable, "Failed to close settings writer.");
                        throw e;
                    }
                } catch (Throwable th2) {
                    e = th2;
                    closeable = fileWriter;
                    CommonUtils.m13613a(closeable, "Failed to close settings writer.");
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                C2766c.m13524h().mo3562e("Fabric", "Failed to cache settings", e);
                CommonUtils.m13613a(closeable, "Failed to close settings writer.");
            }
        }
    }
}
