package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.widget.PopupWindow;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@TargetApi(19)
public final class zzacx extends zzacu {
    /* renamed from: d */
    private Object f21350d = new Object();
    @GuardedBy("mPopupWindowLock")
    /* renamed from: e */
    private PopupWindow f21351e;
    @GuardedBy("mPopupWindowLock")
    /* renamed from: f */
    private boolean f21352f = null;

    zzacx(Context context, zzakn zzakn, zzasg zzasg, zzact zzact) {
        super(context, zzakn, zzasg, zzact);
    }

    /* renamed from: d */
    protected final void mo4791d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r8 = this;
        r0 = r8.a;
        r0 = r0 instanceof android.app.Activity;
        r1 = 0;
        if (r0 == 0) goto L_0x0010;
    L_0x0007:
        r0 = r8.a;
        r0 = (android.app.Activity) r0;
        r0 = r0.getWindow();
        goto L_0x0011;
    L_0x0010:
        r0 = r1;
    L_0x0011:
        if (r0 == 0) goto L_0x0070;
    L_0x0013:
        r2 = r0.getDecorView();
        if (r2 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0070;
    L_0x001a:
        r2 = r8.a;
        r2 = (android.app.Activity) r2;
        r2 = r2.isDestroyed();
        if (r2 == 0) goto L_0x0025;
    L_0x0024:
        return;
    L_0x0025:
        r2 = new android.widget.FrameLayout;
        r3 = r8.a;
        r2.<init>(r3);
        r3 = new android.view.ViewGroup$LayoutParams;
        r4 = -1;
        r3.<init>(r4, r4);
        r2.setLayoutParams(r3);
        r3 = r8.b;
        r3 = r3.getView();
        r2.addView(r3, r4, r4);
        r3 = r8.f21350d;
        monitor-enter(r3);
        r5 = r8.f21352f;	 Catch:{ all -> 0x006d }
        if (r5 == 0) goto L_0x0047;	 Catch:{ all -> 0x006d }
    L_0x0045:
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        return;	 Catch:{ all -> 0x006d }
    L_0x0047:
        r5 = new android.widget.PopupWindow;	 Catch:{ all -> 0x006d }
        r6 = 0;	 Catch:{ all -> 0x006d }
        r7 = 1;	 Catch:{ all -> 0x006d }
        r5.<init>(r2, r7, r7, r6);	 Catch:{ all -> 0x006d }
        r8.f21351e = r5;	 Catch:{ all -> 0x006d }
        r2 = r8.f21351e;	 Catch:{ all -> 0x006d }
        r2.setOutsideTouchable(r7);	 Catch:{ all -> 0x006d }
        r2 = r8.f21351e;	 Catch:{ all -> 0x006d }
        r2.setClippingEnabled(r6);	 Catch:{ all -> 0x006d }
        r2 = "Displaying the 1x1 popup off the screen.";	 Catch:{ all -> 0x006d }
        com.google.android.gms.internal.ads.zzaok.m10001b(r2);	 Catch:{ all -> 0x006d }
        r2 = r8.f21351e;	 Catch:{ Exception -> 0x0069 }
        r0 = r0.getDecorView();	 Catch:{ Exception -> 0x0069 }
        r2.showAtLocation(r0, r6, r4, r4);	 Catch:{ Exception -> 0x0069 }
        goto L_0x006b;
    L_0x0069:
        r8.f21351e = r1;	 Catch:{ all -> 0x006d }
    L_0x006b:
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        return;	 Catch:{ all -> 0x006d }
    L_0x006d:
        r0 = move-exception;	 Catch:{ all -> 0x006d }
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        throw r0;
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacx.d():void");
    }

    /* renamed from: b */
    public final void mo2218b() {
        m28251e();
        super.mo2218b();
    }

    /* renamed from: a */
    protected final void mo4790a(int i) {
        m28251e();
        super.mo4790a(i);
    }

    /* renamed from: e */
    private final void m28251e() {
        synchronized (this.f21350d) {
            this.f21352f = true;
            if ((this.a instanceof Activity) && ((Activity) this.a).isDestroyed()) {
                this.f21351e = null;
            }
            if (this.f21351e != null) {
                if (this.f21351e.isShowing()) {
                    this.f21351e.dismiss();
                }
                this.f21351e = null;
            }
        }
    }
}
