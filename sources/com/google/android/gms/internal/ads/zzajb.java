package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

@zzaer
public final class zzajb extends zzalc implements zzaja {
    /* renamed from: a */
    private final zzakn f19872a;
    /* renamed from: b */
    private final Context f19873b;
    /* renamed from: c */
    private final ArrayList<zzair> f19874c;
    /* renamed from: d */
    private final List<zzaiu> f19875d;
    /* renamed from: e */
    private final HashSet<String> f19876e;
    /* renamed from: f */
    private final Object f19877f;
    /* renamed from: g */
    private final zzahr f19878g;
    /* renamed from: h */
    private final long f19879h;

    public zzajb(Context context, zzakn zzakn, zzahr zzahr) {
        Context context2 = context;
        zzakn zzakn2 = zzakn;
        zzahr zzahr2 = zzahr;
        this(context2, zzakn2, zzahr2, ((Long) zzkd.m10713e().m10897a(zznw.aq)).longValue());
    }

    /* renamed from: a */
    public final void mo4174a(String str, int i) {
    }

    public final void m_() {
    }

    @VisibleForTesting
    private zzajb(Context context, zzakn zzakn, zzahr zzahr, long j) {
        this.f19874c = new ArrayList();
        this.f19875d = new ArrayList();
        this.f19876e = new HashSet();
        this.f19877f = new Object();
        this.f19873b = context;
        this.f19872a = zzakn;
        this.f19878g = zzahr;
        this.f19879h = j;
    }

