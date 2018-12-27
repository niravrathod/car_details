package com.airbnb.lottie.network;

import android.content.Context;
import android.support.v4.p017f.C0429j;
import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.C0963e;
import com.airbnb.lottie.C0970j;
import com.airbnb.lottie.C0973k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.network.b */
public class C1000b {
    /* renamed from: a */
    private final Context f3367a;
    /* renamed from: b */
    private final String f3368b;
    /* renamed from: c */
    private final C0998a f3369c;

    /* renamed from: com.airbnb.lottie.network.b$1 */
    class C09991 implements Callable<C0970j<C0955d>> {
        /* renamed from: a */
        final /* synthetic */ C1000b f3366a;

        C09991(C1000b c1000b) {
            this.f3366a = c1000b;
        }

        public /* synthetic */ Object call() {
            return m4310a();
        }

        /* renamed from: a */
        public C0970j<C0955d> m4310a() {
            return this.f3366a.m4316a();
        }
    }

    /* renamed from: a */
    public static C0973k<C0955d> m4311a(Context context, String str) {
        return new C1000b(context, str).m4312b();
    }

    private C1000b(Context context, String str) {
        this.f3367a = context.getApplicationContext();
        this.f3368b = str;
        this.f3369c = new C0998a(this.f3367a, str);
    }

    /* renamed from: b */
    private C0973k<C0955d> m4312b() {
        return new C0973k(new C09991(this));
    }

    /* renamed from: a */
    public C0970j<C0955d> m4316a() {
        Object c = m4313c();
        if (c != null) {
            return new C0970j(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Animation for ");
        stringBuilder.append(this.f3368b);
        stringBuilder.append(" not found in cache. Fetching from network.");
        C0949c.m4076a(stringBuilder.toString());
        return m4314d();
    }

    /* renamed from: c */
    private C0955d m4313c() {
        C0429j a = this.f3369c.m4307a();
        if (a == null) {
            return null;
        }
        C0970j a2;
        FileExtension fileExtension = (FileExtension) a.f1442a;
        InputStream inputStream = (InputStream) a.f1443b;
        if (fileExtension == FileExtension.Zip) {
            a2 = C0963e.m4141a(new ZipInputStream(inputStream), this.f3368b);
        } else {
            a2 = C0963e.m4139a(inputStream, this.f3368b);
        }
        if (a2.m4210a() != null) {
            return (C0955d) a2.m4210a();
        }
        return null;
    }

    /* renamed from: d */
    private C0970j<C0955d> m4314d() {
        try {
            return m4315e();
        } catch (Throwable e) {
            return new C0970j(e);
        }
    }

    /* renamed from: e */
    private C0970j m4315e() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fetching ");
        stringBuilder.append(this.f3368b);
        C0949c.m4076a(stringBuilder.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f3368b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        if (httpURLConnection.getErrorStream() == null) {
            if (httpURLConnection.getResponseCode() == 200) {
                FileExtension fileExtension;
                C0970j a;
                String contentType = httpURLConnection.getContentType();
                Object obj = -1;
                int hashCode = contentType.hashCode();
                boolean z = true;
                if (hashCode != -1248325150) {
                    if (hashCode == -43840953) {
                        if (contentType.equals("application/json")) {
                            obj = 1;
                        }
                    }
                } else if (contentType.equals("application/zip")) {
                    obj = null;
                }
                if (obj != null) {
                    C0949c.m4076a("Received json response.");
                    fileExtension = FileExtension.Json;
                    a = C0963e.m4139a(new FileInputStream(new File(this.f3369c.m4308a(httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.f3368b);
                } else {
                    C0949c.m4076a("Handling zip response.");
                    fileExtension = FileExtension.Zip;
                    a = C0963e.m4141a(new ZipInputStream(new FileInputStream(this.f3369c.m4308a(httpURLConnection.getInputStream(), fileExtension))), this.f3368b);
                }
                if (a.m4210a() != null) {
                    this.f3369c.m4309a(fileExtension);
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Completed fetch from network. Success: ");
                if (a.m4210a() == null) {
                    z = false;
                }
                stringBuilder2.append(z);
                C0949c.m4076a(stringBuilder2.toString());
                return a;
            }
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder stringBuilder3 = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                stringBuilder3.append(readLine);
                stringBuilder3.append('\n');
            } else {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("Unable to fetch ");
                stringBuilder4.append(this.f3368b);
                stringBuilder4.append(". Failed with ");
                stringBuilder4.append(httpURLConnection.getResponseCode());
                stringBuilder4.append("\n");
                stringBuilder4.append(stringBuilder3);
                return new C0970j(new IllegalArgumentException(stringBuilder4.toString()));
            }
        }
    }
}
