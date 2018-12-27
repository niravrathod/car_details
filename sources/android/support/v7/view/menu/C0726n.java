package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.view.menu.C0728o.C0727a;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.n */
public class C0726n {
    /* renamed from: a */
    private final Context f2321a;
    /* renamed from: b */
    private final C3224h f2322b;
    /* renamed from: c */
    private final boolean f2323c;
    /* renamed from: d */
    private final int f2324d;
    /* renamed from: e */
    private final int f2325e;
    /* renamed from: f */
    private View f2326f;
    /* renamed from: g */
    private int f2327g;
    /* renamed from: h */
    private boolean f2328h;
    /* renamed from: i */
    private C0727a f2329i;
    /* renamed from: j */
    private C3232m f2330j;
    /* renamed from: k */
    private OnDismissListener f2331k;
    /* renamed from: l */
    private final OnDismissListener f2332l;

    /* renamed from: android.support.v7.view.menu.n$1 */
    class C07251 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C0726n f2320a;

        C07251(C0726n c0726n) {
            this.f2320a = c0726n;
        }

        public void onDismiss() {
            this.f2320a.mo635e();
        }
    }

    public C0726n(Context context, C3224h c3224h, View view, boolean z, int i) {
        this(context, c3224h, view, z, i, 0);
    }

    public C0726n(Context context, C3224h c3224h, View view, boolean z, int i, int i2) {
        this.f2327g = 8388611;
        this.f2332l = new C07251(this);
        this.f2321a = context;
        this.f2322b = c3224h;
        this.f2326f = view;
        this.f2323c = z;
        this.f2324d = i;
        this.f2325e = i2;
    }

    /* renamed from: a */
    public void m2826a(OnDismissListener onDismissListener) {
        this.f2331k = onDismissListener;
    }

    /* renamed from: a */
    public void m2825a(View view) {
        this.f2326f = view;
    }

    /* renamed from: a */
    public void m2827a(boolean z) {
        this.f2328h = z;
        if (this.f2330j != null) {
            this.f2330j.mo3826b(z);
        }
    }

    /* renamed from: a */
    public void m2823a(int i) {
        this.f2327g = i;
    }

    /* renamed from: a */
    public void m2822a() {
        if (!m2830c()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: b */
    public C3232m m2829b() {
        if (this.f2330j == null) {
            this.f2330j = m2821g();
        }
        return this.f2330j;
    }

    /* renamed from: c */
    public boolean m2830c() {
        if (m2833f()) {
            return true;
        }
        if (this.f2326f == null) {
            return false;
        }
        m2820a(0, 0, false, false);
        return true;
    }

    /* renamed from: a */
    public boolean m2828a(int i, int i2) {
        if (m2833f()) {
            return true;
        }
        if (this.f2326f == null) {
            return false;
        }
        m2820a(i, i2, true, true);
        return true;
    }

    /* renamed from: g */
    private C3232m m2821g() {
        Display defaultDisplay = ((WindowManager) this.f2321a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        if ((Math.min(point.x, point.y) >= this.f2321a.getResources().getDimensionPixelSize(C0630d.abc_cascading_menus_min_smallest_width) ? 1 : null) != null) {
            C3232m c4460e = new C4460e(this.f2321a, this.f2326f, this.f2324d, this.f2325e, this.f2323c);
        } else {
            C3232m c4464t = new C4464t(this.f2321a, this.f2322b, this.f2326f, this.f2324d, this.f2325e, this.f2323c);
        }
        r0.mo3822a(this.f2322b);
        r0.mo3824a(this.f2332l);
        r0.mo3823a(this.f2326f);
        r0.mo78a(this.f2329i);
        r0.mo3826b(this.f2328h);
        r0.mo3821a(this.f2327g);
        return r0;
    }

    /* renamed from: a */
    private void m2820a(int i, int i2, boolean z, boolean z2) {
        C3232m b = m2829b();
        b.mo3828c(z2);
        if (z) {
            if (C0543c.m2037a(this.f2327g, C0560r.m2193e(this.f2326f)) & 7) {
                i += this.f2326f.getWidth();
            }
            b.mo3825b(i);
            b.mo3827c(i2);
            z = (int) ((this.f2321a.getResources().getDisplayMetrics().density * true) / true);
            b.m16233a(new Rect(i - z, i2 - z, i + z, i2 + z));
        }
        b.mo694d();
    }

    /* renamed from: d */
    public void m2831d() {
        if (m2833f()) {
            this.f2330j.mo695e();
        }
    }

    /* renamed from: e */
    protected void mo635e() {
        this.f2330j = null;
        if (this.f2331k != null) {
            this.f2331k.onDismiss();
        }
    }

    /* renamed from: f */
    public boolean m2833f() {
        return this.f2330j != null && this.f2330j.mo696f();
    }

    /* renamed from: a */
    public void m2824a(C0727a c0727a) {
        this.f2329i = c0727a;
        if (this.f2330j != null) {
            this.f2330j.mo78a(c0727a);
        }
    }
}
