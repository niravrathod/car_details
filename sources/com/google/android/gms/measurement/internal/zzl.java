package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@Class(creator = "ConditionalUserPropertyParcelCreator")
public final class zzl extends AbstractSafeParcelable {
    public static final Creator<zzl> CREATOR = new zzm();
    @Field(id = 2)
    /* renamed from: a */
    public String f20707a;
    @Field(id = 3)
    /* renamed from: b */
    public String f20708b;
    @Field(id = 4)
    /* renamed from: c */
    public zzfh f20709c;
    @Field(id = 5)
    /* renamed from: d */
    public long f20710d;
    @Field(id = 6)
    /* renamed from: e */
    public boolean f20711e;
    @Field(id = 7)
    /* renamed from: f */
    public String f20712f;
    @Field(id = 8)
    /* renamed from: g */
    public zzad f20713g;
    @Field(id = 9)
    /* renamed from: h */
    public long f20714h;
    @Field(id = 10)
    /* renamed from: i */
    public zzad f20715i;
    @Field(id = 11)
    /* renamed from: j */
    public long f20716j;
    @Field(id = 12)
    /* renamed from: k */
    public zzad f20717k;

    zzl(zzl zzl) {
        Preconditions.checkNotNull(zzl);
        this.f20707a = zzl.f20707a;
        this.f20708b = zzl.f20708b;
        this.f20709c = zzl.f20709c;
        this.f20710d = zzl.f20710d;
        this.f20711e = zzl.f20711e;
        this.f20712f = zzl.f20712f;
        this.f20713g = zzl.f20713g;
        this.f20714h = zzl.f20714h;
        this.f20715i = zzl.f20715i;
        this.f20716j = zzl.f20716j;
        this.f20717k = zzl.f20717k;
    }

    @Constructor
    zzl(@Param(id = 2) String str, @Param(id = 3) String str2, @Param(id = 4) zzfh zzfh, @Param(id = 5) long j, @Param(id = 6) boolean z, @Param(id = 7) String str3, @Param(id = 8) zzad zzad, @Param(id = 9) long j2, @Param(id = 10) zzad zzad2, @Param(id = 11) long j3, @Param(id = 12) zzad zzad3) {
        this.f20707a = str;
        this.f20708b = str2;
        this.f20709c = zzfh;
        this.f20710d = j;
        this.f20711e = z;
        this.f20712f = str3;
        this.f20713g = zzad;
        this.f20714h = j2;
        this.f20715i = zzad2;
        this.f20716j = j3;
        this.f20717k = zzad3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20707a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f20708b, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f20709c, i, false);
        SafeParcelWriter.writeLong(parcel, 5, this.f20710d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f20711e);
        SafeParcelWriter.writeString(parcel, 7, this.f20712f, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f20713g, i, false);
        SafeParcelWriter.writeLong(parcel, 9, this.f20714h);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f20715i, i, false);
        SafeParcelWriter.writeLong(parcel, 11, this.f20716j);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f20717k, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
