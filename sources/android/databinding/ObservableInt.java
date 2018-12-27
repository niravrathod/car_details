package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableInt extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableInt> CREATOR = new C00441();
    static final long serialVersionUID = 1;
    private int mValue;

    /* renamed from: android.databinding.ObservableInt$1 */
    static class C00441 implements Creator<ObservableInt> {
        C00441() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m107a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m108a(i);
        }

        /* renamed from: a */
        public ObservableInt m107a(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        /* renamed from: a */
        public ObservableInt[] m108a(int i) {
            return new ObservableInt[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableInt(int i) {
        this.mValue = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
