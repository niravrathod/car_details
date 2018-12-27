package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public final class zzamg extends zzamf {
    /* renamed from: f */
    public final int mo4795f() {
        return 16974374;
    }

    /* renamed from: c */
    public final CookieManager mo5046c(Context context) {
        if (zzalw.m9852e() != null) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaok.m10002b("Failed to obtain CookieManager.", th);
            zzbv.zzeo().m9714a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public final zzash mo4176a(zzasg zzasg, zzhv zzhv, boolean z) {
        return new zzatg(zzasg, zzhv, z);
    }

    /* renamed from: a */
    public final WebResourceResponse mo5045a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
