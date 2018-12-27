package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends zzb implements IFragmentWrapper {

        public static class zza extends com.google.android.gms.internal.common.zza implements IFragmentWrapper {
            zza(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            /* renamed from: a */
            public final IObjectWrapper mo1896a() {
                Parcel zza = zza(2, zza());
                IObjectWrapper a = com.google.android.gms.dynamic.IObjectWrapper.Stub.m20401a(zza.readStrongBinder());
                zza.recycle();
                return a;
            }

            /* renamed from: b */
            public final Bundle mo1901b() {
                Parcel zza = zza(3, zza());
                Bundle bundle = (Bundle) zzc.m11323a(zza, Bundle.CREATOR);
                zza.recycle();
                return bundle;
            }

            /* renamed from: c */
            public final int mo1904c() {
                Parcel zza = zza(4, zza());
                int readInt = zza.readInt();
                zza.recycle();
                return readInt;
            }

            /* renamed from: d */
            public final IFragmentWrapper mo1906d() {
                Parcel zza = zza(5, zza());
                IFragmentWrapper a = Stub.m20400a(zza.readStrongBinder());
                zza.recycle();
                return a;
            }

            /* renamed from: e */
            public final IObjectWrapper mo1908e() {
                Parcel zza = zza(6, zza());
                IObjectWrapper a = com.google.android.gms.dynamic.IObjectWrapper.Stub.m20401a(zza.readStrongBinder());
                zza.recycle();
                return a;
            }

            /* renamed from: f */
            public final boolean mo1909f() {
                Parcel zza = zza(7, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: g */
            public final String mo1910g() {
                Parcel zza = zza(8, zza());
                String readString = zza.readString();
                zza.recycle();
                return readString;
            }

            /* renamed from: h */
            public final IFragmentWrapper mo1911h() {
                Parcel zza = zza(9, zza());
                IFragmentWrapper a = Stub.m20400a(zza.readStrongBinder());
                zza.recycle();
                return a;
            }

            /* renamed from: i */
            public final int mo1912i() {
                Parcel zza = zza(10, zza());
                int readInt = zza.readInt();
                zza.recycle();
                return readInt;
            }

            /* renamed from: j */
            public final boolean mo1913j() {
                Parcel zza = zza(11, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: k */
            public final IObjectWrapper mo1914k() {
                Parcel zza = zza(12, zza());
                IObjectWrapper a = com.google.android.gms.dynamic.IObjectWrapper.Stub.m20401a(zza.readStrongBinder());
                zza.recycle();
                return a;
            }

            /* renamed from: l */
            public final boolean mo1915l() {
                Parcel zza = zza(13, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: m */
            public final boolean mo1916m() {
                Parcel zza = zza(14, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: n */
            public final boolean mo1917n() {
                Parcel zza = zza(15, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: o */
            public final boolean mo1918o() {
                Parcel zza = zza(16, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: p */
            public final boolean mo1919p() {
                Parcel zza = zza(17, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: q */
            public final boolean mo1920q() {
                Parcel zza = zza(18, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: r */
            public final boolean mo1921r() {
                Parcel zza = zza(19, zza());
                boolean a = zzc.m11327a(zza);
                zza.recycle();
                return a;
            }

            /* renamed from: a */
            public final void mo1899a(IObjectWrapper iObjectWrapper) {
                Parcel zza = zza();
                zzc.m11324a(zza, (IInterface) iObjectWrapper);
                zzb(20, zza);
            }

            /* renamed from: a */
            public final void mo1900a(boolean z) {
                Parcel zza = zza();
                zzc.m11326a(zza, z);
                zzb(true, zza);
            }

            /* renamed from: b */
            public final void mo1903b(boolean z) {
                Parcel zza = zza();
                zzc.m11326a(zza, z);
                zzb(true, zza);
            }

            /* renamed from: c */
            public final void mo1905c(boolean z) {
                Parcel zza = zza();
                zzc.m11326a(zza, z);
                zzb(true, zza);
            }

            /* renamed from: d */
            public final void mo1907d(boolean z) {
                Parcel zza = zza();
                zzc.m11326a(zza, z);
                zzb(true, zza);
            }

            /* renamed from: a */
            public final void mo1897a(Intent intent) {
                Parcel zza = zza();
                zzc.m11325a(zza, (Parcelable) intent);
                zzb(25, zza);
            }

            /* renamed from: a */
            public final void mo1898a(Intent intent, int i) {
                Parcel zza = zza();
                zzc.m11325a(zza, (Parcelable) intent);
                zza.writeInt(i);
                zzb(26, zza);
            }

            /* renamed from: b */
            public final void mo1902b(IObjectWrapper iObjectWrapper) {
                Parcel zza = zza();
                zzc.m11324a(zza, (IInterface) iObjectWrapper);
                zzb(27, zza);
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* renamed from: a */
        public static IFragmentWrapper m20400a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof IFragmentWrapper) {
                return (IFragmentWrapper) queryLocalInterface;
            }
            return new zza(iBinder);
        }

        protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
            IInterface a;
            boolean f;
            switch (i) {
                case 2:
                    a = mo1896a();
                    parcel2.writeNoException();
                    zzc.m11324a(parcel2, a);
                    break;
                case 3:
                    i = mo1901b();
                    parcel2.writeNoException();
                    zzc.m11328b(parcel2, i);
                    break;
                case 4:
                    i = mo1904c();
                    parcel2.writeNoException();
                    parcel2.writeInt(i);
                    break;
                case 5:
                    a = mo1906d();
                    parcel2.writeNoException();
                    zzc.m11324a(parcel2, a);
                    break;
                case 6:
                    a = mo1908e();
                    parcel2.writeNoException();
                    zzc.m11324a(parcel2, a);
                    break;
                case 7:
                    f = mo1909f();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 8:
                    i = mo1910g();
                    parcel2.writeNoException();
                    parcel2.writeString(i);
                    break;
                case 9:
                    a = mo1911h();
                    parcel2.writeNoException();
                    zzc.m11324a(parcel2, a);
                    break;
                case 10:
                    i = mo1912i();
                    parcel2.writeNoException();
                    parcel2.writeInt(i);
                    break;
                case 11:
                    f = mo1913j();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 12:
                    a = mo1914k();
                    parcel2.writeNoException();
                    zzc.m11324a(parcel2, a);
                    break;
                case 13:
                    f = mo1915l();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 14:
                    f = mo1916m();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 15:
                    f = mo1917n();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 16:
                    f = mo1918o();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 17:
                    f = mo1919p();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 18:
                    f = mo1920q();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 19:
                    f = mo1921r();
                    parcel2.writeNoException();
                    zzc.m11326a(parcel2, f);
                    break;
                case 20:
                    mo1899a((IObjectWrapper) com.google.android.gms.dynamic.IObjectWrapper.Stub.m20401a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    mo1900a((boolean) zzc.m11327a(parcel));
                    parcel2.writeNoException();
                    break;
                case 22:
                    mo1903b((boolean) zzc.m11327a(parcel));
                    parcel2.writeNoException();
                    break;
                case 23:
                    mo1905c(zzc.m11327a(parcel));
                    parcel2.writeNoException();
                    break;
                case 24:
                    mo1907d(zzc.m11327a(parcel));
                    parcel2.writeNoException();
                    break;
                case 25:
                    mo1897a((Intent) zzc.m11323a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    mo1898a((Intent) zzc.m11323a(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 27:
                    mo1902b((IObjectWrapper) com.google.android.gms.dynamic.IObjectWrapper.Stub.m20401a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    IObjectWrapper mo1896a();

    /* renamed from: a */
    void mo1897a(Intent intent);

    /* renamed from: a */
    void mo1898a(Intent intent, int i);

    /* renamed from: a */
    void mo1899a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo1900a(boolean z);

    /* renamed from: b */
    Bundle mo1901b();

    /* renamed from: b */
    void mo1902b(IObjectWrapper iObjectWrapper);

    /* renamed from: b */
    void mo1903b(boolean z);

    /* renamed from: c */
    int mo1904c();

    /* renamed from: c */
    void mo1905c(boolean z);

    /* renamed from: d */
    IFragmentWrapper mo1906d();

    /* renamed from: d */
    void mo1907d(boolean z);

    /* renamed from: e */
    IObjectWrapper mo1908e();

    /* renamed from: f */
    boolean mo1909f();

    /* renamed from: g */
    String mo1910g();

    /* renamed from: h */
    IFragmentWrapper mo1911h();

    /* renamed from: i */
    int mo1912i();

    /* renamed from: j */
    boolean mo1913j();

    /* renamed from: k */
    IObjectWrapper mo1914k();

    /* renamed from: l */
    boolean mo1915l();

    /* renamed from: m */
    boolean mo1916m();

    /* renamed from: n */
    boolean mo1917n();

    /* renamed from: o */
    boolean mo1918o();

    /* renamed from: p */
    boolean mo1919p();

    /* renamed from: q */
    boolean mo1920q();

    /* renamed from: r */
    boolean mo1921r();
}
