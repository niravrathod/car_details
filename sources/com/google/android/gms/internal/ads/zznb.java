package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@zzaer
@Class(creator = "SearchAdRequestParcelCreator")
@Reserved({1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14})
public final class zznb extends AbstractSafeParcelable {
    public static final Creator<zznb> CREATOR = new zznc();
    @Field(id = 15)
    /* renamed from: a */
    public final String f20246a;

    public zznb(SearchAdRequest searchAdRequest) {
        this.f20246a = searchAdRequest.getQuery();
    }

    @Constructor
    zznb(@Param(id = 15) String str) {
        this.f20246a = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 15, this.f20246a, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
