package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@Class(creator = "CacheEntryParcelCreator")
@Reserved({1})
public final class zzhl extends AbstractSafeParcelable {
    public static final Creator<zzhl> CREATOR = new zzhm();
    @GuardedBy("this")
    @Field(getter = "getContentFileDescriptor", id = 2)
    /* renamed from: a */
    private ParcelFileDescriptor f20130a;

    public zzhl() {
        this(null);
    }

    @Constructor
    public zzhl(@Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.f20130a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final synchronized boolean m26572a() {
        return this.f20130a != null;
    }

    /* renamed from: b */
    public final synchronized InputStream m26573b() {
        if (this.f20130a == null) {
            return null;
        }
        InputStream autoCloseInputStream = new AutoCloseInputStream(this.f20130a);
        this.f20130a = null;
        return autoCloseInputStream;
    }

    /* renamed from: c */
    private final synchronized ParcelFileDescriptor m26571c() {
        return this.f20130a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m26571c(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
