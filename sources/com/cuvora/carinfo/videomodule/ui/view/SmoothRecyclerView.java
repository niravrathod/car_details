package com.cuvora.carinfo.videomodule.ui.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import kotlin.jvm.internal.C2885g;

public final class SmoothRecyclerView extends RecyclerView {
    public SmoothRecyclerView(Context context, AttributeSet attributeSet) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(attributeSet, "attributeSet");
        super(context, attributeSet);
        setHasFixedSize(true);
    }

    /* renamed from: b */
    public boolean mo4652b(int i, int i2) {
        return super.mo4652b(i, (int) (((float) i2) * 1058642330));
    }
}
