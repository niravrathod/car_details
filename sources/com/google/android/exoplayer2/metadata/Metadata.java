package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Creator<Metadata> CREATOR = new C22831();
    /* renamed from: a */
    private final Entry[] f7243a;

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$1 */
    static class C22831 implements Creator<Metadata> {
        C22831() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8398a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8399a(i);
        }

        /* renamed from: a */
        public Metadata m8398a(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* renamed from: a */
        public Metadata[] m8399a(int i) {
            return new Metadata[0];
        }
    }

    public interface Entry extends Parcelable {
    }

    public int describeContents() {
        return 0;
    }

    public Metadata(Entry... entryArr) {
        if (entryArr == null) {
            entryArr = new Entry[null];
        }
        this.f7243a = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            this.f7243a = new Entry[list.size()];
            list.toArray(this.f7243a);
            return;
        }
        this.f7243a = new Entry[null];
    }

    Metadata(Parcel parcel) {
        this.f7243a = new Entry[parcel.readInt()];
        for (int i = 0; i < this.f7243a.length; i++) {
            this.f7243a[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public int m8400a() {
        return this.f7243a.length;
    }

    /* renamed from: a */
    public Entry m8401a(int i) {
        return this.f7243a[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return Arrays.equals(this.f7243a, ((Metadata) obj).f7243a);
            }
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7243a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7243a.length);
        for (Parcelable writeParcelable : this.f7243a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
