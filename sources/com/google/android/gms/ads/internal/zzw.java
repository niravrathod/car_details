package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzafv;
import com.google.android.gms.internal.ads.zzajy;
import com.google.android.gms.internal.ads.zzalo;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
public final class zzw {
    /* renamed from: a */
    private final Context f7821a;
    /* renamed from: b */
    private boolean f7822b;
    /* renamed from: c */
    private zzajy f7823c;
    /* renamed from: d */
    private zzafv f7824d;

    public zzw(Context context, zzajy zzajy, zzafv zzafv) {
        this.f7821a = context;
        this.f7823c = zzajy;
        this.f7824d = zzafv;
        if (this.f7824d == null) {
            this.f7824d = new zzafv();
        }
    }

    /* renamed from: a */
    private final boolean m8818a() {
        return (this.f7823c != null && this.f7823c.mo2319a().f19887f) || this.f7824d.f19812a;
    }

    public final void recordClick() {
        this.f7822b = true;
    }

    public final boolean zzcz() {
        if (m8818a()) {
            if (!this.f7822b) {
                return false;
            }
        }
        return true;
    }

    public final void zzu(String str) {
        if (m8818a()) {
            if (str == null) {
                str = "";
            }
            if (this.f7823c != null) {
                this.f7823c.mo2322a(str, null, 3);
                return;
            }
            if (this.f7824d.f19812a && this.f7824d.f19813b != null) {
                for (String str2 : this.f7824d.f19813b) {
                    String str22;
                    if (!TextUtils.isEmpty(str22)) {
                        str22 = str22.replace("{NAVIGATION_URL}", Uri.encode(str));
                        zzbv.zzek();
                        zzalo.m9791a(this.f7821a, "", str22);
                    }
                }
            }
        }
    }
}
