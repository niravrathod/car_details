package com.cuvora.carinfo.videomodule.ui.viewmodels;

import android.arch.lifecycle.C0035q;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import kotlin.jvm.internal.C2885g;

public final class SeeAllFragmentViewModel extends C0035q {
    /* renamed from: a */
    private C1616a f14989a;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.viewmodels.SeeAllFragmentViewModel$a */
    public interface C1616a {
        /* renamed from: a */
        void mo4647a(C3730d c3730d);
    }

    /* renamed from: a */
    public final void m18641a(C1616a c1616a) {
        this.f14989a = c1616a;
    }

    /* renamed from: a */
    public final void m18640a(C3730d c3730d) {
        C2885g.m13910b(c3730d, "railItemModel");
        C1616a c1616a = this.f14989a;
        if (c1616a != null) {
            c1616a.mo4647a(c3730d);
        }
    }
}
