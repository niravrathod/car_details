package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@Class(creator = "NonagonRequestParcelCreator")
@ParametersAreNonnullByDefault
public final class zzagi extends AbstractSafeParcelable {
    public static final Creator<zzagi> CREATOR = new zzagj();
    @Field(id = 1)
    /* renamed from: a */
    private final Bundle f19817a;
    @Field(id = 2)
    /* renamed from: b */
    private final zzaop f19818b;
    @Field(id = 3)
    /* renamed from: c */
    private final ApplicationInfo f19819c;
    @Field(id = 4)
    /* renamed from: d */
    private final String f19820d;
    @Field(id = 5)
    /* renamed from: e */
    private final List<String> f19821e;
    @Field(id = 6)
    @Nullable
    /* renamed from: f */
    private final PackageInfo f19822f;
    @Field(id = 7)
    /* renamed from: g */
    private final String f19823g;
    @Field(id = 8)
    /* renamed from: h */
    private final boolean f19824h;
    @Field(id = 9)
    /* renamed from: i */
    private final String f19825i;

    @Constructor
    public zzagi(@Param(id = 1) Bundle bundle, @Param(id = 2) zzaop zzaop, @Param(id = 3) ApplicationInfo applicationInfo, @Param(id = 4) String str, @Param(id = 5) List<String> list, @Param(id = 6) @Nullable PackageInfo packageInfo, @Param(id = 7) String str2, @Param(id = 8) boolean z, @Param(id = 9) String str3) {
        this.f19817a = bundle;
        this.f19818b = zzaop;
        this.f19820d = str;
        this.f19819c = applicationInfo;
        this.f19821e = list;
        this.f19822f = packageInfo;
        this.f19823g = str2;
        this.f19824h = z;
        this.f19825i = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.f19817a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f19818b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f19819c, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f19820d, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.f19821e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f19822f, i, false);
        SafeParcelWriter.writeString(parcel, 7, this.f19823g, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f19824h);
        SafeParcelWriter.writeString(parcel, 9, this.f19825i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
