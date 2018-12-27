package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "SignInRequestCreator")
public final class zah extends AbstractSafeParcelable {
    public static final Creator<zah> CREATOR = new zai();
    @VersionField(id = 1)
    /* renamed from: a */
    private final int f20751a;
    @Field(getter = "getResolveAccountRequest", id = 2)
    /* renamed from: b */
    private final ResolveAccountRequest f20752b;

    @Constructor
    zah(@Param(id = 1) int i, @Param(id = 2) ResolveAccountRequest resolveAccountRequest) {
        this.f20751a = i;
        this.f20752b = resolveAccountRequest;
    }

    public zah(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20751a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f20752b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
