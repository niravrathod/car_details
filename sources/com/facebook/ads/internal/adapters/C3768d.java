package com.facebook.ads.internal.adapters;

import android.content.Context;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.EnumSet;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.d */
public abstract class C3768d implements C1737a {
    /* renamed from: a */
    public abstract void mo3968a(Context context, C1743e c1743e, Map<String, Object> map, C1827c c1827c, EnumSet<CacheFlag> enumSet);

    /* renamed from: a */
    public abstract boolean mo3969a();

    /* renamed from: d */
    public final AdPlacementType mo1333d() {
        return AdPlacementType.INTERSTITIAL;
    }
}
