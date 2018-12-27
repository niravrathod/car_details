package com.bumptech.glide.load.p057a.p058a;

import android.net.Uri;
import com.google.android.gms.ads.AdRequest;

/* renamed from: com.bumptech.glide.load.a.a.b */
public final class C1183b {
    /* renamed from: a */
    public static boolean m4913a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= AdRequest.MAX_CONTENT_URL_LENGTH && i2 <= 384;
    }

    /* renamed from: a */
    public static boolean m4914a(Uri uri) {
        return (uri == null || !"content".equals(uri.getScheme()) || "media".equals(uri.getAuthority()) == null) ? null : true;
    }

    /* renamed from: d */
    private static boolean m4917d(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    /* renamed from: b */
    public static boolean m4915b(Uri uri) {
        return (!C1183b.m4914a(uri) || C1183b.m4917d(uri) == null) ? null : true;
    }

    /* renamed from: c */
    public static boolean m4916c(Uri uri) {
        return (C1183b.m4914a(uri) && C1183b.m4917d(uri) == null) ? true : null;
    }
}
