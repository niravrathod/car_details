package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1926p;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.p080a.C1698a;
import java.util.EnumSet;
import java.util.Map;

public abstract class ac implements C1737a, C1926p<Bundle> {
    /* renamed from: a */
    public abstract void mo3971a(Context context, C1698a c1698a, Map<String, Object> map, C1827c c1827c, EnumSet<CacheFlag> enumSet);

    /* renamed from: d */
    public AdPlacementType mo1333d() {
        return AdPlacementType.INSTREAM;
    }

    /* renamed from: g */
    public abstract boolean mo3972g();
}
