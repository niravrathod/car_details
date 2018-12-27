package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.p126c.C2163a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.e */
public final class C2369e {
    /* renamed from: a */
    public final Uri f7513a;
    /* renamed from: b */
    public final byte[] f7514b;
    /* renamed from: c */
    public final long f7515c;
    /* renamed from: d */
    public final long f7516d;
    /* renamed from: e */
    public final long f7517e;
    /* renamed from: f */
    public final String f7518f;
    /* renamed from: g */
    public final int f7519g;

    public C2369e(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C2369e(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C2369e(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        C2163a.m7916a(j >= 0);
        C2163a.m7916a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        C2163a.m7916a(z);
        this.f7513a = uri;
        this.f7514b = bArr;
        this.f7515c = j;
        this.f7516d = j2;
        this.f7517e = j3;
        this.f7518f = str;
        this.f7519g = i;
    }

    /* renamed from: a */
    public boolean m8703a(int i) {
        return (this.f7519g & i) == i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataSpec[");
        stringBuilder.append(this.f7513a);
        stringBuilder.append(", ");
        stringBuilder.append(Arrays.toString(this.f7514b));
        stringBuilder.append(", ");
        stringBuilder.append(this.f7515c);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7516d);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7517e);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7518f);
        stringBuilder.append(", ");
        stringBuilder.append(this.f7519g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
