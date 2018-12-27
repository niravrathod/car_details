package android.support.v4.p017f;

/* renamed from: android.support.v4.f.n */
public class C0434n<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f1451a = new Object();
    /* renamed from: b */
    private boolean f1452b;
    /* renamed from: c */
    private int[] f1453c;
    /* renamed from: d */
    private Object[] f1454d;
    /* renamed from: e */
    private int f1455e;

    public /* synthetic */ Object clone() {
        return m1589a();
    }

    public C0434n() {
        this(10);
    }

    public C0434n(int i) {
        this.f1452b = false;
        if (i == 0) {
            this.f1453c = C0417c.f1417a;
            this.f1454d = C0417c.f1419c;
        } else {
            i = C0417c.m1529a(i);
            this.f1453c = new int[i];
            this.f1454d = new Object[i];
        }
        this.f1455e = 0;
    }

    /* renamed from: a */
    public android.support.v4.p017f.C0434n<E> m1589a() {
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
        r0 = 0;
        r1 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x001c }
        r1 = (android.support.v4.p017f.C0434n) r1;	 Catch:{ CloneNotSupportedException -> 0x001c }
        r0 = r2.f1453c;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (int[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1453c = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r2.f1454d;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x001d }
        r0 = (java.lang.Object[]) r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        r1.f1454d = r0;	 Catch:{ CloneNotSupportedException -> 0x001d }
        goto L_0x001d;
    L_0x001c:
        r1 = r0;
    L_0x001d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.f.n.a():android.support.v4.f.n<E>");
    }

    /* renamed from: a */
    public E m1590a(int i) {
        return m1591a(i, null);
    }

    /* renamed from: a */
    public E m1591a(int i, E e) {
        i = C0417c.m1530a(this.f1453c, this.f1455e, i);
        if (i >= 0) {
            if (this.f1454d[i] != f1451a) {
                return this.f1454d[i];
            }
        }
        return e;
    }

    /* renamed from: b */
    public void m1593b(int i) {
        i = C0417c.m1530a(this.f1453c, this.f1455e, i);
        if (i >= 0 && this.f1454d[i] != f1451a) {
            this.f1454d[i] = f1451a;
            this.f1452b = true;
        }
    }

    /* renamed from: c */
    public void m1596c(int i) {
        m1593b(i);
    }

    /* renamed from: d */
    public void m1598d(int i) {
        if (this.f1454d[i] != f1451a) {
            this.f1454d[i] = f1451a;
            this.f1452b = true;
        }
    }

    /* renamed from: d */
    private void m1588d() {
        int i = this.f1455e;
        int[] iArr = this.f1453c;
        Object[] objArr = this.f1454d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f1451a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f1452b = false;
        this.f1455e = i2;
    }

    /* renamed from: b */
    public void m1594b(int i, E e) {
        int a = C0417c.m1530a(this.f1453c, this.f1455e, i);
        if (a >= 0) {
            this.f1454d[a] = e;
        } else {
            a ^= -1;
            if (a >= this.f1455e || this.f1454d[a] != f1451a) {
                if (this.f1452b && this.f1455e >= this.f1453c.length) {
                    m1588d();
                    a = C0417c.m1530a(this.f1453c, this.f1455e, i) ^ -1;
                }
                if (this.f1455e >= this.f1453c.length) {
                    int a2 = C0417c.m1529a(this.f1455e + 1);
                    Object obj = new int[a2];
                    Object obj2 = new Object[a2];
                    System.arraycopy(this.f1453c, 0, obj, 0, this.f1453c.length);
                    System.arraycopy(this.f1454d, 0, obj2, 0, this.f1454d.length);
                    this.f1453c = obj;
                    this.f1454d = obj2;
                }
                if (this.f1455e - a != 0) {
                    int i2 = a + 1;
                    System.arraycopy(this.f1453c, a, this.f1453c, i2, this.f1455e - a);
                    System.arraycopy(this.f1454d, a, this.f1454d, i2, this.f1455e - a);
                }
                this.f1453c[a] = i;
                this.f1454d[a] = e;
                this.f1455e++;
            } else {
                this.f1453c[a] = i;
                this.f1454d[a] = e;
            }
        }
    }

    /* renamed from: b */
    public int m1592b() {
        if (this.f1452b) {
            m1588d();
        }
        return this.f1455e;
    }

    /* renamed from: e */
    public int m1599e(int i) {
        if (this.f1452b) {
            m1588d();
        }
        return this.f1453c[i];
    }

    /* renamed from: f */
    public E m1600f(int i) {
        if (this.f1452b) {
            m1588d();
        }
        return this.f1454d[i];
    }

    /* renamed from: g */
    public int m1601g(int i) {
        if (this.f1452b) {
            m1588d();
        }
        return C0417c.m1530a(this.f1453c, this.f1455e, i);
    }

    /* renamed from: c */
    public void m1595c() {
        int i = this.f1455e;
        Object[] objArr = this.f1454d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f1455e = 0;
        this.f1452b = false;
    }

    /* renamed from: c */
    public void m1597c(int i, E e) {
        if (this.f1455e == 0 || i > this.f1453c[this.f1455e - 1]) {
            if (this.f1452b && this.f1455e >= this.f1453c.length) {
                m1588d();
            }
            int i2 = this.f1455e;
            if (i2 >= this.f1453c.length) {
                int a = C0417c.m1529a(i2 + 1);
                Object obj = new int[a];
                Object obj2 = new Object[a];
                System.arraycopy(this.f1453c, 0, obj, 0, this.f1453c.length);
                System.arraycopy(this.f1454d, 0, obj2, 0, this.f1454d.length);
                this.f1453c = obj;
                this.f1454d = obj2;
            }
            this.f1453c[i2] = i;
            this.f1454d[i2] = e;
            this.f1455e = i2 + 1;
            return;
        }
        m1594b(i, e);
    }

    public String toString() {
        if (m1592b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f1455e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f1455e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m1599e(i));
            stringBuilder.append('=');
            C0434n f = m1600f(i);
            if (f != this) {
                stringBuilder.append(f);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
