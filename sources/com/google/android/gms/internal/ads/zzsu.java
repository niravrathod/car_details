package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import java.util.Map;
import java.util.Map.Entry;

@zzaer
@Class(creator = "HttpRequestParcelCreator")
public final class zzsu extends AbstractSafeParcelable {
    public static final Creator<zzsu> CREATOR = new zzsv();
    @Field(id = 1)
    /* renamed from: a */
    private final String f20387a;
    @Field(id = 2)
    /* renamed from: b */
    private final String[] f20388b;
    @Field(id = 3)
    /* renamed from: c */
    private final String[] f20389c;

    @Constructor
    zzsu(@Param(id = 1) String str, @Param(id = 2) String[] strArr, @Param(id = 3) String[] strArr2) {
        this.f20387a = str;
        this.f20388b = strArr;
        this.f20389c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f20387a, false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f20388b, false);
        SafeParcelWriter.writeStringArray(parcel, 3, this.f20389c, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    /* renamed from: a */
    public static zzsu m26849a(zzr zzr) {
        Map b = zzr.mo4155b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzsu(zzr.m11034e(), strArr, strArr2);
    }
}
