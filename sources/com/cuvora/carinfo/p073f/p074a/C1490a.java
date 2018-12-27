package com.cuvora.carinfo.p073f.p074a;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.cuvora.carinfo.f.a.a */
public final class C1490a implements OnClickListener {
    /* renamed from: a */
    final C1489a f4482a;
    /* renamed from: b */
    final int f4483b;

    /* renamed from: com.cuvora.carinfo.f.a.a$a */
    public interface C1489a {
        /* renamed from: a */
        void mo4902a(int i, View view);
    }

    public C1490a(C1489a c1489a, int i) {
        this.f4482a = c1489a;
        this.f4483b = i;
    }

    public void onClick(View view) {
        this.f4482a.mo4902a(this.f4483b, view);
    }
}
