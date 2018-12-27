package io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AbsListView;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import io.branch.referral.C2754n;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.indexing.a */
public class C2697a {
    /* renamed from: a */
    private static C2697a f11270a;
    /* renamed from: b */
    private Handler f11271b = new Handler();
    /* renamed from: c */
    private WeakReference<Activity> f11272c;
    /* renamed from: d */
    private String f11273d;
    /* renamed from: e */
    private JSONObject f11274e;
    /* renamed from: f */
    private int f11275f;
    /* renamed from: g */
    private int f11276g = 15;
    /* renamed from: h */
    private final C2696a f11277h = new C2696a(this);
    /* renamed from: i */
    private C2699b f11278i;
    /* renamed from: j */
    private final Map<String, WeakReference<ViewTreeObserver>> f11279j = new HashMap();
    /* renamed from: k */
    private ArrayList<String> f11280k = new ArrayList();
    /* renamed from: l */
    private Runnable f11281l = new C26931(this);
    /* renamed from: m */
    private OnScrollChangedListener f11282m = new C26942(this);
    /* renamed from: n */
    private Runnable f11283n = new C26953(this);

    /* renamed from: io.branch.indexing.a$1 */
    class C26931 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2697a f11265a;

        C26931(C2697a c2697a) {
            this.f11265a = c2697a;
        }

