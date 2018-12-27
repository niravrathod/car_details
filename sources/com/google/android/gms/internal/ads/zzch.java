package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedList;

public abstract class zzch implements zzcg {
    /* renamed from: a */
    protected static volatile zzdb f17118a;
    /* renamed from: b */
    protected MotionEvent f17119b;
    /* renamed from: c */
    protected LinkedList<MotionEvent> f17120c = new LinkedList();
    /* renamed from: d */
    protected long f17121d = 0;
    /* renamed from: e */
    protected long f17122e = 0;
    /* renamed from: f */
    protected long f17123f = 0;
    /* renamed from: g */
    protected long f17124g = 0;
    /* renamed from: h */
    protected long f17125h = 0;
    /* renamed from: i */
    protected long f17126i = 0;
    /* renamed from: j */
    protected long f17127j = 0;
    /* renamed from: k */
    protected double f17128k;
    /* renamed from: l */
    protected float f17129l;
    /* renamed from: m */
    protected float f17130m;
    /* renamed from: n */
    protected float f17131n;
    /* renamed from: o */
    protected float f17132o;
    /* renamed from: p */
    protected boolean f17133p = false;
    /* renamed from: q */
    protected DisplayMetrics f17134q;
    /* renamed from: r */
    private double f17135r;
    /* renamed from: s */
    private double f17136s;
    /* renamed from: t */
    private boolean f17137t = false;

