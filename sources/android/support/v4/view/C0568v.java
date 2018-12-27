package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: android.support.v4.view.v */
public final class C0568v {
    /* renamed from: a */
    Runnable f1784a = null;
    /* renamed from: b */
    Runnable f1785b = null;
    /* renamed from: c */
    int f1786c = -1;
    /* renamed from: d */
    private WeakReference<View> f1787d;

    /* renamed from: android.support.v4.view.v$a */
    static class C3172a implements C0569w {
        /* renamed from: a */
        C0568v f13320a;
        /* renamed from: b */
        boolean f13321b;

        C3172a(C0568v c0568v) {
            this.f13320a = c0568v;
        }

        /* renamed from: a */
        public void mo452a(View view) {
            this.f13321b = false;
            C0569w c0569w = null;
            if (this.f13320a.f1786c > -1) {
                view.setLayerType(2, null);
            }
            if (this.f13320a.f1784a != null) {
                Runnable runnable = this.f13320a.f1784a;
                this.f13320a.f1784a = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof C0569w) {
                c0569w = (C0569w) tag;
            }
            if (c0569w != null) {
                c0569w.mo452a(view);
            }
        }

        /* renamed from: b */
        public void mo453b(View view) {
            C0569w c0569w = null;
            if (this.f13320a.f1786c > -1) {
                view.setLayerType(this.f13320a.f1786c, null);
                this.f13320a.f1786c = -1;
            }
            if (VERSION.SDK_INT >= 16 || !this.f13321b) {
                if (this.f13320a.f1785b != null) {
                    Runnable runnable = this.f13320a.f1785b;
                    this.f13320a.f1785b = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof C0569w) {
                    c0569w = (C0569w) tag;
                }
                if (c0569w != null) {
                    c0569w.mo453b(view);
                }
                this.f13321b = true;
            }
        }

        /* renamed from: c */
        public void mo454c(View view) {
            Object tag = view.getTag(2113929216);
            C0569w c0569w = tag instanceof C0569w ? (C0569w) tag : null;
            if (c0569w != null) {
                c0569w.mo454c(view);
            }
        }
    }

    C0568v(View view) {
        this.f1787d = new WeakReference(view);
    }

    /* renamed from: a */
    public C0568v m2237a(long j) {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: a */
    public C0568v m2236a(float f) {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: b */
    public C0568v m2241b(float f) {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: a */
    public long m2235a() {
        View view = (View) this.f1787d.get();
        return view != null ? view.animate().getDuration() : 0;
    }

    /* renamed from: a */
    public C0568v m2240a(Interpolator interpolator) {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: b */
    public C0568v m2242b(long j) {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: b */
    public void m2243b() {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public void m2244c() {
        View view = (View) this.f1787d.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: a */
    public C0568v m2238a(C0569w c0569w) {
        View view = (View) this.f1787d.get();
        if (view != null) {
            if (VERSION.SDK_INT >= 16) {
                m2234a(view, c0569w);
            } else {
                view.setTag(2113929216, c0569w);
                m2234a(view, new C3172a(this));
            }
        }
        return this;
    }

    /* renamed from: a */
    private void m2234a(final View view, final C0569w c0569w) {
        if (c0569w != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) {
                /* renamed from: c */
                final /* synthetic */ C0568v f1780c;

                public void onAnimationCancel(Animator animator) {
                    c0569w.mo454c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    c0569w.mo453b(view);
                }

                public void onAnimationStart(Animator animator) {
                    c0569w.mo452a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: a */
    public C0568v m2239a(final C0570y c0570y) {
        final View view = (View) this.f1787d.get();
        if (view != null && VERSION.SDK_INT >= 19) {
            AnimatorUpdateListener animatorUpdateListener = null;
            if (c0570y != null) {
                animatorUpdateListener = new AnimatorUpdateListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ C0568v f1783c;

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        c0570y.mo549a(view);
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }
}
