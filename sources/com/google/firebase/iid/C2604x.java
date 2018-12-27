package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.content.C0389b;
import android.support.v4.p017f.C3131a;
import android.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: com.google.firebase.iid.x */
final class C2604x {
    /* renamed from: a */
    private final SharedPreferences f11063a;
    /* renamed from: b */
    private final Context f11064b;
    /* renamed from: c */
    private final ax f11065c;
    /* renamed from: d */
    private final Map<String, ay> f11066d;

    public C2604x(Context context) {
        this(context, new ax());
    }

    private C2604x(Context context, ax axVar) {
        this.f11066d = new C3131a();
        this.f11064b = context;
        this.f11063a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f11065c = axVar;
        File file = new File(C0389b.m1437b(this.f11064b), "com.google.android.gms.appid-no-backup");
        if (file.exists() == null) {
            try {
                if (file.createNewFile() != null && m12783c() == null) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    m12789b();
                    FirebaseInstanceId.m12658a().m12682h();
                }
            } catch (Context context2) {
                if (Log.isLoggable("FirebaseInstanceId", 3) != null) {
                    axVar = "FirebaseInstanceId";
                    String str = "Error creating file in no backup dir: ";
                    context2 = String.valueOf(context2.getMessage());
                    Log.d(axVar, context2.length() != 0 ? str.concat(context2) : new String(str));
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized String m12785a() {
        return this.f11063a.getString("topic_operaion_queue", "");
    }

    /* renamed from: a */
    public final synchronized void m12786a(String str) {
        this.f11063a.edit().putString("topic_operaion_queue", str).apply();
    }

    /* renamed from: c */
    private final synchronized boolean m12783c() {
        return this.f11063a.getAll().isEmpty();
    }

    /* renamed from: b */
    private static String m12782b(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append("|T|");
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m12781a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("|S|");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final synchronized void m12789b() {
        this.f11066d.clear();
        ax.m12710a(this.f11064b);
        this.f11063a.edit().clear().commit();
    }

    /* renamed from: a */
    public final synchronized C2605y m12784a(String str, String str2, String str3) {
        return C2605y.m12791a(this.f11063a.getString(C2604x.m12782b(str, str2, str3), null));
    }

    /* renamed from: a */
    public final synchronized void m12787a(String str, String str2, String str3, String str4, String str5) {
        str4 = C2605y.m12793a(str4, str5, System.currentTimeMillis());
        if (str4 != null) {
            str5 = this.f11063a.edit();
            str5.putString(C2604x.m12782b(str, str2, str3), str4);
            str5.commit();
        }
    }

    /* renamed from: b */
    public final synchronized com.google.firebase.iid.ay m12788b(java.lang.String r3) {
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
        monitor-enter(r2);
        r0 = r2.f11066d;	 Catch:{ all -> 0x0033 }
        r0 = r0.get(r3);	 Catch:{ all -> 0x0033 }
        r0 = (com.google.firebase.iid.ay) r0;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r2);
        return r0;
    L_0x000d:
        r0 = r2.f11065c;	 Catch:{ zzaa -> 0x0016 }
        r1 = r2.f11064b;	 Catch:{ zzaa -> 0x0016 }
        r0 = r0.m12720a(r1, r3);	 Catch:{ zzaa -> 0x0016 }
        goto L_0x002c;
    L_0x0016:
        r0 = "FirebaseInstanceId";	 Catch:{ all -> 0x0033 }
        r1 = "Stored data is corrupt, generating new identity";	 Catch:{ all -> 0x0033 }
        android.util.Log.w(r0, r1);	 Catch:{ all -> 0x0033 }
        r0 = com.google.firebase.iid.FirebaseInstanceId.m12658a();	 Catch:{ all -> 0x0033 }
        r0.m12682h();	 Catch:{ all -> 0x0033 }
        r0 = r2.f11065c;	 Catch:{ all -> 0x0033 }
        r1 = r2.f11064b;	 Catch:{ all -> 0x0033 }
        r0 = r0.m12721b(r1, r3);	 Catch:{ all -> 0x0033 }
    L_0x002c:
        r1 = r2.f11066d;	 Catch:{ all -> 0x0033 }
        r1.put(r3, r0);	 Catch:{ all -> 0x0033 }
        monitor-exit(r2);
        return r0;
    L_0x0033:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.x.b(java.lang.String):com.google.firebase.iid.ay");
    }

    /* renamed from: c */
    public final synchronized void m12790c(String str) {
        str = String.valueOf(str).concat("|T|");
        Editor edit = this.f11063a.edit();
        for (String str2 : this.f11063a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
