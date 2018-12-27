package com.cuvora.carinfo.videomodule.utils;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import kotlin.jvm.internal.C2885g;

public final class CarauselLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    private Context f18965a;
    /* renamed from: b */
    private int f18966b;

    public CarauselLayoutManager(Context context) {
        C2885g.m13910b(context, "context");
        super(context, 1, false);
        m3115d(true);
        mo3935f(3);
        this.f18965a = context;
    }

    public CarauselLayoutManager(Context context, int i, boolean z) {
        C2885g.m13910b(context, "context");
        super(context, i, z);
        m3115d((boolean) 1);
        mo3935f(3);
        this.f18965a = context;
        context = this.f18965a;
        if (context == null) {
            C2885g.m13906a();
        }
        Object resources = context.getResources();
        C2885g.m13907a(resources, "mContext!!.resources");
        this.f18966b = resources.getDisplayMetrics().heightPixels * 2;
    }

    public CarauselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attrs");
        super(context, attributeSet, i, i2);
        m3115d(true);
        mo3935f(3);
        this.f18965a = context;
        context = this.f18965a;
        if (context == null) {
            C2885g.m13906a();
        }
        Object resources = context.getResources();
        C2885g.m13907a(resources, "mContext!!.resources");
        this.f18966b = resources.getDisplayMetrics().heightPixels * 2;
    }

    /* renamed from: f */
    public void mo3935f(int i) {
        super.mo3935f(i);
    }
}
