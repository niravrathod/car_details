package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new zaa();
    @VersionField(id = 1)
    /* renamed from: a */
    private final int f19623a;
    @Field(getter = "getType", id = 2)
    /* renamed from: b */
    private int f19624b;
    @Field(getter = "getBundle", id = 3)
    /* renamed from: c */
    private Bundle f19625c;

    @Constructor
    GoogleSignInOptionsExtensionParcelable(@Param(id = 1) int i, @Param(id = 2) int i2, @Param(id = 3) Bundle bundle) {
        this.f19623a = i;
        this.f19624b = i2;
        this.f19625c = bundle;
    }

    @KeepForSdk
    /* renamed from: a */
    public int m25991a() {
        return this.f19624b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19623a);
        SafeParcelWriter.writeInt(parcel, 2, m25991a());
        SafeParcelWriter.writeBundle(parcel, 3, this.f19625c, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
