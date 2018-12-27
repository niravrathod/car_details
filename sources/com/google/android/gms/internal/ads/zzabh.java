package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

@zzaer
public final class zzabh extends zzabr {
    /* renamed from: a */
    private static final Set<String> f16734a = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    /* renamed from: b */
    private String f16735b = "top-right";
    /* renamed from: c */
    private boolean f16736c = true;
    /* renamed from: d */
    private int f16737d = 0;
    /* renamed from: e */
    private int f16738e = 0;
    /* renamed from: f */
    private int f16739f = -1;
    /* renamed from: g */
    private int f16740g = 0;
    /* renamed from: h */
    private int f16741h = 0;
    /* renamed from: i */
    private int f16742i = -1;
    /* renamed from: j */
    private final Object f16743j = new Object();
    /* renamed from: k */
    private final zzasg f16744k;
    /* renamed from: l */
    private final Activity f16745l;
    /* renamed from: m */
    private zzatt f16746m;
    /* renamed from: n */
    private ImageView f16747n;
    /* renamed from: o */
    private LinearLayout f16748o;
    /* renamed from: p */
    private zzabs f16749p;
    /* renamed from: q */
    private PopupWindow f16750q;
    /* renamed from: r */
    private RelativeLayout f16751r;
    /* renamed from: s */
    private ViewGroup f16752s;

