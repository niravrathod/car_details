package com.cuvora.carinfo.videomodule.ui.viewmodels;

import android.arch.lifecycle.C0035q;
import com.cuvora.carinfo.videomodule.ui.model.C3729b;
import com.cuvora.carinfo.videomodule.ui.model.C3730d;
import kotlin.jvm.internal.C2885g;

public final class HomeFragmentViewModel extends C0035q {
    /* renamed from: a */
    private C1615a f14988a;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.viewmodels.HomeFragmentViewModel$a */
    public interface C1615a {
        /* renamed from: a */
        void mo4644a(C3729b c3729b);

        /* renamed from: a */
        void mo4645a(C3730d c3730d);
    }

    /* renamed from: a */
    public final void m18639a(C1615a c1615a) {
        this.f14988a = c1615a;
    }

    /* renamed from: a */
    public final void m18637a(C3729b c3729b) {
        C2885g.m13910b(c3729b, "homeRailModel");
        C1615a c1615a = this.f14988a;
        if (c1615a != null) {
            c1615a.mo4644a(c3729b);
        }
    }

    /* renamed from: a */
    public final void m18638a(C3730d c3730d) {
        C2885g.m13910b(c3730d, "railItemModel");
        C1615a c1615a = this.f14988a;
        if (c1615a != null) {
            c1615a.mo4645a(c3730d);
        }
    }
}
