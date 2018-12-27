package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C03141();
    /* renamed from: a */
    FragmentState[] f1090a;
    /* renamed from: b */
    int[] f1091b;
    /* renamed from: c */
    BackStackState[] f1092c;
    /* renamed from: d */
    int f1093d = -1;
    /* renamed from: e */
    int f1094e;

    /* renamed from: android.support.v4.app.FragmentManagerState$1 */
    static class C03141 implements Creator<FragmentManagerState> {
        C03141() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1127a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1128a(i);
        }

        /* renamed from: a */
        public FragmentManagerState m1127a(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: a */
        public FragmentManagerState[] m1128a(int i) {
            return new FragmentManagerState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public FragmentManagerState(Parcel parcel) {
        this.f1090a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f1091b = parcel.createIntArray();
        this.f1092c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f1093d = parcel.readInt();
        this.f1094e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f1090a, i);
        parcel.writeIntArray(this.f1091b);
        parcel.writeTypedArray(this.f1092c, i);
        parcel.writeInt(this.f1093d);
        parcel.writeInt(this.f1094e);
    }
}
