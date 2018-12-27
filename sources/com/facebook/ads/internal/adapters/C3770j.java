package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.C2094k;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.j */
public abstract class C3770j implements C1737a {
    /* renamed from: a */
    C2094k f15136a;
    /* renamed from: b */
    int f15137b;

    /* renamed from: a */
    public void m18884a(int i) {
        this.f15137b = i;
    }

    /* renamed from: a */
    public abstract void mo3973a(Context context, C1748l c1748l, Map<String, Object> map, boolean z);

    /* renamed from: a */
    public void m18886a(C2094k c2094k) {
        this.f15136a = c2094k;
    }

    /* renamed from: a */
    public abstract boolean mo3974a();

    /* renamed from: b */
    public abstract int mo3975b();

    /* renamed from: d */
    public AdPlacementType mo1333d() {
        return AdPlacementType.REWARDED_VIDEO;
    }
}
