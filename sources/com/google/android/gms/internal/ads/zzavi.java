package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;

@Class(creator = "GassResponseParcelCreator")
public final class zzavi extends AbstractSafeParcelable {
    public static final Creator<zzavi> CREATOR = new zzavj();
    @VersionField(id = 1)
    /* renamed from: a */
    private final int f19940a;
    @Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    /* renamed from: b */
    private zzbb f19941b = 0;
    /* renamed from: c */
    private byte[] f19942c;

    @Constructor
    zzavi(@Param(id = 1) int i, @Param(id = 2) byte[] bArr) {
        this.f19940a = i;
        this.f19942c = bArr;
        m26378b();
    }

    /* renamed from: a */
    public final zzbb m26379a() {
        if ((this.f19941b != null ? 1 : null) == null) {
            try {
                this.f19941b = (zzbb) zzbgz.m10448a(new zzbb(), this.f19942c);
                this.f19942c = null;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        m26378b();
        return this.f19941b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f19940a);
        if (this.f19942c != null) {
            bArr = this.f19942c;
        } else {
            bArr = zzbgz.m10450a(this.f19941b);
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }

    /* renamed from: b */
    private final void m26378b() {
        if (this.f19941b == null && this.f19942c != null) {
            return;
        }
        if (this.f19941b == null || this.f19942c != null) {
            if (this.f19941b != null) {
                if (this.f19942c != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
            }
            if (this.f19941b == null && this.f19942c == null) {
                throw new IllegalStateException("Invalid internal representation - empty");
            }
            throw new IllegalStateException("Impossible");
        }
    }
}
