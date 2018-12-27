package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

@zzaer
@TargetApi(8)
public class zzalw {
    /* renamed from: a */
    public int mo2363a() {
        return 0;
    }

    /* renamed from: a */
    public String mo4992a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo4794a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public boolean mo2364a(Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo4178a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo5033a(View view) {
        if (view.getWindowToken() == null) {
            if (view.getWindowVisibility() == 8) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo4179a(Window window) {
        return false;
    }

    /* renamed from: b */
    public int mo2365b() {
        return 1;
    }

    /* renamed from: b */
    public void mo4993b(Context context) {
    }

    /* renamed from: b */
    public boolean mo4180b(View view) {
        return false;
    }

    /* renamed from: c */
    public int mo5034c() {
        return 5;
    }

    /* renamed from: c */
    public boolean mo4181c(View view) {
        return false;
    }

    /* renamed from: f */
    public int mo4795f() {
        return 0;
    }

    /* renamed from: a */
    public static boolean m9850a(zzasg zzasg) {
        if (zzasg == null) {
            return null;
        }
        zzasg.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m9851b(zzasg zzasg) {
        if (zzasg == null) {
            return null;
        }
        zzasg.onResume();
        return true;
    }

    /* renamed from: a */
    public zzash mo4176a(zzasg zzasg, zzhv zzhv, boolean z) {
        return new zzash(zzasg, zzhv, z);
    }

    /* renamed from: a */
    public Set<String> mo4177a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        uri = uri.getEncodedQuery();
        if (uri == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = uri.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = uri.length();
            }
            int indexOf2 = uri.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(uri.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < uri.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: a */
    public void mo4958a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: d */
    public LayoutParams mo5040d() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public void mo4957a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public Drawable mo4991a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: e */
    public static boolean m9852e() {
        int myUid = Process.myUid();
        if (myUid != 0) {
            if (myUid != 1000) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public CookieManager mo5046c(Context context) {
        if (m9852e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaok.m10002b("Failed to obtain CookieManager.", th);
            zzbv.zzeo().m9714a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo5045a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private zzalw() {
    }
}
