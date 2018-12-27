package android.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableParcelable<T extends Parcelable> extends ObservableField<T> implements Parcelable, Serializable {
    public static final Creator<ObservableParcelable> CREATOR = new C00461();
    static final long serialVersionUID = 1;

    /* renamed from: android.databinding.ObservableParcelable$1 */
    static class C00461 implements Creator<ObservableParcelable> {
        C00461() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m111a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m112a(i);
        }

        /* renamed from: a */
        public ObservableParcelable m111a(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(getClass().getClassLoader()));
        }

        /* renamed from: a */
        public ObservableParcelable[] m112a(int i) {
            return new ObservableParcelable[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) m27554a(), 0);
    }
}
