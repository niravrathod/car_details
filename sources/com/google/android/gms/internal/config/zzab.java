package com.google.android.gms.internal.config;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.List;

@Class(creator = "FetchConfigIpcRequestCreator")
@Reserved({1})
public final class zzab extends AbstractSafeParcelable {
    public static final Creator<zzab> CREATOR = new zzac();
    @Field(getter = "getPackageName", id = 2)
    /* renamed from: a */
    private final String f20441a;
    @Field(getter = "getCacheExpirationInSeconds", id = 3)
    /* renamed from: b */
    private final long f20442b;
    @Field(getter = "getCustomVariablesHolder", id = 4)
    /* renamed from: c */
    private final DataHolder f20443c;
    @Field(getter = "getGmpProjectId", id = 5)
    /* renamed from: d */
    private final String f20444d;
    @Field(getter = "getAppInstanceId", id = 6)
    /* renamed from: e */
    private final String f20445e;
    @Field(getter = "getAppInstanceIdToken", id = 7)
    /* renamed from: f */
    private final String f20446f;
    @Field(getter = "getRegisteredHiddenNamespaces", id = 8)
    /* renamed from: g */
    private final List<String> f20447g;
    @Field(getter = "getSdkVersion", id = 9)
    /* renamed from: h */
    private final int f20448h;
    @Field(getter = "getAnalyticsUserProperties", id = 10)
    /* renamed from: i */
    private final List<zzl> f20449i;
    @Field(getter = "getActiveConfigAgeSeconds", id = 11)
    /* renamed from: j */
    private final int f20450j;
    @Field(getter = "getFetchedConfigAgeSeconds", id = 12)
    /* renamed from: k */
    private final int f20451k;

    @Constructor
    public zzab(@Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) DataHolder dataHolder, @Param(id = 5) String str2, @Param(id = 6) String str3, @Param(id = 7) String str4, @Param(id = 8) List<String> list, @Param(id = 9) int i, @Param(id = 10) List<zzl> list2, @Param(id = 11) int i2, @Param(id = 12) int i3) {
        this.f20441a = str;
        this.f20442b = j;
        this.f20443c = dataHolder;
        this.f20444d = str2;
        this.f20445e = str3;
        this.f20446f = str4;
        this.f20447g = list;
        this.f20448h = i;
        this.f20449i = list2;
        this.f20450j = i2;
        this.f20451k = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20441a, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f20442b);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f20443c, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f20444d, false);
        SafeParcelWriter.writeString(parcel, 6, this.f20445e, false);
        SafeParcelWriter.writeString(parcel, 7, this.f20446f, false);
        SafeParcelWriter.writeStringList(parcel, 8, this.f20447g, false);
        SafeParcelWriter.writeInt(parcel, 9, this.f20448h);
        SafeParcelWriter.writeTypedList(parcel, 10, this.f20449i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.f20450j);
        SafeParcelWriter.writeInt(parcel, 12, this.f20451k);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
