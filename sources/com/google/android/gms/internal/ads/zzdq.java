package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

public final class zzdq extends zzek {
    /* renamed from: d */
    private static final zzel<zzbl> f17163d = new zzel();
    /* renamed from: e */
    private final Context f17164e;
    /* renamed from: f */
    private zzay f17165f = null;

    public zzdq(zzdb zzdb, String str, String str2, zzbb zzbb, int i, int i2, Context context, zzay zzay) {
        super(zzdb, str, str2, zzbb, i, 27);
        this.f17164e = context;
        this.f17165f = zzay;
    }

    /* renamed from: a */
    protected final void mo2435a() {
        AtomicReference a = f17163d.m10544a(this.f17164e.getPackageName());
        synchronized (a) {
            Object obj;
            Object obj2;
            zzbl zzbl;
            String c;
            zzbl zzbl2 = (zzbl) a.get();
            boolean z = false;
            if (!(zzbl2 == null || zzdi.m10528b(zzbl2.f17113a) || zzbl2.f17113a.equals("E"))) {
                if (!zzbl2.f17113a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    obj = null;
                    if (obj != null) {
                        zzay zzay = this.f17165f;
                        if (zzdi.m10528b(null)) {
                            obj2 = 4;
                        } else {
                            zzay zzay2 = this.f17165f;
                            zzdi.m10528b(null);
                            if (Boolean.valueOf(false).booleanValue()) {
                                if (this.a.m10516i()) {
                                    if (((Boolean) zzkd.m10713e().m10897a(zznw.bp)).booleanValue()) {
                                        if (((Boolean) zzkd.m10713e().m10897a(zznw.bq)).booleanValue()) {
                                            obj2 = 1;
                                            if (obj2 != null) {
                                                obj2 = 3;
                                            }
                                        }
                                    }
                                }
                                obj2 = null;
                                if (obj2 != null) {
                                    obj2 = 3;
                                }
                            }
                            obj2 = 2;
                        }
                        Method method = this.c;
                        Object[] objArr = new Object[3];
                        objArr[0] = this.f17164e;
                        if (obj2 == 2) {
                            z = true;
                        }
                        objArr[1] = Boolean.valueOf(z);
                        objArr[2] = zzkd.m10713e().m10897a(zznw.bj);
                        zzbl = new zzbl((String) method.invoke(null, objArr));
                        if (zzdi.m10528b(zzbl.f17113a) || zzbl.f17113a.equals("E")) {
                            switch (obj2) {
                                case 3:
                                    c = m21651c();
                                    if (!zzdi.m10528b(c)) {
                                        zzbl.f17113a = c;
                                        break;
                                    }
                                    break;
                                case 4:
                                    zzbl.f17113a = null.f19953a;
                                    break;
                                default:
                                    break;
                            }
                        }
                        a.set(zzbl);
                    }
                    zzbl2 = (zzbl) a.get();
                }
            }
            obj = 1;
            if (obj != null) {
                zzay zzay3 = this.f17165f;
                if (zzdi.m10528b(null)) {
                    zzay zzay22 = this.f17165f;
                    zzdi.m10528b(null);
                    if (Boolean.valueOf(false).booleanValue()) {
                        if (this.a.m10516i()) {
                            if (((Boolean) zzkd.m10713e().m10897a(zznw.bp)).booleanValue()) {
                                if (((Boolean) zzkd.m10713e().m10897a(zznw.bq)).booleanValue()) {
                                    obj2 = 1;
                                    if (obj2 != null) {
                                        obj2 = 3;
                                    }
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 != null) {
                            obj2 = 3;
                        }
                    }
                    obj2 = 2;
                } else {
                    obj2 = 4;
                }
                Method method2 = this.c;
                Object[] objArr2 = new Object[3];
                objArr2[0] = this.f17164e;
                if (obj2 == 2) {
                    z = true;
                }
                objArr2[1] = Boolean.valueOf(z);
                objArr2[2] = zzkd.m10713e().m10897a(zznw.bj);
                zzbl = new zzbl((String) method2.invoke(null, objArr2));
                switch (obj2) {
                    case 3:
                        c = m21651c();
                        if (zzdi.m10528b(c)) {
                            zzbl.f17113a = c;
                            break;
                        }
                        break;
                    case 4:
                        zzbl.f17113a = null.f19953a;
                        break;
                    default:
                        break;
                }
                a.set(zzbl);
            }
            zzbl2 = (zzbl) a.get();
        }
        synchronized (this.b) {
            if (zzbl2 != null) {
                this.b.f19997n = zzbl2.f17113a;
                this.b.f20003t = Long.valueOf(zzbl2.f17114b);
                this.b.f20002s = zzbl2.f17115c;
                this.b.f19961C = zzbl2.f17116d;
                this.b.f19962D = zzbl2.f17117e;
            }
        }
    }

    /* renamed from: c */
    private final java.lang.String m21651c() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.a;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.m10519l();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r0 == 0) goto L_0x0011;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0008:
        r0 = r2.a;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.m10519l();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0.get();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0011:
        r0 = r2.a;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        r0 = r0.m10518k();	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r0 == 0) goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x0019:
        r1 = r0.f19997n;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        if (r1 == 0) goto L_0x0020;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
    L_0x001d:
        r0 = r0.f19997n;	 Catch:{ InterruptedException -> 0x0020, InterruptedException -> 0x0020 }
        return r0;
    L_0x0020:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdq.c():java.lang.String");
    }
}
