package android.support.constraint.solver.widgets;

import android.support.constraint.solver.C0095c;
import android.support.constraint.solver.C0097e;
import android.support.constraint.solver.SolverVariable;
import android.support.constraint.solver.widgets.ConstraintAnchor.Strength;
import android.support.constraint.solver.widgets.ConstraintAnchor.Type;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.util.ArrayList;

public class ConstraintWidget {
    /* renamed from: R */
    public static float f405R = 0.5f;
    /* renamed from: A */
    protected ConstraintAnchor[] f406A = new ConstraintAnchor[]{this.f449s, this.f451u, this.f450t, this.f452v, this.f453w, this.f456z};
    /* renamed from: B */
    protected ArrayList<ConstraintAnchor> f407B = new ArrayList();
    /* renamed from: C */
    protected DimensionBehaviour[] f408C = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
    /* renamed from: D */
    ConstraintWidget f409D = null;
    /* renamed from: E */
    int f410E = 0;
    /* renamed from: F */
    int f411F = 0;
    /* renamed from: G */
    protected float f412G = 0.0f;
    /* renamed from: H */
    protected int f413H = -1;
    /* renamed from: I */
    protected int f414I = 0;
    /* renamed from: J */
    protected int f415J = 0;
    /* renamed from: K */
    int f416K = 0;
    /* renamed from: L */
    int f417L = 0;
    /* renamed from: M */
    protected int f418M = 0;
    /* renamed from: N */
    protected int f419N = 0;
    /* renamed from: O */
    int f420O = 0;
    /* renamed from: P */
    protected int f421P;
    /* renamed from: Q */
    protected int f422Q;
    /* renamed from: S */
    float f423S = f405R;
    /* renamed from: T */
    float f424T = f405R;
    /* renamed from: U */
    boolean f425U;
    /* renamed from: V */
    boolean f426V;
    /* renamed from: W */
    boolean f427W = false;
    /* renamed from: X */
    boolean f428X = false;
    /* renamed from: Y */
    boolean f429Y = false;
    /* renamed from: Z */
    int f430Z = 0;
    /* renamed from: a */
    public int f431a = -1;
    int aa = 0;
    boolean ab;
    boolean ac;
    float[] ad = new float[]{-1.0f, -1.0f};
    protected ConstraintWidget[] ae = new ConstraintWidget[]{null, null};
    protected ConstraintWidget[] af = new ConstraintWidget[]{null, null};
    ConstraintWidget ag = null;
    ConstraintWidget ah = null;
    private int[] ai = new int[]{BaseClientBuilder.API_PRIORITY_OTHER, BaseClientBuilder.API_PRIORITY_OTHER};
    private float aj = 0.0f;
    private int ak = 0;
    private int al = 0;
    private int am = 0;
    private int an = 0;
    private int ao;
    private int ap;
    private Object aq;
    private int ar = 0;
    private int as = 0;
    private String at = null;
    private String au = null;
    /* renamed from: b */
    public int f432b = -1;
    /* renamed from: c */
    C3026l f433c;
    /* renamed from: d */
    C3026l f434d;
    /* renamed from: e */
    int f435e = 0;
    /* renamed from: f */
    int f436f = 0;
    /* renamed from: g */
    int[] f437g = new int[2];
    /* renamed from: h */
    int f438h = 0;
    /* renamed from: i */
    int f439i = 0;
    /* renamed from: j */
    float f440j = 1.0f;
    /* renamed from: k */
    int f441k = 0;
    /* renamed from: l */
    int f442l = 0;
    /* renamed from: m */
    float f443m = 1.0f;
    /* renamed from: n */
    boolean f444n;
    /* renamed from: o */
    boolean f445o;
    /* renamed from: p */
    int f446p = -1;
    /* renamed from: q */
    float f447q = 1.0f;
    /* renamed from: r */
    C0106f f448r = null;
    /* renamed from: s */
    ConstraintAnchor f449s = new ConstraintAnchor(this, Type.LEFT);
    /* renamed from: t */
    ConstraintAnchor f450t = new ConstraintAnchor(this, Type.TOP);
    /* renamed from: u */
    ConstraintAnchor f451u = new ConstraintAnchor(this, Type.RIGHT);
    /* renamed from: v */
    ConstraintAnchor f452v = new ConstraintAnchor(this, Type.BOTTOM);
    /* renamed from: w */
    ConstraintAnchor f453w = new ConstraintAnchor(this, Type.BASELINE);
    /* renamed from: x */
    ConstraintAnchor f454x = new ConstraintAnchor(this, Type.CENTER_X);
    /* renamed from: y */
    ConstraintAnchor f455y = new ConstraintAnchor(this, Type.CENTER_Y);
    /* renamed from: z */
    ConstraintAnchor f456z = new ConstraintAnchor(this, Type.CENTER);

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    /* renamed from: c */
    public void mo3719c() {
    }

    /* renamed from: c */
    public void m349c(int i) {
        this.ai[0] = i;
    }

    /* renamed from: d */
    public void m354d(int i) {
        this.ai[1] = i;
    }

