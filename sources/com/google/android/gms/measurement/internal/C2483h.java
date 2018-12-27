package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.measurement.internal.h */
final class C2483h implements Runnable {
    /* renamed from: a */
    private final URL f10629a;
    /* renamed from: b */
    private final byte[] f10630b;
    /* renamed from: c */
    private final C2481f f10631c;
    /* renamed from: d */
    private final String f10632d;
    /* renamed from: e */
    private final Map<String, String> f10633e;
    /* renamed from: f */
    private final /* synthetic */ zzat f10634f;

    public C2483h(zzat zzat, String str, URL url, byte[] bArr, Map<String, String> map, C2481f c2481f) {
        this.f10634f = zzat;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(c2481f);
        this.f10629a = url;
        this.f10630b = bArr;
        this.f10631c = c2481f;
        this.f10632d = str;
        this.f10633e = map;
    }

    public final void run() {
        HttpURLConnection a;
        Map map;
        Throwable th;
        Throwable e;
        int i;
        this.f10634f.mo4394c();
        OutputStream outputStream = null;
        try {
            a = this.f10634f.m29505a(this.f10629a);
            try {
                if (this.f10633e != null) {
                    for (Entry entry : this.f10633e.entrySet()) {
                        a.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.f10630b != null) {
                    byte[] b = this.f10634f.mo4964g().m29787b(this.f10630b);
                    this.f10634f.mo3172r().m28555x().m12355a("Uploading data. size", Integer.valueOf(b.length));
                    a.setDoOutput(true);
                    a.addRequestProperty("Content-Encoding", "gzip");
                    a.setFixedLengthStreamingMode(b.length);
                    a.connect();
                    OutputStream outputStream2 = a.getOutputStream();
                    try {
                        outputStream2.write(b);
                        outputStream2.close();
                    } catch (Throwable e2) {
                        map = null;
                        th = e2;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.f10634f.mo3172r().v_().m12356a("Error closing HTTP compressed POST connection output stream. appId", zzap.m28525a(this.f10632d), e3);
                            }
                        }
                        if (a != null) {
                            a.disconnect();
                        }
                        this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, th, null, map));
                    } catch (Throwable th2) {
                        e2 = th2;
                        map = null;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e32) {
                                this.f10634f.mo3172r().v_().m12356a("Error closing HTTP compressed POST connection output stream. appId", zzap.m28525a(this.f10632d), e32);
                            }
                        }
                        if (a != null) {
                            a.disconnect();
                        }
                        this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, null, null, map));
                        throw e2;
                    }
                }
                i = a.getResponseCode();
            } catch (IOException e4) {
                e2 = e4;
                map = null;
                th = e2;
                i = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, th, null, map));
            } catch (Throwable th3) {
                e2 = th3;
                map = null;
                i = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, null, null, map));
                throw e2;
            }
            try {
                map = a.getHeaderFields();
                try {
                    byte[] a2 = zzat.m29504a(a);
                    if (a != null) {
                        a.disconnect();
                    }
                    this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, null, a2, map));
                } catch (IOException e5) {
                    e2 = e5;
                    th = e2;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, th, null, map));
                } catch (Throwable th4) {
                    e2 = th4;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (a != null) {
                        a.disconnect();
                    }
                    this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, null, null, map));
                    throw e2;
                }
            } catch (IOException e6) {
                e2 = e6;
                map = null;
                th = e2;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, th, null, map));
            } catch (Throwable th5) {
                e2 = th5;
                map = null;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (a != null) {
                    a.disconnect();
                }
                this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, null, null, map));
                throw e2;
            }
        } catch (IOException e7) {
            e2 = e7;
            a = null;
            map = a;
            th = e2;
            i = 0;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, th, null, map));
        } catch (Throwable th6) {
            e2 = th6;
            a = null;
            map = a;
            i = 0;
            if (outputStream != null) {
                outputStream.close();
            }
            if (a != null) {
                a.disconnect();
            }
            this.f10634f.mo3171q().m28568a(new C2482g(this.f10632d, this.f10631c, i, null, null, map));
            throw e2;
        }
    }
}
