package com.facebook.ads;

import com.facebook.ads.internal.protocol.C1899e;
import java.io.Serializable;

public class AdSize implements Serializable {
    @Deprecated
    /* renamed from: c */
    public static final AdSize f5066c = new AdSize(C1899e.BANNER_320_50);
    /* renamed from: d */
    public static final AdSize f5067d = new AdSize(C1899e.INTERSTITIAL);
    /* renamed from: e */
    public static final AdSize f5068e = new AdSize(C1899e.BANNER_HEIGHT_50);
    /* renamed from: f */
    public static final AdSize f5069f = new AdSize(C1899e.BANNER_HEIGHT_90);
    /* renamed from: g */
    public static final AdSize f5070g = new AdSize(C1899e.RECTANGLE_HEIGHT_250);
    /* renamed from: a */
    private final int f5071a;
    /* renamed from: b */
    private final int f5072b;

    private AdSize(C1899e c1899e) {
        this.f5071a = c1899e.m7238a();
        this.f5072b = c1899e.m7239b();
    }

    /* renamed from: a */
    public int m6380a() {
        return this.f5071a;
    }

    /* renamed from: b */
    public int m6381b() {
        return this.f5072b;
    }

    /* renamed from: c */
    public C1899e m6382c() {
        return C1899e.m7237a(this.f5071a, this.f5072b);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                AdSize adSize = (AdSize) obj;
                if (this.f5071a != adSize.f5071a) {
                    return false;
                }
                if (this.f5072b != adSize.f5072b) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f5071a * 31) + this.f5072b;
    }
}
