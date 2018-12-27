package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "InitializationParamsCreator")
public final class zzek extends AbstractSafeParcelable {
    public static final Creator<zzek> CREATOR = new zzel();
    @Field(id = 1)
    /* renamed from: a */
    public final long f20519a;
    @Field(id = 2)
    /* renamed from: b */
    public final long f20520b;
    @Field(id = 3)
    /* renamed from: c */
    public final boolean f20521c;
    @Field(id = 4)
    /* renamed from: d */
    public final String f20522d;
    @Field(id = 5)
    /* renamed from: e */
    public final String f20523e;
    @Field(id = 6)
    /* renamed from: f */
    public final String f20524f;
    @Field(id = 7)
    /* renamed from: g */
    public final Bundle f20525g;

    @Constructor
    zzek(@Param(id = 1) long j, @Param(id = 2) long j2, @Param(id = 3) boolean z, @Param(id = 4) String str, @Param(id = 5) String str2, @Param(id = 6) String str3, @Param(id = 7) Bundle bundle) {
        this.f20519a = j;
        this.f20520b = j2;
        this.f20521c = z;
        this.f20522d = str;
        this.f20523e = str2;
        this.f20524f = str3;
        this.f20525g = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f20519a);
        SafeParcelWriter.writeLong(parcel, 2, this.f20520b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f20521c);
        SafeParcelWriter.writeString(parcel, 4, this.f20522d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f20523e, false);
        SafeParcelWriter.writeString(parcel, 6, this.f20524f, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f20525g, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
