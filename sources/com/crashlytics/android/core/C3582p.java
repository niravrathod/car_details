package com.crashlytics.android.core;

import android.os.Bundle;
import io.fabric.sdk.android.C2766c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.core.p */
class C3582p implements C1354b {
    /* renamed from: a */
    private final CrashlyticsCore f14743a;

    /* renamed from: com.crashlytics.android.core.p$1 */
    class C13931 implements InvocationHandler {
        /* renamed from: a */
        final /* synthetic */ C3582p f4358a;

        C13931(C3582p c3582p) {
            this.f4358a = c3582p;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr.length == 4) {
                String str = (String) objArr[null];
                String str2 = (String) objArr[1];
                Bundle bundle = (Bundle) objArr[2];
                if (str != null && str.equals("crash") == null) {
                    C3582p.m18152b(this.f4358a.f14743a, str2, bundle);
                }
                return null;
            }
            throw new RuntimeException("Unexpected AppMeasurement.OnEventListener signature");
        }
    }

    /* renamed from: a */
    static C1354b m18145a(CrashlyticsCore crashlyticsCore) {
        return new C3582p(crashlyticsCore);
    }

    private C3582p(CrashlyticsCore crashlyticsCore) {
        this.f14743a = crashlyticsCore;
    }

    /* renamed from: a */
    public boolean mo1155a() {
        Class a = m18146a("com.google.android.gms.measurement.AppMeasurement");
        if (a == null) {
            C2766c.m13524h().mo3559d(CrashlyticsCore.TAG, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object a2 = m18147a(a);
        if (a2 != null) {
            return m18150a(a, a2, "registerOnMeasurementEventListener");
        }
        C2766c.m13524h().mo3559d(CrashlyticsCore.TAG, "Could not create an instance of Firebase Analytics.");
        return false;
    }

    /* renamed from: a */
    private java.lang.Class<?> m18146a(java.lang.String r2) {
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
        r1 = this;
        r0 = r1.f14743a;	 Catch:{ Exception -> 0x000f }
        r0 = r0.getContext();	 Catch:{ Exception -> 0x000f }
        r0 = r0.getClassLoader();	 Catch:{ Exception -> 0x000f }
        r2 = r0.loadClass(r2);	 Catch:{ Exception -> 0x000f }
        return r2;
    L_0x000f:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.p.a(java.lang.String):java.lang.Class<?>");
    }

    /* renamed from: a */
    private java.lang.Object m18147a(java.lang.Class<?> r6) {
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
        r5 = this;
        r0 = "getInstance";	 Catch:{ Exception -> 0x001d }
        r1 = 1;	 Catch:{ Exception -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x001d }
        r3 = android.content.Context.class;	 Catch:{ Exception -> 0x001d }
        r4 = 0;	 Catch:{ Exception -> 0x001d }
        r2[r4] = r3;	 Catch:{ Exception -> 0x001d }
        r0 = r6.getDeclaredMethod(r0, r2);	 Catch:{ Exception -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x001d }
        r2 = r5.f14743a;	 Catch:{ Exception -> 0x001d }
        r2 = r2.getContext();	 Catch:{ Exception -> 0x001d }
        r1[r4] = r2;	 Catch:{ Exception -> 0x001d }
        r6 = r0.invoke(r6, r1);	 Catch:{ Exception -> 0x001d }
        return r6;
    L_0x001d:
        r6 = 0;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.p.a(java.lang.Class):java.lang.Object");
    }

    /* renamed from: a */
    private boolean m18150a(Class<?> cls, Object obj, String str) {
        String str2;
        StringBuilder stringBuilder;
        Class a = m18146a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        try {
            cls.getDeclaredMethod(str, new Class[]{a}).invoke(obj, new Object[]{m18151b(a)});
            return true;
        } catch (Class<?> cls2) {
            obj = C2766c.m13524h();
            str2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Expected method missing: ");
            stringBuilder.append(str);
            obj.mo3560d(str2, stringBuilder.toString(), cls2);
            return false;
        } catch (Class<?> cls22) {
            obj = C2766c.m13524h();
            str2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot invoke method: ");
            stringBuilder.append(str);
            obj.mo3560d(str2, stringBuilder.toString(), cls22);
            return false;
        } catch (Class<?> cls222) {
            obj = C2766c.m13524h();
            str2 = CrashlyticsCore.TAG;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cannot access method: ");
            stringBuilder.append(str);
            obj.mo3560d(str2, stringBuilder.toString(), cls222);
            return false;
        }
    }

    /* renamed from: b */
    private Object m18151b(Class cls) {
        return Proxy.newProxyInstance(this.f14743a.getContext().getClassLoader(), new Class[]{cls}, new C13931(this));
    }

    /* renamed from: b */
    private static void m18152b(com.crashlytics.android.core.CrashlyticsCore r2, java.lang.String r3, android.os.Bundle r4) {
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
        r0 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0019 }
        r0.<init>();	 Catch:{ JSONException -> 0x0019 }
        r1 = "$A$:";	 Catch:{ JSONException -> 0x0019 }
        r0.append(r1);	 Catch:{ JSONException -> 0x0019 }
        r4 = com.crashlytics.android.core.C3582p.m18148a(r3, r4);	 Catch:{ JSONException -> 0x0019 }
        r0.append(r4);	 Catch:{ JSONException -> 0x0019 }
        r4 = r0.toString();	 Catch:{ JSONException -> 0x0019 }
        r2.log(r4);	 Catch:{ JSONException -> 0x0019 }
        goto L_0x0033;
    L_0x0019:
        r2 = io.fabric.sdk.android.C2766c.m13524h();
        r4 = "CrashlyticsCore";
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Unable to serialize Firebase Analytics event; ";
        r0.append(r1);
        r0.append(r3);
        r3 = r0.toString();
        r2.mo3559d(r4, r3);
    L_0x0033:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.p.b(com.crashlytics.android.core.CrashlyticsCore, java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m18148a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
