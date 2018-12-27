package com.facebook.ads.internal.p081a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1909d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.h */
public abstract class C3763h extends C1712b {
    /* renamed from: d */
    protected final C1719l f15092d;

    public C3763h(Context context, C1827c c1827c, String str, C1719l c1719l) {
        super(context, c1827c, str);
        this.f15092d = c1719l;
    }

    /* renamed from: a */
    protected final void m18786a(Map<String, String> map, C1711a c1711a) {
        if (!TextUtils.isEmpty(this.c)) {
            if (this instanceof C4590f) {
                this.b.mo1363h(this.c, map);
            } else {
                this.b.mo1358c(this.c, map);
            }
            boolean a = C1711a.m6459a(c1711a);
            if (this.f15092d != null) {
                this.f15092d.m6479a(c1711a);
                if (a) {
                    this.f15092d.m6478a();
                }
            } else {
                Map hashMap = new HashMap();
                hashMap.put("leave_time", Long.toString(-1));
                hashMap.put("back_time", Long.toString(-1));
                hashMap.put("outcome", C1711a.CANNOT_TRACK.name());
                this.b.mo1365j(this.c, hashMap);
            }
        }
        C1909d.m7258a(this.a, "Click logged");
    }

    /* renamed from: b */
    public final void mo1328b() {
        if (this.f15092d != null) {
            this.f15092d.m6480a(this.c);
        }
        mo3938e();
    }

    /* renamed from: e */
    abstract void mo3938e();
}
