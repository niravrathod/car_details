package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class zzci extends zzch {
    /* renamed from: s */
    private static final Object f20121s = new Object();
    /* renamed from: t */
    private static final String f20122t = zzci.class.getSimpleName();
    /* renamed from: u */
    private static boolean f20123u = false;
    /* renamed from: v */
    private static long f20124v = 0;
    /* renamed from: r */
    protected boolean f20125r = false;
    /* renamed from: w */
    private String f20126w;
    /* renamed from: x */
    private boolean f20127x = false;
    /* renamed from: y */
    private boolean f20128y = false;
    /* renamed from: z */
    private zzdk f20129z;

    /* renamed from: a */
    protected static synchronized void m26563a(Context context, boolean z) {
        synchronized (zzci.class) {
            if (!f20123u) {
                f20124v = System.currentTimeMillis() / 1000;
                a = m26565b(context, z);
                f20123u = true;
            }
        }
    }

    protected zzci(Context context, String str, boolean z) {
        super(context);
        this.f20126w = str;
        this.f20125r = z;
    }

    /* renamed from: b */
    private static zzdb m26565b(Context context, boolean z) {
        if (a == null) {
            synchronized (f20121s) {
                if (a == null) {
                    context = zzdb.m10493a(context, "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", z);
                    if (context.m10509b()) {
                        if (((Boolean) zzkd.m10713e().m10897a(zznw.bk)).booleanValue()) {
                            context.m10507a("phpjyfBMe8u7C5auGMsy22WXoT6iMDb5qqttOP4sXOBlc73QdE1wdYLJ++PsHndY", "86B2wkBiSbEIJu45HO/BQ/RpWXZRq9YpFeIER87ao7I=", new Class[0]);
                        }
                        context.m10507a("DPtJycwRqj/e0TdTHULzeUhZhWJ1IU3iwhH90sUbn4eYKEdB5HI7UC0PtJgg2RSN", "Ye7G7hL63+8nOBoyCAHdjfK62rvCOKz3+aC1KA/K9CI=", Context.class);
                        context.m10507a("1IkHdmwdwv9wD8tmJQC+h66q1PQxvS+V9UrDno8I9cxHFnF0E43buTrJO+G+/gQl", "A9jthiAQc+izVBr4mJNKEZTv7NXyHy0tI8Qg667eCzo=", Context.class);
                        context.m10507a("2a/4JIVPkDFYMOVDvRgiPhzuBvaMjATDrq7QEolObsd/NV02/K8EoZgGgGExyTEN", "zAquriPjpzqGJfvs/9ulqqLxOML+UEqSlyjOz6Tu5VU=", Context.class);
                        context.m10507a("5Un4Bxdp8gVIANCZ39+qNPpJwSMKWP26YPuxiQ9CnPTd/FlU4AIzDaH9PI9I+CrN", "4Df+wFSysP9SafTWPUlnClwqa+KS42poxSq2xHfYKTY=", Context.class);
                        context.m10507a("tSH6JN0/dsR0FAYjQVtAYWAamOw3jEQmk6Hr8jJN+yrtPJ4ZwRFL84dAlVlDBCND", "QIWClwyA1htDcymLB9H+9tV5qeIhlSOa2TsbKDGB4CU=", Context.class);
                        context.m10507a("M1NS9rNHdzevdCO1BkBQDrEtWalzliBN1oXlHuD/PStxAuVrokFwJ8FTE8R3woq0", "4Nk49DU1yHD/oE1MfAOMbRwhDipAhidA7tdJouMJQrI=", Context.class);
                        context.m10507a("ALF9qjihH/iYAQtvlhVRCPGKYo/wJshkjPnwFlKHSnSRd1pu6U+lD5JnTKlN/8Dh", "hp8obFMJgqHXmaR5pMrBIn7HvqDUI8ERyuIbnl0iT/M=", Context.class);
                        context.m10507a("DdZDLurYd8cqlTxFH9iUg4PWLqXdMHMkdrTyCVNVmPtO8AJJSQ+/YGXoMqGNOXWI", "c760NRjk4Ctk2HA0ROzb7VHBeyDIvOdXhTBmaaREC+Y=", Context.class);
                        context.m10507a("LOklmrwaQ0v3CGeP+ZosklY8SbmufmvNG6auvqsL+bGnLcr54FaTv3bt+awlDR0E", "/Fj70v9BUIdYkRnDi6EwnKWPurvJ9lYtBhSoj7eKwt8=", MotionEvent.class, DisplayMetrics.class);
                        context.m10507a("BDp2p9FkJRWhLjM5/HGlBtfI2hTpjdS5yJQGMqe31LtNjFTgL+0QOyyChfmPPFl0", "got2az0DwXyMWaLpfVutWfEF1l3X50FJhmqzREDcTA8=", MotionEvent.class, DisplayMetrics.class);
                        context.m10507a("teIp99oid1pENGWnU++9yOPCIwtIDIwejcakl+LfK5qHHKbt0MJt+8BqbhD17b1n", "NREPPB/9iy6pGr9Pw6YHALTcoiK6Qv0Fu8JVtmSXvzQ=", new Class[0]);
                        context.m10507a("nm3YsDf+7WO+MEOswfwP/mr6SZsOgwQFOzWfB0E01vRE8SnBNpESCxeGx/E3obzH", "ntbFRCAexgxz9p8O68TxIQjW9W7nZKRNbG91vq8F9ro=", new Class[0]);
                        context.m10507a("OU2zTkMb3xVWxjElhSJNJtcyjBcBIax5KghmsB2DrHu3HRhgp4Bz1cQIIaak8Abf", "0aMkajKGfxJjxUakLLOcj8JypKv0GmCb3d+C/AP1yzc=", new Class[0]);
                        context.m10507a("55W269KXvkwdzl5sfb0CcKPmBnPIftmJMRWEHFEIHMVBNbB9RYoQD/JeAhpTyftv", "xRFu2EA0XhZqR4z5v1+z5DRPRDh4cLaTVyZWq8w+32M=", new Class[0]);
                        context.m10507a("diFehzLUdSyhsDAHjo1jRWbuUSlDLM7ewQWDc6EGa5SkktywcOnUZVN2l852D8v/", "gccLIpNanlTav8umvHfA6CkZesdxV9Cr39ehhj7Z8L8=", new Class[0]);
                        context.m10507a("HW6DUu9hdQUUJG4hyzA4/jDFe17EFpXdJQ2aqCpScU07e6PXExB1P1rW0uW0StIw", "XCJaUXNSa18os9LIeCcjZdYTv1kZvdxKgQEEsV6JTUc=", new Class[0]);
                        context.m10507a("qsalJ2RwJdF4/xIua4a94Fnnrn+PF/pR/qVYX8QPAaTQDa6NRA9etEnbnhQWblFD", "G68A6YJ+VRJhgHK56Kx1RoGHOyqehPG7tlyyPwtcr7Q=", Context.class, Boolean.TYPE, Boolean.TYPE);
                        context.m10507a("dUZXsTQGXogdq7xqgYL8i0iimZLTpa9AoXZpRO79MP7o6nVl+DoNjuCg63H0zXDK", "Vz6KZKN/XNSe7DawDVk5XNlgz1HLOOLd+9M1b4lusVA=", StackTraceElement[].class);
                        context.m10507a("JpT53kCFZ5UGhS3QgNfIxU7Zo+2b3P+3vnYveTkMBHt4zfnotqnDwQTaAD1ryBW9", "SQmHWbTAzPlYuz5I3xZRZNLM/2+IGX009ow9MnjYfrI=", View.class, DisplayMetrics.class);
                        context.m10507a("9KTvYPBd7MH2ciAlBu9OHvde4n0Fwv5nDeizahStujRhSUn5FAOJjVUu69hMaCIH", "kiOoUcTqb+PvEdOeeDwNvvUZgbOHeCWSZHc9NNTPPv4=", Context.class, Boolean.TYPE);
                        context.m10507a("TxRdKOZ0pZeBXpIwiLITX81ZqIx50eBVN3DINE4ZBUPdk4novnMzQn3dOLT7/176", "m2+gcfdQWoY+6hOETk2mr0SsbjGMFJBzTmSItOYkEfM=", View.class, Activity.class, Boolean.TYPE);
                        context.m10507a("9MXEPmGC/7986z/wLWv2b+1iRSmCMoPNrO7Sy/hYl1riiNMJKXOd189OeOHpltpa", "DjhY2o1Svq1HpINv7cU+bAqV+OA81bMZ6vkVBk0u3II=", Long.TYPE);
                    }
                    a = context;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    private static zzdh m26562a(zzdb zzdb, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        zzdb = zzdb.m10505a("LOklmrwaQ0v3CGeP+ZosklY8SbmufmvNG6auvqsL+bGnLcr54FaTv3bt+awlDR0E", "/Fj70v9BUIdYkRnDi6EwnKWPurvJ9lYtBhSoj7eKwt8=");
        if (zzdb == null || motionEvent == null) {
            throw new zzcy();
        }
        try {
            return new zzdh((String) zzdb.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (zzdb zzdb2) {
            throw new zzcy(zzdb2);
        }
    }

    /* renamed from: a */
    protected final zzbb mo4260a(Context context, zzay zzay) {
        zzay = new zzbb();
        if (!TextUtils.isEmpty(this.f20126w)) {
            zzay.f19985b = this.f20126w;
        }
        zzdb b = m26565b(context, this.f20125r);
        if (b.m10510c() != null) {
            m26564a(mo4813a(b, context, zzay, null));
        }
        return zzay;
    }

    /* renamed from: a */
    protected final com.google.android.gms.internal.ads.zzbb mo4259a(android.content.Context r16, android.view.View r17, android.app.Activity r18) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r15 = this;
        r0 = r15;
        r10 = new com.google.android.gms.internal.ads.zzbb;
        r10.<init>();
        r1 = r0.f20126w;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x0012;
    L_0x000e:
        r1 = r0.f20126w;
        r10.f19985b = r1;
    L_0x0012:
        r1 = r0.f20125r;
        r2 = r16;
        r11 = m26565b(r2, r1);
        r1 = r11.m10509b();
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x003a;
    L_0x0022:
        r4 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r1 = java.lang.Long.valueOf(r4);
        r10.f19994k = r1;
        r1 = new java.util.concurrent.Callable[r3];
        r3 = new com.google.android.gms.internal.ads.zzdv;
        r3.<init>(r11, r10);
        r1[r2] = r3;
        r1 = java.util.Arrays.asList(r1);
        r12 = r1;
        goto L_0x034e;
    L_0x003a:
        r1 = r0.b;	 Catch:{ zzcy -> 0x005a }
        r4 = r0.q;	 Catch:{ zzcy -> 0x005a }
        r1 = m26562a(r11, r1, r4);	 Catch:{ zzcy -> 0x005a }
        r4 = r1.f17145a;	 Catch:{ zzcy -> 0x005a }
        r10.f19990g = r4;	 Catch:{ zzcy -> 0x005a }
        r4 = r1.f17146b;	 Catch:{ zzcy -> 0x005a }
        r10.f19991h = r4;	 Catch:{ zzcy -> 0x005a }
        r4 = r1.f17147c;	 Catch:{ zzcy -> 0x005a }
        r10.f19992i = r4;	 Catch:{ zzcy -> 0x005a }
        r4 = r0.p;	 Catch:{ zzcy -> 0x005a }
        if (r4 == 0) goto L_0x005a;	 Catch:{ zzcy -> 0x005a }
    L_0x0052:
        r4 = r1.f17148d;	 Catch:{ zzcy -> 0x005a }
        r10.f20004u = r4;	 Catch:{ zzcy -> 0x005a }
        r1 = r1.f17149e;	 Catch:{ zzcy -> 0x005a }
        r10.f20005v = r1;	 Catch:{ zzcy -> 0x005a }
    L_0x005a:
        r1 = new com.google.android.gms.internal.ads.zzbc;
        r1.<init>();
        r4 = r0.d;
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x010f;
    L_0x0067:
        r4 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10527a(r4);
        if (r4 == 0) goto L_0x010f;
    L_0x006f:
        r4 = r0.k;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r4 = java.lang.Long.valueOf(r4);
        r1.f20023m = r4;
        r4 = r0.n;
        r5 = r0.l;
        r4 = r4 - r5;
        r4 = (double) r4;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r4 = java.lang.Long.valueOf(r4);
        r1.f20024n = r4;
        r4 = r0.o;
        r5 = r0.m;
        r4 = r4 - r5;
        r4 = (double) r4;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r4 = java.lang.Long.valueOf(r4);
        r1.f20025o = r4;
        r4 = r0.l;
        r4 = (double) r4;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r4 = java.lang.Long.valueOf(r4);
        r1.f20028r = r4;
        r4 = r0.m;
        r4 = (double) r4;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r4 = java.lang.Long.valueOf(r4);
        r1.f20029s = r4;
        r4 = r0.p;
        if (r4 == 0) goto L_0x010f;
    L_0x00c3:
        r4 = r0.b;
        if (r4 == 0) goto L_0x010f;
    L_0x00c7:
        r4 = r0.l;
        r5 = r0.n;
        r4 = r4 - r5;
        r5 = r0.b;
        r5 = r5.getRawX();
        r4 = r4 + r5;
        r5 = r0.b;
        r5 = r5.getX();
        r4 = r4 - r5;
        r4 = (double) r4;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x00eb;
    L_0x00e5:
        r4 = java.lang.Long.valueOf(r4);
        r1.f20026p = r4;
    L_0x00eb:
        r4 = r0.m;
        r5 = r0.o;
        r4 = r4 - r5;
        r5 = r0.b;
        r5 = r5.getRawY();
        r4 = r4 + r5;
        r5 = r0.b;
        r5 = r5.getY();
        r4 = r4 - r5;
        r4 = (double) r4;
        r8 = r0.q;
        r4 = com.google.android.gms.internal.ads.zzdi.m10522a(r4, r8);
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 == 0) goto L_0x010f;
    L_0x0109:
        r4 = java.lang.Long.valueOf(r4);
        r1.f20027q = r4;
    L_0x010f:
        r4 = 0;
        r5 = r0.b;	 Catch:{ zzcy -> 0x019a }
        r5 = r15.mo4261a(r5);	 Catch:{ zzcy -> 0x019a }
        r8 = r5.f17145a;	 Catch:{ zzcy -> 0x019a }
        r1.f20011a = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r5.f17146b;	 Catch:{ zzcy -> 0x019a }
        r1.f20012b = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r5.f17147c;	 Catch:{ zzcy -> 0x019a }
        r1.f20018h = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r0.p;	 Catch:{ zzcy -> 0x019a }
        if (r8 == 0) goto L_0x019a;	 Catch:{ zzcy -> 0x019a }
    L_0x0126:
        r8 = r5.f17149e;	 Catch:{ zzcy -> 0x019a }
        r1.f20013c = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r5.f17148d;	 Catch:{ zzcy -> 0x019a }
        r1.f20015e = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r5.f17150f;	 Catch:{ zzcy -> 0x019a }
        r8 = r8.longValue();	 Catch:{ zzcy -> 0x019a }
        r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ zzcy -> 0x019a }
        if (r12 == 0) goto L_0x013a;	 Catch:{ zzcy -> 0x019a }
    L_0x0138:
        r8 = 1;	 Catch:{ zzcy -> 0x019a }
        goto L_0x013b;	 Catch:{ zzcy -> 0x019a }
    L_0x013a:
        r8 = 0;	 Catch:{ zzcy -> 0x019a }
    L_0x013b:
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ zzcy -> 0x019a }
        r1.f20017g = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r0.e;	 Catch:{ zzcy -> 0x019a }
        r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ zzcy -> 0x019a }
        if (r12 <= 0) goto L_0x017f;	 Catch:{ zzcy -> 0x019a }
    L_0x0147:
        r8 = r0.q;	 Catch:{ zzcy -> 0x019a }
        r8 = com.google.android.gms.internal.ads.zzdi.m10527a(r8);	 Catch:{ zzcy -> 0x019a }
        if (r8 == 0) goto L_0x0165;	 Catch:{ zzcy -> 0x019a }
    L_0x014f:
        r8 = r0.j;	 Catch:{ zzcy -> 0x019a }
        r8 = (double) r8;	 Catch:{ zzcy -> 0x019a }
        r12 = r0.e;	 Catch:{ zzcy -> 0x019a }
        r12 = (double) r12;
        java.lang.Double.isNaN(r8);
        java.lang.Double.isNaN(r12);
        r8 = r8 / r12;
        r8 = java.lang.Math.round(r8);	 Catch:{ zzcy -> 0x019a }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ zzcy -> 0x019a }
        goto L_0x0166;	 Catch:{ zzcy -> 0x019a }
    L_0x0165:
        r8 = r4;	 Catch:{ zzcy -> 0x019a }
    L_0x0166:
        r1.f20014d = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r0.i;	 Catch:{ zzcy -> 0x019a }
        r8 = (double) r8;	 Catch:{ zzcy -> 0x019a }
        r12 = r0.e;	 Catch:{ zzcy -> 0x019a }
        r12 = (double) r12;
        java.lang.Double.isNaN(r8);
        java.lang.Double.isNaN(r12);
        r8 = r8 / r12;
        r8 = java.lang.Math.round(r8);	 Catch:{ zzcy -> 0x019a }
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ zzcy -> 0x019a }
        r1.f20016f = r8;	 Catch:{ zzcy -> 0x019a }
    L_0x017f:
        r8 = r5.f17153i;	 Catch:{ zzcy -> 0x019a }
        r1.f20020j = r8;	 Catch:{ zzcy -> 0x019a }
        r8 = r5.f17154j;	 Catch:{ zzcy -> 0x019a }
        r1.f20019i = r8;	 Catch:{ zzcy -> 0x019a }
        r5 = r5.f17155k;	 Catch:{ zzcy -> 0x019a }
        r8 = r5.longValue();	 Catch:{ zzcy -> 0x019a }
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));	 Catch:{ zzcy -> 0x019a }
        if (r5 == 0) goto L_0x0193;	 Catch:{ zzcy -> 0x019a }
    L_0x0191:
        r5 = 1;	 Catch:{ zzcy -> 0x019a }
        goto L_0x0194;	 Catch:{ zzcy -> 0x019a }
    L_0x0193:
        r5 = 0;	 Catch:{ zzcy -> 0x019a }
    L_0x0194:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ zzcy -> 0x019a }
        r1.f20021k = r5;	 Catch:{ zzcy -> 0x019a }
    L_0x019a:
        r8 = r0.h;
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x01a8;
    L_0x01a0:
        r8 = r0.h;
        r5 = java.lang.Long.valueOf(r8);
        r1.f20022l = r5;
    L_0x01a8:
        r10.f19969K = r1;
        r8 = r0.d;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x01b8;
    L_0x01b0:
        r8 = r0.d;
        r1 = java.lang.Long.valueOf(r8);
        r10.f20008y = r1;
    L_0x01b8:
        r8 = r0.e;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x01c6;
    L_0x01be:
        r8 = r0.e;
        r1 = java.lang.Long.valueOf(r8);
        r10.f20007x = r1;
    L_0x01c6:
        r8 = r0.f;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x01d4;
    L_0x01cc:
        r8 = r0.f;
        r1 = java.lang.Long.valueOf(r8);
        r10.f20006w = r1;
    L_0x01d4:
        r8 = r0.g;
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x01e2;
    L_0x01da:
        r5 = r0.g;
        r1 = java.lang.Long.valueOf(r5);
        r10.f20009z = r1;
    L_0x01e2:
        r1 = r0.c;	 Catch:{ zzcy -> 0x0215 }
        r1 = r1.size();	 Catch:{ zzcy -> 0x0215 }
        r1 = r1 - r3;	 Catch:{ zzcy -> 0x0215 }
        if (r1 <= 0) goto L_0x0217;	 Catch:{ zzcy -> 0x0215 }
    L_0x01eb:
        r3 = new com.google.android.gms.internal.ads.zzbc[r1];	 Catch:{ zzcy -> 0x0215 }
        r10.f19970L = r3;	 Catch:{ zzcy -> 0x0215 }
    L_0x01ef:
        if (r2 >= r1) goto L_0x0217;	 Catch:{ zzcy -> 0x0215 }
    L_0x01f1:
        r3 = a;	 Catch:{ zzcy -> 0x0215 }
        r5 = r0.c;	 Catch:{ zzcy -> 0x0215 }
        r5 = r5.get(r2);	 Catch:{ zzcy -> 0x0215 }
        r5 = (android.view.MotionEvent) r5;	 Catch:{ zzcy -> 0x0215 }
        r6 = r0.q;	 Catch:{ zzcy -> 0x0215 }
        r3 = m26562a(r3, r5, r6);	 Catch:{ zzcy -> 0x0215 }
        r5 = new com.google.android.gms.internal.ads.zzbc;	 Catch:{ zzcy -> 0x0215 }
        r5.<init>();	 Catch:{ zzcy -> 0x0215 }
        r6 = r3.f17145a;	 Catch:{ zzcy -> 0x0215 }
        r5.f20011a = r6;	 Catch:{ zzcy -> 0x0215 }
        r3 = r3.f17146b;	 Catch:{ zzcy -> 0x0215 }
        r5.f20012b = r3;	 Catch:{ zzcy -> 0x0215 }
        r3 = r10.f19970L;	 Catch:{ zzcy -> 0x0215 }
        r3[r2] = r5;	 Catch:{ zzcy -> 0x0215 }
        r2 = r2 + 1;
        goto L_0x01ef;
    L_0x0215:
        r10.f19970L = r4;
    L_0x0217:
        r12 = new java.util.ArrayList;
        r12.<init>();
        r1 = r11.m10510c();
        if (r1 == 0) goto L_0x034e;
    L_0x0222:
        r13 = r11.m10521n();
        r1 = new com.google.android.gms.internal.ads.zzdv;
        r1.<init>(r11, r10);
        r12.add(r1);
        r8 = new com.google.android.gms.internal.ads.zzdy;
        r3 = "OU2zTkMb3xVWxjElhSJNJtcyjBcBIax5KghmsB2DrHu3HRhgp4Bz1cQIIaak8Abf";
        r4 = "0aMkajKGfxJjxUakLLOcj8JypKv0GmCb3d+C/AP1yzc=";
        r7 = 1;
        r1 = r8;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r14 = new com.google.android.gms.internal.ads.zzdt;
        r3 = "teIp99oid1pENGWnU++9yOPCIwtIDIwejcakl+LfK5qHHKbt0MJt+8BqbhD17b1n";
        r4 = "NREPPB/9iy6pGr9Pw6YHALTcoiK6Qv0Fu8JVtmSXvzQ=";
        r6 = f20124v;
        r9 = 25;
        r1 = r14;
        r8 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r8, r9);
        r12.add(r14);
        r8 = new com.google.android.gms.internal.ads.zzds;
        r3 = "55W269KXvkwdzl5sfb0CcKPmBnPIftmJMRWEHFEIHMVBNbB9RYoQD/JeAhpTyftv";
        r4 = "xRFu2EA0XhZqR4z5v1+z5DRPRDh4cLaTVyZWq8w+32M=";
        r7 = 44;
        r1 = r8;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzdx;
        r3 = "tSH6JN0/dsR0FAYjQVtAYWAamOw3jEQmk6Hr8jJN+yrtPJ4ZwRFL84dAlVlDBCND";
        r4 = "QIWClwyA1htDcymLB9H+9tV5qeIhlSOa2TsbKDGB4CU=";
        r7 = 12;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzdz;
        r3 = "M1NS9rNHdzevdCO1BkBQDrEtWalzliBN1oXlHuD/PStxAuVrokFwJ8FTE8R3woq0";
        r4 = "4Nk49DU1yHD/oE1MfAOMbRwhDipAhidA7tdJouMJQrI=";
        r7 = 3;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzdw;
        r3 = "diFehzLUdSyhsDAHjo1jRWbuUSlDLM7ewQWDc6EGa5SkktywcOnUZVN2l852D8v/";
        r4 = "gccLIpNanlTav8umvHfA6CkZesdxV9Cr39ehhj7Z8L8=";
        r7 = 22;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzdr;
        r3 = "5Un4Bxdp8gVIANCZ39+qNPpJwSMKWP26YPuxiQ9CnPTd/FlU4AIzDaH9PI9I+CrN";
        r4 = "4Df+wFSysP9SafTWPUlnClwqa+KS42poxSq2xHfYKTY=";
        r7 = 5;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzeg;
        r3 = "ALF9qjihH/iYAQtvlhVRCPGKYo/wJshkjPnwFlKHSnSRd1pu6U+lD5JnTKlN/8Dh";
        r4 = "hp8obFMJgqHXmaR5pMrBIn7HvqDUI8ERyuIbnl0iT/M=";
        r7 = 48;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzdo;
        r3 = "DdZDLurYd8cqlTxFH9iUg4PWLqXdMHMkdrTyCVNVmPtO8AJJSQ+/YGXoMqGNOXWI";
        r4 = "c760NRjk4Ctk2HA0ROzb7VHBeyDIvOdXhTBmaaREC+Y=";
        r7 = 49;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r8 = new com.google.android.gms.internal.ads.zzed;
        r3 = "HW6DUu9hdQUUJG4hyzA4/jDFe17EFpXdJQ2aqCpScU07e6PXExB1P1rW0uW0StIw";
        r4 = "XCJaUXNSa18os9LIeCcjZdYTv1kZvdxKgQEEsV6JTUc=";
        r7 = 51;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r9 = new com.google.android.gms.internal.ads.zzec;
        r3 = "dUZXsTQGXogdq7xqgYL8i0iimZLTpa9AoXZpRO79MP7o6nVl+DoNjuCg63H0zXDK";
        r4 = "Vz6KZKN/XNSe7DawDVk5XNlgz1HLOOLd+9M1b4lusVA=";
        r7 = 45;
        r1 = new java.lang.Throwable;
        r1.<init>();
        r8 = r1.getStackTrace();
        r1 = r9;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r12.add(r9);
        r9 = new com.google.android.gms.internal.ads.zzeh;
        r3 = "JpT53kCFZ5UGhS3QgNfIxU7Zo+2b3P+3vnYveTkMBHt4zfnotqnDwQTaAD1ryBW9";
        r4 = "SQmHWbTAzPlYuz5I3xZRZNLM/2+IGX009ow9MnjYfrI=";
        r7 = 57;
        r1 = r9;
        r8 = r17;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r12.add(r9);
        r8 = new com.google.android.gms.internal.ads.zzeb;
        r3 = "9KTvYPBd7MH2ciAlBu9OHvde4n0Fwv5nDeizahStujRhSUn5FAOJjVUu69hMaCIH";
        r4 = "kiOoUcTqb+PvEdOeeDwNvvUZgbOHeCWSZHc9NNTPPv4=";
        r7 = 61;
        r1 = r8;
        r1.<init>(r2, r3, r4, r5, r6, r7);
        r12.add(r8);
        r1 = com.google.android.gms.internal.ads.zznw.be;
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r1 = r2.m10897a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x0328;
    L_0x0312:
        r14 = new com.google.android.gms.internal.ads.zzdn;
        r3 = "TxRdKOZ0pZeBXpIwiLITX81ZqIx50eBVN3DINE4ZBUPdk4novnMzQn3dOLT7/176";
        r4 = "m2+gcfdQWoY+6hOETk2mr0SsbjGMFJBzTmSItOYkEfM=";
        r7 = 62;
        r1 = r14;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r8 = r17;
        r9 = r18;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r12.add(r14);
    L_0x0328:
        r1 = com.google.android.gms.internal.ads.zznw.bg;
        r2 = com.google.android.gms.internal.ads.zzkd.m10713e();
        r1 = r2.m10897a(r1);
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 == 0) goto L_0x034e;
    L_0x033a:
        r9 = new com.google.android.gms.internal.ads.zzee;
        r3 = "9MXEPmGC/7986z/wLWv2b+1iRSmCMoPNrO7Sy/hYl1riiNMJKXOd189OeOHpltpa";
        r4 = "DjhY2o1Svq1HpINv7cU+bAqV+OA81bMZ6vkVBk0u3II=";
        r7 = 53;
        r8 = r0.f20129z;
        r1 = r9;
        r2 = r11;
        r5 = r10;
        r6 = r13;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);
        r12.add(r9);
    L_0x034e:
        m26564a(r12);
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzci.a(android.content.Context, android.view.View, android.app.Activity):com.google.android.gms.internal.ads.zzbb");
    }

    /* renamed from: a */
    protected List<Callable<Void>> mo4813a(zzdb zzdb, Context context, zzbb zzbb, zzay zzay) {
        int n = zzdb.m10521n();
        List<Callable<Void>> arrayList = new ArrayList();
        if (zzdb.m10509b()) {
            zzbb zzbb2 = zzbb;
            zzdb zzdb2 = zzdb;
            zzbb zzbb3 = zzbb;
            arrayList.add(new zzdq(zzdb2, "qsalJ2RwJdF4/xIua4a94Fnnrn+PF/pR/qVYX8QPAaTQDa6NRA9etEnbnhQWblFD", "G68A6YJ+VRJhgHK56Kx1RoGHOyqehPG7tlyyPwtcr7Q=", zzbb3, n, 27, context, zzay));
            arrayList.add(new zzdt(zzdb2, "teIp99oid1pENGWnU++9yOPCIwtIDIwejcakl+LfK5qHHKbt0MJt+8BqbhD17b1n", "NREPPB/9iy6pGr9Pw6YHALTcoiK6Qv0Fu8JVtmSXvzQ=", zzbb3, f20124v, n, 25));
            int i = n;
            arrayList.add(new zzdy(zzdb2, "OU2zTkMb3xVWxjElhSJNJtcyjBcBIax5KghmsB2DrHu3HRhgp4Bz1cQIIaak8Abf", "0aMkajKGfxJjxUakLLOcj8JypKv0GmCb3d+C/AP1yzc=", zzbb3, i, 1));
            arrayList.add(new zzea(zzdb2, "2a/4JIVPkDFYMOVDvRgiPhzuBvaMjATDrq7QEolObsd/NV02/K8EoZgGgGExyTEN", "zAquriPjpzqGJfvs/9ulqqLxOML+UEqSlyjOz6Tu5VU=", zzbb3, i, 31));
            arrayList.add(new zzef(zzdb2, "nm3YsDf+7WO+MEOswfwP/mr6SZsOgwQFOzWfB0E01vRE8SnBNpESCxeGx/E3obzH", "ntbFRCAexgxz9p8O68TxIQjW9W7nZKRNbG91vq8F9ro=", zzbb3, i, 33));
            arrayList.add(new zzdp(zzdb2, "1IkHdmwdwv9wD8tmJQC+h66q1PQxvS+V9UrDno8I9cxHFnF0E43buTrJO+G+/gQl", "A9jthiAQc+izVBr4mJNKEZTv7NXyHy0tI8Qg667eCzo=", zzbb3, i, 29, context));
            arrayList.add(new zzdr(zzdb2, "5Un4Bxdp8gVIANCZ39+qNPpJwSMKWP26YPuxiQ9CnPTd/FlU4AIzDaH9PI9I+CrN", "4Df+wFSysP9SafTWPUlnClwqa+KS42poxSq2xHfYKTY=", zzbb3, i, 5));
            arrayList.add(new zzdx(zzdb2, "tSH6JN0/dsR0FAYjQVtAYWAamOw3jEQmk6Hr8jJN+yrtPJ4ZwRFL84dAlVlDBCND", "QIWClwyA1htDcymLB9H+9tV5qeIhlSOa2TsbKDGB4CU=", zzbb3, i, 12));
            arrayList.add(new zzdz(zzdb2, "M1NS9rNHdzevdCO1BkBQDrEtWalzliBN1oXlHuD/PStxAuVrokFwJ8FTE8R3woq0", "4Nk49DU1yHD/oE1MfAOMbRwhDipAhidA7tdJouMJQrI=", zzbb3, i, 3));
            arrayList.add(new zzds(zzdb2, "55W269KXvkwdzl5sfb0CcKPmBnPIftmJMRWEHFEIHMVBNbB9RYoQD/JeAhpTyftv", "xRFu2EA0XhZqR4z5v1+z5DRPRDh4cLaTVyZWq8w+32M=", zzbb3, i, 44));
            arrayList.add(new zzdw(zzdb2, "diFehzLUdSyhsDAHjo1jRWbuUSlDLM7ewQWDc6EGa5SkktywcOnUZVN2l852D8v/", "gccLIpNanlTav8umvHfA6CkZesdxV9Cr39ehhj7Z8L8=", zzbb3, i, 22));
            arrayList.add(new zzeg(zzdb2, "ALF9qjihH/iYAQtvlhVRCPGKYo/wJshkjPnwFlKHSnSRd1pu6U+lD5JnTKlN/8Dh", "hp8obFMJgqHXmaR5pMrBIn7HvqDUI8ERyuIbnl0iT/M=", zzbb3, i, 48));
            arrayList.add(new zzdo(zzdb2, "DdZDLurYd8cqlTxFH9iUg4PWLqXdMHMkdrTyCVNVmPtO8AJJSQ+/YGXoMqGNOXWI", "c760NRjk4Ctk2HA0ROzb7VHBeyDIvOdXhTBmaaREC+Y=", zzbb3, i, 49));
            arrayList.add(new zzed(zzdb2, "HW6DUu9hdQUUJG4hyzA4/jDFe17EFpXdJQ2aqCpScU07e6PXExB1P1rW0uW0StIw", "XCJaUXNSa18os9LIeCcjZdYTv1kZvdxKgQEEsV6JTUc=", zzbb3, i, 51));
            arrayList.add(new zzeb(zzdb2, "9KTvYPBd7MH2ciAlBu9OHvde4n0Fwv5nDeizahStujRhSUn5FAOJjVUu69hMaCIH", "kiOoUcTqb+PvEdOeeDwNvvUZgbOHeCWSZHc9NNTPPv4=", zzbb3, i, 61));
            return arrayList;
        }
        zzbb.f19994k = Long.valueOf(16384);
        return arrayList;
    }

    /* renamed from: a */
    private static void m26564a(List<Callable<Void>> list) {
        if (a != null) {
            ExecutorService c = a.m10510c();
            if (!(c == null || list.isEmpty())) {
                try {
                    c.invokeAll(list, ((Long) zzkd.m10713e().m10897a(zznw.bd)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable e) {
                    Log.d(f20122t, String.format("class methods got exception: %s", new Object[]{zzdi.m10525a(e)}));
                }
            }
        }
    }

    /* renamed from: a */
    protected final zzdh mo4261a(MotionEvent motionEvent) {
        Method a = a.m10505a("BDp2p9FkJRWhLjM5/HGlBtfI2hTpjdS5yJQGMqe31LtNjFTgL+0QOyyChfmPPFl0", "got2az0DwXyMWaLpfVutWfEF1l3X50FJhmqzREDcTA8=");
        if (a == null || motionEvent == null) {
            throw new zzcy();
        }
        try {
            return new zzdh((String) a.invoke(null, new Object[]{motionEvent, this.q}));
        } catch (MotionEvent motionEvent2) {
            throw new zzcy(motionEvent2);
        }
    }

    /* renamed from: a */
    protected final long mo4258a(StackTraceElement[] stackTraceElementArr) {
        Method a = a.m10505a("dUZXsTQGXogdq7xqgYL8i0iimZLTpa9AoXZpRO79MP7o6nVl+DoNjuCg63H0zXDK", "Vz6KZKN/XNSe7DawDVk5XNlgz1HLOOLd+9M1b4lusVA=");
        if (a == null || stackTraceElementArr == null) {
            throw new zzcy();
        }
        try {
            return new zzcz((String) a.invoke(null, new Object[]{stackTraceElementArr})).f17140a.longValue();
        } catch (StackTraceElement[] stackTraceElementArr2) {
            throw new zzcy(stackTraceElementArr2);
        }
    }

    public final void zzb(View view) {
        if (!((Boolean) zzkd.m10713e().m10897a(zznw.bg)).booleanValue()) {
            return;
        }
        if (this.f20129z == null) {
            this.f20129z = new zzdk(a, view);
        } else {
            this.f20129z.m10536a(view);
        }
    }
}
