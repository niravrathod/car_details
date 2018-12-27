package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzaer
public final class zzzj implements MediationAdRequest {
    /* renamed from: a */
    private final Date f17387a;
    /* renamed from: b */
    private final int f17388b;
    /* renamed from: c */
    private final Set<String> f17389c;
    /* renamed from: d */
    private final boolean f17390d;
    /* renamed from: e */
    private final Location f17391e;
    /* renamed from: f */
    private final int f17392f;
    /* renamed from: g */
    private final boolean f17393g;

    public zzzj(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.f17387a = date;
        this.f17388b = i;
        this.f17389c = set;
        this.f17391e = location;
        this.f17390d = z;
        this.f17392f = i2;
        this.f17393g = z2;
    }

    @Deprecated
    public final Date getBirthday() {
        return this.f17387a;
    }

    @Deprecated
    public final int getGender() {
        return this.f17388b;
    }

    public final Set<String> getKeywords() {
        return this.f17389c;
    }

    public final Location getLocation() {
        return this.f17391e;
    }

    public final boolean isTesting() {
        return this.f17390d;
    }

    public final int taggedForChildDirectedTreatment() {
        return this.f17392f;
    }

    @Deprecated
    public final boolean isDesignedForFamilies() {
        return this.f17393g;
    }
}
