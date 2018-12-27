package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzq;
import com.google.android.gms.internal.measurement.zzs;
import java.util.List;

public final class zzai extends zzq implements zzag {
    zzai(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo3183a(zzad zzad, zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzad);
        zzs.m11952a(a, (Parcelable) zzh);
        m11948b(1, a);
    }

    /* renamed from: a */
    public final void mo3185a(zzfh zzfh, zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzfh);
        zzs.m11952a(a, (Parcelable) zzh);
        m11948b(2, a);
    }

    /* renamed from: a */
    public final void mo3186a(zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzh);
        m11948b(4, a);
    }

    /* renamed from: a */
    public final void mo3184a(zzad zzad, String str, String str2) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzad);
        a.writeString(str);
        a.writeString(str2);
        m11948b(5, a);
    }

    /* renamed from: b */
    public final void mo3190b(zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzh);
        m11948b(6, a);
    }

    /* renamed from: a */
    public final List<zzfh> mo3177a(zzh zzh, boolean z) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzh);
        zzs.m11953a(a, z);
        zzh = m11947a(7, a);
        z = zzh.createTypedArrayList(zzfh.CREATOR);
        zzh.recycle();
        return z;
    }

    /* renamed from: a */
    public final byte[] mo3189a(zzad zzad, String str) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzad);
        a.writeString(str);
        zzad = m11947a(9, a);
        str = zzad.createByteArray();
        zzad.recycle();
        return str;
    }

    /* renamed from: a */
    public final void mo3182a(long j, String str, String str2, String str3) {
        Parcel a = m11946a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        m11948b(10, a);
    }

    /* renamed from: c */
    public final String mo3191c(zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzh);
        zzh = m11947a(11, a);
        String readString = zzh.readString();
        zzh.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo3188a(zzl zzl, zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzl);
        zzs.m11952a(a, (Parcelable) zzh);
        m11948b(12, a);
    }

    /* renamed from: a */
    public final void mo3187a(zzl zzl) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzl);
        m11948b(13, a);
    }

    /* renamed from: a */
    public final List<zzfh> mo3181a(String str, String str2, boolean z, zzh zzh) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11953a(a, z);
        zzs.m11952a(a, (Parcelable) zzh);
        str = m11947a(14, a);
        str2 = str.createTypedArrayList(zzfh.CREATOR);
        str.recycle();
        return str2;
    }

    /* renamed from: a */
    public final List<zzfh> mo3180a(String str, String str2, String str3, boolean z) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        zzs.m11953a(a, z);
        str = m11947a(15, a);
        str2 = str.createTypedArrayList(zzfh.CREATOR);
        str.recycle();
        return str2;
    }

    /* renamed from: a */
    public final List<zzl> mo3178a(String str, String str2, zzh zzh) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11952a(a, (Parcelable) zzh);
        str = m11947a(16, a);
        str2 = str.createTypedArrayList(zzl.CREATOR);
        str.recycle();
        return str2;
    }

    /* renamed from: a */
    public final List<zzl> mo3179a(String str, String str2, String str3) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        str = m11947a(17, a);
        str2 = str.createTypedArrayList(zzl.CREATOR);
        str.recycle();
        return str2;
    }

    /* renamed from: d */
    public final void mo3192d(zzh zzh) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) zzh);
        m11948b(18, a);
    }
}
