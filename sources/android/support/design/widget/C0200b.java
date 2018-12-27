package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.design.C0143a.C0132a;
import android.support.design.C0143a.C0139h;
import android.support.design.C0143a.C0142k;
import android.support.design.widget.C0215k.C0213a;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0165d;
import android.support.design.widget.SwipeDismissBehavior.C0173a;
import android.support.v4.view.C0554n;
import android.support.v4.view.C0560r;
import android.support.v4.view.C0571z;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.widget.b */
public abstract class C0200b<B extends C0200b<B>> {
    /* renamed from: a */
    static final Handler f718a = new Handler(Looper.getMainLooper(), new C01901());
    /* renamed from: d */
    private static final boolean f719d;
    /* renamed from: b */
    final C0199f f720b;
    /* renamed from: c */
    final C0213a f721c = new C30616(this);
    /* renamed from: e */
    private final ViewGroup f722e;
    /* renamed from: f */
    private final Context f723f;
    /* renamed from: g */
    private final C0196c f724g;
    /* renamed from: h */
    private int f725h;
    /* renamed from: i */
    private List<C0195a<B>> f726i;
    /* renamed from: j */
    private final AccessibilityManager f727j;

    /* renamed from: android.support.design.widget.b$1 */
    static class C01901 implements Callback {
        C01901() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((C0200b) message.obj).m687c();
                    return true;
                case 1:
                    ((C0200b) message.obj).m688c(message.arg1);
                    return true;
                default:
                    return null;
            }
        }
    }

    /* renamed from: android.support.design.widget.b$3 */
    class C01923 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ C0200b f711a;
        /* renamed from: b */
        private int f712b = null;

        C01923(C0200b c0200b) {
            this.f711a = c0200b;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (C0200b.f719d) {
                C0560r.m2190c(this.f711a.f720b, valueAnimator - this.f712b);
            } else {
                this.f711a.f720b.setTranslationY((float) valueAnimator);
            }
            this.f712b = valueAnimator;
        }
    }

    /* renamed from: android.support.design.widget.b$a */
    public static abstract class C0195a<B> {
        /* renamed from: a */
        public void mo132a(B b) {
        }

        /* renamed from: a */
        public void mo133a(B b, int i) {
        }
    }

    /* renamed from: android.support.design.widget.b$c */
    public interface C0196c {
        /* renamed from: a */
        void mo89a(int i, int i2);

        /* renamed from: b */
        void mo90b(int i, int i2);
    }

    /* renamed from: android.support.design.widget.b$d */
    interface C0197d {
        /* renamed from: a */
        void mo149a(View view);

        /* renamed from: b */
        void mo150b(View view);
    }

    /* renamed from: android.support.design.widget.b$e */
    interface C0198e {
        /* renamed from: a */
        void mo151a(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.design.widget.b$f */
    static class C0199f extends FrameLayout {
        /* renamed from: a */
        private C0198e f716a;
        /* renamed from: b */
        private C0197d f717b;

        C0199f(Context context) {
            this(context, null);
        }

        C0199f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0142k.SnackbarLayout);
            if (context.hasValue(C0142k.SnackbarLayout_elevation) != null) {
                C0560r.m2166a((View) this, (float) context.getDimensionPixelSize(C0142k.SnackbarLayout_elevation, 0));
            }
            context.recycle();
            setClickable(true);
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f716a) {
                this.f716a.mo151a(this, i, i2, i3, i4);
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f717b != null) {
                this.f717b.mo149a(this);
            }
            C0560r.m2204p(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f717b != null) {
                this.f717b.mo150b(this);
            }
        }

        void setOnLayoutChangeListener(C0198e c0198e) {
            this.f716a = c0198e;
        }

        void setOnAttachStateChangeListener(C0197d c0197d) {
            this.f717b = c0197d;
        }
    }

    /* renamed from: android.support.design.widget.b$5 */
    class C30605 implements C0554n {
        /* renamed from: a */
        final /* synthetic */ C0200b f12977a;

        C30605(C0200b c0200b) {
            this.f12977a = c0200b;
        }

        /* renamed from: a */
        public C0571z mo88a(View view, C0571z c0571z) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c0571z.m2255d());
            return c0571z;
        }
    }

    /* renamed from: android.support.design.widget.b$6 */
    class C30616 implements C0213a {
        /* renamed from: a */
        final /* synthetic */ C0200b f12978a;

        C30616(C0200b c0200b) {
            this.f12978a = c0200b;
        }

        /* renamed from: a */
        public void mo145a() {
            C0200b.f718a.sendMessage(C0200b.f718a.obtainMessage(0, this.f12978a));
        }

        /* renamed from: a */
        public void mo146a(int i) {
            C0200b.f718a.sendMessage(C0200b.f718a.obtainMessage(1, i, 0, this.f12978a));
        }
    }

    /* renamed from: android.support.design.widget.b$7 */
    class C30627 implements C0173a {
        /* renamed from: a */
        final /* synthetic */ C0200b f12979a;

        C30627(C0200b c0200b) {
            this.f12979a = c0200b;
        }

        /* renamed from: a */
        public void mo148a(View view) {
            view.setVisibility(8);
            this.f12979a.m685b(0);
        }

        /* renamed from: a */
        public void mo147a(int i) {
            switch (i) {
                case 0:
                    C0215k.m788a().m800d(this.f12979a.f721c);
                    return;
                case 1:
                case 2:
                    C0215k.m788a().m799c(this.f12979a.f721c);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.design.widget.b$8 */
    class C30638 implements C0197d {
        /* renamed from: a */
        final /* synthetic */ C0200b f12980a;

        /* renamed from: android.support.design.widget.b$8$1 */
        class C01941 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C30638 f715a;

            C01941(C30638 c30638) {
                this.f715a = c30638;
            }

            public void run() {
                this.f715a.f12980a.m690d(3);
            }
        }

        /* renamed from: a */
        public void mo149a(View view) {
        }

        C30638(C0200b c0200b) {
            this.f12980a = c0200b;
        }

        /* renamed from: b */
        public void mo150b(View view) {
            if (this.f12980a.m686b() != null) {
                C0200b.f718a.post(new C01941(this));
            }
        }
    }

    /* renamed from: android.support.design.widget.b$9 */
    class C30649 implements C0198e {
        /* renamed from: a */
        final /* synthetic */ C0200b f12981a;

        C30649(C0200b c0200b) {
            this.f12981a = c0200b;
        }

        /* renamed from: a */
        public void mo151a(View view, int i, int i2, int i3, int i4) {
            this.f12981a.f720b.setOnLayoutChangeListener(0);
            if (this.f12981a.m692f() != null) {
                this.f12981a.m689d();
            } else {
                this.f12981a.m691e();
            }
        }
    }

    /* renamed from: android.support.design.widget.b$b */
    final class C4413b extends SwipeDismissBehavior<C0199f> {
        /* renamed from: a */
        final /* synthetic */ C0200b f18372a;

        C4413b(C0200b c0200b) {
            this.f18372a = c0200b;
        }

        /* renamed from: a */
        public boolean mo3733a(View view) {
            return view instanceof C0199f;
        }

        /* renamed from: a */
        public boolean m24162a(CoordinatorLayout coordinatorLayout, C0199f c0199f, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.m24128a((View) c0199f, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0215k.m788a().m799c(this.f18372a.f721c);
                            break;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            C0215k.m788a().m800d(this.f18372a.f721c);
            return super.mo113a(coordinatorLayout, (View) c0199f, motionEvent);
        }
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        f719d = z;
    }

    protected C0200b(ViewGroup viewGroup, View view, C0196c c0196c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (c0196c != null) {
            this.f722e = viewGroup;
            this.f724g = c0196c;
            this.f723f = viewGroup.getContext();
            C0219m.m807a(this.f723f);
            this.f720b = (C0199f) LayoutInflater.from(this.f723f).inflate(C0139h.design_layout_snackbar, this.f722e, false);
            this.f720b.addView(view);
            C0560r.m2185b(this.f720b, 1);
            C0560r.m2167a(this.f720b, 1);
            C0560r.m2187b(this.f720b, true);
            C0560r.m2176a(this.f720b, new C30605(this));
            this.f727j = (AccessibilityManager) this.f723f.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: a */
    public B m681a(int i) {
        this.f725h = i;
        return this;
    }

    /* renamed from: a */
    public void m683a() {
        C0215k.m788a().m794a(this.f725h, this.f721c);
    }

    /* renamed from: b */
    void m685b(int i) {
        C0215k.m788a().m796a(this.f721c, i);
    }

    /* renamed from: a */
    public B m682a(C0195a<B> c0195a) {
        if (c0195a == null) {
            return this;
        }
        if (this.f726i == null) {
            this.f726i = new ArrayList();
        }
        this.f726i.add(c0195a);
        return this;
    }

    /* renamed from: b */
    public B m684b(C0195a<B> c0195a) {
        if (c0195a == null || this.f726i == null) {
            return this;
        }
        this.f726i.remove(c0195a);
        return this;
    }

    /* renamed from: b */
    public boolean m686b() {
        return C0215k.m788a().m801e(this.f721c);
    }

    /* renamed from: c */
    final void m687c() {
        if (this.f720b.getParent() == null) {
            LayoutParams layoutParams = this.f720b.getLayoutParams();
            if (layoutParams instanceof C0165d) {
                C0165d c0165d = (C0165d) layoutParams;
                Behavior c4413b = new C4413b(this);
                c4413b.m15011a(0.1f);
                c4413b.m15016b(0.6f);
                c4413b.m15012a(0);
                c4413b.m15013a(new C30627(this));
                c0165d.m578a(c4413b);
                c0165d.f603g = 80;
            }
            this.f722e.addView(this.f720b);
        }
        this.f720b.setOnAttachStateChangeListener(new C30638(this));
        if (!C0560r.m2212x(this.f720b)) {
            this.f720b.setOnLayoutChangeListener(new C30649(this));
        } else if (m692f()) {
            m689d();
        } else {
            m691e();
        }
    }

    /* renamed from: d */
    void m689d() {
        if (VERSION.SDK_INT >= 12) {
            final int height = this.f720b.getHeight();
            if (f719d) {
                C0560r.m2190c(this.f720b, height);
            } else {
                this.f720b.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C0189a.f700b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: a */
                final /* synthetic */ C0200b f704a;

                {
                    this.f704a = r1;
                }

                public void onAnimationStart(Animator animator) {
                    this.f704a.f724g.mo89a(70, 180);
                }

                public void onAnimationEnd(Animator animator) {
                    this.f704a.m691e();
                }
            });
            valueAnimator.addUpdateListener(new AnimatorUpdateListener(this) {
                /* renamed from: b */
                final /* synthetic */ C0200b f706b;
                /* renamed from: c */
                private int f707c = height;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (C0200b.f719d) {
                        C0560r.m2190c(this.f706b.f720b, valueAnimator - this.f707c);
                    } else {
                        this.f706b.f720b.setTranslationY((float) valueAnimator);
                    }
                    this.f707c = valueAnimator;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f720b.getContext(), C0132a.design_snackbar_in);
        loadAnimation.setInterpolator(C0189a.f700b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            /* renamed from: a */
            final /* synthetic */ C0200b f708a;

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            {
                this.f708a = r1;
            }

            public void onAnimationEnd(Animation animation) {
                this.f708a.m691e();
            }
        });
        this.f720b.startAnimation(loadAnimation);
    }

    /* renamed from: e */
    private void m679e(final int i) {
        if (VERSION.SDK_INT >= 12) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{0, this.f720b.getHeight()});
            valueAnimator.setInterpolator(C0189a.f700b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: b */
                final /* synthetic */ C0200b f710b;

                public void onAnimationStart(Animator animator) {
                    this.f710b.f724g.mo90b(0, 180);
                }

                public void onAnimationEnd(Animator animator) {
                    this.f710b.m690d(i);
                }
            });
            valueAnimator.addUpdateListener(new C01923(this));
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f720b.getContext(), C0132a.design_snackbar_out);
        loadAnimation.setInterpolator(C0189a.f700b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            /* renamed from: b */
            final /* synthetic */ C0200b f714b;

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                this.f714b.m690d(i);
            }
        });
        this.f720b.startAnimation(loadAnimation);
    }

    /* renamed from: c */
    final void m688c(int i) {
        if (m692f() && this.f720b.getVisibility() == 0) {
            m679e(i);
        } else {
            m690d(i);
        }
    }

    /* renamed from: e */
    void m691e() {
        C0215k.m788a().m798b(this.f721c);
        if (this.f726i != null) {
            for (int size = this.f726i.size() - 1; size >= 0; size--) {
                ((C0195a) this.f726i.get(size)).mo132a(this);
            }
        }
    }

    /* renamed from: d */
    void m690d(int i) {
        C0215k.m788a().m795a(this.f721c);
        if (this.f726i != null) {
            for (int size = this.f726i.size() - 1; size >= 0; size--) {
                ((C0195a) this.f726i.get(size)).mo133a(this, i);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f720b.setVisibility(8);
        }
        i = this.f720b.getParent();
        if (i instanceof ViewGroup) {
            ((ViewGroup) i).removeView(this.f720b);
        }
    }

    /* renamed from: f */
    boolean m692f() {
        return this.f727j.isEnabled() ^ 1;
    }
}
