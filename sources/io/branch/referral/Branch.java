package io.branch.referral;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;
import io.branch.indexing.BranchUniversalObject;
import io.branch.indexing.C2697a;
import io.branch.referral.C2740g.C2739b;
import io.branch.referral.C2748j.C2746b;
import io.branch.referral.C2751k.C2750a;
import io.branch.referral.Defines.Jsonkey;
import io.branch.referral.Defines.RequestPath;
import io.branch.referral.InstallListener.C2712a;
import io.branch.referral.SharingHelper.SHARE_WITH;
import io.branch.referral.ac.C2728a;
import io.branch.referral.network.BranchRemoteInterface;
import io.branch.referral.util.LinkProperties;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Branch implements C2712a, C2728a, C2746b {
    /* renamed from: D */
    private static CUSTOM_REFERRABLE_SETTINGS f17910D = CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
    /* renamed from: G */
    private static String f17911G = "app.link";
    /* renamed from: H */
    private static int f17912H = 2500;
    /* renamed from: I */
    private static final String[] f17913I = new String[]{"extra_launch_uri", "branch_intent"};
    /* renamed from: N */
    private static boolean f17914N = true;
    /* renamed from: a */
    static boolean f17915a = false;
    /* renamed from: b */
    static Boolean f17916b = null;
    /* renamed from: c */
    static boolean f17917c = false;
    /* renamed from: d */
    static boolean f17918d = true;
    /* renamed from: k */
    private static boolean f17919k = false;
    /* renamed from: m */
    private static long f17920m = 1500;
    /* renamed from: n */
    private static Branch f17921n = null;
    /* renamed from: x */
    private static boolean f17922x = false;
    /* renamed from: y */
    private static boolean f17923y = false;
    /* renamed from: A */
    private boolean f17924A = false;
    /* renamed from: B */
    private SESSION_STATE f17925B = SESSION_STATE.UNINITIALISED;
    /* renamed from: C */
    private ShareLinkManager f17926C;
    /* renamed from: E */
    private final ConcurrentHashMap<String, String> f17927E;
    /* renamed from: F */
    private boolean f17928F = false;
    /* renamed from: J */
    private CountDownLatch f17929J = null;
    /* renamed from: K */
    private CountDownLatch f17930K = null;
    /* renamed from: L */
    private boolean f17931L = false;
    /* renamed from: M */
    private boolean f17932M = false;
    /* renamed from: O */
    private final ad f17933O;
    /* renamed from: e */
    final Object f17934e;
    /* renamed from: f */
    WeakReference<Activity> f17935f;
    /* renamed from: g */
    boolean f17936g = false;
    /* renamed from: h */
    String f17937h;
    /* renamed from: i */
    boolean f17938i = false;
    /* renamed from: j */
    private JSONObject f17939j;
    /* renamed from: l */
    private boolean f17940l = false;
    /* renamed from: o */
    private BranchRemoteInterface f17941o;
    /* renamed from: p */
    private C2754n f17942p;
    /* renamed from: q */
    private final ac f17943q;
    /* renamed from: r */
    private Context f17944r;
    /* renamed from: s */
    private Semaphore f17945s;
    /* renamed from: t */
    private final C2760w f17946t;
    /* renamed from: u */
    private int f17947u;
    /* renamed from: v */
    private boolean f17948v;
    /* renamed from: w */
    private Map<C2735e, String> f17949w;
    /* renamed from: z */
    private INTENT_STATE f17950z = INTENT_STATE.PENDING;

    private enum CUSTOM_REFERRABLE_SETTINGS {
        USE_DEFAULT,
        REFERRABLE,
        NON_REFERRABLE
    }

    private enum INTENT_STATE {
        PENDING,
        READY
    }

    private enum SESSION_STATE {
        INITIALISED,
        INITIALISING,
        UNINITIALISED
    }

    @TargetApi(14)
    /* renamed from: io.branch.referral.Branch$a */
    private class C2700a implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        final /* synthetic */ Branch f11310a;
        /* renamed from: b */
        private int f11311b;

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        private C2700a(Branch branch) {
            this.f11310a = branch;
            this.f11311b = null;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            this.f11310a.f17950z = this.f11310a.f17924A ? INTENT_STATE.PENDING : INTENT_STATE.READY;
            this.f11310a.f17932M = true;
            if (C2748j.m13306a().m13323b(activity.getApplicationContext()) != null) {
                C2748j.m13306a().m13320a((Context) activity);
            }
        }

        public void onActivityStarted(android.app.Activity r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r3 = this;
            r0 = r3.f11310a;
            r1 = r3.f11310a;
            r1 = r1.f17924A;
            if (r1 == 0) goto L_0x000d;
        L_0x000a:
            r1 = io.branch.referral.Branch.INTENT_STATE.PENDING;
            goto L_0x000f;
        L_0x000d:
            r1 = io.branch.referral.Branch.INTENT_STATE.READY;
        L_0x000f:
            r0.f17950z = r1;
            r0 = r3.f11310a;
            r0 = r0.f17925B;
            r1 = io.branch.referral.Branch.SESSION_STATE.INITIALISED;
            if (r0 != r1) goto L_0x0029;
        L_0x001c:
            r0 = io.branch.indexing.C2697a.m13035a();	 Catch:{ Exception -> 0x0028 }
            r1 = r3.f11310a;	 Catch:{ Exception -> 0x0028 }
            r1 = r1.f17937h;	 Catch:{ Exception -> 0x0028 }
            r0.m13060a(r4, r1);	 Catch:{ Exception -> 0x0028 }
            goto L_0x0029;
        L_0x0029:
            r0 = r3.f11311b;
            r1 = 1;
            if (r0 >= r1) goto L_0x005a;
        L_0x002e:
            r0 = r3.f11310a;
            r0 = r0.f17925B;
            r2 = io.branch.referral.Branch.SESSION_STATE.INITIALISED;
            if (r0 != r2) goto L_0x003f;
        L_0x0038:
            r0 = r3.f11310a;
            r2 = io.branch.referral.Branch.SESSION_STATE.UNINITIALISED;
            r0.f17925B = r2;
        L_0x003f:
            r0 = r3.f11310a;
            r0 = r0.f17944r;
            r0 = io.branch.referral.C2742i.m13287a(r0);
            if (r0 == 0) goto L_0x0054;
        L_0x004b:
            r0 = r3.f11310a;
            r0 = r0.f17942p;
            r0.m13353F();
        L_0x0054:
            r0 = r3.f11310a;
            r0.m23419c(r4);
            goto L_0x0072;
        L_0x005a:
            r0 = r3.f11310a;
            r2 = r4.getIntent();
            r0 = r0.m23401a(r2);
            if (r0 == 0) goto L_0x0072;
        L_0x0066:
            r0 = r3.f11310a;
            r2 = io.branch.referral.Branch.SESSION_STATE.UNINITIALISED;
            r0.f17925B = r2;
            r0 = r3.f11310a;
            r0.m23419c(r4);
        L_0x0072:
            r4 = r3.f11311b;
            r4 = r4 + r1;
            r3.f11311b = r4;
            r4 = r3.f11310a;
            r0 = 0;
            r4.f17932M = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a.onActivityStarted(android.app.Activity):void");
        }

        public void onActivityResumed(Activity activity) {
            if (this.f11310a.m23401a(activity.getIntent())) {
                this.f11310a.f17925B = SESSION_STATE.UNINITIALISED;
                this.f11310a.m23419c(activity);
            }
            this.f11310a.f17935f = new WeakReference(activity);
            if (this.f11310a.f17924A) {
                this.f11310a.f17950z = INTENT_STATE.READY;
                boolean z = (activity.getIntent() == null || this.f11310a.f17925B == SESSION_STATE.INITIALISED) ? false : true;
                this.f11310a.m23389a(activity, z);
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f11310a.f17926C != null) {
                this.f11310a.f17926C.m13197a(true);
            }
        }

        public void onActivityStopped(Activity activity) {
            C2697a.m13035a().m13059a(activity);
            this.f11311b -= 1;
            if (this.f11311b < 1) {
                this.f11310a.f17938i = false;
                this.f11310a.m23462d();
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f11310a.f17935f != null && this.f11310a.f17935f.get() == activity) {
                this.f11310a.f17935f.clear();
            }
            C2748j.m13306a().m13319a(activity);
        }
    }

    /* renamed from: io.branch.referral.Branch$b */
    public interface C2701b {
        /* renamed from: a */
        void mo1226a(String str, C2734d c2734d);
    }

    /* renamed from: io.branch.referral.Branch$c */
    public interface C2702c {
        /* renamed from: a */
        void mo1232a();

        /* renamed from: a */
        void mo1233a(String str);

        /* renamed from: a */
        void mo1234a(String str, String str2, C2734d c2734d);

        /* renamed from: b */
        void mo1235b();
    }

    /* renamed from: io.branch.referral.Branch$d */
    public interface C2703d {
        /* renamed from: a */
        void m13082a(JSONArray jSONArray, C2734d c2734d);
    }

    /* renamed from: io.branch.referral.Branch$f */
    public interface C2704f {
        /* renamed from: a */
        void mo1161a(JSONObject jSONObject, C2734d c2734d);
    }

    /* renamed from: io.branch.referral.Branch$g */
    public interface C2705g {
        /* renamed from: a */
        void m13084a(boolean z, C2734d c2734d);
    }

    /* renamed from: io.branch.referral.Branch$i */
    public interface C2706i {
        /* renamed from: a */
        boolean m13085a();
    }

    /* renamed from: io.branch.referral.Branch$j */
    public interface C2707j {
        /* renamed from: a */
        String m13086a(String str);

        /* renamed from: b */
        String m13087b(String str);
    }

    /* renamed from: io.branch.referral.Branch$k */
    public interface C2708k {
        /* renamed from: a */
        void m13088a(boolean z, C2734d c2734d);
    }

    /* renamed from: io.branch.referral.Branch$l */
    public static class C2709l {
        /* renamed from: a */
        C4277f f11312a;
        /* renamed from: b */
        private final Activity f11313b;
        /* renamed from: c */
        private final Branch f11314c;
        /* renamed from: d */
        private String f11315d;
        /* renamed from: e */
        private String f11316e;
        /* renamed from: f */
        private C2702c f11317f;
        /* renamed from: g */
        private C2707j f11318g;
        /* renamed from: h */
        private ArrayList<SHARE_WITH> f11319h;
        /* renamed from: i */
        private String f11320i;
        /* renamed from: j */
        private Drawable f11321j;
        /* renamed from: k */
        private String f11322k;
        /* renamed from: l */
        private Drawable f11323l;
        /* renamed from: m */
        private String f11324m;
        /* renamed from: n */
        private String f11325n;
        /* renamed from: o */
        private int f11326o;
        /* renamed from: p */
        private boolean f11327p;
        /* renamed from: q */
        private int f11328q;
        /* renamed from: r */
        private int f11329r;
        /* renamed from: s */
        private String f11330s;
        /* renamed from: t */
        private View f11331t;
        /* renamed from: u */
        private int f11332u;
        /* renamed from: v */
        private List<String> f11333v;
        /* renamed from: w */
        private List<String> f11334w;

        public C2709l(android.app.Activity r6, org.json.JSONObject r7) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
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
            r0 = 0;
            r5.f11317f = r0;
            r5.f11318g = r0;
            r1 = -1;
            r5.f11329r = r1;
            r5.f11330s = r0;
            r5.f11331t = r0;
            r1 = 50;
            r5.f11332u = r1;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r5.f11333v = r1;
            r1 = new java.util.ArrayList;
            r1.<init>();
            r5.f11334w = r1;
            r5.f11313b = r6;
            r1 = io.branch.referral.Branch.f17921n;
            r5.f11314c = r1;
            r1 = new io.branch.referral.f;
            r1.<init>(r6);
            r5.f11312a = r1;
            r1 = r7.keys();	 Catch:{ Exception -> 0x004c }
        L_0x0034:
            r2 = r1.hasNext();	 Catch:{ Exception -> 0x004c }
            if (r2 == 0) goto L_0x004c;	 Catch:{ Exception -> 0x004c }
        L_0x003a:
            r2 = r1.next();	 Catch:{ Exception -> 0x004c }
            r2 = (java.lang.String) r2;	 Catch:{ Exception -> 0x004c }
            r3 = r5.f11312a;	 Catch:{ Exception -> 0x004c }
            r4 = r7.get(r2);	 Catch:{ Exception -> 0x004c }
            r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x004c }
            r3.m13281a(r2, r4);	 Catch:{ Exception -> 0x004c }
            goto L_0x0034;
        L_0x004c:
            r7 = "";
            r5.f11315d = r7;
            r5.f11317f = r0;
            r5.f11318g = r0;
            r7 = new java.util.ArrayList;
            r7.<init>();
            r5.f11319h = r7;
            r5.f11320i = r0;
            r7 = r6.getApplicationContext();
            r0 = 17301573; // 0x1080045 float:2.4979448E-38 double:8.548113E-317;
            r7 = io.branch.referral.C2742i.m13285a(r7, r0);
            r5.f11321j = r7;
            r7 = "More...";
            r5.f11322k = r7;
            r6 = r6.getApplicationContext();
            r7 = 17301582; // 0x108004e float:2.4979474E-38 double:8.5481173E-317;
            r6 = io.branch.referral.C2742i.m13285a(r6, r7);
            r5.f11323l = r6;
            r6 = "Copy link";
            r5.f11324m = r6;
            r6 = "Copied link to clipboard!";
            r5.f11325n = r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.l.<init>(android.app.Activity, org.json.JSONObject):void");
        }

        public C2709l(Activity activity, C4277f c4277f) {
            this(activity, new JSONObject());
            this.f11312a = c4277f;
        }

        /* renamed from: a */
        public C2709l m13095a(String str) {
            this.f11315d = str;
            return this;
        }

        /* renamed from: b */
        public C2709l m13103b(String str) {
            this.f11316e = str;
            return this;
        }

        /* renamed from: a */
        public C2709l m13093a(C2702c c2702c) {
            this.f11317f = c2702c;
            return this;
        }

        /* renamed from: a */
        public C2709l m13094a(C2707j c2707j) {
            this.f11318g = c2707j;
            return this;
        }

        /* renamed from: a */
        public C2709l m13096a(ArrayList<SHARE_WITH> arrayList) {
            this.f11319h.addAll(arrayList);
            return this;
        }

        /* renamed from: c */
        public C2709l m13106c(String str) {
            this.f11320i = str;
            return this;
        }

        /* renamed from: a */
        public C2709l m13090a(Drawable drawable, String str) {
            this.f11321j = drawable;
            this.f11322k = str;
            return this;
        }

        /* renamed from: a */
        public C2709l m13091a(Drawable drawable, String str, String str2) {
            this.f11323l = drawable;
            this.f11324m = str;
            this.f11325n = str2;
            return this;
        }

        /* renamed from: a */
        public C2709l m13098a(boolean z) {
            this.f11327p = z;
            return this;
        }

        /* renamed from: a */
        public C2709l m13089a(int i) {
            this.f11328q = i;
            return this;
        }

        /* renamed from: b */
        public C2709l m13102b(int i) {
            this.f11329r = i;
            return this;
        }

        /* renamed from: d */
        public C2709l m13108d(String str) {
            this.f11330s = str;
            return this;
        }

        /* renamed from: a */
        public C2709l m13092a(View view) {
            this.f11331t = view;
            return this;
        }

        /* renamed from: c */
        public C2709l m13105c(int i) {
            this.f11332u = i;
            return this;
        }

        /* renamed from: a */
        public C2709l m13097a(List<String> list) {
            this.f11334w.addAll(list);
            return this;
        }

        /* renamed from: b */
        public C2709l m13104b(List<String> list) {
            this.f11333v.addAll(list);
            return this;
        }

        /* renamed from: d */
        public void m13110d(int i) {
            this.f11326o = i;
        }

        /* renamed from: a */
        public void m13100a(C4277f c4277f) {
            this.f11312a = c4277f;
        }

        /* renamed from: a */
        public void m13099a() {
            Branch.f17921n.m23393a(this);
        }

        /* renamed from: b */
        public Activity m13101b() {
            return this.f11313b;
        }

        /* renamed from: c */
        public ArrayList<SHARE_WITH> m13107c() {
            return this.f11319h;
        }

        /* renamed from: d */
        List<String> m13109d() {
            return this.f11334w;
        }

        /* renamed from: e */
        List<String> m13111e() {
            return this.f11333v;
        }

        /* renamed from: f */
        public String m13112f() {
            return this.f11315d;
        }

        /* renamed from: g */
        public String m13113g() {
            return this.f11316e;
        }

        /* renamed from: h */
        public C2702c m13114h() {
            return this.f11317f;
        }

        /* renamed from: i */
        public C2707j m13115i() {
            return this.f11318g;
        }

        /* renamed from: j */
        public String m13116j() {
            return this.f11320i;
        }

        /* renamed from: k */
        public Drawable m13117k() {
            return this.f11321j;
        }

        /* renamed from: l */
        public String m13118l() {
            return this.f11322k;
        }

        /* renamed from: m */
        public Drawable m13119m() {
            return this.f11323l;
        }

        /* renamed from: n */
        public String m13120n() {
            return this.f11324m;
        }

        /* renamed from: o */
        public String m13121o() {
            return this.f11325n;
        }

        /* renamed from: p */
        public C4277f m13122p() {
            return this.f11312a;
        }

        /* renamed from: q */
        public boolean m13123q() {
            return this.f11327p;
        }

        /* renamed from: r */
        public int m13124r() {
            return this.f11328q;
        }

        /* renamed from: s */
        public int m13125s() {
            return this.f11329r;
        }

        /* renamed from: t */
        public String m13126t() {
            return this.f11330s;
        }

        /* renamed from: u */
        public View m13127u() {
            return this.f11331t;
        }

        /* renamed from: v */
        public int m13128v() {
            return this.f11326o;
        }

        /* renamed from: w */
        public int m13129w() {
            return this.f11332u;
        }
    }

    /* renamed from: io.branch.referral.Branch$m */
    private class C2710m extends AsyncTask<ServerRequest, Void, ab> {
        /* renamed from: a */
        final /* synthetic */ Branch f11335a;

        private C2710m(Branch branch) {
            this.f11335a = branch;
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m13130a((ServerRequest[]) objArr);
        }

        /* renamed from: a */
        protected ab m13130a(ServerRequest... serverRequestArr) {
            BranchRemoteInterface h = this.f11335a.f17941o;
            JSONObject h2 = serverRequestArr[0].m13165h();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f11335a.f17942p.m13357a());
            stringBuilder.append("v1/url");
            return h.m13429a(h2, stringBuilder.toString(), RequestPath.GetURL.m13133a(), this.f11335a.f17942p.m13380f());
        }
    }

    /* renamed from: io.branch.referral.Branch$1 */
    class C42681 implements C2750a {
        /* renamed from: a */
        final /* synthetic */ Branch f17906a;

        C42681(Branch branch) {
            this.f17906a = branch;
        }

        /* renamed from: a */
        public void mo3524a(String str) {
            this.f17906a.f17942p.m13360a(Boolean.valueOf(true));
            if (str != null) {
                str = Uri.parse(str).getQueryParameter(Jsonkey.LinkClickID.m13131a());
                if (!TextUtils.isEmpty(str)) {
                    this.f17906a.f17942p.m13389j(str);
                }
            }
            this.f17906a.f17946t.m13487a(PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
            this.f17906a.m23440n();
        }
    }

    /* renamed from: io.branch.referral.Branch$2 */
    class C42692 implements C2739b {
        /* renamed from: a */
        final /* synthetic */ Branch f17907a;

        C42692(Branch branch) {
            this.f17907a = branch;
        }

        /* renamed from: a */
        public void mo3525a() {
            this.f17907a.f17946t.m13487a(PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
            this.f17907a.m23440n();
        }
    }

    /* renamed from: io.branch.referral.Branch$e */
    private class C4270e extends C2733c<Void, Void, ab> {
        /* renamed from: a */
        ServerRequest f17908a;
        /* renamed from: b */
        final /* synthetic */ Branch f17909b;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m23378a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m23379a((ab) obj);
        }

        public C4270e(Branch branch, ServerRequest serverRequest) {
            this.f17909b = branch;
            this.f17908a = serverRequest;
        }

        protected void onPreExecute() {
            super.onPreExecute();
            this.f17908a.mo3550q();
            this.f17908a.m13169l();
        }

        /* renamed from: a */
        protected ab m23378a(Void... voidArr) {
            voidArr = this.f17909b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f17908a.m13163f());
            stringBuilder.append("-");
            stringBuilder.append(Jsonkey.Queue_Wait_Time.m13131a());
            voidArr.m23453a(stringBuilder.toString(), String.valueOf(this.f17908a.m13172o()));
            this.f17908a.m13170m();
            if (this.f17909b.m23456a() != null && this.f17908a.mo3551t() == null) {
                return new ab(this.f17908a.m13163f(), -117);
            }
            if (this.f17908a.mo3537a() != null) {
                return this.f17909b.f17941o.m13428a(this.f17908a.mo3547g(), this.f17908a.m13167j(), this.f17908a.m13163f(), this.f17909b.f17942p.m13380f());
            }
            return this.f17909b.f17941o.m13429a(this.f17908a.m13149a(this.f17909b.f17927E), this.f17908a.mo3547g(), this.f17908a.m13163f(), this.f17909b.f17942p.m13380f());
        }

        /* renamed from: a */
        protected void m23379a(ab abVar) {
            super.onPostExecute(abVar);
            if (abVar != null) {
                try {
                    int a = abVar.m13211a();
                    this.f17909b.f17948v = true;
                    if (abVar.m13211a() == -117) {
                        this.f17908a.m13176s();
                        this.f17909b.f17946t.m13492b(this.f17908a);
                    } else if (a != 200) {
                        if (this.f17908a instanceof C4285t) {
                            this.f17909b.f17925B = SESSION_STATE.UNINITIALISED;
                        }
                        if (a != 400) {
                            if (a != 409) {
                                this.f17909b.f17948v = false;
                                ArrayList arrayList = new ArrayList();
                                for (int i = 0; i < this.f17909b.f17946t.m13484a(); i++) {
                                    arrayList.add(this.f17909b.f17946t.m13485a(i));
                                }
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ServerRequest serverRequest = (ServerRequest) it.next();
                                    if (serverRequest == null || !serverRequest.mo3540c()) {
                                        this.f17909b.f17946t.m13492b(serverRequest);
                                    }
                                }
                                this.f17909b.f17947u = 0;
                                Iterator it2 = arrayList.iterator();
                                while (it2.hasNext()) {
                                    ServerRequest serverRequest2 = (ServerRequest) it2.next();
                                    if (serverRequest2 != null) {
                                        serverRequest2.mo3535a(a, abVar.m13215d());
                                        if (serverRequest2.mo3540c()) {
                                            serverRequest2.mo3539b();
                                        }
                                    }
                                }
                            }
                        }
                        this.f17909b.f17946t.m13492b(this.f17908a);
                        if ((this.f17908a instanceof C4281p) != null) {
                            ((C4281p) this.f17908a).mo3546x();
                        } else {
                            Log.i("BranchSDK", "Branch API Error: Conflicting resource error code from API");
                            this.f17909b.m23388a(0, a);
                        }
                    } else {
                        this.f17909b.f17948v = true;
                        if (this.f17908a instanceof C4281p) {
                            if (abVar.m13213b() != null) {
                                this.f17909b.f17949w.put(((C4281p) this.f17908a).mo3543u(), abVar.m13213b().getString(ImagesContract.URL));
                            }
                        } else if (this.f17908a instanceof C4286u) {
                            this.f17909b.f17949w.clear();
                            this.f17909b.f17946t.m13494d();
                        }
                        this.f17909b.f17946t.m13491b();
                        if (!(this.f17908a instanceof C4285t)) {
                            if (!(this.f17908a instanceof C4284s)) {
                                this.f17908a.mo3536a(abVar, Branch.f17921n);
                            }
                        }
                        JSONObject b = abVar.m13213b();
                        if (b != null) {
                            Object obj;
                            if (this.f17909b.m23456a()) {
                                obj = null;
                            } else {
                                if (b.has(Jsonkey.SessionID.m13131a())) {
                                    this.f17909b.f17942p.m13376d(b.getString(Jsonkey.SessionID.m13131a()));
                                    obj = 1;
                                } else {
                                    obj = null;
                                }
                                if (b.has(Jsonkey.IdentityID.m13131a())) {
                                    if (!this.f17909b.f17942p.m13386i().equals(b.getString(Jsonkey.IdentityID.m13131a()))) {
                                        this.f17909b.f17949w.clear();
                                        this.f17909b.f17942p.m13378e(b.getString(Jsonkey.IdentityID.m13131a()));
                                        obj = 1;
                                    }
                                }
                                if (b.has(Jsonkey.DeviceFingerprintID.m13131a())) {
                                    this.f17909b.f17942p.m13372c(b.getString(Jsonkey.DeviceFingerprintID.m13131a()));
                                    obj = 1;
                                }
                            }
                            if (obj != null) {
                                this.f17909b.m23441o();
                            }
                            if (this.f17908a instanceof C4285t) {
                                this.f17909b.f17925B = SESSION_STATE.INITIALISED;
                                this.f17908a.mo3536a(abVar, Branch.f17921n);
                                if (!this.f17909b.f17936g && ((C4285t) this.f17908a).m23536a(abVar) == null) {
                                    this.f17909b.m23447t();
                                }
                                if (((C4285t) this.f17908a).mo3543u() != null) {
                                    this.f17909b.f17936g = true;
                                }
                                if (this.f17909b.f17930K != null) {
                                    this.f17909b.f17930K.countDown();
                                }
                                if (this.f17909b.f17929J != null) {
                                    this.f17909b.f17929J.countDown();
                                }
                            } else {
                                this.f17908a.mo3536a(abVar, Branch.f17921n);
                            }
                        }
                    }
                    this.f17909b.f17947u = 0;
                    if (this.f17909b.f17948v != null && this.f17909b.f17925B != SESSION_STATE.UNINITIALISED) {
                        this.f17909b.m23440n();
                    }
                } catch (ab abVar2) {
                    abVar2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: io.branch.referral.Branch$h */
    public interface C4271h extends C2702c {
        /* renamed from: a */
        boolean m23380a(String str, BranchUniversalObject branchUniversalObject, LinkProperties linkProperties);
    }

    /* renamed from: b */
    public void mo3527b(String str, String str2) {
    }

    private Branch(Context context) {
        this.f17942p = C2754n.m13342a(context);
        this.f17933O = new ad(context);
        this.f17941o = BranchRemoteInterface.m13425a(context);
        this.f17943q = new ac(context);
        this.f17946t = C2760w.m13478a(context);
        this.f17945s = new Semaphore(1);
        this.f17934e = new Object();
        this.f17947u = 0;
        this.f17948v = true;
        this.f17949w = new HashMap();
        this.f17927E = new ConcurrentHashMap();
        if (this.f17933O.m13239a() == null) {
            this.f17928F = this.f17943q.m13226a((C2728a) this);
        }
        if (VERSION.SDK_INT >= 15) {
            this.f17924A = true;
            this.f17950z = INTENT_STATE.PENDING;
            return;
        }
        this.f17924A = false;
        this.f17950z = INTENT_STATE.READY;
    }

    /* renamed from: a */
    public boolean m23456a() {
        return this.f17933O.m13239a();
    }

    @TargetApi(14)
    /* renamed from: b */
    public static Branch m23406b() {
        if (f17921n == null) {
            Log.e("BranchSDK", "Branch instance is not created yet. Make sure you have initialised Branch. [Consider Calling getInstance(Context ctx) if you still have issue.]");
        } else if (f17922x && !f17923y) {
            Log.e("BranchSDK", "Branch instance is not properly initialised. Make sure your Application class is extending BranchApp class. If you are not extending BranchApp class make sure you are initialising Branch in your Applications onCreate()");
        }
        return f17921n;
    }

    /* renamed from: a */
    private static io.branch.referral.Branch m23385a(android.content.Context r3, boolean r4, java.lang.String r5) {
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
        r0 = f17921n;
        if (r0 != 0) goto L_0x0088;
    L_0x0004:
        r0 = m23423d(r3);
        f17921n = r0;
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 == 0) goto L_0x0018;
    L_0x0010:
        r5 = f17921n;
        r5 = r5.f17942p;
        r5 = r5.m13358a(r4);
    L_0x0018:
        if (r5 == 0) goto L_0x002c;
    L_0x001a:
        r4 = "bnc_no_value";
        r4 = r5.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0023;
    L_0x0022:
        goto L_0x002c;
    L_0x0023:
        r4 = f17921n;
        r4 = r4.f17942p;
        r4 = r4.m13370b(r5);
        goto L_0x0062;
    L_0x002c:
        r4 = 0;
        r5 = r3.getResources();	 Catch:{ Exception -> 0x0042 }
        r0 = "io.branch.apiKey";	 Catch:{ Exception -> 0x0042 }
        r1 = "string";	 Catch:{ Exception -> 0x0042 }
        r2 = r3.getPackageName();	 Catch:{ Exception -> 0x0042 }
        r0 = r5.getIdentifier(r0, r1, r2);	 Catch:{ Exception -> 0x0042 }
        r5 = r5.getString(r0);	 Catch:{ Exception -> 0x0042 }
        r4 = r5;
    L_0x0042:
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x0051;
    L_0x0048:
        r5 = f17921n;
        r5 = r5.f17942p;
        r4 = r5.m13370b(r4);
        goto L_0x0062;
    L_0x0051:
        r4 = "BranchSDK";
        r5 = "Branch Warning: Please enter your branch_key in your project's Manifest file!";
        android.util.Log.i(r4, r5);
        r4 = f17921n;
        r4 = r4.f17942p;
        r5 = "bnc_no_value";
        r4 = r4.m13370b(r5);
    L_0x0062:
        if (r4 == 0) goto L_0x0072;
    L_0x0064:
        r4 = f17921n;
        r4 = r4.f17949w;
        r4.clear();
        r4 = f17921n;
        r4 = r4.f17946t;
        r4.m13494d();
    L_0x0072:
        r4 = f17921n;
        r5 = r3.getApplicationContext();
        r4.f17944r = r5;
        r4 = r3 instanceof android.app.Application;
        if (r4 == 0) goto L_0x0088;
    L_0x007e:
        r4 = 1;
        f17922x = r4;
        r4 = f17921n;
        r3 = (android.app.Application) r3;
        r4.m23390a(r3);
    L_0x0088:
        r3 = f17921n;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(android.content.Context, boolean, java.lang.String):io.branch.referral.Branch");
    }

    /* renamed from: a */
    public static Branch m23384a(Context context) {
        return m23385a(context, true, null);
    }

    /* renamed from: b */
    public static Branch m23407b(Context context) {
        return m23385a(context, false, null);
    }

    @TargetApi(14)
    /* renamed from: c */
    public static Branch m23417c(Context context) {
        f17922x = true;
        f17910D = CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT;
        m23385a(context, true ^ C2742i.m13287a(context), null);
        return f17921n;
    }

    /* renamed from: d */
    private static Branch m23423d(Context context) {
        return new Branch(context.getApplicationContext());
    }

    /* renamed from: c */
    public static boolean m23422c() {
        return f17919k;
    }

    /* renamed from: a */
    public boolean m23458a(C2704f c2704f, Activity activity) {
        if (f17910D == CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT) {
            m23391a(c2704f, activity, true);
        } else {
            m23391a(c2704f, activity, f17910D == CUSTOM_REFERRABLE_SETTINGS.REFERRABLE);
        }
        return true;
    }

    /* renamed from: a */
    public boolean m23459a(C2704f c2704f, Uri uri, Activity activity) {
        m23414b(uri, activity);
        return m23458a(c2704f, activity);
    }

    /* renamed from: a */
    public boolean m23457a(Uri uri, Activity activity) {
        m23414b(uri, activity);
        return m23458a((C2704f) null, activity);
    }

    /* renamed from: a */
    private void m23391a(C2704f c2704f, Activity activity, boolean z) {
        if (activity != null) {
            this.f17935f = new WeakReference(activity);
        }
        if (m23445r() == null || m23443p() == null || this.f17925B != SESSION_STATE.INITIALISED) {
            if (!(this.f17938i == null || m23402a(c2704f) == null)) {
                m23453a(Jsonkey.InstantDeepLinkSession.m13131a(), "true");
                this.f17938i = false;
                m23447t();
            }
            if (z) {
                this.f17942p.m13419y();
            } else {
                this.f17942p.m13420z();
            }
            if (this.f17925B != SESSION_STATE.INITIALISING) {
                this.f17925B = SESSION_STATE.INITIALISING;
                m23411b(c2704f);
                return;
            } else if (c2704f != null) {
                this.f17946t.m13486a(c2704f);
                return;
            } else {
                return;
            }
        }
        m23402a(c2704f);
        this.f17938i = false;
    }

    /* renamed from: a */
    private boolean m23402a(C2704f c2704f) {
        if (c2704f != null) {
            if (!f17922x) {
                c2704f.mo1161a(new JSONObject(), null);
            } else if (this.f17936g) {
                c2704f.mo1161a(new JSONObject(), null);
            } else {
                c2704f.mo1161a(m23468i(), null);
                this.f17936g = true;
            }
        }
        return this.f17936g;
    }

    /* renamed from: d */
    void m23462d() {
        m23438m();
        this.f17937h = null;
        this.f17933O.m13238a(this.f17944r);
    }

    /* renamed from: m */
    private void m23438m() {
        if (this.f17925B != SESSION_STATE.UNINITIALISED) {
            if (!this.f17948v) {
                ServerRequest c = this.f17946t.m13493c();
                if ((c != null && (c instanceof C4730z)) || (c instanceof aa)) {
                    this.f17946t.m13491b();
                }
            } else if (!this.f17946t.m13495e()) {
                m23450a(new C4289y(this.f17944r));
            }
            this.f17925B = SESSION_STATE.UNINITIALISED;
        }
    }

    /* renamed from: b */
    private boolean m23414b(android.net.Uri r11, android.app.Activity r12) {
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
        r10 = this;
        r0 = f17914N;
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x010e;
    L_0x0006:
        r0 = r10.f17950z;
        r3 = io.branch.referral.Branch.INTENT_STATE.READY;
        if (r0 == r3) goto L_0x0010;
    L_0x000c:
        r0 = r10.f17932M;
        if (r0 == 0) goto L_0x010e;
    L_0x0010:
        if (r12 == 0) goto L_0x010e;
    L_0x0012:
        r0 = r12.getIntent();
        if (r0 == 0) goto L_0x010e;
    L_0x0018:
        r0 = r10.f17925B;
        r3 = io.branch.referral.Branch.SESSION_STATE.INITIALISED;
        if (r0 == r3) goto L_0x010e;
    L_0x001e:
        r0 = r12.getIntent();
        r0 = r10.m23401a(r0);
        if (r0 != 0) goto L_0x010e;
    L_0x0028:
        r0 = r12.getIntent();
        r3 = r0.getData();
        if (r3 == 0) goto L_0x00d9;
    L_0x0032:
        r3 = r10.f17932M;
        if (r3 != 0) goto L_0x003e;
    L_0x0036:
        r3 = r10.m23400a(r12);
        if (r3 == 0) goto L_0x003e;
    L_0x003c:
        goto L_0x00d9;
    L_0x003e:
        r3 = io.branch.referral.Defines.Jsonkey.BranchData;
        r3 = r3.m13131a();
        r3 = r0.getStringExtra(r3);
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x0084;
    L_0x004e:
        r3 = io.branch.referral.Defines.Jsonkey.BranchData;	 Catch:{ JSONException -> 0x0072 }
        r3 = r3.m13131a();	 Catch:{ JSONException -> 0x0072 }
        r3 = r0.getStringExtra(r3);	 Catch:{ JSONException -> 0x0072 }
        r4 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0072 }
        r4.<init>(r3);	 Catch:{ JSONException -> 0x0072 }
        r3 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x0072 }
        r3 = r3.m13131a();	 Catch:{ JSONException -> 0x0072 }
        r4.put(r3, r2);	 Catch:{ JSONException -> 0x0072 }
        r3 = r10.f17942p;	 Catch:{ JSONException -> 0x0072 }
        r4 = r4.toString();	 Catch:{ JSONException -> 0x0072 }
        r3.m13399o(r4);	 Catch:{ JSONException -> 0x0072 }
        r10.f17938i = r2;	 Catch:{ JSONException -> 0x0072 }
        goto L_0x0076;
    L_0x0072:
        r3 = move-exception;
        r3.printStackTrace();
    L_0x0076:
        r3 = io.branch.referral.Defines.Jsonkey.BranchData;
        r3 = r3.m13131a();
        r0.removeExtra(r3);
        r12.setIntent(r0);
        goto L_0x010e;
    L_0x0084:
        r0 = r11.getQueryParameterNames();
        if (r0 == 0) goto L_0x010e;
    L_0x008a:
        r0 = io.branch.referral.Defines.Jsonkey.Instant;
        r0 = r0.m13131a();
        r0 = r11.getQueryParameter(r0);
        r0 = java.lang.Boolean.valueOf(r0);
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x010e;
    L_0x009e:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00d4 }
        r0.<init>();	 Catch:{ JSONException -> 0x00d4 }
        r3 = r11.getQueryParameterNames();	 Catch:{ JSONException -> 0x00d4 }
        r3 = r3.iterator();	 Catch:{ JSONException -> 0x00d4 }
    L_0x00ab:
        r4 = r3.hasNext();	 Catch:{ JSONException -> 0x00d4 }
        if (r4 == 0) goto L_0x00bf;	 Catch:{ JSONException -> 0x00d4 }
    L_0x00b1:
        r4 = r3.next();	 Catch:{ JSONException -> 0x00d4 }
        r4 = (java.lang.String) r4;	 Catch:{ JSONException -> 0x00d4 }
        r5 = r11.getQueryParameter(r4);	 Catch:{ JSONException -> 0x00d4 }
        r0.put(r4, r5);	 Catch:{ JSONException -> 0x00d4 }
        goto L_0x00ab;	 Catch:{ JSONException -> 0x00d4 }
    L_0x00bf:
        r3 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x00d4 }
        r3 = r3.m13131a();	 Catch:{ JSONException -> 0x00d4 }
        r0.put(r3, r2);	 Catch:{ JSONException -> 0x00d4 }
        r3 = r10.f17942p;	 Catch:{ JSONException -> 0x00d4 }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x00d4 }
        r3.m13399o(r0);	 Catch:{ JSONException -> 0x00d4 }
        r10.f17938i = r2;	 Catch:{ JSONException -> 0x00d4 }
        goto L_0x010e;
    L_0x00d4:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x010e;
    L_0x00d9:
        r0 = r10.f17942p;
        r0 = r0.m13412v();
        r3 = "bnc_no_value";
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x010e;
    L_0x00e7:
        r0 = new org.json.JSONObject;
        r0.<init>();
        r3 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ JSONException -> 0x010a }
        r3 = r3.m13131a();	 Catch:{ JSONException -> 0x010a }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x010a }
        r3 = io.branch.referral.Defines.Jsonkey.IsFirstSession;	 Catch:{ JSONException -> 0x010a }
        r3 = r3.m13131a();	 Catch:{ JSONException -> 0x010a }
        r0.put(r3, r1);	 Catch:{ JSONException -> 0x010a }
        r3 = r10.f17942p;	 Catch:{ JSONException -> 0x010a }
        r0 = r0.toString();	 Catch:{ JSONException -> 0x010a }
        r3.m13399o(r0);	 Catch:{ JSONException -> 0x010a }
        r10.f17938i = r2;	 Catch:{ JSONException -> 0x010a }
        goto L_0x010e;
    L_0x010a:
        r0 = move-exception;
        r0.printStackTrace();
    L_0x010e:
        r0 = r10.f17950z;
        r3 = io.branch.referral.Branch.INTENT_STATE.READY;
        if (r0 != r3) goto L_0x0307;
    L_0x0114:
        if (r11 == 0) goto L_0x018d;
    L_0x0116:
        r0 = r10.m23400a(r12);	 Catch:{ Exception -> 0x018d }
        if (r0 != 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x011c:
        r0 = r10.f17944r;	 Catch:{ Exception -> 0x018d }
        r0 = io.branch.referral.ae.m13240a(r0);	 Catch:{ Exception -> 0x018d }
        r3 = r11.toString();	 Catch:{ Exception -> 0x018d }
        r0 = r0.m13244a(r3);	 Catch:{ Exception -> 0x018d }
        r10.f17937h = r0;	 Catch:{ Exception -> 0x018d }
        r3 = r10.f17942p;	 Catch:{ Exception -> 0x018d }
        r3.m13385h(r0);	 Catch:{ Exception -> 0x018d }
        if (r0 == 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x0133:
        r3 = r11.toString();	 Catch:{ Exception -> 0x018d }
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x018d }
        if (r0 == 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x013d:
        if (r12 == 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x013f:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x018d }
        if (r0 == 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x0145:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x018d }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x018d }
        if (r0 == 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x014f:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x018d }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x018d }
        r3 = r0.keySet();	 Catch:{ Exception -> 0x018d }
        r4 = r3.size();	 Catch:{ Exception -> 0x018d }
        if (r4 <= 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x0161:
        r4 = new org.json.JSONObject;	 Catch:{ Exception -> 0x018d }
        r4.<init>();	 Catch:{ Exception -> 0x018d }
        r5 = f17913I;	 Catch:{ Exception -> 0x018d }
        r6 = r5.length;	 Catch:{ Exception -> 0x018d }
        r7 = 0;	 Catch:{ Exception -> 0x018d }
    L_0x016a:
        if (r7 >= r6) goto L_0x017e;	 Catch:{ Exception -> 0x018d }
    L_0x016c:
        r8 = r5[r7];	 Catch:{ Exception -> 0x018d }
        r9 = r3.contains(r8);	 Catch:{ Exception -> 0x018d }
        if (r9 == 0) goto L_0x017b;	 Catch:{ Exception -> 0x018d }
    L_0x0174:
        r9 = r0.get(r8);	 Catch:{ Exception -> 0x018d }
        r4.put(r8, r9);	 Catch:{ Exception -> 0x018d }
    L_0x017b:
        r7 = r7 + 1;	 Catch:{ Exception -> 0x018d }
        goto L_0x016a;	 Catch:{ Exception -> 0x018d }
    L_0x017e:
        r0 = r4.length();	 Catch:{ Exception -> 0x018d }
        if (r0 <= 0) goto L_0x018d;	 Catch:{ Exception -> 0x018d }
    L_0x0184:
        r0 = r10.f17942p;	 Catch:{ Exception -> 0x018d }
        r3 = r4.toString();	 Catch:{ Exception -> 0x018d }
        r0.m13387i(r3);	 Catch:{ Exception -> 0x018d }
    L_0x018d:
        if (r12 == 0) goto L_0x01d5;
    L_0x018f:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x01d5 }
        if (r0 == 0) goto L_0x01d5;	 Catch:{ Exception -> 0x01d5 }
    L_0x0195:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x01d5 }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x01d5 }
        if (r0 == 0) goto L_0x01d5;	 Catch:{ Exception -> 0x01d5 }
    L_0x019f:
        r0 = r10.m23400a(r12);	 Catch:{ Exception -> 0x01d5 }
        if (r0 != 0) goto L_0x01d5;	 Catch:{ Exception -> 0x01d5 }
    L_0x01a5:
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x01d5 }
        r0 = r0.getExtras();	 Catch:{ Exception -> 0x01d5 }
        r3 = io.branch.referral.Defines.Jsonkey.AndroidPushNotificationKey;	 Catch:{ Exception -> 0x01d5 }
        r3 = r3.m13131a();	 Catch:{ Exception -> 0x01d5 }
        r0 = r0.getString(r3);	 Catch:{ Exception -> 0x01d5 }
        if (r0 == 0) goto L_0x01d5;	 Catch:{ Exception -> 0x01d5 }
    L_0x01b9:
        r3 = r0.length();	 Catch:{ Exception -> 0x01d5 }
        if (r3 <= 0) goto L_0x01d5;	 Catch:{ Exception -> 0x01d5 }
    L_0x01bf:
        r3 = r10.f17942p;	 Catch:{ Exception -> 0x01d5 }
        r3.m13397n(r0);	 Catch:{ Exception -> 0x01d5 }
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x01d5 }
        r3 = io.branch.referral.Defines.Jsonkey.BranchLinkUsed;	 Catch:{ Exception -> 0x01d5 }
        r3 = r3.m13131a();	 Catch:{ Exception -> 0x01d5 }
        r0.putExtra(r3, r2);	 Catch:{ Exception -> 0x01d5 }
        r12.setIntent(r0);	 Catch:{ Exception -> 0x01d5 }
        return r1;
    L_0x01d5:
        if (r11 == 0) goto L_0x0307;
    L_0x01d7:
        r0 = r11.isHierarchical();
        if (r0 == 0) goto L_0x0307;
    L_0x01dd:
        if (r12 == 0) goto L_0x0307;
    L_0x01df:
        r0 = r10.m23413b(r12);
        if (r0 != 0) goto L_0x0307;
    L_0x01e5:
        r0 = io.branch.referral.Defines.Jsonkey.LinkClickID;	 Catch:{ Exception -> 0x0307 }
        r0 = r0.m13131a();	 Catch:{ Exception -> 0x0307 }
        r0 = r11.getQueryParameter(r0);	 Catch:{ Exception -> 0x0307 }
        if (r0 == 0) goto L_0x02a7;	 Catch:{ Exception -> 0x0307 }
    L_0x01f1:
        r0 = r10.f17942p;	 Catch:{ Exception -> 0x0307 }
        r3 = io.branch.referral.Defines.Jsonkey.LinkClickID;	 Catch:{ Exception -> 0x0307 }
        r3 = r3.m13131a();	 Catch:{ Exception -> 0x0307 }
        r3 = r11.getQueryParameter(r3);	 Catch:{ Exception -> 0x0307 }
        r0.m13389j(r3);	 Catch:{ Exception -> 0x0307 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0307 }
        r0.<init>();	 Catch:{ Exception -> 0x0307 }
        r3 = "link_click_id=";	 Catch:{ Exception -> 0x0307 }
        r0.append(r3);	 Catch:{ Exception -> 0x0307 }
        r3 = io.branch.referral.Defines.Jsonkey.LinkClickID;	 Catch:{ Exception -> 0x0307 }
        r3 = r3.m13131a();	 Catch:{ Exception -> 0x0307 }
        r3 = r11.getQueryParameter(r3);	 Catch:{ Exception -> 0x0307 }
        r0.append(r3);	 Catch:{ Exception -> 0x0307 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0307 }
        r3 = 0;	 Catch:{ Exception -> 0x0307 }
        r4 = r12.getIntent();	 Catch:{ Exception -> 0x0307 }
        if (r4 == 0) goto L_0x022a;	 Catch:{ Exception -> 0x0307 }
    L_0x0222:
        r3 = r12.getIntent();	 Catch:{ Exception -> 0x0307 }
        r3 = r3.getDataString();	 Catch:{ Exception -> 0x0307 }
    L_0x022a:
        r11 = r11.getQuery();	 Catch:{ Exception -> 0x0307 }
        r11 = r11.length();	 Catch:{ Exception -> 0x0307 }
        r4 = r0.length();	 Catch:{ Exception -> 0x0307 }
        if (r11 != r4) goto L_0x024a;	 Catch:{ Exception -> 0x0307 }
    L_0x0238:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0307 }
        r11.<init>();	 Catch:{ Exception -> 0x0307 }
        r4 = "\\?";	 Catch:{ Exception -> 0x0307 }
        r11.append(r4);	 Catch:{ Exception -> 0x0307 }
        r11.append(r0);	 Catch:{ Exception -> 0x0307 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0307 }
        goto L_0x027e;	 Catch:{ Exception -> 0x0307 }
    L_0x024a:
        if (r3 == 0) goto L_0x026d;	 Catch:{ Exception -> 0x0307 }
    L_0x024c:
        r11 = r3.length();	 Catch:{ Exception -> 0x0307 }
        r4 = r0.length();	 Catch:{ Exception -> 0x0307 }
        r11 = r11 - r4;	 Catch:{ Exception -> 0x0307 }
        r4 = r3.indexOf(r0);	 Catch:{ Exception -> 0x0307 }
        if (r11 != r4) goto L_0x026d;	 Catch:{ Exception -> 0x0307 }
    L_0x025b:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0307 }
        r11.<init>();	 Catch:{ Exception -> 0x0307 }
        r4 = "&";	 Catch:{ Exception -> 0x0307 }
        r11.append(r4);	 Catch:{ Exception -> 0x0307 }
        r11.append(r0);	 Catch:{ Exception -> 0x0307 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0307 }
        goto L_0x027e;	 Catch:{ Exception -> 0x0307 }
    L_0x026d:
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0307 }
        r11.<init>();	 Catch:{ Exception -> 0x0307 }
        r11.append(r0);	 Catch:{ Exception -> 0x0307 }
        r0 = "&";	 Catch:{ Exception -> 0x0307 }
        r11.append(r0);	 Catch:{ Exception -> 0x0307 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0307 }
    L_0x027e:
        if (r3 == 0) goto L_0x029f;	 Catch:{ Exception -> 0x0307 }
    L_0x0280:
        r0 = "";	 Catch:{ Exception -> 0x0307 }
        r11 = r3.replaceFirst(r11, r0);	 Catch:{ Exception -> 0x0307 }
        r11 = android.net.Uri.parse(r11);	 Catch:{ Exception -> 0x0307 }
        r0 = r12.getIntent();	 Catch:{ Exception -> 0x0307 }
        r0.setData(r11);	 Catch:{ Exception -> 0x0307 }
        r11 = r12.getIntent();	 Catch:{ Exception -> 0x0307 }
        r12 = io.branch.referral.Defines.Jsonkey.BranchLinkUsed;	 Catch:{ Exception -> 0x0307 }
        r12 = r12.m13131a();	 Catch:{ Exception -> 0x0307 }
        r11.putExtra(r12, r2);	 Catch:{ Exception -> 0x0307 }
        goto L_0x02a6;	 Catch:{ Exception -> 0x0307 }
    L_0x029f:
        r11 = "BranchSDK";	 Catch:{ Exception -> 0x0307 }
        r12 = "Branch Warning. URI for the launcher activity is null. Please make sure that intent data is not set to null before calling Branch#InitSession ";	 Catch:{ Exception -> 0x0307 }
        android.util.Log.w(r11, r12);	 Catch:{ Exception -> 0x0307 }
    L_0x02a6:
        return r2;	 Catch:{ Exception -> 0x0307 }
    L_0x02a7:
        r0 = r11.getScheme();	 Catch:{ Exception -> 0x0307 }
        r3 = r12.getIntent();	 Catch:{ Exception -> 0x0307 }
        if (r0 == 0) goto L_0x0307;	 Catch:{ Exception -> 0x0307 }
    L_0x02b1:
        if (r3 == 0) goto L_0x0307;	 Catch:{ Exception -> 0x0307 }
    L_0x02b3:
        r4 = "http";	 Catch:{ Exception -> 0x0307 }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ Exception -> 0x0307 }
        if (r4 != 0) goto L_0x02c3;	 Catch:{ Exception -> 0x0307 }
    L_0x02bb:
        r4 = "https";	 Catch:{ Exception -> 0x0307 }
        r0 = r0.equalsIgnoreCase(r4);	 Catch:{ Exception -> 0x0307 }
        if (r0 == 0) goto L_0x0307;	 Catch:{ Exception -> 0x0307 }
    L_0x02c3:
        r0 = r11.getHost();	 Catch:{ Exception -> 0x0307 }
        if (r0 == 0) goto L_0x0307;	 Catch:{ Exception -> 0x0307 }
    L_0x02c9:
        r0 = r11.getHost();	 Catch:{ Exception -> 0x0307 }
        r0 = r0.length();	 Catch:{ Exception -> 0x0307 }
        if (r0 <= 0) goto L_0x0307;	 Catch:{ Exception -> 0x0307 }
    L_0x02d3:
        r0 = r10.m23400a(r12);	 Catch:{ Exception -> 0x0307 }
        if (r0 != 0) goto L_0x0307;	 Catch:{ Exception -> 0x0307 }
    L_0x02d9:
        r0 = r10.f17944r;	 Catch:{ Exception -> 0x0307 }
        r0 = io.branch.referral.ae.m13240a(r0);	 Catch:{ Exception -> 0x0307 }
        r4 = r11.toString();	 Catch:{ Exception -> 0x0307 }
        r0 = r0.m13244a(r4);	 Catch:{ Exception -> 0x0307 }
        r4 = r11.toString();	 Catch:{ Exception -> 0x0307 }
        r0 = r4.equalsIgnoreCase(r0);	 Catch:{ Exception -> 0x0307 }
        if (r0 == 0) goto L_0x02fa;	 Catch:{ Exception -> 0x0307 }
    L_0x02f1:
        r0 = r10.f17942p;	 Catch:{ Exception -> 0x0307 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0307 }
        r0.m13395m(r11);	 Catch:{ Exception -> 0x0307 }
    L_0x02fa:
        r11 = io.branch.referral.Defines.Jsonkey.BranchLinkUsed;	 Catch:{ Exception -> 0x0307 }
        r11 = r11.m13131a();	 Catch:{ Exception -> 0x0307 }
        r3.putExtra(r11, r2);	 Catch:{ Exception -> 0x0307 }
        r12.setIntent(r3);	 Catch:{ Exception -> 0x0307 }
        return r1;
    L_0x0307:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(android.net.Uri, android.app.Activity):boolean");
    }

    /* renamed from: a */
    private boolean m23400a(Activity activity) {
        return (activity == null || activity.getIntent() == null || activity.getIntent().getBooleanExtra(Jsonkey.BranchLinkUsed.m13131a(), false) == null) ? false : true;
    }

    /* renamed from: b */
    private boolean m23413b(Activity activity) {
        return (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == null) ? null : true;
    }

    /* renamed from: e */
    public void mo3530e() {
        this.f17928F = false;
        this.f17946t.m13487a(PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        if (this.f17931L) {
            m23446s();
            this.f17931L = false;
            return;
        }
        m23440n();
    }

    /* renamed from: f */
    public void mo3531f() {
        this.f17946t.m13487a(PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
        m23440n();
    }

    /* renamed from: g */
    void m23466g() {
        ae.m13240a(this.f17944r).m13245b(this.f17944r);
    }

    /* renamed from: a */
    public void m23451a(String str) {
        m23452a(str, null);
    }

    /* renamed from: a */
    public void m23452a(String str, C2704f c2704f) {
        ServerRequest c4284s = new C4284s(this.f17944r, c2704f, str);
        if (c4284s.f11440e == null && c4284s.mo3538a(this.f17944r) == null) {
            m23450a(c4284s);
            return;
        }
        C4284s c4284s2 = (C4284s) c4284s;
        if (c4284s2.mo3543u() != null) {
            c4284s2.m23525a(f17921n);
        }
    }

    /* renamed from: a */
    public void m23454a(String str, JSONObject jSONObject) {
        m23455a(str, jSONObject, null);
    }

    /* renamed from: a */
    public void m23455a(String str, JSONObject jSONObject, C2746b c2746b) {
        ServerRequest c4280o = new C4280o(this.f17944r, str, jSONObject, c2746b);
        if (c4280o.f11440e == null && c4280o.mo3538a(this.f17944r) == null) {
            m23450a(c4280o);
        }
    }

    /* renamed from: h */
    public JSONObject m23467h() {
        return m23387a(m23410b(this.f17942p.m13412v()));
    }

    /* renamed from: i */
    public JSONObject m23468i() {
        return m23387a(m23410b(this.f17942p.m13411u()));
    }

    /* renamed from: a */
    private org.json.JSONObject m23387a(org.json.JSONObject r4) {
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
        r3 = this;
        if (r4 == 0) goto L_0x0031;
    L_0x0002:
        r0 = r3.f17939j;	 Catch:{ Exception -> 0x0031 }
        if (r0 == 0) goto L_0x0031;	 Catch:{ Exception -> 0x0031 }
    L_0x0006:
        r0 = r3.f17939j;	 Catch:{ Exception -> 0x0031 }
        r0 = r0.length();	 Catch:{ Exception -> 0x0031 }
        if (r0 <= 0) goto L_0x0015;	 Catch:{ Exception -> 0x0031 }
    L_0x000e:
        r0 = "BranchSDK";	 Catch:{ Exception -> 0x0031 }
        r1 = "You're currently in deep link debug mode. Please comment out 'setDeepLinkDebugMode' to receive the deep link parameters from a real Branch link";	 Catch:{ Exception -> 0x0031 }
        android.util.Log.w(r0, r1);	 Catch:{ Exception -> 0x0031 }
    L_0x0015:
        r0 = r3.f17939j;	 Catch:{ Exception -> 0x0031 }
        r0 = r0.keys();	 Catch:{ Exception -> 0x0031 }
    L_0x001b:
        r1 = r0.hasNext();	 Catch:{ Exception -> 0x0031 }
        if (r1 == 0) goto L_0x0031;	 Catch:{ Exception -> 0x0031 }
    L_0x0021:
        r1 = r0.next();	 Catch:{ Exception -> 0x0031 }
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x0031 }
        r2 = r3.f17939j;	 Catch:{ Exception -> 0x0031 }
        r2 = r2.get(r1);	 Catch:{ Exception -> 0x0031 }
        r4.put(r1, r2);	 Catch:{ Exception -> 0x0031 }
        goto L_0x001b;
    L_0x0031:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: a */
    String m23448a(C4281p c4281p) {
        if (!(c4281p.e || c4281p.mo3538a(this.f17944r))) {
            if (this.f17949w.containsKey(c4281p.mo3543u())) {
                String str = (String) this.f17949w.get(c4281p.mo3543u());
                c4281p.m23501a(str);
                return str;
            } else if (!c4281p.m23511y()) {
                return m23409b(c4281p);
            } else {
                m23412b((ServerRequest) c4281p);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m23393a(C2709l c2709l) {
        if (this.f17926C != null) {
            this.f17926C.m13197a(true);
        }
        this.f17926C = new ShareLinkManager();
        this.f17926C.m13196a(c2709l);
    }

    /* renamed from: b */
    private java.lang.String m23409b(io.branch.referral.C4281p r6) {
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
        r0 = r5.f17933O;
        r0 = r0.m13239a();
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r6 = r6.mo3545w();
        return r6;
    L_0x000d:
        r0 = r5.f17925B;
        r1 = io.branch.referral.Branch.SESSION_STATE.INITIALISED;
        r2 = 0;
        if (r0 != r1) goto L_0x006d;
    L_0x0014:
        r0 = r5.f17942p;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = r0.m13367b();	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = r0 + 2000;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = new io.branch.referral.Branch$m;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1.<init>();	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3 = 1;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3 = new io.branch.referral.ServerRequest[r3];	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r4 = 0;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3[r4] = r6;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r1 = r1.execute(r3);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r3 = (long) r0;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = r1.get(r3, r0);	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        r0 = (io.branch.referral.ab) r0;	 Catch:{ InterruptedException -> 0x0035, InterruptedException -> 0x0035, InterruptedException -> 0x0035 }
        goto L_0x0036;
    L_0x0035:
        r0 = r2;
    L_0x0036:
        r1 = r6.mo3544v();
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r2 = r6.mo3545w();
    L_0x0040:
        if (r0 == 0) goto L_0x006c;
    L_0x0042:
        r1 = r0.m13211a();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 != r3) goto L_0x006c;
    L_0x004a:
        r0 = r0.m13213b();	 Catch:{ JSONException -> 0x0068 }
        r1 = "url";	 Catch:{ JSONException -> 0x0068 }
        r0 = r0.getString(r1);	 Catch:{ JSONException -> 0x0068 }
        r1 = r6.mo3543u();	 Catch:{ JSONException -> 0x0065 }
        if (r1 == 0) goto L_0x0063;	 Catch:{ JSONException -> 0x0065 }
    L_0x005a:
        r1 = r5.f17949w;	 Catch:{ JSONException -> 0x0065 }
        r6 = r6.mo3543u();	 Catch:{ JSONException -> 0x0065 }
        r1.put(r6, r0);	 Catch:{ JSONException -> 0x0065 }
    L_0x0063:
        r2 = r0;
        goto L_0x006c;
    L_0x0065:
        r6 = move-exception;
        r2 = r0;
        goto L_0x0069;
    L_0x0068:
        r6 = move-exception;
    L_0x0069:
        r6.printStackTrace();
    L_0x006c:
        return r2;
    L_0x006d:
        r6 = "BranchSDK";
        r0 = "Branch Warning: User session has not been initialized";
        android.util.Log.i(r6, r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(io.branch.referral.p):java.lang.String");
    }

    /* renamed from: b */
    private void m23412b(ServerRequest serverRequest) {
        m23450a(serverRequest);
    }

    /* renamed from: b */
    private org.json.JSONObject m23410b(java.lang.String r3) {
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
        r0 = "bnc_no_value";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        r3 = new org.json.JSONObject;
        r3.<init>();
        return r3;
    L_0x000e:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0014 }
        r0.<init>(r3);	 Catch:{ JSONException -> 0x0014 }
        return r0;
    L_0x0014:
        r3 = r3.getBytes();
        r0 = 2;
        r3 = io.branch.referral.C2732b.m13246a(r3, r0);
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0028 }
        r1 = new java.lang.String;	 Catch:{ JSONException -> 0x0028 }
        r1.<init>(r3);	 Catch:{ JSONException -> 0x0028 }
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0028 }
        return r0;
    L_0x0028:
        r3 = move-exception;
        r3.printStackTrace();
        r3 = new org.json.JSONObject;
        r3.<init>();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: n */
    private void m23440n() {
        try {
            this.f17945s.acquire();
            if (this.f17947u != 0 || this.f17946t.m13484a() <= 0) {
                this.f17945s.release();
                return;
            }
            this.f17947u = 1;
            ServerRequest c = this.f17946t.m13493c();
            this.f17945s.release();
            if (c == null) {
                this.f17946t.m13492b(null);
            } else if (c.m13173p()) {
                this.f17947u = 0;
            } else if (!(c instanceof C4730z) && !m23445r()) {
                Log.i("BranchSDK", "Branch Error: User session has not been initialized!");
                this.f17947u = 0;
                m23388a(this.f17946t.m13484a() - 1, -101);
            } else if ((c instanceof C4285t) || (m23443p() && m23444q())) {
                new C4270e(this, c).m13251a(new Void[0]);
            } else {
                this.f17947u = 0;
                m23388a(this.f17946t.m13484a() - 1, -101);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m23388a(int i, int i2) {
        ServerRequest a;
        if (i >= this.f17946t.m13484a()) {
            a = this.f17946t.m13485a(this.f17946t.m13484a() - 1);
        } else {
            a = this.f17946t.m13485a(i);
        }
        m23398a(a, i2);
    }

    /* renamed from: a */
    private void m23398a(ServerRequest serverRequest, int i) {
        if (serverRequest != null) {
            serverRequest.mo3535a(i, "");
        }
    }

    /* renamed from: o */
    private void m23441o() {
        int i = 0;
        while (i < this.f17946t.m13484a()) {
            try {
                ServerRequest a = this.f17946t.m13485a(i);
                if (a != null) {
                    JSONObject h = a.m13165h();
                    if (h != null) {
                        if (h.has(Jsonkey.SessionID.m13131a())) {
                            a.m13165h().put(Jsonkey.SessionID.m13131a(), this.f17942p.m13384h());
                        }
                        if (h.has(Jsonkey.IdentityID.m13131a())) {
                            a.m13165h().put(Jsonkey.IdentityID.m13131a(), this.f17942p.m13386i());
                        }
                        if (h.has(Jsonkey.DeviceFingerprintID.m13131a())) {
                            a.m13165h().put(Jsonkey.DeviceFingerprintID.m13131a(), this.f17942p.m13382g());
                        }
                    }
                }
                i++;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
    }

    /* renamed from: p */
    private boolean m23443p() {
        return this.f17942p.m13384h().equals("bnc_no_value") ^ 1;
    }

    /* renamed from: q */
    private boolean m23444q() {
        return this.f17942p.m13382g().equals("bnc_no_value") ^ 1;
    }

    /* renamed from: r */
    private boolean m23445r() {
        return this.f17942p.m13386i().equals("bnc_no_value") ^ 1;
    }

    /* renamed from: c */
    private void m23421c(ServerRequest serverRequest) {
        if (this.f17947u == 0) {
            this.f17946t.m13489a(serverRequest, 0);
        } else {
            this.f17946t.m13489a(serverRequest, 1);
        }
    }

    /* renamed from: a */
    private void m23399a(ServerRequest serverRequest, C2704f c2704f) {
        if (this.f17946t.m13496f()) {
            if (c2704f != null) {
                this.f17946t.m13486a(c2704f);
            }
            this.f17946t.m13490a(serverRequest, this.f17947u, c2704f);
        } else {
            m23421c(serverRequest);
        }
        m23440n();
    }

    /* renamed from: b */
    private void m23411b(C2704f c2704f) {
        if (this.f17942p.m13380f() != null) {
            if (!this.f17942p.m13380f().equalsIgnoreCase("bnc_no_value")) {
                if (this.f17942p.m13380f() != null && this.f17942p.m13380f().startsWith("key_test_")) {
                    Log.i("BranchSDK", "Branch Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
                }
                if (this.f17942p.m13394m().equals("bnc_no_value")) {
                    if (this.f17940l) {
                        if (C2751k.m13325a(this.f17944r, new C42681(this)).booleanValue()) {
                            m23392a(c2704f, PROCESS_WAIT_LOCK.FB_APP_LINK_WAIT_LOCK);
                        } else {
                            m23392a(c2704f, null);
                        }
                        return;
                    }
                }
                m23392a(c2704f, null);
                return;
            }
        }
        this.f17925B = SESSION_STATE.UNINITIALISED;
        if (c2704f != null) {
            c2704f.mo1161a(null, new C2734d("Trouble initializing Branch.", -114));
        }
        Log.i("BranchSDK", "Branch Warning: Please enter your branch_key in your project's res/values/strings.xml!");
    }

    /* renamed from: a */
    private void m23392a(C2704f c2704f, PROCESS_WAIT_LOCK process_wait_lock) {
        ServerRequest c = m23418c(c2704f);
        c.m13152a(process_wait_lock);
        if (this.f17928F != null) {
            c.m13152a(PROCESS_WAIT_LOCK.GAID_FETCH_WAIT_LOCK);
        }
        if (this.f17950z != INTENT_STATE.READY && m23434k() == null) {
            c.m13152a(PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        }
        if (!(f17918d == null || (c instanceof C4730z) == null || InstallListener.f11422a != null)) {
            c.m13152a(PROCESS_WAIT_LOCK.INSTALL_REFERRER_FETCH_WAIT_LOCK);
            InstallListener.m13138a(this.f17944r, f17920m, this);
        }
        m23399a(c, c2704f);
    }

    /* renamed from: c */
    private ServerRequest m23418c(C2704f c2704f) {
        if (m23445r()) {
            return new aa(this.f17944r, c2704f, this.f17943q);
        }
        return new C4730z(this.f17944r, c2704f, this.f17943q, InstallListener.m13137a());
    }

    /* renamed from: a */
    private void m23389a(Activity activity, boolean z) {
        this.f17946t.m13487a(PROCESS_WAIT_LOCK.INTENT_PENDING_WAIT_LOCK);
        if (z) {
            m23414b(activity.getIntent().getData(), activity);
            if (m23456a() != null || f17911G == null || this.f17942p.m13380f() == null || this.f17942p.m13380f().equalsIgnoreCase("bnc_no_value") != null) {
                m23440n();
                return;
            } else if (this.f17928F != null) {
                this.f17931L = true;
                return;
            } else {
                m23446s();
                return;
            }
        }
        m23440n();
    }

    /* renamed from: s */
    private void m23446s() {
        if (!this.f17933O.m13239a()) {
            C2752l a = C2752l.m13327a(this.f17942p.m13354G(), this.f17943q, f17919k);
            Activity activity = this.f17935f != null ? (Activity) this.f17935f.get() : null;
            Context applicationContext = activity != null ? activity.getApplicationContext() : null;
            if (applicationContext != null) {
                this.f17946t.m13497g();
                C2740g.m13277a().m13280a(applicationContext, f17911G, a, this.f17942p, this.f17943q, new C42692(this));
            }
        }
    }

    /* renamed from: a */
    public void m23450a(ServerRequest serverRequest) {
        if (this.f17933O.m13239a()) {
            serverRequest.m13176s();
            return;
        }
        if (!(this.f17925B == SESSION_STATE.INITIALISED || (serverRequest instanceof C4285t))) {
            if (serverRequest instanceof C4286u) {
                serverRequest.mo3535a(-101, "");
                Log.i("BranchSDK", "Branch is not initialized, cannot logout");
                return;
            } else if (serverRequest instanceof C4289y) {
                Log.i("BranchSDK", "Branch is not initialized, cannot close session");
                return;
            } else {
                Activity activity = this.f17935f != null ? (Activity) this.f17935f.get() : null;
                boolean z = true;
                if (f17910D == CUSTOM_REFERRABLE_SETTINGS.USE_DEFAULT) {
                    m23391a((C2704f) null, activity, true);
                } else {
                    if (f17910D != CUSTOM_REFERRABLE_SETTINGS.REFERRABLE) {
                        z = false;
                    }
                    m23391a((C2704f) null, activity, z);
                }
            }
        }
        if (!(serverRequest instanceof C4287v)) {
            this.f17946t.m13488a(serverRequest);
            serverRequest.m13171n();
        }
        m23440n();
    }

    @android.annotation.TargetApi(14)
    /* renamed from: a */
    private void m23390a(android.app.Application r4) {
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
        r3 = this;
        r0 = new io.branch.referral.Branch$a;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r1 = 0;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r0.<init>();	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r4.unregisterActivityLifecycleCallbacks(r0);	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r4.registerActivityLifecycleCallbacks(r0);	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        r4 = 1;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        f17923y = r4;	 Catch:{ NoSuchMethodError -> 0x0010, NoSuchMethodError -> 0x0010 }
        goto L_0x0027;
    L_0x0010:
        r4 = 0;
        f17923y = r4;
        f17922x = r4;
        r4 = "BranchSDK";
        r0 = new io.branch.referral.d;
        r1 = "";
        r2 = -108; // 0xffffffffffffff94 float:NaN double:NaN;
        r0.<init>(r1, r2);
        r0 = r0.m13253a();
        android.util.Log.w(r4, r0);
    L_0x0027:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(android.app.Application):void");
    }

    /* renamed from: c */
    private void m23419c(Activity activity) {
        Uri data = activity.getIntent() != null ? activity.getIntent().getData() : null;
        this.f17936g = false;
        m23457a(data, activity);
    }

    /* renamed from: a */
    private boolean m23401a(android.content.Intent r4) {
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
        r3 = this;
        r0 = 0;
        if (r4 == 0) goto L_0x001b;
    L_0x0003:
        r1 = io.branch.referral.Defines.Jsonkey.ForceNewBranchSession;	 Catch:{ Throwable -> 0x000e }
        r1 = r1.m13131a();	 Catch:{ Throwable -> 0x000e }
        r1 = r4.getBooleanExtra(r1, r0);	 Catch:{ Throwable -> 0x000e }
        goto L_0x000f;
    L_0x000e:
        r1 = 0;
    L_0x000f:
        if (r1 == 0) goto L_0x001a;
    L_0x0011:
        r2 = io.branch.referral.Defines.Jsonkey.ForceNewBranchSession;
        r2 = r2.m13131a();
        r4.putExtra(r2, r0);
    L_0x001a:
        r0 = r1;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.a(android.content.Intent):boolean");
    }

    /* renamed from: t */
    private void m23447t() {
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
        r9 = this;
        r0 = r9.m23468i();
        r1 = 0;
        r2 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.m13131a();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r0.has(r2);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x00ec;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0011:
        r2 = io.branch.referral.Defines.Jsonkey.Clicked_Branch_Link;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.m13131a();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r0.getBoolean(r2);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 != 0) goto L_0x001f;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x001d:
        goto L_0x00ec;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x001f:
        r2 = r0.length();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 <= 0) goto L_0x010b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0025:
        r2 = r9.f17944r;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r9.f17944r;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getApplicationInfo(r3, r4);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r2.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4 = 0;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r3 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x003c:
        r2 = r2.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = "io.branch.sdk.auto_link_disable";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getBoolean(r3, r4);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x0047;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0046:
        return;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0047:
        r2 = r9.f17944r;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r9.f17944r;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = r3.getPackageName();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = 129; // 0x81 float:1.81E-43 double:6.37E-322;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.getPackageInfo(r3, r5);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.activities;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r3 = 1501; // 0x5dd float:2.103E-42 double:7.416E-321;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x009b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x005f:
        r5 = r2.length;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0060:
        if (r4 >= r5) goto L_0x009b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0062:
        r6 = r2[r4];	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r6 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0066:
        r7 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x006a:
        r7 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r8 = "io.branch.sdk.auto_link_keys";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r7 = r7.getString(r8);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 != 0) goto L_0x007e;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0074:
        r7 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r8 = "io.branch.sdk.auto_link_path";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r7 = r7.getString(r8);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x007e:
        r7 = r9.m23405a(r0, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 != 0) goto L_0x008a;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x0084:
        r7 = r9.m23416b(r0, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r7 == 0) goto L_0x0098;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x008a:
        r2 = r6.name;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r1 = r6.metaData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x0096, Exception -> 0x010b }
        r4 = "io.branch.sdk.auto_link_request_code";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x0096, Exception -> 0x010b }
        r3 = r1.getInt(r4, r3);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x0096, Exception -> 0x010b }
        r1 = r2;
        goto L_0x009b;
    L_0x0096:
        r1 = r2;
        goto L_0x00ed;
    L_0x0098:
        r4 = r4 + 1;
        goto L_0x0060;
    L_0x009b:
        if (r1 == 0) goto L_0x010b;
    L_0x009d:
        r2 = r9.f17935f;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x010b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00a1:
        r2 = r9.f17935f;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = r2.get();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = (android.app.Activity) r2;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r2 == 0) goto L_0x00e4;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00ab:
        r4 = new android.content.Intent;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = java.lang.Class.forName(r1);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.<init>(r2, r5);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = "io.branch.sdk.auto_linked";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r6 = "true";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.putExtra(r5, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = io.branch.referral.Defines.Jsonkey.ReferringData;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = r5.m13131a();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r6 = r0.toString();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.putExtra(r5, r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r5 = r0.keys();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00cc:
        r6 = r5.hasNext();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        if (r6 == 0) goto L_0x00e0;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00d2:
        r6 = r5.next();	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r6 = (java.lang.String) r6;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r7 = r0.getString(r6);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r4.putExtra(r6, r7);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        goto L_0x00cc;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00e0:
        r2.startActivityForResult(r4, r3);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        goto L_0x010b;	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
    L_0x00e4:
        r0 = "BranchSDK";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        r2 = "No activity reference to launch deep linked activity";	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        android.util.Log.w(r0, r2);	 Catch:{ NameNotFoundException -> 0x0104, ClassNotFoundException -> 0x00ed, Exception -> 0x010b }
        goto L_0x010b;
    L_0x00ec:
        return;
    L_0x00ed:
        r0 = "BranchSDK";
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Branch Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        android.util.Log.i(r0, r1);
        goto L_0x010b;
    L_0x0104:
        r0 = "BranchSDK";
        r1 = "Branch Warning: Please make sure Activity names set for auto deep link are correct!";
        android.util.Log.i(r0, r1);
    L_0x010b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.t():void");
    }

    /* renamed from: a */
    private boolean m23405a(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String has : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(has)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m23416b(org.json.JSONObject r5, android.content.pm.ActivityInfo r6) {
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
        r4 = this;
        r0 = 0;
        r1 = io.branch.referral.Defines.Jsonkey.AndroidDeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0030 }
        r1 = r5.has(r1);	 Catch:{ JSONException -> 0x0030 }
        if (r1 == 0) goto L_0x0019;	 Catch:{ JSONException -> 0x0030 }
    L_0x000d:
        r1 = io.branch.referral.Defines.Jsonkey.AndroidDeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0030 }
        r5 = r5.getString(r1);	 Catch:{ JSONException -> 0x0030 }
    L_0x0017:
        r0 = r5;	 Catch:{ JSONException -> 0x0030 }
        goto L_0x0030;	 Catch:{ JSONException -> 0x0030 }
    L_0x0019:
        r1 = io.branch.referral.Defines.Jsonkey.DeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0030 }
        r1 = r5.has(r1);	 Catch:{ JSONException -> 0x0030 }
        if (r1 == 0) goto L_0x0030;	 Catch:{ JSONException -> 0x0030 }
    L_0x0025:
        r1 = io.branch.referral.Defines.Jsonkey.DeepLinkPath;	 Catch:{ JSONException -> 0x0030 }
        r1 = r1.m13131a();	 Catch:{ JSONException -> 0x0030 }
        r5 = r5.getString(r1);	 Catch:{ JSONException -> 0x0030 }
        goto L_0x0017;
    L_0x0030:
        r5 = r6.metaData;
        r1 = "io.branch.sdk.auto_link_path";
        r5 = r5.getString(r1);
        r1 = 0;
        if (r5 == 0) goto L_0x0060;
    L_0x003b:
        if (r0 == 0) goto L_0x0060;
    L_0x003d:
        r5 = r6.metaData;
        r6 = "io.branch.sdk.auto_link_path";
        r5 = r5.getString(r6);
        r6 = ",";
        r5 = r5.split(r6);
        r6 = r5.length;
        r2 = 0;
    L_0x004d:
        if (r2 >= r6) goto L_0x0060;
    L_0x004f:
        r3 = r5[r2];
        r3 = r3.trim();
        r3 = r4.m23426e(r3, r0);
        if (r3 == 0) goto L_0x005d;
    L_0x005b:
        r5 = 1;
        return r5;
    L_0x005d:
        r2 = r2 + 1;
        goto L_0x004d;
    L_0x0060:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.b(org.json.JSONObject, android.content.pm.ActivityInfo):boolean");
    }

    /* renamed from: e */
    private boolean m23426e(String str, String str2) {
        boolean z = false;
        str = str.split("\\?")[0].split("/");
        str2 = str2.split("\\?")[0].split("/");
        if (str.length != str2.length) {
            return false;
        }
        int i = 0;
        while (i < str.length && i < str2.length) {
            String str3 = str[i];
            if (!str3.equals(str2[i]) && !str3.contains("*")) {
                break;
            }
            i++;
        }
        z = true;
        return z;
    }

    /* renamed from: j */
    public static void m23432j() {
        f17916b = Boolean.valueOf(true);
    }

    /* renamed from: k */
    public static boolean m23434k() {
        return f17917c;
    }

    /* renamed from: a */
    public void m23453a(String str, String str2) {
        this.f17927E.put(str, str2);
    }

    /* renamed from: c */
    public void mo3528c(String str, String str2) {
        if (C4285t.m23532a(str) != null) {
            m23447t();
        }
    }

    /* renamed from: d */
    public void mo3529d(String str, String str2) {
        if (C4285t.m23532a(str) != null) {
            m23447t();
        }
    }

    /* renamed from: a */
    public void mo3526a(int i, String str, String str2) {
        if (C4285t.m23532a(str2) != 0) {
            m23447t();
        }
    }
}
