package com.google.android.gms.internal.measurement;

import java.util.Comparator;

final class av implements Comparator<zzud> {
    av() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzud zzud = (zzud) obj;
        zzud zzud2 = (zzud) obj2;
        zzuj zzuj = (zzuj) zzud.iterator();
        zzuj zzuj2 = (zzuj) zzud2.iterator();
        while (zzuj.hasNext() && zzuj2.hasNext()) {
            int compare = Integer.compare(zzud.m12009b(zzuj.mo2925a()), zzud.m12009b(zzuj2.mo2925a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzud.mo4351a(), zzud2.mo4351a());
    }
}
