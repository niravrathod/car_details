package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.C1899e;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.b */
public abstract class C3767b implements C1737a {
    /* renamed from: a */
    public abstract void mo3970a(Context context, C1827c c1827c, C1899e c1899e, C1742c c1742c, Map<String, Object> map);

    /* renamed from: d */
    public final AdPlacementType mo1333d() {
        return AdPlacementType.BANNER;
    }
}
