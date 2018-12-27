package com.facebook.ads.internal.p097p.p098a;

/* renamed from: com.facebook.ads.internal.p.a.l */
public abstract class C1861l {
    /* renamed from: a */
    protected String f5698a = "";
    /* renamed from: b */
    protected C1860j f5699b;
    /* renamed from: c */
    protected String f5700c;
    /* renamed from: d */
    protected byte[] f5701d;

    public C1861l(String str, C1865p c1865p) {
        if (str != null) {
            this.f5698a = str;
        }
        if (c1865p != null) {
            str = c1865p.m7122a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f5698a);
            stringBuilder.append("?");
            stringBuilder.append(str);
            this.f5698a = stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public String m7109a() {
        return this.f5698a;
    }

    /* renamed from: b */
    public C1860j m7110b() {
        return this.f5699b;
    }

    /* renamed from: c */
    public String m7111c() {
        return this.f5700c;
    }

    /* renamed from: d */
    public byte[] m7112d() {
        return this.f5701d;
    }
}
