package com.google.android.exoplayer2.source.dash.manifest;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RepresentationKey implements Parcelable, Comparable<RepresentationKey> {
    public static final Creator<RepresentationKey> CREATOR = new C23221();
    /* renamed from: a */
    public final int f7292a;
    /* renamed from: b */
    public final int f7293b;
    /* renamed from: c */
    public final int f7294c;

    /* renamed from: com.google.android.exoplayer2.source.dash.manifest.RepresentationKey$1 */
    static class C23221 implements Creator<RepresentationKey> {
        C23221() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8480a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8481a(i);
        }

        /* renamed from: a */
        public RepresentationKey m8480a(Parcel parcel) {
            return new RepresentationKey(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* renamed from: a */
        public RepresentationKey[] m8481a(int i) {
            return new RepresentationKey[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return m8482a((RepresentationKey) obj);
    }

    public RepresentationKey(int i, int i2, int i3) {
        this.f7292a = i;
        this.f7293b = i2;
        this.f7294c = i3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f7292a);
        stringBuilder.append(".");
        stringBuilder.append(this.f7293b);
        stringBuilder.append(".");
        stringBuilder.append(this.f7294c);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7292a);
        parcel.writeInt(this.f7293b);
        parcel.writeInt(this.f7294c);
    }

    /* renamed from: a */
    public int m8482a(RepresentationKey representationKey) {
        int i = this.f7292a - representationKey.f7292a;
        if (i != 0) {
            return i;
        }
        i = this.f7293b - representationKey.f7293b;
        return i == 0 ? this.f7294c - representationKey.f7294c : i;
    }
}
