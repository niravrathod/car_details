package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public abstract class zae extends zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                zaa((ConnectionResult) zac.m11313a(parcel, ConnectionResult.CREATOR), (zaa) zac.m11313a(parcel, zaa.CREATOR));
                break;
            case 4:
                zag((Status) zac.m11313a(parcel, Status.CREATOR));
                break;
            case 6:
                zah((Status) zac.m11313a(parcel, Status.CREATOR));
                break;
            case 7:
                zaa((Status) zac.m11313a(parcel, Status.CREATOR), (GoogleSignInAccount) zac.m11313a(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                zab((zaj) zac.m11313a(parcel, zaj.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
