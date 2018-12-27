package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzjm implements Creator<zzjk> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzjk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        List list = bundle;
        String str = list;
        zznb zznb = str;
        Location location = zznb;
        String str2 = location;
        Bundle bundle2 = str2;
        Bundle bundle3 = bundle2;
        List list2 = bundle3;
        String str3 = list2;
        String str4 = str3;
        zzje zzje = str4;
        String str5 = zzje;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 3:
                    bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 4:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 5:
                    list = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 6:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 7:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 8:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 9:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 10:
                    zznb = (zznb) SafeParcelReader.createParcelable(parcel2, readHeader, zznb.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.createParcelable(parcel2, readHeader, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 15:
                    list2 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 16:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 17:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 18:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 19:
                    zzje = (zzje) SafeParcelReader.createParcelable(parcel2, readHeader, zzje.CREATOR);
                    break;
                case 20:
                    i4 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzjk(i, j, bundle, i2, list, z, i3, z2, str, zznb, location, str2, bundle2, bundle3, list2, str3, str4, z3, zzje, i4, str5);
    }
}
