package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;

@zzaer
@Class(creator = "VideoOptionsParcelCreator")
@Reserved({1})
public final class zznf extends AbstractSafeParcelable {
    public static final Creator<zznf> CREATOR = new zzng();
    @Field(id = 2)
    /* renamed from: a */
    public final boolean f20248a;
    @Field(id = 3)
    /* renamed from: b */
    public final boolean f20249b;
    @Field(id = 4)
    /* renamed from: c */
    public final boolean f20250c;

    public zznf(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }

    @Constructor
    public zznf(@Param(id = 2) boolean z, @Param(id = 3) boolean z2, @Param(id = 4) boolean z3) {
        this.f20248a = z;
        this.f20249b = z2;
        this.f20250c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f20248a);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f20249b);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f20250c);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
