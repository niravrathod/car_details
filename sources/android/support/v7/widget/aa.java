package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.C0560r;
import android.support.v7.widget.RecyclerView.C0780h;
import android.support.v7.widget.RecyclerView.C0786l;
import android.support.v7.widget.RecyclerView.C0787m;
import android.support.v7.widget.RecyclerView.C0795s;
import android.view.MotionEvent;
import com.google.android.gms.common.ConnectionResult;

class aa extends C0780h implements C0786l {
    /* renamed from: g */
    private static final int[] f13897g = new int[]{16842919};
    /* renamed from: h */
    private static final int[] f13898h = new int[0];
    /* renamed from: A */
    private final int[] f13899A = new int[2];
    /* renamed from: B */
    private final ValueAnimator f13900B = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    /* renamed from: C */
    private int f13901C = 0;
    /* renamed from: D */
    private final Runnable f13902D = new C08321(this);
    /* renamed from: E */
    private final C0787m f13903E = new C32542(this);
    /* renamed from: a */
    int f13904a;
    /* renamed from: b */
    int f13905b;
    /* renamed from: c */
    float f13906c;
    /* renamed from: d */
    int f13907d;
    /* renamed from: e */
    int f13908e;
    /* renamed from: f */
    float f13909f;
    /* renamed from: i */
    private final int f13910i;
    /* renamed from: j */
    private final int f13911j;
    /* renamed from: k */
    private final StateListDrawable f13912k;
    /* renamed from: l */
    private final Drawable f13913l;
    /* renamed from: m */
    private final int f13914m;
    /* renamed from: n */
    private final int f13915n;
    /* renamed from: o */
    private final StateListDrawable f13916o;
    /* renamed from: p */
    private final Drawable f13917p;
    /* renamed from: q */
    private final int f13918q;
    /* renamed from: r */
    private final int f13919r;
    /* renamed from: s */
    private int f13920s = 0;
    /* renamed from: t */
    private int f13921t = 0;
    /* renamed from: u */
    private RecyclerView f13922u;
    /* renamed from: v */
    private boolean f13923v = false;
    /* renamed from: w */
    private boolean f13924w = false;
    /* renamed from: x */
    private int f13925x = 0;
    /* renamed from: y */
    private int f13926y = 0;
    /* renamed from: z */
    private final int[] f13927z = new int[2];

    /* renamed from: android.support.v7.widget.aa$1 */
    class C08321 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aa f2749a;

        C08321(aa aaVar) {
            this.f2749a = aaVar;
        }

