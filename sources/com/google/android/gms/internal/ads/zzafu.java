package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzafu implements Creator<zzaft> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaft[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        long j4 = j3;
        String str = null;
        String str2 = str;
        List list = str2;
        List list2 = list;
        List list3 = list2;
        String str3 = list3;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        zzagf zzagf = str6;
        String str7 = zzagf;
        String str8 = str7;
        zzajk zzajk = str8;
        List list4 = zzajk;
        List list5 = list4;
        zzafv zzafv = list5;
        String str9 = zzafv;
        List list6 = str9;
        String str10 = list6;
        zzajv zzajv = str10;
        String str11 = zzajv;
        Bundle bundle = str11;
        List list7 = bundle;
        String str12 = list7;
        String str13 = str12;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i4 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 4:
                    list = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 5:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 6:
                    list2 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 7:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 8:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 9:
                    j2 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 10:
                    list3 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 11:
                    j3 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 12:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 13:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 14:
                    j4 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 15:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 18:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 19:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 21:
                    str6 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 22:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 23:
                    z4 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 24:
                    z5 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 25:
                    z6 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 26:
                    z7 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 28:
                    zzagf = (zzagf) SafeParcelReader.createParcelable(parcel2, readHeader, zzagf.CREATOR);
                    break;
                case 29:
                    str7 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 30:
                    str8 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 31:
                    z8 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 32:
                    z9 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 33:
                    zzajk = (zzajk) SafeParcelReader.createParcelable(parcel2, readHeader, zzajk.CREATOR);
                    break;
                case 34:
                    list4 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 35:
                    list5 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 36:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 37:
                    zzafv = (zzafv) SafeParcelReader.createParcelable(parcel2, readHeader, zzafv.CREATOR);
                    break;
                case 38:
                    z11 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 39:
                    str9 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 40:
                    list6 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 42:
                    z12 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 43:
                    str10 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 44:
                    zzajv = (zzajv) SafeParcelReader.createParcelable(parcel2, readHeader, zzajv.CREATOR);
                    break;
                case 45:
                    str11 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 46:
                    z13 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 47:
                    z14 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 48:
                    bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 49:
                    z15 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 50:
                    i4 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 51:
                    z16 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 52:
                    list7 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 53:
                    z17 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 54:
                    str12 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 55:
                    str13 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 56:
                    z18 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzaft(i, str, str2, list, i2, list2, j, z, j2, list3, j3, i3, str3, j4, str4, z2, str5, str6, z3, z4, z5, z6, z7, zzagf, str7, str8, z8, z9, zzajk, list4, list5, z10, zzafv, z11, str9, list6, z12, str10, zzajv, str11, z13, z14, bundle, z15, i4, z16, list7, z17, str12, str13, z18);
    }
}
