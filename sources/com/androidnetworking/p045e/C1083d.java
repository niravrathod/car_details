package com.androidnetworking.p045e;

import android.content.Context;
import android.net.TrafficStats;
import com.androidnetworking.common.C1053a;
import com.androidnetworking.common.C1056c;
import com.androidnetworking.error.ANError;
import com.androidnetworking.p044d.C1057a;
import com.androidnetworking.p046f.C1090c;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.C2981s;
import okhttp3.C2983t;
import okhttp3.C2983t.C2982a;
import okhttp3.C2988w;
import okhttp3.C2990y;
import okhttp3.C2990y.C2989a;
import okhttp3.C2991z;
import okhttp3.aa;

/* renamed from: com.androidnetworking.e.d */
public final class C1083d {
    /* renamed from: a */
    public static C2988w f3580a = C1083d.m4568a();
    /* renamed from: b */
    public static String f3581b = null;

    /* renamed from: a */
    public static aa m4567a(C1053a c1053a) {
        C1053a c1053a2 = c1053a;
        try {
            C2989a a = new C2989a().m14608a(c1053a.m4473d());
            C1083d.m4570a(a, c1053a2);
            C2991z c2991z = null;
            switch (c1053a.m4467b()) {
                case 0:
                    a = a.m14607a();
                    break;
                case 1:
                    c2991z = c1053a.m4489t();
                    a = a.m14614a(c2991z);
                    break;
                case 2:
                    c2991z = c1053a.m4489t();
                    a = a.m14619c(c2991z);
                    break;
                case 3:
                    c2991z = c1053a.m4489t();
                    a = a.m14618b(c2991z);
                    break;
                case 4:
                    a = a.m14615b();
                    break;
                case 5:
                    c2991z = c1053a.m4489t();
                    a = a.m14621d(c2991z);
                    break;
                case 6:
                    a = a.m14610a("OPTIONS", null);
                    break;
                default:
                    break;
            }
            if (c1053a.m4484o() != null) {
                a.m14612a(c1053a.m4484o());
            }
            C2990y c = a.m14620c();
            if (c1053a.m4477h() != null) {
                c1053a2.m4465a(c1053a.m4477h().m14579A().m14570a(f3580a.m14588h()).m14573a().m14581a(c));
            } else {
                c1053a2.m4465a(f3580a.m14581a(c));
            }
            long currentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            aa a2 = c1053a.m4486q().mo3689a();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C1057a a3;
            long b;
            if (a2.m14020k() == null) {
                currentTimeMillis = TrafficStats.getTotalRxBytes();
                if (totalRxBytes != -1) {
                    if (currentTimeMillis != -1) {
                        currentTimeMillis -= totalRxBytes;
                        C1056c.m4500a().m4503a(currentTimeMillis, currentTimeMillis2);
                        a3 = c1053a.m4457a();
                        b = (c2991z != null || c2991z.mo913b() == 0) ? -1 : c2991z.mo913b();
                        C1090c.m4595a(a3, currentTimeMillis2, b, a2.m14017h().mo915b(), false);
                    }
                }
                currentTimeMillis = a2.m14017h().mo915b();
                C1056c.m4500a().m4503a(currentTimeMillis, currentTimeMillis2);
                a3 = c1053a.m4457a();
                if (c2991z != null) {
                }
                C1090c.m4595a(a3, currentTimeMillis2, b, a2.m14017h().mo915b(), false);
            } else if (c1053a.m4457a() != null) {
                if (a2.m14019j() == null) {
                    C1090c.m4595a(c1053a.m4457a(), currentTimeMillis2, 0, 0, true);
                } else {
                    a3 = c1053a.m4457a();
                    b = (c2991z == null || c2991z.mo913b() == 0) ? -1 : c2991z.mo913b();
                    C1090c.m4595a(a3, currentTimeMillis2, b, 0, true);
                }
            }
            return a2;
        } catch (Throwable e) {
            throw new ANError(e);
        }
    }

