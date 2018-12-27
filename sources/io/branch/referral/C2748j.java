package io.branch.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import org.json.JSONObject;

/* renamed from: io.branch.referral.j */
public class C2748j {
    /* renamed from: a */
    private static C2748j f11572a;
    /* renamed from: b */
    private boolean f11573b;
    /* renamed from: c */
    private boolean f11574c;
    /* renamed from: d */
    private C2745a f11575d = null;
    /* renamed from: e */
    private boolean f11576e = false;
    /* renamed from: f */
    private String f11577f;
    /* renamed from: g */
    private boolean f11578g;
    /* renamed from: h */
    private Dialog f11579h;

    /* renamed from: io.branch.referral.j$a */
    private class C2745a {
        /* renamed from: a */
        final /* synthetic */ C2748j f11562a;
        /* renamed from: b */
        private String f11563b;
        /* renamed from: c */
        private String f11564c;
        /* renamed from: d */
        private int f11565d;
        /* renamed from: e */
        private String f11566e;
        /* renamed from: f */
        private String f11567f;

        private C2745a(io.branch.referral.C2748j r1, org.json.JSONObject r2, java.lang.String r3) {
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
            r0.f11562a = r1;
            r0.<init>();
            r1 = "";
            r0.f11563b = r1;
            r1 = "";
            r0.f11564c = r1;
            r1 = 1;
            r0.f11565d = r1;
            r1 = "";
            r0.f11566e = r1;
            r1 = "";
            r0.f11567f = r1;
            r0.f11564c = r3;	 Catch:{ Exception -> 0x007a }
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewID;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0032;	 Catch:{ Exception -> 0x007a }
        L_0x0026:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewID;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getString(r1);	 Catch:{ Exception -> 0x007a }
            r0.f11563b = r1;	 Catch:{ Exception -> 0x007a }
        L_0x0032:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewNumOfUse;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x004a;	 Catch:{ Exception -> 0x007a }
        L_0x003e:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewNumOfUse;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getInt(r1);	 Catch:{ Exception -> 0x007a }
            r0.f11565d = r1;	 Catch:{ Exception -> 0x007a }
        L_0x004a:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewUrl;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x0062;	 Catch:{ Exception -> 0x007a }
        L_0x0056:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewUrl;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getString(r1);	 Catch:{ Exception -> 0x007a }
            r0.f11566e = r1;	 Catch:{ Exception -> 0x007a }
        L_0x0062:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewHtml;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.has(r1);	 Catch:{ Exception -> 0x007a }
            if (r1 == 0) goto L_0x007a;	 Catch:{ Exception -> 0x007a }
        L_0x006e:
            r1 = io.branch.referral.Defines.Jsonkey.BranchViewHtml;	 Catch:{ Exception -> 0x007a }
            r1 = r1.m13131a();	 Catch:{ Exception -> 0x007a }
            r1 = r2.getString(r1);	 Catch:{ Exception -> 0x007a }
            r0.f11567f = r1;	 Catch:{ Exception -> 0x007a }
        L_0x007a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j.a.<init>(io.branch.referral.j, org.json.JSONObject, java.lang.String):void");
        }

