package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras implements NetworkExtras {
    /* renamed from: a */
    private final HashMap<String, Object> f19608a = new HashMap();

    public final Object getExtra(String str) {
        return this.f19608a.get(str);
    }

    public final void setExtra(String str, Object obj) {
        this.f19608a.put(str, obj);
    }
}
