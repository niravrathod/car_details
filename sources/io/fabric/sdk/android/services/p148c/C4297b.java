package io.fabric.sdk.android.services.p148c;

import android.content.Context;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import java.io.File;

/* renamed from: io.fabric.sdk.android.services.c.b */
public class C4297b implements C2786a {
    /* renamed from: a */
    private final Context f18019a;
    /* renamed from: b */
    private final String f18020b;
    /* renamed from: c */
    private final String f18021c;

    public C4297b(C2771h c2771h) {
        if (c2771h.getContext() != null) {
            this.f18019a = c2771h.getContext();
            this.f18020b = c2771h.getPath();
            c2771h = new StringBuilder();
            c2771h.append("Android/");
            c2771h.append(this.f18019a.getPackageName());
            this.f18021c = c2771h.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    /* renamed from: a */
    public File mo3575a() {
        return m23613a(this.f18019a.getFilesDir());
    }

    /* renamed from: a */
    File m23613a(File file) {
        if (file != null) {
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    C2766c.m13524h().mo3559d("Fabric", "Couldn't create file");
                }
            }
            return file;
        }
        C2766c.m13524h().mo3554a("Fabric", "Null File");
        return null;
    }
}
