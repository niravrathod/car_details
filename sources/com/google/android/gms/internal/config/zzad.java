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

@Class(creator = "FetchConfigIpcResponseCreator")
@Reserved({1})
public final class zzad extends AbstractSafeParcelable {
    public static final Creator<zzad> CREATOR = new zzae();
    @Field(getter = "getStatusCode", id = 2)
    /* renamed from: a */
    private final int f20452a;
    @Field(getter = "getConfigsHolder", id = 3)
    /* renamed from: b */
    private final DataHolder f20453b;
    @Field(getter = "getThrottleEndTimeMillis", id = 4)
    /* renamed from: c */
    private final long f20454c;
    @Field(getter = "getExperimentPayloadsHolder", id = 5)
    /* renamed from: d */
    private final DataHolder f20455d;

    @Constructor
    public zzad(@Param(id = 2) int i, @Param(id = 3) DataHolder dataHolder, @Param(id = 4) long j, @Param(id = 5) DataHolder dataHolder2) {
        this.f20452a = i;
        this.f20453b = dataHolder;
        this.f20454c = j;
        this.f20455d = dataHolder2;
    }

    /* renamed from: a */
    public final int m27027a() {
        return this.f20452a;
    }

    /* renamed from: b */
    public final DataHolder m27028b() {
        return this.f20453b;
    }

    /* renamed from: c */
    public final long m27029c() {
        return this.f20454c;
    }

    /* renamed from: d */
    public final DataHolder m27030d() {
        return this.f20455d;
    }

    /* renamed from: e */
    public final void m27031e() {
        if (this.f20453b != null && !this.f20453b.isClosed()) {
            this.f20453b.close();
        }
    }

    /* renamed from: f */
    public final void m27032f() {
        if (this.f20455d != null && !this.f20455d.isClosed()) {
            this.f20455d.close();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f20452a);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f20453b, i, false);
        SafeParcelWriter.writeLong(parcel, 4, this.f20454c);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f20455d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
