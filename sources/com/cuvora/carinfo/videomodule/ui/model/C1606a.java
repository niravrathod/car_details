package com.cuvora.carinfo.videomodule.ui.model;

import com.feedbox.data.network.model.Action;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4876l;

/* renamed from: com.cuvora.carinfo.videomodule.ui.model.a */
public final class C1606a {
    /* renamed from: a */
    public static final CtAction m6141a(Action action) {
        C2885g.m13910b(action, "$receiver");
        CtActionType a = CtActionType.f4824h.m6140a(action.m7681a());
        String b = action.m7682b();
        String d = action.m7684d();
        String c = action.m7683c();
        String e = action.m7685e();
        String h = action.m7688h();
        String f = action.m7686f();
        Float a2 = f != null ? C4876l.m29859a(f) : null;
        action = action.m7687g();
        return new CtAction(a, b, d, c, e, h, a2, action != null ? C4876l.m29859a(action) : null);
    }
}
