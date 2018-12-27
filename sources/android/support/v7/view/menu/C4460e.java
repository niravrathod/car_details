package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.C0543c;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.widget.MenuPopupWindow;
import android.support.v7.widget.ag;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C4460e extends C3232m implements C0728o, OnKeyListener, OnDismissListener {
    /* renamed from: a */
    final Handler f18503a;
    /* renamed from: b */
    final List<C0720a> f18504b = new ArrayList();
    /* renamed from: c */
    View f18505c;
    /* renamed from: d */
    boolean f18506d;
    /* renamed from: e */
    private final Context f18507e;
    /* renamed from: f */
    private final int f18508f;
    /* renamed from: g */
    private final int f18509g;
    /* renamed from: h */
    private final int f18510h;
    /* renamed from: i */
    private final boolean f18511i;
    /* renamed from: j */
    private final List<C3224h> f18512j = new ArrayList();
    /* renamed from: k */
    private final OnGlobalLayoutListener f18513k = new C07171(this);
    /* renamed from: l */
    private final OnAttachStateChangeListener f18514l = new C07182(this);
    /* renamed from: m */
    private final ag f18515m = new C32223(this);
    /* renamed from: n */
    private int f18516n = 0;
    /* renamed from: o */
    private int f18517o = 0;
    /* renamed from: p */
    private View f18518p;
    /* renamed from: q */
    private int f18519q;
    /* renamed from: r */
    private boolean f18520r;
    /* renamed from: s */
    private boolean f18521s;
    /* renamed from: t */
    private int f18522t;
    /* renamed from: u */
    private int f18523u;
    /* renamed from: v */
    private boolean f18524v;
    /* renamed from: w */
    private boolean f18525w;
    /* renamed from: x */
    private C0727a f18526x;
    /* renamed from: y */
    private ViewTreeObserver f18527y;
    /* renamed from: z */
    private OnDismissListener f18528z;

    /* renamed from: android.support.v7.view.menu.e$1 */
    class C07171 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ C4460e f2303a;

        C07171(C4460e c4460e) {
            this.f2303a = c4460e;
        }

        public void onGlobalLayout() {
            if (this.f2303a.mo696f() && this.f2303a.f18504b.size() > 0 && !((C0720a) this.f2303a.f18504b.get(0)).f2309a.m16426c()) {
                View view = this.f2303a.f18505c;
                if (view != null) {
                    if (view.isShown()) {
                        for (C0720a c0720a : this.f2303a.f18504b) {
                            c0720a.f2309a.mo694d();
                        }
                        return;
                    }
                }
                this.f2303a.mo695e();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.e$2 */
    class C07182 implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ C4460e f2304a;

        public void onViewAttachedToWindow(View view) {
        }

        C07182(C4460e c4460e) {
            this.f2304a = c4460e;
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.f2304a.f18527y != null) {
                if (!this.f2304a.f18527y.isAlive()) {
                    this.f2304a.f18527y = view.getViewTreeObserver();
                }
                this.f2304a.f18527y.removeGlobalOnLayoutListener(this.f2304a.f18513k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C0720a {
        /* renamed from: a */
        public final MenuPopupWindow f2309a;
        /* renamed from: b */
        public final C3224h f2310b;
        /* renamed from: c */
        public final int f2311c;

        public C0720a(MenuPopupWindow menuPopupWindow, C3224h c3224h, int i) {
            this.f2309a = menuPopupWindow;
            this.f2310b = c3224h;
            this.f2311c = i;
        }

        /* renamed from: a */
        public ListView m2810a() {
            return this.f2309a.mo697g();
        }
    }

    /* renamed from: android.support.v7.view.menu.e$3 */
    class C32223 implements ag {
        /* renamed from: a */
        final /* synthetic */ C4460e f13562a;

        C32223(C4460e c4460e) {
            this.f13562a = c4460e;
        }

        /* renamed from: a */
        public void mo607a(C3224h c3224h, MenuItem menuItem) {
            this.f13562a.f18503a.removeCallbacksAndMessages(c3224h);
        }

        /* renamed from: b */
        public void mo608b(final C3224h c3224h, final MenuItem menuItem) {
            C0720a c0720a = null;
            this.f13562a.f18503a.removeCallbacksAndMessages(null);
            int size = this.f13562a.f18504b.size();
            int i = 0;
            while (i < size) {
                if (c3224h == ((C0720a) this.f13562a.f18504b.get(i)).f2310b) {
                    break;
                }
                i++;
            }
            i = -1;
            if (i != -1) {
                i++;
                if (i < this.f13562a.f18504b.size()) {
                    c0720a = (C0720a) this.f13562a.f18504b.get(i);
                }
                this.f13562a.f18503a.postAtTime(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C32223 f2308d;

                    public void run() {
                        if (c0720a != null) {
                            this.f2308d.f13562a.f18506d = true;
                            c0720a.f2310b.m16161b(false);
                            this.f2308d.f13562a.f18506d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            c3224h.m16155a(menuItem, 4);
                        }
                    }
                }, c3224h, SystemClock.uptimeMillis() + 200);
            }
        }
    }

    /* renamed from: a */
    public void mo76a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public boolean mo80a() {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo85c() {
        return null;
    }

    /* renamed from: h */
    protected boolean mo3829h() {
        return false;
    }

    public C4460e(Context context, View view, int i, int i2, boolean z) {
        this.f18507e = context;
        this.f18518p = view;
        this.f18509g = i;
        this.f18510h = i2;
        this.f18511i = z;
        this.f18524v = false;
        this.f18519q = m24436k();
        context = context.getResources();
        this.f18508f = Math.max(context.getDisplayMetrics().widthPixels / 2, context.getDimensionPixelSize(C0630d.abc_config_prefDialogWidth));
        this.f18503a = new Handler();
    }

    /* renamed from: b */
    public void mo3826b(boolean z) {
        this.f18524v = z;
    }

    /* renamed from: j */
    private MenuPopupWindow m24435j() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f18507e, null, this.f18509g, this.f18510h);
        menuPopupWindow.m24578a(this.f18515m);
        menuPopupWindow.m16418a((OnItemClickListener) this);
        menuPopupWindow.m16420a((OnDismissListener) this);
        menuPopupWindow.m16423b(this.f18518p);
        menuPopupWindow.m16430e(this.f18517o);
        menuPopupWindow.m16421a(true);
        menuPopupWindow.m16436h(2);
        return menuPopupWindow;
    }

    /* renamed from: d */
    public void mo694d() {
        if (!mo696f()) {
            for (C3224h c : this.f18512j) {
                m24432c(c);
            }
            this.f18512j.clear();
            this.f18505c = this.f18518p;
            if (this.f18505c != null) {
                Object obj = this.f18527y == null ? 1 : null;
                this.f18527y = this.f18505c.getViewTreeObserver();
                if (obj != null) {
                    this.f18527y.addOnGlobalLayoutListener(this.f18513k);
                }
                this.f18505c.addOnAttachStateChangeListener(this.f18514l);
            }
        }
    }

    /* renamed from: e */
    public void mo695e() {
        int size = this.f18504b.size();
        if (size > 0) {
            C0720a[] c0720aArr = (C0720a[]) this.f18504b.toArray(new C0720a[size]);
            for (size--; size >= 0; size--) {
                C0720a c0720a = c0720aArr[size];
                if (c0720a.f2309a.mo696f()) {
                    c0720a.f2309a.mo695e();
                }
            }
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return null;
        }
        mo695e();
        return true;
    }

    /* renamed from: k */
    private int m24436k() {
        return C0560r.m2193e(this.f18518p) == 1 ? 0 : 1;
    }

    /* renamed from: d */
    private int m24433d(int i) {
        ListView a = ((C0720a) this.f18504b.get(this.f18504b.size() - 1)).m2810a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f18505c.getWindowVisibleDisplayFrame(rect);
        if (this.f18519q == 1) {
            if ((iArr[0] + a.getWidth()) + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo3822a(C3224h c3224h) {
        c3224h.m16150a((C0728o) this, this.f18507e);
        if (mo696f()) {
            m24432c(c3224h);
        } else {
            this.f18512j.add(c3224h);
        }
    }

    /* renamed from: c */
    private void m24432c(C3224h c3224h) {
        C0720a c0720a;
        View a;
        LayoutInflater from = LayoutInflater.from(this.f18507e);
        ListAdapter c0722g = new C0722g(c3224h, from, this.f18511i);
        if (!mo696f() && this.f18524v) {
            c0722g.m2815a(true);
        } else if (mo696f()) {
            c0722g.m2815a(C3232m.m16230b(c3224h));
        }
        int a2 = C3232m.m16228a(c0722g, null, this.f18507e, this.f18508f);
        MenuPopupWindow j = m24435j();
        j.mo3850a(c0722g);
        j.m16434g(a2);
        j.m16430e(this.f18517o);
        if (this.f18504b.size() > 0) {
            c0720a = (C0720a) this.f18504b.get(this.f18504b.size() - 1);
            a = m24428a(c0720a, c3224h);
        } else {
            c0720a = null;
            a = c0720a;
        }
        if (a != null) {
            int i;
            j.mo3859c(false);
            j.m24579a(null);
            int d = m24433d(a2);
            Object obj = d == 1 ? 1 : null;
            this.f18519q = d;
            if (VERSION.SDK_INT >= 26) {
                j.m16423b(a);
                d = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f18518p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                a.getLocationOnScreen(iArr2);
                if ((this.f18517o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f18518p.getWidth();
                    iArr2[0] = iArr2[0] + a.getWidth();
                }
                i = iArr2[0] - iArr[0];
                d = iArr2[1] - iArr[1];
            }
            i = (this.f18517o & 5) == 5 ? obj != null ? i + a2 : i - a.getWidth() : obj != null ? i + a.getWidth() : i - a2;
            j.m16425c(i);
            j.m16424b(true);
            j.m16428d(d);
        } else {
            if (this.f18520r) {
                j.m16425c(this.f18522t);
            }
            if (this.f18521s) {
                j.m16428d(this.f18523u);
            }
            j.m16416a(m16245i());
        }
        this.f18504b.add(new C0720a(j, c3224h, this.f18519q));
        j.mo694d();
        ViewGroup g = j.mo697g();
        g.setOnKeyListener(this);
        if (c0720a == null && this.f18525w && c3224h.m16181m() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0633g.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(c3224h.m16181m());
            g.addHeaderView(frameLayout, null, false);
            j.mo694d();
        }
    }

    /* renamed from: a */
    private MenuItem m24427a(C3224h c3224h, C3224h c3224h2) {
        int size = c3224h.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c3224h.getItem(i);
            if (item.hasSubMenu() && c3224h2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m24428a(C0720a c0720a, C3224h c3224h) {
        c3224h = m24427a(c0720a.f2310b, c3224h);
        if (c3224h == null) {
            return null;
        }
        int headersCount;
        C0722g c0722g;
        c0720a = c0720a.m2810a();
        ListAdapter adapter = c0720a.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0722g = (C0722g) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0722g = (C0722g) adapter;
            headersCount = 0;
        }
        int count = c0722g.getCount();
        while (i < count) {
            if (c3224h == c0722g.m2814a(i)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return null;
        }
        i = (i + headersCount) - c0720a.getFirstVisiblePosition();
        if (i >= 0) {
            if (i < c0720a.getChildCount()) {
                return c0720a.getChildAt(i);
            }
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo696f() {
        return this.f18504b.size() > 0 && ((C0720a) this.f18504b.get(0)).f2309a.mo696f();
    }

    public void onDismiss() {
        C0720a c0720a;
        int size = this.f18504b.size();
        for (int i = 0; i < size; i++) {
            c0720a = (C0720a) this.f18504b.get(i);
            if (!c0720a.f2309a.mo696f()) {
                break;
            }
        }
        c0720a = null;
        if (c0720a != null) {
            c0720a.f2310b.m16161b(false);
        }
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        for (C0720a a : this.f18504b) {
            C3232m.m16229a(a.m2810a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo78a(C0727a c0727a) {
        this.f18526x = c0727a;
    }

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        for (C0720a c0720a : this.f18504b) {
            if (c4465u == c0720a.f2310b) {
                c0720a.m2810a().requestFocus();
                return true;
            }
        }
        if (!c4465u.hasVisibleItems()) {
            return null;
        }
        mo3822a((C3224h) c4465u);
        if (this.f18526x != null) {
            this.f18526x.mo491a(c4465u);
        }
        return true;
    }

    /* renamed from: d */
    private int m24434d(C3224h c3224h) {
        int size = this.f18504b.size();
        for (int i = 0; i < size; i++) {
            if (c3224h == ((C0720a) this.f18504b.get(i)).f2310b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
        int d = m24434d(c3224h);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f18504b.size()) {
                ((C0720a) this.f18504b.get(i)).f2310b.m16161b(false);
            }
            C0720a c0720a = (C0720a) this.f18504b.remove(d);
            c0720a.f2310b.m16160b((C0728o) this);
            if (this.f18506d) {
                c0720a.f2309a.m24581b(null);
                c0720a.f2309a.m16422b(0);
            }
            c0720a.f2309a.mo695e();
            d = this.f18504b.size();
            if (d > 0) {
                this.f18519q = ((C0720a) this.f18504b.get(d - 1)).f2311c;
            } else {
                this.f18519q = m24436k();
            }
            if (d == 0) {
                mo695e();
                if (this.f18526x) {
                    this.f18526x.mo490a(c3224h, true);
                }
                if (this.f18527y != null) {
                    if (this.f18527y.isAlive() != null) {
                        this.f18527y.removeGlobalOnLayoutListener(this.f18513k);
                    }
                    this.f18527y = null;
                }
                this.f18505c.removeOnAttachStateChangeListener(this.f18514l);
                this.f18528z.onDismiss();
            } else if (z) {
                ((C0720a) this.f18504b.get(0)).f2310b.m16161b(false);
            }
        }
    }

    /* renamed from: a */
    public void mo3821a(int i) {
        if (this.f18516n != i) {
            this.f18516n = i;
            this.f18517o = C0543c.m2037a(i, C0560r.m2193e(this.f18518p));
        }
    }

    /* renamed from: a */
    public void mo3823a(View view) {
        if (this.f18518p != view) {
            this.f18518p = view;
            this.f18517o = C0543c.m2037a(this.f18516n, C0560r.m2193e(this.f18518p));
        }
    }

    /* renamed from: a */
    public void mo3824a(OnDismissListener onDismissListener) {
        this.f18528z = onDismissListener;
    }

    /* renamed from: g */
    public ListView mo697g() {
        if (this.f18504b.isEmpty()) {
            return null;
        }
        return ((C0720a) this.f18504b.get(this.f18504b.size() - 1)).m2810a();
    }

    /* renamed from: b */
    public void mo3825b(int i) {
        this.f18520r = true;
        this.f18522t = i;
    }

    /* renamed from: c */
    public void mo3827c(int i) {
        this.f18521s = true;
        this.f18523u = i;
    }

    /* renamed from: c */
    public void mo3828c(boolean z) {
        this.f18525w = z;
    }
}
