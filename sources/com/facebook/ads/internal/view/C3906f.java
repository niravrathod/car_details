package com.facebook.ads.internal.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.p009a.C0299a;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnDismissListener;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1734i;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p103b.C1940b;
import com.facebook.ads.internal.p101q.p103b.C1941c;
import com.facebook.ads.internal.p101q.p104c.C1952g;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.facebook.ads.internal.view.p110c.C2000c;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import com.facebook.ads.internal.view.p116f.p118b.C3880o;

/* renamed from: com.facebook.ads.internal.view.f */
public class C3906f extends LinearLayout implements C2039b {
    /* renamed from: c */
    private static final float f15543c = Resources.getSystem().getDisplayMetrics().density;
    /* renamed from: d */
    private static final int f15544d = ((int) (f15543c * 40.0f));
    /* renamed from: e */
    private static final int f15545e = ((int) (f15543c * 44.0f));
    /* renamed from: f */
    private static final int f15546f = ((int) (f15543c * 10.0f));
    /* renamed from: g */
    private static final int f15547g = ((int) (f15543c * 16.0f));
    /* renamed from: h */
    private static final int f15548h = (f15547g - f15546f);
    /* renamed from: i */
    private static final int f15549i = ((f15547g * 2) - f15546f);
    /* renamed from: a */
    private final C3880o f15550a = new C46131(this);
    /* renamed from: b */
    private final C3868c f15551b = new C46142(this);
    /* renamed from: j */
    private final ImageView f15552j;
    /* renamed from: k */
    private final FrameLayout f15553k;
    /* renamed from: l */
    private final ImageView f15554l;
    /* renamed from: m */
    private final CircularProgressView f15555m;
    /* renamed from: n */
    private final C2000c f15556n;
    /* renamed from: o */
    private final PopupMenu f15557o;
    /* renamed from: p */
    private C2032a f15558p;
    /* renamed from: q */
    private C3859a f15559q;
    /* renamed from: r */
    private int f15560r = 0;
    /* renamed from: s */
    private boolean f15561s = false;
    /* renamed from: t */
    private boolean f15562t = false;
    /* renamed from: u */
    private OnDismissListener f15563u;

    /* renamed from: com.facebook.ads.internal.view.f$3 */
    class C20283 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C3906f f6287a;

        C20283(C3906f c3906f) {
            this.f6287a = c3906f;
        }

