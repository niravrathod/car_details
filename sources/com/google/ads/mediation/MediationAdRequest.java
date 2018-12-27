package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

@Deprecated
public class MediationAdRequest {
    /* renamed from: a */
    private final Date f6474a;
    /* renamed from: b */
    private final Gender f6475b;
    /* renamed from: c */
    private final Set<String> f6476c;
    /* renamed from: d */
    private final boolean f6477d;
    /* renamed from: e */
    private final Location f6478e;

    public MediationAdRequest(Date date, Gender gender, Set<String> set, boolean z, Location location) {
        this.f6474a = date;
        this.f6475b = gender;
        this.f6476c = set;
        this.f6477d = z;
        this.f6478e = location;
    }

    public Integer getAgeInYears() {
        if (this.f6474a == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(this.f6474a);
        Integer valueOf = Integer.valueOf(instance2.get(1) - instance.get(1));
        if (instance2.get(2) < instance.get(2) || (instance2.get(2) == instance.get(2) && instance2.get(5) < instance.get(5))) {
            valueOf = Integer.valueOf(valueOf.intValue() - 1);
        }
        return valueOf;
    }

    public Date getBirthday() {
        return this.f6474a;
    }

    public Gender getGender() {
        return this.f6475b;
    }

    public Set<String> getKeywords() {
        return this.f6476c;
    }

    public Location getLocation() {
        return this.f6478e;
    }

    public boolean isTesting() {
        return this.f6477d;
    }
}
