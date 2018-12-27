package com.facebook.ads.internal.p081a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p104c.C1952g;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.i */
class C4591i extends C3763h {
    /* renamed from: e */
    private static final String f18988e = "i";
    /* renamed from: f */
    private final Uri f18989f;
    /* renamed from: g */
    private final Map<String, String> f18990g;

    C4591i(Context context, C1827c c1827c, String str, Uri uri, Map<String, String> map, C1719l c1719l) {
        super(context, c1827c, str, c1719l);
        this.f18989f = uri;
        this.f18990g = map;
    }

    /* renamed from: a */
    public C1810a mo1329a() {
        return C1810a.OPEN_LINK;
    }

    /* renamed from: e */
    void mo3938e() {
        C1711a c1711a;
        try {
            C1952g.m7374a(new C1952g(), this.a, Uri.parse(this.f18989f.getQueryParameter("link")), this.c);
            c1711a = null;
        } catch (Throwable e) {
            String str = f18988e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open link url: ");
            stringBuilder.append(this.f18989f.toString());
            Log.d(str, stringBuilder.toString(), e);
            c1711a = C1711a.CANNOT_OPEN;
        }
        m18786a(this.f18990g, c1711a);
    }
}
