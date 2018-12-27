package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;

@TargetApi(9)
public class zzaly extends zzalw {
    public zzaly() {
        super();
    }

    /* renamed from: a */
    public final int mo2363a() {
        return 6;
    }

    /* renamed from: b */
    public final int mo2365b() {
        return 7;
    }

    /* renamed from: a */
    public boolean mo2364a(Request request) {
        request.setShowRunningNotification(true);
        return true;
    }
}