    /* renamed from: b */
    public static aa m4571b(C1053a c1053a) {
        final C1053a c1053a2 = c1053a;
        try {
            C2988w a;
            C2989a a2 = new C2989a().m14608a(c1053a.m4473d());
            C1083d.m4570a(a2, c1053a2);
            a2 = a2.m14607a();
            if (c1053a.m4484o() != null) {
                a2.m14612a(c1053a.m4484o());
            }
            C2990y c = a2.m14620c();
            if (c1053a.m4477h() != null) {
                a = c1053a.m4477h().m14579A().m14570a(f3580a.m14588h()).m14575b(new C2983t() {
                    /* renamed from: a */
                    public aa mo910a(C2982a c2982a) {
                        c2982a = c2982a.mo3618a(c2982a.mo3619a());
                        return c2982a.m14018i().m14000a(new C3341g(c2982a.m14017h(), c1053a2.m4479j())).m14004a();
                    }
                }).m14573a();
            } else {
                a = f3580a.m14579A().m14575b(new C2983t() {
                    /* renamed from: a */
                    public aa mo910a(C2982a c2982a) {
                        c2982a = c2982a.mo3618a(c2982a.mo3619a());
                        return c2982a.m14018i().m14000a(new C3341g(c2982a.m14017h(), c1053a2.m4479j())).m14004a();
                    }
                }).m14573a();
            }
            c1053a2.m4465a(a.m14581a(c));
            long currentTimeMillis = System.currentTimeMillis();
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            aa a3 = c1053a.m4486q().mo3689a();
            C1090c.m4596a(a3, c1053a.m4482m(), c1053a.m4483n());
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (a3.m14020k() == null) {
                currentTimeMillis = TrafficStats.getTotalRxBytes();
                if (totalRxBytes != -1) {
                    if (currentTimeMillis != -1) {
                        currentTimeMillis -= totalRxBytes;
                        C1056c.m4500a().m4503a(currentTimeMillis, currentTimeMillis2);
                        C1090c.m4595a(c1053a.m4457a(), currentTimeMillis2, -1, a3.m14017h().mo915b(), false);
                    }
                }
                currentTimeMillis = a3.m14017h().mo915b();
                C1056c.m4500a().m4503a(currentTimeMillis, currentTimeMillis2);
                C1090c.m4595a(c1053a.m4457a(), currentTimeMillis2, -1, a3.m14017h().mo915b(), false);
            } else if (c1053a.m4457a() != null) {
                C1090c.m4595a(c1053a.m4457a(), currentTimeMillis2, -1, 0, true);
            }
            return a3;
        } catch (Throwable e) {
            Throwable th = e;
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c1053a.m4482m());
                stringBuilder.append(File.separator);
                stringBuilder.append(c1053a.m4483n());
                File file = new File(stringBuilder.toString());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            throw new ANError(th);
        }
    }

    /* renamed from: c */
    public static aa m4573c(C1053a c1053a) {
        C1053a c1053a2 = c1053a;
        try {
            C2989a a = new C2989a().m14608a(c1053a.m4473d());
            C1083d.m4570a(a, c1053a2);
            C2991z u = c1053a.m4490u();
            long b = u.mo913b();
            a = a.m14614a(new C3340f(u, c1053a.m4481l()));
            if (c1053a.m4484o() != null) {
                a.m14612a(c1053a.m4484o());
            }
            C2990y c = a.m14620c();
            if (c1053a.m4477h() != null) {
                c1053a2.m4465a(c1053a.m4477h().m14579A().m14570a(f3580a.m14588h()).m14573a().m14581a(c));
            } else {
                c1053a2.m4465a(f3580a.m14581a(c));
            }
            long currentTimeMillis = System.currentTimeMillis();
            aa a2 = c1053a.m4486q().mo3689a();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (c1053a.m4457a() != null) {
                if (a2.m14020k() == null) {
                    C1090c.m4595a(c1053a.m4457a(), currentTimeMillis2, b, a2.m14017h().mo915b(), false);
                } else if (a2.m14019j() == null) {
                    C1090c.m4595a(c1053a.m4457a(), currentTimeMillis2, 0, 0, true);
                } else {
                    C1057a a3 = c1053a.m4457a();
                    if (b == 0) {
                        b = -1;
                    }
                    C1090c.m4595a(a3, currentTimeMillis2, b, 0, true);
                }
            }
            return a2;
        } catch (Throwable e) {
            throw new ANError(e);
        }
    }

    /* renamed from: a */
    public static C2988w m4568a() {
        if (f3580a == null) {
            return C1083d.m4572b();
        }
        return f3580a;
    }

    /* renamed from: a */
    public static void m4570a(C2989a c2989a, C1053a c1053a) {
        if (c1053a.m4478i() != null) {
            c2989a.m14617b("User-Agent", c1053a.m4478i());
        } else if (f3581b != null) {
            c1053a.m4463a(f3581b);
            c2989a.m14617b("User-Agent", f3581b);
        }
        C2981s v = c1053a.m4491v();
        if (v != null) {
            c2989a.m14613a(v);
            if (c1053a.m4478i() != null && !v.m14551b().contains("User-Agent")) {
                c2989a.m14617b("User-Agent", c1053a.m4478i());
            }
        }
    }

    /* renamed from: b */
    public static C2988w m4572b() {
        return new C2988w().m14579A().m14569a(60, TimeUnit.SECONDS).m14574b(60, TimeUnit.SECONDS).m14576c(60, TimeUnit.SECONDS).m14573a();
    }

    /* renamed from: a */
    public static void m4569a(Context context) {
        f3580a = new C2988w().m14579A().m14570a(C1090c.m4594a(context, 10485760, "cache_an")).m14569a(60, TimeUnit.SECONDS).m14574b(60, TimeUnit.SECONDS).m14576c(60, TimeUnit.SECONDS).m14573a();
    }
}