        /* renamed from: a */
        private boolean m13292a(Context context) {
            if (this.f11565d <= C2754n.m13342a(context).m13418y(this.f11563b)) {
                if (this.f11565d != -1) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: a */
        public void m13297a(Context context, String str) {
            C2754n.m13342a(context).m13417x(str);
        }
    }

    /* renamed from: io.branch.referral.j$b */
    public interface C2746b {
        /* renamed from: a */
        void mo3526a(int i, String str, String str2);

        /* renamed from: b */
        void mo3527b(String str, String str2);

        /* renamed from: c */
        void mo3528c(String str, String str2);

        /* renamed from: d */
        void mo3529d(String str, String str2);
    }

    /* renamed from: io.branch.referral.j$c */
    private class C2747c extends AsyncTask<Void, Void, Boolean> {
        /* renamed from: a */
        final /* synthetic */ C2748j f11568a;
        /* renamed from: b */
        private final C2745a f11569b;
        /* renamed from: c */
        private final Context f11570c;
        /* renamed from: d */
        private final C2746b f11571d;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m13302a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m13303a((Boolean) obj);
        }

        public C2747c(C2748j c2748j, C2745a c2745a, Context context, C2746b c2746b) {
            this.f11568a = c2748j;
            this.f11569b = c2745a;
            this.f11570c = context;
            this.f11571d = c2746b;
        }

        /* renamed from: a */
        protected java.lang.Boolean m13302a(java.lang.Void... r8) {
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
            r7 = this;
            r8 = 0;
            r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            r1 = -1;
            r2 = new java.net.URL;	 Catch:{ Exception -> 0x004c }
            r3 = r7.f11569b;	 Catch:{ Exception -> 0x004c }
            r3 = r3.f11566e;	 Catch:{ Exception -> 0x004c }
            r2.<init>(r3);	 Catch:{ Exception -> 0x004c }
            r2 = r2.openConnection();	 Catch:{ Exception -> 0x004c }
            r2 = (java.net.HttpURLConnection) r2;	 Catch:{ Exception -> 0x004c }
            r3 = "GET";	 Catch:{ Exception -> 0x004c }
            r2.setRequestMethod(r3);	 Catch:{ Exception -> 0x004c }
            r2.connect();	 Catch:{ Exception -> 0x004c }
            r3 = r2.getResponseCode();	 Catch:{ Exception -> 0x004c }
            if (r3 != r0) goto L_0x004d;
        L_0x0023:
            r4 = new java.io.ByteArrayOutputStream;	 Catch:{ Exception -> 0x004d }
            r4.<init>();	 Catch:{ Exception -> 0x004d }
            r2 = r2.getInputStream();	 Catch:{ Exception -> 0x004d }
            r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ Exception -> 0x004d }
            r5 = new byte[r5];	 Catch:{ Exception -> 0x004d }
        L_0x0030:
            r6 = r2.read(r5);	 Catch:{ Exception -> 0x004d }
            if (r6 == r1) goto L_0x003a;	 Catch:{ Exception -> 0x004d }
        L_0x0036:
            r4.write(r5, r8, r6);	 Catch:{ Exception -> 0x004d }
            goto L_0x0030;	 Catch:{ Exception -> 0x004d }
        L_0x003a:
            r1 = r7.f11569b;	 Catch:{ Exception -> 0x004d }
            r5 = "UTF-8";	 Catch:{ Exception -> 0x004d }
            r5 = r4.toString(r5);	 Catch:{ Exception -> 0x004d }
            r1.f11567f = r5;	 Catch:{ Exception -> 0x004d }
            r4.close();	 Catch:{ Exception -> 0x004d }
            r2.close();	 Catch:{ Exception -> 0x004d }
            goto L_0x004d;
        L_0x004c:
            r3 = -1;
        L_0x004d:
            if (r3 != r0) goto L_0x0050;
        L_0x004f:
            r8 = 1;
        L_0x0050:
            r8 = java.lang.Boolean.valueOf(r8);
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j.c.a(java.lang.Void[]):java.lang.Boolean");
        }

