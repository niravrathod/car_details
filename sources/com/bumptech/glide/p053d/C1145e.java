package com.bumptech.glide.p053d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.d.e */
public final class C1145e {
    /* renamed from: a */
    private final Context f3750a;

    public C1145e(Context context) {
        this.f3750a = context;
    }

    /* renamed from: a */
    public List<C3367c> m4791a() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        List<C3367c> arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f3750a.getPackageManager().getApplicationInfo(this.f3750a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Got null app info metadata");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got app info metadata: ");
                stringBuilder.append(applicationInfo.metaData);
                Log.v("ManifestParser", stringBuilder.toString());
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(C1145e.m4789a(str));
                    if (Log.isLoggable("ManifestParser", 3)) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Loaded Glide module: ");
                        stringBuilder2.append(str);
                        Log.d("ManifestParser", stringBuilder2.toString());
                    }
                }
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Finished loading Glide modules");
            }
            return arrayList;
        } catch (Throwable e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    /* renamed from: a */
    private static C3367c m4789a(String str) {
        try {
            str = Class.forName(str);
            Object obj = null;
            try {
                obj = str.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                C1145e.m4790a(str, e);
            } catch (Exception e2) {
                C1145e.m4790a(str, e2);
            } catch (Exception e22) {
                C1145e.m4790a(str, e22);
            } catch (Exception e222) {
                C1145e.m4790a(str, e222);
            }
            if ((obj instanceof C3367c) != null) {
                return (C3367c) obj;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expected instanceof GlideModule, but found: ");
            stringBuilder.append(obj);
            throw new RuntimeException(stringBuilder.toString());
        } catch (String str2) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", str2);
        }
    }

    /* renamed from: a */
    private static void m4790a(Class<?> cls, Exception exception) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to instantiate GlideModule implementation for ");
        stringBuilder.append(cls);
        throw new RuntimeException(stringBuilder.toString(), exception);
    }
}
