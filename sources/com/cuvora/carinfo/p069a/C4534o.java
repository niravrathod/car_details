package com.cuvora.carinfo.p069a;

import android.content.Context;
import android.support.v4.app.C0334l;
import android.support.v4.app.C3114p;
import android.support.v4.app.Fragment;
import com.cuvora.carinfo.fragment.C4549b;
import com.cuvora.carinfo.fragment.C4549b.C1496a;
import com.cuvora.carinfo.models.homepage.HomeTabData;
import com.cuvora.carinfo.models.homepage.TabContent;
import kotlin.jvm.internal.C2885g;

/* renamed from: com.cuvora.carinfo.a.o */
public final class C4534o extends C3114p {
    /* renamed from: a */
    private final Context f18860a;
    /* renamed from: b */
    private final HomeTabData f18861b;

    public C4534o(Context context, C0334l c0334l, HomeTabData homeTabData) {
        C2885g.m13910b(context, "context");
        C2885g.m13910b(c0334l, "fragmentManager");
        C2885g.m13910b(homeTabData, "homeTabData");
        super(c0334l);
        this.f18860a = context;
        this.f18861b = homeTabData;
    }

    /* renamed from: a */
    public Fragment mo3919a(int i) {
        C1496a c1496a = C4549b.f18870a;
        Object obj = this.f18861b.getTabContents().get(i);
        C2885g.m13907a(obj, "homeTabData.tabContents[position]");
        return c1496a.m5736a((TabContent) obj, null);
    }

    /* renamed from: b */
    public int mo1187b() {
        return this.f18861b.getTabContents().size();
    }
}
