package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzbv;

@zzaer
public final class zzanz {
    /* renamed from: a */
    private final View f8941a;
    /* renamed from: b */
    private Activity f8942b;
    /* renamed from: c */
    private boolean f8943c;
    /* renamed from: d */
    private boolean f8944d;
    /* renamed from: e */
    private boolean f8945e;
    /* renamed from: f */
    private OnGlobalLayoutListener f8946f;
    /* renamed from: g */
    private OnScrollChangedListener f8947g;

    public zzanz(Activity activity, View view, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        this.f8942b = activity;
        this.f8941a = view;
        this.f8946f = onGlobalLayoutListener;
        this.f8947g = onScrollChangedListener;
    }

    /* renamed from: a */
    public final void m9948a(Activity activity) {
        this.f8942b = activity;
    }

    /* renamed from: a */
    public final void m9947a() {
        this.f8945e = true;
        if (this.f8944d) {
            m9945e();
        }
    }

    /* renamed from: b */
    public final void m9949b() {
        this.f8945e = false;
        m9946f();
    }

    /* renamed from: c */
    public final void m9950c() {
        this.f8944d = true;
        if (this.f8945e) {
            m9945e();
        }
    }

    /* renamed from: d */
    public final void m9951d() {
        this.f8944d = false;
        m9946f();
    }

    /* renamed from: e */
    private final void m9945e() {
        if (!this.f8943c) {
            Activity activity;
            ViewTreeObserver b;
            if (this.f8946f != null) {
                if (this.f8942b != null) {
                    activity = this.f8942b;
                    OnGlobalLayoutListener onGlobalLayoutListener = this.f8946f;
                    b = m9944b(activity);
                    if (b != null) {
                        b.addOnGlobalLayoutListener(onGlobalLayoutListener);
                    }
                }
                zzbv.zzfi();
                zzaqa.m10047a(this.f8941a, this.f8946f);
            }
            if (this.f8947g != null) {
                if (this.f8942b != null) {
                    activity = this.f8942b;
                    OnScrollChangedListener onScrollChangedListener = this.f8947g;
                    b = m9944b(activity);
                    if (b != null) {
                        b.addOnScrollChangedListener(onScrollChangedListener);
                    }
                }
                zzbv.zzfi();
                zzaqa.m10048a(this.f8941a, this.f8947g);
            }
            this.f8943c = true;
        }
    }

    /* renamed from: f */
    private final void m9946f() {
        if (this.f8942b != null && this.f8943c) {
            Activity activity;
            ViewTreeObserver b;
            if (this.f8946f != null) {
                activity = this.f8942b;
                OnGlobalLayoutListener onGlobalLayoutListener = this.f8946f;
                b = m9944b(activity);
                if (b != null) {
                    zzbv.zzem().mo4958a(b, onGlobalLayoutListener);
                }
            }
            if (this.f8947g != null) {
                activity = this.f8942b;
                OnScrollChangedListener onScrollChangedListener = this.f8947g;
                b = m9944b(activity);
                if (b != null) {
                    b.removeOnScrollChangedListener(onScrollChangedListener);
                }
            }
            this.f8943c = false;
        }
    }

    /* renamed from: b */
    private static ViewTreeObserver m9944b(Activity activity) {
        if (activity == null) {
            return null;
        }
        activity = activity.getWindow();
        if (activity == null) {
            return null;
        }
        activity = activity.getDecorView();
        if (activity == null) {
            return null;
        }
        return activity.getViewTreeObserver();
    }
}
