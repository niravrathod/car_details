package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public final class zzeb extends zzq implements zzdz {
    zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public final void mo3120a(IObjectWrapper iObjectWrapper, zzek zzek, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        zzs.m11952a(a, (Parcelable) zzek);
        a.writeLong(j);
        m11948b(1, a);
    }

    /* renamed from: a */
    public final void mo3129a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11952a(a, (Parcelable) bundle);
        zzs.m11953a(a, z);
        zzs.m11953a(a, z2);
        a.writeLong(j);
        m11948b(2, a);
    }

    /* renamed from: a */
    public final void mo3128a(String str, String str2, Bundle bundle, zzec zzec, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11952a(a, (Parcelable) bundle);
        zzs.m11951a(a, (IInterface) zzec);
        a.writeLong(j);
        m11948b(3, a);
    }

    /* renamed from: a */
    public final void mo3130a(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        zzs.m11953a(a, z);
        a.writeLong(j);
        m11948b(4, a);
    }

    /* renamed from: a */
    public final void mo3132a(String str, String str2, boolean z, zzec zzec) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11953a(a, z);
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(5, a);
    }

    /* renamed from: a */
    public final void mo3126a(String str, zzec zzec) {
        Parcel a = m11946a();
        a.writeString(str);
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(6, a);
    }

    /* renamed from: a */
    public final void mo3125a(String str, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeLong(j);
        m11948b(7, a);
    }

    /* renamed from: a */
    public final void mo3115a(Bundle bundle, long j) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) bundle);
        a.writeLong(j);
        m11948b(8, a);
    }

    /* renamed from: a */
    public final void mo3127a(String str, String str2, Bundle bundle) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11952a(a, (Parcelable) bundle);
        m11948b(9, a);
    }

    /* renamed from: a */
    public final void mo3131a(String str, String str2, zzec zzec) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeString(str2);
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(10, a);
    }

    /* renamed from: a */
    public final void mo3134a(boolean z, long j) {
        Parcel a = m11946a();
        zzs.m11953a(a, z);
        a.writeLong(j);
        m11948b(true, a);
    }

    /* renamed from: a */
    public final void mo3114a(long j) {
        Parcel a = m11946a();
        a.writeLong(j);
        m11948b(12, a);
    }

    /* renamed from: b */
    public final void mo3135b(long j) {
        Parcel a = m11946a();
        a.writeLong(j);
        m11948b(13, a);
    }

    /* renamed from: c */
    public final void mo3140c(long j) {
        Parcel a = m11946a();
        a.writeLong(j);
        m11948b(14, a);
    }

    /* renamed from: a */
    public final void mo3121a(IObjectWrapper iObjectWrapper, String str, String str2, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        a.writeString(str2);
        a.writeLong(j);
        m11948b(15, a);
    }

    /* renamed from: a */
    public final void mo3122a(zzec zzec) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(16, a);
    }

    /* renamed from: b */
    public final void mo3137b(zzec zzec) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(17, a);
    }

    /* renamed from: a */
    public final void mo3124a(zzei zzei) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzei);
        m11948b(18, a);
    }

    /* renamed from: c */
    public final void mo3142c(zzec zzec) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(19, a);
    }

    /* renamed from: d */
    public final void mo3146d(zzec zzec) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(20, a);
    }

    /* renamed from: e */
    public final void mo3148e(zzec zzec) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(21, a);
    }

    /* renamed from: f */
    public final void mo3149f(zzec zzec) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzec);
        m11948b(22, a);
    }

    /* renamed from: b */
    public final void mo3139b(String str, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeLong(j);
        m11948b(23, a);
    }

    /* renamed from: c */
    public final void mo3144c(String str, long j) {
        Parcel a = m11946a();
        a.writeString(str);
        a.writeLong(j);
        m11948b(24, a);
    }

    /* renamed from: a */
    public final void mo3117a(IObjectWrapper iObjectWrapper, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        a.writeLong(j);
        m11948b(25, a);
    }

    /* renamed from: b */
    public final void mo3136b(IObjectWrapper iObjectWrapper, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        a.writeLong(j);
        m11948b(26, a);
    }

    /* renamed from: a */
    public final void mo3118a(IObjectWrapper iObjectWrapper, Bundle bundle, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        zzs.m11952a(a, (Parcelable) bundle);
        a.writeLong(j);
        m11948b(27, a);
    }

    /* renamed from: c */
    public final void mo3141c(IObjectWrapper iObjectWrapper, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        a.writeLong(j);
        m11948b(28, a);
    }

    /* renamed from: d */
    public final void mo3145d(IObjectWrapper iObjectWrapper, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        a.writeLong(j);
        m11948b(29, a);
    }

    /* renamed from: e */
    public final void mo3147e(IObjectWrapper iObjectWrapper, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        a.writeLong(j);
        m11948b(30, a);
    }

    /* renamed from: a */
    public final void mo3119a(IObjectWrapper iObjectWrapper, zzec zzec, long j) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        zzs.m11951a(a, (IInterface) zzec);
        a.writeLong(j);
        m11948b(31, a);
    }

    /* renamed from: a */
    public final void mo3116a(Bundle bundle, zzec zzec, long j) {
        Parcel a = m11946a();
        zzs.m11952a(a, (Parcelable) bundle);
        zzs.m11951a(a, (IInterface) zzec);
        a.writeLong(j);
        m11948b(32, a);
    }

    /* renamed from: a */
    public final void mo3113a(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel a = m11946a();
        a.writeInt(i);
        a.writeString(str);
        zzs.m11951a(a, (IInterface) iObjectWrapper);
        zzs.m11951a(a, (IInterface) iObjectWrapper2);
        zzs.m11951a(a, (IInterface) iObjectWrapper3);
        m11948b(33, a);
    }

    /* renamed from: a */
    public final void mo3123a(zzef zzef) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzef);
        m11948b(34, a);
    }

    /* renamed from: b */
    public final void mo3138b(zzef zzef) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzef);
        m11948b(35, a);
    }

    /* renamed from: c */
    public final void mo3143c(zzef zzef) {
        Parcel a = m11946a();
        zzs.m11951a(a, (IInterface) zzef);
        m11948b(36, a);
    }

    /* renamed from: a */
    public final void mo3133a(Map map) {
        Parcel a = m11946a();
        a.writeMap(map);
        m11948b(37, a);
    }
}
