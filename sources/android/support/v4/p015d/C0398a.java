package android.support.v4.p015d;

import android.support.v4.p017f.C0432l;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.d.a */
public final class C0398a {
    /* renamed from: a */
    private final String f1353a;
    /* renamed from: b */
    private final String f1354b;
    /* renamed from: c */
    private final String f1355c;
    /* renamed from: d */
    private final List<List<byte[]>> f1356d;
    /* renamed from: e */
    private final int f1357e = null;
    /* renamed from: f */
    private final String f1358f;

    public C0398a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1353a = (String) C0432l.m1574a(str);
        this.f1354b = (String) C0432l.m1574a(str2);
        this.f1355c = (String) C0432l.m1574a(str3);
        this.f1356d = (List) C0432l.m1574a(list);
        str = new StringBuilder(this.f1353a);
        str.append("-");
        str.append(this.f1354b);
        str.append("-");
        str.append(this.f1355c);
        this.f1358f = str.toString();
    }

    /* renamed from: a */
    public String m1473a() {
        return this.f1353a;
    }

    /* renamed from: b */
    public String m1474b() {
        return this.f1354b;
    }

    /* renamed from: c */
    public String m1475c() {
        return this.f1355c;
    }

    /* renamed from: d */
    public List<List<byte[]>> m1476d() {
        return this.f1356d;
    }

    /* renamed from: e */
    public int m1477e() {
        return this.f1357e;
    }

    /* renamed from: f */
    public String m1478f() {
        return this.f1358f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.f1353a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.f1354b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.f1355c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.f1356d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f1356d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(this.f1357e);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
