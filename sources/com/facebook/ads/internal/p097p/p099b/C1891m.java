package com.facebook.ads.internal.p097p.p099b;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;

/* renamed from: com.facebook.ads.internal.p.b.m */
public class C1891m {
    /* renamed from: a */
    static String m7208a(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Object fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        return TextUtils.isEmpty(fileExtensionFromUrl) ? null : singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }

    /* renamed from: a */
    private static String m7209a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    static void m7210a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable e) {
                Log.e("ProxyCache", "Error closing resource", e);
            }
        }
    }

    /* renamed from: a */
    static void m7211a(byte[] bArr, long j, int i) {
        C1886j.m7192a((Object) bArr, "Buffer must be not null!");
        boolean z = false;
        C1886j.m7193a(j >= 0, "Data offset must be positive!");
        if (i >= 0 && i <= bArr.length) {
            z = true;
        }
        C1886j.m7193a(z, "Length must be in range [0..buffer.length]");
    }

    /* renamed from: b */
    static String m7212b(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Throwable e) {
            throw new RuntimeException("Error encoding url", e);
        }
    }

    /* renamed from: c */
    static String m7213c(String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (Throwable e) {
            throw new RuntimeException("Error decoding url", e);
        }
    }

    /* renamed from: d */
    public static String m7214d(String str) {
        try {
            return C1891m.m7209a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