    protected zzch(android.content.Context r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>();
        r0 = new java.util.LinkedList;
        r0.<init>();
        r2.f17120c = r0;
        r0 = 0;
        r2.f17121d = r0;
        r2.f17122e = r0;
        r2.f17123f = r0;
        r2.f17124g = r0;
        r2.f17125h = r0;
        r2.f17126i = r0;
        r2.f17127j = r0;
        r0 = 0;
        r2.f17137t = r0;
        r2.f17133p = r0;
        r0 = com.google.android.gms.internal.ads.zznw.bm;	 Catch:{ Throwable -> 0x0045 }
        r1 = com.google.android.gms.internal.ads.zzkd.m10713e();	 Catch:{ Throwable -> 0x0045 }
        r0 = r1.m10897a(r0);	 Catch:{ Throwable -> 0x0045 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Throwable -> 0x0045 }
        r0 = r0.booleanValue();	 Catch:{ Throwable -> 0x0045 }
        if (r0 == 0) goto L_0x0035;	 Catch:{ Throwable -> 0x0045 }
    L_0x0031:
        com.google.android.gms.internal.ads.oa.m9349a();	 Catch:{ Throwable -> 0x0045 }
        goto L_0x003a;	 Catch:{ Throwable -> 0x0045 }
    L_0x0035:
        r0 = f17118a;	 Catch:{ Throwable -> 0x0045 }
        com.google.android.gms.internal.ads.pe.m9355a(r0);	 Catch:{ Throwable -> 0x0045 }
    L_0x003a:
        r3 = r3.getResources();	 Catch:{ Throwable -> 0x0045 }
        r3 = r3.getDisplayMetrics();	 Catch:{ Throwable -> 0x0045 }
        r2.f17134q = r3;	 Catch:{ Throwable -> 0x0045 }
        return;
    L_0x0045:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzch.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    protected abstract long mo4258a(StackTraceElement[] stackTraceElementArr);

    /* renamed from: a */
    protected abstract zzbb mo4259a(Context context, View view, Activity activity);

    /* renamed from: a */
    protected abstract zzbb mo4260a(Context context, zzay zzay);

    /* renamed from: a */
    protected abstract zzdh mo4261a(MotionEvent motionEvent);

    public void zzb(View view) {
    }

    public final String zza(Context context) {
        if (zzdi.m10526a()) {
            if (((Boolean) zzkd.m10713e().m10897a(zznw.bo)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return m21633a(context, null, false, null, null, null);
    }

    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    public final String zza(Context context, String str, View view, Activity activity) {
        return m21633a(context, str, true, view, activity, null);
    }

    public final void zza(android.view.MotionEvent r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r12 = this;
        r0 = r12.f17137t;
        r1 = 0;
        if (r0 == 0) goto L_0x0035;
    L_0x0005:
        r2 = 0;
        r12.f17124g = r2;
        r12.f17123f = r2;
        r12.f17122e = r2;
        r12.f17121d = r2;
        r12.f17125h = r2;
        r12.f17127j = r2;
        r12.f17126i = r2;
        r0 = r12.f17120c;
        r0 = r0.iterator();
    L_0x001b:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x002b;
    L_0x0021:
        r2 = r0.next();
        r2 = (android.view.MotionEvent) r2;
        r2.recycle();
        goto L_0x001b;
    L_0x002b:
        r0 = r12.f17120c;
        r0.clear();
        r0 = 0;
        r12.f17119b = r0;
        r12.f17137t = r1;
    L_0x0035:
        r0 = r13.getAction();
        switch(r0) {
            case 0: goto L_0x0068;
            case 1: goto L_0x003d;
            case 2: goto L_0x003d;
            default: goto L_0x003c;
        };
    L_0x003c:
        goto L_0x007a;
    L_0x003d:
        r0 = r13.getRawX();
        r2 = (double) r0;
        r0 = r13.getRawY();
        r4 = (double) r0;
        r6 = r12.f17135r;
        java.lang.Double.isNaN(r2);
        r6 = r2 - r6;
        r8 = r12.f17136s;
        java.lang.Double.isNaN(r4);
        r8 = r4 - r8;
        r10 = r12.f17128k;
        r6 = r6 * r6;
        r8 = r8 * r8;
        r6 = r6 + r8;
        r6 = java.lang.Math.sqrt(r6);
        r10 = r10 + r6;
        r12.f17128k = r10;
        r12.f17135r = r2;
        r12.f17136s = r4;
        goto L_0x007a;
    L_0x0068:
        r2 = 0;
        r12.f17128k = r2;
        r0 = r13.getRawX();
        r2 = (double) r0;
        r12.f17135r = r2;
        r0 = r13.getRawY();
        r2 = (double) r0;
        r12.f17136s = r2;
    L_0x007a:
        r0 = r13.getAction();
        r2 = 1;
        r4 = 1;
        switch(r0) {
            case 0: goto L_0x0119;
            case 1: goto L_0x00e3;
            case 2: goto L_0x008d;
            case 3: goto L_0x0086;
            default: goto L_0x0084;
        };
    L_0x0084:
        goto L_0x0136;
    L_0x0086:
        r0 = r12.f17124g;
        r0 = r0 + r2;
        r12.f17124g = r0;
        goto L_0x0136;
    L_0x008d:
        r2 = r12.f17122e;
        r0 = r13.getHistorySize();
        r0 = r0 + r4;
        r5 = (long) r0;
        r2 = r2 + r5;
        r12.f17122e = r2;
        r13 = r12.mo4261a(r13);	 Catch:{ zzcy -> 0x0136 }
        if (r13 == 0) goto L_0x00a8;	 Catch:{ zzcy -> 0x0136 }
    L_0x009e:
        r0 = r13.f17148d;	 Catch:{ zzcy -> 0x0136 }
        if (r0 == 0) goto L_0x00a8;	 Catch:{ zzcy -> 0x0136 }
    L_0x00a2:
        r0 = r13.f17151g;	 Catch:{ zzcy -> 0x0136 }
        if (r0 == 0) goto L_0x00a8;	 Catch:{ zzcy -> 0x0136 }
    L_0x00a6:
        r0 = 1;	 Catch:{ zzcy -> 0x0136 }
        goto L_0x00a9;	 Catch:{ zzcy -> 0x0136 }
    L_0x00a8:
        r0 = 0;	 Catch:{ zzcy -> 0x0136 }
    L_0x00a9:
        if (r0 == 0) goto L_0x00be;	 Catch:{ zzcy -> 0x0136 }
    L_0x00ab:
        r2 = r12.f17126i;	 Catch:{ zzcy -> 0x0136 }
        r0 = r13.f17148d;	 Catch:{ zzcy -> 0x0136 }
        r5 = r0.longValue();	 Catch:{ zzcy -> 0x0136 }
        r0 = r13.f17151g;	 Catch:{ zzcy -> 0x0136 }
        r7 = r0.longValue();	 Catch:{ zzcy -> 0x0136 }
        r0 = 0;	 Catch:{ zzcy -> 0x0136 }
        r5 = r5 + r7;	 Catch:{ zzcy -> 0x0136 }
        r2 = r2 + r5;	 Catch:{ zzcy -> 0x0136 }
        r12.f17126i = r2;	 Catch:{ zzcy -> 0x0136 }
    L_0x00be:
        r0 = r12.f17134q;	 Catch:{ zzcy -> 0x0136 }
        if (r0 == 0) goto L_0x00cd;	 Catch:{ zzcy -> 0x0136 }
    L_0x00c2:
        if (r13 == 0) goto L_0x00cd;	 Catch:{ zzcy -> 0x0136 }
    L_0x00c4:
        r0 = r13.f17149e;	 Catch:{ zzcy -> 0x0136 }
        if (r0 == 0) goto L_0x00cd;	 Catch:{ zzcy -> 0x0136 }
    L_0x00c8:
        r0 = r13.f17152h;	 Catch:{ zzcy -> 0x0136 }
        if (r0 == 0) goto L_0x00cd;	 Catch:{ zzcy -> 0x0136 }
    L_0x00cc:
        r1 = 1;	 Catch:{ zzcy -> 0x0136 }
    L_0x00cd:
        if (r1 == 0) goto L_0x0136;	 Catch:{ zzcy -> 0x0136 }
    L_0x00cf:
        r0 = r12.f17127j;	 Catch:{ zzcy -> 0x0136 }
        r2 = r13.f17149e;	 Catch:{ zzcy -> 0x0136 }
        r2 = r2.longValue();	 Catch:{ zzcy -> 0x0136 }
        r13 = r13.f17152h;	 Catch:{ zzcy -> 0x0136 }
        r5 = r13.longValue();	 Catch:{ zzcy -> 0x0136 }
        r13 = 0;	 Catch:{ zzcy -> 0x0136 }
        r2 = r2 + r5;	 Catch:{ zzcy -> 0x0136 }
        r0 = r0 + r2;	 Catch:{ zzcy -> 0x0136 }
        r12.f17127j = r0;	 Catch:{ zzcy -> 0x0136 }
        goto L_0x0136;
    L_0x00e3:
        r13 = android.view.MotionEvent.obtain(r13);
        r12.f17119b = r13;
        r13 = r12.f17120c;
        r0 = r12.f17119b;
        r13.add(r0);
        r13 = r12.f17120c;
        r13 = r13.size();
        r0 = 6;
        if (r13 <= r0) goto L_0x0104;
    L_0x00f9:
        r13 = r12.f17120c;
        r13 = r13.remove();
        r13 = (android.view.MotionEvent) r13;
        r13.recycle();
    L_0x0104:
        r0 = r12.f17123f;
        r0 = r0 + r2;
        r12.f17123f = r0;
        r13 = new java.lang.Throwable;	 Catch:{ zzcy -> 0x0136 }
        r13.<init>();	 Catch:{ zzcy -> 0x0136 }
        r13 = r13.getStackTrace();	 Catch:{ zzcy -> 0x0136 }
        r0 = r12.mo4258a(r13);	 Catch:{ zzcy -> 0x0136 }
        r12.f17125h = r0;	 Catch:{ zzcy -> 0x0136 }
        goto L_0x0136;
    L_0x0119:
        r0 = r13.getX();
        r12.f17129l = r0;
        r0 = r13.getY();
        r12.f17130m = r0;
        r0 = r13.getRawX();
        r12.f17131n = r0;
        r13 = r13.getRawY();
        r12.f17132o = r13;
        r0 = r12.f17121d;
        r0 = r0 + r2;
        r12.f17121d = r0;
    L_0x0136:
        r12.f17133p = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzch.zza(android.view.MotionEvent):void");
    }

    public final void zza(int i, int i2, int i3) {
        if (this.f17119b != null) {
            r0.f17119b.recycle();
        }
        if (r0.f17134q != null) {
            r0.f17119b = MotionEvent.obtain(0, (long) i3, 1, r0.f17134q.density * ((float) i), r0.f17134q.density * ((float) i2), 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            r0.f17119b = null;
        }
        r0.f17133p = false;
    }

    /* renamed from: a */
    private final java.lang.String m21633a(android.content.Context r1, java.lang.String r2, boolean r3, android.view.View r4, android.app.Activity r5, byte[] r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = this;
        if (r3 == 0) goto L_0x000a;
    L_0x0002:
        r1 = r0.mo4259a(r1, r4, r5);	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        r3 = 1;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        r0.f17137t = r3;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        goto L_0x000f;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
    L_0x000a:
        r3 = 0;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        r1 = r0.mo4260a(r1, r3);	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
    L_0x000f:
        if (r1 == 0) goto L_0x001d;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
    L_0x0011:
        r3 = r1.m10455d();	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        if (r3 != 0) goto L_0x0018;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
    L_0x0017:
        goto L_0x001d;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
    L_0x0018:
        r1 = com.google.android.gms.internal.ads.oa.m9346a(r1, r2);	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        goto L_0x002e;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
    L_0x001d:
        r1 = 5;	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ GeneralSecurityException -> 0x0029, GeneralSecurityException -> 0x0029, Throwable -> 0x0023 }
        goto L_0x002e;
    L_0x0023:
        r1 = 3;
        r1 = java.lang.Integer.toString(r1);
        goto L_0x002e;
    L_0x0029:
        r1 = 7;
        r1 = java.lang.Integer.toString(r1);
    L_0x002e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzch.a(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }
}
