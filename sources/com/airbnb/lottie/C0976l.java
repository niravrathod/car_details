package com.airbnb.lottie;

import android.support.v4.p017f.C0416b;
import android.support.v4.p017f.C0429j;
import com.airbnb.lottie.p036d.C0952d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.airbnb.lottie.l */
public class C0976l {
    /* renamed from: a */
    private boolean f3247a = false;
    /* renamed from: b */
    private final Set<C0975a> f3248b = new C0416b();
    /* renamed from: c */
    private final Map<String, C0952d> f3249c = new HashMap();
    /* renamed from: d */
    private final Comparator<C0429j<String, Float>> f3250d = new C09741(this);

    /* renamed from: com.airbnb.lottie.l$1 */
    class C09741 implements Comparator<C0429j<String, Float>> {
        /* renamed from: a */
        final /* synthetic */ C0976l f3246a;

        C09741(C0976l c0976l) {
            this.f3246a = c0976l;
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m4229a((C0429j) obj, (C0429j) obj2);
        }

        /* renamed from: a */
        public int m4229a(C0429j<String, Float> c0429j, C0429j<String, Float> c0429j2) {
            c0429j = ((Float) c0429j.f1443b).floatValue();
            c0429j2 = ((Float) c0429j2.f1443b).floatValue();
            if (c0429j2 > c0429j) {
                return 1;
            }
            return c0429j > c0429j2 ? -1 : null;
        }
    }

    /* renamed from: com.airbnb.lottie.l$a */
    public interface C0975a {
        /* renamed from: a */
        void m4230a(float f);
    }

    /* renamed from: a */
    void m4232a(boolean z) {
        this.f3247a = z;
    }

    /* renamed from: a */
    public void m4231a(String str, float f) {
        if (this.f3247a) {
            C0952d c0952d = (C0952d) this.f3249c.get(str);
            if (c0952d == null) {
                c0952d = new C0952d();
                this.f3249c.put(str, c0952d);
            }
            c0952d.m4088a(f);
            if (str.equals("__container") != null) {
                for (C0975a a : this.f3248b) {
                    a.m4230a(f);
                }
            }
        }
    }
}
