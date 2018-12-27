package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacd;
import com.google.android.gms.internal.ads.zzacj;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaii;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzck;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zzkg;
import com.google.android.gms.internal.ads.zzkj;
import com.google.android.gms.internal.ads.zzkv;
import com.google.android.gms.internal.ads.zzkz;
import com.google.android.gms.internal.ads.zzlc;
import com.google.android.gms.internal.ads.zzli;
import com.google.android.gms.internal.ads.zzly;
import com.google.android.gms.internal.ads.zzme;
import com.google.android.gms.internal.ads.zznf;
import com.google.android.gms.internal.ads.zznw;
import com.google.android.gms.internal.ads.zzop;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzbp extends zzkv {
    /* renamed from: a */
    private final zzaop f19587a;
    /* renamed from: b */
    private final zzjo f19588b;
    /* renamed from: c */
    private final Future<zzck> f19589c = zzalm.m9773a(new ac(this));
    /* renamed from: d */
    private final Context f19590d;
    /* renamed from: e */
    private final ae f19591e;
    /* renamed from: f */
    private WebView f19592f = new WebView(this.f19590d);
    /* renamed from: g */
    private zzkj f19593g;
    /* renamed from: h */
    private zzck f19594h;
    /* renamed from: i */
    private AsyncTask<Void, Void, String> f19595i;

    public zzbp(Context context, zzjo zzjo, String str, zzaop zzaop) {
        this.f19590d = context;
        this.f19587a = zzaop;
        this.f19588b = zzjo;
        this.f19591e = new ae(str);
        m25974a(0);
        this.f19592f.setVerticalScrollBarEnabled(false);
        this.f19592f.getSettings().setJavaScriptEnabled(true);
        this.f19592f.setWebViewClient(new aa(this));
        this.f19592f.setOnTouchListener(new ab(this));
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final zzly getVideoController() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isReady() {
        return false;
    }

    public final void setManualImpressionsEnabled(boolean z) {
    }

    public final void stopLoading() {
    }

    public final String zzcj() {
        return null;
    }

    public final IObjectWrapper zzbj() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.m26019a(this.f19592f);
    }

    public final void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f19595i.cancel(true);
        this.f19589c.cancel(true);
        this.f19592f.destroy();
        this.f19592f = null;
    }

    public final boolean zzb(zzjk zzjk) {
        Preconditions.checkNotNull(this.f19592f, "This Search Ad has already been torn down");
        this.f19591e.m8773a(zzjk, this.f19587a);
        this.f19595i = new ad().execute(new Void[0]);
        return true;
    }

    public final void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    public final void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    public final void zza(zzkj zzkj) {
        this.f19593g = zzkj;
    }

    public final void zza(zzlc zzlc) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzkz zzkz) {
        throw new IllegalStateException("Unused method");
    }

    public final Bundle getAdMetadata() {
        throw new IllegalStateException("Unused method");
    }

    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    public final void zzbm() {
        throw new IllegalStateException("Unused method");
    }

    public final zzjo zzbk() {
        return this.f19588b;
    }

    public final void zza(zzjo zzjo) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    public final void zza(zzacd zzacd) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzacj zzacj, String str) {
        throw new IllegalStateException("Unused method");
    }

    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    public final zzlc zzbw() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    public final zzkj zzbx() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    public final void zza(zzop zzop) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzkg zzkg) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzli zzli) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzaii zzaii) {
        throw new IllegalStateException("Unused method");
    }

    public final void setUserId(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zzr(String str) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zznf zznf) {
        throw new IllegalStateException("Unused method");
    }

    public final void zza(zzme zzme) {
        throw new IllegalStateException("Unused method");
    }

    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    final int m25972a(java.lang.String r3) {
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
        r3 = android.net.Uri.parse(r3);
        r0 = "height";
        r3 = r3.getQueryParameter(r0);
        r0 = android.text.TextUtils.isEmpty(r3);
        r1 = 0;
        if (r0 == 0) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ NumberFormatException -> 0x0020 }
        r0 = r2.f19590d;	 Catch:{ NumberFormatException -> 0x0020 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ NumberFormatException -> 0x0020 }
        r3 = com.google.android.gms.internal.ads.zzaoa.m9952a(r0, r3);	 Catch:{ NumberFormatException -> 0x0020 }
        return r3;
    L_0x0020:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzbp.a(java.lang.String):int");
    }

    @VisibleForTesting
    /* renamed from: a */
    final void m25974a(int i) {
        if (this.f19592f != null) {
            this.f19592f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    final String m25973a() {
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) zzkd.m10713e().m10897a(zznw.bP));
        builder.appendQueryParameter("query", this.f19591e.m8774b());
        builder.appendQueryParameter("pubId", this.f19591e.m8775c());
        Map d = this.f19591e.m8776d();
        for (String str : d.keySet()) {
            builder.appendQueryParameter(str, (String) d.get(str));
        }
        Uri build = builder.build();
        if (this.f19594h != null) {
            try {
                build = this.f19594h.m10477a(build, this.f19590d);
            } catch (Throwable e) {
                zzaok.m10004c("Unable to process ad data", e);
            }
        }
        String b = m25975b();
        String encodedQuery = build.getEncodedQuery();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(encodedQuery).length());
        stringBuilder.append(b);
        stringBuilder.append("#");
        stringBuilder.append(encodedQuery);
        return stringBuilder.toString();
    }

    @VisibleForTesting
    /* renamed from: b */
    final String m25975b() {
        String a = this.f19591e.m8772a();
        if (TextUtils.isEmpty(a)) {
            a = "www.google.com";
        }
        String str = (String) zzkd.m10713e().m10897a(zznw.bP);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 8) + String.valueOf(str).length());
        stringBuilder.append("https://");
        stringBuilder.append(a);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private final String m25965b(String str) {
        if (this.f19594h == null) {
            return str;
        }
        str = Uri.parse(str);
        try {
            str = this.f19594h.m10478a(str, this.f19590d, null, null);
        } catch (Throwable e) {
            zzaok.m10004c("Unable to process ad data", e);
        }
        return str.toString();
    }

    /* renamed from: c */
    private final void m25968c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f19590d.startActivity(intent);
    }
}