    /* renamed from: d */
    public boolean m356d() {
        return this.f435e == 0 && this.f412G == 0.0f && this.f438h == 0 && this.f439i == 0 && this.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* renamed from: e */
    public boolean m359e() {
        return this.f436f == 0 && this.f412G == 0.0f && this.f441k == 0 && this.f442l == 0 && this.f408C[1] == DimensionBehaviour.MATCH_CONSTRAINT;
    }

    /* renamed from: f */
    public void mo52f() {
        this.f449s.m308i();
        this.f450t.m308i();
        this.f451u.m308i();
        this.f452v.m308i();
        this.f453w.m308i();
        this.f454x.m308i();
        this.f455y.m308i();
        this.f456z.m308i();
        this.f409D = null;
        this.aj = 0.0f;
        this.f410E = 0;
        this.f411F = 0;
        this.f412G = 0.0f;
        this.f413H = -1;
        this.f414I = 0;
        this.f415J = 0;
        this.ak = 0;
        this.al = 0;
        this.am = 0;
        this.an = 0;
        this.f418M = 0;
        this.f419N = 0;
        this.f420O = 0;
        this.f421P = 0;
        this.f422Q = 0;
        this.ao = 0;
        this.ap = 0;
        this.f423S = f405R;
        this.f424T = f405R;
        this.f408C[0] = DimensionBehaviour.FIXED;
        this.f408C[1] = DimensionBehaviour.FIXED;
        this.aq = null;
        this.ar = 0;
        this.as = 0;
        this.au = null;
        this.f425U = false;
        this.f426V = false;
        this.f430Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = false;
        this.ad[0] = -1.0f;
        this.ad[1] = -1.0f;
        this.f431a = -1;
        this.f432b = -1;
        this.ai[0] = BaseClientBuilder.API_PRIORITY_OTHER;
        this.ai[1] = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f435e = 0;
        this.f436f = 0;
        this.f440j = 1.0f;
        this.f443m = 1.0f;
        this.f439i = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f442l = BaseClientBuilder.API_PRIORITY_OTHER;
        this.f438h = 0;
        this.f441k = 0;
        this.f446p = -1;
        this.f447q = 1.0f;
        if (this.f433c != null) {
            this.f433c.mo48b();
        }
        if (this.f434d != null) {
            this.f434d.mo48b();
        }
        this.f448r = null;
        this.f427W = false;
        this.f428X = false;
        this.f429Y = false;
    }

    /* renamed from: b */
    public void mo3718b() {
        for (int i = 0; i < 6; i++) {
            this.f406A[i].m296a().mo48b();
        }
    }

    /* renamed from: g */
    public void m363g() {
        for (int i = 0; i < 6; i++) {
            this.f406A[i].m296a().m14812c();
        }
    }

    /* renamed from: b */
    public void mo45b(int i) {
        C0108i.m420a(i, this);
    }

    /* renamed from: h */
    public boolean m365h() {
        if (this.f449s.m296a().i == 1 && this.f451u.m296a().i == 1 && this.f450t.m296a().i == 1 && this.f452v.m296a().i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public C3026l m366i() {
        if (this.f433c == null) {
            this.f433c = new C3026l();
        }
        return this.f433c;
    }

    /* renamed from: j */
    public C3026l m368j() {
        if (this.f434d == null) {
            this.f434d = new C3026l();
        }
        return this.f434d;
    }

    public ConstraintWidget() {
        mo40J();
    }

    /* renamed from: a */
    public void mo50a(C0095c c0095c) {
        this.f449s.m297a(c0095c);
        this.f450t.m297a(c0095c);
        this.f451u.m297a(c0095c);
        this.f452v.m297a(c0095c);
        this.f453w.m297a(c0095c);
        this.f456z.m297a(c0095c);
        this.f454x.m297a(c0095c);
        this.f455y.m297a(c0095c);
    }

    /* renamed from: J */
    private void mo40J() {
        this.f407B.add(this.f449s);
        this.f407B.add(this.f450t);
        this.f407B.add(this.f451u);
        this.f407B.add(this.f452v);
        this.f407B.add(this.f454x);
        this.f407B.add(this.f455y);
        this.f407B.add(this.f456z);
        this.f407B.add(this.f453w);
    }

    /* renamed from: k */
    public ConstraintWidget m370k() {
        return this.f409D;
    }

    /* renamed from: a */
    public void m332a(ConstraintWidget constraintWidget) {
        this.f409D = constraintWidget;
    }

    /* renamed from: b */
    public void m346b(boolean z) {
        this.f444n = z;
    }

    /* renamed from: c */
    public void m352c(boolean z) {
        this.f445o = z;
    }

    /* renamed from: a */
    public void m333a(ConstraintWidget constraintWidget, float f, int i) {
        m330a(Type.CENTER, constraintWidget, Type.CENTER, i, 0);
        this.aj = f;
    }

    /* renamed from: e */
    public void m357e(int i) {
        this.as = i;
    }

    /* renamed from: l */
    public int m372l() {
        return this.as;
    }

    /* renamed from: m */
    public String m374m() {
        return this.at;
    }

    /* renamed from: a */
    public void m335a(String str) {
        this.at = str;
    }

    /* renamed from: b */
    public void m343b(C0097e c0097e) {
        c0097e.m273a(this.f449s);
        c0097e.m273a(this.f450t);
        c0097e.m273a(this.f451u);
        c0097e.m273a(this.f452v);
        if (this.f420O > 0) {
            c0097e.m273a(this.f453w);
        }
    }

    public String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder();
        if (this.au != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("type: ");
            stringBuilder3.append(this.au);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.at != null) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append("id: ");
            stringBuilder3.append(this.at);
            stringBuilder3.append(" ");
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append("(");
        stringBuilder2.append(this.f414I);
        stringBuilder2.append(", ");
        stringBuilder2.append(this.f415J);
        stringBuilder2.append(") - (");
        stringBuilder2.append(this.f410E);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.f411F);
        stringBuilder2.append(") wrap: (");
        stringBuilder2.append(this.ao);
        stringBuilder2.append(" x ");
        stringBuilder2.append(this.ap);
        stringBuilder2.append(")");
        return stringBuilder2.toString();
    }

    /* renamed from: n */
    public int m376n() {
        return this.f414I;
    }

    /* renamed from: o */
    public int m378o() {
        return this.f415J;
    }

    /* renamed from: p */
    public int m380p() {
        if (this.as == 8) {
            return 0;
        }
        return this.f410E;
    }

    /* renamed from: q */
    public int m382q() {
        return this.ao;
    }

    /* renamed from: r */
    public int m384r() {
        if (this.as == 8) {
            return 0;
        }
        return this.f411F;
    }

    /* renamed from: s */
    public int m386s() {
        return this.ap;
    }

    /* renamed from: f */
    public int m360f(int i) {
        if (i == 0) {
            return m380p();
        }
        return i == 1 ? m384r() : 0;
    }

    /* renamed from: t */
    public int m388t() {
        return this.ak + this.f418M;
    }

    /* renamed from: u */
    public int m390u() {
        return this.al + this.f419N;
    }

    /* renamed from: v */
    protected int m391v() {
        return this.f414I + this.f418M;
    }

    /* renamed from: w */
    protected int m392w() {
        return this.f415J + this.f419N;
    }

    /* renamed from: x */
    public int m393x() {
        return m376n() + this.f410E;
    }

    /* renamed from: y */
    public int m394y() {
        return m378o() + this.f411F;
    }

    /* renamed from: g */
    public float m362g(int i) {
        if (i == 0) {
            return this.f423S;
        }
        return i == 1 ? this.f424T : -1082130432;
    }

    /* renamed from: z */
    public boolean m395z() {
        return this.f420O > 0;
    }

    /* renamed from: A */
    public int m313A() {
        return this.f420O;
    }

    /* renamed from: B */
    public Object m314B() {
        return this.aq;
    }

    /* renamed from: C */
    public ArrayList<ConstraintAnchor> mo39C() {
        return this.f407B;
    }

    /* renamed from: h */
    public void m364h(int i) {
        this.f414I = i;
    }

    /* renamed from: i */
    public void m367i(int i) {
        this.f415J = i;
    }

    /* renamed from: a */
    public void m324a(int i, int i2) {
        this.f414I = i;
        this.f415J = i2;
    }

    /* renamed from: b */
    public void mo51b(int i, int i2) {
        this.f418M = i;
        this.f419N = i2;
    }

    /* renamed from: D */
    public void mo49D() {
        int i = this.f414I;
        int i2 = this.f415J;
        int i3 = this.f414I + this.f410E;
        int i4 = this.f415J + this.f411F;
        this.ak = i;
        this.al = i2;
        this.am = i3 - i;
        this.an = i4 - i2;
    }

    /* renamed from: j */
    public void m369j(int i) {
        this.f410E = i;
        if (this.f410E < this.f421P) {
            this.f410E = this.f421P;
        }
    }

    /* renamed from: k */
    public void m371k(int i) {
        this.f411F = i;
        if (this.f411F < this.f422Q) {
            this.f411F = this.f422Q;
        }
    }

    /* renamed from: a */
    public void m326a(int i, int i2, int i3, float f) {
        this.f435e = i;
        this.f438h = i2;
        this.f439i = i3;
        this.f440j = f;
        if (f < 1065353216 && this.f435e == 0) {
            this.f435e = 2;
        }
    }

    /* renamed from: b */
    public void m342b(int i, int i2, int i3, float f) {
        this.f436f = i;
        this.f441k = i2;
        this.f442l = i3;
        this.f443m = f;
        if (f < 1065353216 && this.f436f == 0) {
            this.f436f = 2;
        }
    }

    /* renamed from: b */
    public void m345b(java.lang.String r9) {
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
        r8 = this;
        r0 = 0;
        if (r9 == 0) goto L_0x008e;
    L_0x0003:
        r1 = r9.length();
        if (r1 != 0) goto L_0x000b;
    L_0x0009:
        goto L_0x008e;
    L_0x000b:
        r1 = -1;
        r2 = r9.length();
        r3 = 44;
        r3 = r9.indexOf(r3);
        r4 = 0;
        r5 = 1;
        if (r3 <= 0) goto L_0x0037;
    L_0x001a:
        r6 = r2 + -1;
        if (r3 >= r6) goto L_0x0037;
    L_0x001e:
        r6 = r9.substring(r4, r3);
        r7 = "W";
        r7 = r6.equalsIgnoreCase(r7);
        if (r7 == 0) goto L_0x002c;
    L_0x002a:
        r1 = 0;
        goto L_0x0035;
    L_0x002c:
        r4 = "H";
        r4 = r6.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0035;
    L_0x0034:
        r1 = 1;
    L_0x0035:
        r4 = r3 + 1;
    L_0x0037:
        r3 = 58;
        r3 = r9.indexOf(r3);
        if (r3 < 0) goto L_0x0075;
    L_0x003f:
        r2 = r2 - r5;
        if (r3 >= r2) goto L_0x0075;
    L_0x0042:
        r2 = r9.substring(r4, r3);
        r3 = r3 + r5;
        r9 = r9.substring(r3);
        r3 = r2.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0051:
        r3 = r9.length();
        if (r3 <= 0) goto L_0x0084;
    L_0x0057:
        r2 = java.lang.Float.parseFloat(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0063:
        r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));	 Catch:{ NumberFormatException -> 0x0084 }
        if (r3 <= 0) goto L_0x0084;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0067:
        if (r1 != r5) goto L_0x006f;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x0069:
        r9 = r9 / r2;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;	 Catch:{ NumberFormatException -> 0x0084 }
    L_0x006f:
        r2 = r2 / r9;	 Catch:{ NumberFormatException -> 0x0084 }
        r9 = java.lang.Math.abs(r2);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0075:
        r9 = r9.substring(r4);
        r2 = r9.length();
        if (r2 <= 0) goto L_0x0084;
    L_0x007f:
        r9 = java.lang.Float.parseFloat(r9);	 Catch:{ NumberFormatException -> 0x0084 }
        goto L_0x0085;
    L_0x0084:
        r9 = 0;
    L_0x0085:
        r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x008d;
    L_0x0089:
        r8.f412G = r9;
        r8.f413H = r1;
    L_0x008d:
        return;
    L_0x008e:
        r8.f412G = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.b(java.lang.String):void");
    }

