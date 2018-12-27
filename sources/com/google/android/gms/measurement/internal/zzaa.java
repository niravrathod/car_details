package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Iterator;

@Class(creator = "EventParamsCreator")
@Reserved({1})
public final class zzaa extends AbstractSafeParcelable implements Iterable<String> {
    public static final Creator<zzaa> CREATOR = new zzac();
    @Field(getter = "z", id = 2)
    /* renamed from: a */
    private final Bundle f20673a;

    @Constructor
    zzaa(@Param(id = 2) Bundle bundle) {
        this.f20673a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, m27303b(), false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    /* renamed from: a */
    final Object m27302a(String str) {
        return this.f20673a.get(str);
    }

    /* renamed from: b */
    final Long m27304b(String str) {
        return Long.valueOf(this.f20673a.getLong(str));
    }

    /* renamed from: c */
    final Double m27305c(String str) {
        return Double.valueOf(this.f20673a.getDouble(str));
    }

    /* renamed from: d */
    final String m27306d(String str) {
        return this.f20673a.getString(str);
    }

    /* renamed from: a */
    public final int m27301a() {
        return this.f20673a.size();
    }

    public final String toString() {
        return this.f20673a.toString();
    }

    /* renamed from: b */
    public final Bundle m27303b() {
        return new Bundle(this.f20673a);
    }

    public final Iterator<String> iterator() {
        return new C2476a(this);
    }
}
