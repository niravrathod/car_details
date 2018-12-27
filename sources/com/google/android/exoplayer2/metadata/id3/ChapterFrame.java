package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

public final class ChapterFrame extends Id3Frame {
    public static final Creator<ChapterFrame> CREATOR = new C22901();
    /* renamed from: a */
    public final String f19393a;
    /* renamed from: b */
    public final int f19394b;
    /* renamed from: c */
    public final int f19395c;
    /* renamed from: d */
    public final long f19396d;
    /* renamed from: e */
    public final long f19397e;
    /* renamed from: g */
    private final Id3Frame[] f19398g;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$1 */
    static class C22901 implements Creator<ChapterFrame> {
        C22901() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8412a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8413a(i);
        }

        /* renamed from: a */
        public ChapterFrame m8412a(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: a */
        public ChapterFrame[] m8413a(int i) {
            return new ChapterFrame[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f19393a = str;
        this.f19394b = i;
        this.f19395c = i2;
        this.f19396d = j;
        this.f19397e = j2;
        this.f19398g = id3FrameArr;
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f19393a = parcel.readString();
        this.f19394b = parcel.readInt();
        this.f19395c = parcel.readInt();
        this.f19396d = parcel.readLong();
        this.f19397e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19398g = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f19398g[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ChapterFrame chapterFrame = (ChapterFrame) obj;
                if (this.f19394b != chapterFrame.f19394b || this.f19395c != chapterFrame.f19395c || this.f19396d != chapterFrame.f19396d || this.f19397e != chapterFrame.f19397e || !C2186s.m8052a(this.f19393a, chapterFrame.f19393a) || Arrays.equals(this.f19398g, chapterFrame.f19398g) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f19394b) * 31) + this.f19395c) * 31) + ((int) this.f19396d)) * 31) + ((int) this.f19397e)) * 31) + (this.f19393a != null ? this.f19393a.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19393a);
        parcel.writeInt(this.f19394b);
        parcel.writeInt(this.f19395c);
        parcel.writeLong(this.f19396d);
        parcel.writeLong(this.f19397e);
        parcel.writeInt(this.f19398g.length);
        for (Parcelable writeParcelable : this.f19398g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
