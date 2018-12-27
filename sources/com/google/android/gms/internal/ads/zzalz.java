package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import java.util.Set;

@TargetApi(11)
public class zzalz extends zzaly {
    /* renamed from: a */
    public boolean mo4178a(Context context, WebSettings webSettings) {
        super.mo4178a(context, webSettings);
        return ((Boolean) zzanr.m9933a(context, new dk(this, context, webSettings))).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo4181c(View view) {
        view.setLayerType(1, null);
        return true;
    }

    /* renamed from: b */
    public final boolean mo4180b(View view) {
        view.setLayerType(0, null);
        return true;
    }

    /* renamed from: a */
    public final boolean mo4179a(Window window) {
        window.setFlags(16777216, 16777216);
        return true;
    }

    /* renamed from: a */
    public zzash mo4176a(zzasg zzasg, zzhv zzhv, boolean z) {
        return new zzate(zzasg, zzhv, z);
    }

    /* renamed from: a */
    public final Set<String> mo4177a(Uri uri) {
        return uri.getQueryParameterNames();
    }

    /* renamed from: a */
    public final boolean mo2364a(Request request) {
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(1);
        return true;
    }
}
