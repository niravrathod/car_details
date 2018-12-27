package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.youtube.player.internal.C2537h.C4163a.C4162a;
import com.google.android.youtube.player.internal.C2538i.C4165a.C4164a;
import com.google.android.youtube.player.internal.C2539j.C4167a.C4166a;
import com.google.android.youtube.player.internal.C2540k.C4169a.C4168a;
import com.google.android.youtube.player.internal.C2557x.C4182a;
import java.util.List;

/* renamed from: com.google.android.youtube.player.internal.g */
public interface C2536g extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.g$a */
    public static abstract class C4161a extends Binder implements C2536g {

        /* renamed from: com.google.android.youtube.player.internal.g$a$a */
        private static class C4160a implements C2536g {
            /* renamed from: a */
            private IBinder f17677a;

            C4160a(IBinder iBinder) {
                this.f17677a = iBinder;
            }

            /* renamed from: a */
            public final void mo3227a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3228a(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f17677a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3229a(Configuration configuration) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17677a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3230a(C2537h c2537h) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(c2537h != null ? c2537h.asBinder() : null);
                    this.f17677a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3231a(C2538i c2538i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(c2538i != null ? c2538i.asBinder() : null);
                    this.f17677a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3232a(C2539j c2539j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(c2539j != null ? c2539j.asBinder() : null);
                    this.f17677a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3233a(C2540k c2540k) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(c2540k != null ? c2540k.asBinder() : null);
                    this.f17677a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3234a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    this.f17677a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3235a(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f17677a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3236a(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f17677a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3237a(List<String> list, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f17677a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3238a(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z);
                    this.f17677a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo3239a(int i, KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17677a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo3240a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17677a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.f17677a;
            }

            /* renamed from: b */
            public final void mo3241b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3242b(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f17677a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3243b(String str, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.f17677a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3244b(String str, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f17677a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3245b(List<String> list, int i, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f17677a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3246b(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z);
                    this.f17677a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final boolean mo3247b(int i, KeyEvent keyEvent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f17677a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3248c(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f17677a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3249c(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z);
                    this.f17677a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final boolean mo3250c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f17677a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo3251d(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.f17677a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo3252d(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z);
                    this.f17677a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final boolean mo3253d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f17677a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo3254e(boolean z) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(z);
                    this.f17677a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final boolean mo3255e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    boolean z = false;
                    this.f17677a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final void mo3256f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final void mo3257g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final int mo3258h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final int mo3259i() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final int mo3260j() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final void mo3261k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final void mo3262l() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final void mo3263m() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final void mo3264n() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final void mo3265o() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final void mo3266p() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final void mo3267q() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final Bundle mo3268r() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle = obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return bundle;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public final C2557x mo3269s() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.f17677a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    C2557x a = C4182a.m23021a(obtain2.readStrongBinder());
                    return a;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static C2536g m22944a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2536g)) ? new C4160a(iBinder) : (C2536g) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                C2537h c2537h = null;
                boolean c;
                IBinder readStrongBinder;
                IInterface queryLocalInterface;
                KeyEvent keyEvent;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3238a(z);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3235a(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3243b(parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3236a(parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3244b(parcel.readString(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3237a(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3245b(parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3227a();
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3241b();
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        c = mo3250c();
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 11:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        c = mo3253d();
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 12:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        c = mo3255e();
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 13:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3256f();
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3257g();
                        parcel2.writeNoException();
                        return true;
                    case 15:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        i = mo3258h();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 16:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        i = mo3259i();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 17:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3228a(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 18:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3242b(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3246b(z);
                        parcel2.writeNoException();
                        return true;
                    case 20:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3248c(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 21:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        i = mo3260j();
                        parcel2.writeNoException();
                        parcel2.writeInt(i);
                        return true;
                    case 22:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3251d(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3234a(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 24:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3249c(z);
                        parcel2.writeNoException();
                        return true;
                    case 25:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3252d(z);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                            c2537h = (queryLocalInterface == null || !(queryLocalInterface instanceof C2537h)) ? new C4162a(readStrongBinder) : (C2537h) queryLocalInterface;
                        }
                        mo3230a(c2537h);
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        C2540k c4168a;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                            c4168a = (queryLocalInterface == null || !(queryLocalInterface instanceof C2540k)) ? new C4168a(readStrongBinder) : (C2540k) queryLocalInterface;
                        }
                        mo3233a(c4168a);
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        C2539j c4166a;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                            c4166a = (queryLocalInterface == null || !(queryLocalInterface instanceof C2539j)) ? new C4166a(readStrongBinder) : (C2539j) queryLocalInterface;
                        }
                        mo3232a(c4166a);
                        parcel2.writeNoException();
                        return true;
                    case 29:
                        C2538i c4164a;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                            c4164a = (queryLocalInterface == null || !(queryLocalInterface instanceof C2538i)) ? new C4164a(readStrongBinder) : (C2538i) queryLocalInterface;
                        }
                        mo3231a(c4164a);
                        parcel2.writeNoException();
                        return true;
                    case 30:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3261k();
                        parcel2.writeNoException();
                        return true;
                    case 31:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3262l();
                        parcel2.writeNoException();
                        return true;
                    case 32:
                        Configuration configuration;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            configuration = (Configuration) Configuration.CREATOR.createFromParcel(parcel);
                        }
                        mo3229a(configuration);
                        parcel2.writeNoException();
                        return true;
                    case 33:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3263m();
                        parcel2.writeNoException();
                        return true;
                    case 34:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3264n();
                        parcel2.writeNoException();
                        return true;
                    case 35:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3265o();
                        parcel2.writeNoException();
                        return true;
                    case 36:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3266p();
                        parcel2.writeNoException();
                        return true;
                    case 37:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo3254e(z);
                        parcel2.writeNoException();
                        return true;
                    case 38:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        mo3267q();
                        parcel2.writeNoException();
                        return true;
                    case 39:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        Bundle r = mo3268r();
                        parcel2.writeNoException();
                        if (r != null) {
                            parcel2.writeInt(1);
                            r.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 40:
                        Bundle bundle;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        c = mo3240a(bundle);
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 41:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        i = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                        }
                        c = mo3239a(i, keyEvent);
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 42:
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        i = parcel.readInt();
                        if (parcel.readInt() != 0) {
                            keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                        }
                        c = mo3247b(i, keyEvent);
                        parcel2.writeNoException();
                        parcel2.writeInt(c);
                        return true;
                    case 43:
                        IBinder asBinder;
                        parcel.enforceInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                        C2557x s = mo3269s();
                        parcel2.writeNoException();
                        if (s != null) {
                            asBinder = s.asBinder();
                        }
                        parcel2.writeStrongBinder(asBinder);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return true;
        }
    }

    /* renamed from: a */
    void mo3227a();

    /* renamed from: a */
    void mo3228a(int i);

    /* renamed from: a */
    void mo3229a(Configuration configuration);

    /* renamed from: a */
    void mo3230a(C2537h c2537h);

    /* renamed from: a */
    void mo3231a(C2538i c2538i);

    /* renamed from: a */
    void mo3232a(C2539j c2539j);

    /* renamed from: a */
    void mo3233a(C2540k c2540k);

    /* renamed from: a */
    void mo3234a(String str);

    /* renamed from: a */
    void mo3235a(String str, int i);

    /* renamed from: a */
    void mo3236a(String str, int i, int i2);

    /* renamed from: a */
    void mo3237a(List<String> list, int i, int i2);

    /* renamed from: a */
    void mo3238a(boolean z);

    /* renamed from: a */
    boolean mo3239a(int i, KeyEvent keyEvent);

    /* renamed from: a */
    boolean mo3240a(Bundle bundle);

    /* renamed from: b */
    void mo3241b();

    /* renamed from: b */
    void mo3242b(int i);

    /* renamed from: b */
    void mo3243b(String str, int i);

    /* renamed from: b */
    void mo3244b(String str, int i, int i2);

    /* renamed from: b */
    void mo3245b(List<String> list, int i, int i2);

    /* renamed from: b */
    void mo3246b(boolean z);

    /* renamed from: b */
    boolean mo3247b(int i, KeyEvent keyEvent);

    /* renamed from: c */
    void mo3248c(int i);

    /* renamed from: c */
    void mo3249c(boolean z);

    /* renamed from: c */
    boolean mo3250c();

    /* renamed from: d */
    void mo3251d(int i);

    /* renamed from: d */
    void mo3252d(boolean z);

    /* renamed from: d */
    boolean mo3253d();

    /* renamed from: e */
    void mo3254e(boolean z);

    /* renamed from: e */
    boolean mo3255e();

    /* renamed from: f */
    void mo3256f();

    /* renamed from: g */
    void mo3257g();

    /* renamed from: h */
    int mo3258h();

    /* renamed from: i */
    int mo3259i();

    /* renamed from: j */
    int mo3260j();

    /* renamed from: k */
    void mo3261k();

    /* renamed from: l */
    void mo3262l();

    /* renamed from: m */
    void mo3263m();

    /* renamed from: n */
    void mo3264n();

    /* renamed from: o */
    void mo3265o();

    /* renamed from: p */
    void mo3266p();

    /* renamed from: q */
    void mo3267q();

    /* renamed from: r */
    Bundle mo3268r();

    /* renamed from: s */
    C2557x mo3269s();
}
