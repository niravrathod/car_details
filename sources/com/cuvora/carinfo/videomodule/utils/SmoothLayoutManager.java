package com.cuvora.carinfo.videomodule.utils;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.C0795s;
import android.util.AttributeSet;
import kotlin.jvm.internal.C2885g;

public final class SmoothLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    private Context f18967a;
    /* renamed from: b */
    private int f18968b;
    /* renamed from: c */
    private boolean f18969c;

    public SmoothLayoutManager(Context context) {
        C2885g.m13910b(context, "context");
        super(context, 1, false);
        this.f18967a = context;
        context = this.f18967a;
        if (context == null) {
            C2885g.m13906a();
        }
        Object resources = context.getResources();
        C2885g.m13907a(resources, "mContext!!.resources");
        this.f18968b = resources.getDisplayMetrics().heightPixels * 2;
    }

    public SmoothLayoutManager(Context context, int i, boolean z) {
        C2885g.m13910b(context, "context");
        super(context, i, z);
        this.f18967a = context;
        context = this.f18967a;
        if (context == null) {
            C2885g.m13906a();
        }
        Object resources = context.getResources();
        C2885g.m13907a(resources, "mContext!!.resources");
        this.f18968b = resources.getDisplayMetrics().heightPixels * 2;
    }

    public SmoothLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attrs");
        super(context, attributeSet, i, i2);
        this.f18967a = context;
        context = this.f18967a;
        if (context == null) {
            C2885g.m13906a();
        }
        Object resources = context.getResources();
        C2885g.m13907a(resources, "mContext!!.resources");
        this.f18968b = resources.getDisplayMetrics().heightPixels * 2;
    }

    /* renamed from: b */
    protected int mo3936b(C0795s c0795s) {
        C2885g.m13910b(c0795s, "state");
        if (this.f18969c) {
            return super.mo3936b(c0795s);
        }
        return this.f18968b;
    }

    /* renamed from: m */
    public void mo755m(int i) {
        super.mo755m(i);
        if (i == 0) {
            this.f18969c = true;
        }
    }
}
