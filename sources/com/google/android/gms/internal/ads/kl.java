package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class kl implements Comparator<zzbbu> {
    kl() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbu zzbbu = (zzbbu) obj;
        zzbbu zzbbu2 = (zzbbu) obj2;
        zzbca zzbca = (zzbca) zzbbu.iterator();
        zzbca zzbca2 = (zzbca) zzbbu2.iterator();
        while (zzbca.hasNext() && zzbca2.hasNext()) {
            int compare = Integer.compare(zzbbu.m10262b(zzbca.mo1971a()), zzbbu.m10262b(zzbca2.mo1971a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzbbu.mo4215a(), zzbbu2.mo4215a());
    }
}
