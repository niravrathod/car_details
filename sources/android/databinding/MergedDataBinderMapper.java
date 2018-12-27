package android.databinding;

import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends C0058d {
    /* renamed from: a */
    private Set<Class<? extends C0058d>> f12731a = new HashSet();
    /* renamed from: b */
    private List<C0058d> f12732b = new CopyOnWriteArrayList();
    /* renamed from: c */
    private List<String> f12733c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void m14742a(C0058d c0058d) {
        if (this.f12731a.add(c0058d.getClass())) {
            this.f12732b.add(c0058d);
            for (C0058d a : c0058d.mo897a()) {
                m14742a(a);
            }
        }
    }

    /* renamed from: a */
    public ViewDataBinding mo24a(C0059e c0059e, View view, int i) {
        for (C0058d a : this.f12732b) {
            ViewDataBinding a2 = a.mo24a(c0059e, view, i);
            if (a2 != null) {
                return a2;
            }
        }
        return m14739b() ? mo24a(c0059e, view, i) : null;
    }

    /* renamed from: a */
    public ViewDataBinding mo25a(C0059e c0059e, View[] viewArr, int i) {
        for (C0058d a : this.f12732b) {
            ViewDataBinding a2 = a.mo25a(c0059e, viewArr, i);
            if (a2 != null) {
                return a2;
            }
        }
        return m14739b() ? mo25a(c0059e, viewArr, i) : null;
    }

    /* renamed from: b */
    private boolean m14739b() {
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
        r7 = this;
        r0 = r7.f12733c;
        r0 = r0.iterator();
        r1 = 0;
    L_0x0007:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x005f;
    L_0x000d:
        r2 = r0.next();
        r2 = (java.lang.String) r2;
        r3 = java.lang.Class.forName(r2);	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r4 = android.databinding.C0058d.class;	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r4 = r4.isAssignableFrom(r3);	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        if (r4 == 0) goto L_0x0007;	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
    L_0x001f:
        r3 = r3.newInstance();	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r3 = (android.databinding.C0058d) r3;	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r7.m14742a(r3);	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r3 = r7.f12733c;	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r3.remove(r2);	 Catch:{ ClassNotFoundException -> 0x0007, IllegalAccessException -> 0x0047, InstantiationException -> 0x002f }
        r1 = 1;
        goto L_0x0007;
    L_0x002f:
        r3 = move-exception;
        r4 = "MergedDataBinderMapper";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "unable to add feature mapper for ";
        r5.append(r6);
        r5.append(r2);
        r2 = r5.toString();
        android.util.Log.e(r4, r2, r3);
        goto L_0x0007;
    L_0x0047:
        r3 = move-exception;
        r4 = "MergedDataBinderMapper";
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = "unable to add feature mapper for ";
        r5.append(r6);
        r5.append(r2);
        r2 = r5.toString();
        android.util.Log.e(r4, r2, r3);
        goto L_0x0007;
    L_0x005f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.databinding.MergedDataBinderMapper.b():boolean");
    }
}
