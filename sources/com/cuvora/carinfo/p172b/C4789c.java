package com.cuvora.carinfo.p172b;

import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.cuvora.carinfo.videomodule.ui.C1596b;
import java.util.List;

/* renamed from: com.cuvora.carinfo.b.c */
public abstract class C4789c extends ViewDataBinding {
    /* renamed from: c */
    public final RecyclerView f20936c;
    /* renamed from: d */
    protected List<C1596b> f20937d;

    /* renamed from: a */
    public abstract void mo4909a(List<C1596b> list);

    protected C4789c(C0059e c0059e, View view, int i, RecyclerView recyclerView) {
        super(c0059e, view, i);
        this.f20936c = recyclerView;
    }
}
