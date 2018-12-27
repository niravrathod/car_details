package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzaby extends zzem implements zzabw {
    zzaby(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void onCreate(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        m10546b(1, t_);
    }

    public final void onRestart() {
        m10546b(2, t_());
    }

    public final void onStart() {
        m10546b(3, t_());
    }

    public final void onResume() {
        m10546b(4, t_());
    }

    public final void onPause() {
        m10546b(5, t_());
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Parcel t_ = t_();
        zzeo.m10550a(t_, (Parcelable) bundle);
        t_ = m10545a(6, t_);
        if (t_.readInt() != 0) {
            bundle.readFromParcel(t_);
        }
        t_.recycle();
    }

    public final void onStop() {
        m10546b(7, t_());
    }

    public final void onDestroy() {
        m10546b(8, t_());
    }

    public final void zzax() {
        m10546b(9, t_());
    }

    public final void onBackPressed() {
        m10546b(10, t_());
    }

    public final boolean zzou() {
        Parcel a = m10545a(11, t_());
        boolean a2 = zzeo.m10552a(a);
        a.recycle();
        return a2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcel t_ = t_();
        t_.writeInt(i);
        t_.writeInt(i2);
        zzeo.m10550a(t_, (Parcelable) intent);
        m10546b(12, t_);
    }

    public final void zzq(IObjectWrapper iObjectWrapper) {
        Parcel t_ = t_();
        zzeo.m10549a(t_, (IInterface) iObjectWrapper);
        m10546b(13, t_);
    }
}
