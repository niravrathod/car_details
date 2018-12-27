package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
class hk extends WebView {
    public hk(Context context) {
        super(context);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        zzbv.zzem().mo4178a(getContext(), settings);
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        try {
            getSettings().setJavaScriptEnabled(true);
        } catch (Throwable e) {
            zzaok.m10002b("Unable to enable Javascript.", e);
        }
        setLayerType(1, null);
    }

    /* renamed from: b */
    public void mo2409b(String str) {
        hm.m8941a(this, str);
    }

    public void loadUrl(String str) {
        try {
            super.loadUrl(str);
        } catch (Throwable e) {
            zzbv.zzeo().m9714a(e, "CoreWebView.loadUrl");
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (VERSION.SDK_INT >= 17) {
            super.addJavascriptInterface(obj, str);
        } else {
            zzalg.m21225a("Ignore addJavascriptInterface due to low Android version.");
        }
    }
}
