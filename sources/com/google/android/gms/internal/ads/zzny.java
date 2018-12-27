package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.zzbv;
import java.util.LinkedHashMap;
import java.util.Map;

@zzaer
public final class zzny {
    /* renamed from: a */
    private String f9729a;
    /* renamed from: b */
    private Map<String, String> f9730b;
    /* renamed from: c */
    private Context f9731c = null;
    /* renamed from: d */
    private String f9732d = null;

    public zzny(Context context, String str) {
        Object packageName;
        this.f9731c = context;
        this.f9732d = str;
        this.f9729a = (String) zzkd.m10713e().m10897a(zznw.f9686K);
        this.f9730b = new LinkedHashMap();
        this.f9730b.put("s", "gmob_sdk");
        this.f9730b.put("v", "3");
        this.f9730b.put("os", VERSION.RELEASE);
        this.f9730b.put("sdk", VERSION.SDK);
        zzbv.zzek();
        this.f9730b.put("device", zzalo.m9805b());
        str = this.f9730b;
        String str2 = "app";
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        str.put(str2, packageName);
        str = this.f9730b;
        str2 = "is_lite_sdk";
        zzbv.zzek();
        str.put(str2, zzalo.m9827l(context) != null ? "1" : "0");
        context = zzbv.zzev().m9556a(this.f9731c);
        try {
            context.get();
            this.f9730b.put("network_coarse", Integer.toString(((zzahg) context.get()).f8685o));
            this.f9730b.put("network_fine", Integer.toString(((zzahg) context.get()).f8686p));
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* renamed from: a */
    final String m10904a() {
        return this.f9729a;
    }

    /* renamed from: b */
    final Context m10905b() {
        return this.f9731c;
    }

    /* renamed from: c */
    final String m10906c() {
        return this.f9732d;
    }

    /* renamed from: d */
    final Map<String, String> m10907d() {
        return this.f9730b;
    }
}
