package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzafr implements Creator<zzafp> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzafp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j = 0;
        long j2 = j;
        Bundle bundle = null;
        zzjk zzjk = bundle;
        zzjo zzjo = zzjk;
        String str = zzjo;
        ApplicationInfo applicationInfo = str;
        PackageInfo packageInfo = applicationInfo;
        String str2 = packageInfo;
        String str3 = str2;
        String str4 = str3;
        zzaop zzaop = str4;
        Bundle bundle2 = zzaop;
        List list = bundle2;
        Bundle bundle3 = list;
        String str5 = bundle3;
        String str6 = str5;
        List list2 = str6;
        String str7 = list2;
        zzpy zzpy = str7;
        List list3 = zzpy;
        String str8 = list3;
        String str9 = str8;
        String str10 = str9;
        Bundle bundle4 = str10;
        String str11 = bundle4;
        zzme zzme = str11;
        Bundle bundle5 = zzme;
        String str12 = bundle5;
        String str13 = str12;
        String str14 = str13;
        List list4 = str14;
        String str15 = list4;
        List list5 = str15;
        ArrayList arrayList = list5;
        String str16 = arrayList;
        zzti zzti = str16;
        String str17 = zzti;
        Bundle bundle6 = str17;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 3:
                    zzjk = (zzjk) SafeParcelReader.createParcelable(parcel2, readHeader, zzjk.CREATOR);
                    break;
                case 4:
                    zzjo = (zzjo) SafeParcelReader.createParcelable(parcel2, readHeader, zzjo.CREATOR);
                    break;
                case 5:
                    str = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.createParcelable(parcel2, readHeader, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.createParcelable(parcel2, readHeader, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 9:
                    str3 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 10:
                    str4 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 11:
                    zzaop = (zzaop) SafeParcelReader.createParcelable(parcel2, readHeader, zzaop.CREATOR);
                    break;
                case 12:
                    bundle2 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 13:
                    i2 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 14:
                    list = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 15:
                    bundle3 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 16:
                    z = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 18:
                    i3 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 19:
                    i4 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 20:
                    f = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 25:
                    j = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 26:
                    str6 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 27:
                    list2 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 28:
                    str7 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 29:
                    zzpy = (zzpy) SafeParcelReader.createParcelable(parcel2, readHeader, zzpy.CREATOR);
                    break;
                case 30:
                    list3 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 31:
                    j2 = SafeParcelReader.readLong(parcel2, readHeader);
                    break;
                case 33:
                    str8 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 34:
                    f2 = SafeParcelReader.readFloat(parcel2, readHeader);
                    break;
                case 35:
                    i5 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 36:
                    i6 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 37:
                    z3 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 38:
                    z4 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 39:
                    str9 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 40:
                    z2 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 41:
                    str10 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 42:
                    z5 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 43:
                    i7 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 44:
                    bundle4 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 45:
                    str11 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 46:
                    zzme = (zzme) SafeParcelReader.createParcelable(parcel2, readHeader, zzme.CREATOR);
                    break;
                case 47:
                    z6 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 48:
                    bundle5 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                case 49:
                    str12 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 50:
                    str13 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 51:
                    str14 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 52:
                    z7 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 53:
                    list4 = SafeParcelReader.createIntegerList(parcel2, readHeader);
                    break;
                case 54:
                    str15 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 55:
                    list5 = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 56:
                    i8 = SafeParcelReader.readInt(parcel2, readHeader);
                    break;
                case 57:
                    z8 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 58:
                    z9 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 59:
                    z10 = SafeParcelReader.readBoolean(parcel2, readHeader);
                    break;
                case 60:
                    arrayList = SafeParcelReader.createStringList(parcel2, readHeader);
                    break;
                case 61:
                    str16 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 63:
                    zzti = (zzti) SafeParcelReader.createParcelable(parcel2, readHeader, zzti.CREATOR);
                    break;
                case 64:
                    str17 = SafeParcelReader.createString(parcel2, readHeader);
                    break;
                case 65:
                    bundle6 = SafeParcelReader.createBundle(parcel2, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel2, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel2, validateObjectHeader);
        return new zzafp(i, bundle, zzjk, zzjo, str, applicationInfo, packageInfo, str2, str3, str4, zzaop, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzpy, list3, j2, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4, str11, zzme, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i8, z8, z9, z10, arrayList, str16, zzti, str17, bundle6);
    }
}