    /* renamed from: a */
    public void m323a(float f) {
        this.f423S = f;
    }

    /* renamed from: b */
    public void m339b(float f) {
        this.f424T = f;
    }

    /* renamed from: l */
    public void m373l(int i) {
        if (i < 0) {
            this.f421P = 0;
        } else {
            this.f421P = i;
        }
    }

    /* renamed from: m */
    public void m375m(int i) {
        if (i < 0) {
            this.f422Q = 0;
        } else {
            this.f422Q = i;
        }
    }

    /* renamed from: n */
    public void m377n(int i) {
        this.ao = i;
    }

    /* renamed from: o */
    public void m379o(int i) {
        this.ap = i;
    }

    /* renamed from: a */
    public void m327a(int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        this.f414I = i;
        this.f415J = i2;
        if (this.as == 8) {
            this.f410E = 0;
            this.f411F = 0;
            return;
        }
        if (this.f408C[0] == DimensionBehaviour.FIXED && i3 < this.f410E) {
            i3 = this.f410E;
        }
        if (this.f408C[1] == DimensionBehaviour.FIXED && i4 < this.f411F) {
            i4 = this.f411F;
        }
        this.f410E = i3;
        this.f411F = i4;
        if (this.f411F < this.f422Q) {
            this.f411F = this.f422Q;
        }
        if (this.f410E < this.f421P) {
            this.f410E = this.f421P;
        }
        this.f428X = true;
    }

    /* renamed from: a */
    public void m325a(int i, int i2, int i3) {
        if (i3 == 0) {
            m350c(i, i2);
        } else if (i3 == 1) {
            m355d(i, i2);
        }
        this.f428X = true;
    }

    /* renamed from: c */
    public void m350c(int i, int i2) {
        this.f414I = i;
        this.f410E = i2 - i;
        if (this.f410E < this.f421P) {
            this.f410E = this.f421P;
        }
    }

    /* renamed from: d */
    public void m355d(int i, int i2) {
        this.f415J = i;
        this.f411F = i2 - i;
        if (this.f411F < this.f422Q) {
            this.f411F = this.f422Q;
        }
    }

    /* renamed from: p */
    int m381p(int i) {
        if (i == 0) {
            return this.f416K;
        }
        return i == 1 ? this.f417L : 0;
    }

    /* renamed from: e */
    void m358e(int i, int i2) {
        if (i2 == 0) {
            this.f416K = i;
        } else if (i2 == 1) {
            this.f417L = i;
        }
    }

    /* renamed from: q */
    public void m383q(int i) {
        this.f420O = i;
    }

    /* renamed from: a */
    public void m334a(Object obj) {
        this.aq = obj;
    }

    /* renamed from: c */
    public void m348c(float f) {
        this.ad[0] = f;
    }

    /* renamed from: d */
    public void m353d(float f) {
        this.ad[1] = f;
    }

    /* renamed from: r */
    public void m385r(int i) {
        this.f430Z = i;
    }

    /* renamed from: s */
    public void m387s(int i) {
        this.aa = i;
    }

    /* renamed from: a */
    public boolean mo44a() {
        return this.as != 8;
    }

    /* renamed from: a */
    public void m330a(Type type, ConstraintWidget constraintWidget, Type type2, int i, int i2) {
        mo41a(type).m299a(constraintWidget.mo41a(type2), i, i2, Strength.STRONG, 0, true);
    }

    /* renamed from: E */
    public void m317E() {
        ConstraintWidget k = m370k();
        if (k == null || !(k instanceof C4403e) || !((C4403e) m370k()).m24061S()) {
            int size = this.f407B.size();
            for (int i = 0; i < size; i++) {
                ((ConstraintAnchor) this.f407B.get(i)).m308i();
            }
        }
    }

