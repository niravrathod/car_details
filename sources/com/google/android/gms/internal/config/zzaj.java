package com.google.android.gms.internal.config;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "PackageConfigTableCreator")
@Reserved({1})
public final class zzaj extends AbstractSafeParcelable {
    public static final Creator<zzaj> CREATOR = new zzak();
    @Field(getter = "getConfigTable", id = 2)
    /* renamed from: a */
    private final Bundle f20456a;

    @Constructor
    public zzaj(@Param(id = 2) Bundle bundle) {
        this.f20456a = bundle;
    }

    /* renamed from: a */
    public final Bundle m27033a() {
        return this.f20456a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f20456a, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
