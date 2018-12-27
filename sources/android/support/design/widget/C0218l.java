package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.l */
final class C0218l {
    /* renamed from: a */
    ValueAnimator f831a = null;
    /* renamed from: b */
    private final ArrayList<C0217a> f832b = new ArrayList();
    /* renamed from: c */
    private C0217a f833c = null;
    /* renamed from: d */
    private final AnimatorListener f834d = new C02161(this);

    /* renamed from: android.support.design.widget.l$1 */
    class C02161 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C0218l f828a;

        C02161(C0218l c0218l) {
            this.f828a = c0218l;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f828a.f831a == animator) {
                this.f828a.f831a = null;
            }
        }
    }

    /* renamed from: android.support.design.widget.l$a */
    static class C0217a {
        /* renamed from: a */
        final int[] f829a;
        /* renamed from: b */
        final ValueAnimator f830b;

        C0217a(int[] iArr, ValueAnimator valueAnimator) {
            this.f829a = iArr;
            this.f830b = valueAnimator;
        }
    }

    C0218l() {
    }

    /* renamed from: a */
    public void m806a(int[] iArr, ValueAnimator valueAnimator) {
        C0217a c0217a = new C0217a(iArr, valueAnimator);
        valueAnimator.addListener(this.f834d);
        this.f832b.add(c0217a);
    }

    /* renamed from: a */
    void m805a(int[] iArr) {
        C0217a c0217a;
        int size = this.f832b.size();
        for (int i = 0; i < size; i++) {
            c0217a = (C0217a) this.f832b.get(i);
            if (StateSet.stateSetMatches(c0217a.f829a, iArr)) {
                break;
            }
        }
        c0217a = null;
        if (c0217a != this.f833c) {
            if (this.f833c != null) {
                m803b();
            }
            this.f833c = c0217a;
            if (c0217a != null) {
                m802a(c0217a);
            }
        }
    }

    /* renamed from: a */
    private void m802a(C0217a c0217a) {
        this.f831a = c0217a.f830b;
        this.f831a.start();
    }

    /* renamed from: b */
    private void m803b() {
        if (this.f831a != null) {
            this.f831a.cancel();
            this.f831a = null;
        }
    }

    /* renamed from: a */
    public void m804a() {
        if (this.f831a != null) {
            this.f831a.end();
            this.f831a = null;
        }
    }
}
