package io.fabric.sdk.android.services.p147b;

import android.content.Context;
import io.fabric.sdk.android.services.common.C2799j;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.fabric.sdk.android.services.b.b */
public abstract class C2780b<T> {
    /* renamed from: a */
    protected final Context f11830a;
    /* renamed from: b */
    protected final C2777a<T> f11831b;
    /* renamed from: c */
    protected final C2799j f11832c;
    /* renamed from: d */
    protected final C2781c f11833d;
    /* renamed from: e */
    protected volatile long f11834e;
    /* renamed from: f */
    protected final List<C2782d> f11835f = new CopyOnWriteArrayList();
    /* renamed from: g */
    private final int f11836g;

    /* renamed from: io.fabric.sdk.android.services.b.b$1 */
    class C27781 implements Comparator<C2779a> {
        /* renamed from: a */
        final /* synthetic */ C2780b f11827a;

        C27781(C2780b c2780b) {
            this.f11827a = c2780b;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m13561a((C2779a) obj, (C2779a) obj2);
        }

        /* renamed from: a */
        public int m13561a(C2779a c2779a, C2779a c2779a2) {
            return (int) (c2779a.f11829b - c2779a2.f11829b);
        }
    }

    /* renamed from: io.fabric.sdk.android.services.b.b$a */
    static class C2779a {
        /* renamed from: a */
        final File f11828a;
        /* renamed from: b */
        final long f11829b;

        public C2779a(File file, long j) {
            this.f11828a = file;
            this.f11829b = j;
        }
    }

    /* renamed from: a */
    protected abstract String mo1112a();

    /* renamed from: c */
    protected int mo1114c() {
        return 8000;
    }

    public C2780b(Context context, C2777a<T> c2777a, C2799j c2799j, C2781c c2781c, int i) {
        this.f11830a = context.getApplicationContext();
        this.f11831b = c2777a;
        this.f11833d = c2781c;
        this.f11832c = c2799j;
        this.f11834e = this.f11832c.mo3580a();
        this.f11836g = i;
    }

    /* renamed from: a */
    public void m13567a(T t) {
        byte[] a = this.f11831b.mo1117a(t);
        m13562a(a.length);
        this.f11833d.mo3570a(a);
    }

    /* renamed from: a */
    public void m13566a(C2782d c2782d) {
        if (c2782d != null) {
            this.f11835f.add(c2782d);
        }
    }

    /* renamed from: d */
    public boolean m13571d() {
        String str;
        boolean z = true;
        if (this.f11833d.mo3572b()) {
            str = null;
            z = false;
        } else {
            str = mo1112a();
            this.f11833d.mo3568a(str);
            CommonUtils.m13609a(this.f11830a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f11834e = this.f11832c.mo3580a();
        }
        m13563b(str);
        return z;
    }

    /* renamed from: a */
    private void m13562a(int i) {
        if (!this.f11833d.mo3571a(i, mo1114c())) {
            CommonUtils.m13609a(this.f11830a, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f11833d.mo3566a()), Integer.valueOf(i), Integer.valueOf(mo1114c())}));
            m13571d();
        }
    }

    /* renamed from: b */
    protected int mo1113b() {
        return this.f11836g;
    }

    /* renamed from: b */
    private void m13563b(String str) {
        for (C2782d a : this.f11835f) {
            try {
                a.mo1101a(str);
            } catch (Throwable e) {
                CommonUtils.m13611a(this.f11830a, "One of the roll over listeners threw an exception", e);
            }
        }
    }

    /* renamed from: e */
    public List<File> m13572e() {
        return this.f11833d.mo3567a(1);
    }

    /* renamed from: a */
    public void m13568a(List<File> list) {
        this.f11833d.mo3569a((List) list);
    }

    /* renamed from: f */
    public void m13573f() {
        this.f11833d.mo3569a(this.f11833d.mo3573c());
        this.f11833d.mo3574d();
    }

    /* renamed from: g */
    public void m13574g() {
        List<File> c = this.f11833d.mo3573c();
        int b = mo1113b();
        if (c.size() > b) {
            int size = c.size() - b;
            CommonUtils.m13610a(this.f11830a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(b), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C27781(this));
            for (File file : c) {
                treeSet.add(new C2779a(file, m13564a(file.getName())));
            }
            List c2 = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                c2.add(((C2779a) it.next()).f11828a);
                if (c2.size() == size) {
                    break;
                }
            }
            this.f11833d.mo3569a(c2);
        }
    }

    /* renamed from: a */
    public long m13564a(java.lang.String r6) {
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
        r5 = this;
        r0 = "_";
        r6 = r6.split(r0);
        r0 = r6.length;
        r1 = 0;
        r3 = 3;
        if (r0 == r3) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = 2;
        r6 = r6[r0];	 Catch:{ NumberFormatException -> 0x0019 }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ NumberFormatException -> 0x0019 }
        r3 = r6.longValue();	 Catch:{ NumberFormatException -> 0x0019 }
        return r3;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.b.b.a(java.lang.String):long");
    }
}
