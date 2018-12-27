package com.airbnb.lottie.model.layer;

import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.C0985b;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.p038a.C0979k;
import com.airbnb.lottie.model.p038a.C3317l;
import com.airbnb.lottie.model.p038a.C4493b;
import com.airbnb.lottie.model.p038a.C4499j;
import com.airbnb.lottie.p037e.C0959a;
import java.util.List;
import java.util.Locale;

public class Layer {
    /* renamed from: a */
    private final List<C0985b> f3335a;
    /* renamed from: b */
    private final C0955d f3336b;
    /* renamed from: c */
    private final String f3337c;
    /* renamed from: d */
    private final long f3338d;
    /* renamed from: e */
    private final LayerType f3339e;
    /* renamed from: f */
    private final long f3340f;
    /* renamed from: g */
    private final String f3341g;
    /* renamed from: h */
    private final List<Mask> f3342h;
    /* renamed from: i */
    private final C3317l f3343i;
    /* renamed from: j */
    private final int f3344j;
    /* renamed from: k */
    private final int f3345k;
    /* renamed from: l */
    private final int f3346l;
    /* renamed from: m */
    private final float f3347m;
    /* renamed from: n */
    private final float f3348n;
    /* renamed from: o */
    private final int f3349o;
    /* renamed from: p */
    private final int f3350p;
    /* renamed from: q */
    private final C4499j f3351q;
    /* renamed from: r */
    private final C0979k f3352r;
    /* renamed from: s */
    private final C4493b f3353s;
    /* renamed from: t */
    private final List<C0959a<Float>> f3354t;
    /* renamed from: u */
    private final MatteType f3355u;

    public enum LayerType {
        PreComp,
        Solid,
        Image,
        Null,
        Shape,
        Text,
        Unknown
    }

    public enum MatteType {
        None,
        Add,
        Invert,
        Unknown
    }

    public Layer(List<C0985b> list, C0955d c0955d, String str, long j, LayerType layerType, long j2, String str2, List<Mask> list2, C3317l c3317l, int i, int i2, int i3, float f, float f2, int i4, int i5, C4499j c4499j, C0979k c0979k, List<C0959a<Float>> list3, MatteType matteType, C4493b c4493b) {
        this.f3335a = list;
        this.f3336b = c0955d;
        this.f3337c = str;
        this.f3338d = j;
        this.f3339e = layerType;
        this.f3340f = j2;
        this.f3341g = str2;
        this.f3342h = list2;
        this.f3343i = c3317l;
        this.f3344j = i;
        this.f3345k = i2;
        this.f3346l = i3;
        this.f3347m = f;
        this.f3348n = f2;
        this.f3349o = i4;
        this.f3350p = i5;
        this.f3351q = c4499j;
        this.f3352r = c0979k;
        this.f3354t = list3;
        this.f3355u = matteType;
        this.f3353s = c4493b;
    }

    /* renamed from: a */
    C0955d m4282a() {
        return this.f3336b;
    }

    /* renamed from: b */
    float m4284b() {
        return this.f3347m;
    }

    /* renamed from: c */
    float m4285c() {
        return this.f3348n / this.f3336b.m4124k();
    }

    /* renamed from: d */
    List<C0959a<Float>> m4286d() {
        return this.f3354t;
    }

    /* renamed from: e */
    public long m4287e() {
        return this.f3338d;
    }

    /* renamed from: f */
    String m4288f() {
        return this.f3337c;
    }

    /* renamed from: g */
    String m4289g() {
        return this.f3341g;
    }

    /* renamed from: h */
    int m4290h() {
        return this.f3349o;
    }

    /* renamed from: i */
    int m4291i() {
        return this.f3350p;
    }

    /* renamed from: j */
    List<Mask> m4292j() {
        return this.f3342h;
    }

    /* renamed from: k */
    public LayerType m4293k() {
        return this.f3339e;
    }

    /* renamed from: l */
    MatteType m4294l() {
        return this.f3355u;
    }

    /* renamed from: m */
    long m4295m() {
        return this.f3340f;
    }

    /* renamed from: n */
    List<C0985b> m4296n() {
        return this.f3335a;
    }

    /* renamed from: o */
    C3317l m4297o() {
        return this.f3343i;
    }

    /* renamed from: p */
    int m4298p() {
        return this.f3346l;
    }

    /* renamed from: q */
    int m4299q() {
        return this.f3345k;
    }

    /* renamed from: r */
    int m4300r() {
        return this.f3344j;
    }

    /* renamed from: s */
    C4499j m4301s() {
        return this.f3351q;
    }

    /* renamed from: t */
    C0979k m4302t() {
        return this.f3352r;
    }

    /* renamed from: u */
    C4493b m4303u() {
        return this.f3353s;
    }

    public String toString() {
        return m4283a("");
    }

    /* renamed from: a */
    public String m4283a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(m4288f());
        stringBuilder.append("\n");
        Layer a = this.f3336b.m4110a(m4295m());
        if (a != null) {
            stringBuilder.append("\t\tParents: ");
            stringBuilder.append(a.m4288f());
            a = this.f3336b.m4110a(a.m4295m());
            while (a != null) {
                stringBuilder.append("->");
                stringBuilder.append(a.m4288f());
                a = this.f3336b.m4110a(a.m4295m());
            }
            stringBuilder.append(str);
            stringBuilder.append("\n");
        }
        if (!m4292j().isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tMasks: ");
            stringBuilder.append(m4292j().size());
            stringBuilder.append("\n");
        }
        if (!(m4300r() == 0 || m4299q() == 0)) {
            stringBuilder.append(str);
            stringBuilder.append("\tBackground: ");
            stringBuilder.append(String.format(Locale.US, "%dx%d %X\n", new Object[]{Integer.valueOf(m4300r()), Integer.valueOf(m4299q()), Integer.valueOf(m4298p())}));
        }
        if (!this.f3335a.isEmpty()) {
            stringBuilder.append(str);
            stringBuilder.append("\tShapes:\n");
            for (Object next : this.f3335a) {
                stringBuilder.append(str);
                stringBuilder.append("\t\t");
                stringBuilder.append(next);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
