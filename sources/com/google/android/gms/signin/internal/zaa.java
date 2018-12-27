package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Creator<zaa> CREATOR = new zab();
    @VersionField(id = 1)
    /* renamed from: a */
    private final int f20748a;
    @Field(getter = "getConnectionResultCode", id = 2)
    /* renamed from: b */
    private int f20749b;
    @Field(getter = "getRawAuthResolutionIntent", id = 3)
    /* renamed from: c */
    private Intent f20750c;

    @Constructor
    zaa(@Param(id = 1) int i, @Param(id = 2) int i2, @Param(id = 3) Intent intent) {
        this.f20748a = i;
        this.f20749b = i2;
        this.f20750c = intent;
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int i, Intent intent) {
        this(2, null, null);
    }

    public final Status getStatus() {
        if (this.f20749b == 0) {
            return Status.RESULT_SUCCESS;
        }
        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20748a);
        SafeParcelWriter.writeInt(parcel, 2, this.f20749b);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f20750c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
