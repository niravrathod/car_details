package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.p020a.C0637a.C0630d;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.view.menu.C0728o.C0727a;
import android.support.v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.t */
final class C4464t extends C3232m implements C0728o, OnKeyListener, OnItemClickListener, OnDismissListener {
    /* renamed from: a */
    final MenuPopupWindow f18532a;
    /* renamed from: b */
    View f18533b;
    /* renamed from: c */
    private final Context f18534c;
    /* renamed from: d */
    private final C3224h f18535d;
    /* renamed from: e */
    private final C0722g f18536e;
    /* renamed from: f */
    private final boolean f18537f;
    /* renamed from: g */
    private final int f18538g;
    /* renamed from: h */
    private final int f18539h;
    /* renamed from: i */
    private final int f18540i;
    /* renamed from: j */
    private final OnGlobalLayoutListener f18541j = new C07331(this);
    /* renamed from: k */
    private final OnAttachStateChangeListener f18542k = new C07342(this);
    /* renamed from: l */
    private OnDismissListener f18543l;
    /* renamed from: m */
    private View f18544m;
    /* renamed from: n */
    private C0727a f18545n;
    /* renamed from: o */
    private ViewTreeObserver f18546o;
    /* renamed from: p */
    private boolean f18547p;
    /* renamed from: q */
    private boolean f18548q;
    /* renamed from: r */
    private int f18549r;
    /* renamed from: s */
    private int f18550s = 0;
    /* renamed from: t */
    private boolean f18551t;

    /* renamed from: android.support.v7.view.menu.t$1 */
    class C07331 implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ C4464t f2333a;

        C07331(C4464t c4464t) {
            this.f2333a = c4464t;
        }

