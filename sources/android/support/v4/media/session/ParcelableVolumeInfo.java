package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C04911();
    /* renamed from: a */
    public int f1585a;
    /* renamed from: b */
    public int f1586b;
    /* renamed from: c */
    public int f1587c;
    /* renamed from: d */
    public int f1588d;
    /* renamed from: e */
    public int f1589e;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$1 */
    static class C04911 implements Creator<ParcelableVolumeInfo> {
        C04911() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1772a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1773a(i);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo m1772a(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: a */
        public ParcelableVolumeInfo[] m1773a(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f1585a = parcel.readInt();
        this.f1587c = parcel.readInt();
        this.f1588d = parcel.readInt();
        this.f1589e = parcel.readInt();
        this.f1586b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1585a);
        parcel.writeInt(this.f1587c);
        parcel.writeInt(this.f1588d);
        parcel.writeInt(this.f1589e);
        parcel.writeInt(this.f1586b);
    }
}
