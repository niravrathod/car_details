package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0783i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.facebook.ads.internal.view.hscroll.d */
public class C4814d extends RecyclerView implements OnTouchListener {
    /* renamed from: J */
    protected final int f21115J = m27915z();
    /* renamed from: K */
    protected int f21116K = 0;
    /* renamed from: L */
    private int f21117L = 0;
    /* renamed from: M */
    private boolean f21118M = true;
    /* renamed from: N */
    private boolean f21119N = false;
    /* renamed from: O */
    private LinearLayoutManager f21120O;
    /* renamed from: P */
    private C2079a f21121P;

    /* renamed from: com.facebook.ads.internal.view.hscroll.d$a */
    public interface C2079a {
        /* renamed from: k */
        int mo4915k(int i);
    }

    public C4814d(Context context) {
        super(context);
        setOnTouchListener(this);
    }

    public C4814d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(this);
    }

    public C4814d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnTouchListener(this);
    }

    private int getItemCount() {
        return getAdapter() == null ? 0 : getAdapter().mo91a();
    }

    /* renamed from: k */
    private int mo4915k(int i) {
        int i2 = this.f21117L - i;
        i = this.f21121P.mo4915k(i2);
        return i2 > this.f21115J ? m27913k(this.f21116K, i) : i2 < (-this.f21115J) ? m27914l(this.f21116K, i) : this.f21116K;
    }

    /* renamed from: k */
    private int m27913k(int i, int i2) {
        return Math.min(i + i2, getItemCount() - 1);
    }

    /* renamed from: l */
    private int m27914l(int i, int i2) {
        return Math.max(i - i2, 0);
    }

    /* renamed from: z */
    private int m27915z() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    /* renamed from: b */
    protected void mo4914b(int i, boolean z) {
        if (getAdapter() != null) {
            this.f21116K = i;
            if (z) {
                m24663c(i);
            } else {
                m24629a(i);
            }
        }
    }

    public int getCurrentPosition() {
        return this.f21116K;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (!(actionMasked == 1 || actionMasked == 6 || actionMasked == 3)) {
            if (actionMasked != 4) {
                if (actionMasked == 0 || actionMasked == 5 || (this.f21118M && actionMasked == 2)) {
                    this.f21117L = rawX;
                    if (this.f21118M) {
                        this.f21118M = false;
                    }
                    this.f21119N = true;
                }
                return false;
            }
        }
        if (this.f21119N) {
            mo4914b(mo4915k(rawX), true);
        }
        this.f21118M = true;
        this.f21119N = false;
        return true;
    }

    public void setLayoutManager(C0783i c0783i) {
        if (c0783i instanceof LinearLayoutManager) {
            super.setLayoutManager(c0783i);
            this.f21120O = (LinearLayoutManager) c0783i;
            return;
        }
        throw new IllegalArgumentException("SnapRecyclerView only supports LinearLayoutManager");
    }

    public void setSnapDelegate(C2079a c2079a) {
        this.f21121P = c2079a;
    }
}
