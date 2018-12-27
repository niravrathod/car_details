package android.support.v4.p017f;

/* renamed from: android.support.v4.f.f */
public class C0420f<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f1422a = new Object();
    /* renamed from: b */
    private boolean f1423b;
    /* renamed from: c */
    private long[] f1424c;
    /* renamed from: d */
    private Object[] f1425d;
    /* renamed from: e */
    private int f1426e;

    public /* synthetic */ Object clone() {
        return m1538a();
    }

    public C0420f() {
        this(10);
    }

    public C0420f(int i) {
        this.f1423b = false;
        if (i == 0) {
            this.f1424c = C0417c.f1418b;
            this.f1425d = C0417c.f1419c;
        } else {
            i = C0417c.m1533b(i);
            this.f1424c = new long[i];
            this.f1425d = new Object[i];
        }
        this.f1426e = 0;
    }

    /* renamed from: a */
    public android.support.v4.p017f.C0420f<E> m1538a() {
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
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (android.support.v4.p017f.C0420f) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0 = r2.f1424c;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (long[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1424c = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r2.f1425d;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (java.lang.Object[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1425d = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        goto L_0x001d;
    L_0x001c:
        r1 = r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.f.a():android.support.v4.f.f<E>");
    }

    /* renamed from: a */
    public E m1539a(long j) {
        return m1540a(j, null);
    }

    /* renamed from: a */
    public E m1540a(long j, E e) {
        j = C0417c.m1531a(this.f1424c, this.f1426e, j);
        if (j >= null) {
            if (this.f1425d[j] != f1422a) {
                return this.f1425d[j];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void m1544b(long j) {
        j = C0417c.m1531a(this.f1424c, this.f1426e, j);
        if (j >= null && this.f1425d[j] != f1422a) {
            this.f1425d[j] = f1422a;
            this.f1423b = 1;
        }
    }

    /* renamed from: a */
    public void m1541a(int i) {
        if (this.f1425d[i] != f1422a) {
            this.f1425d[i] = f1422a;
            this.f1423b = true;
        }
    }

    /* renamed from: d */
    private void m1537d() {
        int i = this.f1426e;
        long[] jArr = this.f1424c;
        Object[] objArr = this.f1425d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1422a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1423b = false;
        this.f1426e = i2;
    }

    /* renamed from: b */
    public void m1545b(long j, E e) {
        int a = C0417c.m1531a(this.f1424c, this.f1426e, j);
        if (a >= 0) {
            this.f1425d[a] = e;
        } else {
            a ^= -1;
            if (a >= this.f1426e || this.f1425d[a] != f1422a) {
                if (this.f1423b && this.f1426e >= this.f1424c.length) {
                    m1537d();
                    a = C0417c.m1531a(this.f1424c, this.f1426e, j) ^ -1;
                }
                if (this.f1426e >= this.f1424c.length) {
                    int b = C0417c.m1533b(this.f1426e + 1);
                    Object obj = new long[b];
                    Object obj2 = new Object[b];
                    System.arraycopy(this.f1424c, 0, obj, 0, this.f1424c.length);
                    System.arraycopy(this.f1425d, 0, obj2, 0, this.f1425d.length);
                    this.f1424c = obj;
                    this.f1425d = obj2;
                }
                if (this.f1426e - a != 0) {
                    int i = a + 1;
                    System.arraycopy(this.f1424c, a, this.f1424c, i, this.f1426e - a);
                    System.arraycopy(this.f1425d, a, this.f1425d, i, this.f1426e - a);
                }
                this.f1424c[a] = j;
                this.f1425d[a] = e;
                this.f1426e++;
            } else {
                this.f1424c[a] = j;
                this.f1425d[a] = e;
            }
        }
    }

    /* renamed from: b */
    public int m1542b() {
        if (this.f1423b) {
            m1537d();
        }
        return this.f1426e;
    }

    /* renamed from: b */
    public long m1543b(int i) {
        if (this.f1423b) {
            m1537d();
        }
        return this.f1424c[i];
    }

    /* renamed from: c */
    public E m1547c(int i) {
        if (this.f1423b) {
            m1537d();
        }
        return this.f1425d[i];
    }

    /* renamed from: c */
    public int m1546c(long j) {
        if (this.f1423b) {
            m1537d();
        }
        return C0417c.m1531a(this.f1424c, this.f1426e, j);
    }

    /* renamed from: c */
    public void m1548c() {
        int i = this.f1426e;
        Object[] objArr = this.f1425d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1426e = 0;
        this.f1423b = false;
    }

    public String toString() {
        if (m1542b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1426e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1426e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1543b(i));
            stringBuilder.append('=');
            C0420f c = m1547c(i);
            if (c != this) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
