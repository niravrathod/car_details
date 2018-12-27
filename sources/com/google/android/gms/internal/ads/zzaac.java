package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdRequest.Gender;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;

@zzaer
public final class zzaac {
    /* renamed from: a */
    public static int m9409a(ErrorCode errorCode) {
        switch (C2435c.f7942a[errorCode.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static MediationAdRequest m9410a(zzjk zzjk, boolean z) {
        Gender gender;
        HashSet hashSet = zzjk.f20210e != null ? new HashSet(zzjk.f20210e) : null;
        Date date = new Date(zzjk.f20207b);
        switch (zzjk.f20209d) {
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.UNKNOWN;
                break;
        }
        return new MediationAdRequest(date, gender, hashSet, z, zzjk.f20216k);
    }
}
