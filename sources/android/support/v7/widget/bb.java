package android.support.v7.widget;

import android.support.v4.view.C0560r;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

class bb implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    /* renamed from: i */
    private static bb f2857i;
    /* renamed from: j */
    private static bb f2858j;
    /* renamed from: a */
    private final View f2859a;
    /* renamed from: b */
    private final CharSequence f2860b;
    /* renamed from: c */
    private final Runnable f2861c = new C08451(this);
    /* renamed from: d */
    private final Runnable f2862d = new C08462(this);
    /* renamed from: e */
    private int f2863e;
    /* renamed from: f */
    private int f2864f;
    /* renamed from: g */
    private bc f2865g;
    /* renamed from: h */
    private boolean f2866h;

    /* renamed from: android.support.v7.widget.bb$1 */
    class C08451 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bb f2855a;

        C08451(bb bbVar) {
            this.f2855a = bbVar;
        }

        public void run() {
            this.f2855a.m3567a(false);
        }
    }

    /* renamed from: android.support.v7.widget.bb$2 */
    class C08462 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bb f2856a;

        C08462(bb bbVar) {
            this.f2856a = bbVar;
        }

        public void run() {
            this.f2856a.m3563a();
        }
    }

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: a */
    public static void m3566a(View view, CharSequence charSequence) {
        if (f2857i != null && f2857i.f2859a == view) {
            m3569b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f2858j != null && f2858j.f2859a == view) {
                f2858j.m3563a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(null);
            view.setOnHoverListener(null);
            return;
        }
        bb bbVar = new bb(view, charSequence);
    }

    private bb(View view, CharSequence charSequence) {
        this.f2859a = view;
        this.f2860b = charSequence;
        this.f2859a.setOnLongClickListener(this);
        this.f2859a.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.f2863e = view.getWidth() / 2;
        this.f2864f = view.getHeight() / 2;
        m3567a(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f2865g != null && this.f2866h != null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2859a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() != null) {
            return false;
        }
        view = motionEvent.getAction();
        if (view != 7) {
            if (view == 10) {
                m3563a();
            }
        } else if (this.f2859a.isEnabled() != null && this.f2865g == null) {
            this.f2863e = (int) motionEvent.getX();
            this.f2864f = (int) motionEvent.getY();
            m3569b(this);
        }
        return false;
    }

    public void onViewDetachedFromWindow(View view) {
        m3563a();
    }

    /* renamed from: a */
    private void m3567a(boolean z) {
        if (C0560r.m2162A(this.f2859a)) {
            long j;
            m3569b(null);
            if (f2858j != null) {
                f2858j.m3563a();
            }
            f2858j = this;
            this.f2866h = z;
            this.f2865g = new bc(this.f2859a.getContext());
            this.f2865g.m3574a(this.f2859a, this.f2863e, this.f2864f, this.f2866h, this.f2860b);
            this.f2859a.addOnAttachStateChangeListener(this);
            if (this.f2866h) {
                j = 2500;
            } else if (C0560r.m2203o(this.f2859a) & true) {
                j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f2859a.removeCallbacks(this.f2862d);
            this.f2859a.postDelayed(this.f2862d, j);
        }
    }

    /* renamed from: a */
    private void m3563a() {
        if (f2858j == this) {
            f2858j = null;
            if (this.f2865g != null) {
                this.f2865g.m3573a();
                this.f2865g = null;
                this.f2859a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2857i == this) {
            m3569b(null);
        }
        this.f2859a.removeCallbacks(this.f2862d);
    }

    /* renamed from: b */
    private static void m3569b(bb bbVar) {
        if (f2857i != null) {
            f2857i.m3570c();
        }
        f2857i = bbVar;
        if (f2857i != null) {
            f2857i.m3568b();
        }
    }

    /* renamed from: b */
    private void m3568b() {
        this.f2859a.postDelayed(this.f2861c, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: c */
    private void m3570c() {
        this.f2859a.removeCallbacks(this.f2861c);
    }
}
