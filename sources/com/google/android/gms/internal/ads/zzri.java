package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import java.util.List;

public final class zzri extends zzem implements zzrg {
    zzri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    /* renamed from: a */
    public final String mo2663a(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        str = m10545a(1, t_);
        String readString = str.readString();
        str.recycle();
        return readString;
    }

    /* renamed from: b */
    public final zzqk mo2665b(String str) {
        zzqk zzqk;
        Parcel t_ = t_();
        t_.writeString(str);
        str = m10545a(2, t_);
        IBinder readStrongBinder = str.readStrongBinder();
        if (readStrongBinder == null) {
            zzqk = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzqk) {
                zzqk = (zzqk) queryLocalInterface;
            } else {
                zzqk = new zzqm(readStrongBinder);
            }
        }
        str.recycle();
        return zzqk;
    }

    /* renamed from: e */
    public final List<String> mo2668e() {
        Parcel a = m10545a(3, t_());
        List createStringArrayList = a.createStringArrayList();
        a.recycle();
        return createStringArrayList;
    }

    /* renamed from: b */
    public final String mo2666b() {
        Parcel a = m10545a(4, t_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: c */
    public final void mo2667c(String str) {
        Parcel t_ = t_();
        t_.writeString(str);
        m10546b(5, t_);
    }

    /* renamed from: h */
    public final void mo2671h() {
        m10546b(6, t_());
    }

    /* renamed from: g */
    public final zzly mo2670g() {
        Parcel a = m10545a(7, t_());
        zzly a2 = zzlz.m21766a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: j */
    public final void mo2673j() {
        m10546b(8, t_());
    }

    /* renamed from: i */
    public final IObjectWrapper mo2672i() {
        Parcel a = m10545a(9, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final boolean mo2664a(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        iObjectWrapper = m10545a(10, t_);
        boolean a = zzeo.m10552a(iObjectWrapper);
        iObjectWrapper.recycle();
        return a;
    }

    /* renamed from: f */
    public final IObjectWrapper mo2669f() {
        Parcel a = m10545a(11, t_());
        IObjectWrapper a2 = Stub.m20401a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
