package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import java.util.Arrays;
import java.util.Comparator;

@Class(creator = "FlagCreator")
@Reserved({1})
public final class zzi extends AbstractSafeParcelable implements Comparable<zzi> {
    public static final Creator<zzi> CREATOR = new zzk();
    /* renamed from: i */
    private static final Comparator<zzi> f20739i = new C2505e();
    @Field(id = 2)
    /* renamed from: a */
    public final String f20740a;
    @Field(id = 9)
    /* renamed from: b */
    public final int f20741b;
    @Field(id = 3)
    /* renamed from: c */
    private final long f20742c;
    @Field(id = 4)
    /* renamed from: d */
    private final boolean f20743d;
    @Field(id = 5)
    /* renamed from: e */
    private final double f20744e;
    @Field(id = 6)
    /* renamed from: f */
    private final String f20745f;
    @Field(id = 7)
    /* renamed from: g */
    private final byte[] f20746g;
    @Field(id = 8)
    /* renamed from: h */
    private final int f20747h;

    @Constructor
    public zzi(@Param(id = 2) String str, @Param(id = 3) long j, @Param(id = 4) boolean z, @Param(id = 5) double d, @Param(id = 6) String str2, @Param(id = 7) byte[] bArr, @Param(id = 8) int i, @Param(id = 9) int i2) {
        this.f20740a = str;
        this.f20742c = j;
        this.f20743d = z;
        this.f20744e = d;
        this.f20745f = str2;
        this.f20746g = bArr;
        this.f20747h = i;
        this.f20741b = i2;
    }

    /* renamed from: a */
    private static int m27380a(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.f20740a.compareTo(zzi.f20740a);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = m27380a(this.f20747h, zzi.f20747h);
        if (compareTo != 0) {
            return compareTo;
        }
        int i = 0;
        switch (this.f20747h) {
            case 1:
                long j = this.f20742c;
                long j2 = zzi.f20742c;
                return j < j2 ? -1 : j == j2 ? 0 : 1;
            case 2:
                boolean z = this.f20743d;
                return z == zzi.f20743d ? 0 : z ? 1 : -1;
            case 3:
                return Double.compare(this.f20744e, zzi.f20744e);
            case 4:
                String str = this.f20745f;
                String str2 = zzi.f20745f;
                return str == str2 ? 0 : str == null ? -1 : str2 == null ? 1 : str.compareTo(str2);
            case 5:
                if (this.f20746g == zzi.f20746g) {
                    return 0;
                }
                if (this.f20746g == null) {
                    return -1;
                }
                if (zzi.f20746g == null) {
                    return 1;
                }
                while (i < Math.min(this.f20746g.length, zzi.f20746g.length)) {
                    compareTo = this.f20746g[i] - zzi.f20746g[i];
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    i++;
                }
                return m27380a(this.f20746g.length, zzi.f20746g.length);
            default:
                compareTo = this.f20747h;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Invalid enum value: ");
                stringBuilder.append(compareTo);
                throw new AssertionError(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzi) {
            zzi zzi = (zzi) obj;
            if (zzn.m12396a(this.f20740a, zzi.f20740a) && this.f20747h == zzi.f20747h) {
                if (this.f20741b == zzi.f20741b) {
                    switch (this.f20747h) {
                        case 1:
                            if (this.f20742c == zzi.f20742c) {
                                return true;
                            }
                            break;
                        case 2:
                            return this.f20743d == zzi.f20743d;
                        case 3:
                            return this.f20744e == zzi.f20744e;
                        case 4:
                            return zzn.m12396a(this.f20745f, zzi.f20745f);
                        case 5:
                            return Arrays.equals(this.f20746g, zzi.f20746g);
                        default:
                            int i = this.f20747h;
                            StringBuilder stringBuilder = new StringBuilder(31);
                            stringBuilder.append("Invalid enum value: ");
                            stringBuilder.append(i);
                            throw new AssertionError(stringBuilder.toString());
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
        r5 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Flag(";
        r0.append(r1);
        r1 = r5.f20740a;
        r0.append(r1);
        r1 = ", ";
        r0.append(r1);
        r1 = r5.f20747h;
        switch(r1) {
            case 1: goto L_0x0076;
            case 2: goto L_0x0070;
            case 3: goto L_0x006a;
            case 4: goto L_0x005a;
            case 5: goto L_0x0046;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = new java.lang.AssertionError;
        r1 = r5.f20740a;
        r2 = r5.f20747h;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 27;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "Invalid type: ";
        r4.append(r3);
        r4.append(r1);
        r1 = ", ";
        r4.append(r1);
        r4.append(r2);
        r1 = r4.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0046:
        r1 = r5.f20746g;
        if (r1 != 0) goto L_0x004d;
    L_0x004a:
        r1 = "null";
        goto L_0x0066;
    L_0x004d:
        r1 = "'";
        r0.append(r1);
        r1 = r5.f20746g;
        r2 = 3;
        r1 = android.util.Base64.encodeToString(r1, r2);
        goto L_0x0061;
    L_0x005a:
        r1 = "'";
        r0.append(r1);
        r1 = r5.f20745f;
    L_0x0061:
        r0.append(r1);
        r1 = "'";
    L_0x0066:
        r0.append(r1);
        goto L_0x007b;
    L_0x006a:
        r1 = r5.f20744e;
        r0.append(r1);
        goto L_0x007b;
    L_0x0070:
        r1 = r5.f20743d;
        r0.append(r1);
        goto L_0x007b;
    L_0x0076:
        r1 = r5.f20742c;
        r0.append(r1);
    L_0x007b:
        r1 = ", ";
        r0.append(r1);
        r1 = r5.f20747h;
        r0.append(r1);
        r1 = ", ";
        r0.append(r1);
        r1 = r5.f20741b;
        r0.append(r1);
        r1 = ")";
        r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.zzi.toString():java.lang.String");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f20740a, false);
        SafeParcelWriter.writeLong(parcel, 3, this.f20742c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f20743d);
        SafeParcelWriter.writeDouble(parcel, 5, this.f20744e);
        SafeParcelWriter.writeString(parcel, 6, this.f20745f, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f20746g, false);
        SafeParcelWriter.writeInt(parcel, 8, this.f20747h);
        SafeParcelWriter.writeInt(parcel, 9, this.f20741b);
        SafeParcelWriter.finishObjectHeader(parcel, i);
    }
}
