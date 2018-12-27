package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzauf {
    /* renamed from: a */
    public final String f9024a;
    /* renamed from: b */
    public final Uri f9025b;
    /* renamed from: c */
    public final Map<String, String> f9026c;
    /* renamed from: d */
    private final String f9027d;

    @TargetApi(21)
    public zzauf(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public zzauf(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private zzauf(String str, Uri uri, @Nullable String str2, @Nullable Map<String, String> map) {
        this.f9024a = str;
        this.f9025b = uri;
        if (str2 == null) {
            str2 = "GET";
        }
        this.f9027d = str2;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f9026c = map;
    }
}
