package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "SignInResponseCreator")
public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new zak();
    @VersionField(id = 1)
    /* renamed from: a */
    private final int f20753a;
    @Field(getter = "getConnectionResult", id = 2)
    /* renamed from: b */
    private final ConnectionResult f20754b;
    @Field(getter = "getResolveAccountResponse", id = 3)
    /* renamed from: c */
    private final ResolveAccountResponse f20755c;

    @Constructor
    zaj(@Param(id = 1) int i, @Param(id = 2) ConnectionResult connectionResult, @Param(id = 3) ResolveAccountResponse resolveAccountResponse) {
        this.f20753a = i;
        this.f20754b = connectionResult;
        this.f20755c = resolveAccountResponse;
    }

    public zaj(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }

    /* renamed from: a */
    public final ConnectionResult m27381a() {
        return this.f20754b;
    }

    /* renamed from: b */
    public final ResolveAccountResponse m27382b() {
        return this.f20755c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f20753a);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f20754b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f20755c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
