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

@Class(creator = "ConfigExperimentPayloadCreator")
@Reserved({1})
public final class zzx extends AbstractSafeParcelable {
    public static final Creator<zzx> CREATOR = new zzy();
    @Field(getter = "getPayload", id = 2)
    /* renamed from: a */
    private final byte[] f20484a;

    @Constructor
    public zzx(@Param(id = 2) byte[] bArr) {
        this.f20484a = bArr;
    }

    /* renamed from: a */
    public final byte[] m27059a() {
        return this.f20484a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f20484a, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
