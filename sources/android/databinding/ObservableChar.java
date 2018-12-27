package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableChar extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableChar> CREATOR = new C00411();
    static final long serialVersionUID = 1;
    private char mValue;

    /* renamed from: android.databinding.ObservableChar$1 */
    static class C00411 implements Creator<ObservableChar> {
        C00411() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m101a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m102a(i);
        }

        /* renamed from: a */
        public ObservableChar m101a(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        /* renamed from: a */
        public ObservableChar[] m102a(int i) {
            return new ObservableChar[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableChar(char c) {
        this.mValue = c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
