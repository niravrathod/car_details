package com.airbnb.lottie.p036d;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.d.a */
public abstract class C0950a extends ValueAnimator {
    /* renamed from: a */
    private final Set<AnimatorUpdateListener> f3136a = new CopyOnWriteArraySet();
    /* renamed from: b */
    private final Set<AnimatorListener> f3137b = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void addUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f3136a.add(animatorUpdateListener);
    }

    public void removeUpdateListener(AnimatorUpdateListener animatorUpdateListener) {
        this.f3136a.remove(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.f3136a.clear();
    }

    public void addListener(AnimatorListener animatorListener) {
        this.f3137b.add(animatorListener);
    }

    public void removeListener(AnimatorListener animatorListener) {
        this.f3137b.remove(animatorListener);
    }

    public void removeAllListeners() {
        this.f3137b.clear();
    }

    /* renamed from: a */
    void m4081a(boolean z) {
        for (AnimatorListener animatorListener : this.f3137b) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* renamed from: a */
    void m4080a() {
        for (AnimatorListener onAnimationRepeat : this.f3137b) {
            onAnimationRepeat.onAnimationRepeat(this);
        }
    }

    /* renamed from: b */
    void m4083b(boolean z) {
        for (AnimatorListener animatorListener : this.f3137b) {
            if (VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: b */
    void m4082b() {
        for (AnimatorListener onAnimationCancel : this.f3137b) {
            onAnimationCancel.onAnimationCancel(this);
        }
    }

    /* renamed from: c */
    void m4084c() {
        for (AnimatorUpdateListener onAnimationUpdate : this.f3136a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }
}
