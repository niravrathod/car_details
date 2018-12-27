package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.p126c.C2186s;

public final class CommentFrame extends Id3Frame {
    public static final Creator<CommentFrame> CREATOR = new C22921();
    /* renamed from: a */
    public final String f19404a;
    /* renamed from: b */
    public final String f19405b;
    /* renamed from: c */
    public final String f19406c;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$1 */
    static class C22921 implements Creator<CommentFrame> {
        C22921() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m8416a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m8417a(i);
        }

        /* renamed from: a */
        public CommentFrame m8416a(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        /* renamed from: a */
        public CommentFrame[] m8417a(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f19404a = str;
        this.f19405b = str2;
        this.f19406c = str3;
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f19404a = parcel.readString();
        this.f19405b = parcel.readString();
        this.f19406c = parcel.readString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                CommentFrame commentFrame = (CommentFrame) obj;
                if (!C2186s.m8052a(this.f19405b, commentFrame.f19405b) || !C2186s.m8052a(this.f19404a, commentFrame.f19404a) || C2186s.m8052a(this.f19406c, commentFrame.f19406c) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((527 + (this.f19404a != null ? this.f19404a.hashCode() : 0)) * 31) + (this.f19405b != null ? this.f19405b.hashCode() : 0)) * 31;
        if (this.f19406c != null) {
            i = this.f19406c.hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.f19404a);
        parcel.writeString(this.f19406c);
    }
}
