package android.support.v4.app;

import android.arch.lifecycle.C0038s;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class FragmentState implements Parcelable {
    public static final Creator<FragmentState> CREATOR = new C03151();
    /* renamed from: a */
    final String f1095a;
    /* renamed from: b */
    final int f1096b;
    /* renamed from: c */
    final boolean f1097c;
    /* renamed from: d */
    final int f1098d;
    /* renamed from: e */
    final int f1099e;
    /* renamed from: f */
    final String f1100f;
    /* renamed from: g */
    final boolean f1101g;
    /* renamed from: h */
    final boolean f1102h;
    /* renamed from: i */
    final Bundle f1103i;
    /* renamed from: j */
    final boolean f1104j;
    /* renamed from: k */
    Bundle f1105k;
    /* renamed from: l */
    Fragment f1106l;

    /* renamed from: android.support.v4.app.FragmentState$1 */
    static class C03151 implements Creator<FragmentState> {
        C03151() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1129a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1130a(i);
        }

        /* renamed from: a */
        public FragmentState m1129a(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: a */
        public FragmentState[] m1130a(int i) {
            return new FragmentState[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    FragmentState(Fragment fragment) {
        this.f1095a = fragment.getClass().getName();
        this.f1096b = fragment.mIndex;
        this.f1097c = fragment.mFromLayout;
        this.f1098d = fragment.mFragmentId;
        this.f1099e = fragment.mContainerId;
        this.f1100f = fragment.mTag;
        this.f1101g = fragment.mRetainInstance;
        this.f1102h = fragment.mDetached;
        this.f1103i = fragment.mArguments;
        this.f1104j = fragment.mHidden;
    }

    FragmentState(Parcel parcel) {
        this.f1095a = parcel.readString();
        this.f1096b = parcel.readInt();
        boolean z = false;
        this.f1097c = parcel.readInt() != 0;
        this.f1098d = parcel.readInt();
        this.f1099e = parcel.readInt();
        this.f1100f = parcel.readString();
        this.f1101g = parcel.readInt() != 0;
        this.f1102h = parcel.readInt() != 0;
        this.f1103i = parcel.readBundle();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.f1104j = z;
        this.f1105k = parcel.readBundle();
    }

    /* renamed from: a */
    public Fragment m1131a(C3107k c3107k, C0329i c0329i, Fragment fragment, C0346n c0346n, C0038s c0038s) {
        if (this.f1106l == null) {
            Context i = c3107k.m15390i();
            if (this.f1103i != null) {
                this.f1103i.setClassLoader(i.getClassLoader());
            }
            if (c0329i != null) {
                this.f1106l = c0329i.mo258a(i, this.f1095a, this.f1103i);
            } else {
                this.f1106l = Fragment.instantiate(i, this.f1095a, this.f1103i);
            }
            if (this.f1105k != null) {
                this.f1105k.setClassLoader(i.getClassLoader());
                this.f1106l.mSavedFragmentState = this.f1105k;
            }
            this.f1106l.setIndex(this.f1096b, fragment);
            this.f1106l.mFromLayout = this.f1097c;
            this.f1106l.mRestored = true;
            this.f1106l.mFragmentId = this.f1098d;
            this.f1106l.mContainerId = this.f1099e;
            this.f1106l.mTag = this.f1100f;
            this.f1106l.mRetainInstance = this.f1101g;
            this.f1106l.mDetached = this.f1102h;
            this.f1106l.mHidden = this.f1104j;
            this.f1106l.mFragmentManager = c3107k.f13142d;
            if (C3112m.f13159a != null) {
                c0329i = new StringBuilder();
                c0329i.append("Instantiated fragment ");
                c0329i.append(this.f1106l);
                Log.v("FragmentManager", c0329i.toString());
            }
        }
        this.f1106l.mChildNonConfig = c0346n;
        this.f1106l.mViewModelStore = c0038s;
        return this.f1106l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1095a);
        parcel.writeInt(this.f1096b);
        parcel.writeInt(this.f1097c);
        parcel.writeInt(this.f1098d);
        parcel.writeInt(this.f1099e);
        parcel.writeString(this.f1100f);
        parcel.writeInt(this.f1101g);
        parcel.writeInt(this.f1102h);
        parcel.writeBundle(this.f1103i);
        parcel.writeInt(this.f1104j);
        parcel.writeBundle(this.f1105k);
    }
}
