package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.C0732s;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class ac implements OnAttachStateChangeListener, OnTouchListener {
    /* renamed from: a */
    private final float f2755a;
    /* renamed from: b */
    private final int f2756b;
    /* renamed from: c */
    final View f2757c;
    /* renamed from: d */
    private final int f2758d;
    /* renamed from: e */
    private Runnable f2759e;
    /* renamed from: f */
    private Runnable f2760f;
    /* renamed from: g */
    private boolean f2761g;
    /* renamed from: h */
    private int f2762h;
    /* renamed from: i */
    private final int[] f2763i = new int[2];

    /* renamed from: android.support.v7.widget.ac$a */
    private class C0836a implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ac f2753a;

        C0836a(ac acVar) {
            this.f2753a = acVar;
        }

        public void run() {
            ViewParent parent = this.f2753a.f2757c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ac$b */
    private class C0837b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ ac f2754a;

        C0837b(ac acVar) {
            this.f2754a = acVar;
        }

        public void run() {
            this.f2754a.m3447d();
        }
    }

    /* renamed from: a */
    public abstract C0732s mo581a();

    public void onViewAttachedToWindow(View view) {
    }

    public ac(View view) {
        this.f2757c = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f2755a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f2756b = ViewConfiguration.getTapTimeout();
        this.f2758d = (this.f2756b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        view = this.f2761g;
        if (view != null) {
            if (m3441b(motionEvent) == null) {
                if (mo637c() != null) {
                    motionEvent = null;
                }
            }
            motionEvent = true;
        } else {
            motionEvent = (m3438a(motionEvent) == null || mo582b() == null) ? null : true;
            if (motionEvent != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f2757c.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f2761g = motionEvent;
        if (motionEvent == null && view == null) {
            return false;
        }
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        this.f2761g = null;
        this.f2762h = -1;
        if (this.f2759e != null) {
            this.f2757c.removeCallbacks(this.f2759e);
        }
    }

    /* renamed from: b */
    protected boolean mo582b() {
        C0732s a = mo581a();
        if (!(a == null || a.mo696f())) {
            a.mo694d();
        }
        return true;
    }

    /* renamed from: c */
    protected boolean mo637c() {
        C0732s a = mo581a();
        if (a != null && a.mo696f()) {
            a.mo695e();
        }
        return true;
    }

    /* renamed from: a */
    private boolean m3438a(MotionEvent motionEvent) {
        View view = this.f2757c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f2762h = motionEvent.getPointerId(0);
                if (this.f2759e == null) {
                    this.f2759e = new C0836a(this);
                }
                view.postDelayed(this.f2759e, (long) this.f2756b);
                if (this.f2760f == null) {
                    this.f2760f = new C0837b(this);
                }
                view.postDelayed(this.f2760f, (long) this.f2758d);
                break;
            case 1:
            case 3:
                m3443e();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f2762h);
                if (findPointerIndex >= 0 && m3439a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f2755a) == null) {
                    m3443e();
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
            default:
                break;
        }
        return false;
    }

    /* renamed from: e */
    private void m3443e() {
        if (this.f2760f != null) {
            this.f2757c.removeCallbacks(this.f2760f);
        }
        if (this.f2759e != null) {
            this.f2757c.removeCallbacks(this.f2759e);
        }
    }

    /* renamed from: d */
    void m3447d() {
        m3443e();
        View view = this.f2757c;
        if (view.isEnabled()) {
            if (!view.isLongClickable()) {
                if (mo582b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    this.f2761g = true;
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m3441b(MotionEvent motionEvent) {
        View view = this.f2757c;
        C0732s a = mo581a();
        if (a != null) {
            if (a.mo696f()) {
                C0888z c0888z = (C0888z) a.mo697g();
                if (c0888z != null) {
                    if (c0888z.isShown()) {
                        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                        m3442b(view, obtainNoHistory);
                        m3440a(c0888z, obtainNoHistory);
                        boolean a2 = c0888z.mo699a(obtainNoHistory, this.f2762h);
                        obtainNoHistory.recycle();
                        motionEvent = motionEvent.getActionMasked();
                        boolean z = true;
                        motionEvent = (motionEvent == 1 || motionEvent == 3) ? null : true;
                        if (!a2 || motionEvent == null) {
                            z = false;
                        }
                        return z;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3439a(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return (f < f4 || f2 < f4 || f >= ((float) (view.getRight() - view.getLeft())) + f3 || f2 >= ((float) (view.getBottom() - view.getTop())) + f3) ? null : true;
    }

    /* renamed from: a */
    private boolean m3440a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2763i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[null]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private boolean m3442b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f2763i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[null], (float) iArr[1]);
        return true;
    }
}
