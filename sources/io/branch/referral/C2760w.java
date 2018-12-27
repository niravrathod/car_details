package io.branch.referral;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import io.branch.referral.Branch.C2704f;
import io.branch.referral.Defines.RequestPath;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.branch.referral.w */
class C2760w {
    /* renamed from: a */
    private static C2760w f11786a;
    /* renamed from: e */
    private static final Object f11787e = new Object();
    /* renamed from: b */
    private SharedPreferences f11788b;
    /* renamed from: c */
    private Editor f11789c = this.f11788b.edit();
    /* renamed from: d */
    private final List<ServerRequest> f11790d;

    /* renamed from: io.branch.referral.w$1 */
    class C27591 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C2760w f11785a;

        C27591(C2760w c2760w) {
            this.f11785a = c2760w;
        }

        public void run() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r6 = this;
            r0 = io.branch.referral.C2760w.f11787e;
            monitor-enter(r0);
            r1 = new org.json.JSONArray;	 Catch:{ all -> 0x008a }
            r1.<init>();	 Catch:{ all -> 0x008a }
            r2 = r6.f11785a;	 Catch:{ all -> 0x008a }
            r2 = r2.f11790d;	 Catch:{ all -> 0x008a }
            r2 = r2.iterator();	 Catch:{ all -> 0x008a }
        L_0x0014:
            r3 = r2.hasNext();	 Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0030;	 Catch:{ all -> 0x008a }
        L_0x001a:
            r3 = r2.next();	 Catch:{ all -> 0x008a }
            r3 = (io.branch.referral.ServerRequest) r3;	 Catch:{ all -> 0x008a }
            r4 = r3.mo3542d();	 Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0014;	 Catch:{ all -> 0x008a }
        L_0x0026:
            r3 = r3.m13168k();	 Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0014;	 Catch:{ all -> 0x008a }
        L_0x002c:
            r1.put(r3);	 Catch:{ all -> 0x008a }
            goto L_0x0014;
        L_0x0030:
            r2 = r6.f11785a;	 Catch:{ Exception -> 0x0046 }
            r2 = r2.f11789c;	 Catch:{ Exception -> 0x0046 }
            r3 = "BNCServerRequestQueue";	 Catch:{ Exception -> 0x0046 }
            r4 = r1.toString();	 Catch:{ Exception -> 0x0046 }
            r2 = r2.putString(r3, r4);	 Catch:{ Exception -> 0x0046 }
            r2.commit();	 Catch:{ Exception -> 0x0046 }
            goto L_0x0074;
        L_0x0044:
            r2 = move-exception;
            goto L_0x0076;
        L_0x0046:
            r2 = move-exception;
            r3 = "Persisting Queue: ";	 Catch:{ all -> 0x0044 }
            r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0044 }
            r4.<init>();	 Catch:{ all -> 0x0044 }
            r5 = "Failed to persit queue ";	 Catch:{ all -> 0x0044 }
            r4.append(r5);	 Catch:{ all -> 0x0044 }
            r2 = r2.getMessage();	 Catch:{ all -> 0x0044 }
            r4.append(r2);	 Catch:{ all -> 0x0044 }
            r2 = r4.toString();	 Catch:{ all -> 0x0044 }
            io.branch.referral.C2754n.m13344b(r3, r2);	 Catch:{ all -> 0x0044 }
            r2 = r6.f11785a;	 Catch:{ Exception -> 0x0074 }
            r2 = r2.f11789c;	 Catch:{ Exception -> 0x0074 }
            r3 = "BNCServerRequestQueue";	 Catch:{ Exception -> 0x0074 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x0074 }
            r1 = r2.putString(r3, r1);	 Catch:{ Exception -> 0x0074 }
            r1.commit();	 Catch:{ Exception -> 0x0074 }
        L_0x0074:
            monitor-exit(r0);	 Catch:{ all -> 0x008a }
            return;
        L_0x0076:
            r3 = r6.f11785a;	 Catch:{ Exception -> 0x0089 }
            r3 = r3.f11789c;	 Catch:{ Exception -> 0x0089 }
            r4 = "BNCServerRequestQueue";	 Catch:{ Exception -> 0x0089 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x0089 }
            r1 = r3.putString(r4, r1);	 Catch:{ Exception -> 0x0089 }
            r1.commit();	 Catch:{ Exception -> 0x0089 }
        L_0x0089:
            throw r2;	 Catch:{ all -> 0x008a }
        L_0x008a:
            r1 = move-exception;	 Catch:{ all -> 0x008a }
            monitor-exit(r0);	 Catch:{ all -> 0x008a }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.1.run():void");
        }
    }

    /* renamed from: a */
    public static C2760w m13478a(Context context) {
        if (f11786a == null) {
            synchronized (C2760w.class) {
                if (f11786a == null) {
                    f11786a = new C2760w(context);
                }
            }
        }
        return f11786a;
    }

    @SuppressLint({"CommitPrefEdits"})
    private C2760w(Context context) {
        this.f11788b = context.getSharedPreferences("BNC_Server_Request_Queue", 0);
        this.f11790d = m13481b(context);
    }

    /* renamed from: i */
    private void m13483i() {
        new Thread(new C27591(this)).start();
    }

    /* renamed from: b */
    private java.util.List<io.branch.referral.ServerRequest> m13481b(android.content.Context r7) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r6 = this;
        r0 = r6.f11788b;
        r1 = "BNCServerRequestQueue";
        r2 = 0;
        r0 = r0.getString(r1, r2);
        r1 = new java.util.LinkedList;
        r1.<init>();
        r1 = java.util.Collections.synchronizedList(r1);
        r2 = f11787e;
        monitor-enter(r2);
        if (r0 == 0) goto L_0x003b;
    L_0x0017:
        r3 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x003b }
        r3.<init>(r0);	 Catch:{ JSONException -> 0x003b }
        r0 = 0;	 Catch:{ JSONException -> 0x003b }
        r4 = r3.length();	 Catch:{ JSONException -> 0x003b }
        r5 = 25;	 Catch:{ JSONException -> 0x003b }
        r4 = java.lang.Math.min(r4, r5);	 Catch:{ JSONException -> 0x003b }
    L_0x0027:
        if (r0 >= r4) goto L_0x003b;	 Catch:{ JSONException -> 0x003b }
    L_0x0029:
        r5 = r3.getJSONObject(r0);	 Catch:{ JSONException -> 0x003b }
        r5 = io.branch.referral.ServerRequest.m13143a(r5, r7);	 Catch:{ JSONException -> 0x003b }
        if (r5 == 0) goto L_0x0036;	 Catch:{ JSONException -> 0x003b }
    L_0x0033:
        r1.add(r5);	 Catch:{ JSONException -> 0x003b }
    L_0x0036:
        r0 = r0 + 1;
        goto L_0x0027;
    L_0x0039:
        r7 = move-exception;
        goto L_0x003d;
    L_0x003b:
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        return r1;	 Catch:{ all -> 0x0039 }
    L_0x003d:
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.b(android.content.Context):java.util.List<io.branch.referral.ServerRequest>");
    }

    /* renamed from: a */
    public int m13484a() {
        int size;
        synchronized (f11787e) {
            size = this.f11790d.size();
        }
        return size;
    }

    /* renamed from: a */
    void m13488a(ServerRequest serverRequest) {
        synchronized (f11787e) {
            if (serverRequest != null) {
                this.f11790d.add(serverRequest);
                if (m13484a() >= 25) {
                    this.f11790d.remove(1);
                }
                m13483i();
            }
        }
    }

    /* renamed from: b */
    io.branch.referral.ServerRequest m13491b() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = f11787e;
        monitor-enter(r0);
        r1 = 0;
        r2 = r4.f11790d;	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r3 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r2 = r2.remove(r3);	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r2 = (io.branch.referral.ServerRequest) r2;	 Catch:{ IndexOutOfBoundsException -> 0x0013, IndexOutOfBoundsException -> 0x0013 }
        r4.m13483i();	 Catch:{ IndexOutOfBoundsException -> 0x0014, IndexOutOfBoundsException -> 0x0014 }
        goto L_0x0014;
    L_0x0011:
        r1 = move-exception;
        goto L_0x0016;
    L_0x0013:
        r2 = r1;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0011 }
        return r2;	 Catch:{ all -> 0x0011 }
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0011 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.b():io.branch.referral.ServerRequest");
    }

    /* renamed from: c */
    io.branch.referral.ServerRequest m13493c() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = f11787e;
        monitor-enter(r0);
        r1 = r3.f11790d;	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        r2 = 0;	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        r1 = r1.get(r2);	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        r1 = (io.branch.referral.ServerRequest) r1;	 Catch:{ IndexOutOfBoundsException -> 0x000f, IndexOutOfBoundsException -> 0x000f }
        goto L_0x0010;
    L_0x000d:
        r1 = move-exception;
        goto L_0x0012;
    L_0x000f:
        r1 = 0;
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000d }
        return r1;	 Catch:{ all -> 0x000d }
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x000d }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.c():io.branch.referral.ServerRequest");
    }

    /* renamed from: a */
    io.branch.referral.ServerRequest m13485a(int r3) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = f11787e;
        monitor-enter(r0);
        r1 = r2.f11790d;	 Catch:{ IndexOutOfBoundsException -> 0x000e, IndexOutOfBoundsException -> 0x000e }
        r3 = r1.get(r3);	 Catch:{ IndexOutOfBoundsException -> 0x000e, IndexOutOfBoundsException -> 0x000e }
        r3 = (io.branch.referral.ServerRequest) r3;	 Catch:{ IndexOutOfBoundsException -> 0x000e, IndexOutOfBoundsException -> 0x000e }
        goto L_0x000f;
    L_0x000c:
        r3 = move-exception;
        goto L_0x0011;
    L_0x000e:
        r3 = 0;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        return r3;	 Catch:{ all -> 0x000c }
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.a(int):io.branch.referral.ServerRequest");
    }

    /* renamed from: a */
    void m13489a(io.branch.referral.ServerRequest r3, int r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = f11787e;
        monitor-enter(r0);
        r1 = r2.f11790d;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r1 = r1.size();	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        if (r1 >= r4) goto L_0x0011;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
    L_0x000b:
        r4 = r2.f11790d;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r4 = r4.size();	 Catch:{ IndexOutOfBoundsException -> 0x001c }
    L_0x0011:
        r1 = r2.f11790d;	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r1.add(r4, r3);	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        r2.m13483i();	 Catch:{ IndexOutOfBoundsException -> 0x001c }
        goto L_0x001c;
    L_0x001a:
        r3 = move-exception;
        goto L_0x001e;
    L_0x001c:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        return;	 Catch:{ all -> 0x001a }
    L_0x001e:
        monitor-exit(r0);	 Catch:{ all -> 0x001a }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.a(io.branch.referral.ServerRequest, int):void");
    }

    /* renamed from: b */
    public boolean m13492b(io.branch.referral.ServerRequest r4) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = f11787e;
        monitor-enter(r0);
        r1 = 0;
        r2 = r3.f11790d;	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r4 = r2.remove(r4);	 Catch:{ UnsupportedOperationException -> 0x0010 }
        r3.m13483i();	 Catch:{ UnsupportedOperationException -> 0x0011 }
        goto L_0x0011;
    L_0x000e:
        r4 = move-exception;
        goto L_0x0013;
    L_0x0010:
        r4 = 0;
    L_0x0011:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        return r4;	 Catch:{ all -> 0x000e }
    L_0x0013:
        monitor-exit(r0);	 Catch:{ all -> 0x000e }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.b(io.branch.referral.ServerRequest):boolean");
    }

    /* renamed from: d */
    void m13494d() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = f11787e;
        monitor-enter(r0);
        r1 = r2.f11790d;	 Catch:{ UnsupportedOperationException -> 0x000e }
        r1.clear();	 Catch:{ UnsupportedOperationException -> 0x000e }
        r2.m13483i();	 Catch:{ UnsupportedOperationException -> 0x000e }
        goto L_0x000e;
    L_0x000c:
        r1 = move-exception;
        goto L_0x0010;
    L_0x000e:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        return;	 Catch:{ all -> 0x000c }
    L_0x0010:
        monitor-exit(r0);	 Catch:{ all -> 0x000c }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.w.d():void");
    }

    /* renamed from: e */
    boolean m13495e() {
        synchronized (f11787e) {
            for (ServerRequest serverRequest : this.f11790d) {
                if (serverRequest != null && serverRequest.m13163f().equals(RequestPath.RegisterClose.m13133a())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    boolean m13496f() {
        synchronized (f11787e) {
            for (ServerRequest serverRequest : this.f11790d) {
                if (serverRequest != null && ((serverRequest instanceof C4730z) || (serverRequest instanceof aa))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    void m13490a(ServerRequest serverRequest, int i, C2704f c2704f) {
        synchronized (f11787e) {
            Iterator it = this.f11790d.iterator();
            while (it.hasNext()) {
                ServerRequest serverRequest2 = (ServerRequest) it.next();
                if (serverRequest2 != null && ((serverRequest2 instanceof C4730z) || (serverRequest2 instanceof aa))) {
                    it.remove();
                    break;
                }
            }
        }
        m13489a(serverRequest, i == 0 ? 0 : 1);
    }

    /* renamed from: a */
    void m13486a(C2704f c2704f) {
        synchronized (f11787e) {
            for (ServerRequest serverRequest : this.f11790d) {
                if (serverRequest != null) {
                    if (serverRequest instanceof C4730z) {
                        ((C4730z) serverRequest).m27438a(c2704f);
                    } else if (serverRequest instanceof aa) {
                        ((aa) serverRequest).m27429a(c2704f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    void m13487a(PROCESS_WAIT_LOCK process_wait_lock) {
        synchronized (f11787e) {
            for (ServerRequest serverRequest : this.f11790d) {
                if (serverRequest != null) {
                    serverRequest.m13158b(process_wait_lock);
                }
            }
        }
    }

    /* renamed from: g */
    void m13497g() {
        synchronized (f11787e) {
            for (ServerRequest serverRequest : this.f11790d) {
                if (serverRequest != null && (serverRequest instanceof C4285t)) {
                    serverRequest.m13152a(PROCESS_WAIT_LOCK.STRONG_MATCH_PENDING_WAIT_LOCK);
                }
            }
        }
    }
}
