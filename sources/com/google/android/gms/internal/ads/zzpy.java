package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;

@zzaer
@Class(creator = "NativeAdOptionsParcelCreator")
public final class zzpy extends AbstractSafeParcelable {
    public static final Creator<zzpy> CREATOR = new zzpz();
    @Field(id = 1)
    /* renamed from: a */
    public final int f20340a;
    @Field(id = 2)
    /* renamed from: b */
    public final boolean f20341b;
    @Field(id = 3)
    /* renamed from: c */
    public final int f20342c;
    @Field(id = 4)
    /* renamed from: d */
    public final boolean f20343d;
    @Field(id = 5)
    /* renamed from: e */
    public final int f20344e;
    @Field(id = 6)
    /* renamed from: f */
    public final zznf f20345f;
    @Field(id = 7)
    /* renamed from: g */
    private final boolean f20346g;

    public zzpy(NativeAdOptions nativeAdOptions) {
        this(3, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zznf(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzbe());
    }

    @Constructor
    public zzpy(@Param(id = 1) int i, @Param(id = 2) boolean z, @Param(id = 3) int i2, @Param(id = 4) boolean z2, @Param(id = 5) int i3, @Param(id = 6) zznf zznf, @Param(id = 7) boolean z3) {
        this.f20340a = i;
        this.f20341b = z;
        this.f20342c = i2;
        this.f20343d = z2;
        this.f20344e = i3;
        this.f20345f = zznf;
        this.f20346g = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20340a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f20341b);
        SafeParcelWriter.writeInt(parcel, 3, this.f20342c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f20343d);
        SafeParcelWriter.writeInt(parcel, 5, this.f20344e);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f20345f, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f20346g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
