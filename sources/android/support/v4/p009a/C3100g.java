package android.support.v4.p009a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.content.p014a.C0383a.C0382c;
import android.support.v4.content.p014a.C0383a.C3122b;
import android.support.v4.p009a.C0304c.C0303a;
import android.support.v4.p015d.C0404b.C0402b;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

/* renamed from: android.support.v4.a.g */
class C3100g implements C0303a {

    /* renamed from: android.support.v4.a.g$a */
    private interface C0305a<T> {
        /* renamed from: a */
        boolean mo253a(T t);

        /* renamed from: b */
        int mo254b(T t);
    }

    /* renamed from: android.support.v4.a.g$1 */
    class C30981 implements C0305a<C0402b> {
        /* renamed from: a */
        final /* synthetic */ C3100g f13103a;

        C30981(C3100g c3100g) {
            this.f13103a = c3100g;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo253a(Object obj) {
            return m15300b((C0402b) obj);
        }

        /* renamed from: b */
        public /* synthetic */ int mo254b(Object obj) {
            return m15297a((C0402b) obj);
        }

        /* renamed from: a */
        public int m15297a(C0402b c0402b) {
            return c0402b.m1485c();
        }

        /* renamed from: b */
        public boolean m15300b(C0402b c0402b) {
            return c0402b.m1486d();
        }
    }

    /* renamed from: android.support.v4.a.g$2 */
    class C30992 implements C0305a<C0382c> {
        /* renamed from: a */
        final /* synthetic */ C3100g f13104a;

        C30992(C3100g c3100g) {
            this.f13104a = c3100g;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo253a(Object obj) {
            return m15304b((C0382c) obj);
        }

        /* renamed from: b */
        public /* synthetic */ int mo254b(Object obj) {
            return m15301a((C0382c) obj);
        }

        /* renamed from: a */
        public int m15301a(C0382c c0382c) {
            return c0382c.m1402b();
        }

        /* renamed from: b */
        public boolean m15304b(C0382c c0382c) {
            return c0382c.m1403c();
        }
    }

    C3100g() {
    }

    /* renamed from: a */
    private static <T> T m15306a(T[] tArr, int i, C0305a<T> c0305a) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int abs = (Math.abs(c0305a.mo254b(t2) - i2) * 2) + (c0305a.mo253a(t2) == z ? 0 : 1);
            if (t == null || r6 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: a */
    protected C0402b m15311a(C0402b[] c0402bArr, int i) {
        return (C0402b) C3100g.m15306a(c0402bArr, i, new C30981(this));
    }

    /* renamed from: a */
    protected android.graphics.Typeface m15310a(android.content.Context r2, java.io.InputStream r3) {
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
        r1 = this;
        r2 = android.support.v4.p009a.C0306h.m1097a(r2);
        r0 = 0;
        if (r2 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r3 = android.support.v4.p009a.C0306h.m1103a(r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r3 != 0) goto L_0x0012;
    L_0x000e:
        r2.delete();
        return r0;
    L_0x0012:
        r3 = r2.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r3 = android.graphics.Typeface.createFromFile(r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2.delete();
        return r3;
    L_0x001e:
        r3 = move-exception;
        r2.delete();
        throw r3;
    L_0x0023:
        r2.delete();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.g.a(android.content.Context, java.io.InputStream):android.graphics.Typeface");
    }

    /* renamed from: a */
    public android.graphics.Typeface mo256a(android.content.Context r3, android.os.CancellationSignal r4, android.support.v4.p015d.C0404b.C0402b[] r5, int r6) {
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
        r4 = r5.length;
        r0 = 0;
        r1 = 1;
        if (r4 >= r1) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r4 = r2.m15311a(r5, r6);
        r5 = r3.getContentResolver();	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r4 = r4.m1483a();	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r4 = r5.openInputStream(r4);	 Catch:{ IOException -> 0x0026, all -> 0x0021 }
        r3 = r2.m15310a(r3, r4);	 Catch:{ IOException -> 0x0027, all -> 0x001e }
        android.support.v4.p009a.C0306h.m1101a(r4);
        return r3;
    L_0x001e:
        r3 = move-exception;
        r0 = r4;
        goto L_0x0022;
    L_0x0021:
        r3 = move-exception;
    L_0x0022:
        android.support.v4.p009a.C0306h.m1101a(r0);
        throw r3;
    L_0x0026:
        r4 = r0;
    L_0x0027:
        android.support.v4.p009a.C0306h.m1101a(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.g.a(android.content.Context, android.os.CancellationSignal, android.support.v4.d.b$b[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    private C0382c m15305a(C3122b c3122b, int i) {
        return (C0382c) C3100g.m15306a(c3122b.m15576a(), i, new C30992(this));
    }

    /* renamed from: a */
    public Typeface mo257a(Context context, C3122b c3122b, Resources resources, int i) {
        c3122b = m15305a(c3122b, i);
        if (c3122b == null) {
            return null;
        }
        return C0304c.m1090a(context, resources, c3122b.m1404d(), c3122b.m1401a(), i);
    }

    /* renamed from: a */
    public android.graphics.Typeface mo255a(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
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
        r0 = this;
        r1 = android.support.v4.p009a.C0306h.m1097a(r1);
        r4 = 0;
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r4;
    L_0x0008:
        r2 = android.support.v4.p009a.C0306h.m1102a(r1, r2, r3);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        if (r2 != 0) goto L_0x0012;
    L_0x000e:
        r1.delete();
        return r4;
    L_0x0012:
        r2 = r1.getPath();	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r2 = android.graphics.Typeface.createFromFile(r2);	 Catch:{ RuntimeException -> 0x0023, all -> 0x001e }
        r1.delete();
        return r2;
    L_0x001e:
        r2 = move-exception;
        r1.delete();
        throw r2;
    L_0x0023:
        r1.delete();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.g.a(android.content.Context, android.content.res.Resources, int, java.lang.String, int):android.graphics.Typeface");
    }
}
