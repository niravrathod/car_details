package com.facebook.ads.internal.p081a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.facebook.ads.internal.p091j.C1812a.C1810a;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p104c.C1952g;

/* renamed from: com.facebook.ads.internal.a.k */
public class C3765k extends C1712b {
    /* renamed from: d */
    private static final String f15096d = "k";
    /* renamed from: e */
    private final Uri f15097e;

    public C3765k(Context context, C1827c c1827c, String str, Uri uri) {
        super(context, c1827c, str);
        this.f15097e = uri;
    }

    /* renamed from: a */
    public C1810a mo1329a() {
        return C1810a.OPEN_LINK;
    }

    /* renamed from: b */
    public void mo1328b() {
        try {
            Log.w("REDIRECTACTION: ", this.f15097e.toString());
            C1952g.m7374a(new C1952g(), this.a, this.f15097e, this.c);
        } catch (Throwable e) {
            String str = f15096d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to open link url: ");
            stringBuilder.append(this.f15097e.toString());
            Log.d(str, stringBuilder.toString(), e);
        }
    }
}
