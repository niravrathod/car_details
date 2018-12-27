package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableLong extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableLong> CREATOR = new C00451();
    static final long serialVersionUID = 1;
    private long mValue;

    /* renamed from: android.databinding.ObservableLong$1 */
    static class C00451 implements Creator<ObservableLong> {
        C00451() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m109a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m110a(i);
        }

        /* renamed from: a */
        public ObservableLong m109a(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        /* renamed from: a */
        public ObservableLong[] m110a(int i) {
            return new ObservableLong[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableLong(long j) {
        this.mValue = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mValue);
    }
}
