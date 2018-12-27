package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableFloat extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableFloat> CREATOR = new C00431();
    static final long serialVersionUID = 1;
    private float mValue;

    /* renamed from: android.databinding.ObservableFloat$1 */
    static class C00431 implements Creator<ObservableFloat> {
        C00431() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m105a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m106a(i);
        }

        /* renamed from: a */
        public ObservableFloat m105a(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        /* renamed from: a */
        public ObservableFloat[] m106a(int i) {
            return new ObservableFloat[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableFloat(float f) {
        this.mValue = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.mValue);
    }
}
