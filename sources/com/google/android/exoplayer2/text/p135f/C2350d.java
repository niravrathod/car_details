package com.google.android.exoplayer2.text.p135f;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.d */
final class C2350d {
    /* renamed from: a */
    private String f7457a;
    /* renamed from: b */
    private String f7458b;
    /* renamed from: c */
    private List<String> f7459c;
    /* renamed from: d */
    private String f7460d;
    /* renamed from: e */
    private String f7461e;
    /* renamed from: f */
    private int f7462f;
    /* renamed from: g */
    private boolean f7463g;
    /* renamed from: h */
    private int f7464h;
    /* renamed from: i */
    private boolean f7465i;
    /* renamed from: j */
    private int f7466j;
    /* renamed from: k */
    private int f7467k;
    /* renamed from: l */
    private int f7468l;
    /* renamed from: m */
    private int f7469m;
    /* renamed from: n */
    private int f7470n;
    /* renamed from: o */
    private float f7471o;
    /* renamed from: p */
    private Alignment f7472p;

    public C2350d() {
        m8610a();
    }

    /* renamed from: a */
    public void m8610a() {
        this.f7457a = "";
        this.f7458b = "";
        this.f7459c = Collections.emptyList();
        this.f7460d = "";
        this.f7461e = null;
        this.f7463g = false;
        this.f7465i = false;
        this.f7466j = -1;
        this.f7467k = -1;
        this.f7468l = -1;
        this.f7469m = -1;
        this.f7470n = -1;
        this.f7472p = null;
    }

    /* renamed from: a */
    public void m8611a(String str) {
        this.f7457a = str;
    }

    /* renamed from: b */
    public void m8616b(String str) {
        this.f7458b = str;
    }

    /* renamed from: a */
    public void m8612a(String[] strArr) {
        this.f7459c = Arrays.asList(strArr);
    }

    /* renamed from: c */
    public void m8618c(String str) {
        this.f7460d = str;
    }

    /* renamed from: a */
    public int m8607a(String str, String str2, String[] strArr, String str3) {
        if (this.f7457a.isEmpty() && this.f7458b.isEmpty() && this.f7459c.isEmpty() && this.f7460d.isEmpty()) {
            return str2.isEmpty();
        }
        str = C2350d.m8606a(C2350d.m8606a(C2350d.m8606a(0, this.f7457a, str, 1073741824), this.f7458b, str2, 2), this.f7460d, str3, 4);
        if (str != -1) {
            if (Arrays.asList(strArr).containsAll(this.f7459c) != null) {
                return str + (this.f7459c.size() * 4);
            }
        }
        return 0;
    }

    /* renamed from: b */
    public int m8613b() {
        if (this.f7468l == -1 && this.f7469m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f7468l == 1 ? 1 : 0;
        if (this.f7469m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: c */
    public boolean m8619c() {
        return this.f7466j == 1;
    }

    /* renamed from: d */
    public boolean m8621d() {
        return this.f7467k == 1;
    }

    /* renamed from: a */
    public C2350d m8609a(boolean z) {
        this.f7467k = z;
        return this;
    }

    /* renamed from: b */
    public C2350d m8615b(boolean z) {
        this.f7468l = z;
        return this;
    }

    /* renamed from: c */
    public C2350d m8617c(boolean z) {
        this.f7469m = z;
        return this;
    }

    /* renamed from: e */
    public String m8622e() {
        return this.f7461e;
    }

    /* renamed from: d */
    public C2350d m8620d(String str) {
        this.f7461e = C2186s.m8061d(str);
        return this;
    }

    /* renamed from: f */
    public int m8623f() {
        if (this.f7463g) {
            return this.f7462f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: a */
    public C2350d m8608a(int i) {
        this.f7462f = i;
        this.f7463g = true;
        return this;
    }

    /* renamed from: g */
    public boolean m8624g() {
        return this.f7463g;
    }

    /* renamed from: h */
    public int m8625h() {
        if (this.f7465i) {
            return this.f7464h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public C2350d m8614b(int i) {
        this.f7464h = i;
        this.f7465i = true;
        return this;
    }

    /* renamed from: i */
    public boolean m8626i() {
        return this.f7465i;
    }

    /* renamed from: j */
    public Alignment m8627j() {
        return this.f7472p;
    }

    /* renamed from: k */
    public int m8628k() {
        return this.f7470n;
    }

    /* renamed from: l */
    public float m8629l() {
        return this.f7471o;
    }

    /* renamed from: a */
    private static int m8606a(int i, String str, String str2, int i2) {
        if (!str.isEmpty()) {
            int i3 = -1;
            if (i != -1) {
                if (str.equals(str2) != null) {
                    i3 = i + i2;
                }
                return i3;
            }
        }
        return i;
    }
}
