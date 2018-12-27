package android.support.constraint.solver;

import java.util.Arrays;

public class SolverVariable {
    /* renamed from: j */
    private static int f293j = 1;
    /* renamed from: k */
    private static int f294k = 1;
    /* renamed from: l */
    private static int f295l = 1;
    /* renamed from: m */
    private static int f296m = 1;
    /* renamed from: n */
    private static int f297n = 1;
    /* renamed from: a */
    public int f298a = -1;
    /* renamed from: b */
    int f299b = -1;
    /* renamed from: c */
    public int f300c = 0;
    /* renamed from: d */
    public float f301d;
    /* renamed from: e */
    float[] f302e = new float[7];
    /* renamed from: f */
    Type f303f;
    /* renamed from: g */
    C3021b[] f304g = new C3021b[8];
    /* renamed from: h */
    int f305h = 0;
    /* renamed from: i */
    public int f306i = 0;
    /* renamed from: o */
    private String f307o;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: a */
    static void m235a() {
        f294k++;
    }

    public SolverVariable(Type type, String str) {
        this.f303f = type;
    }

    /* renamed from: a */
    public final void m237a(C3021b c3021b) {
        int i = 0;
        while (i < this.f305h) {
            if (this.f304g[i] != c3021b) {
                i++;
            } else {
                return;
            }
        }
        if (this.f305h >= this.f304g.length) {
            this.f304g = (C3021b[]) Arrays.copyOf(this.f304g, this.f304g.length * 2);
        }
        this.f304g[this.f305h] = c3021b;
        this.f305h++;
    }

    /* renamed from: b */
    public final void m239b(C3021b c3021b) {
        int i = this.f305h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f304g[i2] == c3021b) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.f304g[i4] = this.f304g[i4 + 1];
                }
                this.f305h--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m240c(C3021b c3021b) {
        int i = this.f305h;
        for (int i2 = 0; i2 < i; i2++) {
            this.f304g[i2].f12757d.m250a(this.f304g[i2], c3021b, false);
        }
        this.f305h = 0;
    }

    /* renamed from: b */
    public void m238b() {
        this.f307o = null;
        this.f303f = Type.UNKNOWN;
        this.f300c = 0;
        this.f298a = -1;
        this.f299b = -1;
        this.f301d = 0.0f;
        this.f305h = 0;
        this.f306i = 0;
    }

    /* renamed from: a */
    public void m236a(Type type, String str) {
        this.f303f = type;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.f307o);
        return stringBuilder.toString();
    }
}
