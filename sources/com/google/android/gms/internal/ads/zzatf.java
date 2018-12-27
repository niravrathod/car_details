package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@zzaer
@TargetApi(11)
public class zzatf extends zzash {
    public zzatf(zzasg zzasg, zzhv zzhv, boolean z) {
        super(zzasg, zzhv, z);
    }

    /* renamed from: a */
    protected final WebResourceResponse m26376a(WebView webView, String str, Map<String, String> map) {
        if (webView instanceof zzasg) {
            zzasg zzasg = (zzasg) webView;
            if (this.a != null) {
                this.a.mo2322a(str, map, 1);
            }
            if ("mraid.js".equalsIgnoreCase(new File(str).getName())) {
                if (zzasg.mo4782u() != null) {
                    zzasg.mo4782u().mo2405n();
                }
                if (zzasg.mo4205s().m10134e() != null) {
                    str = (String) zzkd.m10713e().m10897a(zznw.f9682G);
                } else if (zzasg.mo4208z() != null) {
                    str = (String) zzkd.m10713e().m10897a(zznw.f9681F);
                } else {
                    str = (String) zzkd.m10713e().m10897a(zznw.f9680E);
                }
                zzbv.zzek();
                return zzalo.m9809c(zzasg.getContext(), zzasg.mo4204i().f19893a, str);
            }
            Map emptyMap;
            if (map == null) {
                emptyMap = Collections.emptyMap();
            }
            return super.m21381a(str, emptyMap);
        }
        zzaok.m10007e("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return null;
    }
}
