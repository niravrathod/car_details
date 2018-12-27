package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableDouble extends C4398b implements Parcelable, Serializable {
    public static final Creator<ObservableDouble> CREATOR = new C00421();
    static final long serialVersionUID = 1;
    private double mValue;

    /* renamed from: android.databinding.ObservableDouble$1 */
    static class C00421 implements Creator<ObservableDouble> {
        C00421() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m103a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m104a(i);
        }

        /* renamed from: a */
        public ObservableDouble m103a(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        /* renamed from: a */
        public ObservableDouble[] m104a(int i) {
            return new ObservableDouble[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableDouble(double d) {
        this.mValue = d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mValue);
    }
}
