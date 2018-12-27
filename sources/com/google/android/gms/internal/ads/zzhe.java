package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class zzhe implements Comparator<zzgs> {
    public zzhe(zzhd zzhd) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgs zzgs = (zzgs) obj;
        zzgs zzgs2 = (zzgs) obj2;
        if (zzgs.m10645b() < zzgs2.m10645b()) {
            return -1;
        }
        if (zzgs.m10645b() > zzgs2.m10645b()) {
            return 1;
        }
        if (zzgs.m10644a() < zzgs2.m10644a()) {
            return -1;
        }
        if (zzgs.m10644a() > zzgs2.m10644a()) {
            return 1;
        }
        float d = (zzgs.m10647d() - zzgs.m10645b()) * (zzgs.m10646c() - zzgs.m10644a());
        obj = (zzgs2.m10647d() - zzgs2.m10645b()) * (zzgs2.m10646c() - zzgs2.m10644a());
        if (d > obj) {
            return -1;
        }
        if (d < obj) {
            return 1;
        }
        return null;
    }
}
