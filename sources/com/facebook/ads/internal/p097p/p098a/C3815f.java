package com.facebook.ads.internal.p097p.p098a;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.facebook.ads.internal.p.a.f */
public abstract class C3815f implements C1866q {
    /* renamed from: a */
    private final C1867r f15247a;

    public C3815f() {
        this(new C3816g());
    }

    public C3815f(C1867r c1867r) {
        this.f15247a = c1867r;
    }

    /* renamed from: a */
    public OutputStream mo1380a(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getOutputStream();
    }

    /* renamed from: a */
    public HttpURLConnection mo1381a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }

    /* renamed from: a */
    public void mo1382a(OutputStream outputStream, byte[] bArr) {
        outputStream.write(bArr);
    }

    /* renamed from: a */
    public void mo1383a(HttpURLConnection httpURLConnection, C1860j c1860j, String str) {
        httpURLConnection.setRequestMethod(c1860j.m7108c());
        httpURLConnection.setDoOutput(c1860j.m7107b());
        httpURLConnection.setDoInput(c1860j.m7106a());
        if (str != null) {
            httpURLConnection.setRequestProperty("Content-Type", str);
        }
        httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
    }

    /* renamed from: a */
    public boolean mo1384a(C1862m c1862m) {
        C1863n a = c1862m.m7113a();
        if (this.f15247a.mo1390a()) {
            this.f15247a.mo1388a("BasicRequestHandler.onError got");
            c1862m.printStackTrace();
        }
        return a != null && a.m7114a() > 0;
    }

    /* renamed from: a */
    public byte[] mo1385a(InputStream inputStream) {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: b */
    public InputStream mo1386b(HttpURLConnection httpURLConnection) {
        return httpURLConnection.getInputStream();
    }
}
