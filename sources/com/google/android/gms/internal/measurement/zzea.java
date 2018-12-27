package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;

public abstract class zzea extends zzr implements zzdz {
    public zzea() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public static zzdz m22495a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof zzdz) {
            return (zzdz) queryLocalInterface;
        }
        return new zzeb(iBinder);
    }

    /* renamed from: a */
    protected final boolean mo3112a(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzec zzec = null;
        String readString;
        String readString2;
        IInterface queryLocalInterface;
        IBinder readStrongBinder;
        IBinder readStrongBinder2;
        zzef zzef;
        switch (i) {
            case 1:
                mo3120a(Stub.m20401a(parcel.readStrongBinder()), (zzek) zzs.m11950a(parcel, zzek.CREATOR), parcel.readLong());
                break;
            case 2:
                mo3129a(parcel.readString(), parcel.readString(), (Bundle) zzs.m11950a(parcel, Bundle.CREATOR), zzs.m11954a(parcel), zzs.m11954a(parcel), parcel.readLong());
                break;
            case 3:
                readString = parcel.readString();
                readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzs.m11950a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    queryLocalInterface = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder3);
                    }
                }
                mo3128a(readString, readString2, bundle, zzec, parcel.readLong());
                break;
            case 4:
                mo3130a(parcel.readString(), parcel.readString(), Stub.m20401a(parcel.readStrongBinder()), zzs.m11954a(parcel), parcel.readLong());
                break;
            case 5:
                readString = parcel.readString();
                readString2 = parcel.readString();
                boolean a = zzs.m11954a(parcel);
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3132a(readString, readString2, a, zzec);
                break;
            case 6:
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3126a(readString, zzec);
                break;
            case 7:
                mo3125a(parcel.readString(), parcel.readLong());
                break;
            case 8:
                mo3115a((Bundle) zzs.m11950a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                mo3127a(parcel.readString(), parcel.readString(), (Bundle) zzs.m11950a(parcel, Bundle.CREATOR));
                break;
            case 10:
                readString = parcel.readString();
                readString2 = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3131a(readString, readString2, zzec);
                break;
            case 11:
                mo3134a(zzs.m11954a(parcel), parcel.readLong());
                break;
            case 12:
                mo3114a(parcel.readLong());
                break;
            case 13:
                mo3135b(parcel.readLong());
                break;
            case 14:
                mo3140c(parcel.readLong());
                break;
            case 15:
                mo3121a(Stub.m20401a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3122a(zzec);
                break;
            case 17:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3137b(zzec);
                break;
            case 18:
                zzei zzei;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface instanceof zzei) {
                        zzei = (zzei) queryLocalInterface;
                    } else {
                        zzei = new zzej(readStrongBinder);
                    }
                }
                mo3124a(zzei);
                break;
            case 19:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3142c(zzec);
                break;
            case 20:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3146d(zzec);
                break;
            case 21:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3148e(zzec);
                break;
            case 22:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder);
                    }
                }
                mo3149f(zzec);
                break;
            case 23:
                mo3139b(parcel.readString(), parcel.readLong());
                break;
            case 24:
                mo3144c(parcel.readString(), parcel.readLong());
                break;
            case 25:
                mo3117a(Stub.m20401a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                mo3136b(Stub.m20401a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                mo3118a(Stub.m20401a(parcel.readStrongBinder()), (Bundle) zzs.m11950a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                mo3141c(Stub.m20401a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                mo3145d(Stub.m20401a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                mo3147e(Stub.m20401a(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                IObjectWrapper a2 = Stub.m20401a(parcel.readStrongBinder());
                readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder2);
                    }
                }
                mo3119a(a2, zzec, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzs.m11950a(parcel, Bundle.CREATOR);
                readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof zzec) {
                        zzec = (zzec) queryLocalInterface;
                    } else {
                        zzec = new zzee(readStrongBinder2);
                    }
                }
                mo3116a(bundle2, zzec, parcel.readLong());
                break;
            case 33:
                mo3113a(parcel.readInt(), parcel.readString(), Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()), Stub.m20401a(parcel.readStrongBinder()));
                break;
            case 34:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface instanceof zzef) {
                        zzef = (zzef) queryLocalInterface;
                    } else {
                        zzef = new zzeh(readStrongBinder);
                    }
                }
                mo3123a(zzef);
                break;
            case 35:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface instanceof zzef) {
                        zzef = (zzef) queryLocalInterface;
                    } else {
                        zzef = new zzeh(readStrongBinder);
                    }
                }
                mo3138b(zzef);
                break;
            case 36:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface instanceof zzef) {
                        zzef = (zzef) queryLocalInterface;
                    } else {
                        zzef = new zzeh(readStrongBinder);
                    }
                }
                mo3143c(zzef);
                break;
            case 37:
                mo3133a(zzs.m11955b(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