        public void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r9 = this;
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0.f11275f = r0.f11275f + 1;	 Catch:{ Exception -> 0x017e }
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f11278i;	 Catch:{ Exception -> 0x017e }
            r0 = r0.m13072a();	 Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0011:
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f11272c;	 Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0019:
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f11272c;	 Catch:{ Exception -> 0x017e }
            r0 = r0.get();	 Catch:{ Exception -> 0x017e }
            if (r0 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0025:
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f11272c;	 Catch:{ Exception -> 0x017e }
            r0 = r0.get();	 Catch:{ Exception -> 0x017e }
            r0 = (android.app.Activity) r0;	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = new org.json.JSONObject;	 Catch:{ Exception -> 0x017e }
            r2.<init>();	 Catch:{ Exception -> 0x017e }
            r1.f11274e = r2;	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11274e;	 Catch:{ Exception -> 0x017e }
            r2 = "ts";	 Catch:{ Exception -> 0x017e }
            r3 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r3);	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11273d;	 Catch:{ Exception -> 0x017e }
            r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ Exception -> 0x017e }
            if (r1 != 0) goto L_0x0067;	 Catch:{ Exception -> 0x017e }
        L_0x0056:
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11274e;	 Catch:{ Exception -> 0x017e }
            r2 = "rl";	 Catch:{ Exception -> 0x017e }
            r3 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r3 = r3.f11273d;	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r3);	 Catch:{ Exception -> 0x017e }
        L_0x0067:
            r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x017e }
            r1.<init>();	 Catch:{ Exception -> 0x017e }
            r2 = "/";	 Catch:{ Exception -> 0x017e }
            r1.append(r2);	 Catch:{ Exception -> 0x017e }
            r2 = r0.getClass();	 Catch:{ Exception -> 0x017e }
            r2 = r2.getSimpleName();	 Catch:{ Exception -> 0x017e }
            r1.append(r2);	 Catch:{ Exception -> 0x017e }
            r7 = r1.toString();	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11274e;	 Catch:{ Exception -> 0x017e }
            r2 = "v";	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r7);	 Catch:{ Exception -> 0x017e }
            r1 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;	 Catch:{ Exception -> 0x017e }
            r1 = r0.findViewById(r1);	 Catch:{ Exception -> 0x017e }
            r1 = (android.view.ViewGroup) r1;	 Catch:{ Exception -> 0x017e }
            if (r1 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0096:
            r2 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f11278i;	 Catch:{ Exception -> 0x017e }
            r2 = r2.m13070a(r0);	 Catch:{ Exception -> 0x017e }
            if (r2 == 0) goto L_0x00aa;	 Catch:{ Exception -> 0x017e }
        L_0x00a2:
            r3 = r2.m13065d();	 Catch:{ Exception -> 0x017e }
            if (r3 == 0) goto L_0x00aa;	 Catch:{ Exception -> 0x017e }
        L_0x00a8:
            r3 = 1;	 Catch:{ Exception -> 0x017e }
            goto L_0x00ab;	 Catch:{ Exception -> 0x017e }
        L_0x00aa:
            r3 = 0;	 Catch:{ Exception -> 0x017e }
        L_0x00ab:
            r4 = 0;	 Catch:{ Exception -> 0x017e }
            if (r2 == 0) goto L_0x00c6;	 Catch:{ Exception -> 0x017e }
        L_0x00ae:
            r3 = r2.m13065d();	 Catch:{ Exception -> 0x017e }
            r4 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r4 = r4.f11274e;	 Catch:{ Exception -> 0x017e }
            r5 = "h";	 Catch:{ Exception -> 0x017e }
            r6 = r3 ^ 1;	 Catch:{ Exception -> 0x017e }
            r4.put(r5, r6);	 Catch:{ Exception -> 0x017e }
            r2 = r2.m13064c();	 Catch:{ Exception -> 0x017e }
            r8 = r2;	 Catch:{ Exception -> 0x017e }
            r6 = r3;	 Catch:{ Exception -> 0x017e }
            goto L_0x00c8;	 Catch:{ Exception -> 0x017e }
        L_0x00c6:
            r6 = r3;	 Catch:{ Exception -> 0x017e }
            r8 = r4;	 Catch:{ Exception -> 0x017e }
        L_0x00c8:
            if (r8 == 0) goto L_0x00f8;	 Catch:{ Exception -> 0x017e }
        L_0x00ca:
            r2 = r8.length();	 Catch:{ Exception -> 0x017e }
            if (r2 <= 0) goto L_0x00f8;	 Catch:{ Exception -> 0x017e }
        L_0x00d0:
            r4 = new org.json.JSONArray;	 Catch:{ Exception -> 0x017e }
            r4.<init>();	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11274e;	 Catch:{ Exception -> 0x017e }
            r2 = "ck";	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r4);	 Catch:{ Exception -> 0x017e }
            r3 = new org.json.JSONArray;	 Catch:{ Exception -> 0x017e }
            r3.<init>();	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11274e;	 Catch:{ Exception -> 0x017e }
            r2 = "cd";	 Catch:{ Exception -> 0x017e }
            r1.put(r2, r3);	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = r8;	 Catch:{ Exception -> 0x017e }
            r5 = r0;	 Catch:{ Exception -> 0x017e }
            r1.m13045a(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x017e }
            goto L_0x011d;	 Catch:{ Exception -> 0x017e }
        L_0x00f8:
            r2 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f11280k;	 Catch:{ Exception -> 0x017e }
            r2 = r2.contains(r7);	 Catch:{ Exception -> 0x017e }
            if (r2 != 0) goto L_0x011d;	 Catch:{ Exception -> 0x017e }
        L_0x0104:
            r2 = new org.json.JSONArray;	 Catch:{ Exception -> 0x017e }
            r2.<init>();	 Catch:{ Exception -> 0x017e }
            r3 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r3 = r3.f11274e;	 Catch:{ Exception -> 0x017e }
            r4 = "ck";	 Catch:{ Exception -> 0x017e }
            r3.put(r4, r2);	 Catch:{ Exception -> 0x017e }
            r3 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r4 = r0.getResources();	 Catch:{ Exception -> 0x017e }
            r3.m13040a(r1, r2, r4);	 Catch:{ Exception -> 0x017e }
        L_0x011d:
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11280k;	 Catch:{ Exception -> 0x017e }
            r1.add(r7);	 Catch:{ Exception -> 0x017e }
            r1 = io.branch.referral.C2754n.m13342a(r0);	 Catch:{ Exception -> 0x017e }
            r2 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f11274e;	 Catch:{ Exception -> 0x017e }
            r1.m13366a(r2);	 Catch:{ Exception -> 0x017e }
            r1 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r1 = r1.f11278i;	 Catch:{ Exception -> 0x017e }
            r1 = r1.m13070a(r0);	 Catch:{ Exception -> 0x017e }
            r1 = r1.m13062a();	 Catch:{ Exception -> 0x017e }
            r2 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r3 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r3 = r3.f11278i;	 Catch:{ Exception -> 0x017e }
            r0 = r3.m13070a(r0);	 Catch:{ Exception -> 0x017e }
            r0 = r0.m13063b();	 Catch:{ Exception -> 0x017e }
            r2.f11276g = r0;	 Catch:{ Exception -> 0x017e }
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f11275f;	 Catch:{ Exception -> 0x017e }
            r2 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f11276g;	 Catch:{ Exception -> 0x017e }
            if (r0 >= r2) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0162:
            r0 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ Exception -> 0x017e }
            if (r1 < r0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0166:
            if (r8 == 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x0168:
            r0 = r8.length();	 Catch:{ Exception -> 0x017e }
            if (r0 <= 0) goto L_0x017e;	 Catch:{ Exception -> 0x017e }
        L_0x016e:
            r0 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r0 = r0.f11271b;	 Catch:{ Exception -> 0x017e }
            r2 = r9.f11265a;	 Catch:{ Exception -> 0x017e }
            r2 = r2.f11281l;	 Catch:{ Exception -> 0x017e }
            r3 = (long) r1;	 Catch:{ Exception -> 0x017e }
            r0.postDelayed(r2, r3);	 Catch:{ Exception -> 0x017e }
        L_0x017e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.1.run():void");
        }
    }

    /* renamed from: io.branch.indexing.a$2 */
    class C26942 implements OnScrollChangedListener {
        /* renamed from: a */
        final /* synthetic */ C2697a f11266a;

        C26942(C2697a c2697a) {
            this.f11266a = c2697a;
        }

        public void onScrollChanged() {
            this.f11266a.f11271b.removeCallbacks(this.f11266a.f11283n);
            if (this.f11266a.f11276g > this.f11266a.f11275f) {
                this.f11266a.f11271b.postDelayed(this.f11266a.f11283n, 1500);
            }
        }
    }

    /* renamed from: io.branch.indexing.a$3 */
    class C26953 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2697a f11267a;

        C26953(C2697a c2697a) {
            this.f11267a = c2697a;
        }

        public void run() {
            this.f11267a.f11281l.run();
        }
    }

    /* renamed from: io.branch.indexing.a$a */
    private class C2696a {
        /* renamed from: a */
        MessageDigest f11268a;
        /* renamed from: b */
        final /* synthetic */ C2697a f11269b;

        C2696a(io.branch.indexing.C2697a r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r0 = this;
            r0.f11269b = r1;
            r0.<init>();
            r1 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x000d }
            r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x000d }
            r0.f11268a = r1;	 Catch:{ NoSuchAlgorithmException -> 0x000d }
        L_0x000d:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.a.<init>(io.branch.indexing.a):void");
        }

        /* renamed from: a */
        String m13032a(String str) {
            String str2 = "";
            if (this.f11268a == null) {
                return str2;
            }
            this.f11268a.reset();
            this.f11268a.update(str.getBytes());
            return new String(this.f11268a.digest());
        }
    }

    /* renamed from: a */
    public static C2697a m13035a() {
        if (f11270a == null) {
            f11270a = new C2697a();
        }
        return f11270a;
    }

    private C2697a() {
    }

    /* renamed from: a */
    public void m13060a(Activity activity, String str) {
        this.f11278i = C2699b.m13067a((Context) activity);
        this.f11273d = str;
        str = this.f11278i.m13070a(activity);
        if (str != null) {
            if (str.m13066e() == null) {
                m13048b(activity);
            }
        } else if (TextUtils.isEmpty(this.f11273d) == null) {
            m13048b(activity);
        }
    }

    /* renamed from: a */
    public void m13059a(Activity activity) {
        if (!(this.f11272c == null || this.f11272c.get() == null || ((Activity) this.f11272c.get()).getClass().getName().equals(activity.getClass().getName()) == null)) {
            this.f11271b.removeCallbacks(this.f11281l);
            this.f11272c = null;
        }
        m13047b();
        for (WeakReference weakReference : this.f11279j.values()) {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.f11282m);
            }
        }
        this.f11279j.clear();
    }

    /* renamed from: b */
    public void m13061b(Activity activity, String str) {
        this.f11280k = new ArrayList();
        m13060a(activity, str);
    }

    /* renamed from: b */
    private void m13048b(Activity activity) {
        this.f11275f = 0;
        if (this.f11280k.size() < this.f11278i.m13075d()) {
            this.f11271b.removeCallbacks(this.f11281l);
            this.f11272c = new WeakReference(activity);
            this.f11271b.postDelayed(this.f11281l, 1000);
        }
    }

    /* renamed from: b */
    private void m13047b() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = r4.f11274e;	 Catch:{ JSONException -> 0x000f }
        if (r0 == 0) goto L_0x000f;	 Catch:{ JSONException -> 0x000f }
    L_0x0004:
        r0 = r4.f11274e;	 Catch:{ JSONException -> 0x000f }
        r1 = "tc";	 Catch:{ JSONException -> 0x000f }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ JSONException -> 0x000f }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x000f }
    L_0x000f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.b():void");
    }

    /* renamed from: a */
    private void m13040a(ViewGroup viewGroup, JSONArray jSONArray, Resources resources) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (!(childAt instanceof AbsListView)) {
                    if (!childAt.getClass().getSimpleName().equals("RecyclerView")) {
                        if (childAt instanceof ViewGroup) {
                            m13040a((ViewGroup) childAt, jSONArray, resources);
                        } else if (childAt instanceof TextView) {
                            jSONArray.put(m13036a(childAt, resources));
                        }
                    }
                }
                m13039a((ViewGroup) childAt, resources, jSONArray);
            }
        }
    }

    /* renamed from: a */
    private void m13039a(ViewGroup viewGroup, Resources resources, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        if (viewGroup != null && viewGroup.getChildCount() > -1) {
            int i = 1;
            if (viewGroup.getChildCount() <= 1) {
                i = 0;
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONObject.put(m13036a((View) viewGroup, resources), jSONArray2);
                } catch (ViewGroup viewGroup2) {
                    viewGroup2.printStackTrace();
                }
                if ((childAt instanceof ViewGroup) != null) {
                    m13040a((ViewGroup) childAt, jSONArray2, resources);
                } else if ((childAt instanceof TextView) != null) {
                    jSONArray2.put(m13036a(childAt, resources));
                }
                if (jSONObject.length() > null) {
                    viewGroup2 = new StringBuilder();
                    viewGroup2.append("$");
                    viewGroup2.append(jSONObject);
                    jSONArray.put(viewGroup2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private void m13045a(org.json.JSONArray r9, org.json.JSONArray r10, org.json.JSONArray r11, android.app.Activity r12, boolean r13) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r8 = this;
        r0 = 0;
    L_0x0001:
        r1 = r9.length();	 Catch:{ JSONException -> 0x003c }
        if (r0 >= r1) goto L_0x003c;	 Catch:{ JSONException -> 0x003c }
    L_0x0007:
        r3 = r9.getString(r0);	 Catch:{ JSONException -> 0x003c }
        r1 = "$";	 Catch:{ JSONException -> 0x003c }
        r1 = r3.startsWith(r1);	 Catch:{ JSONException -> 0x003c }
        if (r1 == 0) goto L_0x001c;	 Catch:{ JSONException -> 0x003c }
    L_0x0013:
        r2 = r8;	 Catch:{ JSONException -> 0x003c }
        r4 = r12;	 Catch:{ JSONException -> 0x003c }
        r5 = r13;	 Catch:{ JSONException -> 0x003c }
        r6 = r10;	 Catch:{ JSONException -> 0x003c }
        r7 = r11;	 Catch:{ JSONException -> 0x003c }
        r2.m13043a(r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x003c }
        goto L_0x0039;	 Catch:{ JSONException -> 0x003c }
    L_0x001c:
        r1 = r12.getResources();	 Catch:{ JSONException -> 0x003c }
        r2 = r9.getString(r0);	 Catch:{ JSONException -> 0x003c }
        r4 = "id";	 Catch:{ JSONException -> 0x003c }
        r5 = r12.getPackageName();	 Catch:{ JSONException -> 0x003c }
        r1 = r1.getIdentifier(r2, r4, r5);	 Catch:{ JSONException -> 0x003c }
        r4 = r12.findViewById(r1);	 Catch:{ JSONException -> 0x003c }
        r2 = r8;	 Catch:{ JSONException -> 0x003c }
        r5 = r13;	 Catch:{ JSONException -> 0x003c }
        r6 = r10;	 Catch:{ JSONException -> 0x003c }
        r7 = r11;	 Catch:{ JSONException -> 0x003c }
        r2.m13044a(r3, r4, r5, r6, r7);	 Catch:{ JSONException -> 0x003c }
    L_0x0039:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x003c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.a(org.json.JSONArray, org.json.JSONArray, org.json.JSONArray, android.app.Activity, boolean):void");
    }

    /* renamed from: a */
    private void m13043a(String str, Activity activity, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        JSONObject jSONObject = new JSONObject();
        jSONArray2.put(str);
        jSONArray.put(jSONObject);
        str = str.replace("$", "");
        try {
            jSONArray = new JSONObject(str);
            if (jSONArray.length() > null) {
                String str2 = (String) jSONArray.keys().next();
                int identifier = activity.getResources().getIdentifier(str2, FacebookAdapter.KEY_ID, activity.getPackageName());
                View findViewById = activity.getCurrentFocus() != null ? activity.getCurrentFocus().findViewById(identifier) : null;
                if (findViewById == null) {
                    findViewById = activity.findViewById(identifier);
                }
                if (findViewById != null && (findViewById instanceof ViewGroup)) {
                    int i;
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    jSONArray2 = jSONArray.getJSONArray(str2);
                    int[] iArr = new int[jSONArray2.length()];
                    Object obj = null;
                    for (i = 0; i < jSONArray2.length(); i++) {
                        iArr[i] = activity.getResources().getIdentifier(jSONArray2.getString(i), FacebookAdapter.KEY_ID, activity.getPackageName());
                    }
                    activity = (viewGroup instanceof AbsListView) != null ? ((AbsListView) viewGroup).getFirstVisiblePosition() : null;
                    for (i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("");
                            stringBuilder.append(i + activity);
                            jSONObject.put(stringBuilder.toString(), jSONObject2);
                            for (int i2 = 0; i2 < iArr.length; i2++) {
                                if (viewGroup.getChildAt(i) != null) {
                                    View findViewById2 = viewGroup.getChildAt(i).findViewById(iArr[i2]);
                                    if (findViewById2 instanceof TextView) {
                                        jSONObject2.put(jSONArray2.getString(i2), m13037a(findViewById2, z));
                                    }
                                }
                            }
                        }
                    }
                    if (!(jSONArray.has("bnc_esw") == null || jSONArray.getBoolean("bnc_esw") == null)) {
                        obj = 1;
                    }
                    if (obj != null && this.f11279j.containsKey(str) == null) {
                        viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f11282m);
                        this.f11279j.put(str, new WeakReference(viewGroup.getViewTreeObserver()));
                    }
                }
            }
        } catch (String str3) {
            str3.printStackTrace();
        }
    }

    /* renamed from: a */
    private java.lang.String m13036a(android.view.View r2, android.content.res.Resources r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r1 = this;
        r0 = r2.getId();
        r0 = java.lang.String.valueOf(r0);
        r2 = r2.getId();	 Catch:{ Exception -> 0x0011 }
        r2 = r3.getResourceEntryName(r2);	 Catch:{ Exception -> 0x0011 }
        goto L_0x0012;
    L_0x0011:
        r2 = r0;
    L_0x0012:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.indexing.a.a(android.view.View, android.content.res.Resources):java.lang.String");
    }

    /* renamed from: a */
    private String m13037a(View view, boolean z) {
        TextView textView = (TextView) view;
        if (textView.getText() == null) {
            return null;
        }
        view = textView.getText().toString().substring(0, Math.min(textView.getText().toString().length(), this.f11278i.m13073b()));
        return z ? view : this.f11277h.m13032a(view);
    }

    /* renamed from: a */
    private void m13044a(String str, View view, boolean z, JSONArray jSONArray, JSONArray jSONArray2) {
        if (view instanceof TextView) {
            jSONArray.put(m13037a(view, z));
            jSONArray2.put(str);
        }
    }

    /* renamed from: a */
    public JSONObject m13058a(Context context) {
        JSONObject jSONObject;
        JSONObject C = C2754n.m13342a(context).m13350C();
        if (C.length() <= 0 || C.toString().length() >= this.f11278i.m13074c()) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("mv", C2699b.m13067a(context).m13076e()).put("e", C);
                if (context != null) {
                    jSONObject.put("p", context.getPackageName());
                    jSONObject.put("p", context.getPackageName());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C2754n.m13342a(context).m13351D();
        return jSONObject;
    }
}
