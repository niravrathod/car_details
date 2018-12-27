package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
public interface C0494a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    public static abstract class C3151a extends Binder implements C0494a {

        /* renamed from: android.support.v4.media.session.a$a$a */
        private static class C3150a implements C0494a {
            /* renamed from: a */
            private IBinder f13290a;

            C3150a(IBinder iBinder) {
                this.f13290a = iBinder;
            }

            public IBinder asBinder() {
                return this.f13290a;
            }

            /* renamed from: a */
            public void mo380a(String str, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13290a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo373a() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f13290a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo378a(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13290a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo376a(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13290a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo381a(List<QueueItem> list) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeTypedList(list);
                    this.f13290a.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo379a(CharSequence charSequence) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (charSequence != null) {
                        obtain.writeInt(1);
                        TextUtils.writeToParcel(charSequence, obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13290a.transact(6, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo375a(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13290a.transact(7, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo377a(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f13290a.transact(8, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo374a(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f13290a.transact(9, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo382a(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z);
                    this.f13290a.transact(10, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo385b(boolean z) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(z);
                    this.f13290a.transact(11, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo384b(int i) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    obtain.writeInt(i);
                    this.f13290a.transact(12, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public void mo383b() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    this.f13290a.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C3151a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        /* renamed from: a */
        public static C0494a m15702a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0494a)) {
                return new C3150a(iBinder);
            }
            return (C0494a) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        i = parcel.readString();
                        if (parcel.readInt() != null) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo380a(i, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo373a();
                        return true;
                    case 3:
                        PlaybackStateCompat playbackStateCompat;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo378a(playbackStateCompat);
                        return true;
                    case 4:
                        MediaMetadataCompat mediaMetadataCompat;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo376a(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo381a((List) parcel.createTypedArrayList(QueueItem.CREATOR));
                        return true;
                    case 6:
                        CharSequence charSequence;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        mo379a(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo375a(bundle);
                        return true;
                    case 8:
                        ParcelableVolumeInfo parcelableVolumeInfo;
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo377a(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo374a(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo382a(z);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo385b(z);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo384b(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo383b();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }

    /* renamed from: a */
    void mo373a();

    /* renamed from: a */
    void mo374a(int i);

    /* renamed from: a */
    void mo375a(Bundle bundle);

    /* renamed from: a */
    void mo376a(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: a */
    void mo377a(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: a */
    void mo378a(PlaybackStateCompat playbackStateCompat);

    /* renamed from: a */
    void mo379a(CharSequence charSequence);

    /* renamed from: a */
    void mo380a(String str, Bundle bundle);

    /* renamed from: a */
    void mo381a(List<QueueItem> list);

    /* renamed from: a */
    void mo382a(boolean z);

    /* renamed from: b */
    void mo383b();

    /* renamed from: b */
    void mo384b(int i);

    /* renamed from: b */
    void mo385b(boolean z);
}
