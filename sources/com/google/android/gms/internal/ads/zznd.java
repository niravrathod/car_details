package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

@zzaer
public final class zznd extends zzjo {
    public zznd(zzjo zzjo) {
        super(zzjo.f20227a, zzjo.f20228b, zzjo.f20229c, zzjo.f20230d, zzjo.f20231e, zzjo.f20232f, zzjo.f20233g, zzjo.f20234h, zzjo.f20235i, zzjo.f20236j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeInt(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 6, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
