package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableShort extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableShort> CREATOR = new C00471();
    static final long serialVersionUID = 1;
    private short mValue;

    /* renamed from: android.databinding.ObservableShort$1 */
    static class C00471 implements Creator<ObservableShort> {
        C00471() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m113a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m114a(i);
        }

        /* renamed from: a */
        public ObservableShort m113a(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        /* renamed from: a */
        public ObservableShort[] m114a(int i) {
            return new ObservableShort[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableShort(short s) {
        this.mValue = s;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
