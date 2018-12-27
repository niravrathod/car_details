package io.branch.referral;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.j256.ormlite.stmt.query.SimpleComparison;
import io.branch.referral.Defines.Jsonkey;
import java.net.URLDecoder;
import java.util.HashMap;

public class InstallListener extends BroadcastReceiver {
    /* renamed from: a */
    static boolean f11422a = false;
    /* renamed from: b */
    private static String f11423b = "bnc_no_value";
    /* renamed from: c */
    private static C2712a f11424c;
    /* renamed from: d */
    private static boolean f11425d;
    /* renamed from: e */
    private static boolean f11426e;

    /* renamed from: io.branch.referral.InstallListener$1 */
    static class C27111 implements Runnable {
        C27111() {
        }

        public void run() {
            InstallListener.m13141c();
        }
    }

    /* renamed from: io.branch.referral.InstallListener$a */
    interface C2712a {
        /* renamed from: f */
        void mo3531f();
    }

    /* renamed from: io.branch.referral.InstallListener$b */
    private static class C2714b {
        /* renamed from: a */
        private Object f11420a;
        /* renamed from: b */
        private Context f11421b;

        /* renamed from: io.branch.referral.InstallListener$b$1 */
        class C27131 implements InstallReferrerStateListener {
            /* renamed from: a */
            final /* synthetic */ C2714b f11419a;

            C27131(C2714b c2714b) {
                this.f11419a = c2714b;
            }
        }

        private C2714b(Context context) {
            this.f11421b = context;
        }

        /* renamed from: a */
        private boolean m13135a() {
            try {
                InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f11421b).build();
                this.f11420a = build;
                build.startConnection(new C27131(this));
                return true;
            } catch (Throwable th) {
                C2754n.m13344b("BranchSDK", th.getMessage());
                return false;
            }
        }
    }

    /* renamed from: a */
    public static void m13138a(Context context, long j, C2712a c2712a) {
        f11424c = c2712a;
        if (f11422a != null) {
            m13141c();
            return;
        }
        f11425d = true;
        f11426e = new C2714b(context).m13135a();
        new Handler().postDelayed(new C27111(), j);
    }

    public void onReceive(Context context, Intent intent) {
        m13139a(context, intent.getStringExtra("referrer"), 0, 0);
        if (f11425d != null && f11426e == null) {
            m13141c();
        }
    }

    /* renamed from: a */
    private static void m13139a(Context context, String str, long j, long j2) {
        context = C2754n.m13342a(context);
        if (j > 0) {
            context.m13363a("bnc_referrer_click_ts", j);
        }
        if (j2 > 0) {
            context.m13363a("bnc_install_begin_ts", j2);
        }
        if (str != null) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
                j = new HashMap();
                for (String str2 : str.split("&")) {
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = SimpleComparison.EQUAL_TO_OPERATION;
                        if (!str2.contains(SimpleComparison.EQUAL_TO_OPERATION) && str2.contains("-")) {
                            str3 = "-";
                        }
                        String[] split = str2.split(str3);
                        if (split.length > 1) {
                            j.put(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                        }
                    }
                }
                if (j.containsKey(Jsonkey.LinkClickID.m13131a())) {
                    f11423b = (String) j.get(Jsonkey.LinkClickID.m13131a());
                    context.m13389j(f11423b);
                }
                if (j.containsKey(Jsonkey.IsFullAppConv.m13131a()) && j.containsKey(Jsonkey.ReferringLink.m13131a())) {
                    context.m13369b(Boolean.parseBoolean((String) j.get(Jsonkey.IsFullAppConv.m13131a())));
                    context.m13395m((String) j.get(Jsonkey.ReferringLink.m13131a()));
                }
                if (j.containsKey(Jsonkey.GoogleSearchInstallReferrer.m13131a())) {
                    context.m13391k((String) j.get(Jsonkey.GoogleSearchInstallReferrer.m13131a()));
                    context.m13392l(str);
                }
            } catch (Context context2) {
                context2.printStackTrace();
            } catch (Context context22) {
                context22.printStackTrace();
                Log.w("BranchSDK", "Illegal characters in url encoded string");
            }
        }
    }

    /* renamed from: a */
    public static String m13137a() {
        return f11423b;
    }

    /* renamed from: c */
    private static void m13141c() {
        f11422a = true;
        if (f11424c != null) {
            f11424c.mo3531f();
            f11424c = null;
            f11422a = false;
            f11425d = false;
            f11426e = false;
        }
    }
}
