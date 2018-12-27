package com.cuvora.carinfo.videomodule.utils;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0794r;
import android.support.v7.widget.RecyclerView.C0795s;
import android.support.v7.widget.af;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

public class VariableScrollSpeedLinearLayoutManager extends LinearLayoutManager {
    /* renamed from: a */
    private final float f18971a = 20.0f;

    public VariableScrollSpeedLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    public VariableScrollSpeedLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public VariableScrollSpeedLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public void mo674a(RecyclerView recyclerView, C0795s c0795s, int i) {
        c0795s = new af(this, recyclerView.getContext()) {
            /* renamed from: f */
            final /* synthetic */ VariableScrollSpeedLinearLayoutManager f18970f;

            /* renamed from: c */
            public PointF mo3937c(int i) {
                return this.f18970f.mo684d(i);
            }

            /* renamed from: a */
            protected float mo3861a(DisplayMetrics displayMetrics) {
                return super.mo3861a(displayMetrics) * 20.0f;
            }
        };
        c0795s.m3234d(i);
        m3055a((C0794r) c0795s);
    }
}
