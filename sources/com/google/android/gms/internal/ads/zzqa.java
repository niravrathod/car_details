package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzqa extends zzqp implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener, zzqf {
    @VisibleForTesting
    /* renamed from: a */
    private static final String[] f20347a = new String[]{NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    /* renamed from: b */
    private final Object f20348b = new Object();
    /* renamed from: c */
    private final FrameLayout f20349c;
    @VisibleForTesting
    /* renamed from: d */
    private FrameLayout f20350d;
    /* renamed from: e */
    private View f20351e;
    @VisibleForTesting
    /* renamed from: f */
    private Map<String, WeakReference<View>> f20352f = Collections.synchronizedMap(new HashMap());
    @VisibleForTesting
    /* renamed from: g */
    private View f20353g;
    @VisibleForTesting
    /* renamed from: h */
    private zzpm f20354h;
    @VisibleForTesting
    /* renamed from: i */
    private boolean f20355i = false;
    @VisibleForTesting
    /* renamed from: j */
    private Point f20356j = new Point();
    @VisibleForTesting
    /* renamed from: k */
    private Point f20357k = new Point();
    @VisibleForTesting
    /* renamed from: l */
    private WeakReference<zzfs> f20358l = new WeakReference(null);

    @TargetApi(21)
    public zzqa(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f20349c = frameLayout;
        this.f20350d = frameLayout2;
        zzbv.zzfi();
        zzaqa.m10047a(this.f20349c, (OnGlobalLayoutListener) this);
        zzbv.zzfi();
        zzaqa.m10048a(this.f20349c, (OnScrollChangedListener) this);
        this.f20349c.setOnTouchListener(this);
        this.f20349c.setOnClickListener(this);
        if (!(frameLayout2 == null || PlatformVersion.isAtLeastLollipop() == null)) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zznw.m10901a(this.f20349c.getContext());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2622a(java.lang.String r4, com.google.android.gms.dynamic.IObjectWrapper r5) {
        /*
        r3 = this;
        r5 = com.google.android.gms.dynamic.ObjectWrapper.m26020a(r5);
        r5 = (android.view.View) r5;
        r0 = r3.f20348b;
        monitor-enter(r0);
        r1 = r3.f20352f;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return;
    L_0x000f:
        if (r5 != 0) goto L_0x0017;
    L_0x0011:
        r5 = r3.f20352f;	 Catch:{ all -> 0x0040 }
        r5.remove(r4);	 Catch:{ all -> 0x0040 }
        goto L_0x003c;
    L_0x0017:
        r1 = r3.f20352f;	 Catch:{ all -> 0x0040 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0040 }
        r2.<init>(r5);	 Catch:{ all -> 0x0040 }
        r1.put(r4, r2);	 Catch:{ all -> 0x0040 }
        r1 = "1098";
        r1 = r1.equals(r4);	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x003e;
    L_0x0029:
        r1 = "3011";
        r4 = r1.equals(r4);	 Catch:{ all -> 0x0040 }
        if (r4 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x003e;
    L_0x0032:
        r5.setOnTouchListener(r3);	 Catch:{ all -> 0x0040 }
        r4 = 1;
        r5.setClickable(r4);	 Catch:{ all -> 0x0040 }
        r5.setOnClickListener(r3);	 Catch:{ all -> 0x0040 }
    L_0x003c:
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return;
    L_0x003e:
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return;
    L_0x0040:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqa.a(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    /* renamed from: a */
    public final IObjectWrapper mo2618a(String str) {
        synchronized (this.f20348b) {
            Object obj = null;
            if (this.f20352f == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) this.f20352f.get(str);
            if (weakReference != null) {
                obj = (View) weakReference.get();
            }
            str = ObjectWrapper.m26019a(obj);
            return str;
        }
    }

    /* renamed from: a */
    private final void m26815a(View view) {
        if (this.f20354h != null) {
            zzpm i;
            if (this.f20354h instanceof zzpl) {
                i = ((zzpl) this.f20354h).m26808i();
            } else {
                i = this.f20354h;
            }
            if (i != null) {
                i.mo2598c(view);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void mo2620a(com.google.android.gms.dynamic.IObjectWrapper r12) {
        /*
        r11 = this;
        r0 = r11.f20348b;
        monitor-enter(r0);
        r1 = 0;
        r11.m26815a(r1);	 Catch:{ all -> 0x0218 }
        r12 = com.google.android.gms.dynamic.ObjectWrapper.m26020a(r12);	 Catch:{ all -> 0x0218 }
        r2 = r12 instanceof com.google.android.gms.internal.ads.zzpq;	 Catch:{ all -> 0x0218 }
        if (r2 != 0) goto L_0x0016;
    L_0x000f:
        r12 = "Not an instance of native engine. This is most likely a transient error";
        com.google.android.gms.internal.ads.zzaok.m10007e(r12);	 Catch:{ all -> 0x0218 }
        monitor-exit(r0);	 Catch:{ all -> 0x0218 }
        return;
    L_0x0016:
        r2 = 1;
        r11.f20355i = r2;	 Catch:{ all -> 0x0218 }
        r12 = (com.google.android.gms.internal.ads.zzpq) r12;	 Catch:{ all -> 0x0218 }
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x0028;
    L_0x001f:
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r4 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r5 = r11.f20352f;	 Catch:{ all -> 0x0218 }
        r3.mo2595b(r4, r5);	 Catch:{ all -> 0x0218 }
    L_0x0028:
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r3 = r3 instanceof com.google.android.gms.internal.ads.zzpq;	 Catch:{ all -> 0x0218 }
        r9 = 0;
        if (r3 == 0) goto L_0x0063;
    L_0x002f:
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r3 = (com.google.android.gms.internal.ads.zzpq) r3;	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x0063;
    L_0x0035:
        r4 = r3.mo2610p();	 Catch:{ all -> 0x0218 }
        if (r4 == 0) goto L_0x0063;
    L_0x003b:
        r4 = com.google.android.gms.ads.internal.zzbv.zzfj();	 Catch:{ all -> 0x0218 }
        r5 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r5 = r5.getContext();	 Catch:{ all -> 0x0218 }
        r4 = r4.m9668a(r5);	 Catch:{ all -> 0x0218 }
        if (r4 == 0) goto L_0x0063;
    L_0x004b:
        r3 = r3.m21847r();	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x0054;
    L_0x0051:
        r3.m21206a(r9);	 Catch:{ all -> 0x0218 }
    L_0x0054:
        r4 = r11.f20358l;	 Catch:{ all -> 0x0218 }
        r4 = r4.get();	 Catch:{ all -> 0x0218 }
        r4 = (com.google.android.gms.internal.ads.zzfs) r4;	 Catch:{ all -> 0x0218 }
        if (r4 == 0) goto L_0x0063;
    L_0x005e:
        if (r3 == 0) goto L_0x0063;
    L_0x0060:
        r4.m10605b(r3);	 Catch:{ all -> 0x0218 }
    L_0x0063:
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r3 = r3 instanceof com.google.android.gms.internal.ads.zzpl;	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x007b;
    L_0x0069:
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r3 = (com.google.android.gms.internal.ads.zzpl) r3;	 Catch:{ all -> 0x0218 }
        r3 = r3.m26807h();	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x007b;
    L_0x0073:
        r3 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r3 = (com.google.android.gms.internal.ads.zzpl) r3;	 Catch:{ all -> 0x0218 }
        r3.m26797a(r12);	 Catch:{ all -> 0x0218 }
        goto L_0x0087;
    L_0x007b:
        r11.f20354h = r12;	 Catch:{ all -> 0x0218 }
        r3 = r12 instanceof com.google.android.gms.internal.ads.zzpl;	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x0087;
    L_0x0081:
        r3 = r12;
        r3 = (com.google.android.gms.internal.ads.zzpl) r3;	 Catch:{ all -> 0x0218 }
        r3.m26797a(r1);	 Catch:{ all -> 0x0218 }
    L_0x0087:
        r3 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        if (r3 != 0) goto L_0x008d;
    L_0x008b:
        monitor-exit(r0);	 Catch:{ all -> 0x0218 }
        return;
    L_0x008d:
        r3 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        r3.setClickable(r9);	 Catch:{ all -> 0x0218 }
        r3 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        r3.removeAllViews();	 Catch:{ all -> 0x0218 }
        r3 = r12.mo2591a();	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x00cb;
    L_0x009d:
        r4 = r11.f20352f;	 Catch:{ all -> 0x0218 }
        if (r4 == 0) goto L_0x00c3;
    L_0x00a1:
        r4 = "1098";
        r5 = "3011";
        r4 = new java.lang.String[]{r4, r5};	 Catch:{ all -> 0x0218 }
        r5 = 0;
    L_0x00aa:
        r6 = 2;
        if (r5 >= r6) goto L_0x00c3;
    L_0x00ad:
        r6 = r4[r5];	 Catch:{ all -> 0x0218 }
        r7 = r11.f20352f;	 Catch:{ all -> 0x0218 }
        r6 = r7.get(r6);	 Catch:{ all -> 0x0218 }
        r6 = (java.lang.ref.WeakReference) r6;	 Catch:{ all -> 0x0218 }
        if (r6 == 0) goto L_0x00c0;
    L_0x00b9:
        r4 = r6.get();	 Catch:{ all -> 0x0218 }
        r4 = (android.view.View) r4;	 Catch:{ all -> 0x0218 }
        goto L_0x00c4;
    L_0x00c0:
        r5 = r5 + 1;
        goto L_0x00aa;
    L_0x00c3:
        r4 = r1;
    L_0x00c4:
        r5 = r4 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0218 }
        if (r5 == 0) goto L_0x00cb;
    L_0x00c8:
        r4 = (android.view.ViewGroup) r4;	 Catch:{ all -> 0x0218 }
        goto L_0x00cc;
    L_0x00cb:
        r4 = r1;
    L_0x00cc:
        if (r3 == 0) goto L_0x00d1;
    L_0x00ce:
        if (r4 == 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00d2;
    L_0x00d1:
        r2 = 0;
    L_0x00d2:
        r3 = r12.mo2583a(r11, r2);	 Catch:{ all -> 0x0218 }
        r11.f20353g = r3;	 Catch:{ all -> 0x0218 }
        r3 = r11.f20353g;	 Catch:{ all -> 0x0218 }
        r10 = -1;
        if (r3 == 0) goto L_0x0119;
    L_0x00dd:
        r3 = r11.f20352f;	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x00ef;
    L_0x00e1:
        r3 = r11.f20352f;	 Catch:{ all -> 0x0218 }
        r5 = "1007";
        r6 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0218 }
        r7 = r11.f20353g;	 Catch:{ all -> 0x0218 }
        r6.<init>(r7);	 Catch:{ all -> 0x0218 }
        r3.put(r5, r6);	 Catch:{ all -> 0x0218 }
    L_0x00ef:
        if (r2 == 0) goto L_0x00fa;
    L_0x00f1:
        r4.removeAllViews();	 Catch:{ all -> 0x0218 }
        r2 = r11.f20353g;	 Catch:{ all -> 0x0218 }
        r4.addView(r2);	 Catch:{ all -> 0x0218 }
        goto L_0x0119;
    L_0x00fa:
        r2 = r12.mo2610p();	 Catch:{ all -> 0x0218 }
        r3 = new com.google.android.gms.ads.formats.AdChoicesView;	 Catch:{ all -> 0x0218 }
        r3.<init>(r2);	 Catch:{ all -> 0x0218 }
        r2 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x0218 }
        r2.<init>(r10, r10);	 Catch:{ all -> 0x0218 }
        r3.setLayoutParams(r2);	 Catch:{ all -> 0x0218 }
        r2 = r11.f20353g;	 Catch:{ all -> 0x0218 }
        r3.addView(r2);	 Catch:{ all -> 0x0218 }
        r2 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        if (r2 == 0) goto L_0x0119;
    L_0x0114:
        r2 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        r2.addView(r3);	 Catch:{ all -> 0x0218 }
    L_0x0119:
        r4 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r5 = r11.f20352f;	 Catch:{ all -> 0x0218 }
        r6 = 0;
        r3 = r12;
        r7 = r11;
        r8 = r11;
        r3.mo4270a(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0218 }
        r2 = r11.f20351e;	 Catch:{ all -> 0x0218 }
        if (r2 != 0) goto L_0x013f;
    L_0x0128:
        r2 = new android.view.View;	 Catch:{ all -> 0x0218 }
        r3 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r3 = r3.getContext();	 Catch:{ all -> 0x0218 }
        r2.<init>(r3);	 Catch:{ all -> 0x0218 }
        r11.f20351e = r2;	 Catch:{ all -> 0x0218 }
        r2 = r11.f20351e;	 Catch:{ all -> 0x0218 }
        r3 = new android.widget.FrameLayout$LayoutParams;	 Catch:{ all -> 0x0218 }
        r3.<init>(r10, r9);	 Catch:{ all -> 0x0218 }
        r2.setLayoutParams(r3);	 Catch:{ all -> 0x0218 }
    L_0x013f:
        r2 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r3 = r11.f20351e;	 Catch:{ all -> 0x0218 }
        r3 = r3.getParent();	 Catch:{ all -> 0x0218 }
        if (r2 == r3) goto L_0x0150;
    L_0x0149:
        r2 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r3 = r11.f20351e;	 Catch:{ all -> 0x0218 }
        r2.addView(r3);	 Catch:{ all -> 0x0218 }
    L_0x0150:
        r2 = r12.mo4271j();	 Catch:{ Exception -> 0x0155 }
        goto L_0x016b;
    L_0x0155:
        r2 = move-exception;
        com.google.android.gms.ads.internal.zzbv.zzem();	 Catch:{ all -> 0x0218 }
        r3 = com.google.android.gms.internal.ads.zzalw.m9852e();	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x0165;
    L_0x015f:
        r2 = "Privileged processes cannot create HTML overlays.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r2);	 Catch:{ all -> 0x0218 }
        goto L_0x016a;
    L_0x0165:
        r3 = "Error obtaining overlay.";
        com.google.android.gms.internal.ads.zzaok.m10002b(r3, r2);	 Catch:{ all -> 0x0218 }
    L_0x016a:
        r2 = r1;
    L_0x016b:
        if (r2 == 0) goto L_0x017a;
    L_0x016d:
        r3 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        if (r3 == 0) goto L_0x017a;
    L_0x0171:
        r3 = r11.f20350d;	 Catch:{ all -> 0x0218 }
        r2 = r2.getView();	 Catch:{ all -> 0x0218 }
        r3.addView(r2);	 Catch:{ all -> 0x0218 }
    L_0x017a:
        r2 = r11.f20348b;	 Catch:{ all -> 0x0218 }
        monitor-enter(r2);	 Catch:{ all -> 0x0218 }
        r3 = r11.f20352f;	 Catch:{ all -> 0x0215 }
        r12.m21822a(r3);	 Catch:{ all -> 0x0215 }
        r3 = r11.f20352f;	 Catch:{ all -> 0x0215 }
        if (r3 == 0) goto L_0x01a1;
    L_0x0186:
        r3 = f20347a;	 Catch:{ all -> 0x0215 }
        r4 = r3.length;	 Catch:{ all -> 0x0215 }
    L_0x0189:
        if (r9 >= r4) goto L_0x01a1;
    L_0x018b:
        r5 = r3[r9];	 Catch:{ all -> 0x0215 }
        r6 = r11.f20352f;	 Catch:{ all -> 0x0215 }
        r5 = r6.get(r5);	 Catch:{ all -> 0x0215 }
        r5 = (java.lang.ref.WeakReference) r5;	 Catch:{ all -> 0x0215 }
        if (r5 == 0) goto L_0x019e;
    L_0x0197:
        r1 = r5.get();	 Catch:{ all -> 0x0215 }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x0215 }
        goto L_0x01a1;
    L_0x019e:
        r9 = r9 + 1;
        goto L_0x0189;
    L_0x01a1:
        r3 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x0215 }
        if (r3 != 0) goto L_0x01a7;
    L_0x01a5:
        monitor-exit(r2);	 Catch:{ all -> 0x0215 }
        goto L_0x01b8;
    L_0x01a7:
        r3 = new com.google.android.gms.internal.ads.td;	 Catch:{ all -> 0x0215 }
        r3.<init>(r11, r1);	 Catch:{ all -> 0x0215 }
        r4 = r12 instanceof com.google.android.gms.internal.ads.zzpl;	 Catch:{ all -> 0x0215 }
        if (r4 == 0) goto L_0x01b4;
    L_0x01b0:
        r12.m21829b(r1, r3);	 Catch:{ all -> 0x0215 }
        goto L_0x01b7;
    L_0x01b4:
        r12.mo2586a(r1, r3);	 Catch:{ all -> 0x0215 }
    L_0x01b7:
        monitor-exit(r2);	 Catch:{ all -> 0x0215 }
    L_0x01b8:
        r12.m21820a(r11);	 Catch:{ all -> 0x0218 }
        r1 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r12.m21835d(r1);	 Catch:{ all -> 0x0218 }
        r12 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r11.m26815a(r12);	 Catch:{ all -> 0x0218 }
        r12 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r1 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r12.mo2594b(r1);	 Catch:{ all -> 0x0218 }
        r12 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r12 = r12 instanceof com.google.android.gms.internal.ads.zzpq;	 Catch:{ all -> 0x0218 }
        if (r12 == 0) goto L_0x0213;
    L_0x01d2:
        r12 = r11.f20354h;	 Catch:{ all -> 0x0218 }
        r12 = (com.google.android.gms.internal.ads.zzpq) r12;	 Catch:{ all -> 0x0218 }
        if (r12 == 0) goto L_0x0213;
    L_0x01d8:
        r1 = r12.mo2610p();	 Catch:{ all -> 0x0218 }
        if (r1 == 0) goto L_0x0213;
    L_0x01de:
        r1 = com.google.android.gms.ads.internal.zzbv.zzfj();	 Catch:{ all -> 0x0218 }
        r2 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r2 = r2.getContext();	 Catch:{ all -> 0x0218 }
        r1 = r1.m9668a(r2);	 Catch:{ all -> 0x0218 }
        if (r1 == 0) goto L_0x0213;
    L_0x01ee:
        r1 = r11.f20358l;	 Catch:{ all -> 0x0218 }
        r1 = r1.get();	 Catch:{ all -> 0x0218 }
        r1 = (com.google.android.gms.internal.ads.zzfs) r1;	 Catch:{ all -> 0x0218 }
        if (r1 != 0) goto L_0x020c;
    L_0x01f8:
        r1 = new com.google.android.gms.internal.ads.zzfs;	 Catch:{ all -> 0x0218 }
        r2 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r2 = r2.getContext();	 Catch:{ all -> 0x0218 }
        r3 = r11.f20349c;	 Catch:{ all -> 0x0218 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0218 }
        r2 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x0218 }
        r2.<init>(r1);	 Catch:{ all -> 0x0218 }
        r11.f20358l = r2;	 Catch:{ all -> 0x0218 }
    L_0x020c:
        r12 = r12.m21847r();	 Catch:{ all -> 0x0218 }
        r1.m10604a(r12);	 Catch:{ all -> 0x0218 }
    L_0x0213:
        monitor-exit(r0);	 Catch:{ all -> 0x0218 }
        return;
    L_0x0215:
        r12 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0215 }
        throw r12;	 Catch:{ all -> 0x0218 }
    L_0x0218:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0218 }
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqa.a(com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
        r9 = this;
        r0 = r9.f20348b;
        monitor-enter(r0);
        r1 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0094 }
        return;
    L_0x0009:
        r1 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        r1.mo2601d();	 Catch:{ all -> 0x0094 }
        r5 = new android.os.Bundle;	 Catch:{ all -> 0x0094 }
        r5.<init>();	 Catch:{ all -> 0x0094 }
        r1 = "x";
        r2 = r9.f20356j;	 Catch:{ all -> 0x0094 }
        r2 = r2.x;	 Catch:{ all -> 0x0094 }
        r2 = r9.m26814a(r2);	 Catch:{ all -> 0x0094 }
        r2 = (float) r2;	 Catch:{ all -> 0x0094 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0094 }
        r1 = "y";
        r2 = r9.f20356j;	 Catch:{ all -> 0x0094 }
        r2 = r2.y;	 Catch:{ all -> 0x0094 }
        r2 = r9.m26814a(r2);	 Catch:{ all -> 0x0094 }
        r2 = (float) r2;	 Catch:{ all -> 0x0094 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0094 }
        r1 = "start_x";
        r2 = r9.f20357k;	 Catch:{ all -> 0x0094 }
        r2 = r2.x;	 Catch:{ all -> 0x0094 }
        r2 = r9.m26814a(r2);	 Catch:{ all -> 0x0094 }
        r2 = (float) r2;	 Catch:{ all -> 0x0094 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0094 }
        r1 = "start_y";
        r2 = r9.f20357k;	 Catch:{ all -> 0x0094 }
        r2 = r2.y;	 Catch:{ all -> 0x0094 }
        r2 = r9.m26814a(r2);	 Catch:{ all -> 0x0094 }
        r2 = (float) r2;	 Catch:{ all -> 0x0094 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0094 }
        r1 = r9.f20353g;	 Catch:{ all -> 0x0094 }
        if (r1 == 0) goto L_0x0089;
    L_0x004f:
        r1 = r9.f20353g;	 Catch:{ all -> 0x0094 }
        r1 = r1.equals(r10);	 Catch:{ all -> 0x0094 }
        if (r1 == 0) goto L_0x0089;
    L_0x0057:
        r1 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        r1 = r1 instanceof com.google.android.gms.internal.ads.zzpl;	 Catch:{ all -> 0x0094 }
        if (r1 == 0) goto L_0x007b;
    L_0x005d:
        r1 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        r1 = (com.google.android.gms.internal.ads.zzpl) r1;	 Catch:{ all -> 0x0094 }
        r1 = r1.m26808i();	 Catch:{ all -> 0x0094 }
        if (r1 == 0) goto L_0x0092;
    L_0x0067:
        r1 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        r1 = (com.google.android.gms.internal.ads.zzpl) r1;	 Catch:{ all -> 0x0094 }
        r2 = r1.m26808i();	 Catch:{ all -> 0x0094 }
        r4 = "1007";
        r6 = r9.f20352f;	 Catch:{ all -> 0x0094 }
        r7 = r9.f20349c;	 Catch:{ all -> 0x0094 }
        r8 = 0;
        r3 = r10;
        r2.mo2587a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0094 }
        goto L_0x0092;
    L_0x007b:
        r2 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        r4 = "1007";
        r6 = r9.f20352f;	 Catch:{ all -> 0x0094 }
        r7 = r9.f20349c;	 Catch:{ all -> 0x0094 }
        r8 = 0;
        r3 = r10;
        r2.mo2587a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0094 }
        goto L_0x0092;
    L_0x0089:
        r1 = r9.f20354h;	 Catch:{ all -> 0x0094 }
        r2 = r9.f20352f;	 Catch:{ all -> 0x0094 }
        r3 = r9.f20349c;	 Catch:{ all -> 0x0094 }
        r1.mo2589a(r10, r2, r5, r3);	 Catch:{ all -> 0x0094 }
    L_0x0092:
        monitor-exit(r0);	 Catch:{ all -> 0x0094 }
        return;
    L_0x0094:
        r10 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0094 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqa.onClick(android.view.View):void");
    }

    public final void onGlobalLayout() {
        synchronized (this.f20348b) {
            if (this.f20354h != null) {
                this.f20354h.mo2599c(this.f20349c, this.f20352f);
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f20348b) {
            if (this.f20354h != null) {
                this.f20354h.mo2599c(this.f20349c, this.f20352f);
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f20348b) {
            if (this.f20354h == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.f20349c.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f20356j = point;
            if (motionEvent.getAction() == 0) {
                this.f20357k = point;
            }
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setLocation((float) point.x, (float) point.y);
            this.f20354h.mo2584a(motionEvent);
            motionEvent.recycle();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo2619a() {
        synchronized (this.f20348b) {
            if (this.f20350d != null) {
                this.f20350d.removeAllViews();
            }
            this.f20350d = null;
            this.f20352f = null;
            this.f20353g = null;
            this.f20354h = null;
            this.f20356j = null;
            this.f20357k = null;
            this.f20358l = null;
            this.f20351e = null;
        }
    }

    /* renamed from: a */
    public final void mo2621a(IObjectWrapper iObjectWrapper, int i) {
        if (zzbv.zzfj().m9668a(this.f20349c.getContext()) != null && this.f20358l != null) {
            zzfs zzfs = (zzfs) this.f20358l.get();
            if (zzfs != null) {
                zzfs.m10603a();
            }
        }
    }

    /* renamed from: b */
    public final void mo2623b(IObjectWrapper iObjectWrapper) {
        this.f20354h.mo2585a((View) ObjectWrapper.m26020a(iObjectWrapper));
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo4272b() {
        return this.f20352f;
    }

    /* renamed from: c */
    public final View mo4273c() {
        return this.f20349c;
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m26814a(int i) {
        zzkd.m10709a();
        return zzaoa.m9962b(this.f20354h.mo2610p(), i);
    }
}