        public void onGlobalLayout() {
            if (this.f2333a.mo696f() && !this.f2333a.f18532a.m16426c()) {
                View view = this.f2333a.f18533b;
                if (view != null) {
                    if (view.isShown()) {
                        this.f2333a.f18532a.mo694d();
                        return;
                    }
                }
                this.f2333a.mo695e();
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.t$2 */
    class C07342 implements OnAttachStateChangeListener {
        /* renamed from: a */
        final /* synthetic */ C4464t f2334a;

        public void onViewAttachedToWindow(View view) {
        }

        C07342(C4464t c4464t) {
            this.f2334a = c4464t;
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.f2334a.f18546o != null) {
                if (!this.f2334a.f18546o.isAlive()) {
                    this.f2334a.f18546o = view.getViewTreeObserver();
                }
                this.f2334a.f18546o.removeGlobalOnLayoutListener(this.f2334a.f18541j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: a */
    public void mo76a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo3822a(C3224h c3224h) {
    }

    /* renamed from: a */
    public boolean mo80a() {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo85c() {
        return null;
    }

    public C4464t(Context context, C3224h c3224h, View view, int i, int i2, boolean z) {
        this.f18534c = context;
        this.f18535d = c3224h;
        this.f18537f = z;
        this.f18536e = new C0722g(c3224h, LayoutInflater.from(context), this.f18537f);
        this.f18539h = i;
        this.f18540i = i2;
        i = context.getResources();
        this.f18538g = Math.max(i.getDisplayMetrics().widthPixels / 2, i.getDimensionPixelSize(C0630d.abc_config_prefDialogWidth));
        this.f18544m = view;
        this.f18532a = new MenuPopupWindow(this.f18534c, null, this.f18539h, this.f18540i);
        c3224h.m16150a((C0728o) this, context);
    }

    /* renamed from: b */
    public void mo3826b(boolean z) {
        this.f18536e.m2815a(z);
    }

    /* renamed from: a */
    public void mo3821a(int i) {
        this.f18550s = i;
    }

    /* renamed from: j */
    private boolean m24466j() {
        if (mo696f()) {
            return true;
        }
        if (!this.f18547p) {
            if (this.f18544m != null) {
                this.f18533b = this.f18544m;
                this.f18532a.m16420a((OnDismissListener) this);
                this.f18532a.m16418a((OnItemClickListener) this);
                this.f18532a.m16421a(true);
                View view = this.f18533b;
                Object obj = this.f18546o == null ? 1 : null;
                this.f18546o = view.getViewTreeObserver();
                if (obj != null) {
                    this.f18546o.addOnGlobalLayoutListener(this.f18541j);
                }
                view.addOnAttachStateChangeListener(this.f18542k);
                this.f18532a.m16423b(view);
                this.f18532a.m16430e(this.f18550s);
                if (!this.f18548q) {
                    this.f18549r = C3232m.m16228a(this.f18536e, null, this.f18534c, this.f18538g);
                    this.f18548q = true;
                }
                this.f18532a.m16434g(this.f18549r);
                this.f18532a.m16436h(2);
                this.f18532a.m16416a(m16245i());
                this.f18532a.mo694d();
                ViewGroup g = this.f18532a.mo697g();
                g.setOnKeyListener(this);
                if (this.f18551t && this.f18535d.m16181m() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f18534c).inflate(C0633g.abc_popup_menu_header_item_layout, g, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f18535d.m16181m());
                    }
                    frameLayout.setEnabled(false);
                    g.addHeaderView(frameLayout, null, false);
                }
                this.f18532a.mo3850a(this.f18536e);
                this.f18532a.mo694d();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo694d() {
        if (!m24466j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: e */
    public void mo695e() {
        if (mo696f()) {
            this.f18532a.mo695e();
        }
    }

    /* renamed from: f */
    public boolean mo696f() {
        return !this.f18547p && this.f18532a.mo696f();
    }

    public void onDismiss() {
        this.f18547p = true;
        this.f18535d.close();
        if (this.f18546o != null) {
            if (!this.f18546o.isAlive()) {
                this.f18546o = this.f18533b.getViewTreeObserver();
            }
            this.f18546o.removeGlobalOnLayoutListener(this.f18541j);
            this.f18546o = null;
        }
        this.f18533b.removeOnAttachStateChangeListener(this.f18542k);
        if (this.f18543l != null) {
            this.f18543l.onDismiss();
        }
    }

    /* renamed from: a */
    public void mo79a(boolean z) {
        this.f18548q = false;
        if (this.f18536e) {
            this.f18536e.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo78a(C0727a c0727a) {
        this.f18545n = c0727a;
    }

    /* renamed from: a */
    public boolean mo82a(C4465u c4465u) {
        if (c4465u.hasVisibleItems()) {
            C0726n c0726n = new C0726n(this.f18534c, c4465u, this.f18533b, this.f18537f, this.f18539h, this.f18540i);
            c0726n.m2824a(this.f18545n);
            c0726n.m2827a(C3232m.m16230b((C3224h) c4465u));
            c0726n.m2823a(this.f18550s);
            c0726n.m2826a(this.f18543l);
            this.f18543l = null;
            this.f18535d.m16161b(false);
            if (c0726n.m2828a(this.f18532a.m16439j(), this.f18532a.m16440k())) {
                if (this.f18545n != null) {
                    this.f18545n.mo491a(c4465u);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo77a(C3224h c3224h, boolean z) {
        if (c3224h == this.f18535d) {
            mo695e();
            if (this.f18545n != null) {
                this.f18545n.mo490a(c3224h, z);
            }
        }
    }

    /* renamed from: a */
    public void mo3823a(View view) {
        this.f18544m = view;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return null;
        }
        mo695e();
        return true;
    }

    /* renamed from: a */
    public void mo3824a(OnDismissListener onDismissListener) {
        this.f18543l = onDismissListener;
    }

    /* renamed from: g */
    public ListView mo697g() {
        return this.f18532a.mo697g();
    }

    /* renamed from: b */
    public void mo3825b(int i) {
        this.f18532a.m16425c(i);
    }

    /* renamed from: c */
    public void mo3827c(int i) {
        this.f18532a.m16428d(i);
    }

    /* renamed from: c */
    public void mo3828c(boolean z) {
        this.f18551t = z;
    }
}
