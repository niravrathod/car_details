package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0794r.C0792a;
import android.support.v7.widget.RecyclerView.C0794r.C0793b;
import android.support.v7.widget.RecyclerView.C0795s;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.common.api.Api.BaseClientBuilder;

public class aj extends ar {
    /* renamed from: b */
    private ai f18645b;
    /* renamed from: c */
    private ai f18646c;

    /* renamed from: a */
    public int[] mo3865a(C0783i c0783i, View view) {
        int[] iArr = new int[2];
        if (c0783i.mo688e()) {
            iArr[0] = m24718a(c0783i, view, m24722e(c0783i));
        } else {
            iArr[0] = 0;
        }
        if (c0783i.mo690f()) {
            iArr[1] = m24718a(c0783i, view, m24721d(c0783i));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    public View mo3864a(C0783i c0783i) {
        if (c0783i.mo690f()) {
            return m24719a(c0783i, m24721d(c0783i));
        }
        return c0783i.mo688e() ? m24719a(c0783i, m24722e(c0783i)) : null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public int mo3863a(android.support.v7.widget.RecyclerView.C0783i r6, int r7, int r8) {
        /*
        r5 = this;
        r0 = r6.m3031G();
        r1 = -1;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = 0;
        r3 = r6.mo690f();
        if (r3 == 0) goto L_0x0018;
    L_0x000f:
        r2 = r5.m24721d(r6);
        r2 = r5.m24720b(r6, r2);
        goto L_0x0026;
    L_0x0018:
        r3 = r6.mo688e();
        if (r3 == 0) goto L_0x0026;
    L_0x001e:
        r2 = r5.m24722e(r6);
        r2 = r5.m24720b(r6, r2);
    L_0x0026:
        if (r2 != 0) goto L_0x0029;
    L_0x0028:
        return r1;
    L_0x0029:
        r2 = r6.m3110d(r2);
        if (r2 != r1) goto L_0x0030;
    L_0x002f:
        return r1;
    L_0x0030:
        r1 = r6.mo688e();
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x003e;
    L_0x0038:
        if (r7 <= 0) goto L_0x003c;
    L_0x003a:
        r7 = 1;
        goto L_0x0041;
    L_0x003c:
        r7 = 0;
        goto L_0x0041;
    L_0x003e:
        if (r8 <= 0) goto L_0x003c;
    L_0x0040:
        goto L_0x003a;
    L_0x0041:
        r8 = r6 instanceof android.support.v7.widget.RecyclerView.C0794r.C0793b;
        if (r8 == 0) goto L_0x005c;
    L_0x0045:
        r6 = (android.support.v7.widget.RecyclerView.C0794r.C0793b) r6;
        r0 = r0 - r4;
        r6 = r6.mo684d(r0);
        if (r6 == 0) goto L_0x005c;
    L_0x004e:
        r8 = r6.x;
        r0 = 0;
        r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r8 < 0) goto L_0x005b;
    L_0x0055:
        r6 = r6.y;
        r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r6 >= 0) goto L_0x005c;
    L_0x005b:
        r3 = 1;
    L_0x005c:
        if (r3 == 0) goto L_0x0063;
    L_0x005e:
        if (r7 == 0) goto L_0x0067;
    L_0x0060:
        r2 = r2 + -1;
        goto L_0x0067;
    L_0x0063:
        if (r7 == 0) goto L_0x0067;
    L_0x0065:
        r2 = r2 + 1;
    L_0x0067:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.aj.a(android.support.v7.widget.RecyclerView$i, int, int):int");
    }

    /* renamed from: b */
    protected af mo3866b(C0783i c0783i) {
        if ((c0783i instanceof C0793b) == null) {
            return null;
        }
        return new af(this, this.a.getContext()) {
            /* renamed from: f */
            final /* synthetic */ aj f18644f;

            /* renamed from: a */
            protected void mo765a(View view, C0795s c0795s, C0792a c0792a) {
                view = this.f18644f.mo3865a(this.f18644f.a.getLayoutManager(), view);
                c0795s = view[null];
                view = view[1];
                int a = m16681a(Math.max(Math.abs(c0795s), Math.abs(view)));
                if (a > 0) {
                    c0792a.m3220a(c0795s, view, a, this.b);
                }
            }

            /* renamed from: a */
            protected float mo3861a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* renamed from: b */
            protected int mo3862b(int i) {
                return Math.min(100, super.mo3862b(i));
            }
        };
    }

    /* renamed from: a */
    private int m24718a(C0783i c0783i, View view, ai aiVar) {
        int a = aiVar.mo767a(view) + (aiVar.mo775e(view) / 2);
        if (c0783i.m3150s() != null) {
            c0783i = aiVar.mo770c() + (aiVar.mo776f() / 2);
        } else {
            c0783i = aiVar.mo774e() / 2;
        }
        return a - c0783i;
    }

    /* renamed from: a */
    private View m24719a(C0783i c0783i, ai aiVar) {
        int w = c0783i.m3154w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int c;
        if (c0783i.m3150s()) {
            c = aiVar.mo770c() + (aiVar.mo776f() / 2);
        } else {
            c = aiVar.mo774e() / 2;
        }
        int i = BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < w; i2++) {
            View j = c0783i.m3137j(i2);
            int abs = Math.abs((aiVar.mo767a(j) + (aiVar.mo775e(j) / 2)) - c);
            if (abs < i) {
                view = j;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    private View m24720b(C0783i c0783i, ai aiVar) {
        int w = c0783i.m3154w();
        View view = null;
        if (w == 0) {
            return null;
        }
        int i = BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < w; i2++) {
            View j = c0783i.m3137j(i2);
            int a = aiVar.mo767a(j);
            if (a < i) {
                view = j;
                i = a;
            }
        }
        return view;
    }

    /* renamed from: d */
    private ai m24721d(C0783i c0783i) {
        if (this.f18645b == null || this.f18645b.f2785a != c0783i) {
            this.f18645b = ai.m3474b(c0783i);
        }
        return this.f18645b;
    }

    /* renamed from: e */
    private ai m24722e(C0783i c0783i) {
        if (this.f18646c == null || this.f18646c.f2785a != c0783i) {
            this.f18646c = ai.m3472a(c0783i);
        }
        return this.f18646c;
    }
}
