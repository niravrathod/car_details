package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@zzaer
@Class(creator = "VersionInfoParcelCreator")
@Reserved({1})
public final class zzaop extends AbstractSafeParcelable {
    public static final Creator<zzaop> CREATOR = new zzaoq();
    @Field(id = 2)
    /* renamed from: a */
    public String f19893a;
    @Field(id = 3)
    /* renamed from: b */
    public int f19894b;
    @Field(id = 4)
    /* renamed from: c */
    public int f19895c;
    @Field(id = 5)
    /* renamed from: d */
    public boolean f19896d;
    @Field(id = 6)
    /* renamed from: e */
    public boolean f19897e;

    public zzaop(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzaop(int i, int i2, boolean z, boolean z2) {
        this(13000000, i2, true, false, z2);
    }

    private zzaop(int i, int i2, boolean z, boolean z2, boolean z3) {
        z2 = z ? "0" : "1";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(z2).length() + 36);
        stringBuilder.append("afma-sdk-a-v");
        stringBuilder.append(i);
        stringBuilder.append(".");
        stringBuilder.append(i2);
        stringBuilder.append(".");
        stringBuilder.append(z2);
        this(stringBuilder.toString(), i, i2, z, z3);
    }

    @Constructor
    zzaop(@Param(id = 2) String str, @Param(id = 3) int i, @Param(id = 4) int i2, @Param(id = 5) boolean z, @Param(id = 6) boolean z2) {
        this.f19893a = str;
        this.f19894b = i;
        this.f19895c = i2;
        this.f19896d = z;
        this.f19897e = z2;
    }

    /* renamed from: a */
    public static zzaop m26280a() {
        return new zzaop(12451009, 12451009, true);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f19893a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f19894b);
        SafeParcelWriter.writeInt(parcel, 4, this.f19895c);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f19896d);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f19897e);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