    public zzabh(zzasg zzasg, zzabs zzabs) {
        super(zzasg, "resize");
        this.f16744k = zzasg;
        this.f16745l = zzasg.mo4199d();
        this.f16749p = zzabs;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final void m21069a(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
        r13 = this;
        r0 = r13.f16743j;
        monitor-enter(r0);
        r1 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x000e;
    L_0x0007:
        r14 = "Not an activity context. Cannot resize.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x000e:
        r1 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r1 = r1.mo4205s();	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x001d;
    L_0x0016:
        r14 = "Webview is not yet available, size is not set.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x001d:
        r1 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r1 = r1.mo4205s();	 Catch:{ all -> 0x0320 }
        r1 = r1.m10134e();	 Catch:{ all -> 0x0320 }
        if (r1 == 0) goto L_0x0030;
    L_0x0029:
        r14 = "Is interstitial. Cannot resize an interstitial.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x0030:
        r1 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r1 = r1.mo4208z();	 Catch:{ all -> 0x0320 }
        if (r1 == 0) goto L_0x003f;
    L_0x0038:
        r14 = "Cannot resize an expanded banner.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x003f:
        r1 = "width";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0320 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x005e;
    L_0x004d:
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0320 }
        r1 = "width";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0320 }
        r1 = com.google.android.gms.internal.ads.zzalo.m9803b(r1);	 Catch:{ all -> 0x0320 }
        r13.f16742i = r1;	 Catch:{ all -> 0x0320 }
    L_0x005e:
        r1 = "height";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0320 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x007d;
    L_0x006c:
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0320 }
        r1 = "height";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0320 }
        r1 = com.google.android.gms.internal.ads.zzalo.m9803b(r1);	 Catch:{ all -> 0x0320 }
        r13.f16739f = r1;	 Catch:{ all -> 0x0320 }
    L_0x007d:
        r1 = "offsetX";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0320 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x009c;
    L_0x008b:
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0320 }
        r1 = "offsetX";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0320 }
        r1 = com.google.android.gms.internal.ads.zzalo.m9803b(r1);	 Catch:{ all -> 0x0320 }
        r13.f16740g = r1;	 Catch:{ all -> 0x0320 }
    L_0x009c:
        r1 = "offsetY";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0320 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x00bb;
    L_0x00aa:
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0320 }
        r1 = "offsetY";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0320 }
        r1 = com.google.android.gms.internal.ads.zzalo.m9803b(r1);	 Catch:{ all -> 0x0320 }
        r13.f16741h = r1;	 Catch:{ all -> 0x0320 }
    L_0x00bb:
        r1 = "allowOffscreen";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ all -> 0x0320 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x00d7;
    L_0x00c9:
        r1 = "allowOffscreen";
        r1 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x0320 }
        r1 = java.lang.Boolean.parseBoolean(r1);	 Catch:{ all -> 0x0320 }
        r13.f16736c = r1;	 Catch:{ all -> 0x0320 }
    L_0x00d7:
        r1 = "customClosePosition";
        r14 = r14.get(r1);	 Catch:{ all -> 0x0320 }
        r14 = (java.lang.String) r14;	 Catch:{ all -> 0x0320 }
        r1 = android.text.TextUtils.isEmpty(r14);	 Catch:{ all -> 0x0320 }
        if (r1 != 0) goto L_0x00e7;
    L_0x00e5:
        r13.f16735b = r14;	 Catch:{ all -> 0x0320 }
    L_0x00e7:
        r14 = r13.f16742i;	 Catch:{ all -> 0x0320 }
        r1 = 1;
        r2 = 0;
        if (r14 < 0) goto L_0x00f3;
    L_0x00ed:
        r14 = r13.f16739f;	 Catch:{ all -> 0x0320 }
        if (r14 < 0) goto L_0x00f3;
    L_0x00f1:
        r14 = 1;
        goto L_0x00f4;
    L_0x00f3:
        r14 = 0;
    L_0x00f4:
        if (r14 != 0) goto L_0x00fd;
    L_0x00f6:
        r14 = "Invalid width and height options. Cannot resize.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x00fd:
        r14 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r14 = r14.getWindow();	 Catch:{ all -> 0x0320 }
        if (r14 == 0) goto L_0x0319;
    L_0x0105:
        r3 = r14.getDecorView();	 Catch:{ all -> 0x0320 }
        if (r3 != 0) goto L_0x010d;
    L_0x010b:
        goto L_0x0319;
    L_0x010d:
        r3 = r13.m21066b();	 Catch:{ all -> 0x0320 }
        if (r3 != 0) goto L_0x011a;
    L_0x0113:
        r14 = "Resize location out of screen or close button is not visible.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x011a:
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ all -> 0x0320 }
        r4 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r5 = r13.f16742i;	 Catch:{ all -> 0x0320 }
        r4 = com.google.android.gms.internal.ads.zzaoa.m9952a(r4, r5);	 Catch:{ all -> 0x0320 }
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ all -> 0x0320 }
        r5 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r6 = r13.f16739f;	 Catch:{ all -> 0x0320 }
        r5 = com.google.android.gms.internal.ads.zzaoa.m9952a(r5, r6);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r6 = r6.getView();	 Catch:{ all -> 0x0320 }
        r6 = r6.getParent();	 Catch:{ all -> 0x0320 }
        if (r6 == 0) goto L_0x0312;
    L_0x013c:
        r7 = r6 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x0312;
    L_0x0140:
        r7 = r6;
        r7 = (android.view.ViewGroup) r7;	 Catch:{ all -> 0x0320 }
        r8 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r8 = r8.getView();	 Catch:{ all -> 0x0320 }
        r7.removeView(r8);	 Catch:{ all -> 0x0320 }
        r7 = r13.f16750q;	 Catch:{ all -> 0x0320 }
        if (r7 != 0) goto L_0x017f;
    L_0x0150:
        r6 = (android.view.ViewGroup) r6;	 Catch:{ all -> 0x0320 }
        r13.f16752s = r6;	 Catch:{ all -> 0x0320 }
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0320 }
        r6 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r6 = r6.getView();	 Catch:{ all -> 0x0320 }
        r6 = com.google.android.gms.internal.ads.zzalo.m9775a(r6);	 Catch:{ all -> 0x0320 }
        r7 = new android.widget.ImageView;	 Catch:{ all -> 0x0320 }
        r8 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r7.<init>(r8);	 Catch:{ all -> 0x0320 }
        r13.f16747n = r7;	 Catch:{ all -> 0x0320 }
        r7 = r13.f16747n;	 Catch:{ all -> 0x0320 }
        r7.setImageBitmap(r6);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r6 = r6.mo4205s();	 Catch:{ all -> 0x0320 }
        r13.f16746m = r6;	 Catch:{ all -> 0x0320 }
        r6 = r13.f16752s;	 Catch:{ all -> 0x0320 }
        r7 = r13.f16747n;	 Catch:{ all -> 0x0320 }
        r6.addView(r7);	 Catch:{ all -> 0x0320 }
        goto L_0x0184;
    L_0x017f:
        r6 = r13.f16750q;	 Catch:{ all -> 0x0320 }
        r6.dismiss();	 Catch:{ all -> 0x0320 }
    L_0x0184:
        r6 = new android.widget.RelativeLayout;	 Catch:{ all -> 0x0320 }
        r7 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r6.<init>(r7);	 Catch:{ all -> 0x0320 }
        r13.f16751r = r6;	 Catch:{ all -> 0x0320 }
        r6 = r13.f16751r;	 Catch:{ all -> 0x0320 }
        r6.setBackgroundColor(r2);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16751r;	 Catch:{ all -> 0x0320 }
        r7 = new android.view.ViewGroup$LayoutParams;	 Catch:{ all -> 0x0320 }
        r7.<init>(r4, r5);	 Catch:{ all -> 0x0320 }
        r6.setLayoutParams(r7);	 Catch:{ all -> 0x0320 }
        com.google.android.gms.ads.internal.zzbv.zzek();	 Catch:{ all -> 0x0320 }
        r6 = r13.f16751r;	 Catch:{ all -> 0x0320 }
        r6 = com.google.android.gms.internal.ads.zzalo.m9779a(r6, r4, r5, r2);	 Catch:{ all -> 0x0320 }
        r13.f16750q = r6;	 Catch:{ all -> 0x0320 }
        r6 = r13.f16750q;	 Catch:{ all -> 0x0320 }
        r6.setOutsideTouchable(r1);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16750q;	 Catch:{ all -> 0x0320 }
        r6.setTouchable(r1);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16750q;	 Catch:{ all -> 0x0320 }
        r7 = r13.f16736c;	 Catch:{ all -> 0x0320 }
        r7 = r7 ^ r1;
        r6.setClippingEnabled(r7);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16751r;	 Catch:{ all -> 0x0320 }
        r7 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r7 = r7.getView();	 Catch:{ all -> 0x0320 }
        r8 = -1;
        r6.addView(r7, r8, r8);	 Catch:{ all -> 0x0320 }
        r6 = new android.widget.LinearLayout;	 Catch:{ all -> 0x0320 }
        r7 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r6.<init>(r7);	 Catch:{ all -> 0x0320 }
        r13.f16748o = r6;	 Catch:{ all -> 0x0320 }
        r6 = new android.widget.RelativeLayout$LayoutParams;	 Catch:{ all -> 0x0320 }
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ all -> 0x0320 }
        r7 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r9 = 50;
        r7 = com.google.android.gms.internal.ads.zzaoa.m9952a(r7, r9);	 Catch:{ all -> 0x0320 }
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ all -> 0x0320 }
        r10 = r13.f16745l;	 Catch:{ all -> 0x0320 }
        r9 = com.google.android.gms.internal.ads.zzaoa.m9952a(r10, r9);	 Catch:{ all -> 0x0320 }
        r6.<init>(r7, r9);	 Catch:{ all -> 0x0320 }
        r7 = r13.f16735b;	 Catch:{ all -> 0x0320 }
        r9 = r7.hashCode();	 Catch:{ all -> 0x0320 }
        switch(r9) {
            case -1364013995: goto L_0x0223;
            case -1012429441: goto L_0x0219;
            case -655373719: goto L_0x020f;
            case 1163912186: goto L_0x0205;
            case 1288627767: goto L_0x01fb;
            case 1755462605: goto L_0x01f1;
            default: goto L_0x01f0;
        };	 Catch:{ all -> 0x0320 }
    L_0x01f0:
        goto L_0x022d;
    L_0x01f1:
        r9 = "top-center";
        r7 = r7.equals(r9);	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x022d;
    L_0x01f9:
        r7 = 1;
        goto L_0x022e;
    L_0x01fb:
        r9 = "bottom-center";
        r7 = r7.equals(r9);	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x022d;
    L_0x0203:
        r7 = 4;
        goto L_0x022e;
    L_0x0205:
        r9 = "bottom-right";
        r7 = r7.equals(r9);	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x022d;
    L_0x020d:
        r7 = 5;
        goto L_0x022e;
    L_0x020f:
        r9 = "bottom-left";
        r7 = r7.equals(r9);	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x022d;
    L_0x0217:
        r7 = 3;
        goto L_0x022e;
    L_0x0219:
        r9 = "top-left";
        r7 = r7.equals(r9);	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x022d;
    L_0x0221:
        r7 = 0;
        goto L_0x022e;
    L_0x0223:
        r9 = "center";
        r7 = r7.equals(r9);	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x022d;
    L_0x022b:
        r7 = 2;
        goto L_0x022e;
    L_0x022d:
        r7 = -1;
    L_0x022e:
        r8 = 14;
        r9 = 9;
        r10 = 11;
        r11 = 12;
        r12 = 10;
        switch(r7) {
            case 0: goto L_0x0261;
            case 1: goto L_0x025a;
            case 2: goto L_0x0254;
            case 3: goto L_0x024d;
            case 4: goto L_0x0246;
            case 5: goto L_0x023f;
            default: goto L_0x023b;
        };	 Catch:{ all -> 0x0320 }
    L_0x023b:
        r6.addRule(r12);	 Catch:{ all -> 0x0320 }
        goto L_0x0268;
    L_0x023f:
        r6.addRule(r11);	 Catch:{ all -> 0x0320 }
        r6.addRule(r10);	 Catch:{ all -> 0x0320 }
        goto L_0x026b;
    L_0x0246:
        r6.addRule(r11);	 Catch:{ all -> 0x0320 }
        r6.addRule(r8);	 Catch:{ all -> 0x0320 }
        goto L_0x026b;
    L_0x024d:
        r6.addRule(r11);	 Catch:{ all -> 0x0320 }
        r6.addRule(r9);	 Catch:{ all -> 0x0320 }
        goto L_0x026b;
    L_0x0254:
        r7 = 13;
        r6.addRule(r7);	 Catch:{ all -> 0x0320 }
        goto L_0x026b;
    L_0x025a:
        r6.addRule(r12);	 Catch:{ all -> 0x0320 }
        r6.addRule(r8);	 Catch:{ all -> 0x0320 }
        goto L_0x026b;
    L_0x0261:
        r6.addRule(r12);	 Catch:{ all -> 0x0320 }
        r6.addRule(r9);	 Catch:{ all -> 0x0320 }
        goto L_0x026b;
    L_0x0268:
        r6.addRule(r10);	 Catch:{ all -> 0x0320 }
    L_0x026b:
        r7 = r13.f16748o;	 Catch:{ all -> 0x0320 }
        r8 = new com.google.android.gms.internal.ads.m;	 Catch:{ all -> 0x0320 }
        r8.<init>(r13);	 Catch:{ all -> 0x0320 }
        r7.setOnClickListener(r8);	 Catch:{ all -> 0x0320 }
        r7 = r13.f16748o;	 Catch:{ all -> 0x0320 }
        r8 = "Close button";
        r7.setContentDescription(r8);	 Catch:{ all -> 0x0320 }
        r7 = r13.f16751r;	 Catch:{ all -> 0x0320 }
        r8 = r13.f16748o;	 Catch:{ all -> 0x0320 }
        r7.addView(r8, r6);	 Catch:{ all -> 0x0320 }
        r6 = r13.f16750q;	 Catch:{ RuntimeException -> 0x02ca }
        r14 = r14.getDecorView();	 Catch:{ RuntimeException -> 0x02ca }
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ RuntimeException -> 0x02ca }
        r7 = r13.f16745l;	 Catch:{ RuntimeException -> 0x02ca }
        r8 = r3[r2];	 Catch:{ RuntimeException -> 0x02ca }
        r7 = com.google.android.gms.internal.ads.zzaoa.m9952a(r7, r8);	 Catch:{ RuntimeException -> 0x02ca }
        com.google.android.gms.internal.ads.zzkd.m10709a();	 Catch:{ RuntimeException -> 0x02ca }
        r8 = r13.f16745l;	 Catch:{ RuntimeException -> 0x02ca }
        r9 = r3[r1];	 Catch:{ RuntimeException -> 0x02ca }
        r8 = com.google.android.gms.internal.ads.zzaoa.m9952a(r8, r9);	 Catch:{ RuntimeException -> 0x02ca }
        r6.showAtLocation(r14, r2, r7, r8);	 Catch:{ RuntimeException -> 0x02ca }
        r14 = r3[r2];	 Catch:{ all -> 0x0320 }
        r6 = r3[r1];	 Catch:{ all -> 0x0320 }
        r7 = r13.f16749p;	 Catch:{ all -> 0x0320 }
        if (r7 == 0) goto L_0x02b3;
    L_0x02aa:
        r7 = r13.f16749p;	 Catch:{ all -> 0x0320 }
        r8 = r13.f16742i;	 Catch:{ all -> 0x0320 }
        r9 = r13.f16739f;	 Catch:{ all -> 0x0320 }
        r7.zza(r14, r6, r8, r9);	 Catch:{ all -> 0x0320 }
    L_0x02b3:
        r14 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r4 = com.google.android.gms.internal.ads.zzatt.m10129a(r4, r5);	 Catch:{ all -> 0x0320 }
        r14.mo4737a(r4);	 Catch:{ all -> 0x0320 }
        r14 = r3[r2];	 Catch:{ all -> 0x0320 }
        r1 = r3[r1];	 Catch:{ all -> 0x0320 }
        r13.m21065b(r14, r1);	 Catch:{ all -> 0x0320 }
        r14 = "resized";
        r13.m9448c(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x02ca:
        r14 = move-exception;
        r1 = "Cannot show popup window: ";
        r14 = r14.getMessage();	 Catch:{ all -> 0x0320 }
        r14 = java.lang.String.valueOf(r14);	 Catch:{ all -> 0x0320 }
        r2 = r14.length();	 Catch:{ all -> 0x0320 }
        if (r2 == 0) goto L_0x02e0;
    L_0x02db:
        r14 = r1.concat(r14);	 Catch:{ all -> 0x0320 }
        goto L_0x02e5;
    L_0x02e0:
        r14 = new java.lang.String;	 Catch:{ all -> 0x0320 }
        r14.<init>(r1);	 Catch:{ all -> 0x0320 }
    L_0x02e5:
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        r14 = r13.f16751r;	 Catch:{ all -> 0x0320 }
        r1 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r1 = r1.getView();	 Catch:{ all -> 0x0320 }
        r14.removeView(r1);	 Catch:{ all -> 0x0320 }
        r14 = r13.f16752s;	 Catch:{ all -> 0x0320 }
        if (r14 == 0) goto L_0x0310;
    L_0x02f7:
        r14 = r13.f16752s;	 Catch:{ all -> 0x0320 }
        r1 = r13.f16747n;	 Catch:{ all -> 0x0320 }
        r14.removeView(r1);	 Catch:{ all -> 0x0320 }
        r14 = r13.f16752s;	 Catch:{ all -> 0x0320 }
        r1 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r1 = r1.getView();	 Catch:{ all -> 0x0320 }
        r14.addView(r1);	 Catch:{ all -> 0x0320 }
        r14 = r13.f16744k;	 Catch:{ all -> 0x0320 }
        r1 = r13.f16746m;	 Catch:{ all -> 0x0320 }
        r14.mo4737a(r1);	 Catch:{ all -> 0x0320 }
    L_0x0310:
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x0312:
        r14 = "Webview is detached, probably in the middle of a resize or expand.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x0319:
        r14 = "Activity context is not ready, cannot get window or decor view.";
        r13.m9445a(r14);	 Catch:{ all -> 0x0320 }
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        return;
    L_0x0320:
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0320 }
        throw r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabh.a(java.util.Map):void");
    }

    /* renamed from: a */
    public final void m21070a(boolean z) {
        synchronized (this.f16743j) {
            if (this.f16750q != null) {
                this.f16750q.dismiss();
                this.f16751r.removeView(this.f16744k.getView());
                if (this.f16752s != null) {
                    this.f16752s.removeView(this.f16747n);
                    this.f16752s.addView(this.f16744k.getView());
                    this.f16744k.mo4737a(this.f16746m);
                }
                if (z) {
                    m9448c("default");
                    if (this.f16749p) {
                        this.f16749p.zzcp();
                    }
                }
                this.f16750q = null;
                this.f16751r = null;
                this.f16752s = null;
                this.f16748o = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    private final int[] m21066b() {
        /*
        r9 = this;
        r0 = com.google.android.gms.ads.internal.zzbv.zzek();
        r1 = r9.f16745l;
        r0 = r0.m9843b(r1);
        r1 = com.google.android.gms.ads.internal.zzbv.zzek();
        r2 = r9.f16745l;
        r1 = r1.m9845c(r2);
        r2 = 0;
        r3 = r0[r2];
        r4 = 1;
        r0 = r0[r4];
        r5 = r9.f16742i;
        r6 = 2;
        r7 = 50;
        if (r5 < r7) goto L_0x011e;
    L_0x0021:
        r5 = r9.f16742i;
        if (r5 <= r3) goto L_0x0027;
    L_0x0025:
        goto L_0x011e;
    L_0x0027:
        r5 = r9.f16739f;
        if (r5 < r7) goto L_0x0118;
    L_0x002b:
        r5 = r9.f16739f;
        if (r5 <= r0) goto L_0x0031;
    L_0x002f:
        goto L_0x0118;
    L_0x0031:
        r5 = r9.f16739f;
        if (r5 != r0) goto L_0x0040;
    L_0x0035:
        r0 = r9.f16742i;
        if (r0 != r3) goto L_0x0040;
    L_0x0039:
        r0 = "Cannot resize to a full-screen ad.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        goto L_0x0123;
    L_0x0040:
        r0 = r9.f16736c;
        if (r0 == 0) goto L_0x0116;
    L_0x0044:
        r0 = r9.f16735b;
        r5 = -1;
        r8 = r0.hashCode();
        switch(r8) {
            case -1364013995: goto L_0x0081;
            case -1012429441: goto L_0x0077;
            case -655373719: goto L_0x006d;
            case 1163912186: goto L_0x0063;
            case 1288627767: goto L_0x0059;
            case 1755462605: goto L_0x004f;
            default: goto L_0x004e;
        };
    L_0x004e:
        goto L_0x008b;
    L_0x004f:
        r8 = "top-center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x008b;
    L_0x0057:
        r0 = 1;
        goto L_0x008c;
    L_0x0059:
        r8 = "bottom-center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x008b;
    L_0x0061:
        r0 = 4;
        goto L_0x008c;
    L_0x0063:
        r8 = "bottom-right";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x008b;
    L_0x006b:
        r0 = 5;
        goto L_0x008c;
    L_0x006d:
        r8 = "bottom-left";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x008b;
    L_0x0075:
        r0 = 3;
        goto L_0x008c;
    L_0x0077:
        r8 = "top-left";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x008b;
    L_0x007f:
        r0 = 0;
        goto L_0x008c;
    L_0x0081:
        r8 = "center";
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x008b;
    L_0x0089:
        r0 = 2;
        goto L_0x008c;
    L_0x008b:
        r0 = -1;
    L_0x008c:
        switch(r0) {
            case 0: goto L_0x00fd;
            case 1: goto L_0x00ec;
            case 2: goto L_0x00d5;
            case 3: goto L_0x00c6;
            case 4: goto L_0x00b1;
            case 5: goto L_0x009e;
            default: goto L_0x008f;
        };
    L_0x008f:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16742i;
        r0 = r0 + r5;
        r0 = r0 - r7;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
        goto L_0x0107;
    L_0x009e:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16742i;
        r0 = r0 + r5;
        r0 = r0 - r7;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
        r8 = r9.f16739f;
        r5 = r5 + r8;
        r5 = r5 - r7;
        goto L_0x0107;
    L_0x00b1:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16742i;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
        r8 = r9.f16739f;
        r5 = r5 + r8;
        r5 = r5 - r7;
        goto L_0x0107;
    L_0x00c6:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
        r8 = r9.f16739f;
        r5 = r5 + r8;
        r5 = r5 - r7;
        goto L_0x0107;
    L_0x00d5:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16742i;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
        r8 = r9.f16739f;
        r8 = r8 / r6;
        r5 = r5 + r8;
        r5 = r5 + -25;
        goto L_0x0107;
    L_0x00ec:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16742i;
        r5 = r5 / r6;
        r0 = r0 + r5;
        r0 = r0 + -25;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
        goto L_0x0107;
    L_0x00fd:
        r0 = r9.f16737d;
        r5 = r9.f16740g;
        r0 = r0 + r5;
        r5 = r9.f16738e;
        r8 = r9.f16741h;
        r5 = r5 + r8;
    L_0x0107:
        if (r0 < 0) goto L_0x0123;
    L_0x0109:
        r0 = r0 + r7;
        if (r0 > r3) goto L_0x0123;
    L_0x010c:
        r0 = r1[r2];
        if (r5 < r0) goto L_0x0123;
    L_0x0110:
        r5 = r5 + r7;
        r0 = r1[r4];
        if (r5 <= r0) goto L_0x0116;
    L_0x0115:
        goto L_0x0123;
    L_0x0116:
        r0 = 1;
        goto L_0x0124;
    L_0x0118:
        r0 = "Height is too small or too large.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
        goto L_0x0123;
    L_0x011e:
        r0 = "Width is too small or too large.";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x0123:
        r0 = 0;
    L_0x0124:
        if (r0 != 0) goto L_0x0128;
    L_0x0126:
        r0 = 0;
        return r0;
    L_0x0128:
        r0 = r9.f16736c;
        if (r0 == 0) goto L_0x013d;
    L_0x012c:
        r0 = new int[r6];
        r1 = r9.f16737d;
        r3 = r9.f16740g;
        r1 = r1 + r3;
        r0[r2] = r1;
        r1 = r9.f16738e;
        r2 = r9.f16741h;
        r1 = r1 + r2;
        r0[r4] = r1;
        return r0;
    L_0x013d:
        r0 = com.google.android.gms.ads.internal.zzbv.zzek();
        r1 = r9.f16745l;
        r0 = r0.m9843b(r1);
        r1 = com.google.android.gms.ads.internal.zzbv.zzek();
        r3 = r9.f16745l;
        r1 = r1.m9845c(r3);
        r0 = r0[r2];
        r3 = r9.f16737d;
        r5 = r9.f16740g;
        r3 = r3 + r5;
        r5 = r9.f16738e;
        r7 = r9.f16741h;
        r5 = r5 + r7;
        if (r3 >= 0) goto L_0x0161;
    L_0x015f:
        r0 = 0;
        goto L_0x016b;
    L_0x0161:
        r7 = r9.f16742i;
        r7 = r7 + r3;
        if (r7 <= r0) goto L_0x016a;
    L_0x0166:
        r3 = r9.f16742i;
        r0 = r0 - r3;
        goto L_0x016b;
    L_0x016a:
        r0 = r3;
    L_0x016b:
        r3 = r1[r2];
        if (r5 >= r3) goto L_0x0172;
    L_0x016f:
        r5 = r1[r2];
        goto L_0x017f;
    L_0x0172:
        r3 = r9.f16739f;
        r3 = r3 + r5;
        r7 = r1[r4];
        if (r3 <= r7) goto L_0x017f;
    L_0x0179:
        r1 = r1[r4];
        r3 = r9.f16739f;
        r5 = r1 - r3;
    L_0x017f:
        r1 = new int[r6];
        r1[r2] = r0;
        r1[r4] = r5;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabh.b():int[]");
    }

    /* renamed from: a */
    public final void m21068a(int i, int i2, boolean z) {
        synchronized (this.f16743j) {
            this.f16737d = i;
            this.f16738e = i2;
            if (this.f16750q != 0 && z) {
                i = m21066b();
                if (i != 0) {
                    z = this.f16750q;
                    zzkd.m10709a();
                    int a = zzaoa.m9952a(this.f16745l, i[0]);
                    zzkd.m10709a();
                    z.update(a, zzaoa.m9952a(this.f16745l, i[1]), this.f16750q.getWidth(), this.f16750q.getHeight());
                    m21065b(i[0], i[1]);
                } else {
                    m21070a(true);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m21065b(int i, int i2) {
        m9443a(i, i2 - zzbv.zzek().m9845c(this.f16745l)[0], this.f16742i, this.f16739f);
    }

    /* renamed from: a */
    public final boolean m21071a() {
        boolean z;
        synchronized (this.f16743j) {
            z = this.f16750q != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void m21067a(int i, int i2) {
        this.f16737d = i;
        this.f16738e = i2;
    }
}
