package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView.C0783i;
import android.support.v7.widget.RecyclerView.C0794r;
import android.support.v7.widget.RecyclerView.C0794r.C0792a;
import android.support.v7.widget.RecyclerView.C0794r.C0793b;
import android.support.v7.widget.RecyclerView.C0795s;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class af extends C0794r {
    /* renamed from: a */
    protected final LinearInterpolator f13932a = new LinearInterpolator();
    /* renamed from: b */
    protected final DecelerateInterpolator f13933b = new DecelerateInterpolator();
    /* renamed from: c */
    protected PointF f13934c;
    /* renamed from: d */
    protected int f13935d = 0;
    /* renamed from: e */
    protected int f13936e = 0;
    /* renamed from: f */
    private final float f13937f;

    /* renamed from: a */
    private int m16679a(int i, int i2) {
        i2 = i - i2;
        return i * i2 <= 0 ? 0 : i2;
    }

    /* renamed from: a */
    protected void mo763a() {
    }

    public af(Context context) {
        this.f13937f = mo3861a(context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    protected void mo765a(View view, C0795s c0795s, C0792a c0792a) {
        c0795s = mo3986b(view, mo3987c());
        view = m16683a(view, m16693d());
        int a = m16681a((int) Math.sqrt((double) ((c0795s * c0795s) + (view * view))));
        if (a > 0) {
            c0792a.m3220a(-c0795s, -view, a, this.f13933b);
        }
    }

    /* renamed from: a */
    protected void mo764a(int i, int i2, C0795s c0795s, C0792a c0792a) {
        if (m3241j() == null) {
            m3237f();
            return;
        }
        this.f13935d = m16679a(this.f13935d, i);
        this.f13936e = m16679a(this.f13936e, i2);
        if (this.f13935d == 0 && this.f13936e == 0) {
            m16686a(c0792a);
        }
    }

    /* renamed from: b */
    protected void mo766b() {
        this.f13936e = 0;
        this.f13935d = 0;
        this.f13934c = null;
    }

    /* renamed from: a */
    protected float mo3861a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: a */
    protected int m16681a(int i) {
        double b = (double) mo3862b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    /* renamed from: b */
    protected int mo3862b(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * this.f13937f));
    }

    /* renamed from: c */
    protected int mo3987c() {
        if (this.f13934c != null) {
            if (this.f13934c.x != 0.0f) {
                return this.f13934c.x > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: d */
    protected int m16693d() {
        if (this.f13934c != null) {
            if (this.f13934c.y != 0.0f) {
                return this.f13934c.y > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* renamed from: a */
    protected void m16686a(C0792a c0792a) {
        PointF c = mo3937c(m3240i());
        if (c != null) {
            if (c.x != 0.0f || c.y != 0.0f) {
                m3229a(c);
                this.f13934c = c;
                this.f13935d = (int) (c.x * 10000.0f);
                this.f13936e = (int) (c.y * 10000.0f);
                c0792a.m3220a((int) (((float) this.f13935d) * 1.2f), (int) (((float) this.f13936e) * 1.2f), (int) (((float) mo3862b(10000)) * 1.2f), this.f13932a);
                return;
            }
        }
        c0792a.m3219a(m3240i());
        m3237f();
    }

    /* renamed from: a */
    public int m16682a(int i, int i2, int i3, int i4, int i5) {
        switch (i5) {
            case -1:
                return i3 - i;
            case 0:
                i3 -= i;
                if (i3 > 0) {
                    return i3;
                }
                i4 -= i2;
                return i4 < 0 ? i4 : 0;
            case 1:
                return i4 - i2;
            default:
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: a */
    public int m16683a(View view, int i) {
        C0783i e = m3235e();
        if (e != null) {
            if (e.mo690f()) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return m16682a(e.m3134i(view) - layoutParams.topMargin, e.m3138k(view) + layoutParams.bottomMargin, e.m3027C(), e.m3025A() - e.m3029E(), i);
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo3986b(View view, int i) {
        C0783i e = m3235e();
        if (e != null) {
            if (e.mo688e()) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                return m16682a(e.m3132h(view) - layoutParams.leftMargin, e.m3136j(view) + layoutParams.rightMargin, e.m3026B(), e.m3157z() - e.m3028D(), i);
            }
        }
        return null;
    }

    /* renamed from: c */
    public PointF mo3937c(int i) {
        C0783i e = m3235e();
        if (e instanceof C0793b) {
            return ((C0793b) e).mo684d(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
        stringBuilder.append(C0793b.class.getCanonicalName());
        Log.w("LinearSmoothScroller", stringBuilder.toString());
        return 0;
    }
}
