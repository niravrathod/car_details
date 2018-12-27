package com.feedbox.p121a.p122a;

import com.feedbox.C2108b.C2102b;
import com.feedbox.C2110d;
import com.google.gson.p140a.C2621c;
import java.util.ArrayList;
import kotlin.collections.C4329j;
import kotlin.collections.C4875n;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.feedbox.a.a.b */
public final class C2097b {
    @C2621c(a = "ads")
    /* renamed from: a */
    private final C2096a f6421a;
    @C2621c(a = "ui")
    /* renamed from: b */
    private final C2098c f6422b;
    @C2621c(a = "youtubeApiKeys")
    /* renamed from: c */
    private final ArrayList<String> f6423c;
    @C2621c(a = "pipEnabled")
    /* renamed from: d */
    private final boolean f6424d;
    @C2621c(a = "feebackEmail")
    /* renamed from: e */
    private final String f6425e;
    @C2621c(a = "tncLink")
    /* renamed from: f */
    private final String f6426f;
    @C2621c(a = "aboutUs")
    /* renamed from: g */
    private final String f6427g;

    public C2097b() {
        this(null, null, null, false, null, null, null, 127, null);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2097b) {
                C2097b c2097b = (C2097b) obj;
                if (C2885g.m13909a(this.f6421a, c2097b.f6421a) && C2885g.m13909a(this.f6422b, c2097b.f6422b) && C2885g.m13909a(this.f6423c, c2097b.f6423c)) {
                    if ((this.f6424d == c2097b.f6424d ? 1 : null) != null && C2885g.m13909a(this.f6425e, c2097b.f6425e) && C2885g.m13909a(this.f6426f, c2097b.f6426f) && C2885g.m13909a(this.f6427g, c2097b.f6427g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C2096a c2096a = this.f6421a;
        int i = 0;
        int hashCode = (c2096a != null ? c2096a.hashCode() : 0) * 31;
        C2098c c2098c = this.f6422b;
        hashCode = (hashCode + (c2098c != null ? c2098c.hashCode() : 0)) * 31;
        ArrayList arrayList = this.f6423c;
        hashCode = (hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        int i2 = this.f6424d;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        String str = this.f6425e;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6426f;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f6427g;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ControlModel(adsData=");
        stringBuilder.append(this.f6421a);
        stringBuilder.append(", uiData=");
        stringBuilder.append(this.f6422b);
        stringBuilder.append(", youtubeApiKeys=");
        stringBuilder.append(this.f6423c);
        stringBuilder.append(", pipEnabled=");
        stringBuilder.append(this.f6424d);
        stringBuilder.append(", feedbackEmail=");
        stringBuilder.append(this.f6425e);
        stringBuilder.append(", tncLink=");
        stringBuilder.append(this.f6426f);
        stringBuilder.append(", aboutUs=");
        stringBuilder.append(this.f6427g);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C2097b(C2096a c2096a, C2098c c2098c, ArrayList<String> arrayList, boolean z, String str, String str2, String str3) {
        C2885g.m13910b(c2096a, "adsData");
        C2885g.m13910b(c2098c, "uiData");
        C2885g.m13910b(arrayList, "youtubeApiKeys");
        C2885g.m13910b(str, "feedbackEmail");
        C2885g.m13910b(str2, "tncLink");
        C2885g.m13910b(str3, "aboutUs");
        this.f6421a = c2096a;
        this.f6422b = c2098c;
        this.f6423c = arrayList;
        this.f6424d = z;
        this.f6425e = str;
        this.f6426f = str2;
        this.f6427g = str3;
    }

    public /* synthetic */ C2097b(C2096a c2096a, C2098c c2098c, ArrayList arrayList, boolean z, String str, String str2, String str3, int i, C2884f c2884f) {
        C2096a c2096a2;
        C2098c c2098c2;
        if ((i & 1) != 0) {
            C2096a c2096a3 = new C2096a(false, null, null, null, null, null, 63, null);
        } else {
            c2096a2 = c2096a;
        }
        if ((i & 2) != 0) {
            C2098c c2098c3 = new C2098c(null, null, null, 7, null);
        } else {
            c2098c2 = c2098c;
        }
        this(c2096a2, c2098c2, (i & 4) != 0 ? C4329j.m23708b("AIzaSyD6zwKgW_u9GWqSbDzzBRBtOFHY3rdNvOc") : arrayList, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "contact@carfeene.com" : str, (i & 32) != 0 ? "https://cuvora.com" : str2, (i & 64) != 0 ? "lorem ipsum" : str3);
    }

    /* renamed from: d */
    public final C2096a m7657d() {
        return this.f6421a;
    }

    /* renamed from: e */
    public final boolean m7658e() {
        return this.f6424d;
    }

    /* renamed from: a */
    public final String m7654a() {
        return (String) C4875n.m29858a(this.f6423c).get(0);
    }

    /* renamed from: b */
    public final String m7655b() {
        if ((((CharSequence) this.f6422b.m7659a()).length() > 0 ? 1 : null) != null) {
            return this.f6422b.m7659a();
        }
        Object string = ((C2110d) C2110d.f6448c.m7672a()).m7676a().getApplicationContext().getString(C2102b.app_name);
        C2885g.m13907a(string, "VideoApp.getInstance().a…String(R.string.app_name)");
        return string;
    }

    /* renamed from: c */
    public final boolean m7656c() {
        return this.f6421a.m7650a();
    }
}
