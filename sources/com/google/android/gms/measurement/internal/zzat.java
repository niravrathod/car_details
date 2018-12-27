package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzat extends cg {
    /* renamed from: b */
    private final SSLSocketFactory f21634b;

    public zzat(zzfa zzfa) {
        super(zzfa);
        this.f21634b = VERSION.SDK_INT < 19 ? new cn() : null;
    }

    /* renamed from: e */
    protected final boolean mo4961e() {
        return false;
    }

    /* renamed from: f */
    public final boolean m29511f() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r2.m28438k();
        r0 = r2.mo3170n();
        r1 = "connectivity";
        r0 = r0.getSystemService(r1);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.getActiveNetworkInfo();	 Catch:{ SecurityException -> 0x0014 }
        goto L_0x0015;
    L_0x0014:
        r0 = 0;
    L_0x0015:
        if (r0 == 0) goto L_0x001f;
    L_0x0017:
        r0 = r0.isConnected();
        if (r0 == 0) goto L_0x001f;
    L_0x001d:
        r0 = 1;
        return r0;
    L_0x001f:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzat.f():boolean");
    }

    /* renamed from: a */
    private static byte[] m29504a(HttpURLConnection httpURLConnection) {
        Throwable th;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            httpURLConnection = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = httpURLConnection.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                bArr = byteArrayOutputStream.toByteArray();
                if (httpURLConnection != null) {
                    httpURLConnection.close();
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection != null) {
                    httpURLConnection.close();
                }
                throw th;
            }
        } catch (HttpURLConnection httpURLConnection2) {
            th = httpURLConnection2;
            httpURLConnection2 = null;
            if (httpURLConnection2 != null) {
                httpURLConnection2.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    protected final HttpURLConnection m29505a(URL url) {
        url = url.openConnection();
        if (url instanceof HttpURLConnection) {
            if (this.f21634b != null && (url instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) url).setSSLSocketFactory(this.f21634b);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ zzfg mo4964g() {
        return super.mo4964g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ cq mo4965h() {
        return super.mo4965h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ ct mo4966i() {
        return super.mo4966i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4394c() {
        super.mo4394c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4395d() {
        super.mo4395d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