        public void onDismiss(PopupMenu popupMenu) {
            this.f6287a.f15561s = false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$4 */
    class C20294 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3906f f6288a;

        C20294(C3906f c3906f) {
            this.f6288a = c3906f;
        }

        public void onClick(View view) {
            if (this.f6288a.f15558p != null && this.f6288a.f15562t) {
                this.f6288a.f15558p.mo1482a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$5 */
    class C20305 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3906f f6289a;

        C20305(C3906f c3906f) {
            this.f6289a = c3906f;
        }

        public void onClick(View view) {
            this.f6289a.f15557o.show();
            this.f6289a.f15561s = true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$a */
    public interface C2032a {
        /* renamed from: a */
        void mo1482a();
    }

    /* renamed from: com.facebook.ads.internal.view.f$1 */
    class C46131 extends C3880o {
        /* renamed from: a */
        final /* synthetic */ C3906f f19161a;

        C46131(C3906f c3906f) {
            this.f19161a = c3906f;
        }

        /* renamed from: a */
        public void m25500a(C3879n c3879n) {
            if (this.f19161a.f15559q != null && this.f19161a.f15560r != 0) {
                if (this.f19161a.f15555m.isShown()) {
                    float currentPositionInMillis = ((float) this.f19161a.f15559q.getCurrentPositionInMillis()) / Math.min(((float) this.f19161a.f15560r) * 1000.0f, (float) this.f19161a.f15559q.getDuration());
                    this.f19161a.setProgress(100.0f * currentPositionInMillis);
                    if (currentPositionInMillis >= 1.0f) {
                        this.f19161a.m19452a(true);
                        this.f19161a.f15559q.getEventBus().m6832b(this.f19161a.f15550a, this.f19161a.f15551b);
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f$2 */
    class C46142 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C3906f f19162a;

        C46142(C3906f c3906f) {
            this.f19162a = c3906f;
        }

        /* renamed from: a */
        public void m25502a(C3867b c3867b) {
            if (this.f19162a.f15559q != null && this.f19162a.f15560r != 0) {
                if (!this.f19162a.f15555m.isShown()) {
                    return;
                }
                if (!this.f19162a.f15562t) {
                    this.f19162a.m19452a(true);
                    this.f19162a.f15559q.getEventBus().m6832b(this.f19162a.f15550a, this.f19162a.f15551b);
                }
            }
        }
    }

    public C3906f(Context context) {
        super(context);
        setGravity(16);
        if (VERSION.SDK_INT >= 14) {
            this.f15563u = new C20283(this);
        }
        this.f15554l = new ImageView(context);
        this.f15554l.setPadding(f15546f, f15546f, f15546f, f15546f);
        this.f15554l.setScaleType(ScaleType.FIT_CENTER);
        this.f15554l.setImageBitmap(C1941c.m7340a(C1940b.INTERSTITIAL_CLOSE));
        this.f15554l.setOnClickListener(new C20294(this));
        this.f15555m = new CircularProgressView(context);
        this.f15555m.setPadding(f15546f, f15546f, f15546f, f15546f);
        this.f15555m.setProgress(0.0f);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(f15548h, f15548h, f15549i, f15548h);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(f15545e, f15545e);
        this.f15553k = new FrameLayout(context);
        this.f15553k.setLayoutTransition(new LayoutTransition());
        this.f15553k.addView(this.f15554l, layoutParams2);
        this.f15553k.addView(this.f15555m, layoutParams2);
        addView(this.f15553k, layoutParams);
        this.f15556n = new C2000c(context);
        layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        addView(this.f15556n, layoutParams);
        this.f15552j = new ImageView(context);
        this.f15552j.setPadding(f15546f, f15546f, f15546f, f15546f);
        this.f15552j.setScaleType(ScaleType.FIT_CENTER);
        this.f15552j.setImageBitmap(C1941c.m7340a(C1940b.INTERSTITIAL_AD_CHOICES));
        this.f15552j.setOnClickListener(new C20305(this));
        this.f15557o = new PopupMenu(context, this.f15552j);
        this.f15557o.getMenu().add("Ad Choices");
        LayoutParams layoutParams3 = new LinearLayout.LayoutParams(f15544d, f15544d);
        layoutParams3.setMargins(0, f15547g / 2, f15547g / 2, f15547g / 2);
        addView(this.f15552j, layoutParams3);
    }

    /* renamed from: a */
    public void m19449a(C1727d c1727d, boolean z) {
        int a = c1727d.m6524a(z);
        this.f15556n.m7520a(c1727d.m6530g(z), a);
        this.f15552j.setColorFilter(a);
        this.f15554l.setColorFilter(a);
        this.f15555m.m7522a(C0299a.m1070b(a, 77), a);
        if (z) {
            Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            C1936w.m7329a((View) this, gradientDrawable);
            return;
        }
        C1936w.m7328a((View) this, 0);
    }

    /* renamed from: a */
    public void m19450a(final C1734i c1734i, final String str, int i) {
        this.f15560r = i;
        this.f15556n.setPageDetails(c1734i);
        this.f15557o.setOnMenuItemClickListener(new OnMenuItemClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C3906f f6292c;

            public boolean onMenuItemClick(MenuItem menuItem) {
                this.f6292c.f15561s = false;
                if (!TextUtils.isEmpty(c1734i.m6565c())) {
                    C1952g.m7374a(new C1952g(), this.f6292c.getContext(), Uri.parse(c1734i.m6565c()), str);
                }
                return true;
            }
        });
        if (VERSION.SDK_INT >= 14) {
            this.f15557o.setOnDismissListener(this.f15563u);
        }
        m19452a(i <= 0);
    }

    /* renamed from: a */
    public void mo1440a(C3859a c3859a) {
        this.f15559q = c3859a;
        this.f15559q.getEventBus().m6830a(this.f15550a, this.f15551b);
    }

    /* renamed from: a */
    public void m19452a(boolean z) {
        this.f15562t = z;
        int i = 0;
        this.f15553k.setVisibility(0);
        this.f15555m.setVisibility(z ? 4 : 0);
        ImageView imageView = this.f15554l;
        if (!z) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public boolean m19453a() {
        return this.f15562t;
    }

    /* renamed from: b */
    public void m19454b() {
        this.f15562t = false;
        this.f15553k.setVisibility(4);
        this.f15555m.setVisibility(4);
        this.f15554l.setVisibility(4);
    }

    /* renamed from: b */
    public void mo1441b(C3859a c3859a) {
        if (this.f15559q != null) {
            this.f15559q.getEventBus().m6832b(this.f15550a, this.f15551b);
            this.f15559q = null;
        }
    }

    /* renamed from: c */
    public void m19456c() {
        this.f15556n.setVisibility(4);
    }

    /* renamed from: d */
    public void m19457d() {
        if (VERSION.SDK_INT >= 14) {
            this.f15557o.setOnDismissListener(null);
        }
        this.f15557o.dismiss();
        if (VERSION.SDK_INT >= 14) {
            this.f15557o.setOnDismissListener(this.f15563u);
        }
    }

    /* renamed from: e */
    public void m19458e() {
        if (this.f15561s && VERSION.SDK_INT >= 14) {
            this.f15557o.show();
        }
    }

    public void setProgress(float f) {
        this.f15555m.setProgressWithAnimation(f);
    }

    public void setShowPageDetails(boolean z) {
        this.f15556n.setVisibility(z ? 0 : 4);
    }

    public void setToolbarListener(C2032a c2032a) {
        this.f15558p = c2032a;
    }
}
