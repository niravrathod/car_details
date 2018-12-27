package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;
import java.util.Arrays;

public final class ChapterTocFrame extends Id3Frame {
    public static final Creator<ChapterTocFrame> CREATOR = new C22911();
    /* renamed from: a */
    public final String f19399a;
    /* renamed from: b */
    public final boolean f19400b;
    /* renamed from: c */
    public final boolean f19401c;
    /* renamed from: d */
    public final String[] f19402d;
    /* renamed from: e */
    private final Id3Frame[] f19403e;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$1 */
    static class C22911 implements Creator<ChapterTocFrame> {
        C22911() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8414a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8415a(i);
        }

        /* renamed from: a */
        public ChapterTocFrame m8414a(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: a */
        public ChapterTocFrame[] m8415a(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f19399a = str;
        this.f19400b = z;
        this.f19401c = z2;
        this.f19402d = strArr;
        this.f19403e = id3FrameArr;
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f19399a = parcel.readString();
        boolean z = true;
        this.f19400b = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f19401c = z;
        this.f19402d = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f19403e = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f19403e[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
                if (this.f19400b != chapterTocFrame.f19400b || this.f19401c != chapterTocFrame.f19401c || !C2186s.m8052a(this.f19399a, chapterTocFrame.f19399a) || !Arrays.equals(this.f19402d, chapterTocFrame.f19402d) || Arrays.equals(this.f19403e, chapterTocFrame.f19403e) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f19400b) * 31) + this.f19401c) * 31) + (this.f19399a != null ? this.f19399a.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19399a);
        parcel.writeByte((byte) this.f19400b);
        parcel.writeByte((byte) this.f19401c);
        parcel.writeStringArray(this.f19402d);
        parcel.writeInt(this.f19403e.length);
        for (Parcelable writeParcelable : this.f19403e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
