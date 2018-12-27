package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.PlatformVersion;

@zzaer
@TargetApi(11)
public final class zzary extends WebChromeClient {
    /* renamed from: a */
    private final zzasg f9010a;

    public zzary(zzasg zzasg) {
        this.f9010a = zzasg;
    }

    /* renamed from: a */
    private final boolean m10090a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            if (!(this.f9010a == null || this.f9010a.mo4782u() == null || this.f9010a.mo4782u().mo2389a() == null)) {
                zzw a = this.f9010a.mo4782u().mo2389a();
                if (!(a == null || a.zzcz())) {
                    str2 = new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(str3).length());
                    str2.append("window.");
                    str2.append(str);
                    str2.append("('");
                    str2.append(str3);
                    str2.append("')");
                    a.zzu(str2.toString());
                    return null;
                }
            }
            str = new Builder(context);
            str.setTitle(str2);
            if (z) {
                jsResult = new LinearLayout(context);
                jsResult.setOrientation(1);
                z = new TextView(context);
                z.setText(str3);
                str3 = new EditText(context);
                str3.setText(str4);
                jsResult.addView(z);
                jsResult.addView(str3);
                str.setView(jsResult).setPositiveButton(17039370, new gm(jsPromptResult, str3)).setNegativeButton(17039360, new gl(jsPromptResult)).setOnCancelListener(new gk(jsPromptResult)).create().show();
            } else {
                str.setMessage(str3).setPositiveButton(17039370, new gj(jsResult)).setNegativeButton(17039360, new gi(jsResult)).setOnCancelListener(new gh(jsResult)).create().show();
            }
        } catch (Context context2) {
            zzaok.m10004c("Fail to display Dialog.", context2);
        }
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        z2 = new WebView(webView.getContext());
        if (this.f9010a.mo4783v() != null) {
            z2.setWebViewClient(this.f9010a.mo4783v());
        }
        webViewTransport.setWebView(z2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof zzasg) {
            webView = ((zzasg) webView).mo4775q();
            if (webView == null) {
                zzaok.m10007e("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                webView.close();
                return;
            }
        }
        zzaok.m10007e("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(message).length() + 19) + String.valueOf(sourceId).length());
        stringBuilder.append("JS: ");
        stringBuilder.append(message);
        stringBuilder.append(" (");
        stringBuilder.append(sourceId);
        stringBuilder.append(":");
        stringBuilder.append(lineNumber);
        stringBuilder.append(")");
        message = stringBuilder.toString();
        if (message.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (gn.f8109a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                zzaok.m10003c(message);
                break;
            case 2:
                zzaok.m10007e(message);
                break;
            case 3:
            case 4:
                zzaok.m10005d(message);
                break;
            case 5:
                zzaok.m10001b(message);
                break;
            default:
                zzaok.m10005d(message);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        str = 5242880 - j3;
        if (str <= null) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, str), 1048576);
            } else if (j2 <= Math.min(1048576 - j, str)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > str || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        zzd q = this.f9010a.mo4775q();
        if (q == null) {
            zzaok.m10007e("Could not get ad overlay when hiding custom view.");
        } else {
            q.zzos();
        }
    }

    /* renamed from: a */
    private static Context m10089a(WebView webView) {
        if (!(webView instanceof zzasg)) {
            return webView.getContext();
        }
        zzasg zzasg = (zzasg) webView;
        Context d = zzasg.mo4199d();
        if (d != null) {
            return d;
        }
        return zzasg.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m10090a(m10089a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m10090a(m10089a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m10090a(m10089a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m10090a(m10089a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        j += 131072;
        if (5242880 - j2 < j) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        zzd q = this.f9010a.mo4775q();
        if (q == null) {
            zzaok.m10007e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        q.zza(view, customViewCallback);
        q.setRequestedOrientation(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            boolean z;
            zzbv.zzek();
            if (!zzalo.m9800a(this.f9010a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzbv.zzek();
                if (!zzalo.m9800a(this.f9010a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    @TargetApi(21)
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (PlatformVersion.isAtLeastLollipop()) {
            if (!((Boolean) zzkd.m10713e().m10897a(zznw.ao)).booleanValue()) {
                if (!(this.f9010a == null || this.f9010a.mo4782u() == null)) {
                    if (this.f9010a.mo4782u().mo2404m() != null) {
                        String[] a = this.f9010a.mo4782u().mo2404m().mo2323a(permissionRequest.getResources());
                        if (a.length > 0) {
                            permissionRequest.grant(a);
                            return;
                        } else {
                            permissionRequest.deny();
                            return;
                        }
                    }
                }
                super.onPermissionRequest(permissionRequest);
                return;
            }
        }
        super.onPermissionRequest(permissionRequest);
    }
}
