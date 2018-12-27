package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@Class(creator = "AppMetadataCreator")
@Reserved({1, 20})
public final class zzh extends AbstractSafeParcelable {
    public static final Creator<zzh> CREATOR = new zzi();
    @Field(id = 2)
    /* renamed from: a */
    public final String f20689a;
    @Field(id = 3)
    /* renamed from: b */
    public final String f20690b;
    @Field(id = 4)
    /* renamed from: c */
    public final String f20691c;
    @Field(id = 5)
    /* renamed from: d */
    public final String f20692d;
    @Field(id = 6)
    /* renamed from: e */
    public final long f20693e;
    @Field(id = 7)
    /* renamed from: f */
    public final long f20694f;
    @Field(id = 8)
    /* renamed from: g */
    public final String f20695g;
    @Field(defaultValue = "true", id = 9)
    /* renamed from: h */
    public final boolean f20696h;
    @Field(id = 10)
    /* renamed from: i */
    public final boolean f20697i;
    @Field(defaultValueUnchecked = "Integer.MIN_VALUE", id = 11)
    /* renamed from: j */
    public final long f20698j;
    @Field(id = 12)
    /* renamed from: k */
    public final String f20699k;
    @Field(id = 13)
    /* renamed from: l */
    public final long f20700l;
    @Field(id = 14)
    /* renamed from: m */
    public final long f20701m;
    @Field(id = 15)
    /* renamed from: n */
    public final int f20702n;
    @Field(defaultValue = "true", id = 16)
    /* renamed from: o */
    public final boolean f20703o;
    @Field(defaultValue = "true", id = 17)
    /* renamed from: p */
    public final boolean f20704p;
    @Field(id = 18)
    /* renamed from: q */
    public final boolean f20705q;
    @Field(id = 19)
    /* renamed from: r */
    public final String f20706r;

    zzh(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        Preconditions.checkNotEmpty(str);
        this.f20689a = str;
        r0.f20690b = TextUtils.isEmpty(str2) ? null : str2;
        r0.f20691c = str3;
        r0.f20698j = j;
        r0.f20692d = str4;
        r0.f20693e = j2;
        r0.f20694f = j3;
        r0.f20695g = str5;
        r0.f20696h = z;
        r0.f20697i = z2;
        r0.f20699k = str6;
        r0.f20700l = j4;
        r0.f20701m = j5;
        r0.f20702n = i;
        r0.f20703o = z3;
        r0.f20704p = z4;
        r0.f20705q = z5;
        r0.f20706r = str7;
    }

    @Constructor
    zzh(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) String str3, @Param(id = 5) String str4, @Param(id = 6) long j, @Param(id = 7) long j2, @Param(id = 8) String str5, @Param(id = 9) boolean z, @Param(id = 10) boolean z2, @Param(id = 11) long j3, @Param(id = 12) String str6, @Param(id = 13) long j4, @Param(id = 14) long j5, @Param(id = 15) int i, @Param(id = 16) boolean z3, @Param(id = 17) boolean z4, @Param(id = 18) boolean z5, @Param(id = 19) String str7) {
        this.f20689a = str;
        this.f20690b = str2;
        this.f20691c = str3;
        this.f20698j = j3;
        this.f20692d = str4;
        this.f20693e = j;
        this.f20694f = j2;
        this.f20695g = str5;
        this.f20696h = z;
        this.f20697i = z2;
        this.f20699k = str6;
        this.f20700l = j4;
        this.f20701m = j5;
        this.f20702n = i;
        this.f20703o = z3;
        this.f20704p = z4;
        this.f20705q = z5;
        this.f20706r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20689a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f20690b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f20691c, false);
        SafeParcelWriter.writeString(parcel, 5, this.f20692d, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f20693e);
        SafeParcelWriter.writeLong(parcel, 7, this.f20694f);
        SafeParcelWriter.writeString(parcel, 8, this.f20695g, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f20696h);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f20697i);
        SafeParcelWriter.writeLong(parcel, 11, this.f20698j);
        SafeParcelWriter.writeString(parcel, 12, this.f20699k, false);
        SafeParcelWriter.writeLong(parcel, 13, this.f20700l);
        SafeParcelWriter.writeLong(parcel, 14, this.f20701m);
        SafeParcelWriter.writeInt(parcel, 15, this.f20702n);
        SafeParcelWriter.writeBoolean(parcel, 16, this.f20703o);
        SafeParcelWriter.writeBoolean(parcel, 17, this.f20704p);
        SafeParcelWriter.writeBoolean(parcel, 18, this.f20705q);
        SafeParcelWriter.writeString(parcel, 19, this.f20706r, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
