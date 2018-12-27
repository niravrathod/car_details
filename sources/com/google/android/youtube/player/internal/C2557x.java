package com.google.android.youtube.player.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.internal.x */
public interface C2557x extends IInterface {

    /* renamed from: com.google.android.youtube.player.internal.x$a */
    public static abstract class C4182a extends Binder implements C2557x {

        /* renamed from: com.google.android.youtube.player.internal.x$a$a */
        private static class C4181a implements C2557x {
            /* renamed from: a */
            private IBinder f17702a;

            C4181a(IBinder iBinder) {
                this.f17702a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f17702a;
            }
        }

        public C4182a() {
            attachInterface(this, "com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static C2557x m23021a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C2557x)) ? new C4181a(iBinder) : (C2557x) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("com.google.android.youtube.player.internal.dynamic.IObjectWrapper");
            return true;
        }
    }
}
