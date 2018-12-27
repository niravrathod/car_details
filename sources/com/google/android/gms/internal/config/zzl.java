package com.google.android.gms.internal.config;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "AnalyticsUserPropertyCreator")
@Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Creator<zzl> CREATOR = new zzm();
    @Field(getter = "getName", id = 2)
    /* renamed from: a */
    private final String f20478a;
    @Field(getter = "getValue", id = 3)
    /* renamed from: b */
    private final String f20479b;

    @Constructor
    public zzl(@Param(id = 2) String str, @Param(id = 3) String str2) {
        this.f20478a = str;
        this.f20479b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20478a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f20479b, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
