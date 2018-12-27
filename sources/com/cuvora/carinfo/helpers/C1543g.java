package com.cuvora.carinfo.helpers;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import okhttp3.C2984u;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.aa;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.cuvora.carinfo.helpers.g */
public class C1543g {
    /* renamed from: a */
    public static final String f4675a = "g";
    /* renamed from: i */
    private static C1543g f4676i;
    /* renamed from: b */
    private String f4677b;
    /* renamed from: c */
    private String f4678c;
    /* renamed from: d */
    private String f4679d;
    /* renamed from: e */
    private Integer f4680e;
    /* renamed from: f */
    private String f4681f;
    /* renamed from: g */
    private Context f4682g;
    /* renamed from: h */
    private C2988w f4683h;

    /* renamed from: com.cuvora.carinfo.helpers.g$a */
    public static class C1542a {
        /* renamed from: a */
        public static final C2984u f4673a = C2984u.m14560a("application/json; charset=utf-8");
        /* renamed from: b */
        public static final C2984u f4674b = C2984u.m14560a("text/plain; charset=utf-8");
    }

    /* renamed from: a */
    public static final void m5861a(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
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
        r0 = new com.cuvora.carinfo.helpers.g;	 Catch:{ Exception -> 0x0007 }
        r0.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x0007 }
        f4676i = r0;	 Catch:{ Exception -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.g.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    private C1543g(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
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
        r5 = this;
        r5.<init>();
        r5.f4682g = r6;
        r0 = r6.getCacheDir();
        r1 = new okhttp3.c;	 Catch:{ Exception -> 0x0012 }
        r2 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;	 Catch:{ Exception -> 0x0012 }
        r1.<init>(r0, r2);	 Catch:{ Exception -> 0x0012 }
        goto L_0x0013;
    L_0x0012:
        r1 = 0;
    L_0x0013:
        r0 = new java.net.CookieManager;
        r0.<init>();
        r2 = java.net.CookiePolicy.ACCEPT_ALL;
        r0.setCookiePolicy(r2);
        r0 = new com.franmontiel.persistentcookiejar.PersistentCookieJar;
        r2 = new com.franmontiel.persistentcookiejar.cache.SetCookieCache;
        r2.<init>();
        r3 = new com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
        r3.<init>(r6);
        r0.<init>(r2, r3);
        r2 = new okhttp3.w$a;
        r2.<init>();
        r2.m14570a(r1);
        r1 = java.util.concurrent.TimeUnit.SECONDS;
        r3 = 30;
        r2.m14574b(r3, r1);
        r1 = java.util.concurrent.TimeUnit.SECONDS;
        r2.m14569a(r3, r1);
        r1 = java.util.concurrent.TimeUnit.SECONDS;
        r2.m14576c(r3, r1);
        r2.m14571a(r0);
        r0 = new com.cuvora.carinfo.helpers.f;
        r0.<init>();
        r2.m14572a(r0);
        r0 = new okhttp3.logging.HttpLoggingInterceptor;
        r0.<init>();
        r1 = okhttp3.logging.HttpLoggingInterceptor.Level.f12580d;
        r0.m23904a(r1);
        r2.m14572a(r0);
        r0 = r2.m14573a();
        r5.f4683h = r0;
        r5.f4681f = r8;
        r5.f4678c = r7;
        r7 = com.cuvora.carinfo.helpers.C1570t.m5974a(r6);
        r5.f4679d = r7;
        r6 = com.cuvora.carinfo.helpers.C1570t.m5994b(r6);
        r5.f4680e = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.helpers.g.<init>(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static C1543g m5859a() {
        if (f4676i == null) {
            Log.e(f4675a, "HttpClient has not been initialized!");
        } else if (f4676i.f4677b == null) {
            f4676i.f4677b = C1570t.m6027l(f4676i.f4682g);
        }
        return f4676i;
    }

    /* renamed from: a */
    public <T> T m5865a(Class<T> cls, String str, String str2, C2991z c2991z, int... iArr) {
        return m5868a((Class) cls, m5870a(str, str2, false).m14614a(c2991z).m14620c(), iArr);
    }

    /* renamed from: a */
    public <T> T m5864a(Class<T> cls, String str, String str2, C2991z c2991z, boolean z, int... iArr) {
        return m5868a((Class) cls, m5870a(str, str2, z).m14614a(c2991z).m14620c(), iArr);
    }

    /* renamed from: a */
    public <T> T m5867a(Class<T> cls, String str, String str2, int... iArr) {
        return m5868a((Class) cls, m5870a(str, str2, false).m14620c(), iArr);
    }

    /* renamed from: a */
    public <T> T m5866a(Class<T> cls, String str, String str2, boolean z, int... iArr) {
        return m5868a((Class) cls, m5870a(str, str2, z).m14620c(), iArr);
    }

    /* renamed from: a */
    public <T> T m5868a(Class<T> cls, C2990y c2990y, int... iArr) {
        aa a = m5869a(c2990y, iArr);
        if (a.m14013d() == null) {
            C1570t.m5988a(a);
            iArr = new StringBuilder();
            iArr.append("Status Code: ");
            iArr.append(a.m14012c());
            throw new IOException(iArr.toString());
        } else if (InputStream.class.equals(cls) != null) {
            return a.m14017h().m14031d();
        } else {
            if (aa.class.equals(cls) != null) {
                return a;
            }
            if (String.class.equals(cls) != null) {
                return a.m14017h().m14033f();
            }
            if (JSONObject.class.equals(cls) != null) {
                try {
                    return new JSONObject(a.m14017h().m14033f());
                } catch (Class<T> cls2) {
                    Log.e(f4675a, cls2.getMessage(), cls2);
                    return null;
                }
            } else if (JSONArray.class.equals(cls2) != null) {
                try {
                    return new JSONArray(a.m14017h().m14033f());
                } catch (Class<T> cls22) {
                    Log.e(f4675a, cls22.getMessage(), cls22);
                    return null;
                }
            } else {
                C1570t.m5988a(a);
                iArr = new StringBuilder();
                iArr.append("Unsupported Return Type: ");
                iArr.append(cls22.getCanonicalName());
                throw new RuntimeException(iArr.toString());
            }
        }
    }

    /* renamed from: a */
    public C2989a m5870a(String str, String str2, boolean z) {
        z = new C2989a();
        z.m14608a(str);
        if (this.f4678c.isEmpty() == null) {
            z.m14617b("src", this.f4678c);
        }
        z.m14617b("appVersion", Integer.toString(this.f4680e.intValue()));
        z.m14617b("apiKey", this.f4681f);
        z.m14617b("clientId", this.f4678c);
        z.m14617b("deviceId", this.f4679d);
        z.m14617b("ts", m5862b());
        str = m5863c();
        z.m14617b("salt", str);
        z.m14617b("auth", m5860a(str, str2));
        str = PreferenceManager.getDefaultSharedPreferences(this.f4682g).getString("KEY_TOKEN", null);
        if (str != null) {
            z.m14617b("fcmToken", str);
        }
        if (this.f4677b != null) {
            z.m14617b("userId", this.f4677b);
        }
        z.m14617b("mobile", C1570t.m6025j(this.f4682g));
        return z;
    }

    /* renamed from: b */
    private String m5862b() {
        return String.valueOf(Calendar.getInstance(TimeZone.getTimeZone("UTC")).getTime().getTime());
    }

    /* renamed from: c */
    private String m5863c() {
        return String.valueOf(new Random().nextInt(1000));
    }

    /* renamed from: a */
    private String m5860a(String str, String str2) {
        String str3 = "SHA-512";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f4678c);
        stringBuilder.append("|");
        stringBuilder.append("encCuvora-");
        stringBuilder.append(str);
        stringBuilder.append("|");
        stringBuilder.append(this.f4680e);
        stringBuilder.append("|");
        stringBuilder.append(str2);
        str = stringBuilder.toString().getBytes();
        str2 = new StringBuffer();
        try {
            MessageDigest instance = MessageDigest.getInstance(str3);
            instance.reset();
            instance.update(str);
            str = instance.digest();
            for (byte b : str) {
                String toHexString = Integer.toHexString(b & 255);
                if (toHexString.length() == 1) {
                    str2.append("0");
                }
                str2.append(toHexString);
            }
        } catch (String str4) {
            str4.printStackTrace();
        }
        return str2.toString();
    }

    /* renamed from: a */
    public aa m5869a(C2990y c2990y, int... iArr) {
        boolean z = false;
        iArr = iArr.length > 0 ? iArr[0] : 2;
        aa aaVar = null;
        int i = 0;
        while (i <= iArr && aaVar == null) {
            if (i > 0) {
                try {
                    Log.i(f4675a, "Retrying...");
                } catch (Throwable e) {
                    Log.e(f4675a, e.getMessage(), e);
                }
            }
            String str = f4675a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c2990y.m14624b());
            stringBuilder.append(" ");
            stringBuilder.append(c2990y.m14623a());
            Log.i(str, stringBuilder.toString());
            aa a = this.f4683h.m14581a(c2990y).mo3689a();
            if (a != null) {
                aaVar = a;
            }
            i++;
        }
        if (aaVar == null || aaVar.m14013d() == null) {
            iArr = new StringBuilder();
            iArr.append(c2990y.m14624b());
            iArr.append(" ");
            iArr.append(c2990y.m14623a());
            c2990y = iArr.toString();
            if (aaVar != null) {
                iArr = new StringBuilder();
                iArr.append(c2990y);
                iArr.append(" failed with code: ");
                iArr.append(aaVar.m14012c());
                iArr.append(". Attempts: ");
                iArr.append(i);
                c2990y = iArr.toString();
            } else {
                iArr = new StringBuilder();
                iArr.append(c2990y);
                iArr.append(" failed. Attempts: ");
                iArr.append(i);
                c2990y = iArr.toString();
            }
            Log.e(f4675a, c2990y);
            if (aaVar != null) {
                return aaVar;
            }
            throw new IOException(c2990y);
        }
        iArr = f4675a;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(c2990y.m14624b());
        stringBuilder2.append(" ");
        stringBuilder2.append(c2990y.m14623a());
        stringBuilder2.append(" completed with code: ");
        stringBuilder2.append(aaVar.m14012c());
        stringBuilder2.append(". Served from cache: ");
        if (aaVar.m14020k() != null) {
            z = true;
        }
        stringBuilder2.append(z);
        Log.i(iArr, stringBuilder2.toString());
        return aaVar;
    }
}
