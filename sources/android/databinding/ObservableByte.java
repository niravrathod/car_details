package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableByte extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableByte> CREATOR = new C00401();
    static final long serialVersionUID = 1;
    private byte mValue;

    /* renamed from: android.databinding.ObservableByte$1 */
    static class C00401 implements Creator<ObservableByte> {
        C00401() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m99a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m100a(i);
        }

        /* renamed from: a */
        public ObservableByte m99a(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        /* renamed from: a */
        public ObservableByte[] m100a(int i) {
            return new ObservableByte[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableByte(byte b) {
        this.mValue = b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.mValue);
    }
}
