package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableBoolean extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableBoolean> CREATOR = new C00391();
    static final long serialVersionUID = 1;
    private boolean mValue;

    /* renamed from: android.databinding.ObservableBoolean$1 */
    static class C00391 implements Creator<ObservableBoolean> {
        C00391() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m97a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m98a(i);
        }

        /* renamed from: a */
        public ObservableBoolean m97a(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        /* renamed from: a */
        public ObservableBoolean[] m98a(int i) {
            return new ObservableBoolean[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableBoolean(boolean z) {
        this.mValue = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