        /* renamed from: a */
        protected void m13303a(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue() != null) {
                this.f11568a.m13315b(this.f11569b, this.f11570c, this.f11571d);
            } else if (this.f11571d != null) {
                this.f11571d.mo3526a(-202, "Unable to create a Branch view due to a temporary network error", this.f11569b.f11564c);
            }
            this.f11568a.f11576e = false;
        }
    }

    private C2748j() {
    }

    /* renamed from: a */
    public static C2748j m13306a() {
        if (f11572a == null) {
            f11572a = new C2748j();
        }
        return f11572a;
    }

    /* renamed from: a */
    public boolean m13320a(Context context) {
        context = m13311a(this.f11575d, context, null);
        if (context != null) {
            this.f11575d = null;
        }
        return context;
    }

    /* renamed from: a */
    public boolean m13322a(JSONObject jSONObject, String str, Context context, C2746b c2746b) {
        return m13311a(new C2745a(jSONObject, str), context, c2746b);
    }

    /* renamed from: a */
    private boolean m13311a(C2745a c2745a, Context context, C2746b c2746b) {
        if (!this.f11573b) {
            if (!this.f11576e) {
                this.f11573b = false;
                this.f11574c = false;
                if (!(context == null || c2745a == null)) {
                    if (c2745a.m13292a(context)) {
                        if (TextUtils.isEmpty(c2745a.f11567f)) {
                            this.f11576e = true;
                            new C2747c(this, c2745a, context, c2746b).execute(new Void[0]);
                        } else {
                            m13315b(c2745a, context, c2746b);
                        }
                        return true;
                    } else if (c2746b != null) {
                        c2746b.mo3526a(-203, "Unable to create this Branch view. Reached maximum usage limit ", c2745a.f11564c);
                    }
                }
                return false;
            }
        }
        if (c2746b != null) {
            c2746b.mo3526a(-200, "Unable to create a Branch view. A Branch view is already showing", c2745a.f11564c);
        }
        return false;
    }

    /* renamed from: b */
    private void m13315b(final C2745a c2745a, Context context, final C2746b c2746b) {
        if (!(context == null || c2745a == null)) {
            final WebView webView = new WebView(context);
            webView.getSettings().setJavaScriptEnabled(true);
            if (VERSION.SDK_INT >= 19) {
                webView.setLayerType(2, null);
            }
            this.f11578g = null;
            if (TextUtils.isEmpty(c2745a.f11567f) == null) {
                webView.loadDataWithBaseURL(null, c2745a.f11567f, "text/html", "utf-8", null);
                webView.setWebViewClient(new WebViewClient(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2748j f11558d;

                    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                        boolean a = this.f11558d.m13314a(str);
                        if (!a) {
                            webView.loadUrl(str);
                        } else if (this.f11558d.f11579h != null) {
                            this.f11558d.f11579h.dismiss();
                        }
                        return a;
                    }

                    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                        super.onPageStarted(webView, str, bitmap);
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        this.f11558d.f11578g = 1;
                    }

                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        this.f11558d.m13308a(c2745a, c2746b, webView);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    private void m13308a(final C2745a c2745a, final C2746b c2746b, WebView webView) {
        if (this.f11578g || Branch.m23406b() == null || Branch.m23406b().f17935f == null) {
            this.f11573b = false;
            if (c2746b != null) {
                c2746b.mo3526a(-202, "Unable to create a Branch view due to a temporary network error", c2745a.f11564c);
            }
        } else {
            Activity activity = (Activity) Branch.m23406b().f17935f.get();
            if (activity != null) {
                c2745a.m13297a(activity.getApplicationContext(), c2745a.f11563b);
                this.f11577f = activity.getClass().getName();
                View relativeLayout = new RelativeLayout(activity);
                relativeLayout.setVisibility(8);
                relativeLayout.addView(webView, new LayoutParams(-1, -1));
                relativeLayout.setBackgroundColor(0);
                if (this.f11579h == null || !this.f11579h.isShowing()) {
                    this.f11579h = new Dialog(activity, 16973834);
                    this.f11579h.setContentView(relativeLayout);
                    relativeLayout.setVisibility(0);
                    webView.setVisibility(0);
                    this.f11579h.show();
                    m13307a(relativeLayout);
                    m13307a((View) webView);
                    this.f11573b = true;
                    if (c2746b != null) {
                        c2746b.mo3527b(c2745a.f11564c, c2745a.f11563b);
                    }
                    this.f11579h.setOnDismissListener(new OnDismissListener(this) {
                        /* renamed from: c */
                        final /* synthetic */ C2748j f11561c;

                        public void onDismiss(DialogInterface dialogInterface) {
                            this.f11561c.f11573b = false;
                            this.f11561c.f11579h = null;
                            if (c2746b == null) {
                                return;
                            }
                            if (this.f11561c.f11574c != null) {
                                c2746b.mo3528c(c2745a.f11564c, c2745a.f11563b);
                            } else {
                                c2746b.mo3529d(c2745a.f11564c, c2745a.f11563b);
                            }
                        }
                    });
                } else {
                    if (c2746b != null) {
                        c2746b.mo3526a(-200, "Unable to create a Branch view. A Branch view is already showing", c2745a.f11564c);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m13314a(java.lang.String r5) {
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
        r0 = 0;
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0032 }
        r1.<init>(r5);	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r1.getScheme();	 Catch:{ URISyntaxException -> 0x0032 }
        r2 = "branch-cta";	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r5.equalsIgnoreCase(r2);	 Catch:{ URISyntaxException -> 0x0032 }
        r2 = 1;	 Catch:{ URISyntaxException -> 0x0032 }
        if (r5 == 0) goto L_0x0032;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x0013:
        r5 = r1.getHost();	 Catch:{ URISyntaxException -> 0x0032 }
        r3 = "accept";	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r5.equalsIgnoreCase(r3);	 Catch:{ URISyntaxException -> 0x0032 }
        if (r5 == 0) goto L_0x0023;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x001f:
        r4.f11574c = r2;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x0021:
        r0 = 1;	 Catch:{ URISyntaxException -> 0x0032 }
        goto L_0x0032;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x0023:
        r5 = r1.getHost();	 Catch:{ URISyntaxException -> 0x0032 }
        r1 = "cancel";	 Catch:{ URISyntaxException -> 0x0032 }
        r5 = r5.equalsIgnoreCase(r1);	 Catch:{ URISyntaxException -> 0x0032 }
        if (r5 == 0) goto L_0x0032;	 Catch:{ URISyntaxException -> 0x0032 }
    L_0x002f:
        r4.f11574c = r0;	 Catch:{ URISyntaxException -> 0x0032 }
        goto L_0x0021;
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.j.a(java.lang.String):boolean");
    }

    /* renamed from: a */
    private void m13307a(View view) {
        Animation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(500);
        alphaAnimation.setStartOffset(10);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setFillAfter(true);
        view.setVisibility(0);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public boolean m13321a(JSONObject jSONObject, String str) {
        C2745a c2745a = new C2745a(jSONObject, str);
        if (Branch.m23406b().f17935f != null) {
            Context context = (Activity) Branch.m23406b().f17935f.get();
            if (context != null && c2745a.m13292a(context)) {
                this.f11575d = new C2745a(jSONObject, str);
                return true;
            }
        }
        return null;
    }

    /* renamed from: b */
    public boolean m13323b(Context context) {
        return (this.f11575d == null || this.f11575d.m13292a(context) == null) ? null : true;
    }

    /* renamed from: a */
    public void m13319a(Activity activity) {
        if (this.f11577f != null && this.f11577f.equalsIgnoreCase(activity.getClass().getName()) != null) {
            this.f11573b = null;
        }
    }
}
