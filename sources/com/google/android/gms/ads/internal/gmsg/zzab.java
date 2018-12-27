package com.google.android.gms.ads.internal.gmsg;

import com.facebook.ads.internal.p084c.C1769a;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.internal.ads.zzabe;
import com.google.android.gms.internal.ads.zzabh;
import com.google.android.gms.internal.ads.zzabj;
import com.google.android.gms.internal.ads.zzabk;
import com.google.android.gms.internal.ads.zzabs;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzkd;
import com.google.android.gms.internal.ads.zznw;
import java.util.Map;

@zzaer
public final class zzab implements zzu<zzasg> {
    /* renamed from: d */
    private static final Map<String, Integer> f16343d = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7)});
    /* renamed from: a */
    private final zzw f16344a;
    /* renamed from: b */
    private final zzabh f16345b;
    /* renamed from: c */
    private final zzabs f16346c;

    public zzab(zzw zzw, zzabh zzabh, zzabs zzabs) {
        this.f16344a = zzw;
        this.f16345b = zzabh;
        this.f16346c = zzabs;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzasg zzasg = (zzasg) obj;
        int intValue = ((Integer) f16343d.get((String) map.get(C1769a.f5340a))).intValue();
        if (intValue != 5 && intValue != 7 && this.f16344a != null && !this.f16344a.zzcz()) {
            this.f16344a.zzu(null);
        } else if (intValue != 1) {
            switch (intValue) {
                case 3:
                    new zzabk(zzasg, map).m21073a();
                    return;
                case 4:
                    new zzabe(zzasg, map).m21063a();
                    return;
                case 5:
                    new zzabj(zzasg, map).m9431a();
                    return;
                case 6:
                    this.f16345b.m21070a(true);
                    return;
                case 7:
                    if (((Boolean) zzkd.m10713e().m10897a(zznw.f9684I)).booleanValue() != null) {
                        this.f16346c.zzda();
                        return;
                    }
                    break;
                default:
                    zzaok.m10005d("Unknown MRAID command called.");
                    break;
            }
        } else {
            this.f16345b.m21069a(map);
        }
    }
}
