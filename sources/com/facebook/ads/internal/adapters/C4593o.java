package com.facebook.ads.internal.adapters;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.p095n.C1839f;
import com.facebook.ads.internal.p095n.C1842j;
import com.facebook.ads.internal.p095n.C1844m;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAdView;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.o */
public class C4593o extends ai implements af {
    /* renamed from: a */
    private static final String f19011a = "o";
    /* renamed from: b */
    private View f19012b;
    /* renamed from: c */
    private NativeAd f19013c;
    /* renamed from: d */
    private aj f19014d;
    /* renamed from: e */
    private NativeAdView f19015e;
    /* renamed from: f */
    private View f19016f;
    /* renamed from: g */
    private boolean f19017g;
    /* renamed from: h */
    private Uri f19018h;
    /* renamed from: i */
    private Uri f19019i;
    /* renamed from: j */
    private String f19020j;
    /* renamed from: k */
    private String f19021k;
    /* renamed from: l */
    private String f19022l;
    /* renamed from: m */
    private String f19023m;

    /* renamed from: com.facebook.ads.internal.adapters.o$4 */
    class C17514 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4593o f5291a;

        C17514(C4593o c4593o) {
            this.f5291a = c4593o;
        }

        public void onClick(View view) {
            this.f5291a.f19016f.performClick();
        }
    }

    /* renamed from: a */
    private void m25317a(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: a */
    public void mo3939a(int i) {
    }

    /* renamed from: a */
    public void mo3940a(final android.content.Context r10, com.facebook.ads.internal.adapters.aj r11, com.facebook.ads.internal.p094m.C1827c r12, java.util.Map<java.lang.String, java.lang.Object> r13, com.facebook.ads.internal.p095n.C1837d.C1836c r14) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r14 = r9.mo3967x();
        r14 = com.facebook.ads.internal.adapters.ag.m6591a(r14);
        r12.append(r14);
        r14 = " Loading";
        r12.append(r14);
        r12 = r12.toString();
        com.facebook.ads.internal.p101q.p102a.C1909d.m7258a(r10, r12);
        r12 = "data";
        r12 = r13.get(r12);
        r12 = (org.json.JSONObject) r12;
        r13 = "ad_unit_id";
        r13 = r12.optString(r13);
        r14 = "creative_types";
        r12 = r12.optJSONArray(r14);
        r14 = 0;
        r0 = 1;
        if (r12 == 0) goto L_0x009a;
    L_0x0034:
        r1 = r12.length();
        r2 = 0;
        r3 = 0;
        r4 = 0;
    L_0x003b:
        if (r2 >= r1) goto L_0x0098;
    L_0x003d:
        r5 = r12.getString(r2);	 Catch:{ JSONException -> 0x0070 }
        if (r5 == 0) goto L_0x006d;	 Catch:{ JSONException -> 0x0070 }
    L_0x0043:
        r6 = -1;	 Catch:{ JSONException -> 0x0070 }
        r7 = r5.hashCode();	 Catch:{ JSONException -> 0x0070 }
        r8 = 704091517; // 0x29f7957d float:1.09949356E-13 double:3.4786743E-315;	 Catch:{ JSONException -> 0x0070 }
        if (r7 == r8) goto L_0x005d;	 Catch:{ JSONException -> 0x0070 }
    L_0x004d:
        r8 = 883765328; // 0x34ad3050 float:3.2258913E-7 double:4.366380876E-315;	 Catch:{ JSONException -> 0x0070 }
        if (r7 == r8) goto L_0x0053;	 Catch:{ JSONException -> 0x0070 }
    L_0x0052:
        goto L_0x0066;	 Catch:{ JSONException -> 0x0070 }
    L_0x0053:
        r7 = "page_post";	 Catch:{ JSONException -> 0x0070 }
        r5 = r5.equals(r7);	 Catch:{ JSONException -> 0x0070 }
        if (r5 == 0) goto L_0x0066;	 Catch:{ JSONException -> 0x0070 }
    L_0x005b:
        r6 = 1;	 Catch:{ JSONException -> 0x0070 }
        goto L_0x0066;	 Catch:{ JSONException -> 0x0070 }
    L_0x005d:
        r7 = "app_install";	 Catch:{ JSONException -> 0x0070 }
        r5 = r5.equals(r7);	 Catch:{ JSONException -> 0x0070 }
        if (r5 == 0) goto L_0x0066;
    L_0x0065:
        r6 = 0;
    L_0x0066:
        switch(r6) {
            case 0: goto L_0x006c;
            case 1: goto L_0x006a;
            default: goto L_0x0069;
        };
    L_0x0069:
        goto L_0x006d;
    L_0x006a:
        r4 = 1;
        goto L_0x006d;
    L_0x006c:
        r3 = 1;
    L_0x006d:
        r2 = r2 + 1;
        goto L_0x003b;
    L_0x0070:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = r9.mo3967x();
        r13 = com.facebook.ads.internal.adapters.ag.m6591a(r13);
        r12.append(r13);
        r13 = " AN server error";
        r12.append(r13);
        r12 = r12.toString();
        com.facebook.ads.internal.p101q.p102a.C1909d.m7258a(r10, r12);
        r10 = com.facebook.ads.internal.protocol.AdErrorType.SERVER_ERROR;
        r12 = "Server Error";
        r10 = com.facebook.ads.internal.protocol.C1894a.m7228a(r10, r12);
        r11.mo1319a(r9, r10);
        return;
    L_0x0098:
        r14 = r3;
        goto L_0x009b;
    L_0x009a:
        r4 = 0;
    L_0x009b:
        r12 = android.text.TextUtils.isEmpty(r13);
        if (r12 != 0) goto L_0x00ec;
    L_0x00a1:
        if (r14 != 0) goto L_0x00a6;
    L_0x00a3:
        if (r4 != 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00ec;
    L_0x00a6:
        r9.f19014d = r11;
        r11 = new com.google.android.gms.ads.AdLoader$Builder;
        r11.<init>(r10, r13);
        if (r14 == 0) goto L_0x00b7;
    L_0x00af:
        r12 = new com.facebook.ads.internal.adapters.o$1;
        r12.<init>(r9, r10);
        r11.forAppInstallAd(r12);
    L_0x00b7:
        if (r4 == 0) goto L_0x00c1;
    L_0x00b9:
        r12 = new com.facebook.ads.internal.adapters.o$2;
        r12.<init>(r9, r10);
        r11.forContentAd(r12);
    L_0x00c1:
        r12 = new com.facebook.ads.internal.adapters.o$3;
        r12.<init>(r9, r10);
        r10 = r11.withAdListener(r12);
        r11 = new com.google.android.gms.ads.formats.NativeAdOptions$Builder;
        r11.<init>();
        r11 = r11.setReturnUrlsForImageAssets(r0);
        r11 = r11.build();
        r10 = r10.withNativeAdOptions(r11);
        r10 = r10.build();
        r11 = new com.google.android.gms.ads.AdRequest$Builder;
        r11.<init>();
        r11 = r11.build();
        r10.loadAd(r11);
        return;
    L_0x00ec:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = r9.mo3967x();
        r13 = com.facebook.ads.internal.adapters.ag.m6591a(r13);
        r12.append(r13);
        r13 = " AN server error";
        r12.append(r13);
        r12 = r12.toString();
        com.facebook.ads.internal.p101q.p102a.C1909d.m7258a(r10, r12);
        r10 = com.facebook.ads.internal.protocol.AdErrorType.SERVER_ERROR;
        r12 = "Server Error";
        r10 = com.facebook.ads.internal.protocol.C1894a.m7228a(r10, r12);
        r11.mo1319a(r9, r10);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.o.a(android.content.Context, com.facebook.ads.internal.adapters.aj, com.facebook.ads.internal.m.c, java.util.Map, com.facebook.ads.internal.n.d$c):void");
    }

    /* renamed from: a */
    public void mo3941a(View view, List<View> list) {
        this.f19012b = view;
        if (k_()) {
            if (view != null) {
                ViewGroup viewGroup = null;
                int i = -1;
                do {
                    ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                    if (viewGroup2 != null) {
                        if (viewGroup2 instanceof NativeAdView) {
                            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                            if (viewGroup3 != null) {
                                int indexOfChild = viewGroup3.indexOfChild(viewGroup2);
                                viewGroup2.removeView(view);
                                viewGroup3.removeView(viewGroup2);
                                viewGroup3.addView(view, indexOfChild);
                                continue;
                            }
                        } else {
                            i = viewGroup2.indexOfChild(view);
                            viewGroup = viewGroup2;
                            continue;
                        }
                    }
                    Log.e(f19011a, "View must have valid parent for AdMob registration, skipping registration. Impressions and clicks will not be logged.");
                    return;
                } while (viewGroup == null);
                View nativeContentAdView = this.f19013c instanceof NativeContentAd ? new NativeContentAdView(view.getContext()) : new NativeAppInstallAdView(view.getContext());
                if (view instanceof ViewGroup) {
                    nativeContentAdView.setLayoutParams(view.getLayoutParams());
                }
                m25317a(view);
                nativeContentAdView.addView(view);
                viewGroup.removeView(nativeContentAdView);
                viewGroup.addView(nativeContentAdView, i);
                this.f19015e = nativeContentAdView;
                this.f19015e.setNativeAd(this.f19013c);
                this.f19016f = new View(view.getContext());
                this.f19015e.addView(this.f19016f);
                this.f19016f.setVisibility(8);
                if (this.f19015e instanceof NativeContentAdView) {
                    ((NativeContentAdView) this.f19015e).setCallToActionView(this.f19016f);
                } else if (this.f19015e instanceof NativeAppInstallAdView) {
                    ((NativeAppInstallAdView) this.f19015e).setCallToActionView(this.f19016f);
                }
                OnClickListener c17514 = new C17514(this);
                for (View onClickListener : list) {
                    onClickListener.setOnClickListener(c17514);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3942a(aj ajVar) {
        this.f19014d = ajVar;
    }

    /* renamed from: a */
    public void mo3943a(Map<String, String> map) {
        if (k_() && this.f19014d != null) {
            this.f19014d.mo1320b(this);
        }
    }

    /* renamed from: b */
    public void mo3944b(Map<String, String> map) {
    }

    /* renamed from: c */
    public String mo3945c() {
        return null;
    }

    /* renamed from: e */
    public void mo3946e() {
        j_();
        this.f19014d = null;
        this.f19013c = null;
        this.f19017g = false;
        this.f19018h = null;
        this.f19019i = null;
        this.f19020j = null;
        this.f19021k = null;
        this.f19022l = null;
        this.f19023m = null;
    }

    /* renamed from: f */
    public boolean mo3947f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo3948g() {
        return false;
    }

    /* renamed from: h */
    public int mo3949h() {
        return 0;
    }

    /* renamed from: i */
    public int mo3950i() {
        return 0;
    }

    /* renamed from: j */
    public int mo3951j() {
        return 0;
    }

    public void j_() {
        m25317a(this.f19016f);
        this.f19016f = null;
        if (this.f19012b != null) {
            View view = (ViewGroup) this.f19012b.getParent();
            if ((view instanceof NativeContentAdView) || (view instanceof NativeAppInstallAdView)) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    int indexOfChild = viewGroup.indexOfChild(view);
                    m25317a(this.f19012b);
                    m25317a(view);
                    viewGroup.addView(this.f19012b, indexOfChild);
                }
            }
            this.f19012b = null;
        }
        this.f19015e = null;
    }

    /* renamed from: k */
    public C1839f mo3953k() {
        return (!k_() || this.f19019i == null) ? null : new C1839f(this.f19019i.toString(), 50, 50);
    }

    public boolean k_() {
        return this.f19017g && this.f19013c != null;
    }

    /* renamed from: l */
    public C1839f mo3955l() {
        return (!k_() || this.f19018h == null) ? null : new C1839f(this.f19018h.toString(), 1200, 600);
    }

    /* renamed from: m */
    public C1842j mo3956m() {
        return null;
    }

    /* renamed from: n */
    public String mo3957n() {
        return this.f19022l;
    }

    /* renamed from: o */
    public String mo3958o() {
        return this.f19023m;
    }

    /* renamed from: p */
    public String mo3959p() {
        return null;
    }

    /* renamed from: q */
    public String mo3960q() {
        return null;
    }

    /* renamed from: r */
    public C1844m mo3961r() {
        return C1844m.DEFAULT;
    }

    /* renamed from: s */
    public int mo3962s() {
        return 0;
    }

    /* renamed from: t */
    public String mo3963t() {
        return null;
    }

    /* renamed from: u */
    public List<C1837d> mo3964u() {
        return null;
    }

    /* renamed from: v */
    public int mo3965v() {
        return 0;
    }

    /* renamed from: w */
    public int mo3966w() {
        return 0;
    }

    /* renamed from: x */
    public C1744f mo3967x() {
        return C1744f.ADMOB;
    }
}
