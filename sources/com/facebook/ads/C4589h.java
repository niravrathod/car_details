package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.p095n.C1837d;
import com.facebook.ads.internal.protocol.C1900f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.h */
public class C4589h extends NativeAdBase {
    public C4589h(Context context, String str) {
        super(context, str);
        m18723a(C1900f.NATIVE_UNKNOWN);
    }

    C4589h(C1837d c1837d) {
        super(c1837d);
    }

    /* renamed from: a */
    String m25257a() {
        return m18724g().m7009j();
    }

    /* renamed from: b */
    String m25258b() {
        return m18724g().m7010k();
    }

    /* renamed from: c */
    String m25259c() {
        return m18724g().m7011l();
    }

    /* renamed from: d */
    VideoAutoplayBehavior m25260d() {
        return VideoAutoplayBehavior.m6427a(m18724g().m7012m());
    }

    /* renamed from: e */
    List<C4589h> m25261e() {
        if (m18724g().m7013n() == null) {
            return null;
        }
        List<C4589h> arrayList = new ArrayList();
        for (C1837d c4589h : m18724g().m7013n()) {
            arrayList.add(new C4589h(c4589h));
        }
        return arrayList;
    }
}
