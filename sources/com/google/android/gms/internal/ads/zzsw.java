package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@zzaer
@Class(creator = "HttpResponseParcelCreator")
public final class zzsw extends AbstractSafeParcelable {
    public static final Creator<zzsw> CREATOR = new zzsx();
    @Field(id = 1)
    /* renamed from: a */
    public final boolean f20390a;
    @Field(id = 2)
    /* renamed from: b */
    public final String f20391b;
    @Field(id = 3)
    /* renamed from: c */
    public final int f20392c;
    @Field(id = 4)
    /* renamed from: d */
    public final byte[] f20393d;
    @Field(id = 5)
    /* renamed from: e */
    public final String[] f20394e;
    @Field(id = 6)
    /* renamed from: f */
    public final String[] f20395f;
    @Field(id = 7)
    /* renamed from: g */
    public final boolean f20396g;
    @Field(id = 8)
    /* renamed from: h */
    public final long f20397h;

    @Constructor
    zzsw(@Param(id = 1) boolean z, @Param(id = 2) String str, @Param(id = 3) int i, @Param(id = 4) byte[] bArr, @Param(id = 5) String[] strArr, @Param(id = 6) String[] strArr2, @Param(id = 7) boolean z2, @Param(id = 8) long j) {
        this.f20390a = z;
        this.f20391b = str;
        this.f20392c = i;
        this.f20393d = bArr;
        this.f20394e = strArr;
        this.f20395f = strArr2;
        this.f20396g = z2;
        this.f20397h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f20390a);
        SafeParcelWriter.writeString(parcel, 2, this.f20391b, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f20392c);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f20393d, false);
        SafeParcelWriter.writeStringArray(parcel, 5, this.f20394e, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f20395f, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f20396g);
        SafeParcelWriter.writeLong(parcel, 8, this.f20397h);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
