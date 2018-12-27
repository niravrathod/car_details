package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat implements Parcelable {
    public static final Creator<RatingCompat> CREATOR = new C04721();
    /* renamed from: a */
    private final int f1561a;
    /* renamed from: b */
    private final float f1562b;

    /* renamed from: android.support.v4.media.RatingCompat$1 */
    static class C04721 implements Creator<RatingCompat> {
        C04721() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1706a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1707a(i);
        }

        /* renamed from: a */
        public RatingCompat m1706a(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: a */
        public RatingCompat[] m1707a(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f1561a = i;
        this.f1562b = f;
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rating:style=");
        stringBuilder.append(this.f1561a);
        stringBuilder.append(" rating=");
        if (this.f1562b < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(this.f1562b);
        }
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public int describeContents() {
        return this.f1561a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1561a);
        parcel.writeFloat(this.f1562b);
    }
}
