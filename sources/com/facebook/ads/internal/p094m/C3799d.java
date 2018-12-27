package com.facebook.ads.internal.p094m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.p086e.C1783a;
import com.facebook.ads.internal.p086e.C1787d;
import com.facebook.ads.internal.p090i.C1806a;
import com.facebook.ads.internal.p094m.C1822a.C1821a;
import com.facebook.ads.internal.p101q.p102a.C1924n;
import com.facebook.ads.internal.p101q.p104c.C1950e;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.m.d */
public class C3799d implements C1827c {
    /* renamed from: a */
    private static final String f15222a = "d";
    /* renamed from: b */
    private static double f15223b = 0.0d;
    /* renamed from: c */
    private static String f15224c = null;
    /* renamed from: d */
    private static volatile boolean f15225d = false;
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: h */
    private static C1827c f15226h;
    /* renamed from: e */
    private final C1826b f15227e;
    /* renamed from: f */
    private final C1787d f15228f;
    /* renamed from: g */
    private final Context f15229g;

    private C3799d(Context context) {
        this.f15229g = context.getApplicationContext();
        this.f15228f = new C1787d(context);
        this.f15227e = new C1826b(context, new C3800g(context, this.f15228f));
        this.f15227e.m6909b();
        C3799d.m18993b(context);
    }

    /* renamed from: a */
    public static synchronized C1827c m18991a(Context context) {
        C1827c c1827c;
        synchronized (C3799d.class) {
            if (f15226h == null) {
                f15226h = new C3799d(context.getApplicationContext());
            }
            c1827c = f15226h;
        }
        return c1827c;
    }

    /* renamed from: a */
    private void m18992a(final C1822a c1822a) {
        if (c1822a.m6890g()) {
            this.f15228f.m6718a(c1822a.m6884a(), c1822a.m6891h().f5543c, c1822a.m6892i().toString(), c1822a.m6885b(), c1822a.m6886c(), c1822a.m6887d(), c1822a.m6888e(), new C1783a<String>(this) {
                /* renamed from: b */
                final /* synthetic */ C3799d f15221b;

                /* renamed from: a */
                public void mo1352a(int i, String str) {
                    super.mo1352a(i, str);
                }

                /* renamed from: a */
                public void m18989a(String str) {
                    super.mo1353a(str);
                    if (c1822a.m6889f()) {
                        this.f15221b.f15227e.m6908a();
                    } else {
                        this.f15221b.f15227e.m6909b();
                    }
                }
            });
            return;
        }
        String str = f15222a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attempting to log an invalid ");
        stringBuilder.append(c1822a.m6892i());
        stringBuilder.append(" event.");
        Log.e(str, stringBuilder.toString());
    }

    /* renamed from: b */
    private static synchronized void m18993b(Context context) {
        synchronized (C3799d.class) {
            if (f15225d) {
                return;
            }
            C1806a.m6805a(context).m6806a();
            C1924n.m7299a();
            f15223b = C1924n.m7300b();
            f15224c = C1924n.m7301c();
            f15225d = true;
        }
    }

    /* renamed from: a */
    public void mo1354a(String str) {
        new C1950e(this.f15229g).execute(new String[]{str});
    }

    /* renamed from: a */
    public void mo1355a(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.IMMEDIATE).m6877a(C1829f.IMPRESSION).m6880a(true).m6881a());
        }
    }

    /* renamed from: a */
    public void mo1356a(String str, Map<String, String> map, String str2, C1828e c1828e) {
        m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(c1828e).m6877a(C1829f.m6922a(str2)).m6880a(true).m6881a());
    }

    /* renamed from: b */
    public void mo1357b(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.IMMEDIATE).m6877a(C1829f.INVALIDATION).m6880a(false).m6881a());
        }
    }

    /* renamed from: c */
    public void mo1358c(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.IMMEDIATE).m6877a(C1829f.OPEN_LINK).m6880a(true).m6881a());
        }
    }

    /* renamed from: d */
    public void mo1359d(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.DEFERRED).m6877a(C1829f.OFF_TARGET_CLICK).m6880a(true).m6881a());
        }
    }

    /* renamed from: e */
    public void mo1360e(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.IMMEDIATE).m6877a(C1829f.VIDEO).m6880a(true).m6881a());
        }
    }

    /* renamed from: f */
    public void mo1361f(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.DEFERRED).m6877a(C1829f.NATIVE_VIEW).m6880a(false).m6881a());
        }
    }

    /* renamed from: g */
    public void mo1362g(String str, Map<String, String> map) {
        m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.DEFERRED).m6877a(C1829f.BROWSER_SESSION).m6880a(false).m6881a());
    }

    /* renamed from: h */
    public void mo1363h(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.IMMEDIATE).m6877a(C1829f.STORE).m6880a(true).m6881a());
        }
    }

    /* renamed from: i */
    public void mo1364i(String str, Map<String, String> map) {
        if (!TextUtils.isEmpty(str)) {
            m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.DEFERRED).m6877a(C1829f.CLOSE).m6880a(true).m6881a());
        }
    }

    /* renamed from: j */
    public void mo1365j(String str, Map<String, String> map) {
        m18992a(new C1821a().m6878a(str).m6875a(f15223b).m6882b(f15224c).m6879a((Map) map).m6876a(C1828e.IMMEDIATE).m6877a(C1829f.USER_RETURN).m6880a(true).m6881a());
    }
}
