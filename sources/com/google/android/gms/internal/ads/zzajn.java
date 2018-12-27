package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzajn implements zzajy {
    /* renamed from: a */
    private static List<Future<Void>> f16820a = Collections.synchronizedList(new ArrayList());
    /* renamed from: b */
    private static ScheduledExecutorService f16821b = Executors.newSingleThreadScheduledExecutor();
    @GuardedBy("mLock")
    /* renamed from: c */
    private final zzbhn f16822c;
    @GuardedBy("mLock")
    /* renamed from: d */
    private final LinkedHashMap<String, zzbht> f16823d;
    @GuardedBy("mLock")
    /* renamed from: e */
    private final List<String> f16824e = new ArrayList();
    @GuardedBy("mLock")
    /* renamed from: f */
    private final List<String> f16825f = new ArrayList();
    /* renamed from: g */
    private final Context f16826g;
    /* renamed from: h */
    private final zzaka f16827h;
    /* renamed from: i */
    private boolean f16828i;
    /* renamed from: j */
    private final zzajv f16829j;
    /* renamed from: k */
    private final cn f16830k;
    /* renamed from: l */
    private final Object f16831l = new Object();
    /* renamed from: m */
    private HashSet<String> f16832m = new HashSet();
    /* renamed from: n */
    private boolean f16833n = false;
    /* renamed from: o */
    private boolean f16834o = false;
    /* renamed from: p */
    private boolean f16835p = false;

    public zzajn(Context context, zzaop zzaop, zzajv zzajv, String str, zzaka zzaka) {
        Preconditions.checkNotNull(zzajv, "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f16826g = context;
        this.f16823d = new LinkedHashMap();
        this.f16827h = zzaka;
        this.f16829j = zzajv;
        for (String toLowerCase : this.f16829j.f19886e) {
            this.f16832m.add(toLowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f16832m.remove("cookie".toLowerCase(Locale.ENGLISH));
        context = new zzbhn();
        context.f20068a = Integer.valueOf(8);
        context.f20069b = str;
        context.f20070c = str;
        context.f20071d = new zzbho();
        context.f20071d.f20086a = this.f16829j.f19882a;
        zzajv = new zzbhu();
        zzajv.f20114a = zzaop.f19893a;
        zzajv.f20116c = Boolean.valueOf(Wrappers.packageManager(this.f16826g).isCallerInstantApp());
        str = (long) GoogleApiAvailabilityLight.getInstance().getApkVersion(this.f16826g);
        if (str > 0) {
            zzajv.f20115b = Long.valueOf(str);
        }
        context.f20075h = zzajv;
        this.f16822c = context;
        this.f16830k = new cn(this.f16826g, this.f16829j.f19889h, this);
    }

    /* renamed from: a */
    public final zzajv mo2319a() {
        return this.f16829j;
    }

    /* renamed from: a */
    public final void mo2321a(String str) {
        synchronized (this.f16831l) {
            this.f16822c.f20073f = str;
        }
    }

    /* renamed from: b */
    public final boolean mo2324b() {
        return PlatformVersion.isAtLeastKitKat() && this.f16829j.f19884c && !this.f16834o;
    }

    /* renamed from: a */
    public final void mo2320a(View view) {
        if (this.f16829j.f19884c && !this.f16834o) {
            zzbv.zzek();
            view = zzalo.m9804b(view);
            if (view == null) {
                zzajx.m9640a("Failed to capture the webview bitmap.");
                return;
            }
            this.f16834o = true;
            zzalo.m9794a(new ck(this, view));
        }
    }

    /* renamed from: a */
    public final void mo2322a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
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
        r6 = this;
        r0 = r6.f16831l;
        monitor-enter(r0);
        r1 = 3;
        if (r9 != r1) goto L_0x000d;
    L_0x0006:
        r2 = 1;
        r6.f16835p = r2;	 Catch:{ all -> 0x000a }
        goto L_0x000d;	 Catch:{ all -> 0x000a }
    L_0x000a:
        r7 = move-exception;	 Catch:{ all -> 0x000a }
        goto L_0x00ca;	 Catch:{ all -> 0x000a }
    L_0x000d:
        r2 = r6.f16823d;	 Catch:{ all -> 0x000a }
        r2 = r2.containsKey(r7);	 Catch:{ all -> 0x000a }
        if (r2 == 0) goto L_0x0027;	 Catch:{ all -> 0x000a }
    L_0x0015:
        if (r9 != r1) goto L_0x0025;	 Catch:{ all -> 0x000a }
    L_0x0017:
        r8 = r6.f16823d;	 Catch:{ all -> 0x000a }
        r7 = r8.get(r7);	 Catch:{ all -> 0x000a }
        r7 = (com.google.android.gms.internal.ads.zzbht) r7;	 Catch:{ all -> 0x000a }
        r8 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r7.f20108d = r8;	 Catch:{ all -> 0x000a }
    L_0x0025:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;	 Catch:{ all -> 0x000a }
    L_0x0027:
        r1 = new com.google.android.gms.internal.ads.zzbht;	 Catch:{ all -> 0x000a }
        r1.<init>();	 Catch:{ all -> 0x000a }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r1.f20108d = r9;	 Catch:{ all -> 0x000a }
        r9 = r6.f16823d;	 Catch:{ all -> 0x000a }
        r9 = r9.size();	 Catch:{ all -> 0x000a }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x000a }
        r1.f20105a = r9;	 Catch:{ all -> 0x000a }
        r1.f20106b = r7;	 Catch:{ all -> 0x000a }
        r9 = new com.google.android.gms.internal.ads.zzbhq;	 Catch:{ all -> 0x000a }
        r9.<init>();	 Catch:{ all -> 0x000a }
        r1.f20107c = r9;	 Catch:{ all -> 0x000a }
        r9 = r6.f16832m;	 Catch:{ all -> 0x000a }
        r9 = r9.size();	 Catch:{ all -> 0x000a }
        if (r9 <= 0) goto L_0x00c3;	 Catch:{ all -> 0x000a }
    L_0x004f:
        if (r8 == 0) goto L_0x00c3;	 Catch:{ all -> 0x000a }
    L_0x0051:
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x000a }
        r9.<init>();	 Catch:{ all -> 0x000a }
        r8 = r8.entrySet();	 Catch:{ all -> 0x000a }
        r8 = r8.iterator();	 Catch:{ all -> 0x000a }
    L_0x005e:
        r2 = r8.hasNext();	 Catch:{ all -> 0x000a }
        if (r2 == 0) goto L_0x00b6;	 Catch:{ all -> 0x000a }
    L_0x0064:
        r2 = r8.next();	 Catch:{ all -> 0x000a }
        r2 = (java.util.Map.Entry) r2;	 Catch:{ all -> 0x000a }
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r3 == 0) goto L_0x0077;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0070:
        r3 = r2.getKey();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = (java.lang.String) r3;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x0079;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0077:
        r3 = "";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0079:
        r4 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r4 == 0) goto L_0x0086;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x007f:
        r2 = r2.getValue();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r2 = (java.lang.String) r2;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x0088;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0086:
        r2 = "";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0088:
        r4 = java.util.Locale.ENGLISH;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4 = r3.toLowerCase(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r5 = r6.f16832m;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4 = r5.contains(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        if (r4 != 0) goto L_0x0097;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0096:
        goto L_0x005e;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
    L_0x0097:
        r4 = new com.google.android.gms.internal.ads.zzbhp;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.<init>();	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r5 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = r3.getBytes(r5);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.f20088a = r3;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r3 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r2 = r2.getBytes(r3);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r4.f20089b = r2;	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        r9.add(r4);	 Catch:{ UnsupportedEncodingException -> 0x00b0 }
        goto L_0x005e;
    L_0x00b0:
        r2 = "Cannot convert string to bytes, skip header.";	 Catch:{ all -> 0x000a }
        com.google.android.gms.internal.ads.zzajx.m9640a(r2);	 Catch:{ all -> 0x000a }
        goto L_0x005e;	 Catch:{ all -> 0x000a }
    L_0x00b6:
        r8 = r9.size();	 Catch:{ all -> 0x000a }
        r8 = new com.google.android.gms.internal.ads.zzbhp[r8];	 Catch:{ all -> 0x000a }
        r9.toArray(r8);	 Catch:{ all -> 0x000a }
        r9 = r1.f20107c;	 Catch:{ all -> 0x000a }
        r9.f20090a = r8;	 Catch:{ all -> 0x000a }
    L_0x00c3:
        r8 = r6.f16823d;	 Catch:{ all -> 0x000a }
        r8.put(r7, r1);	 Catch:{ all -> 0x000a }
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        return;	 Catch:{ all -> 0x000a }
    L_0x00ca:
        monitor-exit(r0);	 Catch:{ all -> 0x000a }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajn.a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: b */
    final void m21197b(String str) {
        synchronized (this.f16831l) {
            this.f16824e.add(str);
        }
    }

    /* renamed from: c */
    final void m21200c(String str) {
        synchronized (this.f16831l) {
            this.f16825f.add(str);
        }
    }

    /* renamed from: a */
    public final String[] mo2323a(String[] strArr) {
        return (String[]) this.f16830k.m8907a(strArr).toArray(new String[0]);
    }

    /* renamed from: c */
    public final void mo2325c() {
        this.f16833n = true;
    }

    /* renamed from: e */
    private final zzbht m21188e(String str) {
        zzbht zzbht;
        synchronized (this.f16831l) {
            zzbht = (zzbht) this.f16823d.get(str);
        }
        return zzbht;
    }

    /* renamed from: d */
    public final void mo2326d() {
        synchronized (this.f16831l) {
            zzapi a = zzaox.m10021a(this.f16827h.mo2328a(this.f16826g, this.f16823d.keySet()), new ci(this), zzapn.f8962b);
            zzapi a2 = zzaox.m10020a(a, 10, TimeUnit.SECONDS, f16821b);
            zzaox.m10026a(a, new cl(this, a2), zzapn.f8962b);
            f16820a.add(a2);
        }
    }

    /* renamed from: f */
    private final zzapi<Void> m21190f() {
        int i = 0;
        Object obj = (!(this.f16828i && this.f16829j.f19888g) && (!(this.f16835p && this.f16829j.f19887f) && (this.f16828i || !this.f16829j.f19885d))) ? null : 1;
        if (obj == null) {
            return zzaox.m10019a(null);
        }
        zzapi<Void> a;
        synchronized (this.f16831l) {
            this.f16822c.f20072e = new zzbht[this.f16823d.size()];
            this.f16823d.values().toArray(this.f16822c.f20072e);
            this.f16822c.f20076i = (String[]) this.f16824e.toArray(new String[0]);
            this.f16822c.f20077j = (String[]) this.f16825f.toArray(new String[0]);
            if (zzajx.m9641a()) {
                String str = this.f16822c.f20069b;
                String str2 = this.f16822c.f20073f;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 53) + String.valueOf(str2).length());
                stringBuilder.append("Sending SB report\n  url: ");
                stringBuilder.append(str);
                stringBuilder.append("\n  clickUrl: ");
                stringBuilder.append(str2);
                stringBuilder.append("\n  resources: \n");
                StringBuilder stringBuilder2 = new StringBuilder(stringBuilder.toString());
                zzbht[] zzbhtArr = this.f16822c.f20072e;
                int length = zzbhtArr.length;
                while (i < length) {
                    zzbht zzbht = zzbhtArr[i];
                    stringBuilder2.append("    [");
                    stringBuilder2.append(zzbht.f20109e.length);
                    stringBuilder2.append("] ");
                    stringBuilder2.append(zzbht.f20106b);
                    i++;
                }
                zzajx.m9640a(stringBuilder2.toString());
            }
            zzapi a2 = new zzamz(this.f16826g).m9918a(1, this.f16829j.f19883b, null, zzbgz.m10450a(this.f16822c));
            if (zzajx.m9641a()) {
                a2.mo1947a(new cm(this), zzalm.f8869a);
            }
            a = zzaox.m10022a(a2, cj.f16449a, zzapn.f8962b);
        }
        return a;
    }

    /* renamed from: a */
    final /* synthetic */ zzapi m21192a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    String str2;
                    JSONArray optJSONArray = new JSONObject((String) map.get(str2)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f16831l) {
                            int length = optJSONArray.length();
                            zzbht e = m21188e(str2);
                            if (e == null) {
                                String str3 = "Cannot find the corresponding resource object for ";
                                str2 = String.valueOf(str2);
                                zzajx.m9640a(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                            } else {
                                e.f20109e = new String[length];
                                int i = 0;
                                for (int i2 = 0; i2 < length; i2++) {
                                    e.f20109e[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                boolean z = this.f16828i;
                                if (length > 0) {
                                    i = 1;
                                }
                                this.f16828i = i | z;
                            }
                        }
                    }
                }
            } catch (Map map2) {
                r0 = "Failed to get SafeBrowsing metadata";
                if (((Boolean) zzkd.m10713e().m10897a(zznw.bT)).booleanValue()) {
                    String str4;
                    zzaok.m9999a(str4, map2);
                }
                return zzaox.m10018a(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f16828i != null) {
            synchronized (this.f16831l) {
                this.f16822c.f20068a = Integer.valueOf(9);
            }
        }
        return m21190f();
    }
}