    /* renamed from: a */
    public ConstraintAnchor mo41a(Type type) {
        switch (type) {
            case LEFT:
                return this.f449s;
            case TOP:
                return this.f450t;
            case RIGHT:
                return this.f451u;
            case BOTTOM:
                return this.f452v;
            case BASELINE:
                return this.f453w;
            case CENTER:
                return this.f456z;
            case CENTER_X:
                return this.f454x;
            case CENTER_Y:
                return this.f455y;
            case NONE:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    /* renamed from: F */
    public DimensionBehaviour m318F() {
        return this.f408C[0];
    }

    /* renamed from: G */
    public DimensionBehaviour m319G() {
        return this.f408C[1];
    }

    /* renamed from: t */
    public DimensionBehaviour m389t(int i) {
        if (i == 0) {
            return m318F();
        }
        return i == 1 ? m319G() : 0;
    }

    /* renamed from: a */
    public void m331a(DimensionBehaviour dimensionBehaviour) {
        this.f408C[0] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            m369j(this.ao);
        }
    }

    /* renamed from: b */
    public void m344b(DimensionBehaviour dimensionBehaviour) {
        this.f408C[1] = dimensionBehaviour;
        if (dimensionBehaviour == DimensionBehaviour.WRAP_CONTENT) {
            m371k(this.ap);
        }
    }

    /* renamed from: H */
    public boolean m320H() {
        return (this.f449s.f390c != null && this.f449s.f390c.f390c == this.f449s) || (this.f451u.f390c != null && this.f451u.f390c.f390c == this.f451u);
    }

    /* renamed from: I */
    public boolean m321I() {
        return (this.f450t.f390c != null && this.f450t.f390c.f390c == this.f450t) || (this.f452v.f390c != null && this.f452v.f390c.f390c == this.f452v);
    }

    /* renamed from: a */
    private boolean mo42a(int i) {
        i *= 2;
        if (!(this.f406A[i].f390c == null || this.f406A[i].f390c.f390c == this.f406A[i])) {
            i++;
            if (this.f406A[i].f390c != null && this.f406A[i].f390c.f390c == this.f406A[i]) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo43a(C0097e c0097e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        SolverVariable solverVariable;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        boolean z6;
        boolean z7;
        boolean j;
        boolean z8;
        SolverVariable solverVariable2;
        SolverVariable solverVariable3;
        boolean z9;
        SolverVariable solverVariable4;
        C0097e c0097e2;
        SolverVariable solverVariable5;
        boolean z10;
        boolean z11;
        SolverVariable solverVariable6;
        ConstraintWidget constraintWidget;
        C0097e c0097e3 = c0097e;
        SolverVariable a = c0097e3.m273a(this.f449s);
        SolverVariable a2 = c0097e3.m273a(this.f451u);
        SolverVariable a3 = c0097e3.m273a(this.f450t);
        SolverVariable a4 = c0097e3.m273a(this.f452v);
        SolverVariable a5 = c0097e3.m273a(this.f453w);
        if (this.f409D != null) {
            boolean z12;
            z = r15.f409D != null && r15.f409D.f408C[0] == DimensionBehaviour.WRAP_CONTENT;
            boolean z13 = r15.f409D != null && r15.f409D.f408C[1] == DimensionBehaviour.WRAP_CONTENT;
            if (mo42a(0)) {
                ((C4403e) r15.f409D).m24064a(r15, 0);
                z12 = true;
            } else {
                z12 = m320H();
            }
            if (mo42a(1)) {
                ((C4403e) r15.f409D).m24064a(r15, 1);
                z2 = true;
            } else {
                z2 = m321I();
            }
            if (z && r15.as != 8 && r15.f449s.f390c == null && r15.f451u.f390c == null) {
                c0097e3.m276a(c0097e3.m273a(r15.f409D.f451u), a2, 0, 1);
            }
            if (z13 && r15.as != 8 && r15.f450t.f390c == null && r15.f452v.f390c == null && r15.f453w == null) {
                c0097e3.m276a(c0097e3.m273a(r15.f409D.f452v), a4, 0, 1);
            }
            z3 = z13;
            z4 = z12;
            z5 = z2;
        } else {
            z = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        int i5 = r15.f410E;
        if (i5 < r15.f421P) {
            i5 = r15.f421P;
        }
        int i6 = r15.f411F;
        if (i6 < r15.f422Q) {
            i6 = r15.f422Q;
        }
        z2 = r15.f408C[0] != DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z14 = r15.f408C[1] != DimensionBehaviour.MATCH_CONSTRAINT;
        r15.f446p = r15.f413H;
        r15.f447q = r15.f412G;
        int i7 = r15.f435e;
        int i8 = r15.f436f;
        if (r15.f412G <= 0.0f || r15.as == 8) {
            solverVariable = a5;
            i = i8;
            i2 = i5;
            i3 = i6;
            i4 = i7;
        } else {
            solverVariable = a5;
            if (r15.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT && i7 == 0) {
                i7 = 3;
            }
            if (r15.f408C[1] == DimensionBehaviour.MATCH_CONSTRAINT && i8 == 0) {
                i8 = 3;
            }
            if (r15.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT && r15.f408C[1] == DimensionBehaviour.MATCH_CONSTRAINT && i7 == 3 && i8 == 3) {
                m336a(z, z3, z2, z14);
            } else if (r15.f408C[0] == DimensionBehaviour.MATCH_CONSTRAINT && i7 == 3) {
                r15.f446p = 0;
                r1 = (int) (r15.f447q * ((float) r15.f411F));
                if (r15.f408C[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i2 = r1;
                    i = i8;
                    i3 = i6;
                    i4 = 4;
                } else {
                    i2 = r1;
                    i = i8;
                    i3 = i6;
                    i4 = i7;
                    obj = 1;
                    r15.f437g[0] = i4;
                    r15.f437g[1] = i;
                    if (obj == null) {
                        if (r15.f446p == 0) {
                            if (r15.f446p == -1) {
                            }
                        }
                        z6 = true;
                        if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        j = r15.f456z.m309j() ^ 1;
                        if (r15.f431a == 2) {
                            if (r15.f409D == null) {
                            }
                            if (r15.f409D == null) {
                            }
                            z8 = z3;
                            solverVariable2 = solverVariable;
                            solverVariable = a4;
                            solverVariable3 = a3;
                            z9 = z7;
                            solverVariable4 = a2;
                            m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
                        } else {
                            solverVariable3 = a3;
                            solverVariable4 = a2;
                            z8 = z3;
                            solverVariable2 = solverVariable;
                            solverVariable = a4;
                        }
                        if (this.f432b != 2) {
                            if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
                            }
                            if (obj == null) {
                            }
                            if (r15.f420O <= 0) {
                                a4 = solverVariable3;
                                c0097e2 = c0097e;
                            } else if (r15.f453w.m296a().i != 1) {
                                c0097e2 = c0097e;
                                r15.f453w.m296a().m14804a(c0097e2);
                                a4 = solverVariable3;
                            } else {
                                c0097e2 = c0097e;
                                solverVariable5 = solverVariable2;
                                a4 = solverVariable3;
                                c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                                if (r15.f453w.f390c != null) {
                                    c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                                    z10 = false;
                                    if (r15.f409D == null) {
                                    }
                                    if (r15.f409D == null) {
                                    }
                                    z11 = z8;
                                    solverVariable6 = a4;
                                    m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                                    if (obj == null) {
                                        constraintWidget = this;
                                    } else if (this.f446p != 1) {
                                        c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                                    } else {
                                        c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                                    }
                                    if (constraintWidget.f456z.m309j()) {
                                        c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                                    }
                                }
                            }
                            z10 = j;
                            if (r15.f409D == null) {
                            }
                            if (r15.f409D == null) {
                            }
                            z11 = z8;
                            solverVariable6 = a4;
                            m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                            if (obj == null) {
                                constraintWidget = this;
                            } else if (this.f446p != 1) {
                                c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                            } else {
                                c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                            }
                            if (constraintWidget.f456z.m309j()) {
                                c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                            }
                        }
                    }
                    z6 = false;
                    if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    j = r15.f456z.m309j() ^ 1;
                    if (r15.f431a == 2) {
                        solverVariable3 = a3;
                        solverVariable4 = a2;
                        z8 = z3;
                        solverVariable2 = solverVariable;
                        solverVariable = a4;
                    } else {
                        if (r15.f409D == null) {
                        }
                        if (r15.f409D == null) {
                        }
                        z8 = z3;
                        solverVariable2 = solverVariable;
                        solverVariable = a4;
                        solverVariable3 = a3;
                        z9 = z7;
                        solverVariable4 = a2;
                        m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
                    }
                    if (this.f432b != 2) {
                        if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (r15.f420O <= 0) {
                            a4 = solverVariable3;
                            c0097e2 = c0097e;
                        } else if (r15.f453w.m296a().i != 1) {
                            c0097e2 = c0097e;
                            solverVariable5 = solverVariable2;
                            a4 = solverVariable3;
                            c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                            if (r15.f453w.f390c != null) {
                                c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                                z10 = false;
                                if (r15.f409D == null) {
                                }
                                if (r15.f409D == null) {
                                }
                                z11 = z8;
                                solverVariable6 = a4;
                                m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                                if (obj == null) {
                                    constraintWidget = this;
                                } else if (this.f446p != 1) {
                                    c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                                } else {
                                    c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                                }
                                if (constraintWidget.f456z.m309j()) {
                                    c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                                }
                            }
                        } else {
                            c0097e2 = c0097e;
                            r15.f453w.m296a().m14804a(c0097e2);
                            a4 = solverVariable3;
                        }
                        z10 = j;
                        if (r15.f409D == null) {
                        }
                        if (r15.f409D == null) {
                        }
                        z11 = z8;
                        solverVariable6 = a4;
                        m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                        if (obj == null) {
                            constraintWidget = this;
                        } else if (this.f446p != 1) {
                            c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                        } else {
                            c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                        }
                        if (constraintWidget.f456z.m309j()) {
                            c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                        }
                    }
                }
            } else if (r15.f408C[1] == DimensionBehaviour.MATCH_CONSTRAINT && i8 == 3) {
                r15.f446p = 1;
                if (r15.f413H == -1) {
                    r15.f447q = 1.0f / r15.f447q;
                }
                r1 = (int) (r15.f447q * ((float) r15.f410E));
                if (r15.f408C[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    i3 = r1;
                    i2 = i5;
                    i4 = i7;
                    i = 4;
                } else {
                    i3 = r1;
                    i = i8;
                    i2 = i5;
                    i4 = i7;
                    obj = 1;
                    r15.f437g[0] = i4;
                    r15.f437g[1] = i;
                    if (obj == null) {
                        if (r15.f446p == 0) {
                            if (r15.f446p == -1) {
                            }
                        }
                        z6 = true;
                        z7 = r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT && (r15 instanceof C4403e);
                        j = r15.f456z.m309j() ^ 1;
                        if (r15.f431a == 2) {
                            z8 = z3;
                            solverVariable2 = solverVariable;
                            solverVariable = a4;
                            solverVariable3 = a3;
                            z9 = z7;
                            solverVariable4 = a2;
                            m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
                        } else {
                            solverVariable3 = a3;
                            solverVariable4 = a2;
                            z8 = z3;
                            solverVariable2 = solverVariable;
                            solverVariable = a4;
                        }
                        if (this.f432b != 2) {
                            z9 = r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT && (r15 instanceof C4403e);
                            z4 = obj == null && (r15.f446p == 1 || r15.f446p == -1);
                            if (r15.f420O <= 0) {
                                a4 = solverVariable3;
                                c0097e2 = c0097e;
                            } else if (r15.f453w.m296a().i != 1) {
                                c0097e2 = c0097e;
                                r15.f453w.m296a().m14804a(c0097e2);
                                a4 = solverVariable3;
                            } else {
                                c0097e2 = c0097e;
                                solverVariable5 = solverVariable2;
                                a4 = solverVariable3;
                                c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                                if (r15.f453w.f390c != null) {
                                    c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                                    z10 = false;
                                    z11 = z8;
                                    solverVariable6 = a4;
                                    m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                                    if (obj == null) {
                                        constraintWidget = this;
                                    } else if (this.f446p != 1) {
                                        c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                                    } else {
                                        c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                                    }
                                    if (constraintWidget.f456z.m309j()) {
                                        c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                                    }
                                }
                            }
                            z10 = j;
                            if (r15.f409D == null) {
                            }
                            if (r15.f409D == null) {
                            }
                            z11 = z8;
                            solverVariable6 = a4;
                            m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                            if (obj == null) {
                                constraintWidget = this;
                            } else if (this.f446p != 1) {
                                c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                            } else {
                                c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                            }
                            if (constraintWidget.f456z.m309j()) {
                                c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                            }
                        }
                    }
                    z6 = false;
                    if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    j = r15.f456z.m309j() ^ 1;
                    if (r15.f431a == 2) {
                        solverVariable3 = a3;
                        solverVariable4 = a2;
                        z8 = z3;
                        solverVariable2 = solverVariable;
                        solverVariable = a4;
                    } else {
                        if (r15.f409D == null) {
                        }
                        if (r15.f409D == null) {
                        }
                        z8 = z3;
                        solverVariable2 = solverVariable;
                        solverVariable = a4;
                        solverVariable3 = a3;
                        z9 = z7;
                        solverVariable4 = a2;
                        m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
                    }
                    if (this.f432b != 2) {
                        if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
                        }
                        if (obj == null) {
                        }
                        if (r15.f420O <= 0) {
                            a4 = solverVariable3;
                            c0097e2 = c0097e;
                        } else if (r15.f453w.m296a().i != 1) {
                            c0097e2 = c0097e;
                            solverVariable5 = solverVariable2;
                            a4 = solverVariable3;
                            c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                            if (r15.f453w.f390c != null) {
                                c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                                z10 = false;
                                if (r15.f409D == null) {
                                }
                                if (r15.f409D == null) {
                                }
                                z11 = z8;
                                solverVariable6 = a4;
                                m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                                if (obj == null) {
                                    constraintWidget = this;
                                } else if (this.f446p != 1) {
                                    c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                                } else {
                                    c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                                }
                                if (constraintWidget.f456z.m309j()) {
                                    c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                                }
                            }
                        } else {
                            c0097e2 = c0097e;
                            r15.f453w.m296a().m14804a(c0097e2);
                            a4 = solverVariable3;
                        }
                        z10 = j;
                        if (r15.f409D == null) {
                        }
                        if (r15.f409D == null) {
                        }
                        z11 = z8;
                        solverVariable6 = a4;
                        m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                        if (obj == null) {
                            constraintWidget = this;
                        } else if (this.f446p != 1) {
                            c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                        } else {
                            c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                        }
                        if (constraintWidget.f456z.m309j()) {
                            c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                        }
                    }
                }
            }
            i = i8;
            i2 = i5;
            i3 = i6;
            i4 = i7;
            obj = 1;
            r15.f437g[0] = i4;
            r15.f437g[1] = i;
            if (obj == null) {
                if (r15.f446p == 0) {
                    if (r15.f446p == -1) {
                    }
                }
                z6 = true;
                if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
                }
                j = r15.f456z.m309j() ^ 1;
                if (r15.f431a == 2) {
                    if (r15.f409D == null) {
                    }
                    if (r15.f409D == null) {
                    }
                    z8 = z3;
                    solverVariable2 = solverVariable;
                    solverVariable = a4;
                    solverVariable3 = a3;
                    z9 = z7;
                    solverVariable4 = a2;
                    m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
                } else {
                    solverVariable3 = a3;
                    solverVariable4 = a2;
                    z8 = z3;
                    solverVariable2 = solverVariable;
                    solverVariable = a4;
                }
                if (this.f432b != 2) {
                    if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
                    }
                    if (obj == null) {
                    }
                    if (r15.f420O <= 0) {
                        a4 = solverVariable3;
                        c0097e2 = c0097e;
                    } else if (r15.f453w.m296a().i != 1) {
                        c0097e2 = c0097e;
                        r15.f453w.m296a().m14804a(c0097e2);
                        a4 = solverVariable3;
                    } else {
                        c0097e2 = c0097e;
                        solverVariable5 = solverVariable2;
                        a4 = solverVariable3;
                        c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                        if (r15.f453w.f390c != null) {
                            c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                            z10 = false;
                            if (r15.f409D == null) {
                            }
                            if (r15.f409D == null) {
                            }
                            z11 = z8;
                            solverVariable6 = a4;
                            m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                            if (obj == null) {
                                constraintWidget = this;
                            } else if (this.f446p != 1) {
                                c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                            } else {
                                c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                            }
                            if (constraintWidget.f456z.m309j()) {
                                c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                            }
                        }
                    }
                    z10 = j;
                    if (r15.f409D == null) {
                    }
                    if (r15.f409D == null) {
                    }
                    z11 = z8;
                    solverVariable6 = a4;
                    m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                    if (obj == null) {
                        constraintWidget = this;
                    } else if (this.f446p != 1) {
                        c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                    } else {
                        c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                    }
                    if (constraintWidget.f456z.m309j()) {
                        c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                    }
                }
            }
            z6 = false;
            if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
            }
            j = r15.f456z.m309j() ^ 1;
            if (r15.f431a == 2) {
                solverVariable3 = a3;
                solverVariable4 = a2;
                z8 = z3;
                solverVariable2 = solverVariable;
                solverVariable = a4;
            } else {
                if (r15.f409D == null) {
                }
                if (r15.f409D == null) {
                }
                z8 = z3;
                solverVariable2 = solverVariable;
                solverVariable = a4;
                solverVariable3 = a3;
                z9 = z7;
                solverVariable4 = a2;
                m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
            }
            if (this.f432b != 2) {
                if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
                }
                if (obj == null) {
                }
                if (r15.f420O <= 0) {
                    a4 = solverVariable3;
                    c0097e2 = c0097e;
                } else if (r15.f453w.m296a().i != 1) {
                    c0097e2 = c0097e;
                    solverVariable5 = solverVariable2;
                    a4 = solverVariable3;
                    c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                    if (r15.f453w.f390c != null) {
                        c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                        z10 = false;
                        if (r15.f409D == null) {
                        }
                        if (r15.f409D == null) {
                        }
                        z11 = z8;
                        solverVariable6 = a4;
                        m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                        if (obj == null) {
                            constraintWidget = this;
                        } else if (this.f446p != 1) {
                            c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                        } else {
                            c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                        }
                        if (constraintWidget.f456z.m309j()) {
                            c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                        }
                    }
                } else {
                    c0097e2 = c0097e;
                    r15.f453w.m296a().m14804a(c0097e2);
                    a4 = solverVariable3;
                }
                z10 = j;
                if (r15.f409D == null) {
                }
                if (r15.f409D == null) {
                }
                z11 = z8;
                solverVariable6 = a4;
                m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                if (obj == null) {
                    constraintWidget = this;
                } else if (this.f446p != 1) {
                    c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                } else {
                    c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                }
                if (constraintWidget.f456z.m309j()) {
                    c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                }
            }
        }
        obj = null;
        r15.f437g[0] = i4;
        r15.f437g[1] = i;
        if (obj == null) {
            if (r15.f446p == 0) {
                if (r15.f446p == -1) {
                }
            }
            z6 = true;
            if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
            }
            j = r15.f456z.m309j() ^ 1;
            if (r15.f431a == 2) {
                if (r15.f409D == null) {
                }
                if (r15.f409D == null) {
                }
                z8 = z3;
                solverVariable2 = solverVariable;
                solverVariable = a4;
                solverVariable3 = a3;
                z9 = z7;
                solverVariable4 = a2;
                m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
            } else {
                solverVariable3 = a3;
                solverVariable4 = a2;
                z8 = z3;
                solverVariable2 = solverVariable;
                solverVariable = a4;
            }
            if (this.f432b != 2) {
                if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
                }
                if (obj == null) {
                }
                if (r15.f420O <= 0) {
                    a4 = solverVariable3;
                    c0097e2 = c0097e;
                } else if (r15.f453w.m296a().i != 1) {
                    c0097e2 = c0097e;
                    r15.f453w.m296a().m14804a(c0097e2);
                    a4 = solverVariable3;
                } else {
                    c0097e2 = c0097e;
                    solverVariable5 = solverVariable2;
                    a4 = solverVariable3;
                    c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                    if (r15.f453w.f390c != null) {
                        c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                        z10 = false;
                        if (r15.f409D == null) {
                        }
                        if (r15.f409D == null) {
                        }
                        z11 = z8;
                        solverVariable6 = a4;
                        m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                        if (obj == null) {
                            constraintWidget = this;
                        } else if (this.f446p != 1) {
                            c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                        } else {
                            c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                        }
                        if (constraintWidget.f456z.m309j()) {
                            c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                        }
                    }
                }
                z10 = j;
                if (r15.f409D == null) {
                }
                if (r15.f409D == null) {
                }
                z11 = z8;
                solverVariable6 = a4;
                m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                if (obj == null) {
                    constraintWidget = this;
                } else if (this.f446p != 1) {
                    c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                } else {
                    c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                }
                if (constraintWidget.f456z.m309j()) {
                    c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                }
            }
        }
        z6 = false;
        if (r15.f408C[0] != DimensionBehaviour.WRAP_CONTENT) {
        }
        j = r15.f456z.m309j() ^ 1;
        if (r15.f431a == 2) {
            solverVariable3 = a3;
            solverVariable4 = a2;
            z8 = z3;
            solverVariable2 = solverVariable;
            solverVariable = a4;
        } else {
            if (r15.f409D == null) {
            }
            if (r15.f409D == null) {
            }
            z8 = z3;
            solverVariable2 = solverVariable;
            solverVariable = a4;
            solverVariable3 = a3;
            z9 = z7;
            solverVariable4 = a2;
            m311a(c0097e, z, r15.f409D == null ? c0097e3.m273a(r15.f409D.f449s) : null, r15.f409D == null ? c0097e3.m273a(r15.f409D.f451u) : null, r15.f408C[0], z9, r15.f449s, r15.f451u, r15.f414I, i2, r15.f421P, r15.ai[0], r15.f423S, z6, z4, i4, r15.f438h, r15.f439i, r15.f440j, j);
        }
        if (this.f432b != 2) {
            if (r15.f408C[1] != DimensionBehaviour.WRAP_CONTENT) {
            }
            if (obj == null) {
            }
            if (r15.f420O <= 0) {
                a4 = solverVariable3;
                c0097e2 = c0097e;
            } else if (r15.f453w.m296a().i != 1) {
                c0097e2 = c0097e;
                solverVariable5 = solverVariable2;
                a4 = solverVariable3;
                c0097e2.m288c(solverVariable5, a4, m313A(), 6);
                if (r15.f453w.f390c != null) {
                    c0097e2.m288c(solverVariable5, c0097e2.m273a(r15.f453w.f390c), 0, 6);
                    z10 = false;
                    if (r15.f409D == null) {
                    }
                    if (r15.f409D == null) {
                    }
                    z11 = z8;
                    solverVariable6 = a4;
                    m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
                    if (obj == null) {
                        constraintWidget = this;
                    } else if (this.f446p != 1) {
                        c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
                    } else {
                        c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
                    }
                    if (constraintWidget.f456z.m309j()) {
                        c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
                    }
                }
            } else {
                c0097e2 = c0097e;
                r15.f453w.m296a().m14804a(c0097e2);
                a4 = solverVariable3;
            }
            z10 = j;
            if (r15.f409D == null) {
            }
            if (r15.f409D == null) {
            }
            z11 = z8;
            solverVariable6 = a4;
            m311a(c0097e, z11, r15.f409D == null ? c0097e2.m273a(r15.f409D.f450t) : null, r15.f409D == null ? c0097e2.m273a(r15.f409D.f452v) : null, r15.f408C[1], z9, r15.f450t, r15.f452v, r15.f415J, i3, r15.f422Q, r15.ai[1], r15.f424T, z4, z5, i, r15.f441k, r15.f442l, r15.f443m, z10);
            if (obj == null) {
                constraintWidget = this;
            } else if (this.f446p != 1) {
                c0097e.m277a(solverVariable4, a, solverVariable, solverVariable6, constraintWidget.f447q, 6);
            } else {
                c0097e.m277a(solverVariable, solverVariable6, solverVariable4, a, constraintWidget.f447q, 6);
            }
            if (constraintWidget.f456z.m309j()) {
                c0097e.m282a(constraintWidget, constraintWidget.f456z.m306g().m302c(), (float) Math.toRadians((double) (constraintWidget.aj + 90.0f)), constraintWidget.f456z.m304e());
            }
        }
    }

    /* renamed from: a */
    public void m336a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.f446p == -1) {
            if (z3 && !z4) {
                this.f446p = 0;
            } else if (!z3 && z4) {
                this.f446p = 1;
                if (this.f413H) {
                    this.f447q = true / this.f447q;
                }
            }
        }
        if (!this.f446p && (!this.f450t.m309j() || !this.f452v.m309j())) {
            this.f446p = 1;
        } else if (this.f446p && !(this.f449s.m309j() && this.f451u.m309j())) {
            this.f446p = 0;
        }
        if (this.f446p && !(this.f450t.m309j() && this.f452v.m309j() && this.f449s.m309j() && this.f451u.m309j())) {
            if (this.f450t.m309j() && this.f452v.m309j()) {
                this.f446p = 0;
            } else if (this.f449s.m309j() && this.f451u.m309j()) {
                this.f447q = true / this.f447q;
                this.f446p = 1;
            }
        }
        if (this.f446p) {
            if (z && !z2) {
                this.f446p = 0;
            } else if (!z && z2) {
                this.f447q = true / this.f447q;
                this.f446p = 1;
            }
        }
        if (this.f446p) {
            if (this.f438h <= false && !this.f441k) {
                this.f446p = 0;
            } else if (!this.f438h && this.f441k <= false) {
                this.f447q = true / this.f447q;
                this.f446p = 1;
            }
        }
        if (this.f446p && z && z2) {
            this.f447q = 1.0f / this.f447q;
            this.f446p = 1;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private void m311a(android.support.constraint.solver.C0097e r31, boolean r32, android.support.constraint.solver.SolverVariable r33, android.support.constraint.solver.SolverVariable r34, android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour r35, boolean r36, android.support.constraint.solver.widgets.ConstraintAnchor r37, android.support.constraint.solver.widgets.ConstraintAnchor r38, int r39, int r40, int r41, int r42, float r43, boolean r44, boolean r45, int r46, int r47, int r48, float r49, boolean r50) {
        /*
        r30 = this;
        r0 = r30;
        r10 = r31;
        r11 = r33;
        r12 = r34;
        r13 = r37;
        r14 = r38;
        r1 = r41;
        r2 = r42;
        r9 = r10.m273a(r13);
        r8 = r10.m273a(r14);
        r6 = r37.m306g();
        r7 = r10.m273a(r6);
        r6 = r38.m306g();
        r6 = r10.m273a(r6);
        r14 = r10.f326c;
        r15 = 1;
        if (r14 == 0) goto L_0x0066;
    L_0x002e:
        r14 = r37.m296a();
        r14 = r14.i;
        r13 = 1;
        if (r14 != r13) goto L_0x0066;
    L_0x0037:
        r14 = r38.m296a();
        r14 = r14.i;
        if (r14 != r13) goto L_0x0066;
    L_0x003f:
        r1 = android.support.constraint.solver.C0097e.m264a();
        if (r1 == 0) goto L_0x004e;
    L_0x0045:
        r1 = android.support.constraint.solver.C0097e.m264a();
        r2 = r1.f362s;
        r2 = r2 + r15;
        r1.f362s = r2;
    L_0x004e:
        r1 = r37.m296a();
        r1.m14804a(r10);
        r1 = r38.m296a();
        r1.m14804a(r10);
        if (r45 != 0) goto L_0x0065;
    L_0x005e:
        if (r32 == 0) goto L_0x0065;
    L_0x0060:
        r1 = 0;
        r2 = 6;
        r10.m276a(r12, r8, r1, r2);
    L_0x0065:
        return;
    L_0x0066:
        r13 = android.support.constraint.solver.C0097e.m264a();
        if (r13 == 0) goto L_0x0075;
    L_0x006c:
        r13 = android.support.constraint.solver.C0097e.m264a();
        r11 = r13.f341B;
        r11 = r11 + r15;
        r13.f341B = r11;
    L_0x0075:
        r11 = r37.m309j();
        r12 = r38.m309j();
        r13 = r0.f456z;
        r13 = r13.m309j();
        if (r11 == 0) goto L_0x0087;
    L_0x0085:
        r14 = 1;
        goto L_0x0088;
    L_0x0087:
        r14 = 0;
    L_0x0088:
        if (r12 == 0) goto L_0x008c;
    L_0x008a:
        r14 = r14 + 1;
    L_0x008c:
        if (r13 == 0) goto L_0x0090;
    L_0x008e:
        r14 = r14 + 1;
    L_0x0090:
        r21 = r6;
        if (r44 == 0) goto L_0x0096;
    L_0x0094:
        r6 = 3;
        goto L_0x0098;
    L_0x0096:
        r6 = r46;
    L_0x0098:
        r15 = android.support.constraint.solver.widgets.ConstraintWidget.C01021.f399b;
        r16 = r35.ordinal();
        r15 = r15[r16];
        r3 = 4;
        switch(r15) {
            case 1: goto L_0x00a4;
            case 2: goto L_0x00a4;
            case 3: goto L_0x00a4;
            case 4: goto L_0x00a6;
            default: goto L_0x00a4;
        };
    L_0x00a4:
        r15 = 0;
        goto L_0x00aa;
    L_0x00a6:
        if (r6 != r3) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00a4;
    L_0x00a9:
        r15 = 1;
    L_0x00aa:
        r3 = r0.as;
        r22 = r14;
        r14 = 8;
        if (r3 != r14) goto L_0x00b5;
    L_0x00b2:
        r3 = 0;
        r15 = 0;
        goto L_0x00b7;
    L_0x00b5:
        r3 = r40;
    L_0x00b7:
        if (r50 == 0) goto L_0x00d4;
    L_0x00b9:
        if (r11 != 0) goto L_0x00c5;
    L_0x00bb:
        if (r12 != 0) goto L_0x00c5;
    L_0x00bd:
        if (r13 != 0) goto L_0x00c5;
    L_0x00bf:
        r14 = r39;
        r10.m274a(r9, r14);
        goto L_0x00d4;
    L_0x00c5:
        if (r11 == 0) goto L_0x00d4;
    L_0x00c7:
        if (r12 != 0) goto L_0x00d4;
    L_0x00c9:
        r14 = r37.m304e();
        r23 = r13;
        r13 = 6;
        r10.m288c(r9, r7, r14, r13);
        goto L_0x00d7;
    L_0x00d4:
        r23 = r13;
        r13 = 6;
    L_0x00d7:
        if (r15 != 0) goto L_0x0100;
    L_0x00d9:
        if (r36 == 0) goto L_0x00f1;
    L_0x00db:
        r13 = 3;
        r14 = 0;
        r10.m288c(r8, r9, r14, r13);
        if (r1 <= 0) goto L_0x00e7;
    L_0x00e2:
        r13 = 6;
        r10.m276a(r8, r9, r1, r13);
        goto L_0x00e8;
    L_0x00e7:
        r13 = 6;
    L_0x00e8:
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r2 >= r3) goto L_0x00f4;
    L_0x00ed:
        r10.m285b(r8, r9, r2, r13);
        goto L_0x00f4;
    L_0x00f1:
        r10.m288c(r8, r9, r3, r13);
    L_0x00f4:
        r27 = r47;
        r14 = r48;
        r24 = r7;
    L_0x00fa:
        r2 = r22;
    L_0x00fc:
        r16 = 4;
        goto L_0x01cc;
    L_0x0100:
        r2 = -2;
        r14 = r47;
        if (r14 != r2) goto L_0x0109;
    L_0x0105:
        r14 = r48;
        r13 = r3;
        goto L_0x010c;
    L_0x0109:
        r13 = r14;
        r14 = r48;
    L_0x010c:
        if (r14 != r2) goto L_0x010f;
    L_0x010e:
        r14 = r3;
    L_0x010f:
        if (r13 <= 0) goto L_0x011a;
    L_0x0111:
        r2 = 6;
        r10.m276a(r8, r9, r13, r2);
        r3 = java.lang.Math.max(r3, r13);
        goto L_0x011b;
    L_0x011a:
        r2 = 6;
    L_0x011b:
        if (r14 <= 0) goto L_0x0124;
    L_0x011d:
        r10.m285b(r8, r9, r14, r2);
        r3 = java.lang.Math.min(r3, r14);
    L_0x0124:
        r2 = 1;
        if (r6 != r2) goto L_0x013c;
    L_0x0127:
        if (r32 == 0) goto L_0x012f;
    L_0x0129:
        r2 = 6;
        r10.m288c(r8, r9, r3, r2);
        goto L_0x01a2;
    L_0x012f:
        if (r45 == 0) goto L_0x0137;
    L_0x0131:
        r2 = 4;
        r10.m288c(r8, r9, r3, r2);
        goto L_0x01a2;
    L_0x0137:
        r2 = 1;
        r10.m288c(r8, r9, r3, r2);
        goto L_0x01a2;
    L_0x013c:
        r2 = 2;
        if (r6 != r2) goto L_0x01a2;
    L_0x013f:
        r2 = r37.m303d();
        r24 = r7;
        r7 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        if (r2 == r7) goto L_0x0171;
    L_0x0149:
        r2 = r37.m303d();
        r7 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        if (r2 != r7) goto L_0x0152;
    L_0x0151:
        goto L_0x0171;
    L_0x0152:
        r2 = r0.f409D;
        r7 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT;
        r2 = r2.mo41a(r7);
        r2 = r10.m273a(r2);
        r7 = r0.f409D;
        r25 = r2;
        r2 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT;
        r2 = r7.mo41a(r2);
        r2 = r10.m273a(r2);
        r18 = r2;
        r19 = r25;
        goto L_0x018f;
    L_0x0171:
        r2 = r0.f409D;
        r7 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP;
        r2 = r2.mo41a(r7);
        r2 = r10.m273a(r2);
        r7 = r0.f409D;
        r26 = r2;
        r2 = android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM;
        r2 = r7.mo41a(r2);
        r2 = r10.m273a(r2);
        r18 = r2;
        r19 = r26;
    L_0x018f:
        r15 = r31.m287c();
        r16 = r8;
        r17 = r9;
        r20 = r49;
        r2 = r15.m14766a(r16, r17, r18, r19, r20);
        r10.m279a(r2);
        r15 = 0;
        goto L_0x01a4;
    L_0x01a2:
        r24 = r7;
    L_0x01a4:
        if (r15 == 0) goto L_0x01c8;
    L_0x01a6:
        r2 = r22;
        r7 = 2;
        if (r2 == r7) goto L_0x01c4;
    L_0x01ab:
        r16 = 4;
        if (r44 != 0) goto L_0x01c1;
    L_0x01af:
        r3 = java.lang.Math.max(r13, r3);
        if (r14 <= 0) goto L_0x01b9;
    L_0x01b5:
        r3 = java.lang.Math.min(r14, r3);
    L_0x01b9:
        r27 = r13;
        r13 = 6;
        r10.m288c(r8, r9, r3, r13);
        r15 = 0;
        goto L_0x01cc;
    L_0x01c1:
        r27 = r13;
        goto L_0x01cc;
    L_0x01c4:
        r27 = r13;
        goto L_0x00fc;
    L_0x01c8:
        r27 = r13;
        goto L_0x00fa;
    L_0x01cc:
        if (r50 == 0) goto L_0x0313;
    L_0x01ce:
        if (r45 == 0) goto L_0x01db;
    L_0x01d0:
        r0 = r8;
        r5 = r9;
        r1 = 0;
        r3 = 6;
        r4 = r34;
        r6 = 2;
        r11 = r33;
        goto L_0x031c;
    L_0x01db:
        r13 = 5;
        if (r11 != 0) goto L_0x01f2;
    L_0x01de:
        if (r12 != 0) goto L_0x01f2;
    L_0x01e0:
        if (r23 != 0) goto L_0x01f2;
    L_0x01e2:
        if (r32 == 0) goto L_0x01eb;
    L_0x01e4:
        r2 = 0;
        r5 = r34;
        r10.m276a(r5, r8, r2, r13);
        goto L_0x01ed;
    L_0x01eb:
        r5 = r34;
    L_0x01ed:
        r0 = r8;
    L_0x01ee:
        r1 = 0;
        r3 = 6;
        goto L_0x030b;
    L_0x01f2:
        r2 = 0;
        r5 = r34;
        if (r11 == 0) goto L_0x01ff;
    L_0x01f7:
        if (r12 != 0) goto L_0x01ff;
    L_0x01f9:
        if (r32 == 0) goto L_0x01ed;
    L_0x01fb:
        r10.m276a(r5, r8, r2, r13);
        goto L_0x01ed;
    L_0x01ff:
        if (r11 != 0) goto L_0x0216;
    L_0x0201:
        if (r12 == 0) goto L_0x0216;
    L_0x0203:
        r1 = r38.m304e();
        r1 = -r1;
        r4 = r21;
        r3 = 6;
        r10.m288c(r8, r4, r1, r3);
        if (r32 == 0) goto L_0x01ed;
    L_0x0210:
        r3 = r33;
        r10.m276a(r9, r3, r2, r13);
        goto L_0x01ed;
    L_0x0216:
        r4 = r21;
        r3 = r33;
        if (r11 == 0) goto L_0x01ed;
    L_0x021c:
        if (r12 == 0) goto L_0x01ed;
    L_0x021e:
        if (r15 == 0) goto L_0x027f;
    L_0x0220:
        if (r32 == 0) goto L_0x0228;
    L_0x0222:
        if (r1 != 0) goto L_0x0228;
    L_0x0224:
        r1 = 6;
        r10.m276a(r8, r9, r2, r1);
    L_0x0228:
        if (r6 != 0) goto L_0x0252;
    L_0x022a:
        if (r14 > 0) goto L_0x0232;
    L_0x022c:
        if (r27 <= 0) goto L_0x022f;
    L_0x022e:
        goto L_0x0232;
    L_0x022f:
        r1 = 6;
        r2 = 0;
        goto L_0x0234;
    L_0x0232:
        r1 = 4;
        r2 = 1;
    L_0x0234:
        r6 = r37.m304e();
        r11 = r24;
        r10.m288c(r9, r11, r6, r1);
        r6 = r38.m304e();
        r6 = -r6;
        r10.m288c(r8, r4, r6, r1);
        if (r14 > 0) goto L_0x024c;
    L_0x0247:
        if (r27 <= 0) goto L_0x024a;
    L_0x0249:
        goto L_0x024c;
    L_0x024a:
        r1 = 0;
        goto L_0x024d;
    L_0x024c:
        r1 = 1;
    L_0x024d:
        r16 = r2;
        r12 = 1;
        r14 = 5;
        goto L_0x0286;
    L_0x0252:
        r11 = r24;
        r12 = 1;
        if (r6 != r12) goto L_0x025c;
    L_0x0257:
        r1 = 1;
        r14 = 6;
    L_0x0259:
        r16 = 1;
        goto L_0x0286;
    L_0x025c:
        r1 = 3;
        if (r6 != r1) goto L_0x027d;
    L_0x025f:
        if (r44 != 0) goto L_0x026a;
    L_0x0261:
        r1 = r0.f446p;
        r2 = -1;
        if (r1 == r2) goto L_0x026a;
    L_0x0266:
        if (r14 > 0) goto L_0x026a;
    L_0x0268:
        r1 = 6;
        goto L_0x026b;
    L_0x026a:
        r1 = 4;
    L_0x026b:
        r2 = r37.m304e();
        r10.m288c(r9, r11, r2, r1);
        r2 = r38.m304e();
        r2 = -r2;
        r10.m288c(r8, r4, r2, r1);
        r1 = 1;
        r14 = 5;
        goto L_0x0259;
    L_0x027d:
        r1 = 0;
        goto L_0x0283;
    L_0x027f:
        r11 = r24;
        r12 = 1;
        r1 = 1;
    L_0x0283:
        r14 = 5;
        r16 = 0;
    L_0x0286:
        if (r1 == 0) goto L_0x02cf;
    L_0x0288:
        r6 = r37.m304e();
        r17 = r38.m304e();
        r1 = r31;
        r2 = r9;
        r7 = r3;
        r3 = r11;
        r18 = r4;
        r4 = r6;
        r6 = r5;
        r5 = r43;
        r12 = r6;
        r28 = r18;
        r6 = r28;
        r13 = r11;
        r11 = r7;
        r7 = r8;
        r0 = r8;
        r8 = r17;
        r12 = r9;
        r9 = r14;
        r1.m275a(r2, r3, r4, r5, r6, r7, r8, r9);
        r1 = r37;
        r2 = 1;
        r3 = r1.f390c;
        r3 = r3.f388a;
        r3 = r3 instanceof android.support.constraint.solver.widgets.C4402b;
        r4 = r38;
        r5 = r4.f390c;
        r5 = r5.f388a;
        r5 = r5 instanceof android.support.constraint.solver.widgets.C4402b;
        if (r3 == 0) goto L_0x02c5;
    L_0x02be:
        if (r5 != 0) goto L_0x02c5;
    L_0x02c0:
        r2 = r32;
        r3 = 1;
        r5 = 6;
        goto L_0x02dd;
    L_0x02c5:
        if (r3 != 0) goto L_0x02d9;
    L_0x02c7:
        if (r5 == 0) goto L_0x02d9;
    L_0x02c9:
        r3 = r32;
        r5 = 5;
        r29 = 6;
        goto L_0x02df;
    L_0x02cf:
        r28 = r4;
        r0 = r8;
        r12 = r9;
        r13 = r11;
        r1 = r37;
        r4 = r38;
        r11 = r3;
    L_0x02d9:
        r2 = r32;
        r3 = r2;
        r5 = 5;
    L_0x02dd:
        r29 = 5;
    L_0x02df:
        if (r16 == 0) goto L_0x02e4;
    L_0x02e1:
        r5 = 6;
        r6 = 6;
        goto L_0x02e7;
    L_0x02e4:
        r6 = r5;
        r5 = r29;
    L_0x02e7:
        if (r15 != 0) goto L_0x02eb;
    L_0x02e9:
        if (r2 != 0) goto L_0x02ed;
    L_0x02eb:
        if (r16 == 0) goto L_0x02f4;
    L_0x02ed:
        r1 = r37.m304e();
        r10.m276a(r12, r13, r1, r5);
    L_0x02f4:
        if (r15 != 0) goto L_0x02f8;
    L_0x02f6:
        if (r3 != 0) goto L_0x02fa;
    L_0x02f8:
        if (r16 == 0) goto L_0x0304;
    L_0x02fa:
        r1 = r38.m304e();
        r1 = -r1;
        r2 = r28;
        r10.m285b(r0, r2, r1, r6);
    L_0x0304:
        if (r32 == 0) goto L_0x01ee;
    L_0x0306:
        r1 = 0;
        r3 = 6;
        r10.m276a(r12, r11, r1, r3);
    L_0x030b:
        if (r32 == 0) goto L_0x0312;
    L_0x030d:
        r4 = r34;
        r10.m276a(r4, r0, r1, r3);
    L_0x0312:
        return;
    L_0x0313:
        r0 = r8;
        r5 = r9;
        r1 = 0;
        r3 = 6;
        r4 = r34;
        r11 = r33;
        r6 = 2;
    L_0x031c:
        if (r2 >= r6) goto L_0x0326;
    L_0x031e:
        if (r32 == 0) goto L_0x0326;
    L_0x0320:
        r10.m276a(r5, r11, r1, r3);
        r10.m276a(r4, r0, r1, r3);
    L_0x0326:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.ConstraintWidget.a(android.support.constraint.solver.e, boolean, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour, boolean, android.support.constraint.solver.widgets.ConstraintAnchor, android.support.constraint.solver.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: c */
    public void mo46c(C0097e c0097e) {
        int b = c0097e.m283b(this.f449s);
        int b2 = c0097e.m283b(this.f450t);
        int b3 = c0097e.m283b(this.f451u);
        int b4 = c0097e.m283b(this.f452v);
        int i = b4 - b2;
        if (b3 - b < 0 || i < 0 || b == Integer.MIN_VALUE || b == BaseClientBuilder.API_PRIORITY_OTHER || b2 == Integer.MIN_VALUE || b2 == BaseClientBuilder.API_PRIORITY_OTHER || b3 == Integer.MIN_VALUE || b3 == BaseClientBuilder.API_PRIORITY_OTHER || b4 == -2147483648 || b4 == 2147483647) {
            b4 = null;
            b = 0;
            b2 = 0;
            b3 = 0;
        }
        m327a(b, b2, b3, b4);
    }
}