    /* renamed from: a */
    public final void mo4075a() {
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
        r19 = this;
        r11 = r19;
        r0 = r11.f19872a;
        r0 = r0.f8808c;
        r0 = r0.f9857a;
        r12 = r0.iterator();
    L_0x000c:
        r0 = r12.hasNext();
        if (r0 == 0) goto L_0x00c1;
    L_0x0012:
        r0 = r12.next();
        r13 = r0;
        r13 = (com.google.android.gms.internal.ads.zzxx) r13;
        r14 = r13.f9846k;
        r0 = r13.f9838c;
        r15 = r0.iterator();
    L_0x0021:
        r0 = r15.hasNext();
        if (r0 == 0) goto L_0x000c;
    L_0x0027:
        r0 = r15.next();
        r0 = (java.lang.String) r0;
        r1 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x0040;
    L_0x0035:
        r1 = "com.google.ads.mediation.customevent.CustomEventAdapter";
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x003e;
    L_0x003d:
        goto L_0x0040;
    L_0x003e:
        r3 = r0;
        goto L_0x004c;
    L_0x0040:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00b9 }
        r0.<init>(r14);	 Catch:{ JSONException -> 0x00b9 }
        r1 = "class_name";	 Catch:{ JSONException -> 0x00b9 }
        r0 = r0.getString(r1);	 Catch:{ JSONException -> 0x00b9 }
        goto L_0x003e;
    L_0x004c:
        r9 = r11.f19877f;
        monitor-enter(r9);
        r0 = r11.f19878g;	 Catch:{ all -> 0x00b2 }
        r7 = r0.m9562a(r3);	 Catch:{ all -> 0x00b2 }
        if (r7 == 0) goto L_0x008a;	 Catch:{ all -> 0x00b2 }
    L_0x0057:
        r0 = r7.m9627b();	 Catch:{ all -> 0x00b2 }
        if (r0 == 0) goto L_0x008a;	 Catch:{ all -> 0x00b2 }
    L_0x005d:
        r0 = r7.m9626a();	 Catch:{ all -> 0x00b2 }
        if (r0 != 0) goto L_0x0064;	 Catch:{ all -> 0x00b2 }
    L_0x0063:
        goto L_0x008a;	 Catch:{ all -> 0x00b2 }
    L_0x0064:
        r0 = new com.google.android.gms.internal.ads.zzair;	 Catch:{ all -> 0x00b2 }
        r2 = r11.f19873b;	 Catch:{ all -> 0x00b2 }
        r6 = r11.f19872a;	 Catch:{ all -> 0x00b2 }
        r4 = r11.f19879h;	 Catch:{ all -> 0x00b2 }
        r1 = r0;
        r16 = r4;
        r4 = r14;
        r5 = r13;
        r8 = r19;
        r18 = r9;
        r9 = r16;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x00b7 }
        r1 = r11.f19878g;	 Catch:{ all -> 0x00b7 }
        r1 = r1.m9561a();	 Catch:{ all -> 0x00b7 }
        r0.m26239a(r1);	 Catch:{ all -> 0x00b7 }
        r1 = r11.f19874c;	 Catch:{ all -> 0x00b7 }
        r1.add(r0);	 Catch:{ all -> 0x00b7 }
        monitor-exit(r18);	 Catch:{ all -> 0x00b7 }
        goto L_0x0021;	 Catch:{ all -> 0x00b7 }
    L_0x008a:
        r18 = r9;	 Catch:{ all -> 0x00b7 }
        r0 = r11.f19875d;	 Catch:{ all -> 0x00b7 }
        r1 = new com.google.android.gms.internal.ads.zzaiw;	 Catch:{ all -> 0x00b7 }
        r1.<init>();	 Catch:{ all -> 0x00b7 }
        r2 = r13.f9839d;	 Catch:{ all -> 0x00b7 }
        r1 = r1.m9615b(r2);	 Catch:{ all -> 0x00b7 }
        r1 = r1.m9614a(r3);	 Catch:{ all -> 0x00b7 }
        r2 = 0;	 Catch:{ all -> 0x00b7 }
        r1 = r1.m9613a(r2);	 Catch:{ all -> 0x00b7 }
        r2 = 7;	 Catch:{ all -> 0x00b7 }
        r1 = r1.m9612a(r2);	 Catch:{ all -> 0x00b7 }
        r1 = r1.m9611a();	 Catch:{ all -> 0x00b7 }
        r0.add(r1);	 Catch:{ all -> 0x00b7 }
        monitor-exit(r18);	 Catch:{ all -> 0x00b7 }
        goto L_0x0021;	 Catch:{ all -> 0x00b7 }
    L_0x00b2:
        r0 = move-exception;	 Catch:{ all -> 0x00b7 }
        r18 = r9;	 Catch:{ all -> 0x00b7 }
    L_0x00b5:
        monitor-exit(r18);	 Catch:{ all -> 0x00b7 }
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        goto L_0x00b5;
    L_0x00b9:
        r0 = move-exception;
        r1 = "Unable to determine custom event class name, skipping...";
        com.google.android.gms.internal.ads.zzaok.m10002b(r1, r0);
        goto L_0x0021;
    L_0x00c1:
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = r11.f19874c;
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
        r3 = 0;
        r4 = 0;
    L_0x00d0:
        if (r4 >= r2) goto L_0x00e6;
    L_0x00d2:
        r5 = r1.get(r4);
        r4 = r4 + 1;
        r5 = (com.google.android.gms.internal.ads.zzair) r5;
        r6 = r5.f19854a;
        r6 = r0.add(r6);
        if (r6 == 0) goto L_0x00d0;
    L_0x00e2:
        r5.m26242d();
        goto L_0x00d0;
    L_0x00e6:
        r0 = r11.f19874c;
        r1 = r0;
        r1 = (java.util.ArrayList) r1;
        r2 = r1.size();
    L_0x00ef:
        if (r3 >= r2) goto L_0x019c;
    L_0x00f1:
        r0 = r1.get(r3);
        r3 = r3 + 1;
        r4 = r0;
        r4 = (com.google.android.gms.internal.ads.zzair) r4;
        r0 = r4.m26242d();	 Catch:{ InterruptedException -> 0x0163, Exception -> 0x0144 }
        r0.get();	 Catch:{ InterruptedException -> 0x0163, Exception -> 0x0144 }
        r5 = r11.f19877f;
        monitor-enter(r5);
        r0 = r4.f19854a;	 Catch:{ all -> 0x013f }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x013f }
        if (r0 != 0) goto L_0x0115;	 Catch:{ all -> 0x013f }
    L_0x010c:
        r0 = r11.f19875d;	 Catch:{ all -> 0x013f }
        r6 = r4.m26243e();	 Catch:{ all -> 0x013f }
        r0.add(r6);	 Catch:{ all -> 0x013f }
    L_0x0115:
        monitor-exit(r5);	 Catch:{ all -> 0x013f }
        r6 = r11.f19877f;
        monitor-enter(r6);
        r0 = r11.f19876e;	 Catch:{ all -> 0x013c }
        r5 = r4.f19854a;	 Catch:{ all -> 0x013c }
        r0 = r0.contains(r5);	 Catch:{ all -> 0x013c }
        if (r0 == 0) goto L_0x013a;	 Catch:{ all -> 0x013c }
    L_0x0123:
        r0 = r4.f19854a;	 Catch:{ all -> 0x013c }
        r1 = r4.m26244f();	 Catch:{ all -> 0x013c }
        r2 = -2;	 Catch:{ all -> 0x013c }
        r0 = r11.m26261a(r2, r0, r1);	 Catch:{ all -> 0x013c }
        r1 = com.google.android.gms.internal.ads.zzaoa.f8948a;	 Catch:{ all -> 0x013c }
        r2 = new com.google.android.gms.internal.ads.cg;	 Catch:{ all -> 0x013c }
        r2.<init>(r11, r0);	 Catch:{ all -> 0x013c }
        r1.post(r2);	 Catch:{ all -> 0x013c }
        monitor-exit(r6);	 Catch:{ all -> 0x013c }
        return;	 Catch:{ all -> 0x013c }
    L_0x013a:
        monitor-exit(r6);	 Catch:{ all -> 0x013c }
        goto L_0x00ef;	 Catch:{ all -> 0x013c }
    L_0x013c:
        r0 = move-exception;	 Catch:{ all -> 0x013c }
        monitor-exit(r6);	 Catch:{ all -> 0x013c }
        throw r0;
    L_0x013f:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x013f }
        throw r0;
    L_0x0142:
        r0 = move-exception;
        goto L_0x0183;
    L_0x0144:
        r0 = move-exception;
        r5 = "Unable to resolve rewarded adapter.";	 Catch:{ all -> 0x0142 }
        com.google.android.gms.internal.ads.zzaok.m10004c(r5, r0);	 Catch:{ all -> 0x0142 }
        r5 = r11.f19877f;
        monitor-enter(r5);
        r0 = r4.f19854a;	 Catch:{ all -> 0x0160 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0160 }
        if (r0 != 0) goto L_0x015e;	 Catch:{ all -> 0x0160 }
    L_0x0155:
        r0 = r11.f19875d;	 Catch:{ all -> 0x0160 }
        r4 = r4.m26243e();	 Catch:{ all -> 0x0160 }
        r0.add(r4);	 Catch:{ all -> 0x0160 }
    L_0x015e:
        monitor-exit(r5);	 Catch:{ all -> 0x0160 }
        goto L_0x00ef;	 Catch:{ all -> 0x0160 }
    L_0x0160:
        r0 = move-exception;	 Catch:{ all -> 0x0160 }
        monitor-exit(r5);	 Catch:{ all -> 0x0160 }
        throw r0;
    L_0x0163:
        r0 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0142 }
        r0.interrupt();	 Catch:{ all -> 0x0142 }
        r1 = r11.f19877f;
        monitor-enter(r1);
        r0 = r4.f19854a;	 Catch:{ all -> 0x0180 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ all -> 0x0180 }
        if (r0 != 0) goto L_0x017e;	 Catch:{ all -> 0x0180 }
    L_0x0175:
        r0 = r11.f19875d;	 Catch:{ all -> 0x0180 }
        r2 = r4.m26243e();	 Catch:{ all -> 0x0180 }
        r0.add(r2);	 Catch:{ all -> 0x0180 }
    L_0x017e:
        monitor-exit(r1);	 Catch:{ all -> 0x0180 }
        goto L_0x019c;	 Catch:{ all -> 0x0180 }
    L_0x0180:
        r0 = move-exception;	 Catch:{ all -> 0x0180 }
        monitor-exit(r1);	 Catch:{ all -> 0x0180 }
        throw r0;
    L_0x0183:
        r1 = r11.f19877f;
        monitor-enter(r1);
        r2 = r4.f19854a;	 Catch:{ all -> 0x0199 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ all -> 0x0199 }
        if (r2 != 0) goto L_0x0197;	 Catch:{ all -> 0x0199 }
    L_0x018e:
        r2 = r11.f19875d;	 Catch:{ all -> 0x0199 }
        r3 = r4.m26243e();	 Catch:{ all -> 0x0199 }
        r2.add(r3);	 Catch:{ all -> 0x0199 }
    L_0x0197:
        monitor-exit(r1);	 Catch:{ all -> 0x0199 }
        throw r0;
    L_0x0199:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0199 }
        throw r0;
    L_0x019c:
        r0 = 3;
        r1 = 0;
        r0 = r11.m26261a(r0, r1, r1);
        r1 = com.google.android.gms.internal.ads.zzaoa.f8948a;
        r2 = new com.google.android.gms.internal.ads.ch;
        r2.<init>(r11, r0);
        r1.post(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajb.a():void");
    }

    /* renamed from: a */
    public final void mo4173a(String str) {
        synchronized (this.f19877f) {
            this.f19876e.add(str);
        }
    }

    /* renamed from: a */
    private final zzakm m26261a(int i, String str, zzxx zzxx) {
        String stringBuilder;
        zzjo zzjo;
        boolean z;
        String str2;
        long j;
        zzjk zzjk = this.f19872a.f8806a.f19735c;
        List list = this.f19872a.f8807b.f19788c;
        List list2 = this.f19872a.f8807b.f19790e;
        List list3 = this.f19872a.f8807b.f19794i;
        int i2 = this.f19872a.f8807b.f19796k;
        long j2 = this.f19872a.f8807b.f19795j;
        String str3 = this.f19872a.f8806a.f19741i;
        boolean z2 = this.f19872a.f8807b.f19792g;
        zzxy zzxy = this.f19872a.f8808c;
        long j3 = this.f19872a.f8807b.f19793h;
        zzjo zzjo2 = this.f19872a.f8809d;
        long j4 = j3;
        zzxy zzxy2 = zzxy;
        long j5 = this.f19872a.f8807b.f19791f;
        long j6 = this.f19872a.f8811f;
        long j7 = this.f19872a.f8807b.f19798m;
        String str4 = this.f19872a.f8807b.f19799n;
        JSONObject jSONObject = this.f19872a.f8813h;
        zzajk zzajk = this.f19872a.f8807b.f19760A;
        JSONObject jSONObject2 = jSONObject;
        List list4 = this.f19872a.f8807b.f19761B;
        List list5 = this.f19872a.f8807b.f19762C;
        boolean z3 = this.f19872a.f8807b.f19763D;
        zzafv zzafv = this.f19872a.f8807b.f19764E;
        zzajk zzajk2 = zzajk;
        StringBuilder stringBuilder2 = new StringBuilder("");
        if (this.f19875d == null) {
            stringBuilder = stringBuilder2.toString();
            zzjo = zzjo2;
            z = z2;
            str2 = str4;
            j = j7;
        } else {
            Iterator it = r0.f19875d.iterator();
            while (true) {
                zzjo = zzjo2;
                if (it.hasNext()) {
                    zzaiu zzaiu = (zzaiu) it.next();
                    if (zzaiu != null) {
                        Iterator it2 = it;
                        if (TextUtils.isEmpty(zzaiu.f8734a)) {
                            zzjo2 = zzjo;
                            it = it2;
                        } else {
                            int i3;
                            String str5 = zzaiu.f8734a;
                            str2 = str4;
                            switch (zzaiu.f8735b) {
                                case 3:
                                    j = j7;
                                    i3 = 1;
                                    break;
                                case 4:
                                    j = j7;
                                    i3 = 2;
                                    break;
                                case 5:
                                    j = j7;
                                    i3 = 4;
                                    break;
                                case 6:
                                    j = j7;
                                    i3 = 0;
                                    break;
                                case 7:
                                    j = j7;
                                    i3 = 3;
                                    break;
                                default:
                                    j = j7;
                                    i3 = 6;
                                    break;
                            }
                            j7 = zzaiu.f8736c;
                            z = z2;
                            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str5).length() + 33);
                            stringBuilder3.append(str5);
                            stringBuilder3.append(".");
                            stringBuilder3.append(i3);
                            stringBuilder3.append(".");
                            stringBuilder3.append(j7);
                            stringBuilder2.append(String.valueOf(stringBuilder3.toString()).concat("_"));
                            zzjo2 = zzjo;
                            it = it2;
                            str4 = str2;
                            j7 = j;
                            z2 = z;
                        }
                    } else {
                        zzjo2 = zzjo;
                    }
                } else {
                    z = z2;
                    str2 = str4;
                    j = j7;
                    stringBuilder = stringBuilder2.substring(0, Math.max(0, stringBuilder2.length() - 1));
                }
            }
        }
        return new zzakm(zzjk, null, list, i, list2, list3, i2, j2, str3, z, zzxx, null, str, zzxy2, null, j4, zzjo, j5, j6, j, str2, jSONObject2, null, zzajk2, list4, list5, z3, zzafv, stringBuilder, r0.f19872a.f8807b.f19767H, r0.f19872a.f8807b.f19771L, r0.f19872a.f8814i, r0.f19872a.f8807b.f19774O, r0.f19872a.f8815j, r0.f19872a.f8807b.f19776Q, r0.f19872a.f8807b.f19777R, r0.f19872a.f8807b.f19778S, r0.f19872a.f8807b.f19779T, r0.f19872a.f8807b.f19781V);
    }

    /* renamed from: a */
    final /* synthetic */ void m26263a(zzakm zzakm) {
        this.f19878g.m9566b().zzb(zzakm);
    }

    /* renamed from: b */
    final /* synthetic */ void m26266b(zzakm zzakm) {
        this.f19878g.m9566b().zzb(zzakm);
    }
}
