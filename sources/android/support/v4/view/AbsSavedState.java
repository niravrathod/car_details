package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

public abstract class AbsSavedState implements Parcelable {
    public static final Creator<AbsSavedState> CREATOR = new C05102();
    /* renamed from: d */
    public static final AbsSavedState f1614d = new C31561();
    /* renamed from: a */
    private final Parcelable f1615a;

    /* renamed from: android.support.v4.view.AbsSavedState$2 */
    static class C05102 implements ClassLoaderCreator<AbsSavedState> {
        C05102() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1882a(parcel);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m1883a(parcel, classLoader);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1884a(i);
        }

        /* renamed from: a */
        public AbsSavedState m1883a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f1614d;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: a */
        public AbsSavedState m1882a(Parcel parcel) {
            return m1883a(parcel, null);
        }

        /* renamed from: a */
        public AbsSavedState[] m1884a(int i) {
            return new AbsSavedState[i];
        }
    }

    /* renamed from: android.support.v4.view.AbsSavedState$1 */
    static class C31561 extends AbsSavedState {
        C31561() {
            super();
        }
    }

    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
        this.f1615a = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == f1614d) {
                parcelable = null;
            }
            this.f1615a = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        parcel = parcel.readParcelable(classLoader);
        if (parcel == null) {
            parcel = f1614d;
        }
        this.f1615a = parcel;
    }

    /* renamed from: a */
    public final Parcelable m1885a() {
        return this.f1615a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1615a, i);
    }
}
