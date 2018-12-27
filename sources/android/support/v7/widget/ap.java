package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.View;

class ap {
    /* renamed from: a */
    static int m3529a(C0795s c0795s, ai aiVar, View view, View view2, C0783i c0783i, boolean z, boolean z2) {
        if (!(c0783i.m3154w() == 0 || c0795s.m3249e() == 0 || view == null)) {
            if (view2 != null) {
                int min = Math.min(c0783i.m3110d(view), c0783i.m3110d(view2));
                int max = Math.max(c0783i.m3110d(view), c0783i.m3110d(view2));
                if (z2) {
                    c0795s = Math.max(0, (c0795s.m3249e() - max) - 1);
                } else {
                    c0795s = Math.max(0, min);
                }
                if (!z) {
                    return c0795s;
                }
                return Math.round((((float) c0795s) * (((float) Math.abs(aiVar.mo769b(view2) - aiVar.mo767a(view))) / ((float) (Math.abs(c0783i.m3110d(view) - c0783i.m3110d(view2)) + 1)))) + ((float) (aiVar.mo770c() - aiVar.mo767a(view))));
            }
        }
        return 0;
    }

    /* renamed from: a */
    static int m3528a(C0795s c0795s, ai aiVar, View view, View view2, C0783i c0783i, boolean z) {
        if (!(c0783i.m3154w() == 0 || c0795s.m3249e() == null || view == null)) {
            if (view2 != null) {
                if (!z) {
                    return Math.abs(c0783i.m3110d(view) - c0783i.m3110d(view2)) + 1;
                }
                return Math.min(aiVar.mo776f(), aiVar.mo769b(view2) - aiVar.mo767a(view));
            }
        }
        return null;
    }

    /* renamed from: b */
    static int m3530b(C0795s c0795s, ai aiVar, View view, View view2, C0783i c0783i, boolean z) {
        if (!(c0783i.m3154w() == 0 || c0795s.m3249e() == 0 || view == null)) {
            if (view2 != null) {
                if (!z) {
                    return c0795s.m3249e();
                }
                return (int) ((((float) (aiVar.mo769b(view2) - aiVar.mo767a(view))) / ((float) (Math.abs(c0783i.m3110d(view) - c0783i.m3110d(view2)) + 1))) * ((float) c0795s.m3249e()));
            }
        }
        return null;
    }
}