        public void run() {
            this.f2749a.m16665a(500);
        }
    }

    /* renamed from: android.support.v7.widget.aa$a */
    private class C0833a extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ aa f2750a;
        /* renamed from: b */
        private boolean f2751b;

        private C0833a(aa aaVar) {
            this.f2750a = aaVar;
            this.f2751b = null;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f2751b != null) {
                this.f2751b = false;
                return;
            }
            if (((Float) this.f2750a.f13900B.getAnimatedValue()).floatValue() == 0.0f) {
                this.f2750a.f13901C = 0;
                this.f2750a.m16651b(0);
            } else {
                this.f2750a.f13901C = 2;
                this.f2750a.m16659d();
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f2751b = true;
        }
    }

    /* renamed from: android.support.v7.widget.aa$b */
    private class C0834b implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ aa f2752a;

        private C0834b(aa aaVar) {
            this.f2752a = aaVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            this.f2752a.f13912k.setAlpha(valueAnimator);
            this.f2752a.f13913l.setAlpha(valueAnimator);
            this.f2752a.m16659d();
        }
    }

    /* renamed from: android.support.v7.widget.aa$2 */
    class C32542 extends C0787m {
        /* renamed from: a */
        final /* synthetic */ aa f13896a;

        C32542(aa aaVar) {
            this.f13896a = aaVar;
        }

        /* renamed from: a */
        public void mo757a(RecyclerView recyclerView, int i, int i2) {
            this.f13896a.m16666a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: a */
    public void mo759a(boolean z) {
    }

    aa(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.f13912k = stateListDrawable;
        this.f13913l = drawable;
        this.f13916o = stateListDrawable2;
        this.f13917p = drawable2;
        this.f13914m = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f13915n = Math.max(i, drawable.getIntrinsicWidth());
        this.f13918q = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f13919r = Math.max(i, drawable2.getIntrinsicWidth());
        this.f13910i = i2;
        this.f13911j = i3;
        this.f13912k.setAlpha(255);
        this.f13913l.setAlpha(255);
        this.f13900B.addListener(new C0833a());
        this.f13900B.addUpdateListener(new C0834b());
        m16668a(recyclerView);
    }

    /* renamed from: a */
    public void m16668a(RecyclerView recyclerView) {
        if (this.f13922u != recyclerView) {
            if (this.f13922u != null) {
                m16656c();
            }
            this.f13922u = recyclerView;
            if (this.f13922u != null) {
                m16649b();
            }
        }
    }

    /* renamed from: b */
    private void m16649b() {
        this.f13922u.m24635a((C0780h) this);
        this.f13922u.m24638a((C0786l) this);
        this.f13922u.m24639a(this.f13903E);
    }

    /* renamed from: c */
    private void m16656c() {
        this.f13922u.m24654b((C0780h) this);
        this.f13922u.m24655b((C0786l) this);
        this.f13922u.m24656b(this.f13903E);
        m16661f();
    }

    /* renamed from: d */
    private void m16659d() {
        this.f13922u.invalidate();
    }

    /* renamed from: b */
    private void m16651b(int i) {
        if (i == 2 && this.f13925x != 2) {
            this.f13912k.setState(f13897g);
            m16661f();
        }
        if (i == 0) {
            m16659d();
        } else {
            m16664a();
        }
        if (this.f13925x == 2 && i != 2) {
            this.f13912k.setState(f13898h);
            m16657c(1200);
        } else if (i == 1) {
            m16657c((int) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f13925x = i;
    }

    /* renamed from: e */
    private boolean m16660e() {
        return C0560r.m2193e(this.f13922u) == 1;
    }

    /* renamed from: a */
    public void m16664a() {
        int i = this.f13901C;
        if (i != 0) {
            if (i == 3) {
                this.f13900B.cancel();
            } else {
                return;
            }
        }
        this.f13901C = 1;
        this.f13900B.setFloatValues(new float[]{((Float) this.f13900B.getAnimatedValue()).floatValue(), 1.0f});
        this.f13900B.setDuration(500);
        this.f13900B.setStartDelay(0);
        this.f13900B.start();
    }

    /* renamed from: a */
    void m16665a(int i) {
        switch (this.f13901C) {
            case 1:
                this.f13900B.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        this.f13901C = 3;
        this.f13900B.setFloatValues(new float[]{((Float) this.f13900B.getAnimatedValue()).floatValue(), 0.0f});
        this.f13900B.setDuration((long) i);
        this.f13900B.start();
    }

    /* renamed from: f */
    private void m16661f() {
        this.f13922u.removeCallbacks(this.f13902D);
    }

    /* renamed from: c */
    private void m16657c(int i) {
        m16661f();
        this.f13922u.postDelayed(this.f13902D, (long) i);
    }

    /* renamed from: a */
    public void mo758a(Canvas canvas, RecyclerView recyclerView, C0795s c0795s) {
        if (this.f13920s == this.f13922u.getWidth()) {
            if (this.f13921t == this.f13922u.getHeight()) {
                if (this.f13901C != null) {
                    if (this.f13923v != null) {
                        m16648a(canvas);
                    }
                    if (this.f13924w != null) {
                        m16652b(canvas);
                    }
                }
                return;
            }
        }
        this.f13920s = this.f13922u.getWidth();
        this.f13921t = this.f13922u.getHeight();
        m16651b((int) null);
    }

    /* renamed from: a */
    private void m16648a(Canvas canvas) {
        int i = this.f13920s - this.f13914m;
        int i2 = this.f13905b - (this.f13904a / 2);
        this.f13912k.setBounds(0, 0, this.f13914m, this.f13904a);
        this.f13913l.setBounds(0, 0, this.f13915n, this.f13921t);
        if (m16660e()) {
            this.f13913l.draw(canvas);
            canvas.translate((float) this.f13914m, (float) i2);
            canvas.scale(-1.0f, 1.0f);
            this.f13912k.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f13914m), (float) (-i2));
            return;
        }
        canvas.translate((float) i, 0.0f);
        this.f13913l.draw(canvas);
        canvas.translate(0.0f, (float) i2);
        this.f13912k.draw(canvas);
        canvas.translate((float) (-i), (float) (-i2));
    }

    /* renamed from: b */
    private void m16652b(Canvas canvas) {
        int i = this.f13921t - this.f13918q;
        int i2 = this.f13908e - (this.f13907d / 2);
        this.f13916o.setBounds(0, 0, this.f13907d, this.f13918q);
        this.f13917p.setBounds(0, 0, this.f13920s, this.f13919r);
        canvas.translate(0.0f, (float) i);
        this.f13917p.draw(canvas);
        canvas.translate((float) i2, 0.0f);
        this.f13916o.draw(canvas);
        canvas.translate((float) (-i2), (float) (-i));
    }

    /* renamed from: a */
    void m16666a(int i, int i2) {
        int computeVerticalScrollRange = this.f13922u.computeVerticalScrollRange();
        int i3 = this.f13921t;
        boolean z = computeVerticalScrollRange - i3 > 0 && this.f13921t >= this.f13910i;
        this.f13923v = z;
        int computeHorizontalScrollRange = this.f13922u.computeHorizontalScrollRange();
        int i4 = this.f13920s;
        boolean z2 = computeHorizontalScrollRange - i4 > 0 && this.f13920s >= this.f13910i;
        this.f13924w = z2;
        if (this.f13923v || this.f13924w) {
            if (this.f13923v) {
                float f = (float) i3;
                this.f13905b = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f13904a = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f13924w != 0) {
                i2 = (float) i4;
                this.f13908e = (int) ((i2 * (((float) i) + (i2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f13907d = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            if (this.f13925x == 0 || this.f13925x == 1) {
                m16651b(1);
            }
            return;
        }
        if (this.f13925x != 0) {
            m16651b(0);
        }
    }

    /* renamed from: a */
    public boolean mo760a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f13925x == 1) {
            recyclerView = m16670a(motionEvent.getX(), motionEvent.getY());
            boolean b = m16673b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (recyclerView == null && !b) {
                return false;
            }
            if (b) {
                this.f13926y = 1;
                this.f13909f = (float) ((int) motionEvent.getX());
            } else if (recyclerView != null) {
                this.f13926y = 2;
                this.f13906c = (float) ((int) motionEvent.getY());
            }
            m16651b(2);
        } else if (this.f13925x != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo761b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f13925x != null) {
            if (motionEvent.getAction() == null) {
                recyclerView = m16670a(motionEvent.getX(), motionEvent.getY());
                boolean b = m16673b(motionEvent.getX(), motionEvent.getY());
                if (recyclerView != null || b) {
                    if (b) {
                        this.f13926y = 1;
                        this.f13909f = (float) ((int) motionEvent.getX());
                    } else if (recyclerView != null) {
                        this.f13926y = 2;
                        this.f13906c = (float) ((int) motionEvent.getY());
                    }
                    m16651b(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f13925x == 2) {
                this.f13906c = 0.0f;
                this.f13909f = 0.0f;
                m16651b(1);
                this.f13926y = null;
            } else if (motionEvent.getAction() == 2 && this.f13925x == 2) {
                m16664a();
                if (this.f13926y == 1) {
                    m16650b(motionEvent.getX());
                }
                if (this.f13926y == 2) {
                    m16647a(motionEvent.getY());
                }
            }
        }
    }

    /* renamed from: a */
    private void m16647a(float f) {
        int[] g = m16662g();
        f = Math.max((float) g[0], Math.min((float) g[1], f));
        if (Math.abs(((float) this.f13905b) - f) >= 2.0f) {
            int a = m16644a(this.f13906c, f, g, this.f13922u.computeVerticalScrollRange(), this.f13922u.computeVerticalScrollOffset(), this.f13921t);
            if (a != 0) {
                this.f13922u.scrollBy(0, a);
            }
            this.f13906c = f;
        }
    }

    /* renamed from: b */
    private void m16650b(float f) {
        int[] h = m16663h();
        f = Math.max((float) h[0], Math.min((float) h[1], f));
        if (Math.abs(((float) this.f13908e) - f) >= 2.0f) {
            int a = m16644a(this.f13909f, f, h, this.f13922u.computeHorizontalScrollRange(), this.f13922u.computeHorizontalScrollOffset(), this.f13920s);
            if (a != 0) {
                this.f13922u.scrollBy(a, 0);
            }
            this.f13909f = f;
        }
    }

    /* renamed from: a */
    private int m16644a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        i -= i3;
        f = (int) (((f2 - f) / ((float) i4)) * ((float) i));
        i2 += f;
        return (i2 >= i || i2 < 0) ? 0 : f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    boolean m16670a(float r3, float r4) {
        /*
        r2 = this;
        r0 = r2.m16660e();
        if (r0 == 0) goto L_0x0010;
    L_0x0006:
        r0 = r2.f13914m;
        r0 = r0 / 2;
        r0 = (float) r0;
        r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r3 > 0) goto L_0x0034;
    L_0x000f:
        goto L_0x001a;
    L_0x0010:
        r0 = r2.f13920s;
        r1 = r2.f13914m;
        r0 = r0 - r1;
        r0 = (float) r0;
        r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r3 < 0) goto L_0x0034;
    L_0x001a:
        r3 = r2.f13905b;
        r0 = r2.f13904a;
        r0 = r0 / 2;
        r3 = r3 - r0;
        r3 = (float) r3;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x0034;
    L_0x0026:
        r3 = r2.f13905b;
        r0 = r2.f13904a;
        r0 = r0 / 2;
        r3 = r3 + r0;
        r3 = (float) r3;
        r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1));
        if (r3 > 0) goto L_0x0034;
    L_0x0032:
        r3 = 1;
        goto L_0x0035;
    L_0x0034:
        r3 = 0;
    L_0x0035:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.aa.a(float, float):boolean");
    }

    /* renamed from: b */
    boolean m16673b(float f, float f2) {
        return f2 >= ((float) (this.f13921t - this.f13918q)) && f >= ((float) (this.f13908e - (this.f13907d / 2))) && f <= ((float) (this.f13908e + (this.f13907d / 2)));
    }

    /* renamed from: g */
    private int[] m16662g() {
        this.f13927z[0] = this.f13911j;
        this.f13927z[1] = this.f13921t - this.f13911j;
        return this.f13927z;
    }

    /* renamed from: h */
    private int[] m16663h() {
        this.f13899A[0] = this.f13911j;
        this.f13899A[1] = this.f13920s - this.f13911j;
        return this.f13899A;
    }
}
