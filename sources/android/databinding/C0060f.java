package android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.databinding.f */
public class C0060f {
    /* renamed from: a */
    private static C0058d f79a = new DataBinderMapperImpl();
    /* renamed from: b */
    private static C0059e f80b = null;

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m134a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return C0060f.m135a(layoutInflater, i, viewGroup, z, f80b);
    }

    /* renamed from: a */
    public static <T extends ViewDataBinding> T m135a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, C0059e c0059e) {
        int i2 = 0;
        Object obj = (viewGroup == null || !z) ? null : 1;
        if (obj != null) {
            i2 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (obj != null) {
            return C0060f.m132a(c0059e, viewGroup, i2, i);
        }
        return C0060f.m131a(c0059e, inflate, i);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m133a(C0059e c0059e, View[] viewArr, int i) {
        return f79a.mo25a(c0059e, viewArr, i);
    }

    /* renamed from: a */
    static <T extends ViewDataBinding> T m131a(C0059e c0059e, View view, int i) {
        return f79a.mo24a(c0059e, view, i);
    }

    /* renamed from: a */
    private static <T extends ViewDataBinding> T m132a(C0059e c0059e, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return C0060f.m131a(c0059e, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return C0060f.m133a(c0059e, viewArr, i2);
    }
}
