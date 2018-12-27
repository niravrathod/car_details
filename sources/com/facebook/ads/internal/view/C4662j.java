package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.ads.C4589h;
import com.facebook.ads.internal.adapters.ae;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.settings.C1963a.C1962a;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.C4617b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import java.util.UUID;

/* renamed from: com.facebook.ads.internal.view.j */
public class C4662j extends C3859a {
    /* renamed from: b */
    private final String f19282b = UUID.randomUUID().toString();
    /* renamed from: c */
    private final C3876k f19283c = new C46591(this);
    /* renamed from: d */
    private final C3874i f19284d = new C46602(this);
    /* renamed from: e */
    private final C3868c f19285e = new C46613(this);
    /* renamed from: f */
    private final ae f19286f;
    /* renamed from: g */
    private C1827c f19287g;
    /* renamed from: h */
    private C4617b f19288h;
    /* renamed from: i */
    private String f19289i;
    /* renamed from: j */
    private Uri f19290j;
    /* renamed from: k */
    private String f19291k;
    /* renamed from: l */
    private String f19292l;
    /* renamed from: m */
    private String f19293m;
    /* renamed from: n */
    private C2081k f19294n;
    /* renamed from: o */
    private C4589h f19295o;

    /* renamed from: com.facebook.ads.internal.view.j$1 */
    class C46591 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C4662j f19279a;

        C46591(C4662j c4662j) {
            this.f19279a = c4662j;
        }

        /* renamed from: a */
        public void m25665a(C3875j c3875j) {
            if (this.f19279a.f19294n != null) {
                this.f19279a.f19294n.mo1290c();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.j$2 */
    class C46602 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C4662j f19280a;

        C46602(C4662j c4662j) {
            this.f19280a = c4662j;
        }

        /* renamed from: a */
        public void m25667a(C3873h c3873h) {
            if (this.f19280a.f19294n != null) {
                this.f19280a.f19294n.mo1289b();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.j$3 */
    class C46613 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C4662j f19281a;

        C46613(C4662j c4662j) {
            this.f19281a = c4662j;
        }

        /* renamed from: a */
        public void m25669a(C3867b c3867b) {
            if (this.f19281a.f19294n != null) {
                this.f19281a.f19294n.mo1295h();
            }
        }
    }

    public C4662j(Context context) {
        super(context);
        this.f19286f = new ae(this, context);
        m25672t();
    }

    public C4662j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19286f = new ae(this, context);
        m25672t();
    }

    public C4662j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19286f = new ae(this, context);
        m25672t();
    }

    /* renamed from: a */
    private void m25671a(Intent intent) {
        if (this.f19289i == null || this.f19288h == null) {
            throw new IllegalStateException("Must setVideoReportUri first.");
        }
        if (this.f19290j == null) {
            if (this.f19292l == null) {
                throw new IllegalStateException("Must setVideoURI or setVideoMPD first.");
            }
        }
        intent.putExtra("useNativeCtaButton", this.f19293m);
        intent.putExtra("viewType", C1962a.FULL_SCREEN_VIDEO);
        intent.putExtra("videoURL", this.f19290j.toString());
        intent.putExtra("clientToken", this.f19291k == null ? "" : this.f19291k);
        intent.putExtra("videoMPD", this.f19292l);
        intent.putExtra("predefinedOrientationKey", 13);
        intent.putExtra("videoSeekTime", getCurrentPositionInMillis());
        intent.putExtra("uniqueId", this.f19282b);
        intent.putExtra("videoLogger", this.f19288h.mo1347i());
        intent.putExtra("video_time_polling_interval", getVideoProgressReportIntervalMs());
        intent.addFlags(268435456);
    }

    /* renamed from: t */
    private void m25672t() {
        getEventBus().m6830a(this.f19283c, this.f19284d, this.f19285e);
    }

    /* renamed from: a */
    public void m25673a(String str, String str2) {
        if (this.f19288h != null) {
            this.f19288h.mo3983a();
        }
        this.f19291k = str2;
        this.f19289i = str;
        C4617b c4617b = (str == null || str2 == null) ? null : new C4617b(getContext(), this.f19287g, this, str2);
        this.f19288h = c4617b;
    }

    public C2081k getListener() {
        return this.f19294n;
    }

    public String getUniqueId() {
        return this.f19282b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19286f.m6588a();
    }

    protected void onDetachedFromWindow() {
        this.f19286f.m6589b();
        super.onDetachedFromWindow();
    }

    /* renamed from: r */
    public void mo3991r() {
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
        r0 = r3.getContext();
        r1 = new android.content.Intent;
        r2 = com.facebook.ads.AudienceNetworkActivity.class;
        r1.<init>(r0, r2);
        r3.m25671a(r1);
        r2 = 0;
        r3.m19258a(r2);	 Catch:{ ActivityNotFoundException -> 0x0026 }
        r2 = 8;	 Catch:{ ActivityNotFoundException -> 0x0026 }
        r3.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x0026 }
        r0.startActivity(r1);	 Catch:{ ActivityNotFoundException -> 0x0026 }
        goto L_0x002e;
    L_0x001b:
        r0 = move-exception;
        r1 = "Error occurred while loading fullscreen video activity.";
        r0 = com.facebook.ads.internal.p091j.C1812a.m6820a(r0, r1);
        com.facebook.ads.internal.p091j.C1813b.m6823a(r0);
        goto L_0x002e;
    L_0x0026:
        r2 = com.facebook.ads.InterstitialAdActivity.class;	 Catch:{ Exception -> 0x001b }
        r1.setClass(r0, r2);	 Catch:{ Exception -> 0x001b }
        r0.startActivity(r1);	 Catch:{ Exception -> 0x001b }
    L_0x002e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.j.r():void");
    }

    /* renamed from: s */
    public void mo3992s() {
        if (this.f19295o != null) {
            this.f19295o.m18734q();
        }
    }

    public void setAdEventManager(C1827c c1827c) {
        this.f19287g = c1827c;
    }

    public void setEnableBackgroundVideo(boolean z) {
        this.a.setBackgroundPlaybackEnabled(z);
    }

    public void setListener(C2081k c2081k) {
        this.f19294n = c2081k;
    }

    public void setNativeAd(C4589h c4589h) {
        this.f19295o = c4589h;
    }

    public void setVideoCTA(String str) {
        this.f19293m = str;
    }

    public void setVideoMPD(String str) {
        if (str != null) {
            if (this.f19288h == null) {
                throw new IllegalStateException("Must setVideoReportUri first.");
            }
        }
        this.f19292l = str;
        super.setVideoMPD(str);
    }

    public void setVideoURI(Uri uri) {
        if (uri != null) {
            if (this.f19288h == null) {
                throw new IllegalStateException("Must setVideoReportUri first.");
            }
        }
        this.f19290j = uri;
        super.setVideoURI(uri);
    }
}
